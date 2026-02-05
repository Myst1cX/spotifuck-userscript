package N0;

import C.a;
import N.Q;
import N.X;
import N.Y;
import O.k;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.AutoCompleteTextView;
import android.widget.EditText;
import android.widget.Spinner;
import com.google.android.material.textfield.TextInputLayout;
import java.util.WeakHashMap;
import p0.C0320a;
import r0.C0324a;

public final class l extends r {
    public final int e;

    /* renamed from: f  reason: collision with root package name */
    public final int f635f;

    /* renamed from: g  reason: collision with root package name */
    public final TimeInterpolator f636g;

    /* renamed from: h  reason: collision with root package name */
    public AutoCompleteTextView f637h;
    public final C0026a i = new C0026a(1, this);

    /* renamed from: j  reason: collision with root package name */
    public final C0027b f638j = new C0027b(this, 1);

    /* renamed from: k  reason: collision with root package name */
    public final k f639k = new k(this);

    /* renamed from: l  reason: collision with root package name */
    public boolean f640l;

    /* renamed from: m  reason: collision with root package name */
    public boolean f641m;

    /* renamed from: n  reason: collision with root package name */
    public boolean f642n;

    /* renamed from: o  reason: collision with root package name */
    public long f643o = Long.MAX_VALUE;

    /* renamed from: p  reason: collision with root package name */
    public AccessibilityManager f644p;

    /* renamed from: q  reason: collision with root package name */
    public ValueAnimator f645q;

    /* renamed from: r  reason: collision with root package name */
    public ValueAnimator f646r;

    public final void r() {
        ValueAnimator ofFloat = ValueAnimator.ofFloat(new float[]{0.0f, 1.0f});
        TimeInterpolator timeInterpolator = this.f636g;
        ofFloat.setInterpolator(timeInterpolator);
        ofFloat.setDuration((long) this.f635f);
        ofFloat.addUpdateListener(new X(this));
        this.f646r = ofFloat;
        ValueAnimator ofFloat2 = ValueAnimator.ofFloat(new float[]{1.0f, 0.0f});
        ofFloat2.setInterpolator(timeInterpolator);
        ofFloat2.setDuration((long) this.e);
        ofFloat2.addUpdateListener(new X(this));
        this.f645q = ofFloat2;
        ofFloat2.addListener(new Y(1, (Object) this));
        this.f644p = (AccessibilityManager) this.f678c.getSystemService("accessibility");
    }

    public final void a() {
        if (this.f644p.isTouchExplorationEnabled() && C0320a.b0(this.f637h) && !this.f679d.hasFocus()) {
            this.f637h.dismissDropDown();
        }
        this.f637h.post(new a(4, (Object) this));
    }

    public final View.OnFocusChangeListener e() {
        return this.f638j;
    }

    public final View.OnClickListener f() {
        return this.i;
    }

    public final k h() {
        return this.f639k;
    }

    public final boolean i(int i2) {
        if (i2 != 0) {
            return true;
        }
        return false;
    }

    public final boolean j() {
        return this.f640l;
    }

    public final boolean l() {
        return this.f642n;
    }

    public final void m(EditText editText) {
        if (editText instanceof AutoCompleteTextView) {
            AutoCompleteTextView autoCompleteTextView = (AutoCompleteTextView) editText;
            this.f637h = autoCompleteTextView;
            autoCompleteTextView.setOnTouchListener(new i(this));
            this.f637h.setOnDismissListener(new j(this));
            this.f637h.setThreshold(0);
            TextInputLayout textInputLayout = this.f676a;
            textInputLayout.setErrorIconDrawable((Drawable) null);
            if (!C0320a.b0(editText) && this.f644p.isTouchExplorationEnabled()) {
                WeakHashMap weakHashMap = Q.f509a;
                this.f679d.setImportantForAccessibility(2);
            }
            textInputLayout.setEndIconVisible(true);
            return;
        }
        throw new RuntimeException("EditText needs to be an AutoCompleteTextView if an Exposed Dropdown Menu is being used.");
    }

    public final void n(k kVar) {
        boolean z2;
        boolean b02 = C0320a.b0(this.f637h);
        AccessibilityNodeInfo accessibilityNodeInfo = kVar.f751a;
        if (!b02) {
            accessibilityNodeInfo.setClassName(Spinner.class.getName());
        }
        if (Build.VERSION.SDK_INT >= 26) {
            z2 = accessibilityNodeInfo.isShowingHintText();
        } else {
            z2 = kVar.e(4);
        }
        if (z2) {
            kVar.j((String) null);
        }
    }

    public final void o(AccessibilityEvent accessibilityEvent) {
        boolean z2;
        if (this.f644p.isEnabled() && !C0320a.b0(this.f637h)) {
            if ((accessibilityEvent.getEventType() == 32768 || accessibilityEvent.getEventType() == 8) && this.f642n && !this.f637h.isPopupShowing()) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (accessibilityEvent.getEventType() == 1 || z2) {
                u();
                this.f641m = true;
                this.f643o = System.currentTimeMillis();
            }
        }
    }

    public final void s() {
        AutoCompleteTextView autoCompleteTextView = this.f637h;
        if (autoCompleteTextView != null) {
            autoCompleteTextView.setOnTouchListener((View.OnTouchListener) null);
            this.f637h.setOnDismissListener((AutoCompleteTextView.OnDismissListener) null);
        }
    }

    public final void t(boolean z2) {
        if (this.f642n != z2) {
            this.f642n = z2;
            this.f646r.cancel();
            this.f645q.start();
        }
    }

    public final void u() {
        boolean z2;
        if (this.f637h != null) {
            long currentTimeMillis = System.currentTimeMillis() - this.f643o;
            if (currentTimeMillis < 0 || currentTimeMillis > 300) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (z2) {
                this.f641m = false;
            }
            if (!this.f641m) {
                t(!this.f642n);
                if (this.f642n) {
                    this.f637h.requestFocus();
                    this.f637h.showDropDown();
                    return;
                }
                this.f637h.dismissDropDown();
                return;
            }
            this.f641m = false;
        }
    }

    public l(q qVar) {
        super(qVar);
        this.f635f = C0320a.q0(qVar.getContext(), 2130969431, 67);
        this.e = C0320a.q0(qVar.getContext(), 2130969431, 50);
        this.f636g = C0320a.r0(qVar.getContext(), 2130969440, C0324a.f4555a);
    }

    public final int c() {
        return 2131755069;
    }

    public final int d() {
        return 2131230921;
    }
}
