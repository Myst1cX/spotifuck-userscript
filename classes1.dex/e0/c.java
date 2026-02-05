package E0;

import H0.a;
import L.j;
import L.k;
import N.Q;
import android.animation.TimeInterpolator;
import android.content.res.ColorStateList;
import android.content.res.Configuration;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.os.Build;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.Log;
import android.view.Gravity;
import android.view.animation.LinearInterpolator;
import com.google.android.material.textfield.TextInputLayout;
import java.util.WeakHashMap;
import p0.C0320a;
import r0.C0324a;

public final class c {

    /* renamed from: A  reason: collision with root package name */
    public CharSequence f135A;

    /* renamed from: B  reason: collision with root package name */
    public CharSequence f136B;

    /* renamed from: C  reason: collision with root package name */
    public boolean f137C;

    /* renamed from: D  reason: collision with root package name */
    public final boolean f138D = true;

    /* renamed from: E  reason: collision with root package name */
    public Bitmap f139E;

    /* renamed from: F  reason: collision with root package name */
    public float f140F;

    /* renamed from: G  reason: collision with root package name */
    public float f141G;

    /* renamed from: H  reason: collision with root package name */
    public float f142H;
    public float I;

    /* renamed from: J  reason: collision with root package name */
    public float f143J;

    /* renamed from: K  reason: collision with root package name */
    public int f144K;

    /* renamed from: L  reason: collision with root package name */
    public int[] f145L;

    /* renamed from: M  reason: collision with root package name */
    public boolean f146M;

    /* renamed from: N  reason: collision with root package name */
    public final TextPaint f147N;

    /* renamed from: O  reason: collision with root package name */
    public final TextPaint f148O;

    /* renamed from: P  reason: collision with root package name */
    public LinearInterpolator f149P;

    /* renamed from: Q  reason: collision with root package name */
    public LinearInterpolator f150Q;

    /* renamed from: R  reason: collision with root package name */
    public float f151R;

    /* renamed from: S  reason: collision with root package name */
    public float f152S;

    /* renamed from: T  reason: collision with root package name */
    public float f153T;

    /* renamed from: U  reason: collision with root package name */
    public ColorStateList f154U;

    /* renamed from: V  reason: collision with root package name */
    public float f155V;

    /* renamed from: W  reason: collision with root package name */
    public float f156W;

    /* renamed from: X  reason: collision with root package name */
    public float f157X;

    /* renamed from: Y  reason: collision with root package name */
    public StaticLayout f158Y;

    /* renamed from: Z  reason: collision with root package name */
    public float f159Z;

    /* renamed from: a  reason: collision with root package name */
    public final TextInputLayout f160a;

    /* renamed from: a0  reason: collision with root package name */
    public float f161a0;

    /* renamed from: b  reason: collision with root package name */
    public float f162b;

    /* renamed from: b0  reason: collision with root package name */
    public float f163b0;

    /* renamed from: c  reason: collision with root package name */
    public final Rect f164c;

    /* renamed from: c0  reason: collision with root package name */
    public CharSequence f165c0;

    /* renamed from: d  reason: collision with root package name */
    public final Rect f166d;

    /* renamed from: d0  reason: collision with root package name */
    public final int f167d0 = 1;
    public final RectF e;

    /* renamed from: e0  reason: collision with root package name */
    public final float f168e0 = 1.0f;

    /* renamed from: f  reason: collision with root package name */
    public int f169f = 16;

    /* renamed from: f0  reason: collision with root package name */
    public final int f170f0 = h.f198l;

    /* renamed from: g  reason: collision with root package name */
    public int f171g = 16;

    /* renamed from: h  reason: collision with root package name */
    public float f172h = 15.0f;
    public float i = 15.0f;

    /* renamed from: j  reason: collision with root package name */
    public ColorStateList f173j;

    /* renamed from: k  reason: collision with root package name */
    public ColorStateList f174k;

    /* renamed from: l  reason: collision with root package name */
    public float f175l;

    /* renamed from: m  reason: collision with root package name */
    public float f176m;

    /* renamed from: n  reason: collision with root package name */
    public float f177n;

    /* renamed from: o  reason: collision with root package name */
    public float f178o;

    /* renamed from: p  reason: collision with root package name */
    public float f179p;

    /* renamed from: q  reason: collision with root package name */
    public float f180q;

