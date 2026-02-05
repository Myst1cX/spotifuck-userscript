package com.google.android.material.internal;

import E.k;
import E.r;
import E0.a;
import E0.e;
import N.Q;
import T0.g;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.StateListDrawable;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.CheckedTextView;
import android.widget.FrameLayout;
import java.util.WeakHashMap;
import n.C0199n;
import n.C0210y;
import o.C0317z0;
import p0.C0320a;

public class NavigationMenuItemView extends e implements C0210y {

    /* renamed from: L  reason: collision with root package name */
    public static final int[] f2298L = {16842912};

    /* renamed from: A  reason: collision with root package name */
    public int f2299A;

    /* renamed from: B  reason: collision with root package name */
    public boolean f2300B;

    /* renamed from: C  reason: collision with root package name */
    public boolean f2301C;

    /* renamed from: D  reason: collision with root package name */
    public final boolean f2302D = true;

    /* renamed from: E  reason: collision with root package name */
    public final CheckedTextView f2303E;

    /* renamed from: F  reason: collision with root package name */
    public FrameLayout f2304F;

    /* renamed from: G  reason: collision with root package name */
    public C0199n f2305G;

    /* renamed from: H  reason: collision with root package name */
    public ColorStateList f2306H;
    public boolean I;

    /* renamed from: J  reason: collision with root package name */
    public Drawable f2307J;

    /* renamed from: K  reason: collision with root package name */
    public final a f2308K;

    public void setIcon(Drawable drawable) {
        if (drawable != null) {
            if (this.I) {
                Drawable.ConstantState constantState = drawable.getConstantState();
                if (constantState != null) {
                    drawable = constantState.newDrawable();
                }
                drawable = C0320a.J0(drawable).mutate();
                G.a.h(drawable, this.f2306H);
            }
            int i = this.f2299A;
            drawable.setBounds(0, 0, i, i);
        } else if (this.f2300B) {
            if (this.f2307J == null) {
                Resources resources = getResources();
                Resources.Theme theme = getContext().getTheme();
                ThreadLocal threadLocal = r.f121a;
                Drawable a2 = k.a(resources, 2131230946, theme);
                this.f2307J = a2;
                if (a2 != null) {
                    int i2 = this.f2299A;
                    a2.setBounds(0, 0, i2, i2);
                }
            }
            drawable = this.f2307J;
        }
        this.f2303E.setCompoundDrawablesRelative(drawable, (Drawable) null, (Drawable) null, (Drawable) null);
    }

    private void setActionView(View view) {
        if (view != null) {
            if (this.f2304F == null) {
                this.f2304F = (FrameLayout) ((ViewStub) findViewById(2131296416)).inflate();
            }
            if (view.getParent() != null) {
                ((ViewGroup) view.getParent()).removeView(view);
            }
            this.f2304F.removeAllViews();
            this.f2304F.addView(view);
        }
    }

