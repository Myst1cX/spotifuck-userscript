package o;

import android.content.res.Resources;
import android.widget.ThemedSpinnerAdapter;
import java.util.Objects;

/* renamed from: o.J  reason: case insensitive filesystem */
public abstract class C0255J {
    public static void a(ThemedSpinnerAdapter themedSpinnerAdapter, Resources.Theme theme) {
        if (!Objects.equals(themedSpinnerAdapter.getDropDownViewTheme(), theme)) {
            themedSpinnerAdapter.setDropDownViewTheme(theme);
        }
    }
}
