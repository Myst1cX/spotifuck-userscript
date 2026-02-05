package com.google.android.material.bottomsheet;

import A.c;
import K.j;
import K0.f;
import K0.g;
import K0.k;
import L0.e;
import N.C0000a;
import N.C0002b;
import N.C0004d;
import N.D;
import N.F;
import N.Q;
import N.e0;
import N.f0;
import N.g0;
import N0.C;
import P.a;
import Q0.E;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.os.Build;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseIntArray;
import android.util.TypedValue;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.animation.PathInterpolator;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.WeakHashMap;
import o.C0265U;
import p0.C0320a;
import q0.C0322a;
import v0.C0349a;

public class BottomSheetBehavior<V extends View> extends c {

    /* renamed from: A  reason: collision with root package name */
    public final e f2109A = new e(this);

    /* renamed from: B  reason: collision with root package name */
    public final ValueAnimator f2110B;

    /* renamed from: C  reason: collision with root package name */
    public final int f2111C;

    /* renamed from: D  reason: collision with root package name */
    public int f2112D;

    /* renamed from: E  reason: collision with root package name */
    public int f2113E;

    /* renamed from: F  reason: collision with root package name */
    public final float f2114F = 0.5f;

    /* renamed from: G  reason: collision with root package name */
    public int f2115G;

    /* renamed from: H  reason: collision with root package name */
    public final float f2116H = -1.0f;
    public boolean I;

    /* renamed from: J  reason: collision with root package name */
    public boolean f2117J;

    /* renamed from: K  reason: collision with root package name */
    public final boolean f2118K = true;

    /* renamed from: L  reason: collision with root package name */
    public int f2119L = 4;

    /* renamed from: M  reason: collision with root package name */
    public V.e f2120M;

    /* renamed from: N  reason: collision with root package name */
    public boolean f2121N;

    /* renamed from: O  reason: collision with root package name */
    public int f2122O;

    /* renamed from: P  reason: collision with root package name */
    public boolean f2123P;

    /* renamed from: Q  reason: collision with root package name */
    public final float f2124Q = 0.1f;

    /* renamed from: R  reason: collision with root package name */
    public int f2125R;

    /* renamed from: S  reason: collision with root package name */
    public int f2126S;

    /* renamed from: T  reason: collision with root package name */
    public int f2127T;

    /* renamed from: U  reason: collision with root package name */
    public WeakReference f2128U;

    /* renamed from: V  reason: collision with root package name */
    public WeakReference f2129V;

    /* renamed from: W  reason: collision with root package name */
    public final ArrayList f2130W = new ArrayList();

    /* renamed from: X  reason: collision with root package name */
    public VelocityTracker f2131X;

    /* renamed from: Y  reason: collision with root package name */
    public int f2132Y;

    /* renamed from: Z  reason: collision with root package name */
    public int f2133Z = -1;

    /* renamed from: a  reason: collision with root package name */
    public final int f2134a = 0;

    /* renamed from: a0  reason: collision with root package name */
    public boolean f2135a0;

    /* renamed from: b  reason: collision with root package name */
    public boolean f2136b = true;

    /* renamed from: b0  reason: collision with root package name */
    public HashMap f2137b0;

    /* renamed from: c  reason: collision with root package name */
    public final float f2138c;

    /* renamed from: c0  reason: collision with root package name */
    public final SparseIntArray f2139c0 = new SparseIntArray();

    /* renamed from: d  reason: collision with root package name */
    public final int f2140d;

    /* renamed from: d0  reason: collision with root package name */
    public final L0.c f2141d0 = new L0.c(this, 1);
    public int e;

    /* renamed from: f  reason: collision with root package name */
    public boolean f2142f;

    /* renamed from: g  reason: collision with root package name */
    public int f2143g;

    /* renamed from: h  reason: collision with root package name */
    public final int f2144h;
    public final g i;

    /* renamed from: j  reason: collision with root package name */
    public final ColorStateList f2145j;

    /* renamed from: k  reason: collision with root package name */
    public final int f2146k = -1;

    /* renamed from: l  reason: collision with root package name */
    public final int f2147l = -1;

    /* renamed from: m  reason: collision with root package name */
    public int f2148m;

    /* renamed from: n  reason: collision with root package name */
    public final boolean f2149n;

    /* renamed from: o  reason: collision with root package name */
    public final boolean f2150o;

    /* renamed from: p  reason: collision with root package name */
    public final boolean f2151p;

    /* renamed from: q  reason: collision with root package name */
    public final boolean f2152q;

    /* renamed from: r  reason: collision with root package name */
    public final boolean f2153r;

    /* renamed from: s  reason: collision with root package name */
    public final boolean f2154s;

    /* renamed from: t  reason: collision with root package name */
    public final boolean f2155t;

    /* renamed from: u  reason: collision with root package name */
    public final boolean f2156u;

    /* renamed from: v  reason: collision with root package name */
    public int f2157v;

    /* renamed from: w  reason: collision with root package name */
    public int f2158w;

    /* renamed from: x  reason: collision with root package name */
    public final boolean f2159x;

    /* renamed from: y  reason: collision with root package name */
    public final k f2160y;

    /* renamed from: z  reason: collision with root package name */
    public boolean f2161z;

    public BottomSheetBehavior() {
    }

    public final void A(int i2) {
        if (i2 == -1) {
            if (!this.f2142f) {
                this.f2142f = true;
            } else {
                return;
            }
        } else if (this.f2142f || this.e != i2) {
            this.f2142f = false;
            this.e = Math.max(0, i2);
        } else {
            return;
        }
        I();
    }

