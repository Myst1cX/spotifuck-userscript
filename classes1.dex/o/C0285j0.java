package o;

import T.u;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.InputFilter;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ToggleButton;
import j0.C0140b;

/* renamed from: o.j0  reason: case insensitive filesystem */
public final class C0285j0 extends ToggleButton implements u {

    /* renamed from: f  reason: collision with root package name */
    public final C0140b f4230f;

    /* renamed from: g  reason: collision with root package name */
    public final Z f4231g;

    /* renamed from: h  reason: collision with root package name */
    public C0308v f4232h;

    private C0308v getEmojiTextViewHelper() {
        if (this.f4232h == null) {
            this.f4232h = new C0308v(this);
        }
        return this.f4232h;
    }

    public ColorStateList getSupportBackgroundTintList() {
        C0140b bVar = this.f4230f;
        if (bVar != null) {
            return bVar.h();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        C0140b bVar = this.f4230f;
        if (bVar != null) {
            return bVar.i();
        }
        return null;
    }

    public ColorStateList getSupportCompoundDrawablesTintList() {
        return this.f4231g.d();
    }

    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        return this.f4231g.e();
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        C0140b bVar = this.f4230f;
        if (bVar != null) {
            bVar.s(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        C0140b bVar = this.f4230f;
        if (bVar != null) {
            bVar.t(mode);
        }
    }

    public void setSupportCompoundDrawablesTintList(ColorStateList colorStateList) {
        Z z2 = this.f4231g;
        z2.l(colorStateList);
        z2.b();
    }

    public void setSupportCompoundDrawablesTintMode(PorterDuff.Mode mode) {
        Z z2 = this.f4231g;
        z2.m(mode);
        z2.b();
    }

    public C0285j0(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 16842827);
        U0.a(this, getContext());
        C0140b bVar = new C0140b((View) this);
        this.f4230f = bVar;
        bVar.k(attributeSet, 16842827);
        Z z2 = new Z(this);
        this.f4231g = z2;
        z2.f(attributeSet, 16842827);
        getEmojiTextViewHelper().b(attributeSet, 16842827);
    }

    public final void drawableStateChanged() {
        super.drawableStateChanged();
        C0140b bVar = this.f4230f;
        if (bVar != null) {
            bVar.a();
        }
        Z z2 = this.f4231g;
        if (z2 != null) {
            z2.b();
        }
    }

    public void setAllCaps(boolean z2) {
        super.setAllCaps(z2);
        getEmojiTextViewHelper().c(z2);
    }

    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        C0140b bVar = this.f4230f;
        if (bVar != null) {
            bVar.m();
        }
    }

    public void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        C0140b bVar = this.f4230f;
        if (bVar != null) {
            bVar.n(i);
        }
    }

    public final void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        Z z2 = this.f4231g;
        if (z2 != null) {
            z2.b();
        }
    }

    public final void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        Z z2 = this.f4231g;
        if (z2 != null) {
            z2.b();
        }
    }

    public void setEmojiCompatEnabled(boolean z2) {
        getEmojiTextViewHelper().d(z2);
    }

    public void setFilters(InputFilter[] inputFilterArr) {
        super.setFilters(getEmojiTextViewHelper().a(inputFilterArr));
    }
}
