package N0;

import E0.m;
import I0.c;
import I0.d;
import N.Q;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.support.v4.media.session.t;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.google.android.material.internal.CheckableImageButton;
import com.google.android.material.textfield.TextInputLayout;
import java.util.WeakHashMap;
import o.C0273d0;
import p0.C0320a;

public final class z extends LinearLayout {

    /* renamed from: f  reason: collision with root package name */
    public final TextInputLayout f726f;

    /* renamed from: g  reason: collision with root package name */
    public final C0273d0 f727g;

    /* renamed from: h  reason: collision with root package name */
    public CharSequence f728h;
    public final CheckableImageButton i;

    /* renamed from: j  reason: collision with root package name */
    public ColorStateList f729j;

    /* renamed from: k  reason: collision with root package name */
    public PorterDuff.Mode f730k;

    /* renamed from: l  reason: collision with root package name */
    public int f731l;

    /* renamed from: m  reason: collision with root package name */
    public ImageView.ScaleType f732m;

    /* renamed from: n  reason: collision with root package name */
    public View.OnLongClickListener f733n;

    /* renamed from: o  reason: collision with root package name */
    public boolean f734o;

    public final int a() {
        int i2;
        CheckableImageButton checkableImageButton = this.i;
        if (checkableImageButton.getVisibility() == 0) {
            i2 = ((ViewGroup.MarginLayoutParams) checkableImageButton.getLayoutParams()).getMarginEnd() + checkableImageButton.getMeasuredWidth();
        } else {
            i2 = 0;
        }
        WeakHashMap weakHashMap = Q.f509a;
        return this.f727g.getPaddingStart() + getPaddingStart() + i2;
    }

    public final void b(Drawable drawable) {
        CheckableImageButton checkableImageButton = this.i;
        checkableImageButton.setImageDrawable(drawable);
        if (drawable != null) {
            ColorStateList colorStateList = this.f729j;
            PorterDuff.Mode mode = this.f730k;
            TextInputLayout textInputLayout = this.f726f;
            C0320a.d(textInputLayout, checkableImageButton, colorStateList, mode);
            c(true);
            C0320a.n0(textInputLayout, checkableImageButton, this.f729j);
            return;
        }
        c(false);
        View.OnLongClickListener onLongClickListener = this.f733n;
        checkableImageButton.setOnClickListener((View.OnClickListener) null);
        C0320a.w0(checkableImageButton, onLongClickListener);
        this.f733n = null;
        checkableImageButton.setOnLongClickListener((View.OnLongClickListener) null);
        C0320a.w0(checkableImageButton, (View.OnLongClickListener) null);
        if (checkableImageButton.getContentDescription() != null) {
            checkableImageButton.setContentDescription((CharSequence) null);
        }
    }

    public final void c(boolean z2) {
        boolean z3;
        CheckableImageButton checkableImageButton = this.i;
        int i2 = 0;
        if (checkableImageButton.getVisibility() == 0) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (z3 != z2) {
            if (!z2) {
                i2 = 8;
            }
            checkableImageButton.setVisibility(i2);
            d();
            e();
        }
    }

    public final void d() {
        int i2;
        EditText editText = this.f726f.i;
        if (editText != null) {
            if (this.i.getVisibility() == 0) {
                i2 = 0;
            } else {
                WeakHashMap weakHashMap = Q.f509a;
                i2 = editText.getPaddingStart();
            }
            int compoundPaddingTop = editText.getCompoundPaddingTop();
            int dimensionPixelSize = getContext().getResources().getDimensionPixelSize(2131165760);
            int compoundPaddingBottom = editText.getCompoundPaddingBottom();
            WeakHashMap weakHashMap2 = Q.f509a;
            this.f727g.setPaddingRelative(i2, compoundPaddingTop, dimensionPixelSize, compoundPaddingBottom);
        }
    }

