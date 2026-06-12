export type NuSMVRevealRunOutput = 'always' | 'onFailure' | 'never';
export type NuSMVRunMessageKind = 'info' | 'warning' | 'error';

export interface NuSMVCommand {
    executable: string
    args: string[]
}

export interface NuSMVSpecResults {
    trueCount: number
    falseCount: number
    totalCount: number
}

export interface NuSMVRunCompletion {
    cancelled: boolean
    elapsedMs: number
    exitCode: number | null
    signal?: NodeJS.Signals | null
    specResults: NuSMVSpecResults
}

export interface NuSMVRunSummary {
    kind: NuSMVRunMessageKind
    message: string
    statusText: string
}

const SPEC_RESULT_PATTERN = /^\s*--\s*specification\b.*?\bis\s+(true|false)\b.*$/gim;

export function resolveNuSMVExecutable(configuredPath: string | undefined, platform: NodeJS.Platform = process.platform): string {
    return configuredPath?.trim()
        ? configuredPath
        : platform === 'win32' ? 'nusmv.exe' : 'nusmv';
}

export function buildNuSMVCommand(executable: string, defaultRunArgs: readonly string[], modelPath: string): NuSMVCommand {
    return {
        executable,
        args: [...defaultRunArgs, modelPath]
    };
}

export function parseNuSMVSpecResults(output: string): NuSMVSpecResults {
    let trueCount = 0;
    let falseCount = 0;
    for (const match of output.matchAll(SPEC_RESULT_PATTERN)) {
        if (match[1].toLowerCase() === 'true') {
            trueCount++;
        } else {
            falseCount++;
        }
    }
    return {
        trueCount,
        falseCount,
        totalCount: trueCount + falseCount
    };
}

export function formatNuSMVRunSummary(completion: NuSMVRunCompletion): NuSMVRunSummary {
    const duration = formatDuration(completion.elapsedMs);
    const specSummary = formatSpecSummary(completion.specResults);
    if (completion.cancelled) {
        return {
            kind: 'warning',
            message: `NuSMV run cancelled after ${duration}. ${specSummary}`,
            statusText: 'NuSMV: Cancelled'
        };
    }

    if (completion.exitCode !== 0) {
        const exit = completion.exitCode === null
            ? `signal ${completion.signal ?? 'unknown'}`
            : `code ${completion.exitCode}`;
        return {
            kind: 'error',
            message: `NuSMV exited with ${exit} after ${duration}. ${specSummary}`,
            statusText: 'NuSMV: Error'
        };
    }

    if (completion.specResults.falseCount > 0) {
        return {
            kind: 'warning',
            message: `NuSMV completed with ${completion.specResults.falseCount} failing specification${plural(completion.specResults.falseCount)} after ${duration}. ${specSummary}`,
            statusText: 'NuSMV: Failed'
        };
    }

    if (completion.specResults.totalCount > 0) {
        return {
            kind: 'info',
            message: `NuSMV passed ${completion.specResults.totalCount} specification${plural(completion.specResults.totalCount)} in ${duration}. ${specSummary}`,
            statusText: 'NuSMV: Passed'
        };
    }

    return {
        kind: 'info',
        message: `NuSMV completed in ${duration}. ${specSummary}`,
        statusText: 'NuSMV: Passed'
    };
}

export function shouldRevealRunOutput(mode: NuSMVRevealRunOutput, kind: NuSMVRunMessageKind): boolean {
    return mode === 'always' || (mode === 'onFailure' && kind !== 'info');
}

export function buildTerminalCommand(command: NuSMVCommand): string {
    return [command.executable, ...command.args].map(quoteShellArg).join(' ');
}

function formatSpecSummary(results: NuSMVSpecResults): string {
    return results.totalCount === 0
        ? 'No specification results found.'
        : `Specs: ${results.trueCount} true, ${results.falseCount} false.`;
}

function formatDuration(elapsedMs: number): string {
    return elapsedMs < 1000
        ? `${elapsedMs}ms`
        : `${(elapsedMs / 1000).toFixed(1)}s`;
}

function plural(count: number): string {
    return count === 1 ? '' : 's';
}

function quoteShellArg(arg: string): string {
    if (/^[A-Za-z0-9_./:=-]+$/.test(arg)) {
        return arg;
    }
    return `"${arg.replace(/(["\\$`])/g, '\\$1')}"`;
}
