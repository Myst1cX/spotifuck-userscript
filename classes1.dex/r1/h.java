package r1;

import Q0.E;
import java.io.Serializable;
import java.io.UnsupportedEncodingException;
import java.nio.charset.Charset;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Arrays;

public class h implements Serializable, Comparable {

    /* renamed from: d  reason: collision with root package name */
    public static final char[] f4580d = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};
    public static final h e = i(new byte[0]);

    /* renamed from: a  reason: collision with root package name */
    public final byte[] f4581a;

    /* renamed from: b  reason: collision with root package name */
    public transient int f4582b;

    /* renamed from: c  reason: collision with root package name */
    public transient String f4583c;

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof h) {
            h hVar = (h) obj;
            int l2 = hVar.l();
            byte[] bArr = this.f4581a;
            if (l2 != bArr.length || !hVar.j(0, bArr, 0, bArr.length)) {
                return false;
            }
            return true;
        }
        return false;
    }

    public boolean j(int i, byte[] bArr, int i2, int i3) {
        if (i >= 0) {
            byte[] bArr2 = this.f4581a;
            if (i <= bArr2.length - i3 && i2 >= 0 && i2 <= bArr.length - i3) {
                Charset charset = y.f4616a;
                int i4 = 0;
                while (i4 < i3) {
                    if (bArr2[i4 + i] == bArr[i4 + i2]) {
                        i4++;
                    }
                }
                return true;
            }
        }
        return false;
    }

    public boolean k(h hVar, int i) {
        return hVar.j(0, this.f4581a, 0, i);
    }

    public h n() {
        int i = 0;
        while (true) {
            byte[] bArr = this.f4581a;
            if (i >= bArr.length) {
                return this;
            }
            byte b2 = bArr[i];
            if (b2 < 65 || b2 > 90) {
                i++;
            } else {
                byte[] bArr2 = (byte[]) bArr.clone();
                bArr2[i] = (byte) (b2 + 32);
                for (int i2 = i + 1; i2 < bArr2.length; i2++) {
                    byte b3 = bArr2[i2];
                    if (b3 >= 65 && b3 <= 90) {
                        bArr2[i2] = (byte) (b3 + 32);
                    }
                }
                return new h(bArr2);
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:41:0x0079, code lost:
        r5 = null;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static r1.h b(java.lang.String r15) {
        /*
            if (r15 == 0) goto L_0x00d8
            int r0 = r15.length()
        L_0x0006:
            r1 = 9
            r2 = 32
            r3 = 13
            r4 = 10
            if (r0 <= 0) goto L_0x0026
            int r5 = r0 + -1
            char r5 = r15.charAt(r5)
            r6 = 61
            if (r5 == r6) goto L_0x0023
            if (r5 == r4) goto L_0x0023
            if (r5 == r3) goto L_0x0023
            if (r5 == r2) goto L_0x0023
            if (r5 == r1) goto L_0x0023
            goto L_0x0026
        L_0x0023:
            int r0 = r0 + -1
            goto L_0x0006
        L_0x0026:
            long r5 = (long) r0
            r7 = 6
            long r5 = r5 * r7
            r7 = 8
            long r5 = r5 / r7
            int r6 = (int) r5
            byte[] r5 = new byte[r6]
            r7 = 0
            r8 = 0
            r9 = 0
            r10 = 0
            r11 = 0
        L_0x0036:
            r12 = 0
            if (r8 >= r0) goto L_0x00a0
            char r13 = r15.charAt(r8)
            r14 = 65
            if (r13 < r14) goto L_0x0048
            r14 = 90
            if (r13 > r14) goto L_0x0048
            int r13 = r13 + -65
            goto L_0x0080
        L_0x0048:
            r14 = 97
            if (r13 < r14) goto L_0x0053
            r14 = 122(0x7a, float:1.71E-43)
            if (r13 > r14) goto L_0x0053
            int r13 = r13 + -71
            goto L_0x0080
        L_0x0053:
            r14 = 48
            if (r13 < r14) goto L_0x005e
            r14 = 57
            if (r13 > r14) goto L_0x005e
            int r13 = r13 + 4
            goto L_0x0080
        L_0x005e:
            r14 = 43
            if (r13 == r14) goto L_0x007e
            r14 = 45
            if (r13 != r14) goto L_0x0067
            goto L_0x007e
        L_0x0067:
            r14 = 47
            if (r13 == r14) goto L_0x007b
            r14 = 95
            if (r13 != r14) goto L_0x0070
            goto L_0x007b
        L_0x0070:
            if (r13 == r4) goto L_0x009d
            if (r13 == r3) goto L_0x009d
            if (r13 == r2) goto L_0x009d
            if (r13 != r1) goto L_0x0079
            goto L_0x009d
        L_0x0079:
            r5 = r12
            goto L_0x00d0
        L_0x007b:
            r13 = 63
            goto L_0x0080
        L_0x007e:
            r13 = 62
        L_0x0080:
            int r10 = r10 << 6
            byte r12 = (byte) r13
            r10 = r10 | r12
            int r9 = r9 + 1
            int r12 = r9 % 4
            if (r12 != 0) goto L_0x009d
            int r12 = r11 + 1
            int r13 = r10 >> 16
            byte r13 = (byte) r13
            r5[r11] = r13
            int r13 = r11 + 2
            int r14 = r10 >> 8
            byte r14 = (byte) r14
            r5[r12] = r14
            int r11 = r11 + 3
            byte r12 = (byte) r10
            r5[r13] = r12
        L_0x009d:
            int r8 = r8 + 1
            goto L_0x0036
        L_0x00a0:
            int r9 = r9 % 4
            r15 = 1
            if (r9 != r15) goto L_0x00a6
            goto L_0x0079
        L_0x00a6:
            r15 = 2
            if (r9 != r15) goto L_0x00b4
            int r15 = r10 << 12
            int r0 = r11 + 1
            int r15 = r15 >> 16
            byte r15 = (byte) r15
            r5[r11] = r15
            r11 = r0
            goto L_0x00c7
        L_0x00b4:
            r15 = 3
            if (r9 != r15) goto L_0x00c7
            int r15 = r10 << 6
            int r0 = r11 + 1
            int r1 = r15 >> 16
            byte r1 = (byte) r1
            r5[r11] = r1
            int r11 = r11 + 2
            int r15 = r15 >> 8
            byte r15 = (byte) r15
            r5[r0] = r15
        L_0x00c7:
            if (r11 != r6) goto L_0x00ca
            goto L_0x00d0
        L_0x00ca:
            byte[] r15 = new byte[r11]
            java.lang.System.arraycopy(r5, r7, r15, r7, r11)
            r5 = r15
        L_0x00d0:
            if (r5 == 0) goto L_0x00d7
            r1.h r12 = new r1.h
            r12.<init>(r5)
        L_0x00d7:
            return r12
        L_0x00d8:
            java.lang.IllegalArgumentException r15 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "base64 == null"
            r15.<init>(r0)
            throw r15
        */
        throw new UnsupportedOperationException("Method not decompiled: r1.h.b(java.lang.String):r1.h");
    }

    public static int d(char c2) {
        if (c2 >= '0' && c2 <= '9') {
            return c2 - '0';
        }
        if (c2 >= 'a' && c2 <= 'f') {
            return c2 - 'W';
        }
        if (c2 >= 'A' && c2 <= 'F') {
            return c2 - '7';
        }
        throw new IllegalArgumentException("Unexpected hex digit: " + c2);
    }

    public static h f(String str) {
        if (str != null) {
            h hVar = new h(str.getBytes(y.f4616a));
            hVar.f4583c = str;
            return hVar;
        }
        throw new IllegalArgumentException("s == null");
    }

    public static h i(byte... bArr) {
        if (bArr != null) {
            return new h((byte[]) bArr.clone());
        }
        throw new IllegalArgumentException("data == null");
    }

    public String a() {
        byte[] bArr = s.f4609c;
        byte[] bArr2 = this.f4581a;
        byte[] bArr3 = new byte[(((bArr2.length + 2) / 3) * 4)];
        int length = bArr2.length - (bArr2.length % 3);
        int i = 0;
        for (int i2 = 0; i2 < length; i2 += 3) {
            bArr3[i] = bArr[(bArr2[i2] & 255) >> 2];
            int i3 = i2 + 1;
            bArr3[i + 1] = bArr[((bArr2[i2] & 3) << 4) | ((bArr2[i3] & 255) >> 4)];
            int i4 = i + 3;
            int i5 = i2 + 2;
            bArr3[i + 2] = bArr[((bArr2[i3] & 15) << 2) | ((bArr2[i5] & 255) >> 6)];
            i += 4;
            bArr3[i4] = bArr[bArr2[i5] & 63];
        }
        int length2 = bArr2.length % 3;
        if (length2 == 1) {
            bArr3[i] = bArr[(bArr2[length] & 255) >> 2];
            bArr3[i + 1] = bArr[(bArr2[length] & 3) << 4];
            bArr3[i + 2] = 61;
            bArr3[i + 3] = 61;
        } else if (length2 == 2) {
            bArr3[i] = bArr[(bArr2[length] & 255) >> 2];
            int i6 = length + 1;
            bArr3[i + 1] = bArr[((bArr2[i6] & 255) >> 4) | ((bArr2[length] & 3) << 4)];
            bArr3[i + 2] = bArr[(bArr2[i6] & 15) << 2];
            bArr3[i + 3] = 61;
        }
        try {
            return new String(bArr3, "US-ASCII");
        } catch (UnsupportedEncodingException e2) {
            throw new AssertionError(e2);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:7:0x0027 A[ORIG_RETURN, RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0029 A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int compareTo(java.lang.Object r10) {
        /*
            r9 = this;
            r1.h r10 = (r1.h) r10
            int r0 = r9.l()
            int r1 = r10.l()
            int r2 = java.lang.Math.min(r0, r1)
            r3 = 0
            r4 = 0
        L_0x0010:
            r5 = 1
            r6 = -1
            if (r4 >= r2) goto L_0x002b
            byte r7 = r9.g(r4)
            r7 = r7 & 255(0xff, float:3.57E-43)
            byte r8 = r10.g(r4)
            r8 = r8 & 255(0xff, float:3.57E-43)
            if (r7 != r8) goto L_0x0025
            int r4 = r4 + 1
            goto L_0x0010
        L_0x0025:
            if (r7 >= r8) goto L_0x0029
        L_0x0027:
            r3 = -1
            goto L_0x0031
        L_0x0029:
            r3 = 1
            goto L_0x0031
        L_0x002b:
            if (r0 != r1) goto L_0x002e
            goto L_0x0031
        L_0x002e:
            if (r0 >= r1) goto L_0x0029
            goto L_0x0027
        L_0x0031:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: r1.h.compareTo(java.lang.Object):int");
    }

    public byte g(int i) {
        return this.f4581a[i];
    }

    public String h() {
        byte[] bArr = this.f4581a;
        char[] cArr = new char[(bArr.length * 2)];
        int i = 0;
        for (byte b2 : bArr) {
            int i2 = i + 1;
            char[] cArr2 = f4580d;
            cArr[i] = cArr2[(b2 >> 4) & 15];
            i += 2;
            cArr[i2] = cArr2[b2 & 15];
        }
        return new String(cArr);
    }

    public int hashCode() {
        int i = this.f4582b;
        if (i != 0) {
            return i;
        }
        int hashCode = Arrays.hashCode(this.f4581a);
        this.f4582b = hashCode;
        return hashCode;
    }

    public int l() {
        return this.f4581a.length;
    }

    public h m() {
        byte[] bArr = this.f4581a;
        if (64 > bArr.length) {
            throw new IllegalArgumentException("endIndex > length(" + bArr.length + ")");
        } else if (64 == bArr.length) {
            return this;
        } else {
            byte[] bArr2 = new byte[64];
            System.arraycopy(bArr, 0, bArr2, 0, 64);
            return new h(bArr2);
        }
    }

    public String o() {
        String str = this.f4583c;
        if (str != null) {
            return str;
        }
        String str2 = new String(this.f4581a, y.f4616a);
        this.f4583c = str2;
        return str2;
    }

    public void p(e eVar) {
        byte[] bArr = this.f4581a;
        eVar.u(bArr, bArr.length);
    }

    public String toString() {
        byte[] bArr = this.f4581a;
        if (bArr.length == 0) {
            return "[size=0]";
        }
        String o2 = o();
        int length = o2.length();
        int i = 0;
        int i2 = 0;
        while (true) {
            if (i >= length) {
                i = o2.length();
                break;
            } else if (i2 == 64) {
                break;
            } else {
                int codePointAt = o2.codePointAt(i);
                if ((!Character.isISOControl(codePointAt) || codePointAt == 10 || codePointAt == 13) && codePointAt != 65533) {
                    i2++;
                    i += Character.charCount(codePointAt);
                }
            }
        }
        i = -1;
        if (i != -1) {
            String replace = o2.substring(0, i).replace("\\", "\\\\").replace("\n", "\\n").replace("\r", "\\r");
            if (i >= o2.length()) {
                return E.g("[text=", replace, "]");
            }
            return "[size=" + bArr.length + " text=" + replace + "…]";
        } else if (bArr.length <= 64) {
            return "[hex=" + h() + "]";
        } else {
            return "[size=" + bArr.length + " hex=" + m().h() + "…]";
        }
    }

    public h(byte[] bArr) {
        this.f4581a = bArr;
    }

    public static void c(String str) {
        if (str.length() % 2 == 0) {
            int length = str.length() / 2;
            byte[] bArr = new byte[length];
            for (int i = 0; i < length; i++) {
                int i2 = i * 2;
                bArr[i] = (byte) (d(str.charAt(i2 + 1)) + (d(str.charAt(i2)) << 4));
            }
            i(bArr);
            return;
        }
        throw new IllegalArgumentException("Unexpected hex string: ".concat(str));
    }

    public final h e(String str) {
        try {
            return i(MessageDigest.getInstance(str).digest(this.f4581a));
        } catch (NoSuchAlgorithmException e2) {
            throw new AssertionError(e2);
        }
    }
}
