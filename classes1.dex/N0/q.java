package N0;

import E0.m;
import I0.c;
import I0.d;
import N.Q;
import O.b;
import Q0.E;
import T0.g;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.support.v4.media.session.t;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityManager;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.google.android.material.internal.CheckableImageButton;
import com.google.android.material.textfield.TextInputLayout;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.WeakHashMap;
import o.C0273d0;
import p0.C0320a;

public final class q extends LinearLayout {

    /* renamed from: A  reason: collision with root package name */
    public final m f655A = new m(this);

    /* renamed from: f  reason: collision with root package name */
    public final TextInputLayout f656f;

    /* renamed from: g  reason: collision with root package name */
    public final FrameLayout f657g;

    /* renamed from: h  reason: collision with root package name */
    public final CheckableImageButton f658h;
    public ColorStateList i;

    /* renamed from: j  reason: collision with root package name */
    public PorterDuff.Mode f659j;

    /* renamed from: k  reason: collision with root package name */
    public View.OnLongClickListener f660k;

    /* renamed from: l  reason: collision with root package name */
    public final CheckableImageButton f661l;

    /* renamed from: m  reason: collision with root package name */
    public final p f662m;

    /* renamed from: n  reason: collision with root package name */
    public int f663n = 0;

    /* renamed from: o  reason: collision with root package name */
    public final LinkedHashSet f664o = new LinkedHashSet();

    /* renamed from: p  reason: collision with root package name */
    public ColorStateList f665p;

    /* renamed from: q  reason: collision with root package name */
    public PorterDuff.Mode f666q;

    /* renamed from: r  reason: collision with root package name */
    public int f667r;

    /* renamed from: s  reason: collision with root package name */
    public ImageView.ScaleType f668s;

    /* renamed from: t  reason: collision with root package name */
    public View.OnLongClickListener f669t;

    /* renamed from: u  reason: collision with root package name */
    public CharSequence f670u;

    /* renamed from: v  reason: collision with root package name */
    public final C0273d0 f671v;

    /* renamed from: w  reason: collision with root package name */
    public boolean f672w;

    /* renamed from: x  reason: collision with root package name */
    public EditText f673x;

    /* renamed from: y  reason: collision with root package name */
    public final AccessibilityManager f674y;

