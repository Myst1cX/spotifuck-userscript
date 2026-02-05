package m1;

import K.j;
import h1.a;

public final class q extends a {

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ int f3735b = 1;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ Object f3736c;

    /* renamed from: d  reason: collision with root package name */
    public final Object f3737d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public q(s sVar, u uVar) {
        super("OkHttp %s", sVar.f3743d);
        this.f3736c = sVar;
        this.f3737d = uVar;
    }

    /* JADX WARNING: Missing exception handler attribute for start block: B:19:0x002b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a() {
        /*
            r7 = this;
            r0 = 2
            java.lang.Object r1 = r7.f3737d
            java.lang.Object r2 = r7.f3736c
            int r3 = r7.f3735b
            switch(r3) {
                case 0: goto L_0x0048;
                case 1: goto L_0x0030;
                default: goto L_0x000a;
            }
        L_0x000a:
            m1.s r2 = (m1.s) r2
            m1.u r1 = (m1.u) r1
            r1.h(r7)     // Catch:{ IOException -> 0x002b, all -> 0x0022 }
        L_0x0011:
            r3 = 0
            boolean r3 = r1.g(r3, r7)     // Catch:{ IOException -> 0x002b, all -> 0x0022 }
            if (r3 == 0) goto L_0x0019
            goto L_0x0011
        L_0x0019:
            r0 = 1
            r3 = 6
            r2.f(r0, r3)     // Catch:{ IOException -> 0x001e }
        L_0x001e:
            h1.c.c(r1)
            goto L_0x002f
        L_0x0022:
            r0 = move-exception
            r3 = 3
            r2.f(r3, r3)     // Catch:{ IOException -> 0x0027 }
        L_0x0027:
            h1.c.c(r1)
            throw r0
        L_0x002b:
            r2.f(r0, r0)     // Catch:{ IOException -> 0x001e }
            goto L_0x001e
        L_0x002f:
            return
        L_0x0030:
            m1.q r2 = (m1.q) r2
            java.lang.Object r0 = r2.f3736c     // Catch:{ IOException -> 0x003e }
            m1.s r0 = (m1.s) r0     // Catch:{ IOException -> 0x003e }
            m1.z r0 = r0.f3755r     // Catch:{ IOException -> 0x003e }
            K.j r1 = (K.j) r1     // Catch:{ IOException -> 0x003e }
            r0.f(r1)     // Catch:{ IOException -> 0x003e }
            goto L_0x0047
        L_0x003e:
            java.lang.Object r0 = r2.f3736c
            m1.s r0 = (m1.s) r0
            java.util.concurrent.ThreadPoolExecutor r1 = m1.s.f3739u
            r0.g()
        L_0x0047:
            return
        L_0x0048:
            m1.y r1 = (m1.y) r1
            m1.q r2 = (m1.q) r2
            java.lang.Object r3 = r2.f3736c     // Catch:{ IOException -> 0x0056 }
            m1.s r3 = (m1.s) r3     // Catch:{ IOException -> 0x0056 }
            m1.o r3 = r3.f3741b     // Catch:{ IOException -> 0x0056 }
            r3.b(r1)     // Catch:{ IOException -> 0x0056 }
            goto L_0x0074
        L_0x0056:
            r3 = move-exception
            o1.g r4 = o1.g.f4433a
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            java.lang.String r6 = "Http2Connection.Listener failure for "
            r5.<init>(r6)
            java.lang.Object r2 = r2.f3736c
            m1.s r2 = (m1.s) r2
            java.lang.String r2 = r2.f3743d
            r5.append(r2)
            java.lang.String r2 = r5.toString()
            r5 = 4
            r4.k(r5, r2, r3)
            r1.c(r0)     // Catch:{ IOException -> 0x0074 }
        L_0x0074:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: m1.q.a():void");
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public q(q qVar, Object[] objArr, y yVar) {
        super("OkHttp %s stream %d", objArr);
        this.f3736c = qVar;
        this.f3737d = yVar;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public q(q qVar, Object[] objArr, j jVar) {
        super("OkHttp %s ACK Settings", objArr);
        this.f3736c = qVar;
        this.f3737d = jVar;
    }
}
