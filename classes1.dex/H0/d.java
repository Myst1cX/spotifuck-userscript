package H0;

import E.b;
import E.r;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Typeface;
import android.text.TextPaint;
import android.util.TypedValue;
import p0.C0320a;
import q0.C0322a;

public final class d {

    /* renamed from: a  reason: collision with root package name */
    public final ColorStateList f272a;

    /* renamed from: b  reason: collision with root package name */
    public final String f273b;

    /* renamed from: c  reason: collision with root package name */
    public final int f274c;

    /* renamed from: d  reason: collision with root package name */
    public final int f275d;
    public final float e;

    /* renamed from: f  reason: collision with root package name */
    public final float f276f;

    /* renamed from: g  reason: collision with root package name */
    public final float f277g;

    /* renamed from: h  reason: collision with root package name */
    public final boolean f278h;
    public final float i;

    /* renamed from: j  reason: collision with root package name */
    public ColorStateList f279j;

    /* renamed from: k  reason: collision with root package name */
    public float f280k;

    /* renamed from: l  reason: collision with root package name */
    public final int f281l;

    /* renamed from: m  reason: collision with root package name */
    public boolean f282m = false;

    /* renamed from: n  reason: collision with root package name */
    public Typeface f283n;

    public final boolean d(Context context) {
        Typeface typeface = null;
        int i2 = this.f281l;
        if (i2 != 0) {
            ThreadLocal threadLocal = r.f121a;
            if (!context.isRestricted()) {
                typeface = r.c(context, i2, new TypedValue(), 0, (b) null, false, true);
            }
        }
        if (typeface != null) {
            return true;
        }
        return false;
    }

    public final void a() {
        String str;
        Typeface typeface = this.f283n;
        int i2 = this.f274c;
        if (typeface == null && (str = this.f273b) != null) {
            this.f283n = Typeface.create(str, i2);
        }
        if (this.f283n == null) {
            int i3 = this.f275d;
            if (i3 == 1) {
                this.f283n = Typeface.SANS_SERIF;
            } else if (i3 == 2) {
                this.f283n = Typeface.SERIF;
            } else if (i3 != 3) {
                this.f283n = Typeface.DEFAULT;
            } else {
                this.f283n = Typeface.MONOSPACE;
            }
            this.f283n = Typeface.create(this.f283n, i2);
        }
    }

    public final Typeface b(Context context) {
        if (this.f282m) {
            return this.f283n;
        }
        if (!context.isRestricted()) {
            try {
                Typeface b2 = r.b(context, this.f281l);
                this.f283n = b2;
                if (b2 != null) {
                    this.f283n = Typeface.create(b2, this.f274c);
                }
            } catch (Resources.NotFoundException | Exception | UnsupportedOperationException unused) {
            }
        }
        a();
        this.f282m = true;
        return this.f283n;
    }

    public d(Context context, int i2) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(i2, C0322a.f4506y);
        this.f280k = obtainStyledAttributes.getDimension(0, 0.0f);
        this.f279j = C0320a.J(context, obtainStyledAttributes, 3);
        C0320a.J(context, obtainStyledAttributes, 4);
        C0320a.J(context, obtainStyledAttributes, 5);
        this.f274c = obtainStyledAttributes.getInt(2, 0);
        this.f275d = obtainStyledAttributes.getInt(1, 1);
        int i3 = !obtainStyledAttributes.hasValue(12) ? 10 : 12;
        this.f281l = obtainStyledAttributes.getResourceId(i3, 0);
        this.f273b = obtainStyledAttributes.getString(i3);
        obtainStyledAttributes.getBoolean(14, false);
        this.f272a = C0320a.J(context, obtainStyledAttributes, 6);
        this.e = obtainStyledAttributes.getFloat(7, 0.0f);
        this.f276f = obtainStyledAttributes.getFloat(8, 0.0f);
        this.f277g = obtainStyledAttributes.getFloat(9, 0.0f);
        obtainStyledAttributes.recycle();
        TypedArray obtainStyledAttributes2 = context.obtainStyledAttributes(i2, C0322a.f4498q);
        this.f278h = obtainStyledAttributes2.hasValue(0);
        this.i = obtainStyledAttributes2.getFloat(0, 0.0f);
        obtainStyledAttributes2.recycle();
    }

    public final void c(Context context, C0320a aVar) {
        if (d(context)) {
            b(context);
        } else {
            a();
        }
        int i2 = this.f281l;
        if (i2 == 0) {
            this.f282m = true;
        }
        if (this.f282m) {
            aVar.l0(this.f283n, true);
            return;
        }
        try {
            b bVar = new b(this, aVar);
            ThreadLocal threadLocal = r.f121a;
            if (context.isRestricted()) {
                bVar.a(-4);
                return;
            }
            r.c(context, i2, new TypedValue(), 0, bVar, false, false);
        } catch (Resources.NotFoundException unused) {
            this.f282m = true;
            aVar.k0(1);
        } catch (Exception unused2) {
            this.f282m = true;
            aVar.k0(-3);
        }
    }

    public final void e(Context context, TextPaint textPaint, C0320a aVar) {
        int i2;
        int i3;
        f(context, textPaint, aVar);
        ColorStateList colorStateList = this.f279j;
        if (colorStateList != null) {
            i2 = colorStateList.getColorForState(textPaint.drawableState, colorStateList.getDefaultColor());
        } else {
            i2 = -16777216;
        }
        textPaint.setColor(i2);
        ColorStateList colorStateList2 = this.f272a;
        if (colorStateList2 != null) {
            i3 = colorStateList2.getColorForState(textPaint.drawableState, colorStateList2.getDefaultColor());
        } else {
            i3 = 0;
        }
        textPaint.setShadowLayer(this.f277g, this.e, this.f276f, i3);
    }

    public final void f(Context context, TextPaint textPaint, C0320a aVar) {
        if (d(context)) {
            g(context, textPaint, b(context));
            return;
        }
        a();
        g(context, textPaint, this.f283n);
        c(context, new c(this, context, textPaint, aVar));
    }

    public final void g(Context context, TextPaint textPaint, Typeface typeface) {
        boolean z2;
        float f2;
        Typeface i02 = C0320a.i0(context.getResources().getConfiguration(), typeface);
        if (i02 != null) {
            typeface = i02;
        }
        textPaint.setTypeface(typeface);
        int i2 = (~typeface.getStyle()) & this.f274c;
        if ((i2 & 1) != 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        textPaint.setFakeBoldText(z2);
        if ((i2 & 2) != 0) {
            f2 = -0.25f;
        } else {
            f2 = 0.0f;
        }
        textPaint.setTextSkewX(f2);
        textPaint.setTextSize(this.f280k);
        if (this.f278h) {
            textPaint.setLetterSpacing(this.i);
        }
    }
}
