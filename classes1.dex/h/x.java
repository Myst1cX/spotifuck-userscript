package h;

import J.f;
import android.content.res.Configuration;
import android.os.LocaleList;

public abstract class x {
    public static void c(f fVar) {
        LocaleList.setDefault(LocaleList.forLanguageTags(fVar.f294a.b()));
    }

    public static void d(Configuration configuration, f fVar) {
        configuration.setLocales(LocaleList.forLanguageTags(fVar.f294a.b()));
    }

    public static void a(Configuration configuration, Configuration configuration2, Configuration configuration3) {
        LocaleList f2 = configuration.getLocales();
        LocaleList f3 = configuration2.getLocales();
        if (!f2.equals(f3)) {
            configuration3.setLocales(f3);
            configuration3.locale = configuration2.locale;
        }
    }

    public static f b(Configuration configuration) {
        return f.b(configuration.getLocales().toLanguageTags());
    }
}
