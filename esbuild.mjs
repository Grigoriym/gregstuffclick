import { context, build } from 'esbuild';
import { cpSync, mkdirSync, rmSync } from 'node:fs';

const dev = process.argv.includes('--dev');
const outdir = 'dist';

rmSync(outdir, { recursive: true, force: true });
mkdirSync(outdir, { recursive: true });

for (const file of ['index.html', 'resume.html', 'projects.html', 'blog.html']) {
  cpSync(file, `${outdir}/${file}`);
}
cpSync('src/styles', `${outdir}/styles`, { recursive: true });
cpSync('public', outdir, { recursive: true });

const buildOptions = {
  entryPoints: {
    main: 'src/ts/main.ts',
    resume: 'src/ts/pages/resume.ts',
    projects: 'src/ts/pages/projects.ts',
  },
  bundle: true,
  outdir: `${outdir}/scripts`,
  format: 'esm',
  target: 'es2020',
  sourcemap: dev,
  minify: !dev,
};

if (dev) {
  const ctx = await context(buildOptions);
  await ctx.watch();
  const { port } = await ctx.serve({ servedir: outdir, port: 8080 });
  console.log(`Dev server running at http://localhost:${port}`);
} else {
  await build(buildOptions);
  console.log(`Built to ${outdir}/`);
}
