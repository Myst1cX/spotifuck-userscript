package w;

import java.util.HashSet;
import java.util.Iterator;
import v.C0346c;
import v.C0347d;
import v.C0348e;
import y.f;

public abstract class h {

    /* renamed from: a  reason: collision with root package name */
    public static final C0351b f4882a = new Object();

    public static boolean h(int i, int i2, int i3, int i4) {
        boolean z2;
        boolean z3;
        if (i3 == 1 || i3 == 2 || (i3 == 4 && i != 2)) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (i4 == 1 || i4 == 2 || (i4 == 4 && i2 != 2)) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (z2 || z3) {
            return true;
        }
        return false;
    }

    public static boolean a(C0347d dVar) {
        C0348e eVar;
        boolean z2;
        boolean z3;
        int[] iArr = dVar.f4761p0;
        int i = iArr[0];
        int i2 = iArr[1];
        C0347d dVar2 = dVar.f4726T;
        if (dVar2 != null) {
            eVar = (C0348e) dVar2;
        } else {
            eVar = null;
        }
        if (eVar != null) {
            int i3 = eVar.f4761p0[0];
        }
        if (eVar != null) {
            int i4 = eVar.f4761p0[1];
        }
        if (i == 1 || dVar.A() || i == 2 || ((i == 3 && dVar.f4763r == 0 && dVar.f4729W == 0.0f && dVar.t(0)) || (i == 3 && dVar.f4763r == 1 && dVar.u(0, dVar.q())))) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (i2 == 1 || dVar.B() || i2 == 2 || ((i2 == 3 && dVar.f4764s == 0 && dVar.f4729W == 0.0f && dVar.t(1)) || (i2 == 3 && dVar.f4764s == 1 && dVar.u(1, dVar.k())))) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (dVar.f4729W > 0.0f && (z2 || z3)) {
            return true;
        }
        if (!z2 || !z3) {
            return false;
        }
        return true;
    }

