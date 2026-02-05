package androidx.recyclerview.widget;

import Q0.E;
import android.content.Context;
import android.graphics.PointF;
import android.graphics.Rect;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import androidx.emoji2.text.g;
import g1.i;
import j0.C0152n;
import j0.C0156s;
import j0.C0157t;
import j0.C0158u;
import j0.C0159v;
import j0.J;
import j0.K;
import j0.L;
import j0.Q;
import j0.W;
import j0.X;
import j0.a0;
import java.util.ArrayList;
import java.util.List;

public class LinearLayoutManager extends K implements W {

    /* renamed from: A  reason: collision with root package name */
    public final C0156s f1961A = new C0156s();

    /* renamed from: B  reason: collision with root package name */
    public final i f1962B = new Object();

    /* renamed from: C  reason: collision with root package name */
    public final int f1963C = 2;

    /* renamed from: D  reason: collision with root package name */
    public final int[] f1964D = new int[2];

    /* renamed from: p  reason: collision with root package name */
    public int f1965p = 1;

    /* renamed from: q  reason: collision with root package name */
    public C0157t f1966q;

    /* renamed from: r  reason: collision with root package name */
    public g f1967r;

    /* renamed from: s  reason: collision with root package name */
    public boolean f1968s;

    /* renamed from: t  reason: collision with root package name */
    public final boolean f1969t = false;

    /* renamed from: u  reason: collision with root package name */
    public boolean f1970u = false;

    /* renamed from: v  reason: collision with root package name */
    public boolean f1971v = false;

    /* renamed from: w  reason: collision with root package name */
    public final boolean f1972w = true;

    /* renamed from: x  reason: collision with root package name */
    public int f1973x = -1;

    /* renamed from: y  reason: collision with root package name */
    public int f1974y = Integer.MIN_VALUE;

    /* renamed from: z  reason: collision with root package name */
    public C0158u f1975z = null;

    /* JADX WARNING: type inference failed for: r2v1, types: [java.lang.Object, g1.i] */
    public LinearLayoutManager(int i) {
        Z0(i);
        c((String) null);
        if (this.f1969t) {
            this.f1969t = false;
            l0();
        }
    }

    public final int F0(int i) {
        if (i != 1) {
            if (i != 2) {
                if (i != 17) {
                    if (i != 33) {
                        if (i != 66) {
                            if (i == 130 && this.f1965p == 1) {
                                return 1;
                            }
                            return Integer.MIN_VALUE;
                        } else if (this.f1965p == 0) {
                            return 1;
                        } else {
                            return Integer.MIN_VALUE;
                        }
                    } else if (this.f1965p == 1) {
                        return -1;
                    } else {
                        return Integer.MIN_VALUE;
                    }
                } else if (this.f1965p == 0) {
                    return -1;
                } else {
                    return Integer.MIN_VALUE;
                }
            } else if (this.f1965p != 1 && S0()) {
                return -1;
            } else {
                return 1;
            }
        } else if (this.f1965p != 1 && S0()) {
            return 1;
        } else {
            return -1;
        }
    }

    public final boolean L() {
        return true;
    }

    public void a1(boolean z2) {
        c((String) null);
        if (this.f1971v != z2) {
            this.f1971v = z2;
            l0();
        }
    }

    public void c0(X x2) {
        this.f1975z = null;
        this.f1973x = -1;
        this.f1974y = Integer.MIN_VALUE;
        this.f1961A.d();
    }

    public void A0(X x2, int[] iArr) {
        int i;
        int i2;
        if (x2.f3315a != -1) {
            i = this.f1967r.l();
        } else {
            i = 0;
        }
        if (this.f1966q.f3493f == -1) {
            i2 = 0;
        } else {
            i2 = i;
            i = 0;
        }
        iArr[0] = i;
        iArr[1] = i2;
    }

    public void B0(X x2, C0157t tVar, C0152n nVar) {
        int i = tVar.f3492d;
        if (i >= 0 && i < x2.b()) {
            nVar.a(i, Math.max(0, tVar.f3494g));
        }
    }

    /* JADX WARNING: type inference failed for: r0v1, types: [java.lang.Object, j0.t] */
    public final void G0() {
        if (this.f1966q == null) {
            ? obj = new Object();
            obj.f3489a = true;
            obj.f3495h = 0;
            obj.i = 0;
            obj.f3497k = null;
            this.f1966q = obj;
        }
    }

