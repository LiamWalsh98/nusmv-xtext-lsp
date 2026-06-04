import {
    AstNode,
    AstNodeDescription,
    DefaultScopeComputation,
    DefaultScopeProvider,
    LangiumDocument,
    LocalSymbols,
    MultiMap
} from 'langium';
import {
    NuSmvModel
} from './generated/ast.js';
import { NuSMVServices } from './nusmv-module.js';
import { collectModuleSymbols } from './nusmv-symbols.js';

export class NuSMVScopeComputation extends DefaultScopeComputation {

    constructor(services: NuSMVServices) {
        super(services);
    }

    override async collectLocalSymbols(document: LangiumDocument): Promise<LocalSymbols> {
        const scopes = new MultiMap<AstNode, AstNodeDescription>();
        const root = document.parseResult.value as NuSmvModel;
        for (const module of root.modules) {
            for (const symbol of collectModuleSymbols(module)) {
                scopes.add(module, this.descriptions.createDescription(symbol, symbol.name, document));
            }
        }
        return scopes;
    }
}

export class NuSMVScopeProvider extends DefaultScopeProvider {}
