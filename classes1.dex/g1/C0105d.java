package g1;

import h1.c;
import i1.d;
import java.io.IOException;
import r1.u;

/* renamed from: g1.d  reason: case insensitive filesystem */
public final class C0105d {

    /* renamed from: a  reason: collision with root package name */
    public final d f2683a;

    /* renamed from: b  reason: collision with root package name */
    public final u f2684b;

    /* renamed from: c  reason: collision with root package name */
    public final C0104c f2685c;

    /* renamed from: d  reason: collision with root package name */
    public boolean f2686d;
    public final /* synthetic */ h e;

    public final void a() {
        synchronized (this.e) {
            try {
                if (!this.f2686d) {
                    this.f2686d = true;
                    this.e.getClass();
                    c.c(this.f2684b);
                    try {
                        this.f2683a.a();
                    } catch (IOException unused) {
                    }
                }
            } catch (Throwable th) {
                while (true) {
                    throw th;
                }
            }
        }
    }

    public C0105d(h hVar, d dVar) {
        this.e = hVar;
        this.f2683a = dVar;
        u d2 = dVar.d(1);
        this.f2684b = d2;
        this.f2685c = new C0104c(this, d2, dVar);
    }
}
