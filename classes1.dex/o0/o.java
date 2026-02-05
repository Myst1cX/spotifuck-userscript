package o0;

import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathMeasure;
import r.b;
import r.k;

public final class o {

    /* renamed from: p  reason: collision with root package name */
    public static final Matrix f4386p = new Matrix();

    /* renamed from: a  reason: collision with root package name */
    public final Path f4387a;

    /* renamed from: b  reason: collision with root package name */
    public final Path f4388b;

    /* renamed from: c  reason: collision with root package name */
    public final Matrix f4389c;

    /* renamed from: d  reason: collision with root package name */
    public Paint f4390d;
    public Paint e;

    /* renamed from: f  reason: collision with root package name */
    public PathMeasure f4391f;

    /* renamed from: g  reason: collision with root package name */
    public final l f4392g;

    /* renamed from: h  reason: collision with root package name */
    public float f4393h;
    public float i;

    /* renamed from: j  reason: collision with root package name */
    public float f4394j;

    /* renamed from: k  reason: collision with root package name */
    public float f4395k;

    /* renamed from: l  reason: collision with root package name */
    public int f4396l;

    /* renamed from: m  reason: collision with root package name */
    public String f4397m;

    /* renamed from: n  reason: collision with root package name */
    public Boolean f4398n;

    /* renamed from: o  reason: collision with root package name */
    public final b f4399o;

    /* JADX WARNING: type inference failed for: r0v4, types: [r.b, r.k] */
    public o() {
        this.f4389c = new Matrix();
        this.f4393h = 0.0f;
        this.i = 0.0f;
        this.f4394j = 0.0f;
        this.f4395k = 0.0f;
        this.f4396l = 255;
        this.f4397m = null;
        this.f4398n = null;
        this.f4399o = new k();
        this.f4392g = new l();
        this.f4387a = new Path();
        this.f4388b = new Path();
    }

