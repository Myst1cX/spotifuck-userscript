// ==UserScript==
// @name         Spotifuck - Classic Login Button
// @namespace    https://github.com/Myst1cX/spotifuck-userscript
// @version      1.0
// @description  Adds an "Email + Password Classic Login" link to Spotify's login page, next to the "Continue with Google" button, restoring the old email/password login form Spotify normally hides behind a query param.
// @author       Myst1cX (adapted from Spotifuck app)
// @match        *://accounts.spotify.com/*
// @run-at       document-end
// @grant        none
// @homepageURL  https://github.com/Myst1cX/spotifuck-userscript
// @supportURL   https://github.com/Myst1cX/spotifuck-userscript/issues
// @updateURL    https://raw.githubusercontent.com/Myst1cX/spotifuck-userscript/main/spotifuck-classic-login.user.js
// @downloadURL  https://raw.githubusercontent.com/Myst1cX/spotifuck-userscript/main/spotifuck-classic-login.user.js
// ==/UserScript==

/*
 * What this does and how:
 *
 * Spotify's login supports an old-style email+password form, reachable by
 * appending ?allow_password=1 to the login URL - but there's no visible
 * link to it anywhere in the normal UI, only the social/SSO login buttons
 * (Google, Facebook, Apple, phone number). This script adds that missing
 * link back in as a plain <a href="?allow_password=1"> next to the existing
 * "Continue with Google" button.
 *
 * Scope: @match is limited to accounts.spotify.com, since login happens on
 * this domain via a real page navigation. Because of that, a successful
 * login (which navigates away to open.spotify.com) tears down this
 * script's entire JS context for free - there's no scenario where it
 * keeps running into a later browser session, so no extra stop-condition
 * is needed.
 *
 * Retry mechanism: tryInject() runs once immediately; if the anchor isn't
 * in the DOM yet (React SPA - the page can finish its network load well
 * before the app finishes its client-side mount), a MutationObserver
 * watches document.body and retries on every mutation.
 *
 * Self-healing: the observer never disconnects. Spotify's authn-web
 * bundle throws React hydration-mismatch errors immediately after this
 * node is inserted as a sibling inside the React-managed subtree, and
 * React's recovery from that discards the whole mismatched subtree and
 * rebuilds it client-side - silently destroying the inserted link along
 * with everything else in that subtree, sometimes above the specific
 * parent it was inserted next to. Leaving the observer running re-adds
 * the link (idempotently, via the #spf-classic-login existence check)
 * whenever this happens, regardless of what wiped it out or where.
 *
 * Idempotency: window.__classicLoginInjected plus a #spf-classic-login id
 * check are both used as guards against double-injection, matching the
 * same defensive pattern used elsewhere in the companion spotifuck-mobile
 * script (__mediaBridgeInjected, __connect_state_proxy_applied, etc.).
 *
 * Anchor point history (why the selector below looks the way it does):
 *   - original: section>div>div>div>div>a:first-child:not(.fuckd)
 *     Styled-component/ordering-fragile, but positioned the link *after*
 *     the "or" divider, immediately before "Continue with Google".
 *   - revision 1: document.querySelector('form') (the email-login form
 *     itself). Fixed inconsistent injection by switching from a one-shot
 *     query to a MutationObserver retry, but moved the link's position to
 *     right after the form, *before* the "or" divider - not what we want.
 *   - current: a[href*="login/google"] - Spotify's "Continue with Google"
 *     OAuth link, matched by the locale-independent "login/google" path
 *     slug in its href (a URL path segment, never translated, unlike
 *     visible text/aria-label). Restores the original position via a
 *     selector that isn't tied to sibling ordering or styled-component
 *     hash classes.
 *   If this selector ever stops matching (Spotify changes the OAuth
 *   link's href shape), first try reverting to the original :first-child
 *   selector above before searching the DOM for a new one.
 */

(function () {
    'use strict';

    if (window.__classicLoginInjected) return;

    function tryInject() {
        if (document.getElementById('spf-classic-login')) return true;

        const anchor = document.querySelector('a[href*="login/google"]');
        if (!anchor) return false;

        const link = document.createElement('a');
        link.id = 'spf-classic-login';
        link.className = 'fuckd';
        link.innerText = 'Email + Password Classic Login';
        link.style.cssText =
            'display:block;padding:10px;margin:10px 0;color:white;font-weight:bold;' +
            'text-decoration:none;border:1px solid #ddd;background:#339;border-radius:30px';
        link.href = '?allow_password=1';

        anchor.parentNode.insertBefore(link, anchor);
        window.__classicLoginInjected = true;
        return true;
    }

    tryInject();

    const obs = new MutationObserver(function () {
        tryInject();
    });
    obs.observe(document.body, { childList: true, subtree: true });
})();
