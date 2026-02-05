package v;

import java.util.ArrayList;
import t.C0337c;
import w.C0351b;
import y.f;

public final class g extends i {
    public int A0;

    /* renamed from: B0  reason: collision with root package name */
    public C0351b f4808B0;

    /* renamed from: C0  reason: collision with root package name */
    public f f4809C0;

    /* renamed from: D0  reason: collision with root package name */
    public int f4810D0;

    /* renamed from: E0  reason: collision with root package name */
    public int f4811E0;
    public int F0;

    /* renamed from: G0  reason: collision with root package name */
    public int f4812G0;

    /* renamed from: H0  reason: collision with root package name */
    public int f4813H0;

    /* renamed from: I0  reason: collision with root package name */
    public int f4814I0;

    /* renamed from: J0  reason: collision with root package name */
    public float f4815J0;

    /* renamed from: K0  reason: collision with root package name */
    public float f4816K0;

    /* renamed from: L0  reason: collision with root package name */
    public float f4817L0;

    /* renamed from: M0  reason: collision with root package name */
    public float f4818M0;

    /* renamed from: N0  reason: collision with root package name */
    public float f4819N0;

    /* renamed from: O0  reason: collision with root package name */
    public float f4820O0;

    /* renamed from: P0  reason: collision with root package name */
    public int f4821P0;

    /* renamed from: Q0  reason: collision with root package name */
    public int f4822Q0;

    /* renamed from: R0  reason: collision with root package name */
    public int f4823R0;

    /* renamed from: S0  reason: collision with root package name */
    public int f4824S0;

    /* renamed from: T0  reason: collision with root package name */
    public int f4825T0;

    /* renamed from: U0  reason: collision with root package name */
    public int f4826U0;

    /* renamed from: V0  reason: collision with root package name */
    public int f4827V0;

    /* renamed from: W0  reason: collision with root package name */
    public ArrayList f4828W0;
    public C0347d[] X0;

    /* renamed from: Y0  reason: collision with root package name */
    public C0347d[] f4829Y0;

    /* renamed from: Z0  reason: collision with root package name */
    public int[] f4830Z0;

    /* renamed from: a1  reason: collision with root package name */
    public C0347d[] f4831a1;

    /* renamed from: b1  reason: collision with root package name */
    public int f4832b1;

    /* renamed from: s0  reason: collision with root package name */
    public int f4833s0;

    /* renamed from: t0  reason: collision with root package name */
    public int f4834t0;

    /* renamed from: u0  reason: collision with root package name */
    public int f4835u0;

    /* renamed from: v0  reason: collision with root package name */
    public int f4836v0;

    /* renamed from: w0  reason: collision with root package name */
    public int f4837w0;

    /* renamed from: x0  reason: collision with root package name */
    public int f4838x0;

    /* renamed from: y0  reason: collision with root package name */
    public boolean f4839y0;

    /* renamed from: z0  reason: collision with root package name */
    public int f4840z0;

    public final void S() {
        for (int i = 0; i < this.f4848r0; i++) {
            C0347d dVar = this.f4847q0[i];
            if (dVar != null) {
                dVar.f4713F = true;
            }
        }
    }

    public final int T(C0347d dVar, int i) {
        if (dVar == null) {
            return 0;
        }
        int[] iArr = dVar.f4761p0;
        if (iArr[1] == 3) {
            int i2 = dVar.f4764s;
            if (i2 == 0) {
                return 0;
            }
            if (i2 == 2) {
                int i3 = (int) (dVar.f4771z * ((float) i));
                if (i3 != dVar.k()) {
                    dVar.f4744g = true;
                    V(iArr[0], dVar.q(), 1, i3, dVar);
                }
                return i3;
            } else if (i2 == 1) {
                return dVar.k();
            } else {
                if (i2 == 3) {
                    return (int) ((((float) dVar.q()) * dVar.f4729W) + 0.5f);
                }
            }
        }
        return dVar.k();
    }

    public final int U(C0347d dVar, int i) {
        if (dVar == null) {
            return 0;
        }
        int[] iArr = dVar.f4761p0;
        if (iArr[0] == 3) {
            int i2 = dVar.f4763r;
            if (i2 == 0) {
                return 0;
            }
            if (i2 == 2) {
                int i3 = (int) (dVar.f4768w * ((float) i));
                if (i3 != dVar.q()) {
                    dVar.f4744g = true;
                    V(1, i3, iArr[1], dVar.k(), dVar);
                }
                return i3;
            } else if (i2 == 1) {
                return dVar.q();
            } else {
                if (i2 == 3) {
                    return (int) ((((float) dVar.k()) * dVar.f4729W) + 0.5f);
                }
            }
        }
        return dVar.q();
    }

    public final void V(int i, int i2, int i3, int i4, C0347d dVar) {
        f fVar;
        C0347d dVar2;
        while (true) {
            fVar = this.f4809C0;
            if (fVar != null || (dVar2 = this.f4726T) == null) {
                C0351b bVar = this.f4808B0;
                bVar.f4854a = i;
                bVar.f4855b = i3;
                bVar.f4856c = i2;
                bVar.f4857d = i4;
                fVar.b(dVar, bVar);
                dVar.O(bVar.e);
                dVar.L(bVar.f4858f);
                dVar.f4712E = bVar.f4860h;
                dVar.I(bVar.f4859g);
            } else {
                this.f4809C0 = ((C0348e) dVar2).f4786u0;
            }
        }
        C0351b bVar2 = this.f4808B0;
        bVar2.f4854a = i;
        bVar2.f4855b = i3;
        bVar2.f4856c = i2;
        bVar2.f4857d = i4;
        fVar.b(dVar, bVar2);
        dVar.O(bVar2.e);
        dVar.L(bVar2.f4858f);
        dVar.f4712E = bVar2.f4860h;
        dVar.I(bVar2.f4859g);
    }

