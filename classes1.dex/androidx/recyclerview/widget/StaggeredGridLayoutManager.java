package androidx.recyclerview.widget;

import E.j;
import N0.B;
import O.k;
import android.content.Context;
import android.graphics.PointF;
import android.graphics.Rect;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import androidx.emoji2.text.g;
import j0.C0152n;
import j0.C0159v;
import j0.J;
import j0.K;
import j0.L;
import j0.Q;
import j0.W;
import j0.X;
import j0.e0;
import j0.f0;
import j0.h0;
import j0.i0;
import j0.r;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.BitSet;
import java.util.WeakHashMap;

public class StaggeredGridLayoutManager extends K implements W {

    /* renamed from: A  reason: collision with root package name */
    public int f2047A = Integer.MIN_VALUE;

    /* renamed from: B  reason: collision with root package name */
    public final j f2048B;

    /* renamed from: C  reason: collision with root package name */
    public final int f2049C;

    /* renamed from: D  reason: collision with root package name */
    public boolean f2050D;

    /* renamed from: E  reason: collision with root package name */
    public boolean f2051E;

    /* renamed from: F  reason: collision with root package name */
    public h0 f2052F;

    /* renamed from: G  reason: collision with root package name */
    public final Rect f2053G;

    /* renamed from: H  reason: collision with root package name */
    public final e0 f2054H;
    public final boolean I;

    /* renamed from: J  reason: collision with root package name */
    public int[] f2055J;

    /* renamed from: K  reason: collision with root package name */
    public final B f2056K;

    /* renamed from: p  reason: collision with root package name */
    public final int f2057p = -1;

    /* renamed from: q  reason: collision with root package name */
    public final i0[] f2058q;

    /* renamed from: r  reason: collision with root package name */
    public final g f2059r;

    /* renamed from: s  reason: collision with root package name */
    public final g f2060s;

    /* renamed from: t  reason: collision with root package name */
    public final int f2061t;

    /* renamed from: u  reason: collision with root package name */
    public int f2062u;

    /* renamed from: v  reason: collision with root package name */
    public final r f2063v;

    /* renamed from: w  reason: collision with root package name */
    public boolean f2064w = false;

    /* renamed from: x  reason: collision with root package name */
    public boolean f2065x = false;

    /* renamed from: y  reason: collision with root package name */
    public final BitSet f2066y;

    /* renamed from: z  reason: collision with root package name */
    public int f2067z = -1;

    public final void U0(int i, X x2) {
        int i2;
        int i3;
        if (i > 0) {
            i3 = L0();
            i2 = 1;
        } else {
            i3 = K0();
            i2 = -1;
        }
        r rVar = this.f2063v;
        rVar.f3478a = true;
        b1(i3, x2);
        a1(i2);
        rVar.f3480c = i3 + rVar.f3481d;
        rVar.f3479b = Math.abs(i);
    }

    public final void W(int i, int i2) {
        O0(i, i2, 1);
    }

    public final void Z(int i, int i2) {
        O0(i, i2, 2);
    }

    public final void a0(int i, int i2) {
        O0(i, i2, 4);
    }

    public final void b0(Q q2, X x2) {
        S0(q2, x2, true);
    }

    public final void c0(X x2) {
        this.f2067z = -1;
        this.f2047A = Integer.MIN_VALUE;
        this.f2052F = null;
        this.f2054H.a();
    }

    public static int d1(int i, int i2, int i3) {
        if (i2 == 0 && i3 == 0) {
            return i;
        }
        int mode = View.MeasureSpec.getMode(i);
        if (mode == Integer.MIN_VALUE || mode == 1073741824) {
            return View.MeasureSpec.makeMeasureSpec(Math.max(0, (View.MeasureSpec.getSize(i) - i2) - i3), mode);
        }
        return i;
    }

    public final int F0(Q q2, r rVar, X x2) {
        int i;
        int i2;
        boolean z2;
        int i3;
        int i4;
        i0 i0Var;
        boolean z3;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        Q q3 = q2;
        r rVar2 = rVar;
        int i13 = 1;
        this.f2066y.set(0, this.f2057p, true);
        r rVar3 = this.f2063v;
        if (rVar3.i) {
            if (rVar2.e == 1) {
                i = Integer.MAX_VALUE;
            } else {
                i = Integer.MIN_VALUE;
            }
        } else if (rVar2.e == 1) {
            i = rVar2.f3483g + rVar2.f3479b;
        } else {
            i = rVar2.f3482f - rVar2.f3479b;
        }
        int i14 = rVar2.e;
        for (int i15 = 0; i15 < this.f2057p; i15++) {
            if (!this.f2058q[i15].f3408a.isEmpty()) {
                c1(this.f2058q[i15], i14, i);
            }
        }
        if (this.f2065x) {
            i2 = this.f2059r.g();
        } else {
            i2 = this.f2059r.k();
        }
        boolean z4 = false;
        while (true) {
            int i16 = rVar2.f3480c;
            if (i16 < 0 || i16 >= x2.b()) {
                z2 = false;
            } else {
                z2 = true;
            }
            if (z2 && (rVar3.i || !this.f2066y.isEmpty())) {
                View view = q3.i(rVar2.f3480c, Long.MAX_VALUE).f3338a;
                rVar2.f3480c += rVar2.f3481d;
                f0 f0Var = (f0) view.getLayoutParams();
                int b2 = f0Var.f3290a.b();
                j jVar = this.f2048B;
                int[] iArr = (int[]) jVar.f108g;
                if (iArr == null || b2 >= iArr.length) {
                    i4 = -1;
                } else {
                    i4 = iArr[b2];
                }
                if (i4 == -1) {
                    if (T0(rVar2.e)) {
                        i12 = this.f2057p - i13;
                        i11 = -1;
                        i10 = -1;
                    } else {
                        i11 = this.f2057p;
                        i12 = 0;
                        i10 = 1;
                    }
                    i0 i0Var2 = null;
                    if (rVar2.e == i13) {
                        int k2 = this.f2059r.k();
                        int i17 = Integer.MAX_VALUE;
                        while (i12 != i11) {
                            i0 i0Var3 = this.f2058q[i12];
                            int f2 = i0Var3.f(k2);
                            if (f2 < i17) {
                                i17 = f2;
                                i0Var2 = i0Var3;
                            }
                            i12 += i10;
                        }
                    } else {
                        int g2 = this.f2059r.g();
                        int i18 = Integer.MIN_VALUE;
                        while (i12 != i11) {
                            i0 i0Var4 = this.f2058q[i12];
                            int h2 = i0Var4.h(g2);
                            if (h2 > i18) {
                                i0Var2 = i0Var4;
                                i18 = h2;
                            }
                            i12 += i10;
                        }
                    }
                    i0Var = i0Var2;
                    jVar.u(b2);
                    ((int[]) jVar.f108g)[b2] = i0Var.e;
                } else {
                    i0Var = this.f2058q[i4];
                }
                f0Var.e = i0Var;
                if (rVar2.e == 1) {
                    z3 = false;
                    b(view, -1, false);
                } else {
                    z3 = false;
                    b(view, 0, false);
                }
                if (this.f2061t == 1) {
                    i5 = 1;
                    R0(view, K.w(z3, this.f2062u, this.f3286l, z3 ? 1 : 0, f0Var.width), K.w(true, this.f3289o, this.f3287m, D() + G(), f0Var.height));
                } else {
                    i5 = 1;
                    R0(view, K.w(true, this.f3288n, this.f3286l, F() + E(), f0Var.width), K.w(false, this.f2062u, this.f3287m, 0, f0Var.height));
                }
                if (rVar2.e == i5) {
                    i7 = i0Var.f(i2);
                    i6 = this.f2059r.c(view) + i7;
                } else {
                    i6 = i0Var.h(i2);
                    i7 = i6 - this.f2059r.c(view);
                }
                if (rVar2.e == 1) {
                    i0 i0Var5 = f0Var.e;
                    i0Var5.getClass();
                    f0 f0Var2 = (f0) view.getLayoutParams();
                    f0Var2.e = i0Var5;
                    ArrayList arrayList = i0Var5.f3408a;
                    arrayList.add(view);
                    i0Var5.f3410c = Integer.MIN_VALUE;
                    if (arrayList.size() == 1) {
                        i0Var5.f3409b = Integer.MIN_VALUE;
                    }
                    if (f0Var2.f3290a.i() || f0Var2.f3290a.l()) {
                        i0Var5.f3411d = i0Var5.f3412f.f2059r.c(view) + i0Var5.f3411d;
                    }
                } else {
                    i0 i0Var6 = f0Var.e;
                    i0Var6.getClass();
                    f0 f0Var3 = (f0) view.getLayoutParams();
                    f0Var3.e = i0Var6;
                    ArrayList arrayList2 = i0Var6.f3408a;
                    arrayList2.add(0, view);
                    i0Var6.f3409b = Integer.MIN_VALUE;
                    if (arrayList2.size() == 1) {
                        i0Var6.f3410c = Integer.MIN_VALUE;
                    }
                    if (f0Var3.f3290a.i() || f0Var3.f3290a.l()) {
                        i0Var6.f3411d = i0Var6.f3412f.f2059r.c(view) + i0Var6.f3411d;
                    }
                }
                if (!Q0() || this.f2061t != 1) {
                    i8 = this.f2060s.k() + (i0Var.e * this.f2062u);
                    i9 = this.f2060s.c(view) + i8;
                } else {
                    i9 = this.f2060s.g() - (((this.f2057p - 1) - i0Var.e) * this.f2062u);
                    i8 = i9 - this.f2060s.c(view);
                }
                if (this.f2061t == 1) {
                    K.N(view, i8, i7, i9, i6);
                } else {
                    K.N(view, i7, i8, i6, i9);
                }
                c1(i0Var, rVar3.e, i);
                V0(q3, rVar3);
                if (rVar3.f3484h && view.hasFocusable()) {
                    this.f2066y.set(i0Var.e, false);
                }
                i13 = 1;
                z4 = true;
            }
        }
        if (!z4) {
            V0(q3, rVar3);
        }
        if (rVar3.e == -1) {
            i3 = this.f2059r.k() - N0(this.f2059r.k());
        } else {
            i3 = M0(this.f2059r.g()) - this.f2059r.g();
        }
        if (i3 > 0) {
            return Math.min(rVar2.f3479b, i3);
        }
        return 0;
    }

