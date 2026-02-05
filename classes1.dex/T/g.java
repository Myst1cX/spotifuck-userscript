package T;

import N0.B;
import android.content.res.Resources;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.AnimationUtils;
import android.widget.ListView;
import o.C0309v0;

public final class g implements View.OnTouchListener {

    /* renamed from: w  reason: collision with root package name */
    public static final int f897w = ViewConfiguration.getTapTimeout();

    /* renamed from: f  reason: collision with root package name */
    public final a f898f;

    /* renamed from: g  reason: collision with root package name */
    public final AccelerateInterpolator f899g = new AccelerateInterpolator();

    /* renamed from: h  reason: collision with root package name */
    public final ListView f900h;
    public B i;

    /* renamed from: j  reason: collision with root package name */
    public final float[] f901j;

    /* renamed from: k  reason: collision with root package name */
    public final float[] f902k;

    /* renamed from: l  reason: collision with root package name */
    public final int f903l;

    /* renamed from: m  reason: collision with root package name */
    public final int f904m;

    /* renamed from: n  reason: collision with root package name */
    public final float[] f905n;

    /* renamed from: o  reason: collision with root package name */
    public final float[] f906o;

    /* renamed from: p  reason: collision with root package name */
    public final float[] f907p;

    /* renamed from: q  reason: collision with root package name */
    public boolean f908q;

    /* renamed from: r  reason: collision with root package name */
    public boolean f909r;

    /* renamed from: s  reason: collision with root package name */
    public boolean f910s;

    /* renamed from: t  reason: collision with root package name */
    public boolean f911t;

    /* renamed from: u  reason: collision with root package name */
    public boolean f912u;

    /* renamed from: v  reason: collision with root package name */
    public final C0309v0 f913v;

    /* JADX WARNING: type inference failed for: r1v0, types: [T.a, java.lang.Object] */
    public g(C0309v0 v0Var) {
        ? obj = new Object();
        obj.e = Long.MIN_VALUE;
        obj.f895g = -1;
        obj.f894f = 0;
        this.f898f = obj;
        float[] fArr = {0.0f, 0.0f};
        this.f901j = fArr;
        float[] fArr2 = {Float.MAX_VALUE, Float.MAX_VALUE};
        this.f902k = fArr2;
        float[] fArr3 = {0.0f, 0.0f};
        this.f905n = fArr3;
        float[] fArr4 = {0.0f, 0.0f};
        this.f906o = fArr4;
        float[] fArr5 = {Float.MAX_VALUE, Float.MAX_VALUE};
        this.f907p = fArr5;
        this.f900h = v0Var;
        float f2 = Resources.getSystem().getDisplayMetrics().density;
        float f3 = ((float) ((int) ((1575.0f * f2) + 0.5f))) / 1000.0f;
        fArr5[0] = f3;
        fArr5[1] = f3;
        float f4 = ((float) ((int) ((f2 * 315.0f) + 0.5f))) / 1000.0f;
        fArr4[0] = f4;
        fArr4[1] = f4;
        this.f903l = 1;
        fArr2[0] = Float.MAX_VALUE;
        fArr2[1] = Float.MAX_VALUE;
        fArr[0] = 0.2f;
        fArr[1] = 0.2f;
        fArr3[0] = 0.001f;
        fArr3[1] = 0.001f;
        this.f904m = f897w;
        obj.f890a = 500;
        obj.f891b = 500;
        this.f913v = v0Var;
    }

