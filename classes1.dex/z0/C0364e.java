package z0;

import E0.j;
import E0.k;
import G.a;
import G.h;
import G.i;
import I0.d;
import K0.f;
import K0.g;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.OvalShape;
import android.os.Build;
import android.text.SpannableStringBuilder;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.TypedValue;
import com.google.android.material.chip.Chip;
import java.lang.ref.WeakReference;
import java.util.Arrays;
import p0.C0320a;
import r0.C0325b;

/* renamed from: z0.e  reason: case insensitive filesystem */
public final class C0364e extends g implements Drawable.Callback, j {

    /* renamed from: K0  reason: collision with root package name */
    public static final int[] f5178K0 = {16842910};

    /* renamed from: L0  reason: collision with root package name */
    public static final ShapeDrawable f5179L0 = new ShapeDrawable(new OvalShape());
    public PorterDuffColorFilter A0;

    /* renamed from: B0  reason: collision with root package name */
    public ColorStateList f5180B0;

    /* renamed from: C  reason: collision with root package name */
    public ColorStateList f5181C;

    /* renamed from: C0  reason: collision with root package name */
    public PorterDuff.Mode f5182C0 = PorterDuff.Mode.SRC_IN;

    /* renamed from: D  reason: collision with root package name */
    public ColorStateList f5183D;

    /* renamed from: D0  reason: collision with root package name */
    public int[] f5184D0;

    /* renamed from: E  reason: collision with root package name */
    public float f5185E;

    /* renamed from: E0  reason: collision with root package name */
    public ColorStateList f5186E0;

    /* renamed from: F  reason: collision with root package name */
    public float f5187F = -1.0f;
    public WeakReference F0 = new WeakReference((Object) null);

    /* renamed from: G  reason: collision with root package name */
    public ColorStateList f5188G;

    /* renamed from: G0  reason: collision with root package name */
    public TextUtils.TruncateAt f5189G0;

    /* renamed from: H  reason: collision with root package name */
    public float f5190H;

    /* renamed from: H0  reason: collision with root package name */
    public boolean f5191H0;
    public ColorStateList I;

    /* renamed from: I0  reason: collision with root package name */
    public int f5192I0;

    /* renamed from: J  reason: collision with root package name */
    public CharSequence f5193J;

    /* renamed from: J0  reason: collision with root package name */
    public boolean f5194J0;

    /* renamed from: K  reason: collision with root package name */
    public boolean f5195K;

    /* renamed from: L  reason: collision with root package name */
    public Drawable f5196L;

    /* renamed from: M  reason: collision with root package name */
    public ColorStateList f5197M;

    /* renamed from: N  reason: collision with root package name */
    public float f5198N;

    /* renamed from: O  reason: collision with root package name */
    public boolean f5199O;

    /* renamed from: P  reason: collision with root package name */
    public boolean f5200P;

    /* renamed from: Q  reason: collision with root package name */
    public Drawable f5201Q;

    /* renamed from: R  reason: collision with root package name */
    public RippleDrawable f5202R;

    /* renamed from: S  reason: collision with root package name */
    public ColorStateList f5203S;

    /* renamed from: T  reason: collision with root package name */
    public float f5204T;

    /* renamed from: U  reason: collision with root package name */
    public SpannableStringBuilder f5205U;

    /* renamed from: V  reason: collision with root package name */
    public boolean f5206V;

    /* renamed from: W  reason: collision with root package name */
    public boolean f5207W;

    /* renamed from: X  reason: collision with root package name */
    public Drawable f5208X;

    /* renamed from: Y  reason: collision with root package name */
    public ColorStateList f5209Y;

    /* renamed from: Z  reason: collision with root package name */
    public C0325b f5210Z;

    /* renamed from: a0  reason: collision with root package name */
    public C0325b f5211a0;

    /* renamed from: b0  reason: collision with root package name */
    public float f5212b0;

    /* renamed from: c0  reason: collision with root package name */
    public float f5213c0;

    /* renamed from: d0  reason: collision with root package name */
    public float f5214d0;

    /* renamed from: e0  reason: collision with root package name */
    public float f5215e0;

    /* renamed from: f0  reason: collision with root package name */
    public float f5216f0;

    /* renamed from: g0  reason: collision with root package name */
    public float f5217g0;

    /* renamed from: h0  reason: collision with root package name */
    public float f5218h0;

    /* renamed from: i0  reason: collision with root package name */
    public float f5219i0;

    /* renamed from: j0  reason: collision with root package name */
    public final Context f5220j0;

    /* renamed from: k0  reason: collision with root package name */
    public final Paint f5221k0 = new Paint(1);

    /* renamed from: l0  reason: collision with root package name */
    public final Paint.FontMetrics f5222l0 = new Paint.FontMetrics();
    public final RectF m0 = new RectF();

    /* renamed from: n0  reason: collision with root package name */
    public final PointF f5223n0 = new PointF();

    /* renamed from: o0  reason: collision with root package name */
    public final Path f5224o0 = new Path();

