package h1;

import A.j;
import Q0.E;
import g1.D;
import g1.u;
import java.io.Closeable;
import java.io.EOFException;
import java.io.InterruptedIOException;
import java.net.IDN;
import java.net.InetAddress;
import java.net.Socket;
import java.net.UnknownHostException;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Locale;
import java.util.TimeZone;
import java.util.concurrent.TimeUnit;
import java.util.regex.Pattern;
import r1.h;
import r1.v;

public abstract class c {

    /* renamed from: a  reason: collision with root package name */
    public static final byte[] f3086a;

    /* renamed from: b  reason: collision with root package name */
    public static final String[] f3087b = new String[0];

    /* renamed from: c  reason: collision with root package name */
    public static final D f3088c;

    /* renamed from: d  reason: collision with root package name */
    public static final Charset f3089d = Charset.forName("UTF-8");
    public static final TimeZone e = TimeZone.getTimeZone("GMT");

    /* renamed from: f  reason: collision with root package name */
    public static final j f3090f = new j(2);

    /* renamed from: g  reason: collision with root package name */
    public static final Pattern f3091g = Pattern.compile("([0-9a-fA-F]*:[0-9a-fA-F:.]*)|([\\d.]+)");

    /* JADX WARNING: type inference failed for: r2v1, types: [r1.e, java.lang.Object, r1.g] */
    static {
        byte[] bArr = new byte[0];
        f3086a = bArr;
        ? obj = new Object();
        obj.u(bArr, 0);
        long j2 = (long) 0;
        f3088c = new D(j2, obj, 0);
        if (j2 < 0 || j2 > j2 || 0 < j2) {
            throw new ArrayIndexOutOfBoundsException();
        }
        h.c("efbbbf");
        h.c("feff");
        h.c("fffe");
        h.c("0000ffff");
        h.c("ffff0000");
        Charset.forName("ISO-8859-1");
        Charset.forName("UTF-16BE");
        Charset.forName("UTF-16LE");
        Charset.forName("UTF-32BE");
        Charset.forName("UTF-32LE");
    }

