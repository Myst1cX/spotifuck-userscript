package o;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.os.Build;
import f0.b;
import g1.o;

/* renamed from: o.s  reason: case insensitive filesystem */
public final class C0302s {

    /* renamed from: b  reason: collision with root package name */
    public static final PorterDuff.Mode f4294b = PorterDuff.Mode.SRC_IN;

    /* renamed from: c  reason: collision with root package name */
    public static C0302s f4295c;

    /* renamed from: a  reason: collision with root package name */
    public P0 f4296a;

    public final synchronized Drawable b(Context context, int i) {
        return this.f4296a.f(context, i);
    }

    public static synchronized C0302s a() {
        C0302s sVar;
        synchronized (C0302s.class) {
            try {
                if (f4295c == null) {
                    d();
                }
                sVar = f4295c;
            } catch (Throwable th) {
                while (true) {
                    throw th;
                }
            }
        }
        return sVar;
    }

    public static synchronized PorterDuffColorFilter c(int i, PorterDuff.Mode mode) {
        PorterDuffColorFilter h2;
        synchronized (C0302s.class) {
            h2 = P0.h(i, mode);
        }
        return h2;
    }

    /* JADX WARNING: type inference failed for: r1v2, types: [o.s, java.lang.Object] */
    public static synchronized void d() {
        synchronized (C0302s.class) {
            if (f4295c == null) {
                ? obj = new Object();
                f4295c = obj;
                obj.f4296a = P0.d();
                f4295c.f4296a.m(new b());
            }
        }
    }

    public static void e(Drawable drawable, o oVar, int[] iArr) {
        ColorStateList colorStateList;
        PorterDuff.Mode mode;
        PorterDuff.Mode mode2 = P0.f4114h;
        int[] state = drawable.getState();
        if (drawable.mutate() == drawable) {
            if ((drawable instanceof LayerDrawable) && drawable.isStateful()) {
                drawable.setState(new int[0]);
                drawable.setState(state);
            }
            boolean z2 = oVar.f2743b;
            if (z2 || oVar.f2742a) {
                PorterDuffColorFilter porterDuffColorFilter = null;
                if (z2) {
                    colorStateList = (ColorStateList) oVar.f2744c;
                } else {
                    colorStateList = null;
                }
                if (oVar.f2742a) {
                    mode = (PorterDuff.Mode) oVar.f2745d;
                } else {
                    mode = P0.f4114h;
                }
                if (!(colorStateList == null || mode == null)) {
                    porterDuffColorFilter = P0.h(colorStateList.getColorForState(iArr, 0), mode);
                }
                drawable.setColorFilter(porterDuffColorFilter);
            } else {
                drawable.clearColorFilter();
            }
            if (Build.VERSION.SDK_INT <= 23) {
                drawable.invalidateSelf();
            }
        }
    }
}
