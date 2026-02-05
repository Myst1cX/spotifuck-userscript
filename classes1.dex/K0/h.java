package K0;

import android.graphics.RectF;
import java.util.Arrays;

public final class h implements c {

    /* renamed from: a  reason: collision with root package name */
    public final float f394a;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof h) && this.f394a == ((h) obj).f394a) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Float.valueOf(this.f394a)});
    }

    public h(float f2) {
        this.f394a = f2;
    }

    public final float a(RectF rectF) {
        return Math.min(rectF.width(), rectF.height()) * this.f394a;
    }
}
