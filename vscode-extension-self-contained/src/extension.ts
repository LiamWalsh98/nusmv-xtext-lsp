'use strict';

import * as path from 'path';
import * as os from 'os';

import {Trace} from 'vscode-jsonrpc';
import { commands, window, workspace, ExtensionContext, Uri } from 'vscode';
import { LanguageClient, LanguageClientOptions, ServerOptions } from 'vscode-languageclient';

export function activate(context: ExtensionContext) {
    // The server is a locally installed in src/smv
    let launcher = os.platform() === 'win32' ? 'nusmv-standalone.bat' : 'nusmv-standalone';
    let script = context.asAbsolutePath(path.join('src', 'smv', 'bin', launcher));

    let serverOptions: ServerOptions = {
        run : { command: script },
        debug: { command: script, args: [], options: { env: createDebugEnv() } }
    };
    
    let clientOptions: LanguageClientOptions = {
        documentSelector: ['smv'],
        synchronize: {
            fileEvents: workspace.createFileSystemWatcher('**/*.*')
        }
    };
    
    // Create the language client and start the client.
    let lc = new LanguageClient('NuSMV Server', serverOptions, clientOptions);
    
    // enable tracing (.Off, .Messages, Verbose)
    lc.trace = Trace.Verbose;
    let disposable = lc.start();
    
    // Push the disposable to the context's subscriptions so that the 
    // client can be deactivated on extension deactivation
    context.subscriptions.push(disposable);


    // Launch Shell command
    context.subscriptions.push(commands.registerCommand("nusmv.createTerminal", () => {
        const terminal = window.createTerminal("NuSMV Shell");
        terminal.sendText
        terminal.sendText(os.platform() === "win32" ? "nusmv.exe" : "nusmv" + " -int");
        terminal.show();
    }));

    // Run file command
    context.subscriptions.push(commands.registerCommand("nusmv.runCurrent", () => {
        // TODO: Make sure to overwrite old terminal if new one spawns
        
        const terminal = window.createTerminal("NuSMV Batch");
        terminal.sendText(os.platform() === "win32" ? "nusmv.exe" : "nusmv" + ` ${window.activeTextEditor.document.fileName}`);
        terminal.show();
    }));

}

function createDebugEnv() {
    return Object.assign({
        JAVA_OPTS:"-Xdebug -Xrunjdwp:server=y,transport=dt_socket,address=8000,suspend=n,quiet=y"
    }, process.env)
}