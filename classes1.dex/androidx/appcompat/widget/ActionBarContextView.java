package androidx.appcompat.widget;

import N.Q;
import N.Z;
import R0.i;
import T0.g;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import g.C0096a;
import m.C0174a;
import n.C0197l;
import n.C0211z;
import o.C0266a;
import o.C0278g;
import o.C0286k;
import o.n1;

public class ActionBarContextView extends ViewGroup {

    /* renamed from: f  reason: collision with root package name */
    public final C0266a f1259f = new C0266a(this);

    /* renamed from: g  reason: collision with root package name */
    public final Context f1260g;

    /* renamed from: h  reason: collision with root package name */
    public ActionMenuView f1261h;
    public C0286k i;

    /* renamed from: j  reason: collision with root package name */
    public int f1262j;

    /* renamed from: k  reason: collision with root package name */
    public Z f1263k;

    /* renamed from: l  reason: collision with root package name */
    public boolean f1264l;

    /* renamed from: m  reason: collision with root package name */
    public boolean f1265m;

    /* renamed from: n  reason: collision with root package name */
    public CharSequence f1266n;

    /* renamed from: o  reason: collision with root package name */
    public CharSequence f1267o;

    /* renamed from: p  reason: collision with root package name */
    public View f1268p;

    /* renamed from: q  reason: collision with root package name */
    public View f1269q;

    /* renamed from: r  reason: collision with root package name */
    public View f1270r;

    /* renamed from: s  reason: collision with root package name */
    public LinearLayout f1271s;

    /* renamed from: t  reason: collision with root package name */
    public TextView f1272t;

    /* renamed from: u  reason: collision with root package name */
    public TextView f1273u;

    /* renamed from: v  reason: collision with root package name */
    public final int f1274v;

    /* renamed from: w  reason: collision with root package name */
    public final int f1275w;

    /* renamed from: x  reason: collision with root package name */
    public boolean f1276x;

    /* renamed from: y  reason: collision with root package name */
    public final int f1277y;

    public final boolean shouldDelayChildPressedState() {
        return false;
    }

    public static int f(View view, int i2, int i3) {
        view.measure(View.MeasureSpec.makeMeasureSpec(i2, Integer.MIN_VALUE), i3);
        return Math.max(0, i2 - view.getMeasuredWidth());
    }

    public final void c(C0174a aVar) {
        View view = this.f1268p;
        if (view == null) {
            View inflate = LayoutInflater.from(getContext()).inflate(this.f1277y, this, false);
            this.f1268p = inflate;
            addView(inflate);
        } else if (view.getParent() == null) {
            addView(this.f1268p);
        }
        View findViewById = this.f1268p.findViewById(2131296324);
        this.f1269q = findViewById;
        findViewById.setOnClickListener(new i(4, aVar));
        C0197l c2 = aVar.c();
        C0286k kVar = this.i;
        if (kVar != null) {
            kVar.e();
            C0278g gVar = kVar.f4259y;
            if (gVar != null && gVar.b()) {
                gVar.i.dismiss();
            }
        }
        C0286k kVar2 = new C0286k(getContext());
        this.i = kVar2;
        kVar2.f4251q = true;
        kVar2.f4252r = true;
        ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(-2, -1);
        c2.b(this.i, this.f1260g);
        C0286k kVar3 = this.i;
        C0211z zVar = kVar3.f4247m;
        if (zVar == null) {
            C0211z zVar2 = (C0211z) kVar3.i.inflate(kVar3.f4245k, this, false);
            kVar3.f4247m = zVar2;
            zVar2.b(kVar3.f4243h);
            kVar3.c();
        }
        C0211z zVar3 = kVar3.f4247m;
        if (zVar != zVar3) {
            ((ActionMenuView) zVar3).setPresenter(kVar3);
        }
        ActionMenuView actionMenuView = (ActionMenuView) zVar3;
        this.f1261h = actionMenuView;
        actionMenuView.setBackground((Drawable) null);
        addView(this.f1261h, layoutParams);
    }

