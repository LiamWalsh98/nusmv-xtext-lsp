import { spawn, type ChildProcessWithoutNullStreams } from 'node:child_process';
import * as os from 'node:os';
import * as path from 'node:path';
import * as vscode from 'vscode';
import {
    LanguageClient,
    LanguageClientOptions,
    ServerOptions,
    TransportKind
} from 'vscode-languageclient/node.js';
import {
    buildNuSMVCommand,
    buildTerminalCommand,
    formatNuSMVRunSummary,
    parseNuSMVSpecResults,
    resolveNuSMVExecutable,
    shouldRevealRunOutput,
    type NuSMVCommand,
    type NuSMVRevealRunOutput,
    type NuSMVRunMessageKind
} from './nusmv-runner.js';

let client: LanguageClient | undefined;
let outputChannel: vscode.OutputChannel | undefined;
let runOutputChannel: vscode.OutputChannel | undefined;
let runStatusBarItem: vscode.StatusBarItem | undefined;
let activeRun: ChildProcessWithoutNullStreams | undefined;
let runStatusResetTimer: ReturnType<typeof setTimeout> | undefined;
const CONFIG_SECTION = 'nusmv';
const DIAGNOSTIC_DEBOUNCE_MS = 600;
const DEFAULT_MAX_SEMANTIC_CHECK_LINES = 10_000;
const skippedDocuments = new Set<string>();
const diagnosticTimers = new Map<string, ReturnType<typeof setTimeout>>();
const diagnosticVersions = new Map<string, number>();

interface SpawnedNuSMVResult {
    stdout: string
    stderr: string
    exitCode: number | null
    signal: NodeJS.Signals | null
    cancelled: boolean
    elapsedMs: number
    error?: Error
}

export function activate(context: vscode.ExtensionContext): void {
    outputChannel = vscode.window.createOutputChannel('NuSMV');
    outputChannel.appendLine('NuSMV extension activate() called.');
    runOutputChannel = vscode.window.createOutputChannel('NuSMV Run');
    runStatusBarItem = vscode.window.createStatusBarItem(vscode.StatusBarAlignment.Left, 100);
    runStatusBarItem.command = 'nusmv.runCurrent';
    runStatusBarItem.tooltip = 'Run the current NuSMV model';

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
                if (skippedDocuments.delete(document.uri.toString())) {
                    return;
                }
                return next(document);
            },
            provideCompletionItem: (document, position, context, token, next) => {
                if (shouldBypassLanguageServerRequest(document)) {
                    return [];
                }
                return next(document, position, context, token);
            },
            provideDefinition: (document, position, token, next) => {
                if (shouldBypassLanguageServerRequest(document)) {
                    return null;
                }
                return next(document, position, token);
            },
            provideDeclaration: (document, position, token, next) => {
                if (shouldBypassLanguageServerRequest(document)) {
                    return null;
                }
                return next(document, position, token);
            },
            provideReferences: (document, position, options, token, next) => {
                if (shouldBypassLanguageServerRequest(document)) {
                    return [];
                }
                return next(document, position, options, token);
            },
            provideDocumentHighlights: (document, position, token, next) => {
                if (shouldBypassLanguageServerRequest(document)) {
                    return [];
                }
                return next(document, position, token);
            },
            provideHover: (document, position, token, next) => {
                if (shouldBypassLanguageServerRequest(document)) {
                    return null;
                }
                return next(document, position, token);
            },
            provideDocumentSymbols: (document, token, next) => {
                if (shouldBypassLanguageServerRequest(document)) {
                    return [];
                }
                return next(document, token);
            },
            provideDocumentSemanticTokens: (document, token, next) => {
                if (shouldBypassLanguageServerRequest(document)) {
                    return emptySemanticTokens();
                }
                return next(document, token);
            },
            provideDocumentSemanticTokensEdits: (document, previousResultId, token, next) => {
                if (shouldBypassLanguageServerRequest(document)) {
                    return emptySemanticTokens();
                }
                return next(document, previousResultId, token);
            },
            provideDocumentRangeSemanticTokens: (document, range, token, next) => {
                if (shouldBypassLanguageServerRequest(document)) {
                    return emptySemanticTokens();
                }
                return next(document, range, token);
            },
            handleDiagnostics: (uri, diagnostics, next) => {
                const key = uri.toString();
                const version = (diagnosticVersions.get(key) ?? 0) + 1;
                diagnosticVersions.set(key, version);
                clearPendingDiagnostics(uri);

                if (diagnostics.length === 0) {
                    next(uri, diagnostics);
                    return;
                }

                const timeout = setTimeout(() => {
                    diagnosticTimers.delete(key);
                    if (diagnosticVersions.get(key) === version) {
                        next(uri, diagnostics);
                    }
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
            clearRunStatusResetTimer();
            activeRun?.kill();
            void client?.stop();
        }
    });
    context.subscriptions.push(outputChannel, runOutputChannel, runStatusBarItem);
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
        terminal.sendText(buildTerminalCommand({
            executable: getNuSMVExecutable(),
            args: ['-int']
        }));
        terminal.show();
    }));

    context.subscriptions.push(vscode.commands.registerCommand('nusmv.runCurrent', () => {
        void runCurrentModel();
    }));

    context.subscriptions.push(vscode.commands.registerCommand('nusmv.runCurrentInTerminal', () => {
        runCurrentModelInTerminal();
    }));
}

