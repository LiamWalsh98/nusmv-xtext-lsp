# NuSMV VSCode Extension

NuSMV language support for Visual Studio Code, powered by a TypeScript Langium language server.

## Features

- Syntax highlighting for `.smv` files
- Real-time semantic analysis while editing
- NuSMV expression and model validation
- Captured, cancellable `NuSMV: Run Current Model` command with output summaries
- Raw terminal fallback via `NuSMV: Run Current Model in Terminal`
- Configurable option to skip semantic checks for very large files

## Settings

- `nusmv.disableSemanticChecksOnLargeFiles`
- `nusmv.semanticChecksMaxLines`
- `nusmv.executablePath`
- `nusmv.defaultRunArgs`
- `nusmv.revealRunOutput`
