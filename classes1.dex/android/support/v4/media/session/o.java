package android.support.v4.media.session;

import android.media.session.MediaSession;
import android.os.Handler;
import android.os.RemoteCallbackList;
import android.support.v4.media.MediaMetadataCompat;
import d0.r;
import it.deviato.spotifuck.WebService;

public class o {

    /* renamed from: a  reason: collision with root package name */
    public final MediaSession f1121a;

    /* renamed from: b  reason: collision with root package name */
    public final n f1122b;

    /* renamed from: c  reason: collision with root package name */
    public final MediaSessionCompat$Token f1123c;

    /* renamed from: d  reason: collision with root package name */
    public final Object f1124d = new Object();
    public final RemoteCallbackList e = new RemoteCallbackList();

    /* renamed from: f  reason: collision with root package name */
    public PlaybackStateCompat f1125f;

    /* renamed from: g  reason: collision with root package name */
    public MediaMetadataCompat f1126g;

    /* renamed from: h  reason: collision with root package name */
    public R0.o f1127h;
    public r i;

    public MediaSession a(WebService webService, String str) {
        return new MediaSession(webService, str);
    }

    public final R0.o b() {
        R0.o oVar;
        synchronized (this.f1124d) {
            oVar = this.f1127h;
        }
        return oVar;
    }

    public r c() {
        r rVar;
        synchronized (this.f1124d) {
            rVar = this.i;
        }
        return rVar;
    }

    public final PlaybackStateCompat d() {
        return this.f1125f;
    }

    public final void e(R0.o oVar, Handler handler) {
        m mVar;
        synchronized (this.f1124d) {
            try {
                this.f1127h = oVar;
                MediaSession mediaSession = this.f1121a;
                if (oVar == null) {
                    mVar = null;
                } else {
                    mVar = oVar.f874b;
                }
                mediaSession.setCallback(mVar, handler);
                if (oVar != null) {
                    oVar.l(this, handler);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void f(r rVar) {
        synchronized (this.f1124d) {
            this.i = rVar;
        }
    }

    public o(WebService webService, String str) {
        MediaSession a2 = a(webService, str);
        this.f1121a = a2;
        n nVar = new n(this);
        this.f1122b = nVar;
        this.f1123c = new MediaSessionCompat$Token(a2.getSessionToken(), nVar);
        a2.setFlags(3);
    }
}
