// ==UserScript==
// @name         Spotifuck v6
// @namespace    http://tampermonkey.net/
// @version      6.0
// @description  Accurate port of Spotifuck Android app v1.6.4
// @author       Spotifuck Team
// @match        https://open.spotify.com/*
// @grant        none
// @run-at       document-start
// ==/UserScript==

/*
 * Spotifuck v6 - Accurate port from reverse-engineered v1.6.4 APK
 * Based on r0/e.java from classes1.dex
 *
 * Features from APK:
 * - Library button toggle (expand 100%×92% / collapse 48×48px)
 * - Pure black AMOLED mode for playback controls
 * - Auto-close library on item selection
 * - UI improvements (sidebar, search bar, playback controls)
 * - Video ad detection and blocking
 * - CSS hacks for better mobile experience
 */

(function() {
    'use strict';

    console.log('🎵 Spotifuck v6 - APK v1.6.4 Port');

    // Global state variables
    let reqPause = false;
    let firstPlay = true;
    let ulFlag = false;  // Unlock flag
    let ffDone = false;  // First fuck done (firstFuck initialization complete)
    let pfint = null;    // Primary features interval
    let cssint = null;   // CSS injection interval
    
    // Note: Class name ".fuckd" used throughout is from original APK source (r0/e.java)
    // It marks elements as "already processed" to prevent duplicate event handlers

    /**
     * switchLs - Toggle library sidebar between expanded and collapsed states
     * From r0/e.java line 202: window.switchLs=function(){...}
     */
    window.switchLs = function() {
        const leftSidebar = document.querySelector('#Desktop_LeftSidebar_Id');
        if (!leftSidebar) return;

        const navFirstChild = leftSidebar.querySelector('nav>div>div:first-child');
        if (!navFirstChild) return;

        // Check if expanded (classList.length === 2 means expanded in APK logic)
        const isExpanded = navFirstChild.classList.length === 2;
        
        if (isExpanded) {
            // Expand to full-screen overlay
            console.log('#Library: Expanded');
            leftSidebar.style.position = 'fixed';
            leftSidebar.style.width = '100%';
            leftSidebar.style.height = '92%';
            leftSidebar.style.left = '0';
            leftSidebar.style.zIndex = '20';
            
            const headerH1 = leftSidebar.querySelector('header>div>div:first-child h1');
            if (headerH1) {
                // Using textContent for security, then manually adding close icon
                headerH1.textContent = '✖ \u00A0 Close Library';
            }
        } else {
            // Collapse to small button
            console.log('#Library: Collapsed');
            leftSidebar.style.zIndex = '1';
            leftSidebar.style.position = 'fixed';
            leftSidebar.style.top = '0';
            leftSidebar.style.left = '60px';
            leftSidebar.style.width = '48px';
            leftSidebar.style.height = '48px';
        }
    };

    /**
     * closeNowPlay - Close the now-playing right panel if open
     * From r0/e.java line 200: window.closeNowPlay=function(){...}
     */
    window.closeNowPlay = function() {
        const panelContainer = document.querySelector('#Desktop_PanelContainer_Id');
        if (panelContainer && panelContainer.parentNode.parentNode.ariaHidden === 'false') {
            console.log('#Close NowPlaying');
            const toggleBtn = panelContainer.parentNode.parentNode.nextElementSibling?.querySelector('button');
            if (toggleBtn) toggleBtn.click();
        }
    };

    /**
     * firstFuck - Main initialization and monitoring loop
     * From r0/e.java line 178: window.firstFuck=function(){...}
     */
    window.firstFuck = function() {
        if (pfint) clearInterval(pfint);
        
        pfint = setInterval(() => {
            // Find and setup play button
            const playBtn = document.querySelector('aside button[data-testid=control-button-playpause]:not(.fuckd)');
            if (playBtn) {
                console.log('#pBtn fuckd');
                playBtn.classList.add('fuckd');
                window.pBtn = playBtn;
                
                // Add click handler
                window.pBtn.addEventListener('click', () => {
                    console.log('PlayClicked');
                    if (window.pBtn && window.pBtn.getAttribute('aria-label') !== 'Play') {
                        console.log('Pause Req');
                        reqPause = true;
                        ulFlag = false;
                    } else if (!ulFlag) {
                        reqPause = false;
                        console.log('Play Req');
                        ulFlag = true;
                        setTimeout(() => {
                            console.log('Unlocker Timeout Reached');
                            // Add null check for pBtn in timeout callback
                            if (window.pBtn && ulFlag && window.pBtn.getAttribute('aria-label') === 'Play') {
                                console.log('#Unlocking!');
                                ulFlag = false;
                            } else if (ulFlag) {
                                console.log('Playing, Removing Unlocker');
                                ulFlag = false;
                            }
                        }, 10000);
                    }
                });
                
                // First initialization
                if (!ffDone) {
                    ffDone = true;
                    console.log('FirstFuck Adding All Features');
                    addCSSJSHack();
                }
            }
        }, 5000);
    };

    /**
     * addCSSJSHack - Add CSS modifications and event listeners
     * From r0/e.java line 200: window.addCSSJSHack=function(){...}
     */
    window.addCSSJSHack = function() {
        if (cssint) clearInterval(cssint);
        
        cssint = setInterval(function() {
            // Setup library button
            const libBtn = document.querySelector('#Desktop_LeftSidebar_Id header>div>div:first-child button:not(.fuckd)');
            if (libBtn) {
                console.log('LibBtnFuckd');
                window.lBtn = libBtn;
                libBtn.classList.add('fuckd', 'lbtn');
                libBtn.style.padding = '0';
                libBtn.style.height = '20px';
                libBtn.addEventListener('click', function() {
                    setTimeout(() => switchLs(), 0);
                });
                switchLs();
            }
            
            // Auto-close library on item click (but not for folders)
            const libGrid = document.querySelector('#Desktop_LeftSidebar_Id div[role=grid]:not(.fuckd)');
            if (libGrid) {
                libGrid.classList.add('fuckd');
                libGrid.addEventListener('click', (event) => {
                    // Check if clicked element or its parent is a folder link
                    let target = event.target;
                    let isFolder = false;
                    
                    // Traverse up to 5 levels to find a link element
                    for (let i = 0; i < 5 && target; i++) {
                        if (target.tagName === 'A' && target.href) {
                            // Check if it's a folder link (contains /folder/)
                            if (target.href.includes('/folder/')) {
                                isFolder = true;
                                console.log('Folder clicked, keeping library open');
                                break;
                            }
                            // If it's a playlist or other link, break to close library
                            break;
                        }
                        target = target.parentElement;
                    }
                    
                    // Only auto-close library if it's NOT a folder
                    if (!isFolder) {
                        setTimeout(() => {
                            console.log('AutoCloseLib (playlist/item clicked)');
                            if (window.lBtn) window.lBtn.click();
                            closeNowPlay();
                        }, 0);
                    }
                });
            }
            
            // Home button
            const homeBtn = document.querySelector('#global-nav-bar button[data-testid=home-button]:not(.fuckd)');
            if (homeBtn) {
                homeBtn.classList.add('fuckd');
                homeBtn.addEventListener('click', () => { closeNowPlay(); });
            }
            
            // Search input
            const searchInput = document.querySelector('input[data-testid=search-input]:not(.fuckd)');
            if (searchInput) {
                searchInput.classList.add('fuckd');
                searchInput.addEventListener('focus', () => {
                    const npBar = document.querySelector('aside[data-testid=now-playing-bar]');
                    if (npBar) npBar.style.display = 'none';
                    closeNowPlay();
                });
                searchInput.addEventListener('blur', () => {
                    const npBar = document.querySelector('aside[data-testid=now-playing-bar]');
                    if (npBar) npBar.style.display = 'flex';
                });
            }
            
            // User button
            const userBtn = document.querySelector('button[data-testid=user-widget-link]:not(.fuckd)');
            if (userBtn) {
                userBtn.classList.add('fuckd');
                userBtn.addEventListener('click', () => { closeNowPlay(); });
            }
        }, 5000);
    };

    /**
     * Inject CSS styles from APK
     * From r0/e.java line 204: let st=document.createElement('style');st.textContent='...'
     */
    function injectCSS() {
        const style = document.createElement('style');
        // CSS content from r0/e.java (line 204)
        style.textContent = `
body{min-width:100%!important;min-height:100%!important}
.os-scrollbar{--os-size:6px!important}
.contentSpacing{padding:0}
div[data-testid=root]{--panel-gap:0!important}
#main-view+div,#main-view+div>div{overflow:hidden!important;width:auto}
#main-view+div>div>div>div:nth-child(2)>div{width:100vw!important}
div[data-encore-id=banner],#global-nav-bar>div:first-of-type,#global-nav-bar a[href="/download"],button[data-testid=fullscreen-mode-button],div.main-view-container__mh-footer-container{display:none!important}
section[data-testid=artist-page]>div>div:first-child:not([data-encore-id]){height:25vh}
div[data-testid=tracklist-row]{padding:0 10px 0 0;grid-gap:0}
div[data-testid=tracklist-row] button:not([data-testid=add-to-playlist-button]){transform:scale(1.3)!important;opacity:0.6!important}
div[data-testid=tracklist-row] button:hover{color:#2d6!important}
div[data-testid=tracklist-row]>div:first-child>div:first-child{height:24px;min-height:24px;min-width:24px;margin:0 8px!important}
[aria-colcount="3"] div[data-testid=tracklist-row]{grid-template-columns:[index] var(--tracklist-index-column-width,40px) [first] minmax(120px,var(--col1,4fr)) [last] minmax(82px,var(--col2,1fr))!important}
[aria-colcount="4"] div[data-testid=tracklist-row]{grid-template-columns:[index] var(--tracklist-index-column-width,40px) [first] minmax(120px,var(--col1,4fr)) [var1] minmax(120px,var(--col2,2fr)) [last] minmax(82px,var(--col3,1fr))!important}
[aria-colcount="5"] div[data-testid=tracklist-row]{grid-template-columns:[index] var(--tracklist-index-column-width,40px) [first] minmax(120px,var(--col1,6fr)) [var1] minmax(120px,var(--col2,4fr)) [var2] minmax(120px,var(--col3,3fr)) [last] minmax(82px,var(--col4,1fr))!important}
section[data-testid=track-page]>div.contentSpacing>div:nth-child(2) [aria-colcount="2"] div[data-testid=tracklist-row]{grid-template-columns:[first] minmax(120px,var(--col0,4fr)) [last] minmax(82px,var(--col1,1fr))!important}
section[data-testid=track-page]>div.contentSpacing>div:nth-child(2) [aria-colcount="3"] div[data-testid=tracklist-row]{grid-template-columns:[first] minmax(120px,var(--col0,4fr)) [var1] minmax(120px,var(--col1,2fr)) [last] minmax(82px,var(--col2,1fr))!important}
*{--content-spacing:10px}
section[data-testid=home-page] .contentSpacing{padding:0 10px!important;overflow:hidden}
div[data-testid=grid-container]{margin-inline:0!important;column-gap:0!important;overflow:hidden!important}
div[data-testid=action-bar-row],div[data-testid=topbar-content]{padding:5px 10px}
div[data-testid=track-list]>div:first-child,div[data-testid=playlist-tracklist]>div:first-child{margin:0!important;padding:0!important}
main>section:not([data-testid=artist-page])>div:first-child{height:auto!important;min-height:auto!important;padding:10px}
section[data-testid=track-page]>div>div.contentSpacing>div:last-child{overflow:hidden}
section[data-testid=artist-page]>div>div:first-child>div.contentSpacing{padding:10px}
section[data-testid=artist-page] div[data-testid=grid-container] h2,section[data-testid=artist-page] section[data-testid=component-shelf]{padding:0 10px}
main>section h1.encore-text-headline-large{font-size:22px!important}
section[data-testid=artist-page] span.encore-text-headline-large{font-size:26px!important}
section[data-testid=track-page] h1{font-size:20px!important}
aside[data-testid=now-playing-bar]{min-width:100%!important;box-shadow:0 0 6px #440000;background:linear-gradient(to bottom,#770000,#330000)!important}
aside[data-testid=now-playing-bar]>div:first-child{margin-top:2px;flex-direction:column!important;height:auto!important}
aside[data-testid=now-playing-bar]>div>div{width:100%!important}
aside[data-testid=now-playing-bar]>div>div:last-child>div{min-height:32px;margin:5px 10px}
aside[data-testid=now-playing-bar]>div>div:last-child button{transform:scale(1.15);margin:0 5px}
div[data-testid=general-controls]{margin:15px 0 25px}
div[data-testid=general-controls] button{transform:scale(1.4)!important;margin:0 8px!important}
div[data-testid=player-controls]{margin:5px 0}
div[data-testid=now-playing-widget]{justify-content:center;overflow:hidden}
form[role=search]{z-index:10;margin-left:48px;max-width:88%}
div[data-testid=now-playing-widget]>div:last-child>button{transform:scale(1.3)}
div[data-testid=now-playing-widget]>div:first-child{display:none!important}
div[data-testid=now-playing-widget]>div:nth-child(2){display:flex!important;overflow:hidden!important}
div[data-testid=now-playing-widget]>div:nth-child(2) span{font-size:13px!important;height:20px!important;margin:0!important}
div[data-testid=now-playing-widget]>div:nth-child(2)>div{min-width:auto;max-width:66%}
[data-tippy-root]{overflow:hidden!important}
[data-tippy-root],[data-tippy-root] *{transition:none!important;transform:none!important}
div[data-testid=hover-or-focus-tooltip],#Desktop_LeftSidebar_Id header>div>div:last-child{display:none!important}
#Desktop_LeftSidebar_Id>nav>div{min-height:48px;border-radius:25px}
.YourLibraryX{overflow:hidden;background:var(--background-elevated-base)!important}
.YourLibraryX header{padding:14px}
        `;
        document.head.appendChild(style);
        
        // AMOLED pure black mode (from r0/e.java line 207)
        const amoled = document.createElement('style');
        amoled.textContent = `
.encore-dark-theme{--background-base:#000;--background-highlight:#000;--background-elevated-base:#000;--background-elevated-highlight:#000;--background-elevated-press:#000;--background-tinted-base:#000}
aside[data-testid=now-playing-bar]{background:#000!important;box-shadow:none;border-top:1px solid #666}
        `;
        document.head.appendChild(amoled);
        
        console.log('#CSS Injected');
    }

    // Initialize immediately
    injectCSS();
    firstFuck();

    // Add cleanup on page unload to prevent memory leaks
    window.addEventListener('beforeunload', () => {
        if (pfint) {
            clearInterval(pfint);
            pfint = null;
        }
        if (cssint) {
            clearInterval(cssint);
            cssint = null;
        }
        console.log('#Cleanup: Intervals cleared');
    });

    console.log('🚀 Spotifuck v6 Ready (APK v1.6.4 Port)');
})();