    public final void d() {
        int i2;
        if (this.f1271s == null) {
            LayoutInflater.from(getContext()).inflate(2131492864, this);
            LinearLayout linearLayout = (LinearLayout) getChildAt(getChildCount() - 1);
            this.f1271s = linearLayout;
            this.f1272t = (TextView) linearLayout.findViewById(2131296315);
            this.f1273u = (TextView) this.f1271s.findViewById(2131296314);
            int i3 = this.f1274v;
            if (i3 != 0) {
                this.f1272t.setTextAppearance(getContext(), i3);
            }
            int i4 = this.f1275w;
            if (i4 != 0) {
                this.f1273u.setTextAppearance(getContext(), i4);
            }
        }
        this.f1272t.setText(this.f1266n);
        this.f1273u.setText(this.f1267o);
        boolean isEmpty = TextUtils.isEmpty(this.f1266n);
        boolean isEmpty2 = TextUtils.isEmpty(this.f1267o);
        TextView textView = this.f1273u;
        int i5 = 8;
        if (!isEmpty2) {
            i2 = 0;
        } else {
            i2 = 8;
        }
        textView.setVisibility(i2);
        LinearLayout linearLayout2 = this.f1271s;
        if (!isEmpty || !isEmpty2) {
            i5 = 0;
        }
        linearLayout2.setVisibility(i5);
        if (this.f1271s.getParent() == null) {
            addView(this.f1271s);
        }
    }

