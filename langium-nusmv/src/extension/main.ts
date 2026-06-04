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
        documentSelector: [{ scheme: 'file', language: 'nusmv' }]
    };

    client = new LanguageClient('nusmv', 'NuSMV', serverOptions, clientOptions);
    void client.start();
    context.subscriptions.push({
        dispose: () => {
            void client?.stop();
        }
    });

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
