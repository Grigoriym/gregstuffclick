import '../main.js';
import { icons } from '../icons.js';
import { projects } from '../data/projects-data.js';

const container = document.querySelector<HTMLDivElement>('#project-list')!;

container.innerHTML = projects
  .map(
    (project) => `
      <div class="project-card">
        ${project.logoPath ? `<img class="logo" src="${project.logoPath}" alt="${project.name} logo" />` : ''}
        <div class="title-row">
          <h2>${project.name}</h2>
          <a href="${project.githubLink}" aria-label="${project.name} on GitHub">${icons.github}</a>
        </div>
        <p>${project.description}</p>
        ${
          project.googlePlayLink || project.fdroidLink
            ? `<div class="badges">
                ${
                  project.googlePlayLink
                    ? `<a href="${project.googlePlayLink}"><img src="/google-badge.png" alt="Get it on Google Play" /></a>`
                    : ''
                }
                ${
                  project.fdroidLink
                    ? `<a href="${project.fdroidLink}"><img src="/fdroid-badge.png" alt="Get it on F-Droid" /></a>`
                    : ''
                }
              </div>`
            : ''
        }
      </div>
    `
  )
  .join('');
