package o;

import G.a;
import N.Q;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.support.v4.media.session.t;
import android.util.AttributeSet;
import android.widget.AbsSeekBar;
import g.C0096a;
import p0.C0320a;

/* renamed from: o.H  reason: case insensitive filesystem */
public final class C0253H extends C0248C {
    public final C0252G e;

    /* renamed from: f  reason: collision with root package name */
    public Drawable f4062f;

    /* renamed from: g  reason: collision with root package name */
    public ColorStateList f4063g = null;

    /* renamed from: h  reason: collision with root package name */
    public PorterDuff.Mode f4064h = null;
    public boolean i = false;

    /* renamed from: j  reason: collision with root package name */
    public boolean f4065j = false;

    public final void f() {
        Drawable drawable = this.f4062f;
        if (drawable == null) {
            return;
        }
        if (this.i || this.f4065j) {
            Drawable J02 = C0320a.J0(drawable.mutate());
            this.f4062f = J02;
            if (this.i) {
                a.h(J02, this.f4063g);
            }
            if (this.f4065j) {
                a.i(this.f4062f, this.f4064h);
            }
            if (this.f4062f.isStateful()) {
                this.f4062f.setState(this.e.getDrawableState());
            }
        }
    }

    public final void g(Canvas canvas) {
        int i2;
        if (this.f4062f != null) {
            C0252G g2 = this.e;
            int max = g2.getMax();
            int i3 = 1;
            if (max > 1) {
                int intrinsicWidth = this.f4062f.getIntrinsicWidth();
                int intrinsicHeight = this.f4062f.getIntrinsicHeight();
                if (intrinsicWidth >= 0) {
                    i2 = intrinsicWidth / 2;
                } else {
                    i2 = 1;
                }
                if (intrinsicHeight >= 0) {
                    i3 = intrinsicHeight / 2;
                }
                this.f4062f.setBounds(-i2, -i3, i2, i3);
                float width = ((float) ((g2.getWidth() - g2.getPaddingLeft()) - g2.getPaddingRight())) / ((float) max);
                int save = canvas.save();
                canvas.translate((float) g2.getPaddingLeft(), (float) (g2.getHeight() / 2));
                for (int i4 = 0; i4 <= max; i4++) {
                    this.f4062f.draw(canvas);
                    canvas.translate(width, 0.0f);
                }
                canvas.restoreToCount(save);
            }
        }
    }

    public C0253H(C0252G g2) {
        super((AbsSeekBar) g2);
        this.e = g2;
    }

    public final void b(AttributeSet attributeSet, int i2) {
        super.b(attributeSet, 2130969581);
        C0252G g2 = this.e;
        Context context = g2.getContext();
        int[] iArr = C0096a.f2524g;
        t A2 = t.A(context, attributeSet, iArr, 2130969581);
        Q.o(g2, g2.getContext(), iArr, attributeSet, (TypedArray) A2.f1132c, 2130969581);
        Drawable p2 = A2.p(0);
        if (p2 != null) {
            g2.setThumb(p2);
        }
        Drawable o2 = A2.o(1);
        Drawable drawable = this.f4062f;
        if (drawable != null) {
            drawable.setCallback((Drawable.Callback) null);
        }
        this.f4062f = o2;
        if (o2 != null) {
            o2.setCallback(g2);
            C0320a.y0(o2, g2.getLayoutDirection());
            if (o2.isStateful()) {
                o2.setState(g2.getDrawableState());
            }
            f();
        }
        g2.invalidate();
        TypedArray typedArray = (TypedArray) A2.f1132c;
        if (typedArray.hasValue(3)) {
            this.f4064h = C0297p0.c(typedArray.getInt(3, -1), this.f4064h);
            this.f4065j = true;
        }
        if (typedArray.hasValue(2)) {
            this.f4063g = A2.n(2);
            this.i = true;
        }
        A2.C();
        f();
    }
}
