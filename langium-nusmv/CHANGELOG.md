# Changelog

## 0.9.6

- Fix context bleeding between files causing identically-name definitions to be overridden

## 0.9.4 - 2026-06-04

- More Metadata fixes

## 0.9.4 - 2026-06-04

- Plugin Metadata fixes

## 0.9.3 - 2026-06-04

- New public release
- Semantic analysis now updates in real time while editing instead of only after saving.
- Migrated the extension from Xtext to Langium, removing the Java dependency and using a TypeScript-based language server.
- Added broader semantic support for NuSMV expressions and model checks.
- Added settings to skip semantic analysis for very large `.smv` files to improve editor performance.

## 0.1.0 - 2020-11-08

- First version