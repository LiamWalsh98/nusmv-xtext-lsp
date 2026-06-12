import assert from 'node:assert/strict';
import { readFileSync } from 'node:fs';
import test from 'node:test';

const manifest = JSON.parse(readFileSync(new URL('../../package.json', import.meta.url), 'utf8'));

test('contributes NuSMV run configuration settings with expected defaults', () => {
    const properties = manifest.contributes.configuration.properties;

    assert.equal(properties['nusmv.executablePath'].default, '');
    assert.deepEqual(properties['nusmv.defaultRunArgs'].default, []);
    assert.deepEqual(properties['nusmv.defaultRunArgs'].items, { type: 'string' });
    assert.equal(properties['nusmv.revealRunOutput'].default, 'always');
    assert.deepEqual(properties['nusmv.revealRunOutput'].enum, ['always', 'onFailure', 'never']);
});

test('contributes captured and terminal NuSMV run commands', () => {
    const commands = manifest.contributes.commands.map((command: { command: string }) => command.command);
    const commandPaletteItems = manifest.contributes.menus.commandPalette
        .map((item: { command: string }) => item.command);

    assert.ok(commands.includes('nusmv.runCurrent'));
    assert.ok(commands.includes('nusmv.runCurrentInTerminal'));
    assert.ok(commandPaletteItems.includes('nusmv.runCurrent'));
    assert.ok(commandPaletteItems.includes('nusmv.runCurrentInTerminal'));
});
