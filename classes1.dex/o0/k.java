package o0;

import E.d;
import android.graphics.Paint;

public final class k extends n {

    /* renamed from: d  reason: collision with root package name */
    public d f4365d;
    public float e;

    /* renamed from: f  reason: collision with root package name */
    public d f4366f;

    /* renamed from: g  reason: collision with root package name */
    public float f4367g;

    /* renamed from: h  reason: collision with root package name */
    public float f4368h;
    public float i;

    /* renamed from: j  reason: collision with root package name */
    public float f4369j;

    /* renamed from: k  reason: collision with root package name */
    public float f4370k;

    /* renamed from: l  reason: collision with root package name */
    public Paint.Cap f4371l;

    /* renamed from: m  reason: collision with root package name */
    public Paint.Join f4372m;

    /* renamed from: n  reason: collision with root package name */
    public float f4373n;

    public final boolean a() {
        if (this.f4366f.b() || this.f4365d.b()) {
            return true;
        }
        return false;
    }

    /* JADX WARNING: Removed duplicated region for block: B:8:0x0027  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean b(int[] r7) {
        /*
            r6 = this;
            E.d r0 = r6.f4366f
            boolean r1 = r0.b()
            r2 = 0
            r3 = 1
            if (r1 == 0) goto L_0x001e
            java.lang.Object r1 = r0.f96d
            android.content.res.ColorStateList r1 = (android.content.res.ColorStateList) r1
            int r4 = r1.getDefaultColor()
            int r1 = r1.getColorForState(r7, r4)
            int r4 = r0.f94b
            if (r1 == r4) goto L_0x001e
            r0.f94b = r1
            r0 = 1
            goto L_0x001f
        L_0x001e:
            r0 = 0
        L_0x001f:
            E.d r1 = r6.f4365d
            boolean r4 = r1.b()
            if (r4 == 0) goto L_0x003a
            java.lang.Object r4 = r1.f96d
            android.content.res.ColorStateList r4 = (android.content.res.ColorStateList) r4
            int r5 = r4.getDefaultColor()
            int r7 = r4.getColorForState(r7, r5)
            int r4 = r1.f94b
            if (r7 == r4) goto L_0x003a
            r1.f94b = r7
            r2 = 1
        L_0x003a:
            r7 = r0 | r2
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: o0.k.b(int[]):boolean");
    }

    public float getFillAlpha() {
        return this.f4368h;
    }

    public int getFillColor() {
        return this.f4366f.f94b;
    }

    public float getStrokeAlpha() {
        return this.f4367g;
    }

    public int getStrokeColor() {
        return this.f4365d.f94b;
    }

    public float getStrokeWidth() {
        return this.e;
    }

    public float getTrimPathEnd() {
        return this.f4369j;
    }

    public float getTrimPathOffset() {
        return this.f4370k;
    }

    public float getTrimPathStart() {
        return this.i;
    }

    public void setFillAlpha(float f2) {
        this.f4368h = f2;
    }

    public void setFillColor(int i2) {
        this.f4366f.f94b = i2;
    }

    public void setStrokeAlpha(float f2) {
        this.f4367g = f2;
    }

    public void setStrokeColor(int i2) {
        this.f4365d.f94b = i2;
    }

    public void setStrokeWidth(float f2) {
        this.e = f2;
    }

    public void setTrimPathEnd(float f2) {
        this.f4369j = f2;
    }

    public void setTrimPathOffset(float f2) {
        this.f4370k = f2;
    }

    public void setTrimPathStart(float f2) {
        this.i = f2;
    }
}