    public final View G0(boolean z2) {
        int k2 = this.f2059r.k();
        int g2 = this.f2059r.g();
        View view = null;
        for (int v2 = v() - 1; v2 >= 0; v2--) {
            View u2 = u(v2);
            int e = this.f2059r.e(u2);
            int b2 = this.f2059r.b(u2);
            if (b2 > k2 && e < g2) {
                if (b2 <= g2 || !z2) {
                    return u2;
                }
                if (view == null) {
                    view = u2;
                }
            }
        }
        return view;
    }

    public final View H0(boolean z2) {
        int k2 = this.f2059r.k();
        int g2 = this.f2059r.g();
        int v2 = v();
        View view = null;
        for (int i = 0; i < v2; i++) {
            View u2 = u(i);
            int e = this.f2059r.e(u2);
            if (this.f2059r.b(u2) > k2 && e < g2) {
                if (e >= k2 || !z2) {
                    return u2;
                }
                if (view == null) {
                    view = u2;
                }
            }
        }
        return view;
    }

    public final void I0(Q q2, X x2, boolean z2) {
        int g2;
        int M02 = M0(Integer.MIN_VALUE);
        if (M02 != Integer.MIN_VALUE && (g2 = this.f2059r.g() - M02) > 0) {
            int i = g2 - (-Z0(-g2, q2, x2));
            if (z2 && i > 0) {
                this.f2059r.p(i);
            }
        }
    }

    public final int J(Q q2, X x2) {
        if (this.f2061t == 0) {
            return this.f2057p;
        }
        return super.J(q2, x2);
    }

    public final boolean L() {
        if (this.f2049C != 0) {
            return true;
        }
        return false;
    }

    public final int M0(int i) {
        int f2 = this.f2058q[0].f(i);
        for (int i2 = 1; i2 < this.f2057p; i2++) {
            int f3 = this.f2058q[i2].f(i);
            if (f3 > f2) {
                f2 = f3;
            }
        }
        return f2;
    }

    public final int N0(int i) {
        int h2 = this.f2058q[0].h(i);
        for (int i2 = 1; i2 < this.f2057p; i2++) {
            int h3 = this.f2058q[i2].h(i);
            if (h3 < h2) {
                h2 = h3;
            }
        }
        return h2;
    }

