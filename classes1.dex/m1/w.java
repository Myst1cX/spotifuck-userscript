package m1;

import java.io.EOFException;
import r1.e;
import r1.v;
import r1.x;

public final class w implements v {

    /* renamed from: a  reason: collision with root package name */
    public final e f3771a = new Object();

    /* renamed from: b  reason: collision with root package name */
    public final e f3772b = new Object();

    /* renamed from: c  reason: collision with root package name */
    public final long f3773c;

    /* renamed from: d  reason: collision with root package name */
    public boolean f3774d;
    public boolean e;

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ y f3775f;

    public final x a() {
        return this.f3775f.i;
    }

    public final void close() {
        synchronized (this.f3775f) {
            this.f3774d = true;
            e eVar = this.f3772b;
            try {
                eVar.s(eVar.f4579b);
                this.f3775f.notifyAll();
            } catch (EOFException e2) {
                throw new AssertionError(e2);
            }
        }
        this.f3775f.a();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:34:0x007b, code lost:
        r9 = r8.f3775f.f3781d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x007f, code lost:
        monitor-enter(r9);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:?, code lost:
        r10 = r8.f3775f.f3781d;
        r4 = r10.f3749l + r0;
        r10.f3749l = r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x0094, code lost:
        if (r4 < ((long) (r10.f3751n.b() / 2))) goto L_0x00a9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x0096, code lost:
        r10 = r8.f3775f.f3781d;
        r10.n(0, r10.f3749l);
        r8.f3775f.f3781d.f3749l = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x00a7, code lost:
        r10 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x00a9, code lost:
        monitor-exit(r9);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x00aa, code lost:
        return r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x00ac, code lost:
        throw r10;
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* JADX WARNING: Missing exception handler attribute for start block: B:15:0x0024 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final long e(r1.e r9, long r10) {
        /*
            r8 = this;
            m1.y r10 = r8.f3775f
            monitor-enter(r10)
            m1.y r11 = r8.f3775f     // Catch:{ all -> 0x0048 }
            m1.x r0 = r11.i     // Catch:{ all -> 0x0048 }
            r0.i()     // Catch:{ all -> 0x0048 }
        L_0x000a:
            r1.e r0 = r8.f3772b     // Catch:{ all -> 0x002a }
            long r0 = r0.f4579b     // Catch:{ all -> 0x002a }
            r2 = 0
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 != 0) goto L_0x002d
            boolean r0 = r8.e     // Catch:{ all -> 0x002a }
            if (r0 != 0) goto L_0x002d
            boolean r0 = r8.f3774d     // Catch:{ all -> 0x002a }
            if (r0 != 0) goto L_0x002d
            int r0 = r11.f3786k     // Catch:{ all -> 0x002a }
            if (r0 != 0) goto L_0x002d
            r11.wait()     // Catch:{ InterruptedException -> 0x0024 }
            goto L_0x000a
        L_0x0024:
            java.io.InterruptedIOException r9 = new java.io.InterruptedIOException     // Catch:{ all -> 0x002a }
            r9.<init>()     // Catch:{ all -> 0x002a }
            throw r9     // Catch:{ all -> 0x002a }
        L_0x002a:
            r9 = move-exception
            goto L_0x00bd
        L_0x002d:
            m1.x r11 = r11.i     // Catch:{ all -> 0x0048 }
            r11.n()     // Catch:{ all -> 0x0048 }
            boolean r11 = r8.f3774d     // Catch:{ all -> 0x0048 }
            if (r11 != 0) goto L_0x00b5
            m1.y r11 = r8.f3775f     // Catch:{ all -> 0x0048 }
            int r0 = r11.f3786k     // Catch:{ all -> 0x0048 }
            if (r0 != 0) goto L_0x00ad
            r1.e r11 = r8.f3772b     // Catch:{ all -> 0x0048 }
            long r0 = r11.f4579b     // Catch:{ all -> 0x0048 }
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 != 0) goto L_0x004b
            monitor-exit(r10)     // Catch:{ all -> 0x0048 }
            r9 = -1
            return r9
        L_0x0048:
            r9 = move-exception
            goto L_0x00c3
        L_0x004b:
            r4 = 8192(0x2000, double:4.0474E-320)
            long r0 = java.lang.Math.min(r4, r0)     // Catch:{ all -> 0x0048 }
            long r0 = r11.e(r9, r0)     // Catch:{ all -> 0x0048 }
            m1.y r9 = r8.f3775f     // Catch:{ all -> 0x0048 }
            long r4 = r9.f3778a     // Catch:{ all -> 0x0048 }
            long r4 = r4 + r0
            r9.f3778a = r4     // Catch:{ all -> 0x0048 }
            m1.s r9 = r9.f3781d     // Catch:{ all -> 0x0048 }
            K.j r9 = r9.f3751n     // Catch:{ all -> 0x0048 }
            int r9 = r9.b()     // Catch:{ all -> 0x0048 }
            int r9 = r9 / 2
            long r6 = (long) r9     // Catch:{ all -> 0x0048 }
            int r9 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r9 < 0) goto L_0x007a
            m1.y r9 = r8.f3775f     // Catch:{ all -> 0x0048 }
            m1.s r11 = r9.f3781d     // Catch:{ all -> 0x0048 }
            int r4 = r9.f3780c     // Catch:{ all -> 0x0048 }
            long r5 = r9.f3778a     // Catch:{ all -> 0x0048 }
            r11.n(r4, r5)     // Catch:{ all -> 0x0048 }
            m1.y r9 = r8.f3775f     // Catch:{ all -> 0x0048 }
            r9.f3778a = r2     // Catch:{ all -> 0x0048 }
        L_0x007a:
            monitor-exit(r10)     // Catch:{ all -> 0x0048 }
            m1.y r9 = r8.f3775f
            m1.s r9 = r9.f3781d
            monitor-enter(r9)
            m1.y r10 = r8.f3775f     // Catch:{ all -> 0x00a7 }
            m1.s r10 = r10.f3781d     // Catch:{ all -> 0x00a7 }
            long r4 = r10.f3749l     // Catch:{ all -> 0x00a7 }
            long r4 = r4 + r0
            r10.f3749l = r4     // Catch:{ all -> 0x00a7 }
            K.j r10 = r10.f3751n     // Catch:{ all -> 0x00a7 }
            int r10 = r10.b()     // Catch:{ all -> 0x00a7 }
            int r10 = r10 / 2
            long r10 = (long) r10     // Catch:{ all -> 0x00a7 }
            int r6 = (r4 > r10 ? 1 : (r4 == r10 ? 0 : -1))
            if (r6 < 0) goto L_0x00a9
            m1.y r10 = r8.f3775f     // Catch:{ all -> 0x00a7 }
            m1.s r10 = r10.f3781d     // Catch:{ all -> 0x00a7 }
            long r4 = r10.f3749l     // Catch:{ all -> 0x00a7 }
            r11 = 0
            r10.n(r11, r4)     // Catch:{ all -> 0x00a7 }
            m1.y r10 = r8.f3775f     // Catch:{ all -> 0x00a7 }
            m1.s r10 = r10.f3781d     // Catch:{ all -> 0x00a7 }
            r10.f3749l = r2     // Catch:{ all -> 0x00a7 }
            goto L_0x00a9
        L_0x00a7:
            r10 = move-exception
            goto L_0x00ab
        L_0x00a9:
            monitor-exit(r9)     // Catch:{ all -> 0x00a7 }
            return r0
        L_0x00ab:
            monitor-exit(r9)     // Catch:{ all -> 0x00a7 }
            throw r10
        L_0x00ad:
            m1.D r9 = new m1.D     // Catch:{ all -> 0x0048 }
            int r11 = r11.f3786k     // Catch:{ all -> 0x0048 }
            r9.<init>(r11)     // Catch:{ all -> 0x0048 }
            throw r9     // Catch:{ all -> 0x0048 }
        L_0x00b5:
            java.io.IOException r9 = new java.io.IOException     // Catch:{ all -> 0x0048 }
            java.lang.String r11 = "stream closed"
            r9.<init>(r11)     // Catch:{ all -> 0x0048 }
            throw r9     // Catch:{ all -> 0x0048 }
        L_0x00bd:
            m1.x r11 = r11.i     // Catch:{ all -> 0x0048 }
            r11.n()     // Catch:{ all -> 0x0048 }
            throw r9     // Catch:{ all -> 0x0048 }
        L_0x00c3:
            monitor-exit(r10)     // Catch:{ all -> 0x0048 }
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: m1.w.e(r1.e, long):long");
    }

    /* JADX WARNING: type inference failed for: r1v1, types: [r1.e, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r1v2, types: [r1.e, java.lang.Object] */
    public w(y yVar, long j2) {
        this.f3775f = yVar;
        this.f3773c = j2;
    }
}
