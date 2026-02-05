package j0;

import E.j;
import N.Q;
import O.k;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import android.os.Parcelable;
import android.support.v4.media.session.t;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import androidx.recyclerview.widget.RecyclerView;
import i0.C0130a;
import java.util.ArrayList;
import java.util.WeakHashMap;

public abstract class K {

    /* renamed from: a  reason: collision with root package name */
    public t f3277a;

    /* renamed from: b  reason: collision with root package name */
    public RecyclerView f3278b;

    /* renamed from: c  reason: collision with root package name */
    public final j f3279c;

    /* renamed from: d  reason: collision with root package name */
    public final j f3280d;
    public C0159v e;

    /* renamed from: f  reason: collision with root package name */
    public boolean f3281f = false;

    /* renamed from: g  reason: collision with root package name */
    public boolean f3282g = false;

    /* renamed from: h  reason: collision with root package name */
    public final boolean f3283h = true;
    public final boolean i = true;

    /* renamed from: j  reason: collision with root package name */
    public int f3284j;

    /* renamed from: k  reason: collision with root package name */
    public boolean f3285k;

    /* renamed from: l  reason: collision with root package name */
    public int f3286l;

    /* renamed from: m  reason: collision with root package name */
    public int f3287m;

    /* renamed from: n  reason: collision with root package name */
    public int f3288n;

    /* renamed from: o  reason: collision with root package name */
    public int f3289o;

    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0019, code lost:
        if (r6 == 1073741824) goto L_0x0023;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static int w(boolean r4, int r5, int r6, int r7, int r8) {
        /*
            int r5 = r5 - r7
            r7 = 0
            int r5 = java.lang.Math.max(r7, r5)
            r0 = -2
            r1 = -1
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = 1073741824(0x40000000, float:2.0)
            if (r4 == 0) goto L_0x001e
            if (r8 < 0) goto L_0x0013
        L_0x0010:
            r6 = 1073741824(0x40000000, float:2.0)
            goto L_0x0032
        L_0x0013:
            if (r8 != r1) goto L_0x001b
            if (r6 == r2) goto L_0x0023
            if (r6 == 0) goto L_0x001b
            if (r6 == r3) goto L_0x0023
        L_0x001b:
            r6 = 0
            r8 = 0
            goto L_0x0032
        L_0x001e:
            if (r8 < 0) goto L_0x0021
            goto L_0x0010
        L_0x0021:
            if (r8 != r1) goto L_0x0025
        L_0x0023:
            r8 = r5
            goto L_0x0032
        L_0x0025:
            if (r8 != r0) goto L_0x001b
            if (r6 == r2) goto L_0x002f
            if (r6 != r3) goto L_0x002c
            goto L_0x002f
        L_0x002c:
            r8 = r5
            r6 = 0
            goto L_0x0032
        L_0x002f:
            r8 = r5
            r6 = -2147483648(0xffffffff80000000, float:-0.0)
        L_0x0032:
            int r4 = android.view.View.MeasureSpec.makeMeasureSpec(r8, r6)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: j0.K.w(boolean, int, int, int, int):int");
    }

    public abstract boolean L();

    public abstract void R(RecyclerView recyclerView);

    public abstract View S(View view, int i2, Q q2, X x2);

    public abstract void b0(Q q2, X x2);

    public abstract void c0(X x2);

    public abstract boolean d();

    public abstract boolean e();

    public Parcelable e0() {
        return null;
    }

    public abstract int j(X x2);

    public abstract int k(X x2);

    public abstract int l(X x2);

    public abstract int m(X x2);

    public abstract int m0(int i2, Q q2, X x2);

    public abstract int n(X x2);

    public abstract void n0(int i2);

    public abstract int o(X x2);

    public abstract int o0(int i2, Q q2, X x2);

    public abstract L r();

    public boolean v0() {
        return false;
    }

    public abstract void x0(RecyclerView recyclerView, int i2);

    public boolean z0() {
        return false;
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [j0.J, java.lang.Object] */
    public static J I(Context context, AttributeSet attributeSet, int i2, int i3) {
        ? obj = new Object();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C0130a.f3092a, i2, i3);
        obj.f3273a = obtainStyledAttributes.getInt(0, 1);
        obj.f3274b = obtainStyledAttributes.getInt(10, 1);
        obj.f3275c = obtainStyledAttributes.getBoolean(9, false);
        obj.f3276d = obtainStyledAttributes.getBoolean(11, false);
        obtainStyledAttributes.recycle();
        return obj;
    }