    /* JADX WARNING: type inference failed for: r11v0 */
    /* JADX WARNING: type inference failed for: r11v1, types: [boolean] */
    /* JADX WARNING: type inference failed for: r11v18 */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x00e6, code lost:
        if (r0.f4369j != 1.0f) goto L_0x00eb;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a(o0.l r19, android.graphics.Matrix r20, android.graphics.Canvas r21, int r22, int r23) {
        /*
            r18 = this;
            r6 = r18
            r7 = r19
            r8 = r21
            r9 = 1
            android.graphics.Matrix r0 = r7.f4374a
            r1 = r20
            r0.set(r1)
            android.graphics.Matrix r10 = r7.f4374a
            android.graphics.Matrix r0 = r7.f4381j
            r10.preConcat(r0)
            r21.save()
            r11 = 0
            r12 = 0
        L_0x001a:
            java.util.ArrayList r0 = r7.f4375b
            int r1 = r0.size()
            if (r12 >= r1) goto L_0x0220
            java.lang.Object r0 = r0.get(r12)
            o0.m r0 = (o0.m) r0
            boolean r1 = r0 instanceof o0.l
            if (r1 == 0) goto L_0x0042
            r1 = r0
            o0.l r1 = (o0.l) r1
            r0 = r18
            r2 = r10
            r3 = r21
            r4 = r22
            r5 = r23
            r0.a(r1, r2, r3, r4, r5)
        L_0x003b:
            r1 = r22
            r17 = r10
        L_0x003f:
            r0 = 1
            goto L_0x0219
        L_0x0042:
            boolean r1 = r0 instanceof o0.n
            if (r1 == 0) goto L_0x003b
            o0.n r0 = (o0.n) r0
            r1 = r22
            float r2 = (float) r1
            float r3 = r6.f4394j
            float r2 = r2 / r3
            r3 = r23
            float r4 = (float) r3
            float r5 = r6.f4395k
            float r4 = r4 / r5
            float r5 = java.lang.Math.min(r2, r4)
            android.graphics.Matrix r13 = r6.f4389c
            r13.set(r10)
            r13.postScale(r2, r4)
            r14 = 4
            float[] r14 = new float[r14]
            r14 = {0, 1065353216, 1065353216, 0} // fill-array
            r10.mapVectors(r14)
            r15 = r14[r11]
            r20 = r5
            double r4 = (double) r15
            r15 = r14[r9]
            double r2 = (double) r15
            double r2 = java.lang.Math.hypot(r4, r2)
            float r2 = (float) r2
            r3 = 2
            r4 = r14[r3]
            double r4 = (double) r4
            r15 = 3
            r3 = r14[r15]
            r17 = r10
            double r9 = (double) r3
            double r3 = java.lang.Math.hypot(r4, r9)
            float r3 = (float) r3
            r4 = r14[r11]
            r5 = 1
            r9 = r14[r5]
            r5 = 2
            r5 = r14[r5]
            r10 = r14[r15]
            float r4 = r4 * r10
            float r9 = r9 * r5
            float r4 = r4 - r9
            float r2 = java.lang.Math.max(r2, r3)
            r16 = 0
            int r3 = (r2 > r16 ? 1 : (r2 == r16 ? 0 : -1))
            if (r3 <= 0) goto L_0x00a5
            float r3 = java.lang.Math.abs(r4)
            float r2 = r3 / r2
            goto L_0x00a6
        L_0x00a5:
            r2 = 0
        L_0x00a6:
            int r3 = (r2 > r16 ? 1 : (r2 == r16 ? 0 : -1))
            if (r3 != 0) goto L_0x00ab
            goto L_0x003f
        L_0x00ab:
            android.graphics.Path r3 = r6.f4387a
            r0.getClass()
            r3.reset()
            F.f[] r4 = r0.f4383a
            if (r4 == 0) goto L_0x00ba
            F.f.b(r4, r3)
        L_0x00ba:
            android.graphics.Path r4 = r6.f4388b
            r4.reset()
            boolean r5 = r0 instanceof o0.j
            if (r5 == 0) goto L_0x00d7
            int r0 = r0.f4385c
            if (r0 != 0) goto L_0x00ca
            android.graphics.Path$FillType r0 = android.graphics.Path.FillType.WINDING
            goto L_0x00cc
        L_0x00ca:
            android.graphics.Path$FillType r0 = android.graphics.Path.FillType.EVEN_ODD
        L_0x00cc:
            r4.setFillType(r0)
            r4.addPath(r3, r13)
            r8.clipPath(r4)
            goto L_0x003f
        L_0x00d7:
            o0.k r0 = (o0.k) r0
            float r5 = r0.i
            r9 = 0
            int r10 = (r5 > r9 ? 1 : (r5 == r9 ? 0 : -1))
            if (r10 != 0) goto L_0x00e9
            float r9 = r0.f4369j
            r10 = 1065353216(0x3f800000, float:1.0)
            int r9 = (r9 > r10 ? 1 : (r9 == r10 ? 0 : -1))
            if (r9 == 0) goto L_0x012b
            goto L_0x00eb
        L_0x00e9:
            r10 = 1065353216(0x3f800000, float:1.0)
        L_0x00eb:
            float r9 = r0.f4370k
            float r5 = r5 + r9
            float r5 = r5 % r10
            float r14 = r0.f4369j
            float r14 = r14 + r9
            float r14 = r14 % r10
            android.graphics.PathMeasure r9 = r6.f4391f
            if (r9 != 0) goto L_0x00fe
            android.graphics.PathMeasure r9 = new android.graphics.PathMeasure
            r9.<init>()
            r6.f4391f = r9
        L_0x00fe:
            android.graphics.PathMeasure r9 = r6.f4391f
            r9.setPath(r3, r11)
            android.graphics.PathMeasure r9 = r6.f4391f
            float r9 = r9.getLength()
            float r5 = r5 * r9
            float r14 = r14 * r9
            r3.reset()
            int r10 = (r5 > r14 ? 1 : (r5 == r14 ? 0 : -1))
            if (r10 <= 0) goto L_0x0121
            android.graphics.PathMeasure r10 = r6.f4391f
            r15 = 1
            r10.getSegment(r5, r9, r3, r15)
            android.graphics.PathMeasure r5 = r6.f4391f
            r9 = 0
            r5.getSegment(r9, r14, r3, r15)
            goto L_0x0128
        L_0x0121:
            r9 = 0
            r15 = 1
            android.graphics.PathMeasure r10 = r6.f4391f
            r10.getSegment(r5, r14, r3, r15)
        L_0x0128:
            r3.rLineTo(r9, r9)
        L_0x012b:
            r4.addPath(r3, r13)
            E.d r3 = r0.f4366f
            java.lang.Object r5 = r3.f95c
            android.graphics.Shader r5 = (android.graphics.Shader) r5
            if (r5 == 0) goto L_0x0137
            goto L_0x013b
        L_0x0137:
            int r5 = r3.f94b
            if (r5 == 0) goto L_0x013d
        L_0x013b:
            r5 = 1
            goto L_0x013e
        L_0x013d:
            r5 = 0
        L_0x013e:
            r9 = 16777215(0xffffff, float:2.3509886E-38)
            r10 = 0
            r14 = 255(0xff, float:3.57E-43)
            r15 = 1132396544(0x437f0000, float:255.0)
            if (r5 == 0) goto L_0x01a0
            android.graphics.Paint r5 = r6.e
            if (r5 != 0) goto L_0x0159
            android.graphics.Paint r5 = new android.graphics.Paint
            r11 = 1
            r5.<init>(r11)
            r6.e = r5
            android.graphics.Paint$Style r11 = android.graphics.Paint.Style.FILL
            r5.setStyle(r11)
        L_0x0159:
            android.graphics.Paint r5 = r6.e
            java.lang.Object r11 = r3.f95c
            android.graphics.Shader r11 = (android.graphics.Shader) r11
            if (r11 == 0) goto L_0x0173
            r11.setLocalMatrix(r13)
            r5.setShader(r11)
            float r3 = r0.f4368h
            float r3 = r3 * r15
            int r3 = java.lang.Math.round(r3)
            r5.setAlpha(r3)
            goto L_0x018e
        L_0x0173:
            r5.setShader(r10)
            r5.setAlpha(r14)
            int r3 = r3.f94b
            float r11 = r0.f4368h
            android.graphics.PorterDuff$Mode r16 = o0.r.f4411o
            int r14 = android.graphics.Color.alpha(r3)
            r3 = r3 & r9
            float r14 = (float) r14
            float r14 = r14 * r11
            int r11 = (int) r14
            int r11 = r11 << 24
            r3 = r3 | r11
            r5.setColor(r3)
        L_0x018e:
            r5.setColorFilter(r10)
            int r3 = r0.f4385c
            if (r3 != 0) goto L_0x0198
            android.graphics.Path$FillType r3 = android.graphics.Path.FillType.WINDING
            goto L_0x019a
        L_0x0198:
            android.graphics.Path$FillType r3 = android.graphics.Path.FillType.EVEN_ODD
        L_0x019a:
            r4.setFillType(r3)
            r8.drawPath(r4, r5)
        L_0x01a0:
            E.d r3 = r0.f4365d
            java.lang.Object r5 = r3.f95c
            android.graphics.Shader r5 = (android.graphics.Shader) r5
            if (r5 == 0) goto L_0x01a9
            goto L_0x01ad
        L_0x01a9:
            int r5 = r3.f94b
            if (r5 == 0) goto L_0x003f
        L_0x01ad:
            android.graphics.Paint r5 = r6.f4390d
            if (r5 != 0) goto L_0x01be
            android.graphics.Paint r5 = new android.graphics.Paint
            r11 = 1
            r5.<init>(r11)
            r6.f4390d = r5
            android.graphics.Paint$Style r11 = android.graphics.Paint.Style.STROKE
            r5.setStyle(r11)
        L_0x01be:
            android.graphics.Paint r5 = r6.f4390d
            android.graphics.Paint$Join r11 = r0.f4372m
            if (r11 == 0) goto L_0x01c7
            r5.setStrokeJoin(r11)
        L_0x01c7:
            android.graphics.Paint$Cap r11 = r0.f4371l
            if (r11 == 0) goto L_0x01ce
            r5.setStrokeCap(r11)
        L_0x01ce:
            float r11 = r0.f4373n
            r5.setStrokeMiter(r11)
            java.lang.Object r11 = r3.f95c
            android.graphics.Shader r11 = (android.graphics.Shader) r11
            if (r11 == 0) goto L_0x01eb
            r11.setLocalMatrix(r13)
            r5.setShader(r11)
            float r3 = r0.f4367g
            float r3 = r3 * r15
            int r3 = java.lang.Math.round(r3)
            r5.setAlpha(r3)
            goto L_0x0208
        L_0x01eb:
            r5.setShader(r10)
            r11 = 255(0xff, float:3.57E-43)
            r5.setAlpha(r11)
            int r3 = r3.f94b
            float r11 = r0.f4367g
            android.graphics.PorterDuff$Mode r13 = o0.r.f4411o
            int r13 = android.graphics.Color.alpha(r3)
            r3 = r3 & r9
            float r9 = (float) r13
            float r9 = r9 * r11
            int r9 = (int) r9
            int r9 = r9 << 24
            r3 = r3 | r9
            r5.setColor(r3)
        L_0x0208:
            r5.setColorFilter(r10)
            float r2 = r2 * r20
            float r0 = r0.e
            float r0 = r0 * r2
            r5.setStrokeWidth(r0)
            r8.drawPath(r4, r5)
            goto L_0x003f
        L_0x0219:
            int r12 = r12 + r0
            r10 = r17
            r9 = 1
            r11 = 0
            goto L_0x001a
        L_0x0220:
            r21.restore()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: o0.o.a(o0.l, android.graphics.Matrix, android.graphics.Canvas, int, int):void");
    }

    public int getRootAlpha() {
        return this.f4396l;
    }

    public void setAlpha(float f2) {
        setRootAlpha((int) (f2 * 255.0f));
    }

    public void setRootAlpha(int i2) {
        this.f4396l = i2;
    }

    public float getAlpha() {
        return ((float) getRootAlpha()) / 255.0f;
    }

    /* JADX WARNING: type inference failed for: r0v4, types: [r.b, r.k] */
    public o(o oVar) {
        this.f4389c = new Matrix();
        this.f4393h = 0.0f;
        this.i = 0.0f;
        this.f4394j = 0.0f;
        this.f4395k = 0.0f;
        this.f4396l = 255;
        this.f4397m = null;
        this.f4398n = null;
        ? kVar = new k();
        this.f4399o = kVar;
        this.f4392g = new l(oVar.f4392g, kVar);
        this.f4387a = new Path(oVar.f4387a);
        this.f4388b = new Path(oVar.f4388b);
        this.f4393h = oVar.f4393h;
        this.i = oVar.i;
        this.f4394j = oVar.f4394j;
        this.f4395k = oVar.f4395k;
        this.f4396l = oVar.f4396l;
        this.f4397m = oVar.f4397m;
        String str = oVar.f4397m;
        if (str != null) {
            kVar.put(str, this);
        }
        this.f4398n = oVar.f4398n;
    }
}
