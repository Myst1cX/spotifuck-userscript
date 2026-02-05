package com.google.android.material.carousel;

import Q0.E;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.PointF;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import androidx.recyclerview.widget.RecyclerView;
import j0.C0162y;
import j0.K;
import j0.L;
import j0.Q;
import j0.W;
import j0.X;
import q0.C0322a;
import x0.a;
import x0.b;
import x0.c;
import x0.e;

public class CarouselLayoutManager extends K implements W {

    /* renamed from: p  reason: collision with root package name */
    public final e f2187p;

    /* renamed from: q  reason: collision with root package name */
    public c f2188q;

    /* renamed from: r  reason: collision with root package name */
    public final View.OnLayoutChangeListener f2189r;

    public CarouselLayoutManager() {
        e eVar = new e();
        new b();
        this.f2189r = new a(this);
        this.f2187p = eVar;
        l0();
        C0(0);
    }

    public final void C0(int i) {
        c cVar;
        if (i == 0 || i == 1) {
            c((String) null);
            c cVar2 = this.f2188q;
            if (cVar2 == null || i != cVar2.f4931a) {
                if (i == 0) {
                    cVar = new c(this, 1);
                } else if (i == 1) {
                    cVar = new c(this, 0);
                } else {
                    throw new IllegalArgumentException("invalid orientation");
                }
                this.f2188q = cVar;
                l0();
                return;
            }
            return;
        }
        throw new IllegalArgumentException(E.e("invalid orientation:", i));
    }

    public final boolean L() {
        return true;
    }

    public final PointF a(int i) {
        return null;
    }

    public final int k(X x2) {
        return 0;
    }

    public final boolean k0(RecyclerView recyclerView, View view, Rect rect, boolean z2, boolean z3) {
        return false;
    }

    public final int l(X x2) {
        return 0;
    }

    public final int n(X x2) {
        return 0;
    }

    public final void n0(int i) {
    }

    public final int o(X x2) {
        return 0;
    }

    public final boolean A0() {
        if (this.f2188q.f4931a == 0) {
            return true;
        }
        return false;
    }

    public final void Q(RecyclerView recyclerView) {
        e eVar = this.f2187p;
        Context context = recyclerView.getContext();
        float f2 = eVar.f4934a;
        if (f2 <= 0.0f) {
            f2 = context.getResources().getDimension(2131165426);
        }
        eVar.f4934a = f2;
        float f3 = eVar.f4935b;
        if (f3 <= 0.0f) {
            f3 = context.getResources().getDimension(2131165425);
        }
        eVar.f4935b = f3;
        l0();
        recyclerView.addOnLayoutChangeListener(this.f2189r);
    }

    public final void R(RecyclerView recyclerView) {
        recyclerView.removeOnLayoutChangeListener(this.f2189r);
    }

    public final L r() {
        return new L(-2, -2);
    }

    public final void x0(RecyclerView recyclerView, int i) {
        C0162y yVar = new C0162y(this, recyclerView.getContext(), 1);
        yVar.f3502a = i;
        y0(yVar);
    }