    /* JADX WARNING: Removed duplicated region for block: B:18:0x0036  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x0093  */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x00a1  */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x00ad  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x00be  */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x00c3 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x00c4  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void O0(int r11, int r12, int r13) {
        /*
            r10 = this;
            boolean r0 = r10.f2065x
            if (r0 == 0) goto L_0x0009
            int r0 = r10.L0()
            goto L_0x000d
        L_0x0009:
            int r0 = r10.K0()
        L_0x000d:
            r1 = 8
            if (r13 != r1) goto L_0x001b
            if (r11 >= r12) goto L_0x0017
            int r2 = r12 + 1
        L_0x0015:
            r3 = r11
            goto L_0x001e
        L_0x0017:
            int r2 = r11 + 1
            r3 = r12
            goto L_0x001e
        L_0x001b:
            int r2 = r11 + r12
            goto L_0x0015
        L_0x001e:
            E.j r4 = r10.f2048B
            java.lang.Object r5 = r4.f108g
            int[] r5 = (int[]) r5
            r6 = -1
            if (r5 != 0) goto L_0x0029
            goto L_0x00aa
        L_0x0029:
            int r5 = r5.length
            if (r3 < r5) goto L_0x002e
            goto L_0x00aa
        L_0x002e:
            java.lang.Object r5 = r4.f109h
            java.util.ArrayList r5 = (java.util.ArrayList) r5
            if (r5 != 0) goto L_0x0036
        L_0x0034:
            r5 = -1
            goto L_0x0091
        L_0x0036:
            r7 = 0
            if (r5 != 0) goto L_0x003a
            goto L_0x0055
        L_0x003a:
            int r5 = r5.size()
            int r5 = r5 + -1
        L_0x0040:
            if (r5 < 0) goto L_0x0055
            java.lang.Object r8 = r4.f109h
            java.util.ArrayList r8 = (java.util.ArrayList) r8
            java.lang.Object r8 = r8.get(r5)
            j0.g0 r8 = (j0.g0) r8
            int r9 = r8.f3387a
            if (r9 != r3) goto L_0x0052
            r7 = r8
            goto L_0x0055
        L_0x0052:
            int r5 = r5 + -1
            goto L_0x0040
        L_0x0055:
            if (r7 == 0) goto L_0x005e
            java.lang.Object r5 = r4.f109h
            java.util.ArrayList r5 = (java.util.ArrayList) r5
            r5.remove(r7)
        L_0x005e:
            java.lang.Object r5 = r4.f109h
            java.util.ArrayList r5 = (java.util.ArrayList) r5
            int r5 = r5.size()
            r7 = 0
        L_0x0067:
            if (r7 >= r5) goto L_0x007b
            java.lang.Object r8 = r4.f109h
            java.util.ArrayList r8 = (java.util.ArrayList) r8
            java.lang.Object r8 = r8.get(r7)
            j0.g0 r8 = (j0.g0) r8
            int r8 = r8.f3387a
            if (r8 < r3) goto L_0x0078
            goto L_0x007c
        L_0x0078:
            int r7 = r7 + 1
            goto L_0x0067
        L_0x007b:
            r7 = -1
        L_0x007c:
            if (r7 == r6) goto L_0x0034
            java.lang.Object r5 = r4.f109h
            java.util.ArrayList r5 = (java.util.ArrayList) r5
            java.lang.Object r5 = r5.get(r7)
            j0.g0 r5 = (j0.g0) r5
            java.lang.Object r8 = r4.f109h
            java.util.ArrayList r8 = (java.util.ArrayList) r8
            r8.remove(r7)
            int r5 = r5.f3387a
        L_0x0091:
            if (r5 != r6) goto L_0x00a1
            java.lang.Object r5 = r4.f108g
            int[] r5 = (int[]) r5
            int r7 = r5.length
            java.util.Arrays.fill(r5, r3, r7, r6)
            java.lang.Object r5 = r4.f108g
            int[] r5 = (int[]) r5
            int r5 = r5.length
            goto L_0x00aa
        L_0x00a1:
            java.lang.Object r7 = r4.f108g
            int[] r7 = (int[]) r7
            int r5 = r5 + 1
            java.util.Arrays.fill(r7, r3, r5, r6)
        L_0x00aa:
            r5 = 1
            if (r13 == r5) goto L_0x00be
            r6 = 2
            if (r13 == r6) goto L_0x00ba
            if (r13 == r1) goto L_0x00b3
            goto L_0x00c1
        L_0x00b3:
            r4.D(r11, r5)
            r4.C(r12, r5)
            goto L_0x00c1
        L_0x00ba:
            r4.D(r11, r12)
            goto L_0x00c1
        L_0x00be:
            r4.C(r11, r12)
        L_0x00c1:
            if (r2 > r0) goto L_0x00c4
            return
        L_0x00c4:
            boolean r11 = r10.f2065x
            if (r11 == 0) goto L_0x00cd
            int r11 = r10.K0()
            goto L_0x00d1
        L_0x00cd:
            int r11 = r10.L0()
        L_0x00d1:
            if (r3 > r11) goto L_0x00d6
            r10.l0()
        L_0x00d6:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.StaggeredGridLayoutManager.O0(int, int, int):void");
    }

    public final void R(RecyclerView recyclerView) {
        RecyclerView recyclerView2 = this.f3278b;
        if (recyclerView2 != null) {
            recyclerView2.removeCallbacks(this.f2056K);
        }
        for (int i = 0; i < this.f2057p; i++) {
            this.f2058q[i].b();
        }
        recyclerView.requestLayout();
    }

    public final void R0(View view, int i, int i2) {
        RecyclerView recyclerView = this.f3278b;
        Rect rect = this.f2053G;
        if (recyclerView == null) {
            rect.set(0, 0, 0, 0);
        } else {
            rect.set(recyclerView.J(view));
        }
        f0 f0Var = (f0) view.getLayoutParams();
        int d12 = d1(i, f0Var.leftMargin + rect.left, f0Var.rightMargin + rect.right);
        int d13 = d1(i2, f0Var.topMargin + rect.top, f0Var.bottomMargin + rect.bottom);
        if (u0(view, d12, d13, f0Var)) {
            view.measure(d12, d13);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:234:0x040f, code lost:
        if (B0() != false) goto L_0x0413;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void S0(j0.Q r17, j0.X r18, boolean r19) {
        /*
            r16 = this;
            r0 = r16
            r1 = r17
            r2 = r18
            j0.h0 r3 = r0.f2052F
            r4 = -1
            j0.e0 r5 = r0.f2054H
            if (r3 != 0) goto L_0x0011
            int r3 = r0.f2067z
            if (r3 == r4) goto L_0x001e
        L_0x0011:
            int r3 = r18.b()
            if (r3 != 0) goto L_0x001e
            r16.g0(r17)
            r5.a()
            return
        L_0x001e:
            boolean r3 = r5.e
            r6 = 1
            r7 = 0
            if (r3 == 0) goto L_0x002f
            int r3 = r0.f2067z
            if (r3 != r4) goto L_0x002f
            j0.h0 r3 = r0.f2052F
            if (r3 == 0) goto L_0x002d
            goto L_0x002f
        L_0x002d:
            r3 = 0
            goto L_0x0030
        L_0x002f:
            r3 = 1
        L_0x0030:
            E.j r8 = r0.f2048B
            r9 = 0
            androidx.recyclerview.widget.StaggeredGridLayoutManager r10 = r5.f3377g
            r11 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r3 == 0) goto L_0x020e
            r5.a()
            j0.h0 r12 = r0.f2052F
            if (r12 == 0) goto L_0x00c3
            int r13 = r12.f3398c
            if (r13 <= 0) goto L_0x0088
            int r14 = r0.f2057p
            if (r13 != r14) goto L_0x007a
            r12 = 0
        L_0x0049:
            int r13 = r0.f2057p
            if (r12 >= r13) goto L_0x0088
            j0.i0[] r13 = r0.f2058q
            r13 = r13[r12]
            r13.b()
            j0.h0 r13 = r0.f2052F
            int[] r14 = r13.f3399d
            r14 = r14[r12]
            if (r14 == r11) goto L_0x006f
            boolean r13 = r13.i
            if (r13 == 0) goto L_0x0068
            androidx.emoji2.text.g r13 = r0.f2059r
            int r13 = r13.g()
        L_0x0066:
            int r14 = r14 + r13
            goto L_0x006f
        L_0x0068:
            androidx.emoji2.text.g r13 = r0.f2059r
            int r13 = r13.k()
            goto L_0x0066
        L_0x006f:
            j0.i0[] r13 = r0.f2058q
            r13 = r13[r12]
            r13.f3409b = r14
            r13.f3410c = r14
            int r12 = r12 + 1
            goto L_0x0049
        L_0x007a:
            r12.f3399d = r9
            r12.f3398c = r7
            r12.e = r7
            r12.f3400f = r9
            r12.f3401g = r9
            int r13 = r12.f3397b
            r12.f3396a = r13
        L_0x0088:
            j0.h0 r12 = r0.f2052F
            boolean r13 = r12.f3403j
            r0.f2051E = r13
            boolean r12 = r12.f3402h
            r0.c(r9)
            j0.h0 r13 = r0.f2052F
            if (r13 == 0) goto L_0x009d
            boolean r14 = r13.f3402h
            if (r14 == r12) goto L_0x009d
            r13.f3402h = r12
        L_0x009d:
            r0.f2064w = r12
            r16.l0()
            r16.Y0()
            j0.h0 r12 = r0.f2052F
            int r13 = r12.f3396a
            if (r13 == r4) goto L_0x00b2
            r0.f2067z = r13
            boolean r13 = r12.i
            r5.f3374c = r13
            goto L_0x00b6
        L_0x00b2:
            boolean r13 = r0.f2065x
            r5.f3374c = r13
        L_0x00b6:
            int r13 = r12.e
            if (r13 <= r6) goto L_0x00ca
            int[] r13 = r12.f3400f
            r8.f108g = r13
            java.util.ArrayList r12 = r12.f3401g
            r8.f109h = r12
            goto L_0x00ca
        L_0x00c3:
            r16.Y0()
            boolean r12 = r0.f2065x
            r5.f3374c = r12
        L_0x00ca:
            boolean r12 = r2.f3320g
            if (r12 != 0) goto L_0x01cb
            int r12 = r0.f2067z
            if (r12 != r4) goto L_0x00d4
            goto L_0x01cb
        L_0x00d4:
            if (r12 < 0) goto L_0x01c7
            int r13 = r18.b()
            if (r12 < r13) goto L_0x00de
            goto L_0x01c7
        L_0x00de:
            j0.h0 r12 = r0.f2052F
            if (r12 == 0) goto L_0x00f3
            int r13 = r12.f3396a
            if (r13 == r4) goto L_0x00f3
            int r12 = r12.f3398c
            if (r12 >= r6) goto L_0x00eb
            goto L_0x00f3
        L_0x00eb:
            r5.f3373b = r11
            int r12 = r0.f2067z
            r5.f3372a = r12
            goto L_0x020c
        L_0x00f3:
            int r12 = r0.f2067z
            android.view.View r12 = r0.q(r12)
            if (r12 == 0) goto L_0x0188
            boolean r13 = r0.f2065x
            if (r13 == 0) goto L_0x0104
            int r13 = r16.L0()
            goto L_0x0108
        L_0x0104:
            int r13 = r16.K0()
        L_0x0108:
            r5.f3372a = r13
            int r13 = r0.f2047A
            if (r13 == r11) goto L_0x013a
            boolean r13 = r5.f3374c
            if (r13 == 0) goto L_0x0126
            androidx.emoji2.text.g r13 = r0.f2059r
            int r13 = r13.g()
            int r14 = r0.f2047A
            int r13 = r13 - r14
            androidx.emoji2.text.g r14 = r0.f2059r
            int r12 = r14.b(r12)
            int r13 = r13 - r12
            r5.f3373b = r13
            goto L_0x020c
        L_0x0126:
            androidx.emoji2.text.g r13 = r0.f2059r
            int r13 = r13.k()
            int r14 = r0.f2047A
            int r13 = r13 + r14
            androidx.emoji2.text.g r14 = r0.f2059r
            int r12 = r14.e(r12)
            int r13 = r13 - r12
            r5.f3373b = r13
            goto L_0x020c
        L_0x013a:
            androidx.emoji2.text.g r13 = r0.f2059r
            int r13 = r13.c(r12)
            androidx.emoji2.text.g r14 = r0.f2059r
            int r14 = r14.l()
            if (r13 <= r14) goto L_0x015d
            boolean r12 = r5.f3374c
            if (r12 == 0) goto L_0x0153
            androidx.emoji2.text.g r12 = r0.f2059r
            int r12 = r12.g()
            goto L_0x0159
        L_0x0153:
            androidx.emoji2.text.g r12 = r0.f2059r
            int r12 = r12.k()
        L_0x0159:
            r5.f3373b = r12
            goto L_0x020c
        L_0x015d:
            androidx.emoji2.text.g r13 = r0.f2059r
            int r13 = r13.e(r12)
            androidx.emoji2.text.g r14 = r0.f2059r
            int r14 = r14.k()
            int r13 = r13 - r14
            if (r13 >= 0) goto L_0x0171
            int r12 = -r13
            r5.f3373b = r12
            goto L_0x020c
        L_0x0171:
            androidx.emoji2.text.g r13 = r0.f2059r
            int r13 = r13.g()
            androidx.emoji2.text.g r14 = r0.f2059r
            int r12 = r14.b(r12)
            int r13 = r13 - r12
            if (r13 >= 0) goto L_0x0184
            r5.f3373b = r13
            goto L_0x020c
        L_0x0184:
            r5.f3373b = r11
            goto L_0x020c
        L_0x0188:
            int r12 = r0.f2067z
            r5.f3372a = r12
            int r13 = r0.f2047A
            if (r13 != r11) goto L_0x01ad
            int r12 = r0.A0(r12)
            if (r12 != r6) goto L_0x0198
            r12 = 1
            goto L_0x0199
        L_0x0198:
            r12 = 0
        L_0x0199:
            r5.f3374c = r12
            if (r12 == 0) goto L_0x01a4
            androidx.emoji2.text.g r12 = r10.f2059r
            int r12 = r12.g()
            goto L_0x01aa
        L_0x01a4:
            androidx.emoji2.text.g r12 = r10.f2059r
            int r12 = r12.k()
        L_0x01aa:
            r5.f3373b = r12
            goto L_0x01c4
        L_0x01ad:
            boolean r12 = r5.f3374c
            if (r12 == 0) goto L_0x01bb
            androidx.emoji2.text.g r12 = r10.f2059r
            int r12 = r12.g()
            int r12 = r12 - r13
            r5.f3373b = r12
            goto L_0x01c4
        L_0x01bb:
            androidx.emoji2.text.g r12 = r10.f2059r
            int r12 = r12.k()
            int r12 = r12 + r13
            r5.f3373b = r12
        L_0x01c4:
            r5.f3375d = r6
            goto L_0x020c
        L_0x01c7:
            r0.f2067z = r4
            r0.f2047A = r11
        L_0x01cb:
            boolean r12 = r0.f2050D
            if (r12 == 0) goto L_0x01ec
            int r12 = r18.b()
            int r13 = r16.v()
            int r13 = r13 - r6
        L_0x01d8:
            if (r13 < 0) goto L_0x01ea
            android.view.View r14 = r0.u(r13)
            int r14 = j0.K.H(r14)
            if (r14 < 0) goto L_0x01e7
            if (r14 >= r12) goto L_0x01e7
            goto L_0x0208
        L_0x01e7:
            int r13 = r13 + -1
            goto L_0x01d8
        L_0x01ea:
            r14 = 0
            goto L_0x0208
        L_0x01ec:
            int r12 = r18.b()
            int r13 = r16.v()
            r14 = 0
        L_0x01f5:
            if (r14 >= r13) goto L_0x01ea
            android.view.View r15 = r0.u(r14)
            int r15 = j0.K.H(r15)
            if (r15 < 0) goto L_0x0205
            if (r15 >= r12) goto L_0x0205
            r14 = r15
            goto L_0x0208
        L_0x0205:
            int r14 = r14 + 1
            goto L_0x01f5
        L_0x0208:
            r5.f3372a = r14
            r5.f3373b = r11
        L_0x020c:
            r5.e = r6
        L_0x020e:
            j0.h0 r12 = r0.f2052F
            if (r12 != 0) goto L_0x0231
            int r12 = r0.f2067z
            if (r12 != r4) goto L_0x0231
            boolean r12 = r5.f3374c
            boolean r13 = r0.f2050D
            if (r12 != r13) goto L_0x0224
            boolean r12 = r16.Q0()
            boolean r13 = r0.f2051E
            if (r12 == r13) goto L_0x0231
        L_0x0224:
            java.lang.Object r12 = r8.f108g
            int[] r12 = (int[]) r12
            if (r12 == 0) goto L_0x022d
            java.util.Arrays.fill(r12, r4)
        L_0x022d:
            r8.f109h = r9
            r5.f3375d = r6
        L_0x0231:
            int r8 = r16.v()
            if (r8 <= 0) goto L_0x02dc
            j0.h0 r8 = r0.f2052F
            if (r8 == 0) goto L_0x023f
            int r8 = r8.f3398c
            if (r8 >= r6) goto L_0x02dc
        L_0x023f:
            boolean r8 = r5.f3375d
            if (r8 == 0) goto L_0x025e
            r3 = 0
        L_0x0244:
            int r8 = r0.f2057p
            if (r3 >= r8) goto L_0x02dc
            j0.i0[] r8 = r0.f2058q
            r8 = r8[r3]
            r8.b()
            int r8 = r5.f3373b
            if (r8 == r11) goto L_0x025b
            j0.i0[] r9 = r0.f2058q
            r9 = r9[r3]
            r9.f3409b = r8
            r9.f3410c = r8
        L_0x025b:
            int r3 = r3 + 1
            goto L_0x0244
        L_0x025e:
            if (r3 != 0) goto L_0x027c
            int[] r3 = r5.f3376f
            if (r3 != 0) goto L_0x0265
            goto L_0x027c
        L_0x0265:
            r3 = 0
        L_0x0266:
            int r8 = r0.f2057p
            if (r3 >= r8) goto L_0x02dc
            j0.i0[] r8 = r0.f2058q
            r8 = r8[r3]
            r8.b()
            int[] r9 = r5.f3376f
            r9 = r9[r3]
            r8.f3409b = r9
            r8.f3410c = r9
            int r3 = r3 + 1
            goto L_0x0266
        L_0x027c:
            r3 = 0
        L_0x027d:
            int r8 = r0.f2057p
            if (r3 >= r8) goto L_0x02bb
            j0.i0[] r8 = r0.f2058q
            r8 = r8[r3]
            boolean r9 = r0.f2065x
            int r12 = r5.f3373b
            if (r9 == 0) goto L_0x0290
            int r13 = r8.f(r11)
            goto L_0x0294
        L_0x0290:
            int r13 = r8.h(r11)
        L_0x0294:
            r8.b()
            if (r13 != r11) goto L_0x029a
            goto L_0x02b8
        L_0x029a:
            androidx.recyclerview.widget.StaggeredGridLayoutManager r14 = r8.f3412f
            if (r9 == 0) goto L_0x02a6
            androidx.emoji2.text.g r15 = r14.f2059r
            int r15 = r15.g()
            if (r13 < r15) goto L_0x02b8
        L_0x02a6:
            if (r9 != 0) goto L_0x02b1
            androidx.emoji2.text.g r9 = r14.f2059r
            int r9 = r9.k()
            if (r13 <= r9) goto L_0x02b1
            goto L_0x02b8
        L_0x02b1:
            if (r12 == r11) goto L_0x02b4
            int r13 = r13 + r12
        L_0x02b4:
            r8.f3410c = r13
            r8.f3409b = r13
        L_0x02b8:
            int r3 = r3 + 1
            goto L_0x027d
        L_0x02bb:
            j0.i0[] r3 = r0.f2058q
            int r8 = r3.length
            int[] r9 = r5.f3376f
            if (r9 == 0) goto L_0x02c5
            int r9 = r9.length
            if (r9 >= r8) goto L_0x02cc
        L_0x02c5:
            j0.i0[] r9 = r10.f2058q
            int r9 = r9.length
            int[] r9 = new int[r9]
            r5.f3376f = r9
        L_0x02cc:
            r9 = 0
        L_0x02cd:
            if (r9 >= r8) goto L_0x02dc
            int[] r10 = r5.f3376f
            r12 = r3[r9]
            int r12 = r12.h(r11)
            r10[r9] = r12
            int r9 = r9 + 1
            goto L_0x02cd
        L_0x02dc:
            r16.p(r17)
            j0.r r3 = r0.f2063v
            r3.f3478a = r7
            androidx.emoji2.text.g r8 = r0.f2060s
            int r8 = r8.l()
            int r9 = r0.f2057p
            int r9 = r8 / r9
            r0.f2062u = r9
            androidx.emoji2.text.g r9 = r0.f2060s
            int r9 = r9.i()
            android.view.View.MeasureSpec.makeMeasureSpec(r8, r9)
            int r8 = r5.f3372a
            r0.b1(r8, r2)
            boolean r8 = r5.f3374c
            if (r8 == 0) goto L_0x0315
            r0.a1(r4)
            r0.F0(r1, r3, r2)
            r0.a1(r6)
            int r4 = r5.f3372a
            int r8 = r3.f3481d
            int r4 = r4 + r8
            r3.f3480c = r4
            r0.F0(r1, r3, r2)
            goto L_0x0328
        L_0x0315:
            r0.a1(r6)
            r0.F0(r1, r3, r2)
            r0.a1(r4)
            int r4 = r5.f3372a
            int r8 = r3.f3481d
            int r4 = r4 + r8
            r3.f3480c = r4
            r0.F0(r1, r3, r2)
        L_0x0328:
            androidx.emoji2.text.g r3 = r0.f2060s
            int r3 = r3.i()
            r4 = 1073741824(0x40000000, float:2.0)
            if (r3 != r4) goto L_0x0334
            goto L_0x03d5
        L_0x0334:
            int r3 = r16.v()
            r4 = 0
            r8 = 0
        L_0x033a:
            if (r8 >= r3) goto L_0x035c
            android.view.View r9 = r0.u(r8)
            androidx.emoji2.text.g r10 = r0.f2060s
            int r10 = r10.c(r9)
            float r10 = (float) r10
            int r12 = (r10 > r4 ? 1 : (r10 == r4 ? 0 : -1))
            if (r12 >= 0) goto L_0x034c
            goto L_0x0359
        L_0x034c:
            android.view.ViewGroup$LayoutParams r9 = r9.getLayoutParams()
            j0.f0 r9 = (j0.f0) r9
            r9.getClass()
            float r4 = java.lang.Math.max(r4, r10)
        L_0x0359:
            int r8 = r8 + 1
            goto L_0x033a
        L_0x035c:
            int r8 = r0.f2062u
            int r9 = r0.f2057p
            float r9 = (float) r9
            float r4 = r4 * r9
            int r4 = java.lang.Math.round(r4)
            androidx.emoji2.text.g r9 = r0.f2060s
            int r9 = r9.i()
            if (r9 != r11) goto L_0x0379
            androidx.emoji2.text.g r9 = r0.f2060s
            int r9 = r9.l()
            int r4 = java.lang.Math.min(r4, r9)
        L_0x0379:
            int r9 = r0.f2057p
            int r9 = r4 / r9
            r0.f2062u = r9
            androidx.emoji2.text.g r9 = r0.f2060s
            int r9 = r9.i()
            android.view.View.MeasureSpec.makeMeasureSpec(r4, r9)
            int r4 = r0.f2062u
            if (r4 != r8) goto L_0x038d
            goto L_0x03d5
        L_0x038d:
            r4 = 0
        L_0x038e:
            if (r4 >= r3) goto L_0x03d5
            android.view.View r9 = r0.u(r4)
            android.view.ViewGroup$LayoutParams r10 = r9.getLayoutParams()
            j0.f0 r10 = (j0.f0) r10
            r10.getClass()
            boolean r11 = r16.Q0()
            if (r11 == 0) goto L_0x03bb
            int r11 = r0.f2061t
            if (r11 != r6) goto L_0x03bb
            int r11 = r0.f2057p
            int r11 = r11 - r6
            j0.i0 r10 = r10.e
            int r10 = r10.e
            int r11 = r11 - r10
            int r10 = -r11
            int r11 = r0.f2062u
            int r11 = r11 * r10
            int r10 = r10 * r8
            int r11 = r11 - r10
            r9.offsetLeftAndRight(r11)
            goto L_0x03d2
        L_0x03bb:
            j0.i0 r10 = r10.e
            int r10 = r10.e
            int r11 = r0.f2062u
            int r11 = r11 * r10
            int r10 = r10 * r8
            int r12 = r0.f2061t
            if (r12 != r6) goto L_0x03ce
            int r11 = r11 - r10
            r9.offsetLeftAndRight(r11)
            goto L_0x03d2
        L_0x03ce:
            int r11 = r11 - r10
            r9.offsetTopAndBottom(r11)
        L_0x03d2:
            int r4 = r4 + 1
            goto L_0x038e
        L_0x03d5:
            int r3 = r16.v()
            if (r3 <= 0) goto L_0x03ec
            boolean r3 = r0.f2065x
            if (r3 == 0) goto L_0x03e6
            r0.I0(r1, r2, r6)
            r0.J0(r1, r2, r7)
            goto L_0x03ec
        L_0x03e6:
            r0.J0(r1, r2, r6)
            r0.I0(r1, r2, r7)
        L_0x03ec:
            if (r19 == 0) goto L_0x0412
            boolean r3 = r2.f3320g
            if (r3 != 0) goto L_0x0412
            int r3 = r0.f2049C
            if (r3 == 0) goto L_0x0412
            int r3 = r16.v()
            if (r3 <= 0) goto L_0x0412
            android.view.View r3 = r16.P0()
            if (r3 == 0) goto L_0x0412
            androidx.recyclerview.widget.RecyclerView r3 = r0.f3278b
            if (r3 == 0) goto L_0x040b
            N0.B r4 = r0.f2056K
            r3.removeCallbacks(r4)
        L_0x040b:
            boolean r3 = r16.B0()
            if (r3 == 0) goto L_0x0412
            goto L_0x0413
        L_0x0412:
            r6 = 0
        L_0x0413:
            boolean r3 = r2.f3320g
            if (r3 == 0) goto L_0x041a
            r5.a()
        L_0x041a:
            boolean r3 = r5.f3374c
            r0.f2050D = r3
            boolean r3 = r16.Q0()
            r0.f2051E = r3
            if (r6 == 0) goto L_0x042c
            r5.a()
            r0.S0(r1, r2, r7)
        L_0x042c:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.StaggeredGridLayoutManager.S0(j0.Q, j0.X, boolean):void");
    }

    public final boolean T0(int i) {
        boolean z2;
        boolean z3;
        boolean z4;
        if (this.f2061t == 0) {
            if (i == -1) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (z4 != this.f2065x) {
                return true;
            }
            return false;
        }
        if (i == -1) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (z2 == this.f2065x) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (z3 == Q0()) {
            return true;
        }
        return false;
    }

    public final void V0(Q q2, r rVar) {
        int i;
        int i2;
        if (rVar.f3478a && !rVar.i) {
            if (rVar.f3479b != 0) {
                int i3 = 1;
                if (rVar.e == -1) {
                    int i4 = rVar.f3482f;
                    int h2 = this.f2058q[0].h(i4);
                    while (i3 < this.f2057p) {
                        int h3 = this.f2058q[i3].h(i4);
                        if (h3 > h2) {
                            h2 = h3;
                        }
                        i3++;
                    }
                    int i5 = i4 - h2;
                    if (i5 < 0) {
                        i2 = rVar.f3483g;
                    } else {
                        i2 = rVar.f3483g - Math.min(i5, rVar.f3479b);
                    }
                    W0(q2, i2);
                    return;
                }
                int i6 = rVar.f3483g;
                int f2 = this.f2058q[0].f(i6);
                while (i3 < this.f2057p) {
                    int f3 = this.f2058q[i3].f(i6);
                    if (f3 < f2) {
                        f2 = f3;
                    }
                    i3++;
                }
                int i7 = f2 - rVar.f3483g;
                if (i7 < 0) {
                    i = rVar.f3482f;
                } else {
                    i = Math.min(i7, rVar.f3479b) + rVar.f3482f;
                }
                X0(q2, i);
            } else if (rVar.e == -1) {
                W0(q2, rVar.f3483g);
            } else {
                X0(q2, rVar.f3482f);
            }
        }
    }

    public final void X() {
        j jVar = this.f2048B;
        int[] iArr = (int[]) jVar.f108g;
        if (iArr != null) {
            Arrays.fill(iArr, -1);
        }
        jVar.f109h = null;
        l0();
    }

    public final void Y(int i, int i2) {
        O0(i, i2, 8);
    }

    public final void Y0() {
        if (this.f2061t == 1 || !Q0()) {
            this.f2065x = this.f2064w;
        } else {
            this.f2065x = !this.f2064w;
        }
    }

    public final void a1(int i) {
        boolean z2;
        r rVar = this.f2063v;
        rVar.e = i;
        boolean z3 = this.f2065x;
        int i2 = 1;
        if (i == -1) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (z3 != z2) {
            i2 = -1;
        }
        rVar.f3481d = i2;
    }

    /* JADX WARNING: Removed duplicated region for block: B:22:0x003e  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x0051  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void b1(int r5, j0.X r6) {
        /*
            r4 = this;
            j0.r r0 = r4.f2063v
            r1 = 0
            r0.f3479b = r1
            r0.f3480c = r5
            j0.v r2 = r4.e
            r3 = 1
            if (r2 == 0) goto L_0x0012
            boolean r2 = r2.e
            if (r2 == 0) goto L_0x0012
            r2 = 1
            goto L_0x0013
        L_0x0012:
            r2 = 0
        L_0x0013:
            if (r2 == 0) goto L_0x0034
            int r6 = r6.f3315a
            r2 = -1
            if (r6 == r2) goto L_0x0034
            boolean r2 = r4.f2065x
            if (r6 >= r5) goto L_0x0020
            r5 = 1
            goto L_0x0021
        L_0x0020:
            r5 = 0
        L_0x0021:
            if (r2 != r5) goto L_0x002b
            androidx.emoji2.text.g r5 = r4.f2059r
            int r5 = r5.l()
        L_0x0029:
            r6 = 0
            goto L_0x0036
        L_0x002b:
            androidx.emoji2.text.g r5 = r4.f2059r
            int r5 = r5.l()
            r6 = r5
            r5 = 0
            goto L_0x0036
        L_0x0034:
            r5 = 0
            goto L_0x0029
        L_0x0036:
            androidx.recyclerview.widget.RecyclerView r2 = r4.f3278b
            if (r2 == 0) goto L_0x0051
            boolean r2 = r2.f2019l
            if (r2 == 0) goto L_0x0051
            androidx.emoji2.text.g r2 = r4.f2059r
            int r2 = r2.k()
            int r2 = r2 - r6
            r0.f3482f = r2
            androidx.emoji2.text.g r6 = r4.f2059r
            int r6 = r6.g()
            int r6 = r6 + r5
            r0.f3483g = r6
            goto L_0x005d
        L_0x0051:
            androidx.emoji2.text.g r2 = r4.f2059r
            int r2 = r2.f()
            int r2 = r2 + r5
            r0.f3483g = r2
            int r5 = -r6
            r0.f3482f = r5
        L_0x005d:
            r0.f3484h = r1
            r0.f3478a = r3
            androidx.emoji2.text.g r5 = r4.f2059r
            int r5 = r5.i()
            if (r5 != 0) goto L_0x0072
            androidx.emoji2.text.g r5 = r4.f2059r
            int r5 = r5.f()
            if (r5 != 0) goto L_0x0072
            r1 = 1
        L_0x0072:
            r0.i = r1
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.StaggeredGridLayoutManager.b1(int, j0.X):void");
    }

    public final void c(String str) {
        if (this.f2052F == null) {
            super.c(str);
        }
    }

    public final void c1(i0 i0Var, int i, int i2) {
        int i3 = i0Var.f3411d;
        int i4 = i0Var.e;
        if (i == -1) {
            int i5 = i0Var.f3409b;
            if (i5 == Integer.MIN_VALUE) {
                View view = (View) i0Var.f3408a.get(0);
                i0Var.f3409b = i0Var.f3412f.f2059r.e(view);
                ((f0) view.getLayoutParams()).getClass();
                i5 = i0Var.f3409b;
            }
            if (i5 + i3 <= i2) {
                this.f2066y.set(i4, false);
                return;
            }
            return;
        }
        int i6 = i0Var.f3410c;
        if (i6 == Integer.MIN_VALUE) {
            i0Var.a();
            i6 = i0Var.f3410c;
        }
        if (i6 - i3 >= i2) {
            this.f2066y.set(i4, false);
        }
    }

    public final boolean d() {
        if (this.f2061t == 0) {
            return true;
        }
        return false;
    }

    public final void d0(Parcelable parcelable) {
        if (parcelable instanceof h0) {
            this.f2052F = (h0) parcelable;
            l0();
        }
    }

    public final boolean e() {
        if (this.f2061t == 1) {
            return true;
        }
        return false;
    }

    /* JADX WARNING: type inference failed for: r0v1, types: [android.os.Parcelable, java.lang.Object, j0.h0] */
    /* JADX WARNING: type inference failed for: r1v28, types: [android.os.Parcelable, java.lang.Object, j0.h0] */
    public final Parcelable e0() {
        int i;
        View view;
        int i2;
        int k2;
        int[] iArr;
        h0 h0Var = this.f2052F;
        if (h0Var != null) {
            ? obj = new Object();
            obj.f3398c = h0Var.f3398c;
            obj.f3396a = h0Var.f3396a;
            obj.f3397b = h0Var.f3397b;
            obj.f3399d = h0Var.f3399d;
            obj.e = h0Var.e;
            obj.f3400f = h0Var.f3400f;
            obj.f3402h = h0Var.f3402h;
            obj.i = h0Var.i;
            obj.f3403j = h0Var.f3403j;
            obj.f3401g = h0Var.f3401g;
            return obj;
        }
        ? obj2 = new Object();
        obj2.f3402h = this.f2064w;
        obj2.i = this.f2050D;
        obj2.f3403j = this.f2051E;
        j jVar = this.f2048B;
        if (jVar == null || (iArr = (int[]) jVar.f108g) == null) {
            obj2.e = 0;
        } else {
            obj2.f3400f = iArr;
            obj2.e = iArr.length;
            obj2.f3401g = (ArrayList) jVar.f109h;
        }
        int i3 = -1;
        if (v() > 0) {
            if (this.f2050D) {
                i = L0();
            } else {
                i = K0();
            }
            obj2.f3396a = i;
            if (this.f2065x) {
                view = G0(true);
            } else {
                view = H0(true);
            }
            if (view != null) {
                i3 = K.H(view);
            }
            obj2.f3397b = i3;
            int i4 = this.f2057p;
            obj2.f3398c = i4;
            obj2.f3399d = new int[i4];
            for (int i5 = 0; i5 < this.f2057p; i5++) {
                if (this.f2050D) {
                    i2 = this.f2058q[i5].f(Integer.MIN_VALUE);
                    if (i2 != Integer.MIN_VALUE) {
                        k2 = this.f2059r.g();
                    } else {
                        obj2.f3399d[i5] = i2;
                    }
                } else {
                    i2 = this.f2058q[i5].h(Integer.MIN_VALUE);
                    if (i2 != Integer.MIN_VALUE) {
                        k2 = this.f2059r.k();
                    } else {
                        obj2.f3399d[i5] = i2;
                    }
                }
                i2 -= k2;
                obj2.f3399d[i5] = i2;
            }
        } else {
            obj2.f3396a = -1;
            obj2.f3397b = -1;
            obj2.f3398c = 0;
        }
        return obj2;
    }

    public final boolean f(L l2) {
        return l2 instanceof f0;
    }

    public final void f0(int i) {
        if (i == 0) {
            B0();
        }
    }

    public final void h(int i, int i2, X x2, C0152n nVar) {
        r rVar;
        int f2;
        int i3;
        if (this.f2061t != 0) {
            i = i2;
        }
        if (v() != 0 && i != 0) {
            U0(i, x2);
            int[] iArr = this.f2055J;
            if (iArr == null || iArr.length < this.f2057p) {
                this.f2055J = new int[this.f2057p];
            }
            int i4 = 0;
            int i5 = 0;
            int i6 = 0;
            while (true) {
                int i7 = this.f2057p;
                rVar = this.f2063v;
                if (i5 >= i7) {
                    break;
                }
                if (rVar.f3481d == -1) {
                    f2 = rVar.f3482f;
                    i3 = this.f2058q[i5].h(f2);
                } else {
                    f2 = this.f2058q[i5].f(rVar.f3483g);
                    i3 = rVar.f3483g;
                }
                int i8 = f2 - i3;
                if (i8 >= 0) {
                    this.f2055J[i6] = i8;
                    i6++;
                }
                i5++;
            }
            Arrays.sort(this.f2055J, 0, i6);
            while (i4 < i6) {
                int i9 = rVar.f3480c;
                if (i9 >= 0 && i9 < x2.b()) {
                    nVar.a(rVar.f3480c, this.f2055J[i4]);
                    rVar.f3480c += rVar.f3481d;
                    i4++;
                } else {
                    return;
                }
            }
        }
    }

    public final void n0(int i) {
        h0 h0Var = this.f2052F;
        if (!(h0Var == null || h0Var.f3396a == i)) {
            h0Var.f3399d = null;
            h0Var.f3398c = 0;
            h0Var.f3396a = -1;
            h0Var.f3397b = -1;
        }
        this.f2067z = i;
        this.f2047A = Integer.MIN_VALUE;
        l0();
    }

    public final L r() {
        if (this.f2061t == 0) {
            return new L(-2, -1);
        }
        return new L(-1, -2);
    }

    public final void r0(Rect rect, int i, int i2) {
        int i3;
        int i4;
        int i5 = this.f2057p;
        int F2 = F() + E();
        int D2 = D() + G();
        if (this.f2061t == 1) {
            int height = rect.height() + D2;
            RecyclerView recyclerView = this.f3278b;
            WeakHashMap weakHashMap = N.Q.f509a;
            i4 = K.g(i2, height, recyclerView.getMinimumHeight());
            i3 = K.g(i, (this.f2062u * i5) + F2, this.f3278b.getMinimumWidth());
        } else {
            int width = rect.width() + F2;
            RecyclerView recyclerView2 = this.f3278b;
            WeakHashMap weakHashMap2 = N.Q.f509a;
            i3 = K.g(i, width, recyclerView2.getMinimumWidth());
            i4 = K.g(i2, (this.f2062u * i5) + D2, this.f3278b.getMinimumHeight());
        }
        this.f3278b.setMeasuredDimension(i3, i4);
    }

    public final L s(Context context, AttributeSet attributeSet) {
        return new L(context, attributeSet);
    }

    public final L t(ViewGroup.LayoutParams layoutParams) {
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            return new L((ViewGroup.MarginLayoutParams) layoutParams);
        }
        return new L(layoutParams);
    }

