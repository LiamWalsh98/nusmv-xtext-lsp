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
const CONFIG_SECTION = 'nusmv';
const DEFAULT_MAX_SEMANTIC_CHECK_LINES = 10_000;
const skippedDocuments = new Set<string>();

export function activate(context: vscode.ExtensionContext): void {
    const serverModule = context.asAbsolutePath(path.join('out', 'language', 'main.js'));
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

    const clientOptions: LanguageClientOptions = {
        documentSelector: [{ scheme: 'file', language: 'nusmv' }],
        middleware: {
            didOpen: async (document, next) => {
                if (shouldSkipLanguageServer(document)) {
                    skippedDocuments.add(document.uri.toString());
                    void vscode.window.showInformationMessage(
                        `NuSMV semantic checks disabled for large file ${path.basename(document.fileName)}.`
                    );
                    return;
                }
                return next(document);
            },
            didChange: async (event, next) => {
                if (shouldSkipLanguageServer(event.document) || skippedDocuments.has(event.document.uri.toString())) {
                    return;
                }
                return next(event);
            },
            didClose: async (document, next) => {
                if (skippedDocuments.delete(document.uri.toString())) {
                    return;
                }
                return next(document);
            }
        }
    };

    client = new LanguageClient('nusmv', 'NuSMV', serverOptions, clientOptions);
    void client.start();
    context.subscriptions.push({
        dispose: () => {
            void client?.stop();
        }
    });
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