    public final int B() {
        C c2;
        RecyclerView recyclerView = this.f3278b;
        if (recyclerView != null) {
            c2 = recyclerView.getAdapter();
        } else {
            c2 = null;
        }
        if (c2 != null) {
            return c2.a();
        }
        return 0;
    }

    public final int C() {
        RecyclerView recyclerView = this.f3278b;
        WeakHashMap weakHashMap = Q.f509a;
        return recyclerView.getLayoutDirection();
    }

    public final int D() {
        RecyclerView recyclerView = this.f3278b;
        if (recyclerView != null) {
            return recyclerView.getPaddingBottom();
        }
        return 0;
    }

    public final int E() {
        RecyclerView recyclerView = this.f3278b;
        if (recyclerView != null) {
            return recyclerView.getPaddingLeft();
        }
        return 0;
    }

    public final int F() {
        RecyclerView recyclerView = this.f3278b;
        if (recyclerView != null) {
            return recyclerView.getPaddingRight();
        }
        return 0;
    }

    public final int G() {
        RecyclerView recyclerView = this.f3278b;
        if (recyclerView != null) {
            return recyclerView.getPaddingTop();
        }
        return 0;
    }

    public int J(Q q2, X x2) {
        RecyclerView recyclerView = this.f3278b;
        if (recyclerView == null || recyclerView.f2028q == null || !e()) {
            return 1;
        }
        return this.f3278b.f2028q.a();
    }

    public void O(int i2) {
        RecyclerView recyclerView = this.f3278b;
        if (recyclerView != null) {
            int m2 = recyclerView.f2015j.m();
            for (int i3 = 0; i3 < m2; i3++) {
                recyclerView.f2015j.l(i3).offsetLeftAndRight(i2);
            }
        }
    }

    public void P(int i2) {
        RecyclerView recyclerView = this.f3278b;
        if (recyclerView != null) {
            int m2 = recyclerView.f2015j.m();
            for (int i3 = 0; i3 < m2; i3++) {
                recyclerView.f2015j.l(i3).offsetTopAndBottom(i2);
            }
        }
    }

    public void Q(RecyclerView recyclerView) {
    }

    public void T(AccessibilityEvent accessibilityEvent) {
        RecyclerView recyclerView = this.f3278b;
        Q q2 = recyclerView.f2010g;
        if (accessibilityEvent != null) {
            boolean z2 = true;
            if (!recyclerView.canScrollVertically(1) && !this.f3278b.canScrollVertically(-1) && !this.f3278b.canScrollHorizontally(-1) && !this.f3278b.canScrollHorizontally(1)) {
                z2 = false;
            }
            accessibilityEvent.setScrollable(z2);
            C c2 = this.f3278b.f2028q;
            if (c2 != null) {
                accessibilityEvent.setItemCount(c2.a());
            }
        }
    }

    public void W(int i2, int i3) {
    }

    public void X() {
    }

    public void Y(int i2, int i3) {
    }

    public void Z(int i2, int i3) {
    }

    public void a0(int i2, int i3) {
    }

    public void c(String str) {
        RecyclerView recyclerView = this.f3278b;
        if (recyclerView != null) {
            recyclerView.i(str);
        }
    }

    public void d0(Parcelable parcelable) {
    }

    public boolean f(L l2) {
        if (l2 != null) {
            return true;
        }
        return false;
    }