    public final int x(Q q2, X x2) {
        if (this.f2061t == 1) {
            return this.f2057p;
        }
        return super.x(q2, x2);
    }

    public final void x0(RecyclerView recyclerView, int i) {
        C0159v vVar = new C0159v(recyclerView.getContext());
        vVar.f3502a = i;
        y0(vVar);
    }

    public final boolean z0() {
        if (this.f2052F == null) {
            return true;
        }
        return false;
    }

    /* JADX WARNING: type inference failed for: r7v3, types: [java.lang.Object, j0.r] */
    public StaggeredGridLayoutManager(Context context, AttributeSet attributeSet, int i, int i2) {
        j jVar = new j(17, false);
        this.f2048B = jVar;
        this.f2049C = 2;
        this.f2053G = new Rect();
        this.f2054H = new e0(this);
        this.I = true;
        this.f2056K = new B(15, this);
        J I2 = K.I(context, attributeSet, i, i2);
        int i3 = I2.f3273a;
        if (i3 == 0 || i3 == 1) {
            c((String) null);
            if (i3 != this.f2061t) {
                this.f2061t = i3;
                g gVar = this.f2059r;
                this.f2059r = this.f2060s;
                this.f2060s = gVar;
                l0();
            }
            int i4 = I2.f3274b;
            c((String) null);
            if (i4 != this.f2057p) {
                int[] iArr = (int[]) jVar.f108g;
                if (iArr != null) {
                    Arrays.fill(iArr, -1);
                }
                jVar.f109h = null;
                l0();
                this.f2057p = i4;
                this.f2066y = new BitSet(this.f2057p);
                this.f2058q = new i0[this.f2057p];
                for (int i5 = 0; i5 < this.f2057p; i5++) {
                    this.f2058q[i5] = new i0(this, i5);
                }
                l0();
            }
            boolean z2 = I2.f3275c;
            c((String) null);
            h0 h0Var = this.f2052F;
            if (!(h0Var == null || h0Var.f3402h == z2)) {
                h0Var.f3402h = z2;
            }
            this.f2064w = z2;
            l0();
            ? obj = new Object();
            obj.f3478a = true;
            obj.f3482f = 0;
            obj.f3483g = 0;
            this.f2063v = obj;
            this.f2059r = g.a(this, this.f2061t);
            this.f2060s = g.a(this, 1 - this.f2061t);
            return;
        }
        throw new IllegalArgumentException("invalid orientation.");
    }

