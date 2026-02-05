package N;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.view.MenuItem;

/* renamed from: N.m  reason: case insensitive filesystem */
public abstract class C0013m {
    public static int a(MenuItem menuItem) {
        return menuItem.getAlphabeticModifiers();
    }

    public static CharSequence b(MenuItem menuItem) {
        return menuItem.getContentDescription();
    }

    public static ColorStateList c(MenuItem menuItem) {
        return menuItem.getIconTintList();
    }

    public static PorterDuff.Mode d(MenuItem menuItem) {
        return menuItem.getIconTintMode();
    }

    public static int e(MenuItem menuItem) {
        return menuItem.getNumericModifiers();
    }

    public static CharSequence f(MenuItem menuItem) {
        return menuItem.getTooltipText();
    }

    public static MenuItem g(MenuItem menuItem, char c2, int i) {
        return menuItem.setAlphabeticShortcut(c2, i);
    }

    public static MenuItem h(MenuItem menuItem, CharSequence charSequence) {
        return menuItem.setContentDescription(charSequence);
    }

    public static MenuItem i(MenuItem menuItem, ColorStateList colorStateList) {
        return menuItem.setIconTintList(colorStateList);
    }

    public static MenuItem j(MenuItem menuItem, PorterDuff.Mode mode) {
        return menuItem.setIconTintMode(mode);
    }

    public static MenuItem k(MenuItem menuItem, char c2, int i) {
        return menuItem.setNumericShortcut(c2, i);
    }

    public static MenuItem l(MenuItem menuItem, char c2, char c3, int i, int i2) {
        return menuItem.setShortcut(c2, c3, i, i2);
    }

    public static MenuItem m(MenuItem menuItem, CharSequence charSequence) {
        return menuItem.setTooltipText(charSequence);
    }
}
