import assert from 'node:assert/strict';
import { readFile } from 'node:fs/promises';
import test from 'node:test';
import { EmptyFileSystem } from 'langium';
import { clearDocuments, validationHelper } from 'langium/test';
import { createNuSMVServices } from './nusmv-module.js';

const { NuSMV, shared } = createNuSMVServices(EmptyFileSystem);
const validateNuSMV = validationHelper(NuSMV);

test.after(async () => {
    await clearDocuments(shared);
});

test('accepts enum literals from process-typed paths in comparisons', async () => {
    const result = await validateNuSMV(`
        MODULE proc
        VAR
            pc : {w1, w2, bc1, bc2, bc3, bc4, bc5};

        MODULE main
        VAR
            p1 : process proc;
            p2 : process proc;
        DEFINE
            p1InB := (p1.pc = bc1 | p1.pc = bc2 | p1.pc = bc3 | p1.pc = bc4 | p1.pc = bc5);
            p2InB := (p2.pc = bc1 | p2.pc = bc2 | p2.pc = bc3 | p2.pc = bc4 | p2.pc = bc5);
    `);

    assertNoDiagnostics(result.diagnostics);
    await result.dispose();
});

test('accepts reusable-barrier enum literals from process-typed paths in comparisons', async () => {
    const result = await validateNuSMV(`
        MODULE proc
        VAR
            pc : {w1, w2, b1c1, b1c2, b1c3, b1c4, b1c5, b1r1, b1r2, b1r3, b1r4, b1r5,
                  b2c1, b2c2, b2c3, b2c4, b2c5, b2r1, b2r2, b2r3, b2r4, b2r5};

        MODULE main
        VAR
            p1 : process proc;
            p2 : process proc;
        DEFINE
            p1InB1 := (p1.pc = b1c1 | p1.pc = b1r5);
            p2InB2 := (p2.pc = b2c1 | p2.pc = b2r5);
    `);

    assertNoDiagnostics(result.diagnostics);
    await result.dispose();
});

test('rejects enum literals that are not valid for the compared enum type', async () => {
    const result = await validateNuSMV(`
        MODULE proc
        VAR
            pc : {w1, w2, bc1};

        MODULE main
        VAR
            p1 : process proc;
        DEFINE
            bad := p1.pc = definitelyNotAState;
    `);

    assert.ok(result.diagnostics.some(diagnostic => diagnostic.message.includes("Unknown symbol 'definitelyNotAState'")));
    await result.dispose();
});

test('accepts enum literals assigned to enum-typed variables', async () => {
    const result = await validateNuSMV(`
        MODULE main
        VAR
            pc : {bc1, bc2};
        ASSIGN
            init(pc) := bc1;
            next(pc) := bc2;
    `);

    assertNoDiagnostics(result.diagnostics);
    await result.dispose();
});

test('validates assignment sample models without false enum-literal diagnostics', async () => {
    for (const file of ['a4Parts3and4.smv', 'a4Part5.smv', 'a4Part1.smv']) {
        const text = await readFile(new URL(`../../../tests/${file}`, import.meta.url), 'utf-8');
        const result = await validateNuSMV(text);
        assertNoDiagnostics(result.diagnostics, file);
        await result.dispose();
    }
});

test('keeps same-named modules isolated between open documents', async () => {
    await assertCleanWhenOpenedAfter('a4Part5.smv', 'a4Parts3and4.smv');
    await assertCleanWhenOpenedAfter('a4Parts3and4.smv', 'a4Part5.smv');
});

async function assertCleanWhenOpenedAfter(firstFile: string, secondFile: string): Promise<void> {
    const firstText = await readFile(new URL(`../../../tests/${firstFile}`, import.meta.url), 'utf-8');
    const secondText = await readFile(new URL(`../../../tests/${secondFile}`, import.meta.url), 'utf-8');
    const first = await validateNuSMV(firstText, { documentUri: `file:///${firstFile}` });
    const second = await validateNuSMV(secondText, { documentUri: `file:///${secondFile}` });
    try {
        assertNoDiagnostics(first.diagnostics, firstFile);
        assertNoDiagnostics(second.diagnostics, `${secondFile} after ${firstFile}`);
    } finally {
        await second.dispose();
        await first.dispose();
    }
}

function assertNoDiagnostics(diagnostics: { message: string }[], label?: string): void {
    assert.deepEqual(diagnostics.map(diagnostic => diagnostic.message), [], label);
}
