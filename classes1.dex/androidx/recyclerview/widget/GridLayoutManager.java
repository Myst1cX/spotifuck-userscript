package androidx.recyclerview.widget;

import E.j;
import O.k;
import Q0.E;
import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseIntArray;
import android.view.View;
import android.view.ViewGroup;
import g1.i;
import j0.C0152n;
import j0.C0155q;
import j0.C0156s;
import j0.C0157t;
import j0.K;
import j0.L;
import j0.Q;
import j0.X;
import java.util.Arrays;
import java.util.WeakHashMap;

public class GridLayoutManager extends LinearLayoutManager {

    /* renamed from: E  reason: collision with root package name */
    public boolean f1954E = false;

    /* renamed from: F  reason: collision with root package name */
    public int f1955F = -1;

    /* renamed from: G  reason: collision with root package name */
    public int[] f1956G;

    /* renamed from: H  reason: collision with root package name */
    public View[] f1957H;
    public final SparseIntArray I = new SparseIntArray();

    /* renamed from: J  reason: collision with root package name */
    public final SparseIntArray f1958J = new SparseIntArray();

    /* renamed from: K  reason: collision with root package name */
    public final j f1959K = new j(16);

    /* renamed from: L  reason: collision with root package name */
    public final Rect f1960L = new Rect();

    public GridLayoutManager(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        l1(K.I(context, attributeSet, i, i2).f3274b);
    }

    public final void B0(X x2, C0157t tVar, C0152n nVar) {
        int i = this.f1955F;
        for (int i2 = 0; i2 < this.f1955F && (r3 = tVar.f3492d) >= 0 && r3 < x2.b() && i > 0; i2++) {
            nVar.a(tVar.f3492d, Math.max(0, tVar.f3494g));
            this.f1959K.getClass();
            i--;
            tVar.f3492d += tVar.e;
        }
    }

