# Pizza Palace 🍕 — Code & Crust

[![Website](https://img.shields.io/badge/Static%20Site-HTML/CSS-blue?logo=html5&logoColor=white)](https://github.com/Akshaygohrava/Pizza-Palace)
[![Bootstrap](https://img.shields.io/badge/Framework-Bootstrap-563d7c?logo=bootstrap&logoColor=white)](https://getbootstrap.com/)
[![License](https://img.shields.io/badge/License-Add%20License-lightgrey)](https://github.com/Akshaygohrava/Pizza-Palace)

A modern, responsive restaurant website template for "Pizza Palace" — built with clean HTML, CSS (custom + responsive), and Bootstrap. Perfect as a static portfolio site, demo storefront, or starter template for a pizza / restaurant front-end.

Demo
- Open the project locally by launching `index.html` in your browser.
- Or serve with a simple static server:
  - Python 3: `python -m http.server 8000` (then visit `http://localhost:8000`)
  - Node (http-server): `npx http-server .`
 
  - ## 🚀 [Live Preview](https://akshayg-pizza-palace.netlify.app//)

Key Features
- Sleek, responsive homepage with hero, locations, opening hours, and contact CTA.
- Dedicated pages: Menu, About, Contact.
- Simple login UI pages (sign-in and sign-up templates) under `Login/`.
- Mobile-first layout built with Bootstrap 5 and custom stylesheets.
- Iconography using FontAwesome and Bootstrap Icons.
- Clean footer, social links, and placeholders for phone & ordering info.

Screenshots
- (Replace these with actual screenshots inside an `assets/screenshots/` folder)
  - Home / Hero
  - Menu page
  - Login / Sign-up page
  - Contact page

Tech Stack
- HTML5
- CSS3 (custom stylesheet + responsive)
- Bootstrap 5
- Font Awesome & Bootstrap Icons
- No backend (static templates) — ready to integrate with your preferred backend or static site host.

Repository Structure (high level)
- index.html — Home / landing page
- about.html — About page
- menu.html — Menu / offerings
- contact.html — Contact page
- Login/
  - sign-in.html
  - sign-up.html
- Stylesheets/
  - style.css
  - responsive.css
- assets/ (images, icons, fonts) — (placeholders; add your own)

Getting Started (Local)
1. Clone the repo:
   git clone https://github.com/Akshaygohrava/Pizza-Palace.git
2. Navigate into the directory:
   cd Pizza-Palace
3. Open `index.html` in your browser or use a simple static server:
   - Python: `python -m http.server 8000`
   - Node: `npx http-server .`
4. Edit content: change phone number, locations, menu items, images in the HTML files and `Stylesheets/`.

Customization Tips
- Replace placeholder images with your store photography in `assets/images/` (create the folder if missing).
- Update branding: change site title, colors in `Stylesheets/style.css`, and favicon.
- If you need dynamic functionality (orders, login, DB), integrate with a backend (Node/Express, Flask, Firebase, etc.) and convert static forms to POST/JS fetch calls.
- For production hosting: deploy to GitHub Pages, Netlify, Vercel, or any static host.

Accessibility & Performance Suggestions
- Add alt attributes for all images.
- Optimize images (WebP or compressed JPEG/PNG).
- Add meta tags for social sharing (Open Graph / Twitter Cards).
- Consider lazy-loading images for performance.

Contributing
- PRs, improvements, or new page templates are welcome.
- Suggestions:
  - Add real images, more menu categories, or interactive ordering UI.
  - Integrate a contact form backend or form handling service (Formspree, Netlify Forms).
- Please open issues for feature requests or bug reports.

Known / Recommended Next Steps
- Add a LICENSE file (e.g., MIT) to make reuse/redistribution explicit.
- Add screenshots or a live demo link in this README.
- If you want authentication/order handling, add a backend or integrate with third-party services.

Author
- Made by Akshay Gohrava — https://github.com/Akshaygohrava
- Copyright © 2026 Pizza Palace

Credits & Assets
- Bootstrap — https://getbootstrap.com
- Font Awesome — https://fontawesome.com
- Bootstrap Icons — https://icons.getbootstrap.com

License
- No license specified. If you'd like this project to be open-source, consider adding an MIT or other license.

---

If you want, I can:
- Add this README.md to the repository for you,
- Create a GitHub Pages config and sample screenshots,
- Or convert the static login templates into a working demo with a simple backend (Node/Express or Firebase).
Tell me which you'd like next.