    public final int A0(int i) {
        boolean z2;
        if (v() != 0) {
            if (i < K0()) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (z2 != this.f2065x) {
                return -1;
            }
            return 1;
        } else if (this.f2065x) {
            return 1;
        } else {
            return -1;
        }
    }

    public final boolean B0() {
        int i;
        if (!(v() == 0 || this.f2049C == 0 || !this.f3282g)) {
            if (this.f2065x) {
                i = L0();
                K0();
            } else {
                i = K0();
                L0();
            }
            j jVar = this.f2048B;
            if (i == 0 && P0() != null) {
                int[] iArr = (int[]) jVar.f108g;
                if (iArr != null) {
                    Arrays.fill(iArr, -1);
                }
                jVar.f109h = null;
                this.f3281f = true;
                l0();
                return true;
            }
        }
        return false;
    }

    public final int C0(X x2) {
        if (v() == 0) {
            return 0;
        }
        g gVar = this.f2059r;
        boolean z2 = !this.I;
        return T0.g.i(x2, gVar, H0(z2), G0(z2), this, this.I);
    }

    public final int D0(X x2) {
        if (v() == 0) {
            return 0;
        }
        g gVar = this.f2059r;
        boolean z2 = !this.I;
        return T0.g.j(x2, gVar, H0(z2), G0(z2), this, this.I, this.f2065x);
    }

