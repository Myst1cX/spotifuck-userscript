package N;

import F.c;
import android.os.Build;
import android.view.View;
import java.util.Objects;

public class u0 {

    /* renamed from: b  reason: collision with root package name */
    public static final w0 f594b;

    /* renamed from: a  reason: collision with root package name */
    public final w0 f595a;

    public C0010j e() {
        return null;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof u0)) {
            return false;
        }
        u0 u0Var = (u0) obj;
        if (n() != u0Var.n() || m() != u0Var.m() || !Objects.equals(j(), u0Var.j()) || !Objects.equals(h(), u0Var.h()) || !Objects.equals(e(), u0Var.e())) {
            return false;
        }
        return true;
    }

    public boolean m() {
        return false;
    }

    public boolean n() {
        return false;
    }

    static {
        o0 o0Var;
        int i = Build.VERSION.SDK_INT;
        if (i >= 30) {
            o0Var = new n0();
        } else if (i >= 29) {
            o0Var = new m0();
        } else {
            o0Var = new l0();
        }
        f594b = o0Var.b().f597a.a().f597a.b().f597a.c();
    }

    public w0 a() {
        return this.f595a;
    }

    public w0 b() {
        return this.f595a;
    }

    public w0 c() {
        return this.f595a;
    }

    public void d(View view) {
    }

    public c f(int i) {
        return c.e;
    }

    public c h() {
        return c.e;
    }

    public c j() {
        return c.e;
    }

    public w0 l(int i, int i2, int i3, int i4) {
        return f594b;
    }

    public void o(c[] cVarArr) {
    }

    public void p(w0 w0Var) {
    }

    public void q(c cVar) {
    }

    public u0(w0 w0Var) {
        this.f595a = w0Var;
    }

    public c g() {
        return j();
    }

    public int hashCode() {
        return Objects.hash(new Object[]{Boolean.valueOf(n()), Boolean.valueOf(m()), j(), h(), e()});
    }

    public c i() {
        return j();
    }

    public c k() {
        return j();
    }
}