    /* renamed from: p0  reason: collision with root package name */
    public final k f5225p0;

    /* renamed from: q0  reason: collision with root package name */
    public int f5226q0;

    /* renamed from: r0  reason: collision with root package name */
    public int f5227r0;

    /* renamed from: s0  reason: collision with root package name */
    public int f5228s0;

    /* renamed from: t0  reason: collision with root package name */
    public int f5229t0;

    /* renamed from: u0  reason: collision with root package name */
    public int f5230u0;

    /* renamed from: v0  reason: collision with root package name */
    public int f5231v0;

    /* renamed from: w0  reason: collision with root package name */
    public boolean f5232w0;

    /* renamed from: x0  reason: collision with root package name */
    public int f5233x0;

    /* renamed from: y0  reason: collision with root package name */
    public int f5234y0 = 255;

    /* renamed from: z0  reason: collision with root package name */
    public ColorFilter f5235z0;

    public final void D(ColorStateList colorStateList) {
        this.f5199O = true;
        if (this.f5197M != colorStateList) {
            this.f5197M = colorStateList;
            if (S()) {
                a.h(this.f5196L, colorStateList);
            }
            onStateChange(getState());
        }
    }

    public final int getOpacity() {
        return -3;
    }

    /* JADX WARNING: Removed duplicated region for block: B:67:0x00cc  */
    /* JADX WARNING: Removed duplicated region for block: B:68:0x00cf  */
    /* JADX WARNING: Removed duplicated region for block: B:72:0x00d5  */
    /* JADX WARNING: Removed duplicated region for block: B:73:0x00dc  */
    /* JADX WARNING: Removed duplicated region for block: B:76:0x00e1  */
    /* JADX WARNING: Removed duplicated region for block: B:82:0x00fe  */
    /* JADX WARNING: Removed duplicated region for block: B:85:0x0107  */
    /* JADX WARNING: Removed duplicated region for block: B:88:0x0116  */
    /* JADX WARNING: Removed duplicated region for block: B:91:0x0125  */
    /* JADX WARNING: Removed duplicated region for block: B:94:0x0144  */
    /* JADX WARNING: Removed duplicated region for block: B:96:0x014d  */
    /* JADX WARNING: Removed duplicated region for block: B:98:0x0152  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean v(int[] r9, int[] r10) {
        /*
            r8 = this;
            r0 = 1
            boolean r1 = super.onStateChange(r9)
            android.content.res.ColorStateList r2 = r8.f5181C
            r3 = 0
            if (r2 == 0) goto L_0x0011
            int r4 = r8.f5226q0
            int r2 = r2.getColorForState(r9, r4)
            goto L_0x0012
        L_0x0011:
            r2 = 0
        L_0x0012:
            int r2 = r8.b(r2)
            int r4 = r8.f5226q0
            if (r4 == r2) goto L_0x001d
            r8.f5226q0 = r2
            r1 = 1
        L_0x001d:
            android.content.res.ColorStateList r4 = r8.f5183D
            if (r4 == 0) goto L_0x0028
            int r5 = r8.f5227r0
            int r4 = r4.getColorForState(r9, r5)
            goto L_0x0029
        L_0x0028:
            r4 = 0
        L_0x0029:
            int r4 = r8.b(r4)
            int r5 = r8.f5227r0
            if (r5 == r4) goto L_0x0034
            r8.f5227r0 = r4
            r1 = 1
        L_0x0034:
            int r2 = F.a.b(r4, r2)
            int r4 = r8.f5228s0
            if (r4 == r2) goto L_0x003e
            r4 = 1
            goto L_0x003f
        L_0x003e:
            r4 = 0
        L_0x003f:
            K0.f r5 = r8.f374f
            android.content.res.ColorStateList r5 = r5.f360c
            if (r5 != 0) goto L_0x0047
            r5 = 1
            goto L_0x0048
        L_0x0047:
            r5 = 0
        L_0x0048:
            r4 = r4 | r5
            if (r4 == 0) goto L_0x0055
            r8.f5228s0 = r2
            android.content.res.ColorStateList r1 = android.content.res.ColorStateList.valueOf(r2)
            r8.j(r1)
            r1 = 1
        L_0x0055:
            android.content.res.ColorStateList r2 = r8.f5188G
            if (r2 == 0) goto L_0x0060
            int r4 = r8.f5229t0
            int r2 = r2.getColorForState(r9, r4)
            goto L_0x0061
        L_0x0060:
            r2 = 0
        L_0x0061:
            int r4 = r8.f5229t0
            if (r4 == r2) goto L_0x0068
            r8.f5229t0 = r2
            r1 = 1
        L_0x0068:
            android.content.res.ColorStateList r2 = r8.f5186E0
            if (r2 == 0) goto L_0x007b
            boolean r2 = I0.d.b(r9)
            if (r2 == 0) goto L_0x007b
            android.content.res.ColorStateList r2 = r8.f5186E0
            int r4 = r8.f5230u0
            int r2 = r2.getColorForState(r9, r4)
            goto L_0x007c
        L_0x007b:
            r2 = 0
        L_0x007c:
            int r4 = r8.f5230u0
            if (r4 == r2) goto L_0x0082
            r8.f5230u0 = r2
        L_0x0082:
            E0.k r2 = r8.f5225p0
            H0.d r2 = r2.f217f
            if (r2 == 0) goto L_0x0093
            android.content.res.ColorStateList r2 = r2.f279j
            if (r2 == 0) goto L_0x0093
            int r4 = r8.f5231v0
            int r2 = r2.getColorForState(r9, r4)
            goto L_0x0094
        L_0x0093:
            r2 = 0
        L_0x0094:
            int r4 = r8.f5231v0
            if (r4 == r2) goto L_0x009b
            r8.f5231v0 = r2
            r1 = 1
        L_0x009b:
            int[] r2 = r8.getState()
            if (r2 != 0) goto L_0x00a2
            goto L_0x00b5
        L_0x00a2:
            int r4 = r2.length
            r5 = 0
        L_0x00a4:
            if (r5 >= r4) goto L_0x00b5
            r6 = r2[r5]
            r7 = 16842912(0x10100a0, float:2.3694006E-38)
            if (r6 != r7) goto L_0x00b3
            boolean r2 = r8.f5206V
            if (r2 == 0) goto L_0x00b5
            r2 = 1
            goto L_0x00b6
        L_0x00b3:
            int r5 = r5 + r0
            goto L_0x00a4
        L_0x00b5:
            r2 = 0
        L_0x00b6:
            boolean r4 = r8.f5232w0
            if (r4 == r2) goto L_0x00d0
            android.graphics.drawable.Drawable r4 = r8.f5208X
            if (r4 == 0) goto L_0x00d0
            float r1 = r8.p()
            r8.f5232w0 = r2
            float r2 = r8.p()
            int r1 = (r1 > r2 ? 1 : (r1 == r2 ? 0 : -1))
            if (r1 == 0) goto L_0x00cf
            r1 = 1
            r2 = 1
            goto L_0x00d1
        L_0x00cf:
            r1 = 1
        L_0x00d0:
            r2 = 0
        L_0x00d1:
            android.content.res.ColorStateList r4 = r8.f5180B0
            if (r4 == 0) goto L_0x00dc
            int r5 = r8.f5233x0
            int r4 = r4.getColorForState(r9, r5)
            goto L_0x00dd
        L_0x00dc:
            r4 = 0
        L_0x00dd:
            int r5 = r8.f5233x0
            if (r5 == r4) goto L_0x00fe
            r8.f5233x0 = r4
            android.content.res.ColorStateList r1 = r8.f5180B0
            android.graphics.PorterDuff$Mode r4 = r8.f5182C0
            if (r1 == 0) goto L_0x00fa
            if (r4 != 0) goto L_0x00ec
            goto L_0x00fa
        L_0x00ec:
            int[] r5 = r8.getState()
            int r1 = r1.getColorForState(r5, r3)
            android.graphics.PorterDuffColorFilter r5 = new android.graphics.PorterDuffColorFilter
            r5.<init>(r1, r4)
            goto L_0x00fb
        L_0x00fa:
            r5 = 0
        L_0x00fb:
            r8.A0 = r5
            goto L_0x00ff
        L_0x00fe:
            r0 = r1
        L_0x00ff:
            android.graphics.drawable.Drawable r1 = r8.f5196L
            boolean r1 = t(r1)
            if (r1 == 0) goto L_0x010e
            android.graphics.drawable.Drawable r1 = r8.f5196L
            boolean r1 = r1.setState(r9)
            r0 = r0 | r1
        L_0x010e:
            android.graphics.drawable.Drawable r1 = r8.f5208X
            boolean r1 = t(r1)
            if (r1 == 0) goto L_0x011d
            android.graphics.drawable.Drawable r1 = r8.f5208X
            boolean r1 = r1.setState(r9)
            r0 = r0 | r1
        L_0x011d:
            android.graphics.drawable.Drawable r1 = r8.f5201Q
            boolean r1 = t(r1)
            if (r1 == 0) goto L_0x013a
            int r1 = r9.length
            int r4 = r10.length
            int r1 = r1 + r4
            int[] r1 = new int[r1]
            int r4 = r9.length
            java.lang.System.arraycopy(r9, r3, r1, r3, r4)
            int r9 = r9.length
            int r4 = r10.length
            java.lang.System.arraycopy(r10, r3, r1, r9, r4)
            android.graphics.drawable.Drawable r9 = r8.f5201Q
            boolean r9 = r9.setState(r1)
            r0 = r0 | r9
        L_0x013a:
            int[] r9 = I0.d.f287a
            android.graphics.drawable.RippleDrawable r9 = r8.f5202R
            boolean r9 = t(r9)
            if (r9 == 0) goto L_0x014b
            android.graphics.drawable.RippleDrawable r9 = r8.f5202R
            boolean r9 = r9.setState(r10)
            r0 = r0 | r9
        L_0x014b:
            if (r0 == 0) goto L_0x0150
            r8.invalidateSelf()
        L_0x0150:
            if (r2 == 0) goto L_0x0155
            r8.u()
        L_0x0155:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: z0.C0364e.v(int[], int[]):boolean");
    }

    public static void U(Drawable drawable) {
        if (drawable != null) {
            drawable.setCallback((Drawable.Callback) null);
        }
    }

    public static boolean s(ColorStateList colorStateList) {
        if (colorStateList == null || !colorStateList.isStateful()) {
            return false;
        }
        return true;
    }

    public static boolean t(Drawable drawable) {
        if (drawable == null || !drawable.isStateful()) {
            return false;
        }
        return true;
    }

    public final void A(float f2) {
        if (this.f5187F != f2) {
            this.f5187F = f2;
            K0.j e = this.f374f.f358a.e();
            e.e = new K0.a(f2);
            e.f399f = new K0.a(f2);
            e.f400g = new K0.a(f2);
            e.f401h = new K0.a(f2);
            setShapeAppearanceModel(e.a());
        }
    }

    public final void B(Drawable drawable) {
        Drawable drawable2 = this.f5196L;
        Drawable drawable3 = null;
        if (drawable2 == null) {
            drawable2 = null;
        } else if (drawable2 instanceof h) {
            drawable2 = ((i) ((h) drawable2)).f256k;
        }
        if (drawable2 != drawable) {
            float p2 = p();
            if (drawable != null) {
                drawable3 = C0320a.J0(drawable).mutate();
            }
            this.f5196L = drawable3;
            float p3 = p();
            U(drawable2);
            if (S()) {
                n(this.f5196L);
            }
            invalidateSelf();
            if (p2 != p3) {
                u();
            }
        }
    }

    public final void C(float f2) {
        if (this.f5198N != f2) {
            float p2 = p();
            this.f5198N = f2;
            float p3 = p();
            invalidateSelf();
            if (p2 != p3) {
                u();
            }
        }
    }

    public final void E(boolean z2) {
        if (this.f5195K != z2) {
            boolean S2 = S();
            this.f5195K = z2;
            boolean S3 = S();
            if (S2 != S3) {
                if (S3) {
                    n(this.f5196L);
                } else {
                    U(this.f5196L);
                }
                invalidateSelf();
                u();
            }
        }
    }

    public final void F(ColorStateList colorStateList) {
        if (this.f5188G != colorStateList) {
            this.f5188G = colorStateList;
            if (this.f5194J0) {
                f fVar = this.f374f;
                if (fVar.f361d != colorStateList) {
                    fVar.f361d = colorStateList;
                    onStateChange(getState());
                }
            }
            onStateChange(getState());
        }
    }

    public final void G(float f2) {
        if (this.f5190H != f2) {
            this.f5190H = f2;
            this.f5221k0.setStrokeWidth(f2);
            if (this.f5194J0) {
                this.f374f.f365j = f2;
                invalidateSelf();
            }
            invalidateSelf();
        }
    }

    public final void H(Drawable drawable) {
        Drawable drawable2 = this.f5201Q;
        Drawable drawable3 = null;
        if (drawable2 == null) {
            drawable2 = null;
        } else if (drawable2 instanceof h) {
            drawable2 = ((i) ((h) drawable2)).f256k;
        }
        if (drawable2 != drawable) {
            float q2 = q();
            if (drawable != null) {
                drawable3 = C0320a.J0(drawable).mutate();
            }
            this.f5201Q = drawable3;
            int[] iArr = d.f287a;
            this.f5202R = new RippleDrawable(d.a(this.I), this.f5201Q, f5179L0);
            float q3 = q();
            U(drawable2);
            if (T()) {
                n(this.f5201Q);
            }
            invalidateSelf();
            if (q2 != q3) {
                u();
            }
        }
    }

    public final void I(float f2) {
        if (this.f5218h0 != f2) {
            this.f5218h0 = f2;
            invalidateSelf();
            if (T()) {
                u();
            }
        }
    }

    public final void J(float f2) {
        if (this.f5204T != f2) {
            this.f5204T = f2;
            invalidateSelf();
            if (T()) {
                u();
            }
        }
    }

    public final void K(float f2) {
        if (this.f5217g0 != f2) {
            this.f5217g0 = f2;
            invalidateSelf();
            if (T()) {
                u();
            }
        }
    }

    public final void L(ColorStateList colorStateList) {
        if (this.f5203S != colorStateList) {
            this.f5203S = colorStateList;
            if (T()) {
                a.h(this.f5201Q, colorStateList);
            }
            onStateChange(getState());
        }
    }

    public final void M(boolean z2) {
        if (this.f5200P != z2) {
            boolean T2 = T();
            this.f5200P = z2;
            boolean T3 = T();
            if (T2 != T3) {
                if (T3) {
                    n(this.f5201Q);
                } else {
                    U(this.f5201Q);
                }
                invalidateSelf();
                u();
            }
        }
    }

    public final void N(float f2) {
        if (this.f5214d0 != f2) {
            float p2 = p();
            this.f5214d0 = f2;
            float p3 = p();
            invalidateSelf();
            if (p2 != p3) {
                u();
            }
        }
    }

    public final void O(float f2) {
        if (this.f5213c0 != f2) {
            float p2 = p();
            this.f5213c0 = f2;
            float p3 = p();
            invalidateSelf();
            if (p2 != p3) {
                u();
            }
        }
    }

    public final void P(ColorStateList colorStateList) {
        if (this.I != colorStateList) {
            this.I = colorStateList;
            this.f5186E0 = null;
            onStateChange(getState());
        }
    }

    public final void Q(H0.d dVar) {
        k kVar = this.f5225p0;
        if (kVar.f217f != dVar) {
            kVar.f217f = dVar;
            if (dVar != null) {
                TextPaint textPaint = kVar.f213a;
                Context context = this.f5220j0;
                E0.i iVar = kVar.f214b;
                dVar.f(context, textPaint, iVar);
                j jVar = (j) kVar.e.get();
                if (jVar != null) {
                    textPaint.drawableState = jVar.getState();
                }
                dVar.e(context, textPaint, iVar);
                kVar.f216d = true;
            }
            j jVar2 = (j) kVar.e.get();
            if (jVar2 != null) {
                C0364e eVar = (C0364e) jVar2;
                eVar.u();
                eVar.invalidateSelf();
                eVar.onStateChange(jVar2.getState());
            }
        }
    }

    public final boolean R() {
        if (!this.f5207W || this.f5208X == null || !this.f5232w0) {
            return false;
        }
        return true;
    }

    public final boolean S() {
        if (!this.f5195K || this.f5196L == null) {
            return false;
        }
        return true;
    }

    public final boolean T() {
        if (!this.f5200P || this.f5201Q == null) {
            return false;
        }
        return true;
    }

    public final void draw(Canvas canvas) {
        int i;
        int i2;
        int i3;
        RectF rectF;
        int i4;
        int i5;
        boolean z2;
        int i6;
        int i7;
        Canvas canvas2 = canvas;
        Rect bounds = getBounds();
        if (!bounds.isEmpty() && (i = this.f5234y0) != 0) {
            if (i < 255) {
                float f2 = (float) bounds.left;
                float f3 = (float) bounds.top;
                float f4 = (float) bounds.right;
                float f5 = (float) bounds.bottom;
                if (Build.VERSION.SDK_INT > 21) {
                    i7 = canvas.saveLayerAlpha(f2, f3, f4, f5, i);
                } else {
                    i7 = canvas.saveLayerAlpha(f2, f3, f4, f5, i, 31);
                }
                i2 = i7;
            } else {
                i2 = 0;
            }
            boolean z3 = this.f5194J0;
            Paint paint = this.f5221k0;
            RectF rectF2 = this.m0;
            if (!z3) {
                paint.setColor(this.f5226q0);
                paint.setStyle(Paint.Style.FILL);
                rectF2.set(bounds);
                canvas2.drawRoundRect(rectF2, r(), r(), paint);
            }
            if (!this.f5194J0) {
                paint.setColor(this.f5227r0);
                paint.setStyle(Paint.Style.FILL);
                ColorFilter colorFilter = this.f5235z0;
                if (colorFilter == null) {
                    colorFilter = this.A0;
                }
                paint.setColorFilter(colorFilter);
                rectF2.set(bounds);
                canvas2.drawRoundRect(rectF2, r(), r(), paint);
            }
            if (this.f5194J0) {
                super.draw(canvas);
            }
            if (this.f5190H > 0.0f && !this.f5194J0) {
                paint.setColor(this.f5229t0);
                paint.setStyle(Paint.Style.STROKE);
                if (!this.f5194J0) {
                    ColorFilter colorFilter2 = this.f5235z0;
                    if (colorFilter2 == null) {
                        colorFilter2 = this.A0;
                    }
                    paint.setColorFilter(colorFilter2);
                }
                float f6 = this.f5190H / 2.0f;
                rectF2.set(((float) bounds.left) + f6, ((float) bounds.top) + f6, ((float) bounds.right) - f6, ((float) bounds.bottom) - f6);
                float f7 = this.f5187F - (this.f5190H / 2.0f);
                canvas2.drawRoundRect(rectF2, f7, f7, paint);
            }
            paint.setColor(this.f5230u0);
            paint.setStyle(Paint.Style.FILL);
            rectF2.set(bounds);
            if (!this.f5194J0) {
                canvas2.drawRoundRect(rectF2, r(), r(), paint);
                i3 = 0;
            } else {
                RectF rectF3 = new RectF(bounds);
                Path path = this.f5224o0;
                f fVar = this.f374f;
                this.f390w.a(fVar.f358a, fVar.i, rectF3, this.f389v, path);
                RectF f8 = f();
                i3 = 0;
                d(canvas, paint, path, this.f374f.f358a, f8);
            }
            if (S()) {
                o(bounds, rectF2);
                float f9 = rectF2.left;
                float f10 = rectF2.top;
                canvas2.translate(f9, f10);
                this.f5196L.setBounds(i3, i3, (int) rectF2.width(), (int) rectF2.height());
                this.f5196L.draw(canvas2);
                canvas2.translate(-f9, -f10);
            }
            if (R()) {
                o(bounds, rectF2);
                float f11 = rectF2.left;
                float f12 = rectF2.top;
                canvas2.translate(f11, f12);
                this.f5208X.setBounds(i3, i3, (int) rectF2.width(), (int) rectF2.height());
                this.f5208X.draw(canvas2);
                canvas2.translate(-f11, -f12);
            }
            if (!this.f5191H0 || this.f5193J == null) {
                rectF = rectF2;
                i5 = i2;
                i4 = 255;
            } else {
                PointF pointF = this.f5223n0;
                pointF.set(0.0f, 0.0f);
                Paint.Align align = Paint.Align.LEFT;
                CharSequence charSequence = this.f5193J;
                k kVar = this.f5225p0;
                if (charSequence != null) {
                    float p2 = p() + this.f5212b0 + this.f5215e0;
                    if (C0320a.R(this) == 0) {
                        pointF.x = ((float) bounds.left) + p2;
                    } else {
                        pointF.x = ((float) bounds.right) - p2;
                        align = Paint.Align.RIGHT;
                    }
                    TextPaint textPaint = kVar.f213a;
                    Paint.FontMetrics fontMetrics = this.f5222l0;
                    textPaint.getFontMetrics(fontMetrics);
                    pointF.y = ((float) bounds.centerY()) - ((fontMetrics.descent + fontMetrics.ascent) / 2.0f);
                }
                rectF2.setEmpty();
                if (this.f5193J != null) {
                    float p3 = p() + this.f5212b0 + this.f5215e0;
                    float q2 = q() + this.f5219i0 + this.f5216f0;
                    if (C0320a.R(this) == 0) {
                        rectF2.left = ((float) bounds.left) + p3;
                        rectF2.right = ((float) bounds.right) - q2;
                    } else {
                        rectF2.left = ((float) bounds.left) + q2;
                        rectF2.right = ((float) bounds.right) - p3;
                    }
                    rectF2.top = (float) bounds.top;
                    rectF2.bottom = (float) bounds.bottom;
                }
                H0.d dVar = kVar.f217f;
                TextPaint textPaint2 = kVar.f213a;
                if (dVar != null) {
                    textPaint2.drawableState = getState();
                    kVar.f217f.e(this.f5220j0, textPaint2, kVar.f214b);
                }
                textPaint2.setTextAlign(align);
                if (Math.round(kVar.a(this.f5193J.toString())) > Math.round(rectF2.width())) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (z2) {
                    i6 = canvas.save();
                    canvas2.clipRect(rectF2);
                } else {
                    i6 = 0;
                }
                CharSequence charSequence2 = this.f5193J;
                if (z2 && this.f5189G0 != null) {
                    charSequence2 = TextUtils.ellipsize(charSequence2, textPaint2, rectF2.width(), this.f5189G0);
                }
                CharSequence charSequence3 = charSequence2;
                int length = charSequence3.length();
                int i8 = length;
                i4 = 255;
                float f13 = pointF.x;
                rectF = rectF2;
                float f14 = pointF.y;
                i5 = i2;
                canvas.drawText(charSequence3, 0, i8, f13, f14, textPaint2);
                if (z2) {
                    canvas2.restoreToCount(i6);
                }
            }
            if (T()) {
                rectF.setEmpty();
                if (T()) {
                    float f15 = this.f5219i0 + this.f5218h0;
                    if (C0320a.R(this) == 0) {
                        float f16 = ((float) bounds.right) - f15;
                        rectF.right = f16;
                        rectF.left = f16 - this.f5204T;
                    } else {
                        float f17 = ((float) bounds.left) + f15;
                        rectF.left = f17;
                        rectF.right = f17 + this.f5204T;
                    }
                    float exactCenterY = bounds.exactCenterY();
                    float f18 = this.f5204T;
                    float f19 = exactCenterY - (f18 / 2.0f);
                    rectF.top = f19;
                    rectF.bottom = f19 + f18;
                }
                float f20 = rectF.left;
                float f21 = rectF.top;
                canvas2.translate(f20, f21);
                this.f5201Q.setBounds(0, 0, (int) rectF.width(), (int) rectF.height());
                int[] iArr = d.f287a;
                this.f5202R.setBounds(this.f5201Q.getBounds());
                this.f5202R.jumpToCurrentState();
                this.f5202R.draw(canvas2);
                canvas2.translate(-f20, -f21);
            }
            if (this.f5234y0 < i4) {
                canvas2.restoreToCount(i5);
            }
        }
    }

    public final int getAlpha() {
        return this.f5234y0;
    }

    public final ColorFilter getColorFilter() {
        return this.f5235z0;
    }

    public final int getIntrinsicHeight() {
        return (int) this.f5185E;
    }

    public final int getIntrinsicWidth() {
        return Math.min(Math.round(q() + this.f5225p0.a(this.f5193J.toString()) + p() + this.f5212b0 + this.f5215e0 + this.f5216f0 + this.f5219i0), this.f5192I0);
    }

    public final void getOutline(Outline outline) {
        if (this.f5194J0) {
            super.getOutline(outline);
            return;
        }
        Rect bounds = getBounds();
        if (!bounds.isEmpty()) {
            outline.setRoundRect(bounds, this.f5187F);
        } else {
            outline.setRoundRect(0, 0, getIntrinsicWidth(), (int) this.f5185E, this.f5187F);
        }
        outline.setAlpha(((float) this.f5234y0) / 255.0f);
    }

    public final boolean isStateful() {
        H0.d dVar;
        ColorStateList colorStateList;
        if (s(this.f5181C) || s(this.f5183D) || s(this.f5188G) || (((dVar = this.f5225p0.f217f) != null && (colorStateList = dVar.f279j) != null && colorStateList.isStateful()) || ((this.f5207W && this.f5208X != null && this.f5206V) || t(this.f5196L) || t(this.f5208X) || s(this.f5180B0)))) {
            return true;
        }
        return false;
    }

    public final void n(Drawable drawable) {
        if (drawable != null) {
            drawable.setCallback(this);
            C0320a.y0(drawable, C0320a.R(this));
            drawable.setLevel(getLevel());
            drawable.setVisible(isVisible(), false);
            if (drawable == this.f5201Q) {
                if (drawable.isStateful()) {
                    drawable.setState(this.f5184D0);
                }
                a.h(drawable, this.f5203S);
                return;
            }
            Drawable drawable2 = this.f5196L;
            if (drawable == drawable2 && this.f5199O) {
                a.h(drawable2, this.f5197M);
            }
            if (drawable.isStateful()) {
                drawable.setState(getState());
            }
        }
    }

    public final boolean onStateChange(int[] iArr) {
        if (this.f5194J0) {
            super.onStateChange(iArr);
        }
        return v(iArr, this.f5184D0);
    }

    public final float r() {
        if (this.f5194J0) {
            return this.f374f.f358a.e.a(f());
        }
        return this.f5187F;
    }

    public final void setAlpha(int i) {
        if (this.f5234y0 != i) {
            this.f5234y0 = i;
            invalidateSelf();
        }
    }

    public final void setColorFilter(ColorFilter colorFilter) {
        if (this.f5235z0 != colorFilter) {
            this.f5235z0 = colorFilter;
            invalidateSelf();
        }
    }

    public final void setTintList(ColorStateList colorStateList) {
        if (this.f5180B0 != colorStateList) {
            this.f5180B0 = colorStateList;
            onStateChange(getState());
        }
    }

    public final void setTintMode(PorterDuff.Mode mode) {
        PorterDuffColorFilter porterDuffColorFilter;
        if (this.f5182C0 != mode) {
            this.f5182C0 = mode;
            ColorStateList colorStateList = this.f5180B0;
            if (colorStateList == null || mode == null) {
                porterDuffColorFilter = null;
            } else {
                porterDuffColorFilter = new PorterDuffColorFilter(colorStateList.getColorForState(getState(), 0), mode);
            }
            this.A0 = porterDuffColorFilter;
            invalidateSelf();
        }
    }

    public final void u() {
        C0363d dVar = (C0363d) this.F0.get();
        if (dVar != null) {
            Chip chip = (Chip) dVar;
            chip.b(chip.f2205u);
            chip.requestLayout();
            chip.invalidateOutline();
        }
    }

    public final void w(boolean z2) {
        if (this.f5206V != z2) {
            this.f5206V = z2;
            float p2 = p();
            if (!z2 && this.f5232w0) {
                this.f5232w0 = false;
            }
            float p3 = p();
            invalidateSelf();
            if (p2 != p3) {
                u();
            }
        }
    }

    public final void x(Drawable drawable) {
        if (this.f5208X != drawable) {
            float p2 = p();
            this.f5208X = drawable;
            float p3 = p();
            U(this.f5208X);
            n(this.f5208X);
            invalidateSelf();
            if (p2 != p3) {
                u();
            }
        }
    }

    public final void y(ColorStateList colorStateList) {
        Drawable drawable;
        if (this.f5209Y != colorStateList) {
            this.f5209Y = colorStateList;
            if (this.f5207W && (drawable = this.f5208X) != null && this.f5206V) {
                a.h(drawable, colorStateList);
            }
            onStateChange(getState());
        }
    }

    public final void z(boolean z2) {
        if (this.f5207W != z2) {
            boolean R2 = R();
            this.f5207W = z2;
            boolean R3 = R();
            if (R2 != R3) {
                if (R3) {
                    n(this.f5208X);
                } else {
                    U(this.f5208X);
                }
                invalidateSelf();
                u();
            }
        }
    }

    public C0364e(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 2130968795, 2131821616);
        h(context);
        this.f5220j0 = context;
        k kVar = new k(this);
        this.f5225p0 = kVar;
        this.f5193J = "";
        kVar.f213a.density = context.getResources().getDisplayMetrics().density;
        int[] iArr = f5178K0;
        setState(iArr);
        if (!Arrays.equals(this.f5184D0, iArr)) {
            this.f5184D0 = iArr;
            if (T()) {
                v(getState(), iArr);
            }
        }
        this.f5191H0 = true;
        int[] iArr2 = d.f287a;
        f5179L0.setTint(-1);
    }

    public final void invalidateDrawable(Drawable drawable) {
        Drawable.Callback callback = getCallback();
        if (callback != null) {
            callback.invalidateDrawable(this);
        }
    }

    public final void o(Rect rect, RectF rectF) {
        Drawable drawable;
        Drawable drawable2;
        rectF.setEmpty();
        if (S() || R()) {
            float f2 = this.f5212b0 + this.f5213c0;
            if (this.f5232w0) {
                drawable = this.f5208X;
            } else {
                drawable = this.f5196L;
            }
            float f3 = this.f5198N;
            if (f3 <= 0.0f && drawable != null) {
                f3 = (float) drawable.getIntrinsicWidth();
            }
            if (C0320a.R(this) == 0) {
                float f4 = ((float) rect.left) + f2;
                rectF.left = f4;
                rectF.right = f4 + f3;
            } else {
                float f5 = ((float) rect.right) - f2;
                rectF.right = f5;
                rectF.left = f5 - f3;
            }
            if (this.f5232w0) {
                drawable2 = this.f5208X;
            } else {
                drawable2 = this.f5196L;
            }
            float f6 = this.f5198N;
            if (f6 <= 0.0f && drawable2 != null) {
                f6 = (float) Math.ceil((double) TypedValue.applyDimension(1, (float) 24, this.f5220j0.getResources().getDisplayMetrics()));
                if (((float) drawable2.getIntrinsicHeight()) <= f6) {
                    f6 = (float) drawable2.getIntrinsicHeight();
                }
            }
            float exactCenterY = rect.exactCenterY() - (f6 / 2.0f);
            rectF.top = exactCenterY;
            rectF.bottom = exactCenterY + f6;
        }
    }

    public final boolean onLayoutDirectionChanged(int i) {
        boolean onLayoutDirectionChanged = super.onLayoutDirectionChanged(i);
        if (S()) {
            onLayoutDirectionChanged |= C0320a.y0(this.f5196L, i);
        }
        if (R()) {
            onLayoutDirectionChanged |= C0320a.y0(this.f5208X, i);
        }
        if (T()) {
            onLayoutDirectionChanged |= C0320a.y0(this.f5201Q, i);
        }
        if (!onLayoutDirectionChanged) {
            return true;
        }
        invalidateSelf();
        return true;
    }

    public final boolean onLevelChange(int i) {
        boolean onLevelChange = super.onLevelChange(i);
        if (S()) {
            onLevelChange |= this.f5196L.setLevel(i);
        }
        if (R()) {
            onLevelChange |= this.f5208X.setLevel(i);
        }
        if (T()) {
            onLevelChange |= this.f5201Q.setLevel(i);
        }
        if (onLevelChange) {
            invalidateSelf();
        }
        return onLevelChange;
    }

    public final float p() {
        Drawable drawable;
        if (!S() && !R()) {
            return 0.0f;
        }
        float f2 = this.f5213c0;
        if (this.f5232w0) {
            drawable = this.f5208X;
        } else {
            drawable = this.f5196L;
        }
        float f3 = this.f5198N;
        if (f3 <= 0.0f && drawable != null) {
            f3 = (float) drawable.getIntrinsicWidth();
        }
        return f3 + f2 + this.f5214d0;
    }

    public final float q() {
        if (T()) {
            return this.f5217g0 + this.f5204T + this.f5218h0;
        }
        return 0.0f;
    }

    public final void scheduleDrawable(Drawable drawable, Runnable runnable, long j2) {
        Drawable.Callback callback = getCallback();
        if (callback != null) {
            callback.scheduleDrawable(this, runnable, j2);
        }
    }

    public final boolean setVisible(boolean z2, boolean z3) {
        boolean visible = super.setVisible(z2, z3);
        if (S()) {
            visible |= this.f5196L.setVisible(z2, z3);
        }
        if (R()) {
            visible |= this.f5208X.setVisible(z2, z3);
        }
        if (T()) {
            visible |= this.f5201Q.setVisible(z2, z3);
        }
        if (visible) {
            invalidateSelf();
        }
        return visible;
    }

    public final void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        Drawable.Callback callback = getCallback();
        if (callback != null) {
            callback.unscheduleDrawable(this, runnable);
        }
    }
}
