package com.google.android.material.sidesheet;

import A.c;
import A.f;
import K0.g;
import K0.k;
import L0.b;
import L0.d;
import L0.e;
import N.Q;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.WeakHashMap;
import p0.C0320a;
import q0.C0322a;

public class SideSheetBehavior<V extends View> extends c {

    /* renamed from: a  reason: collision with root package name */
    public C0320a f2310a;

    /* renamed from: b  reason: collision with root package name */
    public final g f2311b;

    /* renamed from: c  reason: collision with root package name */
    public final ColorStateList f2312c;

    /* renamed from: d  reason: collision with root package name */
    public final k f2313d;
    public final e e = new e(this);

    /* renamed from: f  reason: collision with root package name */
    public final float f2314f;

    /* renamed from: g  reason: collision with root package name */
    public final boolean f2315g = true;

    /* renamed from: h  reason: collision with root package name */
    public int f2316h = 5;
    public V.e i;

    /* renamed from: j  reason: collision with root package name */
    public boolean f2317j;

    /* renamed from: k  reason: collision with root package name */
    public final float f2318k = 0.1f;

    /* renamed from: l  reason: collision with root package name */
    public int f2319l;

    /* renamed from: m  reason: collision with root package name */
    public int f2320m;

    /* renamed from: n  reason: collision with root package name */
    public int f2321n;

    /* renamed from: o  reason: collision with root package name */
    public int f2322o;

    /* renamed from: p  reason: collision with root package name */
    public WeakReference f2323p;

    /* renamed from: q  reason: collision with root package name */
    public WeakReference f2324q;

    /* renamed from: r  reason: collision with root package name */
    public final int f2325r = -1;

    /* renamed from: s  reason: collision with root package name */
    public VelocityTracker f2326s;

    /* renamed from: t  reason: collision with root package name */
    public int f2327t;

    /* renamed from: u  reason: collision with root package name */
    public final LinkedHashSet f2328u = new LinkedHashSet();

    /* renamed from: v  reason: collision with root package name */
    public final L0.c f2329v = new L0.c(this, 0);

    public SideSheetBehavior() {
    }

    public final void c(f fVar) {
        this.f2323p = null;
        this.i = null;
    }

    public final void e() {
        this.f2323p = null;
        this.i = null;
    }

