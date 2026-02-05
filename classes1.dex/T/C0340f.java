package t;

import java.util.Arrays;

/* renamed from: t.f  reason: case insensitive filesystem */
public final class C0340f implements Comparable {

    /* renamed from: a  reason: collision with root package name */
    public boolean f4667a;

    /* renamed from: b  reason: collision with root package name */
    public int f4668b = -1;

    /* renamed from: c  reason: collision with root package name */
    public int f4669c = -1;

    /* renamed from: d  reason: collision with root package name */
    public int f4670d = 0;
    public float e;

    /* renamed from: f  reason: collision with root package name */
    public boolean f4671f = false;

    /* renamed from: g  reason: collision with root package name */
    public final float[] f4672g = new float[9];

    /* renamed from: h  reason: collision with root package name */
    public final float[] f4673h = new float[9];
    public C0336b[] i = new C0336b[16];

    /* renamed from: j  reason: collision with root package name */
    public int f4674j = 0;

    /* renamed from: k  reason: collision with root package name */
    public int f4675k = 0;

    /* renamed from: l  reason: collision with root package name */
    public int f4676l;

    public final void a(C0336b bVar) {
        int i2 = 0;
        while (true) {
            int i3 = this.f4674j;
            if (i2 >= i3) {
                C0336b[] bVarArr = this.i;
                if (i3 >= bVarArr.length) {
                    this.i = (C0336b[]) Arrays.copyOf(bVarArr, bVarArr.length * 2);
                }
                C0336b[] bVarArr2 = this.i;
                int i4 = this.f4674j;
                bVarArr2[i4] = bVar;
                this.f4674j = i4 + 1;
                return;
            } else if (this.i[i2] != bVar) {
                i2++;
            } else {
                return;
            }
        }
    }

    public final void c() {
        this.f4676l = 5;
        this.f4670d = 0;
        this.f4668b = -1;
        this.f4669c = -1;
        this.e = 0.0f;
        this.f4671f = false;
        int i2 = this.f4674j;
        for (int i3 = 0; i3 < i2; i3++) {
            this.i[i3] = null;
        }
        this.f4674j = 0;
        this.f4675k = 0;
        this.f4667a = false;
        Arrays.fill(this.f4673h, 0.0f);
    }

    public final void b(C0336b bVar) {
        int i2 = this.f4674j;
        int i3 = 0;
        while (i3 < i2) {
            if (this.i[i3] == bVar) {
                while (i3 < i2 - 1) {
                    C0336b[] bVarArr = this.i;
                    int i4 = i3 + 1;
                    bVarArr[i3] = bVarArr[i4];
                    i3 = i4;
                }
                this.f4674j--;
                return;
            }
            i3++;
        }
    }

    public final int compareTo(Object obj) {
        return this.f4668b - ((C0340f) obj).f4668b;
    }

    public final void d(C0337c cVar, float f2) {
        this.e = f2;
        this.f4671f = true;
        int i2 = this.f4674j;
        this.f4669c = -1;
        for (int i3 = 0; i3 < i2; i3++) {
            this.i[i3].h(cVar, this, false);
        }
        this.f4674j = 0;
    }

    public final void e(C0337c cVar, C0336b bVar) {
        int i2 = this.f4674j;
        for (int i3 = 0; i3 < i2; i3++) {
            this.i[i3].i(cVar, bVar, false);
        }
        this.f4674j = 0;
    }

    public final String toString() {
        return "" + this.f4668b;
    }

    public C0340f(int i2) {
        this.f4676l = i2;
    }
}
