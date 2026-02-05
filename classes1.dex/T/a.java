package T;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    public int f890a;

    /* renamed from: b  reason: collision with root package name */
    public int f891b;

    /* renamed from: c  reason: collision with root package name */
    public float f892c;

    /* renamed from: d  reason: collision with root package name */
    public float f893d;
    public long e;

    /* renamed from: f  reason: collision with root package name */
    public long f894f;

    /* renamed from: g  reason: collision with root package name */
    public long f895g;

    /* renamed from: h  reason: collision with root package name */
    public float f896h;
    public int i;

    public final float a(long j2) {
        long j3 = this.e;
        if (j2 < j3) {
            return 0.0f;
        }
        long j4 = this.f895g;
        if (j4 < 0 || j2 < j4) {
            return g.b(((float) (j2 - j3)) / ((float) this.f890a), 0.0f, 1.0f) * 0.5f;
        }
        float f2 = this.f896h;
        return (g.b(((float) (j2 - j4)) / ((float) this.i), 0.0f, 1.0f) * f2) + (1.0f - f2);
    }
}
