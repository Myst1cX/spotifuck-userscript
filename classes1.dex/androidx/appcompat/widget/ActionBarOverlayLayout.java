package androidx.appcompat.widget;

import F.c;
import N.C0015o;
import N.C0016p;
import N.C0017q;
import N.D;
import N.F;
import N.Q;
import N.Y;
import N.l0;
import N.m0;
import N.n0;
import N.o0;
import N.u0;
import N.w0;
import T0.g;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import android.view.Window;
import android.view.WindowInsets;
import android.widget.OverScroller;
import h.N;
import java.util.WeakHashMap;
import n.C0197l;
import n.C0208w;
import o.C0270c;
import o.C0272d;
import o.C0274e;
import o.C0276f;
import o.C0286k;
import o.C0289l0;
import o.C0291m0;
import o.a1;
import o.f1;

@SuppressLint({"UnknownNullness"})
public class ActionBarOverlayLayout extends ViewGroup implements C0289l0, C0015o, C0016p {

    /* renamed from: H  reason: collision with root package name */
    public static final int[] f1278H = {2130968581, 16842841};
    public static final w0 I;

    /* renamed from: J  reason: collision with root package name */
    public static final Rect f1279J = new Rect();

    /* renamed from: A  reason: collision with root package name */
    public OverScroller f1280A;

    /* renamed from: B  reason: collision with root package name */
    public ViewPropertyAnimator f1281B;

    /* renamed from: C  reason: collision with root package name */
    public final Y f1282C;

    /* renamed from: D  reason: collision with root package name */
    public final C0270c f1283D;

    /* renamed from: E  reason: collision with root package name */
    public final C0270c f1284E;

    /* renamed from: F  reason: collision with root package name */
    public final C0017q f1285F;

    /* renamed from: G  reason: collision with root package name */
    public final C0276f f1286G;

    /* renamed from: f  reason: collision with root package name */
    public int f1287f;

    /* renamed from: g  reason: collision with root package name */
    public int f1288g = 0;

    /* renamed from: h  reason: collision with root package name */
    public ContentFrameLayout f1289h;
    public ActionBarContainer i;

    /* renamed from: j  reason: collision with root package name */
    public C0291m0 f1290j;

    /* renamed from: k  reason: collision with root package name */
    public Drawable f1291k;

    /* renamed from: l  reason: collision with root package name */
    public boolean f1292l;

    /* renamed from: m  reason: collision with root package name */
    public boolean f1293m;

    /* renamed from: n  reason: collision with root package name */
    public boolean f1294n;

    /* renamed from: o  reason: collision with root package name */
    public boolean f1295o;

    /* renamed from: p  reason: collision with root package name */
    public int f1296p;

    /* renamed from: q  reason: collision with root package name */
    public int f1297q;

    /* renamed from: r  reason: collision with root package name */
    public final Rect f1298r = new Rect();

    /* renamed from: s  reason: collision with root package name */
    public final Rect f1299s = new Rect();

    /* renamed from: t  reason: collision with root package name */
    public final Rect f1300t = new Rect();

    /* renamed from: u  reason: collision with root package name */
    public final Rect f1301u = new Rect();

    /* renamed from: v  reason: collision with root package name */
    public w0 f1302v;

    /* renamed from: w  reason: collision with root package name */
    public w0 f1303w;

    /* renamed from: x  reason: collision with root package name */
    public w0 f1304x;

    /* renamed from: y  reason: collision with root package name */
    public w0 f1305y;

    /* renamed from: z  reason: collision with root package name */
    public C0272d f1306z;

