package m1;

import h1.c;
import java.io.IOException;
import java.util.Locale;
import r1.h;

public abstract class f {

    /* renamed from: a  reason: collision with root package name */
    public static final h f3702a = h.f("PRI * HTTP/2.0\r\n\r\nSM\r\n\r\n");

    /* renamed from: b  reason: collision with root package name */
    public static final String[] f3703b = {"DATA", "HEADERS", "PRIORITY", "RST_STREAM", "SETTINGS", "PUSH_PROMISE", "PING", "GOAWAY", "WINDOW_UPDATE", "CONTINUATION"};

    /* renamed from: c  reason: collision with root package name */
    public static final String[] f3704c = new String[64];

    /* renamed from: d  reason: collision with root package name */
    public static final String[] f3705d = new String[256];

    public static String a(boolean z2, int i, int i2, byte b2, byte b3) {
        String str;
        String str2;
        String str3;
        String str4;
        String[] strArr = f3703b;
        if (b2 < strArr.length) {
            str = strArr[b2];
        } else {
            Object[] objArr = {Byte.valueOf(b2)};
            byte[] bArr = c.f3086a;
            str = String.format(Locale.US, "0x%02x", objArr);
        }
        if (b3 == 0) {
            str2 = "";
        } else {
            String[] strArr2 = f3705d;
            if (!(b2 == 2 || b2 == 3)) {
                if (b2 == 4 || b2 == 6) {
                    if (b3 == 1) {
                        str2 = "ACK";
                    } else {
                        str2 = strArr2[b3];
                    }
                } else if (!(b2 == 7 || b2 == 8)) {
                    String[] strArr3 = f3704c;
                    if (b3 < strArr3.length) {
                        str4 = strArr3[b3];
                    } else {
                        str4 = strArr2[b3];
                    }
                    if (b2 == 5 && (b3 & 4) != 0) {
                        str2 = str4.replace("HEADERS", "PUSH_PROMISE");
                    } else if (b2 != 0 || (b3 & 32) == 0) {
                        str2 = str4;
                    } else {
                        str2 = str4.replace("PRIORITY", "COMPRESSED");
                    }
                }
            }
            str2 = strArr2[b3];
        }
        if (z2) {
            str3 = "<<";
        } else {
            str3 = ">>";
        }
        Object[] objArr2 = {str3, Integer.valueOf(i), Integer.valueOf(i2), str, str2};
        byte[] bArr2 = c.f3086a;
        return String.format(Locale.US, "%s 0x%08x %5d %-13s %s", objArr2);
    }

    static {
        int i = 0;
        int i2 = 0;
        while (true) {
            String[] strArr = f3705d;
            if (i2 >= strArr.length) {
                break;
            }
            Object[] objArr = {Integer.toBinaryString(i2)};
            byte[] bArr = c.f3086a;
            strArr[i2] = String.format(Locale.US, "%8s", objArr).replace(' ', '0');
            i2++;
        }
        String[] strArr2 = f3704c;
        strArr2[0] = "";
        strArr2[1] = "END_STREAM";
        int[] iArr = {1};
        strArr2[8] = "PADDED";
        int i3 = iArr[0];
        strArr2[i3 | 8] = strArr2[i3] + "|PADDED";
        strArr2[4] = "END_HEADERS";
        strArr2[32] = "PRIORITY";
        strArr2[36] = "END_HEADERS|PRIORITY";
        int[] iArr2 = {4, 32, 36};
        for (int i4 = 0; i4 < 3; i4++) {
            int i5 = iArr2[i4];
            int i6 = iArr[0];
            String[] strArr3 = f3704c;
            int i7 = i6 | i5;
            strArr3[i7] = strArr3[i6] + '|' + strArr3[i5];
            strArr3[i7 | 8] = strArr3[i6] + '|' + strArr3[i5] + "|PADDED";
        }
        while (true) {
            String[] strArr4 = f3704c;
            if (i < strArr4.length) {
                if (strArr4[i] == null) {
                    strArr4[i] = f3705d[i];
                }
                i++;
            } else {
                return;
            }
        }
    }

    public static void b(String str, Object... objArr) {
        byte[] bArr = c.f3086a;
        throw new IllegalArgumentException(String.format(Locale.US, str, objArr));
    }

    public static void c(String str, Object... objArr) {
        byte[] bArr = c.f3086a;
        throw new IOException(String.format(Locale.US, str, objArr));
    }
}
