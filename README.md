# gregstuffclick

Personal website — home, resume, projects, and blog. Plain TypeScript, no framework: real
`.html` pages, native Web Components for the shared header/footer, and esbuild for bundling.

## Getting started

```bash
npm install
npm run dev
```

Open [http://localhost:8080](http://localhost:8080).

## Building

```bash
npm run build
```

Produces a static `dist/` folder (HTML, CSS, bundled JS, images) that can be served by any
static file server or opened directly. This site is deployed by building `dist/` and serving
it with nginx on a VPS; there's no build step that runs on the host itself.

## Type checking

```bash
npm run typecheck
```
