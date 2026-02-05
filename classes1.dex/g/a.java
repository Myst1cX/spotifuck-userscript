package G;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import org.xmlpull.v1.XmlPullParser;

public abstract class a {
    public static void a(Drawable drawable, Resources.Theme theme) {
        drawable.applyTheme(theme);
    }

    public static boolean b(Drawable drawable) {
        return drawable.canApplyTheme();
    }

    public static ColorFilter c(Drawable drawable) {
        return drawable.getColorFilter();
    }

    public static void d(Drawable drawable, Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) {
        drawable.inflate(resources, xmlPullParser, attributeSet, theme);
    }

    public static void e(Drawable drawable, float f2, float f3) {
        drawable.setHotspot(f2, f3);
    }

    public static void f(Drawable drawable, int i, int i2, int i3, int i4) {
        drawable.setHotspotBounds(i, i2, i3, i4);
    }

    public static void g(Drawable drawable, int i) {
        drawable.setTint(i);
    }

    public static void h(Drawable drawable, ColorStateList colorStateList) {
        drawable.setTintList(colorStateList);
    }

    public static void i(Drawable drawable, PorterDuff.Mode mode) {
        drawable.setTintMode(mode);
    }
}