    /* renamed from: r  reason: collision with root package name */
    public Typeface f181r;

    /* renamed from: s  reason: collision with root package name */
    public Typeface f182s;

    /* renamed from: t  reason: collision with root package name */
    public Typeface f183t;

    /* renamed from: u  reason: collision with root package name */
    public Typeface f184u;

    /* renamed from: v  reason: collision with root package name */
    public Typeface f185v;

    /* renamed from: w  reason: collision with root package name */
    public Typeface f186w;

    /* renamed from: x  reason: collision with root package name */
    public Typeface f187x;

    /* renamed from: y  reason: collision with root package name */
    public a f188y;

    /* renamed from: z  reason: collision with root package name */
    public final TextUtils.TruncateAt f189z = TextUtils.TruncateAt.END;

    public final int e(ColorStateList colorStateList) {
        if (colorStateList == null) {
            return 0;
        }
        int[] iArr = this.f145L;
        if (iArr != null) {
            return colorStateList.getColorForState(iArr, 0);
        }
        return colorStateList.getDefaultColor();
    }

    public final void k(float f2) {
        if (f2 < 0.0f) {
            f2 = 0.0f;
        } else if (f2 > 1.0f) {
            f2 = 1.0f;
        }
        if (f2 != this.f162b) {
            this.f162b = f2;
            Rect rect = this.f164c;
            Rect rect2 = this.f166d;
            float f3 = f((float) rect.left, (float) rect2.left, f2, this.f149P);
            RectF rectF = this.e;
            rectF.left = f3;
            rectF.top = f(this.f175l, this.f176m, f2, this.f149P);
            rectF.right = f((float) rect.right, (float) rect2.right, f2, this.f149P);
            rectF.bottom = f((float) rect.bottom, (float) rect2.bottom, f2, this.f149P);
            this.f179p = f(this.f177n, this.f178o, f2, this.f149P);
            this.f180q = f(this.f175l, this.f176m, f2, this.f149P);
            l(f2);
            a0.a aVar = C0324a.f4556b;
            this.f161a0 = 1.0f - f(0.0f, 1.0f, 1.0f - f2, aVar);
            WeakHashMap weakHashMap = Q.f509a;
            TextInputLayout textInputLayout = this.f160a;
            textInputLayout.postInvalidateOnAnimation();
            this.f163b0 = f(1.0f, 0.0f, f2, aVar);
            textInputLayout.postInvalidateOnAnimation();
            ColorStateList colorStateList = this.f174k;
            ColorStateList colorStateList2 = this.f173j;
            TextPaint textPaint = this.f147N;
            if (colorStateList != colorStateList2) {
                textPaint.setColor(a(e(colorStateList2), e(this.f174k), f2));
            } else {
                textPaint.setColor(e(colorStateList));
            }
            float f4 = this.f155V;
            float f5 = this.f156W;
            if (f4 != f5) {
                textPaint.setLetterSpacing(f(f5, f4, f2, aVar));
            } else {
                textPaint.setLetterSpacing(f4);
            }
            this.f142H = C0324a.a(0.0f, this.f151R, f2);
            this.I = C0324a.a(0.0f, this.f152S, f2);
            this.f143J = C0324a.a(0.0f, this.f153T, f2);
            int a2 = a(0, e(this.f154U), f2);
            this.f144K = a2;
            textPaint.setShadowLayer(this.f142H, this.I, this.f143J, a2);
            textInputLayout.postInvalidateOnAnimation();
        }
    }

    public final void l(float f2) {
        c(f2, false);
        WeakHashMap weakHashMap = Q.f509a;
        this.f160a.postInvalidateOnAnimation();
    }

    public static int a(int i2, int i3, float f2) {
        float f3 = 1.0f - f2;
        return Color.argb(Math.round((((float) Color.alpha(i3)) * f2) + (((float) Color.alpha(i2)) * f3)), Math.round((((float) Color.red(i3)) * f2) + (((float) Color.red(i2)) * f3)), Math.round((((float) Color.green(i3)) * f2) + (((float) Color.green(i2)) * f3)), Math.round((((float) Color.blue(i3)) * f2) + (((float) Color.blue(i2)) * f3)));
    }

