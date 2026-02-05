package h;

public final class J {

    /* renamed from: d  reason: collision with root package name */
    public static J f2912d;

    /* renamed from: a  reason: collision with root package name */
    public long f2913a;

    /* renamed from: b  reason: collision with root package name */
    public long f2914b;

    /* renamed from: c  reason: collision with root package name */
    public int f2915c;

    public final void a(long j2, double d2, double d3) {
        float f2 = ((float) (j2 - 946728000000L)) / 8.64E7f;
        float f3 = (0.01720197f * f2) + 6.24006f;
        double d4 = (double) f3;
        double sin = (Math.sin((double) (f3 * 3.0f)) * 5.236000106378924E-6d) + (Math.sin((double) (2.0f * f3)) * 3.4906598739326E-4d) + (Math.sin(d4) * 0.03341960161924362d) + d4 + 1.796593063d + 3.141592653589793d;
        double d5 = (-d3) / 360.0d;
        double sin2 = (Math.sin(2.0d * sin) * -0.0069d) + (Math.sin(d4) * 0.0053d) + ((double) (((float) Math.round(((double) (f2 - 9.0E-4f)) - d5)) + 9.0E-4f)) + d5;
        double asin = Math.asin(Math.sin(0.4092797040939331d) * Math.sin(sin));
        double d6 = 0.01745329238474369d * d2;
        double sin3 = (Math.sin(-0.10471975803375244d) - (Math.sin(asin) * Math.sin(d6))) / (Math.cos(asin) * Math.cos(d6));
        if (sin3 >= 1.0d) {
            this.f2915c = 1;
            this.f2913a = -1;
            this.f2914b = -1;
        } else if (sin3 <= -1.0d) {
            this.f2915c = 0;
            this.f2913a = -1;
            this.f2914b = -1;
        } else {
            double acos = (double) ((float) (Math.acos(sin3) / 6.283185307179586d));
            this.f2913a = Math.round((sin2 + acos) * 8.64E7d) + 946728000000L;
            long round = Math.round((sin2 - acos) * 8.64E7d) + 946728000000L;
            this.f2914b = round;
            if (round >= j2 || this.f2913a <= j2) {
                this.f2915c = 1;
            } else {
                this.f2915c = 0;
            }
        }
    }
}