    public void f0(int i2) {
    }

    public void h(int i2, int i3, X x2, C0152n nVar) {
    }

    public final void h0(Q q2) {
        ArrayList arrayList;
        int size = q2.f3300a.size();
        int i2 = size - 1;
        while (true) {
            arrayList = q2.f3300a;
            if (i2 < 0) {
                break;
            }
            View view = ((a0) arrayList.get(i2)).f3338a;
            a0 I = RecyclerView.I(view);
            if (!I.p()) {
                I.o(false);
                if (I.k()) {
                    this.f3278b.removeDetachedView(view, false);
                }
                G g2 = this.f3278b.f1994O;
                if (g2 != null) {
                    g2.d(I);
                }
                I.o(true);
                a0 I2 = RecyclerView.I(view);
                I2.f3349n = null;
                I2.f3350o = false;
                I2.f3345j &= -33;
                q2.g(I2);
            }
            i2--;
        }
        arrayList.clear();
        ArrayList arrayList2 = q2.f3301b;
        if (arrayList2 != null) {
            arrayList2.clear();
        }
        if (size > 0) {
            this.f3278b.invalidate();
        }
    }

    public void i(int i2, C0152n nVar) {
    }

    public final void i0(View view, Q q2) {
        t tVar = this.f3277a;
        B b2 = (B) tVar.f1131b;
        int indexOfChild = b2.f3263a.indexOfChild(view);
        if (indexOfChild >= 0) {
            if (((C0141c) tVar.f1132c).f(indexOfChild)) {
                tVar.F(view);
            }
            b2.h(indexOfChild);
        }
        q2.f(view);
    }

    public final void l0() {
        RecyclerView recyclerView = this.f3278b;
        if (recyclerView != null) {
            recyclerView.requestLayout();
        }
    }

    public L s(Context context, AttributeSet attributeSet) {
        return new L(context, attributeSet);
    }

