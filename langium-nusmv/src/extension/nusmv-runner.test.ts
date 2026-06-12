import assert from 'node:assert/strict';
import test from 'node:test';
import {
    buildNuSMVCommand,
    formatNuSMVRunSummary,
    parseNuSMVSpecResults,
    resolveNuSMVExecutable,
    shouldRevealRunOutput
} from './nusmv-runner.js';

test('resolves configured and platform-default NuSMV executables', () => {
    assert.equal(resolveNuSMVExecutable('/opt/nusmv/bin/NuSMV', 'darwin'), '/opt/nusmv/bin/NuSMV');
    assert.equal(resolveNuSMVExecutable('', 'darwin'), 'nusmv');
    assert.equal(resolveNuSMVExecutable(undefined, 'linux'), 'nusmv');
    assert.equal(resolveNuSMVExecutable('', 'win32'), 'nusmv.exe');
});

test('builds NuSMV command arguments with default args before the model path', () => {
    assert.deepEqual(
        buildNuSMVCommand('nusmv', ['-dcx', '-int'], '/models/model-input.smv'),
        {
            executable: 'nusmv',
            args: ['-dcx', '-int', '/models/model-input.smv']
        }
    );
});

test('parses true and false NuSMV specification result lines', () => {
    const output = `
        -- specification AG foo is true
        -- specification EF bar is false
        -- SPECIFICATION baz IS TRUE
        unrelated line
    `;
    assert.deepEqual(parseNuSMVSpecResults(output), {
        trueCount: 2,
        falseCount: 1,
        totalCount: 3
    });
});

test('formats successful NuSMV run summaries', () => {
    assert.deepEqual(formatNuSMVRunSummary({
        cancelled: false,
        elapsedMs: 912,
        exitCode: 0,
        specResults: { trueCount: 2, falseCount: 0, totalCount: 2 }
    }), {
        kind: 'info',
        message: 'NuSMV passed 2 specifications in 912ms. Specs: 2 true, 0 false.',
        statusText: 'NuSMV: Passed'
    });
});

test('formats failing spec, nonzero exit, and cancellation summaries', () => {
    assert.equal(formatNuSMVRunSummary({
        cancelled: false,
        elapsedMs: 1200,
        exitCode: 0,
        specResults: { trueCount: 1, falseCount: 1, totalCount: 2 }
    }).kind, 'warning');

    assert.equal(formatNuSMVRunSummary({
        cancelled: false,
        elapsedMs: 1200,
        exitCode: 2,
        specResults: { trueCount: 0, falseCount: 0, totalCount: 0 }
    }).kind, 'error');

    assert.equal(formatNuSMVRunSummary({
        cancelled: true,
        elapsedMs: 1200,
        exitCode: null,
        signal: 'SIGTERM',
        specResults: { trueCount: 0, falseCount: 0, totalCount: 0 }
    }).statusText, 'NuSMV: Cancelled');
});

test('reveals run output according to configured policy', () => {
    assert.equal(shouldRevealRunOutput('always', 'info'), true);
    assert.equal(shouldRevealRunOutput('onFailure', 'warning'), true);
    assert.equal(shouldRevealRunOutput('onFailure', 'error'), true);
    assert.equal(shouldRevealRunOutput('onFailure', 'info'), false);
    assert.equal(shouldRevealRunOutput('never', 'error'), false);
});
