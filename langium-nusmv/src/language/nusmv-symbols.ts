import { AstUtils } from 'langium';
import {
    ConstantSymbol,
    DefineBody,
    EnumType,
    EnumValue,
    FormalParameter,
    isModule,
    Module,
    NuSmvModel,
    VarBody
} from './generated/ast.js';

export type NuSMVSymbol = Module | VarBody | FormalParameter | DefineBody | ConstantSymbol | EnumValue;

export function findContainingModule(node: object): Module | undefined {
    return AstUtils.getContainerOfType(node as never, isModule);
}

export function collectModuleSymbols(module: Module): NuSMVSymbol[] {
    const symbols: NuSMVSymbol[] = [module, ...module.params];
    for (const element of module.elements) {
        if ('vars' in element && Array.isArray(element.vars)) {
            symbols.push(...element.vars);
            for (const variable of element.vars) {
                symbols.push(...collectEnumValues(variable));
            }
        }
        if ('defineBodies' in element && Array.isArray(element.defineBodies)) {
            symbols.push(...element.defineBodies);
        }
        if ('constants' in element && Array.isArray(element.constants)) {
            symbols.push(...element.constants);
        }
    }
    return symbols;
}

export function collectVisibleModuleSymbols(module: Module): Exclude<NuSMVSymbol, Module>[] {
    return collectModuleSymbols(module).filter((symbol): symbol is Exclude<NuSMVSymbol, Module> => !isModule(symbol));
}

export function collectSymbolNames(module: Module): string[] {
    return [...new Set(collectModuleSymbols(module).map(symbol => symbol.name))];
}

export function collectDeclaredModules(node: object): Module[] {
    const root = AstUtils.getContainerOfType(node as never, (item): item is NuSmvModel => (item as NuSmvModel | undefined)?.$type === 'NuSmvModel')
        ?? ((node as NuSmvModel | undefined)?.$type === 'NuSmvModel' ? node as NuSmvModel : undefined);
    return root?.modules ?? [];
}

function collectEnumValues(variable: VarBody): EnumValue[] {
    return variable.type.$type === 'EnumType'
        ? (variable.type as EnumType).values
        : [];
}
