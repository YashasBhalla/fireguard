# Project decisions

- The seven provided ZIPs map to pages 1–7 in filename order, matching the master prompt's route table. Their HTML, screenshots and design notes are retained in `design-reference/`.
- Profile has no supplied screenshot, so it uses the shared Ember Sentinel visual system.
- Initial website delivery uses vanilla HTML, CSS and ES modules. The provided host did not have Node/npm or Maven available, so the frontend uses no package build step yet; the Java service can be started with Maven or Docker.
- Backend simulation starts with realistic nominal readings and can be triggered through `POST /api/dev/simulate-fire`. It is demo-only and does not control hardware.
- Public navigation has no Login/Get Started buttons; the demo credentials are shown on the Fleet Portal page. The dashboard uses deterministic simulated sensor drift and illustrative trend/risk estimates to make predictive tiles demonstrable.
- Product tiers, ratings and sample incidents are labeled as prototype/demo content; no commercial pricing or certifications are claimed.
