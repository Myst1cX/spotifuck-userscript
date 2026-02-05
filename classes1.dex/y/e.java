package y;

import android.view.ViewGroup;
import v.C0347d;
import v.h;

public final class e extends ViewGroup.MarginLayoutParams {

    /* renamed from: A  reason: collision with root package name */
    public int f4952A;

    /* renamed from: B  reason: collision with root package name */
    public int f4953B;

    /* renamed from: C  reason: collision with root package name */
    public int f4954C;

    /* renamed from: D  reason: collision with root package name */
    public int f4955D;

    /* renamed from: E  reason: collision with root package name */
    public float f4956E;

    /* renamed from: F  reason: collision with root package name */
    public float f4957F;

    /* renamed from: G  reason: collision with root package name */
    public String f4958G;

    /* renamed from: H  reason: collision with root package name */
    public float f4959H;
    public float I;

    /* renamed from: J  reason: collision with root package name */
    public int f4960J;

    /* renamed from: K  reason: collision with root package name */
    public int f4961K;

    /* renamed from: L  reason: collision with root package name */
    public int f4962L;

    /* renamed from: M  reason: collision with root package name */
    public int f4963M;

    /* renamed from: N  reason: collision with root package name */
    public int f4964N;

    /* renamed from: O  reason: collision with root package name */
    public int f4965O;

    /* renamed from: P  reason: collision with root package name */
    public int f4966P;

    /* renamed from: Q  reason: collision with root package name */
    public int f4967Q;

    /* renamed from: R  reason: collision with root package name */
    public float f4968R;

    /* renamed from: S  reason: collision with root package name */
    public float f4969S;

    /* renamed from: T  reason: collision with root package name */
    public int f4970T;

    /* renamed from: U  reason: collision with root package name */
    public int f4971U;

    /* renamed from: V  reason: collision with root package name */
    public int f4972V;

    /* renamed from: W  reason: collision with root package name */
    public boolean f4973W;

    /* renamed from: X  reason: collision with root package name */
    public boolean f4974X;

    /* renamed from: Y  reason: collision with root package name */
    public String f4975Y;

    /* renamed from: Z  reason: collision with root package name */
    public int f4976Z;

    /* renamed from: a  reason: collision with root package name */
    public int f4977a;

    /* renamed from: a0  reason: collision with root package name */
    public boolean f4978a0;

    /* renamed from: b  reason: collision with root package name */
    public int f4979b;

    /* renamed from: b0  reason: collision with root package name */
    public boolean f4980b0;

    /* renamed from: c  reason: collision with root package name */
    public float f4981c;

    /* renamed from: c0  reason: collision with root package name */
    public boolean f4982c0;

    /* renamed from: d  reason: collision with root package name */
    public boolean f4983d;

    /* renamed from: d0  reason: collision with root package name */
    public boolean f4984d0;
    public int e;

    /* renamed from: e0  reason: collision with root package name */
    public boolean f4985e0;

    /* renamed from: f  reason: collision with root package name */
    public int f4986f;

    /* renamed from: f0  reason: collision with root package name */
    public int f4987f0;

    /* renamed from: g  reason: collision with root package name */
    public int f4988g;

    /* renamed from: g0  reason: collision with root package name */
    public int f4989g0;

    /* renamed from: h  reason: collision with root package name */
    public int f4990h;

    /* renamed from: h0  reason: collision with root package name */
    public int f4991h0;
    public int i;

    /* renamed from: i0  reason: collision with root package name */
    public int f4992i0;

    /* renamed from: j  reason: collision with root package name */
    public int f4993j;

    /* renamed from: j0  reason: collision with root package name */
    public int f4994j0;

    /* renamed from: k  reason: collision with root package name */
    public int f4995k;

    /* renamed from: k0  reason: collision with root package name */
    public int f4996k0;

    /* renamed from: l  reason: collision with root package name */
    public int f4997l;

    /* renamed from: l0  reason: collision with root package name */
    public float f4998l0;

    /* renamed from: m  reason: collision with root package name */
    public int f4999m;
    public int m0;

    /* renamed from: n  reason: collision with root package name */
    public int f5000n;

    /* renamed from: n0  reason: collision with root package name */
    public int f5001n0;