    /* JADX WARNING: type inference failed for: r10v5, types: [w.n, java.lang.Object] */
    /* JADX WARNING: Failed to insert additional move for type inference */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static w.n b(v.C0347d r7, int r8, java.util.ArrayList r9, w.n r10) {
        /*
            if (r8 != 0) goto L_0x0005
            int r0 = r7.f4757n0
            goto L_0x0007
        L_0x0005:
            int r0 = r7.f4759o0
        L_0x0007:
            r1 = 0
            r2 = -1
            if (r0 == r2) goto L_0x002f
            if (r10 == 0) goto L_0x0011
            int r3 = r10.f4890b
            if (r0 == r3) goto L_0x002f
        L_0x0011:
            r3 = 0
        L_0x0012:
            int r4 = r9.size()
            if (r3 >= r4) goto L_0x0032
            java.lang.Object r4 = r9.get(r3)
            w.n r4 = (w.n) r4
            int r5 = r4.f4890b
            if (r5 != r0) goto L_0x002c
            if (r10 == 0) goto L_0x002a
            r10.c(r8, r4)
            r9.remove(r10)
        L_0x002a:
            r10 = r4
            goto L_0x0032
        L_0x002c:
            int r3 = r3 + 1
            goto L_0x0012
        L_0x002f:
            if (r0 == r2) goto L_0x0032
            return r10
        L_0x0032:
            r0 = 1
            if (r10 != 0) goto L_0x008f
            boolean r3 = r7 instanceof v.i
            if (r3 == 0) goto L_0x006f
            r3 = r7
            v.i r3 = (v.i) r3
            r4 = 0
        L_0x003d:
            int r5 = r3.f4848r0
            if (r4 >= r5) goto L_0x0056
            v.d[] r5 = r3.f4847q0
            r5 = r5[r4]
            if (r8 != 0) goto L_0x004c
            int r6 = r5.f4757n0
            if (r6 == r2) goto L_0x004c
            goto L_0x0057
        L_0x004c:
            if (r8 != r0) goto L_0x0053
            int r6 = r5.f4759o0
            if (r6 == r2) goto L_0x0053
            goto L_0x0057
        L_0x0053:
            int r4 = r4 + 1
            goto L_0x003d
        L_0x0056:
            r6 = -1
        L_0x0057:
            if (r6 == r2) goto L_0x006f
            r3 = 0
        L_0x005a:
            int r4 = r9.size()
            if (r3 >= r4) goto L_0x006f
            java.lang.Object r4 = r9.get(r3)
            w.n r4 = (w.n) r4
            int r5 = r4.f4890b
            if (r5 != r6) goto L_0x006c
            r10 = r4
            goto L_0x006f
        L_0x006c:
            int r3 = r3 + 1
            goto L_0x005a
        L_0x006f:
            if (r10 != 0) goto L_0x008c
            w.n r10 = new w.n
            r10.<init>()
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            r10.f4889a = r3
            r3 = 0
            r10.f4892d = r3
            r10.e = r2
            int r2 = w.n.f4888f
            int r3 = r2 + 1
            w.n.f4888f = r3
            r10.f4890b = r2
            r10.f4891c = r8
        L_0x008c:
            r9.add(r10)
        L_0x008f:
            java.util.ArrayList r2 = r10.f4889a
            boolean r3 = r2.contains(r7)
            if (r3 == 0) goto L_0x0098
            goto L_0x00d3
        L_0x0098:
            r2.add(r7)
            boolean r2 = r7 instanceof v.h
            if (r2 == 0) goto L_0x00ac
            r2 = r7
            v.h r2 = (v.h) r2
            v.c r3 = r2.f4844t0
            int r2 = r2.f4845u0
            if (r2 != 0) goto L_0x00a9
            r1 = 1
        L_0x00a9:
            r3.c(r1, r9, r10)
        L_0x00ac:
            int r0 = r10.f4890b
            if (r8 != 0) goto L_0x00bd
            r7.f4757n0 = r0
            v.c r0 = r7.I
            r0.c(r8, r9, r10)
            v.c r0 = r7.f4717K
            r0.c(r8, r9, r10)
            goto L_0x00ce
        L_0x00bd:
            r7.f4759o0 = r0
            v.c r0 = r7.f4716J
            r0.c(r8, r9, r10)
            v.c r0 = r7.f4719M
            r0.c(r8, r9, r10)
            v.c r0 = r7.f4718L
            r0.c(r8, r9, r10)
        L_0x00ce:
            v.c r7 = r7.f4722P
            r7.c(r8, r9, r10)
        L_0x00d3:
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: w.h.b(v.d, int, java.util.ArrayList, w.n):w.n");
    }

    /* JADX WARNING: type inference failed for: r9v7, types: [java.lang.Object, w.b] */
    /* JADX WARNING: type inference failed for: r8v8, types: [java.lang.Object, w.b] */
    /* JADX WARNING: type inference failed for: r3v11, types: [java.lang.Object, w.b] */
    public static void c(int i, C0347d dVar, f fVar, boolean z2) {
        boolean z3;
        C0346c cVar;
        C0346c cVar2;
        boolean z4;
        C0346c cVar3;
        C0346c cVar4;
        C0347d dVar2 = dVar;
        f fVar2 = fVar;
        boolean z5 = z2;
        if (!dVar2.f4755m) {
            if (!(dVar2 instanceof C0348e) && dVar.z() && a(dVar)) {
                C0348e.V(dVar2, fVar2, new Object());
            }
            C0346c i2 = dVar2.i(2);
            C0346c i3 = dVar2.i(4);
            int d2 = i2.d();
            int d3 = i3.d();
            HashSet hashSet = i2.f4701a;
            char c2 = 0;
            if (hashSet != null && i2.f4703c) {
                Iterator it2 = hashSet.iterator();
                while (it2.hasNext()) {
                    C0346c cVar5 = (C0346c) it2.next();
                    C0347d dVar3 = cVar5.f4704d;
                    int i4 = i + 1;
                    boolean a2 = a(dVar3);
                    if (dVar3.z() && a2) {
                        C0348e.V(dVar3, fVar2, new Object());
                    }
                    C0346c cVar6 = dVar3.I;
                    C0346c cVar7 = dVar3.f4717K;
                    if ((cVar5 != cVar6 || (cVar4 = cVar7.f4705f) == null || !cVar4.f4703c) && (cVar5 != cVar7 || (cVar3 = cVar6.f4705f) == null || !cVar3.f4703c)) {
                        z4 = false;
                    } else {
                        z4 = true;
                    }
                    int i5 = dVar3.f4761p0[c2];
                    if (i5 != 3 || a2) {
                        if (!dVar3.z()) {
                            if (cVar5 == cVar6 && cVar7.f4705f == null) {
                                int e = cVar6.e() + d2;
                                dVar3.J(e, dVar3.q() + e);
                                c(i4, dVar3, fVar2, z5);
                            } else if (cVar5 == cVar7 && cVar6.f4705f == null) {
                                int e2 = d2 - cVar7.e();
                                dVar3.J(e2 - dVar3.q(), e2);
                                c(i4, dVar3, fVar2, z5);
                            } else if (z4 && !dVar3.x()) {
                                d(i4, dVar3, fVar2, z5);
                            }
                        }
                    } else if (i5 == 3 && dVar3.f4767v >= 0 && dVar3.f4766u >= 0 && ((dVar3.f4745g0 == 8 || (dVar3.f4763r == 0 && dVar3.f4729W == 0.0f)) && !dVar3.x() && !dVar3.f4713F && z4 && !dVar3.x())) {
                        e(i4, dVar2, fVar2, dVar3, z5);
                    }
                    c2 = 0;
                }
            }
            if (!(dVar2 instanceof v.h)) {
                HashSet hashSet2 = i3.f4701a;
                if (hashSet2 != null && i3.f4703c) {
                    Iterator it3 = hashSet2.iterator();
                    while (it3.hasNext()) {
                        C0346c cVar8 = (C0346c) it3.next();
                        C0347d dVar4 = cVar8.f4704d;
                        int i6 = i + 1;
                        boolean a3 = a(dVar4);
                        if (dVar4.z() && a3) {
                            C0348e.V(dVar4, fVar2, new Object());
                        }
                        C0346c cVar9 = dVar4.I;
                        C0346c cVar10 = dVar4.f4717K;
                        if ((cVar8 != cVar9 || (cVar2 = cVar10.f4705f) == null || !cVar2.f4703c) && (cVar8 != cVar10 || (cVar = cVar9.f4705f) == null || !cVar.f4703c)) {
                            z3 = false;
                        } else {
                            z3 = true;
                        }
                        int i7 = dVar4.f4761p0[0];
                        if (i7 != 3 || a3) {
                            if (!dVar4.z()) {
                                if (cVar8 == cVar9 && cVar10.f4705f == null) {
                                    int e3 = cVar9.e() + d3;
                                    dVar4.J(e3, dVar4.q() + e3);
                                    c(i6, dVar4, fVar2, z5);
                                } else if (cVar8 == cVar10 && cVar9.f4705f == null) {
                                    int e4 = d3 - cVar10.e();
                                    dVar4.J(e4 - dVar4.q(), e4);
                                    c(i6, dVar4, fVar2, z5);
                                } else if (z3 && !dVar4.x()) {
                                    d(i6, dVar4, fVar2, z5);
                                }
                            }
                        } else if (i7 == 3 && dVar4.f4767v >= 0 && dVar4.f4766u >= 0) {
                            if (dVar4.f4745g0 != 8) {
                                if (dVar4.f4763r == 0) {
                                    if (dVar4.f4729W != 0.0f) {
                                    }
                                }
                            }
                            if (!dVar4.x() && !dVar4.f4713F && z3 && !dVar4.x()) {
                                e(i6, dVar2, fVar2, dVar4, z5);
                            }
                        }
                    }
                }
                dVar2.f4755m = true;
            }
        }
    }

    public static void d(int i, C0347d dVar, f fVar, boolean z2) {
        float f2;
        float f3 = dVar.f4740d0;
        C0346c cVar = dVar.I;
        int d2 = cVar.f4705f.d();
        C0346c cVar2 = dVar.f4717K;
        int d3 = cVar2.f4705f.d();
        int e = cVar.e() + d2;
        int e2 = d3 - cVar2.e();
        if (d2 == d3) {
            f3 = 0.5f;
        } else {
            d2 = e;
            d3 = e2;
        }
        int q2 = dVar.q();
        int i2 = (d3 - d2) - q2;
        if (d2 > d3) {
            i2 = (d2 - d3) - q2;
        }
        if (i2 > 0) {
            f2 = (f3 * ((float) i2)) + 0.5f;
        } else {
            f2 = f3 * ((float) i2);
        }
        int i3 = ((int) f2) + d2;
        int i4 = i3 + q2;
        if (d2 > d3) {
            i4 = i3 - q2;
        }
        dVar.J(i3, i4);
        c(i + 1, dVar, fVar, z2);
    }

    public static void e(int i, C0347d dVar, f fVar, C0347d dVar2, boolean z2) {
        int i2;
        float f2 = dVar2.f4740d0;
        C0346c cVar = dVar2.I;
        int e = cVar.e() + cVar.f4705f.d();
        C0346c cVar2 = dVar2.f4717K;
        int d2 = cVar2.f4705f.d() - cVar2.e();
        if (d2 >= e) {
            int q2 = dVar2.q();
            if (dVar2.f4745g0 != 8) {
                int i3 = dVar2.f4763r;
                if (i3 == 2) {
                    if (dVar instanceof C0348e) {
                        i2 = dVar.q();
                    } else {
                        i2 = dVar.f4726T.q();
                    }
                    q2 = (int) (dVar2.f4740d0 * 0.5f * ((float) i2));
                } else if (i3 == 0) {
                    q2 = d2 - e;
                }
                q2 = Math.max(dVar2.f4766u, q2);
                int i4 = dVar2.f4767v;
                if (i4 > 0) {
                    q2 = Math.min(i4, q2);
                }
            }
            int i5 = e + ((int) ((f2 * ((float) ((d2 - e) - q2))) + 0.5f));
            dVar2.J(i5, q2 + i5);
            c(i + 1, dVar2, fVar, z2);
        }
    }

    public static void f(int i, C0347d dVar, f fVar) {
        float f2;
        float f3 = dVar.f4741e0;
        C0346c cVar = dVar.f4716J;
        int d2 = cVar.f4705f.d();
        C0346c cVar2 = dVar.f4718L;
        int d3 = cVar2.f4705f.d();
        int e = cVar.e() + d2;
        int e2 = d3 - cVar2.e();
        if (d2 == d3) {
            f3 = 0.5f;
        } else {
            d2 = e;
            d3 = e2;
        }
        int k2 = dVar.k();
        int i2 = (d3 - d2) - k2;
        if (d2 > d3) {
            i2 = (d2 - d3) - k2;
        }
        if (i2 > 0) {
            f2 = (f3 * ((float) i2)) + 0.5f;
        } else {
            f2 = f3 * ((float) i2);
        }
        int i3 = (int) f2;
        int i4 = d2 + i3;
        int i5 = i4 + k2;
        if (d2 > d3) {
            i4 = d2 - i3;
            i5 = i4 - k2;
        }
        dVar.K(i4, i5);
        i(i + 1, dVar, fVar);
    }

    public static void g(int i, C0347d dVar, f fVar, C0347d dVar2) {
        int i2;
        float f2 = dVar2.f4741e0;
        C0346c cVar = dVar2.f4716J;
        int e = cVar.e() + cVar.f4705f.d();
        C0346c cVar2 = dVar2.f4718L;
        int d2 = cVar2.f4705f.d() - cVar2.e();
        if (d2 >= e) {
            int k2 = dVar2.k();
            if (dVar2.f4745g0 != 8) {
                int i3 = dVar2.f4764s;
                if (i3 == 2) {
                    if (dVar instanceof C0348e) {
                        i2 = dVar.k();
                    } else {
                        i2 = dVar.f4726T.k();
                    }
                    k2 = (int) (f2 * 0.5f * ((float) i2));
                } else if (i3 == 0) {
                    k2 = d2 - e;
                }
                k2 = Math.max(dVar2.f4769x, k2);
                int i4 = dVar2.f4770y;
                if (i4 > 0) {
                    k2 = Math.min(i4, k2);
                }
            }
            int i5 = e + ((int) ((f2 * ((float) ((d2 - e) - k2))) + 0.5f));
            dVar2.K(i5, k2 + i5);
            i(i + 1, dVar2, fVar);
        }
    }

    /* JADX WARNING: type inference failed for: r10v7, types: [java.lang.Object, w.b] */
    /* JADX WARNING: type inference failed for: r10v14, types: [java.lang.Object, w.b] */
    /* JADX WARNING: type inference failed for: r15v2, types: [java.lang.Object, w.b] */
    /* JADX WARNING: type inference failed for: r2v5, types: [java.lang.Object, w.b] */
    public static void i(int i, C0347d dVar, f fVar) {
        C0346c cVar;
        boolean z2;
        C0346c cVar2;
        C0346c cVar3;
        boolean z3;
        C0346c cVar4;
        C0346c cVar5;
        C0347d dVar2 = dVar;
        f fVar2 = fVar;
        if (!dVar2.f4756n) {
            if (!(dVar2 instanceof C0348e) && dVar.z() && a(dVar)) {
                C0348e.V(dVar2, fVar2, new Object());
            }
            C0346c i2 = dVar2.i(3);
            C0346c i3 = dVar2.i(5);
            int d2 = i2.d();
            int d3 = i3.d();
            HashSet hashSet = i2.f4701a;
            if (hashSet != null && i2.f4703c) {
                Iterator it2 = hashSet.iterator();
                while (it2.hasNext()) {
                    C0346c cVar6 = (C0346c) it2.next();
                    C0347d dVar3 = cVar6.f4704d;
                    int i4 = i + 1;
                    boolean a2 = a(dVar3);
                    if (dVar3.z() && a2) {
                        C0348e.V(dVar3, fVar2, new Object());
                    }
                    C0346c cVar7 = dVar3.f4716J;
                    C0346c cVar8 = dVar3.f4718L;
                    if ((cVar6 != cVar7 || (cVar5 = cVar8.f4705f) == null || !cVar5.f4703c) && (cVar6 != cVar8 || (cVar4 = cVar7.f4705f) == null || !cVar4.f4703c)) {
                        z3 = false;
                    } else {
                        z3 = true;
                    }
                    int i5 = dVar3.f4761p0[1];
                    if (i5 != 3 || a2) {
                        if (!dVar3.z()) {
                            if (cVar6 == cVar7 && cVar8.f4705f == null) {
                                int e = cVar7.e() + d2;
                                dVar3.K(e, dVar3.k() + e);
                                i(i4, dVar3, fVar2);
                            } else if (cVar6 == cVar8 && cVar7.f4705f == null) {
                                int e2 = d2 - cVar8.e();
                                dVar3.K(e2 - dVar3.k(), e2);
                                i(i4, dVar3, fVar2);
                            } else if (z3 && !dVar3.y()) {
                                f(i4, dVar3, fVar2);
                            }
                        }
                    } else if (i5 == 3 && dVar3.f4770y >= 0 && dVar3.f4769x >= 0) {
                        if ((dVar3.f4745g0 == 8 || (dVar3.f4764s == 0 && dVar3.f4729W == 0.0f)) && !dVar3.y() && !dVar3.f4713F && z3 && !dVar3.y()) {
                            g(i4, dVar2, fVar2, dVar3);
                        }
                    }
                }
            }
            if (!(dVar2 instanceof v.h)) {
                HashSet hashSet2 = i3.f4701a;
                if (hashSet2 != null && i3.f4703c) {
                    Iterator it3 = hashSet2.iterator();
                    while (it3.hasNext()) {
                        C0346c cVar9 = (C0346c) it3.next();
                        C0347d dVar4 = cVar9.f4704d;
                        int i6 = i + 1;
                        boolean a3 = a(dVar4);
                        if (dVar4.z() && a3) {
                            C0348e.V(dVar4, fVar2, new Object());
                        }
                        C0346c cVar10 = dVar4.f4716J;
                        C0346c cVar11 = dVar4.f4718L;
                        if ((cVar9 != cVar10 || (cVar3 = cVar11.f4705f) == null || !cVar3.f4703c) && (cVar9 != cVar11 || (cVar2 = cVar10.f4705f) == null || !cVar2.f4703c)) {
                            z2 = false;
                        } else {
                            z2 = true;
                        }
                        int i7 = dVar4.f4761p0[1];
                        if (i7 != 3 || a3) {
                            if (!dVar4.z()) {
                                if (cVar9 == cVar10 && cVar11.f4705f == null) {
                                    int e3 = cVar10.e() + d3;
                                    dVar4.K(e3, dVar4.k() + e3);
                                    i(i6, dVar4, fVar2);
                                } else if (cVar9 == cVar11 && cVar10.f4705f == null) {
                                    int e4 = d3 - cVar11.e();
                                    dVar4.K(e4 - dVar4.k(), e4);
                                    i(i6, dVar4, fVar2);
                                } else if (z2 && !dVar4.y()) {
                                    f(i6, dVar4, fVar2);
                                }
                            }
                        } else if (i7 == 3 && dVar4.f4770y >= 0 && dVar4.f4769x >= 0) {
                            if (dVar4.f4745g0 != 8) {
                                if (dVar4.f4764s == 0) {
                                    if (dVar4.f4729W != 0.0f) {
                                    }
                                }
                            }
                            if (!dVar4.y() && !dVar4.f4713F && z2 && !dVar4.y()) {
                                g(i6, dVar2, fVar2, dVar4);
                            }
                        }
                    }
                }
                C0346c i8 = dVar2.i(6);
                if (i8.f4701a != null && i8.f4703c) {
                    int d4 = i8.d();
                    Iterator it4 = i8.f4701a.iterator();
                    while (it4.hasNext()) {
                        C0346c cVar12 = (C0346c) it4.next();
                        C0347d dVar5 = cVar12.f4704d;
                        int i9 = i + 1;
                        boolean a4 = a(dVar5);
                        if (dVar5.z() && a4) {
                            C0348e.V(dVar5, fVar2, new Object());
                        }
                        if ((dVar5.f4761p0[1] != 3 || a4) && !dVar5.z() && cVar12 == (cVar = dVar5.f4719M)) {
                            int e5 = cVar12.e() + d4;
                            if (dVar5.f4712E) {
                                int i10 = e5 - dVar5.f4734a0;
                                int i11 = dVar5.f4728V + i10;
                                dVar5.f4732Z = i10;
                                dVar5.f4716J.l(i10);
                                dVar5.f4718L.l(i11);
                                cVar.l(e5);
                                dVar5.f4753l = true;
                            }
                            try {
                                i(i9, dVar5, fVar2);
                            } catch (Throwable th) {
                                throw th;
                            }
                        }
                    }
                }
                dVar2.f4756n = true;
            }
        }
    }
}
