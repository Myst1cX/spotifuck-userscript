package N;

import A.a;
import F.c;
import android.view.View;
import android.view.WindowInsets;

public class m0 extends o0 {

    /* renamed from: c  reason: collision with root package name */
    public final WindowInsets.Builder f569c;

    public m0() {
        this.f569c = a.g();
    }

    public void d(c cVar) {
        this.f569c.setMandatorySystemGestureInsets(cVar.d());
    }

    public void e(c cVar) {
        this.f569c.setStableInsets(cVar.d());
    }

    public void f(c cVar) {
        this.f569c.setSystemGestureInsets(cVar.d());
    }

    public void g(c cVar) {
        this.f569c.setSystemWindowInsets(cVar.d());
    }

    public void h(c cVar) {
        this.f569c.setTappableElementInsets(cVar.d());
    }

    public m0(w0 w0Var) {
        super(w0Var);
        WindowInsets.Builder builder;
        WindowInsets f2 = w0Var.f();
        if (f2 != null) {
            builder = a.h(f2);
        } else {
            builder = a.g();
        }
        this.f569c = builder;
    }

    public w0 b() {
        a();
        w0 g2 = w0.g((View) null, this.f569c.build());
        g2.f597a.o(this.f575b);
        return g2;
    }
}
