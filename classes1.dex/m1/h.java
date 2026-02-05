package m1;

import T0.g;
import g1.A;
import g1.C;
import g1.D;
import g1.s;
import h1.c;
import j1.f;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.TimeUnit;
import java.util.logging.Logger;
import k1.b;
import k1.d;
import k1.e;
import r1.o;
import r1.q;
import r1.u;

public final class h implements b {
    public static final List e;

    /* renamed from: f  reason: collision with root package name */
    public static final List f3709f;

    /* renamed from: a  reason: collision with root package name */
    public final e f3710a;

    /* renamed from: b  reason: collision with root package name */
    public final f f3711b;

    /* renamed from: c  reason: collision with root package name */
    public final s f3712c;

    /* renamed from: d  reason: collision with root package name */
    public y f3713d;

    static {
        r1.h f2 = r1.h.f("connection");
        r1.h f3 = r1.h.f("host");
        r1.h f4 = r1.h.f("keep-alive");
        r1.h f5 = r1.h.f("proxy-connection");
        r1.h f6 = r1.h.f("transfer-encoding");
        r1.h f7 = r1.h.f("te");
        r1.h f8 = r1.h.f("encoding");
        r1.h f9 = r1.h.f("upgrade");
        e = c.l(f2, f3, f4, f5, f7, f6, f8, f9, C0179b.f3680f, C0179b.f3681g, C0179b.f3682h, C0179b.i);
        f3709f = c.l(f2, f3, f4, f5, f7, f6, f8, f9);
    }

    public final u a(A a2, long j2) {
        return this.f3713d.e();
    }

