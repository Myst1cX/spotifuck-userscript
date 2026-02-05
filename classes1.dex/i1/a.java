package i1;

import g1.C0105d;
import h1.c;
import java.io.IOException;
import java.util.concurrent.TimeUnit;
import r1.e;
import r1.g;
import r1.p;
import r1.v;
import r1.x;

public final class a implements v {

    /* renamed from: a  reason: collision with root package name */
    public boolean f3093a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ g f3094b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ C0105d f3095c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ p f3096d;

    public final long e(e eVar, long j2) {
        try {
            long e = this.f3094b.e(eVar, 8192);
            p pVar = this.f3096d;
            if (e == -1) {
                if (!this.f3093a) {
                    this.f3093a = true;
                    pVar.close();
                }
                return -1;
            }
            eVar.f(pVar.f4595a, eVar.f4579b - e, e);
            pVar.f();
            return e;
        } catch (IOException e2) {
            if (!this.f3093a) {
                this.f3093a = true;
                this.f3095c.a();
            }
            throw e2;
        }
    }

    public final x a() {
        return this.f3094b.a();
    }

    public final void close() {
        boolean z2;
        if (!this.f3093a) {
            try {
                z2 = c.p(this, 100, TimeUnit.MILLISECONDS);
            } catch (IOException unused) {
                z2 = false;
            }
            if (!z2) {
                this.f3093a = true;
                this.f3095c.a();
            }
        }
        this.f3094b.close();
    }

    public a(g gVar, C0105d dVar, p pVar) {
        this.f3094b = gVar;
        this.f3095c = dVar;
        this.f3096d = pVar;
    }
}
