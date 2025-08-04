// ==UserScript==
// @name         Spotifuck Userscript v4
// @namespace    https://github.com/yourname/spotifuck-userscript
// @version      4.2.0
// @description  Full Spotifuck 1.4.1 UI hack + playback control + client spoof + silent ad blocking port on open.spotify.com
// @author       Myst1cX (adapted from Spotifuck app)
// @match        https://open.spotify.com/*
// @grant        GM_addStyle
// @grant        GM_getValue
// @grant        GM_setValue
// @run-at       document-start
// @homepageURL  https://github.com/Myst1cX/spotifuck-userscript
// @supportURL   https://github.com/Myst1cX/spotifuck-userscript/issues
// @updateURL    https://raw.githubusercontent.com/Myst1cX/spotifuck-userscript/main/spotifuck-v4.user.js
// @downloadURL  https://raw.githubusercontent.com/Myst1cX/spotifuck-userscript/main/spotifuck-v4.user.js
// 
// Configuration options matching AppSingleton.java variables:
// @config       l {select:"disabled":disabled,"csshack":"csshack","widewindow":"widewindow","mobile+js csshack":"mobile+js csshack"} GuiMode - GUI display mode 
// @config       k {select:"disabled":"disabled","onetime":"onetime","permanent":"permanent"} APlayMode - Auto-play mode
// @config       m {boolean:true} ServiceOn - Enable service functionality
// @config       n {boolean:false} LoggedIn - User logged in status  
// @config       o {boolean:true} TakeControl - Take control of playback device
// @config       p {boolean:false} CloseNowPlay - Auto-close Now Playing view
// @config       q {boolean:true} AndAuto - Enable Android auto features
// @config       r {boolean:true} SwipeStop - Enable swipe to stop
// @config       s {boolean:false} ForceEn - Force English language
// @config       t {number:0} AutoSleep - Auto sleep timer (minutes)
// ==/UserScript==

