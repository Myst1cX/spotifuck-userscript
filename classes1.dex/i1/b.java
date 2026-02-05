package i1;

import g1.A;
import g1.B;
import g1.C;
import g1.v;
import g1.x;
import j1.c;
import j1.f;
import java.io.IOException;
import k1.e;

public final class b implements v {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f3097a;

    /* renamed from: b  reason: collision with root package name */
    public final Object f3098b;

    public /* synthetic */ b(int i, Object obj) {
        this.f3097a = i;
        this.f3098b = obj;
    }

    private final C b(e eVar) {
        A a2 = eVar.f3578f;
        f fVar = eVar.f3575b;
        boolean z2 = !a2.f2633b.equals("GET");
        x xVar = (x) this.f3098b;
        fVar.getClass();
        int i = eVar.i;
        int i2 = eVar.f3581j;
        int i3 = eVar.f3582k;
        xVar.getClass();
        try {
            k1.b i4 = fVar.d(i, i2, i3, xVar.f2817s, z2).i(xVar, eVar, fVar);
            synchronized (fVar.f3552d) {
                fVar.f3558l = i4;
            }
            return eVar.b(a2, fVar, i4, fVar.a());
        } catch (IOException e) {
            throw new c(e);
        }
    }

    public static boolean c(String str) {
        if ("Connection".equalsIgnoreCase(str) || "Keep-Alive".equalsIgnoreCase(str) || "Proxy-Authenticate".equalsIgnoreCase(str) || "Proxy-Authorization".equalsIgnoreCase(str) || "TE".equalsIgnoreCase(str) || "Trailers".equalsIgnoreCase(str) || "Transfer-Encoding".equalsIgnoreCase(str) || "Upgrade".equalsIgnoreCase(str)) {
            return false;
        }
        return true;
    }