    public final int E0(X x2) {
        if (v() == 0) {
            return 0;
        }
        g gVar = this.f2059r;
        boolean z2 = !this.I;
        return T0.g.k(x2, gVar, H0(z2), G0(z2), this, this.I);
    }

    public final void J0(Q q2, X x2, boolean z2) {
        int k2;
        int N02 = N0(Integer.MAX_VALUE);
        if (N02 != Integer.MAX_VALUE && (k2 = N02 - this.f2059r.k()) > 0) {
            int Z02 = k2 - Z0(k2, q2, x2);
            if (z2 && Z02 > 0) {
                this.f2059r.p(-Z02);
            }
        }
    }

    public final int K0() {
        if (v() == 0) {
            return 0;
        }
        return K.H(u(0));
    }

    public final int L0() {
        int v2 = v();
        if (v2 == 0) {
            return 0;
        }
        return K.H(u(v2 - 1));
    }

    public final void O(int i) {
        super.O(i);
        for (int i2 = 0; i2 < this.f2057p; i2++) {
            i0 i0Var = this.f2058q[i2];
            int i3 = i0Var.f3409b;
            if (i3 != Integer.MIN_VALUE) {
                i0Var.f3409b = i3 + i;
            }
            int i4 = i0Var.f3410c;
            if (i4 != Integer.MIN_VALUE) {
                i0Var.f3410c = i4 + i;
            }
        }
    }

