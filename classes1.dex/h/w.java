package h;

import android.os.PowerManager;
import java.util.Locale;

public abstract class w {
    public static boolean a(PowerManager powerManager) {
        return powerManager.isPowerSaveMode();
    }

    public static String b(Locale locale) {
        return locale.toLanguageTag();
    }
}
