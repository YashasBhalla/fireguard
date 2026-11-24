---
name: Ember Sentinel
colors:
  surface: '#131318'
  surface-dim: '#131318'
  surface-bright: '#39393e'
  surface-container-lowest: '#0e0e13'
  surface-container-low: '#1b1b20'
  surface-container: '#1f1f24'
  surface-container-high: '#2a292f'
  surface-container-highest: '#35343a'
  on-surface: '#e4e1e8'
  on-surface-variant: '#e2bfb3'
  inverse-surface: '#e4e1e8'
  inverse-on-surface: '#303035'
  outline: '#a98a7f'
  outline-variant: '#594139'
  surface-tint: '#ffb59a'
  primary: '#ffb59a'
  on-primary: '#5b1b00'
  primary-container: '#ff6b2c'
  on-primary-container: '#5c1c00'
  inverse-primary: '#a83900'
  secondary: '#ffbd58'
  on-secondary: '#442b00'
  secondary-container: '#ea9f00'
  on-secondary-container: '#5b3b00'
  tertiary: '#4ae176'
  on-tertiary: '#003915'
  tertiary-container: '#00b150'
  on-tertiary-container: '#003a16'
  error: '#ffb4ab'
  on-error: '#690005'
  error-container: '#93000a'
  on-error-container: '#ffdad6'
  primary-fixed: '#ffdbcf'
  primary-fixed-dim: '#ffb59a'
  on-primary-fixed: '#380d00'
  on-primary-fixed-variant: '#802900'
  secondary-fixed: '#ffddb1'
  secondary-fixed-dim: '#ffba4b'
  on-secondary-fixed: '#291800'
  on-secondary-fixed-variant: '#624000'
  tertiary-fixed: '#6bff8f'
  tertiary-fixed-dim: '#4ae176'
  on-tertiary-fixed: '#002109'
  on-tertiary-fixed-variant: '#005321'
  background: '#131318'
  on-background: '#e4e1e8'
  surface-variant: '#35343a'
typography:
  headline-xl:
    fontFamily: Outfit
    fontSize: 40px
    fontWeight: '600'
    lineHeight: 48px
    letterSpacing: -0.02em
  headline-xl-mobile:
    fontFamily: Outfit
    fontSize: 30px
    fontWeight: '600'
    lineHeight: 36px
    letterSpacing: -0.01em
  headline-lg:
    fontFamily: Outfit
    fontSize: 32px
    fontWeight: '600'
    lineHeight: 40px
    letterSpacing: -0.015em
  headline-lg-mobile:
    fontFamily: Outfit
    fontSize: 24px
    fontWeight: '600'
    lineHeight: 32px
    letterSpacing: -0.01em
  headline-md:
    fontFamily: Outfit
    fontSize: 24px
    fontWeight: '600'
    lineHeight: 32px
  headline-sm:
    fontFamily: Outfit
    fontSize: 20px
    fontWeight: '500'
    lineHeight: 28px
  title-md:
    fontFamily: Outfit
    fontSize: 16px
    fontWeight: '600'
    lineHeight: 24px
  body-lg:
    fontFamily: Inter
    fontSize: 16px
    fontWeight: '400'
    lineHeight: 24px
  body-md:
    fontFamily: Inter
    fontSize: 14px
    fontWeight: '400'
    lineHeight: 20px
  body-sm:
    fontFamily: Inter
    fontSize: 12px
    fontWeight: '400'
    lineHeight: 16px
  label-md:
    fontFamily: Inter
    fontSize: 12px
    fontWeight: '600'
    lineHeight: 16px
    letterSpacing: 0.04em
  label-sm:
    fontFamily: Inter
    fontSize: 10px
    fontWeight: '600'
    lineHeight: 14px
    letterSpacing: 0.06em
rounded:
  sm: 0.25rem
  DEFAULT: 0.5rem
  md: 0.75rem
  lg: 1rem
  xl: 1.5rem
  full: 9999px
