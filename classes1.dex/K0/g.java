package K0;

import A.b;
import C0.d;
import J0.a;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Region;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Looper;
import android.util.AttributeSet;
import android.util.Log;
import java.util.BitSet;
import java.util.Objects;
import p0.C0320a;

public class g extends Drawable implements G.g, v {

    /* renamed from: B  reason: collision with root package name */
    public static final Paint f372B;

    /* renamed from: A  reason: collision with root package name */
    public final boolean f373A;

    /* renamed from: f  reason: collision with root package name */
    public f f374f;

    /* renamed from: g  reason: collision with root package name */
    public final t[] f375g;

    /* renamed from: h  reason: collision with root package name */
    public final t[] f376h;
    public final BitSet i;

    /* renamed from: j  reason: collision with root package name */
    public boolean f377j;

    /* renamed from: k  reason: collision with root package name */
    public final Matrix f378k;

    /* renamed from: l  reason: collision with root package name */
    public final Path f379l;

    /* renamed from: m  reason: collision with root package name */
    public final Path f380m;

    /* renamed from: n  reason: collision with root package name */
    public final RectF f381n;

    /* renamed from: o  reason: collision with root package name */
    public final RectF f382o;

    /* renamed from: p  reason: collision with root package name */
    public final Region f383p;

    /* renamed from: q  reason: collision with root package name */
    public final Region f384q;

    /* renamed from: r  reason: collision with root package name */
    public k f385r;

    /* renamed from: s  reason: collision with root package name */
    public final Paint f386s;

    /* renamed from: t  reason: collision with root package name */
    public final Paint f387t;

    /* renamed from: u  reason: collision with root package name */
    public final a f388u;

    /* renamed from: v  reason: collision with root package name */
    public final b f389v;

    /* renamed from: w  reason: collision with root package name */
    public final m f390w;

    /* renamed from: x  reason: collision with root package name */
    public PorterDuffColorFilter f391x;

    /* renamed from: y  reason: collision with root package name */
    public PorterDuffColorFilter f392y;

    /* renamed from: z  reason: collision with root package name */
    public final RectF f393z;

    public g() {
        this(new k());
    }

    public int getOpacity() {
        return -3;
    }

    public final void invalidateSelf() {
        this.f377j = true;
        super.invalidateSelf();
    }

    public final void onBoundsChange(Rect rect) {
        this.f377j = true;
        super.onBoundsChange(rect);
    }

    static {
        Paint paint = new Paint(1);
        f372B = paint;
        paint.setColor(-1);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
    }

    public g(Context context, AttributeSet attributeSet, int i2, int i3) {
        this(k.b(context, attributeSet, i2, i3).a());
    }

    public final void a(RectF rectF, Path path) {
        f fVar = this.f374f;
        this.f390w.a(fVar.f358a, fVar.i, rectF, this.f389v, path);
        if (this.f374f.f364h != 1.0f) {
            Matrix matrix = this.f378k;
            matrix.reset();
            float f2 = this.f374f.f364h;
            matrix.setScale(f2, f2, rectF.width() / 2.0f, rectF.height() / 2.0f);
            path.transform(matrix);
        }
        path.computeBounds(this.f393z, true);
    }

    public final int b(int i2) {
        float f2;
        int i3;
        f fVar = this.f374f;
        float f3 = fVar.f368m + 0.0f + fVar.f367l;
        D0.a aVar = fVar.f359b;
        if (aVar == null || !aVar.f77a || F.a.d(i2, 255) != aVar.f80d) {
            return i2;
        }
        float f4 = aVar.e;
        if (f4 <= 0.0f || f3 <= 0.0f) {
            f2 = 0.0f;
        } else {
            f2 = Math.min(((((float) Math.log1p((double) (f3 / f4))) * 4.5f) + 2.0f) / 100.0f, 1.0f);
        }
        int alpha = Color.alpha(i2);
        int h02 = C0320a.h0(F.a.d(i2, 255), aVar.f78b, f2);
        if (f2 > 0.0f && (i3 = aVar.f79c) != 0) {
            h02 = F.a.b(F.a.d(i3, D0.a.f76f), h02);
        }
        return F.a.d(h02, alpha);
    }

