package g1;

import A.b;
import E.d;
import h1.c;
import java.io.IOException;
import java.security.cert.Certificate;
import java.security.cert.CertificateEncodingException;
import java.security.cert.CertificateException;
import java.security.cert.CertificateFactory;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.logging.Logger;
import o1.g;
import r1.h;
import r1.o;
import r1.p;
import r1.q;
import r1.u;
import r1.v;

/* renamed from: g1.g  reason: case insensitive filesystem */
public final class C0108g {

    /* renamed from: k  reason: collision with root package name */
    public static final String f2691k = "OkHttp-Sent-Millis";

    /* renamed from: l  reason: collision with root package name */
    public static final String f2692l = "OkHttp-Received-Millis";

    /* renamed from: a  reason: collision with root package name */
    public final String f2693a;

    /* renamed from: b  reason: collision with root package name */
    public final s f2694b;

    /* renamed from: c  reason: collision with root package name */
    public final String f2695c;

    /* renamed from: d  reason: collision with root package name */
    public final y f2696d;
    public final int e;

    /* renamed from: f  reason: collision with root package name */
    public final String f2697f;

    /* renamed from: g  reason: collision with root package name */
    public final s f2698g;

    /* renamed from: h  reason: collision with root package name */
    public final r f2699h;
    public final long i;

    /* renamed from: j  reason: collision with root package name */
    public final long f2700j;

    public C0108g(v vVar) {
        G g2;
        try {
            Logger logger = o.f4594a;
            q qVar = new q(vVar);
            this.f2693a = qVar.n(Long.MAX_VALUE);
            this.f2695c = qVar.n(Long.MAX_VALUE);
            b bVar = new b(27);
            int f2 = h.f(qVar);
            for (int i2 = 0; i2 < f2; i2++) {
                bVar.q(qVar.n(Long.MAX_VALUE));
            }
            this.f2694b = new s(bVar);
            d c2 = d.c(qVar.n(Long.MAX_VALUE));
            this.f2696d = (y) c2.f95c;
            this.e = c2.f94b;
            this.f2697f = (String) c2.f96d;
            b bVar2 = new b(27);
            int f3 = h.f(qVar);
            for (int i3 = 0; i3 < f3; i3++) {
                bVar2.q(qVar.n(Long.MAX_VALUE));
            }
            String str = f2691k;
            String v2 = bVar2.v(str);
            String str2 = f2692l;
            String v3 = bVar2.v(str2);
            bVar2.B(str);
            bVar2.B(str2);
            long j2 = 0;
            this.i = v2 != null ? Long.parseLong(v2) : 0;
            this.f2700j = v3 != null ? Long.parseLong(v3) : j2;
            this.f2698g = new s(bVar2);
            if (this.f2693a.startsWith("https://")) {
                String n2 = qVar.n(Long.MAX_VALUE);
                if (n2.length() <= 0) {
                    m a2 = m.a(qVar.n(Long.MAX_VALUE));
                    List a3 = a(qVar);
                    List a4 = a(qVar);
                    if (!qVar.f()) {
                        g2 = G.a(qVar.n(Long.MAX_VALUE));
                    } else {
                        g2 = G.SSL_3_0;
                    }
                    this.f2699h = new r(g2, a2, c.k(a3), c.k(a4));
                } else {
                    throw new IOException("expected \"\" but was \"" + n2 + "\"");
                }
            } else {
                this.f2699h = null;
            }
        } finally {
            vVar.close();
        }
    }

