package com.google.android.material.button;

import E0.m;
import G.a;
import I0.d;
import K0.j;
import K0.k;
import K0.v;
import N.Q;
import T0.g;
import U.b;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Build;
import android.os.Parcelable;
import android.text.Layout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.Button;
import android.widget.Checkable;
import android.widget.CompoundButton;
import j0.C0160w;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.WeakHashMap;
import o.C0296p;
import p0.C0320a;
import q0.C0322a;
import w0.C0352a;
import w0.C0353b;
import w0.c;

public class MaterialButton extends C0296p implements Checkable, v {

    /* renamed from: w  reason: collision with root package name */
    public static final int[] f2162w = {16842911};

    /* renamed from: x  reason: collision with root package name */
    public static final int[] f2163x = {16842912};
    public final c i;

    /* renamed from: j  reason: collision with root package name */
    public final LinkedHashSet f2164j = new LinkedHashSet();

    /* renamed from: k  reason: collision with root package name */
    public C0352a f2165k;

    /* renamed from: l  reason: collision with root package name */
    public PorterDuff.Mode f2166l;

    /* renamed from: m  reason: collision with root package name */
    public ColorStateList f2167m;

    /* renamed from: n  reason: collision with root package name */
    public Drawable f2168n;

    /* renamed from: o  reason: collision with root package name */
    public String f2169o;

    /* renamed from: p  reason: collision with root package name */
    public int f2170p;

    /* renamed from: q  reason: collision with root package name */
    public int f2171q;

    /* renamed from: r  reason: collision with root package name */
    public int f2172r;

    /* renamed from: s  reason: collision with root package name */
    public int f2173s;

    /* renamed from: t  reason: collision with root package name */
    public boolean f2174t;

    /* renamed from: u  reason: collision with root package name */
    public boolean f2175u;

    /* renamed from: v  reason: collision with root package name */
    public int f2176v;

    public final void e(int i2, int i3) {
        boolean z2;
        boolean z3;
        if (this.f2168n != null && getLayout() != null) {
            int i4 = this.f2176v;
            boolean z4 = true;
            if (i4 == 1 || i4 == 2) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (z2 || i4 == 3 || i4 == 4) {
                this.f2172r = 0;
                Layout.Alignment actualTextAlignment = getActualTextAlignment();
                int i5 = this.f2176v;
                if (i5 == 1 || i5 == 3 || ((i5 == 2 && actualTextAlignment == Layout.Alignment.ALIGN_NORMAL) || (i5 == 4 && actualTextAlignment == Layout.Alignment.ALIGN_OPPOSITE))) {
                    this.f2171q = 0;
                    d(false);
                    return;
                }
                int i6 = this.f2170p;
                if (i6 == 0) {
                    i6 = this.f2168n.getIntrinsicWidth();
                }
                int textLayoutWidth = i2 - getTextLayoutWidth();
                WeakHashMap weakHashMap = Q.f509a;
                int paddingEnd = (((textLayoutWidth - getPaddingEnd()) - i6) - this.f2173s) - getPaddingStart();
                if (actualTextAlignment == Layout.Alignment.ALIGN_CENTER) {
                    paddingEnd /= 2;
                }
                if (getLayoutDirection() == 1) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                if (this.f2176v != 4) {
                    z4 = false;
                }
                if (z3 != z4) {
                    paddingEnd = -paddingEnd;
                }
                if (this.f2171q != paddingEnd) {
                    this.f2171q = paddingEnd;
                    d(false);
                }
            } else if (i4 == 16 || i4 == 32) {
                this.f2171q = 0;
                if (i4 == 16) {
                    this.f2172r = 0;
                    d(false);
                    return;
                }
                int i7 = this.f2170p;
                if (i7 == 0) {
                    i7 = this.f2168n.getIntrinsicHeight();
                }
                int max = Math.max(0, (((((i3 - getTextHeight()) - getPaddingTop()) - i7) - this.f2173s) - getPaddingBottom()) / 2);
                if (this.f2172r != max) {
                    this.f2172r = max;
                    d(false);
                }
            }
        }
    }