    public final float c(float f2, float f3) {
        if (f3 == 0.0f) {
            return 0.0f;
        }
        int i2 = this.f903l;
        if (i2 == 0 || i2 == 1) {
            if (f2 < f3) {
                if (f2 >= 0.0f) {
                    return 1.0f - (f2 / f3);
                }
                if (!this.f911t || i2 != 1) {
                    return 0.0f;
                }
                return 1.0f;
            }
        } else if (i2 == 2 && f2 < 0.0f) {
            return f2 / (-f3);
        }
        return 0.0f;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0013, code lost:
        if (r1 != 3) goto L_0x007b;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean onTouch(android.view.View r8, android.view.MotionEvent r9) {
        /*
            r7 = this;
            r0 = 2
            boolean r1 = r7.f912u
            r2 = 0
            if (r1 != 0) goto L_0x0007
            return r2
        L_0x0007:
            int r1 = r9.getActionMasked()
            r3 = 1
            if (r1 == 0) goto L_0x001a
            if (r1 == r3) goto L_0x0016
            if (r1 == r0) goto L_0x001e
            r8 = 3
            if (r1 == r8) goto L_0x0016
            goto L_0x007b
        L_0x0016:
            r7.d()
            goto L_0x007b
        L_0x001a:
            r7.f910s = r3
            r7.f908q = r2
        L_0x001e:
            float r1 = r9.getX()
            int r4 = r8.getWidth()
            float r4 = (float) r4
            android.widget.ListView r5 = r7.f900h
            int r6 = r5.getWidth()
            float r6 = (float) r6
            float r1 = r7.a(r2, r1, r4, r6)
            float r9 = r9.getY()
            int r8 = r8.getHeight()
            float r8 = (float) r8
            int r4 = r5.getHeight()
            float r4 = (float) r4
            float r8 = r7.a(r3, r9, r8, r4)
            T.a r9 = r7.f898f
            r9.f892c = r1
            r9.f893d = r8
            boolean r8 = r7.f911t
            if (r8 != 0) goto L_0x007b
            boolean r8 = r7.e()
            if (r8 == 0) goto L_0x007b
            N0.B r8 = r7.i
            if (r8 != 0) goto L_0x005f
            N0.B r8 = new N0.B
            r8.<init>(r0, r7)
            r7.i = r8
        L_0x005f:
            r7.f911t = r3
            r7.f909r = r3
            boolean r8 = r7.f908q
            if (r8 != 0) goto L_0x0074
            int r8 = r7.f904m
            if (r8 <= 0) goto L_0x0074
            N0.B r9 = r7.i
            long r0 = (long) r8
            java.util.WeakHashMap r8 = N.Q.f509a
            r5.postOnAnimationDelayed(r9, r0)
            goto L_0x0079
        L_0x0074:
            N0.B r8 = r7.i
            r8.run()
        L_0x0079:
            r7.f908q = r3
        L_0x007b:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: T.g.onTouch(android.view.View, android.view.MotionEvent):boolean");
    }

    public static float b(float f2, float f3, float f4) {
        if (f2 > f4) {
            return f4;
        }
        if (f2 < f3) {
            return f3;
        }
        return f2;
    }

    /* JADX WARNING: Removed duplicated region for block: B:10:0x003c A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x003d  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final float a(int r4, float r5, float r6, float r7) {
        /*
            r3 = this;
            float[] r0 = r3.f901j
            r0 = r0[r4]
            float[] r1 = r3.f902k
            r1 = r1[r4]
            float r0 = r0 * r6
            r2 = 0
            float r0 = b(r0, r2, r1)
            float r1 = r3.c(r5, r0)
            float r6 = r6 - r5
            float r5 = r3.c(r6, r0)
            float r5 = r5 - r1
            android.view.animation.AccelerateInterpolator r6 = r3.f899g
            int r0 = (r5 > r2 ? 1 : (r5 == r2 ? 0 : -1))
            if (r0 >= 0) goto L_0x0026
            float r5 = -r5
            float r5 = r6.getInterpolation(r5)
            float r5 = -r5
            goto L_0x002e
        L_0x0026:
            int r0 = (r5 > r2 ? 1 : (r5 == r2 ? 0 : -1))
            if (r0 <= 0) goto L_0x0037
            float r5 = r6.getInterpolation(r5)
        L_0x002e:
            r6 = -1082130432(0xffffffffbf800000, float:-1.0)
            r0 = 1065353216(0x3f800000, float:1.0)
            float r5 = b(r5, r6, r0)
            goto L_0x0038
        L_0x0037:
            r5 = 0
        L_0x0038:
            int r6 = (r5 > r2 ? 1 : (r5 == r2 ? 0 : -1))
            if (r6 != 0) goto L_0x003d
            return r2
        L_0x003d:
            float[] r0 = r3.f905n
            r0 = r0[r4]
            float[] r1 = r3.f906o
            r1 = r1[r4]
            float[] r2 = r3.f907p
            r4 = r2[r4]
            float r0 = r0 * r7
            if (r6 <= 0) goto L_0x0054
            float r5 = r5 * r0
            float r4 = b(r5, r1, r4)
            return r4
        L_0x0054:
            float r5 = -r5
            float r5 = r5 * r0
            float r4 = b(r5, r1, r4)
            float r4 = -r4
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: T.g.a(int, float, float, float):float");
    }

    public final void d() {
        int i2 = 0;
        if (this.f909r) {
            this.f911t = false;
            return;
        }
        a aVar = this.f898f;
        long currentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
        int i3 = (int) (currentAnimationTimeMillis - aVar.e);
        int i4 = aVar.f891b;
        if (i3 > i4) {
            i2 = i4;
        } else if (i3 >= 0) {
            i2 = i3;
        }
        aVar.i = i2;
        aVar.f896h = aVar.a(currentAnimationTimeMillis);
        aVar.f895g = currentAnimationTimeMillis;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0012, code lost:
        r2 = r8.f913v;
     */
    /* JADX WARNING: Removed duplicated region for block: B:13:0x0049 A[ORIG_RETURN, RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean e() {
        /*
            r8 = this;
            T.a r0 = r8.f898f
            float r1 = r0.f893d
            float r2 = java.lang.Math.abs(r1)
            float r1 = r1 / r2
            int r1 = (int) r1
            float r0 = r0.f892c
            java.lang.Math.abs(r0)
            r0 = 0
            if (r1 == 0) goto L_0x004a
            o.v0 r2 = r8.f913v
            int r3 = r2.getCount()
            if (r3 != 0) goto L_0x001b
            goto L_0x004a
        L_0x001b:
            int r4 = r2.getChildCount()
            int r5 = r2.getFirstVisiblePosition()
            int r6 = r5 + r4
            r7 = 1
            if (r1 <= 0) goto L_0x003a
            if (r6 < r3) goto L_0x0049
            int r4 = r4 - r7
            android.view.View r1 = r2.getChildAt(r4)
            int r1 = r1.getBottom()
            int r2 = r2.getHeight()
            if (r1 > r2) goto L_0x0049
            goto L_0x004a
        L_0x003a:
            if (r1 >= 0) goto L_0x004a
            if (r5 > 0) goto L_0x0049
            android.view.View r1 = r2.getChildAt(r0)
            int r1 = r1.getTop()
            if (r1 < 0) goto L_0x0049
            goto L_0x004a
        L_0x0049:
            r0 = 1
        L_0x004a:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: T.g.e():boolean");
    }
}
