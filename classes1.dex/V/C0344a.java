package v;

import Q0.E;
import t.C0336b;
import t.C0337c;
import t.C0340f;

/* renamed from: v.a  reason: case insensitive filesystem */
public final class C0344a extends i {

    /* renamed from: s0  reason: collision with root package name */
    public int f4682s0;

    /* renamed from: t0  reason: collision with root package name */
    public boolean f4683t0;

    /* renamed from: u0  reason: collision with root package name */
    public int f4684u0;

    /* renamed from: v0  reason: collision with root package name */
    public boolean f4685v0;

    public final boolean T() {
        int i;
        int i2;
        int i3;
        int i4 = 0;
        boolean z2 = true;
        while (true) {
            i = this.f4848r0;
            if (i4 >= i) {
                break;
            }
            C0347d dVar = this.f4847q0[i4];
            if ((this.f4683t0 || dVar.c()) && ((((i2 = this.f4682s0) == 0 || i2 == 1) && !dVar.A()) || (((i3 = this.f4682s0) == 2 || i3 == 3) && !dVar.B()))) {
                z2 = false;
            }
            i4++;
        }
        if (!z2 || i <= 0) {
            return false;
        }
        int i5 = 0;
        boolean z3 = false;
        for (int i6 = 0; i6 < this.f4848r0; i6++) {
            C0347d dVar2 = this.f4847q0[i6];
            if (this.f4683t0 || dVar2.c()) {
                if (!z3) {
                    int i7 = this.f4682s0;
                    if (i7 == 0) {
                        i5 = dVar2.i(2).d();
                    } else if (i7 == 1) {
                        i5 = dVar2.i(4).d();
                    } else if (i7 == 2) {
                        i5 = dVar2.i(3).d();
                    } else if (i7 == 3) {
                        i5 = dVar2.i(5).d();
                    }
                    z3 = true;
                }
                int i8 = this.f4682s0;
                if (i8 == 0) {
                    i5 = Math.min(i5, dVar2.i(2).d());
                } else if (i8 == 1) {
                    i5 = Math.max(i5, dVar2.i(4).d());
                } else if (i8 == 2) {
                    i5 = Math.min(i5, dVar2.i(3).d());
                } else if (i8 == 3) {
                    i5 = Math.max(i5, dVar2.i(5).d());
                }
            }
        }
        int i9 = i5 + this.f4684u0;
        int i10 = this.f4682s0;
        if (i10 == 0 || i10 == 1) {
            J(i9, i9);
        } else {
            K(i9, i9);
        }
        this.f4685v0 = true;
        return true;
    }

    public final boolean c() {
        return true;
    }

    public final boolean A() {
        return this.f4685v0;
    }

    public final boolean B() {
        return this.f4685v0;
    }

    public final int U() {
        int i = this.f4682s0;
        if (i == 0 || i == 1) {
            return 0;
        }
        if (i == 2 || i == 3) {
            return 1;
        }
        return -1;
    }