    public final void B(int i2) {
        String str;
        int i3;
        if (i2 == 1 || i2 == 2) {
            StringBuilder sb = new StringBuilder("STATE_");
            if (i2 == 1) {
                str = "DRAGGING";
            } else {
                str = "SETTLING";
            }
            sb.append(str);
            sb.append(" should not be set externally.");
            throw new IllegalArgumentException(sb.toString());
        } else if (this.I || i2 != 5) {
            if (i2 != 6 || !this.f2136b || y(i2) > this.f2112D) {
                i3 = i2;
            } else {
                i3 = 3;
            }
            WeakReference weakReference = this.f2128U;
            if (weakReference == null || weakReference.get() == null) {
                C(i2);
                return;
            }
            View view = (View) this.f2128U.get();
            C0265U u2 = new C0265U(this, view, i3);
            ViewParent parent = view.getParent();
            if (parent != null && parent.isLayoutRequested()) {
                WeakHashMap weakHashMap = Q.f509a;
                if (view.isAttachedToWindow()) {
                    view.post(u2);
                    return;
                }
            }
            u2.run();
        } else {
            Log.w("BottomSheetBehavior", "Cannot set state: " + i2);
        }
    }

    public final void G(int i2, boolean z2) {
        boolean z3;
        g gVar = this.i;
        ValueAnimator valueAnimator = this.f2110B;
        if (i2 != 2) {
            if (this.f2119L != 3 || (!this.f2159x && !z())) {
                z3 = false;
            } else {
                z3 = true;
            }
            if (this.f2161z != z3 && gVar != null) {
                this.f2161z = z3;
                float f2 = 1.0f;
                if (!z2 || valueAnimator == null) {
                    if (valueAnimator != null && valueAnimator.isRunning()) {
                        valueAnimator.cancel();
                    }
                    if (this.f2161z) {
                        f2 = s();
                    }
                    f fVar = gVar.f374f;
                    if (fVar.i != f2) {
                        fVar.i = f2;
                        gVar.f377j = true;
                        gVar.invalidateSelf();
                    }
                } else if (valueAnimator.isRunning()) {
                    valueAnimator.reverse();
                } else {
                    float f3 = gVar.f374f.i;
                    if (z3) {
                        f2 = s();
                    }
                    valueAnimator.setFloatValues(new float[]{f3, f2});
                    valueAnimator.start();
                }
            }
        }
    }

    public final void c(A.f fVar) {
        this.f2128U = null;
        this.f2120M = null;
    }

    public final void e() {
        this.f2128U = null;
        this.f2120M = null;
    }

    public final void j(CoordinatorLayout coordinatorLayout, View view, View view2, int i2, int i3, int[] iArr, int i4) {
        View view3;
        if (i4 != 1) {
            WeakReference weakReference = this.f2129V;
            if (weakReference != null) {
                view3 = (View) weakReference.get();
            } else {
                view3 = null;
            }
            if (view2 == view3) {
                int top = view.getTop();
                int i5 = top - i3;
                if (i3 > 0) {
                    if (i5 < x()) {
                        int x2 = top - x();
                        iArr[1] = x2;
                        Q.k(view, -x2);
                        C(3);
                    } else if (this.f2118K) {
                        iArr[1] = i3;
                        Q.k(view, -i3);
                        C(1);
                    } else {
                        return;
                    }
                } else if (i3 < 0 && !view2.canScrollVertically(-1)) {
                    int i6 = this.f2115G;
                    if (i5 > i6 && !this.I) {
                        int i7 = top - i6;
                        iArr[1] = i7;
                        Q.k(view, -i7);
                        C(4);
                    } else if (this.f2118K) {
                        iArr[1] = i3;
                        Q.k(view, -i3);
                        C(1);
                    } else {
                        return;
                    }
                }
                u(view.getTop());
                this.f2122O = i3;
                this.f2123P = true;
            }
        }
    }

    public final boolean o(View view, int i2, int i3) {
        this.f2122O = 0;
        this.f2123P = false;
        if ((i2 & 2) != 0) {
            return true;
        }
        return false;
    }

    public final int y(int i2) {
        if (i2 == 3) {
            return x();
        }
        if (i2 == 4) {
            return this.f2115G;
        }
        if (i2 == 5) {
            return this.f2127T;
        }
        if (i2 == 6) {
            return this.f2113E;
        }
        throw new IllegalArgumentException(E.e("Invalid state to get top offset: ", i2));
    }

    public final void C(int i2) {
        if (this.f2119L != i2) {
            this.f2119L = i2;
            if (!(i2 == 4 || i2 == 3 || i2 == 6)) {
                boolean z2 = this.I;
            }
            WeakReference weakReference = this.f2128U;
            if (weakReference != null && ((View) weakReference.get()) != null) {
                if (i2 == 3) {
                    H(true);
                } else if (i2 == 6 || i2 == 5 || i2 == 4) {
                    H(false);
                }
                G(i2, true);
                ArrayList arrayList = this.f2130W;
                if (arrayList.size() <= 0) {
                    F();
                } else {
                    arrayList.get(0).getClass();
                    throw new ClassCastException();
                }
            }
        }
    }

    public final boolean D(View view, float f2) {
        if (this.f2117J) {
            return true;
        }
        if (view.getTop() < this.f2115G) {
            return false;
        }
        int t2 = t();
        if (Math.abs(((f2 * this.f2124Q) + ((float) view.getTop())) - ((float) this.f2115G)) / ((float) t2) > 0.5f) {
            return true;
        }
        return false;
    }

