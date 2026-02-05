package y;

import java.util.Arrays;

public final class h {

    /* renamed from: a  reason: collision with root package name */
    public int[] f5027a;

    /* renamed from: b  reason: collision with root package name */
    public int[] f5028b;

    /* renamed from: c  reason: collision with root package name */
    public int f5029c;

    /* renamed from: d  reason: collision with root package name */
    public int[] f5030d;
    public float[] e;

    /* renamed from: f  reason: collision with root package name */
    public int f5031f;

    /* renamed from: g  reason: collision with root package name */
    public int[] f5032g;

    /* renamed from: h  reason: collision with root package name */
    public String[] f5033h;
    public int i;

    /* renamed from: j  reason: collision with root package name */
    public int[] f5034j;

    /* renamed from: k  reason: collision with root package name */
    public boolean[] f5035k;

    /* renamed from: l  reason: collision with root package name */
    public int f5036l;

    public final void a(int i2, float f2) {
        int i3 = this.f5031f;
        int[] iArr = this.f5030d;
        if (i3 >= iArr.length) {
            this.f5030d = Arrays.copyOf(iArr, iArr.length * 2);
            float[] fArr = this.e;
            this.e = Arrays.copyOf(fArr, fArr.length * 2);
        }
        int[] iArr2 = this.f5030d;
        int i4 = this.f5031f;
        iArr2[i4] = i2;
        float[] fArr2 = this.e;
        this.f5031f = i4 + 1;
        fArr2[i4] = f2;
    }

    public final void b(int i2, int i3) {
        int i4 = this.f5029c;
        int[] iArr = this.f5027a;
        if (i4 >= iArr.length) {
            this.f5027a = Arrays.copyOf(iArr, iArr.length * 2);
            int[] iArr2 = this.f5028b;
            this.f5028b = Arrays.copyOf(iArr2, iArr2.length * 2);
        }
        int[] iArr3 = this.f5027a;
        int i5 = this.f5029c;
        iArr3[i5] = i2;
        int[] iArr4 = this.f5028b;
        this.f5029c = i5 + 1;
        iArr4[i5] = i3;
    }

    public final void c(int i2, boolean z2) {
        int i3 = this.f5036l;
        int[] iArr = this.f5034j;
        if (i3 >= iArr.length) {
            this.f5034j = Arrays.copyOf(iArr, iArr.length * 2);
            boolean[] zArr = this.f5035k;
            this.f5035k = Arrays.copyOf(zArr, zArr.length * 2);
        }
        int[] iArr2 = this.f5034j;
        int i4 = this.f5036l;
        iArr2[i4] = i2;
        boolean[] zArr2 = this.f5035k;
        this.f5036l = i4 + 1;
        zArr2[i4] = z2;
    }

    public final void d(String str, int i2) {
        int i3 = this.i;
        int[] iArr = this.f5032g;
        if (i3 >= iArr.length) {
            this.f5032g = Arrays.copyOf(iArr, iArr.length * 2);
            String[] strArr = this.f5033h;
            this.f5033h = (String[]) Arrays.copyOf(strArr, strArr.length * 2);
        }
        int[] iArr2 = this.f5032g;
        int i4 = this.i;
        iArr2[i4] = i2;
        String[] strArr2 = this.f5033h;
        this.i = i4 + 1;
        strArr2[i4] = str;
    }
}
