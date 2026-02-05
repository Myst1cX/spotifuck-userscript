package d0;

import H0.f;
import android.os.Build;
import android.text.TextUtils;

public final class r {

    /* renamed from: a  reason: collision with root package name */
    public t f2504a;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r)) {
            return false;
        }
        return this.f2504a.equals(((r) obj).f2504a);
    }

    public final int hashCode() {
        return this.f2504a.hashCode();
    }

    public r(String str, int i, int i2) {
        if (str == null) {
            throw new NullPointerException("package shouldn't be null");
        } else if (TextUtils.isEmpty(str)) {
            throw new IllegalArgumentException("packageName should be nonempty");
        } else if (Build.VERSION.SDK_INT >= 28) {
            t tVar = new t(str, i, i2);
            f.v(str, i, i2);
            this.f2504a = tVar;
        } else {
            this.f2504a = new t(str, i, i2);
        }
    }
}