    public final int H0(Q q2, C0157t tVar, X x2, boolean z2) {
        int i;
        int i2 = tVar.f3491c;
        int i3 = tVar.f3494g;
        if (i3 != Integer.MIN_VALUE) {
            if (i2 < 0) {
                tVar.f3494g = i3 + i2;
            }
            V0(q2, tVar);
        }
        int i4 = tVar.f3491c + tVar.f3495h;
        while (true) {
            if ((!tVar.f3498l && i4 <= 0) || (i = tVar.f3492d) < 0 || i >= x2.b()) {
                break;
            }
            i iVar = this.f1962B;
            iVar.f2703a = 0;
            iVar.f2704b = false;
            iVar.f2705c = false;
            iVar.f2706d = false;
            T0(q2, x2, tVar, iVar);
            if (!iVar.f2704b) {
                int i5 = tVar.f3490b;
                int i6 = iVar.f2703a;
                tVar.f3490b = (tVar.f3493f * i6) + i5;
                if (!iVar.f2705c || tVar.f3497k != null || !x2.f3320g) {
                    tVar.f3491c -= i6;
                    i4 -= i6;
                }
                int i7 = tVar.f3494g;
                if (i7 != Integer.MIN_VALUE) {
                    int i8 = i7 + i6;
                    tVar.f3494g = i8;
                    int i9 = tVar.f3491c;
                    if (i9 < 0) {
                        tVar.f3494g = i8 + i9;
                    }
                    V0(q2, tVar);
                }
                if (z2 && iVar.f2706d) {
                    break;
                }
            } else {
                break;
            }
        }
        return i2 - tVar.f3491c;
    }

    public final View I0(boolean z2) {
        if (this.f1970u) {
            return M0(0, v(), z2);
        }
        return M0(v() - 1, -1, z2);
    }

    public final View J0(boolean z2) {
        if (this.f1970u) {
            return M0(v() - 1, -1, z2);
        }
        return M0(0, v(), z2);
    }

    public final int O0(int i, Q q2, X x2, boolean z2) {
        int g2;
        int g3 = this.f1967r.g() - i;
        if (g3 <= 0) {
            return 0;
        }
        int i2 = -Y0(-g3, q2, x2);
        int i3 = i + i2;
        if (!z2 || (g2 = this.f1967r.g() - i3) <= 0) {
            return i2;
        }
        this.f1967r.p(g2);
        return g2 + i2;
    }

    public final int P0(int i, Q q2, X x2, boolean z2) {
        int k2;
        int k3 = i - this.f1967r.k();
        if (k3 <= 0) {
            return 0;
        }
        int i2 = -Y0(k3, q2, x2);
        int i3 = i + i2;
        if (!z2 || (k2 = i3 - this.f1967r.k()) <= 0) {
            return i2;
        }
        this.f1967r.p(-k2);
        return i2 - k2;
    }

    public final View Q0() {
        int i;
        if (this.f1970u) {
            i = 0;
        } else {
            i = v() - 1;
        }
        return u(i);
    }

    public final void R(RecyclerView recyclerView) {
    }

    public final View R0() {
        int i;
        if (this.f1970u) {
            i = v() - 1;
        } else {
            i = 0;
        }
        return u(i);
    }

    public void U0(Q q2, X x2, C0156s sVar, int i) {
    }

    public final void V0(Q q2, C0157t tVar) {
        if (tVar.f3489a && !tVar.f3498l) {
            int i = tVar.f3494g;
            int i2 = tVar.i;
            if (tVar.f3493f == -1) {
                int v2 = v();
                if (i >= 0) {
                    int f2 = (this.f1967r.f() - i) + i2;
                    if (this.f1970u) {
                        for (int i3 = 0; i3 < v2; i3++) {
                            View u2 = u(i3);
                            if (this.f1967r.e(u2) < f2 || this.f1967r.o(u2) < f2) {
                                W0(q2, 0, i3);
                                return;
                            }
                        }
                        return;
                    }
                    int i4 = v2 - 1;
                    for (int i5 = i4; i5 >= 0; i5--) {
                        View u3 = u(i5);
                        if (this.f1967r.e(u3) < f2 || this.f1967r.o(u3) < f2) {
                            W0(q2, i4, i5);
                            return;
                        }
                    }
                }
            } else if (i >= 0) {
                int i6 = i - i2;
                int v3 = v();
                if (this.f1970u) {
                    int i7 = v3 - 1;
                    for (int i8 = i7; i8 >= 0; i8--) {
                        View u4 = u(i8);
                        if (this.f1967r.b(u4) > i6 || this.f1967r.n(u4) > i6) {
                            W0(q2, i7, i8);
                            return;
                        }
                    }
                    return;
                }
                for (int i9 = 0; i9 < v3; i9++) {
                    View u5 = u(i9);
                    if (this.f1967r.b(u5) > i6 || this.f1967r.n(u5) > i6) {
                        W0(q2, 0, i9);
                        return;
                    }
                }
            }
        }
    }