    /* JADX WARNING: type inference failed for: r3v18, types: [android.view.ViewGroup$LayoutParams] */
    /* JADX WARNING: type inference failed for: r3v26, types: [android.view.ViewGroup$LayoutParams] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean g(androidx.coordinatorlayout.widget.CoordinatorLayout r11, android.view.View r12, int r13) {
        /*
            r10 = this;
            r0 = 0
            r1 = 1
            K0.g r2 = r10.f2311b
            java.util.WeakHashMap r3 = N.Q.f509a
            boolean r3 = r11.getFitsSystemWindows()
            if (r3 == 0) goto L_0x0015
            boolean r3 = r12.getFitsSystemWindows()
            if (r3 != 0) goto L_0x0015
            r12.setFitsSystemWindows(r1)
        L_0x0015:
            java.lang.ref.WeakReference r3 = r10.f2323p
            r4 = 5
            r5 = 0
            if (r3 != 0) goto L_0x00ac
            java.lang.ref.WeakReference r3 = new java.lang.ref.WeakReference
            r3.<init>(r12)
            r10.f2323p = r3
            android.content.Context r3 = r12.getContext()
            r6 = 1065353216(0x3f800000, float:1.0)
            android.view.animation.Interpolator r6 = P.a.b(r5, r5, r5, r6)
            r7 = 2130969443(0x7f040363, float:1.7547568E38)
            p0.C0320a.r0(r3, r7, r6)
            r6 = 2130969426(0x7f040352, float:1.7547534E38)
            r7 = 300(0x12c, float:4.2E-43)
            p0.C0320a.q0(r3, r6, r7)
            r6 = 2130969431(0x7f040357, float:1.7547544E38)
            r7 = 150(0x96, float:2.1E-43)
            p0.C0320a.q0(r3, r6, r7)
            r6 = 2130969430(0x7f040356, float:1.7547542E38)
            r7 = 100
            p0.C0320a.q0(r3, r6, r7)
            android.content.res.Resources r3 = r12.getResources()
            r6 = 2131165361(0x7f0700b1, float:1.7944937E38)
            r3.getDimension(r6)
            r6 = 2131165360(0x7f0700b0, float:1.7944935E38)
            r3.getDimension(r6)
            r6 = 2131165362(0x7f0700b2, float:1.7944939E38)
            r3.getDimension(r6)
            if (r2 == 0) goto L_0x0075
            r12.setBackground(r2)
            float r3 = r10.f2314f
            r6 = -1082130432(0xffffffffbf800000, float:-1.0)
            int r6 = (r3 > r6 ? 1 : (r3 == r6 ? 0 : -1))
            if (r6 != 0) goto L_0x0071
            float r3 = N.F.i(r12)
        L_0x0071:
            r2.i(r3)
            goto L_0x007c
        L_0x0075:
            android.content.res.ColorStateList r3 = r10.f2312c
            if (r3 == 0) goto L_0x007c
            N.Q.r(r12, r3)
        L_0x007c:
            int r3 = r10.f2316h
            if (r3 != r4) goto L_0x0082
            r3 = 4
            goto L_0x0083
        L_0x0082:
            r3 = 0
        L_0x0083:
            int r6 = r12.getVisibility()
            if (r6 == r3) goto L_0x008c
            r12.setVisibility(r3)
        L_0x008c:
            r10.u()
            int r3 = r12.getImportantForAccessibility()
            if (r3 != 0) goto L_0x0098
            r12.setImportantForAccessibility(r1)
        L_0x0098:
            java.lang.CharSequence r3 = N.Q.d(r12)
            if (r3 != 0) goto L_0x00ac
            android.content.res.Resources r3 = r12.getResources()
            r6 = 2131755227(0x7f1000db, float:1.9141327E38)
            java.lang.String r3 = r3.getString(r6)
            N.Q.q(r12, r3)
        L_0x00ac:
            android.view.ViewGroup$LayoutParams r3 = r12.getLayoutParams()
            A.f r3 = (A.f) r3
            int r3 = r3.f6c
            int r3 = android.view.Gravity.getAbsoluteGravity(r3, r13)
            r6 = 3
            if (r3 != r6) goto L_0x00bd
            r3 = 1
            goto L_0x00be
        L_0x00bd:
            r3 = 0
        L_0x00be:
            p0.a r7 = r10.f2310a
            if (r7 == 0) goto L_0x00c8
            int r7 = r7.X()
            if (r7 == r3) goto L_0x015c
        L_0x00c8:
            K0.k r7 = r10.f2313d
            r8 = 0
            if (r3 != 0) goto L_0x0114
            L0.a r3 = new L0.a
            r3.<init>(r10, r1)
            r10.f2310a = r3
            if (r7 == 0) goto L_0x015c
            java.lang.ref.WeakReference r3 = r10.f2323p
            if (r3 == 0) goto L_0x00f1
            java.lang.Object r3 = r3.get()
            android.view.View r3 = (android.view.View) r3
            if (r3 == 0) goto L_0x00f1
            android.view.ViewGroup$LayoutParams r9 = r3.getLayoutParams()
            boolean r9 = r9 instanceof A.f
            if (r9 == 0) goto L_0x00f1
            android.view.ViewGroup$LayoutParams r3 = r3.getLayoutParams()
            r8 = r3
            A.f r8 = (A.f) r8
        L_0x00f1:
            if (r8 == 0) goto L_0x00f8
            int r3 = r8.rightMargin
            if (r3 <= 0) goto L_0x00f8
            goto L_0x015c
        L_0x00f8:
            K0.j r3 = r7.e()
            K0.a r7 = new K0.a
            r7.<init>(r5)
            r3.f399f = r7
            K0.a r7 = new K0.a
            r7.<init>(r5)
            r3.f400g = r7
            K0.k r3 = r3.a()
            if (r2 == 0) goto L_0x015c
            r2.setShapeAppearanceModel(r3)
            goto L_0x015c
        L_0x0114:
            if (r3 != r1) goto L_0x01ff
            L0.a r3 = new L0.a
            r3.<init>(r10, r0)
            r10.f2310a = r3
            if (r7 == 0) goto L_0x015c
            java.lang.ref.WeakReference r3 = r10.f2323p
            if (r3 == 0) goto L_0x013a
            java.lang.Object r3 = r3.get()
            android.view.View r3 = (android.view.View) r3
            if (r3 == 0) goto L_0x013a
            android.view.ViewGroup$LayoutParams r9 = r3.getLayoutParams()
            boolean r9 = r9 instanceof A.f
            if (r9 == 0) goto L_0x013a
            android.view.ViewGroup$LayoutParams r3 = r3.getLayoutParams()
            r8 = r3
            A.f r8 = (A.f) r8
        L_0x013a:
            if (r8 == 0) goto L_0x0141
            int r3 = r8.leftMargin
            if (r3 <= 0) goto L_0x0141
            goto L_0x015c
        L_0x0141:
            K0.j r3 = r7.e()
            K0.a r7 = new K0.a
            r7.<init>(r5)
            r3.e = r7
            K0.a r7 = new K0.a
            r7.<init>(r5)
            r3.f401h = r7
            K0.k r3 = r3.a()
            if (r2 == 0) goto L_0x015c
            r2.setShapeAppearanceModel(r3)
        L_0x015c:
            V.e r2 = r10.i
            if (r2 != 0) goto L_0x016d
            V.e r2 = new V.e
            android.content.Context r3 = r11.getContext()
            L0.c r5 = r10.f2329v
            r2.<init>(r3, r11, r5)
            r10.i = r2
        L_0x016d:
            p0.a r2 = r10.f2310a
            int r2 = r2.V(r12)
            r11.q(r12, r13)
            int r13 = r11.getWidth()
            r10.f2320m = r13
            p0.a r13 = r10.f2310a
            int r13 = r13.W(r11)
            r10.f2321n = r13
            int r13 = r12.getWidth()
            r10.f2319l = r13
            android.view.ViewGroup$LayoutParams r13 = r12.getLayoutParams()
            android.view.ViewGroup$MarginLayoutParams r13 = (android.view.ViewGroup.MarginLayoutParams) r13
            if (r13 == 0) goto L_0x0199
            p0.a r3 = r10.f2310a
            int r13 = r3.e(r13)
            goto L_0x019a
        L_0x0199:
            r13 = 0
        L_0x019a:
            r10.f2322o = r13
            int r13 = r10.f2316h
            if (r13 == r1) goto L_0x01c4
            r3 = 2
            if (r13 == r3) goto L_0x01c4
            if (r13 == r6) goto L_0x01cc
            if (r13 != r4) goto L_0x01ae
            p0.a r13 = r10.f2310a
            int r0 = r13.Q()
            goto L_0x01cc
        L_0x01ae:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.StringBuilder r12 = new java.lang.StringBuilder
            java.lang.String r13 = "Unexpected value: "
            r12.<init>(r13)
            int r13 = r10.f2316h
            r12.append(r13)
            java.lang.String r12 = r12.toString()
            r11.<init>(r12)
            throw r11
        L_0x01c4:
            p0.a r13 = r10.f2310a
            int r13 = r13.V(r12)
            int r0 = r2 - r13
        L_0x01cc:
            N.Q.j(r12, r0)
            java.lang.ref.WeakReference r12 = r10.f2324q
            if (r12 != 0) goto L_0x01e5
            int r12 = r10.f2325r
            r13 = -1
            if (r12 == r13) goto L_0x01e5
            android.view.View r11 = r11.findViewById(r12)
            if (r11 == 0) goto L_0x01e5
            java.lang.ref.WeakReference r12 = new java.lang.ref.WeakReference
            r12.<init>(r11)
            r10.f2324q = r12
        L_0x01e5:
            java.util.LinkedHashSet r11 = r10.f2328u
            java.util.Iterator r11 = r11.iterator()
        L_0x01eb:
            boolean r12 = r11.hasNext()
            if (r12 == 0) goto L_0x01fe
            java.lang.Object r12 = r11.next()
            if (r12 != 0) goto L_0x01f8
            goto L_0x01eb
        L_0x01f8:
            java.lang.ClassCastException r11 = new java.lang.ClassCastException
            r11.<init>()
            throw r11
        L_0x01fe:
            return r1
        L_0x01ff:
            java.lang.IllegalArgumentException r11 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r12 = new java.lang.StringBuilder
            java.lang.String r13 = "Invalid sheet edge position value: "
            r12.<init>(r13)
            r12.append(r3)
            java.lang.String r13 = ". Must be 0 or 1."
            r12.append(r13)
            java.lang.String r12 = r12.toString()
            r11.<init>(r12)
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.sidesheet.SideSheetBehavior.g(androidx.coordinatorlayout.widget.CoordinatorLayout, android.view.View, int):boolean");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x002d, code lost:
        if (r1.o(r0, r3.getTop()) != false) goto L_0x004d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x004b, code lost:
        if (r3 != false) goto L_0x004d;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void t(android.view.View r3, int r4, boolean r5) {
        /*
            r2 = this;
            r0 = 3
            if (r4 == r0) goto L_0x0019
            r0 = 5
            if (r4 != r0) goto L_0x000d
            p0.a r0 = r2.f2310a
            int r0 = r0.Q()
            goto L_0x001f
        L_0x000d:
            java.lang.IllegalArgumentException r3 = new java.lang.IllegalArgumentException
            java.lang.String r5 = "Invalid state to get outer edge offset: "
            java.lang.String r4 = Q0.E.e(r5, r4)
            r3.<init>(r4)
            throw r3
        L_0x0019:
            p0.a r0 = r2.f2310a
            int r0 = r0.P()
        L_0x001f:
            V.e r1 = r2.i
            if (r1 == 0) goto L_0x0057
            if (r5 == 0) goto L_0x0030
            int r3 = r3.getTop()
            boolean r3 = r1.o(r0, r3)
            if (r3 == 0) goto L_0x0057
            goto L_0x004d
        L_0x0030:
            int r5 = r3.getTop()
            r1.f974r = r3
            r3 = -1
            r1.f961c = r3
            r3 = 0
            boolean r3 = r1.h(r0, r5, r3, r3)
            if (r3 != 0) goto L_0x004b
            int r5 = r1.f959a
            if (r5 != 0) goto L_0x004b
            android.view.View r5 = r1.f974r
            if (r5 == 0) goto L_0x004b
            r5 = 0
            r1.f974r = r5
        L_0x004b:
            if (r3 == 0) goto L_0x0057
        L_0x004d:
            r3 = 2
            r2.r(r3)
            L0.e r3 = r2.e
            r3.a(r4)
            goto L_0x005a
        L_0x0057:
            r2.r(r4)
        L_0x005a:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.sidesheet.SideSheetBehavior.t(android.view.View, int, boolean):void");
    }

    public final void m(View view, Parcelable parcelable) {
        int i2 = ((d) parcelable).f474c;
        if (i2 == 1 || i2 == 2) {
            i2 = 5;
        }
        this.f2316h = i2;
    }

    public final Parcelable n(View view) {
        return new d(View.BaseSavedState.EMPTY_STATE, this);
    }

    public final void r(int i2) {
        View view;
        int i3;
        if (this.f2316h != i2) {
            this.f2316h = i2;
            WeakReference weakReference = this.f2323p;
            if (weakReference != null && (view = (View) weakReference.get()) != null) {
                if (this.f2316h == 5) {
                    i3 = 4;
                } else {
                    i3 = 0;
                }
                if (view.getVisibility() != i3) {
                    view.setVisibility(i3);
                }
                Iterator it2 = this.f2328u.iterator();
                if (!it2.hasNext()) {
                    u();
                } else {
                    it2.next().getClass();
                    throw new ClassCastException();
                }
            }
        }
    }

    public final boolean s() {
        if (this.i == null || (!this.f2315g && this.f2316h != 1)) {
            return false;
        }
        return true;
    }

    public final void u() {
        View view;
        WeakReference weakReference = this.f2323p;
        if (weakReference != null && (view = (View) weakReference.get()) != null) {
            Q.m(view, 262144);
            Q.i(view, 0);
            Q.m(view, 1048576);
            Q.i(view, 0);
            if (this.f2316h != 5) {
                Q.n(view, O.f.f742j, new b(this, 5));
            }
            if (this.f2316h != 3) {
                Q.n(view, O.f.f741h, new b(this, 3));
            }
        }
    }

    public final boolean f(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
        V.e eVar;
        VelocityTracker velocityTracker;
        if ((view.isShown() || Q.d(view) != null) && this.f2315g) {
            int actionMasked = motionEvent.getActionMasked();
            if (actionMasked == 0 && (velocityTracker = this.f2326s) != null) {
                velocityTracker.recycle();
                this.f2326s = null;
            }
            if (this.f2326s == null) {
                this.f2326s = VelocityTracker.obtain();
            }
            this.f2326s.addMovement(motionEvent);
            if (actionMasked == 0) {
                this.f2327t = (int) motionEvent.getX();
            } else if ((actionMasked == 1 || actionMasked == 3) && this.f2317j) {
                this.f2317j = false;
                return false;
            }
            if (this.f2317j || (eVar = this.i) == null || !eVar.p(motionEvent)) {
                return false;
            }
            return true;
        }
        this.f2317j = true;
        return false;
    }

    public final boolean h(CoordinatorLayout coordinatorLayout, View view, int i2, int i3, int i4) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        view.measure(ViewGroup.getChildMeasureSpec(i2, coordinatorLayout.getPaddingRight() + coordinatorLayout.getPaddingLeft() + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin + i3, marginLayoutParams.width), ViewGroup.getChildMeasureSpec(i4, coordinatorLayout.getPaddingBottom() + coordinatorLayout.getPaddingTop() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin, marginLayoutParams.height));
        return true;
    }

    public final boolean q(View view, MotionEvent motionEvent) {
        VelocityTracker velocityTracker;
        if (!view.isShown()) {
            return false;
        }
        int actionMasked = motionEvent.getActionMasked();
        if (this.f2316h == 1 && actionMasked == 0) {
            return true;
        }
        if (s()) {
            this.i.j(motionEvent);
        }
        if (actionMasked == 0 && (velocityTracker = this.f2326s) != null) {
            velocityTracker.recycle();
            this.f2326s = null;
        }
        if (this.f2326s == null) {
            this.f2326s = VelocityTracker.obtain();
        }
        this.f2326s.addMovement(motionEvent);
        if (s() && actionMasked == 2 && !this.f2317j && s()) {
            float abs = Math.abs(((float) this.f2327t) - motionEvent.getX());
            V.e eVar = this.i;
            if (abs > ((float) eVar.f960b)) {
                eVar.b(view, motionEvent.getPointerId(motionEvent.getActionIndex()));
            }
        }
        return !this.f2317j;
    }

    public SideSheetBehavior(Context context, AttributeSet attributeSet) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C0322a.f4504w);
        if (obtainStyledAttributes.hasValue(3)) {
            this.f2312c = C0320a.J(context, obtainStyledAttributes, 3);
        }
        if (obtainStyledAttributes.hasValue(6)) {
            this.f2313d = k.b(context, attributeSet, 0, 2131821551).a();
        }
        if (obtainStyledAttributes.hasValue(5)) {
            int resourceId = obtainStyledAttributes.getResourceId(5, -1);
            this.f2325r = resourceId;
            WeakReference weakReference = this.f2324q;
            if (weakReference != null) {
                weakReference.clear();
            }
            this.f2324q = null;
            WeakReference weakReference2 = this.f2323p;
            if (weakReference2 != null) {
                View view = (View) weakReference2.get();
                if (resourceId != -1) {
                    WeakHashMap weakHashMap = Q.f509a;
                    if (view.isLaidOut()) {
                        view.requestLayout();
                    }
                }
            }
        }
        k kVar = this.f2313d;
        if (kVar != null) {
            g gVar = new g(kVar);
            this.f2311b = gVar;
            gVar.h(context);
            ColorStateList colorStateList = this.f2312c;
            if (colorStateList != null) {
                this.f2311b.j(colorStateList);
            } else {
                TypedValue typedValue = new TypedValue();
                context.getTheme().resolveAttribute(16842801, typedValue, true);
                this.f2311b.setTint(typedValue.data);
            }
        }
        this.f2314f = obtainStyledAttributes.getDimension(2, -1.0f);
        this.f2315g = obtainStyledAttributes.getBoolean(4, true);
        obtainStyledAttributes.recycle();
        ViewConfiguration.get(context).getScaledMaximumFlingVelocity();
    }
}