    /* renamed from: z  reason: collision with root package name */
    public k f675z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public q(TextInputLayout textInputLayout, t tVar) {
        super(textInputLayout.getContext());
        CharSequence text;
        TextInputLayout textInputLayout2 = textInputLayout;
        t tVar2 = tVar;
        n nVar = new n(this);
        this.f674y = (AccessibilityManager) getContext().getSystemService("accessibility");
        this.f656f = textInputLayout2;
        setVisibility(8);
        setOrientation(0);
        setLayoutParams(new FrameLayout.LayoutParams(-2, -1, 8388613));
        FrameLayout frameLayout = new FrameLayout(getContext());
        this.f657g = frameLayout;
        frameLayout.setVisibility(8);
        frameLayout.setLayoutParams(new LinearLayout.LayoutParams(-2, -1));
        LayoutInflater from = LayoutInflater.from(getContext());
        CheckableImageButton a2 = a(this, from, 2131296746);
        this.f658h = a2;
        CheckableImageButton a3 = a(frameLayout, from, 2131296745);
        this.f661l = a3;
        this.f662m = new p(this, tVar2);
        CharSequence charSequence = null;
        C0273d0 d0Var = new C0273d0(getContext(), (AttributeSet) null);
        this.f671v = d0Var;
        TypedArray typedArray = (TypedArray) tVar2.f1132c;
        if (typedArray.hasValue(38)) {
            this.i = C0320a.K(getContext(), tVar2, 38);
        }
        if (typedArray.hasValue(39)) {
            this.f659j = m.g(typedArray.getInt(39, -1), (PorterDuff.Mode) null);
        }
        if (typedArray.hasValue(37)) {
            i(tVar2.o(37));
        }
        a2.setContentDescription(getResources().getText(2131755067));
        WeakHashMap weakHashMap = Q.f509a;
        a2.setImportantForAccessibility(2);
        a2.setClickable(false);
        a2.setPressable(false);
        a2.setFocusable(false);
        if (!typedArray.hasValue(53)) {
            if (typedArray.hasValue(32)) {
                this.f665p = C0320a.K(getContext(), tVar2, 32);
            }
            if (typedArray.hasValue(33)) {
                this.f666q = m.g(typedArray.getInt(33, -1), (PorterDuff.Mode) null);
            }
        }
        if (typedArray.hasValue(30)) {
            g(typedArray.getInt(30, 0));
            if (typedArray.hasValue(27) && a3.getContentDescription() != (text = typedArray.getText(27))) {
                a3.setContentDescription(text);
            }
            a3.setCheckable(typedArray.getBoolean(26, true));
        } else if (typedArray.hasValue(53)) {
            if (typedArray.hasValue(54)) {
                this.f665p = C0320a.K(getContext(), tVar2, 54);
            }
            if (typedArray.hasValue(55)) {
                this.f666q = m.g(typedArray.getInt(55, -1), (PorterDuff.Mode) null);
            }
            g(typedArray.getBoolean(53, false) ? 1 : 0);
            CharSequence text2 = typedArray.getText(51);
            if (a3.getContentDescription() != text2) {
                a3.setContentDescription(text2);
            }
        }
        int dimensionPixelSize = typedArray.getDimensionPixelSize(29, getResources().getDimensionPixelSize(2131165890));
        if (dimensionPixelSize >= 0) {
            if (dimensionPixelSize != this.f667r) {
                this.f667r = dimensionPixelSize;
                a3.setMinimumWidth(dimensionPixelSize);
                a3.setMinimumHeight(dimensionPixelSize);
                a2.setMinimumWidth(dimensionPixelSize);
                a2.setMinimumHeight(dimensionPixelSize);
            }
            if (typedArray.hasValue(31)) {
                ImageView.ScaleType o2 = C0320a.o(typedArray.getInt(31, -1));
                this.f668s = o2;
                a3.setScaleType(o2);
                a2.setScaleType(o2);
            }
            d0Var.setVisibility(8);
            d0Var.setId(2131296753);
            d0Var.setLayoutParams(new LinearLayout.LayoutParams(-2, -2, 80.0f));
            d0Var.setAccessibilityLiveRegion(1);
            C0320a.C0(d0Var, typedArray.getResourceId(72, 0));
            if (typedArray.hasValue(73)) {
                d0Var.setTextColor(tVar2.n(73));
            }
            CharSequence text3 = typedArray.getText(71);
            this.f670u = !TextUtils.isEmpty(text3) ? text3 : charSequence;
            d0Var.setText(text3);
            n();
            frameLayout.addView(a3);
            addView(d0Var);
            addView(frameLayout);
            addView(a2);
            textInputLayout2.f2377j0.add(nVar);
            if (textInputLayout2.i != null) {
                nVar.a(textInputLayout2);
            }
            addOnAttachStateChangeListener(new o(0, this));
            return;
        }
        throw new IllegalArgumentException("endIconSize cannot be less than 0");
    }

    public final r b() {
        r fVar;
        int i2 = this.f663n;
        p pVar = this.f662m;
        SparseArray sparseArray = (SparseArray) pVar.f653c;
        r rVar = (r) sparseArray.get(i2);
        if (rVar == null) {
            q qVar = (q) pVar.f654d;
            if (i2 == -1) {
                fVar = new C0031f(qVar, 0);
            } else if (i2 == 0) {
                fVar = new C0031f(qVar, 1);
            } else if (i2 == 1) {
                rVar = new y(qVar, pVar.f652b);
                sparseArray.append(i2, rVar);
            } else if (i2 == 2) {
                fVar = new C0030e(qVar);
            } else if (i2 == 3) {
                fVar = new l(qVar);
            } else {
                throw new IllegalArgumentException(E.e("Invalid end icon mode: ", i2));
            }
            rVar = fVar;
            sparseArray.append(i2, rVar);
        }
        return rVar;
    }

