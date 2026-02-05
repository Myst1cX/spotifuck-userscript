package androidx.lifecycle;

import A.b;
import C.a;
import Z0.c;
import android.os.Handler;

public final class C implements r {

    /* renamed from: n  reason: collision with root package name */
    public static final C f1789n = new C();

    /* renamed from: f  reason: collision with root package name */
    public int f1790f;

    /* renamed from: g  reason: collision with root package name */
    public int f1791g;

    /* renamed from: h  reason: collision with root package name */
    public boolean f1792h = true;
    public boolean i = true;

    /* renamed from: j  reason: collision with root package name */
    public Handler f1793j;

    /* renamed from: k  reason: collision with root package name */
    public final t f1794k = new t(this);

    /* renamed from: l  reason: collision with root package name */
    public final a f1795l = new a(11, (Object) this);

    /* renamed from: m  reason: collision with root package name */
    public final b f1796m = new b(20, (Object) this);

    public final void a() {
        int i2 = this.f1791g + 1;
        this.f1791g = i2;
        if (i2 != 1) {
            return;
        }
        if (this.f1792h) {
            this.f1794k.d(C0077l.ON_RESUME);
            this.f1792h = false;
            return;
        }
        Handler handler = this.f1793j;
        c.b(handler);
        handler.removeCallbacks(this.f1795l);
    }

    public final t d() {
        return this.f1794k;
    }
}
