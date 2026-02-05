package h;

import A.b;
import N.D;
import N.F;
import N.Q;
import N.X;
import N.Z;
import T0.g;
import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import android.view.View;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;
import androidx.appcompat.widget.ActionBarContainer;
import androidx.appcompat.widget.ActionBarContextView;
import androidx.appcompat.widget.ActionBarOverlayLayout;
import androidx.appcompat.widget.Toolbar;
import g.C0096a;
import java.util.ArrayList;
import java.util.WeakHashMap;
import m.i;
import m.j;
import o.C0272d;
import o.C0291m0;
import o.S0;
import o.f1;

public final class N extends g implements C0272d {

    /* renamed from: J  reason: collision with root package name */
    public static final AccelerateInterpolator f2924J = new AccelerateInterpolator();

    /* renamed from: K  reason: collision with root package name */
    public static final DecelerateInterpolator f2925K = new DecelerateInterpolator();

    /* renamed from: A  reason: collision with root package name */
    public boolean f2926A;

    /* renamed from: B  reason: collision with root package name */
    public boolean f2927B;

    /* renamed from: C  reason: collision with root package name */
    public boolean f2928C = true;

    /* renamed from: D  reason: collision with root package name */
    public j f2929D;

    /* renamed from: E  reason: collision with root package name */
    public boolean f2930E;

    /* renamed from: F  reason: collision with root package name */
    public boolean f2931F;

    /* renamed from: G  reason: collision with root package name */
    public final L f2932G = new L(this, 0);

    /* renamed from: H  reason: collision with root package name */
    public final L f2933H = new L(this, 1);
    public final b I = new b(28, (Object) this);

    /* renamed from: l  reason: collision with root package name */
    public Context f2934l;

    /* renamed from: m  reason: collision with root package name */
    public Context f2935m;

    /* renamed from: n  reason: collision with root package name */
    public ActionBarOverlayLayout f2936n;

    /* renamed from: o  reason: collision with root package name */
    public ActionBarContainer f2937o;

    /* renamed from: p  reason: collision with root package name */
    public C0291m0 f2938p;

    /* renamed from: q  reason: collision with root package name */
    public ActionBarContextView f2939q;

    /* renamed from: r  reason: collision with root package name */
    public final View f2940r;

    /* renamed from: s  reason: collision with root package name */
    public boolean f2941s;

    /* renamed from: t  reason: collision with root package name */
    public M f2942t;

    /* renamed from: u  reason: collision with root package name */
    public M f2943u;

    /* renamed from: v  reason: collision with root package name */
    public E.j f2944v;

    /* renamed from: w  reason: collision with root package name */
    public boolean f2945w;

    /* renamed from: x  reason: collision with root package name */
    public final ArrayList f2946x = new ArrayList();

    /* renamed from: y  reason: collision with root package name */
    public int f2947y = 0;

    /* renamed from: z  reason: collision with root package name */
    public boolean f2948z = true;

    public N(Activity activity, boolean z2) {
        new ArrayList();
        View decorView = activity.getWindow().getDecorView();
        X(decorView);
        if (!z2) {
            this.f2940r = decorView.findViewById(16908290);
        }
    }

    public final void V(boolean z2) {
        Z z3;
        Z z4;
        long j2;
        if (z2) {
            if (!this.f2927B) {
                this.f2927B = true;
                ActionBarOverlayLayout actionBarOverlayLayout = this.f2936n;
                if (actionBarOverlayLayout != null) {
                    actionBarOverlayLayout.setShowingForActionMode(true);
                }
                Z(false);
            }
        } else if (this.f2927B) {
            this.f2927B = false;
            ActionBarOverlayLayout actionBarOverlayLayout2 = this.f2936n;
            if (actionBarOverlayLayout2 != null) {
                actionBarOverlayLayout2.setShowingForActionMode(false);
            }
            Z(false);
        }
        if (this.f2937o.isLaidOut()) {
            if (z2) {
                f1 f1Var = (f1) this.f2938p;
                z4 = Q.a(f1Var.f4188a);
                z4.a(0.0f);
                z4.c(100);
                z4.d(new i(f1Var, 4));
                z3 = this.f2939q.i(0, 200);
            } else {
                f1 f1Var2 = (f1) this.f2938p;
                Z a2 = Q.a(f1Var2.f4188a);
                a2.a(1.0f);
                a2.c(200);
                a2.d(new i(f1Var2, 0));
                Z z5 = a2;
                z4 = this.f2939q.i(8, 100);
                z3 = z5;
            }
            j jVar = new j();
            ArrayList arrayList = jVar.f3665a;
            arrayList.add(z4);
            View view = (View) z4.f520a.get();
            if (view != null) {
                j2 = view.animate().getDuration();
            } else {
                j2 = 0;
            }
            View view2 = (View) z3.f520a.get();
            if (view2 != null) {
                view2.animate().setStartDelay(j2);
            }
            arrayList.add(z3);
            jVar.b();
        } else if (z2) {
            ((f1) this.f2938p).f4188a.setVisibility(4);
            this.f2939q.setVisibility(0);
        } else {
            ((f1) this.f2938p).f4188a.setVisibility(0);
            this.f2939q.setVisibility(8);
        }
    }

