# CLAUDE.md

This file provides guidance to Claude Code (claude.ai/code) when working with code in this repository.

## Project Overview

This is a personal website project built with Kobweb, a Kotlin/Compose web framework. The site includes pages for resume, projects, about me, and blog sections.

## Build System & Commands

The project uses Gradle with Kotlin DSL and is structured as a multi-module Kotlin Multiplatform project.

### Development Commands
```bash
cd site
kobweb run
```
This starts the development server on http://localhost:8080 with live reload.

### Production Commands
```bash
cd site
kobweb export
kobweb run --env prod
kobweb run --env prod --notty  # For cloud deployment
```

### Gradle Commands
```bash
./gradlew build
./gradlew clean
```

## Architecture

### Module Structure
- **site/**: Main Kobweb application module containing pages and application entry point
- **core/**: Shared library containing routes, constants, and DI configuration
- **uikit/**: UI components library with reusable widgets and layouts

### Key Dependencies
- Kobweb 0.23.1 (web framework)
- Kotlin 2.2.10 with Compose Multiplatform
- Jetbrains Compose 1.8.2
- Silk (Kobweb's component library)
- Font Awesome icons

### Project Structure
```
site/src/jsMain/kotlin/
├── AppEntry.kt              # Main app entry point with theme management
├── pages/                   # Page components
│   ├── Index.kt            # Home page
│   ├── About.kt            # About me page
│   ├── Blog.kt             # Blog page
│   ├── projects/           # Project-related pages
│   └── resume/             # Resume-related pages
uikit/src/jsMain/kotlin/
├── components/
│   ├── layouts/PageLayout.kt # Main page layout wrapper
│   └── sections/           # Header/footer sections
└── widgets/                # Reusable UI components
core/src/jsMain/kotlin/
├── Routes.kt               # Route definitions
├── Constants.kt            # Application constants
└── di/                     # Dependency injection setup
```

### Theme System
The application supports dark/light theme switching with persistence in localStorage. Theme state is managed in AppEntry.kt with automatic save/restore functionality.

### Navigation
Routes are defined as sealed classes in `core/Routes.kt`. The main navigation structure includes:
- Home (/)
- Resume (/resume)
- About Me (/aboutme)
- Projects (/projects)
- Blog (/blog)

## Development Notes

- All Kotlin source files use `jsMain` target for browser compilation
- The project follows Compose for Web patterns with Kobweb extensions
- UI components in `uikit` are designed to be reusable across pages
- PageLayout component provides consistent structure with navigation header and footer
- Icons use Font Awesome integration through Silk

## Testing & Quality

The project structure suggests standard Kotlin testing approaches, though specific test commands should be verified in individual module build files if needed.