spacing:
  gutter: 1.5rem
  gutter-mobile: 0.75rem
  margin: 2rem
  margin-mobile: 1rem
  space-xs: 0.25rem
  space-sm: 0.5rem
  space-md: 1rem
  space-lg: 1.5rem
  space-xl: 2rem
---

## Brand & Style

This design system establishes an authoritative, mission-critical interface for autonomous industrial safety robotics and IoT hazard telemetry. It merges high-trust aerospace instrumentation with contemporary hardware telemetry interfaces.

### Core Philosophy & Audience
Targeted at facility directors, safety engineers, and emergency response coordinators, the aesthetic prioritizes situational awareness, cognitive clarity under duress, and absolute precision. The visual tone balances industrial ruggedness with clean, next-generation automation.

### Design Movement
**Tactile Dark Glass & Technical Instrumentalism.** The aesthetic utilizes deep, low-luminance slate backdrops layered with translucent surfaces, precision 1px structural strokes (`border-white/10`), and controlled spectral luminous glows. The result is a high-contrast command cockpit that suppresses non-essential noise while elevating live anomalies instantly.

## Colors

The palette is engineered for rapid status identification in low-light command center environments. Functional color is deployed strictly for telemetry feedback and focal interactions to preserve high optical contrast.

### Palette Architecture
- **Canvas Base (`#1A1A1F`):** Deep charcoal substrate absorbing background visual vibration.
- **Surface Level 1 (`#24242B`):** Structural panels, telemetry docks, and standard cards.
- **Surface Level 2 / High (`#2E2E37`):** Elevated overlays, popovers, active robot status modules, and hovered containers.
- **Primary Accent (`#FF6B2C` - Ember Orange):** Primary commands, urgent interactions, and live autonomous activity markers.
- **Secondary Accent (`#FFB020` - Warm Amber):** Secondary system states, telemetry metrics, and charging indicators.
- **Safe Green (`#22C55E`):** Nominal telemetry, secured zones, operational link active.
- **Warning Amber (`#F59E0B`):** Environmental threshold warnings, low tank pressure, obstructed routes.
- **Danger Red (`#EF4444`):** Active thermal spikes, critical alarms, override alerts, emergency stop states.

### Contrast & Technical Strokes
All container edges employ a crisp, calibrated line treatment using `rgba(255, 255, 255, 0.10)` to maintain hard-edge boundary definitions against deep dark surfaces without producing visual glare.

## Typography

The type system blends geometric structural headers with high-legibility tabular body copy.

- **Display & Headings (Outfit):** Delivers clean, geometric proportions reminiscent of industrial instrumentation displays. Headings maintain tight letter-spacing to present a confident, unified footprint.
- **Body, UI & Telemetry (Inter):** Serves all interface operations, metric displays, and data listings. Numerical telemetry figures must utilize tabular lining figures (`font-feature-settings: 'tnum' on, 'cv05' on`) to ensure real-time continuous sensor readouts do not cause layout jitter.
- **Labels & Overline Identifiers:** Styled strictly in medium or semibold weights with slight tracking expansion (`0.04em` to `0.06em`) for unit annotations (e.g., `PPM`, `°C`, `BAR`, `PSI`).

## Layout & Spacing

The layout follows a responsive 12-column telemetry dashboard grid that adapts across operational form factors.

### Grid & Enclosures
- **Desktop (1280px+):** 12-column layout, fixed 32px (`2rem`) outer margin, 24px (`1.5rem`) gutter. Multi-column robot telemetry streams with fixed telemetry sidebars.
- **Tablet (768px - 1279px):** 8-column layout, 24px outer margin, 16px gutter. Sensor charts and unit maps collapse into stacked visual modules.
- **Mobile Handheld (320px - 767px):** 4-column layout, 16px (`1rem`) outer margin, 12px (`0.75rem`) gutter. Cards span full width; rapid-response triage buttons snap into pinned bottom sheets.

### Rhythmic Density
Internal component padding relies strictly on compact, predictable intervals (`space-xs` through `space-xl`). Sensor status groupings employ `space-sm` (8px) internal gaps, while primary dashboard widgets use `space-lg` (24px) internal clearance to preserve structural separation during rapid scanning.

## Elevation & Depth