    public final void c(Canvas canvas) {
        if (this.i.cardinality() > 0) {
            Log.w("g", "Compatibility shadow requested but can't be drawn for all operations in this shape.");
        }
        int i2 = this.f374f.f370o;
        Path path = this.f379l;
        a aVar = this.f388u;
        if (i2 != 0) {
            canvas.drawPath(path, aVar.f303a);
        }
        for (int i3 = 0; i3 < 4; i3++) {
            t tVar = this.f375g[i3];
            int i4 = this.f374f.f369n;
            Matrix matrix = t.f440b;
            tVar.a(matrix, aVar, i4, canvas);
            this.f376h[i3].a(matrix, aVar, this.f374f.f369n, canvas);
        }
        if (this.f373A) {
            double d2 = (double) 0;
            int sin = (int) (Math.sin(Math.toRadians(d2)) * ((double) this.f374f.f370o));
            int cos = (int) (Math.cos(Math.toRadians(d2)) * ((double) this.f374f.f370o));
            canvas.translate((float) (-sin), (float) (-cos));
            canvas.drawPath(path, f372B);
            canvas.translate((float) sin, (float) cos);
        }
    }

    public void draw(Canvas canvas) {
        float f2;
        Canvas canvas2 = canvas;
        Paint paint = this.f386s;
        paint.setColorFilter(this.f391x);
        int alpha = paint.getAlpha();
        int i2 = this.f374f.f366k;
        paint.setAlpha(((i2 + (i2 >>> 7)) * alpha) >>> 8);
        Paint paint2 = this.f387t;
        paint2.setColorFilter(this.f392y);
        paint2.setStrokeWidth(this.f374f.f365j);
        int alpha2 = paint2.getAlpha();
        int i3 = this.f374f.f366k;
        paint2.setAlpha(((i3 + (i3 >>> 7)) * alpha2) >>> 8);
        boolean z2 = this.f377j;
        Path path = this.f379l;
        if (z2) {
            float f3 = 0.0f;
            if (g()) {
                f2 = paint2.getStrokeWidth() / 2.0f;
            } else {
                f2 = 0.0f;
            }
            float f4 = -f2;
            k kVar = this.f374f.f358a;
            j e = kVar.e();
            c cVar = kVar.e;
            if (!(cVar instanceof h)) {
                cVar = new b(f4, cVar);
            }
            e.e = cVar;
            c cVar2 = kVar.f409f;
            if (!(cVar2 instanceof h)) {
                cVar2 = new b(f4, cVar2);
            }
            e.f399f = cVar2;
            c cVar3 = kVar.f411h;
            if (!(cVar3 instanceof h)) {
                cVar3 = new b(f4, cVar3);
            }
            e.f401h = cVar3;
            c cVar4 = kVar.f410g;
            if (!(cVar4 instanceof h)) {
                cVar4 = new b(f4, cVar4);
            }
            e.f400g = cVar4;
            k a2 = e.a();
            this.f385r = a2;
            float f5 = this.f374f.i;
            RectF rectF = this.f382o;
            rectF.set(f());
            if (g()) {
                f3 = paint2.getStrokeWidth() / 2.0f;
            }
            rectF.inset(f3, f3);
            this.f390w.a(a2, f5, rectF, (b) null, this.f380m);
            a(f(), path);
            this.f377j = false;
        }
        f fVar = this.f374f;
        fVar.getClass();
        if (fVar.f369n > 0) {
            int i4 = Build.VERSION.SDK_INT;
            if (!this.f374f.f358a.d(f()) && !path.isConvex() && i4 < 29) {
                canvas.save();
                double d2 = (double) 0;
                canvas2.translate((float) ((int) (Math.sin(Math.toRadians(d2)) * ((double) this.f374f.f370o))), (float) ((int) (Math.cos(Math.toRadians(d2)) * ((double) this.f374f.f370o))));
                if (!this.f373A) {
                    c(canvas);
                    canvas.restore();
                } else {
                    RectF rectF2 = this.f393z;
                    int width = (int) (rectF2.width() - ((float) getBounds().width()));
                    int height = (int) (rectF2.height() - ((float) getBounds().height()));
                    if (width < 0 || height < 0) {
                        throw new IllegalStateException("Invalid shadow bounds. Check that the treatments result in a valid path.");
                    }
                    Bitmap createBitmap = Bitmap.createBitmap((this.f374f.f369n * 2) + ((int) rectF2.width()) + width, (this.f374f.f369n * 2) + ((int) rectF2.height()) + height, Bitmap.Config.ARGB_8888);
                    Canvas canvas3 = new Canvas(createBitmap);
                    float f6 = (float) ((getBounds().left - this.f374f.f369n) - width);
                    float f7 = (float) ((getBounds().top - this.f374f.f369n) - height);
                    canvas3.translate(-f6, -f7);
                    c(canvas3);
                    canvas2.drawBitmap(createBitmap, f6, f7, (Paint) null);
                    createBitmap.recycle();
                    canvas.restore();
                }
            }
        }
        f fVar2 = this.f374f;
        Paint.Style style = fVar2.f371p;
        if (style == Paint.Style.FILL_AND_STROKE || style == Paint.Style.FILL) {
            d(canvas, paint, path, fVar2.f358a, f());
        }
        if (g()) {
            e(canvas);
        }
        paint.setAlpha(alpha);
        paint2.setAlpha(alpha2);
    }

