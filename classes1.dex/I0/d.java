package I0;

import android.content.res.ColorStateList;
import android.graphics.Color;
import android.os.Build;
import android.util.Log;

public abstract class d {

    /* renamed from: a  reason: collision with root package name */
    public static final int[] f287a = {16842910, 16842919};

    /* renamed from: b  reason: collision with root package name */
    public static final String f288b = d.class.getSimpleName();

    public static ColorStateList a(ColorStateList colorStateList) {
        if (colorStateList == null) {
            return ColorStateList.valueOf(0);
        }
        int i = Build.VERSION.SDK_INT;
        if (i >= 22 && i <= 27 && Color.alpha(colorStateList.getDefaultColor()) == 0 && Color.alpha(colorStateList.getColorForState(f287a, 0)) != 0) {
            Log.w(f288b, "Use a non-transparent color for the default color as it will be used to finish ripple animations.");
        }
        return colorStateList;
    }

    public static boolean b(int[] iArr) {
        boolean z2 = false;
        boolean z3 = false;
        for (int i : iArr) {
            if (i == 16842910) {
                z2 = true;
            } else if (i == 16842908 || i == 16842919 || i == 16843623) {
                z3 = true;
            }
        }
        if (!z2 || !z3) {
            return false;
        }
        return true;
    }
}
