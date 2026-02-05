package k1;

import T0.g;
import g1.A;
import g1.B;
import g1.C;
import g1.E;
import g1.v;
import j1.f;
import java.net.ProtocolException;

public final class a implements v {
    public final C a(e eVar) {
        long currentTimeMillis = System.currentTimeMillis();
        eVar.f3580h.getClass();
        b bVar = eVar.f3576c;
        A a2 = eVar.f3578f;
        bVar.b(a2);
        g.H(a2.f2633b);
        f fVar = eVar.f3575b;
        bVar.c();
        B f2 = bVar.f(false);
        f2.f2636a = a2;
        f2.e = fVar.a().f3531f;
        f2.f2644k = currentTimeMillis;
        f2.f2645l = System.currentTimeMillis();
        C a3 = f2.a();
        int i = a3.f2648c;
        if (i == 100) {
            B f3 = bVar.f(false);
            f3.f2636a = a2;
            f3.e = fVar.a().f3531f;
            f3.f2644k = currentTimeMillis;
            f3.f2645l = System.currentTimeMillis();
            a3 = f3.a();
            i = a3.f2648c;
        }
        B h2 = a3.h();
        h2.f2641g = bVar.e(a3);
        C a4 = h2.a();
        if ("close".equalsIgnoreCase(a4.f2646a.f2634c.a("Connection")) || "close".equalsIgnoreCase(a4.g("Connection"))) {
            fVar.e();
        }
        if (i == 204 || i == 205) {
            E e = a4.f2651g;
            if (e.f() > 0) {
                throw new ProtocolException("HTTP " + i + " had non-zero Content-Length: " + e.f());
            }
        }
        return a4;
    }
}
