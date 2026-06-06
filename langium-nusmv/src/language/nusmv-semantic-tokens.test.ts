import assert from 'node:assert/strict';
import test from 'node:test';
import { EmptyFileSystem } from 'langium';
import { clearDocuments, highlightHelper } from 'langium/test';
import { SemanticTokenTypes } from 'vscode-languageserver';
import { createNuSMVServices } from './nusmv-module.js';

const { NuSMV, shared } = createNuSMVServices(EmptyFileSystem);
const highlightNuSMV = highlightHelper(NuSMV);

test.afterEach(async () => {
    await clearDocuments(shared);
});

test('highlights references for variables, defines, enum members, parameters, and temporal operators', async () => {
    const { tokens } = await highlightNuSMV(`
        MODULE proc(id, lock, N)
        VAR
            pc : {w1, b1c1};
        DEFINE
            iHoldLock := lock = id;
            locked := lock > 0 & !iHoldLock;
        SPEC AG (pc = w1 -> AF (pc = b1c1));

        MODULE main
        VAR
            lock : 0..1;
            N : 0..1;
            p1 : process proc(1, lock, N);
        SPEC EF p1.locked;
    `);

    assertTokenCount(tokens, 'iHoldLock', SemanticTokenTypes.function, 1);
    assertTokenCount(tokens, 'locked', SemanticTokenTypes.function, 1);
    assertTokenCount(tokens, 'w1', SemanticTokenTypes.enumMember, 1);
    assertTokenCount(tokens, 'b1c1', SemanticTokenTypes.enumMember, 1);
    assertTokenCount(tokens, 'id', SemanticTokenTypes.parameter, 2);
    assertTokenCount(tokens, 'N', SemanticTokenTypes.property, 1);
    assertHasToken(tokens, 'AG', SemanticTokenTypes.keyword);
    assertHasToken(tokens, 'AF', SemanticTokenTypes.keyword);
    assertHasToken(tokens, 'EF', SemanticTokenTypes.keyword);
});

function assertHasToken(
    tokens: Array<{ text: string, tokenType: SemanticTokenTypes }>,
    text: string,
    tokenType: SemanticTokenTypes
): void {
    assert.ok(
        tokens.some(token => token.text === text && token.tokenType === tokenType),
        `Expected semantic token ${tokenType} for '${text}'.`
    );
}

function assertTokenCount(
    tokens: Array<{ text: string, tokenType: SemanticTokenTypes }>,
    text: string,
    tokenType: SemanticTokenTypes,
    minimumCount: number
): void {
    const count = tokens.filter(token => token.text === text && token.tokenType === tokenType).length;
    assert.ok(count >= minimumCount, `Expected at least ${minimumCount} '${text}' tokens of type ${tokenType}, got ${count}.`);
}