    public final void F() {
        View view;
        int i2;
        boolean z2;
        C0002b bVar;
        WeakReference weakReference = this.f2128U;
        if (weakReference != null && (view = (View) weakReference.get()) != null) {
            Q.m(view, 524288);
            Q.i(view, 0);
            Q.m(view, 262144);
            Q.i(view, 0);
            Q.m(view, 1048576);
            Q.i(view, 0);
            SparseIntArray sparseIntArray = this.f2139c0;
            int i3 = sparseIntArray.get(0, -1);
            if (i3 != -1) {
                Q.m(view, i3);
                Q.i(view, 0);
                sparseIntArray.delete(0);
            }
            int i4 = 6;
            if (!this.f2136b && this.f2119L != 6) {
                String string = view.getResources().getString(2131755047);
                j jVar = new j(this, 6);
                ArrayList e2 = Q.e(view);
                int i5 = 0;
                while (true) {
                    if (i5 >= e2.size()) {
                        int i6 = -1;
                        for (int i7 = 0; i7 < 32 && i6 == -1; i7++) {
                            int i8 = Q.e[i7];
                            boolean z3 = true;
                            for (int i9 = 0; i9 < e2.size(); i9++) {
                                if (((O.f) e2.get(i9)).a() != i8) {
                                    z2 = true;
                                } else {
                                    z2 = false;
                                }
                                z3 &= z2;
                            }
                            if (z3) {
                                i6 = i8;
                            }
                        }
                        i2 = i6;
                    } else if (TextUtils.equals(string, ((AccessibilityNodeInfo.AccessibilityAction) ((O.f) e2.get(i5)).f745a).getLabel())) {
                        i2 = ((O.f) e2.get(i5)).a();
                        break;
                    } else {
                        i5++;
                    }
                }
                if (i2 != -1) {
                    O.f fVar = new O.f((Object) null, i2, string, jVar, (Class) null);
                    View.AccessibilityDelegate c2 = Q.c(view);
                    if (c2 == null) {
                        bVar = null;
                    } else if (c2 instanceof C0000a) {
                        bVar = ((C0000a) c2).f521a;
                    } else {
                        bVar = new C0002b(c2);
                    }
                    if (bVar == null) {
                        bVar = new C0002b();
                    }
                    Q.p(view, bVar);
                    Q.m(view, fVar.a());
                    Q.e(view).add(fVar);
                    Q.i(view, 0);
                }
                sparseIntArray.put(0, i2);
            }
            if (this.I && this.f2119L != 5) {
                Q.n(view, O.f.f742j, new j(this, 5));
            }
            int i10 = this.f2119L;
            if (i10 == 3) {
                if (this.f2136b) {
                    i4 = 4;
                }
                Q.n(view, O.f.i, new j(this, i4));
            } else if (i10 == 4) {
                if (this.f2136b) {
                    i4 = 3;
                }
                Q.n(view, O.f.f741h, new j(this, i4));
            } else if (i10 == 6) {
                Q.n(view, O.f.i, new j(this, 4));
                Q.n(view, O.f.f741h, new j(this, 3));
            }
        }
    }

    public final void H(boolean z2) {
        WeakReference weakReference = this.f2128U;
        if (weakReference != null) {
            ViewParent parent = ((View) weakReference.get()).getParent();
            if (parent instanceof CoordinatorLayout) {
                CoordinatorLayout coordinatorLayout = (CoordinatorLayout) parent;
                int childCount = coordinatorLayout.getChildCount();
                if (z2) {
                    if (this.f2137b0 == null) {
                        this.f2137b0 = new HashMap(childCount);
                    } else {
                        return;
                    }
                }
                for (int i2 = 0; i2 < childCount; i2++) {
                    View childAt = coordinatorLayout.getChildAt(i2);
                    if (childAt != this.f2128U.get() && z2) {
                        this.f2137b0.put(childAt, Integer.valueOf(childAt.getImportantForAccessibility()));
                    }
                }
                if (!z2) {
                    this.f2137b0 = null;
                }
            }
        }
    }

    public final void I() {
        View view;
        if (this.f2128U != null) {
            r();
            if (this.f2119L == 4 && (view = (View) this.f2128U.get()) != null) {
                view.requestLayout();
            }
        }
    }