    public L t(ViewGroup.LayoutParams layoutParams) {
        if (layoutParams instanceof L) {
            return new L((L) layoutParams);
        }
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            return new L((ViewGroup.MarginLayoutParams) layoutParams);
        }
        return new L(layoutParams);
    }

    public final void t0(RecyclerView recyclerView) {
        if (recyclerView == null) {
            this.f3278b = null;
            this.f3277a = null;
            this.f3288n = 0;
            this.f3289o = 0;
        } else {
            this.f3278b = recyclerView;
            this.f3277a = recyclerView.f2015j;
            this.f3288n = recyclerView.getWidth();
            this.f3289o = recyclerView.getHeight();
        }
        this.f3286l = 1073741824;
        this.f3287m = 1073741824;
    }

    public final View u(int i2) {
        t tVar = this.f3277a;
        if (tVar != null) {
            return tVar.l(i2);
        }
        return null;
    }

    public final int v() {
        t tVar = this.f3277a;
        if (tVar != null) {
            return tVar.m();
        }
        return 0;
    }

    public final boolean w0(View view, int i2, int i3, L l2) {
        if (!this.f3283h || !M(view.getMeasuredWidth(), i2, l2.width) || !M(view.getMeasuredHeight(), i3, l2.height)) {
            return true;
        }
        return false;
    }

    public int x(Q q2, X x2) {
        RecyclerView recyclerView = this.f3278b;
        if (recyclerView == null || recyclerView.f2028q == null || !d()) {
            return 1;
        }
        return this.f3278b.f2028q.a();
    }

    public void y(View view, Rect rect) {
        int[] iArr = RecyclerView.f1980z0;
        L l2 = (L) view.getLayoutParams();
        Rect rect2 = l2.f3291b;
        rect.set((view.getLeft() - rect2.left) - l2.leftMargin, (view.getTop() - rect2.top) - l2.topMargin, view.getRight() + rect2.right + l2.rightMargin, view.getBottom() + rect2.bottom + l2.bottomMargin);
    }

    public final void y0(C0159v vVar) {
        C0159v vVar2 = this.e;
        if (!(vVar2 == null || vVar == vVar2 || !vVar2.e)) {
            vVar2.i();
        }
        this.e = vVar;
        RecyclerView recyclerView = this.f3278b;
        Z z2 = recyclerView.f2011g0;
        z2.f3332g.removeCallbacks(z2);
        z2.f3329c.abortAnimation();
        if (vVar.f3508h) {
            Log.w("RecyclerView", "An instance of " + vVar.getClass().getSimpleName() + " was started more than once. Each instance of" + vVar.getClass().getSimpleName() + " is intended to only be used once. You should create a new instance for each use.");
        }
        vVar.f3503b = recyclerView;
        vVar.f3504c = this;
        int i2 = vVar.f3502a;
        if (i2 != -1) {
            recyclerView.f2016j0.f3315a = i2;
            vVar.e = true;
            vVar.f3505d = true;
            vVar.f3506f = recyclerView.f2030r.q(i2);
            vVar.f3503b.f2011g0.a();
            vVar.f3508h = true;
            return;
        }
        throw new IllegalArgumentException("Invalid target position");
    }

    public K() {
        I i2 = new I(this, 0);
        I i3 = new I(this, 1);
        this.f3279c = new j(i2);
        this.f3280d = new j(i3);
    }

    public static int A(View view) {
        Rect rect = ((L) view.getLayoutParams()).f3291b;
        return view.getMeasuredWidth() + rect.left + rect.right;
    }

    public static int H(View view) {
        return ((L) view.getLayoutParams()).f3290a.b();
    }

    public static boolean M(int i2, int i3, int i4) {
        int mode = View.MeasureSpec.getMode(i3);
        int size = View.MeasureSpec.getSize(i3);
        if (i4 > 0 && i2 != i4) {
            return false;
        }
        if (mode != Integer.MIN_VALUE) {
            if (mode == 0) {
                return true;
            }
            if (mode == 1073741824 && size == i2) {
                return true;
            }
            return false;
        } else if (size >= i2) {
            return true;
        } else {
            return false;
        }
    }

    public static void N(View view, int i2, int i3, int i4, int i5) {
        L l2 = (L) view.getLayoutParams();
        Rect rect = l2.f3291b;
        view.layout(i2 + rect.left + l2.leftMargin, i3 + rect.top + l2.topMargin, (i4 - rect.right) - l2.rightMargin, (i5 - rect.bottom) - l2.bottomMargin);
    }

    public static int g(int i2, int i3, int i4) {
        int mode = View.MeasureSpec.getMode(i2);
        int size = View.MeasureSpec.getSize(i2);
        if (mode == Integer.MIN_VALUE) {
            return Math.min(size, Math.max(i3, i4));
        }
        if (mode != 1073741824) {
            return Math.max(i3, i4);
        }
        return size;
    }

    public static int z(View view) {
        Rect rect = ((L) view.getLayoutParams()).f3291b;
        return view.getMeasuredHeight() + rect.top + rect.bottom;
    }

    public final void K(View view, Rect rect) {
        Matrix matrix;
        Rect rect2 = ((L) view.getLayoutParams()).f3291b;
        rect.set(-rect2.left, -rect2.top, view.getWidth() + rect2.right, view.getHeight() + rect2.bottom);
        if (!(this.f3278b == null || (matrix = view.getMatrix()) == null || matrix.isIdentity())) {
            RectF rectF = this.f3278b.f2026p;
            rectF.set(rect);
            matrix.mapRect(rectF);
            rect.set((int) Math.floor((double) rectF.left), (int) Math.floor((double) rectF.top), (int) Math.ceil((double) rectF.right), (int) Math.ceil((double) rectF.bottom));
        }
        rect.offset(view.getLeft(), view.getTop());
    }

    public final void U(View view, k kVar) {
        a0 I = RecyclerView.I(view);
        if (I != null && !I.i() && !((ArrayList) this.f3277a.f1133d).contains(I.f3338a)) {
            RecyclerView recyclerView = this.f3278b;
            V(recyclerView.f2010g, recyclerView.f2016j0, view, kVar);
        }
    }

    public void V(Q q2, X x2, View view, k kVar) {
        int i2;
        int i3;
        if (e()) {
            i2 = H(view);
        } else {
            i2 = 0;
        }
        if (d()) {
            i3 = H(view);
        } else {
            i3 = 0;
        }
        kVar.i(O.j.a(false, i2, 1, i3, 1));
    }

    /* JADX WARNING: Removed duplicated region for block: B:22:0x0073  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x007b  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x00eb  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void b(android.view.View r9, int r10, boolean r11) {
        /*
            r8 = this;
            j0.a0 r0 = androidx.recyclerview.widget.RecyclerView.I(r9)
            r1 = 0
            r2 = 1
            if (r11 != 0) goto L_0x0017
            boolean r11 = r0.i()
            if (r11 == 0) goto L_0x000f
            goto L_0x0017
        L_0x000f:
            androidx.recyclerview.widget.RecyclerView r11 = r8.f3278b
            E.j r11 = r11.f2017k
            r11.J(r0)
            goto L_0x0033
        L_0x0017:
            androidx.recyclerview.widget.RecyclerView r11 = r8.f3278b
            E.j r11 = r11.f2017k
            java.lang.Object r11 = r11.f108g
            r.k r11 = (r.k) r11
            java.lang.Object r3 = r11.getOrDefault(r0, r1)
            j0.k0 r3 = (j0.k0) r3
            if (r3 != 0) goto L_0x002e
            j0.k0 r3 = j0.k0.a()
            r11.put(r0, r3)
        L_0x002e:
            int r11 = r3.f3431a
            r11 = r11 | r2
            r3.f3431a = r11
        L_0x0033:
            android.view.ViewGroup$LayoutParams r11 = r9.getLayoutParams()
            j0.L r11 = (j0.L) r11
            boolean r3 = r0.q()
            r4 = 0
            if (r3 != 0) goto L_0x0133
            boolean r3 = r0.j()
            if (r3 == 0) goto L_0x0048
            goto L_0x0133
        L_0x0048:
            android.view.ViewParent r3 = r9.getParent()
            androidx.recyclerview.widget.RecyclerView r5 = r8.f3278b
            r6 = -1
            if (r3 != r5) goto L_0x010e
            android.support.v4.media.session.t r3 = r8.f3277a
            java.lang.Object r5 = r3.f1131b
            j0.B r5 = (j0.B) r5
            androidx.recyclerview.widget.RecyclerView r5 = r5.f3263a
            int r5 = r5.indexOfChild(r9)
            if (r5 != r6) goto L_0x0061
        L_0x005f:
            r5 = -1
            goto L_0x0071
        L_0x0061:
            java.lang.Object r3 = r3.f1132c
            j0.c r3 = (j0.C0141c) r3
            boolean r7 = r3.d(r5)
            if (r7 == 0) goto L_0x006c
            goto L_0x005f
        L_0x006c:
            int r3 = r3.b(r5)
            int r5 = r5 - r3
        L_0x0071:
            if (r10 != r6) goto L_0x0079
            android.support.v4.media.session.t r10 = r8.f3277a
            int r10 = r10.m()
        L_0x0079:
            if (r5 == r6) goto L_0x00eb
            if (r5 == r10) goto L_0x014e
            androidx.recyclerview.widget.RecyclerView r9 = r8.f3278b
            j0.K r9 = r9.f2030r
            android.view.View r3 = r9.u(r5)
            if (r3 == 0) goto L_0x00ce
            r9.u(r5)
            android.support.v4.media.session.t r6 = r9.f3277a
            r6.i(r5)
            android.view.ViewGroup$LayoutParams r5 = r3.getLayoutParams()
            j0.L r5 = (j0.L) r5
            j0.a0 r6 = androidx.recyclerview.widget.RecyclerView.I(r3)
            boolean r7 = r6.i()
            if (r7 == 0) goto L_0x00bc
            androidx.recyclerview.widget.RecyclerView r7 = r9.f3278b
            E.j r7 = r7.f2017k
            java.lang.Object r7 = r7.f108g
            r.k r7 = (r.k) r7
            java.lang.Object r1 = r7.getOrDefault(r6, r1)
            j0.k0 r1 = (j0.k0) r1
            if (r1 != 0) goto L_0x00b6
            j0.k0 r1 = j0.k0.a()
            r7.put(r6, r1)
        L_0x00b6:
            int r7 = r1.f3431a
            r2 = r2 | r7
            r1.f3431a = r2
            goto L_0x00c3
        L_0x00bc:
            androidx.recyclerview.widget.RecyclerView r1 = r9.f3278b
            E.j r1 = r1.f2017k
            r1.J(r6)
        L_0x00c3:
            android.support.v4.media.session.t r9 = r9.f3277a
            boolean r1 = r6.i()
            r9.g(r3, r10, r5, r1)
            goto L_0x014e
        L_0x00ce:
            java.lang.IllegalArgumentException r10 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            java.lang.String r0 = "Cannot move a child from non-existing index:"
            r11.<init>(r0)
            r11.append(r5)
            androidx.recyclerview.widget.RecyclerView r9 = r9.f3278b
            java.lang.String r9 = r9.toString()
            r11.append(r9)
            java.lang.String r9 = r11.toString()
            r10.<init>(r9)
            throw r10
        L_0x00eb:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            java.lang.String r0 = "Added View has RecyclerView as parent but view is not a real child. Unfiltered index:"
            r11.<init>(r0)
            androidx.recyclerview.widget.RecyclerView r0 = r8.f3278b
            int r9 = r0.indexOfChild(r9)
            r11.append(r9)
            androidx.recyclerview.widget.RecyclerView r9 = r8.f3278b
            java.lang.String r9 = r9.y()
            r11.append(r9)
            java.lang.String r9 = r11.toString()
            r10.<init>(r9)
            throw r10
        L_0x010e:
            android.support.v4.media.session.t r1 = r8.f3277a
            r1.f(r9, r10, r4)
            r11.f3292c = r2
            j0.v r10 = r8.e
            if (r10 == 0) goto L_0x014e
            boolean r1 = r10.e
            if (r1 == 0) goto L_0x014e
            androidx.recyclerview.widget.RecyclerView r1 = r10.f3503b
            r1.getClass()
            j0.a0 r1 = androidx.recyclerview.widget.RecyclerView.I(r9)
            if (r1 == 0) goto L_0x012c
            int r6 = r1.b()
        L_0x012c:
            int r1 = r10.f3502a
            if (r6 != r1) goto L_0x014e
            r10.f3506f = r9
            goto L_0x014e
        L_0x0133:
            boolean r1 = r0.j()
            if (r1 == 0) goto L_0x013f
            j0.Q r1 = r0.f3349n
            r1.j(r0)
            goto L_0x0145
        L_0x013f:
            int r1 = r0.f3345j
            r1 = r1 & -33
            r0.f3345j = r1
        L_0x0145:
            android.support.v4.media.session.t r1 = r8.f3277a
            android.view.ViewGroup$LayoutParams r2 = r9.getLayoutParams()
            r1.g(r9, r10, r2, r4)
        L_0x014e:
            boolean r9 = r11.f3293d
            if (r9 == 0) goto L_0x0159
            android.view.View r9 = r0.f3338a
            r9.invalidate()
            r11.f3293d = r4
        L_0x0159:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: j0.K.b(android.view.View, int, boolean):void");
    }

    public final void g0(Q q2) {
        for (int v2 = v() - 1; v2 >= 0; v2--) {
            if (!RecyclerView.I(u(v2)).p()) {
                View u2 = u(v2);
                j0(v2);
                q2.f(u2);
            }
        }
    }

    public final void j0(int i2) {
        if (u(i2) != null) {
            t tVar = this.f3277a;
            int s2 = tVar.s(i2);
            B b2 = (B) tVar.f1131b;
            View childAt = b2.f3263a.getChildAt(s2);
            if (childAt != null) {
                if (((C0141c) tVar.f1132c).f(s2)) {
                    tVar.F(childAt);
                }
                b2.h(s2);
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:20:0x00ab, code lost:
        if ((r5.bottom - r10) > r2) goto L_0x00ae;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean k0(androidx.recyclerview.widget.RecyclerView r9, android.view.View r10, android.graphics.Rect r11, boolean r12, boolean r13) {
        /*
            r8 = this;
            int r0 = r8.E()
            int r1 = r8.G()
            int r2 = r8.f3288n
            int r3 = r8.F()
            int r2 = r2 - r3
            int r3 = r8.f3289o
            int r4 = r8.D()
            int r3 = r3 - r4
            int r4 = r10.getLeft()
            int r5 = r11.left
            int r4 = r4 + r5
            int r5 = r10.getScrollX()
            int r4 = r4 - r5
            int r5 = r10.getTop()
            int r6 = r11.top
            int r5 = r5 + r6
            int r10 = r10.getScrollY()
            int r5 = r5 - r10
            int r10 = r11.width()
            int r10 = r10 + r4
            int r11 = r11.height()
            int r11 = r11 + r5
            int r4 = r4 - r0
            r0 = 0
            int r6 = java.lang.Math.min(r0, r4)
            int r5 = r5 - r1
            int r1 = java.lang.Math.min(r0, r5)
            int r10 = r10 - r2
            int r2 = java.lang.Math.max(r0, r10)
            int r11 = r11 - r3
            int r11 = java.lang.Math.max(r0, r11)
            int r3 = r8.C()
            r7 = 1
            if (r3 != r7) goto L_0x005c
            if (r2 == 0) goto L_0x0057
            goto L_0x0064
        L_0x0057:
            int r2 = java.lang.Math.max(r6, r10)
            goto L_0x0064
        L_0x005c:
            if (r6 == 0) goto L_0x005f
            goto L_0x0063
        L_0x005f:
            int r6 = java.lang.Math.min(r4, r2)
        L_0x0063:
            r2 = r6
        L_0x0064:
            if (r1 == 0) goto L_0x0067
            goto L_0x006b
        L_0x0067:
            int r1 = java.lang.Math.min(r5, r11)
        L_0x006b:
            int[] r10 = new int[]{r2, r1}
            r11 = r10[r0]
            r10 = r10[r7]
            if (r13 == 0) goto L_0x00ae
            android.view.View r13 = r9.getFocusedChild()
            if (r13 != 0) goto L_0x007c
            goto L_0x00b3
        L_0x007c:
            int r1 = r8.E()
            int r2 = r8.G()
            int r3 = r8.f3288n
            int r4 = r8.F()
            int r3 = r3 - r4
            int r4 = r8.f3289o
            int r5 = r8.D()
            int r4 = r4 - r5
            androidx.recyclerview.widget.RecyclerView r5 = r8.f3278b
            android.graphics.Rect r5 = r5.f2022n
            r8.y(r13, r5)
            int r13 = r5.left
            int r13 = r13 - r11
            if (r13 >= r3) goto L_0x00b3
            int r13 = r5.right
            int r13 = r13 - r11
            if (r13 <= r1) goto L_0x00b3
            int r13 = r5.top
            int r13 = r13 - r10
            if (r13 >= r4) goto L_0x00b3
            int r13 = r5.bottom
            int r13 = r13 - r10
            if (r13 > r2) goto L_0x00ae
            goto L_0x00b3
        L_0x00ae:
            if (r11 != 0) goto L_0x00b4
            if (r10 == 0) goto L_0x00b3
            goto L_0x00b4
        L_0x00b3:
            return r0
        L_0x00b4:
            if (r12 == 0) goto L_0x00ba
            r9.scrollBy(r11, r10)
            goto L_0x00bd
        L_0x00ba:
            r9.b0(r11, r10, r0)
        L_0x00bd:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: j0.K.k0(androidx.recyclerview.widget.RecyclerView, android.view.View, android.graphics.Rect, boolean, boolean):boolean");
    }

    public final void p(Q q2) {
        for (int v2 = v() - 1; v2 >= 0; v2--) {
            View u2 = u(v2);
            a0 I = RecyclerView.I(u2);
            if (!I.p()) {
                if (!I.g() || I.i() || this.f3278b.f2028q.f3265b) {
                    u(v2);
                    this.f3277a.i(v2);
                    q2.h(u2);
                    this.f3278b.f2017k.J(I);
                } else {
                    j0(v2);
                    q2.g(I);
                }
            }
        }
    }

    public final void p0(RecyclerView recyclerView) {
        q0(View.MeasureSpec.makeMeasureSpec(recyclerView.getWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(recyclerView.getHeight(), 1073741824));
    }

    public View q(int i2) {
        int v2 = v();
        for (int i3 = 0; i3 < v2; i3++) {
            View u2 = u(i3);
            a0 I = RecyclerView.I(u2);
            if (I != null && I.b() == i2 && !I.p() && (this.f3278b.f2016j0.f3320g || !I.i())) {
                return u2;
            }
        }
        return null;
    }

    public final void q0(int i2, int i3) {
        this.f3288n = View.MeasureSpec.getSize(i2);
        int mode = View.MeasureSpec.getMode(i2);
        this.f3286l = mode;
        if (mode == 0 && !RecyclerView.A0) {
            this.f3288n = 0;
        }
        this.f3289o = View.MeasureSpec.getSize(i3);
        int mode2 = View.MeasureSpec.getMode(i3);
        this.f3287m = mode2;
        if (mode2 == 0 && !RecyclerView.A0) {
            this.f3289o = 0;
        }
    }

    public void r0(Rect rect, int i2, int i3) {
        int F2 = F() + E() + rect.width();
        int D2 = D() + G() + rect.height();
        RecyclerView recyclerView = this.f3278b;
        WeakHashMap weakHashMap = Q.f509a;
        this.f3278b.setMeasuredDimension(g(i2, F2, recyclerView.getMinimumWidth()), g(i3, D2, this.f3278b.getMinimumHeight()));
    }

    public final void s0(int i2, int i3) {
        int v2 = v();
        if (v2 == 0) {
            this.f3278b.n(i2, i3);
            return;
        }
        int i4 = Integer.MIN_VALUE;
        int i5 = Integer.MIN_VALUE;
        int i6 = Integer.MAX_VALUE;
        int i7 = Integer.MAX_VALUE;
        for (int i8 = 0; i8 < v2; i8++) {
            View u2 = u(i8);
            Rect rect = this.f3278b.f2022n;
            y(u2, rect);
            int i9 = rect.left;
            if (i9 < i6) {
                i6 = i9;
            }
            int i10 = rect.right;
            if (i10 > i4) {
                i4 = i10;
            }
            int i11 = rect.top;
            if (i11 < i7) {
                i7 = i11;
            }
            int i12 = rect.bottom;
            if (i12 > i5) {
                i5 = i12;
            }
        }
        this.f3278b.f2022n.set(i6, i7, i4, i5);
        r0(this.f3278b.f2022n, i2, i3);
    }

    public final boolean u0(View view, int i2, int i3, L l2) {
        if (view.isLayoutRequested() || !this.f3283h || !M(view.getWidth(), i2, l2.width) || !M(view.getHeight(), i3, l2.height)) {
            return true;
        }
        return false;
    }
}
