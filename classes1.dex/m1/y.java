package m1;

import java.io.IOException;
import java.util.ArrayList;

public final class y {

    /* renamed from: a  reason: collision with root package name */
    public long f3778a = 0;

    /* renamed from: b  reason: collision with root package name */
    public long f3779b;

    /* renamed from: c  reason: collision with root package name */
    public final int f3780c;

    /* renamed from: d  reason: collision with root package name */
    public final s f3781d;
    public ArrayList e;

    /* renamed from: f  reason: collision with root package name */
    public boolean f3782f;

    /* renamed from: g  reason: collision with root package name */
    public final w f3783g;

    /* renamed from: h  reason: collision with root package name */
    public final v f3784h;
    public final x i = new x(0, this);

    /* renamed from: j  reason: collision with root package name */
    public final x f3785j = new x(0, this);

    /* renamed from: k  reason: collision with root package name */
    public int f3786k = 0;

    public final void a() {
        boolean z2;
        boolean g2;
        synchronized (this) {
            try {
                w wVar = this.f3783g;
                if (!wVar.e && wVar.f3774d) {
                    v vVar = this.f3784h;
                    if (!vVar.f3769c) {
                        if (vVar.f3768b) {
                        }
                    }
                    z2 = true;
                    g2 = g();
                }
                z2 = false;
                g2 = g();
            } catch (Throwable th) {
                while (true) {
                    throw th;
                }
            }
        }
        if (z2) {
            c(6);
        } else if (!g2) {
            this.f3781d.j(this.f3780c);
        }
    }

    public final boolean d(int i2) {
        synchronized (this) {
            try {
                if (this.f3786k != 0) {
                    return false;
                }
                if (this.f3783g.e && this.f3784h.f3769c) {
                    return false;
                }
                this.f3786k = i2;
                notifyAll();
                this.f3781d.j(this.f3780c);
                return true;
            } catch (Throwable th) {
                while (true) {
                    throw th;
                }
            }
        }
    }

    public final v e() {
        synchronized (this) {
            try {
                if (!this.f3782f) {
                    if (!f()) {
                        throw new IllegalStateException("reply before requesting the sink");
                    }
                }
            } catch (Throwable th) {
                while (true) {
                    throw th;
                }
            }
        }
        return this.f3784h;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0026, code lost:
        return true;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized boolean g() {
        /*
            r3 = this;
            monitor-enter(r3)
            int r0 = r3.f3786k     // Catch:{ all -> 0x0013 }
            r1 = 0
            if (r0 == 0) goto L_0x0008
            monitor-exit(r3)
            return r1
        L_0x0008:
            m1.w r0 = r3.f3783g     // Catch:{ all -> 0x0013 }
            boolean r2 = r0.e     // Catch:{ all -> 0x0013 }
            if (r2 != 0) goto L_0x0015
            boolean r0 = r0.f3774d     // Catch:{ all -> 0x0013 }
            if (r0 == 0) goto L_0x0025
            goto L_0x0015
        L_0x0013:
            r0 = move-exception
            goto L_0x0028
        L_0x0015:
            m1.v r0 = r3.f3784h     // Catch:{ all -> 0x0013 }
            boolean r2 = r0.f3769c     // Catch:{ all -> 0x0013 }
            if (r2 != 0) goto L_0x001f
            boolean r0 = r0.f3768b     // Catch:{ all -> 0x0013 }
            if (r0 == 0) goto L_0x0025
        L_0x001f:
            boolean r0 = r3.f3782f     // Catch:{ all -> 0x0013 }
            if (r0 == 0) goto L_0x0025
            monitor-exit(r3)
            return r1
        L_0x0025:
            monitor-exit(r3)
            r0 = 1
            return r0
        L_0x0028:
            monitor-exit(r3)     // Catch:{ all -> 0x0013 }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: m1.y.g():boolean");
    }

    public final void h() {
        boolean g2;
        synchronized (this) {
            this.f3783g.e = true;
            g2 = g();
            notifyAll();
        }
        if (!g2) {
            this.f3781d.j(this.f3780c);
        }
    }

    public final void i(ArrayList arrayList) {
        boolean z2;
        synchronized (this) {
            z2 = true;
            try {
                this.f3782f = true;
                if (this.e == null) {
                    this.e = arrayList;
                    z2 = g();
                    notifyAll();
                } else {
                    ArrayList arrayList2 = new ArrayList();
                    arrayList2.addAll(this.e);
                    arrayList2.add((Object) null);
                    arrayList2.addAll(arrayList);
                    this.e = arrayList2;
                }
            } catch (Throwable th) {
                while (true) {
                    throw th;
                }
            }
        }
        if (!z2) {
            this.f3781d.j(this.f3780c);
        }
    }

    public final synchronized void j(int i2) {
        if (this.f3786k == 0) {
            this.f3786k = i2;
            notifyAll();
        }
    }

    public final void b() {
        v vVar = this.f3784h;
        if (vVar.f3768b) {
            throw new IOException("stream closed");
        } else if (vVar.f3769c) {
            throw new IOException("stream finished");
        } else if (this.f3786k != 0) {
            throw new D(this.f3786k);
        }
    }

    public final boolean f() {
        boolean z2;
        if ((this.f3780c & 1) == 1) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (this.f3781d.f3740a == z2) {
            return true;
        }
        return false;
    }

    public y(int i2, s sVar, boolean z2, boolean z3, ArrayList arrayList) {
        if (sVar != null) {
            this.f3780c = i2;
            this.f3781d = sVar;
            this.f3779b = (long) sVar.f3752o.b();
            w wVar = new w(this, (long) sVar.f3751n.b());
            this.f3783g = wVar;
            v vVar = new v(this);
            this.f3784h = vVar;
            wVar.e = z3;
            vVar.f3769c = z2;
            return;
        }
        throw new NullPointerException("connection == null");
    }

    public final void c(int i2) {
        if (d(i2)) {
            this.f3781d.f3755r.l(this.f3780c, i2);
        }
    }
}
