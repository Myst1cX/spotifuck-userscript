package N;

import android.view.DisplayCutout;
import android.view.View;
import android.view.WindowInsets;
import java.util.Objects;

public class r0 extends q0 {
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r0)) {
            return false;
        }
        r0 r0Var = (r0) obj;
        if (!Objects.equals(this.f580c, r0Var.f580c) || !Objects.equals(this.f583g, r0Var.f583g)) {
            return false;
        }
        return true;
    }

    public w0 a() {
        return w0.g((View) null, this.f580c.consumeDisplayCutout());
    }

    public C0010j e() {
        DisplayCutout m2 = this.f580c.getDisplayCutout();
        if (m2 == null) {
            return null;
        }
        return new C0010j(m2);
    }

    public int hashCode() {
        return this.f580c.hashCode();
    }

    public r0(w0 w0Var, WindowInsets windowInsets) {
        super(w0Var, windowInsets);
    }
}
