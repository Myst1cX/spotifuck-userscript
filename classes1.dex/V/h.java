package v;

import java.util.ArrayList;
import t.C0336b;
import t.C0337c;
import t.C0339e;
import t.C0340f;

public final class h extends C0347d {

    /* renamed from: q0  reason: collision with root package name */
    public float f4841q0 = -1.0f;

    /* renamed from: r0  reason: collision with root package name */
    public int f4842r0 = -1;

    /* renamed from: s0  reason: collision with root package name */
    public int f4843s0 = -1;

    /* renamed from: t0  reason: collision with root package name */
    public C0346c f4844t0 = this.f4716J;

    /* renamed from: u0  reason: collision with root package name */
    public int f4845u0;

    /* renamed from: v0  reason: collision with root package name */
    public boolean f4846v0;

    public final boolean c() {
        return true;
    }

    public final boolean A() {
        return this.f4846v0;
    }

    public final boolean B() {
        return this.f4846v0;
    }

    public final void Q(C0337c cVar, boolean z2) {
        if (this.f4726T != null) {
            C0346c cVar2 = this.f4844t0;
            cVar.getClass();
            int n2 = C0337c.n(cVar2);
            if (this.f4845u0 == 1) {
                this.f4731Y = n2;
                this.f4732Z = 0;
                L(this.f4726T.k());
                O(0);
                return;
            }
            this.f4731Y = 0;
            this.f4732Z = n2;
            O(this.f4726T.q());
            L(0);
        }
    }

    public final void R(int i) {
        this.f4844t0.l(i);
        this.f4846v0 = true;
    }

    public final void S(int i) {
        if (this.f4845u0 != i) {
            this.f4845u0 = i;
            ArrayList arrayList = this.f4724R;
            arrayList.clear();
            if (this.f4845u0 == 1) {
                this.f4844t0 = this.I;
            } else {
                this.f4844t0 = this.f4716J;
            }
            arrayList.add(this.f4844t0);
            C0346c[] cVarArr = this.f4723Q;
            int length = cVarArr.length;
            for (int i2 = 0; i2 < length; i2++) {
                cVarArr[i2] = this.f4844t0;
            }
        }
    }

    public final void b(C0337c cVar, boolean z2) {
        boolean z3;
        C0348e eVar = (C0348e) this.f4726T;
        if (eVar != null) {
            C0346c i = eVar.i(2);
            C0346c i2 = eVar.i(4);
            C0347d dVar = this.f4726T;
            boolean z4 = true;
            if (dVar == null || dVar.f4761p0[0] != 2) {
                z3 = false;
            } else {
                z3 = true;
            }
            if (this.f4845u0 == 0) {
                i = eVar.i(3);
                i2 = eVar.i(5);
                C0347d dVar2 = this.f4726T;
                if (dVar2 == null || dVar2.f4761p0[1] != 2) {
                    z4 = false;
                }
                z3 = z4;
            }
            if (this.f4846v0) {
                C0346c cVar2 = this.f4844t0;
                if (cVar2.f4703c) {
                    C0340f k2 = cVar.k(cVar2);
                    cVar.d(k2, this.f4844t0.d());
                    if (this.f4842r0 != -1) {
                        if (z3) {
                            cVar.f(cVar.k(i2), k2, 0, 5);
                        }
                    } else if (this.f4843s0 != -1 && z3) {
                        C0340f k3 = cVar.k(i2);
                        cVar.f(k2, cVar.k(i), 0, 5);
                        cVar.f(k3, k2, 0, 5);
                    }
                    this.f4846v0 = false;
                    return;
                }
            }
            if (this.f4842r0 != -1) {
                C0340f k4 = cVar.k(this.f4844t0);
                cVar.e(k4, cVar.k(i), this.f4842r0, 8);
                if (z3) {
                    cVar.f(cVar.k(i2), k4, 0, 5);
                }
            } else if (this.f4843s0 != -1) {
                C0340f k5 = cVar.k(this.f4844t0);
                C0340f k6 = cVar.k(i2);
                cVar.e(k5, k6, -this.f4843s0, 8);
                if (z3) {
                    cVar.f(k5, cVar.k(i), 0, 5);
                    cVar.f(k6, k5, 0, 5);
                }
            } else if (this.f4841q0 != -1.0f) {
                C0340f k7 = cVar.k(this.f4844t0);
                C0340f k8 = cVar.k(i2);
                float f2 = this.f4841q0;
                C0336b l2 = cVar.l();
                l2.f4647d.g(k7, -1.0f);
                l2.f4647d.g(k8, f2);
                cVar.c(l2);
            }
        }
    }

    public h() {
        this.f4845u0 = 0;
        this.f4724R.clear();
        this.f4724R.add(this.f4844t0);
        int length = this.f4723Q.length;
        for (int i = 0; i < length; i++) {
            this.f4723Q[i] = this.f4844t0;
        }
    }

    public final C0346c i(int i) {
        int a2 = C0339e.a(i);
        if (a2 != 1) {
            if (a2 != 2) {
                if (a2 != 3) {
                    if (a2 != 4) {
                        return null;
                    }
                }
            }
            if (this.f4845u0 == 0) {
                return this.f4844t0;
            }
            return null;
        }
        if (this.f4845u0 == 1) {
            return this.f4844t0;
        }
        return null;
    }
}