    public final void a(C0199n nVar) {
        int i;
        StateListDrawable stateListDrawable;
        this.f2305G = nVar;
        int i2 = nVar.f3900a;
        if (i2 > 0) {
            setId(i2);
        }
        if (nVar.isVisible()) {
            i = 0;
        } else {
            i = 8;
        }
        setVisibility(i);
        if (getBackground() == null) {
            TypedValue typedValue = new TypedValue();
            if (getContext().getTheme().resolveAttribute(2130968836, typedValue, true)) {
                stateListDrawable = new StateListDrawable();
                stateListDrawable.addState(f2298L, new ColorDrawable(typedValue.data));
                stateListDrawable.addState(ViewGroup.EMPTY_STATE_SET, new ColorDrawable(0));
            } else {
                stateListDrawable = null;
            }
            WeakHashMap weakHashMap = Q.f509a;
            setBackground(stateListDrawable);
        }
        setCheckable(nVar.isCheckable());
        setChecked(nVar.isChecked());
        setEnabled(nVar.isEnabled());
        setTitle(nVar.e);
        setIcon(nVar.getIcon());
        setActionView(nVar.getActionView());
        setContentDescription(nVar.f3914q);
        g.N(this, nVar.f3915r);
        C0199n nVar2 = this.f2305G;
        CharSequence charSequence = nVar2.e;
        CheckedTextView checkedTextView = this.f2303E;
        if (charSequence == null && nVar2.getIcon() == null && this.f2305G.getActionView() != null) {
            checkedTextView.setVisibility(8);
            FrameLayout frameLayout = this.f2304F;
            if (frameLayout != null) {
                C0317z0 z0Var = (C0317z0) frameLayout.getLayoutParams();
                z0Var.width = -1;
                this.f2304F.setLayoutParams(z0Var);
                return;
            }
            return;
        }
        checkedTextView.setVisibility(0);
        FrameLayout frameLayout2 = this.f2304F;
        if (frameLayout2 != null) {
            C0317z0 z0Var2 = (C0317z0) frameLayout2.getLayoutParams();
            z0Var2.width = -2;
            this.f2304F.setLayoutParams(z0Var2);
        }
    }

    public C0199n getItemData() {
        return this.f2305G;
    }

    public final int[] onCreateDrawableState(int i) {
        int[] onCreateDrawableState = super.onCreateDrawableState(i + 1);
        C0199n nVar = this.f2305G;
        if (nVar != null && nVar.isCheckable() && this.f2305G.isChecked()) {
            View.mergeDrawableStates(onCreateDrawableState, f2298L);
        }
        return onCreateDrawableState;
    }

    public void setIconPadding(int i) {
        this.f2303E.setCompoundDrawablePadding(i);
    }

    public void setIconSize(int i) {
        this.f2299A = i;
    }

    public void setIconTintList(ColorStateList colorStateList) {
        boolean z2;
        this.f2306H = colorStateList;
        if (colorStateList != null) {
            z2 = true;
        } else {
            z2 = false;
        }
        this.I = z2;
        C0199n nVar = this.f2305G;
        if (nVar != null) {
            setIcon(nVar.getIcon());
        }
    }

    public void setMaxLines(int i) {
        this.f2303E.setMaxLines(i);
    }

    public void setNeedsEmptyIcon(boolean z2) {
        this.f2300B = z2;
    }

    public void setTextAppearance(int i) {
        C0320a.C0(this.f2303E, i);
    }

    public void setTextColor(ColorStateList colorStateList) {
        this.f2303E.setTextColor(colorStateList);
    }

    public void setTitle(CharSequence charSequence) {
        this.f2303E.setText(charSequence);
    }

    public NavigationMenuItemView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        a aVar = new a(1, this);
        this.f2308K = aVar;
        setOrientation(0);
        LayoutInflater.from(context).inflate(2131492906, this, true);
        setIconSize(context.getResources().getDimensionPixelSize(2131165303));
        CheckedTextView checkedTextView = (CheckedTextView) findViewById(2131296417);
        this.f2303E = checkedTextView;
        checkedTextView.setDuplicateParentStateEnabled(true);
        Q.p(checkedTextView, aVar);
    }

    public void setCheckable(boolean z2) {
        refreshDrawableState();
        if (this.f2301C != z2) {
            this.f2301C = z2;
            this.f2308K.h(this.f2303E, 2048);
        }
    }

    public void setChecked(boolean z2) {
        int i;
        refreshDrawableState();
        CheckedTextView checkedTextView = this.f2303E;
        checkedTextView.setChecked(z2);
        Typeface typeface = checkedTextView.getTypeface();
        if (!z2 || !this.f2302D) {
            i = 0;
        } else {
            i = 1;
        }
        checkedTextView.setTypeface(typeface, i);
    }

    public void setHorizontalPadding(int i) {
        setPadding(i, getPaddingTop(), i, getPaddingBottom());
    }
}
