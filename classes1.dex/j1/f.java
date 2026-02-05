package j1;

import K.j;
import g1.C0102a;
import g1.C0103b;
import g1.F;
import g1.n;
import g1.z;
import h1.c;
import java.io.IOException;
import java.lang.ref.Reference;
import java.net.Socket;
import java.util.ArrayList;
import k1.b;

public final class f {

    /* renamed from: a  reason: collision with root package name */
    public final C0102a f3549a;

    /* renamed from: b  reason: collision with root package name */
    public j f3550b;

    /* renamed from: c  reason: collision with root package name */
    public F f3551c;

    /* renamed from: d  reason: collision with root package name */
    public final n f3552d;
    public final C0103b e;

    /* renamed from: f  reason: collision with root package name */
    public final Object f3553f;

    /* renamed from: g  reason: collision with root package name */
    public final d f3554g;

    /* renamed from: h  reason: collision with root package name */
    public int f3555h;
    public b i;

    /* renamed from: j  reason: collision with root package name */
    public boolean f3556j;

    /* renamed from: k  reason: collision with root package name */
    public boolean f3557k;

    /* renamed from: l  reason: collision with root package name */
    public b f3558l;

    public final synchronized b a() {
        return this.i;
    }

    public final Socket b(boolean z2, boolean z3, boolean z4) {
        Socket socket;
        if (z4) {
            this.f3558l = null;
        }
        if (z3) {
            this.f3557k = true;
        }
        b bVar = this.i;
        if (bVar == null) {
            return null;
        }
        if (z2) {
            bVar.f3535k = true;
        }
        if (this.f3558l != null) {
            return null;
        }
        if (!this.f3557k && !bVar.f3535k) {
            return null;
        }
        ArrayList arrayList = bVar.f3538n;
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            if (((Reference) arrayList.get(i2)).get() == this) {
                arrayList.remove(i2);
                if (this.i.f3538n.isEmpty()) {
                    this.i.f3539o = System.nanoTime();
                    C0103b bVar2 = C0103b.e;
                    b bVar3 = this.i;
                    bVar2.getClass();
                    n nVar = this.f3552d;
                    nVar.getClass();
                    if (bVar3.f3535k || nVar.f2737a == 0) {
                        nVar.f2740d.remove(bVar3);
                        socket = this.i.e;
                        this.i = null;
                        return socket;
                    }
                    nVar.notifyAll();
                }
                socket = null;
                this.i = null;
                return socket;
            }
        }
        throw new IllegalStateException();
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v22, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v6, resolved type: g1.F} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final j1.b c(int r16, int r17, int r18, boolean r19) {
        /*
            r15 = this;
            r1 = r15
            g1.n r2 = r1.f3552d
            monitor-enter(r2)
            boolean r0 = r1.f3557k     // Catch:{ all -> 0x0043 }
            if (r0 != 0) goto L_0x017e
            k1.b r0 = r1.f3558l     // Catch:{ all -> 0x0043 }
            if (r0 != 0) goto L_0x0176
            j1.b r0 = r1.i     // Catch:{ all -> 0x0043 }
            r3 = 0
            r4 = 1
            r5 = 0
            if (r0 == 0) goto L_0x001c
            boolean r6 = r0.f3535k     // Catch:{ all -> 0x0043 }
            if (r6 == 0) goto L_0x001c
            java.net.Socket r6 = r15.b(r3, r3, r4)     // Catch:{ all -> 0x0043 }
            goto L_0x001d
        L_0x001c:
            r6 = r5
        L_0x001d:
            j1.b r7 = r1.i     // Catch:{ all -> 0x0043 }
            if (r7 == 0) goto L_0x0023
            r0 = r5
            goto L_0x0024
        L_0x0023:
            r7 = r5
        L_0x0024:
            boolean r8 = r1.f3556j     // Catch:{ all -> 0x0043 }
            if (r8 != 0) goto L_0x0029
            r0 = r5
        L_0x0029:
            if (r7 != 0) goto L_0x0046
            g1.b r8 = g1.C0103b.e     // Catch:{ all -> 0x0043 }
            g1.n r9 = r1.f3552d     // Catch:{ all -> 0x0043 }
            g1.a r10 = r1.f3549a     // Catch:{ all -> 0x0043 }
            r8.getClass()     // Catch:{ all -> 0x0043 }
            g1.C0103b.b(r9, r10, r15, r5)     // Catch:{ all -> 0x0043 }
            j1.b r8 = r1.i     // Catch:{ all -> 0x0043 }
            if (r8 == 0) goto L_0x003f
            r7 = r8
            r9 = 1
            r8 = r5
            goto L_0x0048
        L_0x003f:
            g1.F r8 = r1.f3551c     // Catch:{ all -> 0x0043 }
        L_0x0041:
            r9 = 0
            goto L_0x0048
        L_0x0043:
            r0 = move-exception
            goto L_0x0186
        L_0x0046:
            r8 = r5
            goto L_0x0041
        L_0x0048:
            monitor-exit(r2)     // Catch:{ all -> 0x0043 }
            h1.c.d(r6)
            if (r0 == 0) goto L_0x0053
            g1.b r0 = r1.e
            r0.getClass()
        L_0x0053:
            if (r9 == 0) goto L_0x005a
            g1.b r0 = r1.e
            r0.getClass()
        L_0x005a:
            if (r7 == 0) goto L_0x005d
            return r7
        L_0x005d:
            if (r8 != 0) goto L_0x007a
            K.j r0 = r1.f3550b
            if (r0 == 0) goto L_0x0070
            int r2 = r0.f332f
            java.lang.Object r0 = r0.f333g
            java.util.ArrayList r0 = (java.util.ArrayList) r0
            int r0 = r0.size()
            if (r2 >= r0) goto L_0x0070
            goto L_0x007a
        L_0x0070:
            j1.d r0 = r1.f3554g
            K.j r0 = r0.b()
            r1.f3550b = r0
            r0 = 1
            goto L_0x007b
        L_0x007a:
            r0 = 0
        L_0x007b:
            g1.n r6 = r1.f3552d
            monitor-enter(r6)
            if (r0 == 0) goto L_0x00b6
            K.j r0 = r1.f3550b     // Catch:{ all -> 0x00b0 }
            r0.getClass()     // Catch:{ all -> 0x00b0 }
            java.util.ArrayList r2 = new java.util.ArrayList     // Catch:{ all -> 0x00b0 }
            java.lang.Object r0 = r0.f333g     // Catch:{ all -> 0x00b0 }
            java.util.ArrayList r0 = (java.util.ArrayList) r0     // Catch:{ all -> 0x00b0 }
            r2.<init>(r0)     // Catch:{ all -> 0x00b0 }
            int r0 = r2.size()     // Catch:{ all -> 0x00b0 }
            r10 = 0
        L_0x0093:
            if (r10 >= r0) goto L_0x00b6
            java.lang.Object r11 = r2.get(r10)     // Catch:{ all -> 0x00b0 }
            g1.F r11 = (g1.F) r11     // Catch:{ all -> 0x00b0 }
            g1.b r12 = g1.C0103b.e     // Catch:{ all -> 0x00b0 }
            g1.n r13 = r1.f3552d     // Catch:{ all -> 0x00b0 }
            g1.a r14 = r1.f3549a     // Catch:{ all -> 0x00b0 }
            r12.getClass()     // Catch:{ all -> 0x00b0 }
            g1.C0103b.b(r13, r14, r15, r11)     // Catch:{ all -> 0x00b0 }
            j1.b r12 = r1.i     // Catch:{ all -> 0x00b0 }
            if (r12 == 0) goto L_0x00b3
            r1.f3551c = r11     // Catch:{ all -> 0x00b0 }
            r7 = r12
            r9 = 1
            goto L_0x00b6
        L_0x00b0:
            r0 = move-exception
            goto L_0x0174
        L_0x00b3:
            int r10 = r10 + 1
            goto L_0x0093
        L_0x00b6:
            if (r9 != 0) goto L_0x0104
            if (r8 != 0) goto L_0x00e5
            K.j r0 = r1.f3550b     // Catch:{ all -> 0x00b0 }
            int r2 = r0.f332f     // Catch:{ all -> 0x00b0 }
            java.lang.Object r7 = r0.f333g     // Catch:{ all -> 0x00b0 }
            java.util.ArrayList r7 = (java.util.ArrayList) r7     // Catch:{ all -> 0x00b0 }
            int r7 = r7.size()     // Catch:{ all -> 0x00b0 }
            if (r2 >= r7) goto L_0x00ca
            r2 = 1
            goto L_0x00cb
        L_0x00ca:
            r2 = 0
        L_0x00cb:
            if (r2 == 0) goto L_0x00df
            int r2 = r0.f332f     // Catch:{ all -> 0x00b0 }
            int r7 = r2 + 1
            r0.f332f = r7     // Catch:{ all -> 0x00b0 }
            java.lang.Object r0 = r0.f333g     // Catch:{ all -> 0x00b0 }
            java.util.ArrayList r0 = (java.util.ArrayList) r0     // Catch:{ all -> 0x00b0 }
            java.lang.Object r0 = r0.get(r2)     // Catch:{ all -> 0x00b0 }
            r8 = r0
            g1.F r8 = (g1.F) r8     // Catch:{ all -> 0x00b0 }
            goto L_0x00e5
        L_0x00df:
            java.util.NoSuchElementException r0 = new java.util.NoSuchElementException     // Catch:{ all -> 0x00b0 }
            r0.<init>()     // Catch:{ all -> 0x00b0 }
            throw r0     // Catch:{ all -> 0x00b0 }
        L_0x00e5:
            r1.f3551c = r8     // Catch:{ all -> 0x00b0 }
            r1.f3555h = r3     // Catch:{ all -> 0x00b0 }
            j1.b r7 = new j1.b     // Catch:{ all -> 0x00b0 }
            g1.n r0 = r1.f3552d     // Catch:{ all -> 0x00b0 }
            r7.<init>(r0, r8)     // Catch:{ all -> 0x00b0 }
            j1.b r0 = r1.i     // Catch:{ all -> 0x00b0 }
            if (r0 != 0) goto L_0x0106
            r1.i = r7     // Catch:{ all -> 0x00b0 }
            r1.f3556j = r3     // Catch:{ all -> 0x00b0 }
            java.util.ArrayList r0 = r7.f3538n     // Catch:{ all -> 0x00b0 }
            j1.e r2 = new j1.e     // Catch:{ all -> 0x00b0 }
            java.lang.Object r8 = r1.f3553f     // Catch:{ all -> 0x00b0 }
            r2.<init>(r15, r8)     // Catch:{ all -> 0x00b0 }
            r0.add(r2)     // Catch:{ all -> 0x00b0 }
        L_0x0104:
            r0 = r7
            goto L_0x010c
        L_0x0106:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException     // Catch:{ all -> 0x00b0 }
            r0.<init>()     // Catch:{ all -> 0x00b0 }
            throw r0     // Catch:{ all -> 0x00b0 }
        L_0x010c:
            monitor-exit(r6)     // Catch:{ all -> 0x00b0 }
            if (r9 == 0) goto L_0x0115
            g1.b r2 = r1.e
            r2.getClass()
            return r0
        L_0x0115:
            g1.b r12 = r1.e
            r7 = r0
            r8 = r16
            r9 = r17
            r10 = r18
            r11 = r19
            r7.c(r8, r9, r10, r11, r12)
            g1.b r2 = g1.C0103b.e
            r2.getClass()
            g1.n r2 = r1.f3552d
            j0.w r2 = r2.e
            g1.F r6 = r0.f3529c
            r2.j(r6)
            g1.n r2 = r1.f3552d
            monitor-enter(r2)
            r1.f3556j = r4     // Catch:{ all -> 0x0166 }
            g1.b r6 = g1.C0103b.e     // Catch:{ all -> 0x0166 }
            g1.n r7 = r1.f3552d     // Catch:{ all -> 0x0166 }
            r6.getClass()     // Catch:{ all -> 0x0166 }
            boolean r6 = r7.f2741f     // Catch:{ all -> 0x0166 }
            if (r6 != 0) goto L_0x014a
            r7.f2741f = r4     // Catch:{ all -> 0x0166 }
            java.util.concurrent.ThreadPoolExecutor r6 = g1.n.f2736g     // Catch:{ all -> 0x0166 }
            N0.B r8 = r7.f2739c     // Catch:{ all -> 0x0166 }
            r6.execute(r8)     // Catch:{ all -> 0x0166 }
        L_0x014a:
            java.util.ArrayDeque r6 = r7.f2740d     // Catch:{ all -> 0x0166 }
            r6.add(r0)     // Catch:{ all -> 0x0166 }
            m1.s r6 = r0.f3533h     // Catch:{ all -> 0x0166 }
            if (r6 == 0) goto L_0x0154
            r3 = 1
        L_0x0154:
            if (r3 == 0) goto L_0x0168
            g1.b r0 = g1.C0103b.e     // Catch:{ all -> 0x0166 }
            g1.n r3 = r1.f3552d     // Catch:{ all -> 0x0166 }
            g1.a r4 = r1.f3549a     // Catch:{ all -> 0x0166 }
            r0.getClass()     // Catch:{ all -> 0x0166 }
            java.net.Socket r5 = g1.C0103b.a(r3, r4, r15)     // Catch:{ all -> 0x0166 }
            j1.b r0 = r1.i     // Catch:{ all -> 0x0166 }
            goto L_0x0168
        L_0x0166:
            r0 = move-exception
            goto L_0x0172
        L_0x0168:
            monitor-exit(r2)     // Catch:{ all -> 0x0166 }
            h1.c.d(r5)
            g1.b r2 = r1.e
            r2.getClass()
            return r0
        L_0x0172:
            monitor-exit(r2)     // Catch:{ all -> 0x0166 }
            throw r0
        L_0x0174:
            monitor-exit(r6)     // Catch:{ all -> 0x00b0 }
            throw r0
        L_0x0176:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException     // Catch:{ all -> 0x0043 }
            java.lang.String r3 = "codec != null"
            r0.<init>(r3)     // Catch:{ all -> 0x0043 }
            throw r0     // Catch:{ all -> 0x0043 }
        L_0x017e:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException     // Catch:{ all -> 0x0043 }
            java.lang.String r3 = "released"
            r0.<init>(r3)     // Catch:{ all -> 0x0043 }
            throw r0     // Catch:{ all -> 0x0043 }
        L_0x0186:
            monitor-exit(r2)     // Catch:{ all -> 0x0043 }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: j1.f.c(int, int, int, boolean):j1.b");
    }

    public final void e() {
        b bVar;
        Socket b2;
        synchronized (this.f3552d) {
            bVar = this.i;
            b2 = b(true, false, false);
            if (this.i != null) {
                bVar = null;
            }
        }
        c.d(b2);
        if (bVar != null) {
            this.e.getClass();
        }
    }

    public final void f() {
        b bVar;
        Socket b2;
        synchronized (this.f3552d) {
            bVar = this.i;
            b2 = b(false, true, false);
            if (this.i != null) {
                bVar = null;
            }
        }
        c.d(b2);
        if (bVar != null) {
            this.e.getClass();
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:34:0x0051 A[Catch:{ all -> 0x0017 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void g(java.io.IOException r7) {
        /*
            r6 = this;
            g1.n r0 = r6.f3552d
            monitor-enter(r0)
            boolean r1 = r7 instanceof m1.D     // Catch:{ all -> 0x0017 }
            r2 = 0
            r3 = 1
            r4 = 0
            if (r1 == 0) goto L_0x0022
            m1.D r7 = (m1.D) r7     // Catch:{ all -> 0x0017 }
            int r7 = r7.f3678a     // Catch:{ all -> 0x0017 }
            r1 = 5
            if (r7 != r1) goto L_0x0019
            int r5 = r6.f3555h     // Catch:{ all -> 0x0017 }
            int r5 = r5 + r3
            r6.f3555h = r5     // Catch:{ all -> 0x0017 }
            goto L_0x0019
        L_0x0017:
            r7 = move-exception
            goto L_0x0063
        L_0x0019:
            if (r7 != r1) goto L_0x001f
            int r7 = r6.f3555h     // Catch:{ all -> 0x0017 }
            if (r7 <= r3) goto L_0x0046
        L_0x001f:
            r6.f3551c = r4     // Catch:{ all -> 0x0017 }
            goto L_0x0044
        L_0x0022:
            j1.b r1 = r6.i     // Catch:{ all -> 0x0017 }
            if (r1 == 0) goto L_0x0046
            m1.s r5 = r1.f3533h     // Catch:{ all -> 0x0017 }
            if (r5 == 0) goto L_0x002c
            r5 = 1
            goto L_0x002d
        L_0x002c:
            r5 = 0
        L_0x002d:
            if (r5 == 0) goto L_0x0033
            boolean r5 = r7 instanceof m1.C0178a     // Catch:{ all -> 0x0017 }
            if (r5 == 0) goto L_0x0046
        L_0x0033:
            int r1 = r1.f3536l     // Catch:{ all -> 0x0017 }
            if (r1 != 0) goto L_0x0044
            g1.F r1 = r6.f3551c     // Catch:{ all -> 0x0017 }
            if (r1 == 0) goto L_0x0042
            if (r7 == 0) goto L_0x0042
            j1.d r5 = r6.f3554g     // Catch:{ all -> 0x0017 }
            r5.a(r1, r7)     // Catch:{ all -> 0x0017 }
        L_0x0042:
            r6.f3551c = r4     // Catch:{ all -> 0x0017 }
        L_0x0044:
            r7 = 1
            goto L_0x0047
        L_0x0046:
            r7 = 0
        L_0x0047:
            j1.b r1 = r6.i     // Catch:{ all -> 0x0017 }
            java.net.Socket r7 = r6.b(r7, r2, r3)     // Catch:{ all -> 0x0017 }
            j1.b r2 = r6.i     // Catch:{ all -> 0x0017 }
            if (r2 != 0) goto L_0x0057
            boolean r2 = r6.f3556j     // Catch:{ all -> 0x0017 }
            if (r2 != 0) goto L_0x0056
            goto L_0x0057
        L_0x0056:
            r4 = r1
        L_0x0057:
            monitor-exit(r0)     // Catch:{ all -> 0x0017 }
            h1.c.d(r7)
            if (r4 == 0) goto L_0x0062
            g1.b r7 = r6.e
            r7.getClass()
        L_0x0062:
            return
        L_0x0063:
            monitor-exit(r0)     // Catch:{ all -> 0x0017 }
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: j1.f.g(java.io.IOException):void");
    }

    public final void h(boolean z2, b bVar, IOException iOException) {
        b bVar2;
        Socket b2;
        boolean z3;
        this.e.getClass();
        synchronized (this.f3552d) {
            if (bVar != null) {
                try {
                    if (bVar == this.f3558l) {
                        if (!z2) {
                            this.i.f3536l++;
                        }
                        bVar2 = this.i;
                        b2 = b(z2, false, true);
                        if (this.i != null) {
                            bVar2 = null;
                        }
                        z3 = this.f3557k;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            throw new IllegalStateException("expected " + this.f3558l + " but was " + bVar);
        }
        c.d(b2);
        if (bVar2 != null) {
            this.e.getClass();
        }
        if (iOException != null) {
            this.e.getClass();
        } else if (z3) {
            this.e.getClass();
        }
    }

    public f(n nVar, C0102a aVar, z zVar, C0103b bVar, Object obj) {
        this.f3552d = nVar;
        this.f3549a = aVar;
        this.e = bVar;
        C0103b.e.getClass();
        this.f3554g = new d(aVar, nVar.e, zVar, bVar);
        this.f3553f = obj;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0014, code lost:
        if (r0.h(r8) != false) goto L_0x001a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x001a, code lost:
        return r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final j1.b d(int r4, int r5, int r6, boolean r7, boolean r8) {
        /*
            r3 = this;
        L_0x0000:
            j1.b r0 = r3.c(r4, r5, r6, r7)
            g1.n r1 = r3.f3552d
            monitor-enter(r1)
            int r2 = r0.f3536l     // Catch:{ all -> 0x000d }
            if (r2 != 0) goto L_0x000f
            monitor-exit(r1)     // Catch:{ all -> 0x000d }
            return r0
        L_0x000d:
            r4 = move-exception
            goto L_0x001b
        L_0x000f:
            monitor-exit(r1)     // Catch:{ all -> 0x000d }
            boolean r1 = r0.h(r8)
            if (r1 != 0) goto L_0x001a
            r3.e()
            goto L_0x0000
        L_0x001a:
            return r0
        L_0x001b:
            monitor-exit(r1)     // Catch:{ all -> 0x000d }
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: j1.f.d(int, int, int, boolean, boolean):j1.b");
    }

    public final String toString() {
        b a2 = a();
        if (a2 != null) {
            return a2.toString();
        }
        return this.f3549a.toString();
    }
}
