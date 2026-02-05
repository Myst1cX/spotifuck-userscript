package Q0;

import java.io.PrintWriter;

public final class D {

    /* renamed from: a  reason: collision with root package name */
    public final int f770a;

    /* renamed from: b  reason: collision with root package name */
    public final int f771b;

    /* renamed from: c  reason: collision with root package name */
    public final long f772c;

    /* renamed from: d  reason: collision with root package name */
    public final long f773d;
    public final long e;

    /* renamed from: f  reason: collision with root package name */
    public final long f774f;

    /* renamed from: g  reason: collision with root package name */
    public final long f775g;

    /* renamed from: h  reason: collision with root package name */
    public final long f776h;
    public final long i;

    /* renamed from: j  reason: collision with root package name */
    public final long f777j;

    /* renamed from: k  reason: collision with root package name */
    public final int f778k;

    /* renamed from: l  reason: collision with root package name */
    public final int f779l;

    /* renamed from: m  reason: collision with root package name */
    public final int f780m;

    /* renamed from: n  reason: collision with root package name */
    public final long f781n;

    public D(int i2, int i3, long j2, long j3, long j4, long j5, long j6, long j7, long j8, long j9, int i4, int i5, int i6, long j10) {
        this.f770a = i2;
        this.f771b = i3;
        this.f772c = j2;
        this.f773d = j3;
        this.e = j4;
        this.f774f = j5;
        this.f775g = j6;
        this.f776h = j7;
        this.i = j8;
        this.f777j = j9;
        this.f778k = i4;
        this.f779l = i5;
        this.f780m = i6;
        this.f781n = j10;
    }

    public final void a(PrintWriter printWriter) {
        printWriter.println("===============BEGIN PICASSO STATS ===============");
        printWriter.println("Memory Cache Stats");
        printWriter.print("  Max Cache Size: ");
        int i2 = this.f770a;
        printWriter.println(i2);
        printWriter.print("  Cache Size: ");
        int i3 = this.f771b;
        printWriter.println(i3);
        printWriter.print("  Cache % Full: ");
        printWriter.println((int) Math.ceil((double) ((((float) i3) / ((float) i2)) * 100.0f)));
        printWriter.print("  Cache Hits: ");
        printWriter.println(this.f772c);
        printWriter.print("  Cache Misses: ");
        printWriter.println(this.f773d);
        printWriter.println("Network Stats");
        printWriter.print("  Download Count: ");
        printWriter.println(this.f778k);
        printWriter.print("  Total Download Size: ");
        printWriter.println(this.e);
        printWriter.print("  Average Download Size: ");
        printWriter.println(this.f776h);
        printWriter.println("Bitmap Stats");
        printWriter.print("  Total Bitmaps Decoded: ");
        printWriter.println(this.f779l);
        printWriter.print("  Total Bitmap Size: ");
        printWriter.println(this.f774f);
        printWriter.print("  Total Transformed Bitmaps: ");
        printWriter.println(this.f780m);
        printWriter.print("  Total Transformed Bitmap Size: ");
        printWriter.println(this.f775g);
        printWriter.print("  Average Bitmap Size: ");
        printWriter.println(this.i);
        printWriter.print("  Average Transformed Bitmap Size: ");
        printWriter.println(this.f777j);
        printWriter.println("===============END PICASSO STATS ===============");
        printWriter.flush();
    }

    public final String toString() {
        return "StatsSnapshot{maxSize=" + this.f770a + ", size=" + this.f771b + ", cacheHits=" + this.f772c + ", cacheMisses=" + this.f773d + ", downloadCount=" + this.f778k + ", totalDownloadSize=" + this.e + ", averageDownloadSize=" + this.f776h + ", totalOriginalBitmapSize=" + this.f774f + ", totalTransformedBitmapSize=" + this.f775g + ", averageOriginalBitmapSize=" + this.i + ", averageTransformedBitmapSize=" + this.f777j + ", originalBitmapCount=" + this.f779l + ", transformedBitmapCount=" + this.f780m + ", timeStamp=" + this.f781n + '}';
    }
}