export function deactivate(): Thenable<void> | undefined {
    outputChannel?.appendLine('deactivate() called.');
    clearAllPendingDiagnostics();
    clearRunStatusResetTimer();
    activeRun?.kill();
    return client?.stop();
}

async function runCurrentModel(): Promise<void> {
    const document = getActiveNuSMVDocument();
    if (!document) {
        return;
    }
    if (document.uri.scheme !== 'file') {
        void vscode.window.showWarningMessage('Save this NuSMV model to disk before running it.');
        return;
    }
    if (activeRun) {
        void vscode.window.showWarningMessage('A NuSMV run is already in progress.');
        return;
    }

    let saved = false;
    try {
        saved = await document.save();
    } catch (error) {
        outputChannel?.appendLine(`Failed to save before NuSMV run: ${String(error)}`);
    }
    if (!saved) {
        void vscode.window.showWarningMessage('Save failed, so NuSMV was not run.');
        return;
    }

    const command = buildNuSMVRunCommand(document);
    const revealRunOutput = getRevealRunOutput(document);
    const cwd = path.dirname(document.fileName);

    runOutputChannel?.clear();
    runOutputChannel?.appendLine(`NuSMV Run - ${new Date().toLocaleString()}`);
    runOutputChannel?.appendLine(`Command: ${buildTerminalCommand(command)}`);
    runOutputChannel?.appendLine(`Working directory: ${cwd}`);
    runOutputChannel?.appendLine('');
    if (revealRunOutput === 'always') {
        runOutputChannel?.show(true);
    }
    setRunStatus('NuSMV: Running');

    const result = await vscode.window.withProgress({
        location: vscode.ProgressLocation.Notification,
        title: `Running NuSMV: ${path.basename(document.fileName)}`,
        cancellable: true
    }, (_progress, token) => runSpawnedNuSMV(command, cwd, token));

    if (result.error) {
        const message = `Unable to start NuSMV executable "${command.executable}". Set nusmv.executablePath to your NuSMV binary. ${result.error.message}`;
        runOutputChannel?.appendLine('');
        runOutputChannel?.appendLine(message);
        if (shouldRevealRunOutput(revealRunOutput, 'error')) {
            runOutputChannel?.show(true);
        }
        setRunStatus('NuSMV: Error', 'error', true);
        void vscode.window.showErrorMessage(message);
        return;
    }

    const specResults = parseNuSMVSpecResults(`${result.stdout}\n${result.stderr}`);
    const summary = formatNuSMVRunSummary({
        cancelled: result.cancelled,
        elapsedMs: result.elapsedMs,
        exitCode: result.exitCode,
        signal: result.signal,
        specResults
    });

    runOutputChannel?.appendLine('');
    runOutputChannel?.appendLine(summary.message);
    runOutputChannel?.appendLine(formatExitLine(result));
    if (shouldRevealRunOutput(revealRunOutput, summary.kind)) {
        runOutputChannel?.show(true);
    }
    setRunStatus(summary.statusText, summary.kind, true);
    showRunNotification(summary.kind, summary.message);
}

function runCurrentModelInTerminal(): void {
    const document = getActiveNuSMVDocument();
    if (!document) {
        return;
    }
    if (document.uri.scheme !== 'file') {
        void vscode.window.showWarningMessage('Save this NuSMV model to disk before running it in a terminal.');
        return;
    }
    const terminal = vscode.window.createTerminal('NuSMV Batch');
    terminal.sendText(buildTerminalCommand(buildNuSMVRunCommand(document)));
    terminal.show();
}

function getActiveNuSMVDocument(): vscode.TextDocument | undefined {
    const editor = vscode.window.activeTextEditor;
    if (!editor) {
        void vscode.window.showWarningMessage('Open a NuSMV file before running this command.');
        return undefined;
    }
    if (editor.document.languageId !== 'nusmv') {
        void vscode.window.showWarningMessage('Open a NuSMV file before running this command.');
        return undefined;
    }
    return editor.document;
}

function buildNuSMVRunCommand(document: vscode.TextDocument): NuSMVCommand {
    return buildNuSMVCommand(
        getNuSMVExecutable(document),
        getDefaultRunArgs(document),
        document.fileName
    );
}