    /* JADX WARNING: type inference failed for: r6v16, types: [java.lang.Object, E0.o] */
    /* JADX WARNING: type inference failed for: r6v18, types: [java.lang.Object, android.view.View$OnAttachStateChangeListener] */
    public final boolean g(CoordinatorLayout coordinatorLayout, View view, int i2) {
        boolean z2;
        int i3 = this.f2147l;
        g gVar = this.i;
        WeakHashMap weakHashMap = Q.f509a;
        if (coordinatorLayout.getFitsSystemWindows() && !view.getFitsSystemWindows()) {
            view.setFitsSystemWindows(true);
        }
        if (this.f2128U == null) {
            this.f2143g = coordinatorLayout.getResources().getDimensionPixelSize(2131165293);
            int i4 = Build.VERSION.SDK_INT;
            if (i4 < 29 || this.f2149n || this.f2142f) {
                z2 = false;
            } else {
                z2 = true;
            }
            if (this.f2150o || this.f2151p || this.f2152q || this.f2154s || this.f2155t || this.f2156u || z2) {
                L.j jVar = new L.j(this, z2);
                int paddingStart = view.getPaddingStart();
                view.getPaddingTop();
                int paddingEnd = view.getPaddingEnd();
                int paddingBottom = view.getPaddingBottom();
                ? obj = new Object();
                obj.f221a = paddingStart;
                obj.f222b = paddingEnd;
                obj.f223c = paddingBottom;
                F.u(view, new E.j((Object) jVar, (Object) obj, 1));
                if (view.isAttachedToWindow()) {
                    D.c(view);
                } else {
                    view.addOnAttachStateChangeListener(new Object());
                }
            }
            C0004d dVar = new C0004d(view);
            if (i4 >= 30) {
                view.setWindowInsetsAnimationCallback(new g0(dVar));
            } else {
                PathInterpolator pathInterpolator = f0.e;
                Object tag = view.getTag(2131296729);
                e0 e0Var = new e0(view, dVar);
                view.setTag(2131296737, e0Var);
                if (tag == null) {
                    view.setOnApplyWindowInsetsListener(e0Var);
                }
            }
            this.f2128U = new WeakReference(view);
            Context context = view.getContext();
            C0320a.r0(context, 2130969443, a.b(0.0f, 0.0f, 0.0f, 1.0f));
            C0320a.q0(context, 2130969426, 300);
            C0320a.q0(context, 2130969431, 150);
            C0320a.q0(context, 2130969430, 100);
            Resources resources = view.getResources();
            resources.getDimension(2131165356);
            resources.getDimension(2131165357);
            if (gVar != null) {
                view.setBackground(gVar);
                float f2 = this.f2116H;
                if (f2 == -1.0f) {
                    f2 = F.i(view);
                }
                gVar.i(f2);
            } else {
                ColorStateList colorStateList = this.f2145j;
                if (colorStateList != null) {
                    Q.r(view, colorStateList);
                }
            }
            F();
            if (view.getImportantForAccessibility() == 0) {
                view.setImportantForAccessibility(1);
            }
        }
        if (this.f2120M == null) {
            this.f2120M = new V.e(coordinatorLayout.getContext(), coordinatorLayout, this.f2141d0);
        }
        int top = view.getTop();
        coordinatorLayout.q(view, i2);
        this.f2126S = coordinatorLayout.getWidth();
        this.f2127T = coordinatorLayout.getHeight();
        int height = view.getHeight();
        this.f2125R = height;
        int i5 = this.f2127T;
        int i6 = i5 - height;
        int i7 = this.f2158w;
        if (i6 < i7) {
            if (this.f2153r) {
                if (i3 != -1) {
                    i5 = Math.min(i5, i3);
                }
                this.f2125R = i5;
            } else {
                int i8 = i5 - i7;
                if (i3 != -1) {
                    i8 = Math.min(i8, i3);
                }
                this.f2125R = i8;
            }
        }
        this.f2112D = Math.max(0, this.f2127T - this.f2125R);
        this.f2113E = (int) ((1.0f - this.f2114F) * ((float) this.f2127T));
        r();
        int i9 = this.f2119L;
        if (i9 == 3) {
            Q.k(view, x());
        } else if (i9 == 6) {
            Q.k(view, this.f2113E);
        } else if (this.I && i9 == 5) {
            Q.k(view, this.f2127T);
        } else if (i9 == 4) {
            Q.k(view, this.f2115G);
        } else if (i9 == 1 || i9 == 2) {
            Q.k(view, top - view.getTop());
        }
        G(this.f2119L, false);
        this.f2129V = new WeakReference(v(view));
        ArrayList arrayList = this.f2130W;
        if (arrayList.size() <= 0) {
            return true;
        }
        arrayList.get(0).getClass();
        throw new ClassCastException();
    }

    public final boolean i(View view) {
        WeakReference weakReference = this.f2129V;
        if (weakReference == null || view != weakReference.get() || this.f2119L == 3) {
            return false;
        }
        return true;
    }

    public final void k(CoordinatorLayout coordinatorLayout, View view, int i2, int i3, int i4, int[] iArr) {
    }

    public final void m(View view, Parcelable parcelable) {
        C0349a aVar = (C0349a) parcelable;
        int i2 = this.f2134a;
        if (i2 != 0) {
            if (i2 == -1 || (i2 & 1) == 1) {
                this.e = aVar.f4851d;
            }
            if (i2 == -1 || (i2 & 2) == 2) {
                this.f2136b = aVar.e;
            }
            if (i2 == -1 || (i2 & 4) == 4) {
                this.I = aVar.f4852f;
            }
            if (i2 == -1 || (i2 & 8) == 8) {
                this.f2117J = aVar.f4853g;
            }
        }
        int i3 = aVar.f4850c;
        if (i3 == 1 || i3 == 2) {
            this.f2119L = 4;
        } else {
            this.f2119L = i3;
        }
    }

    public final Parcelable n(View view) {
        return new C0349a(View.BaseSavedState.EMPTY_STATE, this);
    }

