package l1;

import r1.e;
import r1.k;
import r1.p;
import r1.u;
import r1.x;

public final class b implements u {

    /* renamed from: a  reason: collision with root package name */
    public final k f3595a;

    /* renamed from: b  reason: collision with root package name */
    public boolean f3596b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ g f3597c;

    public final synchronized void close() {
        if (!this.f3596b) {
            this.f3596b = true;
            this.f3597c.f3608d.c("0\r\n\r\n");
            g gVar = this.f3597c;
            k kVar = this.f3595a;
            gVar.getClass();
            x xVar = kVar.e;
            kVar.e = x.f4612d;
            xVar.a();
            xVar.b();
            this.f3597c.e = 3;
        }
    }

    public final synchronized void flush() {
        if (!this.f3596b) {
            this.f3597c.f3608d.flush();
        }
    }

    public final x a() {
        return this.f3595a;
    }

    public final void b(e eVar, long j2) {
        if (this.f3596b) {
            throw new IllegalStateException("closed");
        } else if (j2 != 0) {
            g gVar = this.f3597c;
            p pVar = gVar.f3608d;
            if (!pVar.f4597c) {
                pVar.f4595a.x(j2);
                pVar.f();
                p pVar2 = gVar.f3608d;
                pVar2.c("\r\n");
                pVar2.b(eVar, j2);
                pVar2.c("\r\n");
                return;
            }
            throw new IllegalStateException("closed");
        }
    }

    public b(g gVar) {
        this.f3597c = gVar;
        this.f3595a = new k(gVar.f3608d.f4596b.a());
    }
}
