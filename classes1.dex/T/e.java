package T;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.EdgeEffect;

public abstract class e {
    public static EdgeEffect a(Context context, AttributeSet attributeSet) {
        try {
            return new EdgeEffect(context, attributeSet);
        } catch (Throwable unused) {
            return new EdgeEffect(context);
        }
    }

    public static float b(EdgeEffect edgeEffect) {
        try {
            return edgeEffect.getDistance();
        } catch (Throwable unused) {
            return 0.0f;
        }
    }

    public static float c(EdgeEffect edgeEffect, float f2, float f3) {
        try {
            return edgeEffect.onPullDistance(f2, f3);
        } catch (Throwable unused) {
            edgeEffect.onPull(f2, f3);
            return 0.0f;
        }
    }
}
