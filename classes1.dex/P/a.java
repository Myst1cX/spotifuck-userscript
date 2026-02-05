package P;

import android.graphics.Path;
import android.view.animation.Interpolator;
import android.view.animation.PathInterpolator;

public abstract class a {
    public static Interpolator a(float f2, float f3) {
        return new PathInterpolator(f2, f3);
    }

    public static Interpolator b(float f2, float f3, float f4, float f5) {
        return new PathInterpolator(f2, f3, f4, f5);
    }

    public static Interpolator c(Path path) {
        return new PathInterpolator(path);
    }
}
