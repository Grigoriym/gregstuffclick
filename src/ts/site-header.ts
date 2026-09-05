import { icons } from './icons.js';
import { currentTheme, toggleTheme } from './theme.js';

export class SiteHeader extends HTMLElement {
  connectedCallback(): void {
    const current = location.pathname.replace(/index\.html$/, '');
    const isActive = (path: string): boolean => current === path || current.endsWith(path);

    this.innerHTML = `
      <nav class="site-nav">
        <a href="/" aria-label="Home" ${isActive('/') ? 'aria-current="page"' : ''}>${icons.home}</a>
        <a href="/resume.html" ${isActive('/resume.html') ? 'aria-current="page"' : ''}>Resume</a>
        <a href="/projects.html" ${isActive('/projects.html') ? 'aria-current="page"' : ''}>Projects</a>
        <a href="/blog.html" ${isActive('/blog.html') ? 'aria-current="page"' : ''}>Blog</a>
        <span class="spacer"></span>
        <button type="button" class="theme-toggle" aria-label="Toggle theme"></button>
      </nav>
    `;

    const button = this.querySelector<HTMLButtonElement>('.theme-toggle')!;
    const renderIcon = (): void => {
      button.innerHTML = currentTheme() === 'dark' ? icons.sun : icons.moon;
    };
    renderIcon();
    button.addEventListener('click', () => {
      toggleTheme();
      renderIcon();
    });
  }
}

customElements.define('site-header', SiteHeader);
