package o;

import T.t;
import T.u;
import T0.g;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.InputFilter;
import android.util.AttributeSet;
import android.view.View;
import android.widget.CheckBox;
import j0.C0140b;
import k0.C0168c;

/* renamed from: o.q  reason: case insensitive filesystem */
public class C0298q extends CheckBox implements t, u {

    /* renamed from: f  reason: collision with root package name */
    public final C0168c f4284f;

    /* renamed from: g  reason: collision with root package name */
    public final C0140b f4285g;

    /* renamed from: h  reason: collision with root package name */
    public final Z f4286h;
    public C0308v i;

    public void setButtonDrawable(Drawable drawable) {
        super.setButtonDrawable(drawable);
        C0168c cVar = this.f4284f;
        if (cVar == null) {
            return;
        }
        if (cVar.f3564c) {
            cVar.f3564c = false;
            return;
        }
        cVar.f3564c = true;
        cVar.a();
    }

    private C0308v getEmojiTextViewHelper() {
        if (this.i == null) {
            this.i = new C0308v(this);
        }
        return this.i;
    }

    public ColorStateList getSupportBackgroundTintList() {
        C0140b bVar = this.f4285g;
        if (bVar != null) {
            return bVar.h();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        C0140b bVar = this.f4285g;
        if (bVar != null) {
            return bVar.i();
        }
        return null;
    }

    public ColorStateList getSupportButtonTintList() {
        C0168c cVar = this.f4284f;
        if (cVar != null) {
            return (ColorStateList) cVar.e;
        }
        return null;
    }

    public PorterDuff.Mode getSupportButtonTintMode() {
        C0168c cVar = this.f4284f;
        if (cVar != null) {
            return (PorterDuff.Mode) cVar.f3566f;
        }
        return null;
    }

    public ColorStateList getSupportCompoundDrawablesTintList() {
        return this.f4286h.d();
    }

    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        return this.f4286h.e();
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        C0140b bVar = this.f4285g;
        if (bVar != null) {
            bVar.s(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        C0140b bVar = this.f4285g;
        if (bVar != null) {
            bVar.t(mode);
        }
    }

    public void setSupportButtonTintList(ColorStateList colorStateList) {
        C0168c cVar = this.f4284f;
        if (cVar != null) {
            cVar.e = colorStateList;
            cVar.f3562a = true;
            cVar.a();
        }
    }

    public void setSupportButtonTintMode(PorterDuff.Mode mode) {
        C0168c cVar = this.f4284f;
        if (cVar != null) {
            cVar.f3566f = mode;
            cVar.f3563b = true;
            cVar.a();
        }
    }

    public void setSupportCompoundDrawablesTintList(ColorStateList colorStateList) {
        Z z2 = this.f4286h;
        z2.l(colorStateList);
        z2.b();
    }

    public void setSupportCompoundDrawablesTintMode(PorterDuff.Mode mode) {
        Z z2 = this.f4286h;
        z2.m(mode);
        z2.b();
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C0298q(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        V0.a(context);
        U0.a(this, getContext());
        C0168c cVar = new C0168c(this);
        this.f4284f = cVar;
        cVar.d(attributeSet, i2);
        C0140b bVar = new C0140b((View) this);
        this.f4285g = bVar;
        bVar.k(attributeSet, i2);
        Z z2 = new Z(this);
        this.f4286h = z2;
        z2.f(attributeSet, i2);
        getEmojiTextViewHelper().b(attributeSet, i2);
    }

    public void drawableStateChanged() {
        super.drawableStateChanged();
        C0140b bVar = this.f4285g;
        if (bVar != null) {
            bVar.a();
        }
        Z z2 = this.f4286h;
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
        C0140b bVar = this.f4285g;
        if (bVar != null) {
            bVar.m();
        }
    }

    public void setBackgroundResource(int i2) {
        super.setBackgroundResource(i2);
        C0140b bVar = this.f4285g;
        if (bVar != null) {
            bVar.n(i2);
        }
    }

    public void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        Z z2 = this.f4286h;
        if (z2 != null) {
            z2.b();
        }
    }

    public void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        Z z2 = this.f4286h;
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

    public void setButtonDrawable(int i2) {
        setButtonDrawable(g.n(getContext(), i2));
    }
}