    /* JADX WARNING: Removed duplicated region for block: B:22:0x0065  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final float s() {
        /*
            r5 = this;
            K0.g r0 = r5.i
            r1 = 0
            if (r0 == 0) goto L_0x0079
            java.lang.ref.WeakReference r0 = r5.f2128U
            if (r0 == 0) goto L_0x0079
            java.lang.Object r0 = r0.get()
            if (r0 == 0) goto L_0x0079
            int r0 = android.os.Build.VERSION.SDK_INT
            r2 = 31
            if (r0 < r2) goto L_0x0079
            java.lang.ref.WeakReference r0 = r5.f2128U
            java.lang.Object r0 = r0.get()
            android.view.View r0 = (android.view.View) r0
            boolean r2 = r5.z()
            if (r2 == 0) goto L_0x0079
            android.view.WindowInsets r0 = r0.getRootWindowInsets()
            if (r0 == 0) goto L_0x0079
            K0.g r2 = r5.i
            K0.f r3 = r2.f374f
            K0.k r3 = r3.f358a
            K0.c r3 = r3.e
            android.graphics.RectF r2 = r2.f()
            float r2 = r3.a(r2)
            android.view.RoundedCorner r3 = r0.getRoundedCorner(0)
            if (r3 == 0) goto L_0x004e
            int r3 = r3.getRadius()
            float r3 = (float) r3
            int r4 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r4 <= 0) goto L_0x004e
            int r4 = (r2 > r1 ? 1 : (r2 == r1 ? 0 : -1))
            if (r4 <= 0) goto L_0x004e
            float r3 = r3 / r2
            goto L_0x004f
        L_0x004e:
            r3 = 0
        L_0x004f:
            K0.g r2 = r5.i
            K0.f r4 = r2.f374f
            K0.k r4 = r4.f358a
            K0.c r4 = r4.f409f
            android.graphics.RectF r2 = r2.f()
            float r2 = r4.a(r2)
            android.view.RoundedCorner r0 = r0.getRoundedCorner(1)
            if (r0 == 0) goto L_0x0074
            int r0 = r0.getRadius()
            float r0 = (float) r0
            int r4 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r4 <= 0) goto L_0x0074
            int r4 = (r2 > r1 ? 1 : (r2 == r1 ? 0 : -1))
            if (r4 <= 0) goto L_0x0074
            float r1 = r0 / r2
        L_0x0074:
            float r0 = java.lang.Math.max(r3, r1)
            return r0
        L_0x0079:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.bottomsheet.BottomSheetBehavior.s():float");
    }

    public final int t() {
        int i2;
        if (this.f2142f) {
            return Math.min(Math.max(this.f2143g, this.f2127T - ((this.f2126S * 9) / 16)), this.f2125R) + this.f2157v;
        }
        if (this.f2149n || this.f2150o || (i2 = this.f2148m) <= 0) {
            return this.e + this.f2157v;
        }
        return Math.max(this.e, i2 + this.f2144h);
    }

    public final void u(int i2) {
        if (((View) this.f2128U.get()) != null) {
            ArrayList arrayList = this.f2130W;
            if (!arrayList.isEmpty()) {
                int i3 = this.f2115G;
                if (i2 <= i3 && i3 != x()) {
                    x();
                }
                if (arrayList.size() > 0) {
                    E.h(arrayList.get(0));
                    throw null;
                }
            }
        }
    }

    public final int x() {
        int i2;
        if (this.f2136b) {
            return this.f2112D;
        }
        int i3 = this.f2111C;
        if (this.f2153r) {
            i2 = 0;
        } else {
            i2 = this.f2158w;
        }
        return Math.max(i3, i2);
    }

    public final boolean z() {
        WeakReference weakReference = this.f2128U;
        if (weakReference == null || weakReference.get() == null) {
            return false;
        }
        int[] iArr = new int[2];
        ((View) this.f2128U.get()).getLocationOnScreen(iArr);
        if (iArr[1] == 0) {
            return true;
        }
        return false;
    }

    public static View v(View view) {
        if (view.getVisibility() != 0) {
            return null;
        }
        WeakHashMap weakHashMap = Q.f509a;
        if (F.p(view)) {
            return view;
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            int childCount = viewGroup.getChildCount();
            for (int i2 = 0; i2 < childCount; i2++) {
                View v2 = v(viewGroup.getChildAt(i2));
                if (v2 != null) {
                    return v2;
                }
            }
        }
        return null;
    }

    public static int w(int i2, int i3, int i4, int i5) {
        int childMeasureSpec = ViewGroup.getChildMeasureSpec(i2, i3, i5);
        if (i4 == -1) {
            return childMeasureSpec;
        }
        int mode = View.MeasureSpec.getMode(childMeasureSpec);
        int size = View.MeasureSpec.getSize(childMeasureSpec);
        if (mode == 1073741824) {
            return View.MeasureSpec.makeMeasureSpec(Math.min(size, i4), 1073741824);
        }
        if (size != 0) {
            i4 = Math.min(size, i4);
        }
        return View.MeasureSpec.makeMeasureSpec(i4, Integer.MIN_VALUE);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0030, code lost:
        if (r3 != false) goto L_0x0032;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:4:0x0012, code lost:
        if (r1.o(r3.getLeft(), r0) != false) goto L_0x0032;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void E(android.view.View r3, int r4, boolean r5) {
        /*
            r2 = this;
            int r0 = r2.y(r4)
            V.e r1 = r2.f2120M
            if (r1 == 0) goto L_0x0040
            if (r5 == 0) goto L_0x0015
            int r3 = r3.getLeft()
            boolean r3 = r1.o(r3, r0)
            if (r3 == 0) goto L_0x0040
            goto L_0x0032
        L_0x0015:
            int r5 = r3.getLeft()
            r1.f974r = r3
            r3 = -1
            r1.f961c = r3
            r3 = 0
            boolean r3 = r1.h(r5, r0, r3, r3)
            if (r3 != 0) goto L_0x0030
            int r5 = r1.f959a
            if (r5 != 0) goto L_0x0030
            android.view.View r5 = r1.f974r
            if (r5 == 0) goto L_0x0030
            r5 = 0
            r1.f974r = r5
        L_0x0030:
            if (r3 == 0) goto L_0x0040
        L_0x0032:
            r3 = 2
            r2.C(r3)
            r3 = 1
            r2.G(r4, r3)
            L0.e r3 = r2.f2109A
            r3.a(r4)
            goto L_0x0043
        L_0x0040:
            r2.C(r4)
        L_0x0043:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.bottomsheet.BottomSheetBehavior.E(android.view.View, int, boolean):void");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v11, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v2, resolved type: android.view.View} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean f(androidx.coordinatorlayout.widget.CoordinatorLayout r10, android.view.View r11, android.view.MotionEvent r12) {
        /*
            r9 = this;
            boolean r0 = r11.isShown()
            r1 = 0
            r2 = 1
            if (r0 == 0) goto L_0x00dc
            boolean r0 = r9.f2118K
            if (r0 != 0) goto L_0x000e
            goto L_0x00dc
        L_0x000e:
            int r0 = r12.getActionMasked()
            r3 = 0
            r4 = -1
            if (r0 != 0) goto L_0x0023
            r9.f2132Y = r4
            r9.f2133Z = r4
            android.view.VelocityTracker r5 = r9.f2131X
            if (r5 == 0) goto L_0x0023
            r5.recycle()
            r9.f2131X = r3
        L_0x0023:
            android.view.VelocityTracker r5 = r9.f2131X
            if (r5 != 0) goto L_0x002d
            android.view.VelocityTracker r5 = android.view.VelocityTracker.obtain()
            r9.f2131X = r5
        L_0x002d:
            android.view.VelocityTracker r5 = r9.f2131X
            r5.addMovement(r12)
            r5 = 2
            if (r0 == 0) goto L_0x0046
            if (r0 == r2) goto L_0x003b
            r11 = 3
            if (r0 == r11) goto L_0x003b
            goto L_0x0089
        L_0x003b:
            r9.f2135a0 = r1
            r9.f2132Y = r4
            boolean r11 = r9.f2121N
            if (r11 == 0) goto L_0x0089
            r9.f2121N = r1
            return r1
        L_0x0046:
            float r6 = r12.getX()
            int r6 = (int) r6
            float r7 = r12.getY()
            int r7 = (int) r7
            r9.f2133Z = r7
            int r7 = r9.f2119L
            if (r7 == r5) goto L_0x0078
            java.lang.ref.WeakReference r7 = r9.f2129V
            if (r7 == 0) goto L_0x0061
            java.lang.Object r7 = r7.get()
            android.view.View r7 = (android.view.View) r7
            goto L_0x0062
        L_0x0061:
            r7 = r3
        L_0x0062:
            if (r7 == 0) goto L_0x0078
            int r8 = r9.f2133Z
            boolean r7 = r10.o(r7, r6, r8)
            if (r7 == 0) goto L_0x0078
            int r7 = r12.getActionIndex()
            int r7 = r12.getPointerId(r7)
            r9.f2132Y = r7
            r9.f2135a0 = r2
        L_0x0078:
            int r7 = r9.f2132Y
            if (r7 != r4) goto L_0x0086
            int r7 = r9.f2133Z
            boolean r11 = r10.o(r11, r6, r7)
            if (r11 != 0) goto L_0x0086
            r11 = 1
            goto L_0x0087
        L_0x0086:
            r11 = 0
        L_0x0087:
            r9.f2121N = r11
        L_0x0089:
            boolean r11 = r9.f2121N
            if (r11 != 0) goto L_0x0098
            V.e r11 = r9.f2120M
            if (r11 == 0) goto L_0x0098
            boolean r11 = r11.p(r12)
            if (r11 == 0) goto L_0x0098
            return r2
        L_0x0098:
            java.lang.ref.WeakReference r11 = r9.f2129V
            if (r11 == 0) goto L_0x00a3
            java.lang.Object r11 = r11.get()
            r3 = r11
            android.view.View r3 = (android.view.View) r3
        L_0x00a3:
            if (r0 != r5) goto L_0x00db
            if (r3 == 0) goto L_0x00db
            boolean r11 = r9.f2121N
            if (r11 != 0) goto L_0x00db
            int r11 = r9.f2119L
            if (r11 == r2) goto L_0x00db
            float r11 = r12.getX()
            int r11 = (int) r11
            float r0 = r12.getY()
            int r0 = (int) r0
            boolean r10 = r10.o(r3, r11, r0)
            if (r10 != 0) goto L_0x00db
            V.e r10 = r9.f2120M
            if (r10 == 0) goto L_0x00db
            int r10 = r9.f2133Z
            if (r10 == r4) goto L_0x00db
            float r10 = (float) r10
            float r11 = r12.getY()
            float r10 = r10 - r11
            float r10 = java.lang.Math.abs(r10)
            V.e r11 = r9.f2120M
            int r11 = r11.f960b
            float r11 = (float) r11
            int r10 = (r10 > r11 ? 1 : (r10 == r11 ? 0 : -1))
            if (r10 <= 0) goto L_0x00db
            r1 = 1
        L_0x00db:
            return r1
        L_0x00dc:
            r9.f2121N = r2
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.bottomsheet.BottomSheetBehavior.f(androidx.coordinatorlayout.widget.CoordinatorLayout, android.view.View, android.view.MotionEvent):boolean");
    }

    public final boolean h(CoordinatorLayout coordinatorLayout, View view, int i2, int i3, int i4) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        view.measure(w(i2, coordinatorLayout.getPaddingRight() + coordinatorLayout.getPaddingLeft() + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin + i3, this.f2146k, marginLayoutParams.width), w(i4, coordinatorLayout.getPaddingBottom() + coordinatorLayout.getPaddingTop() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin, this.f2147l, marginLayoutParams.height));
        return true;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0030, code lost:
        if (r4.getTop() <= r3.f2113E) goto L_0x00af;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x0071, code lost:
        if (java.lang.Math.abs(r5 - r3.f2112D) < java.lang.Math.abs(r5 - r3.f2115G)) goto L_0x00af;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x0080, code lost:
        if (r5 < java.lang.Math.abs(r5 - r3.f2115G)) goto L_0x00af;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x0090, code lost:
        if (java.lang.Math.abs(r5 - r2) < java.lang.Math.abs(r5 - r3.f2115G)) goto L_0x00ae;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x00ac, code lost:
        if (java.lang.Math.abs(r5 - r3.f2113E) < java.lang.Math.abs(r5 - r3.f2115G)) goto L_0x00ae;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void p(android.view.View r4, android.view.View r5, int r6) {
        /*
            r3 = this;
            int r6 = r4.getTop()
            int r0 = r3.x()
            r1 = 3
            if (r6 != r0) goto L_0x000f
            r3.C(r1)
            return
        L_0x000f:
            java.lang.ref.WeakReference r6 = r3.f2129V
            if (r6 == 0) goto L_0x00b5
            java.lang.Object r6 = r6.get()
            if (r5 != r6) goto L_0x00b5
            boolean r5 = r3.f2123P
            if (r5 != 0) goto L_0x001f
            goto L_0x00b5
        L_0x001f:
            int r5 = r3.f2122O
            r6 = 6
            if (r5 <= 0) goto L_0x0034
            boolean r5 = r3.f2136b
            if (r5 == 0) goto L_0x002a
            goto L_0x00af
        L_0x002a:
            int r5 = r4.getTop()
            int r0 = r3.f2113E
            if (r5 <= r0) goto L_0x00af
            goto L_0x00ae
        L_0x0034:
            boolean r5 = r3.I
            if (r5 == 0) goto L_0x0055
            android.view.VelocityTracker r5 = r3.f2131X
            if (r5 != 0) goto L_0x003e
            r5 = 0
            goto L_0x004d
        L_0x003e:
            r0 = 1000(0x3e8, float:1.401E-42)
            float r2 = r3.f2138c
            r5.computeCurrentVelocity(r0, r2)
            android.view.VelocityTracker r5 = r3.f2131X
            int r0 = r3.f2132Y
            float r5 = r5.getYVelocity(r0)
        L_0x004d:
            boolean r5 = r3.D(r4, r5)
            if (r5 == 0) goto L_0x0055
            r1 = 5
            goto L_0x00af
        L_0x0055:
            int r5 = r3.f2122O
            r0 = 4
            if (r5 != 0) goto L_0x0093
            int r5 = r4.getTop()
            boolean r2 = r3.f2136b
            if (r2 == 0) goto L_0x0074
            int r6 = r3.f2112D
            int r6 = r5 - r6
            int r6 = java.lang.Math.abs(r6)
            int r2 = r3.f2115G
            int r5 = r5 - r2
            int r5 = java.lang.Math.abs(r5)
            if (r6 >= r5) goto L_0x0097
            goto L_0x00af
        L_0x0074:
            int r2 = r3.f2113E
            if (r5 >= r2) goto L_0x0083
            int r0 = r3.f2115G
            int r0 = r5 - r0
            int r0 = java.lang.Math.abs(r0)
            if (r5 >= r0) goto L_0x00ae
            goto L_0x00af
        L_0x0083:
            int r1 = r5 - r2
            int r1 = java.lang.Math.abs(r1)
            int r2 = r3.f2115G
            int r5 = r5 - r2
            int r5 = java.lang.Math.abs(r5)
            if (r1 >= r5) goto L_0x0097
            goto L_0x00ae
        L_0x0093:
            boolean r5 = r3.f2136b
            if (r5 == 0) goto L_0x0099
        L_0x0097:
            r1 = 4
            goto L_0x00af
        L_0x0099:
            int r5 = r4.getTop()
            int r1 = r3.f2113E
            int r1 = r5 - r1
            int r1 = java.lang.Math.abs(r1)
            int r2 = r3.f2115G
            int r5 = r5 - r2
            int r5 = java.lang.Math.abs(r5)
            if (r1 >= r5) goto L_0x0097
        L_0x00ae:
            r1 = 6
        L_0x00af:
            r5 = 0
            r3.E(r4, r1, r5)
            r3.f2123P = r5
        L_0x00b5:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.bottomsheet.BottomSheetBehavior.p(android.view.View, android.view.View, int):void");
    }

    public final boolean q(View view, MotionEvent motionEvent) {
        if (!view.isShown()) {
            return false;
        }
        int actionMasked = motionEvent.getActionMasked();
        int i2 = this.f2119L;
        if (i2 == 1 && actionMasked == 0) {
            return true;
        }
        V.e eVar = this.f2120M;
        if (eVar != null && (this.f2118K || i2 == 1)) {
            eVar.j(motionEvent);
        }
        if (actionMasked == 0) {
            this.f2132Y = -1;
            this.f2133Z = -1;
            VelocityTracker velocityTracker = this.f2131X;
            if (velocityTracker != null) {
                velocityTracker.recycle();
                this.f2131X = null;
            }
        }
        if (this.f2131X == null) {
            this.f2131X = VelocityTracker.obtain();
        }
        this.f2131X.addMovement(motionEvent);
        if (this.f2120M != null && ((this.f2118K || this.f2119L == 1) && actionMasked == 2 && !this.f2121N)) {
            float abs = Math.abs(((float) this.f2133Z) - motionEvent.getY());
            V.e eVar2 = this.f2120M;
            if (abs > ((float) eVar2.f960b)) {
                eVar2.b(view, motionEvent.getPointerId(motionEvent.getActionIndex()));
            }
        }
        return !this.f2121N;
    }

    public final void r() {
        int t2 = t();
        if (this.f2136b) {
            this.f2115G = Math.max(this.f2127T - t2, this.f2112D);
        } else {
            this.f2115G = this.f2127T - t2;
        }
    }

    public BottomSheetBehavior(Context context, AttributeSet attributeSet) {
        int i2;
        this.f2144h = context.getResources().getDimensionPixelSize(2131165890);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C0322a.f4484a);
        int i3 = 3;
        if (obtainStyledAttributes.hasValue(3)) {
            this.f2145j = C0320a.J(context, obtainStyledAttributes, 3);
        }
        if (obtainStyledAttributes.hasValue(21)) {
            this.f2160y = k.b(context, attributeSet, 2130968711, 2131821401).a();
        }
        k kVar = this.f2160y;
        if (kVar != null) {
            g gVar = new g(kVar);
            this.i = gVar;
            gVar.h(context);
            ColorStateList colorStateList = this.f2145j;
            if (colorStateList != null) {
                this.i.j(colorStateList);
            } else {
                TypedValue typedValue = new TypedValue();
                context.getTheme().resolveAttribute(16842801, typedValue, true);
                this.i.setTint(typedValue.data);
            }
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(new float[]{s(), 1.0f});
        this.f2110B = ofFloat;
        ofFloat.setDuration(500);
        this.f2110B.addUpdateListener(new C(2, this));
        this.f2116H = obtainStyledAttributes.getDimension(2, -1.0f);
        if (obtainStyledAttributes.hasValue(0)) {
            this.f2146k = obtainStyledAttributes.getDimensionPixelSize(0, -1);
        }
        if (obtainStyledAttributes.hasValue(1)) {
            this.f2147l = obtainStyledAttributes.getDimensionPixelSize(1, -1);
        }
        TypedValue peekValue = obtainStyledAttributes.peekValue(9);
        if (peekValue == null || (i2 = peekValue.data) != -1) {
            A(obtainStyledAttributes.getDimensionPixelSize(9, -1));
        } else {
            A(i2);
        }
        boolean z2 = obtainStyledAttributes.getBoolean(8, false);
        if (this.I != z2) {
            this.I = z2;
            if (!z2 && this.f2119L == 5) {
                B(4);
            }
            F();
        }
        this.f2149n = obtainStyledAttributes.getBoolean(13, false);
        boolean z3 = obtainStyledAttributes.getBoolean(6, true);
        if (this.f2136b != z3) {
            this.f2136b = z3;
            if (this.f2128U != null) {
                r();
            }
            C((!this.f2136b || this.f2119L != 6) ? this.f2119L : i3);
            G(this.f2119L, true);
            F();
        }
        this.f2117J = obtainStyledAttributes.getBoolean(12, false);
        this.f2118K = obtainStyledAttributes.getBoolean(4, true);
        this.f2134a = obtainStyledAttributes.getInt(10, 0);
        float f2 = obtainStyledAttributes.getFloat(7, 0.5f);
        if (f2 <= 0.0f || f2 >= 1.0f) {
            throw new IllegalArgumentException("ratio must be a float value between 0 and 1");
        }
        this.f2114F = f2;
        if (this.f2128U != null) {
            this.f2113E = (int) ((1.0f - f2) * ((float) this.f2127T));
        }
        TypedValue peekValue2 = obtainStyledAttributes.peekValue(5);
        if (peekValue2 == null || peekValue2.type != 16) {
            int dimensionPixelOffset = obtainStyledAttributes.getDimensionPixelOffset(5, 0);
            if (dimensionPixelOffset >= 0) {
                this.f2111C = dimensionPixelOffset;
                G(this.f2119L, true);
            } else {
                throw new IllegalArgumentException("offset must be greater than or equal to 0");
            }
        } else {
            int i4 = peekValue2.data;
            if (i4 >= 0) {
                this.f2111C = i4;
                G(this.f2119L, true);
            } else {
                throw new IllegalArgumentException("offset must be greater than or equal to 0");
            }
        }
        this.f2140d = obtainStyledAttributes.getInt(11, 500);
        this.f2150o = obtainStyledAttributes.getBoolean(17, false);
        this.f2151p = obtainStyledAttributes.getBoolean(18, false);
        this.f2152q = obtainStyledAttributes.getBoolean(19, false);
        this.f2153r = obtainStyledAttributes.getBoolean(20, true);
        this.f2154s = obtainStyledAttributes.getBoolean(14, false);
        this.f2155t = obtainStyledAttributes.getBoolean(15, false);
        this.f2156u = obtainStyledAttributes.getBoolean(16, false);
        this.f2159x = obtainStyledAttributes.getBoolean(23, true);
        obtainStyledAttributes.recycle();
        this.f2138c = (float) ViewConfiguration.get(context).getScaledMaximumFlingVelocity();
    }
}
