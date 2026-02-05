package K0;

import android.graphics.RectF;
import java.util.Arrays;

public final class b implements c {

    /* renamed from: a  reason: collision with root package name */
    public final c f346a;

    /* renamed from: b  reason: collision with root package name */
    public final float f347b;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        if (!this.f346a.equals(bVar.f346a) || this.f347b != bVar.f347b) {
            return false;
        }
        return true;
    }

    public final float a(RectF rectF) {
        return Math.max(0.0f, this.f346a.a(rectF) + this.f347b);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f346a, Float.valueOf(this.f347b)});
    }

    public b(float f2, c cVar) {
        while (cVar instanceof b) {
            cVar = ((b) cVar).f346a;
            f2 += ((b) cVar).f347b;
        }
        this.f346a = cVar;
        this.f347b = f2;
    }
}
