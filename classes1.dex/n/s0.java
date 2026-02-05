package N;

import F.c;
import android.view.View;
import android.view.WindowInsets;

public class s0 extends r0 {

    /* renamed from: n  reason: collision with root package name */
    public c f587n = null;

    /* renamed from: o  reason: collision with root package name */
    public c f588o = null;

    /* renamed from: p  reason: collision with root package name */
    public c f589p = null;

    public c g() {
        if (this.f588o == null) {
            this.f588o = c.c(this.f580c.getMandatorySystemGestureInsets());
        }
        return this.f588o;
    }

    public c i() {
        if (this.f587n == null) {
            this.f587n = c.c(this.f580c.getSystemGestureInsets());
        }
        return this.f587n;
    }

    public c k() {
        if (this.f589p == null) {
            this.f589p = c.c(this.f580c.getTappableElementInsets());
        }
        return this.f589p;
    }

    public w0 l(int i, int i2, int i3, int i4) {
        return w0.g((View) null, this.f580c.inset(i, i2, i3, i4));
    }

    public void q(c cVar) {
    }

    public s0(w0 w0Var, WindowInsets windowInsets) {
        super(w0Var, windowInsets);
    }
}
