package J;

import L.e;
import java.util.Locale;

public abstract class d {

    /* renamed from: a  reason: collision with root package name */
    public static final Locale[] f292a = {new Locale("en", "XA"), new Locale("ar", "XB")};

    public static Locale a(String str) {
        return Locale.forLanguageTag(str);
    }

    public static boolean b(Locale locale, Locale locale2) {
        if (locale.equals(locale2)) {
            return true;
        }
        if (!locale.getLanguage().equals(locale2.getLanguage())) {
            return false;
        }
        Locale[] localeArr = f292a;
        int length = localeArr.length;
        int i = 0;
        while (true) {
            if (i >= length) {
                int length2 = localeArr.length;
                int i2 = 0;
                while (i2 < length2) {
                    if (!localeArr[i2].equals(locale2)) {
                        i2++;
                    }
                }
                String a2 = e.a(locale);
                if (!a2.isEmpty()) {
                    return a2.equals(e.a(locale2));
                }
                String country = locale.getCountry();
                if (country.isEmpty() || country.equals(locale2.getCountry())) {
                    return true;
                }
                return false;
            } else if (localeArr[i].equals(locale)) {
                break;
            } else {
                i++;
            }
        }
        return false;
    }
}
