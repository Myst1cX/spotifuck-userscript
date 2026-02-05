package d0;

import android.text.TextUtils;
import java.util.Objects;

public class t {

    /* renamed from: a  reason: collision with root package name */
    public final String f2505a;

    /* renamed from: b  reason: collision with root package name */
    public final int f2506b;

    /* renamed from: c  reason: collision with root package name */
    public final int f2507c;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof t)) {
            return false;
        }
        t tVar = (t) obj;
        int i = this.f2507c;
        String str = this.f2505a;
        int i2 = this.f2506b;
        if (i2 < 0 || tVar.f2506b < 0) {
            if (!TextUtils.equals(str, tVar.f2505a) || i != tVar.f2507c) {
                return false;
            }
            return true;
        } else if (TextUtils.equals(str, tVar.f2505a) && i2 == tVar.f2506b && i == tVar.f2507c) {
            return true;
        } else {
            return false;
        }
    }

    public final int hashCode() {
        return Objects.hash(new Object[]{this.f2505a, Integer.valueOf(this.f2507c)});
    }

    public t(String str, int i, int i2) {
        this.f2505a = str;
        this.f2506b = i;
        this.f2507c = i2;
    }
}