function getNuSMVExecutable(document?: vscode.TextDocument): string {
    const configuration = vscode.workspace.getConfiguration(CONFIG_SECTION, document?.uri);
    return resolveNuSMVExecutable(configuration.get<string>('executablePath', ''), os.platform());
}

function getDefaultRunArgs(document?: vscode.TextDocument): string[] {
    const configuration = vscode.workspace.getConfiguration(CONFIG_SECTION, document?.uri);
    const args = configuration.get<unknown>('defaultRunArgs', []);
    return Array.isArray(args)
        ? args.filter((arg): arg is string => typeof arg === 'string')
        : [];
}

function getRevealRunOutput(document?: vscode.TextDocument): NuSMVRevealRunOutput {
    const configuration = vscode.workspace.getConfiguration(CONFIG_SECTION, document?.uri);
    const value = configuration.get<NuSMVRevealRunOutput>('revealRunOutput', 'always');
    return value === 'always' || value === 'onFailure' || value === 'never'
        ? value
        : 'always';
}

function runSpawnedNuSMV(command: NuSMVCommand, cwd: string, token: vscode.CancellationToken): Promise<SpawnedNuSMVResult> {
    const startedAt = Date.now();
    let child: ChildProcessWithoutNullStreams;
    try {
        child = spawn(command.executable, command.args, {
            cwd,
            windowsHide: true
        });
    } catch (error) {
        return Promise.resolve({
            stdout: '',
            stderr: '',
            exitCode: null,
            signal: null,
            cancelled: false,
            elapsedMs: Date.now() - startedAt,
            error: error instanceof Error ? error : new Error(String(error))
        });
    }

    activeRun = child;
    let stdout = '';
    let stderr = '';
    let cancelled = false;

    return new Promise(resolve => {
        let settled = false;
        const cancellation = token.onCancellationRequested(() => {
            cancelled = true;
            runOutputChannel?.appendLine('');
            runOutputChannel?.appendLine('Cancellation requested. Stopping NuSMV...');
            child.kill();
        });

        const finish = (result: Pick<SpawnedNuSMVResult, 'exitCode' | 'signal' | 'error'>): void => {
            if (settled) {
                return;
            }
            settled = true;
            cancellation.dispose();
            if (activeRun === child) {
                activeRun = undefined;
            }
            resolve({
                stdout,
                stderr,
                exitCode: result.exitCode,
                signal: result.signal,
                cancelled,
                elapsedMs: Date.now() - startedAt,
                error: result.error
            });
        };

        child.stdout.on('data', chunk => {
            const text = String(chunk);
            stdout += text;
            runOutputChannel?.append(text);
        });
        child.stderr.on('data', chunk => {
            const text = String(chunk);
            stderr += text;
            runOutputChannel?.append(text);
        });
        child.on('error', error => {
            finish({
                exitCode: null,
                signal: null,
                error
            });
        });
        child.on('close', (exitCode, signal) => {
            finish({
                exitCode,
                signal
            });
        });

        if (token.isCancellationRequested) {
            cancelled = true;
            child.kill();
        }
    });
}

function formatExitLine(result: SpawnedNuSMVResult): string {
    if (result.cancelled) {
        return 'Run cancelled.';
    }
    if (result.exitCode === null) {
        return `NuSMV stopped by signal ${result.signal ?? 'unknown'}.`;
    }
    return `NuSMV exited with code ${result.exitCode}.`;
}

function showRunNotification(kind: NuSMVRunMessageKind, message: string): void {
    if (kind === 'error') {
        void vscode.window.showErrorMessage(message);
    } else if (kind === 'warning') {
        void vscode.window.showWarningMessage(message);
    } else {
        void vscode.window.showInformationMessage(message);
    }
}

function setRunStatus(text: string, kind?: NuSMVRunMessageKind, hideAfterDelay = false): void {
    if (!runStatusBarItem) {
        return;
    }
    clearRunStatusResetTimer();
    runStatusBarItem.text = text;
    runStatusBarItem.tooltip = 'Run the current NuSMV model';
    runStatusBarItem.command = 'nusmv.runCurrent';
    runStatusBarItem.show();
    if (hideAfterDelay) {
        runStatusResetTimer = setTimeout(() => {
            runStatusBarItem?.hide();
            runStatusResetTimer = undefined;
        }, kind === 'error' ? 8_000 : 5_000);
    }
}

function clearRunStatusResetTimer(): void {
    if (runStatusResetTimer) {
        clearTimeout(runStatusResetTimer);
        runStatusResetTimer = undefined;
    }
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

function shouldBypassLanguageServerRequest(document: vscode.TextDocument): boolean {
    return skippedDocuments.has(document.uri.toString()) || shouldSkipLanguageServer(document);
}

function emptySemanticTokens(): vscode.SemanticTokens {
    return new vscode.SemanticTokens(new Uint32Array());
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
    diagnosticVersions.clear();
}
