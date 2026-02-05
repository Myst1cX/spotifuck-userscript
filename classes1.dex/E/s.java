package E;

public final class s {

    /* renamed from: k  reason: collision with root package name */
    public static final s f124k;

    /* renamed from: a  reason: collision with root package name */
    public final float f125a;

    /* renamed from: b  reason: collision with root package name */
    public final float f126b;

    /* renamed from: c  reason: collision with root package name */
    public final float f127c;

    /* renamed from: d  reason: collision with root package name */
    public final float f128d;
    public final float e;

    /* renamed from: f  reason: collision with root package name */
    public final float f129f;

    /* renamed from: g  reason: collision with root package name */
    public final float[] f130g;

    /* renamed from: h  reason: collision with root package name */
    public final float f131h;
    public final float i;

    /* renamed from: j  reason: collision with root package name */
    public final float f132j;

    static {
        float f2;
        float[] fArr = b.f88c;
        float o2 = (float) ((((double) b.o()) * 63.66197723675813d) / 100.0d);
        float[][] fArr2 = b.f86a;
        float f3 = fArr[0];
        float[] fArr3 = fArr2[0];
        float f4 = fArr[1];
        float f5 = (fArr3[1] * f4) + (fArr3[0] * f3);
        float f6 = fArr[2];
        float f7 = (fArr3[2] * f6) + f5;
        float[] fArr4 = fArr2[1];
        float f8 = fArr4[1] * f4;
        float f9 = (fArr4[2] * f6) + f8 + (fArr4[0] * f3);
        float[] fArr5 = fArr2[2];
        float f10 = f3 * fArr5[0];
        float f11 = (f6 * fArr5[2]) + (f4 * fArr5[1]) + f10;
        if (((double) 1.0f) >= 0.9d) {
            f2 = 0.69f;
        } else {
            f2 = 0.655f;
        }
        float exp = (1.0f - (((float) Math.exp((double) (((-o2) - 42.0f) / 92.0f))) * 0.2777778f)) * 1.0f;
        double d2 = (double) exp;
        if (d2 > 1.0d) {
            exp = 1.0f;
        } else if (d2 < 0.0d) {
            exp = 0.0f;
        }
        float[] fArr6 = {(((100.0f / f7) * exp) + 1.0f) - exp, (((100.0f / f9) * exp) + 1.0f) - exp, (((100.0f / f11) * exp) + 1.0f) - exp};
        float f12 = 1.0f / ((5.0f * o2) + 1.0f);
        float f13 = f12 * f12 * f12 * f12;
        float f14 = 1.0f - f13;
        float cbrt = (0.1f * f14 * f14 * ((float) Math.cbrt(((double) o2) * 5.0d))) + (f13 * o2);
        float o3 = b.o() / fArr[1];
        double d3 = (double) o3;
        float f15 = f9;
        float sqrt = ((float) Math.sqrt(d3)) + 1.48f;
        float pow = 0.725f / ((float) Math.pow(d3, 0.2d));
        float[] fArr7 = {(float) Math.pow(((double) ((fArr6[0] * cbrt) * f7)) / 100.0d, 0.42d), (float) Math.pow(((double) ((fArr6[1] * cbrt) * f15)) / 100.0d, 0.42d), (float) Math.pow(((double) ((fArr6[2] * cbrt) * f11)) / 100.0d, 0.42d)};
        float f16 = fArr7[0];
        float f17 = (f16 * 400.0f) / (f16 + 27.13f);
        float f18 = fArr7[1];
        float f19 = (f18 * 400.0f) / (f18 + 27.13f);
        float f20 = fArr7[2];
        float[] fArr8 = {f17, f19, (400.0f * f20) / (f20 + 27.13f)};
        float f21 = o3;
        f124k = new s(f21, ((fArr8[2] * 0.05f) + (fArr8[0] * 2.0f) + fArr8[1]) * pow, pow, pow, f2, 1.0f, fArr6, cbrt, (float) Math.pow((double) cbrt, 0.25d), sqrt);
    }

    public s(float f2, float f3, float f4, float f5, float f6, float f7, float[] fArr, float f8, float f9, float f10) {
        this.f129f = f2;
        this.f125a = f3;
        this.f126b = f4;
        this.f127c = f5;
        this.f128d = f6;
        this.e = f7;
        this.f130g = fArr;
        this.f131h = f8;
        this.i = f9;
        this.f132j = f10;
    }
}
