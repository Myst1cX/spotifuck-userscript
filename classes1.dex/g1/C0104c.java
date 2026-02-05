package g1;

import i1.d;
import r1.i;
import r1.u;

/* renamed from: g1.c  reason: case insensitive filesystem */
public final class C0104c extends i {

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ d f2681b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ C0105d f2682c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C0104c(C0105d dVar, u uVar, d dVar2) {
        super(uVar);
        this.f2682c = dVar;
        this.f2681b = dVar2;
    }

    public final void close() {
        synchronized (this.f2682c.e) {
            try {
                C0105d dVar = this.f2682c;
                if (!dVar.f2686d) {
                    dVar.f2686d = true;
                    dVar.e.getClass();
                    super.close();
                    this.f2681b.b();
                }
            } catch (Throwable th) {
                while (true) {
                    throw th;
                }
            }
        }
    }
}
