import assert from 'node:assert/strict';
import { readFile } from 'node:fs/promises';
import test from 'node:test';

test('uses a manual TextMate grammar with NuSMV-specific scopes', async () => {
    const grammar = JSON.parse(await readFile(new URL('../../syntaxes/nusmv.tmLanguage.json', import.meta.url), 'utf-8'));
    const serialized = JSON.stringify(grammar);

    assert.equal(grammar.scopeName, 'source.nusmv');
    assert.ok(serialized.includes('entity.name.type.module.nusmv'));
    assert.ok(serialized.includes('entity.name.type.module.reference.nusmv'));
    assert.ok(serialized.includes('entity.name.variable.declaration.nusmv'));
    assert.ok(serialized.includes('entity.name.function.define.nusmv'));
    assert.ok(serialized.includes('constant.other.enum.nusmv'));
    assert.ok(serialized.includes('keyword.operator.temporal.nusmv'));
    assert.ok(serialized.includes('support.function.builtin.nusmv'));
    assert.ok(serialized.includes('constant.numeric.word.nusmv'));
});

test('does not regenerate the manual TextMate grammar from Langium config', async () => {
    const config = JSON.parse(await readFile(new URL('../../langium-config.json', import.meta.url), 'utf-8'));
    assert.equal(config.languages[0].textMate, undefined);
    assert.equal(config.languages[0].monarch.out, 'syntaxes/nusmv.monarch.ts');
});
