package J;

import android.os.Build;
import java.util.Locale;

public final class f {

    /* renamed from: b  reason: collision with root package name */
    public static final f f293b = a(new Locale[0]);

    /* renamed from: a  reason: collision with root package name */
    public final h f294a;

    public static f a(Locale... localeArr) {
        if (Build.VERSION.SDK_INT >= 24) {
            return new f(new j(e.a(localeArr)));
        }
        return new f(new g(localeArr));
    }

    public static f b(String str) {
        if (str == null || str.isEmpty()) {
            return f293b;
        }
        String[] split = str.split(",", -1);
        int length = split.length;
        Locale[] localeArr = new Locale[length];
        for (int i = 0; i < length; i++) {
            localeArr[i] = d.a(split[i]);
        }
        return a(localeArr);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof f) {
            if (this.f294a.equals(((f) obj).f294a)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.f294a.hashCode();
    }

    public final String toString() {
        return this.f294a.toString();
    }

    public f(h hVar) {
        this.f294a = hVar;
    }
}
