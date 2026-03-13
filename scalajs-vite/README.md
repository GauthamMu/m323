# Scala.js + Vite

A minimal Scala.js project with Vite for bundling and hot reload.

## Requirements

- [sbt](https://www.scala-sbt.org/) 1.10+
- [Node.js](https://nodejs.org/) 18+

## Setup

```bash
npm install
```

## Development

Run both sbt and Vite in parallel — open two terminals:

**Terminal 1 — sbt (Scala compiler, watching for changes):**

```bash
sbt clean fastLinkJS
```

**Terminal 2 — Vite (dev server with hot reload):**

```bash
npm run dev
```

Then open http://localhost:5173

## Production Build

```bash
sbt fullLinkJS
npm run build
```

## How it works

- `sbt clean fastLinkJS` compiles Scala to an ES module and watches for changes
- `@scala-js/vite-plugin-scalajs` tells Vite where to find the compiled output
- Vite serves and hot-reloads the result in the browser
