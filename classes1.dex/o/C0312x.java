package o;

import N.Q;
import T.f;
import T0.g;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.support.v4.media.session.t;
import android.util.AttributeSet;
import android.widget.ImageView;
import g.C0096a;
import g1.o;

/* renamed from: o.x  reason: case insensitive filesystem */
public final class C0312x {

    /* renamed from: a  reason: collision with root package name */
    public final ImageView f4322a;

    /* renamed from: b  reason: collision with root package name */
    public o f4323b;

    /* renamed from: c  reason: collision with root package name */
    public o f4324c;

    /* renamed from: d  reason: collision with root package name */
    public int f4325d = 0;

    /* JADX WARNING: type inference failed for: r2v4, types: [g1.o, java.lang.Object] */
    public final void a() {
        ImageView imageView = this.f4322a;
        Drawable drawable = imageView.getDrawable();
        if (drawable != null) {
            C0297p0.a(drawable);
        }
        if (drawable != null) {
            int i = Build.VERSION.SDK_INT;
            if (i <= 21 && i == 21) {
                if (this.f4324c == null) {
                    this.f4324c = new Object();
                }
                o oVar = this.f4324c;
                oVar.f2744c = null;
                oVar.f2743b = false;
                oVar.f2745d = null;
                oVar.f2742a = false;
                ColorStateList a2 = f.a(imageView);
                if (a2 != null) {
                    oVar.f2743b = true;
                    oVar.f2744c = a2;
                }
                PorterDuff.Mode b2 = f.b(imageView);
                if (b2 != null) {
                    oVar.f2742a = true;
                    oVar.f2745d = b2;
                }
                if (oVar.f2743b || oVar.f2742a) {
                    C0302s.e(drawable, oVar, imageView.getDrawableState());
                    return;
                }
            }
            o oVar2 = this.f4323b;
            if (oVar2 != null) {
                C0302s.e(drawable, oVar2, imageView.getDrawableState());
            }
        }
    }

    public final void b(AttributeSet attributeSet, int i) {
        Drawable drawable;
        Drawable drawable2;
        ImageView imageView = this.f4322a;
        Context context = imageView.getContext();
        int[] iArr = C0096a.f2523f;
        t A2 = t.A(context, attributeSet, iArr, i);
        Q.o(imageView, imageView.getContext(), iArr, attributeSet, (TypedArray) A2.f1132c, i);
        try {
            Drawable drawable3 = imageView.getDrawable();
            TypedArray typedArray = (TypedArray) A2.f1132c;
            if (drawable3 == null) {
                int resourceId = typedArray.getResourceId(1, -1);
                if (!(resourceId == -1 || (drawable3 = g.n(imageView.getContext(), resourceId)) == null)) {
                    imageView.setImageDrawable(drawable3);
                }
            }
            if (drawable3 != null) {
                C0297p0.a(drawable3);
            }
            if (typedArray.hasValue(2)) {
                ColorStateList n2 = A2.n(2);
                int i2 = Build.VERSION.SDK_INT;
                f.c(imageView, n2);
                if (!(i2 != 21 || (drawable2 = imageView.getDrawable()) == null || f.a(imageView) == null)) {
                    if (drawable2.isStateful()) {
                        drawable2.setState(imageView.getDrawableState());
                    }
                    imageView.setImageDrawable(drawable2);
                }
            }
            if (typedArray.hasValue(3)) {
                PorterDuff.Mode c2 = C0297p0.c(typedArray.getInt(3, -1), (PorterDuff.Mode) null);
                int i3 = Build.VERSION.SDK_INT;
                f.d(imageView, c2);
                if (!(i3 != 21 || (drawable = imageView.getDrawable()) == null || f.a(imageView) == null)) {
                    if (drawable.isStateful()) {
                        drawable.setState(imageView.getDrawableState());
                    }
                    imageView.setImageDrawable(drawable);
                }
            }
            A2.C();
        } catch (Throwable th) {
            A2.C();
            throw th;
        }
    }

    public C0312x(ImageView imageView) {
        this.f4322a = imageView;
    }
}