    /* renamed from: o  reason: collision with root package name */
    public int f5002o;

    /* renamed from: o0  reason: collision with root package name */
    public float f5003o0;

    /* renamed from: p  reason: collision with root package name */
    public int f5004p;

    /* renamed from: p0  reason: collision with root package name */
    public C0347d f5005p0;

    /* renamed from: q  reason: collision with root package name */
    public int f5006q;

    /* renamed from: r  reason: collision with root package name */
    public float f5007r;

    /* renamed from: s  reason: collision with root package name */
    public int f5008s;

    /* renamed from: t  reason: collision with root package name */
    public int f5009t;

    /* renamed from: u  reason: collision with root package name */
    public int f5010u;

    /* renamed from: v  reason: collision with root package name */
    public int f5011v;

    /* renamed from: w  reason: collision with root package name */
    public int f5012w;

    /* renamed from: x  reason: collision with root package name */
    public int f5013x;

    /* renamed from: y  reason: collision with root package name */
    public int f5014y;

    /* renamed from: z  reason: collision with root package name */
    public int f5015z;

    public final void a() {
        this.f4984d0 = false;
        this.f4978a0 = true;
        this.f4980b0 = true;
        int i2 = this.width;
        if (i2 == -2 && this.f4973W) {
            this.f4978a0 = false;
            if (this.f4962L == 0) {
                this.f4962L = 1;
            }
        }
        int i3 = this.height;
        if (i3 == -2 && this.f4974X) {
            this.f4980b0 = false;
            if (this.f4963M == 0) {
                this.f4963M = 1;
            }
        }
        if (i2 == 0 || i2 == -1) {
            this.f4978a0 = false;
            if (i2 == 0 && this.f4962L == 1) {
                this.width = -2;
                this.f4973W = true;
            }
        }
        if (i3 == 0 || i3 == -1) {
            this.f4980b0 = false;
            if (i3 == 0 && this.f4963M == 1) {
                this.height = -2;
                this.f4974X = true;
            }
        }
        if (this.f4981c != -1.0f || this.f4977a != -1 || this.f4979b != -1) {
            this.f4984d0 = true;
            this.f4978a0 = true;
            this.f4980b0 = true;
            if (!(this.f5005p0 instanceof h)) {
                this.f5005p0 = new h();
            }
            ((h) this.f5005p0).S(this.f4972V);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:15:0x004a  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x0051  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x0058  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x005e  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x0064  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x007a  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x0082  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void resolveLayoutDirection(int r11) {
        /*
            r10 = this;
            int r0 = r10.leftMargin
            int r1 = r10.rightMargin
            super.resolveLayoutDirection(r11)
            int r11 = r10.getLayoutDirection()
            r2 = 0
            r3 = 1
            if (r3 != r11) goto L_0x0011
            r11 = 1
            goto L_0x0012
        L_0x0011:
            r11 = 0
        L_0x0012:
            r4 = -1
            r10.f4991h0 = r4
            r10.f4992i0 = r4
            r10.f4987f0 = r4
            r10.f4989g0 = r4
            int r5 = r10.f5012w
            r10.f4994j0 = r5
            int r5 = r10.f5014y
            r10.f4996k0 = r5
            float r5 = r10.f4956E
            r10.f4998l0 = r5
            int r6 = r10.f4977a
            r10.m0 = r6
            int r7 = r10.f4979b
            r10.f5001n0 = r7
            float r8 = r10.f4981c
            r10.f5003o0 = r8
            r9 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r11 == 0) goto L_0x0094
            int r11 = r10.f5008s
            if (r11 == r4) goto L_0x003f
            r10.f4991h0 = r11
        L_0x003d:
            r2 = 1
            goto L_0x0046
        L_0x003f:
            int r11 = r10.f5009t
            if (r11 == r4) goto L_0x0046
            r10.f4992i0 = r11
            goto L_0x003d
        L_0x0046:
            int r11 = r10.f5010u
            if (r11 == r4) goto L_0x004d
            r10.f4989g0 = r11
            r2 = 1
        L_0x004d:
            int r11 = r10.f5011v
            if (r11 == r4) goto L_0x0054
            r10.f4987f0 = r11
            r2 = 1
        L_0x0054:
            int r11 = r10.f4952A
            if (r11 == r9) goto L_0x005a
            r10.f4996k0 = r11
        L_0x005a:
            int r11 = r10.f4953B
            if (r11 == r9) goto L_0x0060
            r10.f4994j0 = r11
        L_0x0060:
            r11 = 1065353216(0x3f800000, float:1.0)
            if (r2 == 0) goto L_0x0068
            float r2 = r11 - r5
            r10.f4998l0 = r2
        L_0x0068:
            boolean r2 = r10.f4984d0
            if (r2 == 0) goto L_0x00b8
            int r2 = r10.f4972V
            if (r2 != r3) goto L_0x00b8
            boolean r2 = r10.f4983d
            if (r2 == 0) goto L_0x00b8
            r2 = -1082130432(0xffffffffbf800000, float:-1.0)
            int r3 = (r8 > r2 ? 1 : (r8 == r2 ? 0 : -1))
            if (r3 == 0) goto L_0x0082
            float r11 = r11 - r8
            r10.f5003o0 = r11
            r10.m0 = r4
            r10.f5001n0 = r4
            goto L_0x00b8
        L_0x0082:
            if (r6 == r4) goto L_0x008b
            r10.f5001n0 = r6
            r10.m0 = r4
            r10.f5003o0 = r2
            goto L_0x00b8
        L_0x008b:
            if (r7 == r4) goto L_0x00b8
            r10.m0 = r7
            r10.f5001n0 = r4
            r10.f5003o0 = r2
            goto L_0x00b8
        L_0x0094:
            int r11 = r10.f5008s
            if (r11 == r4) goto L_0x009a
            r10.f4989g0 = r11
        L_0x009a:
            int r11 = r10.f5009t
            if (r11 == r4) goto L_0x00a0
            r10.f4987f0 = r11
        L_0x00a0:
            int r11 = r10.f5010u
            if (r11 == r4) goto L_0x00a6
            r10.f4991h0 = r11
        L_0x00a6:
            int r11 = r10.f5011v
            if (r11 == r4) goto L_0x00ac
            r10.f4992i0 = r11
        L_0x00ac:
            int r11 = r10.f4952A
            if (r11 == r9) goto L_0x00b2
            r10.f4994j0 = r11
        L_0x00b2:
            int r11 = r10.f4953B
            if (r11 == r9) goto L_0x00b8
            r10.f4996k0 = r11
        L_0x00b8:
            int r11 = r10.f5010u
            if (r11 != r4) goto L_0x0102
            int r11 = r10.f5011v
            if (r11 != r4) goto L_0x0102
            int r11 = r10.f5009t
            if (r11 != r4) goto L_0x0102
            int r11 = r10.f5008s
            if (r11 != r4) goto L_0x0102
            int r11 = r10.f4988g
            if (r11 == r4) goto L_0x00d7
            r10.f4991h0 = r11
            int r11 = r10.rightMargin
            if (r11 > 0) goto L_0x00e5
            if (r1 <= 0) goto L_0x00e5
            r10.rightMargin = r1
            goto L_0x00e5
        L_0x00d7:
            int r11 = r10.f4990h
            if (r11 == r4) goto L_0x00e5
            r10.f4992i0 = r11
            int r11 = r10.rightMargin
            if (r11 > 0) goto L_0x00e5
            if (r1 <= 0) goto L_0x00e5
            r10.rightMargin = r1
        L_0x00e5:
            int r11 = r10.e
            if (r11 == r4) goto L_0x00f4
            r10.f4987f0 = r11
            int r11 = r10.leftMargin
            if (r11 > 0) goto L_0x0102
            if (r0 <= 0) goto L_0x0102
            r10.leftMargin = r0
            goto L_0x0102
        L_0x00f4:
            int r11 = r10.f4986f
            if (r11 == r4) goto L_0x0102
            r10.f4989g0 = r11
            int r11 = r10.leftMargin
            if (r11 > 0) goto L_0x0102
            if (r0 <= 0) goto L_0x0102
            r10.leftMargin = r0
        L_0x0102:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: y.e.resolveLayoutDirection(int):void");
    }
}
