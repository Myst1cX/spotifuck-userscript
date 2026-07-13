// ==UserScript==
// @name         Outdated - Install Spotifuck Mobile
// @namespace    https://github.com/Myst1cX/spotifuck-userscript
// @version      7.1
// @description  Don't Install - This userscript has moved to Spotifuck Mobile.
// @author       Myst1cX (adapted from Spotifuck app)
// @match        *://open.spotify.com/*
// @match        https://www.spotify.com/*/account/*
// @match        https://www.spotify.com/*/premium/*
// @match        https://www.spotify.com/*/duo/*
// @match        https://www.spotify.com/*/student/*
// @match        https://www.spotify.com/*/family/*
// @match        https://payments.spotify.com/*
// @grant        none
// @run-at       document-start
// @homepageURL  https://github.com/Myst1cX/spotifuck-userscript
// @supportURL   https://github.com/Myst1cX/spotifuck-userscript/issues
// @updateURL    https://raw.githubusercontent.com/Myst1cX/spotifuck-userscript/main/spotifuck-v6.user.js
// @downloadURL  https://raw.githubusercontent.com/Myst1cX/spotifuck-userscript/main/spotifuck-v6.user.js
// ==/UserScript==

(() => {
    'use strict';

    const NEW_INSTALL =
        'https://raw.githubusercontent.com/Myst1cX/spotifuck-userscript/main/spotifuck-mobile.user.js';

    alert(
        'This userscript has moved to a new install link.\n\n' +
        'The installer for Spotifuck Mobile will now open.\n\n' +
        'After installing it, you can safely remove this outdated userscript.'
    );

    window.open(NEW_INSTALL, '_blank', 'noopener');
})();