    public final boolean a() {
        c cVar = this.i;
        if (cVar == null || !cVar.f4918q) {
            return false;
        }
        return true;
    }

    public final boolean b() {
        c cVar = this.i;
        if (cVar == null || cVar.f4916o) {
            return false;
        }
        return true;
    }

    public final void c() {
        int i2 = this.f2176v;
        boolean z2 = true;
        if (!(i2 == 1 || i2 == 2)) {
            z2 = false;
        }
        if (z2) {
            setCompoundDrawablesRelative(this.f2168n, (Drawable) null, (Drawable) null, (Drawable) null);
        } else if (i2 == 3 || i2 == 4) {
            setCompoundDrawablesRelative((Drawable) null, (Drawable) null, this.f2168n, (Drawable) null);
        } else if (i2 == 16 || i2 == 32) {
            setCompoundDrawablesRelative((Drawable) null, this.f2168n, (Drawable) null, (Drawable) null);
        }
    }

    public final void d(boolean z2) {
        Drawable drawable = this.f2168n;
        if (drawable != null) {
            Drawable mutate = C0320a.J0(drawable).mutate();
            this.f2168n = mutate;
            a.h(mutate, this.f2167m);
            PorterDuff.Mode mode = this.f2166l;
            if (mode != null) {
                a.i(this.f2168n, mode);
            }
            int i2 = this.f2170p;
            if (i2 == 0) {
                i2 = this.f2168n.getIntrinsicWidth();
            }
            int i3 = this.f2170p;
            if (i3 == 0) {
                i3 = this.f2168n.getIntrinsicHeight();
            }
            Drawable drawable2 = this.f2168n;
            int i4 = this.f2171q;
            int i5 = this.f2172r;
            drawable2.setBounds(i4, i5, i2 + i4, i3 + i5);
            this.f2168n.setVisible(true, z2);
        }
        if (z2) {
            c();
            return;
        }
        Drawable[] compoundDrawablesRelative = getCompoundDrawablesRelative();
        Drawable drawable3 = compoundDrawablesRelative[0];
        Drawable drawable4 = compoundDrawablesRelative[1];
        Drawable drawable5 = compoundDrawablesRelative[2];
        int i6 = this.f2176v;
        if (((i6 == 1 || i6 == 2) && drawable3 != this.f2168n) || (((i6 == 3 || i6 == 4) && drawable5 != this.f2168n) || ((i6 == 16 || i6 == 32) && drawable4 != this.f2168n))) {
            c();
        }
    }

    public String getA11yClassName() {
        Class cls;
        if (!TextUtils.isEmpty(this.f2169o)) {
            return this.f2169o;
        }
        if (a()) {
            cls = CompoundButton.class;
        } else {
            cls = Button.class;
        }
        return cls.getName();
    }

    public Drawable getIcon() {
        return this.f2168n;
    }

    public int getIconGravity() {
        return this.f2176v;
    }

    public int getIconPadding() {
        return this.f2173s;
    }

    public int getIconSize() {
        return this.f2170p;
    }

    public ColorStateList getIconTint() {
        return this.f2167m;
    }

    public PorterDuff.Mode getIconTintMode() {
        return this.f2166l;
    }

    public int getInsetBottom() {
        return this.i.f4908f;
    }

    public int getInsetTop() {
        return this.i.e;
    }

    public final boolean isChecked() {
        return this.f2174t;
    }

