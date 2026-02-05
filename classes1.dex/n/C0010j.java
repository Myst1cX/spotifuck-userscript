package N;

import android.view.DisplayCutout;
import java.util.Objects;

/* renamed from: N.j  reason: case insensitive filesystem */
public final class C0010j {

    /* renamed from: a  reason: collision with root package name */
    public final DisplayCutout f558a;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C0010j.class != obj.getClass()) {
            return false;
        }
        return Objects.equals(this.f558a, ((C0010j) obj).f558a);
    }

    public final int hashCode() {
        return this.f558a.hashCode();
    }

    public final String toString() {
        return "DisplayCutoutCompat{" + this.f558a + "}";
    }

    public C0010j(DisplayCutout displayCutout) {
        this.f558a = displayCutout;
    }
}