    public static float f(float f2, float f3, float f4, TimeInterpolator timeInterpolator) {
        if (timeInterpolator != null) {
            f4 = timeInterpolator.getInterpolation(f4);
        }
        return C0324a.a(f2, f3, f4);
    }

    public final boolean b(CharSequence charSequence) {
        j jVar;
        WeakHashMap weakHashMap = Q.f509a;
        boolean z2 = true;
        if (this.f160a.getLayoutDirection() != 1) {
            z2 = false;
        }
        if (!this.f138D) {
            return z2;
        }
        if (z2) {
            jVar = k.f467d;
        } else {
            jVar = k.f466c;
        }
        return jVar.b(charSequence, charSequence.length());
    }

    public final void c(float f2, boolean z2) {
        boolean z3;
        float f3;
        float f4;
        Typeface typeface;
        boolean z4;
        StaticLayout staticLayout;
        Layout.Alignment alignment;
        boolean z5;
        boolean z6;
        boolean z7;
        boolean z8;
        boolean z9;
        if (this.f135A != null) {
            float width = (float) this.f166d.width();
            float width2 = (float) this.f164c.width();
            if (Math.abs(f2 - 1.0f) < 1.0E-5f) {
                z3 = true;
            } else {
                z3 = false;
            }
            if (z3) {
                f4 = this.i;
                f3 = this.f155V;
                this.f140F = 1.0f;
                typeface = this.f181r;
            } else {
                float f5 = this.f172h;
                float f6 = this.f156W;
                Typeface typeface2 = this.f184u;
                if (Math.abs(f2 - 0.0f) < 1.0E-5f) {
                    this.f140F = 1.0f;
                } else {
                    this.f140F = f(this.f172h, this.i, f2, this.f150Q) / this.f172h;
                }
                float f7 = this.i / this.f172h;
                float f8 = width2 * f7;
                if (z2 || f8 <= width) {
                    width = width2;
                } else {
                    width = Math.min(width / f7, width2);
                }
                f4 = f5;
                f3 = f6;
                typeface = typeface2;
            }
            TextPaint textPaint = this.f147N;
            if (width > 0.0f) {
                if (this.f141G != f4) {
                    z5 = true;
                } else {
                    z5 = false;
                }
                if (this.f157X != f3) {
                    z6 = true;
                } else {
                    z6 = false;
                }
                if (this.f187x != typeface) {
                    z7 = true;
                } else {
                    z7 = false;
                }
                StaticLayout staticLayout2 = this.f158Y;
                if (staticLayout2 == null || width == ((float) staticLayout2.getWidth())) {
                    z8 = false;
                } else {
                    z8 = true;
                }
                if (z5 || z6 || z8 || z7 || this.f146M) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                this.f141G = f4;
                this.f157X = f3;
                this.f187x = typeface;
                this.f146M = false;
                if (this.f140F != 1.0f) {
                    z9 = true;
                } else {
                    z9 = false;
                }
                textPaint.setLinearText(z9);
            } else {
                z4 = false;
            }
            if (this.f136B == null || z4) {
                textPaint.setTextSize(this.f141G);
                textPaint.setTypeface(this.f187x);
                textPaint.setLetterSpacing(this.f157X);
                boolean b2 = b(this.f135A);
                this.f137C = b2;
                int i2 = this.f167d0;
                if (i2 <= 1 || b2) {
                    i2 = 1;
                }
                if (i2 == 1) {
                    try {
                        alignment = Layout.Alignment.ALIGN_NORMAL;
                    } catch (g e2) {
                        Log.e("CollapsingTextHelper", e2.getCause().getMessage(), e2);
                        staticLayout = null;
                    }
                } else {
                    int absoluteGravity = Gravity.getAbsoluteGravity(this.f169f, b2 ? 1 : 0) & 7;
                    if (absoluteGravity == 1) {
                        alignment = Layout.Alignment.ALIGN_CENTER;
                    } else if (absoluteGravity != 5) {
                        if (this.f137C) {
                            alignment = Layout.Alignment.ALIGN_OPPOSITE;
                        } else {
                            alignment = Layout.Alignment.ALIGN_NORMAL;
                        }
                    } else if (this.f137C) {
                        alignment = Layout.Alignment.ALIGN_NORMAL;
                    } else {
                        alignment = Layout.Alignment.ALIGN_OPPOSITE;
                    }
                }
                h hVar = new h(this.f135A, textPaint, (int) width);
                hVar.f210k = this.f189z;
                hVar.f209j = b2;
                hVar.e = alignment;
                hVar.i = false;
                hVar.f206f = i2;
                hVar.f207g = this.f168e0;
                hVar.f208h = this.f170f0;
                staticLayout = hVar.a();
                staticLayout.getClass();
                this.f158Y = staticLayout;
                this.f136B = staticLayout.getText();
            }
        }
    }