(function() {
    'use strict';

    // --- AppSingleton.java variable equivalents with defaults ---
    const AppSingleton = {
        l: GM_getValue('l', 'csshack'),           // GuiMode: "disabled", "csshack", "widewindow", "mobile+js csshack"
        k: GM_getValue('k', 'disabled'),          // APlayMode: "disabled", "onetime", "permanent"  
        m: GM_getValue('m', true),                // ServiceOn: boolean
        n: GM_getValue('n', false),               // LoggedIn: boolean
        o: GM_getValue('o', true),                // TakeControl: boolean
        p: GM_getValue('p', false),               // CloseNowPlay: boolean
        q: GM_getValue('q', true),                // AndAuto: boolean
        r: GM_getValue('r', true),                // SwipeStop: boolean
        s: GM_getValue('s', false),               // ForceEn: boolean
        t: GM_getValue('t', 0),                   // AutoSleep: number (minutes)
        u: false                                  // Internal flag for loading state
    };

    // Global state variables from R0.e.java JavaScript injection
    let reqPause = false;
    let firstPlay = true;
    let alFlag = false;
    let ffFlag = false;
    let lastState = null;
    let lastPos = null;
    let playing = false;
    let pfint = null;
    let afint = null;
    let cssint = null;
    let aaint = null;

    // Media tracking variables for AndAuto functionality
    let track = null;
    let artist = '';
    let repmode = 'false';
    let isfav = false;
    let duration = null;
    let position = null;
    let cover = null;

    // --- Mock AndBridge interface (userscript equivalent of Android bridge) ---
    const AndBridge = {
        wakeUp: () => {
            // TODO: Wake functionality not applicable in userscript context
            console.log('[AndBridge] wakeUp() called');
        },
        wakeOff: () => {
            // TODO: Wake functionality not applicable in userscript context  
            console.log('[AndBridge] wakeOff() called');
        },
        isWoke: () => {
            // TODO: Wake state not applicable in userscript context
            return false;
        },
        playLoaded: () => {
            console.log('[AndBridge] playLoaded() - Play button detected');
        },
        manageSleep: (enable) => {
            // TODO: Sleep management handled differently in userscript context
            console.log(`[AndBridge] manageSleep(${enable})`);
            if (AppSingleton.t > 0 && !enable) {
                // Auto-sleep timer logic could be implemented here
                console.log(`[AndBridge] Auto-sleep timer: ${AppSingleton.t} minutes`);
            }
        },
        deferMessage: (msg) => {
            console.log(`[AndBridge] deferMessage: ${msg}`);
            if (msg === 'reload') {
                console.log('[AndBridge] Reload requested due to player lock');
                // Could trigger page reload if needed
            } else if (msg === 'unlock') {
                console.log('[AndBridge] Unlock requested');
            } else if (msg === 'adblock') {
                console.log('[AndBridge] Ad blocked');
            }
        },
        loginDetected: () => {
            console.log('[AndBridge] Login detected');
            AppSingleton.n = true;
        },
        cssInjected: () => {
            console.log('[AndBridge] CSS injected successfully');
        },
        recMediaStatus: (jsonStatus) => {
            console.log('[AndBridge] Media status:', jsonStatus);
        },
        recMediaPosition: (pos) => {
            console.log(`[AndBridge] Media position: ${pos}`);
        }
    };

    // --- Fetch interceptor for track playback monitoring (from R0.e.java) ---
    const originalFetch = window.fetch;
    window.fetch = async function(...args) {
        const [url, opts] = args;
        const method = opts?.method?.toUpperCase?.() || 'GET';
        
        if (ffFlag && url.includes('/track-playback/') && method === 'PUT') {
            const paused = opts?.body ? JSON.parse(opts?.body)?.state_ref?.paused : undefined;
            if (paused && playing) {
                console.log('#Track-Playback: Pause');
                manageAll(false);
            } else if (!paused && !playing) {
                console.log('#Track-Playback: Play');
                manageAll(true);
            }
        }
        
        try {
            const resp = await originalFetch(url, opts);
            if (resp.status === 404 && url.includes('connect-state') && url.includes('/command/from/')) {
                AndBridge.deferMessage('reload');
                console.log('Player Locked: reload');
                location.reload();
            }
            return resp;
        } catch (err) {
            console.error('Error in Fetch Request:', err);
            throw err;
        }
    };

    // --- Core playback control functions (from R0.e.java) ---
    window.firstFuck = function() {
        if (pfint) clearInterval(pfint);
        pfint = setInterval(() => {
            if (playing && document.visibilityState === 'hidden' && !!document.querySelector('video')) {
                AndBridge.wakeUp();
            } else if (!AndBridge.isWoke() && document.visibilityState === 'visible' && !document.querySelector('video')) {
                AndBridge.wakeOff();
            }
            
            let pb = document.querySelector('aside button[data-testid=control-button-playpause]:not(.fuckd)');
            if (pb) {
                AndBridge.playLoaded();
                console.log('#pBtn fuckd');
                pb.classList.add('fuckd');
                window.pBtn = pb;
                
                pBtn.addEventListener('click', () => {
                    console.log('PlayClicked');
                    if (pBtn.getAttribute('aria-label') !== 'Play') {
                        console.log('Pause Req');
                        reqPause = true;
                        alFlag = false;
                        manageWake(false);
                    } else if (!alFlag) {
                        reqPause = false;
                        manageWake(true);
                        console.log('Adding Unlocker');
                        alFlag = true;
                        setTimeout(() => {
                            console.log('Unlocker Timeout Reached');
                            if (alFlag && pBtn.getAttribute('aria-label') === 'Play') {
                                AndBridge.deferMessage('unlock');
                                console.log('#Unlocking!');
                                actSkipForward();
                                trigUnlock();
                            } else if (alFlag) {
                                console.log('Playing, Removing Unlocker');
                                alFlag = false;
                            }
                        }, 10000);
                    }
                });
                
                if (!ffFlag) {
                    ffFlag = true;
                    AndBridge.manageSleep(false);
                    console.log('FirstFuck Adding All Features');
                    addAutoFeatures();
                    addCSSJSHack();
                    addAndAuto();
                }
            }
        }, 5000);
    };

    window.manageWake = function(enable) {
        if (enable) {
            if (document.visibilityState === 'hidden') AndBridge.wakeUp();
        } else {
            if (!AndBridge.isWoke() && document.visibilityState === 'visible') AndBridge.wakeOff();
        }
    };

    window.manageAll = function(play) {
        playing = play;
        if (typeof updMedia === 'function') updMedia();
        AndBridge.manageSleep(!play);
        
        if (play) {
            console.log('StartingIntervals');
            firstFuck();
            addAutoFeatures();
            addCSSJSHack();
            addAndAuto();
        } else {
            console.log('KillingIntervals');
            if (pfint) clearInterval(pfint);
            if (afint) clearInterval(afint);
            if (cssint) clearInterval(cssint);
            if (aaint) clearInterval(aaint);
        }
    };

    window.closeNowPlay = function() {
        let cb = document.querySelector('button[data-testid=control-button-npv][aria-pressed=true]');
        if (cb) {
            console.log('#Close NowPlaying');
            cb.click();
        }
    };

    window.trigUnlock = function() {
        let uint = setInterval(() => {
            if (pBtn.disabled) {
                AndBridge.deferMessage('reload');
                window.location.reload();
            } else if (pBtn.getAttribute('aria-label') !== 'Play') {
                clearInterval(uint);
                alFlag = false;
                console.log('#Unlocked OK!');
            }
        }, 3000);
    };

    // --- Playback control functions (enhanced from existing + R0.e.java) ---
    window.actPlayPause = function(play) {
        console.log('PlayPause:' + play);
        if ('pBtn' in window) {
            if (pBtn.getAttribute('aria-label') === 'Play') {
                if (play) pBtn.click();
            } else {
                if (!play) pBtn.click();
            }
        }
    };

    window.actSkipBack = function() {
        console.log('SkipBack');
        let bb = document.querySelector('button[data-testid=control-button-skip-back]');
        if (bb) {
            manageWake(true);
            bb.click();
        }
    };

    window.actSkipForward = function() {
        console.log('SkipForward');
        let fb = document.querySelector('button[data-testid=control-button-skip-forward]');
        if (fb) {
            manageWake(true);
            fb.click();
        }
    };

    window.actRepeat = function() {
        console.log('RepeatClick');
        let rb = document.querySelector('button[data-testid=control-button-repeat]');
        if (rb) {
            if (repmode === 'false') repmode = 'true';
            else if (repmode === 'true') repmode = 'mixed';
            else repmode = 'false';
            updMedia();
            rb.click();
        }
    };

    window.actAddToFav = function() {
        console.log('AddToFav');
        let fb = document.querySelector('div[data-testid=now-playing-widget]>div:last-child>button');
        if (fb) {
            if (fb.getAttribute('aria-checked') === 'false') {
                fb.click();
                isfav = true;
                updMedia();
            } else {
                fb.click();
                let rfint = setInterval(() => {
                    let fr = document.querySelector('#context-menu button[role=menuitemcheckbox][aria-checked=true]');
                    if (fr) {
                        clearInterval(rfint);
                        fr.click();
                        setTimeout(() => {
                            let sb = document.querySelector('#context-menu button[type=submit]');
                            if (sb) {
                                sb.click();
                                isfav = false;
                                updMedia();
                            }
                        }, 500);
                    }
                }, 1000);
            }
        }
    };

    window.actSeek = function(pos) {
        let rg = document.querySelector('div[data-testid=playback-progressbar] input[type=range]');
        if (rg) {
            rg.value = pos;
            rg.dispatchEvent(new Event('change', { bubbles: true }));
        }
    };

    // --- Auto Features function (from R0.e.java with AppSingleton logic) ---
    window.addAutoFeatures = function() {
        console.log('Adding AutoFeatures');
        
        if (!AppSingleton.p && !AppSingleton.o && AppSingleton.k === 'disabled') {
            // If no auto features needed, just return
            return;
        }
        
        if (afint) clearInterval(afint);
        afint = setInterval(() => {
            // CloseNowPlay functionality (AppSingleton.p)
            if (AppSingleton.p) {
                closeNowPlay();
            }
            
            // TakeControl functionality (AppSingleton.o)
            if (AppSingleton.o) {
                let ft = document.querySelector('aside div.encore-bright-accent-set button');
                if (ft) {
                    console.log('#Take Control');
                    ft.click();
                    setTimeout(() => {
                        let cb = document.querySelector('aside ul[role=list] li[role=listitem] div[role=button]');
                        if (cb) cb.click();
                    }, 500);
                }
            }
            
            // Permanent autoplay functionality (AppSingleton.k === "permanent")
            if (AppSingleton.k === 'permanent') {
                if ('pBtn' in window && !reqPause && !alFlag && pBtn.getAttribute('aria-label') === 'Play') {
                    console.log('#Permanent AutoPlay');
                    pBtn.click();
                }
            }
        }, 5000);
        
        // One-time autoplay functionality (AppSingleton.k === "onetime")
        if (AppSingleton.k === 'onetime') {
            if ('pBtn' in window && firstPlay && pBtn.getAttribute('aria-label') === 'Play') {
                console.log('#OneTime AutoPlay');
                pBtn.click();
                firstPlay = false;
            }
        }
    };

    // --- AndAuto media tracking functionality (from R0.e.java) ---
    window.addAndAuto = function() {
        if (!AppSingleton.q) {
            console.log('AndAuto disabled');
            return;
        }
        
        if (aaint) clearInterval(aaint);
        aaint = setInterval(() => {
            // Track title detection
            let ta = document.querySelector('a[data-testid=context-item-link]');
            if (ta) track = ta.text;
            else track = null;
            
            // Artist detection  
            let aa = document.querySelector('a[data-testid=context-item-info-artist]');
            if (!aa) aa = document.querySelector('a[data-testid=context-item-info-show]');
            if (aa) artist = aa.text;
            else artist = '';
            
            // Repeat mode detection
            let rr = document.querySelector('button[data-testid=control-button-repeat]');
            if (rr) repmode = rr.getAttribute('aria-checked');
            else repmode = 'false';
            
            // Favorite status detection
            let fb = document.querySelector('div[data-testid=now-playing-widget]>div:last-child>button');
            if (fb && fb.getAttribute('aria-checked') === 'true') isfav = true;
            else isfav = false;
            
            // Duration and position detection
            let rg = document.querySelector('div[data-testid=playback-progressbar] input[type=range]');
            if (rg) {
                duration = parseInt(rg.getAttribute('max'));
                position = parseInt(rg.getAttribute('value'));
            } else {
                duration = null;
                position = null;
            }
            
            // Cover art detection
            let im = document.querySelector('img[data-testid=cover-art-image]');
            if (im) cover = im.src;
            else cover = null;
            
            updMedia();
        }, 2000);
        
        // Media status update function
        window.updMedia = function() {
            const currState = track + '|' + artist + '|' + playing + '|' + repmode + '|' + isfav;
            if (currState !== lastState) {
                lastState = currState;
                const values = {
                    artist: artist,
                    track: track,
                    playing: playing,
                    repeat: repmode,
                    fav: isfav,
                    duration: duration,
                    position: position,
                    cover: cover
                };
                AndBridge.recMediaStatus(JSON.stringify(values));
            } else {
                if (Math.abs(position - lastPos) > 4000) {
                    AndBridge.recMediaPosition(position);
                }
                lastPos = position;
            }
        };
        
        // Media library navigation function
        window.mediaBuildPlay = function(idx = -1) {
            if (!window.lBtn || !window.lBtn.querySelector(':scope>h1')) {
                if (window.lBtn) window.lBtn.click();
            }
            let mint = setInterval(() => {
                if (document.querySelector('div[role=grid] div[role=gridcell]>div button')) {
                    clearInterval(mint);
                    console.log('MediaBuilding');
                    let lbr = document.querySelectorAll('div[role=grid] div[role=gridcell]>div');
                    let tits = [], knds = [], imgs = [], btns = [];
                    Array.from(lbr).forEach(node => {
                        const img = node.querySelector('img');
                        const btn = node.querySelector('button');
                        if (img) {
                            tits.push(img.alt);
                            let knd = node.getAttribute('aria-labelledby');
                            if (knd && (match = knd.match(/listrow-title-spotify:([^:]+):/))) {
                                knds.push((match[1].charAt(0).toUpperCase() + match[1].slice(1)).replace('Collection', 'Playlist'));
                            } else {
                                knds.push('-');
                            }
                            imgs.push(img.src);
                            btns.push(btn);
                        }
                    });
                    window.mediaInfo = { tits, knds, imgs };
                    if (idx === -1) {
                        if (window.lBtn) window.lBtn.click();
                    } else {
                        manageWake(true);
                        btns[idx].click();
                    }
                }
            }, 500);
        };
    };

    // --- CSS/JS Hack functionality (from R0.e.java with GuiMode support) ---
    window.addCSSJSHack = function() {
        console.log('Adding CSS/JS Hack - GuiMode:', AppSingleton.l);
        
        if (AppSingleton.l === 'disabled') {
            console.log('CSS/JS Hack disabled');
            return;
        }
        
        if (cssint) clearInterval(cssint);
        cssint = setInterval(function() {
            // Library button handling (common for all modes)
            let lb = document.querySelector('#Desktop_LeftSidebar_Id header>div>div:first-child button:not(.fuckd)');
            if (lb) {
                console.log('LibBtnFuckd');
                window.lBtn = lb;
                lb.classList.add('fuckd', 'lbtn');
                lb.style.padding = '0';
                lb.style.height = '20px';
                lb.addEventListener('click', function() {
                    setTimeout(() => switchLs(), 0);
                });
                switchLs();
                AndBridge.cssInjected();
            }
            
            // Library grid item handling
            let lbit = document.querySelector('#Desktop_LeftSidebar_Id div[role=grid]:not(.fuckd)');
            if (lbit) {
                lbit.classList.add('fuckd');
                lbit.addEventListener('click', () => {
                    setTimeout(() => {
                        console.log('AutoCloseLib');
                        if (window.lBtn) window.lBtn.click();
                        closeNowPlay();
                    }, 0);
                });
            }
            
            // Home button handling
            let hb = document.querySelector('#global-nav-bar button[data-testid=home-button]:not(.fuckd)');
            if (hb) {
                hb.classList.add('fuckd');
                hb.addEventListener('click', () => {
                    closeNowPlay();
                });
            }
            
            // Search input handling
            let sr = document.querySelector('input[data-testid=search-input]:not(.fuckd)');
            if (sr) {
                sr.classList.add('fuckd');
                sr.addEventListener('focus', () => {
                    let npb = document.querySelector('aside[data-testid=now-playing-bar]');
                    if (npb) npb.style.display = 'none';
                    closeNowPlay();
                });
                sr.addEventListener('blur', () => {
                    let npb = document.querySelector('aside[data-testid=now-playing-bar]');
                    if (npb) npb.style.display = 'flex';
                });
            }
            
            // User widget button handling
            let ub = document.querySelector('button[data-testid=user-widget-link]:not(.fuckd)');
            if (ub) {
                ub.classList.add('fuckd');
                ub.addEventListener('click', () => {
                    closeNowPlay();
                });
            }
        }, 5000);
        
        // Apply GuiMode-specific styling
        if (AppSingleton.l === 'csshack') {
            applyCSSHackStyles();
        } else if (AppSingleton.l === 'widewindow') {
            applyWideWindowStyles();
        } else if (AppSingleton.l === 'mobile+js csshack') {
            applyMobileJSCSSHackStyles();
        }
    };

    // --- Sidebar toggle functionality (from R0.e.java) ---  
    window.switchLs = function() {
        let ls = document.querySelector('#Desktop_LeftSidebar_Id');
        if (ls) {
            let exp = ls.querySelector('nav>div>div:first-child').classList.length;
            if (exp === 2) {
                console.log('Expanded');
                ls.style.position = 'fixed';
                ls.style.width = '100%';
                ls.style.height = '92%';
                ls.style.left = '0';
                ls.style.zIndex = '20';
                let lh = ls.querySelector('header>div>div:first-child h1');
                if (lh) lh.innerText = '✖ Close Library'; // Using close symbol instead of string from Java
            } else {
                console.log('Collapsed');
                ls.style.zIndex = '1';
                ls.style.position = 'fixed';
                ls.style.top = '2px';
                ls.style.left = '60px';
                ls.style.width = '50px';
                ls.style.height = '40px';
            }
        }
    };

    // --- GuiMode-specific styling functions ---
    function applyCSSHackStyles() {
        const cssContent = `
            body{min-width:100%!important;min-height:100%!important} 
            .os-scrollbar{--os-size:6px!important} 
            .contentSpacing{padding:0} 
            div[data-testid=root]{--panel-gap:0!important} 
            #main-view+div{overflow:hidden!important;} 
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
            form[role=search]{z-index:10;margin-left:50px} 
            div[data-testid=now-playing-widget]>div:last-child>button{transform:scale(1.3)} 
            div[data-testid=now-playing-widget]>div:first-child{display:none!important} 
            div[data-testid=now-playing-widget]>div:nth-child(2){display:flex!important;overflow:hidden!important} 
            div[data-testid=now-playing-widget]>div:nth-child(2) span{font-size:13px!important;height:20px!important;margin:0!important} 
            div[data-testid=now-playing-widget]>div:nth-child(2)>div{min-width:auto;max-width:66%} 
            [data-tippy-root],[data-tippy-root] *{transition:none!important;transform:none!important;overflow:hidden!important} 
            div[data-testid=hover-or-focus-tooltip],#Desktop_LeftSidebar_Id header>div>div:last-child{display:none!important}
        `;
        injectStyleSheet('spotifuck-csshack-styles', cssContent);
    }

    function applyWideWindowStyles() {
        // TODO: widewindow mode styling not fully defined in Java code - implementing basic wide layout
        const cssContent = `
            body { min-width: 1200px !important; }
            div[data-testid=root] { --panel-gap: 8px !important; }
            #main-view { max-width: none !important; }
            .contentSpacing { padding: 0 20px !important; }
            aside[data-testid=now-playing-bar] { max-width: none !important; }
        `;
        injectStyleSheet('spotifuck-widewindow-styles', cssContent);
    }

    function applyMobileJSCSSHackStyles() {
        // TODO: mobile+js csshack mode combines mobile layout with JS enhancements  
        const cssContent = `
            /* Mobile-optimized layout with JS hack enhancements */
            body { min-width: 100% !important; font-size: 14px !important; }
            div[data-testid=root] { --panel-gap: 0 !important; }
            .contentSpacing { padding: 0 5px !important; }
            aside[data-testid=now-playing-bar] { 
                min-width: 100% !important; 
                background: #000 !important;
                flex-direction: column !important;
            }
            div[data-testid=player-controls] button { transform: scale(1.2) !important; }
            div[data-testid=now-playing-widget] { justify-content: center !important; }
        `;
        injectStyleSheet('spotifuck-mobile-js-csshack-styles', cssContent);
    }

    function injectStyleSheet(id, cssContent) {
        let existingStyle = document.getElementById(id);
        if (existingStyle) {
            existingStyle.textContent = cssContent;
        } else {
            let st = document.createElement('style');
            st.id = id;
            st.textContent = cssContent;
            document.head.appendChild(st);
        }
    }

    // --- Spoof screen and navigator properties (run as early as possible) ---
    const spoofScript = `
        Object.defineProperty(window.screen, 'width', {get: () => 1920});
        Object.defineProperty(window.screen, 'height', {get: () => 1080});
        Object.defineProperty(window.screen, 'availWidth', {get: () => 1920});
        Object.defineProperty(window.screen, 'availHeight', {get: () => 1040});
        Object.defineProperty(window, 'innerWidth', {get: () => 1920});
        Object.defineProperty(window, 'innerHeight', {get: () => 978});
        Object.defineProperty(window.navigator, 'vendor', {get: () => 'Google Inc.'});
        Object.defineProperty(window.navigator, 'productSub', {get: () => '20030107'});
        Object.defineProperty(window.navigator, 'platform', {get: () => 'Win32'});
        Object.defineProperty(window.navigator, 'oscpu', {get: () => 'Windows NT 10.0; Win64; x64'});
    `;
    const scriptNode = document.createElement('script');
    scriptNode.textContent = spoofScript;
    document.documentElement.appendChild(scriptNode);
    scriptNode.remove();

    // --- Login detection function (from R0.e.java onPageFinished) ---
    function checkForLogin() {
        if (!AppSingleton.n) {
            let loginButton = document.querySelector('button[data-testid=web-player-link]');
            if (loginButton) {
                AndBridge.loginDetected();
                loginButton.click();
                return true;
            }
        }
        return false;
    }

    // --- Main initialization function (equivalent to R0.e.java onPageFinished) ---
    function initSpotifuck() {
        console.log('[Spotifuck] Initializing with settings:', AppSingleton);
        
        // Check for login first
        if (checkForLogin()) {
            return; // Wait for login to complete
        }
        
        // Only proceed if logged in or if we're on the main Spotify page
        if (AppSingleton.n || window.location.href.includes('open.spotify.com')) {
            console.log('[Spotifuck] Starting main features');
            
            // Start core functionality
            firstFuck();
            
            // Apply features based on settings
            if (AppSingleton.m) { // ServiceOn
                console.log('[Spotifuck] Service enabled');
            }
        }
    }

    // --- Ad blocking functionality (from R0.e.java shouldInterceptRequest) ---
    function setupAdBlocking() {
        const originalFetch = window.fetch;
        window.fetch = async function(resource, init) {
            const url = (typeof resource === 'string') ? resource : resource.url;
            
            // Block ad domains (from Java code)
            const adDomains = [
                'doubleclick.net', 'googlesyndication.com', 'fastly-insights.com', 'sentry.io',
                'amillionads.com', '2mdn.net', 'adxcel.com', 'adstudio-assets.scdn.co'
            ];
            
            const audioAdPaths = [
                'podz-content', 'gew4-spclient', 'akamaized.net/audio/', 'scdn.co/audio/',
                'scdn.co/mp3-ad/', 'spotifycdn.com/audio/'
            ];
            
            if (url) {
                // Block general ad domains
                for (let domain of adDomains) {
                    if (url.includes(domain)) {
                        console.log('[Spotifuck] Blocked ad domain:', url);
                        AndBridge.deferMessage('adblock');
                        return new Response(new ArrayBuffer(0), {
                            status: 200,
                            statusText: 'OK',
                            headers: { 'Access-Control-Allow-Origin': '*' }
                        });
                    }
                }
                
                // Block audio ads specifically  
                if (url.includes('audio/mpeg')) {
                    for (let path of audioAdPaths) {
                        if (url.includes(path)) {
                            console.log('[Spotifuck] Blocked audio ad:', url);
                            AndBridge.deferMessage('adblock');
                            // Return silent audio
                            const silentAudio = new ArrayBuffer(44); // Minimal WAV header
                            return new Response(silentAudio, {
                                status: 200,
                                statusText: 'OK', 
                                headers: { 'Content-Type': 'audio/mpeg' }
                            });
                        }
                    }
                }
            }
            
            return originalFetch.apply(this, arguments);
        };
    }

    // --- Facebook GDPR consent handler (from R0.e.java) ---
    function handleFacebookConsent() {
        if (window.location.href.startsWith('https://www.facebook.com/privacy/consent/gdp/')) {
            setTimeout(() => {
                let consentButton = document.querySelector('#facebook div[role=button]');
                if (consentButton) {
                    consentButton.click();
                }
            }, 1000);
        }
    }

    // --- SwipeStop functionality ---
    function setupSwipeStop() {
        if (!AppSingleton.r) return; // SwipeStop disabled
        
        // TODO: SwipeStop gesture detection not fully applicable in userscript context
        // Would need to implement touch gesture detection for mobile browsers
        console.log('[Spotifuck] SwipeStop enabled but gesture detection not implemented in userscript context');
    }

    // --- Force English functionality ---
    function setupForceEnglish() {
        if (!AppSingleton.s) return; // ForceEn disabled
        
        // TODO: Language forcing would require intercepting Spotify's language detection
        // This is more complex in userscript context compared to Android WebView
        console.log('[Spotifuck] ForceEn enabled but language override not implemented in userscript context');
    }

    // --- Main document ready handler ---
    function onDocumentReady() {
        console.log('[Spotifuck] Document ready, initializing...');
        
        // Apply client spoofing immediately
        handleFacebookConsent();
        
        // Setup ad blocking
        setupAdBlocking();
        
        // Setup additional features
        setupSwipeStop();
        setupForceEnglish();
        
        // Initialize main features
        initSpotifuck();
    }

    // --- Page load detection and initialization ---
    if (document.readyState === 'loading') {
        document.addEventListener('DOMContentLoaded', onDocumentReady);
    } else {
        onDocumentReady();
    }

    // Periodic re-initialization for SPA navigation
    setInterval(() => {
        if (document.querySelector('#Desktop_LeftSidebar_Id') && !ffFlag) {
            initSpotifuck();
        }
    }, 5000);

})();
