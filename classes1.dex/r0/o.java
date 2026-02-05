package R0;

import Q0.j;
import android.os.Handler;
import android.support.v4.media.session.PlaybackStateCompat;
import android.support.v4.media.session.m;
import android.support.v4.media.session.t;
import android.webkit.ValueCallback;
import android.webkit.WebView;
import it.deviato.spotifuck.WebService;
import java.lang.ref.WeakReference;

public final class o {

    /* renamed from: a  reason: collision with root package name */
    public final Object f873a = new Object();

    /* renamed from: b  reason: collision with root package name */
    public final m f874b = new m(this);

    /* renamed from: c  reason: collision with root package name */
    public boolean f875c;

    /* renamed from: d  reason: collision with root package name */
    public WeakReference f876d = new WeakReference((Object) null);
    public j e;

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ int f877f;

    public o(int i) {
        this.f877f = i;
    }

    public final void a(android.support.v4.media.session.o oVar, Handler handler) {
        long j2;
        boolean z2;
        boolean z3;
        if (this.f875c) {
            boolean z4 = false;
            this.f875c = false;
            handler.removeMessages(1);
            PlaybackStateCompat d2 = oVar.d();
            if (d2 == null) {
                j2 = 0;
            } else {
                j2 = d2.e;
            }
            if (d2 == null || d2.f1096a != 3) {
                z2 = false;
            } else {
                z2 = true;
            }
            if ((516 & j2) != 0) {
                z3 = true;
            } else {
                z3 = false;
            }
            if ((j2 & 514) != 0) {
                z4 = true;
            }
            if (z2 && z4) {
                c();
            } else if (!z2 && z3) {
                e();
            }
        }
    }

    public final void b(String str) {
    }

    public void c() {
        switch (this.f877f) {
            case 0:
                WebView webView = WebService.f3191r;
                if (webView != null) {
                    webView.evaluateJavascript("actPlayPause(false);", (ValueCallback) null);
                    WebService.f3182D = false;
                    return;
                }
                return;
            default:
                return;
        }
    }

    public final void d() {
    }

    public void e() {
        switch (this.f877f) {
            case 0:
                if (WebService.f3191r != null) {
                    t tVar = WebService.f3187n;
                    WebService.f3191r.evaluateJavascript("actPlayPause(true);", (ValueCallback) null);
                    return;
                }
                return;
            default:
                return;
        }
    }

    public final void f() {
    }

    public final void g(String str) {
    }

    public final void h(long j2) {
    }

    public void i() {
        switch (this.f877f) {
            case 0:
                if (WebService.f3191r != null) {
                    WebService.f3180B = 6;
                    WebService.e();
                    WebService.f3191r.evaluateJavascript("actSkipForward();", (ValueCallback) null);
                    return;
                }
                return;
            default:
                return;
        }
    }

    public final void j() {
    }

    public final void k() {
    }

    public final void l(android.support.v4.media.session.o oVar, Handler handler) {
        synchronized (this.f873a) {
            try {
                this.f876d = new WeakReference(oVar);
                j jVar = this.e;
                j jVar2 = null;
                if (jVar != null) {
                    jVar.removeCallbacksAndMessages((Object) null);
                }
                if (oVar != null) {
                    if (handler != null) {
                        jVar2 = new j((Object) this, handler.getLooper(), 2);
                    }
                }
                this.e = jVar2;
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
