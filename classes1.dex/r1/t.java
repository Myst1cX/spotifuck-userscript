package r1;

import java.nio.charset.Charset;
import java.util.Arrays;

public final class t extends h {

    /* renamed from: f  reason: collision with root package name */
    public final transient byte[][] f4610f;

    /* renamed from: g  reason: collision with root package name */
    public final transient int[] f4611g;

    public t(e eVar, int i) {
        super((byte[]) null);
        y.a(eVar.f4579b, 0, (long) i);
        r rVar = eVar.f4578a;
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        while (i3 < i) {
            int i5 = rVar.f4603c;
            int i6 = rVar.f4602b;
            if (i5 != i6) {
                i3 += i5 - i6;
                i4++;
                rVar = rVar.f4605f;
            } else {
                throw new AssertionError("s.limit == s.pos");
            }
        }
        this.f4610f = new byte[i4][];
        this.f4611g = new int[(i4 * 2)];
        r rVar2 = eVar.f4578a;
        int i7 = 0;
        while (i2 < i) {
            byte[][] bArr = this.f4610f;
            bArr[i7] = rVar2.f4601a;
            int i8 = rVar2.f4603c;
            int i9 = rVar2.f4602b;
            int i10 = (i8 - i9) + i2;
            if (i10 > i) {
                i2 = i;
            } else {
                i2 = i10;
            }
            int[] iArr = this.f4611g;
            iArr[i7] = i2;
            iArr[bArr.length + i7] = i9;
            rVar2.f4604d = true;
            i7++;
            rVar2 = rVar2.f4605f;
        }
    }

    public final String a() {
        throw null;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof h) {
            h hVar = (h) obj;
            if (hVar.l() != l() || !k(hVar, l())) {
                return false;
            }
            return true;
        }
        return false;
    }

    public final boolean j(int i, byte[] bArr, int i2, int i3) {
        int i4;
        if (i < 0 || i > l() - i3 || i2 < 0 || i2 > bArr.length - i3) {
            return false;
        }
        int q2 = q(i);
        while (i3 > 0) {
            int[] iArr = this.f4611g;
            if (q2 == 0) {
                i4 = 0;
            } else {
                i4 = iArr[q2 - 1];
            }
            int min = Math.min(i3, ((iArr[q2] - i4) + i4) - i);
            byte[][] bArr2 = this.f4610f;
            int i5 = (i - i4) + iArr[bArr2.length + q2];
            byte[] bArr3 = bArr2[q2];
            Charset charset = y.f4616a;
            for (int i6 = 0; i6 < min; i6++) {
                if (bArr3[i6 + i5] != bArr[i6 + i2]) {
                    return false;
                }
            }
            i += min;
            i2 += min;
            i3 -= min;
            q2++;
        }
        return true;
    }

    public final byte g(int i) {
        int i2;
        byte[][] bArr = this.f4610f;
        int[] iArr = this.f4611g;
        y.a((long) iArr[bArr.length - 1], (long) i, 1);
        int q2 = q(i);
        if (q2 == 0) {
            i2 = 0;
        } else {
            i2 = iArr[q2 - 1];
        }
        return bArr[q2][(i - i2) + iArr[bArr.length + q2]];
    }

    public final int hashCode() {
        int i = this.f4582b;
        if (i != 0) {
            return i;
        }
        byte[][] bArr = this.f4610f;
        int length = bArr.length;
        int i2 = 0;
        int i3 = 0;
        int i4 = 1;
        while (i2 < length) {
            byte[] bArr2 = bArr[i2];
            int[] iArr = this.f4611g;
            int i5 = iArr[length + i2];
            int i6 = iArr[i2];
            int i7 = (i6 - i3) + i5;
            while (i5 < i7) {
                i4 = (i4 * 31) + bArr2[i5];
                i5++;
            }
            i2++;
            i3 = i6;
        }
        this.f4582b = i4;
        return i4;
    }

    public final int l() {
        return this.f4611g[this.f4610f.length - 1];
    }

    public final void p(e eVar) {
        byte[][] bArr = this.f4610f;
        int length = bArr.length;
        int i = 0;
        int i2 = 0;
        while (i < length) {
            int[] iArr = this.f4611g;
            int i3 = iArr[length + i];
            int i4 = iArr[i];
            r rVar = new r(bArr[i], i3, (i3 + i4) - i2);
            r rVar2 = eVar.f4578a;
            if (rVar2 == null) {
                rVar.f4606g = rVar;
                rVar.f4605f = rVar;
                eVar.f4578a = rVar;
            } else {
                rVar2.f4606g.b(rVar);
            }
            i++;
            i2 = i4;
        }
        eVar.f4579b += (long) i2;
    }

    public final int q(int i) {
        int binarySearch = Arrays.binarySearch(this.f4611g, 0, this.f4610f.length, i + 1);
        if (binarySearch >= 0) {
            return binarySearch;
        }
        return ~binarySearch;
    }

    public final h r() {
        byte[][] bArr = this.f4610f;
        int[] iArr = this.f4611g;
        byte[] bArr2 = new byte[iArr[bArr.length - 1]];
        int length = bArr.length;
        int i = 0;
        int i2 = 0;
        while (i < length) {
            int i3 = iArr[length + i];
            int i4 = iArr[i];
            System.arraycopy(bArr[i], i3, bArr2, i2, i4 - i2);
            i++;
            i2 = i4;
        }
        return new h(bArr2);
    }

    public final String h() {
        return r().h();
    }

    public final boolean k(h hVar, int i) {
        int i2;
        if (l() - i < 0) {
            return false;
        }
        int q2 = q(0);
        int i3 = 0;
        int i4 = 0;
        while (i > 0) {
            int[] iArr = this.f4611g;
            if (q2 == 0) {
                i2 = 0;
            } else {
                i2 = iArr[q2 - 1];
            }
            int min = Math.min(i, ((iArr[q2] - i2) + i2) - i3);
            byte[][] bArr = this.f4610f;
            if (!hVar.j(i4, bArr[q2], (i3 - i2) + iArr[bArr.length + q2], min)) {
                return false;
            }
            i3 += min;
            i4 += min;
            i -= min;
            q2++;
        }
        return true;
    }

    public final h m() {
        return r().m();
    }

    public final h n() {
        return r().n();
    }

    public final String o() {
        return r().o();
    }

    public final String toString() {
        return r().toString();
    }
}
