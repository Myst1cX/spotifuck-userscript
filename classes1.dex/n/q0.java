package N;

import F.c;
import android.view.View;
import android.view.WindowInsets;

public class q0 extends p0 {

    /* renamed from: m  reason: collision with root package name */
    public c f586m = null;

    public w0 b() {
        return w0.g((View) null, this.f580c.consumeStableInsets());
    }

    public w0 c() {
        return w0.g((View) null, this.f580c.consumeSystemWindowInsets());
    }

    public final c h() {
        if (this.f586m == null) {
            WindowInsets windowInsets = this.f580c;
            this.f586m = c.b(windowInsets.getStableInsetLeft(), windowInsets.getStableInsetTop(), windowInsets.getStableInsetRight(), windowInsets.getStableInsetBottom());
        }
        return this.f586m;
    }

    public boolean m() {
        return this.f580c.isConsumed();
    }

    public void q(c cVar) {
        this.f586m = cVar;
    }

    public q0(w0 w0Var, WindowInsets windowInsets) {
        super(w0Var, windowInsets);
    }
}