    public final void b(C0337c cVar, boolean z2) {
        boolean z3;
        boolean z4;
        boolean z5;
        int i;
        int i2;
        int i3;
        int i4;
        C0337c cVar2 = cVar;
        C0346c[] cVarArr = this.f4723Q;
        C0346c cVar3 = this.I;
        cVarArr[0] = cVar3;
        C0346c cVar4 = this.f4716J;
        int i5 = 2;
        cVarArr[2] = cVar4;
        C0346c cVar5 = this.f4717K;
        cVarArr[1] = cVar5;
        C0346c cVar6 = this.f4718L;
        cVarArr[3] = cVar6;
        for (C0346c cVar7 : cVarArr) {
            cVar7.i = cVar2.k(cVar7);
        }
        int i6 = this.f4682s0;
        if (i6 >= 0 && i6 < 4) {
            C0346c cVar8 = cVarArr[i6];
            if (!this.f4685v0) {
                T();
            }
            if (this.f4685v0) {
                this.f4685v0 = false;
                int i7 = this.f4682s0;
                if (i7 == 0 || i7 == 1) {
                    cVar2.d(cVar3.i, this.f4731Y);
                    cVar2.d(cVar5.i, this.f4731Y);
                } else if (i7 == 2 || i7 == 3) {
                    cVar2.d(cVar4.i, this.f4732Z);
                    cVar2.d(cVar6.i, this.f4732Z);
                }
            } else {
                int i8 = 0;
                while (true) {
                    if (i8 >= this.f4848r0) {
                        z3 = false;
                        break;
                    }
                    C0347d dVar = this.f4847q0[i8];
                    if ((this.f4683t0 || dVar.c()) && ((((i4 = this.f4682s0) == 0 || i4 == 1) && dVar.f4761p0[0] == 3 && dVar.I.f4705f != null && dVar.f4717K.f4705f != null) || ((i4 == 2 || i4 == 3) && dVar.f4761p0[1] == 3 && dVar.f4716J.f4705f != null && dVar.f4718L.f4705f != null))) {
                        z3 = true;
                    } else {
                        i8++;
                    }
                }
                if (cVar3.g() || cVar5.g()) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                if (cVar4.g() || cVar6.g()) {
                    z5 = true;
                } else {
                    z5 = false;
                }
                if (z3 || (((i3 = this.f4682s0) != 0 || !z4) && ((i3 != 2 || !z5) && ((i3 != 1 || !z4) && (i3 != 3 || !z5))))) {
                    i = 4;
                } else {
                    i = 5;
                }
                int i9 = 0;
                while (i9 < this.f4848r0) {
                    C0347d dVar2 = this.f4847q0[i9];
                    if (this.f4683t0 || dVar2.c()) {
                        C0340f k2 = cVar2.k(dVar2.f4723Q[this.f4682s0]);
                        int i10 = this.f4682s0;
                        C0346c cVar9 = dVar2.f4723Q[i10];
                        cVar9.i = k2;
                        C0346c cVar10 = cVar9.f4705f;
                        if (cVar10 == null || cVar10.f4704d != this) {
                            i2 = 0;
                        } else {
                            i2 = cVar9.f4706g;
                        }
                        if (i10 == 0 || i10 == i5) {
                            C0336b l2 = cVar.l();
                            C0340f m2 = cVar.m();
                            m2.f4670d = 0;
                            l2.c(cVar8.i, k2, m2, this.f4684u0 - i2);
                            cVar2.c(l2);
                        } else {
                            C0336b l3 = cVar.l();
                            C0340f m3 = cVar.m();
                            m3.f4670d = 0;
                            l3.b(cVar8.i, k2, m3, this.f4684u0 + i2);
                            cVar2.c(l3);
                        }
                        cVar2.e(cVar8.i, k2, this.f4684u0 + i2, i);
                    }
                    i9++;
                    i5 = 2;
                }
                int i11 = this.f4682s0;
                if (i11 == 0) {
                    cVar2.e(cVar5.i, cVar3.i, 0, 8);
                    cVar2.e(cVar3.i, this.f4726T.f4717K.i, 0, 4);
                    cVar2.e(cVar3.i, this.f4726T.I.i, 0, 0);
                } else if (i11 == 1) {
                    cVar2.e(cVar3.i, cVar5.i, 0, 8);
                    cVar2.e(cVar3.i, this.f4726T.I.i, 0, 4);
                    cVar2.e(cVar3.i, this.f4726T.f4717K.i, 0, 0);
                } else if (i11 == 2) {
                    cVar2.e(cVar6.i, cVar4.i, 0, 8);
                    cVar2.e(cVar4.i, this.f4726T.f4718L.i, 0, 4);
                    cVar2.e(cVar4.i, this.f4726T.f4716J.i, 0, 0);
                } else if (i11 == 3) {
                    cVar2.e(cVar4.i, cVar6.i, 0, 8);
                    cVar2.e(cVar4.i, this.f4726T.f4716J.i, 0, 4);
                    cVar2.e(cVar4.i, this.f4726T.f4718L.i, 0, 0);
                }
            }
        }
    }

    public final String toString() {
        String str = "[Barrier] " + this.f4747h0 + " {";
        for (int i = 0; i < this.f4848r0; i++) {
            C0347d dVar = this.f4847q0[i];
            if (i > 0) {
                str = E.f(str, ", ");
            }
            str = str + dVar.f4747h0;
        }
        return E.f(str, "}");
    }
}
