package J0;

import android.graphics.Paint;
import android.graphics.Path;

public final class a {
    public static final int[] i = new int[3];

    /* renamed from: j  reason: collision with root package name */
    public static final float[] f300j = {0.0f, 0.5f, 1.0f};

    /* renamed from: k  reason: collision with root package name */
    public static final int[] f301k = new int[4];

    /* renamed from: l  reason: collision with root package name */
    public static final float[] f302l = {0.0f, 0.0f, 0.5f, 1.0f};

    /* renamed from: a  reason: collision with root package name */
    public final Paint f303a;

    /* renamed from: b  reason: collision with root package name */
    public final Paint f304b;

    /* renamed from: c  reason: collision with root package name */
    public final Paint f305c;

    /* renamed from: d  reason: collision with root package name */
    public final int f306d;
    public final int e;

    /* renamed from: f  reason: collision with root package name */
    public final int f307f;

    /* renamed from: g  reason: collision with root package name */
    public final Path f308g = new Path();

    /* renamed from: h  reason: collision with root package name */
    public final Paint f309h;

    public a() {
        Paint paint = new Paint();
        this.f309h = paint;
        Paint paint2 = new Paint();
        this.f303a = paint2;
        this.f306d = F.a.d(-16777216, 68);
        this.e = F.a.d(-16777216, 20);
        this.f307f = F.a.d(-16777216, 0);
        paint2.setColor(this.f306d);
        paint.setColor(0);
        Paint paint3 = new Paint(4);
        this.f304b = paint3;
        paint3.setStyle(Paint.Style.FILL);
        this.f305c = new Paint(paint3);
    }
}
