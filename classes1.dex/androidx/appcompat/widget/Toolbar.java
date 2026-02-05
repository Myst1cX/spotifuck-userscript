package androidx.appcompat.widget;

import N.C0012l;
import N.Q;
import N0.B;
import R0.i;
import T0.g;
import U.b;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Parcelable;
import android.support.v4.media.session.t;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.ContextThemeWrapper;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.window.OnBackInvokedCallback;
import android.window.OnBackInvokedDispatcher;
import androidx.fragment.app.A;
import g.C0096a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import m.h;
import n.C0197l;
import n.C0199n;
import o.C0273d0;
import o.C0286k;
import o.C0291m0;
import o.C0310w;
import o.C0314y;
import o.R0;
import o.X0;
import o.Y0;
import o.Z0;
import o.a1;
import o.b1;
import o.c1;
import o.d1;
import o.e1;
import o.f1;
import o.n1;

public class Toolbar extends ViewGroup implements C0012l {

    /* renamed from: A  reason: collision with root package name */
    public int f1375A;

    /* renamed from: B  reason: collision with root package name */
    public final int f1376B;

    /* renamed from: C  reason: collision with root package name */
    public CharSequence f1377C;

    /* renamed from: D  reason: collision with root package name */
    public CharSequence f1378D;

    /* renamed from: E  reason: collision with root package name */
    public ColorStateList f1379E;

    /* renamed from: F  reason: collision with root package name */
    public ColorStateList f1380F;

    /* renamed from: G  reason: collision with root package name */
    public boolean f1381G;

    /* renamed from: H  reason: collision with root package name */
    public boolean f1382H;
    public final ArrayList I;

    /* renamed from: J  reason: collision with root package name */
    public final ArrayList f1383J;

    /* renamed from: K  reason: collision with root package name */
    public final int[] f1384K;

    /* renamed from: L  reason: collision with root package name */
    public final t f1385L;

    /* renamed from: M  reason: collision with root package name */
    public ArrayList f1386M;

    /* renamed from: N  reason: collision with root package name */
    public final Y0 f1387N;

    /* renamed from: O  reason: collision with root package name */
    public f1 f1388O;

    /* renamed from: P  reason: collision with root package name */
    public C0286k f1389P;

    /* renamed from: Q  reason: collision with root package name */
    public a1 f1390Q;

    /* renamed from: R  reason: collision with root package name */
    public boolean f1391R;

    /* renamed from: S  reason: collision with root package name */
    public OnBackInvokedCallback f1392S;

    /* renamed from: T  reason: collision with root package name */
    public OnBackInvokedDispatcher f1393T;

    /* renamed from: U  reason: collision with root package name */
    public boolean f1394U;

    /* renamed from: V  reason: collision with root package name */
    public final B f1395V;

    /* renamed from: f  reason: collision with root package name */
    public ActionMenuView f1396f;

    /* renamed from: g  reason: collision with root package name */
    public C0273d0 f1397g;

    /* renamed from: h  reason: collision with root package name */
    public C0273d0 f1398h;
    public C0310w i;

    /* renamed from: j  reason: collision with root package name */
    public C0314y f1399j;

    /* renamed from: k  reason: collision with root package name */
    public final Drawable f1400k;

    /* renamed from: l  reason: collision with root package name */
    public final CharSequence f1401l;

    /* renamed from: m  reason: collision with root package name */
    public C0310w f1402m;

    /* renamed from: n  reason: collision with root package name */
    public View f1403n;

    /* renamed from: o  reason: collision with root package name */
    public Context f1404o;

    /* renamed from: p  reason: collision with root package name */
    public int f1405p;

    /* renamed from: q  reason: collision with root package name */
    public int f1406q;

    /* renamed from: r  reason: collision with root package name */
    public int f1407r;

    /* renamed from: s  reason: collision with root package name */
    public final int f1408s;

    /* renamed from: t  reason: collision with root package name */
    public final int f1409t;

    /* renamed from: u  reason: collision with root package name */
    public int f1410u;

    /* renamed from: v  reason: collision with root package name */
    public int f1411v;

    /* renamed from: w  reason: collision with root package name */
    public int f1412w;

    /* renamed from: x  reason: collision with root package name */
    public int f1413x;

    /* renamed from: y  reason: collision with root package name */
    public R0 f1414y;

    /* renamed from: z  reason: collision with root package name */
    public int f1415z;

    public Toolbar(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public final /* bridge */ /* synthetic */ ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return i(layoutParams);
    }

    public void setCollapseContentDescription(int i2) {
        setCollapseContentDescription(i2 != 0 ? getContext().getText(i2) : null);
    }

    public void setCollapseIcon(int i2) {
        setCollapseIcon(g.n(getContext(), i2));
    }

    public void setLogo(int i2) {
        setLogo(g.n(getContext(), i2));
    }

    public void setLogoDescription(int i2) {
        setLogoDescription(getContext().getText(i2));
    }

    public void setNavigationContentDescription(int i2) {
        setNavigationContentDescription(i2 != 0 ? getContext().getText(i2) : null);
    }

    public void setNavigationIcon(int i2) {
        setNavigationIcon(g.n(getContext(), i2));
    }

    public void setSubtitle(int i2) {
        setSubtitle(getContext().getText(i2));
    }

    public void setSubtitleTextColor(int i2) {
        setSubtitleTextColor(ColorStateList.valueOf(i2));
    }

    public void setTitle(int i2) {
        setTitle(getContext().getText(i2));
    }

    public void setTitleTextColor(int i2) {
        setTitleTextColor(ColorStateList.valueOf(i2));
    }