    public static C d(C c2) {
        if (c2 == null || c2.f2651g == null) {
            return c2;
        }
        B h2 = c2.h();
        h2.f2641g = null;
        return h2.a();
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v2, resolved type: g1.d} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v3, resolved type: g1.d} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v9, resolved type: i1.d} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v10, resolved type: i1.d} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v5, resolved type: g1.d} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v11, resolved type: i1.d} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v12, resolved type: i1.d} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v6, resolved type: g1.d} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v7, resolved type: g1.d} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v67, resolved type: i1.d} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v36, resolved type: i1.d} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:143:0x037c  */
    /* JADX WARNING: Removed duplicated region for block: B:146:0x038b  */
    /* JADX WARNING: Removed duplicated region for block: B:147:0x0393  */
    /* JADX WARNING: Removed duplicated region for block: B:152:0x039c  */
    /* JADX WARNING: Removed duplicated region for block: B:153:0x03a5  */
    /* JADX WARNING: Removed duplicated region for block: B:156:0x03ab  */
    /* JADX WARNING: Removed duplicated region for block: B:169:0x03f6  */
    /* JADX WARNING: Removed duplicated region for block: B:170:0x03fb  */
    /* JADX WARNING: Removed duplicated region for block: B:179:0x045c  */
    /* JADX WARNING: Removed duplicated region for block: B:188:0x0487  */
    /* JADX WARNING: Removed duplicated region for block: B:195:0x0498 A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:199:0x04c9  */
    /* JADX WARNING: Removed duplicated region for block: B:203:0x04e0 A[SYNTHETIC, Splitter:B:203:0x04e0] */
    /* JADX WARNING: Removed duplicated region for block: B:290:0x06b6 A[SYNTHETIC, Splitter:B:290:0x06b6] */
    /* JADX WARNING: Removed duplicated region for block: B:67:0x01f8  */
    /* JADX WARNING: Removed duplicated region for block: B:87:0x0266  */
    /* JADX WARNING: Removed duplicated region for block: B:89:0x0279  */
    /* JADX WARNING: Removed duplicated region for block: B:91:0x0284  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final g1.C a(k1.e r28) {
        /*
            r27 = this;
            r1 = r27
            r0 = r28
            r4 = 0
            int r8 = r1.f3097a
            switch(r8) {
                case 0: goto L_0x0118;
                case 1: goto L_0x0113;
                default: goto L_0x000a;
            }
        L_0x000a:
            g1.A r7 = r0.f3578f
            A.k r8 = r7.a()
            java.lang.String r9 = "Content-Length"
            g1.s r10 = r7.f2634c
            java.lang.String r11 = "Host"
            java.lang.String r12 = r10.a(r11)
            g1.u r13 = r7.f2632a
            if (r12 != 0) goto L_0x0025
            java.lang.String r12 = h1.c.j(r13, r4)
            r8.j(r11, r12)
        L_0x0025:
            java.lang.String r11 = "Connection"
            java.lang.String r12 = r10.a(r11)
            if (r12 != 0) goto L_0x0032
            java.lang.String r12 = "Keep-Alive"
            r8.j(r11, r12)
        L_0x0032:
            java.lang.String r11 = "Accept-Encoding"
            java.lang.String r12 = r10.a(r11)
            java.lang.String r14 = "gzip"
            if (r12 != 0) goto L_0x0049
            java.lang.String r12 = "Range"
            java.lang.String r12 = r10.a(r12)
            if (r12 != 0) goto L_0x0049
            r8.j(r11, r14)
            r11 = 1
            goto L_0x004a
        L_0x0049:
            r11 = 0
        L_0x004a:
            java.lang.Object r12 = r1.f3098b
            g1.b r12 = (g1.C0103b) r12
            r12.getClass()
            java.util.List r15 = java.util.Collections.emptyList()
            boolean r16 = r15.isEmpty()
            if (r16 != 0) goto L_0x008f
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            int r2 = r15.size()
            r3 = 0
        L_0x0065:
            if (r3 >= r2) goto L_0x0086
            if (r3 <= 0) goto L_0x006e
            java.lang.String r5 = "; "
            r4.append(r5)
        L_0x006e:
            java.lang.Object r5 = r15.get(r3)
            g1.q r5 = (g1.q) r5
            java.lang.String r6 = r5.f2755a
            r4.append(r6)
            r6 = 61
            r4.append(r6)
            java.lang.String r5 = r5.f2756b
            r4.append(r5)
            r5 = 1
            int r3 = r3 + r5
            goto L_0x0065
        L_0x0086:
            java.lang.String r2 = r4.toString()
            java.lang.String r3 = "Cookie"
            r8.j(r3, r2)
        L_0x008f:
            java.lang.String r2 = "User-Agent"
            java.lang.String r3 = r10.a(r2)
            if (r3 != 0) goto L_0x009c
            java.lang.String r3 = "okhttp/3.10.0"
            r8.j(r2, r3)
        L_0x009c:
            g1.A r2 = r8.b()
            g1.C r0 = r0.a(r2)
            g1.s r2 = r0.f2650f
            k1.d.d(r12, r13, r2)
            g1.B r3 = r0.h()
            r3.f2636a = r7
            if (r11 == 0) goto L_0x010e
            java.lang.String r4 = "Content-Encoding"
            java.lang.String r5 = r0.g(r4)
            boolean r5 = r14.equalsIgnoreCase(r5)
            if (r5 == 0) goto L_0x010e
            boolean r5 = k1.d.b(r0)
            if (r5 == 0) goto L_0x010e
            r1.l r5 = new r1.l
            g1.E r6 = r0.f2651g
            r1.g r6 = r6.g()
            r5.<init>(r6)
            A.b r2 = r2.c()
            r2.B(r4)
            r2.B(r9)
            java.lang.Object r2 = r2.f2g
            java.util.ArrayList r2 = (java.util.ArrayList) r2
            int r4 = r2.size()
            java.lang.String[] r4 = new java.lang.String[r4]
            java.lang.Object[] r2 = r2.toArray(r4)
            java.lang.String[] r2 = (java.lang.String[]) r2
            A.b r4 = new A.b
            r6 = 27
            r4.<init>((int) r6)
            java.lang.Object r6 = r4.f2g
            java.util.ArrayList r6 = (java.util.ArrayList) r6
            java.util.Collections.addAll(r6, r2)
            r3.f2640f = r4
            java.lang.String r2 = "Content-Type"
            r0.g(r2)
            g1.D r0 = new g1.D
            java.util.logging.Logger r2 = r1.o.f4594a
            r1.q r2 = new r1.q
            r2.<init>(r5)
            r4 = 1
            r5 = -1
            r0.<init>(r5, r2, r4)
            r3.f2641g = r0
        L_0x010e:
            g1.C r0 = r3.a()
            return r0
        L_0x0113:
            g1.C r0 = r27.b(r28)
            return r0
        L_0x0118:
            java.lang.Object r2 = r1.f3098b
            A.b r2 = (A.b) r2
            r3 = 0
            if (r2 == 0) goto L_0x01ee
            g1.A r4 = r0.f3578f
            java.lang.Object r2 = r2.f2g
            g1.h r2 = (g1.h) r2
            r2.getClass()
            g1.u r5 = r4.f2632a
            java.lang.String r5 = r5.f2780h
            r1.h r5 = r1.h.f(r5)
            java.lang.String r6 = "MD5"
            r1.h r5 = r5.e(r6)
            java.lang.String r5 = r5.h()
            i1.g r2 = r2.f2702b     // Catch:{ IOException -> 0x01ee }
            i1.f r2 = r2.i(r5)     // Catch:{ IOException -> 0x01ee }
            if (r2 != 0) goto L_0x0146
            r2 = r3
            r8 = 0
            goto L_0x01f0
        L_0x0146:
            g1.g r5 = new g1.g     // Catch:{ IOException -> 0x01e9 }
            r1.v[] r6 = r2.f3115c     // Catch:{ IOException -> 0x01e9 }
            r8 = 0
            r6 = r6[r8]     // Catch:{ IOException -> 0x01ea }
            r5.<init>((r1.v) r6)     // Catch:{ IOException -> 0x01ea }
            g1.s r6 = r5.f2694b     // Catch:{ IOException -> 0x01ea }
            java.lang.String r9 = r5.f2695c     // Catch:{ IOException -> 0x01ea }
            java.lang.String r10 = r5.f2693a     // Catch:{ IOException -> 0x01ea }
            java.lang.String r11 = "Content-Type"
            g1.s r12 = r5.f2698g
            r12.a(r11)
            java.lang.String r11 = "Content-Length"
            java.lang.String r11 = r12.a(r11)
            A.k r13 = new A.k
            r14 = 5
            r13.<init>((int) r14)
            r13.s(r10)
            r13.n(r9, r3)
            A.b r14 = r6.c()
            r13.f23h = r14
            g1.A r13 = r13.b()
            g1.B r14 = new g1.B
            r14.<init>()
            r14.f2636a = r13
            g1.y r13 = r5.f2696d
            r14.f2637b = r13
            int r13 = r5.e
            r14.f2638c = r13
            java.lang.String r13 = r5.f2697f
            r14.f2639d = r13
            A.b r12 = r12.c()
            r14.f2640f = r12
            g1.f r12 = new g1.f
            r12.<init>(r2, r11)
            r14.f2641g = r12
            g1.r r2 = r5.f2699h
            r14.e = r2
            long r11 = r5.i
            r14.f2644k = r11
            long r11 = r5.f2700j
            r14.f2645l = r11
            g1.C r2 = r14.a()
            g1.u r5 = r4.f2632a
            java.lang.String r5 = r5.f2780h
            boolean r5 = r10.equals(r5)
            if (r5 == 0) goto L_0x01e3
            java.lang.String r5 = r4.f2633b
            boolean r5 = r9.equals(r5)
            if (r5 == 0) goto L_0x01e3
            int r5 = k1.d.f3573a
            g1.s r5 = r2.f2650f
            java.util.Set r5 = k1.d.f(r5)
            java.util.Iterator r5 = r5.iterator()
        L_0x01c7:
            boolean r9 = r5.hasNext()
            if (r9 == 0) goto L_0x01f0
            java.lang.Object r9 = r5.next()
            java.lang.String r9 = (java.lang.String) r9
            java.util.List r10 = r6.f(r9)
            g1.s r11 = r4.f2634c
            java.util.List r9 = r11.f(r9)
            boolean r9 = h1.c.i(r10, r9)
            if (r9 != 0) goto L_0x01c7
        L_0x01e3:
            g1.E r2 = r2.f2651g
            h1.c.c(r2)
            goto L_0x01ef
        L_0x01e9:
            r8 = 0
        L_0x01ea:
            h1.c.c(r2)
            goto L_0x01ef
        L_0x01ee:
            r8 = 0
        L_0x01ef:
            r2 = r3
        L_0x01f0:
            long r4 = java.lang.System.currentTimeMillis()
            g1.A r6 = r0.f3578f
            if (r2 == 0) goto L_0x0266
            long r12 = r2.f2654k
            long r14 = r2.f2655l
            g1.s r8 = r2.f2650f
            int r10 = r8.d()
            r17 = r3
            r19 = r17
            r20 = r19
            r21 = r20
            r22 = r21
            r23 = r22
            r11 = 0
            r18 = -1
        L_0x0211:
            if (r11 >= r10) goto L_0x0263
            java.lang.String r3 = r8.b(r11)
            java.lang.String r7 = r8.e(r11)
            java.lang.String r9 = "Date"
            boolean r9 = r9.equalsIgnoreCase(r3)
            if (r9 == 0) goto L_0x022b
            java.util.Date r17 = k1.c.a(r7)
            r23 = r7
        L_0x0229:
            r3 = 1
            goto L_0x0260
        L_0x022b:
            java.lang.String r9 = "Expires"
            boolean r9 = r9.equalsIgnoreCase(r3)
            if (r9 == 0) goto L_0x0238
            java.util.Date r20 = k1.c.a(r7)
            goto L_0x0229
        L_0x0238:
            java.lang.String r9 = "Last-Modified"
            boolean r9 = r9.equalsIgnoreCase(r3)
            if (r9 == 0) goto L_0x0247
            java.util.Date r19 = k1.c.a(r7)
            r22 = r7
            goto L_0x0229
        L_0x0247:
            java.lang.String r9 = "ETag"
            boolean r9 = r9.equalsIgnoreCase(r3)
            if (r9 == 0) goto L_0x0252
            r21 = r7
            goto L_0x0229
        L_0x0252:
            java.lang.String r9 = "Age"
            boolean r3 = r9.equalsIgnoreCase(r3)
            if (r3 == 0) goto L_0x0229
            r3 = -1
            int r18 = k1.d.c(r7, r3)
            goto L_0x0229
        L_0x0260:
            int r11 = r11 + r3
            r3 = 0
            goto L_0x0211
        L_0x0263:
            r3 = r18
            goto L_0x0277
        L_0x0266:
            r3 = -1
            r12 = 0
            r14 = 0
            r17 = 0
            r19 = 0
            r20 = 0
            r21 = 0
            r22 = 0
            r23 = 0
        L_0x0277:
            if (r2 != 0) goto L_0x0284
            E.j r3 = new E.j
            r4 = 0
            r5 = 15
            r3.<init>((java.lang.Object) r6, (java.lang.Object) r4, (int) r5)
        L_0x0281:
            r7 = r6
            goto L_0x0456
        L_0x0284:
            g1.u r7 = r6.f2632a
            java.lang.String r7 = r7.f2774a
            java.lang.String r8 = "https"
            boolean r7 = r7.equals(r8)
            if (r7 == 0) goto L_0x029d
            g1.r r7 = r2.e
            if (r7 != 0) goto L_0x029d
            E.j r3 = new E.j
            r7 = 0
            r8 = 15
            r3.<init>((java.lang.Object) r6, (java.lang.Object) r7, (int) r8)
            goto L_0x0281
        L_0x029d:
            r7 = 0
            r8 = 15
            boolean r9 = E.j.A(r2, r6)
            if (r9 != 0) goto L_0x02ac
            E.j r3 = new E.j
            r3.<init>((java.lang.Object) r6, (java.lang.Object) r7, (int) r8)
            goto L_0x0281
        L_0x02ac:
            g1.j r7 = r6.e
            if (r7 == 0) goto L_0x02b1
            goto L_0x02b9
        L_0x02b1:
            g1.s r7 = r6.f2634c
            g1.j r7 = g1.j.a(r7)
            r6.e = r7
        L_0x02b9:
            boolean r8 = r7.f2708a
            if (r8 != 0) goto L_0x044d
            g1.s r8 = r6.f2634c
            java.lang.String r9 = "If-Modified-Since"
            java.lang.String r10 = r8.a(r9)
            if (r10 != 0) goto L_0x044d
            java.lang.String r10 = "If-None-Match"
            java.lang.String r11 = r8.a(r10)
            if (r11 == 0) goto L_0x02d1
            goto L_0x044d
        L_0x02d1:
            g1.j r11 = r2.f()
            r18 = r9
            boolean r9 = r11.f2717l
            if (r9 == 0) goto L_0x02e4
            E.j r3 = new E.j
            r4 = 0
            r5 = 15
            r3.<init>((java.lang.Object) r4, (java.lang.Object) r2, (int) r5)
            goto L_0x0281
        L_0x02e4:
            if (r17 == 0) goto L_0x02f6
            long r24 = r17.getTime()
            r26 = r10
            long r9 = r14 - r24
            r0 = 0
            long r9 = java.lang.Math.max(r0, r9)
            r0 = -1
            goto L_0x02fb
        L_0x02f6:
            r26 = r10
            r0 = -1
            r9 = 0
        L_0x02fb:
            if (r3 == r0) goto L_0x030c
            java.util.concurrent.TimeUnit r0 = java.util.concurrent.TimeUnit.SECONDS
            r1 = r6
            r24 = r7
            long r6 = (long) r3
            long r6 = r0.toMillis(r6)
            long r9 = java.lang.Math.max(r9, r6)
            goto L_0x030f
        L_0x030c:
            r1 = r6
            r24 = r7
        L_0x030f:
            long r6 = r14 - r12
            long r4 = r4 - r14
            long r9 = r9 + r6
            long r9 = r9 + r4
            g1.j r0 = r2.f()
            int r0 = r0.f2710c
            r3 = -1
            if (r0 == r3) goto L_0x032a
            java.util.concurrent.TimeUnit r3 = java.util.concurrent.TimeUnit.SECONDS
            long r4 = (long) r0
            long r3 = r3.toMillis(r4)
        L_0x0324:
            r5 = r3
            r7 = r24
            r3 = 0
            goto L_0x0377
        L_0x032a:
            if (r20 == 0) goto L_0x0341
            if (r17 == 0) goto L_0x0332
            long r14 = r17.getTime()
        L_0x0332:
            long r3 = r20.getTime()
            long r3 = r3 - r14
            r5 = 0
            int r0 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r0 <= 0) goto L_0x033e
            goto L_0x0324
        L_0x033e:
            r3 = 0
            goto L_0x0324
        L_0x0341:
            if (r19 == 0) goto L_0x0373
            g1.A r0 = r2.f2646a
            g1.u r0 = r0.f2632a
            java.util.List r0 = r0.f2778f
            if (r0 != 0) goto L_0x034d
            r0 = 0
            goto L_0x0359
        L_0x034d:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            g1.u.g(r3, r0)
            java.lang.String r0 = r3.toString()
        L_0x0359:
            if (r0 != 0) goto L_0x0373
            if (r17 == 0) goto L_0x0361
            long r12 = r17.getTime()
        L_0x0361:
            long r3 = r19.getTime()
            long r12 = r12 - r3
            r3 = 0
            int r0 = (r12 > r3 ? 1 : (r12 == r3 ? 0 : -1))
            if (r0 <= 0) goto L_0x0375
            r5 = 10
            long r5 = r12 / r5
        L_0x0370:
            r7 = r24
            goto L_0x0377
        L_0x0373:
            r3 = 0
        L_0x0375:
            r5 = r3
            goto L_0x0370
        L_0x0377:
            int r0 = r7.f2710c
            r12 = -1
            if (r0 == r12) goto L_0x0387
            java.util.concurrent.TimeUnit r13 = java.util.concurrent.TimeUnit.SECONDS
            long r14 = (long) r0
            long r13 = r13.toMillis(r14)
            long r5 = java.lang.Math.min(r5, r13)
        L_0x0387:
            int r0 = r7.i
            if (r0 == r12) goto L_0x0393
            java.util.concurrent.TimeUnit r13 = java.util.concurrent.TimeUnit.SECONDS
            long r14 = (long) r0
            long r13 = r13.toMillis(r14)
            goto L_0x0394
        L_0x0393:
            r13 = r3
        L_0x0394:
            boolean r0 = r11.f2713g
            if (r0 != 0) goto L_0x03a5
            int r0 = r7.f2714h
            if (r0 == r12) goto L_0x03a5
            java.util.concurrent.TimeUnit r3 = java.util.concurrent.TimeUnit.SECONDS
            r7 = r1
            long r0 = (long) r0
            long r0 = r3.toMillis(r0)
            goto L_0x03a7
        L_0x03a5:
            r7 = r1
            r0 = r3
        L_0x03a7:
            boolean r3 = r11.f2708a
            if (r3 != 0) goto L_0x03f4
            long r13 = r13 + r9
            long r0 = r0 + r5
            int r3 = (r13 > r0 ? 1 : (r13 == r0 ? 0 : -1))
            if (r3 >= 0) goto L_0x03f4
            g1.B r0 = r2.h()
            java.lang.String r1 = "Warning"
            int r3 = (r13 > r5 ? 1 : (r13 == r5 ? 0 : -1))
            if (r3 < 0) goto L_0x03c8
            A.b r3 = r0.f2640f
            java.lang.String r4 = "110 HttpURLConnection \"Response is stale\""
            r3.getClass()
            A.b.s(r1, r4)
            r3.r(r1, r4)
        L_0x03c8:
            r3 = 86400000(0x5265c00, double:4.2687272E-316)
            int r5 = (r9 > r3 ? 1 : (r9 == r3 ? 0 : -1))
            if (r5 <= 0) goto L_0x03e7
            g1.j r3 = r2.f()
            int r3 = r3.f2710c
            r4 = -1
            if (r3 != r4) goto L_0x03e7
            if (r20 != 0) goto L_0x03e7
            A.b r3 = r0.f2640f
            java.lang.String r4 = "113 HttpURLConnection \"Heuristic expiration\""
            r3.getClass()
            A.b.s(r1, r4)
            r3.r(r1, r4)
        L_0x03e7:
            E.j r3 = new E.j
            g1.C r0 = r0.a()
            r1 = 0
            r4 = 15
            r3.<init>((java.lang.Object) r1, (java.lang.Object) r0, (int) r4)
            goto L_0x0456
        L_0x03f4:
            if (r21 == 0) goto L_0x03fb
            r0 = r21
            r9 = r26
            goto L_0x0408
        L_0x03fb:
            if (r19 == 0) goto L_0x0402
            r9 = r18
            r0 = r22
            goto L_0x0408
        L_0x0402:
            if (r17 == 0) goto L_0x0444
            r9 = r18
            r0 = r23
        L_0x0408:
            A.b r1 = r8.c()
            g1.b r3 = g1.C0103b.e
            r3.getClass()
            r1.r(r9, r0)
            A.k r0 = r7.a()
            java.lang.Object r1 = r1.f2g
            java.util.ArrayList r1 = (java.util.ArrayList) r1
            int r3 = r1.size()
            java.lang.String[] r3 = new java.lang.String[r3]
            java.lang.Object[] r1 = r1.toArray(r3)
            java.lang.String[] r1 = (java.lang.String[]) r1
            A.b r3 = new A.b
            r4 = 27
            r3.<init>((int) r4)
            java.lang.Object r4 = r3.f2g
            java.util.ArrayList r4 = (java.util.ArrayList) r4
            java.util.Collections.addAll(r4, r1)
            r0.f23h = r3
            g1.A r0 = r0.b()
            E.j r3 = new E.j
            r1 = 15
            r3.<init>((java.lang.Object) r0, (java.lang.Object) r2, (int) r1)
            goto L_0x0456
        L_0x0444:
            r1 = 15
            E.j r3 = new E.j
            r0 = 0
            r3.<init>((java.lang.Object) r7, (java.lang.Object) r0, (int) r1)
            goto L_0x0456
        L_0x044d:
            r7 = r6
            r0 = 0
            r1 = 15
            E.j r3 = new E.j
            r3.<init>((java.lang.Object) r7, (java.lang.Object) r0, (int) r1)
        L_0x0456:
            java.lang.Object r0 = r3.f108g
            g1.A r0 = (g1.A) r0
            if (r0 == 0) goto L_0x0476
            g1.j r0 = r7.e
            if (r0 == 0) goto L_0x0461
            goto L_0x0469
        L_0x0461:
            g1.s r0 = r7.f2634c
            g1.j r0 = g1.j.a(r0)
            r7.e = r0
        L_0x0469:
            boolean r0 = r0.f2715j
            if (r0 == 0) goto L_0x0476
            E.j r3 = new E.j
            r0 = 15
            r4 = 0
            r3.<init>((java.lang.Object) r4, (java.lang.Object) r4, (int) r0)
            goto L_0x0477
        L_0x0476:
            r4 = 0
        L_0x0477:
            java.lang.Object r0 = r3.f108g
            g1.A r0 = (g1.A) r0
            java.lang.Object r1 = r3.f109h
            g1.C r1 = (g1.C) r1
            r3 = r27
            java.lang.Object r5 = r3.f3098b
            A.b r5 = (A.b) r5
            if (r5 == 0) goto L_0x048d
            java.lang.Object r5 = r5.f2g
            g1.h r5 = (g1.h) r5
            monitor-enter(r5)
            monitor-exit(r5)
        L_0x048d:
            if (r2 == 0) goto L_0x0496
            if (r1 != 0) goto L_0x0496
            g1.E r5 = r2.f2651g
            h1.c.c(r5)
        L_0x0496:
            if (r0 != 0) goto L_0x04c5
            if (r1 != 0) goto L_0x04c5
            g1.B r0 = new g1.B
            r0.<init>()
            r5 = r28
            g1.A r1 = r5.f3578f
            r0.f2636a = r1
            g1.y r1 = g1.y.HTTP_1_1
            r0.f2637b = r1
            r1 = 504(0x1f8, float:7.06E-43)
            r0.f2638c = r1
            java.lang.String r1 = "Unsatisfiable Request (only-if-cached)"
            r0.f2639d = r1
            g1.D r1 = h1.c.f3088c
            r0.f2641g = r1
            r1 = -1
            r0.f2644k = r1
            long r1 = java.lang.System.currentTimeMillis()
            r0.f2645l = r1
            g1.C r0 = r0.a()
            goto L_0x0708
        L_0x04c5:
            r5 = r28
            if (r0 != 0) goto L_0x04e0
            g1.B r0 = r1.h()
            g1.C r1 = d(r1)
            if (r1 == 0) goto L_0x04d8
            java.lang.String r2 = "cacheResponse"
            g1.B.b(r2, r1)
        L_0x04d8:
            r0.i = r1
            g1.C r0 = r0.a()
            goto L_0x0708
        L_0x04e0:
            g1.C r2 = r5.a(r0)     // Catch:{ all -> 0x0709 }
            if (r1 == 0) goto L_0x061b
            int r5 = r2.f2648c
            r6 = 304(0x130, float:4.26E-43)
            if (r5 != r6) goto L_0x0616
            g1.B r0 = r1.h()
            g1.s r5 = r1.f2650f
            g1.s r6 = r2.f2650f
            java.util.ArrayList r7 = new java.util.ArrayList
            r8 = 20
            r7.<init>(r8)
            int r8 = r5.d()
            r9 = 0
        L_0x0500:
            if (r9 >= r8) goto L_0x0553
            java.lang.String r10 = r5.b(r9)
            java.lang.String r11 = r5.e(r9)
            java.lang.String r12 = "Warning"
            boolean r12 = r12.equalsIgnoreCase(r10)
            if (r12 == 0) goto L_0x051c
            java.lang.String r12 = "1"
            boolean r12 = r11.startsWith(r12)
            if (r12 == 0) goto L_0x051c
        L_0x051a:
            r10 = 1
            goto L_0x0551
        L_0x051c:
            java.lang.String r12 = "Content-Length"
            boolean r12 = r12.equalsIgnoreCase(r10)
            if (r12 != 0) goto L_0x0541
            java.lang.String r12 = "Content-Encoding"
            boolean r12 = r12.equalsIgnoreCase(r10)
            if (r12 != 0) goto L_0x0541
            java.lang.String r12 = "Content-Type"
            boolean r12 = r12.equalsIgnoreCase(r10)
            if (r12 == 0) goto L_0x0535
            goto L_0x0541
        L_0x0535:
            boolean r12 = c(r10)
            if (r12 == 0) goto L_0x0541
            java.lang.String r12 = r6.a(r10)
            if (r12 != 0) goto L_0x051a
        L_0x0541:
            g1.b r12 = g1.C0103b.e
            r12.getClass()
            r7.add(r10)
            java.lang.String r10 = r11.trim()
            r7.add(r10)
            goto L_0x051a
        L_0x0551:
            int r9 = r9 + r10
            goto L_0x0500
        L_0x0553:
            int r5 = r6.d()
            r8 = 0
        L_0x0558:
            if (r8 >= r5) goto L_0x0593
            java.lang.String r9 = r6.b(r8)
            java.lang.String r10 = "Content-Length"
            boolean r10 = r10.equalsIgnoreCase(r9)
            if (r10 != 0) goto L_0x0590
            java.lang.String r10 = "Content-Encoding"
            boolean r10 = r10.equalsIgnoreCase(r9)
            if (r10 != 0) goto L_0x0590
            java.lang.String r10 = "Content-Type"
            boolean r10 = r10.equalsIgnoreCase(r9)
            if (r10 == 0) goto L_0x0577
            goto L_0x0590
        L_0x0577:
            boolean r10 = c(r9)
            if (r10 == 0) goto L_0x0590
            g1.b r10 = g1.C0103b.e
            java.lang.String r11 = r6.e(r8)
            r10.getClass()
            r7.add(r9)
            java.lang.String r9 = r11.trim()
            r7.add(r9)
        L_0x0590:
            r9 = 1
            int r8 = r8 + r9
            goto L_0x0558
        L_0x0593:
            int r5 = r7.size()
            java.lang.String[] r5 = new java.lang.String[r5]
            java.lang.Object[] r5 = r7.toArray(r5)
            java.lang.String[] r5 = (java.lang.String[]) r5
            A.b r6 = new A.b
            r7 = 27
            r6.<init>((int) r7)
            java.lang.Object r7 = r6.f2g
            java.util.ArrayList r7 = (java.util.ArrayList) r7
            java.util.Collections.addAll(r7, r5)
            r0.f2640f = r6
            long r5 = r2.f2654k
            r0.f2644k = r5
            long r5 = r2.f2655l
            r0.f2645l = r5
            g1.C r5 = d(r1)
            if (r5 == 0) goto L_0x05c2
            java.lang.String r6 = "cacheResponse"
            g1.B.b(r6, r5)
        L_0x05c2:
            r0.i = r5
            g1.C r5 = d(r2)
            if (r5 == 0) goto L_0x05cf
            java.lang.String r6 = "networkResponse"
            g1.B.b(r6, r5)
        L_0x05cf:
            r0.f2642h = r5
            g1.C r0 = r0.a()
            g1.E r2 = r2.f2651g
            r2.close()
            java.lang.Object r2 = r3.f3098b
            A.b r2 = (A.b) r2
            r2.E()
            java.lang.Object r2 = r3.f3098b
            A.b r2 = (A.b) r2
            java.lang.Object r2 = r2.f2g
            g1.h r2 = (g1.h) r2
            r2.getClass()
            g1.g r2 = new g1.g
            r2.<init>((g1.C) r0)
            g1.E r1 = r1.f2651g
            g1.f r1 = (g1.C0107f) r1
            i1.f r1 = r1.f2688a
            java.lang.String r5 = r1.f3113a     // Catch:{ IOException -> 0x060d }
            long r6 = r1.f3114b     // Catch:{ IOException -> 0x060d }
            i1.g r1 = r1.f3116d     // Catch:{ IOException -> 0x060d }
            i1.d r1 = r1.h(r5, r6)     // Catch:{ IOException -> 0x060d }
            if (r1 == 0) goto L_0x0708
            r2.c(r1)     // Catch:{ IOException -> 0x060b }
            r1.b()     // Catch:{ IOException -> 0x060b }
            goto L_0x0708
        L_0x060b:
            goto L_0x060f
        L_0x060d:
            r1 = r4
        L_0x060f:
            if (r1 == 0) goto L_0x0708
            r1.a()     // Catch:{ IOException -> 0x0708 }
            goto L_0x0708
        L_0x0616:
            g1.E r5 = r1.f2651g
            h1.c.c(r5)
        L_0x061b:
            g1.B r5 = r2.h()
            g1.C r1 = d(r1)
            if (r1 == 0) goto L_0x062a
            java.lang.String r6 = "cacheResponse"
            g1.B.b(r6, r1)
        L_0x062a:
            r5.i = r1
            g1.C r1 = d(r2)
            if (r1 == 0) goto L_0x0637
            java.lang.String r2 = "networkResponse"
            g1.B.b(r2, r1)
        L_0x0637:
            r5.f2642h = r1
            g1.C r1 = r5.a()
            java.lang.Object r2 = r3.f3098b
            A.b r2 = (A.b) r2
            if (r2 == 0) goto L_0x0707
            boolean r2 = k1.d.b(r1)
            if (r2 == 0) goto L_0x06f4
            boolean r2 = E.j.A(r1, r0)
            if (r2 == 0) goto L_0x06f4
            java.lang.Object r0 = r3.f3098b
            A.b r0 = (A.b) r0
            java.lang.Object r0 = r0.f2g
            g1.h r0 = (g1.h) r0
            r0.getClass()
            g1.A r2 = r1.f2646a
            java.lang.String r2 = r2.f2633b
            boolean r5 = T0.g.t(r2)
            g1.A r6 = r1.f2646a
            if (r5 == 0) goto L_0x066c
            r0.g(r6)     // Catch:{ IOException -> 0x066a }
            goto L_0x06b9
        L_0x066a:
            goto L_0x06b9
        L_0x066c:
            java.lang.String r5 = "GET"
            boolean r2 = r2.equals(r5)
            if (r2 != 0) goto L_0x0675
            goto L_0x06b9
        L_0x0675:
            g1.s r2 = r1.f2650f
            java.util.Set r2 = k1.d.f(r2)
            java.lang.String r5 = "*"
            boolean r2 = r2.contains(r5)
            if (r2 == 0) goto L_0x0684
            goto L_0x06b9
        L_0x0684:
            g1.g r2 = new g1.g
            r2.<init>((g1.C) r1)
            i1.g r5 = r0.f2702b     // Catch:{ IOException -> 0x06b2 }
            g1.u r6 = r6.f2632a     // Catch:{ IOException -> 0x06b2 }
            java.lang.String r6 = r6.f2780h     // Catch:{ IOException -> 0x06b2 }
            r1.h r6 = r1.h.f(r6)     // Catch:{ IOException -> 0x06b2 }
            java.lang.String r7 = "MD5"
            r1.h r6 = r6.e(r7)     // Catch:{ IOException -> 0x06b2 }
            java.lang.String r6 = r6.h()     // Catch:{ IOException -> 0x06b2 }
            r7 = -1
            i1.d r5 = r5.h(r6, r7)     // Catch:{ IOException -> 0x06b2 }
            if (r5 != 0) goto L_0x06a6
            goto L_0x06b9
        L_0x06a6:
            r2.c(r5)     // Catch:{ IOException -> 0x06b0 }
            g1.d r2 = new g1.d     // Catch:{ IOException -> 0x06b0 }
            r2.<init>(r0, r5)     // Catch:{ IOException -> 0x06b0 }
            r4 = r2
            goto L_0x06b9
        L_0x06b0:
            goto L_0x06b4
        L_0x06b2:
            r5 = r4
        L_0x06b4:
            if (r5 == 0) goto L_0x06b9
            r5.a()     // Catch:{ IOException -> 0x066a }
        L_0x06b9:
            if (r4 != 0) goto L_0x06bc
            goto L_0x0707
        L_0x06bc:
            g1.c r0 = r4.f2685c
            if (r0 != 0) goto L_0x06c1
            goto L_0x0707
        L_0x06c1:
            g1.E r2 = r1.f2651g
            r1.g r2 = r2.g()
            java.util.logging.Logger r5 = r1.o.f4594a
            r1.p r5 = new r1.p
            r5.<init>(r0)
            i1.a r0 = new i1.a
            r0.<init>(r2, r4, r5)
            java.lang.String r2 = "Content-Type"
            r1.g(r2)
            g1.E r2 = r1.f2651g
            long r4 = r2.f()
            g1.B r1 = r1.h()
            g1.D r2 = new g1.D
            r1.q r6 = new r1.q
            r6.<init>(r0)
            r0 = 1
            r2.<init>(r4, r6, r0)
            r1.f2641g = r2
            g1.C r0 = r1.a()
            goto L_0x0708
        L_0x06f4:
            java.lang.String r2 = r0.f2633b
            boolean r2 = T0.g.t(r2)
            if (r2 == 0) goto L_0x0707
            java.lang.Object r2 = r3.f3098b     // Catch:{ IOException -> 0x0707 }
            A.b r2 = (A.b) r2     // Catch:{ IOException -> 0x0707 }
            java.lang.Object r2 = r2.f2g     // Catch:{ IOException -> 0x0707 }
            g1.h r2 = (g1.h) r2     // Catch:{ IOException -> 0x0707 }
            r2.g(r0)     // Catch:{ IOException -> 0x0707 }
        L_0x0707:
            r0 = r1
        L_0x0708:
            return r0
        L_0x0709:
            r0 = move-exception
            r1 = r0
            if (r2 == 0) goto L_0x0712
            g1.E r0 = r2.f2651g
            h1.c.c(r0)
        L_0x0712:
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: i1.b.a(k1.e):g1.C");
    }
}