    public final boolean B0() {
        if (!A0() || C() != 1) {
            return false;
        }
        return true;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0028, code lost:
        if (r7 != 1) goto L_0x0025;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0031, code lost:
        if (B0() != false) goto L_0x0041;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0034, code lost:
        if (r7 == 1) goto L_0x0041;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x003d, code lost:
        if (B0() != false) goto L_0x003f;
     */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x0044 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x0045  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final android.view.View S(android.view.View r5, int r6, j0.Q r7, j0.X r8) {
        /*
            r4 = this;
            int r7 = r4.v()
            r8 = 0
            if (r7 != 0) goto L_0x0008
            return r8
        L_0x0008:
            x0.c r7 = r4.f2188q
            int r7 = r7.f4931a
            r0 = -2147483648(0xffffffff80000000, float:-0.0)
            r1 = -1
            r2 = 1
            if (r6 == r2) goto L_0x0041
            r3 = 2
            if (r6 == r3) goto L_0x003f
            r3 = 17
            if (r6 == r3) goto L_0x0037
            r3 = 33
            if (r6 == r3) goto L_0x0034
            r3 = 66
            if (r6 == r3) goto L_0x002b
            r3 = 130(0x82, float:1.82E-43)
            if (r6 == r3) goto L_0x0028
        L_0x0025:
            r6 = -2147483648(0xffffffff80000000, float:-0.0)
            goto L_0x0042
        L_0x0028:
            if (r7 != r2) goto L_0x0025
            goto L_0x003f
        L_0x002b:
            if (r7 != 0) goto L_0x0025
            boolean r6 = r4.B0()
            if (r6 == 0) goto L_0x003f
            goto L_0x0041
        L_0x0034:
            if (r7 != r2) goto L_0x0025
            goto L_0x0041
        L_0x0037:
            if (r7 != 0) goto L_0x0025
            boolean r6 = r4.B0()
            if (r6 == 0) goto L_0x0041
        L_0x003f:
            r6 = 1
            goto L_0x0042
        L_0x0041:
            r6 = -1
        L_0x0042:
            if (r6 != r0) goto L_0x0045
            return r8
        L_0x0045:
            r7 = 0
            if (r6 != r1) goto L_0x0079
            int r5 = j0.K.H(r5)
            if (r5 != 0) goto L_0x004f
            return r8
        L_0x004f:
            android.view.View r5 = r4.u(r7)
            int r5 = j0.K.H(r5)
            int r5 = r5 - r2
            if (r5 < 0) goto L_0x0068
            int r6 = r4.B()
            if (r5 < r6) goto L_0x0061
            goto L_0x0068
        L_0x0061:
            x0.c r5 = r4.f2188q
            r5.a()
            r5 = 0
            throw r5
        L_0x0068:
            boolean r5 = r4.B0()
            if (r5 == 0) goto L_0x0074
            int r5 = r4.v()
            int r7 = r5 + -1
        L_0x0074:
            android.view.View r5 = r4.u(r7)
            goto L_0x00b4
        L_0x0079:
            int r5 = j0.K.H(r5)
            int r6 = r4.B()
            int r6 = r6 - r2
            if (r5 != r6) goto L_0x0085
            return r8
        L_0x0085:
            int r5 = r4.v()
            int r5 = r5 - r2
            android.view.View r5 = r4.u(r5)
            int r5 = j0.K.H(r5)
            int r5 = r5 + r2
            if (r5 < 0) goto L_0x00a3
            int r6 = r4.B()
            if (r5 < r6) goto L_0x009c
            goto L_0x00a3
        L_0x009c:
            x0.c r5 = r4.f2188q
            r5.a()
            r5 = 0
            throw r5
        L_0x00a3:
            boolean r5 = r4.B0()
            if (r5 == 0) goto L_0x00aa
            goto L_0x00b0
        L_0x00aa:
            int r5 = r4.v()
            int r7 = r5 + -1
        L_0x00b0:
            android.view.View r5 = r4.u(r7)
        L_0x00b4:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.carousel.CarouselLayoutManager.S(android.view.View, int, j0.Q, j0.X):android.view.View");
    }

    public final void T(AccessibilityEvent accessibilityEvent) {
        super.T(accessibilityEvent);
        if (v() > 0) {
            accessibilityEvent.setFromIndex(K.H(u(0)));
            accessibilityEvent.setToIndex(K.H(u(v() - 1)));
        }
    }

    public final void W(int i, int i2) {
        B();
    }

    public final void Z(int i, int i2) {
        B();
    }

    public final void b0(Q q2, X x2) {
        int i;
        if (x2.b() > 0) {
            if (A0()) {
                i = this.f3288n;
            } else {
                i = this.f3289o;
            }
            if (((float) i) > 0.0f) {
                B0();
                View view = q2.i(0, Long.MAX_VALUE).f3338a;
                throw new IllegalStateException("All children of a RecyclerView using CarouselLayoutManager must use MaskableFrameLayout as their root ViewGroup.");
            }
        }
        g0(q2);
    }

    public final void c0(X x2) {
        if (v() != 0) {
            K.H(u(0));
        }
    }

    public final boolean d() {
        return A0();
    }

    public final boolean e() {
        return !A0();
    }

    public final int j(X x2) {
        v();
        return 0;
    }

    public final int m(X x2) {
        v();
        return 0;
    }

    public final int m0(int i, Q q2, X x2) {
        if (!A0() || v() == 0 || i == 0) {
            return 0;
        }
        View view = q2.i(0, Long.MAX_VALUE).f3338a;
        throw new IllegalStateException("All children of a RecyclerView using CarouselLayoutManager must use MaskableFrameLayout as their root ViewGroup.");
    }

    public final int o0(int i, Q q2, X x2) {
        if (!e() || v() == 0 || i == 0) {
            return 0;
        }
        View view = q2.i(0, Long.MAX_VALUE).f3338a;
        throw new IllegalStateException("All children of a RecyclerView using CarouselLayoutManager must use MaskableFrameLayout as their root ViewGroup.");
    }

    public final void y(View view, Rect rect) {
        super.y(view, rect);
        rect.centerY();
        if (A0()) {
            rect.centerX();
        }
        throw null;
    }

    @SuppressLint({"UnknownNullness"})
    public CarouselLayoutManager(Context context, AttributeSet attributeSet, int i, int i2) {
        new b();
        this.f2189r = new a(this);
        this.f2187p = new e();
        l0();
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C0322a.f4485b);
            obtainStyledAttributes.getInt(0, 0);
            l0();
            C0(obtainStyledAttributes.getInt(0, 0));
            obtainStyledAttributes.recycle();
        }
    }
}