    public final float d() {
        TextPaint textPaint = this.f148O;
        textPaint.setTextSize(this.i);
        textPaint.setTypeface(this.f181r);
        textPaint.setLetterSpacing(this.f155V);
        return -textPaint.ascent();
    }

    public final void g(Configuration configuration) {
        if (Build.VERSION.SDK_INT >= 31) {
            Typeface typeface = this.f183t;
            if (typeface != null) {
                this.f182s = C0320a.i0(configuration, typeface);
            }
            Typeface typeface2 = this.f186w;
            if (typeface2 != null) {
                this.f185v = C0320a.i0(configuration, typeface2);
            }
            Typeface typeface3 = this.f182s;
            if (typeface3 == null) {
                typeface3 = this.f183t;
            }
            this.f181r = typeface3;
            Typeface typeface4 = this.f185v;
            if (typeface4 == null) {
                typeface4 = this.f186w;
            }
            this.f184u = typeface4;
            h(true);
        }
    }

    public final void h(boolean z2) {
        float f2;
        float f3;
        StaticLayout staticLayout;
        boolean z3 = z2;
        TextInputLayout textInputLayout = this.f160a;
        if ((textInputLayout.getHeight() > 0 && textInputLayout.getWidth() > 0) || z3) {
            c(1.0f, z3);
            CharSequence charSequence = this.f136B;
            TextPaint textPaint = this.f147N;
            if (!(charSequence == null || (staticLayout = this.f158Y) == null)) {
                this.f165c0 = TextUtils.ellipsize(charSequence, textPaint, (float) staticLayout.getWidth(), this.f189z);
            }
            CharSequence charSequence2 = this.f165c0;
            if (charSequence2 != null) {
                this.f159Z = textPaint.measureText(charSequence2, 0, charSequence2.length());
            } else {
                this.f159Z = 0.0f;
            }
            int absoluteGravity = Gravity.getAbsoluteGravity(this.f171g, this.f137C ? 1 : 0);
            int i2 = absoluteGravity & 112;
            Rect rect = this.f166d;
            if (i2 == 48) {
                this.f176m = (float) rect.top;
            } else if (i2 != 80) {
                this.f176m = ((float) rect.centerY()) - ((textPaint.descent() - textPaint.ascent()) / 2.0f);
            } else {
                this.f176m = textPaint.ascent() + ((float) rect.bottom);
            }
            int i3 = absoluteGravity & 8388615;
            if (i3 == 1) {
                this.f178o = ((float) rect.centerX()) - (this.f159Z / 2.0f);
            } else if (i3 != 5) {
                this.f178o = (float) rect.left;
            } else {
                this.f178o = ((float) rect.right) - this.f159Z;
            }
            c(0.0f, z3);
            StaticLayout staticLayout2 = this.f158Y;
            if (staticLayout2 != null) {
                f2 = (float) staticLayout2.getHeight();
            } else {
                f2 = 0.0f;
            }
            StaticLayout staticLayout3 = this.f158Y;
            if (staticLayout3 == null || this.f167d0 <= 1) {
                CharSequence charSequence3 = this.f136B;
                if (charSequence3 != null) {
                    f3 = textPaint.measureText(charSequence3, 0, charSequence3.length());
                } else {
                    f3 = 0.0f;
                }
            } else {
                f3 = (float) staticLayout3.getWidth();
            }
            StaticLayout staticLayout4 = this.f158Y;
            if (staticLayout4 != null) {
                staticLayout4.getLineCount();
            }
            int absoluteGravity2 = Gravity.getAbsoluteGravity(this.f169f, this.f137C ? 1 : 0);
            int i4 = absoluteGravity2 & 112;
            Rect rect2 = this.f164c;
            if (i4 == 48) {
                this.f175l = (float) rect2.top;
            } else if (i4 != 80) {
                this.f175l = ((float) rect2.centerY()) - (f2 / 2.0f);
            } else {
                this.f175l = textPaint.descent() + (((float) rect2.bottom) - f2);
            }
            int i5 = absoluteGravity2 & 8388615;
            if (i5 == 1) {
                this.f177n = ((float) rect2.centerX()) - (f3 / 2.0f);
            } else if (i5 != 5) {
                this.f177n = (float) rect2.left;
            } else {
                this.f177n = ((float) rect2.right) - f3;
            }
            Bitmap bitmap = this.f139E;
            if (bitmap != null) {
                bitmap.recycle();
                this.f139E = null;
            }
            l(this.f162b);
            float f4 = this.f162b;
            float f5 = f((float) rect2.left, (float) rect.left, f4, this.f149P);
            RectF rectF = this.e;
            rectF.left = f5;
            rectF.top = f(this.f175l, this.f176m, f4, this.f149P);
            rectF.right = f((float) rect2.right, (float) rect.right, f4, this.f149P);
            rectF.bottom = f((float) rect2.bottom, (float) rect.bottom, f4, this.f149P);
            this.f179p = f(this.f177n, this.f178o, f4, this.f149P);
            this.f180q = f(this.f175l, this.f176m, f4, this.f149P);
            l(f4);
            a0.a aVar = C0324a.f4556b;
            this.f161a0 = 1.0f - f(0.0f, 1.0f, 1.0f - f4, aVar);
            WeakHashMap weakHashMap = Q.f509a;
            textInputLayout.postInvalidateOnAnimation();
            this.f163b0 = f(1.0f, 0.0f, f4, aVar);
            textInputLayout.postInvalidateOnAnimation();
            ColorStateList colorStateList = this.f174k;
            ColorStateList colorStateList2 = this.f173j;
            if (colorStateList != colorStateList2) {
                textPaint.setColor(a(e(colorStateList2), e(this.f174k), f4));
            } else {
                textPaint.setColor(e(colorStateList));
            }
            float f6 = this.f155V;
            float f7 = this.f156W;
            if (f6 != f7) {
                textPaint.setLetterSpacing(f(f7, f6, f4, aVar));
            } else {
                textPaint.setLetterSpacing(f6);
            }
            this.f142H = C0324a.a(0.0f, this.f151R, f4);
            this.I = C0324a.a(0.0f, this.f152S, f4);
            this.f143J = C0324a.a(0.0f, this.f153T, f4);
            int a2 = a(0, e(this.f154U), f4);
            this.f144K = a2;
            textPaint.setShadowLayer(this.f142H, this.I, this.f143J, a2);
            textInputLayout.postInvalidateOnAnimation();
        }
    }

