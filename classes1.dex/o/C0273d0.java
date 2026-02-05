package o;

import L.g;
import L.h;
import T.n;
import T.q;
import T.u;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.InputFilter;
import android.text.TextDirectionHeuristic;
import android.text.TextDirectionHeuristics;
import android.text.TextPaint;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.ActionMode;
import android.view.View;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputMethodManager;
import android.view.textclassifier.TextClassifier;
import android.widget.TextView;
import j0.C0140b;
import j0.C0160w;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import p0.C0320a;

/* renamed from: o.d0  reason: case insensitive filesystem */
public class C0273d0 extends TextView implements u {

    /* renamed from: f  reason: collision with root package name */
    public final C0140b f4178f;

    /* renamed from: g  reason: collision with root package name */
    public final Z f4179g;

    /* renamed from: h  reason: collision with root package name */
    public final C0248C f4180h;
    public C0308v i;

    /* renamed from: j  reason: collision with root package name */
    public boolean f4181j;

    /* renamed from: k  reason: collision with root package name */
    public C0160w f4182k;

    /* renamed from: l  reason: collision with root package name */
    public Future f4183l;

    public C0273d0(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 16842884);
    }

    public final void setCompoundDrawablesRelativeWithIntrinsicBounds(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelativeWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
        Z z2 = this.f4179g;
        if (z2 != null) {
            z2.b();
        }
    }

    public final void setCompoundDrawablesWithIntrinsicBounds(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
        Z z2 = this.f4179g;
        if (z2 != null) {
            z2.b();
        }
    }

    public void setLineHeight(int i2) {
        C0320a.z0(this, i2);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C0273d0(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        V0.a(context);
        this.f4181j = false;
        this.f4182k = null;
        U0.a(this, getContext());
        C0140b bVar = new C0140b((View) this);
        this.f4178f = bVar;
        bVar.k(attributeSet, i2);
        Z z2 = new Z(this);
        this.f4179g = z2;
        z2.f(attributeSet, i2);
        z2.b();
        C0248C c2 = new C0248C();
        c2.f4050b = this;
        this.f4180h = c2;
        getEmojiTextViewHelper().b(attributeSet, i2);
    }

    private C0308v getEmojiTextViewHelper() {
        if (this.i == null) {
            this.i = new C0308v(this);
        }
        return this.i;
    }

    public final void g() {
        Future future = this.f4183l;
        if (future != null) {
            try {
                this.f4183l = null;
                if (future.get() != null) {
                    throw new ClassCastException();
                } else if (Build.VERSION.SDK_INT >= 29) {
                    throw null;
                } else {
                    C0320a.Z(this);
                    throw null;
                }
            } catch (InterruptedException | ExecutionException unused) {
            }
        }
    }

    public int getAutoSizeMaxTextSize() {
        if (n1.f4274c) {
            return super.getAutoSizeMaxTextSize();
        }
        Z z2 = this.f4179g;
        if (z2 != null) {
            return Math.round(z2.i.e);
        }
        return -1;
    }

    public int getAutoSizeMinTextSize() {
        if (n1.f4274c) {
            return super.getAutoSizeMinTextSize();
        }
        Z z2 = this.f4179g;
        if (z2 != null) {
            return Math.round(z2.i.f4213d);
        }
        return -1;
    }

    public int getAutoSizeStepGranularity() {
        if (n1.f4274c) {
            return super.getAutoSizeStepGranularity();
        }
        Z z2 = this.f4179g;
        if (z2 != null) {
            return Math.round(z2.i.f4212c);
        }
        return -1;
    }

    public int[] getAutoSizeTextAvailableSizes() {
        if (n1.f4274c) {
            return super.getAutoSizeTextAvailableSizes();
        }
        Z z2 = this.f4179g;
        if (z2 != null) {
            return z2.i.f4214f;
        }
        return new int[0];
    }

    @SuppressLint({"WrongConstant"})
    public int getAutoSizeTextType() {
        if (!n1.f4274c) {
            Z z2 = this.f4179g;
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

    public C0267a0 getSuperCaller() {
        if (this.f4182k == null) {
            int i2 = Build.VERSION.SDK_INT;
            if (i2 >= 34) {
                this.f4182k = new C0271c0(this);
            } else if (i2 >= 28) {
                this.f4182k = new C0269b0(this);
            } else if (i2 >= 26) {
                this.f4182k = new C0160w(this);
            }
        }
        return this.f4182k;
    }

    public ColorStateList getSupportBackgroundTintList() {
        C0140b bVar = this.f4178f;
        if (bVar != null) {
            return bVar.h();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        C0140b bVar = this.f4178f;
        if (bVar != null) {
            return bVar.i();
        }
        return null;
    }

    public ColorStateList getSupportCompoundDrawablesTintList() {
        return this.f4179g.d();
    }

    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        return this.f4179g.e();
    }

    public TextClassifier getTextClassifier() {
        C0248C c2;
        if (Build.VERSION.SDK_INT >= 28 || (c2 = this.f4180h) == null) {
            return super.getTextClassifier();
        }
        TextClassifier textClassifier = (TextClassifier) c2.f4051c;
        if (textClassifier == null) {
            return C0263S.a((TextView) c2.f4050b);
        }
        return textClassifier;
    }

    public final void setAutoSizeTextTypeUniformWithConfiguration(int i2, int i3, int i4, int i5) {
        if (n1.f4274c) {
            super.setAutoSizeTextTypeUniformWithConfiguration(i2, i3, i4, i5);
            return;
        }
        Z z2 = this.f4179g;
        if (z2 != null) {
            z2.i(i2, i3, i4, i5);
        }
    }

    public final void setAutoSizeTextTypeUniformWithPresetSizes(int[] iArr, int i2) {
        if (n1.f4274c) {
            super.setAutoSizeTextTypeUniformWithPresetSizes(iArr, i2);
            return;
        }
        Z z2 = this.f4179g;
        if (z2 != null) {
            z2.j(iArr, i2);
        }
    }

    public void setAutoSizeTextTypeWithDefaults(int i2) {
        if (n1.f4274c) {
            super.setAutoSizeTextTypeWithDefaults(i2);
            return;
        }
        Z z2 = this.f4179g;
        if (z2 != null) {
            z2.k(i2);
        }
    }

    public void setFirstBaselineToTopHeight(int i2) {
        if (Build.VERSION.SDK_INT >= 28) {
            getSuperCaller().a(i2);
        } else {
            C0320a.v0(this, i2);
        }
    }

    public void setLastBaselineToBottomHeight(int i2) {
        if (Build.VERSION.SDK_INT >= 28) {
            getSuperCaller().i(i2);
        } else {
            C0320a.x0(this, i2);
        }
    }

    public final void setLineHeight(int i2, float f2) {
        int i3 = Build.VERSION.SDK_INT;
        if (i3 >= 34) {
            getSuperCaller().e(i2, f2);
        } else if (i3 >= 34) {
            q.a(this, i2, f2);
        } else {
            C0320a.z0(this, Math.round(TypedValue.applyDimension(i2, f2, getResources().getDisplayMetrics())));
        }
    }

    public void setPrecomputedText(h hVar) {
        if (Build.VERSION.SDK_INT >= 29) {
            throw null;
        }
        C0320a.Z(this);
        throw null;
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        C0140b bVar = this.f4178f;
        if (bVar != null) {
            bVar.s(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        C0140b bVar = this.f4178f;
        if (bVar != null) {
            bVar.t(mode);
        }
    }

    public void setSupportCompoundDrawablesTintList(ColorStateList colorStateList) {
        Z z2 = this.f4179g;
        z2.l(colorStateList);
        z2.b();
    }

    public void setSupportCompoundDrawablesTintMode(PorterDuff.Mode mode) {
        Z z2 = this.f4179g;
        z2.m(mode);
        z2.b();
    }

    public void setTextClassifier(TextClassifier textClassifier) {
        C0248C c2;
        if (Build.VERSION.SDK_INT >= 28 || (c2 = this.f4180h) == null) {
            super.setTextClassifier(textClassifier);
        } else {
            c2.f4051c = textClassifier;
        }
    }

    public void setTextFuture(Future<h> future) {
        this.f4183l = future;
        if (future != null) {
            requestLayout();
        }
    }

    public void setTextMetricsParamsCompat(g gVar) {
        TextDirectionHeuristic textDirectionHeuristic;
        TextDirectionHeuristic textDirectionHeuristic2 = gVar.f458b;
        TextDirectionHeuristic textDirectionHeuristic3 = TextDirectionHeuristics.FIRSTSTRONG_RTL;
        int i2 = 1;
        if (!(textDirectionHeuristic2 == textDirectionHeuristic3 || textDirectionHeuristic2 == (textDirectionHeuristic = TextDirectionHeuristics.FIRSTSTRONG_LTR))) {
            if (textDirectionHeuristic2 == TextDirectionHeuristics.ANYRTL_LTR) {
                i2 = 2;
            } else if (textDirectionHeuristic2 == TextDirectionHeuristics.LTR) {
                i2 = 3;
            } else if (textDirectionHeuristic2 == TextDirectionHeuristics.RTL) {
                i2 = 4;
            } else if (textDirectionHeuristic2 == TextDirectionHeuristics.LOCALE) {
                i2 = 5;
            } else if (textDirectionHeuristic2 == textDirectionHeuristic) {
                i2 = 6;
            } else if (textDirectionHeuristic2 == textDirectionHeuristic3) {
                i2 = 7;
            }
        }
        setTextDirection(i2);
        int i3 = Build.VERSION.SDK_INT;
        TextPaint textPaint = gVar.f457a;
        if (i3 < 23) {
            float textScaleX = textPaint.getTextScaleX();
            getPaint().set(textPaint);
            if (textScaleX == getTextScaleX()) {
                setTextScaleX((textScaleX / 2.0f) + 1.0f);
            }
            setTextScaleX(textScaleX);
            return;
        }
        getPaint().set(textPaint);
        n.e(this, gVar.f459c);
        n.h(this, gVar.f460d);
    }

    public final void setTextSize(int i2, float f2) {
        boolean z2 = n1.f4274c;
        if (z2) {
            super.setTextSize(i2, f2);
            return;
        }
        Z z3 = this.f4179g;
        if (z3 != null && !z2) {
            C0283i0 i0Var = z3.i;
            if (!i0Var.f()) {
                i0Var.g(i2, f2);
            }
        }
    }

    public final void setTypeface(Typeface typeface, int i2) {
        Typeface typeface2;
        if (!this.f4181j) {
            if (typeface == null || i2 <= 0) {
                typeface2 = null;
            } else {
                Context context = getContext();
                C0320a aVar = F.g.f232a;
                if (context != null) {
                    typeface2 = Typeface.create(typeface, i2);
                } else {
                    throw new IllegalArgumentException("Context cannot be null");
                }
            }
            this.f4181j = true;
            if (typeface2 != null) {
                typeface = typeface2;
            }
            try {
                super.setTypeface(typeface, i2);
            } finally {
                this.f4181j = false;
            }
        }
    }

    public final void drawableStateChanged() {
        super.drawableStateChanged();
        C0140b bVar = this.f4178f;
        if (bVar != null) {
            bVar.a();
        }
        Z z2 = this.f4179g;
        if (z2 != null) {
            z2.b();
        }
    }

    public ActionMode.Callback getCustomSelectionActionModeCallback() {
        return C0320a.H0(super.getCustomSelectionActionModeCallback());
    }

    public int getFirstBaselineToTopHeight() {
        return getPaddingTop() - getPaint().getFontMetricsInt().top;
    }

    public int getLastBaselineToBottomHeight() {
        return getPaddingBottom() + getPaint().getFontMetricsInt().bottom;
    }

    public CharSequence getText() {
        g();
        return super.getText();
    }

    public g getTextMetricsParamsCompat() {
        return C0320a.Z(this);
    }

    public final InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        InputConnection onCreateInputConnection = super.onCreateInputConnection(editorInfo);
        this.f4179g.getClass();
        Z.h(editorInfo, onCreateInputConnection, this);
        T0.g.z(editorInfo, onCreateInputConnection, this);
        return onCreateInputConnection;
    }

    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 30 && i2 < 33 && onCheckIsTextEditor()) {
            ((InputMethodManager) getContext().getSystemService("input_method")).isActive(this);
        }
    }

    public final void onLayout(boolean z2, int i2, int i3, int i4, int i5) {
        super.onLayout(z2, i2, i3, i4, i5);
        Z z3 = this.f4179g;
        if (z3 != null && !n1.f4274c) {
            z3.i.a();
        }
    }

    public void onMeasure(int i2, int i3) {
        g();
        super.onMeasure(i2, i3);
    }

    public final void onTextChanged(CharSequence charSequence, int i2, int i3, int i4) {
        super.onTextChanged(charSequence, i2, i3, i4);
        Z z2 = this.f4179g;
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
        C0140b bVar = this.f4178f;
        if (bVar != null) {
            bVar.m();
        }
    }

    public void setBackgroundResource(int i2) {
        super.setBackgroundResource(i2);
        C0140b bVar = this.f4178f;
        if (bVar != null) {
            bVar.n(i2);
        }
    }

    public final void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        Z z2 = this.f4179g;
        if (z2 != null) {
            z2.b();
        }
    }

    public final void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        Z z2 = this.f4179g;
        if (z2 != null) {
            z2.b();
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

    public void setTextAppearance(Context context, int i2) {
        super.setTextAppearance(context, i2);
        Z z2 = this.f4179g;
        if (z2 != null) {
            z2.g(context, i2);
        }
    }

    public final void setCompoundDrawablesRelativeWithIntrinsicBounds(int i2, int i3, int i4, int i5) {
        Context context = getContext();
        Drawable drawable = null;
        Drawable n2 = i2 != 0 ? T0.g.n(context, i2) : null;
        Drawable n3 = i3 != 0 ? T0.g.n(context, i3) : null;
        Drawable n4 = i4 != 0 ? T0.g.n(context, i4) : null;
        if (i5 != 0) {
            drawable = T0.g.n(context, i5);
        }
        setCompoundDrawablesRelativeWithIntrinsicBounds(n2, n3, n4, drawable);
        Z z2 = this.f4179g;
        if (z2 != null) {
            z2.b();
        }
    }

    public final void setCompoundDrawablesWithIntrinsicBounds(int i2, int i3, int i4, int i5) {
        Context context = getContext();
        Drawable drawable = null;
        Drawable n2 = i2 != 0 ? T0.g.n(context, i2) : null;
        Drawable n3 = i3 != 0 ? T0.g.n(context, i3) : null;
        Drawable n4 = i4 != 0 ? T0.g.n(context, i4) : null;
        if (i5 != 0) {
            drawable = T0.g.n(context, i5);
        }
        setCompoundDrawablesWithIntrinsicBounds(n2, n3, n4, drawable);
        Z z2 = this.f4179g;
        if (z2 != null) {
            z2.b();
        }
    }
}
