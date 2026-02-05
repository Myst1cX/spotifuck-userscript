package L;

import android.icu.util.ULocale;
import java.util.Locale;

public abstract class d {
    public static ULocale a(Object obj) {
        return ULocale.addLikelySubtags((ULocale) obj);
    }

    public static String c(Object obj) {
        return ((ULocale) obj).getScript();
    }

    public static ULocale b(Locale locale) {
        return ULocale.forLocale(locale);
    }
}
