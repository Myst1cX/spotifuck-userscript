package m1;

import r1.e;
import r1.u;
import r1.x;

public final class v implements u {

    /* renamed from: a  reason: collision with root package name */
    public final e f3767a = new Object();

    /* renamed from: b  reason: collision with root package name */
    public boolean f3768b;

    /* renamed from: c  reason: collision with root package name */
    public boolean f3769c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ y f3770d;

    public final x a() {
        return this.f3770d.f3785j;
    }

    public final void b(e eVar, long j2) {
        e eVar2 = this.f3767a;
        eVar2.b(eVar, j2);
        while (eVar2.f4579b >= 16384) {
            f(false);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x000c, code lost:
        r0 = r13.f3770d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0013, code lost:
        if (r0.f3784h.f3769c != false) goto L_0x0036;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x001d, code lost:
        if (r13.f3767a.f4579b <= 0) goto L_0x002b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0025, code lost:
        if (r13.f3767a.f4579b <= 0) goto L_0x0036;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0027, code lost:
        f(true);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x002b, code lost:
        r0.f3781d.l(r0.f3780c, true, (r1.e) null, 0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0036, code lost:
        r1 = r13.f3770d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0038, code lost:
        monitor-enter(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:?, code lost:
        r13.f3768b = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x003b, code lost:
        monitor-exit(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x003c, code lost:
        r13.f3770d.f3781d.flush();
        r13.f3770d.a();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0048, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void close() {
        /*
            r13 = this;
            m1.y r0 = r13.f3770d
            monitor-enter(r0)
            boolean r1 = r13.f3768b     // Catch:{ all -> 0x0009 }
            if (r1 == 0) goto L_0x000b
            monitor-exit(r0)     // Catch:{ all -> 0x0009 }
            return
        L_0x0009:
            r1 = move-exception
            goto L_0x004c
        L_0x000b:
            monitor-exit(r0)     // Catch:{ all -> 0x0009 }
            m1.y r0 = r13.f3770d
            m1.v r1 = r0.f3784h
            boolean r1 = r1.f3769c
            r2 = 1
            if (r1 != 0) goto L_0x0036
            r1.e r1 = r13.f3767a
            long r3 = r1.f4579b
            r5 = 0
            int r1 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r1 <= 0) goto L_0x002b
        L_0x001f:
            r1.e r0 = r13.f3767a
            long r0 = r0.f4579b
            int r3 = (r0 > r5 ? 1 : (r0 == r5 ? 0 : -1))
            if (r3 <= 0) goto L_0x0036
            r13.f(r2)
            goto L_0x001f
        L_0x002b:
            m1.s r7 = r0.f3781d
            int r8 = r0.f3780c
            r11 = 0
            r9 = 1
            r10 = 0
            r7.l(r8, r9, r10, r11)
        L_0x0036:
            m1.y r1 = r13.f3770d
            monitor-enter(r1)
            r13.f3768b = r2     // Catch:{ all -> 0x0049 }
            monitor-exit(r1)     // Catch:{ all -> 0x0049 }
            m1.y r0 = r13.f3770d
            m1.s r0 = r0.f3781d
            r0.flush()
            m1.y r0 = r13.f3770d
            r0.a()
            return
        L_0x0049:
            r0 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x0049 }
            throw r0
        L_0x004c:
            monitor-exit(r0)     // Catch:{ all -> 0x0009 }
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: m1.v.close():void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0029, code lost:
        throw new java.io.InterruptedIOException();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:?, code lost:
        r1.f3785j.n();
        r11.f3770d.b();
        r9 = java.lang.Math.min(r11.f3770d.f3779b, r11.f3767a.f4579b);
        r1 = r11.f3770d;
        r1.f3779b -= r9;
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* JADX WARNING: Missing exception handler attribute for start block: B:15:0x0024 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void f(boolean r12) {
        /*
            r11 = this;
            m1.y r0 = r11.f3770d
            monitor-enter(r0)
            m1.y r1 = r11.f3770d     // Catch:{ all -> 0x007b }
            m1.x r1 = r1.f3785j     // Catch:{ all -> 0x007b }
            r1.i()     // Catch:{ all -> 0x007b }
        L_0x000a:
            m1.y r1 = r11.f3770d     // Catch:{ all -> 0x002a }
            long r2 = r1.f3779b     // Catch:{ all -> 0x002a }
            r4 = 0
            int r6 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r6 > 0) goto L_0x002c
            boolean r2 = r11.f3769c     // Catch:{ all -> 0x002a }
            if (r2 != 0) goto L_0x002c
            boolean r2 = r11.f3768b     // Catch:{ all -> 0x002a }
            if (r2 != 0) goto L_0x002c
            int r2 = r1.f3786k     // Catch:{ all -> 0x002a }
            if (r2 != 0) goto L_0x002c
            r1.wait()     // Catch:{ InterruptedException -> 0x0024 }
            goto L_0x000a
        L_0x0024:
            java.io.InterruptedIOException r12 = new java.io.InterruptedIOException     // Catch:{ all -> 0x002a }
            r12.<init>()     // Catch:{ all -> 0x002a }
            throw r12     // Catch:{ all -> 0x002a }
        L_0x002a:
            r12 = move-exception
            goto L_0x007d
        L_0x002c:
            m1.x r1 = r1.f3785j     // Catch:{ all -> 0x007b }
            r1.n()     // Catch:{ all -> 0x007b }
            m1.y r1 = r11.f3770d     // Catch:{ all -> 0x007b }
            r1.b()     // Catch:{ all -> 0x007b }
            m1.y r1 = r11.f3770d     // Catch:{ all -> 0x007b }
            long r1 = r1.f3779b     // Catch:{ all -> 0x007b }
            r1.e r3 = r11.f3767a     // Catch:{ all -> 0x007b }
            long r3 = r3.f4579b     // Catch:{ all -> 0x007b }
            long r9 = java.lang.Math.min(r1, r3)     // Catch:{ all -> 0x007b }
            m1.y r1 = r11.f3770d     // Catch:{ all -> 0x007b }
            long r2 = r1.f3779b     // Catch:{ all -> 0x007b }
            long r2 = r2 - r9
            r1.f3779b = r2     // Catch:{ all -> 0x007b }
            monitor-exit(r0)     // Catch:{ all -> 0x007b }
            m1.x r0 = r1.f3785j
            r0.i()
            m1.y r0 = r11.f3770d     // Catch:{ all -> 0x0062 }
            m1.s r5 = r0.f3781d     // Catch:{ all -> 0x0062 }
            int r6 = r0.f3780c     // Catch:{ all -> 0x0062 }
            if (r12 == 0) goto L_0x0064
            r1.e r12 = r11.f3767a     // Catch:{ all -> 0x0062 }
            long r0 = r12.f4579b     // Catch:{ all -> 0x0062 }
            int r12 = (r9 > r0 ? 1 : (r9 == r0 ? 0 : -1))
            if (r12 != 0) goto L_0x0064
            r12 = 1
            r7 = 1
            goto L_0x0066
        L_0x0062:
            r12 = move-exception
            goto L_0x0073
        L_0x0064:
            r12 = 0
            r7 = 0
        L_0x0066:
            r1.e r8 = r11.f3767a     // Catch:{ all -> 0x0062 }
            r5.l(r6, r7, r8, r9)     // Catch:{ all -> 0x0062 }
            m1.y r12 = r11.f3770d
            m1.x r12 = r12.f3785j
            r12.n()
            return
        L_0x0073:
            m1.y r0 = r11.f3770d
            m1.x r0 = r0.f3785j
            r0.n()
            throw r12
        L_0x007b:
            r12 = move-exception
            goto L_0x0085
        L_0x007d:
            m1.y r1 = r11.f3770d     // Catch:{ all -> 0x007b }
            m1.x r1 = r1.f3785j     // Catch:{ all -> 0x007b }
            r1.n()     // Catch:{ all -> 0x007b }
            throw r12     // Catch:{ all -> 0x007b }
        L_0x0085:
            monitor-exit(r0)     // Catch:{ all -> 0x007b }
            throw r12
        */
        throw new UnsupportedOperationException("Method not decompiled: m1.v.f(boolean):void");
    }

    public final void flush() {
        synchronized (this.f3770d) {
            this.f3770d.b();
        }
        while (this.f3767a.f4579b > 0) {
            f(false);
            this.f3770d.f3781d.flush();
        }
    }

    /* JADX WARNING: type inference failed for: r1v1, types: [r1.e, java.lang.Object] */
    public v(y yVar) {
        this.f3770d = yVar;
    }
}
