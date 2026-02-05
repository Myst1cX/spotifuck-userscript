package G;

import android.graphics.Bitmap;
import android.graphics.drawable.AdaptiveIconDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.Icon;

public abstract class d {
    public static Drawable a(Drawable drawable, Drawable drawable2) {
        return new AdaptiveIconDrawable(drawable, drawable2);
    }

    public static Icon b(Bitmap bitmap) {
        return Icon.createWithAdaptiveBitmap(bitmap);
    }
}
