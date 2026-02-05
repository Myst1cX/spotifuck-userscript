package G;

import android.graphics.drawable.Drawable;

public abstract class b {
    public static int a(Drawable drawable) {
        return drawable.getLayoutDirection();
    }

    public static boolean b(Drawable drawable, int i) {
        return drawable.setLayoutDirection(i);
    }
}
