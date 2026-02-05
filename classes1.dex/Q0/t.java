package Q0;

import A.b;
import A.k;
import N0.p;
import android.net.NetworkInfo;
import g1.A;
import g1.C;
import g1.C0103b;
import g1.E;
import g1.i;
import g1.j;
import g1.x;
import g1.z;
import java.io.IOException;
import o1.g;
import r1.v;

public final class t extends B {

    /* renamed from: a  reason: collision with root package name */
    public final b f840a;

    /* renamed from: b  reason: collision with root package name */
    public final C f841b;

    public final int b() {
        return 2;
    }

    public final p c(z zVar, int i) {
        j jVar;
        int i2;
        if (i == 0) {
            jVar = null;
        } else if ((i & 4) != 0) {
            jVar = j.f2707n;
        } else {
            i iVar = new i();
            if ((i & 1) != 0) {
                iVar.f2704b = true;
            }
            if ((i & 2) != 0) {
                iVar.f2705c = true;
            }
            jVar = new j(iVar);
        }
        k kVar = new k(5);
        kVar.s(zVar.f853a.toString());
        if (jVar != null) {
            String jVar2 = jVar.toString();
            if (jVar2.isEmpty()) {
                ((b) kVar.f23h).B("Cache-Control");
            } else {
                kVar.j("Cache-Control", jVar2);
            }
        }
        A b2 = kVar.b();
        x xVar = (x) this.f840a.f2g;
        xVar.getClass();
        z zVar2 = new z(xVar, b2);
        xVar.f2804d.getClass();
        zVar2.f2829c = C0103b.f2680d;
        synchronized (zVar2) {
            if (!zVar2.e) {
                zVar2.e = true;
            } else {
                throw new IllegalStateException("Already Executed");
            }
        }
        zVar2.f2828b.f3585b = g.f4433a.i();
        zVar2.f2829c.getClass();
        try {
            xVar.f2801a.v(zVar2);
            C a2 = zVar2.a();
            xVar.f2801a.x(zVar2);
            E e = a2.f2651g;
            int i3 = a2.f2648c;
            if (i3 < 200 || i3 >= 300) {
                e.close();
                throw new IOException(E.e("HTTP ", a2.f2648c));
            }
            if (a2.i == null) {
                i2 = 3;
            } else {
                i2 = 2;
            }
            if (i2 == 2 && e.f() == 0) {
                e.close();
                throw new IOException("Received response with 0 content-length header.");
            }
            if (i2 == 3 && e.f() > 0) {
                C c2 = this.f841b;
                long f2 = e.f();
                j jVar3 = c2.f760b;
                jVar3.sendMessage(jVar3.obtainMessage(4, Long.valueOf(f2)));
            }
            return new p((v) e.g(), i2);
        } catch (IOException e2) {
            zVar2.f2829c.getClass();
            throw e2;
        } catch (Throwable th) {
            zVar2.f2827a.f2801a.x(zVar2);
            throw th;
        }
    }

    public final boolean a(z zVar) {
        String scheme = zVar.f853a.getScheme();
        if ("http".equals(scheme) || "https".equals(scheme)) {
            return true;
        }
        return false;
    }

    public final boolean d(NetworkInfo networkInfo) {
        if (networkInfo == null || networkInfo.isConnected()) {
            return true;
        }
        return false;
    }

    public t(b bVar, C c2) {
        this.f840a = bVar;
        this.f841b = c2;
    }
}
