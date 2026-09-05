import { icons } from './icons.js';

export class SiteFooter extends HTMLElement {
  connectedCallback(): void {
    const year = new Date().getFullYear();
    this.innerHTML = `
      <div class="site-footer">
        <div class="links">
          <a href="https://github.com/Grigoriym" aria-label="GitHub">${icons.github}</a>
          <a href="https://www.linkedin.com/in/grigoriy-mikhalchuk-v/" aria-label="LinkedIn">${icons.linkedin}</a>
        </div>
        <p>© ${year}, Mikhalchuk Grigoriy</p>
      </div>
    `;
  }
}

customElements.define('site-footer', SiteFooter);
