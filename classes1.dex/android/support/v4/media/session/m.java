package android.support.v4.media.session;

import Q0.j;
import R0.o;
import android.content.Intent;
import android.media.Rating;
import android.media.session.MediaSession;
import android.net.Uri;
import android.os.BadParcelableException;
import android.os.Build;
import android.os.Bundle;
import android.os.IBinder;
import android.os.ResultReceiver;
import android.support.v4.media.MediaDescriptionCompat;
import android.support.v4.media.RatingCompat;
import android.text.TextUtils;
import android.util.Log;
import android.view.KeyEvent;
import android.view.ViewConfiguration;
import android.webkit.ValueCallback;
import android.webkit.WebView;
import androidx.versionedparcelable.ParcelImpl;
import d0.r;
import it.deviato.spotifuck.WebService;
import p0.d;

public final class m extends MediaSession.Callback {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ o f1118a;

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onCustomAction(java.lang.String r7, android.os.Bundle r8) {
        /*
            r6 = this;
            r0 = 0
            android.support.v4.media.session.o r1 = r6.a()
            if (r1 != 0) goto L_0x0008
            return
        L_0x0008:
            android.support.v4.media.session.t.j(r8)
            b(r1)
            java.lang.String r2 = "android.support.v4.media.session.action.PLAY_FROM_URI"
            boolean r2 = r7.equals(r2)     // Catch:{ BadParcelableException -> 0x0118 }
            java.lang.String r3 = "android.support.v4.media.session.action.ARGUMENT_URI"
            java.lang.String r4 = "android.support.v4.media.session.action.ARGUMENT_EXTRAS"
            R0.o r5 = r6.f1118a
            if (r2 == 0) goto L_0x002e
            android.os.Parcelable r7 = r8.getParcelable(r3)     // Catch:{ BadParcelableException -> 0x0118 }
            android.net.Uri r7 = (android.net.Uri) r7     // Catch:{ BadParcelableException -> 0x0118 }
            android.os.Bundle r7 = r8.getBundle(r4)     // Catch:{ BadParcelableException -> 0x0118 }
            android.support.v4.media.session.t.j(r7)     // Catch:{ BadParcelableException -> 0x0118 }
            r5.getClass()     // Catch:{ BadParcelableException -> 0x0118 }
            goto L_0x011f
        L_0x002e:
            java.lang.String r2 = "android.support.v4.media.session.action.PREPARE"
            boolean r2 = r7.equals(r2)     // Catch:{ BadParcelableException -> 0x0118 }
            if (r2 == 0) goto L_0x003b
            r5.getClass()     // Catch:{ BadParcelableException -> 0x0118 }
            goto L_0x011f
        L_0x003b:
            java.lang.String r2 = "android.support.v4.media.session.action.PREPARE_FROM_MEDIA_ID"
            boolean r2 = r7.equals(r2)     // Catch:{ BadParcelableException -> 0x0118 }
            if (r2 == 0) goto L_0x0054
            java.lang.String r7 = "android.support.v4.media.session.action.ARGUMENT_MEDIA_ID"
            r8.getString(r7)     // Catch:{ BadParcelableException -> 0x0118 }
            android.os.Bundle r7 = r8.getBundle(r4)     // Catch:{ BadParcelableException -> 0x0118 }
            android.support.v4.media.session.t.j(r7)     // Catch:{ BadParcelableException -> 0x0118 }
            r5.getClass()     // Catch:{ BadParcelableException -> 0x0118 }
            goto L_0x011f
        L_0x0054:
            java.lang.String r2 = "android.support.v4.media.session.action.PREPARE_FROM_SEARCH"
            boolean r2 = r7.equals(r2)     // Catch:{ BadParcelableException -> 0x0118 }
            if (r2 == 0) goto L_0x006d
            java.lang.String r7 = "android.support.v4.media.session.action.ARGUMENT_QUERY"
            r8.getString(r7)     // Catch:{ BadParcelableException -> 0x0118 }
            android.os.Bundle r7 = r8.getBundle(r4)     // Catch:{ BadParcelableException -> 0x0118 }
            android.support.v4.media.session.t.j(r7)     // Catch:{ BadParcelableException -> 0x0118 }
            r5.getClass()     // Catch:{ BadParcelableException -> 0x0118 }
            goto L_0x011f
        L_0x006d:
            java.lang.String r2 = "android.support.v4.media.session.action.PREPARE_FROM_URI"
            boolean r2 = r7.equals(r2)     // Catch:{ BadParcelableException -> 0x0118 }
            if (r2 == 0) goto L_0x0087
            android.os.Parcelable r7 = r8.getParcelable(r3)     // Catch:{ BadParcelableException -> 0x0118 }
            android.net.Uri r7 = (android.net.Uri) r7     // Catch:{ BadParcelableException -> 0x0118 }
            android.os.Bundle r7 = r8.getBundle(r4)     // Catch:{ BadParcelableException -> 0x0118 }
            android.support.v4.media.session.t.j(r7)     // Catch:{ BadParcelableException -> 0x0118 }
            r5.getClass()     // Catch:{ BadParcelableException -> 0x0118 }
            goto L_0x011f
        L_0x0087:
            java.lang.String r2 = "android.support.v4.media.session.action.SET_CAPTIONING_ENABLED"
            boolean r2 = r7.equals(r2)     // Catch:{ BadParcelableException -> 0x0118 }
            if (r2 == 0) goto L_0x0099
            java.lang.String r7 = "android.support.v4.media.session.action.ARGUMENT_CAPTIONING_ENABLED"
            r8.getBoolean(r7)     // Catch:{ BadParcelableException -> 0x0118 }
            r5.getClass()     // Catch:{ BadParcelableException -> 0x0118 }
            goto L_0x011f
        L_0x0099:
            java.lang.String r2 = "android.support.v4.media.session.action.SET_REPEAT_MODE"
            boolean r2 = r7.equals(r2)     // Catch:{ BadParcelableException -> 0x0118 }
            if (r2 == 0) goto L_0x00ab
            java.lang.String r7 = "android.support.v4.media.session.action.ARGUMENT_REPEAT_MODE"
            r8.getInt(r7)     // Catch:{ BadParcelableException -> 0x0118 }
            r5.getClass()     // Catch:{ BadParcelableException -> 0x0118 }
            goto L_0x011f
        L_0x00ab:
            java.lang.String r2 = "android.support.v4.media.session.action.SET_SHUFFLE_MODE"
            boolean r2 = r7.equals(r2)     // Catch:{ BadParcelableException -> 0x0118 }
            if (r2 == 0) goto L_0x00bc
            java.lang.String r7 = "android.support.v4.media.session.action.ARGUMENT_SHUFFLE_MODE"
            r8.getInt(r7)     // Catch:{ BadParcelableException -> 0x0118 }
            r5.getClass()     // Catch:{ BadParcelableException -> 0x0118 }
            goto L_0x011f
        L_0x00bc:
            java.lang.String r2 = "android.support.v4.media.session.action.SET_RATING"
            boolean r2 = r7.equals(r2)     // Catch:{ BadParcelableException -> 0x0118 }
            if (r2 == 0) goto L_0x00d7
            java.lang.String r7 = "android.support.v4.media.session.action.ARGUMENT_RATING"
            android.os.Parcelable r7 = r8.getParcelable(r7)     // Catch:{ BadParcelableException -> 0x0118 }
            android.support.v4.media.RatingCompat r7 = (android.support.v4.media.RatingCompat) r7     // Catch:{ BadParcelableException -> 0x0118 }
            android.os.Bundle r7 = r8.getBundle(r4)     // Catch:{ BadParcelableException -> 0x0118 }
            android.support.v4.media.session.t.j(r7)     // Catch:{ BadParcelableException -> 0x0118 }
            r5.getClass()     // Catch:{ BadParcelableException -> 0x0118 }
            goto L_0x011f
        L_0x00d7:
            java.lang.String r2 = "android.support.v4.media.session.action.SET_PLAYBACK_SPEED"
            boolean r2 = r7.equals(r2)     // Catch:{ BadParcelableException -> 0x0118 }
            if (r2 == 0) goto L_0x00ea
            java.lang.String r7 = "android.support.v4.media.session.action.ARGUMENT_PLAYBACK_SPEED"
            r2 = 1065353216(0x3f800000, float:1.0)
            r8.getFloat(r7, r2)     // Catch:{ BadParcelableException -> 0x0118 }
            r5.getClass()     // Catch:{ BadParcelableException -> 0x0118 }
            goto L_0x011f
        L_0x00ea:
            int r8 = r5.f877f     // Catch:{ BadParcelableException -> 0x0118 }
            switch(r8) {
                case 0: goto L_0x00f0;
                default: goto L_0x00ef;
            }     // Catch:{ BadParcelableException -> 0x0118 }
        L_0x00ef:
            goto L_0x011f
        L_0x00f0:
            android.webkit.WebView r8 = it.deviato.spotifuck.WebService.f3191r     // Catch:{ BadParcelableException -> 0x0118 }
            if (r8 == 0) goto L_0x011f
            r7.getClass()     // Catch:{ BadParcelableException -> 0x0118 }
            java.lang.String r8 = "REPEAT_ACTION"
            boolean r8 = r7.equals(r8)
            if (r8 != 0) goto L_0x0110
            java.lang.String r8 = "ADDTOFAV_ACTION"
            boolean r7 = r7.equals(r8)
            if (r7 != 0) goto L_0x0108
            goto L_0x011f
        L_0x0108:
            android.webkit.WebView r7 = it.deviato.spotifuck.WebService.f3191r     // Catch:{ BadParcelableException -> 0x0118 }
            java.lang.String r8 = "actAddToFav();"
            r7.evaluateJavascript(r8, r0)     // Catch:{ BadParcelableException -> 0x0118 }
            goto L_0x011f
        L_0x0110:
            android.webkit.WebView r7 = it.deviato.spotifuck.WebService.f3191r     // Catch:{ BadParcelableException -> 0x0118 }
            java.lang.String r8 = "actRepeat();"
            r7.evaluateJavascript(r8, r0)     // Catch:{ BadParcelableException -> 0x0118 }
            goto L_0x011f
        L_0x0118:
            java.lang.String r7 = "MediaSessionCompat"
            java.lang.String r8 = "Could not unparcel the data."
            android.util.Log.e(r7, r8)
        L_0x011f:
            r1.f(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.v4.media.session.m.onCustomAction(java.lang.String, android.os.Bundle):void");
    }

    public m(o oVar) {
        this.f1118a = oVar;
    }

    public static void b(o oVar) {
        int i = Build.VERSION.SDK_INT;
        if (i < 28) {
            MediaSession mediaSession = oVar.f1121a;
            String str = null;
            if (i >= 24) {
                try {
                    str = (String) mediaSession.getClass().getMethod("getCallingPackage", (Class[]) null).invoke(mediaSession, (Object[]) null);
                } catch (Exception e) {
                    Log.e("MediaSessionCompat", "Cannot execute MediaSession.getCallingPackage()", e);
                }
            }
            if (TextUtils.isEmpty(str)) {
                str = "android.media.session.MediaController";
            }
            oVar.f(new r(str, -1, -1));
        }
    }

    public final o a() {
        o oVar;
        synchronized (this.f1118a.f873a) {
            oVar = (o) this.f1118a.f876d.get();
        }
        if (oVar == null || this.f1118a != oVar.b()) {
            return null;
        }
        return oVar;
    }

    public final void onCommand(String str, Bundle bundle, ResultReceiver resultReceiver) {
        IBinder iBinder;
        d dVar;
        o a2 = a();
        if (a2 != null) {
            t.j(bundle);
            b(a2);
            try {
                if (str.equals("android.support.v4.media.session.command.GET_EXTRA_BINDER")) {
                    Bundle bundle2 = new Bundle();
                    MediaSessionCompat$Token mediaSessionCompat$Token = a2.f1123c;
                    d a3 = mediaSessionCompat$Token.a();
                    if (a3 == null) {
                        iBinder = null;
                    } else {
                        iBinder = a3.asBinder();
                    }
                    bundle2.putBinder("android.support.v4.media.session.EXTRA_BINDER", iBinder);
                    synchronized (mediaSessionCompat$Token.f1088a) {
                        dVar = mediaSessionCompat$Token.f1091d;
                    }
                    if (dVar != null) {
                        Bundle bundle3 = new Bundle();
                        bundle3.putParcelable("a", new ParcelImpl(dVar));
                        bundle2.putParcelable("android.support.v4.media.session.SESSION_TOKEN2", bundle3);
                    }
                    resultReceiver.send(0, bundle2);
                } else if (str.equals("android.support.v4.media.session.command.ADD_QUEUE_ITEM")) {
                    o oVar = this.f1118a;
                    MediaDescriptionCompat mediaDescriptionCompat = (MediaDescriptionCompat) bundle.getParcelable("android.support.v4.media.session.command.ARGUMENT_MEDIA_DESCRIPTION");
                    oVar.getClass();
                } else if (str.equals("android.support.v4.media.session.command.ADD_QUEUE_ITEM_AT")) {
                    o oVar2 = this.f1118a;
                    MediaDescriptionCompat mediaDescriptionCompat2 = (MediaDescriptionCompat) bundle.getParcelable("android.support.v4.media.session.command.ARGUMENT_MEDIA_DESCRIPTION");
                    bundle.getInt("android.support.v4.media.session.command.ARGUMENT_INDEX");
                    oVar2.getClass();
                } else if (str.equals("android.support.v4.media.session.command.REMOVE_QUEUE_ITEM")) {
                    o oVar3 = this.f1118a;
                    MediaDescriptionCompat mediaDescriptionCompat3 = (MediaDescriptionCompat) bundle.getParcelable("android.support.v4.media.session.command.ARGUMENT_MEDIA_DESCRIPTION");
                    oVar3.getClass();
                } else if (!str.equals("android.support.v4.media.session.command.REMOVE_QUEUE_ITEM_AT")) {
                    this.f1118a.getClass();
                }
            } catch (BadParcelableException unused) {
                Log.e("MediaSessionCompat", "Could not unparcel the extra data.");
            }
            a2.f((r) null);
        }
    }

    public final void onFastForward() {
        o a2 = a();
        if (a2 != null) {
            b(a2);
            this.f1118a.getClass();
            a2.f((r) null);
        }
    }

    public final boolean onMediaButtonEvent(Intent intent) {
        o oVar;
        j jVar;
        KeyEvent keyEvent;
        long j2;
        o a2 = a();
        if (a2 == null) {
            return false;
        }
        b(a2);
        o oVar2 = this.f1118a;
        boolean z2 = false;
        if (Build.VERSION.SDK_INT >= 27) {
            oVar2.getClass();
        } else {
            synchronized (oVar2.f873a) {
                oVar = (o) oVar2.f876d.get();
                jVar = oVar2.e;
            }
            if (!(oVar == null || jVar == null || (keyEvent = (KeyEvent) intent.getParcelableExtra("android.intent.extra.KEY_EVENT")) == null || keyEvent.getAction() != 0)) {
                r c2 = oVar.c();
                int keyCode = keyEvent.getKeyCode();
                if (keyCode == 79 || keyCode == 85) {
                    if (keyEvent.getRepeatCount() != 0) {
                        oVar2.a(oVar, jVar);
                    } else if (oVar2.f875c) {
                        jVar.removeMessages(1);
                        oVar2.f875c = false;
                        PlaybackStateCompat d2 = oVar.d();
                        if (d2 == null) {
                            j2 = 0;
                        } else {
                            j2 = d2.e;
                        }
                        if ((j2 & 32) != 0) {
                            oVar2.i();
                        }
                    } else {
                        oVar2.f875c = true;
                        jVar.sendMessageDelayed(jVar.obtainMessage(1, c2), (long) ViewConfiguration.getDoubleTapTimeout());
                    }
                    z2 = true;
                } else {
                    oVar2.a(oVar, jVar);
                }
            }
        }
        a2.f((r) null);
        if (z2 || super.onMediaButtonEvent(intent)) {
            return true;
        }
        return false;
    }

    public final void onPause() {
        o a2 = a();
        if (a2 != null) {
            b(a2);
            this.f1118a.c();
            a2.f((r) null);
        }
    }

    public final void onPlay() {
        o a2 = a();
        if (a2 != null) {
            b(a2);
            this.f1118a.e();
            a2.f((r) null);
        }
    }

    public final void onPlayFromMediaId(String str, Bundle bundle) {
        o a2 = a();
        if (a2 != null) {
            t.j(bundle);
            b(a2);
            switch (this.f1118a.f877f) {
                case 0:
                    if (WebService.f3191r != null) {
                        WebService.f3180B = 6;
                        WebService.e();
                        WebView webView = WebService.f3191r;
                        webView.evaluateJavascript("playFromUri('" + str + "');", (ValueCallback) null);
                        break;
                    }
                    break;
            }
            a2.f((r) null);
        }
    }

    public final void onPlayFromSearch(String str, Bundle bundle) {
        o a2 = a();
        if (a2 != null) {
            t.j(bundle);
            b(a2);
            this.f1118a.getClass();
            a2.f((r) null);
        }
    }

    public final void onPlayFromUri(Uri uri, Bundle bundle) {
        o a2 = a();
        if (a2 != null) {
            t.j(bundle);
            b(a2);
            this.f1118a.getClass();
            a2.f((r) null);
        }
    }

    public final void onPrepare() {
        o a2 = a();
        if (a2 != null) {
            b(a2);
            this.f1118a.getClass();
            a2.f((r) null);
        }
    }

    public final void onPrepareFromMediaId(String str, Bundle bundle) {
        o a2 = a();
        if (a2 != null) {
            t.j(bundle);
            b(a2);
            this.f1118a.getClass();
            a2.f((r) null);
        }
    }

    public final void onPrepareFromSearch(String str, Bundle bundle) {
        o a2 = a();
        if (a2 != null) {
            t.j(bundle);
            b(a2);
            this.f1118a.getClass();
            a2.f((r) null);
        }
    }

    public final void onPrepareFromUri(Uri uri, Bundle bundle) {
        o a2 = a();
        if (a2 != null) {
            t.j(bundle);
            b(a2);
            this.f1118a.getClass();
            a2.f((r) null);
        }
    }

    public final void onRewind() {
        o a2 = a();
        if (a2 != null) {
            b(a2);
            this.f1118a.getClass();
            a2.f((r) null);
        }
    }

    public final void onSeekTo(long j2) {
        o a2 = a();
        if (a2 != null) {
            b(a2);
            switch (this.f1118a.f877f) {
                case 0:
                    if (WebService.f3191r != null) {
                        WebService.f3179A = j2;
                        WebService.e();
                        WebView webView = WebService.f3191r;
                        webView.evaluateJavascript("actSeek(" + j2 + ");", (ValueCallback) null);
                        break;
                    }
                    break;
            }
            a2.f((r) null);
        }
    }

    public final void onSetPlaybackSpeed(float f2) {
        o a2 = a();
        if (a2 != null) {
            b(a2);
            this.f1118a.getClass();
            a2.f((r) null);
        }
    }

    public final void onSetRating(Rating rating) {
        float f2;
        o a2 = a();
        if (a2 != null) {
            b(a2);
            RatingCompat ratingCompat = null;
            if (rating != null) {
                int b2 = android.support.v4.media.j.b(rating);
                if (!android.support.v4.media.j.e(rating)) {
                    switch (b2) {
                        case 1:
                        case 2:
                        case 3:
                        case 4:
                        case 5:
                        case 6:
                            ratingCompat = new RatingCompat(b2, -1.0f);
                            break;
                    }
                } else {
                    float f3 = 1.0f;
                    switch (b2) {
                        case 1:
                            if (!android.support.v4.media.j.d(rating)) {
                                f3 = 0.0f;
                            }
                            ratingCompat = new RatingCompat(1, f3);
                            break;
                        case 2:
                            if (!android.support.v4.media.j.f(rating)) {
                                f3 = 0.0f;
                            }
                            ratingCompat = new RatingCompat(2, f3);
                            break;
                        case 3:
                        case 4:
                        case 5:
                            float c2 = android.support.v4.media.j.c(rating);
                            if (b2 == 3) {
                                f2 = 3.0f;
                            } else if (b2 == 4) {
                                f2 = 4.0f;
                            } else if (b2 != 5) {
                                Log.e("Rating", "Invalid rating style (" + b2 + ") for a star rating");
                                break;
                            } else {
                                f2 = 5.0f;
                            }
                            if (c2 >= 0.0f && c2 <= f2) {
                                ratingCompat = new RatingCompat(b2, c2);
                                break;
                            } else {
                                Log.e("Rating", "Trying to set out of range star-based rating");
                                break;
                            }
                            break;
                        case 6:
                            float a3 = android.support.v4.media.j.a(rating);
                            if (a3 >= 0.0f && a3 <= 100.0f) {
                                ratingCompat = new RatingCompat(6, a3);
                                break;
                            } else {
                                Log.e("Rating", "Invalid percentage-based rating value");
                                break;
                            }
                            break;
                    }
                }
                ratingCompat.getClass();
            }
            this.f1118a.getClass();
            a2.f((r) null);
        }
    }

    public final void onSkipToNext() {
        o a2 = a();
        if (a2 != null) {
            b(a2);
            this.f1118a.i();
            a2.f((r) null);
        }
    }

    public final void onSkipToPrevious() {
        o a2 = a();
        if (a2 != null) {
            b(a2);
            switch (this.f1118a.f877f) {
                case 0:
                    if (WebService.f3191r != null) {
                        WebService.f3180B = 6;
                        WebService.e();
                        WebService.f3191r.evaluateJavascript("actSkipBack();", (ValueCallback) null);
                        break;
                    }
                    break;
            }
            a2.f((r) null);
        }
    }

    public final void onSkipToQueueItem(long j2) {
        o a2 = a();
        if (a2 != null) {
            b(a2);
            this.f1118a.getClass();
            a2.f((r) null);
        }
    }

    public final void onStop() {
        o a2 = a();
        if (a2 != null) {
            b(a2);
            this.f1118a.getClass();
            a2.f((r) null);
        }
    }
}
