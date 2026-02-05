package K0;

import android.graphics.RectF;
import java.util.Arrays;

public final class a implements c {

    /* renamed from: a  reason: collision with root package name */
    public final float f345a;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof a) && this.f345a == ((a) obj).f345a) {
            return true;
        }
        return false;
    }

    public final float a(RectF rectF) {
        return this.f345a;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Float.valueOf(this.f345a)});
    }

    public a(float f2) {
        this.f345a = f2;
    }
}
