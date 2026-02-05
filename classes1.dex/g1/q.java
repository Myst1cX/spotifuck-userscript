package g1;

import h1.c;
import java.text.DateFormat;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public final class q {

    /* renamed from: j  reason: collision with root package name */
    public static final Pattern f2751j = Pattern.compile("(\\d{2,4})[^\\d]*");

    /* renamed from: k  reason: collision with root package name */
    public static final Pattern f2752k = Pattern.compile("(?i)(jan|feb|mar|apr|may|jun|jul|aug|sep|oct|nov|dec).*");

    /* renamed from: l  reason: collision with root package name */
    public static final Pattern f2753l = Pattern.compile("(\\d{1,2})[^\\d]*");

    /* renamed from: m  reason: collision with root package name */
    public static final Pattern f2754m = Pattern.compile("(\\d{1,2}):(\\d{1,2}):(\\d{1,2})[^\\d]*");

    /* renamed from: a  reason: collision with root package name */
    public final String f2755a;

    /* renamed from: b  reason: collision with root package name */
    public final String f2756b;

    /* renamed from: c  reason: collision with root package name */
    public final long f2757c;

    /* renamed from: d  reason: collision with root package name */
    public final String f2758d;
    public final String e;

    /* renamed from: f  reason: collision with root package name */
    public final boolean f2759f;

    /* renamed from: g  reason: collision with root package name */
    public final boolean f2760g;

    /* renamed from: h  reason: collision with root package name */
    public final boolean f2761h;
    public final boolean i;

    public static long b(String str, int i2) {
        int a2 = a(str, 0, i2, false);
        Pattern pattern = f2754m;
        Matcher matcher = pattern.matcher(str);
        int i3 = -1;
        int i4 = -1;
        int i5 = -1;
        int i6 = -1;
        int i7 = -1;
        int i8 = -1;
        while (a2 < i2) {
            int a3 = a(str, a2 + 1, i2, true);
            matcher.region(a2, a3);
            if (i4 == -1 && matcher.usePattern(pattern).matches()) {
                i4 = Integer.parseInt(matcher.group(1));
                i7 = Integer.parseInt(matcher.group(2));
                i8 = Integer.parseInt(matcher.group(3));
            } else if (i5 != -1 || !matcher.usePattern(f2753l).matches()) {
                if (i6 == -1) {
                    Pattern pattern2 = f2752k;
                    if (matcher.usePattern(pattern2).matches()) {
                        i6 = pattern2.pattern().indexOf(matcher.group(1).toLowerCase(Locale.US)) / 4;
                    }
                }
                if (i3 == -1 && matcher.usePattern(f2751j).matches()) {
                    i3 = Integer.parseInt(matcher.group(1));
                }
            } else {
                i5 = Integer.parseInt(matcher.group(1));
            }
            a2 = a(str, a3 + 1, i2, false);
        }
        if (i3 >= 70 && i3 <= 99) {
            i3 += 1900;
        }
        if (i3 >= 0 && i3 <= 69) {
            i3 += 2000;
        }
        if (i3 < 1601) {
            throw new IllegalArgumentException();
        } else if (i6 == -1) {
            throw new IllegalArgumentException();
        } else if (i5 < 1 || i5 > 31) {
            throw new IllegalArgumentException();
        } else if (i4 < 0 || i4 > 23) {
            throw new IllegalArgumentException();
        } else if (i7 < 0 || i7 > 59) {
            throw new IllegalArgumentException();
        } else if (i8 < 0 || i8 > 59) {
            throw new IllegalArgumentException();
        } else {
            GregorianCalendar gregorianCalendar = new GregorianCalendar(c.e);
            gregorianCalendar.setLenient(false);
            gregorianCalendar.set(1, i3);
            gregorianCalendar.set(2, i6 - 1);
            gregorianCalendar.set(5, i5);
            gregorianCalendar.set(11, i4);
            gregorianCalendar.set(12, i7);
            gregorianCalendar.set(13, i8);
            gregorianCalendar.set(14, 0);
            return gregorianCalendar.getTimeInMillis();
        }
    }

    public static int a(String str, int i2, int i3, boolean z2) {
        boolean z3;
        while (i2 < i3) {
            char charAt = str.charAt(i2);
            if ((charAt >= ' ' || charAt == 9) && charAt < 127 && ((charAt < '0' || charAt > '9') && ((charAt < 'a' || charAt > 'z') && ((charAt < 'A' || charAt > 'Z') && charAt != ':')))) {
                z3 = false;
            } else {
                z3 = true;
            }
            if (z3 == (!z2)) {
                return i2;
            }
            i2++;
        }
        return i3;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof q)) {
            return false;
        }
        q qVar = (q) obj;
        if (qVar.f2755a.equals(this.f2755a) && qVar.f2756b.equals(this.f2756b) && qVar.f2758d.equals(this.f2758d) && qVar.e.equals(this.e) && qVar.f2757c == this.f2757c && qVar.f2759f == this.f2759f && qVar.f2760g == this.f2760g && qVar.f2761h == this.f2761h && qVar.i == this.i) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = this.f2756b.hashCode();
        int hashCode2 = this.f2758d.hashCode();
        int hashCode3 = this.e.hashCode();
        long j2 = this.f2757c;
        return ((((((((((hashCode3 + ((hashCode2 + ((hashCode + ((this.f2755a.hashCode() + 527) * 31)) * 31)) * 31)) * 31) + ((int) (j2 ^ (j2 >>> 32)))) * 31) + (this.f2759f ^ true ? 1 : 0)) * 31) + (this.f2760g ^ true ? 1 : 0)) * 31) + (this.f2761h ^ true ? 1 : 0)) * 31) + (this.i ^ true ? 1 : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.f2755a);
        sb.append('=');
        sb.append(this.f2756b);
        if (this.f2761h) {
            long j2 = this.f2757c;
            if (j2 == Long.MIN_VALUE) {
                sb.append("; max-age=0");
            } else {
                sb.append("; expires=");
                sb.append(((DateFormat) k1.c.f3570a.get()).format(new Date(j2)));
            }
        }
        if (!this.i) {
            sb.append("; domain=");
            sb.append(this.f2758d);
        }
        sb.append("; path=");
        sb.append(this.e);
        if (this.f2759f) {
            sb.append("; secure");
        }
        if (this.f2760g) {
            sb.append("; httponly");
        }
        return sb.toString();
    }

    public q(String str, String str2, long j2, String str3, String str4, boolean z2, boolean z3, boolean z4, boolean z5) {
        this.f2755a = str;
        this.f2756b = str2;
        this.f2757c = j2;
        this.f2758d = str3;
        this.e = str4;
        this.f2759f = z2;
        this.f2760g = z3;
        this.i = z4;
        this.f2761h = z5;
    }
}
