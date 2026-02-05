package p1;

import h1.c;
import java.io.InputStream;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.atomic.AtomicBoolean;
import r1.l;
import r1.o;
import r1.q;

public final class a {
    public static final byte[] e = {42};

    /* renamed from: f  reason: collision with root package name */
    public static final String[] f4461f = new String[0];

    /* renamed from: g  reason: collision with root package name */
    public static final String[] f4462g = {"*"};

    /* renamed from: h  reason: collision with root package name */
    public static final a f4463h = new a();

    /* renamed from: a  reason: collision with root package name */
    public final AtomicBoolean f4464a = new AtomicBoolean(false);

    /* renamed from: b  reason: collision with root package name */
    public final CountDownLatch f4465b = new CountDownLatch(1);

    /* renamed from: c  reason: collision with root package name */
    public byte[] f4466c;

    /* renamed from: d  reason: collision with root package name */
    public byte[] f4467d;

    public static String a(byte[] bArr, byte[][] bArr2, int i) {
        int i2;
        boolean z2;
        byte b2;
        int i3;
        byte[] bArr3 = bArr;
        byte[][] bArr4 = bArr2;
        int length = bArr3.length;
        int i4 = 0;
        while (i4 < length) {
            int i5 = (i4 + length) / 2;
            while (i5 > -1 && bArr3[i5] != 10) {
                i5--;
            }
            int i6 = i5 + 1;
            int i7 = 1;
            while (true) {
                i2 = i6 + i7;
                if (bArr3[i2] == 10) {
                    break;
                }
                i7++;
            }
            int i8 = i2 - i6;
            int i9 = i;
            boolean z3 = false;
            int i10 = 0;
            int i11 = 0;
            while (true) {
                if (z3) {
                    b2 = 46;
                    z2 = false;
                } else {
                    z2 = z3;
                    b2 = bArr4[i9][i10] & 255;
                }
                i3 = b2 - (bArr3[i6 + i11] & 255);
                if (i3 == 0) {
                    i11++;
                    i10++;
                    if (i11 == i8) {
                        break;
                    } else if (bArr4[i9].length != i10) {
                        z3 = z2;
                    } else if (i9 == bArr4.length - 1) {
                        break;
                    } else {
                        i9++;
                        z3 = true;
                        i10 = -1;
                    }
                } else {
                    break;
                }
            }
            if (i3 >= 0) {
                if (i3 <= 0) {
                    int i12 = i8 - i11;
                    int length2 = bArr4[i9].length - i10;
                    while (true) {
                        i9++;
                        if (i9 >= bArr4.length) {
                            break;
                        }
                        length2 += bArr4[i9].length;
                    }
                    if (length2 >= i12) {
                        if (length2 <= i12) {
                            return new String(bArr3, i6, i8, c.f3089d);
                        }
                    }
                }
                i4 = i2 + 1;
            }
            length = i5;
        }
        return null;
    }

    public final void b() {
        InputStream resourceAsStream = a.class.getResourceAsStream("publicsuffixes.gz");
        if (resourceAsStream != null) {
            q qVar = new q(new l(o.b(resourceAsStream)));
            try {
                byte[] bArr = new byte[qVar.l()];
                qVar.k(bArr);
                byte[] bArr2 = new byte[qVar.l()];
                qVar.k(bArr2);
                synchronized (this) {
                    this.f4466c = bArr;
                    this.f4467d = bArr2;
                }
                this.f4465b.countDown();
            } finally {
                c.c(qVar);
            }
        }
    }
}
