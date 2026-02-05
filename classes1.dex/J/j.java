package J;

import android.os.LocaleList;
import java.util.Locale;

public final class j implements h {

    /* renamed from: a  reason: collision with root package name */
    public final LocaleList f298a;

    public final Object a() {
        return this.f298a;
    }

    public final String b() {
        return this.f298a.toLanguageTags();
    }

    public final boolean equals(Object obj) {
        return this.f298a.equals(((h) obj).a());
    }

    public final Locale get(int i) {
        return this.f298a.get(i);
    }

    public final int hashCode() {
        return this.f298a.hashCode();
    }

    public final boolean isEmpty() {
        return this.f298a.isEmpty();
    }

    public final int size() {
        return this.f298a.size();
    }

    public final String toString() {
        return this.f298a.toString();
    }

    public j(Object obj) {
        this.f298a = i.h(obj);
    }
}