    public final ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new ViewGroup.MarginLayoutParams(-1, -2);
    }

    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new ViewGroup.MarginLayoutParams(getContext(), attributeSet);
    }

    public int getAnimatedVisibility() {
        if (this.f1263k != null) {
            return this.f1259f.f4166b;
        }
        return getVisibility();
    }

    public int getContentHeight() {
        return this.f1262j;
    }

    public CharSequence getSubtitle() {
        return this.f1267o;
    }

    public CharSequence getTitle() {
        return this.f1266n;
    }

    public final Z i(int i2, long j2) {
        Z z2 = this.f1263k;
        if (z2 != null) {
            z2.b();
        }
        C0266a aVar = this.f1259f;
        if (i2 == 0) {
            if (getVisibility() != 0) {
                setAlpha(0.0f);
            }
            Z a2 = Q.a(this);
            a2.a(1.0f);
            a2.c(j2);
            aVar.f4167c.f1263k = a2;
            aVar.f4166b = i2;
            a2.d(aVar);
            return a2;
        }
        Z a3 = Q.a(this);
        a3.a(0.0f);
        a3.c(j2);
        aVar.f4167c.f1263k = a3;
        aVar.f4166b = i2;
        a3.d(aVar);
        return a3;
    }

    public final void onLayout(boolean z2, int i2, int i3, int i4, int i5) {
        boolean z3;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        boolean z4 = n1.f4272a;
        if (getLayoutDirection() == 1) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (z3) {
            i6 = (i4 - i2) - getPaddingRight();
        } else {
            i6 = getPaddingLeft();
        }
        int paddingTop = getPaddingTop();
        int paddingTop2 = ((i5 - i3) - getPaddingTop()) - getPaddingBottom();
        View view = this.f1268p;
        if (!(view == null || view.getVisibility() == 8)) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.f1268p.getLayoutParams();
            if (z3) {
                i8 = marginLayoutParams.rightMargin;
            } else {
                i8 = marginLayoutParams.leftMargin;
            }
            if (z3) {
                i9 = marginLayoutParams.leftMargin;
            } else {
                i9 = marginLayoutParams.rightMargin;
            }
            if (z3) {
                i10 = i6 - i8;
            } else {
                i10 = i6 + i8;
            }
            int g2 = g(this.f1268p, i10, paddingTop, paddingTop2, z3) + i10;
            if (z3) {
                i11 = g2 - i9;
            } else {
                i11 = g2 + i9;
            }
            i6 = i11;
        }
        LinearLayout linearLayout = this.f1271s;
        if (!(linearLayout == null || this.f1270r != null || linearLayout.getVisibility() == 8)) {
            i6 += g(this.f1271s, i6, paddingTop, paddingTop2, z3);
        }
        View view2 = this.f1270r;
        if (view2 != null) {
            g(view2, i6, paddingTop, paddingTop2, z3);
        }
        if (z3) {
            i7 = getPaddingLeft();
        } else {
            i7 = (i4 - i2) - getPaddingRight();
        }
        ActionMenuView actionMenuView = this.f1261h;
        if (actionMenuView != null) {
            g(actionMenuView, i7, paddingTop, paddingTop2, !z3);
        }
    }

    public void setContentHeight(int i2) {
        this.f1262j = i2;
    }

    public void setCustomView(View view) {
        LinearLayout linearLayout;
        View view2 = this.f1270r;
        if (view2 != null) {
            removeView(view2);
        }
        this.f1270r = view;
        if (!(view == null || (linearLayout = this.f1271s) == null)) {
            removeView(linearLayout);
            this.f1271s = null;
        }
        if (view != null) {
            addView(view);
        }
        requestLayout();
    }

    public void setSubtitle(CharSequence charSequence) {
        this.f1267o = charSequence;
        d();
    }

    public void setTitle(CharSequence charSequence) {
        this.f1266n = charSequence;
        d();
        Q.q(this, charSequence);
    }

    public void setTitleOptional(boolean z2) {
        if (z2 != this.f1276x) {
            requestLayout();
        }
        this.f1276x = z2;
    }

    public ActionBarContextView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 2130968606);
        Drawable drawable;
        int resourceId;
        TypedValue typedValue = new TypedValue();
        if (!context.getTheme().resolveAttribute(2130968580, typedValue, true) || typedValue.resourceId == 0) {
            this.f1260g = context;
        } else {
            this.f1260g = new ContextThemeWrapper(context, typedValue.resourceId);
        }
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C0096a.f2522d, 2130968606, 0);
        if (!obtainStyledAttributes.hasValue(0) || (resourceId = obtainStyledAttributes.getResourceId(0, 0)) == 0) {
            drawable = obtainStyledAttributes.getDrawable(0);
        } else {
            drawable = g.n(context, resourceId);
        }
        setBackground(drawable);
        this.f1274v = obtainStyledAttributes.getResourceId(5, 0);
        this.f1275w = obtainStyledAttributes.getResourceId(4, 0);
        this.f1262j = obtainStyledAttributes.getLayoutDimension(3, 0);
        this.f1277y = obtainStyledAttributes.getResourceId(2, 2131492869);
        obtainStyledAttributes.recycle();
    }

    public static int g(View view, int i2, int i3, int i4, boolean z2) {
        int measuredWidth = view.getMeasuredWidth();
        int measuredHeight = view.getMeasuredHeight();
        int i5 = ((i4 - measuredHeight) / 2) + i3;
        if (z2) {
            view.layout(i2 - measuredWidth, i5, i2, measuredHeight + i5);
        } else {
            view.layout(i2, i5, i2 + measuredWidth, measuredHeight + i5);
        }
        if (z2) {
            return -measuredWidth;
        }
        return measuredWidth;
    }

    public final void e() {
        removeAllViews();
        this.f1270r = null;
        this.f1261h = null;
        this.i = null;
        View view = this.f1269q;
        if (view != null) {
            view.setOnClickListener((View.OnClickListener) null);
        }
    }

    /* renamed from: h */
    public final void setVisibility(int i2) {
        if (i2 != getVisibility()) {
            Z z2 = this.f1263k;
            if (z2 != null) {
                z2.b();
            }
            super.setVisibility(i2);
        }
    }

    public final void onConfigurationChanged(Configuration configuration) {
        int i2;
        super.onConfigurationChanged(configuration);
        TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes((AttributeSet) null, C0096a.f2519a, 2130968583, 0);
        setContentHeight(obtainStyledAttributes.getLayoutDimension(13, 0));
        obtainStyledAttributes.recycle();
        C0286k kVar = this.i;
        if (kVar != null) {
            Configuration configuration2 = kVar.f4242g.getResources().getConfiguration();
            int i3 = configuration2.screenWidthDp;
            int i4 = configuration2.screenHeightDp;
            if (configuration2.smallestScreenWidthDp > 600 || i3 > 600 || ((i3 > 960 && i4 > 720) || (i3 > 720 && i4 > 960))) {
                i2 = 5;
            } else if (i3 >= 500 || ((i3 > 640 && i4 > 480) || (i3 > 480 && i4 > 640))) {
                i2 = 4;
            } else if (i3 >= 360) {
                i2 = 3;
            } else {
                i2 = 2;
            }
            kVar.f4255u = i2;
            C0197l lVar = kVar.f4243h;
            if (lVar != null) {
                lVar.p(true);
            }
        }
    }

    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        C0286k kVar = this.i;
        if (kVar != null) {
            kVar.e();
            C0278g gVar = this.i.f4259y;
            if (gVar != null && gVar.b()) {
                gVar.i.dismiss();
            }
        }
    }

    public final boolean onHoverEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 9) {
            this.f1265m = false;
        }
        if (!this.f1265m) {
            boolean onHoverEvent = super.onHoverEvent(motionEvent);
            if (actionMasked == 9 && !onHoverEvent) {
                this.f1265m = true;
            }
        }
        if (actionMasked == 10 || actionMasked == 3) {
            this.f1265m = false;
        }
        return true;
    }

    public final void onMeasure(int i2, int i3) {
        int i4;
        boolean z2;
        int i5;
        int i6 = 1073741824;
        if (View.MeasureSpec.getMode(i2) != 1073741824) {
            throw new IllegalStateException(getClass().getSimpleName().concat(" can only be used with android:layout_width=\"match_parent\" (or fill_parent)"));
        } else if (View.MeasureSpec.getMode(i3) != 0) {
            int size = View.MeasureSpec.getSize(i2);
            int i7 = this.f1262j;
            if (i7 <= 0) {
                i7 = View.MeasureSpec.getSize(i3);
            }
            int paddingBottom = getPaddingBottom() + getPaddingTop();
            int paddingLeft = (size - getPaddingLeft()) - getPaddingRight();
            int i8 = i7 - paddingBottom;
            int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i8, Integer.MIN_VALUE);
            View view = this.f1268p;
            if (view != null) {
                int f2 = f(view, paddingLeft, makeMeasureSpec);
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.f1268p.getLayoutParams();
                paddingLeft = f2 - (marginLayoutParams.leftMargin + marginLayoutParams.rightMargin);
            }
            ActionMenuView actionMenuView = this.f1261h;
            if (actionMenuView != null && actionMenuView.getParent() == this) {
                paddingLeft = f(this.f1261h, paddingLeft, makeMeasureSpec);
            }
            LinearLayout linearLayout = this.f1271s;
            if (linearLayout != null && this.f1270r == null) {
                if (this.f1276x) {
                    this.f1271s.measure(View.MeasureSpec.makeMeasureSpec(0, 0), makeMeasureSpec);
                    int measuredWidth = this.f1271s.getMeasuredWidth();
                    if (measuredWidth <= paddingLeft) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    if (z2) {
                        paddingLeft -= measuredWidth;
                    }
                    LinearLayout linearLayout2 = this.f1271s;
                    if (z2) {
                        i5 = 0;
                    } else {
                        i5 = 8;
                    }
                    linearLayout2.setVisibility(i5);
                } else {
                    paddingLeft = f(linearLayout, paddingLeft, makeMeasureSpec);
                }
            }
            View view2 = this.f1270r;
            if (view2 != null) {
                ViewGroup.LayoutParams layoutParams = view2.getLayoutParams();
                int i9 = layoutParams.width;
                if (i9 != -2) {
                    i4 = 1073741824;
                } else {
                    i4 = Integer.MIN_VALUE;
                }
                if (i9 >= 0) {
                    paddingLeft = Math.min(i9, paddingLeft);
                }
                int i10 = layoutParams.height;
                if (i10 == -2) {
                    i6 = Integer.MIN_VALUE;
                }
                if (i10 >= 0) {
                    i8 = Math.min(i10, i8);
                }
                this.f1270r.measure(View.MeasureSpec.makeMeasureSpec(paddingLeft, i4), View.MeasureSpec.makeMeasureSpec(i8, i6));
            }
            if (this.f1262j <= 0) {
                int childCount = getChildCount();
                int i11 = 0;
                for (int i12 = 0; i12 < childCount; i12++) {
                    int measuredHeight = getChildAt(i12).getMeasuredHeight() + paddingBottom;
                    if (measuredHeight > i11) {
                        i11 = measuredHeight;
                    }
                }
                setMeasuredDimension(size, i11);
                return;
            }
            setMeasuredDimension(size, i7);
        } else {
            throw new IllegalStateException(getClass().getSimpleName().concat(" can only be used with android:layout_height=\"wrap_content\""));
        }
    }

    public final boolean onTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.f1264l = false;
        }
        if (!this.f1264l) {
            boolean onTouchEvent = super.onTouchEvent(motionEvent);
            if (actionMasked == 0 && !onTouchEvent) {
                this.f1264l = true;
            }
        }
        if (actionMasked == 1 || actionMasked == 3) {
            this.f1264l = false;
        }
        return true;
    }
}