    public final int[] onCreateDrawableState(int i2) {
        int[] onCreateDrawableState = super.onCreateDrawableState(i2 + 2);
        if (a()) {
            View.mergeDrawableStates(onCreateDrawableState, f2162w);
        }
        if (this.f2174t) {
            View.mergeDrawableStates(onCreateDrawableState, f2163x);
        }
        return onCreateDrawableState;
    }

    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof C0353b)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        C0353b bVar = (C0353b) parcelable;
        super.onRestoreInstanceState(bVar.f940a);
        setChecked(bVar.f4901c);
    }

    public final boolean performClick() {
        if (this.i.f4919r) {
            toggle();
        }
        return super.performClick();
    }

    public void setA11yClassName(String str) {
        this.f2169o = str;
    }

    public void setBackgroundResource(int i2) {
        Drawable drawable;
        if (i2 != 0) {
            drawable = g.n(getContext(), i2);
        } else {
            drawable = null;
        }
        setBackgroundDrawable(drawable);
    }

    public void setIcon(Drawable drawable) {
        if (this.f2168n != drawable) {
            this.f2168n = drawable;
            d(true);
            e(getMeasuredWidth(), getMeasuredHeight());
        }
    }

    public void setIconGravity(int i2) {
        if (this.f2176v != i2) {
            this.f2176v = i2;
            e(getMeasuredWidth(), getMeasuredHeight());
        }
    }

    public void setIconPadding(int i2) {
        if (this.f2173s != i2) {
            this.f2173s = i2;
            setCompoundDrawablePadding(i2);
        }
    }

    public void setIconResource(int i2) {
        Drawable drawable;
        if (i2 != 0) {
            drawable = g.n(getContext(), i2);
        } else {
            drawable = null;
        }
        setIcon(drawable);
    }

    public void setIconSize(int i2) {
        if (i2 < 0) {
            throw new IllegalArgumentException("iconSize cannot be less than 0");
        } else if (this.f2170p != i2) {
            this.f2170p = i2;
            d(true);
        }
    }

    public void setIconTint(ColorStateList colorStateList) {
        if (this.f2167m != colorStateList) {
            this.f2167m = colorStateList;
            d(false);
        }
    }

    public void setIconTintMode(PorterDuff.Mode mode) {
        if (this.f2166l != mode) {
            this.f2166l = mode;
            d(false);
        }
    }

    public void setInsetBottom(int i2) {
        c cVar = this.i;
        cVar.d(cVar.e, i2);
    }

    public void setInsetTop(int i2) {
        c cVar = this.i;
        cVar.d(i2, cVar.f4908f);
    }

    public void setOnPressedChangeListenerInternal(C0352a aVar) {
        this.f2165k = aVar;
    }

    public void setPressed(boolean z2) {
        C0352a aVar = this.f2165k;
        if (aVar != null) {
            ((MaterialButtonToggleGroup) ((C0160w) aVar).f3516f).invalidate();
        }
        super.setPressed(z2);
    }

    public void setToggleCheckedStateOnClick(boolean z2) {
        this.i.f4919r = z2;
    }

    public final void toggle() {
        setChecked(!this.f2174t);
    }

    public MaterialButton(Context context, AttributeSet attributeSet) {
        super(P0.a.a(context, attributeSet, 2130969349, 2131821602), attributeSet, 2130969349);
        boolean z2 = false;
        this.f2174t = false;
        this.f2175u = false;
        Context context2 = getContext();
        TypedArray f2 = m.f(context2, attributeSet, C0322a.f4491j, 2130969349, 2131821602, new int[0]);
        this.f2173s = f2.getDimensionPixelSize(12, 0);
        int i2 = f2.getInt(15, -1);
        PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
        this.f2166l = m.g(i2, mode);
        this.f2167m = C0320a.J(getContext(), f2, 14);
        this.f2168n = C0320a.O(getContext(), f2, 10);
        this.f2176v = f2.getInteger(11, 1);
        this.f2170p = f2.getDimensionPixelSize(13, 0);
        c cVar = new c(this, k.b(context2, attributeSet, 2130969349, 2131821602).a());
        this.i = cVar;
        cVar.f4906c = f2.getDimensionPixelOffset(1, 0);
        cVar.f4907d = f2.getDimensionPixelOffset(2, 0);
        cVar.e = f2.getDimensionPixelOffset(3, 0);
        cVar.f4908f = f2.getDimensionPixelOffset(4, 0);
        if (f2.hasValue(8)) {
            int dimensionPixelSize = f2.getDimensionPixelSize(8, -1);
            cVar.f4909g = dimensionPixelSize;
            float f3 = (float) dimensionPixelSize;
            j e = cVar.f4905b.e();
            e.e = new K0.a(f3);
            e.f399f = new K0.a(f3);
            e.f400g = new K0.a(f3);
            e.f401h = new K0.a(f3);
            cVar.c(e.a());
            cVar.f4917p = true;
        }
        cVar.f4910h = f2.getDimensionPixelSize(20, 0);
        cVar.i = m.g(f2.getInt(7, -1), mode);
        cVar.f4911j = C0320a.J(getContext(), f2, 6);
        cVar.f4912k = C0320a.J(getContext(), f2, 19);
        cVar.f4913l = C0320a.J(getContext(), f2, 16);
        cVar.f4918q = f2.getBoolean(5, false);
        cVar.f4921t = f2.getDimensionPixelSize(9, 0);
        cVar.f4919r = f2.getBoolean(21, true);
        WeakHashMap weakHashMap = Q.f509a;
        int paddingStart = getPaddingStart();
        int paddingTop = getPaddingTop();
        int paddingEnd = getPaddingEnd();
        int paddingBottom = getPaddingBottom();
        if (f2.hasValue(0)) {
            cVar.f4916o = true;
            setSupportBackgroundTintList(cVar.f4911j);
            setSupportBackgroundTintMode(cVar.i);
        } else {
            cVar.e();
        }
        setPaddingRelative(paddingStart + cVar.f4906c, paddingTop + cVar.e, paddingEnd + cVar.f4907d, paddingBottom + cVar.f4908f);
        f2.recycle();
        setCompoundDrawablePadding(this.f2173s);
        d(this.f2168n != null ? true : z2);
    }

    private Layout.Alignment getActualTextAlignment() {
        int textAlignment = getTextAlignment();
        if (textAlignment == 1) {
            return getGravityTextAlignment();
        }
        if (textAlignment == 6 || textAlignment == 3) {
            return Layout.Alignment.ALIGN_OPPOSITE;
        }
        if (textAlignment != 4) {
            return Layout.Alignment.ALIGN_NORMAL;
        }
        return Layout.Alignment.ALIGN_CENTER;
    }

    private Layout.Alignment getGravityTextAlignment() {
        int gravity = getGravity() & 8388615;
        if (gravity == 1) {
            return Layout.Alignment.ALIGN_CENTER;
        }
        if (gravity == 5 || gravity == 8388613) {
            return Layout.Alignment.ALIGN_OPPOSITE;
        }
        return Layout.Alignment.ALIGN_NORMAL;
    }

    private int getTextHeight() {
        if (getLineCount() > 1) {
            return getLayout().getHeight();
        }
        TextPaint paint = getPaint();
        String charSequence = getText().toString();
        if (getTransformationMethod() != null) {
            charSequence = getTransformationMethod().getTransformation(charSequence, this).toString();
        }
        Rect rect = new Rect();
        paint.getTextBounds(charSequence, 0, charSequence.length(), rect);
        return Math.min(rect.height(), getLayout().getHeight());
    }

    private int getTextLayoutWidth() {
        int lineCount = getLineCount();
        float f2 = 0.0f;
        for (int i2 = 0; i2 < lineCount; i2++) {
            f2 = Math.max(f2, getLayout().getLineWidth(i2));
        }
        return (int) Math.ceil((double) f2);
    }

    public ColorStateList getBackgroundTintList() {
        return getSupportBackgroundTintList();
    }

    public PorterDuff.Mode getBackgroundTintMode() {
        return getSupportBackgroundTintMode();
    }

    public int getCornerRadius() {
        if (b()) {
            return this.i.f4909g;
        }
        return 0;
    }

    public ColorStateList getRippleColor() {
        if (b()) {
            return this.i.f4913l;
        }
        return null;
    }

    public k getShapeAppearanceModel() {
        if (b()) {
            return this.i.f4905b;
        }
        throw new IllegalStateException("Attempted to get ShapeAppearanceModel from a MaterialButton which has an overwritten background.");
    }

    public ColorStateList getStrokeColor() {
        if (b()) {
            return this.i.f4912k;
        }
        return null;
    }

    public int getStrokeWidth() {
        if (b()) {
            return this.i.f4910h;
        }
        return 0;
    }

    public ColorStateList getSupportBackgroundTintList() {
        if (b()) {
            return this.i.f4911j;
        }
        return super.getSupportBackgroundTintList();
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        if (b()) {
            return this.i.i;
        }
        return super.getSupportBackgroundTintMode();
    }

    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (b()) {
            C0320a.B0(this, this.i.b(false));
        }
    }

    public final void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName(getA11yClassName());
        accessibilityEvent.setChecked(this.f2174t);
    }

    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName(getA11yClassName());
        accessibilityNodeInfo.setCheckable(a());
        accessibilityNodeInfo.setChecked(this.f2174t);
        accessibilityNodeInfo.setClickable(isClickable());
    }

    public final void onLayout(boolean z2, int i2, int i3, int i4, int i5) {
        c cVar;
        super.onLayout(z2, i2, i3, i4, i5);
        if (Build.VERSION.SDK_INT == 21 && (cVar = this.i) != null) {
            int i6 = i5 - i3;
            int i7 = i4 - i2;
            Drawable drawable = cVar.f4914m;
            if (drawable != null) {
                drawable.setBounds(cVar.f4906c, cVar.e, i7 - cVar.f4907d, i6 - cVar.f4908f);
            }
        }
        e(getMeasuredWidth(), getMeasuredHeight());
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [android.os.Parcelable, U.b, w0.b] */
    public final Parcelable onSaveInstanceState() {
        ? bVar = new b(super.onSaveInstanceState());
        bVar.f4901c = this.f2174t;
        return bVar;
    }

    public final void onTextChanged(CharSequence charSequence, int i2, int i3, int i4) {
        super.onTextChanged(charSequence, i2, i3, i4);
        e(getMeasuredWidth(), getMeasuredHeight());
    }

    public final void refreshDrawableState() {
        super.refreshDrawableState();
        if (this.f2168n != null) {
            if (this.f2168n.setState(getDrawableState())) {
                invalidate();
            }
        }
    }

    public void setBackground(Drawable drawable) {
        setBackgroundDrawable(drawable);
    }

    public void setBackgroundColor(int i2) {
        if (b()) {
            c cVar = this.i;
            if (cVar.b(false) != null) {
                cVar.b(false).setTint(i2);
                return;
            }
            return;
        }
        super.setBackgroundColor(i2);
    }

    public void setBackgroundDrawable(Drawable drawable) {
        if (!b()) {
            super.setBackgroundDrawable(drawable);
        } else if (drawable != getBackground()) {
            Log.w("MaterialButton", "MaterialButton manages its own background to control elevation, shape, color and states. Consider using backgroundTint, shapeAppearance and other attributes where available. A custom background will ignore these attributes and you should consider handling interaction states such as pressed, focused and disabled");
            c cVar = this.i;
            cVar.f4916o = true;
            ColorStateList colorStateList = cVar.f4911j;
            MaterialButton materialButton = cVar.f4904a;
            materialButton.setSupportBackgroundTintList(colorStateList);
            materialButton.setSupportBackgroundTintMode(cVar.i);
            super.setBackgroundDrawable(drawable);
        } else {
            getBackground().setState(drawable.getState());
        }
    }

    public void setBackgroundTintList(ColorStateList colorStateList) {
        setSupportBackgroundTintList(colorStateList);
    }

    public void setBackgroundTintMode(PorterDuff.Mode mode) {
        setSupportBackgroundTintMode(mode);
    }

    public void setCheckable(boolean z2) {
        if (b()) {
            this.i.f4918q = z2;
        }
    }

    public void setChecked(boolean z2) {
        if (a() && isEnabled() && this.f2174t != z2) {
            this.f2174t = z2;
            refreshDrawableState();
            if (getParent() instanceof MaterialButtonToggleGroup) {
                MaterialButtonToggleGroup materialButtonToggleGroup = (MaterialButtonToggleGroup) getParent();
                boolean z3 = this.f2174t;
                if (!materialButtonToggleGroup.f2182k) {
                    materialButtonToggleGroup.b(getId(), z3);
                }
            }
            if (!this.f2175u) {
                this.f2175u = true;
                Iterator it2 = this.f2164j.iterator();
                if (!it2.hasNext()) {
                    this.f2175u = false;
                } else {
                    it2.next().getClass();
                    throw new ClassCastException();
                }
            }
        }
    }

    public void setCornerRadius(int i2) {
        if (b()) {
            c cVar = this.i;
            if (!cVar.f4917p || cVar.f4909g != i2) {
                cVar.f4909g = i2;
                cVar.f4917p = true;
                float f2 = (float) i2;
                j e = cVar.f4905b.e();
                e.e = new K0.a(f2);
                e.f399f = new K0.a(f2);
                e.f400g = new K0.a(f2);
                e.f401h = new K0.a(f2);
                cVar.c(e.a());
            }
        }
    }

    public void setCornerRadiusResource(int i2) {
        if (b()) {
            setCornerRadius(getResources().getDimensionPixelSize(i2));
        }
    }

    public void setElevation(float f2) {
        super.setElevation(f2);
        if (b()) {
            this.i.b(false).i(f2);
        }
    }

    public void setIconTintResource(int i2) {
        setIconTint(C0320a.I(getContext(), i2));
    }

    public void setInternalBackground(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
    }

    public void setRippleColor(ColorStateList colorStateList) {
        if (b()) {
            c cVar = this.i;
            if (cVar.f4913l != colorStateList) {
                cVar.f4913l = colorStateList;
                boolean z2 = c.f4902u;
                MaterialButton materialButton = cVar.f4904a;
                if (z2 && (materialButton.getBackground() instanceof RippleDrawable)) {
                    ((RippleDrawable) materialButton.getBackground()).setColor(d.a(colorStateList));
                } else if (!z2 && (materialButton.getBackground() instanceof I0.b)) {
                    ((I0.b) materialButton.getBackground()).setTintList(d.a(colorStateList));
                }
            }
        }
    }

    public void setRippleColorResource(int i2) {
        if (b()) {
            setRippleColor(C0320a.I(getContext(), i2));
        }
    }

    public void setShapeAppearanceModel(k kVar) {
        if (b()) {
            this.i.c(kVar);
            return;
        }
        throw new IllegalStateException("Attempted to set ShapeAppearanceModel on a MaterialButton which has an overwritten background.");
    }

    public void setShouldDrawSurfaceColorStroke(boolean z2) {
        if (b()) {
            c cVar = this.i;
            cVar.f4915n = z2;
            cVar.f();
        }
    }

    public void setStrokeColor(ColorStateList colorStateList) {
        if (b()) {
            c cVar = this.i;
            if (cVar.f4912k != colorStateList) {
                cVar.f4912k = colorStateList;
                cVar.f();
            }
        }
    }

    public void setStrokeColorResource(int i2) {
        if (b()) {
            setStrokeColor(C0320a.I(getContext(), i2));
        }
    }

    public void setStrokeWidth(int i2) {
        if (b()) {
            c cVar = this.i;
            if (cVar.f4910h != i2) {
                cVar.f4910h = i2;
                cVar.f();
            }
        }
    }

    public void setStrokeWidthResource(int i2) {
        if (b()) {
            setStrokeWidth(getResources().getDimensionPixelSize(i2));
        }
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        if (b()) {
            c cVar = this.i;
            if (cVar.f4911j != colorStateList) {
                cVar.f4911j = colorStateList;
                if (cVar.b(false) != null) {
                    a.h(cVar.b(false), cVar.f4911j);
                    return;
                }
                return;
            }
            return;
        }
        super.setSupportBackgroundTintList(colorStateList);
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        if (b()) {
            c cVar = this.i;
            if (cVar.i != mode) {
                cVar.i = mode;
                if (cVar.b(false) != null && cVar.i != null) {
                    a.i(cVar.b(false), cVar.i);
                    return;
                }
                return;
            }
            return;
        }
        super.setSupportBackgroundTintMode(mode);
    }

    public void setTextAlignment(int i2) {
        super.setTextAlignment(i2);
        e(getMeasuredWidth(), getMeasuredHeight());
    }
}
