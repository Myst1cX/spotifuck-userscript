package N0;

import K0.g;
import android.graphics.Canvas;
import android.graphics.RectF;
import android.graphics.Region;
import android.graphics.drawable.Drawable;
import android.os.Build;

public final class h extends g {

    /* renamed from: D  reason: collision with root package name */
    public static final /* synthetic */ int f630D = 0;

    /* renamed from: C  reason: collision with root package name */
    public g f631C;

    public final void e(Canvas canvas) {
        if (this.f631C.f629q.isEmpty()) {
            super.e(canvas);
            return;
        }
        canvas.save();
        if (Build.VERSION.SDK_INT >= 26) {
            canvas.clipOutRect(this.f631C.f629q);
        } else {
            canvas.clipRect(this.f631C.f629q, Region.Op.DIFFERENCE);
        }
        super.e(canvas);
        canvas.restore();
    }

    public final Drawable mutate() {
        this.f631C = new g(this.f631C);
        return this;
    }

    public final void n(float f2, float f3, float f4, float f5) {
        RectF rectF = this.f631C.f629q;
        if (f2 != rectF.left || f3 != rectF.top || f4 != rectF.right || f5 != rectF.bottom) {
            rectF.set(f2, f3, f4, f5);
            invalidateSelf();
        }
    }
}