    public Toolbar(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, 2130969838);
        this.f1376B = 8388627;
        this.I = new ArrayList();
        this.f1383J = new ArrayList();
        this.f1384K = new int[2];
        this.f1385L = new t((Runnable) new X0(this, 1));
        this.f1386M = new ArrayList();
        this.f1387N = new Y0(this);
        this.f1395V = new B(18, this);
        Context context2 = getContext();
        int[] iArr = C0096a.f2540x;
        t A2 = t.A(context2, attributeSet, iArr, 2130969838);
        Q.o(this, context, iArr, attributeSet, (TypedArray) A2.f1132c, 2130969838);
        TypedArray typedArray = (TypedArray) A2.f1132c;
        this.f1406q = typedArray.getResourceId(28, 0);
        this.f1407r = typedArray.getResourceId(19, 0);
        this.f1376B = typedArray.getInteger(0, 8388627);
        this.f1408s = typedArray.getInteger(2, 48);
        int dimensionPixelOffset = typedArray.getDimensionPixelOffset(22, 0);
        dimensionPixelOffset = typedArray.hasValue(27) ? typedArray.getDimensionPixelOffset(27, dimensionPixelOffset) : dimensionPixelOffset;
        this.f1413x = dimensionPixelOffset;
        this.f1412w = dimensionPixelOffset;
        this.f1411v = dimensionPixelOffset;
        this.f1410u = dimensionPixelOffset;
        int dimensionPixelOffset2 = typedArray.getDimensionPixelOffset(25, -1);
        if (dimensionPixelOffset2 >= 0) {
            this.f1410u = dimensionPixelOffset2;
        }
        int dimensionPixelOffset3 = typedArray.getDimensionPixelOffset(24, -1);
        if (dimensionPixelOffset3 >= 0) {
            this.f1411v = dimensionPixelOffset3;
        }
        int dimensionPixelOffset4 = typedArray.getDimensionPixelOffset(26, -1);
        if (dimensionPixelOffset4 >= 0) {
            this.f1412w = dimensionPixelOffset4;
        }
        int dimensionPixelOffset5 = typedArray.getDimensionPixelOffset(23, -1);
        if (dimensionPixelOffset5 >= 0) {
            this.f1413x = dimensionPixelOffset5;
        }
        this.f1409t = typedArray.getDimensionPixelSize(13, -1);
        int dimensionPixelOffset6 = typedArray.getDimensionPixelOffset(9, Integer.MIN_VALUE);
        int dimensionPixelOffset7 = typedArray.getDimensionPixelOffset(5, Integer.MIN_VALUE);
        int dimensionPixelSize = typedArray.getDimensionPixelSize(7, 0);
        int dimensionPixelSize2 = typedArray.getDimensionPixelSize(8, 0);
        d();
        R0 r02 = this.f1414y;
        r02.f4136h = false;
        if (dimensionPixelSize != Integer.MIN_VALUE) {
            r02.e = dimensionPixelSize;
            r02.f4130a = dimensionPixelSize;
        }
        if (dimensionPixelSize2 != Integer.MIN_VALUE) {
            r02.f4134f = dimensionPixelSize2;
            r02.f4131b = dimensionPixelSize2;
        }
        if (!(dimensionPixelOffset6 == Integer.MIN_VALUE && dimensionPixelOffset7 == Integer.MIN_VALUE)) {
            r02.a(dimensionPixelOffset6, dimensionPixelOffset7);
        }
        this.f1415z = typedArray.getDimensionPixelOffset(10, Integer.MIN_VALUE);
        this.f1375A = typedArray.getDimensionPixelOffset(6, Integer.MIN_VALUE);
        this.f1400k = A2.o(4);
        this.f1401l = typedArray.getText(3);
        CharSequence text = typedArray.getText(21);
        if (!TextUtils.isEmpty(text)) {
            setTitle(text);
        }
        CharSequence text2 = typedArray.getText(18);
        if (!TextUtils.isEmpty(text2)) {
            setSubtitle(text2);
        }
        this.f1404o = getContext();
        setPopupTheme(typedArray.getResourceId(17, 0));
        Drawable o2 = A2.o(16);
        if (o2 != null) {
            setNavigationIcon(o2);
        }
        CharSequence text3 = typedArray.getText(15);
        if (!TextUtils.isEmpty(text3)) {
            setNavigationContentDescription(text3);
        }
        Drawable o3 = A2.o(11);
        if (o3 != null) {
            setLogo(o3);
        }
        CharSequence text4 = typedArray.getText(12);
        if (!TextUtils.isEmpty(text4)) {
            setLogoDescription(text4);
        }
        if (typedArray.hasValue(29)) {
            setTitleTextColor(A2.n(29));
        }
        if (typedArray.hasValue(20)) {
            setSubtitleTextColor(A2.n(20));
        }
        if (typedArray.hasValue(14)) {
            m(typedArray.getResourceId(14, 0));
        }
        A2.C();
    }

    private ArrayList<MenuItem> getCurrentMenuItems() {
        ArrayList<MenuItem> arrayList = new ArrayList<>();
        Menu menu = getMenu();
        for (int i2 = 0; i2 < menu.size(); i2++) {
            arrayList.add(menu.getItem(i2));
        }
        return arrayList;
    }

    private MenuInflater getMenuInflater() {
        return new h(getContext());
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [android.view.ViewGroup$MarginLayoutParams, o.b1] */
    public static b1 h() {
        ? marginLayoutParams = new ViewGroup.MarginLayoutParams(-2, -2);
        marginLayoutParams.f4174b = 0;
        marginLayoutParams.f4173a = 8388627;
        return marginLayoutParams;
    }

    public static b1 i(ViewGroup.LayoutParams layoutParams) {
        boolean z2 = layoutParams instanceof b1;
        if (z2) {
            b1 b1Var = (b1) layoutParams;
            b1 b1Var2 = new b1(b1Var);
            b1Var2.f4174b = 0;
            b1Var2.f4174b = b1Var.f4174b;
            return b1Var2;
        } else if (z2) {
            b1 b1Var3 = new b1((b1) layoutParams);
            b1Var3.f4174b = 0;
            return b1Var3;
        } else if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
            b1 b1Var4 = new b1((ViewGroup.LayoutParams) marginLayoutParams);
            b1Var4.f4174b = 0;
            b1Var4.leftMargin = marginLayoutParams.leftMargin;
            b1Var4.topMargin = marginLayoutParams.topMargin;
            b1Var4.rightMargin = marginLayoutParams.rightMargin;
            b1Var4.bottomMargin = marginLayoutParams.bottomMargin;
            return b1Var4;
        } else {
            b1 b1Var5 = new b1(layoutParams);
            b1Var5.f4174b = 0;
            return b1Var5;
        }
    }

    public final void c() {
        if (this.f1402m == null) {
            C0310w wVar = new C0310w(getContext(), (AttributeSet) null, 2130969837);
            this.f1402m = wVar;
            wVar.setImageDrawable(this.f1400k);
            this.f1402m.setContentDescription(this.f1401l);
            b1 h2 = h();
            h2.f4173a = (this.f1408s & 112) | 8388611;
            h2.f4174b = 2;
            this.f1402m.setLayoutParams(h2);
            this.f1402m.setOnClickListener(new i(5, this));
        }
    }

    /* JADX WARNING: type inference failed for: r0v1, types: [java.lang.Object, o.R0] */
    public final void d() {
        if (this.f1414y == null) {
            ? obj = new Object();
            obj.f4130a = 0;
            obj.f4131b = 0;
            obj.f4132c = Integer.MIN_VALUE;
            obj.f4133d = Integer.MIN_VALUE;
            obj.e = 0;
            obj.f4134f = 0;
            obj.f4135g = false;
            obj.f4136h = false;
            this.f1414y = obj;
        }
    }

    public final void f() {
        if (this.f1396f == null) {
            ActionMenuView actionMenuView = new ActionMenuView(getContext(), (AttributeSet) null);
            this.f1396f = actionMenuView;
            actionMenuView.setPopupTheme(this.f1405p);
            this.f1396f.setOnMenuItemClickListener(this.f1387N);
            ActionMenuView actionMenuView2 = this.f1396f;
            Y0 y02 = new Y0(this);
            actionMenuView2.getClass();
            actionMenuView2.f1317z = y02;
            b1 h2 = h();
            h2.f4173a = (this.f1408s & 112) | 8388613;
            this.f1396f.setLayoutParams(h2);
            b(this.f1396f, false);
        }
    }

    public final void g() {
        if (this.i == null) {
            this.i = new C0310w(getContext(), (AttributeSet) null, 2130969837);
            b1 h2 = h();
            h2.f4173a = (this.f1408s & 112) | 8388611;
            this.i.setLayoutParams(h2);
        }
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [android.view.ViewGroup$LayoutParams, android.view.ViewGroup$MarginLayoutParams, o.b1] */
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        Context context = getContext();
        ? marginLayoutParams = new ViewGroup.MarginLayoutParams(context, attributeSet);
        marginLayoutParams.f4173a = 0;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C0096a.f2520b);
        marginLayoutParams.f4173a = obtainStyledAttributes.getInt(0, 0);
        obtainStyledAttributes.recycle();
        marginLayoutParams.f4174b = 0;
        return marginLayoutParams;
    }

    public CharSequence getCollapseContentDescription() {
        C0310w wVar = this.f1402m;
        if (wVar != null) {
            return wVar.getContentDescription();
        }
        return null;
    }

    public Drawable getCollapseIcon() {
        C0310w wVar = this.f1402m;
        if (wVar != null) {
            return wVar.getDrawable();
        }
        return null;
    }

    public int getContentInsetEnd() {
        R0 r02 = this.f1414y;
        if (r02 == null) {
            return 0;
        }
        if (r02.f4135g) {
            return r02.f4130a;
        }
        return r02.f4131b;
    }

    public int getContentInsetEndWithActions() {
        int i2 = this.f1375A;
        if (i2 != Integer.MIN_VALUE) {
            return i2;
        }
        return getContentInsetEnd();
    }

    public int getContentInsetLeft() {
        R0 r02 = this.f1414y;
        if (r02 != null) {
            return r02.f4130a;
        }
        return 0;
    }

    public int getContentInsetRight() {
        R0 r02 = this.f1414y;
        if (r02 != null) {
            return r02.f4131b;
        }
        return 0;
    }

    public int getContentInsetStart() {
        R0 r02 = this.f1414y;
        if (r02 == null) {
            return 0;
        }
        if (r02.f4135g) {
            return r02.f4131b;
        }
        return r02.f4130a;
    }

    public int getContentInsetStartWithNavigation() {
        int i2 = this.f1415z;
        if (i2 != Integer.MIN_VALUE) {
            return i2;
        }
        return getContentInsetStart();
    }

    public int getCurrentContentInsetEnd() {
        C0197l lVar;
        ActionMenuView actionMenuView = this.f1396f;
        if (actionMenuView == null || (lVar = actionMenuView.f1312u) == null || !lVar.hasVisibleItems()) {
            return getContentInsetEnd();
        }
        return Math.max(getContentInsetEnd(), Math.max(this.f1375A, 0));
    }

    public Drawable getLogo() {
        C0314y yVar = this.f1399j;
        if (yVar != null) {
            return yVar.getDrawable();
        }
        return null;
    }

    public CharSequence getLogoDescription() {
        C0314y yVar = this.f1399j;
        if (yVar != null) {
            return yVar.getContentDescription();
        }
        return null;
    }

    public View getNavButtonView() {
        return this.i;
    }

    public CharSequence getNavigationContentDescription() {
        C0310w wVar = this.i;
        if (wVar != null) {
            return wVar.getContentDescription();
        }
        return null;
    }

    public Drawable getNavigationIcon() {
        C0310w wVar = this.i;
        if (wVar != null) {
            return wVar.getDrawable();
        }
        return null;
    }

    public C0286k getOuterActionMenuPresenter() {
        return this.f1389P;
    }

    public Context getPopupContext() {
        return this.f1404o;
    }

    public int getPopupTheme() {
        return this.f1405p;
    }

    public CharSequence getSubtitle() {
        return this.f1378D;
    }

    public final TextView getSubtitleTextView() {
        return this.f1398h;
    }

    public CharSequence getTitle() {
        return this.f1377C;
    }

    public int getTitleMarginBottom() {
        return this.f1413x;
    }

    public int getTitleMarginEnd() {
        return this.f1411v;
    }

    public int getTitleMarginStart() {
        return this.f1410u;
    }

    public int getTitleMarginTop() {
        return this.f1412w;
    }

    public final TextView getTitleTextView() {
        return this.f1397g;
    }

    /* JADX WARNING: type inference failed for: r0v2, types: [o.f1, java.lang.Object] */
    public C0291m0 getWrapper() {
        boolean z2;
        Drawable drawable;
        if (this.f1388O == null) {
            ? obj = new Object();
            obj.f4199n = 0;
            obj.f4188a = this;
            obj.f4194h = getTitle();
            obj.i = getSubtitle();
            if (obj.f4194h != null) {
                z2 = true;
            } else {
                z2 = false;
            }
            obj.f4193g = z2;
            obj.f4192f = getNavigationIcon();
            String str = null;
            t A2 = t.A(getContext(), (AttributeSet) null, C0096a.f2519a, 2130968583);
            obj.f4200o = A2.o(15);
            TypedArray typedArray = (TypedArray) A2.f1132c;
            CharSequence text = typedArray.getText(27);
            if (!TextUtils.isEmpty(text)) {
                obj.f4193g = true;
                obj.f4194h = text;
                if ((obj.f4189b & 8) != 0) {
                    Toolbar toolbar = obj.f4188a;
                    toolbar.setTitle(text);
                    if (obj.f4193g) {
                        Q.q(toolbar.getRootView(), text);
                    }
                }
            }
            CharSequence text2 = typedArray.getText(25);
            if (!TextUtils.isEmpty(text2)) {
                obj.i = text2;
                if ((obj.f4189b & 8) != 0) {
                    setSubtitle(text2);
                }
            }
            Drawable o2 = A2.o(20);
            if (o2 != null) {
                obj.e = o2;
                obj.c();
            }
            Drawable o3 = A2.o(17);
            if (o3 != null) {
                obj.f4191d = o3;
                obj.c();
            }
            if (obj.f4192f == null && (drawable = obj.f4200o) != null) {
                obj.f4192f = drawable;
                int i2 = obj.f4189b & 4;
                Toolbar toolbar2 = obj.f4188a;
                if (i2 != 0) {
                    toolbar2.setNavigationIcon(drawable);
                } else {
                    toolbar2.setNavigationIcon((Drawable) null);
                }
            }
            obj.a(typedArray.getInt(10, 0));
            int resourceId = typedArray.getResourceId(9, 0);
            if (resourceId != 0) {
                View inflate = LayoutInflater.from(getContext()).inflate(resourceId, this, false);
                View view = obj.f4190c;
                if (!(view == null || (obj.f4189b & 16) == 0)) {
                    removeView(view);
                }
                obj.f4190c = inflate;
                if (!(inflate == null || (obj.f4189b & 16) == 0)) {
                    addView(inflate);
                }
                obj.a(obj.f4189b | 16);
            }
            int layoutDimension = typedArray.getLayoutDimension(13, 0);
            if (layoutDimension > 0) {
                ViewGroup.LayoutParams layoutParams = getLayoutParams();
                layoutParams.height = layoutDimension;
                setLayoutParams(layoutParams);
            }
            int dimensionPixelOffset = typedArray.getDimensionPixelOffset(7, -1);
            int dimensionPixelOffset2 = typedArray.getDimensionPixelOffset(3, -1);
            if (dimensionPixelOffset >= 0 || dimensionPixelOffset2 >= 0) {
                int max = Math.max(dimensionPixelOffset, 0);
                int max2 = Math.max(dimensionPixelOffset2, 0);
                d();
                this.f1414y.a(max, max2);
            }
            int resourceId2 = typedArray.getResourceId(28, 0);
            if (resourceId2 != 0) {
                Context context = getContext();
                this.f1406q = resourceId2;
                C0273d0 d0Var = this.f1397g;
                if (d0Var != null) {
                    d0Var.setTextAppearance(context, resourceId2);
                }
            }
            int resourceId3 = typedArray.getResourceId(26, 0);
            if (resourceId3 != 0) {
                Context context2 = getContext();
                this.f1407r = resourceId3;
                C0273d0 d0Var2 = this.f1398h;
                if (d0Var2 != null) {
                    d0Var2.setTextAppearance(context2, resourceId3);
                }
            }
            int resourceId4 = typedArray.getResourceId(22, 0);
            if (resourceId4 != 0) {
                setPopupTheme(resourceId4);
            }
            A2.C();
            if (2131755014 != obj.f4199n) {
                obj.f4199n = 2131755014;
                if (TextUtils.isEmpty(getNavigationContentDescription())) {
                    int i3 = obj.f4199n;
                    if (i3 != 0) {
                        str = getContext().getString(i3);
                    }
                    obj.f4195j = str;
                    obj.b();
                }
            }
            obj.f4195j = getNavigationContentDescription();
            setNavigationOnClickListener(new e1(obj));
            this.f1388O = obj;
        }
        return this.f1388O;
    }

    public final void n() {
        Iterator it2 = this.f1386M.iterator();
        while (it2.hasNext()) {
            getMenu().removeItem(((MenuItem) it2.next()).getItemId());
        }
        getMenu();
        ArrayList<MenuItem> currentMenuItems = getCurrentMenuItems();
        getMenuInflater();
        Iterator it3 = ((CopyOnWriteArrayList) this.f1385L.f1132c).iterator();
        while (it3.hasNext()) {
            ((A) it3.next()).f1556a.j();
        }
        ArrayList<MenuItem> currentMenuItems2 = getCurrentMenuItems();
        currentMenuItems2.removeAll(currentMenuItems);
        this.f1386M = currentMenuItems2;
    }

    /* JADX WARNING: Removed duplicated region for block: B:103:0x0298 A[LOOP:0: B:102:0x0296->B:103:0x0298, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:106:0x02b5 A[LOOP:1: B:105:0x02b3->B:106:0x02b5, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:109:0x02d3 A[LOOP:2: B:108:0x02d1->B:109:0x02d3, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:112:0x0314  */
    /* JADX WARNING: Removed duplicated region for block: B:117:0x0321 A[LOOP:3: B:116:0x031f->B:117:0x0321, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x0062  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x0079  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x00b6  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x00cd  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x00ea  */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x0101  */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x0106  */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x011e  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x012d  */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x0130  */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x0134  */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x0137  */
    /* JADX WARNING: Removed duplicated region for block: B:62:0x016a  */
    /* JADX WARNING: Removed duplicated region for block: B:72:0x01a2  */
    /* JADX WARNING: Removed duplicated region for block: B:74:0x01b1  */
    /* JADX WARNING: Removed duplicated region for block: B:88:0x0221  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onLayout(boolean r19, int r20, int r21, int r22, int r23) {
        /*
            r18 = this;
            r0 = r18
            int r1 = r18.getLayoutDirection()
            r2 = 0
            r3 = 1
            if (r1 != r3) goto L_0x000c
            r1 = 1
            goto L_0x000d
        L_0x000c:
            r1 = 0
        L_0x000d:
            int r4 = r18.getWidth()
            int r5 = r18.getHeight()
            int r6 = r18.getPaddingLeft()
            int r7 = r18.getPaddingRight()
            int r8 = r18.getPaddingTop()
            int r9 = r18.getPaddingBottom()
            int r10 = r4 - r7
            int[] r11 = r0.f1384K
            r11[r3] = r2
            r11[r2] = r2
            java.util.WeakHashMap r12 = N.Q.f509a
            int r12 = r18.getMinimumHeight()
            if (r12 < 0) goto L_0x003c
            int r13 = r23 - r21
            int r12 = java.lang.Math.min(r12, r13)
            goto L_0x003d
        L_0x003c:
            r12 = 0
        L_0x003d:
            o.w r13 = r0.i
            boolean r13 = r0.t(r13)
            if (r13 == 0) goto L_0x0058
            if (r1 == 0) goto L_0x0050
            o.w r13 = r0.i
            int r13 = r0.q(r13, r10, r12, r11)
            r14 = r13
            r13 = r6
            goto L_0x005a
        L_0x0050:
            o.w r13 = r0.i
            int r13 = r0.p(r13, r6, r12, r11)
        L_0x0056:
            r14 = r10
            goto L_0x005a
        L_0x0058:
            r13 = r6
            goto L_0x0056
        L_0x005a:
            o.w r15 = r0.f1402m
            boolean r15 = r0.t(r15)
            if (r15 == 0) goto L_0x0071
            if (r1 == 0) goto L_0x006b
            o.w r15 = r0.f1402m
            int r14 = r0.q(r15, r14, r12, r11)
            goto L_0x0071
        L_0x006b:
            o.w r15 = r0.f1402m
            int r13 = r0.p(r15, r13, r12, r11)
        L_0x0071:
            androidx.appcompat.widget.ActionMenuView r15 = r0.f1396f
            boolean r15 = r0.t(r15)
            if (r15 == 0) goto L_0x0088
            if (r1 == 0) goto L_0x0082
            androidx.appcompat.widget.ActionMenuView r15 = r0.f1396f
            int r13 = r0.p(r15, r13, r12, r11)
            goto L_0x0088
        L_0x0082:
            androidx.appcompat.widget.ActionMenuView r15 = r0.f1396f
            int r14 = r0.q(r15, r14, r12, r11)
        L_0x0088:
            int r15 = r18.getCurrentContentInsetLeft()
            int r16 = r18.getCurrentContentInsetRight()
            int r3 = r15 - r13
            int r3 = java.lang.Math.max(r2, r3)
            r11[r2] = r3
            int r3 = r10 - r14
            int r3 = r16 - r3
            int r3 = java.lang.Math.max(r2, r3)
            r17 = 1
            r11[r17] = r3
            int r3 = java.lang.Math.max(r13, r15)
            int r10 = r10 - r16
            int r10 = java.lang.Math.min(r14, r10)
            android.view.View r13 = r0.f1403n
            boolean r13 = r0.t(r13)
            if (r13 == 0) goto L_0x00c5
            if (r1 == 0) goto L_0x00bf
            android.view.View r13 = r0.f1403n
            int r10 = r0.q(r13, r10, r12, r11)
            goto L_0x00c5
        L_0x00bf:
            android.view.View r13 = r0.f1403n
            int r3 = r0.p(r13, r3, r12, r11)
        L_0x00c5:
            o.y r13 = r0.f1399j
            boolean r13 = r0.t(r13)
            if (r13 == 0) goto L_0x00dc
            if (r1 == 0) goto L_0x00d6
            o.y r13 = r0.f1399j
            int r10 = r0.q(r13, r10, r12, r11)
            goto L_0x00dc
        L_0x00d6:
            o.y r13 = r0.f1399j
            int r3 = r0.p(r13, r3, r12, r11)
        L_0x00dc:
            o.d0 r13 = r0.f1397g
            boolean r13 = r0.t(r13)
            o.d0 r14 = r0.f1398h
            boolean r14 = r0.t(r14)
            if (r13 == 0) goto L_0x0101
            o.d0 r15 = r0.f1397g
            android.view.ViewGroup$LayoutParams r15 = r15.getLayoutParams()
            o.b1 r15 = (o.b1) r15
            int r2 = r15.topMargin
            r22 = r7
            o.d0 r7 = r0.f1397g
            int r7 = r7.getMeasuredHeight()
            int r7 = r7 + r2
            int r2 = r15.bottomMargin
            int r2 = r2 + r7
            goto L_0x0104
        L_0x0101:
            r22 = r7
            r2 = 0
        L_0x0104:
            if (r14 == 0) goto L_0x011e
            o.d0 r7 = r0.f1398h
            android.view.ViewGroup$LayoutParams r7 = r7.getLayoutParams()
            o.b1 r7 = (o.b1) r7
            int r15 = r7.topMargin
            r16 = r4
            o.d0 r4 = r0.f1398h
            int r4 = r4.getMeasuredHeight()
            int r4 = r4 + r15
            int r7 = r7.bottomMargin
            int r4 = r4 + r7
            int r2 = r2 + r4
            goto L_0x0120
        L_0x011e:
            r16 = r4
        L_0x0120:
            if (r13 != 0) goto L_0x012b
            if (r14 == 0) goto L_0x0125
            goto L_0x012b
        L_0x0125:
            r17 = r6
            r21 = r12
            goto L_0x028a
        L_0x012b:
            if (r13 == 0) goto L_0x0130
            o.d0 r4 = r0.f1397g
            goto L_0x0132
        L_0x0130:
            o.d0 r4 = r0.f1398h
        L_0x0132:
            if (r14 == 0) goto L_0x0137
            o.d0 r7 = r0.f1398h
            goto L_0x0139
        L_0x0137:
            o.d0 r7 = r0.f1397g
        L_0x0139:
            android.view.ViewGroup$LayoutParams r4 = r4.getLayoutParams()
            o.b1 r4 = (o.b1) r4
            android.view.ViewGroup$LayoutParams r7 = r7.getLayoutParams()
            o.b1 r7 = (o.b1) r7
            if (r13 == 0) goto L_0x014f
            o.d0 r15 = r0.f1397g
            int r15 = r15.getMeasuredWidth()
            if (r15 > 0) goto L_0x0159
        L_0x014f:
            if (r14 == 0) goto L_0x015d
            o.d0 r15 = r0.f1398h
            int r15 = r15.getMeasuredWidth()
            if (r15 <= 0) goto L_0x015d
        L_0x0159:
            r17 = r6
            r15 = 1
            goto L_0x0160
        L_0x015d:
            r17 = r6
            r15 = 0
        L_0x0160:
            int r6 = r0.f1376B
            r6 = r6 & 112(0x70, float:1.57E-43)
            r21 = r12
            r12 = 48
            if (r6 == r12) goto L_0x01a2
            r12 = 80
            if (r6 == r12) goto L_0x0196
            int r6 = r5 - r8
            int r6 = r6 - r9
            int r6 = r6 - r2
            int r6 = r6 / 2
            int r12 = r4.topMargin
            r23 = r3
            int r3 = r0.f1412w
            int r12 = r12 + r3
            if (r6 >= r12) goto L_0x017f
            r6 = r12
            goto L_0x0194
        L_0x017f:
            int r5 = r5 - r9
            int r5 = r5 - r2
            int r5 = r5 - r6
            int r5 = r5 - r8
            int r2 = r4.bottomMargin
            int r3 = r0.f1413x
            int r2 = r2 + r3
            if (r5 >= r2) goto L_0x0194
            int r2 = r7.bottomMargin
            int r2 = r2 + r3
            int r2 = r2 - r5
            int r6 = r6 - r2
            r2 = 0
            int r6 = java.lang.Math.max(r2, r6)
        L_0x0194:
            int r8 = r8 + r6
            goto L_0x01af
        L_0x0196:
            r23 = r3
            int r5 = r5 - r9
            int r3 = r7.bottomMargin
            int r5 = r5 - r3
            int r3 = r0.f1413x
            int r5 = r5 - r3
            int r8 = r5 - r2
            goto L_0x01af
        L_0x01a2:
            r23 = r3
            int r2 = r18.getPaddingTop()
            int r3 = r4.topMargin
            int r2 = r2 + r3
            int r3 = r0.f1412w
            int r8 = r2 + r3
        L_0x01af:
            if (r1 == 0) goto L_0x0221
            if (r15 == 0) goto L_0x01b7
            int r1 = r0.f1410u
        L_0x01b5:
            r2 = 1
            goto L_0x01b9
        L_0x01b7:
            r1 = 0
            goto L_0x01b5
        L_0x01b9:
            r3 = r11[r2]
            int r1 = r1 - r3
            r3 = 0
            int r4 = java.lang.Math.max(r3, r1)
            int r10 = r10 - r4
            int r1 = -r1
            int r1 = java.lang.Math.max(r3, r1)
            r11[r2] = r1
            if (r13 == 0) goto L_0x01ef
            o.d0 r1 = r0.f1397g
            android.view.ViewGroup$LayoutParams r1 = r1.getLayoutParams()
            o.b1 r1 = (o.b1) r1
            o.d0 r2 = r0.f1397g
            int r2 = r2.getMeasuredWidth()
            int r2 = r10 - r2
            o.d0 r3 = r0.f1397g
            int r3 = r3.getMeasuredHeight()
            int r3 = r3 + r8
            o.d0 r4 = r0.f1397g
            r4.layout(r2, r8, r10, r3)
            int r4 = r0.f1411v
            int r2 = r2 - r4
            int r1 = r1.bottomMargin
            int r8 = r3 + r1
            goto L_0x01f0
        L_0x01ef:
            r2 = r10
        L_0x01f0:
            if (r14 == 0) goto L_0x0216
            o.d0 r1 = r0.f1398h
            android.view.ViewGroup$LayoutParams r1 = r1.getLayoutParams()
            o.b1 r1 = (o.b1) r1
            int r1 = r1.topMargin
            int r8 = r8 + r1
            o.d0 r1 = r0.f1398h
            int r1 = r1.getMeasuredWidth()
            int r1 = r10 - r1
            o.d0 r3 = r0.f1398h
            int r3 = r3.getMeasuredHeight()
            int r3 = r3 + r8
            o.d0 r4 = r0.f1398h
            r4.layout(r1, r8, r10, r3)
            int r1 = r0.f1411v
            int r1 = r10 - r1
            goto L_0x0217
        L_0x0216:
            r1 = r10
        L_0x0217:
            if (r15 == 0) goto L_0x021e
            int r1 = java.lang.Math.min(r2, r1)
            r10 = r1
        L_0x021e:
            r3 = r23
            goto L_0x028a
        L_0x0221:
            if (r15 == 0) goto L_0x0227
            int r1 = r0.f1410u
        L_0x0225:
            r2 = 0
            goto L_0x0229
        L_0x0227:
            r1 = 0
            goto L_0x0225
        L_0x0229:
            r3 = r11[r2]
            int r1 = r1 - r3
            int r3 = java.lang.Math.max(r2, r1)
            int r3 = r3 + r23
            int r1 = -r1
            int r1 = java.lang.Math.max(r2, r1)
            r11[r2] = r1
            if (r13 == 0) goto L_0x025e
            o.d0 r1 = r0.f1397g
            android.view.ViewGroup$LayoutParams r1 = r1.getLayoutParams()
            o.b1 r1 = (o.b1) r1
            o.d0 r2 = r0.f1397g
            int r2 = r2.getMeasuredWidth()
            int r2 = r2 + r3
            o.d0 r4 = r0.f1397g
            int r4 = r4.getMeasuredHeight()
            int r4 = r4 + r8
            o.d0 r5 = r0.f1397g
            r5.layout(r3, r8, r2, r4)
            int r5 = r0.f1411v
            int r2 = r2 + r5
            int r1 = r1.bottomMargin
            int r8 = r4 + r1
            goto L_0x025f
        L_0x025e:
            r2 = r3
        L_0x025f:
            if (r14 == 0) goto L_0x0283
            o.d0 r1 = r0.f1398h
            android.view.ViewGroup$LayoutParams r1 = r1.getLayoutParams()
            o.b1 r1 = (o.b1) r1
            int r1 = r1.topMargin
            int r8 = r8 + r1
            o.d0 r1 = r0.f1398h
            int r1 = r1.getMeasuredWidth()
            int r1 = r1 + r3
            o.d0 r4 = r0.f1398h
            int r4 = r4.getMeasuredHeight()
            int r4 = r4 + r8
            o.d0 r5 = r0.f1398h
            r5.layout(r3, r8, r1, r4)
            int r4 = r0.f1411v
            int r1 = r1 + r4
            goto L_0x0284
        L_0x0283:
            r1 = r3
        L_0x0284:
            if (r15 == 0) goto L_0x028a
            int r3 = java.lang.Math.max(r2, r1)
        L_0x028a:
            java.util.ArrayList r1 = r0.I
            r2 = 3
            r0.a(r1, r2)
            int r2 = r1.size()
            r4 = r3
            r3 = 0
        L_0x0296:
            if (r3 >= r2) goto L_0x02a7
            java.lang.Object r5 = r1.get(r3)
            android.view.View r5 = (android.view.View) r5
            r12 = r21
            int r4 = r0.p(r5, r4, r12, r11)
            r5 = 1
            int r3 = r3 + r5
            goto L_0x0296
        L_0x02a7:
            r12 = r21
            r5 = 1
            r2 = 5
            r0.a(r1, r2)
            int r2 = r1.size()
            r3 = 0
        L_0x02b3:
            if (r3 >= r2) goto L_0x02c1
            java.lang.Object r6 = r1.get(r3)
            android.view.View r6 = (android.view.View) r6
            int r10 = r0.q(r6, r10, r12, r11)
            int r3 = r3 + r5
            goto L_0x02b3
        L_0x02c1:
            r0.a(r1, r5)
            r2 = 0
            r3 = r11[r2]
            r2 = r11[r5]
            int r5 = r1.size()
            r6 = r2
            r7 = r3
            r2 = 0
            r3 = 0
        L_0x02d1:
            if (r2 >= r5) goto L_0x0304
            java.lang.Object r8 = r1.get(r2)
            android.view.View r8 = (android.view.View) r8
            android.view.ViewGroup$LayoutParams r9 = r8.getLayoutParams()
            o.b1 r9 = (o.b1) r9
            int r13 = r9.leftMargin
            int r13 = r13 - r7
            int r7 = r9.rightMargin
            int r7 = r7 - r6
            r6 = 0
            int r9 = java.lang.Math.max(r6, r13)
            int r14 = java.lang.Math.max(r6, r7)
            int r13 = -r13
            int r13 = java.lang.Math.max(r6, r13)
            int r7 = -r7
            int r7 = java.lang.Math.max(r6, r7)
            int r8 = r8.getMeasuredWidth()
            int r8 = r8 + r9
            int r8 = r8 + r14
            int r3 = r3 + r8
            r8 = 1
            int r2 = r2 + r8
            r6 = r7
            r7 = r13
            goto L_0x02d1
        L_0x0304:
            r6 = 0
            int r2 = r16 - r17
            int r2 = r2 - r22
            int r2 = r2 / 2
            int r2 = r2 + r17
            int r5 = r3 / 2
            int r2 = r2 - r5
            int r3 = r3 + r2
            if (r2 >= r4) goto L_0x0314
            goto L_0x031b
        L_0x0314:
            if (r3 <= r10) goto L_0x031a
            int r3 = r3 - r10
            int r4 = r2 - r3
            goto L_0x031b
        L_0x031a:
            r4 = r2
        L_0x031b:
            int r2 = r1.size()
        L_0x031f:
            if (r6 >= r2) goto L_0x032e
            java.lang.Object r3 = r1.get(r6)
            android.view.View r3 = (android.view.View) r3
            int r4 = r0.p(r3, r4, r12, r11)
            r3 = 1
            int r6 = r6 + r3
            goto L_0x031f
        L_0x032e:
            r1.clear()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.Toolbar.onLayout(boolean, int, int, int, int):void");
    }

    public final void onMeasure(int i2, int i3) {
        char c2;
        char c3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        boolean z2 = n1.f4272a;
        int i11 = 0;
        if (getLayoutDirection() == 1) {
            c3 = 1;
            c2 = 0;
        } else {
            c3 = 0;
            c2 = 1;
        }
        if (t(this.i)) {
            s(this.i, i2, 0, i3, this.f1409t);
            i6 = k(this.i) + this.i.getMeasuredWidth();
            i5 = Math.max(0, l(this.i) + this.i.getMeasuredHeight());
            i4 = View.combineMeasuredStates(0, this.i.getMeasuredState());
        } else {
            i6 = 0;
            i5 = 0;
            i4 = 0;
        }
        if (t(this.f1402m)) {
            s(this.f1402m, i2, 0, i3, this.f1409t);
            i6 = k(this.f1402m) + this.f1402m.getMeasuredWidth();
            i5 = Math.max(i5, l(this.f1402m) + this.f1402m.getMeasuredHeight());
            i4 = View.combineMeasuredStates(i4, this.f1402m.getMeasuredState());
        }
        int currentContentInsetStart = getCurrentContentInsetStart();
        int max = Math.max(currentContentInsetStart, i6);
        int max2 = Math.max(0, currentContentInsetStart - i6);
        int[] iArr = this.f1384K;
        iArr[c3] = max2;
        if (t(this.f1396f)) {
            s(this.f1396f, i2, max, i3, this.f1409t);
            i7 = k(this.f1396f) + this.f1396f.getMeasuredWidth();
            i5 = Math.max(i5, l(this.f1396f) + this.f1396f.getMeasuredHeight());
            i4 = View.combineMeasuredStates(i4, this.f1396f.getMeasuredState());
        } else {
            i7 = 0;
        }
        int currentContentInsetEnd = getCurrentContentInsetEnd();
        int max3 = max + Math.max(currentContentInsetEnd, i7);
        iArr[c2] = Math.max(0, currentContentInsetEnd - i7);
        if (t(this.f1403n)) {
            max3 += r(this.f1403n, i2, max3, i3, 0, iArr);
            i5 = Math.max(i5, l(this.f1403n) + this.f1403n.getMeasuredHeight());
            i4 = View.combineMeasuredStates(i4, this.f1403n.getMeasuredState());
        }
        if (t(this.f1399j)) {
            max3 += r(this.f1399j, i2, max3, i3, 0, iArr);
            i5 = Math.max(i5, l(this.f1399j) + this.f1399j.getMeasuredHeight());
            i4 = View.combineMeasuredStates(i4, this.f1399j.getMeasuredState());
        }
        int childCount = getChildCount();
        for (int i12 = 0; i12 < childCount; i12++) {
            View childAt = getChildAt(i12);
            if (((b1) childAt.getLayoutParams()).f4174b == 0 && t(childAt)) {
                View view = childAt;
                max3 += r(childAt, i2, max3, i3, 0, iArr);
                i5 = Math.max(i5, l(view) + view.getMeasuredHeight());
                i4 = View.combineMeasuredStates(i4, view.getMeasuredState());
            }
        }
        int i13 = this.f1412w + this.f1413x;
        int i14 = this.f1410u + this.f1411v;
        if (t(this.f1397g)) {
            r(this.f1397g, i2, max3 + i14, i3, i13, iArr);
            int k2 = k(this.f1397g) + this.f1397g.getMeasuredWidth();
            i8 = l(this.f1397g) + this.f1397g.getMeasuredHeight();
            i10 = View.combineMeasuredStates(i4, this.f1397g.getMeasuredState());
            i9 = k2;
        } else {
            i10 = i4;
            i9 = 0;
            i8 = 0;
        }
        if (t(this.f1398h)) {
            int i15 = i8 + i13;
            i9 = Math.max(i9, r(this.f1398h, i2, max3 + i14, i3, i15, iArr));
            i8 = l(this.f1398h) + this.f1398h.getMeasuredHeight() + i8;
            i10 = View.combineMeasuredStates(i10, this.f1398h.getMeasuredState());
        } else {
            int i16 = i10;
        }
        int max4 = Math.max(i5, i8);
        int paddingRight = getPaddingRight() + getPaddingLeft();
        int paddingBottom = getPaddingBottom() + getPaddingTop() + max4;
        int resolveSizeAndState = View.resolveSizeAndState(Math.max(paddingRight + max3 + i9, getSuggestedMinimumWidth()), i2, -16777216 & i10);
        int resolveSizeAndState2 = View.resolveSizeAndState(Math.max(paddingBottom, getSuggestedMinimumHeight()), i3, i10 << 16);
        if (this.f1391R) {
            int childCount2 = getChildCount();
            int i17 = 0;
            while (true) {
                if (i17 >= childCount2) {
                    break;
                }
                View childAt2 = getChildAt(i17);
                if (t(childAt2) && childAt2.getMeasuredWidth() > 0 && childAt2.getMeasuredHeight() > 0) {
                    break;
                }
                i17++;
            }
        }
        i11 = resolveSizeAndState2;
        setMeasuredDimension(resolveSizeAndState, i11);
    }

    public final void onRestoreInstanceState(Parcelable parcelable) {
        C0197l lVar;
        MenuItem findItem;
        if (!(parcelable instanceof d1)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        d1 d1Var = (d1) parcelable;
        super.onRestoreInstanceState(d1Var.f940a);
        ActionMenuView actionMenuView = this.f1396f;
        if (actionMenuView != null) {
            lVar = actionMenuView.f1312u;
        } else {
            lVar = null;
        }
        int i2 = d1Var.f4184c;
        if (!(i2 == 0 || this.f1390Q == null || lVar == null || (findItem = lVar.findItem(i2)) == null)) {
            findItem.expandActionView();
        }
        if (d1Var.f4185d) {
            B b2 = this.f1395V;
            removeCallbacks(b2);
            post(b2);
        }
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [android.os.Parcelable, U.b, o.d1] */
    public final Parcelable onSaveInstanceState() {
        boolean z2;
        C0286k kVar;
        C0199n nVar;
        ? bVar = new b(super.onSaveInstanceState());
        a1 a1Var = this.f1390Q;
        if (!(a1Var == null || (nVar = a1Var.f4169g) == null)) {
            bVar.f4184c = nVar.f3900a;
        }
        ActionMenuView actionMenuView = this.f1396f;
        if (actionMenuView == null || (kVar = actionMenuView.f1316y) == null || !kVar.i()) {
            z2 = false;
        } else {
            z2 = true;
        }
        bVar.f4185d = z2;
        return bVar;
    }

    public void setBackInvokedCallbackEnabled(boolean z2) {
        if (this.f1394U != z2) {
            this.f1394U = z2;
            u();
        }
    }

    public void setCollapseContentDescription(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence)) {
            c();
        }
        C0310w wVar = this.f1402m;
        if (wVar != null) {
            wVar.setContentDescription(charSequence);
        }
    }

    public void setCollapseIcon(Drawable drawable) {
        if (drawable != null) {
            c();
            this.f1402m.setImageDrawable(drawable);
            return;
        }
        C0310w wVar = this.f1402m;
        if (wVar != null) {
            wVar.setImageDrawable(this.f1400k);
        }
    }

    public void setCollapsible(boolean z2) {
        this.f1391R = z2;
        requestLayout();
    }

    public void setContentInsetEndWithActions(int i2) {
        if (i2 < 0) {
            i2 = Integer.MIN_VALUE;
        }
        if (i2 != this.f1375A) {
            this.f1375A = i2;
            if (getNavigationIcon() != null) {
                requestLayout();
            }
        }
    }

    public void setContentInsetStartWithNavigation(int i2) {
        if (i2 < 0) {
            i2 = Integer.MIN_VALUE;
        }
        if (i2 != this.f1415z) {
            this.f1415z = i2;
            if (getNavigationIcon() != null) {
                requestLayout();
            }
        }
    }

    public void setLogo(Drawable drawable) {
        if (drawable != null) {
            if (this.f1399j == null) {
                this.f1399j = new C0314y(getContext(), (AttributeSet) null, 0);
            }
            if (!o(this.f1399j)) {
                b(this.f1399j, true);
            }
        } else {
            C0314y yVar = this.f1399j;
            if (yVar != null && o(yVar)) {
                removeView(this.f1399j);
                this.f1383J.remove(this.f1399j);
            }
        }
        C0314y yVar2 = this.f1399j;
        if (yVar2 != null) {
            yVar2.setImageDrawable(drawable);
        }
    }

    public void setLogoDescription(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence) && this.f1399j == null) {
            this.f1399j = new C0314y(getContext(), (AttributeSet) null, 0);
        }
        C0314y yVar = this.f1399j;
        if (yVar != null) {
            yVar.setContentDescription(charSequence);
        }
    }

    public void setNavigationContentDescription(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence)) {
            g();
        }
        C0310w wVar = this.i;
        if (wVar != null) {
            wVar.setContentDescription(charSequence);
            g.N(this.i, charSequence);
        }
    }

    public void setNavigationIcon(Drawable drawable) {
        if (drawable != null) {
            g();
            if (!o(this.i)) {
                b(this.i, true);
            }
        } else {
            C0310w wVar = this.i;
            if (wVar != null && o(wVar)) {
                removeView(this.i);
                this.f1383J.remove(this.i);
            }
        }
        C0310w wVar2 = this.i;
        if (wVar2 != null) {
            wVar2.setImageDrawable(drawable);
        }
    }

    public void setOnMenuItemClickListener(c1 c1Var) {
    }

    public void setPopupTheme(int i2) {
        if (this.f1405p != i2) {
            this.f1405p = i2;
            if (i2 == 0) {
                this.f1404o = getContext();
            } else {
                this.f1404o = new ContextThemeWrapper(getContext(), i2);
            }
        }
    }

    public void setSubtitle(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence)) {
            if (this.f1398h == null) {
                Context context = getContext();
                C0273d0 d0Var = new C0273d0(context, (AttributeSet) null);
                this.f1398h = d0Var;
                d0Var.setSingleLine();
                this.f1398h.setEllipsize(TextUtils.TruncateAt.END);
                int i2 = this.f1407r;
                if (i2 != 0) {
                    this.f1398h.setTextAppearance(context, i2);
                }
                ColorStateList colorStateList = this.f1380F;
                if (colorStateList != null) {
                    this.f1398h.setTextColor(colorStateList);
                }
            }
            if (!o(this.f1398h)) {
                b(this.f1398h, true);
            }
        } else {
            C0273d0 d0Var2 = this.f1398h;
            if (d0Var2 != null && o(d0Var2)) {
                removeView(this.f1398h);
                this.f1383J.remove(this.f1398h);
            }
        }
        C0273d0 d0Var3 = this.f1398h;
        if (d0Var3 != null) {
            d0Var3.setText(charSequence);
        }
        this.f1378D = charSequence;
    }

    public void setSubtitleTextColor(ColorStateList colorStateList) {
        this.f1380F = colorStateList;
        C0273d0 d0Var = this.f1398h;
        if (d0Var != null) {
            d0Var.setTextColor(colorStateList);
        }
    }

    public void setTitle(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence)) {
            if (this.f1397g == null) {
                Context context = getContext();
                C0273d0 d0Var = new C0273d0(context, (AttributeSet) null);
                this.f1397g = d0Var;
                d0Var.setSingleLine();
                this.f1397g.setEllipsize(TextUtils.TruncateAt.END);
                int i2 = this.f1406q;
                if (i2 != 0) {
                    this.f1397g.setTextAppearance(context, i2);
                }
                ColorStateList colorStateList = this.f1379E;
                if (colorStateList != null) {
                    this.f1397g.setTextColor(colorStateList);
                }
            }
            if (!o(this.f1397g)) {
                b(this.f1397g, true);
            }
        } else {
            C0273d0 d0Var2 = this.f1397g;
            if (d0Var2 != null && o(d0Var2)) {
                removeView(this.f1397g);
                this.f1383J.remove(this.f1397g);
            }
        }
        C0273d0 d0Var3 = this.f1397g;
        if (d0Var3 != null) {
            d0Var3.setText(charSequence);
        }
        this.f1377C = charSequence;
    }

    public void setTitleMarginBottom(int i2) {
        this.f1413x = i2;
        requestLayout();
    }

    public void setTitleMarginEnd(int i2) {
        this.f1411v = i2;
        requestLayout();
    }

    public void setTitleMarginStart(int i2) {
        this.f1410u = i2;
        requestLayout();
    }

    public void setTitleMarginTop(int i2) {
        this.f1412w = i2;
        requestLayout();
    }

    public void setTitleTextColor(ColorStateList colorStateList) {
        this.f1379E = colorStateList;
        C0273d0 d0Var = this.f1397g;
        if (d0Var != null) {
            d0Var.setTextColor(colorStateList);
        }
    }

    public final boolean t(View view) {
        if (view == null || view.getParent() != this || view.getVisibility() == 8) {
            return false;
        }
        return true;
    }

    public final void u() {
        boolean z2;
        OnBackInvokedDispatcher onBackInvokedDispatcher;
        if (Build.VERSION.SDK_INT >= 33) {
            OnBackInvokedDispatcher a2 = Z0.a(this);
            a1 a1Var = this.f1390Q;
            if (a1Var == null || a1Var.f4169g == null || a2 == null || !isAttachedToWindow() || !this.f1394U) {
                z2 = false;
            } else {
                z2 = true;
            }
            if (z2 && this.f1393T == null) {
                if (this.f1392S == null) {
                    this.f1392S = Z0.b(new X0(this, 0));
                }
                Z0.c(a2, this.f1392S);
                this.f1393T = a2;
            } else if (!z2 && (onBackInvokedDispatcher = this.f1393T) != null) {
                Z0.d(onBackInvokedDispatcher, this.f1392S);
                this.f1393T = null;
            }
        }
    }

    public static int k(View view) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        return marginLayoutParams.getMarginEnd() + marginLayoutParams.getMarginStart();
    }

    public static int l(View view) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        return marginLayoutParams.topMargin + marginLayoutParams.bottomMargin;
    }

    public final void a(ArrayList arrayList, int i2) {
        boolean z2;
        if (getLayoutDirection() == 1) {
            z2 = true;
        } else {
            z2 = false;
        }
        int childCount = getChildCount();
        int absoluteGravity = Gravity.getAbsoluteGravity(i2, getLayoutDirection());
        arrayList.clear();
        if (z2) {
            for (int i3 = childCount - 1; i3 >= 0; i3--) {
                View childAt = getChildAt(i3);
                b1 b1Var = (b1) childAt.getLayoutParams();
                if (b1Var.f4174b == 0 && t(childAt)) {
                    int i4 = b1Var.f4173a;
                    int layoutDirection = getLayoutDirection();
                    int absoluteGravity2 = Gravity.getAbsoluteGravity(i4, layoutDirection) & 7;
                    if (!(absoluteGravity2 == 1 || absoluteGravity2 == 3 || absoluteGravity2 == 5)) {
                        absoluteGravity2 = layoutDirection == 1 ? 5 : 3;
                    }
                    if (absoluteGravity2 == absoluteGravity) {
                        arrayList.add(childAt);
                    }
                }
            }
            return;
        }
        for (int i5 = 0; i5 < childCount; i5++) {
            View childAt2 = getChildAt(i5);
            b1 b1Var2 = (b1) childAt2.getLayoutParams();
            if (b1Var2.f4174b == 0 && t(childAt2)) {
                int i6 = b1Var2.f4173a;
                int layoutDirection2 = getLayoutDirection();
                int absoluteGravity3 = Gravity.getAbsoluteGravity(i6, layoutDirection2) & 7;
                if (!(absoluteGravity3 == 1 || absoluteGravity3 == 3 || absoluteGravity3 == 5)) {
                    absoluteGravity3 = layoutDirection2 == 1 ? 5 : 3;
                }
                if (absoluteGravity3 == absoluteGravity) {
                    arrayList.add(childAt2);
                }
            }
        }
    }

    public final void b(View view, boolean z2) {
        b1 b1Var;
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams == null) {
            b1Var = h();
        } else if (!checkLayoutParams(layoutParams)) {
            b1Var = i(layoutParams);
        } else {
            b1Var = (b1) layoutParams;
        }
        b1Var.f4174b = 1;
        if (!z2 || this.f1403n == null) {
            addView(view, b1Var);
            return;
        }
        view.setLayoutParams(b1Var);
        this.f1383J.add(view);
    }

    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        if (!super.checkLayoutParams(layoutParams) || !(layoutParams instanceof b1)) {
            return false;
        }
        return true;
    }

    public final void e() {
        f();
        ActionMenuView actionMenuView = this.f1396f;
        if (actionMenuView.f1312u == null) {
            C0197l lVar = (C0197l) actionMenuView.getMenu();
            if (this.f1390Q == null) {
                this.f1390Q = new a1(this);
            }
            this.f1396f.setExpandedActionViewsExclusive(true);
            lVar.b(this.f1390Q, this.f1404o);
            u();
        }
    }

    public final /* bridge */ /* synthetic */ ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return h();
    }

    public int getCurrentContentInsetLeft() {
        if (getLayoutDirection() == 1) {
            return getCurrentContentInsetEnd();
        }
        return getCurrentContentInsetStart();
    }

    public int getCurrentContentInsetRight() {
        if (getLayoutDirection() == 1) {
            return getCurrentContentInsetStart();
        }
        return getCurrentContentInsetEnd();
    }

    public int getCurrentContentInsetStart() {
        if (getNavigationIcon() != null) {
            return Math.max(getContentInsetStart(), Math.max(this.f1415z, 0));
        }
        return getContentInsetStart();
    }

    public Menu getMenu() {
        e();
        return this.f1396f.getMenu();
    }

    public Drawable getOverflowIcon() {
        e();
        return this.f1396f.getOverflowIcon();
    }

    public final int j(View view, int i2) {
        int i3;
        b1 b1Var = (b1) view.getLayoutParams();
        int measuredHeight = view.getMeasuredHeight();
        if (i2 > 0) {
            i3 = (measuredHeight - i2) / 2;
        } else {
            i3 = 0;
        }
        int i4 = b1Var.f4173a & 112;
        if (!(i4 == 16 || i4 == 48 || i4 == 80)) {
            i4 = this.f1376B & 112;
        }
        if (i4 == 48) {
            return getPaddingTop() - i3;
        }
        if (i4 == 80) {
            return (((getHeight() - getPaddingBottom()) - measuredHeight) - b1Var.bottomMargin) - i3;
        }
        int paddingTop = getPaddingTop();
        int paddingBottom = getPaddingBottom();
        int height = getHeight();
        int i5 = (((height - paddingTop) - paddingBottom) - measuredHeight) / 2;
        int i6 = b1Var.topMargin;
        if (i5 < i6) {
            i5 = i6;
        } else {
            int i7 = (((height - paddingBottom) - measuredHeight) - i5) - paddingTop;
            int i8 = b1Var.bottomMargin;
            if (i7 < i8) {
                i5 = Math.max(0, i5 - (i8 - i7));
            }
        }
        return paddingTop + i5;
    }

    public void m(int i2) {
        getMenuInflater().inflate(i2, getMenu());
    }

    public final boolean o(View view) {
        if (view.getParent() == this || this.f1383J.contains(view)) {
            return true;
        }
        return false;
    }

    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        u();
    }

    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        removeCallbacks(this.f1395V);
        u();
    }

    public final boolean onHoverEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 9) {
            this.f1382H = false;
        }
        if (!this.f1382H) {
            boolean onHoverEvent = super.onHoverEvent(motionEvent);
            if (actionMasked == 9 && !onHoverEvent) {
                this.f1382H = true;
            }
        }
        if (actionMasked == 10 || actionMasked == 3) {
            this.f1382H = false;
        }
        return true;
    }

    public final void onRtlPropertiesChanged(int i2) {
        super.onRtlPropertiesChanged(i2);
        d();
        R0 r02 = this.f1414y;
        boolean z2 = true;
        if (i2 != 1) {
            z2 = false;
        }
        if (z2 != r02.f4135g) {
            r02.f4135g = z2;
            if (!r02.f4136h) {
                r02.f4130a = r02.e;
                r02.f4131b = r02.f4134f;
            } else if (z2) {
                int i3 = r02.f4133d;
                if (i3 == Integer.MIN_VALUE) {
                    i3 = r02.e;
                }
                r02.f4130a = i3;
                int i4 = r02.f4132c;
                if (i4 == Integer.MIN_VALUE) {
                    i4 = r02.f4134f;
                }
                r02.f4131b = i4;
            } else {
                int i5 = r02.f4132c;
                if (i5 == Integer.MIN_VALUE) {
                    i5 = r02.e;
                }
                r02.f4130a = i5;
                int i6 = r02.f4133d;
                if (i6 == Integer.MIN_VALUE) {
                    i6 = r02.f4134f;
                }
                r02.f4131b = i6;
            }
        }
    }

    public final boolean onTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.f1381G = false;
        }
        if (!this.f1381G) {
            boolean onTouchEvent = super.onTouchEvent(motionEvent);
            if (actionMasked == 0 && !onTouchEvent) {
                this.f1381G = true;
            }
        }
        if (actionMasked == 1 || actionMasked == 3) {
            this.f1381G = false;
        }
        return true;
    }

    public final int p(View view, int i2, int i3, int[] iArr) {
        b1 b1Var = (b1) view.getLayoutParams();
        int i4 = b1Var.leftMargin - iArr[0];
        int max = Math.max(0, i4) + i2;
        iArr[0] = Math.max(0, -i4);
        int j2 = j(view, i3);
        int measuredWidth = view.getMeasuredWidth();
        view.layout(max, j2, max + measuredWidth, view.getMeasuredHeight() + j2);
        return measuredWidth + b1Var.rightMargin + max;
    }

    public final int q(View view, int i2, int i3, int[] iArr) {
        b1 b1Var = (b1) view.getLayoutParams();
        int i4 = b1Var.rightMargin - iArr[1];
        int max = i2 - Math.max(0, i4);
        iArr[1] = Math.max(0, -i4);
        int j2 = j(view, i3);
        int measuredWidth = view.getMeasuredWidth();
        view.layout(max - measuredWidth, j2, max, view.getMeasuredHeight() + j2);
        return max - (measuredWidth + b1Var.leftMargin);
    }

    public final int r(View view, int i2, int i3, int i4, int i5, int[] iArr) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        int i6 = marginLayoutParams.leftMargin - iArr[0];
        int i7 = marginLayoutParams.rightMargin - iArr[1];
        int max = Math.max(0, i7) + Math.max(0, i6);
        iArr[0] = Math.max(0, -i6);
        iArr[1] = Math.max(0, -i7);
        view.measure(ViewGroup.getChildMeasureSpec(i2, getPaddingRight() + getPaddingLeft() + max + i3, marginLayoutParams.width), ViewGroup.getChildMeasureSpec(i4, getPaddingBottom() + getPaddingTop() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin + i5, marginLayoutParams.height));
        return view.getMeasuredWidth() + max;
    }

    public final void s(View view, int i2, int i3, int i4, int i5) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        int childMeasureSpec = ViewGroup.getChildMeasureSpec(i2, getPaddingRight() + getPaddingLeft() + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin + i3, marginLayoutParams.width);
        int childMeasureSpec2 = ViewGroup.getChildMeasureSpec(i4, getPaddingBottom() + getPaddingTop() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin, marginLayoutParams.height);
        int mode = View.MeasureSpec.getMode(childMeasureSpec2);
        if (mode != 1073741824 && i5 >= 0) {
            if (mode != 0) {
                i5 = Math.min(View.MeasureSpec.getSize(childMeasureSpec2), i5);
            }
            childMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(i5, 1073741824);
        }
        view.measure(childMeasureSpec, childMeasureSpec2);
    }

    public void setNavigationOnClickListener(View.OnClickListener onClickListener) {
        g();
        this.i.setOnClickListener(onClickListener);
    }

    public void setOverflowIcon(Drawable drawable) {
        e();
        this.f1396f.setOverflowIcon(drawable);
    }
}
