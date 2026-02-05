package l1;

import g1.A;
import g1.B;
import g1.C;
import g1.C0103b;
import g1.D;
import g1.s;
import g1.u;
import g1.x;
import g1.y;
import j1.f;
import java.io.EOFException;
import java.io.IOException;
import java.net.Proxy;
import java.util.ArrayList;
import java.util.Collections;
import java.util.logging.Logger;
import k1.b;
import k1.d;
import r1.o;
import r1.p;
import r1.q;

public final class g implements b {

    /* renamed from: a  reason: collision with root package name */
    public final x f3605a;

    /* renamed from: b  reason: collision with root package name */
    public final f f3606b;

    /* renamed from: c  reason: collision with root package name */
    public final q f3607c;

    /* renamed from: d  reason: collision with root package name */
    public final p f3608d;
    public int e = 0;

    /* renamed from: f  reason: collision with root package name */
    public long f3609f = 262144;

    public final D e(C c2) {
        f fVar = this.f3606b;
        fVar.e.getClass();
        c2.g("Content-Type");
        if (!d.b(c2)) {
            e g2 = g(0);
            Logger logger = o.f4594a;
            return new D(0, new q(g2), 1);
        } else if ("chunked".equalsIgnoreCase(c2.g("Transfer-Encoding"))) {
            u uVar = c2.f2646a.f2632a;
            if (this.e == 4) {
                this.e = 5;
                c cVar = new c(this, uVar);
                Logger logger2 = o.f4594a;
                return new D(-1, new q(cVar), 1);
            }
            throw new IllegalStateException("state: " + this.e);
        } else {
            long a2 = d.a(c2);
            if (a2 != -1) {
                e g3 = g(a2);
                Logger logger3 = o.f4594a;
                return new D(a2, new q(g3), 1);
            } else if (this.e == 4) {
                this.e = 5;
                fVar.e();
                a aVar = new a(this);
                Logger logger4 = o.f4594a;
                return new D(-1, new q(aVar), 1);
            } else {
                throw new IllegalStateException("state: " + this.e);
            }
        }
    }

    public final r1.u a(A a2, long j2) {
        if ("chunked".equalsIgnoreCase(a2.f2634c.a("Transfer-Encoding"))) {
            if (this.e == 1) {
                this.e = 2;
                return new b(this);
            }
            throw new IllegalStateException("state: " + this.e);
        } else if (j2 == -1) {
            throw new IllegalStateException("Cannot stream a request body without chunked encoding or a known content length!");
        } else if (this.e == 1) {
            this.e = 2;
            return new d(this, j2);
        } else {
            throw new IllegalStateException("state: " + this.e);
        }
    }

    public final void b(A a2) {
        Proxy.Type type = this.f3606b.a().f3529c.f2661b.type();
        StringBuilder sb = new StringBuilder();
        sb.append(a2.f2633b);
        sb.append(' ');
        u uVar = a2.f2632a;
        if (uVar.f2774a.equals("https") || type != Proxy.Type.HTTP) {
            sb.append(T0.g.J(uVar));
        } else {
            sb.append(uVar);
        }
        sb.append(" HTTP/1.1");
        h(a2.f2634c, sb.toString());
    }

    public final void c() {
        this.f3608d.flush();
    }

    public final void d() {
        this.f3608d.flush();
    }

    public final B f(boolean z2) {
        q qVar = this.f3607c;
        int i = this.e;
        if (i == 1 || i == 3) {
            try {
                String n2 = qVar.n(this.f3609f);
                this.f3609f -= (long) n2.length();
                E.d c2 = E.d.c(n2);
                int i2 = c2.f94b;
                B b2 = new B();
                b2.f2637b = (y) c2.f95c;
                b2.f2638c = i2;
                b2.f2639d = (String) c2.f96d;
                A.b bVar = new A.b(27);
                while (true) {
                    String n3 = qVar.n(this.f3609f);
                    this.f3609f -= (long) n3.length();
                    if (n3.length() == 0) {
                        break;
                    }
                    C0103b.e.getClass();
                    bVar.q(n3);
                }
                ArrayList arrayList = (ArrayList) bVar.f2g;
                A.b bVar2 = new A.b(27);
                Collections.addAll((ArrayList) bVar2.f2g, (String[]) arrayList.toArray(new String[arrayList.size()]));
                b2.f2640f = bVar2;
                if (z2 && i2 == 100) {
                    return null;
                }
                if (i2 == 100) {
                    this.e = 3;
                    return b2;
                }
                this.e = 4;
                return b2;
            } catch (EOFException e2) {
                IOException iOException = new IOException("unexpected end of stream on " + this.f3606b);
                iOException.initCause(e2);
                throw iOException;
            }
        } else {
            throw new IllegalStateException("state: " + this.e);
        }
    }

    /* JADX WARNING: type inference failed for: r0v4, types: [l1.a, l1.e] */
    public final e g(long j2) {
        if (this.e == 4) {
            this.e = 5;
            ? aVar = new a(this);
            aVar.e = j2;
            if (j2 == 0) {
                aVar.f(true, (IOException) null);
            }
            return aVar;
        }
        throw new IllegalStateException("state: " + this.e);
    }

    public final void h(s sVar, String str) {
        if (this.e == 0) {
            p pVar = this.f3608d;
            pVar.c(str);
            pVar.c("\r\n");
            int d2 = sVar.d();
            for (int i = 0; i < d2; i++) {
                pVar.c(sVar.b(i));
                pVar.c(": ");
                pVar.c(sVar.e(i));
                pVar.c("\r\n");
            }
            pVar.c("\r\n");
            this.e = 1;
            return;
        }
        throw new IllegalStateException("state: " + this.e);
    }

    public g(x xVar, f fVar, q qVar, p pVar) {
        this.f3605a = xVar;
        this.f3606b = fVar;
        this.f3607c = qVar;
        this.f3608d = pVar;
    }
}
