# Lumina Code Theme for IntelliJ IDEA

A minimal theme family for JetBrains IDEs with a deep-space violet, teal, indigo, and slate palette designed for comfortable long coding sessions.

High-chroma colors are softened and reserved for meaningful syntax or state changes. Neutral code stays quiet, surfaces use tonal layering instead of heavy borders, and every editor style remains non-italic.

## Variants

Includes 4 different variations for you to choose from:

- **Lumina Code**: The standard dark theme (`#0b1326`).
- **Lumina Code Deep**: A deeper, almost black variant (`#060e20`).
- **Lumina Code Lighter**: A raised navy variant (`#171f33`).
- **Lumina Code Light**: A low-glare violet-slate variant (`#f6f4f9`).

## Palette

### Dark themes

- **Default code:** soft blue-gray (`#aeb9d2`)
- **Keywords and control flow:** softened violet (`#c6a5e3`)
- **Functions and imports:** technical teal (`#72c7bc`)
- **Strings and regular expressions:** gentle mint (`#85c9bd`)
- **Types and operators:** receding indigo (`#98a4d6`)
- **Errors:** soft coral (`#d98986`)

### Light theme

- **Default code:** slate (`#45506a`)
- **Keywords:** muted purple (`#78519c`)
- **Functions and strings:** balanced teal (`#26766d`)
- **Types and operators:** slate indigo (`#4e527d`)
- **Errors:** muted coral (`#ad5c62`)

## Features

- **Minimal tonal UI:** Surface levels and restrained highlights replace distracting borders and glow.
- **Consistent semantic hierarchy:** Functions, strings, types, operators, comments, warnings, and errors keep distinct roles.
- **No italics:** A stable, non-italic editor scheme for straightforward code legibility.

## Building & Running

You can test the theme locally in a sandbox IDE:

```bash
./gradlew runIde
```

Or build the distribution `.zip` file for manual installation via **Settings > Plugins > Install Plugin from Disk**:

```bash
./gradlew buildPlugin
```

*(The `.zip` artifact will be generated in `build/distributions/`)*

## License

This project is licensed under the [MIT License](LICENSE).