    public final void c(i1.d dVar) {
        String str;
        u d2 = dVar.d(0);
        Logger logger = o.f4594a;
        p pVar = new p(d2);
        String str2 = this.f2693a;
        pVar.c(str2);
        pVar.d(10);
        pVar.c(this.f2695c);
        pVar.d(10);
        s sVar = this.f2694b;
        pVar.h((long) sVar.d());
        pVar.d(10);
        int d3 = sVar.d();
        for (int i2 = 0; i2 < d3; i2++) {
            pVar.c(sVar.b(i2));
            pVar.c(": ");
            pVar.c(sVar.e(i2));
            pVar.d(10);
        }
        StringBuilder sb = new StringBuilder();
        if (this.f2696d == y.HTTP_1_0) {
            str = "HTTP/1.0";
        } else {
            str = "HTTP/1.1";
        }
        sb.append(str);
        sb.append(' ');
        sb.append(this.e);
        String str3 = this.f2697f;
        if (str3 != null) {
            sb.append(' ');
            sb.append(str3);
        }
        pVar.c(sb.toString());
        pVar.d(10);
        s sVar2 = this.f2698g;
        pVar.h((long) (sVar2.d() + 2));
        pVar.d(10);
        int d4 = sVar2.d();
        for (int i3 = 0; i3 < d4; i3++) {
            pVar.c(sVar2.b(i3));
            pVar.c(": ");
            pVar.c(sVar2.e(i3));
            pVar.d(10);
        }
        pVar.c(f2691k);
        pVar.c(": ");
        pVar.h(this.i);
        pVar.d(10);
        pVar.c(f2692l);
        pVar.c(": ");
        pVar.h(this.f2700j);
        pVar.d(10);
        if (str2.startsWith("https://")) {
            pVar.d(10);
            r rVar = this.f2699h;
            pVar.c(rVar.f2763b.f2735a);
            pVar.d(10);
            b(pVar, rVar.f2764c);
            b(pVar, rVar.f2765d);
            pVar.c(rVar.f2762a.f2668a);
            pVar.d(10);
        }
        pVar.close();
    }

    static {
        g gVar = g.f4433a;
        gVar.getClass();
        gVar.getClass();
    }

    /* JADX WARNING: type inference failed for: r5v0, types: [r1.e, java.lang.Object, r1.g] */
    public static List a(q qVar) {
        int f2 = h.f(qVar);
        if (f2 == -1) {
            return Collections.emptyList();
        }
        try {
            CertificateFactory instance = CertificateFactory.getInstance("X.509");
            ArrayList arrayList = new ArrayList(f2);
            int i2 = 0;
            while (i2 < f2) {
                String n2 = qVar.n(Long.MAX_VALUE);
                ? obj = new Object();
                h b2 = h.b(n2);
                if (b2 != null) {
                    b2.p(obj);
                    arrayList.add(instance.generateCertificate(new r1.d(obj, 0)));
                    i2++;
                } else {
                    throw new IllegalArgumentException("byteString == null");
                }
            }
            return arrayList;
        } catch (CertificateException e2) {
            throw new IOException(e2.getMessage());
        }
    }

    public static void b(p pVar, List list) {
        try {
            pVar.h((long) list.size());
            pVar.d(10);
            int size = list.size();
            for (int i2 = 0; i2 < size; i2++) {
                pVar.c(h.i(((Certificate) list.get(i2)).getEncoded()).a());
                pVar.d(10);
            }
        } catch (CertificateEncodingException e2) {
            throw new IOException(e2.getMessage());
        }
    }

    public C0108g(C c2) {
        s sVar;
        A a2 = c2.f2646a;
        this.f2693a = a2.f2632a.f2780h;
        int i2 = k1.d.f3573a;
        s sVar2 = c2.f2652h.f2646a.f2634c;
        s sVar3 = c2.f2650f;
        Set f2 = k1.d.f(sVar3);
        if (f2.isEmpty()) {
            sVar = new s(new b(27));
        } else {
            b bVar = new b(27);
            int d2 = sVar2.d();
            for (int i3 = 0; i3 < d2; i3++) {
                String b2 = sVar2.b(i3);
                if (f2.contains(b2)) {
                    String e2 = sVar2.e(i3);
                    b.s(b2, e2);
                    bVar.r(b2, e2);
                }
            }
            sVar = new s(bVar);
        }
        this.f2694b = sVar;
        this.f2695c = a2.f2633b;
        this.f2696d = c2.f2647b;
        this.e = c2.f2648c;
        this.f2697f = c2.f2649d;
        this.f2698g = sVar3;
        this.f2699h = c2.e;
        this.i = c2.f2654k;
        this.f2700j = c2.f2655l;
    }
}
