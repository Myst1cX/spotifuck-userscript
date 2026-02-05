package w;

import t.C0339e;
import v.C0346c;
import v.C0347d;

public abstract class o implements d {

    /* renamed from: a  reason: collision with root package name */
    public int f4893a;

    /* renamed from: b  reason: collision with root package name */
    public C0347d f4894b;

    /* renamed from: c  reason: collision with root package name */
    public l f4895c;

    /* renamed from: d  reason: collision with root package name */
    public int f4896d;
    public final g e = new g(this);

    /* renamed from: f  reason: collision with root package name */
    public int f4897f = 0;

    /* renamed from: g  reason: collision with root package name */
    public boolean f4898g = false;

    /* renamed from: h  reason: collision with root package name */
    public final f f4899h = new f(this);
    public final f i = new f(this);

    /* renamed from: j  reason: collision with root package name */
    public int f4900j = 1;

    public abstract void d();

    public abstract void e();

    public abstract void f();

    public abstract boolean k();

    public static void b(f fVar, f fVar2, int i2) {
        fVar.f4880l.add(fVar2);
        fVar.f4875f = i2;
        fVar2.f4879k.add(fVar);
    }

    public static f h(C0346c cVar) {
        C0346c cVar2 = cVar.f4705f;
        if (cVar2 == null) {
            return null;
        }
        int a2 = C0339e.a(cVar2.e);
        C0347d dVar = cVar2.f4704d;
        if (a2 == 1) {
            return dVar.f4739d.f4899h;
        }
        if (a2 == 2) {
            return dVar.e.f4899h;
        }
        if (a2 == 3) {
            return dVar.f4739d.i;
        }
        if (a2 == 4) {
            return dVar.e.i;
        }
        if (a2 != 5) {
            return null;
        }
        return dVar.e.f4886k;
    }

    public static f i(C0346c cVar, int i2) {
        o oVar;
        C0346c cVar2 = cVar.f4705f;
        if (cVar2 == null) {
            return null;
        }
        C0347d dVar = cVar2.f4704d;
        if (i2 == 0) {
            oVar = dVar.f4739d;
        } else {
            oVar = dVar.e;
        }
        int a2 = C0339e.a(cVar2.e);
        if (a2 == 1 || a2 == 2) {
            return oVar.f4899h;
        }
        if (a2 == 3 || a2 == 4) {
            return oVar.i;
        }
        return null;
    }

    public final void c(f fVar, f fVar2, int i2, g gVar) {
        fVar.f4880l.add(fVar2);
        fVar.f4880l.add(this.e);
        fVar.f4877h = i2;
        fVar.i = gVar;
        fVar2.f4879k.add(fVar);
        gVar.f4879k.add(fVar);
    }

    public final int g(int i2, int i3) {
        int i4;
        if (i3 == 0) {
            C0347d dVar = this.f4894b;
            int i5 = dVar.f4767v;
            i4 = Math.max(dVar.f4766u, i2);
            if (i5 > 0) {
                i4 = Math.min(i5, i2);
            }
            if (i4 == i2) {
                return i2;
            }
        } else {
            C0347d dVar2 = this.f4894b;
            int i6 = dVar2.f4770y;
            int max = Math.max(dVar2.f4769x, i2);
            if (i6 > 0) {
                max = Math.min(i6, i2);
            }
            if (i4 == i2) {
                return i2;
            }
        }
        return i4;
    }

    public long j() {
        g gVar = this.e;
        if (gVar.f4878j) {
            return (long) gVar.f4876g;
        }
        return 0;
    }