    public void e(Canvas canvas) {
        float f2;
        Paint paint = this.f387t;
        Path path = this.f380m;
        k kVar = this.f385r;
        RectF rectF = this.f382o;
        rectF.set(f());
        if (g()) {
            f2 = paint.getStrokeWidth() / 2.0f;
        } else {
            f2 = 0.0f;
        }
        rectF.inset(f2, f2);
        d(canvas, paint, path, kVar, rectF);
    }

    public final RectF f() {
        RectF rectF = this.f381n;
        rectF.set(getBounds());
        return rectF;
    }

    public final boolean g() {
        Paint.Style style = this.f374f.f371p;
        if ((style == Paint.Style.FILL_AND_STROKE || style == Paint.Style.STROKE) && this.f387t.getStrokeWidth() > 0.0f) {
            return true;
        }
        return false;
    }

    public int getAlpha() {
        return this.f374f.f366k;
    }

    public final Drawable.ConstantState getConstantState() {
        return this.f374f;
    }

    public void getOutline(Outline outline) {
        this.f374f.getClass();
        if (this.f374f.f358a.d(f())) {
            outline.setRoundRect(getBounds(), this.f374f.f358a.e.a(f()) * this.f374f.i);
            return;
        }
        RectF f2 = f();
        Path path = this.f379l;
        a(f2, path);
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 30) {
            d.a(outline, path);
        } else if (i2 >= 29) {
            try {
                C0.b.a(outline, path);
            } catch (IllegalArgumentException unused) {
            }
        } else if (path.isConvex()) {
            C0.b.a(outline, path);
        }
    }

    public final boolean getPadding(Rect rect) {
        Rect rect2 = this.f374f.f363g;
        if (rect2 == null) {
            return super.getPadding(rect);
        }
        rect.set(rect2);
        return true;
    }

    public final void h(Context context) {
        this.f374f.f359b = new D0.a(context);
        m();
    }

    public final void i(float f2) {
        f fVar = this.f374f;
        if (fVar.f368m != f2) {
            fVar.f368m = f2;
            m();
        }
    }

    public final void j(ColorStateList colorStateList) {
        f fVar = this.f374f;
        if (fVar.f360c != colorStateList) {
            fVar.f360c = colorStateList;
            onStateChange(getState());
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0007, code lost:
        r0 = r5.f386s;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0023, code lost:
        r2 = r5.f387t;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean k(int[] r6) {
        /*
            r5 = this;
            K0.f r0 = r5.f374f
            android.content.res.ColorStateList r0 = r0.f360c
            r1 = 1
            if (r0 == 0) goto L_0x001c
            android.graphics.Paint r0 = r5.f386s
            int r2 = r0.getColor()
            K0.f r3 = r5.f374f
            android.content.res.ColorStateList r3 = r3.f360c
            int r3 = r3.getColorForState(r6, r2)
            if (r2 == r3) goto L_0x001c
            r0.setColor(r3)
            r0 = 1
            goto L_0x001d
        L_0x001c:
            r0 = 0
        L_0x001d:
            K0.f r2 = r5.f374f
            android.content.res.ColorStateList r2 = r2.f361d
            if (r2 == 0) goto L_0x0037
            android.graphics.Paint r2 = r5.f387t
            int r3 = r2.getColor()
            K0.f r4 = r5.f374f
            android.content.res.ColorStateList r4 = r4.f361d
            int r6 = r4.getColorForState(r6, r3)
            if (r3 == r6) goto L_0x0037
            r2.setColor(r6)
            goto L_0x0038
        L_0x0037:
            r1 = r0
        L_0x0038:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: K0.g.k(int[]):boolean");
    }

    public final boolean l() {
        PorterDuffColorFilter porterDuffColorFilter;
        PorterDuffColorFilter porterDuffColorFilter2;
        PorterDuffColorFilter porterDuffColorFilter3 = this.f391x;
        PorterDuffColorFilter porterDuffColorFilter4 = this.f392y;
        f fVar = this.f374f;
        ColorStateList colorStateList = fVar.e;
        PorterDuff.Mode mode = fVar.f362f;
        Paint paint = this.f386s;
        if (colorStateList == null || mode == null) {
            int color = paint.getColor();
            int b2 = b(color);
            if (b2 != color) {
                porterDuffColorFilter2 = new PorterDuffColorFilter(b2, PorterDuff.Mode.SRC_IN);
            } else {
                porterDuffColorFilter2 = null;
            }
            porterDuffColorFilter = porterDuffColorFilter2;
        } else {
            porterDuffColorFilter = new PorterDuffColorFilter(b(colorStateList.getColorForState(getState(), 0)), mode);
        }
        this.f391x = porterDuffColorFilter;
        this.f374f.getClass();
        this.f392y = null;
        this.f374f.getClass();
        if (!Objects.equals(porterDuffColorFilter3, this.f391x) || !Objects.equals(porterDuffColorFilter4, this.f392y)) {
            return true;
        }
        return false;
    }

    public final void m() {
        f fVar = this.f374f;
        float f2 = fVar.f368m + 0.0f;
        fVar.f369n = (int) Math.ceil((double) (0.75f * f2));
        this.f374f.f370o = (int) Math.ceil((double) (f2 * 0.25f));
        l();
        super.invalidateSelf();
    }

    public Drawable mutate() {
        this.f374f = new f(this.f374f);
        return this;
    }

    public void setAlpha(int i2) {
        f fVar = this.f374f;
        if (fVar.f366k != i2) {
            fVar.f366k = i2;
            super.invalidateSelf();
        }
    }

    public void setColorFilter(ColorFilter colorFilter) {
        this.f374f.getClass();
        super.invalidateSelf();
    }

    public final void setShapeAppearanceModel(k kVar) {
        this.f374f.f358a = kVar;
        invalidateSelf();
    }

    public void setTintList(ColorStateList colorStateList) {
        this.f374f.e = colorStateList;
        l();
        super.invalidateSelf();
    }

    public void setTintMode(PorterDuff.Mode mode) {
        f fVar = this.f374f;
        if (fVar.f362f != mode) {
            fVar.f362f = mode;
            l();
            super.invalidateSelf();
        }
    }

    public g(k kVar) {
        this(new f(kVar));
    }

    public final void d(Canvas canvas, Paint paint, Path path, k kVar, RectF rectF) {
        if (kVar.d(rectF)) {
            float a2 = kVar.f409f.a(rectF) * this.f374f.i;
            canvas.drawRoundRect(rectF, a2, a2, paint);
            return;
        }
        canvas.drawPath(path, paint);
    }

    public final Region getTransparentRegion() {
        Rect bounds = getBounds();
        Region region = this.f383p;
        region.set(bounds);
        RectF f2 = f();
        Path path = this.f379l;
        a(f2, path);
        Region region2 = this.f384q;
        region2.setPath(path, region);
        region.op(region2, Region.Op.DIFFERENCE);
        return region;
    }

    public boolean isStateful() {
        ColorStateList colorStateList;
        ColorStateList colorStateList2;
        if (!super.isStateful() && ((colorStateList = this.f374f.e) == null || !colorStateList.isStateful())) {
            this.f374f.getClass();
            ColorStateList colorStateList3 = this.f374f.f361d;
            if ((colorStateList3 == null || !colorStateList3.isStateful()) && ((colorStateList2 = this.f374f.f360c) == null || !colorStateList2.isStateful())) {
                return false;
            }
        }
        return true;
    }

    public boolean onStateChange(int[] iArr) {
        boolean z2;
        boolean k2 = k(iArr);
        boolean l2 = l();
        if (k2 || l2) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (z2) {
            invalidateSelf();
        }
        return z2;
    }

    public final void setTint(int i2) {
        setTintList(ColorStateList.valueOf(i2));
    }

    public g(f fVar) {
        m mVar;
        this.f375g = new t[4];
        this.f376h = new t[4];
        this.i = new BitSet(8);
        this.f378k = new Matrix();
        this.f379l = new Path();
        this.f380m = new Path();
        this.f381n = new RectF();
        this.f382o = new RectF();
        this.f383p = new Region();
        this.f384q = new Region();
        Paint paint = new Paint(1);
        this.f386s = paint;
        Paint paint2 = new Paint(1);
        this.f387t = paint2;
        this.f388u = new a();
        if (Looper.getMainLooper().getThread() == Thread.currentThread()) {
            mVar = l.f415a;
        } else {
            mVar = new m();
        }
        this.f390w = mVar;
        this.f393z = new RectF();
        this.f373A = true;
        this.f374f = fVar;
        paint2.setStyle(Paint.Style.STROKE);
        paint.setStyle(Paint.Style.FILL);
        l();
        k(getState());
        this.f389v = new b(3, (Object) this);
    }
}
