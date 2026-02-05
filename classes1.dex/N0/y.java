package N0;

import android.text.method.PasswordTransformationMethod;
import android.view.View;
import android.widget.EditText;

public final class y extends r {
    public final int e = 2131230861;

    /* renamed from: f  reason: collision with root package name */
    public EditText f724f;

    /* renamed from: g  reason: collision with root package name */
    public final C0026a f725g = new C0026a(2, this);

    public final boolean k() {
        return true;
    }

    public final int d() {
        return this.e;
    }

    public final View.OnClickListener f() {
        return this.f725g;
    }

    public final boolean l() {
        boolean z2;
        EditText editText = this.f724f;
        if (editText == null || !(editText.getTransformationMethod() instanceof PasswordTransformationMethod)) {
            z2 = false;
        } else {
            z2 = true;
        }
        return !z2;
    }

    public final void m(EditText editText) {
        this.f724f = editText;
        q();
    }

    public final void r() {
        EditText editText = this.f724f;
        if (editText == null) {
            return;
        }
        if (editText.getInputType() == 16 || editText.getInputType() == 128 || editText.getInputType() == 144 || editText.getInputType() == 224) {
            this.f724f.setTransformationMethod(PasswordTransformationMethod.getInstance());
        }
    }

    public final void s() {
        EditText editText = this.f724f;
        if (editText != null) {
            editText.setTransformationMethod(PasswordTransformationMethod.getInstance());
        }
    }

    public y(q qVar, int i) {
        super(qVar);
        if (i != 0) {
            this.e = i;
        }
    }

    public final void b() {
        q();
    }

    public final int c() {
        return 2131755217;
    }
}