    public final boolean d() {
        if (this.f657g.getVisibility() == 0 && this.f661l.getVisibility() == 0) {
            return true;
        }
        return false;
    }

    public final boolean e() {
        if (this.f658h.getVisibility() == 0) {
            return true;
        }
        return false;
    }

    public final void g(int i2) {
        boolean z2;
        Drawable drawable;
        if (this.f663n != i2) {
            r b2 = b();
            k kVar = this.f675z;
            AccessibilityManager accessibilityManager = this.f674y;
            if (!(kVar == null || accessibilityManager == null)) {
                accessibilityManager.removeTouchExplorationStateChangeListener(new b(kVar));
            }
            CharSequence charSequence = null;
            this.f675z = null;
            b2.s();
            this.f663n = i2;
            Iterator it2 = this.f664o.iterator();
            if (!it2.hasNext()) {
                if (i2 != 0) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                h(z2);
                r b3 = b();
                int i3 = this.f662m.f651a;
                if (i3 == 0) {
                    i3 = b3.d();
                }
                if (i3 != 0) {
                    drawable = g.n(getContext(), i3);
                } else {
                    drawable = null;
                }
                CheckableImageButton checkableImageButton = this.f661l;
                checkableImageButton.setImageDrawable(drawable);
                TextInputLayout textInputLayout = this.f656f;
                if (drawable != null) {
                    C0320a.d(textInputLayout, checkableImageButton, this.f665p, this.f666q);
                    C0320a.n0(textInputLayout, checkableImageButton, this.f665p);
                }
                int c2 = b3.c();
                if (c2 != 0) {
                    charSequence = getResources().getText(c2);
                }
                if (checkableImageButton.getContentDescription() != charSequence) {
                    checkableImageButton.setContentDescription(charSequence);
                }
                checkableImageButton.setCheckable(b3.k());
                if (b3.i(textInputLayout.getBoxBackgroundMode())) {
                    b3.r();
                    k h2 = b3.h();
                    this.f675z = h2;
                    if (!(h2 == null || accessibilityManager == null)) {
                        WeakHashMap weakHashMap = Q.f509a;
                        if (isAttachedToWindow()) {
                            accessibilityManager.addTouchExplorationStateChangeListener(new b(this.f675z));
                        }
                    }
                    View.OnClickListener f2 = b3.f();
                    View.OnLongClickListener onLongClickListener = this.f669t;
                    checkableImageButton.setOnClickListener(f2);
                    C0320a.w0(checkableImageButton, onLongClickListener);
                    EditText editText = this.f673x;
                    if (editText != null) {
                        b3.m(editText);
                        j(b3);
                    }
                    C0320a.d(textInputLayout, checkableImageButton, this.f665p, this.f666q);
                    f(true);
                    return;
                }
                throw new IllegalStateException("The current box background mode " + textInputLayout.getBoxBackgroundMode() + " is not supported by the end icon mode " + i2);
            }
            it2.next().getClass();
            throw new ClassCastException();
        }
    }

    public final void i(Drawable drawable) {
        CheckableImageButton checkableImageButton = this.f658h;
        checkableImageButton.setImageDrawable(drawable);
        l();
        C0320a.d(this.f656f, checkableImageButton, this.i, this.f659j);
    }

    public final void j(r rVar) {
        if (this.f673x != null) {
            if (rVar.e() != null) {
                this.f673x.setOnFocusChangeListener(rVar.e());
            }
            if (rVar.g() != null) {
                this.f661l.setOnFocusChangeListener(rVar.g());
            }
        }
    }

    public final void k() {
        int i2;
        char c2;
        int i3 = 8;
        if (this.f661l.getVisibility() != 0 || e()) {
            i2 = 8;
        } else {
            i2 = 0;
        }
        this.f657g.setVisibility(i2);
        if (this.f670u == null || this.f672w) {
            c2 = 8;
        } else {
            c2 = 0;
        }
        if (d() || e() || c2 == 0) {
            i3 = 0;
        }
        setVisibility(i3);
    }