    public final void i(ColorStateList colorStateList) {
        if (this.f174k != colorStateList || this.f173j != colorStateList) {
            this.f174k = colorStateList;
            this.f173j = colorStateList;
            h(false);
        }
    }

    public final boolean j(Typeface typeface) {
        a aVar = this.f188y;
        if (aVar != null) {
            aVar.f266q = true;
        }
        if (this.f183t == typeface) {
            return false;
        }
        this.f183t = typeface;
        Typeface i02 = C0320a.i0(this.f160a.getContext().getResources().getConfiguration(), typeface);
        this.f182s = i02;
        if (i02 == null) {
            i02 = this.f183t;
        }
        this.f181r = i02;
        return true;
    }

    public c(TextInputLayout textInputLayout) {
        this.f160a = textInputLayout;
        TextPaint textPaint = new TextPaint(129);
        this.f147N = textPaint;
        this.f148O = new TextPaint(textPaint);
        this.f166d = new Rect();
        this.f164c = new Rect();
        this.e = new RectF();
        g(textInputLayout.getContext().getResources().getConfiguration());
    }

    public final void m(Typeface typeface) {
        boolean z2;
        boolean j2 = j(typeface);
        if (this.f186w != typeface) {
            this.f186w = typeface;
            Typeface i02 = C0320a.i0(this.f160a.getContext().getResources().getConfiguration(), typeface);
            this.f185v = i02;
            if (i02 == null) {
                i02 = this.f186w;
            }
            this.f184u = i02;
            z2 = true;
        } else {
            z2 = false;
        }
        if (j2 || z2) {
            h(false);
        }
    }
}