Visual hierarchy uses physical-tier dark architecture accented with radiant edge glows rather than traditional black drop shadows.

### Surface Tiers
- **Base Substrate (`#1A1A1F`):** Canvas ground plane for overall workspace layout.
- **Surface Level 1 (`#24242B`):** Standard telemetry panels, robot detail sections, and static logs. Outlined with `border: 1px solid rgba(255, 255, 255, 0.10)`.
- **Surface Level 2 (`#2E2E37`):** Elevated overlays, flyouts, contextual dropdowns, and interactive card hover states.

### Glowing Depth & Volumetrics
- **Subtle Ambient Depth:** `0 8px 24px -4px rgba(0, 0, 0, 0.5)`.
- **Ember Primary Glow (Active / Danger State):** `0 0 20px -2px rgba(255, 107, 44, 0.35)`. Applied to active navigation indicators, active emergency triggers, and engaged autonomous units.
- **Thermal Alert Glow:** `0 0 24px 0 rgba(239, 68, 68, 0.40)`. Deployed strictly for hazard zones and high-heat emergency states.
- **Nominal Operational Glow:** `0 0 16px -2px rgba(34, 197, 94, 0.25)`. Deployed on live connection beacons and all-clear health indicators.

## Shapes

The interface embraces modern ergonomic industrial design:
- **Default Container Radius:** `16px` (`rounded-2xl` equivalent) applied universally across cards, charts, camera feeds, and modal dialogs.
- **Interactive Micro-Surfaces:** Inputs, buttons, segmented controls, and badges scale between `8px` and `12px` to preserve ergonomic tactility while avoiding pill-shaped visual softness that would diminish the technical tone.
- **Structural Framing:** Crisp, razor-thin outlines (`1px solid rgba(255, 255, 255, 0.10)`) frame every curved envelope, accentuating surface curvature through subtle specular separation.

## Components

### Buttons & Operational Actions
- **Primary / Action:** Background `#FF6B2C`, text `#FFFFFF`, font weight 600. Includes subtle hover luminescence (`box-shadow: 0 0 16px rgba(255, 107, 44, 0.4)`). Active state depresses 1px visually.
- **Secondary / Tactical:** Background `#2E2E37`, text `#FFFFFF`, border `1px solid rgba(255, 255, 255, 0.10)`. Hover shifts background to `#383844`.
- **Destructive / E-Stop:** Solid `#EF4444` background with ambient pulsing glow (`0 0 20px rgba(239, 68, 68, 0.4)`), uppercase tracked typography, tactile active compression.

### Cards & Telemetry Containers
- Built on `#24242B` with a `16px` border radius and `1px solid rgba(255, 255, 255, 0.10)`.
- Card headers feature an integrated status indicator (e.g., green dot with ping ring or amber warning chevron) aligned with uppercase `label-md` unit tags.

### Status Chips & Sensor Badges
- Pill-compact or 8px rounded badges with 10% opacity backgrounds tinted to match the semantic state (e.g., `rgba(34, 197, 94, 0.10)` for nominal, `rgba(255, 107, 44, 0.12)` for autonomous deployment).
- Paired with 1.5px stroke vector glyphs and tabular numerical text.

### Form Inputs & Control Toggles
- **Inputs:** Dark recessed base (`#1A1A1F`), `1px solid rgba(255, 255, 255, 0.10)`, text `#FFFFFF`, placeholder `rgba(255, 255, 255, 0.4)`. Focus switches border to `#FF6B2C` accompanied by a soft `0 0 0 2px rgba(255, 107, 44, 0.20)` focus ring.
- **Checkboxes & Radios:** High-contrast squares/circles with 2px borders. Selected states fill with `#FF6B2C` and display sharp white indicators.

### Line Icons & Data Visualization
- **Iconography:** Monoline 1.5px stroke weight, 20x20px or 24x24px grid-aligned technical icons (radar, flame, battery, thermal array, route waypoint).
- **Live Telemetry Streams:** Minimalist sparklines and gauge meters featuring dynamic ember and safe-green gradient strokes with low-opacity vertical fill dropouts.