    public final int J(Q q2, X x2) {
        if (this.f1965p == 0) {
            return this.f1955F;
        }
        if (x2.b() < 1) {
            return 0;
        }
        return h1(x2.b() - 1, q2, x2) + 1;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:58:0x00e1, code lost:
        if (r13 == r5) goto L_0x00c2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:69:0x0103, code lost:
        if (r13 == r5) goto L_0x0105;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0022, code lost:
        if (((java.util.ArrayList) r0.f3277a.f1133d).contains(r3) != false) goto L_0x000d;
     */
    /* JADX WARNING: Removed duplicated region for block: B:72:0x010b  */
    /* JADX WARNING: Removed duplicated region for block: B:73:0x011c  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final android.view.View S(android.view.View r23, int r24, j0.Q r25, j0.X r26) {
        /*
            r22 = this;
            r0 = r22
            r1 = r25
            r2 = r26
            androidx.recyclerview.widget.RecyclerView r3 = r0.f3278b
            r4 = 0
            if (r3 != 0) goto L_0x000f
            r5 = r23
        L_0x000d:
            r3 = r4
            goto L_0x0025
        L_0x000f:
            r5 = r23
            android.view.View r3 = r3.A(r5)
            if (r3 != 0) goto L_0x0018
        L_0x0017:
            goto L_0x000d
        L_0x0018:
            android.support.v4.media.session.t r6 = r0.f3277a
            java.lang.Object r6 = r6.f1133d
            java.util.ArrayList r6 = (java.util.ArrayList) r6
            boolean r6 = r6.contains(r3)
            if (r6 == 0) goto L_0x0025
            goto L_0x0017
        L_0x0025:
            if (r3 != 0) goto L_0x0028
            return r4
        L_0x0028:
            android.view.ViewGroup$LayoutParams r6 = r3.getLayoutParams()
            j0.q r6 = (j0.C0155q) r6
            int r7 = r6.e
            int r6 = r6.f3477f
            int r6 = r6 + r7
            android.view.View r5 = super.S(r23, r24, r25, r26)
            if (r5 != 0) goto L_0x003a
            return r4
        L_0x003a:
            r5 = r24
            int r5 = r0.F0(r5)
            r9 = 1
            if (r5 != r9) goto L_0x0045
            r5 = 1
            goto L_0x0046
        L_0x0045:
            r5 = 0
        L_0x0046:
            boolean r10 = r0.f1970u
            r11 = -1
            if (r5 == r10) goto L_0x0053
            int r5 = r22.v()
            int r5 = r5 - r9
            r10 = -1
            r12 = -1
            goto L_0x005a
        L_0x0053:
            int r5 = r22.v()
            r10 = r5
            r5 = 0
            r12 = 1
        L_0x005a:
            int r13 = r0.f1965p
            if (r13 != r9) goto L_0x0066
            boolean r13 = r22.S0()
            if (r13 == 0) goto L_0x0066
            r13 = 1
            goto L_0x0067
        L_0x0066:
            r13 = 0
        L_0x0067:
            int r14 = r0.h1(r5, r1, r2)
            r11 = r5
            r16 = r12
            r8 = -1
            r9 = 0
            r12 = 0
            r15 = -1
            r5 = r4
        L_0x0073:
            if (r11 == r10) goto L_0x0081
            r17 = r10
            int r10 = r0.h1(r11, r1, r2)
            android.view.View r1 = r0.u(r11)
            if (r1 != r3) goto L_0x0085
        L_0x0081:
            r21 = r5
            goto L_0x013d
        L_0x0085:
            boolean r18 = r1.hasFocusable()
            if (r18 == 0) goto L_0x0098
            if (r10 == r14) goto L_0x0098
            if (r4 == 0) goto L_0x0090
            goto L_0x0081
        L_0x0090:
            r18 = r3
            r21 = r5
        L_0x0094:
            r19 = r9
            goto L_0x012d
        L_0x0098:
            android.view.ViewGroup$LayoutParams r10 = r1.getLayoutParams()
            j0.q r10 = (j0.C0155q) r10
            int r2 = r10.e
            r18 = r3
            int r3 = r10.f3477f
            int r3 = r3 + r2
            boolean r19 = r1.hasFocusable()
            if (r19 == 0) goto L_0x00b0
            if (r2 != r7) goto L_0x00b0
            if (r3 != r6) goto L_0x00b0
            return r1
        L_0x00b0:
            boolean r19 = r1.hasFocusable()
            if (r19 == 0) goto L_0x00b8
            if (r4 == 0) goto L_0x00c0
        L_0x00b8:
            boolean r19 = r1.hasFocusable()
            if (r19 != 0) goto L_0x00c5
            if (r5 != 0) goto L_0x00c5
        L_0x00c0:
            r21 = r5
        L_0x00c2:
            r19 = r9
            goto L_0x0105
        L_0x00c5:
            int r19 = java.lang.Math.max(r2, r7)
            int r20 = java.lang.Math.min(r3, r6)
            r21 = r5
            int r5 = r20 - r19
            boolean r19 = r1.hasFocusable()
            if (r19 == 0) goto L_0x00e4
            if (r5 <= r9) goto L_0x00da
        L_0x00d9:
            goto L_0x00c2
        L_0x00da:
            if (r5 != r9) goto L_0x0094
            if (r2 <= r15) goto L_0x00e0
            r5 = 1
            goto L_0x00e1
        L_0x00e0:
            r5 = 0
        L_0x00e1:
            if (r13 != r5) goto L_0x0094
            goto L_0x00d9
        L_0x00e4:
            if (r4 != 0) goto L_0x0094
            r19 = r9
            E.j r9 = r0.f3279c
            boolean r9 = r9.B(r1)
            if (r9 == 0) goto L_0x00f9
            E.j r9 = r0.f3280d
            boolean r9 = r9.B(r1)
            if (r9 == 0) goto L_0x00f9
            goto L_0x012d
        L_0x00f9:
            if (r5 <= r12) goto L_0x00fc
            goto L_0x0105
        L_0x00fc:
            if (r5 != r12) goto L_0x012d
            if (r2 <= r8) goto L_0x0102
            r5 = 1
            goto L_0x0103
        L_0x0102:
            r5 = 0
        L_0x0103:
            if (r13 != r5) goto L_0x012d
        L_0x0105:
            boolean r5 = r1.hasFocusable()
            if (r5 == 0) goto L_0x011c
            int r4 = r10.e
            int r3 = java.lang.Math.min(r3, r6)
            int r2 = java.lang.Math.max(r2, r7)
            int r9 = r3 - r2
            r15 = r4
            r5 = r21
            r4 = r1
            goto L_0x0131
        L_0x011c:
            int r5 = r10.e
            int r3 = java.lang.Math.min(r3, r6)
            int r2 = java.lang.Math.max(r2, r7)
            int r12 = r3 - r2
            r8 = r5
            r9 = r19
            r5 = r1
            goto L_0x0131
        L_0x012d:
            r9 = r19
            r5 = r21
        L_0x0131:
            int r11 = r11 + r16
            r1 = r25
            r2 = r26
            r10 = r17
            r3 = r18
            goto L_0x0073
        L_0x013d:
            if (r4 == 0) goto L_0x0140
            goto L_0x0142
        L_0x0140:
            r4 = r21
        L_0x0142:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.GridLayoutManager.S(android.view.View, int, j0.Q, j0.X):android.view.View");
    }

    public final void T0(Q q2, X x2, C0157t tVar, i iVar) {
        boolean z2;
        int i;
        boolean z3;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        boolean z4;
        View b2;
        Q q3 = q2;
        X x3 = x2;
        C0157t tVar2 = tVar;
        i iVar2 = iVar;
        int j2 = this.f1967r.j();
        if (j2 != 1073741824) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (v() > 0) {
            i = this.f1956G[this.f1955F];
        } else {
            i = 0;
        }
        if (z2) {
            m1();
        }
        if (tVar2.e == 1) {
            z3 = true;
        } else {
            z3 = false;
        }
        int i11 = this.f1955F;
        if (!z3) {
            i11 = i1(tVar2.f3492d, q3, x3) + j1(tVar2.f3492d, q3, x3);
        }
        int i12 = 0;
        while (i12 < this.f1955F && (r14 = tVar2.f3492d) >= 0 && r14 < x2.b() && i11 > 0) {
            int i13 = tVar2.f3492d;
            int j12 = j1(i13, q3, x3);
            if (j12 <= this.f1955F) {
                i11 -= j12;
                if (i11 < 0 || (b2 = tVar2.b(q3)) == null) {
                    break;
                }
                this.f1957H[i12] = b2;
                i12++;
            } else {
                throw new IllegalArgumentException("Item at position " + i13 + " requires " + j12 + " spans but GridLayoutManager has only " + this.f1955F + " spans.");
            }
        }
        if (i12 == 0) {
            iVar2.f2704b = true;
            return;
        }
        if (z3) {
            i3 = i12;
            i4 = 0;
            i2 = 1;
        } else {
            i4 = i12 - 1;
            i3 = -1;
            i2 = -1;
        }
        int i14 = 0;
        while (i4 != i3) {
            View view = this.f1957H[i4];
            C0155q qVar = (C0155q) view.getLayoutParams();
            int j13 = j1(K.H(view), q3, x3);
            qVar.f3477f = j13;
            qVar.e = i14;
            i14 += j13;
            i4 += i2;
        }
        float f2 = 0.0f;
        int i15 = 0;
        for (int i16 = 0; i16 < i12; i16++) {
            View view2 = this.f1957H[i16];
            if (tVar2.f3497k != null) {
                z4 = false;
                if (z3) {
                    b(view2, -1, true);
                } else {
                    b(view2, 0, true);
                }
            } else if (z3) {
                z4 = false;
                b(view2, -1, false);
            } else {
                z4 = false;
                b(view2, 0, false);
            }
            RecyclerView recyclerView = this.f3278b;
            Rect rect = this.f1960L;
            if (recyclerView == null) {
                rect.set(z4 ? 1 : 0, z4, z4, z4);
            } else {
                rect.set(recyclerView.J(view2));
            }
            k1(view2, j2, z4);
            int c2 = this.f1967r.c(view2);
            if (c2 > i15) {
                i15 = c2;
            }
            float d2 = (((float) this.f1967r.d(view2)) * 1.0f) / ((float) ((C0155q) view2.getLayoutParams()).f3477f);
            if (d2 > f2) {
                f2 = d2;
            }
        }
        if (z2) {
            e1(Math.max(Math.round(f2 * ((float) this.f1955F)), i));
            i15 = 0;
            for (int i17 = 0; i17 < i12; i17++) {
                View view3 = this.f1957H[i17];
                k1(view3, 1073741824, true);
                int c3 = this.f1967r.c(view3);
                if (c3 > i15) {
                    i15 = c3;
                }
            }
        }
        for (int i18 = 0; i18 < i12; i18++) {
            View view4 = this.f1957H[i18];
            if (this.f1967r.c(view4) != i15) {
                C0155q qVar2 = (C0155q) view4.getLayoutParams();
                Rect rect2 = qVar2.f3291b;
                int i19 = rect2.top + rect2.bottom + qVar2.topMargin + qVar2.bottomMargin;
                int i20 = rect2.left + rect2.right + qVar2.leftMargin + qVar2.rightMargin;
                int g12 = g1(qVar2.e, qVar2.f3477f);
                if (this.f1965p == 1) {
                    i10 = K.w(false, g12, 1073741824, i20, qVar2.width);
                    i9 = View.MeasureSpec.makeMeasureSpec(i15 - i19, 1073741824);
                } else {
                    int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i15 - i20, 1073741824);
                    i9 = K.w(false, g12, 1073741824, i19, qVar2.height);
                    i10 = makeMeasureSpec;
                }
                if (w0(view4, i10, i9, (L) view4.getLayoutParams())) {
                    view4.measure(i10, i9);
                }
            }
        }
        iVar2.f2703a = i15;
        if (this.f1965p != 1) {
            if (tVar2.f3493f == -1) {
                int i21 = tVar2.f3490b;
                i7 = i21 - i15;
                i6 = i21;
            } else {
                int i22 = tVar2.f3490b;
                i6 = i22 + i15;
                i7 = i22;
            }
            i8 = 0;
            i5 = 0;
        } else if (tVar2.f3493f == -1) {
            int i23 = tVar2.f3490b;
            i7 = 0;
            i6 = 0;
            int i24 = i23;
            i5 = i23 - i15;
            i8 = i24;
        } else {
            i5 = tVar2.f3490b;
            i8 = i5 + i15;
            i7 = 0;
            i6 = 0;
        }
        for (int i25 = 0; i25 < i12; i25++) {
            View view5 = this.f1957H[i25];
            C0155q qVar3 = (C0155q) view5.getLayoutParams();
            if (this.f1965p != 1) {
                int G2 = G() + this.f1956G[qVar3.e];
                i5 = G2;
                i8 = this.f1967r.d(view5) + G2;
            } else if (S0()) {
                int E2 = E() + this.f1956G[this.f1955F - qVar3.e];
                i6 = E2;
                i7 = E2 - this.f1967r.d(view5);
            } else {
                i7 = E() + this.f1956G[qVar3.e];
                i6 = this.f1967r.d(view5) + i7;
            }
            K.N(view5, i7, i5, i6, i8);
            if (qVar3.f3290a.i() || qVar3.f3290a.l()) {
                iVar2.f2705c = true;
            }
            iVar2.f2706d = view5.hasFocusable() | iVar2.f2706d;
        }
        Arrays.fill(this.f1957H, (Object) null);
    }

    public final void W(int i, int i2) {
        j jVar = this.f1959K;
        jVar.z();
        ((SparseIntArray) jVar.f109h).clear();
    }

    public final void X() {
        j jVar = this.f1959K;
        jVar.z();
        ((SparseIntArray) jVar.f109h).clear();
    }

    public final void Y(int i, int i2) {
        j jVar = this.f1959K;
        jVar.z();
        ((SparseIntArray) jVar.f109h).clear();
    }

    public final void Z(int i, int i2) {
        j jVar = this.f1959K;
        jVar.z();
        ((SparseIntArray) jVar.f109h).clear();
    }

    public final void a0(int i, int i2) {
        j jVar = this.f1959K;
        jVar.z();
        ((SparseIntArray) jVar.f109h).clear();
    }

    public final void a1(boolean z2) {
        if (!z2) {
            super.a1(false);
            return;
        }
        throw new UnsupportedOperationException("GridLayoutManager does not support stack from end. Consider using reverse layout");
    }

    public final void b0(Q q2, X x2) {
        boolean z2 = x2.f3320g;
        SparseIntArray sparseIntArray = this.f1958J;
        SparseIntArray sparseIntArray2 = this.I;
        if (z2) {
            int v2 = v();
            for (int i = 0; i < v2; i++) {
                C0155q qVar = (C0155q) u(i).getLayoutParams();
                int b2 = qVar.f3290a.b();
                sparseIntArray2.put(b2, qVar.f3477f);
                sparseIntArray.put(b2, qVar.e);
            }
        }
        super.b0(q2, x2);
        sparseIntArray2.clear();
        sparseIntArray.clear();
    }

    public final void e1(int i) {
        int i2;
        int[] iArr = this.f1956G;
        int i3 = this.f1955F;
        if (!(iArr != null && iArr.length == i3 + 1 && iArr[iArr.length - 1] == i)) {
            iArr = new int[(i3 + 1)];
        }
        int i4 = 0;
        iArr[0] = 0;
        int i5 = i / i3;
        int i6 = i % i3;
        int i7 = 0;
        for (int i8 = 1; i8 <= i3; i8++) {
            i4 += i6;
            if (i4 <= 0 || i3 - i4 >= i6) {
                i2 = i5;
            } else {
                i2 = i5 + 1;
                i4 -= i3;
            }
            i7 += i2;
            iArr[i8] = i7;
        }
        this.f1956G = iArr;
    }

    public final boolean f(L l2) {
        return l2 instanceof C0155q;
    }

    public final void f1() {
        View[] viewArr = this.f1957H;
        if (viewArr == null || viewArr.length != this.f1955F) {
            this.f1957H = new View[this.f1955F];
        }
    }

    public final int g1(int i, int i2) {
        if (this.f1965p != 1 || !S0()) {
            int[] iArr = this.f1956G;
            return iArr[i2 + i] - iArr[i];
        }
        int[] iArr2 = this.f1956G;
        int i3 = this.f1955F;
        return iArr2[i3 - i] - iArr2[(i3 - i) - i2];
    }

    public final int h1(int i, Q q2, X x2) {
        boolean z2 = x2.f3320g;
        j jVar = this.f1959K;
        if (!z2) {
            int i2 = this.f1955F;
            jVar.getClass();
            return j.y(i, i2);
        }
        int b2 = q2.b(i);
        if (b2 == -1) {
            Log.w("GridLayoutManager", "Cannot find span size for pre layout position. " + i);
            return 0;
        }
        int i3 = this.f1955F;
        jVar.getClass();
        return j.y(b2, i3);
    }

    public final int i1(int i, Q q2, X x2) {
        boolean z2 = x2.f3320g;
        j jVar = this.f1959K;
        if (!z2) {
            int i2 = this.f1955F;
            jVar.getClass();
            return i % i2;
        }
        int i3 = this.f1958J.get(i, -1);
        if (i3 != -1) {
            return i3;
        }
        int b2 = q2.b(i);
        if (b2 == -1) {
            Log.w("GridLayoutManager", "Cannot find span size for pre layout position. It is not cached, not in the adapter. Pos:" + i);
            return 0;
        }
        int i4 = this.f1955F;
        jVar.getClass();
        return b2 % i4;
    }

    public final int j1(int i, Q q2, X x2) {
        boolean z2 = x2.f3320g;
        j jVar = this.f1959K;
        if (!z2) {
            jVar.getClass();
            return 1;
        }
        int i2 = this.I.get(i, -1);
        if (i2 != -1) {
            return i2;
        }
        if (q2.b(i) == -1) {
            Log.w("GridLayoutManager", "Cannot find span size for pre layout position. It is not cached, not in the adapter. Pos:" + i);
            return 1;
        }
        jVar.getClass();
        return 1;
    }

    public final void l1(int i) {
        if (i != this.f1955F) {
            this.f1954E = true;
            if (i >= 1) {
                this.f1955F = i;
                this.f1959K.z();
                l0();
                return;
            }
            throw new IllegalArgumentException(E.e("Span count should be at least 1. Provided ", i));
        }
    }

    public final void m1() {
        int D2;
        int G2;
        if (this.f1965p == 1) {
            D2 = this.f3288n - F();
            G2 = E();
        } else {
            D2 = this.f3289o - D();
            G2 = G();
        }
        e1(D2 - G2);
    }

    public final L r() {
        if (this.f1965p == 0) {
            return new C0155q(-2, -1);
        }
        return new C0155q(-1, -2);
    }

    public final void r0(Rect rect, int i, int i2) {
        int i3;
        int i4;
        if (this.f1956G == null) {
            super.r0(rect, i, i2);
        }
        int F2 = F() + E();
        int D2 = D() + G();
        if (this.f1965p == 1) {
            int height = rect.height() + D2;
            RecyclerView recyclerView = this.f3278b;
            WeakHashMap weakHashMap = N.Q.f509a;
            i4 = K.g(i2, height, recyclerView.getMinimumHeight());
            int[] iArr = this.f1956G;
            i3 = K.g(i, iArr[iArr.length - 1] + F2, this.f3278b.getMinimumWidth());
        } else {
            int width = rect.width() + F2;
            RecyclerView recyclerView2 = this.f3278b;
            WeakHashMap weakHashMap2 = N.Q.f509a;
            i3 = K.g(i, width, recyclerView2.getMinimumWidth());
            int[] iArr2 = this.f1956G;
            i4 = K.g(i2, iArr2[iArr2.length - 1] + D2, this.f3278b.getMinimumHeight());
        }
        this.f3278b.setMeasuredDimension(i3, i4);
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [j0.L, j0.q] */
    public final L s(Context context, AttributeSet attributeSet) {
        ? l2 = new L(context, attributeSet);
        l2.e = -1;
        l2.f3477f = 0;
        return l2;
    }

    /* JADX WARNING: type inference failed for: r0v1, types: [j0.L, j0.q] */
    /* JADX WARNING: type inference failed for: r0v2, types: [j0.L, j0.q] */
    public final L t(ViewGroup.LayoutParams layoutParams) {
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            ? l2 = new L((ViewGroup.MarginLayoutParams) layoutParams);
            l2.e = -1;
            l2.f3477f = 0;
            return l2;
        }
        ? l3 = new L(layoutParams);
        l3.e = -1;
        l3.f3477f = 0;
        return l3;
    }