    public final void Y(boolean z2) {
        if (!z2) {
            ((f1) this.f2938p).getClass();
            this.f2937o.setTabContainer((S0) null);
        } else {
            this.f2937o.setTabContainer((S0) null);
            ((f1) this.f2938p).getClass();
        }
        this.f2938p.getClass();
        ((f1) this.f2938p).f4188a.setCollapsible(false);
        this.f2936n.setHasNonEmbeddedTabs(false);
    }

    public final Context W() {
        if (this.f2935m == null) {
            TypedValue typedValue = new TypedValue();
            this.f2934l.getTheme().resolveAttribute(2130968588, typedValue, true);
            int i = typedValue.resourceId;
            if (i != 0) {
                this.f2935m = new ContextThemeWrapper(this.f2934l, i);
            } else {
                this.f2935m = this.f2934l;
            }
        }
        return this.f2935m;
    }

    public final void Z(boolean z2) {
        boolean z3;
        boolean z4 = this.f2926A;
        if (!this.f2927B && z4) {
            z3 = false;
        } else {
            z3 = true;
        }
        View view = this.f2940r;
        X x2 = null;
        b bVar = this.I;
        if (z3) {
            if (!this.f2928C) {
                this.f2928C = true;
                j jVar = this.f2929D;
                if (jVar != null) {
                    jVar.a();
                }
                this.f2937o.setVisibility(0);
                int i = this.f2947y;
                L l2 = this.f2933H;
                if (i != 0 || (!this.f2930E && !z2)) {
                    this.f2937o.setAlpha(1.0f);
                    this.f2937o.setTranslationY(0.0f);
                    if (this.f2948z && view != null) {
                        view.setTranslationY(0.0f);
                    }
                    l2.a();
                } else {
                    this.f2937o.setTranslationY(0.0f);
                    float f2 = (float) (-this.f2937o.getHeight());
                    if (z2) {
                        int[] iArr = {0, 0};
                        this.f2937o.getLocationInWindow(iArr);
                        f2 -= (float) iArr[1];
                    }
                    this.f2937o.setTranslationY(f2);
                    j jVar2 = new j();
                    Z a2 = Q.a(this.f2937o);
                    a2.e(0.0f);
                    View view2 = (View) a2.f520a.get();
                    if (view2 != null) {
                        if (bVar != null) {
                            x2 = new X(bVar, view2);
                        }
                        view2.animate().setUpdateListener(x2);
                    }
                    boolean z5 = jVar2.e;
                    ArrayList arrayList = jVar2.f3665a;
                    if (!z5) {
                        arrayList.add(a2);
                    }
                    if (this.f2948z && view != null) {
                        view.setTranslationY(f2);
                        Z a3 = Q.a(view);
                        a3.e(0.0f);
                        if (!jVar2.e) {
                            arrayList.add(a3);
                        }
                    }
                    DecelerateInterpolator decelerateInterpolator = f2925K;
                    boolean z6 = jVar2.e;
                    if (!z6) {
                        jVar2.f3667c = decelerateInterpolator;
                    }
                    if (!z6) {
                        jVar2.f3666b = 250;
                    }
                    if (!z6) {
                        jVar2.f3668d = l2;
                    }
                    this.f2929D = jVar2;
                    jVar2.b();
                }
                ActionBarOverlayLayout actionBarOverlayLayout = this.f2936n;
                if (actionBarOverlayLayout != null) {
                    WeakHashMap weakHashMap = Q.f509a;
                    D.c(actionBarOverlayLayout);
                }
            }
        } else if (this.f2928C) {
            this.f2928C = false;
            j jVar3 = this.f2929D;
            if (jVar3 != null) {
                jVar3.a();
            }
            int i2 = this.f2947y;
            L l3 = this.f2932G;
            if (i2 != 0 || (!this.f2930E && !z2)) {
                l3.a();
                return;
            }
            this.f2937o.setAlpha(1.0f);
            this.f2937o.setTransitioning(true);
            j jVar4 = new j();
            float f3 = (float) (-this.f2937o.getHeight());
            if (z2) {
                int[] iArr2 = {0, 0};
                this.f2937o.getLocationInWindow(iArr2);
                f3 -= (float) iArr2[1];
            }
            Z a4 = Q.a(this.f2937o);
            a4.e(f3);
            View view3 = (View) a4.f520a.get();
            if (view3 != null) {
                if (bVar != null) {
                    x2 = new X(bVar, view3);
                }
                view3.animate().setUpdateListener(x2);
            }
            boolean z7 = jVar4.e;
            ArrayList arrayList2 = jVar4.f3665a;
            if (!z7) {
                arrayList2.add(a4);
            }
            if (this.f2948z && view != null) {
                Z a5 = Q.a(view);
                a5.e(f3);
                if (!jVar4.e) {
                    arrayList2.add(a5);
                }
            }
            AccelerateInterpolator accelerateInterpolator = f2924J;
            boolean z8 = jVar4.e;
            if (!z8) {
                jVar4.f3667c = accelerateInterpolator;
            }
            if (!z8) {
                jVar4.f3666b = 250;
            }
            if (!z8) {
                jVar4.f3668d = l3;
            }
            this.f2929D = jVar4;
            jVar4.b();
        }
    }