    public final void b(C0337c cVar, boolean z2) {
        boolean z3;
        boolean z4;
        C0347d dVar;
        float f2;
        int i;
        boolean z5;
        super.b(cVar, z2);
        C0347d dVar2 = this.f4726T;
        if (dVar2 == null || !((C0348e) dVar2).f4787v0) {
            z3 = false;
        } else {
            z3 = true;
        }
        int i2 = this.f4825T0;
        ArrayList arrayList = this.f4828W0;
        if (i2 != 0) {
            if (i2 == 1) {
                int size = arrayList.size();
                for (int i3 = 0; i3 < size; i3++) {
                    f fVar = (f) arrayList.get(i3);
                    if (i3 == size - 1) {
                        z4 = true;
                    } else {
                        z4 = false;
                    }
                    fVar.b(i3, z3, z4);
                }
            } else if (i2 != 2) {
                if (i2 == 3) {
                    int size2 = arrayList.size();
                    for (int i4 = 0; i4 < size2; i4++) {
                        f fVar2 = (f) arrayList.get(i4);
                        if (i4 == size2 - 1) {
                            z5 = true;
                        } else {
                            z5 = false;
                        }
                        fVar2.b(i4, z3, z5);
                    }
                }
            } else if (!(this.f4830Z0 == null || this.f4829Y0 == null || this.X0 == null)) {
                for (int i5 = 0; i5 < this.f4832b1; i5++) {
                    this.f4831a1[i5].D();
                }
                int[] iArr = this.f4830Z0;
                int i6 = iArr[0];
                int i7 = iArr[1];
                float f3 = this.f4815J0;
                C0347d dVar3 = null;
                int i8 = 0;
                while (i8 < i6) {
                    if (z3) {
                        i = (i6 - i8) - 1;
                        f2 = 1.0f - this.f4815J0;
                    } else {
                        f2 = f3;
                        i = i8;
                    }
                    C0347d dVar4 = this.f4829Y0[i];
                    if (!(dVar4 == null || dVar4.f4745g0 == 8)) {
                        C0346c cVar2 = dVar4.I;
                        if (i8 == 0) {
                            dVar4.f(cVar2, this.I, this.f4837w0);
                            dVar4.f4748i0 = this.f4810D0;
                            dVar4.f4740d0 = f2;
                        }
                        if (i8 == i6 - 1) {
                            dVar4.f(dVar4.f4717K, this.f4717K, this.f4838x0);
                        }
                        if (i8 > 0 && dVar3 != null) {
                            int i9 = this.f4821P0;
                            C0346c cVar3 = dVar3.f4717K;
                            dVar4.f(cVar2, cVar3, i9);
                            dVar3.f(cVar3, cVar2, 0);
                        }
                        dVar3 = dVar4;
                    }
                    i8++;
                    f3 = f2;
                }
                for (int i10 = 0; i10 < i7; i10++) {
                    C0347d dVar5 = this.X0[i10];
                    if (!(dVar5 == null || dVar5.f4745g0 == 8)) {
                        C0346c cVar4 = dVar5.f4716J;
                        if (i10 == 0) {
                            dVar5.f(cVar4, this.f4716J, this.f4833s0);
                            dVar5.f4750j0 = this.f4811E0;
                            dVar5.f4741e0 = this.f4816K0;
                        }
                        if (i10 == i7 - 1) {
                            dVar5.f(dVar5.f4718L, this.f4718L, this.f4834t0);
                        }
                        if (i10 > 0 && dVar3 != null) {
                            int i11 = this.f4822Q0;
                            C0346c cVar5 = dVar3.f4718L;
                            dVar5.f(cVar4, cVar5, i11);
                            dVar3.f(cVar5, cVar4, 0);
                        }
                        dVar3 = dVar5;
                    }
                }
                for (int i12 = 0; i12 < i6; i12++) {
                    for (int i13 = 0; i13 < i7; i13++) {
                        int i14 = (i13 * i6) + i12;
                        if (this.f4827V0 == 1) {
                            i14 = (i12 * i7) + i13;
                        }
                        C0347d[] dVarArr = this.f4831a1;
                        if (!(i14 >= dVarArr.length || (dVar = dVarArr[i14]) == null || dVar.f4745g0 == 8)) {
                            C0347d dVar6 = this.f4829Y0[i12];
                            C0347d dVar7 = this.X0[i13];
                            if (dVar != dVar6) {
                                dVar.f(dVar.I, dVar6.I, 0);
                                dVar.f(dVar.f4717K, dVar6.f4717K, 0);
                            }
                            if (dVar != dVar7) {
                                dVar.f(dVar.f4716J, dVar7.f4716J, 0);
                                dVar.f(dVar.f4718L, dVar7.f4718L, 0);
                            }
                        }
                    }
                }
            }
        } else if (arrayList.size() > 0) {
            ((f) arrayList.get(0)).b(0, z3, true);
        }
        this.f4839y0 = false;
    }
}