    public final void P(int i) {
        super.P(i);
        for (int i2 = 0; i2 < this.f2057p; i2++) {
            i0 i0Var = this.f2058q[i2];
            int i3 = i0Var.f3409b;
            if (i3 != Integer.MIN_VALUE) {
                i0Var.f3409b = i3 + i;
            }
            int i4 = i0Var.f3410c;
            if (i4 != Integer.MIN_VALUE) {
                i0Var.f3410c = i4 + i;
            }
        }
    }

    public final View P0() {
        char c2;
        boolean z2;
        boolean z3;
        int v2 = v();
        int i = v2 - 1;
        BitSet bitSet = new BitSet(this.f2057p);
        bitSet.set(0, this.f2057p, true);
        int i2 = -1;
        if (this.f2061t != 1 || !Q0()) {
            c2 = 65535;
        } else {
            c2 = 1;
        }
        if (this.f2065x) {
            v2 = -1;
        } else {
            i = 0;
        }
        if (i < v2) {
            i2 = 1;
        }
        while (i != v2) {
            View u2 = u(i);
            f0 f0Var = (f0) u2.getLayoutParams();
            if (bitSet.get(f0Var.e.e)) {
                i0 i0Var = f0Var.e;
                if (this.f2065x) {
                    int i3 = i0Var.f3410c;
                    if (i3 == Integer.MIN_VALUE) {
                        i0Var.a();
                        i3 = i0Var.f3410c;
                    }
                    if (i3 < this.f2059r.g()) {
                        ArrayList arrayList = i0Var.f3408a;
                        ((f0) ((View) arrayList.get(arrayList.size() - 1)).getLayoutParams()).getClass();
                    }
                    bitSet.clear(f0Var.e.e);
                } else {
                    int i4 = i0Var.f3409b;
                    if (i4 == Integer.MIN_VALUE) {
                        View view = (View) i0Var.f3408a.get(0);
                        i0Var.f3409b = i0Var.f3412f.f2059r.e(view);
                        ((f0) view.getLayoutParams()).getClass();
                        i4 = i0Var.f3409b;
                    }
                    if (i4 > this.f2059r.k()) {
                        ((f0) ((View) i0Var.f3408a.get(0)).getLayoutParams()).getClass();
                    }
                    bitSet.clear(f0Var.e.e);
                }
                return u2;
            }
            i += i2;
            if (i != v2) {
                View u3 = u(i);
                if (this.f2065x) {
                    int b2 = this.f2059r.b(u2);
                    int b3 = this.f2059r.b(u3);
                    if (b2 < b3) {
                        return u2;
                    }
                    if (b2 != b3) {
                        continue;
                    }
                } else {
                    int e = this.f2059r.e(u2);
                    int e2 = this.f2059r.e(u3);
                    if (e > e2) {
                        return u2;
                    }
                    if (e != e2) {
                        continue;
                    }
                }
                if (f0Var.e.e - ((f0) u3.getLayoutParams()).e.e < 0) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (c2 < 0) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                if (z2 != z3) {
                    return u2;
                }
            }
        }
        return null;
    }

