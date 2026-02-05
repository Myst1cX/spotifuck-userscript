package H;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.view.MenuItem;
import n.C0200o;

public interface a extends MenuItem {
    C0200o a();

    a b(C0200o oVar);

    int getAlphabeticModifiers();

    CharSequence getContentDescription();

    ColorStateList getIconTintList();

    PorterDuff.Mode getIconTintMode();

    int getNumericModifiers();

    CharSequence getTooltipText();

    MenuItem setAlphabeticShortcut(char c2, int i);

    a setContentDescription(CharSequence charSequence);

    MenuItem setIconTintList(ColorStateList colorStateList);

    MenuItem setIconTintMode(PorterDuff.Mode mode);

    MenuItem setNumericShortcut(char c2, int i);

    MenuItem setShortcut(char c2, char c3, int i, int i2);

    a setTooltipText(CharSequence charSequence);
}
