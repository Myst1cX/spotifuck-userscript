package androidx.appcompat.widget;

import K0.e;
import android.content.Context;
import android.content.res.Configuration;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.ContextThemeWrapper;
import android.view.Menu;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.widget.LinearLayout;
import androidx.appcompat.view.menu.ActionMenuItemView;
import j0.C0160w;
import n.C0196k;
import n.C0197l;
import n.C0199n;
import n.C0209x;
import n.C0211z;
import o.A0;
import o.C0278g;
import o.C0284j;
import o.C0286k;
import o.C0288l;
import o.C0290m;
import o.C0292n;
import o.C0317z0;
import o.Y0;
import o.n1;

public class ActionMenuView extends A0 implements C0196k, C0211z {

    /* renamed from: A  reason: collision with root package name */
    public boolean f1307A;

    /* renamed from: B  reason: collision with root package name */
    public int f1308B;

    /* renamed from: C  reason: collision with root package name */
    public final int f1309C;

    /* renamed from: D  reason: collision with root package name */
    public final int f1310D;

    /* renamed from: E  reason: collision with root package name */
    public C0292n f1311E;

    /* renamed from: u  reason: collision with root package name */
    public C0197l f1312u;

    /* renamed from: v  reason: collision with root package name */
    public Context f1313v;

    /* renamed from: w  reason: collision with root package name */
    public int f1314w = 0;

    /* renamed from: x  reason: collision with root package name */
    public boolean f1315x;

    /* renamed from: y  reason: collision with root package name */
    public C0286k f1316y;

    /* renamed from: z  reason: collision with root package name */
    public Y0 f1317z;

