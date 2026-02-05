package J;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Locale;

public final class g implements h {

    /* renamed from: c  reason: collision with root package name */
    public static final Locale[] f295c = new Locale[0];

    /* renamed from: a  reason: collision with root package name */
    public final Locale[] f296a;

    /* renamed from: b  reason: collision with root package name */
    public final String f297b;

    static {
        new Locale("en", "XA");
        new Locale("ar", "XB");
        String[] split = "en-Latn".split("-", -1);
        if (split.length > 2) {
            new Locale(split[0], split[1], split[2]);
        } else if (split.length > 1) {
            new Locale(split[0], split[1]);
        } else if (split.length == 1) {
            new Locale(split[0]);
        } else {
            throw new IllegalArgumentException("Can not parse language tag: [en-Latn]");
        }
    }

    public final Object a() {
        return null;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof g)) {
            return false;
        }
        Locale[] localeArr = ((g) obj).f296a;
        Locale[] localeArr2 = this.f296a;
        if (localeArr2.length != localeArr.length) {
            return false;
        }
        for (int i = 0; i < localeArr2.length; i++) {
            if (!localeArr2[i].equals(localeArr[i])) {
                return false;
            }
        }
        return true;
    }

    public final String b() {
        return this.f297b;
    }

    public final Locale get(int i) {
        if (i >= 0) {
            Locale[] localeArr = this.f296a;
            if (i < localeArr.length) {
                return localeArr[i];
            }
        }
        return null;
    }

    public final int hashCode() {
        int i = 1;
        for (Locale hashCode : this.f296a) {
            i = (i * 31) + hashCode.hashCode();
        }
        return i;
    }

    public final boolean isEmpty() {
        if (this.f296a.length == 0) {
            return true;
        }
        return false;
    }

    public final int size() {
        return this.f296a.length;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("[");
        int i = 0;
        while (true) {
            Locale[] localeArr = this.f296a;
            if (i < localeArr.length) {
                sb.append(localeArr[i]);
                if (i < localeArr.length - 1) {
                    sb.append(',');
                }
                i++;
            } else {
                sb.append("]");
                return sb.toString();
            }
        }
    }

    public g(Locale... localeArr) {
        if (localeArr.length == 0) {
            this.f296a = f295c;
            this.f297b = "";
            return;
        }
        ArrayList arrayList = new ArrayList();
        HashSet hashSet = new HashSet();
        StringBuilder sb = new StringBuilder();
        int i = 0;
        while (i < localeArr.length) {
            Locale locale = localeArr[i];
            if (locale != null) {
                if (!hashSet.contains(locale)) {
                    Locale locale2 = (Locale) locale.clone();
                    arrayList.add(locale2);
                    sb.append(locale2.getLanguage());
                    String country = locale2.getCountry();
                    if (country != null && !country.isEmpty()) {
                        sb.append('-');
                        sb.append(locale2.getCountry());
                    }
                    if (i < localeArr.length - 1) {
                        sb.append(',');
                    }
                    hashSet.add(locale2);
                }
                i++;
            } else {
                throw new NullPointerException("list[" + i + "] is null");
            }
        }
        this.f296a = (Locale[]) arrayList.toArray(new Locale[0]);
        this.f297b = sb.toString();
    }
}
