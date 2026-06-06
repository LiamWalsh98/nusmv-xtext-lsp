import * as os from 'node:os';
import * as path from 'node:path';
import * as vscode from 'vscode';
import {
    LanguageClient,
    LanguageClientOptions,
    ServerOptions,
    TransportKind
} from 'vscode-languageclient/node.js';

let client: LanguageClient | undefined;
let outputChannel: vscode.OutputChannel | undefined;
const CONFIG_SECTION = 'nusmv';
const DIAGNOSTIC_DEBOUNCE_MS = 600;
const DEFAULT_MAX_SEMANTIC_CHECK_LINES = 10_000;
const skippedDocuments = new Set<string>();
const diagnosticTimers = new Map<string, ReturnType<typeof setTimeout>>();

export function activate(context: vscode.ExtensionContext): void {
    outputChannel = vscode.window.createOutputChannel('NuSMV');
    outputChannel.appendLine('NuSMV extension activate() called.');

    const serverModule = context.asAbsolutePath(path.join('out', 'language', 'main.js'));
    outputChannel.appendLine(`Resolved language server module: ${serverModule}`);
    const serverOptions: ServerOptions = {
        run: {
            module: serverModule,
            transport: TransportKind.ipc
        },
        debug: {
            module: serverModule,
            transport: TransportKind.ipc,
            options: {
                execArgv: ['--nolazy', '--inspect=6009']
            }
        }
    };
    outputChannel.appendLine('Constructed language server options.');

    const clientOptions: LanguageClientOptions = {
        documentSelector: [{ scheme: 'file', language: 'nusmv' }],
        outputChannel,
        middleware: {
            didOpen: async (document, next) => {
                outputChannel?.appendLine(`didOpen for ${document.uri.toString()} (${document.languageId})`);
                if (shouldSkipLanguageServer(document)) {
                    skippedDocuments.add(document.uri.toString());
                    outputChannel?.appendLine(`Skipping language server for large document ${document.fileName}`);
                    void vscode.window.showInformationMessage(
                        `NuSMV semantic checks disabled for large file ${path.basename(document.fileName)}.`
                    );
                    return;
                }
                return next(document);
            },
            didChange: async (event, next) => {
                if (shouldSkipLanguageServer(event.document) || skippedDocuments.has(event.document.uri.toString())) {
                    outputChannel?.appendLine(`Ignoring change for skipped document ${event.document.uri.toString()}`);
                    return;
                }
                return next(event);
            },
            didClose: async (document, next) => {
                outputChannel?.appendLine(`didClose for ${document.uri.toString()}`);
                clearPendingDiagnostics(document.uri);
                if (skippedDocuments.delete(document.uri.toString())) {
                    return;
                }
                return next(document);
            },
            handleDiagnostics: (uri, diagnostics, next) => {
                const key = uri.toString();
                clearPendingDiagnostics(uri);

                if (diagnostics.length === 0) {
                    next(uri, diagnostics);
                    return;
                }

                const timeout = setTimeout(() => {
                    diagnosticTimers.delete(key);
                    next(uri, diagnostics);
                }, DIAGNOSTIC_DEBOUNCE_MS);
                diagnosticTimers.set(key, timeout);
            }
        }
    };

    client = new LanguageClient('nusmv', 'NuSMV', serverOptions, clientOptions);
    outputChannel.appendLine('Created LanguageClient.');
    client.onDidChangeState(event => {
        outputChannel?.appendLine(`LanguageClient state change: ${event.oldState} -> ${event.newState}`);
    });
    void client.start();
    outputChannel.appendLine('Called client.start().');
    context.subscriptions.push({
        dispose: () => {
            outputChannel?.appendLine('Disposing NuSMV extension and stopping LanguageClient.');
            clearAllPendingDiagnostics();
            void client?.stop();
        }
    });
    context.subscriptions.push(outputChannel);
    context.subscriptions.push(vscode.workspace.onDidChangeConfiguration(event => {
        if (
            event.affectsConfiguration(`${CONFIG_SECTION}.disableSemanticChecksOnLargeFiles`) ||
            event.affectsConfiguration(`${CONFIG_SECTION}.semanticChecksMaxLines`)
        ) {
            void vscode.window.showInformationMessage(
                'Reload the window for NuSMV large-file semantic check settings to apply to already-open files.'
            );
        }
    }));

    context.subscriptions.push(vscode.commands.registerCommand('nusmv.createTerminal', () => {
        const terminal = vscode.window.createTerminal('NuSMV Shell');
        terminal.sendText(os.platform() === 'win32' ? 'nusmv.exe -int' : 'nusmv -int');
        terminal.show();
    }));

    context.subscriptions.push(vscode.commands.registerCommand('nusmv.runCurrent', () => {
        const editor = vscode.window.activeTextEditor;
        if (!editor) {
            void vscode.window.showWarningMessage('Open a NuSMV file before running this command.');
            return;
        }
        const terminal = vscode.window.createTerminal('NuSMV Batch');
        terminal.sendText(os.platform() === 'win32' ? `nusmv.exe ${editor.document.fileName}` : `nusmv ${editor.document.fileName}`);
        terminal.show();
    }));
}

export function deactivate(): Thenable<void> | undefined {
    outputChannel?.appendLine('deactivate() called.');
    clearAllPendingDiagnostics();
    return client?.stop();
}

function shouldSkipLanguageServer(document: vscode.TextDocument): boolean {
    if (document.languageId !== 'nusmv') {
        return false;
    }
    const configuration = vscode.workspace.getConfiguration(CONFIG_SECTION, document.uri);
    const disableLargeFileChecks = configuration.get<boolean>('disableSemanticChecksOnLargeFiles', true);
    const maxLines = configuration.get<number>('semanticChecksMaxLines', DEFAULT_MAX_SEMANTIC_CHECK_LINES);
    return disableLargeFileChecks && document.lineCount > maxLines;
}

function clearPendingDiagnostics(uri: vscode.Uri): void {
    const key = uri.toString();
    const timeout = diagnosticTimers.get(key);
    if (timeout) {
        clearTimeout(timeout);
        diagnosticTimers.delete(key);
    }
}

function clearAllPendingDiagnostics(): void {
    for (const timeout of diagnosticTimers.values()) {
        clearTimeout(timeout);
    }
    diagnosticTimers.clear();
}
