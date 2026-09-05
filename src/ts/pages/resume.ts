import '../main.js';
import { companies } from '../data/resume-data.js';

const container = document.querySelector<HTMLDivElement>('#experience')!;

container.innerHTML = companies
  .map(
    (company) => `
      <div class="company">
        <h2>${company.name}</h2>
        ${company.positions
          .map(
            (position) => `
              <div class="position">
                <div class="position-header">
                  <h3>${position.title}</h3>
                  <span class="timeline">${position.timeline}</span>
                </div>
                ${
                  position.points.length > 0
                    ? `<ul>${position.points.map((point) => `<li>${point}</li>`).join('')}</ul>`
                    : ''
                }
              </div>
            `
          )
          .join('')}
      </div>
    `
  )
  .join('');