    public o(C0347d dVar) {
        this.f4894b = dVar;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0051, code lost:
        if (r9.f4893a == 3) goto L_0x00b2;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void l(v.C0346c r12, v.C0346c r13, int r14) {
        /*
            r11 = this;
            w.f r0 = h(r12)
            w.f r1 = h(r13)
            boolean r2 = r0.f4878j
            if (r2 == 0) goto L_0x00ed
            boolean r2 = r1.f4878j
            if (r2 != 0) goto L_0x0012
            goto L_0x00ed
        L_0x0012:
            int r2 = r0.f4876g
            int r12 = r12.e()
            int r12 = r12 + r2
            int r2 = r1.f4876g
            int r13 = r13.e()
            int r2 = r2 - r13
            int r13 = r2 - r12
            w.g r3 = r11.e
            boolean r4 = r3.f4878j
            r5 = 1056964608(0x3f000000, float:0.5)
            if (r4 != 0) goto L_0x00b2
            int r4 = r11.f4896d
            r6 = 3
            if (r4 != r6) goto L_0x00b2
            int r4 = r11.f4893a
            if (r4 == 0) goto L_0x00ab
            r7 = 1
            if (r4 == r7) goto L_0x009d
            r8 = 2
            if (r4 == r8) goto L_0x0074
            if (r4 == r6) goto L_0x003d
            goto L_0x00b2
        L_0x003d:
            v.d r4 = r11.f4894b
            w.k r8 = r4.f4739d
            int r9 = r8.f4896d
            if (r9 != r6) goto L_0x0054
            int r9 = r8.f4893a
            if (r9 != r6) goto L_0x0054
            w.m r9 = r4.e
            int r10 = r9.f4896d
            if (r10 != r6) goto L_0x0054
            int r9 = r9.f4893a
            if (r9 != r6) goto L_0x0054
            goto L_0x00b2
        L_0x0054:
            if (r14 != 0) goto L_0x0058
            w.m r8 = r4.e
        L_0x0058:
            w.g r6 = r8.e
            boolean r8 = r6.f4878j
            if (r8 == 0) goto L_0x00b2
            float r4 = r4.f4729W
            if (r14 != r7) goto L_0x0069
            int r6 = r6.f4876g
            float r6 = (float) r6
            float r6 = r6 / r4
            float r6 = r6 + r5
            int r4 = (int) r6
            goto L_0x0070
        L_0x0069:
            int r6 = r6.f4876g
            float r6 = (float) r6
            float r4 = r4 * r6
            float r4 = r4 + r5
            int r4 = (int) r4
        L_0x0070:
            r3.d(r4)
            goto L_0x00b2
        L_0x0074:
            v.d r4 = r11.f4894b
            v.d r6 = r4.f4726T
            if (r6 == 0) goto L_0x00b2
            if (r14 != 0) goto L_0x007f
            w.k r6 = r6.f4739d
            goto L_0x0081
        L_0x007f:
            w.m r6 = r6.e
        L_0x0081:
            w.g r6 = r6.e
            boolean r7 = r6.f4878j
            if (r7 == 0) goto L_0x00b2
            if (r14 != 0) goto L_0x008c
            float r4 = r4.f4768w
            goto L_0x008e
        L_0x008c:
            float r4 = r4.f4771z
        L_0x008e:
            int r6 = r6.f4876g
            float r6 = (float) r6
            float r6 = r6 * r4
            float r6 = r6 + r5
            int r4 = (int) r6
            int r4 = r11.g(r4, r14)
            r3.d(r4)
            goto L_0x00b2
        L_0x009d:
            int r4 = r3.f4881m
            int r4 = r11.g(r4, r14)
            int r4 = java.lang.Math.min(r4, r13)
            r3.d(r4)
            goto L_0x00b2
        L_0x00ab:
            int r4 = r11.g(r13, r14)
            r3.d(r4)
        L_0x00b2:
            boolean r4 = r3.f4878j
            if (r4 != 0) goto L_0x00b7
            return
        L_0x00b7:
            int r4 = r3.f4876g
            w.f r6 = r11.i
            w.f r7 = r11.f4899h
            if (r4 != r13) goto L_0x00c6
            r7.d(r12)
            r6.d(r2)
            return
        L_0x00c6:
            if (r14 != 0) goto L_0x00cd
            v.d r13 = r11.f4894b
            float r13 = r13.f4740d0
            goto L_0x00d1
        L_0x00cd:
            v.d r13 = r11.f4894b
            float r13 = r13.f4741e0
        L_0x00d1:
            if (r0 != r1) goto L_0x00d9
            int r12 = r0.f4876g
            int r2 = r1.f4876g
            r13 = 1056964608(0x3f000000, float:0.5)
        L_0x00d9:
            int r2 = r2 - r12
            int r2 = r2 - r4
            float r12 = (float) r12
            float r12 = r12 + r5
            float r14 = (float) r2
            float r14 = r14 * r13
            float r14 = r14 + r12
            int r12 = (int) r14
            r7.d(r12)
            int r12 = r7.f4876g
            int r13 = r3.f4876g
            int r12 = r12 + r13
            r6.d(r12)
        L_0x00ed:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: w.o.l(v.c, v.c, int):void");
    }
}
