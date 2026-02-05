package o;

import T.u;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.InputFilter;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.Button;
import j0.C0140b;
import p0.C0320a;

/* renamed from: o.p  reason: case insensitive filesystem */
public class C0296p extends Button implements u {

    /* renamed from: f  reason: collision with root package name */
    public final C0140b f4278f;

    /* renamed from: g  reason: collision with root package name */
    public final Z f4279g;

    /* renamed from: h  reason: collision with root package name */
    public C0308v f4280h;

    private C0308v getEmojiTextViewHelper() {
        if (this.f4280h == null) {
            this.f4280h = new C0308v(this);
        }
        return this.f4280h;
    }

    public int getAutoSizeMaxTextSize() {
        if (n1.f4274c) {
            return super.getAutoSizeMaxTextSize();
        }
        Z z2 = this.f4279g;
        if (z2 != null) {
            return Math.round(z2.i.e);
        }
        return -1;
    }

    public int getAutoSizeMinTextSize() {
        if (n1.f4274c) {
            return super.getAutoSizeMinTextSize();
        }
        Z z2 = this.f4279g;
        if (z2 != null) {
            return Math.round(z2.i.f4213d);
        }
        return -1;
    }

    public int getAutoSizeStepGranularity() {
        if (n1.f4274c) {
            return super.getAutoSizeStepGranularity();
        }
        Z z2 = this.f4279g;
        if (z2 != null) {
            return Math.round(z2.i.f4212c);
        }
        return -1;
    }

    public int[] getAutoSizeTextAvailableSizes() {
        if (n1.f4274c) {
            return super.getAutoSizeTextAvailableSizes();
        }
        Z z2 = this.f4279g;
        if (z2 != null) {
            return z2.i.f4214f;
        }
        return new int[0];
    }

    @SuppressLint({"WrongConstant"})
    public int getAutoSizeTextType() {
        if (!n1.f4274c) {
            Z z2 = this.f4279g;
            if (z2 != null) {
                return z2.i.f4210a;
            }
            return 0;
        } else if (super.getAutoSizeTextType() == 1) {
            return 1;
        } else {
            return 0;
        }
    }

    public ColorStateList getSupportBackgroundTintList() {
        C0140b bVar = this.f4278f;
        if (bVar != null) {
            return bVar.h();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        C0140b bVar = this.f4278f;
        if (bVar != null) {
            return bVar.i();
        }
        return null;
    }

    public ColorStateList getSupportCompoundDrawablesTintList() {
        return this.f4279g.d();
    }

    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        return this.f4279g.e();
    }

    public final void setAutoSizeTextTypeUniformWithConfiguration(int i, int i2, int i3, int i4) {
        if (n1.f4274c) {
            super.setAutoSizeTextTypeUniformWithConfiguration(i, i2, i3, i4);
            return;
        }
        Z z2 = this.f4279g;
        if (z2 != null) {
            z2.i(i, i2, i3, i4);
        }
    }

    public final void setAutoSizeTextTypeUniformWithPresetSizes(int[] iArr, int i) {
        if (n1.f4274c) {
            super.setAutoSizeTextTypeUniformWithPresetSizes(iArr, i);
            return;
        }
        Z z2 = this.f4279g;
        if (z2 != null) {
            z2.j(iArr, i);
        }
    }

    public void setAutoSizeTextTypeWithDefaults(int i) {
        if (n1.f4274c) {
            super.setAutoSizeTextTypeWithDefaults(i);
            return;
        }
        Z z2 = this.f4279g;
        if (z2 != null) {
            z2.k(i);
        }
    }

    public void setSupportAllCaps(boolean z2) {
        Z z3 = this.f4279g;
        if (z3 != null) {
            z3.f4154a.setAllCaps(z2);
        }
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        C0140b bVar = this.f4278f;
        if (bVar != null) {
            bVar.s(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        C0140b bVar = this.f4278f;
        if (bVar != null) {
            bVar.t(mode);
        }
    }

    public void setSupportCompoundDrawablesTintList(ColorStateList colorStateList) {
        Z z2 = this.f4279g;
        z2.l(colorStateList);
        z2.b();
    }

    public void setSupportCompoundDrawablesTintMode(PorterDuff.Mode mode) {
        Z z2 = this.f4279g;
        z2.m(mode);
        z2.b();
    }

    public final void setTextSize(int i, float f2) {
        boolean z2 = n1.f4274c;
        if (z2) {
            super.setTextSize(i, f2);
            return;
        }
        Z z3 = this.f4279g;
        if (z3 != null && !z2) {
            C0283i0 i0Var = z3.i;
            if (!i0Var.f()) {
                i0Var.g(i, f2);
            }
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C0296p(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        V0.a(context);
        U0.a(this, getContext());
        C0140b bVar = new C0140b((View) this);
        this.f4278f = bVar;
        bVar.k(attributeSet, i);
        Z z2 = new Z(this);
        this.f4279g = z2;
        z2.f(attributeSet, i);
        z2.b();
        getEmojiTextViewHelper().b(attributeSet, i);
    }

    public final void drawableStateChanged() {
        super.drawableStateChanged();
        C0140b bVar = this.f4278f;
        if (bVar != null) {
            bVar.a();
        }
        Z z2 = this.f4279g;
        if (z2 != null) {
            z2.b();
        }
    }

    public ActionMode.Callback getCustomSelectionActionModeCallback() {
        return C0320a.H0(super.getCustomSelectionActionModeCallback());
    }

    public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName(Button.class.getName());
    }

    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName(Button.class.getName());
    }

    public void onLayout(boolean z2, int i, int i2, int i3, int i4) {
        super.onLayout(z2, i, i2, i3, i4);
        Z z3 = this.f4279g;
        if (z3 != null && !n1.f4274c) {
            z3.i.a();
        }
    }

    public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        super.onTextChanged(charSequence, i, i2, i3);
        Z z2 = this.f4279g;
        if (z2 != null && !n1.f4274c) {
            C0283i0 i0Var = z2.i;
            if (i0Var.f()) {
                i0Var.a();
            }
        }
    }

    public void setAllCaps(boolean z2) {
        super.setAllCaps(z2);
        getEmojiTextViewHelper().c(z2);
    }

    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        C0140b bVar = this.f4278f;
        if (bVar != null) {
            bVar.m();
        }
    }

    public void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        C0140b bVar = this.f4278f;
        if (bVar != null) {
            bVar.n(i);
        }
    }

    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(C0320a.K0(callback, this));
    }

    public void setEmojiCompatEnabled(boolean z2) {
        getEmojiTextViewHelper().d(z2);
    }

    public void setFilters(InputFilter[] inputFilterArr) {
        super.setFilters(getEmojiTextViewHelper().a(inputFilterArr));
    }

    public final void setTextAppearance(Context context, int i) {
        super.setTextAppearance(context, i);
        Z z2 = this.f4279g;
        if (z2 != null) {
            z2.g(context, i);
        }
    }
}