    public final int x(Q q2, X x2) {
        if (this.f1965p == 1) {
            return this.f1955F;
        }
        if (x2.b() < 1) {
            return 0;
        }
        return h1(x2.b() - 1, q2, x2) + 1;
    }

    public final boolean z0() {
        if (this.f1975z != null || this.f1954E) {
            return false;
        }
        return true;
    }

    public final View N0(Q q2, X x2, int i, int i2, int i3) {
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
            if (H2 >= 0 && H2 < i3 && i1(H2, q2, x2) == 0) {
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

    public final void U0(Q q2, X x2, C0156s sVar, int i) {
        boolean z2;
        m1();
        if (x2.b() > 0 && !x2.f3320g) {
            if (i == 1) {
                z2 = true;
            } else {
                z2 = false;
            }
            int i12 = i1(sVar.f3486b, q2, x2);
            if (z2) {
                while (i12 > 0) {
                    int i2 = sVar.f3486b;
                    if (i2 <= 0) {
                        break;
                    }
                    int i3 = i2 - 1;
                    sVar.f3486b = i3;
                    i12 = i1(i3, q2, x2);
                }
            } else {
                int b2 = x2.b() - 1;
                int i4 = sVar.f3486b;
                while (i4 < b2) {
                    int i5 = i4 + 1;
                    int i13 = i1(i5, q2, x2);
                    if (i13 <= i12) {
                        break;
                    }
                    i4 = i5;
                    i12 = i13;
                }
                sVar.f3486b = i4;
            }
        }
        f1();
    }

    public final void V(Q q2, X x2, View view, k kVar) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (!(layoutParams instanceof C0155q)) {
            U(view, kVar);
            return;
        }
        C0155q qVar = (C0155q) layoutParams;
        int h12 = h1(qVar.f3290a.b(), q2, x2);
        if (this.f1965p == 0) {
            kVar.i(O.j.a(false, qVar.e, qVar.f3477f, h12, 1));
        } else {
            kVar.i(O.j.a(false, h12, 1, qVar.e, qVar.f3477f));
        }
    }

    public final void c0(X x2) {
        super.c0(x2);
        this.f1954E = false;
    }

    public final int k(X x2) {
        return D0(x2);
    }

    public final void k1(View view, int i, boolean z2) {
        int i2;
        int i3;
        boolean z3;
        C0155q qVar = (C0155q) view.getLayoutParams();
        Rect rect = qVar.f3291b;
        int i4 = rect.top + rect.bottom + qVar.topMargin + qVar.bottomMargin;
        int i5 = rect.left + rect.right + qVar.leftMargin + qVar.rightMargin;
        int g12 = g1(qVar.e, qVar.f3477f);
        if (this.f1965p == 1) {
            i2 = K.w(false, g12, i, i5, qVar.width);
            i3 = K.w(true, this.f1967r.l(), this.f3287m, i4, qVar.height);
        } else {
            int w2 = K.w(false, g12, i, i4, qVar.height);
            int w3 = K.w(true, this.f1967r.l(), this.f3286l, i5, qVar.width);
            i3 = w2;
            i2 = w3;
        }
        L l2 = (L) view.getLayoutParams();
        if (z2) {
            z3 = w0(view, i2, i3, l2);
        } else {
            z3 = u0(view, i2, i3, l2);
        }
        if (z3) {
            view.measure(i2, i3);
        }
    }

    public final int l(X x2) {
        return E0(x2);
    }

    public final int m0(int i, Q q2, X x2) {
        m1();
        f1();
        return super.m0(i, q2, x2);
    }

    public final int n(X x2) {
        return D0(x2);
    }

    public final int o(X x2) {
        return E0(x2);
    }

    public final int o0(int i, Q q2, X x2) {
        m1();
        f1();
        return super.o0(i, q2, x2);
    }

    public GridLayoutManager(int i) {
        super(1);
        l1(i);
    }
}
