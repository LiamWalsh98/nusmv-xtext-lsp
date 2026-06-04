import { DefaultCompletionProvider } from 'langium/lsp';
import { CompletionItemKind, CompletionList } from 'vscode-languageserver';
import { NuSMVServices } from './nusmv-module.js';
import { collectModuleSymbols, findContainingModule } from './nusmv-symbols.js';

export class NuSMVCompletionProvider extends DefaultCompletionProvider {

    constructor(services: NuSMVServices) {
        super(services);
    }

    override async getCompletion(document, params, cancelToken) {
        const completion = await super.getCompletion(document, params, cancelToken);
        const root = document.parseResult.value;
        const offset = document.textDocument.offsetAt(params.position);
        const leaf = document.parseResult.value.$cstNode?.rootNode?.findLeafNodeAtOffset(offset);
        const targetNode = leaf?.astNode ?? root;
        const module = findContainingModule(targetNode);
        if (!module) {
            return completion;
        }

        const additionalItems = collectModuleSymbols(module).map(symbol => ({
            label: symbol.name,
            kind: symbol.$type === 'Module' ? CompletionItemKind.Module : CompletionItemKind.Variable,
            detail: symbol.$type
        }));

        if (!completion) {
            return CompletionList.create(additionalItems, true);
        }

        const seen = new Set(completion.items.map(item => `${item.label}:${item.detail ?? ''}`));
        for (const item of additionalItems) {
            const key = `${item.label}:${item.detail ?? ''}`;
            if (!seen.has(key)) {
                completion.items.push(item);
                seen.add(key);
            }
        }
        return completion;
    }
}