    public final void l() {
        int i2;
        CheckableImageButton checkableImageButton = this.f658h;
        Drawable drawable = checkableImageButton.getDrawable();
        TextInputLayout textInputLayout = this.f656f;
        if (drawable == null || !textInputLayout.f2385o.f701q || !textInputLayout.m()) {
            i2 = 8;
        } else {
            i2 = 0;
        }
        checkableImageButton.setVisibility(i2);
        k();
        m();
        if (this.f663n == 0) {
            textInputLayout.q();
        }
    }

    public final void m() {
        int i2;
        TextInputLayout textInputLayout = this.f656f;
        if (textInputLayout.i != null) {
            if (d() || e()) {
                i2 = 0;
            } else {
                EditText editText = textInputLayout.i;
                WeakHashMap weakHashMap = Q.f509a;
                i2 = editText.getPaddingEnd();
            }
            int dimensionPixelSize = getContext().getResources().getDimensionPixelSize(2131165760);
            int paddingTop = textInputLayout.i.getPaddingTop();
            int paddingBottom = textInputLayout.i.getPaddingBottom();
            WeakHashMap weakHashMap2 = Q.f509a;
            this.f671v.setPaddingRelative(dimensionPixelSize, paddingTop, i2, paddingBottom);
        }
    }

    public final void n() {
        int i2;
        C0273d0 d0Var = this.f671v;
        int visibility = d0Var.getVisibility();
        boolean z2 = false;
        if (this.f670u == null || this.f672w) {
            i2 = 8;
        } else {
            i2 = 0;
        }
        if (visibility != i2) {
            r b2 = b();
            if (i2 == 0) {
                z2 = true;
            }
            b2.p(z2);
        }
        k();
        d0Var.setVisibility(i2);
        this.f656f.q();
    }

    public final CheckableImageButton a(ViewGroup viewGroup, LayoutInflater layoutInflater, int i2) {
        CheckableImageButton checkableImageButton = (CheckableImageButton) layoutInflater.inflate(2131492907, viewGroup, false);
        checkableImageButton.setId(i2);
        if (Build.VERSION.SDK_INT <= 22) {
            int[] iArr = d.f287a;
            checkableImageButton.setBackground(c.b(checkableImageButton.getContext(), (int) TypedValue.applyDimension(1, (float) 4, checkableImageButton.getContext().getResources().getDisplayMetrics())));
        }
        if (C0320a.d0(getContext())) {
            ((ViewGroup.MarginLayoutParams) checkableImageButton.getLayoutParams()).setMarginStart(0);
        }
        return checkableImageButton;
    }

    public final int c() {
        int i2;
        if (d() || e()) {
            CheckableImageButton checkableImageButton = this.f661l;
            i2 = ((ViewGroup.MarginLayoutParams) checkableImageButton.getLayoutParams()).getMarginStart() + checkableImageButton.getMeasuredWidth();
        } else {
            i2 = 0;
        }
        WeakHashMap weakHashMap = Q.f509a;
        return this.f671v.getPaddingEnd() + getPaddingEnd() + i2;
    }

    public final void f(boolean z2) {
        boolean z3;
        boolean isActivated;
        boolean z4;
        r b2 = b();
        boolean k2 = b2.k();
        CheckableImageButton checkableImageButton = this.f661l;
        boolean z5 = true;
        if (!k2 || (z4 = checkableImageButton.i) == b2.l()) {
            z3 = false;
        } else {
            checkableImageButton.setChecked(!z4);
            z3 = true;
        }
        if (!(b2 instanceof l) || (isActivated = checkableImageButton.isActivated()) == b2.j()) {
            z5 = z3;
        } else {
            checkableImageButton.setActivated(!isActivated);
        }
        if (z2 || z5) {
            C0320a.n0(this.f656f, checkableImageButton, this.f665p);
        }
    }

    public final void h(boolean z2) {
        int i2;
        if (d() != z2) {
            if (z2) {
                i2 = 0;
            } else {
                i2 = 8;
            }
            this.f661l.setVisibility(i2);
            k();
            m();
            this.f656f.q();
        }
    }
}
