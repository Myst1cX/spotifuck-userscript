package N0;

import C.a;
import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.view.View;
import android.widget.EditText;
import p0.C0320a;
import r0.C0324a;

/* renamed from: N0.e  reason: case insensitive filesystem */
public final class C0030e extends r {
    public final int e;

    /* renamed from: f  reason: collision with root package name */
    public final int f622f;

    /* renamed from: g  reason: collision with root package name */
    public final TimeInterpolator f623g;

    /* renamed from: h  reason: collision with root package name */
    public final TimeInterpolator f624h;
    public EditText i;

    /* renamed from: j  reason: collision with root package name */
    public final C0026a f625j = new C0026a(0, this);

    /* renamed from: k  reason: collision with root package name */
    public final C0027b f626k = new C0027b(this, 0);

    /* renamed from: l  reason: collision with root package name */
    public AnimatorSet f627l;

    /* renamed from: m  reason: collision with root package name */
    public ValueAnimator f628m;

    public final void r() {
        ValueAnimator ofFloat = ValueAnimator.ofFloat(new float[]{0.8f, 1.0f});
        ofFloat.setInterpolator(this.f624h);
        ofFloat.setDuration((long) this.f622f);
        ofFloat.addUpdateListener(new C0028c(this, 1));
        ValueAnimator ofFloat2 = ValueAnimator.ofFloat(new float[]{0.0f, 1.0f});
        TimeInterpolator timeInterpolator = this.f623g;
        ofFloat2.setInterpolator(timeInterpolator);
        int i2 = this.e;
        ofFloat2.setDuration((long) i2);
        ofFloat2.addUpdateListener(new C0028c(this, 0));
        AnimatorSet animatorSet = new AnimatorSet();
        this.f627l = animatorSet;
        animatorSet.playTogether(new Animator[]{ofFloat, ofFloat2});
        this.f627l.addListener(new C0029d(this, 0));
        ValueAnimator ofFloat3 = ValueAnimator.ofFloat(new float[]{1.0f, 0.0f});
        ofFloat3.setInterpolator(timeInterpolator);
        ofFloat3.setDuration((long) i2);
        ofFloat3.addUpdateListener(new C0028c(this, 0));
        this.f628m = ofFloat3;
        ofFloat3.addListener(new C0029d(this, 1));
    }

    public final void a() {
        if (this.f677b.f670u == null) {
            t(u());
        }
    }

    public final View.OnFocusChangeListener e() {
        return this.f626k;
    }

    public final View.OnClickListener f() {
        return this.f625j;
    }

    public final View.OnFocusChangeListener g() {
        return this.f626k;
    }

    public final void m(EditText editText) {
        this.i = editText;
        this.f676a.setEndIconVisible(u());
    }

    public final void p(boolean z2) {
        if (this.f677b.f670u != null) {
            t(z2);
        }
    }

    public final void s() {
        EditText editText = this.i;
        if (editText != null) {
            editText.post(new a(3, (Object) this));
        }
    }

    public final void t(boolean z2) {
        boolean z3;
        if (this.f677b.d() == z2) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (z2 && !this.f627l.isRunning()) {
            this.f628m.cancel();
            this.f627l.start();
            if (z3) {
                this.f627l.end();
            }
        } else if (!z2) {
            this.f627l.cancel();
            this.f628m.start();
            if (z3) {
                this.f628m.end();
            }
        }
    }

    public final boolean u() {
        EditText editText = this.i;
        if (editText == null || ((!editText.hasFocus() && !this.f679d.hasFocus()) || this.i.getText().length() <= 0)) {
            return false;
        }
        return true;
    }

    public C0030e(q qVar) {
        super(qVar);
        this.e = C0320a.q0(qVar.getContext(), 2130969431, 100);
        this.f622f = C0320a.q0(qVar.getContext(), 2130969431, 150);
        this.f623g = C0320a.r0(qVar.getContext(), 2130969440, C0324a.f4555a);
        this.f624h = C0320a.r0(qVar.getContext(), 2130969438, C0324a.f4558d);
    }

    public final int c() {
        return 2131755060;
    }

    public final int d() {
        return 2131230924;
    }
}