    public final void e(View view, int i2, int i3, int[] iArr, int i4) {
    }

    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new ViewGroup.MarginLayoutParams(getContext(), attributeSet);
    }

    public final boolean onNestedPreFling(View view, float f2, float f3) {
        return false;
    }

    public final void onNestedPreScroll(View view, int i2, int i3, int[] iArr) {
    }

    public void setIcon(int i2) {
        k();
        f1 f1Var = (f1) this.f1290j;
        f1Var.f4191d = i2 != 0 ? g.n(f1Var.f4188a.getContext(), i2) : null;
        f1Var.c();
    }

    public void setShowingForActionMode(boolean z2) {
    }

    public void setUiOptions(int i2) {
    }

    public final boolean shouldDelayChildPressedState() {
        return false;
    }

    public final void a(View view, View view2, int i2, int i3) {
        if (i3 == 0) {
            onNestedScrollAccepted(view, view2, i2);
        }
    }

    public final void c(View view, int i2, int i3, int i4, int i5, int i6) {
        if (i6 == 0) {
            onNestedScroll(view, i2, i3, i4, i5);
        }
    }

    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof C0274e;
    }

    public final void d(View view, int i2) {
        if (i2 == 0) {
            onStopNestedScroll(view);
        }
    }

    public final boolean f(View view, View view2, int i2, int i3) {
        if (i3 != 0 || !onStartNestedScroll(view, view2, i2)) {
            return false;
        }
        return true;
    }

    public final ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new ViewGroup.MarginLayoutParams(-1, -1);
    }

    public int getActionBarHideOffset() {
        ActionBarContainer actionBarContainer = this.i;
        if (actionBarContainer != null) {
            return -((int) actionBarContainer.getTranslationY());
        }
        return 0;
    }

    public int getNestedScrollAxes() {
        C0017q qVar = this.f1285F;
        return qVar.f585b | qVar.f584a;
    }

    public final void h() {
        removeCallbacks(this.f1283D);
        removeCallbacks(this.f1284E);
        ViewPropertyAnimator viewPropertyAnimator = this.f1281B;
        if (viewPropertyAnimator != null) {
            viewPropertyAnimator.cancel();
        }
    }

    public final void k() {
        C0291m0 m0Var;
        if (this.f1289h == null) {
            this.f1289h = (ContentFrameLayout) findViewById(2131296310);
            this.i = (ActionBarContainer) findViewById(2131296311);
            View findViewById = findViewById(2131296309);
            if (findViewById instanceof C0291m0) {
                m0Var = (C0291m0) findViewById;
            } else if (findViewById instanceof Toolbar) {
                m0Var = ((Toolbar) findViewById).getWrapper();
            } else {
                throw new IllegalStateException("Can't make a decor toolbar out of ".concat(findViewById.getClass().getSimpleName()));
            }
            this.f1290j = m0Var;
        }
    }

    public final boolean onNestedFling(View view, float f2, float f3, boolean z2) {
        if (!this.f1294n || !z2) {
            return false;
        }
        this.f1280A.fling(0, 0, 0, (int) f3, 0, 0, Integer.MIN_VALUE, Integer.MAX_VALUE);
        if (this.f1280A.getFinalY() > this.i.getHeight()) {
            h();
            this.f1284E.run();
        } else {
            h();
            this.f1283D.run();
        }
        this.f1295o = true;
        return true;
    }

    public final void onNestedScroll(View view, int i2, int i3, int i4, int i5) {
        int i6 = this.f1296p + i3;
        this.f1296p = i6;
        setActionBarHideOffset(i6);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0011, code lost:
        r1 = (h.N) r1;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onNestedScrollAccepted(android.view.View r1, android.view.View r2, int r3) {
        /*
            r0 = this;
            N.q r1 = r0.f1285F
            r1.f584a = r3
            int r1 = r0.getActionBarHideOffset()
            r0.f1296p = r1
            r0.h()
            o.d r1 = r0.f1306z
            if (r1 == 0) goto L_0x001d
            h.N r1 = (h.N) r1
            m.j r2 = r1.f2929D
            if (r2 == 0) goto L_0x001d
            r2.a()
            r2 = 0
            r1.f2929D = r2
        L_0x001d:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.ActionBarOverlayLayout.onNestedScrollAccepted(android.view.View, android.view.View, int):void");
    }

    public final boolean onStartNestedScroll(View view, View view2, int i2) {
        if ((i2 & 2) == 0 || this.i.getVisibility() != 0) {
            return false;
        }
        return this.f1294n;
    }

    public final void onStopNestedScroll(View view) {
        if (this.f1294n && !this.f1295o) {
            if (this.f1296p <= this.i.getHeight()) {
                h();
                postDelayed(this.f1283D, 600);
                return;
            }
            h();
            postDelayed(this.f1284E, 600);
        }
    }

    public void setActionBarVisibilityCallback(C0272d dVar) {
        this.f1306z = dVar;
        if (getWindowToken() != null) {
            ((N) this.f1306z).f2947y = this.f1288g;
            int i2 = this.f1297q;
            if (i2 != 0) {
                onWindowSystemUiVisibilityChanged(i2);
                WeakHashMap weakHashMap = Q.f509a;
                D.c(this);
            }
        }
    }

    public void setHasNonEmbeddedTabs(boolean z2) {
        this.f1293m = z2;
    }

    public void setHideOnContentScrollEnabled(boolean z2) {
        if (z2 != this.f1294n) {
            this.f1294n = z2;
            if (!z2) {
                h();
                setActionBarHideOffset(0);
            }
        }
    }

    public void setOverlayMode(boolean z2) {
        this.f1292l = z2;
    }

    static {
        o0 o0Var;
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 30) {
            o0Var = new n0();
        } else if (i2 >= 29) {
            o0Var = new m0();
        } else {
            o0Var = new l0();
        }
        o0Var.g(c.b(0, 1, 0, 1));
        I = o0Var.b();
    }

    /* JADX WARNING: type inference failed for: r3v14, types: [N.q, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r3v15, types: [o.f, android.view.View] */
    public ActionBarOverlayLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        new Rect();
        new Rect();
        new Rect();
        new Rect();
        w0 w0Var = w0.f596b;
        this.f1302v = w0Var;
        this.f1303w = w0Var;
        this.f1304x = w0Var;
        this.f1305y = w0Var;
        this.f1282C = new Y(3, (Object) this);
        this.f1283D = new C0270c(this, 0);
        this.f1284E = new C0270c(this, 1);
        i(context);
        this.f1285F = new Object();
        ? view = new View(context);
        view.setWillNotDraw(true);
        this.f1286G = view;
        addView(view);
    }

    public static boolean g(View view, Rect rect, boolean z2) {
        boolean z3;
        int i2;
        C0274e eVar = (C0274e) view.getLayoutParams();
        int i3 = eVar.leftMargin;
        int i4 = rect.left;
        if (i3 != i4) {
            eVar.leftMargin = i4;
            z3 = true;
        } else {
            z3 = false;
        }
        int i5 = eVar.topMargin;
        int i6 = rect.top;
        if (i5 != i6) {
            eVar.topMargin = i6;
            z3 = true;
        }
        int i7 = eVar.rightMargin;
        int i8 = rect.right;
        if (i7 != i8) {
            eVar.rightMargin = i8;
            z3 = true;
        }
        if (!z2 || eVar.bottomMargin == (i2 = rect.bottom)) {
            return z3;
        }
        eVar.bottomMargin = i2;
        return true;
    }

    public final void b(View view, int i2, int i3, int i4, int i5, int i6, int[] iArr) {
        c(view, i2, i3, i4, i5, i6);
    }

    public final void draw(Canvas canvas) {
        int i2;
        super.draw(canvas);
        if (this.f1291k != null) {
            if (this.i.getVisibility() == 0) {
                i2 = (int) (this.i.getTranslationY() + ((float) this.i.getBottom()) + 0.5f);
            } else {
                i2 = 0;
            }
            this.f1291k.setBounds(0, i2, getWidth(), this.f1291k.getIntrinsicHeight() + i2);
            this.f1291k.draw(canvas);
        }
    }

    public final boolean fitSystemWindows(Rect rect) {
        return super.fitSystemWindows(rect);
    }

    public final ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new ViewGroup.MarginLayoutParams(layoutParams);
    }

    public CharSequence getTitle() {
        k();
        return ((f1) this.f1290j).f4188a.getTitle();
    }

    public final void i(Context context) {
        TypedArray obtainStyledAttributes = getContext().getTheme().obtainStyledAttributes(f1278H);
        boolean z2 = false;
        this.f1287f = obtainStyledAttributes.getDimensionPixelSize(0, 0);
        Drawable drawable = obtainStyledAttributes.getDrawable(1);
        this.f1291k = drawable;
        if (drawable == null) {
            z2 = true;
        }
        setWillNotDraw(z2);
        obtainStyledAttributes.recycle();
        this.f1280A = new OverScroller(context);
    }

    public final void j(int i2) {
        k();
        if (i2 == 2) {
            this.f1290j.getClass();
        } else if (i2 == 5) {
            this.f1290j.getClass();
        } else if (i2 == 109) {
            setOverlayMode(true);
        }
    }

    public final void l(C0197l lVar, C0208w wVar) {
        k();
        f1 f1Var = (f1) this.f1290j;
        C0286k kVar = f1Var.f4198m;
        Toolbar toolbar = f1Var.f4188a;
        if (kVar == null) {
            f1Var.f4198m = new C0286k(toolbar.getContext());
        }
        C0286k kVar2 = f1Var.f4198m;
        kVar2.f4244j = wVar;
        if (lVar != null || toolbar.f1396f != null) {
            toolbar.f();
            C0197l lVar2 = toolbar.f1396f.f1312u;
            if (lVar2 != lVar) {
                if (lVar2 != null) {
                    lVar2.r(toolbar.f1389P);
                    lVar2.r(toolbar.f1390Q);
                }
                if (toolbar.f1390Q == null) {
                    toolbar.f1390Q = new a1(toolbar);
                }
                kVar2.f4256v = true;
                if (lVar != null) {
                    lVar.b(kVar2, toolbar.f1404o);
                    lVar.b(toolbar.f1390Q, toolbar.f1404o);
                } else {
                    kVar2.f(toolbar.f1404o, (C0197l) null);
                    toolbar.f1390Q.f(toolbar.f1404o, (C0197l) null);
                    kVar2.c();
                    toolbar.f1390Q.c();
                }
                toolbar.f1396f.setPopupTheme(toolbar.f1405p);
                toolbar.f1396f.setPresenter(kVar2);
                toolbar.f1389P = kVar2;
                toolbar.u();
            }
        }
    }

    public final WindowInsets onApplyWindowInsets(WindowInsets windowInsets) {
        k();
        w0 g2 = w0.g(this, windowInsets);
        boolean g3 = g(this.i, new Rect(g2.b(), g2.d(), g2.c(), g2.a()), false);
        WeakHashMap weakHashMap = Q.f509a;
        Rect rect = this.f1298r;
        F.b(this, g2, rect);
        int i2 = rect.left;
        int i3 = rect.top;
        int i4 = rect.right;
        int i5 = rect.bottom;
        u0 u0Var = g2.f597a;
        w0 l2 = u0Var.l(i2, i3, i4, i5);
        this.f1302v = l2;
        boolean z2 = true;
        if (!this.f1303w.equals(l2)) {
            this.f1303w = this.f1302v;
            g3 = true;
        }
        Rect rect2 = this.f1299s;
        if (!rect2.equals(rect)) {
            rect2.set(rect);
        } else {
            z2 = g3;
        }
        if (z2) {
            requestLayout();
        }
        return u0Var.a().f597a.c().f597a.b().f();
    }

    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        i(getContext());
        WeakHashMap weakHashMap = Q.f509a;
        D.c(this);
    }

    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        h();
    }

    public final void onLayout(boolean z2, int i2, int i3, int i4, int i5) {
        int childCount = getChildCount();
        int paddingLeft = getPaddingLeft();
        int paddingTop = getPaddingTop();
        for (int i6 = 0; i6 < childCount; i6++) {
            View childAt = getChildAt(i6);
            if (childAt.getVisibility() != 8) {
                C0274e eVar = (C0274e) childAt.getLayoutParams();
                int measuredWidth = childAt.getMeasuredWidth();
                int measuredHeight = childAt.getMeasuredHeight();
                int i7 = eVar.leftMargin + paddingLeft;
                int i8 = eVar.topMargin + paddingTop;
                childAt.layout(i7, i8, measuredWidth + i7, measuredHeight + i8);
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:30:0x00fc  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onMeasure(int r13, int r14) {
        /*
            r12 = this;
            r12.k()
            androidx.appcompat.widget.ActionBarContainer r1 = r12.i
            r3 = 0
            r5 = 0
            r0 = r12
            r2 = r13
            r4 = r14
            r0.measureChildWithMargins(r1, r2, r3, r4, r5)
            androidx.appcompat.widget.ActionBarContainer r0 = r12.i
            android.view.ViewGroup$LayoutParams r0 = r0.getLayoutParams()
            o.e r0 = (o.C0274e) r0
            androidx.appcompat.widget.ActionBarContainer r1 = r12.i
            int r1 = r1.getMeasuredWidth()
            int r2 = r0.leftMargin
            int r1 = r1 + r2
            int r2 = r0.rightMargin
            int r1 = r1 + r2
            r2 = 0
            int r1 = java.lang.Math.max(r2, r1)
            androidx.appcompat.widget.ActionBarContainer r3 = r12.i
            int r3 = r3.getMeasuredHeight()
            int r4 = r0.topMargin
            int r3 = r3 + r4
            int r0 = r0.bottomMargin
            int r3 = r3 + r0
            int r0 = java.lang.Math.max(r2, r3)
            androidx.appcompat.widget.ActionBarContainer r3 = r12.i
            int r3 = r3.getMeasuredState()
            int r3 = android.view.View.combineMeasuredStates(r2, r3)
            java.util.WeakHashMap r4 = N.Q.f509a
            int r4 = r12.getWindowSystemUiVisibility()
            r4 = r4 & 256(0x100, float:3.59E-43)
            r5 = 1
            if (r4 == 0) goto L_0x004d
            r4 = 1
            goto L_0x004e
        L_0x004d:
            r4 = 0
        L_0x004e:
            if (r4 == 0) goto L_0x0062
            int r6 = r12.f1287f
            boolean r7 = r12.f1293m
            if (r7 == 0) goto L_0x0074
            androidx.appcompat.widget.ActionBarContainer r7 = r12.i
            android.view.View r7 = r7.getTabContainer()
            if (r7 == 0) goto L_0x0074
            int r7 = r12.f1287f
            int r6 = r6 + r7
            goto L_0x0074
        L_0x0062:
            androidx.appcompat.widget.ActionBarContainer r6 = r12.i
            int r6 = r6.getVisibility()
            r7 = 8
            if (r6 == r7) goto L_0x0073
            androidx.appcompat.widget.ActionBarContainer r6 = r12.i
            int r6 = r6.getMeasuredHeight()
            goto L_0x0074
        L_0x0073:
            r6 = 0
        L_0x0074:
            android.graphics.Rect r7 = r12.f1298r
            android.graphics.Rect r8 = r12.f1300t
            r8.set(r7)
            N.w0 r7 = r12.f1302v
            r12.f1304x = r7
            boolean r7 = r12.f1292l
            if (r7 != 0) goto L_0x00aa
            if (r4 != 0) goto L_0x00aa
            o.f r4 = r12.f1286G
            N.w0 r7 = I
            android.graphics.Rect r9 = r12.f1301u
            N.F.b(r4, r7, r9)
            android.graphics.Rect r4 = f1279J
            boolean r4 = r9.equals(r4)
            if (r4 != 0) goto L_0x00aa
            int r4 = r8.top
            int r4 = r4 + r6
            r8.top = r4
            int r4 = r8.bottom
            r8.bottom = r4
            N.w0 r4 = r12.f1304x
            N.u0 r4 = r4.f597a
            N.w0 r2 = r4.l(r2, r6, r2, r2)
            r12.f1304x = r2
            goto L_0x00ed
        L_0x00aa:
            N.w0 r2 = r12.f1304x
            int r2 = r2.b()
            N.w0 r4 = r12.f1304x
            int r4 = r4.d()
            int r4 = r4 + r6
            N.w0 r6 = r12.f1304x
            int r6 = r6.c()
            N.w0 r7 = r12.f1304x
            int r7 = r7.a()
            F.c r2 = F.c.b(r2, r4, r6, r7)
            N.w0 r4 = r12.f1304x
            int r6 = android.os.Build.VERSION.SDK_INT
            r7 = 30
            if (r6 < r7) goto L_0x00d5
            N.n0 r6 = new N.n0
            r6.<init>(r4)
            goto L_0x00e4
        L_0x00d5:
            r7 = 29
            if (r6 < r7) goto L_0x00df
            N.m0 r6 = new N.m0
            r6.<init>(r4)
            goto L_0x00e4
        L_0x00df:
            N.l0 r6 = new N.l0
            r6.<init>(r4)
        L_0x00e4:
            r6.g(r2)
            N.w0 r2 = r6.b()
            r12.f1304x = r2
        L_0x00ed:
            androidx.appcompat.widget.ContentFrameLayout r2 = r12.f1289h
            g(r2, r8, r5)
            N.w0 r2 = r12.f1305y
            N.w0 r4 = r12.f1304x
            boolean r2 = r2.equals(r4)
            if (r2 != 0) goto L_0x0115
            N.w0 r2 = r12.f1304x
            r12.f1305y = r2
            androidx.appcompat.widget.ContentFrameLayout r4 = r12.f1289h
            android.view.WindowInsets r2 = r2.f()
            if (r2 == 0) goto L_0x0115
            android.view.WindowInsets r5 = N.D.a(r4, r2)
            boolean r2 = r5.equals(r2)
            if (r2 != 0) goto L_0x0115
            N.w0.g(r4, r5)
        L_0x0115:
            androidx.appcompat.widget.ContentFrameLayout r7 = r12.f1289h
            r9 = 0
            r11 = 0
            r6 = r12
            r8 = r13
            r10 = r14
            r6.measureChildWithMargins(r7, r8, r9, r10, r11)
            androidx.appcompat.widget.ContentFrameLayout r2 = r12.f1289h
            android.view.ViewGroup$LayoutParams r2 = r2.getLayoutParams()
            o.e r2 = (o.C0274e) r2
            androidx.appcompat.widget.ContentFrameLayout r4 = r12.f1289h
            int r4 = r4.getMeasuredWidth()
            int r5 = r2.leftMargin
            int r4 = r4 + r5
            int r5 = r2.rightMargin
            int r4 = r4 + r5
            int r1 = java.lang.Math.max(r1, r4)
            androidx.appcompat.widget.ContentFrameLayout r4 = r12.f1289h
            int r4 = r4.getMeasuredHeight()
            int r5 = r2.topMargin
            int r4 = r4 + r5
            int r2 = r2.bottomMargin
            int r4 = r4 + r2
            int r0 = java.lang.Math.max(r0, r4)
            androidx.appcompat.widget.ContentFrameLayout r2 = r12.f1289h
            int r2 = r2.getMeasuredState()
            int r2 = android.view.View.combineMeasuredStates(r3, r2)
            int r3 = r12.getPaddingLeft()
            int r4 = r12.getPaddingRight()
            int r4 = r4 + r3
            int r4 = r4 + r1
            int r1 = r12.getPaddingTop()
            int r3 = r12.getPaddingBottom()
            int r3 = r3 + r1
            int r3 = r3 + r0
            int r0 = r12.getSuggestedMinimumHeight()
            int r0 = java.lang.Math.max(r3, r0)
            int r1 = r12.getSuggestedMinimumWidth()
            int r1 = java.lang.Math.max(r4, r1)
            int r13 = android.view.View.resolveSizeAndState(r1, r13, r2)
            int r1 = r2 << 16
            int r14 = android.view.View.resolveSizeAndState(r0, r14, r1)
            r12.setMeasuredDimension(r13, r14)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.ActionBarOverlayLayout.onMeasure(int, int):void");
    }

    public final void onWindowSystemUiVisibilityChanged(int i2) {
        boolean z2;
        boolean z3;
        super.onWindowSystemUiVisibilityChanged(i2);
        k();
        int i3 = this.f1297q ^ i2;
        this.f1297q = i2;
        if ((i2 & 4) == 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        if ((i2 & 256) != 0) {
            z3 = true;
        } else {
            z3 = false;
        }
        C0272d dVar = this.f1306z;
        if (dVar != null) {
            N n2 = (N) dVar;
            n2.f2948z = !z3;
            if (z2 || !z3) {
                if (n2.f2926A) {
                    n2.f2926A = false;
                    n2.Z(true);
                }
            } else if (!n2.f2926A) {
                n2.f2926A = true;
                n2.Z(true);
            }
        }
        if ((i3 & 256) != 0 && this.f1306z != null) {
            WeakHashMap weakHashMap = Q.f509a;
            D.c(this);
        }
    }

    public final void onWindowVisibilityChanged(int i2) {
        super.onWindowVisibilityChanged(i2);
        this.f1288g = i2;
        C0272d dVar = this.f1306z;
        if (dVar != null) {
            ((N) dVar).f2947y = i2;
        }
    }

    public void setActionBarHideOffset(int i2) {
        h();
        this.i.setTranslationY((float) (-Math.max(0, Math.min(i2, this.i.getHeight()))));
    }

    public void setLogo(int i2) {
        Drawable drawable;
        k();
        f1 f1Var = (f1) this.f1290j;
        if (i2 != 0) {
            drawable = g.n(f1Var.f4188a.getContext(), i2);
        } else {
            drawable = null;
        }
        f1Var.e = drawable;
        f1Var.c();
    }

    public void setWindowCallback(Window.Callback callback) {
        k();
        ((f1) this.f1290j).f4196k = callback;
    }

    public void setWindowTitle(CharSequence charSequence) {
        k();
        f1 f1Var = (f1) this.f1290j;
        if (!f1Var.f4193g) {
            f1Var.f4194h = charSequence;
            if ((f1Var.f4189b & 8) != 0) {
                Toolbar toolbar = f1Var.f4188a;
                toolbar.setTitle(charSequence);
                if (f1Var.f4193g) {
                    Q.q(toolbar.getRootView(), charSequence);
                }
            }
        }
    }

    public void setIcon(Drawable drawable) {
        k();
        f1 f1Var = (f1) this.f1290j;
        f1Var.f4191d = drawable;
        f1Var.c();
    }
}
