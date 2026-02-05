package m1;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.logging.Logger;
import r1.h;
import r1.o;
import r1.q;

/* renamed from: m1.c  reason: case insensitive filesystem */
public final class C0180c {

    /* renamed from: a  reason: collision with root package name */
    public final ArrayList f3686a = new ArrayList();

    /* renamed from: b  reason: collision with root package name */
    public final q f3687b;

    /* renamed from: c  reason: collision with root package name */
    public final int f3688c = 4096;

    /* renamed from: d  reason: collision with root package name */
    public int f3689d = 4096;
    public C0179b[] e = new C0179b[8];

    /* renamed from: f  reason: collision with root package name */
    public int f3690f = 7;

    /* renamed from: g  reason: collision with root package name */
    public int f3691g = 0;

    /* renamed from: h  reason: collision with root package name */
    public int f3692h = 0;

    public final int a(int i) {
        int i2;
        int i3 = 0;
        if (i > 0) {
            int length = this.e.length;
            while (true) {
                length--;
                i2 = this.f3690f;
                if (length < i2 || i <= 0) {
                    C0179b[] bVarArr = this.e;
                    System.arraycopy(bVarArr, i2 + 1, bVarArr, i2 + 1 + i3, this.f3691g);
                    this.f3690f += i3;
                } else {
                    int i4 = this.e[length].f3685c;
                    i -= i4;
                    this.f3692h -= i4;
                    this.f3691g--;
                    i3++;
                }
            }
            C0179b[] bVarArr2 = this.e;
            System.arraycopy(bVarArr2, i2 + 1, bVarArr2, i2 + 1 + i3, this.f3691g);
            this.f3690f += i3;
        }
        return i3;
    }

    public final int e(int i, int i2) {
        int i3 = i & i2;
        if (i3 < i2) {
            return i3;
        }
        int i4 = 0;
        while (true) {
            byte i5 = this.f3687b.i();
            byte b2 = i5 & 255;
            if ((i5 & 128) == 0) {
                return i2 + (b2 << i4);
            }
            i2 += (i5 & Byte.MAX_VALUE) << i4;
            i4 += 7;
        }
    }

    public final h b(int i) {
        if (i >= 0) {
            C0179b[] bVarArr = e.f3700a;
            if (i <= bVarArr.length - 1) {
                return bVarArr[i].f3683a;
            }
        }
        int length = this.f3690f + 1 + (i - e.f3700a.length);
        if (length >= 0) {
            C0179b[] bVarArr2 = this.e;
            if (length < bVarArr2.length) {
                return bVarArr2[length].f3683a;
            }
        }
        throw new IOException("Header index too large " + (i + 1));
    }

    public final void c(C0179b bVar) {
        this.f3686a.add(bVar);
        int i = this.f3689d;
        int i2 = bVar.f3685c;
        if (i2 > i) {
            Arrays.fill(this.e, (Object) null);
            this.f3690f = this.e.length - 1;
            this.f3691g = 0;
            this.f3692h = 0;
            return;
        }
        a((this.f3692h + i2) - i);
        int i3 = this.f3691g + 1;
        C0179b[] bVarArr = this.e;
        if (i3 > bVarArr.length) {
            C0179b[] bVarArr2 = new C0179b[(bVarArr.length * 2)];
            System.arraycopy(bVarArr, 0, bVarArr2, bVarArr.length, bVarArr.length);
            this.f3690f = this.e.length - 1;
            this.e = bVarArr2;
        }
        int i4 = this.f3690f;
        this.f3690f = i4 - 1;
        this.e[i4] = bVar;
        this.f3691g++;
        this.f3692h += i2;
    }

    public final h d() {
        boolean z2;
        int i;
        q qVar = this.f3687b;
        byte i2 = qVar.i();
        byte b2 = i2 & 255;
        if ((i2 & 128) == 128) {
            z2 = true;
        } else {
            z2 = false;
        }
        int e2 = e(b2, 127);
        if (!z2) {
            return qVar.j((long) e2);
        }
        B b3 = B.f3675d;
        long j2 = (long) e2;
        qVar.p(j2);
        byte[] k2 = qVar.f4598a.k(j2);
        b3.getClass();
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        A a2 = b3.f3676a;
        A a3 = a2;
        byte b4 = 0;
        int i3 = 0;
        for (byte b5 : k2) {
            b4 = (b4 << 8) | (b5 & 255);
            i3 += 8;
            while (i3 >= 8) {
                a3 = ((A[]) a3.f3672c)[(b4 >>> (i3 - 8)) & 255];
                if (((A[]) a3.f3672c) == null) {
                    byteArrayOutputStream.write(a3.f3670a);
                    i3 -= a3.f3671b;
                    a3 = a2;
                } else {
                    i3 -= 8;
                }
            }
        }
        while (i3 > 0) {
            A a4 = ((A[]) a3.f3672c)[(b4 << (8 - i3)) & 255];
            if (((A[]) a4.f3672c) != null || (i = a4.f3671b) > i3) {
                break;
            }
            byteArrayOutputStream.write(a4.f3670a);
            i3 -= i;
            a3 = a2;
        }
        return h.i(byteArrayOutputStream.toByteArray());
    }

    public C0180c(t tVar) {
        Logger logger = o.f4594a;
        this.f3687b = new q(tVar);
    }
}