    public final boolean Q0() {
        if (C() == 1) {
            return true;
        }
        return false;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:30:0x0050, code lost:
        if (r8.f2061t == 1) goto L_0x0064;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x0055, code lost:
        if (r8.f2061t == 0) goto L_0x0064;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x0062, code lost:
        if (Q0() == false) goto L_0x005c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x006f, code lost:
        if (Q0() == false) goto L_0x0064;
     */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x0074 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x0075  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final android.view.View S(android.view.View r9, int r10, j0.Q r11, j0.X r12) {
        /*
            r8 = this;
            int r0 = r8.v()
            r1 = 0
            if (r0 != 0) goto L_0x0008
            return r1
        L_0x0008:
            androidx.recyclerview.widget.RecyclerView r0 = r8.f3278b
            if (r0 != 0) goto L_0x000e
        L_0x000c:
            r9 = r1
            goto L_0x0022
        L_0x000e:
            android.view.View r9 = r0.A(r9)
            if (r9 != 0) goto L_0x0015
            goto L_0x000c
        L_0x0015:
            android.support.v4.media.session.t r0 = r8.f3277a
            java.lang.Object r0 = r0.f1133d
            java.util.ArrayList r0 = (java.util.ArrayList) r0
            boolean r0 = r0.contains(r9)
            if (r0 == 0) goto L_0x0022
            goto L_0x000c
        L_0x0022:
            if (r9 != 0) goto L_0x0025
            return r1
        L_0x0025:
            r8.Y0()
            r0 = 1
            r2 = -1
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r10 == r0) goto L_0x0066
            r4 = 2
            if (r10 == r4) goto L_0x0058
            r4 = 17
            if (r10 == r4) goto L_0x0053
            r4 = 33
            if (r10 == r4) goto L_0x004e
            r4 = 66
            if (r10 == r4) goto L_0x0049
            r4 = 130(0x82, float:1.82E-43)
            if (r10 == r4) goto L_0x0044
        L_0x0041:
            r10 = -2147483648(0xffffffff80000000, float:-0.0)
            goto L_0x0072
        L_0x0044:
            int r10 = r8.f2061t
            if (r10 != r0) goto L_0x0041
            goto L_0x005c
        L_0x0049:
            int r10 = r8.f2061t
            if (r10 != 0) goto L_0x0041
            goto L_0x005c
        L_0x004e:
            int r10 = r8.f2061t
            if (r10 != r0) goto L_0x0041
            goto L_0x0064
        L_0x0053:
            int r10 = r8.f2061t
            if (r10 != 0) goto L_0x0041
            goto L_0x0064
        L_0x0058:
            int r10 = r8.f2061t
            if (r10 != r0) goto L_0x005e
        L_0x005c:
            r10 = 1
            goto L_0x0072
        L_0x005e:
            boolean r10 = r8.Q0()
            if (r10 == 0) goto L_0x005c
        L_0x0064:
            r10 = -1
            goto L_0x0072
        L_0x0066:
            int r10 = r8.f2061t
            if (r10 != r0) goto L_0x006b
            goto L_0x0064
        L_0x006b:
            boolean r10 = r8.Q0()
            if (r10 == 0) goto L_0x0064
            goto L_0x005c
        L_0x0072:
            if (r10 != r3) goto L_0x0075
            return r1
        L_0x0075:
            android.view.ViewGroup$LayoutParams r3 = r9.getLayoutParams()
            j0.f0 r3 = (j0.f0) r3
            r3.getClass()
            j0.i0 r3 = r3.e
            if (r10 != r0) goto L_0x0087
            int r4 = r8.L0()
            goto L_0x008b
        L_0x0087:
            int r4 = r8.K0()
        L_0x008b:
            r8.b1(r4, r12)
            r8.a1(r10)
            j0.r r5 = r8.f2063v
            int r6 = r5.f3481d
            int r6 = r6 + r4
            r5.f3480c = r6
            androidx.emoji2.text.g r6 = r8.f2059r
            int r6 = r6.l()
            float r6 = (float) r6
            r7 = 1051372203(0x3eaaaaab, float:0.33333334)
            float r6 = r6 * r7
            int r6 = (int) r6
            r5.f3479b = r6
            r5.f3484h = r0
            r6 = 0
            r5.f3478a = r6
            r8.F0(r11, r5, r12)
            boolean r11 = r8.f2065x
            r8.f2050D = r11
            android.view.View r11 = r3.g(r4, r10)
            if (r11 == 0) goto L_0x00bc
            if (r11 == r9) goto L_0x00bc
            return r11
        L_0x00bc:
            boolean r11 = r8.T0(r10)
            if (r11 == 0) goto L_0x00d7
            int r11 = r8.f2057p
            int r11 = r11 - r0
        L_0x00c5:
            if (r11 < 0) goto L_0x00ec
            j0.i0[] r12 = r8.f2058q
            r12 = r12[r11]
            android.view.View r12 = r12.g(r4, r10)
            if (r12 == 0) goto L_0x00d4
            if (r12 == r9) goto L_0x00d4
            return r12
        L_0x00d4:
            int r11 = r11 + -1
            goto L_0x00c5
        L_0x00d7:
            r11 = 0
        L_0x00d8:
            int r12 = r8.f2057p
            if (r11 >= r12) goto L_0x00ec
            j0.i0[] r12 = r8.f2058q
            r12 = r12[r11]
            android.view.View r12 = r12.g(r4, r10)
            if (r12 == 0) goto L_0x00e9
            if (r12 == r9) goto L_0x00e9
            return r12
        L_0x00e9:
            int r11 = r11 + 1
            goto L_0x00d8
        L_0x00ec:
            boolean r11 = r8.f2064w
            r11 = r11 ^ r0
            if (r10 != r2) goto L_0x00f3
            r12 = 1
            goto L_0x00f4
        L_0x00f3:
            r12 = 0
        L_0x00f4:
            if (r11 != r12) goto L_0x00f8
            r11 = 1
            goto L_0x00f9
        L_0x00f8:
            r11 = 0
        L_0x00f9:
            if (r11 == 0) goto L_0x0100
            int r12 = r3.c()
            goto L_0x0104
        L_0x0100:
            int r12 = r3.d()
        L_0x0104:
            android.view.View r12 = r8.q(r12)
            if (r12 == 0) goto L_0x010d
            if (r12 == r9) goto L_0x010d
            return r12
        L_0x010d:
            boolean r10 = r8.T0(r10)
            if (r10 == 0) goto L_0x013c
            int r10 = r8.f2057p
            int r10 = r10 - r0
        L_0x0116:
            if (r10 < 0) goto L_0x015f
            int r12 = r3.e
            if (r10 != r12) goto L_0x011d
            goto L_0x0139
        L_0x011d:
            if (r11 == 0) goto L_0x0128
            j0.i0[] r12 = r8.f2058q
            r12 = r12[r10]
            int r12 = r12.c()
            goto L_0x0130
        L_0x0128:
            j0.i0[] r12 = r8.f2058q
            r12 = r12[r10]
            int r12 = r12.d()
        L_0x0130:
            android.view.View r12 = r8.q(r12)
            if (r12 == 0) goto L_0x0139
            if (r12 == r9) goto L_0x0139
            return r12
        L_0x0139:
            int r10 = r10 + -1
            goto L_0x0116
        L_0x013c:
            int r10 = r8.f2057p
            if (r6 >= r10) goto L_0x015f
            if (r11 == 0) goto L_0x014b
            j0.i0[] r10 = r8.f2058q
            r10 = r10[r6]
            int r10 = r10.c()
            goto L_0x0153
        L_0x014b:
            j0.i0[] r10 = r8.f2058q
            r10 = r10[r6]
            int r10 = r10.d()
        L_0x0153:
            android.view.View r10 = r8.q(r10)
            if (r10 == 0) goto L_0x015c
            if (r10 == r9) goto L_0x015c
            return r10
        L_0x015c:
            int r6 = r6 + 1
            goto L_0x013c
        L_0x015f:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.StaggeredGridLayoutManager.S(android.view.View, int, j0.Q, j0.X):android.view.View");
    }

    public final void T(AccessibilityEvent accessibilityEvent) {
        super.T(accessibilityEvent);
        if (v() > 0) {
            View H02 = H0(false);
            View G02 = G0(false);
            if (H02 != null && G02 != null) {
                int H2 = K.H(H02);
                int H3 = K.H(G02);
                if (H2 < H3) {
                    accessibilityEvent.setFromIndex(H2);
                    accessibilityEvent.setToIndex(H3);
                    return;
                }
                accessibilityEvent.setFromIndex(H3);
                accessibilityEvent.setToIndex(H2);
            }
        }
    }

    public final void V(Q q2, X x2, View view, k kVar) {
        int i;
        int i2;
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (!(layoutParams instanceof f0)) {
            U(view, kVar);
            return;
        }
        f0 f0Var = (f0) layoutParams;
        if (this.f2061t == 0) {
            i0 i0Var = f0Var.e;
            if (i0Var == null) {
                i2 = -1;
            } else {
                i2 = i0Var.e;
            }
            kVar.i(O.j.a(false, i2, 1, -1, -1));
            return;
        }
        i0 i0Var2 = f0Var.e;
        if (i0Var2 == null) {
            i = -1;
        } else {
            i = i0Var2.e;
        }
        kVar.i(O.j.a(false, -1, -1, i, 1));
    }

    public final void W0(Q q2, int i) {
        int v2 = v() - 1;
        while (v2 >= 0) {
            View u2 = u(v2);
            if (this.f2059r.e(u2) >= i && this.f2059r.o(u2) >= i) {
                f0 f0Var = (f0) u2.getLayoutParams();
                f0Var.getClass();
                if (f0Var.e.f3408a.size() != 1) {
                    i0 i0Var = f0Var.e;
                    ArrayList arrayList = i0Var.f3408a;
                    int size = arrayList.size();
                    View view = (View) arrayList.remove(size - 1);
                    f0 f0Var2 = (f0) view.getLayoutParams();
                    f0Var2.e = null;
                    if (f0Var2.f3290a.i() || f0Var2.f3290a.l()) {
                        i0Var.f3411d -= i0Var.f3412f.f2059r.c(view);
                    }
                    if (size == 1) {
                        i0Var.f3409b = Integer.MIN_VALUE;
                    }
                    i0Var.f3410c = Integer.MIN_VALUE;
                    i0(u2, q2);
                    v2--;
                } else {
                    return;
                }
            } else {
                return;
            }
        }
    }

    public final void X0(Q q2, int i) {
        while (v() > 0) {
            View u2 = u(0);
            if (this.f2059r.b(u2) <= i && this.f2059r.n(u2) <= i) {
                f0 f0Var = (f0) u2.getLayoutParams();
                f0Var.getClass();
                if (f0Var.e.f3408a.size() != 1) {
                    i0 i0Var = f0Var.e;
                    ArrayList arrayList = i0Var.f3408a;
                    View view = (View) arrayList.remove(0);
                    f0 f0Var2 = (f0) view.getLayoutParams();
                    f0Var2.e = null;
                    if (arrayList.size() == 0) {
                        i0Var.f3410c = Integer.MIN_VALUE;
                    }
                    if (f0Var2.f3290a.i() || f0Var2.f3290a.l()) {
                        i0Var.f3411d -= i0Var.f3412f.f2059r.c(view);
                    }
                    i0Var.f3409b = Integer.MIN_VALUE;
                    i0(u2, q2);
                } else {
                    return;
                }
            } else {
                return;
            }
        }
    }

    public final int Z0(int i, Q q2, X x2) {
        if (v() == 0 || i == 0) {
            return 0;
        }
        U0(i, x2);
        r rVar = this.f2063v;
        int F0 = F0(q2, rVar, x2);
        if (rVar.f3479b >= F0) {
            if (i < 0) {
                i = -F0;
            } else {
                i = F0;
            }
        }
        this.f2059r.p(-i);
        this.f2050D = this.f2065x;
        rVar.f3479b = 0;
        V0(q2, rVar);
        return i;
    }

    public final PointF a(int i) {
        int A0 = A0(i);
        PointF pointF = new PointF();
        if (A0 == 0) {
            return null;
        }
        if (this.f2061t == 0) {
            pointF.x = (float) A0;
            pointF.y = 0.0f;
        } else {
            pointF.x = 0.0f;
            pointF.y = (float) A0;
        }
        return pointF;
    }

    public final int j(X x2) {
        return C0(x2);
    }

    public final int k(X x2) {
        return D0(x2);
    }

    public final int l(X x2) {
        return E0(x2);
    }

    public final int m(X x2) {
        return C0(x2);
    }

    public final int m0(int i, Q q2, X x2) {
        return Z0(i, q2, x2);
    }

    public final int n(X x2) {
        return D0(x2);
    }

    public final int o(X x2) {
        return E0(x2);
    }

    public final int o0(int i, Q q2, X x2) {
        return Z0(i, q2, x2);
    }
}