    public final boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        return false;
    }

    public final /* bridge */ /* synthetic */ ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return k(layoutParams);
    }

    public int getWindowAnimations() {
        return 0;
    }

    public final boolean l(int i) {
        boolean z2 = false;
        if (i == 0) {
            return false;
        }
        View childAt = getChildAt(i - 1);
        View childAt2 = getChildAt(i);
        if (i < getChildCount() && (childAt instanceof C0288l)) {
            z2 = ((C0288l) childAt).c();
        }
        if (i <= 0 || !(childAt2 instanceof C0288l)) {
            return z2;
        }
        return z2 | ((C0288l) childAt2).b();
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [android.widget.LinearLayout$LayoutParams, o.m] */
    public static C0290m j() {
        ? layoutParams = new LinearLayout.LayoutParams(-2, -2);
        layoutParams.f4262a = false;
        layoutParams.gravity = 16;
        return layoutParams;
    }

    /* JADX WARNING: type inference failed for: r0v2, types: [android.widget.LinearLayout$LayoutParams] */
    /* JADX WARNING: type inference failed for: r0v3, types: [android.widget.LinearLayout$LayoutParams, o.m] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static o.C0290m k(android.view.ViewGroup.LayoutParams r1) {
        /*
            if (r1 == 0) goto L_0x0020
            boolean r0 = r1 instanceof o.C0290m
            if (r0 == 0) goto L_0x0012
            o.m r0 = new o.m
            o.m r1 = (o.C0290m) r1
            r0.<init>(r1)
            boolean r1 = r1.f4262a
            r0.f4262a = r1
            goto L_0x0017
        L_0x0012:
            o.m r0 = new o.m
            r0.<init>(r1)
        L_0x0017:
            int r1 = r0.gravity
            if (r1 > 0) goto L_0x001f
            r1 = 16
            r0.gravity = r1
        L_0x001f:
            return r0
        L_0x0020:
            o.m r1 = j()
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.ActionMenuView.k(android.view.ViewGroup$LayoutParams):o.m");
    }

    public final void b(C0197l lVar) {
        this.f1312u = lVar;
    }

    public final boolean c(C0199n nVar) {
        return this.f1312u.q(nVar, (C0209x) null, 0);
    }

    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof C0290m;
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [o.z0, android.widget.LinearLayout$LayoutParams] */
    public final C0317z0 g(AttributeSet attributeSet) {
        return new LinearLayout.LayoutParams(getContext(), attributeSet);
    }

    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new LinearLayout.LayoutParams(getContext(), attributeSet);
    }

    public Menu getMenu() {
        if (this.f1312u == null) {
            Context context = getContext();
            C0197l lVar = new C0197l(context);
            this.f1312u = lVar;
            lVar.e = new C0160w(this);
            C0286k kVar = new C0286k(context);
            this.f1316y = kVar;
            kVar.f4251q = true;
            kVar.f4252r = true;
            kVar.f4244j = new e(26);
            this.f1312u.b(kVar, this.f1313v);
            C0286k kVar2 = this.f1316y;
            kVar2.f4247m = this;
            this.f1312u = kVar2.f4243h;
        }
        return this.f1312u;
    }

    public int getPopupTheme() {
        return this.f1314w;
    }

    public final void onLayout(boolean z2, int i, int i2, int i3, int i4) {
        boolean z3;
        int i5;
        int i6;
        int i7;
        if (!this.f1307A) {
            super.onLayout(z2, i, i2, i3, i4);
            return;
        }
        int childCount = getChildCount();
        int i8 = (i4 - i2) / 2;
        int dividerWidth = getDividerWidth();
        int i9 = i3 - i;
        int paddingRight = (i9 - getPaddingRight()) - getPaddingLeft();
        boolean z4 = n1.f4272a;
        if (getLayoutDirection() == 1) {
            z3 = true;
        } else {
            z3 = false;
        }
        int i10 = 0;
        int i11 = 0;
        for (int i12 = 0; i12 < childCount; i12++) {
            View childAt = getChildAt(i12);
            if (childAt.getVisibility() != 8) {
                C0290m mVar = (C0290m) childAt.getLayoutParams();
                if (mVar.f4262a) {
                    int measuredWidth = childAt.getMeasuredWidth();
                    if (l(i12)) {
                        measuredWidth += dividerWidth;
                    }
                    int measuredHeight = childAt.getMeasuredHeight();
                    if (z3) {
                        i6 = getPaddingLeft() + mVar.leftMargin;
                        i7 = i6 + measuredWidth;
                    } else {
                        i7 = (getWidth() - getPaddingRight()) - mVar.rightMargin;
                        i6 = i7 - measuredWidth;
                    }
                    int i13 = i8 - (measuredHeight / 2);
                    childAt.layout(i6, i13, i7, measuredHeight + i13);
                    paddingRight -= measuredWidth;
                    i10 = 1;
                } else {
                    paddingRight -= (childAt.getMeasuredWidth() + mVar.leftMargin) + mVar.rightMargin;
                    l(i12);
                    i11++;
                }
            }
        }
        if (childCount == 1 && i10 == 0) {
            View childAt2 = getChildAt(0);
            int measuredWidth2 = childAt2.getMeasuredWidth();
            int measuredHeight2 = childAt2.getMeasuredHeight();
            int i14 = (i9 / 2) - (measuredWidth2 / 2);
            int i15 = i8 - (measuredHeight2 / 2);
            childAt2.layout(i14, i15, measuredWidth2 + i14, measuredHeight2 + i15);
            return;
        }
        int i16 = i11 - (i10 ^ 1);
        if (i16 > 0) {
            i5 = paddingRight / i16;
        } else {
            i5 = 0;
        }
        int max = Math.max(0, i5);
        if (z3) {
            int width = getWidth() - getPaddingRight();
            for (int i17 = 0; i17 < childCount; i17++) {
                View childAt3 = getChildAt(i17);
                C0290m mVar2 = (C0290m) childAt3.getLayoutParams();
                if (childAt3.getVisibility() != 8 && !mVar2.f4262a) {
                    int i18 = width - mVar2.rightMargin;
                    int measuredWidth3 = childAt3.getMeasuredWidth();
                    int measuredHeight3 = childAt3.getMeasuredHeight();
                    int i19 = i8 - (measuredHeight3 / 2);
                    childAt3.layout(i18 - measuredWidth3, i19, i18, measuredHeight3 + i19);
                    width = i18 - ((measuredWidth3 + mVar2.leftMargin) + max);
                }
            }
            return;
        }
        int paddingLeft = getPaddingLeft();
        for (int i20 = 0; i20 < childCount; i20++) {
            View childAt4 = getChildAt(i20);
            C0290m mVar3 = (C0290m) childAt4.getLayoutParams();
            if (childAt4.getVisibility() != 8 && !mVar3.f4262a) {
                int i21 = paddingLeft + mVar3.leftMargin;
                int measuredWidth4 = childAt4.getMeasuredWidth();
                int measuredHeight4 = childAt4.getMeasuredHeight();
                int i22 = i8 - (measuredHeight4 / 2);
                childAt4.layout(i21, i22, i21 + measuredWidth4, measuredHeight4 + i22);
                paddingLeft = measuredWidth4 + mVar3.rightMargin + max + i21;
            }
        }
    }

    public final void onMeasure(int i, int i2) {
        boolean z2;
        int i3;
        boolean z3;
        boolean z4;
        boolean z5;
        int i4;
        boolean z6;
        int i5;
        int i6;
        int i7;
        int i8;
        boolean z7;
        int i9;
        int i10;
        boolean z8;
        int i11;
        ActionMenuItemView actionMenuItemView;
        boolean z9;
        int i12;
        boolean z10;
        C0197l lVar;
        boolean z11 = this.f1307A;
        if (View.MeasureSpec.getMode(i) == 1073741824) {
            z2 = true;
        } else {
            z2 = false;
        }
        this.f1307A = z2;
        if (z11 != z2) {
            this.f1308B = 0;
        }
        int size = View.MeasureSpec.getSize(i);
        if (!(!this.f1307A || (lVar = this.f1312u) == null || size == this.f1308B)) {
            this.f1308B = size;
            lVar.p(true);
        }
        int childCount = getChildCount();
        if (!this.f1307A || childCount <= 0) {
            int i13 = i2;
            for (int i14 = 0; i14 < childCount; i14++) {
                C0290m mVar = (C0290m) getChildAt(i14).getLayoutParams();
                mVar.rightMargin = 0;
                mVar.leftMargin = 0;
            }
            super.onMeasure(i, i2);
            return;
        }
        int mode = View.MeasureSpec.getMode(i2);
        int size2 = View.MeasureSpec.getSize(i);
        int size3 = View.MeasureSpec.getSize(i2);
        int paddingRight = getPaddingRight() + getPaddingLeft();
        int paddingBottom = getPaddingBottom() + getPaddingTop();
        int childMeasureSpec = ViewGroup.getChildMeasureSpec(i2, paddingBottom, -2);
        int i15 = size2 - paddingRight;
        int i16 = this.f1309C;
        int i17 = i15 / i16;
        int i18 = i15 % i16;
        if (i17 == 0) {
            setMeasuredDimension(i15, 0);
            return;
        }
        int i19 = (i18 / i17) + i16;
        int childCount2 = getChildCount();
        int i20 = 0;
        int i21 = 0;
        int i22 = 0;
        int i23 = 0;
        boolean z12 = false;
        long j2 = 0;
        int i24 = 0;
        while (true) {
            i3 = this.f1310D;
            if (i23 >= childCount2) {
                break;
            }
            View childAt = getChildAt(i23);
            int i25 = size3;
            int i26 = i15;
            if (childAt.getVisibility() == 8) {
                i9 = mode;
                i10 = paddingBottom;
            } else {
                boolean z13 = childAt instanceof ActionMenuItemView;
                int i27 = i21 + 1;
                if (z13) {
                    childAt.setPadding(i3, 0, i3, 0);
                }
                C0290m mVar2 = (C0290m) childAt.getLayoutParams();
                mVar2.f4266f = false;
                mVar2.f4264c = 0;
                mVar2.f4263b = 0;
                mVar2.f4265d = false;
                mVar2.leftMargin = 0;
                mVar2.rightMargin = 0;
                if (!z13 || TextUtils.isEmpty(((ActionMenuItemView) childAt).getText())) {
                    z8 = false;
                } else {
                    z8 = true;
                }
                mVar2.e = z8;
                if (mVar2.f4262a) {
                    i11 = 1;
                } else {
                    i11 = i17;
                }
                int i28 = i27;
                C0290m mVar3 = (C0290m) childAt.getLayoutParams();
                i9 = mode;
                i10 = paddingBottom;
                int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(childMeasureSpec) - paddingBottom, View.MeasureSpec.getMode(childMeasureSpec));
                if (z13) {
                    actionMenuItemView = (ActionMenuItemView) childAt;
                } else {
                    actionMenuItemView = null;
                }
                if (actionMenuItemView == null || TextUtils.isEmpty(actionMenuItemView.getText())) {
                    z9 = false;
                } else {
                    z9 = true;
                }
                if (i11 <= 0 || (z9 && i11 < 2)) {
                    i12 = 0;
                } else {
                    childAt.measure(View.MeasureSpec.makeMeasureSpec(i11 * i19, Integer.MIN_VALUE), makeMeasureSpec);
                    int measuredWidth = childAt.getMeasuredWidth();
                    i12 = measuredWidth / i19;
                    if (measuredWidth % i19 != 0) {
                        i12++;
                    }
                    if (z9 && i12 < 2) {
                        i12 = 2;
                    }
                }
                if (mVar3.f4262a || !z9) {
                    z10 = false;
                } else {
                    z10 = true;
                }
                mVar3.f4265d = z10;
                mVar3.f4263b = i12;
                childAt.measure(View.MeasureSpec.makeMeasureSpec(i12 * i19, 1073741824), makeMeasureSpec);
                i22 = Math.max(i22, i12);
                if (mVar2.f4265d) {
                    i24++;
                }
                if (mVar2.f4262a) {
                    z12 = true;
                }
                i17 -= i12;
                i20 = Math.max(i20, childAt.getMeasuredHeight());
                if (i12 == 1) {
                    j2 |= (long) (1 << i23);
                }
                i21 = i28;
            }
            i23++;
            size3 = i25;
            i15 = i26;
            paddingBottom = i10;
            mode = i9;
        }
        int i29 = mode;
        int i30 = i15;
        int i31 = size3;
        if (!z12 || i21 != 2) {
            z3 = false;
        } else {
            z3 = true;
        }
        boolean z14 = false;
        while (true) {
            if (i24 <= 0 || i17 <= 0) {
                z4 = z14;
            } else {
                int i32 = Integer.MAX_VALUE;
                int i33 = 0;
                int i34 = 0;
                long j3 = 0;
                while (i34 < childCount2) {
                    C0290m mVar4 = (C0290m) getChildAt(i34).getLayoutParams();
                    boolean z15 = z14;
                    if (mVar4.f4265d) {
                        int i35 = mVar4.f4263b;
                        if (i35 < i32) {
                            j3 = 1 << i34;
                            i32 = i35;
                            i33 = 1;
                        } else if (i35 == i32) {
                            j3 |= 1 << i34;
                            i33++;
                        }
                    }
                    i34++;
                    z14 = z15;
                }
                z4 = z14;
                j2 |= j3;
                if (i33 > i17) {
                    break;
                }
                int i36 = i32 + 1;
                int i37 = 0;
                while (i37 < childCount2) {
                    View childAt2 = getChildAt(i37);
                    C0290m mVar5 = (C0290m) childAt2.getLayoutParams();
                    int i38 = i20;
                    int i39 = childMeasureSpec;
                    int i40 = childCount2;
                    long j4 = (long) (1 << i37);
                    if ((j3 & j4) != 0) {
                        if (!z3 || !mVar5.e) {
                            z7 = true;
                        } else {
                            z7 = true;
                            if (i17 == 1) {
                                childAt2.setPadding(i3 + i19, 0, i3, 0);
                            }
                        }
                        mVar5.f4263b += z7 ? 1 : 0;
                        mVar5.f4266f = z7;
                        i17--;
                    } else if (mVar5.f4263b == i36) {
                        j2 |= j4;
                    }
                    i37++;
                    childMeasureSpec = i39;
                    i20 = i38;
                    childCount2 = i40;
                }
                z14 = true;
            }
        }
        z4 = z14;
        int i41 = i20;
        int i42 = childMeasureSpec;
        int i43 = childCount2;
        if (z12 || i21 != 1) {
            z5 = false;
        } else {
            z5 = true;
        }
        if (i17 <= 0 || j2 == 0 || (i17 >= i21 - 1 && !z5 && i22 <= 1)) {
            i4 = i43;
            z6 = z4;
        } else {
            float bitCount = (float) Long.bitCount(j2);
            if (!z5) {
                if ((j2 & 1) != 0 && !((C0290m) getChildAt(0).getLayoutParams()).e) {
                    bitCount -= 0.5f;
                }
                int i44 = i43 - 1;
                if ((j2 & ((long) (1 << i44))) != 0 && !((C0290m) getChildAt(i44).getLayoutParams()).e) {
                    bitCount -= 0.5f;
                }
            }
            if (bitCount > 0.0f) {
                i8 = (int) (((float) (i17 * i19)) / bitCount);
            } else {
                i8 = 0;
            }
            boolean z16 = z4;
            i4 = i43;
            for (int i45 = 0; i45 < i4; i45++) {
                if ((j2 & ((long) (1 << i45))) != 0) {
                    View childAt3 = getChildAt(i45);
                    C0290m mVar6 = (C0290m) childAt3.getLayoutParams();
                    if (childAt3 instanceof ActionMenuItemView) {
                        mVar6.f4264c = i8;
                        mVar6.f4266f = true;
                        if (i45 == 0 && !mVar6.e) {
                            mVar6.leftMargin = (-i8) / 2;
                        }
                        z16 = true;
                    } else {
                        if (mVar6.f4262a) {
                            mVar6.f4264c = i8;
                            mVar6.f4266f = true;
                            mVar6.rightMargin = (-i8) / 2;
                            z16 = true;
                        } else {
                            if (i45 != 0) {
                                mVar6.leftMargin = i8 / 2;
                            }
                            if (i45 != i4 - 1) {
                                mVar6.rightMargin = i8 / 2;
                            }
                        }
                    }
                }
            }
            z6 = z16;
        }
        if (z6) {
            int i46 = 0;
            while (i46 < i4) {
                View childAt4 = getChildAt(i46);
                C0290m mVar7 = (C0290m) childAt4.getLayoutParams();
                if (!mVar7.f4266f) {
                    i7 = i42;
                } else {
                    i7 = i42;
                    childAt4.measure(View.MeasureSpec.makeMeasureSpec((mVar7.f4263b * i19) + mVar7.f4264c, 1073741824), i7);
                }
                i46++;
                i42 = i7;
            }
        }
        if (i29 != 1073741824) {
            i6 = i30;
            i5 = i41;
        } else {
            i5 = i31;
            i6 = i30;
        }
        setMeasuredDimension(i6, i5);
    }

    public void setExpandedActionViewsExclusive(boolean z2) {
        this.f1316y.f4256v = z2;
    }

    public void setOnMenuItemClickListener(C0292n nVar) {
        this.f1311E = nVar;
    }

    public void setOverflowReserved(boolean z2) {
        this.f1315x = z2;
    }

    public void setPopupTheme(int i) {
        if (this.f1314w != i) {
            this.f1314w = i;
            if (i == 0) {
                this.f1313v = getContext();
            } else {
                this.f1313v = new ContextThemeWrapper(getContext(), i);
            }
        }
    }

    public void setPresenter(C0286k kVar) {
        this.f1316y = kVar;
        kVar.f4247m = this;
        this.f1312u = kVar.f4243h;
    }

    public ActionMenuView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        setBaselineAligned(false);
        float f2 = context.getResources().getDisplayMetrics().density;
        this.f1309C = (int) (56.0f * f2);
        this.f1310D = (int) (f2 * 4.0f);
        this.f1313v = context;
    }

    public final /* bridge */ /* synthetic */ C0317z0 f() {
        return j();
    }

    public final /* bridge */ /* synthetic */ ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return j();
    }

    public Drawable getOverflowIcon() {
        getMenu();
        C0286k kVar = this.f1316y;
        C0284j jVar = kVar.f4248n;
        if (jVar != null) {
            return jVar.getDrawable();
        }
        if (kVar.f4250p) {
            return kVar.f4249o;
        }
        return null;
    }

    public final /* bridge */ /* synthetic */ C0317z0 h(ViewGroup.LayoutParams layoutParams) {
        return k(layoutParams);
    }

    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        C0286k kVar = this.f1316y;
        if (kVar != null) {
            kVar.c();
            if (this.f1316y.i()) {
                this.f1316y.e();
                this.f1316y.l();
            }
        }
    }

    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        C0286k kVar = this.f1316y;
        if (kVar != null) {
            kVar.e();
            C0278g gVar = kVar.f4259y;
            if (gVar != null && gVar.b()) {
                gVar.i.dismiss();
            }
        }
    }

    public void setOverflowIcon(Drawable drawable) {
        getMenu();
        C0286k kVar = this.f1316y;
        C0284j jVar = kVar.f4248n;
        if (jVar != null) {
            jVar.setImageDrawable(drawable);
            return;
        }
        kVar.f4250p = true;
        kVar.f4249o = drawable;
    }
}