    public final void X(View view) {
        C0291m0 m0Var;
        boolean z2;
        String str;
        ActionBarOverlayLayout actionBarOverlayLayout = (ActionBarOverlayLayout) view.findViewById(2131296410);
        this.f2936n = actionBarOverlayLayout;
        if (actionBarOverlayLayout != null) {
            actionBarOverlayLayout.setActionBarVisibilityCallback(this);
        }
        View findViewById = view.findViewById(2131296309);
        if (findViewById instanceof C0291m0) {
            m0Var = (C0291m0) findViewById;
        } else if (findViewById instanceof Toolbar) {
            m0Var = ((Toolbar) findViewById).getWrapper();
        } else {
            if (findViewById != null) {
                str = findViewById.getClass().getSimpleName();
            } else {
                str = "null";
            }
            throw new IllegalStateException("Can't make a decor toolbar out of ".concat(str));
        }
        this.f2938p = m0Var;
        this.f2939q = (ActionBarContextView) view.findViewById(2131296317);
        ActionBarContainer actionBarContainer = (ActionBarContainer) view.findViewById(2131296311);
        this.f2937o = actionBarContainer;
        C0291m0 m0Var2 = this.f2938p;
        if (m0Var2 == null || this.f2939q == null || actionBarContainer == null) {
            throw new IllegalStateException(N.class.getSimpleName().concat(" can only be used with a compatible window decor layout"));
        }
        Context context = ((f1) m0Var2).f4188a.getContext();
        this.f2934l = context;
        if ((((f1) this.f2938p).f4189b & 4) != 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (z2) {
            this.f2941s = true;
        }
        int i = context.getApplicationInfo().targetSdkVersion;
        this.f2938p.getClass();
        Y(context.getResources().getBoolean(2131034112));
        TypedArray obtainStyledAttributes = this.f2934l.obtainStyledAttributes((AttributeSet) null, C0096a.f2519a, 2130968583, 0);
        if (obtainStyledAttributes.getBoolean(14, false)) {
            ActionBarOverlayLayout actionBarOverlayLayout2 = this.f2936n;
            if (actionBarOverlayLayout2.f1292l) {
                this.f2931F = true;
                actionBarOverlayLayout2.setHideOnContentScrollEnabled(true);
            } else {
                throw new IllegalStateException("Action bar must be in overlay mode (Window.FEATURE_OVERLAY_ACTION_BAR) to enable hide on content scroll");
            }
        }
        int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(12, 0);
        if (dimensionPixelSize != 0) {
            ActionBarContainer actionBarContainer2 = this.f2937o;
            WeakHashMap weakHashMap = Q.f509a;
            F.s(actionBarContainer2, (float) dimensionPixelSize);
        }
        obtainStyledAttributes.recycle();
    }

    public N(Dialog dialog) {
        new ArrayList();
        X(dialog.getWindow().getDecorView());
    }
}
