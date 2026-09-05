export interface Project {
  name: string;
  githubLink: string;
  description: string;
  logoPath?: string;
  googlePlayLink?: string;
  fdroidLink?: string;
}

export const projects: Project[] = [
  {
    name: 'HateItOrRateIt',
    githubLink: 'https://github.com/Grigoriym/HateItOrRateIt',
    description: 'Track products you love and loathe. Because you forget which coffee brand made you happy.',
    logoPath: '/hior_logo.png',
    googlePlayLink: 'https://play.google.com/store/apps/details?id=com.grappim.hateitorrateit',
    fdroidLink: 'https://f-droid.org/en/packages/com.grappim.hateitorrateit.fdroid/',
  },
  {
    name: 'Mukk',
    githubLink: 'https://github.com/Grigoriym/Mukk',
    description: 'Desktop music player built with Kotlin Multiplatform. Clean UI, actual functionality.',
    logoPath: '/mukk_logo.png',
  },
  {
    name: 'TaigaMobileNova',
    githubLink: 'https://github.com/Grigoriym/TaigaMobileNova',
    description: 'Revived fork of the discontinued Taiga mobile client. Project management without the desktop.',
    logoPath: '/taiga-mobile-logo.png',
    googlePlayLink: 'https://play.google.com/store/apps/details?id=com.grappim.taigamobile',
  },
];
