package i1;

import java.io.IOException;

public final class d {

    /* renamed from: a  reason: collision with root package name */
    public final e f3102a;

    /* renamed from: b  reason: collision with root package name */
    public final boolean[] f3103b;

    /* renamed from: c  reason: collision with root package name */
    public boolean f3104c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ g f3105d;

    /* JADX WARNING: type inference failed for: r6v5, types: [r1.u, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r6v7, types: [java.lang.Object, r1.x] */
    /* JADX WARNING: type inference failed for: r3v3, types: [java.lang.Object, r1.x] */
    /* JADX WARNING: type inference failed for: r6v9, types: [r1.u, java.lang.Object] */
    /* JADX WARNING: Can't wrap try/catch for region: R(2:24|25) */
    /* JADX WARNING: Code restructure failed: missing block: B:25:?, code lost:
        r6.getParentFile().mkdirs();
        r2 = r1.o.f4594a;
        r4 = new r1.a((r1.x) new java.lang.Object(), (java.io.OutputStream) new java.io.FileOutputStream(r6));
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:24:0x0048 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final r1.u d(int r6) {
        /*
            r5 = this;
            r0 = 1
            i1.g r1 = r5.f3105d
            monitor-enter(r1)
            boolean r2 = r5.f3104c     // Catch:{ all -> 0x0017 }
            if (r2 != 0) goto L_0x0070
            i1.e r2 = r5.f3102a     // Catch:{ all -> 0x0017 }
            i1.d r3 = r2.f3110f     // Catch:{ all -> 0x0017 }
            if (r3 == r5) goto L_0x0019
            java.util.logging.Logger r6 = r1.o.f4594a     // Catch:{ all -> 0x0017 }
            r1.n r6 = new r1.n     // Catch:{ all -> 0x0017 }
            r6.<init>()     // Catch:{ all -> 0x0017 }
            monitor-exit(r1)     // Catch:{ all -> 0x0017 }
            return r6
        L_0x0017:
            r6 = move-exception
            goto L_0x0076
        L_0x0019:
            boolean r3 = r2.e     // Catch:{ all -> 0x0017 }
            if (r3 != 0) goto L_0x0021
            boolean[] r3 = r5.f3103b     // Catch:{ all -> 0x0017 }
            r3[r6] = r0     // Catch:{ all -> 0x0017 }
        L_0x0021:
            java.io.File[] r2 = r2.f3109d     // Catch:{ all -> 0x0017 }
            r6 = r2[r6]     // Catch:{ all -> 0x0017 }
            i1.g r2 = r5.f3105d     // Catch:{ FileNotFoundException -> 0x0067 }
            n1.a r2 = r2.f3118a     // Catch:{ FileNotFoundException -> 0x0067 }
            r2.getClass()     // Catch:{ FileNotFoundException -> 0x0067 }
            java.util.logging.Logger r2 = r1.o.f4594a     // Catch:{ FileNotFoundException -> 0x0048 }
            if (r6 == 0) goto L_0x0040
            java.io.FileOutputStream r2 = new java.io.FileOutputStream     // Catch:{ FileNotFoundException -> 0x0048 }
            r2.<init>(r6)     // Catch:{ FileNotFoundException -> 0x0048 }
            r1.x r3 = new r1.x     // Catch:{ FileNotFoundException -> 0x0048 }
            r3.<init>()     // Catch:{ FileNotFoundException -> 0x0048 }
            r1.a r4 = new r1.a     // Catch:{ FileNotFoundException -> 0x0048 }
            r4.<init>((r1.x) r3, (java.io.OutputStream) r2)     // Catch:{ FileNotFoundException -> 0x0048 }
            goto L_0x0060
        L_0x0040:
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException     // Catch:{ FileNotFoundException -> 0x0048 }
            java.lang.String r3 = "file == null"
            r2.<init>(r3)     // Catch:{ FileNotFoundException -> 0x0048 }
            throw r2     // Catch:{ FileNotFoundException -> 0x0048 }
        L_0x0048:
            java.io.File r2 = r6.getParentFile()     // Catch:{ FileNotFoundException -> 0x0067 }
            r2.mkdirs()     // Catch:{ FileNotFoundException -> 0x0067 }
            java.util.logging.Logger r2 = r1.o.f4594a     // Catch:{ FileNotFoundException -> 0x0067 }
            java.io.FileOutputStream r2 = new java.io.FileOutputStream     // Catch:{ FileNotFoundException -> 0x0067 }
            r2.<init>(r6)     // Catch:{ FileNotFoundException -> 0x0067 }
            r1.x r6 = new r1.x     // Catch:{ FileNotFoundException -> 0x0067 }
            r6.<init>()     // Catch:{ FileNotFoundException -> 0x0067 }
            r1.a r4 = new r1.a     // Catch:{ FileNotFoundException -> 0x0067 }
            r4.<init>((r1.x) r6, (java.io.OutputStream) r2)     // Catch:{ FileNotFoundException -> 0x0067 }
        L_0x0060:
            i1.c r6 = new i1.c     // Catch:{ all -> 0x0017 }
            r6.<init>(r5, r4, r0)     // Catch:{ all -> 0x0017 }
            monitor-exit(r1)     // Catch:{ all -> 0x0017 }
            return r6
        L_0x0067:
            java.util.logging.Logger r6 = r1.o.f4594a     // Catch:{ all -> 0x0017 }
            r1.n r6 = new r1.n     // Catch:{ all -> 0x0017 }
            r6.<init>()     // Catch:{ all -> 0x0017 }
            monitor-exit(r1)     // Catch:{ all -> 0x0017 }
            return r6
        L_0x0070:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException     // Catch:{ all -> 0x0017 }
            r6.<init>()     // Catch:{ all -> 0x0017 }
            throw r6     // Catch:{ all -> 0x0017 }
        L_0x0076:
            monitor-exit(r1)     // Catch:{ all -> 0x0017 }
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: i1.d.d(int):r1.u");
    }

    public final void a() {
        synchronized (this.f3105d) {
            try {
                if (!this.f3104c) {
                    if (this.f3102a.f3110f == this) {
                        this.f3105d.g(this, false);
                    }
                    this.f3104c = true;
                } else {
                    throw new IllegalStateException();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void b() {
        synchronized (this.f3105d) {
            try {
                if (!this.f3104c) {
                    if (this.f3102a.f3110f == this) {
                        this.f3105d.g(this, true);
                    }
                    this.f3104c = true;
                } else {
                    throw new IllegalStateException();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void c() {
        e eVar = this.f3102a;
        if (eVar.f3110f == this) {
            int i = 0;
            while (true) {
                g gVar = this.f3105d;
                if (i < gVar.f3124h) {
                    try {
                        gVar.f3118a.a(eVar.f3109d[i]);
                    } catch (IOException unused) {
                    }
                    i++;
                } else {
                    eVar.f3110f = null;
                    return;
                }
            }
        }
    }

    public d(g gVar, e eVar) {
        boolean[] zArr;
        this.f3105d = gVar;
        this.f3102a = eVar;
        if (eVar.e) {
            zArr = null;
        } else {
            zArr = new boolean[gVar.f3124h];
        }
        this.f3103b = zArr;
    }
}