    public final void W0(Q q2, int i, int i2) {
        if (i != i2) {
            if (i2 > i) {
                for (int i3 = i2 - 1; i3 >= i; i3--) {
                    View u2 = u(i3);
                    j0(i3);
                    q2.f(u2);
                }
                return;
            }
            while (i > i2) {
                View u3 = u(i);
                j0(i);
                q2.f(u3);
                i--;
            }
        }
    }

    public final void X0() {
        if (this.f1965p == 1 || !S0()) {
            this.f1970u = this.f1969t;
        } else {
            this.f1970u = !this.f1969t;
        }
    }

    public final void Z0(int i) {
        if (i == 0 || i == 1) {
            c((String) null);
            if (i != this.f1965p || this.f1967r == null) {
                g a2 = g.a(this, i);
                this.f1967r = a2;
                this.f1961A.f3485a = a2;
                this.f1965p = i;
                l0();
                return;
            }
            return;
        }
        throw new IllegalArgumentException(E.e("invalid orientation:", i));
    }

    public void b0(Q q2, X x2) {
        View view;
        int i;
        boolean z2;
        int i2;
        int i3;
        List list;
        boolean z3;
        int i4;
        int i5;
        int O02;
        int i6;
        View q3;
        int e;
        int i7;
        int i8;
        View view2;
        View view3;
        int i9;
        int i10;
        boolean z4;
        boolean z5;
        int i11;
        int i12;
        Q q4 = q2;
        X x3 = x2;
        int i13 = -1;
        if (!(this.f1975z == null && this.f1973x == -1) && x2.b() == 0) {
            g0(q2);
            return;
        }
        C0158u uVar = this.f1975z;
        if (uVar != null && (i12 = uVar.f3499a) >= 0) {
            this.f1973x = i12;
        }
        G0();
        this.f1966q.f3489a = false;
        X0();
        RecyclerView recyclerView = this.f3278b;
        if (recyclerView == null || (view = recyclerView.getFocusedChild()) == null || ((ArrayList) this.f3277a.f1133d).contains(view)) {
            view = null;
        }
        C0156s sVar = this.f1961A;
        if (!sVar.e || this.f1973x != -1 || this.f1975z != null) {
            sVar.d();
            sVar.f3488d = this.f1970u ^ this.f1971v;
            if (!x3.f3320g && (i10 = this.f1973x) != -1) {
                if (i10 < 0 || i10 >= x2.b()) {
                    this.f1973x = -1;
                    this.f1974y = Integer.MIN_VALUE;
                } else {
                    int i14 = this.f1973x;
                    sVar.f3486b = i14;
                    C0158u uVar2 = this.f1975z;
                    if (uVar2 == null || uVar2.f3499a < 0) {
                        if (this.f1974y == Integer.MIN_VALUE) {
                            View q5 = q(i14);
                            if (q5 == null) {
                                if (v() > 0) {
                                    if (this.f1973x < K.H(u(0))) {
                                        z4 = true;
                                    } else {
                                        z4 = false;
                                    }
                                    if (z4 == this.f1970u) {
                                        z5 = true;
                                    } else {
                                        z5 = false;
                                    }
                                    sVar.f3488d = z5;
                                }
                                sVar.a();
                            } else if (this.f1967r.c(q5) > this.f1967r.l()) {
                                sVar.a();
                            } else if (this.f1967r.e(q5) - this.f1967r.k() < 0) {
                                sVar.f3487c = this.f1967r.k();
                                sVar.f3488d = false;
                            } else if (this.f1967r.g() - this.f1967r.b(q5) < 0) {
                                sVar.f3487c = this.f1967r.g();
                                sVar.f3488d = true;
                            } else {
                                if (sVar.f3488d) {
                                    i11 = this.f1967r.m() + this.f1967r.b(q5);
                                } else {
                                    i11 = this.f1967r.e(q5);
                                }
                                sVar.f3487c = i11;
                            }
                        } else {
                            boolean z6 = this.f1970u;
                            sVar.f3488d = z6;
                            if (z6) {
                                sVar.f3487c = this.f1967r.g() - this.f1974y;
                            } else {
                                sVar.f3487c = this.f1967r.k() + this.f1974y;
                            }
                        }
                        sVar.e = true;
                    } else {
                        boolean z7 = uVar2.f3501c;
                        sVar.f3488d = z7;
                        if (z7) {
                            sVar.f3487c = this.f1967r.g() - this.f1975z.f3500b;
                        } else {
                            sVar.f3487c = this.f1967r.k() + this.f1975z.f3500b;
                        }
                        sVar.e = true;
                    }
                }
            }
            if (v() != 0) {
                RecyclerView recyclerView2 = this.f3278b;
                if (recyclerView2 == null || (view2 = recyclerView2.getFocusedChild()) == null || ((ArrayList) this.f3277a.f1133d).contains(view2)) {
                    view2 = null;
                }
                if (view2 != null) {
                    L l2 = (L) view2.getLayoutParams();
                    if (!l2.f3290a.i() && l2.f3290a.b() >= 0 && l2.f3290a.b() < x2.b()) {
                        sVar.c(view2, K.H(view2));
                        sVar.e = true;
                    }
                }
                if (this.f1968s == this.f1971v) {
                    if (sVar.f3488d) {
                        if (this.f1970u) {
                            view3 = N0(q2, x2, 0, v(), x2.b());
                        } else {
                            view3 = N0(q2, x2, v() - 1, -1, x2.b());
                        }
                    } else if (this.f1970u) {
                        view3 = N0(q2, x2, v() - 1, -1, x2.b());
                    } else {
                        view3 = N0(q2, x2, 0, v(), x2.b());
                    }
                    if (view3 != null) {
                        sVar.b(view3, K.H(view3));
                        if (!x3.f3320g && z0() && (this.f1967r.e(view3) >= this.f1967r.g() || this.f1967r.b(view3) < this.f1967r.k())) {
                            if (sVar.f3488d) {
                                i9 = this.f1967r.g();
                            } else {
                                i9 = this.f1967r.k();
                            }
                            sVar.f3487c = i9;
                        }
                        sVar.e = true;
                    }
                }
            }
            sVar.a();
            if (this.f1971v) {
                i8 = x2.b() - 1;
            } else {
                i8 = 0;
            }
            sVar.f3486b = i8;
            sVar.e = true;
        } else if (view != null && (this.f1967r.e(view) >= this.f1967r.g() || this.f1967r.b(view) <= this.f1967r.k())) {
            sVar.c(view, K.H(view));
        }
        C0157t tVar = this.f1966q;
        if (tVar.f3496j >= 0) {
            i = 1;
        } else {
            i = -1;
        }
        tVar.f3493f = i;
        int[] iArr = this.f1964D;
        iArr[0] = 0;
        iArr[1] = 0;
        A0(x3, iArr);
        int k2 = this.f1967r.k() + Math.max(0, iArr[0]);
        int h2 = this.f1967r.h() + Math.max(0, iArr[1]);
        if (!(!x3.f3320g || (i6 = this.f1973x) == -1 || this.f1974y == Integer.MIN_VALUE || (q3 = q(i6)) == null)) {
            if (this.f1970u) {
                i7 = this.f1967r.g() - this.f1967r.b(q3);
                e = this.f1974y;
            } else {
                e = this.f1967r.e(q3) - this.f1967r.k();
                i7 = this.f1974y;
            }
            int i15 = i7 - e;
            if (i15 > 0) {
                k2 += i15;
            } else {
                h2 -= i15;
            }
        }
        if (!sVar.f3488d ? !this.f1970u : this.f1970u) {
            i13 = 1;
        }
        U0(q4, x3, sVar, i13);
        p(q2);
        C0157t tVar2 = this.f1966q;
        if (this.f1967r.i() == 0 && this.f1967r.f() == 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        tVar2.f3498l = z2;
        this.f1966q.getClass();
        this.f1966q.i = 0;
        if (sVar.f3488d) {
            d1(sVar.f3486b, sVar.f3487c);
            C0157t tVar3 = this.f1966q;
            tVar3.f3495h = k2;
            H0(q4, tVar3, x3, false);
            C0157t tVar4 = this.f1966q;
            i2 = tVar4.f3490b;
            int i16 = tVar4.f3492d;
            int i17 = tVar4.f3491c;
            if (i17 > 0) {
                h2 += i17;
            }
            c1(sVar.f3486b, sVar.f3487c);
            C0157t tVar5 = this.f1966q;
            tVar5.f3495h = h2;
            tVar5.f3492d += tVar5.e;
            H0(q4, tVar5, x3, false);
            C0157t tVar6 = this.f1966q;
            i3 = tVar6.f3490b;
            int i18 = tVar6.f3491c;
            if (i18 > 0) {
                d1(i16, i2);
                C0157t tVar7 = this.f1966q;
                tVar7.f3495h = i18;
                H0(q4, tVar7, x3, false);
                i2 = this.f1966q.f3490b;
            }
        } else {
            c1(sVar.f3486b, sVar.f3487c);
            C0157t tVar8 = this.f1966q;
            tVar8.f3495h = h2;
            H0(q4, tVar8, x3, false);
            C0157t tVar9 = this.f1966q;
            i3 = tVar9.f3490b;
            int i19 = tVar9.f3492d;
            int i20 = tVar9.f3491c;
            if (i20 > 0) {
                k2 += i20;
            }
            d1(sVar.f3486b, sVar.f3487c);
            C0157t tVar10 = this.f1966q;
            tVar10.f3495h = k2;
            tVar10.f3492d += tVar10.e;
            H0(q4, tVar10, x3, false);
            C0157t tVar11 = this.f1966q;
            i2 = tVar11.f3490b;
            int i21 = tVar11.f3491c;
            if (i21 > 0) {
                c1(i19, i3);
                C0157t tVar12 = this.f1966q;
                tVar12.f3495h = i21;
                H0(q4, tVar12, x3, false);
                i3 = this.f1966q.f3490b;
            }
        }
        if (v() > 0) {
            if (this.f1970u ^ this.f1971v) {
                int O03 = O0(i3, q4, x3, true);
                i4 = i2 + O03;
                i5 = i3 + O03;
                O02 = P0(i4, q4, x3, false);
            } else {
                int P02 = P0(i2, q4, x3, true);
                i4 = i2 + P02;
                i5 = i3 + P02;
                O02 = O0(i5, q4, x3, false);
            }
            i2 = i4 + O02;
            i3 = i5 + O02;
        }
        if (x3.f3323k && v() != 0 && !x3.f3320g && z0()) {
            List list2 = q4.f3303d;
            int size = list2.size();
            int H2 = K.H(u(0));
            int i22 = 0;
            int i23 = 0;
            for (int i24 = 0; i24 < size; i24++) {
                a0 a0Var = (a0) list2.get(i24);
                if (!a0Var.i()) {
                    if (a0Var.b() < H2) {
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                    boolean z8 = this.f1970u;
                    View view4 = a0Var.f3338a;
                    if (z3 != z8) {
                        i22 += this.f1967r.c(view4);
                    } else {
                        i23 += this.f1967r.c(view4);
                    }
                }
            }
            this.f1966q.f3497k = list2;
            if (i22 > 0) {
                d1(K.H(R0()), i2);
                C0157t tVar13 = this.f1966q;
                tVar13.f3495h = i22;
                tVar13.f3491c = 0;
                tVar13.a((View) null);
                H0(q4, this.f1966q, x3, false);
            }
            if (i23 > 0) {
                c1(K.H(Q0()), i3);
                C0157t tVar14 = this.f1966q;
                tVar14.f3495h = i23;
                tVar14.f3491c = 0;
                list = null;
                tVar14.a((View) null);
                H0(q4, this.f1966q, x3, false);
            } else {
                list = null;
            }
            this.f1966q.f3497k = list;
        }
        if (!x3.f3320g) {
            g gVar = this.f1967r;
            gVar.f1510a = gVar.l();
        } else {
            sVar.d();
        }
        this.f1968s = this.f1971v;
    }

    public final void b1(int i, int i2, boolean z2, X x2) {
        boolean z3;
        int i3;
        int i4;
        C0157t tVar = this.f1966q;
        boolean z4 = false;
        int i5 = 1;
        if (this.f1967r.i() == 0 && this.f1967r.f() == 0) {
            z3 = true;
        } else {
            z3 = false;
        }
        tVar.f3498l = z3;
        this.f1966q.f3493f = i;
        int[] iArr = this.f1964D;
        iArr[0] = 0;
        iArr[1] = 0;
        A0(x2, iArr);
        int max = Math.max(0, iArr[0]);
        int max2 = Math.max(0, iArr[1]);
        if (i == 1) {
            z4 = true;
        }
        C0157t tVar2 = this.f1966q;
        if (z4) {
            i3 = max2;
        } else {
            i3 = max;
        }
        tVar2.f3495h = i3;
        if (!z4) {
            max = max2;
        }
        tVar2.i = max;
        if (z4) {
            tVar2.f3495h = this.f1967r.h() + i3;
            View Q02 = Q0();
            C0157t tVar3 = this.f1966q;
            if (this.f1970u) {
                i5 = -1;
            }
            tVar3.e = i5;
            int H2 = K.H(Q02);
            C0157t tVar4 = this.f1966q;
            tVar3.f3492d = H2 + tVar4.e;
            tVar4.f3490b = this.f1967r.b(Q02);
            i4 = this.f1967r.b(Q02) - this.f1967r.g();
        } else {
            View R02 = R0();
            C0157t tVar5 = this.f1966q;
            tVar5.f3495h = this.f1967r.k() + tVar5.f3495h;
            C0157t tVar6 = this.f1966q;
            if (!this.f1970u) {
                i5 = -1;
            }
            tVar6.e = i5;
            int H3 = K.H(R02);
            C0157t tVar7 = this.f1966q;
            tVar6.f3492d = H3 + tVar7.e;
            tVar7.f3490b = this.f1967r.e(R02);
            i4 = (-this.f1967r.e(R02)) + this.f1967r.k();
        }
        C0157t tVar8 = this.f1966q;
        tVar8.f3491c = i2;
        if (z2) {
            tVar8.f3491c = i2 - i4;
        }
        tVar8.f3494g = i4;
    }

    public final void c(String str) {
        if (this.f1975z == null) {
            super.c(str);
        }
    }

    public final void c1(int i, int i2) {
        int i3;
        this.f1966q.f3491c = this.f1967r.g() - i2;
        C0157t tVar = this.f1966q;
        if (this.f1970u) {
            i3 = -1;
        } else {
            i3 = 1;
        }
        tVar.e = i3;
        tVar.f3492d = i;
        tVar.f3493f = 1;
        tVar.f3490b = i2;
        tVar.f3494g = Integer.MIN_VALUE;
    }

    public final boolean d() {
        if (this.f1965p == 0) {
            return true;
        }
        return false;
    }

    public final void d0(Parcelable parcelable) {
        if (parcelable instanceof C0158u) {
            this.f1975z = (C0158u) parcelable;
            l0();
        }
    }

    public final void d1(int i, int i2) {
        int i3;
        this.f1966q.f3491c = i2 - this.f1967r.k();
        C0157t tVar = this.f1966q;
        tVar.f3492d = i;
        if (this.f1970u) {
            i3 = 1;
        } else {
            i3 = -1;
        }
        tVar.e = i3;
        tVar.f3493f = -1;
        tVar.f3490b = i2;
        tVar.f3494g = Integer.MIN_VALUE;
    }

    public final boolean e() {
        if (this.f1965p == 1) {
            return true;
        }
        return false;
    }

    /* JADX WARNING: type inference failed for: r0v1, types: [android.os.Parcelable, java.lang.Object, j0.u] */
    /* JADX WARNING: type inference failed for: r1v9, types: [android.os.Parcelable, java.lang.Object, j0.u] */
    public final Parcelable e0() {
        C0158u uVar = this.f1975z;
        if (uVar != null) {
            ? obj = new Object();
            obj.f3499a = uVar.f3499a;
            obj.f3500b = uVar.f3500b;
            obj.f3501c = uVar.f3501c;
            return obj;
        }
        ? obj2 = new Object();
        if (v() > 0) {
            G0();
            boolean z2 = this.f1968s ^ this.f1970u;
            obj2.f3501c = z2;
            if (z2) {
                View Q02 = Q0();
                obj2.f3500b = this.f1967r.g() - this.f1967r.b(Q02);
                obj2.f3499a = K.H(Q02);
            } else {
                View R02 = R0();
                obj2.f3499a = K.H(R02);
                obj2.f3500b = this.f1967r.e(R02) - this.f1967r.k();
            }
        } else {
            obj2.f3499a = -1;
        }
        return obj2;
    }

    public final void h(int i, int i2, X x2, C0152n nVar) {
        int i3;
        if (this.f1965p != 0) {
            i = i2;
        }
        if (v() != 0 && i != 0) {
            G0();
            if (i > 0) {
                i3 = 1;
            } else {
                i3 = -1;
            }
            b1(i3, Math.abs(i), true, x2);
            B0(x2, this.f1966q, nVar);
        }
    }

    public final void i(int i, C0152n nVar) {
        int i2;
        boolean z2;
        C0158u uVar = this.f1975z;
        int i3 = -1;
        if (uVar == null || (i2 = uVar.f3499a) < 0) {
            X0();
            z2 = this.f1970u;
            i2 = this.f1973x;
            if (i2 == -1) {
                if (z2) {
                    i2 = i - 1;
                } else {
                    i2 = 0;
                }
            }
        } else {
            z2 = uVar.f3501c;
        }
        if (!z2) {
            i3 = 1;
        }
        for (int i4 = 0; i4 < this.f1963C && i2 >= 0 && i2 < i; i4++) {
            nVar.a(i2, 0);
            i2 += i3;
        }
    }

    public int m0(int i, Q q2, X x2) {
        if (this.f1965p == 1) {
            return 0;
        }
        return Y0(i, q2, x2);
    }

    public final void n0(int i) {
        this.f1973x = i;
        this.f1974y = Integer.MIN_VALUE;
        C0158u uVar = this.f1975z;
        if (uVar != null) {
            uVar.f3499a = -1;
        }
        l0();
    }

    public int o0(int i, Q q2, X x2) {
        if (this.f1965p == 0) {
            return 0;
        }
        return Y0(i, q2, x2);
    }

    public L r() {
        return new L(-2, -2);
    }

    public final boolean v0() {
        if (this.f3287m == 1073741824 || this.f3286l == 1073741824) {
            return false;
        }
        int v2 = v();
        for (int i = 0; i < v2; i++) {
            ViewGroup.LayoutParams layoutParams = u(i).getLayoutParams();
            if (layoutParams.width < 0 && layoutParams.height < 0) {
                return true;
            }
        }
        return false;
    }

    public void x0(RecyclerView recyclerView, int i) {
        C0159v vVar = new C0159v(recyclerView.getContext());
        vVar.f3502a = i;
        y0(vVar);
    }

    public boolean z0() {
        if (this.f1975z == null && this.f1968s == this.f1971v) {
            return true;
        }
        return false;
    }

    public final int C0(X x2) {
        if (v() == 0) {
            return 0;
        }
        G0();
        g gVar = this.f1967r;
        boolean z2 = !this.f1972w;
        return T0.g.i(x2, gVar, J0(z2), I0(z2), this, this.f1972w);
    }

    public final int D0(X x2) {
        if (v() == 0) {
            return 0;
        }
        G0();
        g gVar = this.f1967r;
        boolean z2 = !this.f1972w;
        return T0.g.j(x2, gVar, J0(z2), I0(z2), this, this.f1972w, this.f1970u);
    }

    public final int E0(X x2) {
        if (v() == 0) {
            return 0;
        }
        G0();
        g gVar = this.f1967r;
        boolean z2 = !this.f1972w;
        return T0.g.k(x2, gVar, J0(z2), I0(z2), this, this.f1972w);
    }

    public final int K0() {
        View M02 = M0(v() - 1, -1, false);
        if (M02 == null) {
            return -1;
        }
        return K.H(M02);
    }

    public final View L0(int i, int i2) {
        int i3;
        int i4;
        G0();
        if (i2 <= i && i2 >= i) {
            return u(i);
        }
        if (this.f1967r.e(u(i)) < this.f1967r.k()) {
            i4 = 16644;
            i3 = 16388;
        } else {
            i4 = 4161;
            i3 = 4097;
        }
        if (this.f1965p == 0) {
            return this.f3279c.w(i, i2, i4, i3);
        }
        return this.f3280d.w(i, i2, i4, i3);
    }

    public final View M0(int i, int i2, boolean z2) {
        int i3;
        G0();
        if (z2) {
            i3 = 24579;
        } else {
            i3 = 320;
        }
        if (this.f1965p == 0) {
            return this.f3279c.w(i, i2, i3, 320);
        }
        return this.f3280d.w(i, i2, i3, 320);
    }

    public View N0(Q q2, X x2, int i, int i2, int i3) {
        int i4;
        G0();
        int k2 = this.f1967r.k();
        int g2 = this.f1967r.g();
        if (i2 > i) {
            i4 = 1;
        } else {
            i4 = -1;
        }
        View view = null;
        View view2 = null;
        while (i != i2) {
            View u2 = u(i);
            int H2 = K.H(u2);
            if (H2 >= 0 && H2 < i3) {
                if (((L) u2.getLayoutParams()).f3290a.i()) {
                    if (view2 == null) {
                        view2 = u2;
                    }
                } else if (this.f1967r.e(u2) < g2 && this.f1967r.b(u2) >= k2) {
                    return u2;
                } else {
                    if (view == null) {
                        view = u2;
                    }
                }
            }
            i += i4;
        }
        if (view != null) {
            return view;
        }
        return view2;
    }

    public View S(View view, int i, Q q2, X x2) {
        int F0;
        View view2;
        View view3;
        X0();
        if (v() == 0 || (F0 = F0(i)) == Integer.MIN_VALUE) {
            return null;
        }
        G0();
        b1(F0, (int) (((float) this.f1967r.l()) * 0.33333334f), false, x2);
        C0157t tVar = this.f1966q;
        tVar.f3494g = Integer.MIN_VALUE;
        tVar.f3489a = false;
        H0(q2, tVar, x2, true);
        if (F0 == -1) {
            if (this.f1970u) {
                view2 = L0(v() - 1, -1);
            } else {
                view2 = L0(0, v());
            }
        } else if (this.f1970u) {
            view2 = L0(0, v());
        } else {
            view2 = L0(v() - 1, -1);
        }
        if (F0 == -1) {
            view3 = R0();
        } else {
            view3 = Q0();
        }
        if (!view3.hasFocusable()) {
            return view2;
        }
        if (view2 == null) {
            return null;
        }
        return view3;
    }

    public final boolean S0() {
        if (C() == 1) {
            return true;
        }
        return false;
    }

    public final void T(AccessibilityEvent accessibilityEvent) {
        int i;
        super.T(accessibilityEvent);
        if (v() > 0) {
            View M02 = M0(0, v(), false);
            if (M02 == null) {
                i = -1;
            } else {
                i = K.H(M02);
            }
            accessibilityEvent.setFromIndex(i);
            accessibilityEvent.setToIndex(K0());
        }
    }

    public void T0(Q q2, X x2, C0157t tVar, i iVar) {
        int i;
        int i2;
        int i3;
        int i4;
        boolean z2;
        boolean z3;
        View b2 = tVar.b(q2);
        if (b2 == null) {
            iVar.f2704b = true;
            return;
        }
        L l2 = (L) b2.getLayoutParams();
        if (tVar.f3497k == null) {
            boolean z4 = this.f1970u;
            if (tVar.f3493f == -1) {
                z3 = true;
            } else {
                z3 = false;
            }
            if (z4 == z3) {
                b(b2, -1, false);
            } else {
                b(b2, 0, false);
            }
        } else {
            boolean z5 = this.f1970u;
            if (tVar.f3493f == -1) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (z5 == z2) {
                b(b2, -1, true);
            } else {
                b(b2, 0, true);
            }
        }
        L l3 = (L) b2.getLayoutParams();
        Rect J2 = this.f3278b.J(b2);
        int i5 = J2.left + J2.right;
        int i6 = J2.top + J2.bottom;
        int w2 = K.w(d(), this.f3288n, this.f3286l, F() + E() + l3.leftMargin + l3.rightMargin + i5, l3.width);
        int w3 = K.w(e(), this.f3289o, this.f3287m, D() + G() + l3.topMargin + l3.bottomMargin + i6, l3.height);
        if (u0(b2, w2, w3, l3)) {
            b2.measure(w2, w3);
        }
        iVar.f2703a = this.f1967r.c(b2);
        if (this.f1965p == 1) {
            if (S0()) {
                i4 = this.f3288n - F();
                i3 = i4 - this.f1967r.d(b2);
            } else {
                i3 = E();
                i4 = this.f1967r.d(b2) + i3;
            }
            if (tVar.f3493f == -1) {
                i = tVar.f3490b;
                i2 = i - iVar.f2703a;
            } else {
                i2 = tVar.f3490b;
                i = iVar.f2703a + i2;
            }
        } else {
            int G2 = G();
            int d2 = this.f1967r.d(b2) + G2;
            if (tVar.f3493f == -1) {
                int i7 = tVar.f3490b;
                int i8 = i7 - iVar.f2703a;
                int i9 = G2;
                i4 = i7;
                i = d2;
                i3 = i8;
                i2 = i9;
            } else {
                int i10 = tVar.f3490b;
                int i11 = iVar.f2703a + i10;
                int i12 = d2;
                i3 = i10;
                i = i12;
                int i13 = i11;
                i2 = G2;
                i4 = i13;
            }
        }
        K.N(b2, i3, i2, i4, i);
        if (l2.f3290a.i() || l2.f3290a.l()) {
            iVar.f2705c = true;
        }
        iVar.f2706d = b2.hasFocusable();
    }

    public final int Y0(int i, Q q2, X x2) {
        int i2;
        if (v() == 0 || i == 0) {
            return 0;
        }
        G0();
        this.f1966q.f3489a = true;
        if (i > 0) {
            i2 = 1;
        } else {
            i2 = -1;
        }
        int abs = Math.abs(i);
        b1(i2, abs, true, x2);
        C0157t tVar = this.f1966q;
        int H02 = H0(q2, tVar, x2, false) + tVar.f3494g;
        if (H02 < 0) {
            return 0;
        }
        if (abs > H02) {
            i = i2 * H02;
        }
        this.f1967r.p(-i);
        this.f1966q.f3496j = i;
        return i;
    }

    public final PointF a(int i) {
        if (v() == 0) {
            return null;
        }
        boolean z2 = false;
        int i2 = 1;
        if (i < K.H(u(0))) {
            z2 = true;
        }
        if (z2 != this.f1970u) {
            i2 = -1;
        }
        if (this.f1965p == 0) {
            return new PointF((float) i2, 0.0f);
        }
        return new PointF(0.0f, (float) i2);
    }

    public final int j(X x2) {
        return C0(x2);
    }

    public int k(X x2) {
        return D0(x2);
    }

    public int l(X x2) {
        return E0(x2);
    }

    public final int m(X x2) {
        return C0(x2);
    }

    public int n(X x2) {
        return D0(x2);
    }

    public int o(X x2) {
        return E0(x2);
    }

    public final View q(int i) {
        int v2 = v();
        if (v2 == 0) {
            return null;
        }
        int H2 = i - K.H(u(0));
        if (H2 >= 0 && H2 < v2) {
            View u2 = u(H2);
            if (K.H(u2) == i) {
                return u2;
            }
        }
        return super.q(i);
    }

    /* JADX WARNING: type inference failed for: r1v2, types: [java.lang.Object, g1.i] */
    public LinearLayoutManager(Context context, AttributeSet attributeSet, int i, int i2) {
        J I = K.I(context, attributeSet, i, i2);
        Z0(I.f3273a);
        boolean z2 = I.f3275c;
        c((String) null);
        if (z2 != this.f1969t) {
            this.f1969t = z2;
            l0();
        }
        a1(I.f3276d);
    }
}