    public final void e() {
        int i2;
        int i3 = 8;
        if (this.f728h == null || this.f734o) {
            i2 = 8;
        } else {
            i2 = 0;
        }
        if (this.i.getVisibility() == 0 || i2 == 0) {
            i3 = 0;
        }
        setVisibility(i3);
        this.f727g.setVisibility(i2);
        this.f726f.q();
    }

    public z(TextInputLayout textInputLayout, t tVar) {
        super(textInputLayout.getContext());
        CharSequence text;
        this.f726f = textInputLayout;
        setVisibility(8);
        setOrientation(0);
        setLayoutParams(new FrameLayout.LayoutParams(-2, -1, 8388611));
        CheckableImageButton checkableImageButton = (CheckableImageButton) LayoutInflater.from(getContext()).inflate(2131492908, this, false);
        this.i = checkableImageButton;
        if (Build.VERSION.SDK_INT <= 22) {
            int[] iArr = d.f287a;
            checkableImageButton.setBackground(c.b(checkableImageButton.getContext(), (int) TypedValue.applyDimension(1, (float) 4, checkableImageButton.getContext().getResources().getDisplayMetrics())));
        }
        CharSequence charSequence = null;
        C0273d0 d0Var = new C0273d0(getContext(), (AttributeSet) null);
        this.f727g = d0Var;
        if (C0320a.d0(getContext())) {
            ((ViewGroup.MarginLayoutParams) checkableImageButton.getLayoutParams()).setMarginEnd(0);
        }
        View.OnLongClickListener onLongClickListener = this.f733n;
        checkableImageButton.setOnClickListener((View.OnClickListener) null);
        C0320a.w0(checkableImageButton, onLongClickListener);
        this.f733n = null;
        checkableImageButton.setOnLongClickListener((View.OnLongClickListener) null);
        C0320a.w0(checkableImageButton, (View.OnLongClickListener) null);
        TypedArray typedArray = (TypedArray) tVar.f1132c;
        if (typedArray.hasValue(69)) {
            this.f729j = C0320a.K(getContext(), tVar, 69);
        }
        if (typedArray.hasValue(70)) {
            this.f730k = m.g(typedArray.getInt(70, -1), (PorterDuff.Mode) null);
        }
        if (typedArray.hasValue(66)) {
            b(tVar.o(66));
            if (typedArray.hasValue(65) && checkableImageButton.getContentDescription() != (text = typedArray.getText(65))) {
                checkableImageButton.setContentDescription(text);
            }
            checkableImageButton.setCheckable(typedArray.getBoolean(64, true));
        }
        int dimensionPixelSize = typedArray.getDimensionPixelSize(67, getResources().getDimensionPixelSize(2131165890));
        if (dimensionPixelSize >= 0) {
            if (dimensionPixelSize != this.f731l) {
                this.f731l = dimensionPixelSize;
                checkableImageButton.setMinimumWidth(dimensionPixelSize);
                checkableImageButton.setMinimumHeight(dimensionPixelSize);
            }
            if (typedArray.hasValue(68)) {
                ImageView.ScaleType o2 = C0320a.o(typedArray.getInt(68, -1));
                this.f732m = o2;
                checkableImageButton.setScaleType(o2);
            }
            d0Var.setVisibility(8);
            d0Var.setId(2131296752);
            d0Var.setLayoutParams(new LinearLayout.LayoutParams(-2, -2));
            WeakHashMap weakHashMap = Q.f509a;
            d0Var.setAccessibilityLiveRegion(1);
            C0320a.C0(d0Var, typedArray.getResourceId(60, 0));
            if (typedArray.hasValue(61)) {
                d0Var.setTextColor(tVar.n(61));
            }
            CharSequence text2 = typedArray.getText(59);
            this.f728h = !TextUtils.isEmpty(text2) ? text2 : charSequence;
            d0Var.setText(text2);
            e();
            addView(checkableImageButton);
            addView(d0Var);
            return;
        }
        throw new IllegalArgumentException("startIconSize cannot be less than 0");
    }

    public final void onMeasure(int i2, int i3) {
        super.onMeasure(i2, i3);
        d();
    }
}
