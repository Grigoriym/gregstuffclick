# CLAUDE.md

This file provides guidance to Claude Code (claude.ai/code) when working with code in this repository.

## Project Overview

Grigoriy Mikhalchuk's personal website: home, resume, projects, and blog pages. It is a plain,
framework-free static site written in TypeScript, with no client-side router and no UI
framework — real multi-page `.html` files, native Web Components for shared header/footer
chrome, and small TypeScript modules bundled by esbuild.

## Build System & Commands

```bash
npm install       # one-time
npm run dev        # bundles + serves dist/ at http://localhost:8080 with a file watcher
npm run build      # production build (minified) into dist/
npm run typecheck  # tsc --noEmit
```

The site is deployed by building `dist/` and serving it via nginx on a VPS (not from this
machine) — `npm run build` is the only step needed to produce deployable output.

Editing `index.html`, `resume.html`, `projects.html`, `blog.html`, or files under `src/styles/`
while `npm run dev` is running requires restarting the dev server to pick up the change (only
the TypeScript bundle is watched); editing files under `src/ts/` hot-rebuilds automatically —
refresh the browser after a rebuild.

## Architecture

```
index.html / resume.html / projects.html / blog.html   # one real HTML file per page
src/
  styles/style.css        # all site CSS: layout, nav/footer/cards, dark/light theme variables
  ts/
    main.ts                # registers <site-header>/<site-footer>; imported on every page
    theme.ts               # dark/light toggle, persisted to localStorage
    icons.ts               # inline SVG icon strings (no icon font/CDN dependency)
    site-header.ts          # <site-header> custom element: nav links + theme toggle button
    site-footer.ts          # <site-footer> custom element: social links + copyright
    data/resume-data.ts     # typed array of companies/positions/bullets shown on resume.html
    data/projects-data.ts   # typed array of project entries shown on projects.html
    pages/resume.ts          # renders resume-data.ts into #experience on resume.html
    pages/projects.ts        # renders projects-data.ts into #project-list on projects.html
public/                    # static assets (favicon, project logos, store badges) copied as-is
esbuild.mjs                 # build script: copies html/css/public into dist/, bundles the
                             # TS entry points (main, pages/resume, pages/projects)
```

### Adding a page

Add a new `.html` file at the repo root following the pattern of the existing pages (same
`<head>` boilerplate, `<site-header>`/`<site-footer>` elements, a `<script type="module"
src="/scripts/main.js">` at minimum), add its filename to the `cpSync` loop and, if it needs
its own script, to `entryPoints` in `esbuild.mjs`.

### Theme system

Dark is the default. `<html data-theme="light">` switches to light; the attribute is set
synchronously by an inline script in each page's `<head>` (reading `localStorage` key
`gregstuffclick:theme`) to avoid a flash of the wrong theme, and toggled at runtime by
`theme.ts`'s `toggleTheme()`, called from the button rendered by `site-header.ts`.

### Content updates

Resume and project content live in `src/ts/data/*.ts` as plain typed arrays — edit those files
directly rather than the HTML; the corresponding `src/ts/pages/*.ts` renders them into the page.

## Testing & Quality

No test suite. Run `npm run typecheck` before committing TypeScript changes.
