package o;

import T.u;
import T0.g;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.support.v4.media.session.t;
import android.text.method.KeyListener;
import android.text.method.NumberKeyListener;
import android.util.AttributeSet;
import android.view.View;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.EditText;
import android.widget.MultiAutoCompleteTextView;
import j0.C0140b;

/* renamed from: o.z  reason: case insensitive filesystem */
public final class C0316z extends MultiAutoCompleteTextView implements u {
    public static final int[] i = {16843126};

    /* renamed from: f  reason: collision with root package name */
    public final C0140b f4339f;

    /* renamed from: g  reason: collision with root package name */
    public final Z f4340g;

    /* renamed from: h  reason: collision with root package name */
    public final C0248C f4341h;

    public ColorStateList getSupportBackgroundTintList() {
        C0140b bVar = this.f4339f;
        if (bVar != null) {
            return bVar.h();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        C0140b bVar = this.f4339f;
        if (bVar != null) {
            return bVar.i();
        }
        return null;
    }

    public ColorStateList getSupportCompoundDrawablesTintList() {
        return this.f4340g.d();
    }

    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        return this.f4340g.e();
    }

    public void setEmojiCompatEnabled(boolean z2) {
        this.f4341h.d(z2);
    }

    public void setKeyListener(KeyListener keyListener) {
        super.setKeyListener(this.f4341h.a(keyListener));
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        C0140b bVar = this.f4339f;
        if (bVar != null) {
            bVar.s(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        C0140b bVar = this.f4339f;
        if (bVar != null) {
            bVar.t(mode);
        }
    }

    public void setSupportCompoundDrawablesTintList(ColorStateList colorStateList) {
        Z z2 = this.f4340g;
        z2.l(colorStateList);
        z2.b();
    }

    public void setSupportCompoundDrawablesTintMode(PorterDuff.Mode mode) {
        Z z2 = this.f4340g;
        z2.m(mode);
        z2.b();
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C0316z(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 2130968648);
        V0.a(context);
        U0.a(this, getContext());
        t A2 = t.A(getContext(), attributeSet, i, 2130968648);
        if (((TypedArray) A2.f1132c).hasValue(0)) {
            setDropDownBackgroundDrawable(A2.o(0));
        }
        A2.C();
        C0140b bVar = new C0140b((View) this);
        this.f4339f = bVar;
        bVar.k(attributeSet, 2130968648);
        Z z2 = new Z(this);
        this.f4340g = z2;
        z2.f(attributeSet, 2130968648);
        z2.b();
        C0248C c2 = new C0248C((EditText) this);
        this.f4341h = c2;
        c2.b(attributeSet, 2130968648);
        KeyListener keyListener = getKeyListener();
        if (!(keyListener instanceof NumberKeyListener)) {
            boolean isFocusable = isFocusable();
            boolean isClickable = isClickable();
            boolean isLongClickable = isLongClickable();
            int inputType = getInputType();
            KeyListener a2 = c2.a(keyListener);
            if (a2 != keyListener) {
                super.setKeyListener(a2);
                setRawInputType(inputType);
                setFocusable(isFocusable);
                setClickable(isClickable);
                setLongClickable(isLongClickable);
            }
        }
    }

    public final void drawableStateChanged() {
        super.drawableStateChanged();
        C0140b bVar = this.f4339f;
        if (bVar != null) {
            bVar.a();
        }
        Z z2 = this.f4340g;
        if (z2 != null) {
            z2.b();
        }
    }

    public final InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        InputConnection onCreateInputConnection = super.onCreateInputConnection(editorInfo);
        g.z(editorInfo, onCreateInputConnection, this);
        return this.f4341h.c(onCreateInputConnection, editorInfo);
    }

    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        C0140b bVar = this.f4339f;
        if (bVar != null) {
            bVar.m();
        }
    }

    public void setBackgroundResource(int i2) {
        super.setBackgroundResource(i2);
        C0140b bVar = this.f4339f;
        if (bVar != null) {
            bVar.n(i2);
        }
    }

    public final void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        Z z2 = this.f4340g;
        if (z2 != null) {
            z2.b();
        }
    }

    public final void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        Z z2 = this.f4340g;
        if (z2 != null) {
            z2.b();
        }
    }

    public void setDropDownBackgroundResource(int i2) {
        setDropDownBackgroundDrawable(g.n(getContext(), i2));
    }

    public final void setTextAppearance(Context context, int i2) {
        super.setTextAppearance(context, i2);
        Z z2 = this.f4340g;
        if (z2 != null) {
            z2.g(context, i2);
        }
    }
}
