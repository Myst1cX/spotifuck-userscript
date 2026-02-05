package E;

import android.content.res.Resources;
import java.util.Objects;

public final class n {

    /* renamed from: a  reason: collision with root package name */
    public final Resources f113a;

    /* renamed from: b  reason: collision with root package name */
    public final Resources.Theme f114b;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || n.class != obj.getClass()) {
            return false;
        }
        n nVar = (n) obj;
        if (!this.f113a.equals(nVar.f113a) || !Objects.equals(this.f114b, nVar.f114b)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Objects.hash(new Object[]{this.f113a, this.f114b});
    }

    public n(Resources resources, Resources.Theme theme) {
        this.f113a = resources;
        this.f114b = theme;
    }
}