    public final void b(A a2) {
        int i;
        y yVar;
        if (this.f3713d == null) {
            a2.getClass();
            s sVar = a2.f2634c;
            ArrayList arrayList = new ArrayList(sVar.d() + 4);
            arrayList.add(new C0179b(C0179b.f3680f, a2.f2633b));
            r1.h hVar = C0179b.f3681g;
            g1.u uVar = a2.f2632a;
            arrayList.add(new C0179b(hVar, g.J(uVar)));
            String a3 = a2.f2634c.a("Host");
            if (a3 != null) {
                arrayList.add(new C0179b(C0179b.i, a3));
            }
            arrayList.add(new C0179b(C0179b.f3682h, uVar.f2774a));
            int d2 = sVar.d();
            for (int i2 = 0; i2 < d2; i2++) {
                r1.h f2 = r1.h.f(sVar.b(i2).toLowerCase(Locale.US));
                if (!e.contains(f2)) {
                    arrayList.add(new C0179b(f2, sVar.e(i2)));
                }
            }
            s sVar2 = this.f3712c;
            boolean z2 = !false;
            synchronized (sVar2.f3755r) {
                synchronized (sVar2) {
                    try {
                        if (sVar2.f3744f > 1073741823) {
                            sVar2.k(5);
                        }
                        if (!sVar2.f3745g) {
                            i = sVar2.f3744f;
                            sVar2.f3744f = i + 2;
                            yVar = new y(i, sVar2, z2, false, arrayList);
                            if (yVar.g()) {
                                sVar2.f3742c.put(Integer.valueOf(i), yVar);
                            }
                        } else {
                            throw new IOException();
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                sVar2.f3755r.n(z2, i, arrayList);
            }
            sVar2.f3755r.flush();
            this.f3713d = yVar;
            TimeUnit timeUnit = TimeUnit.MILLISECONDS;
            yVar.i.g((long) this.f3710a.f3581j, timeUnit);
            this.f3713d.f3785j.g((long) this.f3710a.f3582k, timeUnit);
        }
    }

    public final void c() {
        this.f3713d.e().close();
    }

    public final void d() {
        this.f3712c.flush();
    }

    public final D e(C c2) {
        this.f3711b.e.getClass();
        c2.g("Content-Type");
        long a2 = d.a(c2);
        g gVar = new g(this, this.f3713d.f3783g);
        Logger logger = o.f4594a;
        return new D(a2, new q(gVar), 1);
    }

    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* JADX WARNING: Missing exception handler attribute for start block: B:13:0x001a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final g1.B f(boolean r10) {
        /*
            r9 = this;
            m1.y r0 = r9.f3713d
            monitor-enter(r0)
            boolean r1 = r0.f()     // Catch:{ all -> 0x00e4 }
            if (r1 == 0) goto L_0x00ec
            m1.x r1 = r0.i     // Catch:{ all -> 0x00e4 }
            r1.i()     // Catch:{ all -> 0x00e4 }
        L_0x000e:
            java.util.ArrayList r1 = r0.e     // Catch:{ all -> 0x0020 }
            if (r1 != 0) goto L_0x0023
            int r1 = r0.f3786k     // Catch:{ all -> 0x0020 }
            if (r1 != 0) goto L_0x0023
            r0.wait()     // Catch:{ InterruptedException -> 0x001a }
            goto L_0x000e
        L_0x001a:
            java.io.InterruptedIOException r10 = new java.io.InterruptedIOException     // Catch:{ all -> 0x0020 }
            r10.<init>()     // Catch:{ all -> 0x0020 }
            throw r10     // Catch:{ all -> 0x0020 }
        L_0x0020:
            r10 = move-exception
            goto L_0x00e6
        L_0x0023:
            m1.x r1 = r0.i     // Catch:{ all -> 0x00e4 }
            r1.n()     // Catch:{ all -> 0x00e4 }
            java.util.ArrayList r1 = r0.e     // Catch:{ all -> 0x00e4 }
            if (r1 == 0) goto L_0x00dc
            r2 = 0
            r0.e = r2     // Catch:{ all -> 0x00e4 }
            monitor-exit(r0)
            A.b r0 = new A.b
            r3 = 27
            r0.<init>((int) r3)
            int r3 = r1.size()
            r4 = 0
            r5 = r2
        L_0x003d:
            r6 = 100
            if (r4 >= r3) goto L_0x0092
            java.lang.Object r7 = r1.get(r4)
            m1.b r7 = (m1.C0179b) r7
            if (r7 != 0) goto L_0x0058
            if (r5 == 0) goto L_0x008f
            int r7 = r5.f94b
            if (r7 != r6) goto L_0x008f
            A.b r0 = new A.b
            r5 = 27
            r0.<init>((int) r5)
            r5 = r2
            goto L_0x008f
        L_0x0058:
            r1.h r6 = r7.f3684b
            java.lang.String r6 = r6.o()
            r1.h r8 = m1.C0179b.e
            r1.h r7 = r7.f3683a
            boolean r8 = r7.equals(r8)
            if (r8 == 0) goto L_0x007b
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            java.lang.String r7 = "HTTP/1.1 "
            r5.<init>(r7)
            r5.append(r6)
            java.lang.String r5 = r5.toString()
            E.d r5 = E.d.c(r5)
            goto L_0x008f
        L_0x007b:
            java.util.List r8 = f3709f
            boolean r8 = r8.contains(r7)
            if (r8 != 0) goto L_0x008f
            g1.b r8 = g1.C0103b.e
            java.lang.String r7 = r7.o()
            r8.getClass()
            r0.r(r7, r6)
        L_0x008f:
            int r4 = r4 + 1
            goto L_0x003d
        L_0x0092:
            if (r5 == 0) goto L_0x00d4
            g1.B r1 = new g1.B
            r1.<init>()
            g1.y r3 = g1.y.HTTP_2
            r1.f2637b = r3
            int r3 = r5.f94b
            r1.f2638c = r3
            java.lang.Object r3 = r5.f96d
            java.lang.String r3 = (java.lang.String) r3
            r1.f2639d = r3
            java.lang.Object r0 = r0.f2g
            java.util.ArrayList r0 = (java.util.ArrayList) r0
            int r3 = r0.size()
            java.lang.String[] r3 = new java.lang.String[r3]
            java.lang.Object[] r0 = r0.toArray(r3)
            java.lang.String[] r0 = (java.lang.String[]) r0
            A.b r3 = new A.b
            r4 = 27
            r3.<init>((int) r4)
            java.lang.Object r4 = r3.f2g
            java.util.ArrayList r4 = (java.util.ArrayList) r4
            java.util.Collections.addAll(r4, r0)
            r1.f2640f = r3
            if (r10 == 0) goto L_0x00d3
            g1.b r10 = g1.C0103b.e
            r10.getClass()
            int r10 = r1.f2638c
            if (r10 != r6) goto L_0x00d3
            return r2
        L_0x00d3:
            return r1
        L_0x00d4:
            java.net.ProtocolException r10 = new java.net.ProtocolException
            java.lang.String r0 = "Expected ':status' header not present"
            r10.<init>(r0)
            throw r10
        L_0x00dc:
            m1.D r10 = new m1.D     // Catch:{ all -> 0x00e4 }
            int r1 = r0.f3786k     // Catch:{ all -> 0x00e4 }
            r10.<init>(r1)     // Catch:{ all -> 0x00e4 }
            throw r10     // Catch:{ all -> 0x00e4 }
        L_0x00e4:
            r10 = move-exception
            goto L_0x00f4
        L_0x00e6:
            m1.x r1 = r0.i     // Catch:{ all -> 0x00e4 }
            r1.n()     // Catch:{ all -> 0x00e4 }
            throw r10     // Catch:{ all -> 0x00e4 }
        L_0x00ec:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException     // Catch:{ all -> 0x00e4 }
            java.lang.String r1 = "servers cannot read response headers"
            r10.<init>(r1)     // Catch:{ all -> 0x00e4 }
            throw r10     // Catch:{ all -> 0x00e4 }
        L_0x00f4:
            monitor-exit(r0)     // Catch:{ all -> 0x00e4 }
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: m1.h.f(boolean):g1.B");
    }

    public h(e eVar, f fVar, s sVar) {
        this.f3710a = eVar;
        this.f3711b = fVar;
        this.f3712c = sVar;
    }
}
