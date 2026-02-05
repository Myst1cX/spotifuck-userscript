package l1;

import j1.f;
import java.io.IOException;
import r1.e;
import r1.k;
import r1.v;
import r1.x;

public abstract class a implements v {

    /* renamed from: a  reason: collision with root package name */
    public final k f3591a;

    /* renamed from: b  reason: collision with root package name */
    public boolean f3592b;

    /* renamed from: c  reason: collision with root package name */
    public long f3593c = 0;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ g f3594d;

    public final x a() {
        return this.f3591a;
    }

    public long e(e eVar, long j2) {
        try {
            long e = this.f3594d.f3607c.e(eVar, j2);
            if (e > 0) {
                this.f3593c += e;
            }
            return e;
        } catch (IOException e2) {
            f(false, e2);
            throw e2;
        }
    }

    public final void f(boolean z2, IOException iOException) {
        g gVar = this.f3594d;
        int i = gVar.e;
        if (i != 6) {
            if (i == 5) {
                k kVar = this.f3591a;
                x xVar = kVar.e;
                kVar.e = x.f4612d;
                xVar.a();
                xVar.b();
                gVar.e = 6;
                f fVar = gVar.f3606b;
                if (fVar != null) {
                    fVar.h(!z2, gVar, iOException);
                    return;
                }
                return;
            }
            throw new IllegalStateException("state: " + gVar.e);
        }
    }

    public a(g gVar) {
        this.f3594d = gVar;
        this.f3591a = new k(gVar.f3607c.f4599b.a());
    }
}