    public static boolean o(Comparator comparator, String[] strArr, String[] strArr2) {
        if (!(strArr == null || strArr2 == null || strArr.length == 0 || strArr2.length == 0)) {
            for (String str : strArr) {
                for (String compare : strArr2) {
                    if (comparator.compare(str, compare) == 0) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public static AssertionError a(String str, Exception exc) {
        AssertionError assertionError = new AssertionError(str);
        try {
            assertionError.initCause(exc);
        } catch (IllegalStateException unused) {
        }
        return assertionError;
    }

    /* JADX WARNING: type inference failed for: r8v6, types: [r1.e, java.lang.Object] */
    public static String b(String str) {
        InetAddress inetAddress;
        int i = -1;
        int i2 = 0;
        if (str.contains(":")) {
            if (!str.startsWith("[") || !str.endsWith("]")) {
                inetAddress = f(str, 0, str.length());
            } else {
                inetAddress = f(str, 1, str.length() - 1);
            }
            if (inetAddress == null) {
                return null;
            }
            byte[] address = inetAddress.getAddress();
            if (address.length == 16) {
                int i3 = 0;
                int i4 = 0;
                while (i3 < address.length) {
                    int i5 = i3;
                    while (i5 < 16 && address[i5] == 0 && address[i5 + 1] == 0) {
                        i5 += 2;
                    }
                    int i6 = i5 - i3;
                    if (i6 > i4 && i6 >= 4) {
                        i = i3;
                        i4 = i6;
                    }
                    i3 = i5 + 2;
                }
                ? obj = new Object();
                while (i2 < address.length) {
                    if (i2 == i) {
                        obj.v(58);
                        i2 += i4;
                        if (i2 == 16) {
                            obj.v(58);
                        }
                    } else {
                        if (i2 > 0) {
                            obj.v(58);
                        }
                        obj.x((long) (((address[i2] & 255) << 8) | (address[i2 + 1] & 255)));
                        i2 += 2;
                    }
                }
                return obj.q();
            }
            throw new AssertionError(E.g("Invalid IPv6 address: '", str, "'"));
        }
        try {
            String lowerCase = IDN.toASCII(str).toLowerCase(Locale.US);
            if (lowerCase.isEmpty()) {
                return null;
            }
            while (i2 < lowerCase.length()) {
                char charAt = lowerCase.charAt(i2);
                if (charAt > 31) {
                    if (charAt < 127) {
                        if (" #%/:?@[\\]".indexOf(charAt) == -1) {
                            i2++;
                        }
                    }
                }
                return null;
            }
            return lowerCase;
        } catch (IllegalArgumentException unused) {
            return null;
        }
    }

    public static void c(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (RuntimeException e2) {
                throw e2;
            } catch (Exception unused) {
            }
        }
    }

    public static void d(Socket socket) {
        if (socket != null) {
            try {
                socket.close();
            } catch (AssertionError e2) {
                if (!n(e2)) {
                    throw e2;
                }
            } catch (RuntimeException e3) {
                throw e3;
            } catch (Exception unused) {
            }
        }
    }

    public static int e(char c2) {
        if (c2 >= '0' && c2 <= '9') {
            return c2 - '0';
        }
        if (c2 >= 'a' && c2 <= 'f') {
            return c2 - 'W';
        }
        if (c2 < 'A' || c2 > 'F') {
            return -1;
        }
        return c2 - '7';
    }

    public static InetAddress f(String str, int i, int i2) {
        String str2 = str;
        int i3 = i2;
        int i4 = 16;
        byte[] bArr = new byte[16];
        int i5 = 0;
        int i6 = i;
        int i7 = 0;
        int i8 = -1;
        int i9 = -1;
        while (true) {
            if (i6 >= i3) {
                break;
            } else if (i7 == i4) {
                return null;
            } else {
                int i10 = i6 + 2;
                if (i10 > i3 || !str2.regionMatches(i6, "::", i5, 2)) {
                    if (i7 != 0) {
                        if (str2.regionMatches(i6, ":", i5, 1)) {
                            i6++;
                        } else if (!str2.regionMatches(i6, ".", i5, 1)) {
                            return null;
                        } else {
                            int i11 = i7 - 2;
                            int i12 = i11;
                            loop1:
                            while (true) {
                                if (i9 < i3) {
                                    if (i12 == i4) {
                                        break;
                                    }
                                    if (i12 != i11) {
                                        if (str2.charAt(i9) != '.') {
                                            break;
                                        }
                                        i9++;
                                    }
                                    int i13 = i9;
                                    int i14 = 0;
                                    while (true) {
                                        if (i13 < i3) {
                                            char charAt = str2.charAt(i13);
                                            if (charAt >= '0' && charAt <= '9') {
                                                if ((i14 == 0 && i9 != i13) || (i14 = ((i14 * 10) + charAt) - 48) > 255) {
                                                    break loop1;
                                                }
                                                i13++;
                                            } else {
                                                break;
                                            }
                                        } else {
                                            break;
                                        }
                                    }
                                    if (i13 - i9 == 0) {
                                        break;
                                    }
                                    bArr[i12] = (byte) i14;
                                    i12++;
                                    i9 = i13;
                                    i4 = 16;
                                } else if (i12 == i7 + 2) {
                                    i7 += 2;
                                }
                            }
                            return null;
                        }
                    }
                    i9 = i6;
                } else if (i8 != -1) {
                    return null;
                } else {
                    i7 += 2;
                    i8 = i7;
                    if (i10 == i3) {
                        break;
                    }
                    i9 = i10;
                }
                i6 = i9;
                int i15 = 0;
                while (i6 < i3) {
                    int e2 = e(str2.charAt(i6));
                    if (e2 == -1) {
                        break;
                    }
                    i15 = (i15 << 4) + e2;
                    i6++;
                }
                int i16 = i6 - i9;
                if (i16 == 0 || i16 > 4) {
                    return null;
                }
                int i17 = i7 + 1;
                bArr[i7] = (byte) ((i15 >>> 8) & 255);
                i7 += 2;
                bArr[i17] = (byte) (i15 & 255);
                i4 = 16;
                i5 = 0;
            }
        }
        if (i7 != 16) {
            if (i8 == -1) {
                return null;
            }
            int i18 = i7 - i8;
            System.arraycopy(bArr, i8, bArr, 16 - i18, i18);
            Arrays.fill(bArr, i8, (16 - i7) + i8, (byte) 0);
        }
        try {
            return InetAddress.getByAddress(bArr);
        } catch (UnknownHostException unused) {
            throw new AssertionError();
        }
    }

    public static int g(String str, int i, int i2, char c2) {
        while (i < i2) {
            if (str.charAt(i) == c2) {
                return i;
            }
            i++;
        }
        return i2;
    }

    public static int h(String str, int i, int i2, String str2) {
        while (i < i2) {
            if (str2.indexOf(str.charAt(i)) != -1) {
                return i;
            }
            i++;
        }
        return i2;
    }

    public static boolean i(Object obj, Object obj2) {
        if (obj == obj2 || (obj != null && obj.equals(obj2))) {
            return true;
        }
        return false;
    }

    public static String j(u uVar, boolean z2) {
        boolean contains = uVar.f2777d.contains(":");
        String str = uVar.f2777d;
        if (contains) {
            str = E.g("[", str, "]");
        }
        int i = uVar.e;
        if (!z2 && i == u.b(uVar.f2774a)) {
            return str;
        }
        return str + ":" + i;
    }

    public static List k(List list) {
        return Collections.unmodifiableList(new ArrayList(list));
    }

    public static String[] m(Comparator comparator, String[] strArr, String[] strArr2) {
        ArrayList arrayList = new ArrayList();
        for (String str : strArr) {
            int length = strArr2.length;
            int i = 0;
            while (true) {
                if (i >= length) {
                    break;
                } else if (comparator.compare(str, strArr2[i]) == 0) {
                    arrayList.add(str);
                    break;
                } else {
                    i++;
                }
            }
        }
        return (String[]) arrayList.toArray(new String[arrayList.size()]);
    }

    public static int q(String str, int i, int i2) {
        while (i < i2) {
            char charAt = str.charAt(i);
            if (charAt != 9 && charAt != 10 && charAt != 12 && charAt != 13 && charAt != ' ') {
                return i;
            }
            i++;
        }
        return i2;
    }

    public static int r(String str, int i, int i2) {
        for (int i3 = i2 - 1; i3 >= i; i3--) {
            char charAt = str.charAt(i3);
            if (charAt != 9 && charAt != 10 && charAt != 12 && charAt != 13 && charAt != ' ') {
                return i3 + 1;
            }
        }
        return i;
    }

    public static List l(Object... objArr) {
        return Collections.unmodifiableList(Arrays.asList((Object[]) objArr.clone()));
    }

    public static boolean n(AssertionError assertionError) {
        if (assertionError.getCause() == null || assertionError.getMessage() == null || !assertionError.getMessage().contains("getsockname failed")) {
            return false;
        }
        return true;
    }

    /* JADX WARNING: type inference failed for: r12v6, types: [r1.e, java.lang.Object] */
    public static boolean p(v vVar, int i, TimeUnit timeUnit) {
        long j2;
        long nanoTime = System.nanoTime();
        if (vVar.a().e()) {
            j2 = vVar.a().c() - nanoTime;
        } else {
            j2 = Long.MAX_VALUE;
        }
        vVar.a().d(Math.min(j2, timeUnit.toNanos((long) i)) + nanoTime);
        try {
            ? obj = new Object();
            while (vVar.e(obj, 8192) != -1) {
                obj.s(obj.f4579b);
            }
            if (j2 == Long.MAX_VALUE) {
                vVar.a().a();
                return true;
            }
            vVar.a().d(nanoTime + j2);
            return true;
        } catch (EOFException e2) {
            throw new AssertionError(e2);
        } catch (InterruptedIOException unused) {
            if (j2 == Long.MAX_VALUE) {
                vVar.a().a();
                return false;
            }
            vVar.a().d(nanoTime + j2);
            return false;
        } catch (Throwable th) {
            if (j2 == Long.MAX_VALUE) {
                vVar.a().a();
            } else {
                vVar.a().d(nanoTime + j2);
            }
            throw th;
        }
    }
}
