package j;

import G.a;
import N0.B;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Outline;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import p0.C0320a;

/* renamed from: j.g  reason: case insensitive filesystem */
public abstract class C0137g extends Drawable implements Drawable.Callback {

    /* renamed from: r  reason: collision with root package name */
    public static final /* synthetic */ int f3249r = 0;

    /* renamed from: f  reason: collision with root package name */
    public C0132b f3250f;

    /* renamed from: g  reason: collision with root package name */
    public Rect f3251g;

    /* renamed from: h  reason: collision with root package name */
    public Drawable f3252h;
    public Drawable i;

    /* renamed from: j  reason: collision with root package name */
    public int f3253j;

    /* renamed from: k  reason: collision with root package name */
    public boolean f3254k;

    /* renamed from: l  reason: collision with root package name */
    public int f3255l;

    /* renamed from: m  reason: collision with root package name */
    public boolean f3256m;

    /* renamed from: n  reason: collision with root package name */
    public B f3257n;

    /* renamed from: o  reason: collision with root package name */
    public long f3258o;

    /* renamed from: p  reason: collision with root package name */
    public long f3259p;

    /* renamed from: q  reason: collision with root package name */
    public C0136f f3260q;

    /* JADX WARNING: Removed duplicated region for block: B:12:0x003f  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x0065  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x006a A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:24:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a(boolean r14) {
        /*
            r13 = this;
            r0 = 1
            r13.f3254k = r0
            long r1 = android.os.SystemClock.uptimeMillis()
            android.graphics.drawable.Drawable r3 = r13.f3252h
            r4 = 255(0xff, double:1.26E-321)
            r6 = 0
            r8 = 0
            if (r3 == 0) goto L_0x0038
            long r9 = r13.f3258o
            int r11 = (r9 > r6 ? 1 : (r9 == r6 ? 0 : -1))
            if (r11 == 0) goto L_0x003a
            int r11 = (r9 > r1 ? 1 : (r9 == r1 ? 0 : -1))
            if (r11 > 0) goto L_0x0022
            int r9 = r13.f3253j
            r3.setAlpha(r9)
            r13.f3258o = r6
            goto L_0x003a
        L_0x0022:
            long r9 = r9 - r1
            long r9 = r9 * r4
            int r10 = (int) r9
            j.b r9 = r13.f3250f
            int r9 = r9.f3233y
            int r10 = r10 / r9
            int r9 = 255 - r10
            int r10 = r13.f3253j
            int r9 = r9 * r10
            int r9 = r9 / 255
            r3.setAlpha(r9)
            r3 = 1
            goto L_0x003b
        L_0x0038:
            r13.f3258o = r6
        L_0x003a:
            r3 = 0
        L_0x003b:
            android.graphics.drawable.Drawable r9 = r13.i
            if (r9 == 0) goto L_0x0065
            long r10 = r13.f3259p
            int r12 = (r10 > r6 ? 1 : (r10 == r6 ? 0 : -1))
            if (r12 == 0) goto L_0x0067
            int r12 = (r10 > r1 ? 1 : (r10 == r1 ? 0 : -1))
            if (r12 > 0) goto L_0x0052
            r9.setVisible(r8, r8)
            r0 = 0
            r13.i = r0
            r13.f3259p = r6
            goto L_0x0067
        L_0x0052:
            long r10 = r10 - r1
            long r10 = r10 * r4
            int r3 = (int) r10
            j.b r4 = r13.f3250f
            int r4 = r4.f3234z
            int r3 = r3 / r4
            int r4 = r13.f3253j
            int r3 = r3 * r4
            int r3 = r3 / 255
            r9.setAlpha(r3)
            goto L_0x0068
        L_0x0065:
            r13.f3259p = r6
        L_0x0067:
            r0 = r3
        L_0x0068:
            if (r14 == 0) goto L_0x0074
            if (r0 == 0) goto L_0x0074
            N0.B r14 = r13.f3257n
            r3 = 16
            long r1 = r1 + r3
            r13.scheduleSelf(r14, r1)
        L_0x0074:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: j.C0137g.a(boolean):void");
    }

    public abstract void d(C0132b bVar);

    public void applyTheme(Resources.Theme theme) {
        C0132b bVar = this.f3250f;
        if (theme != null) {
            bVar.c();
            int i2 = bVar.f3217h;
            Drawable[] drawableArr = bVar.f3216g;
            for (int i3 = 0; i3 < i2; i3++) {
                Drawable drawable = drawableArr[i3];
                if (drawable != null && a.b(drawable)) {
                    a.a(drawableArr[i3], theme);
                    bVar.e |= drawableArr[i3].getChangingConfigurations();
                }
            }
            Resources resources = theme.getResources();
            if (resources != null) {
                bVar.f3212b = resources;
                int i4 = resources.getDisplayMetrics().densityDpi;
                if (i4 == 0) {
                    i4 = 160;
                }
                int i5 = bVar.f3213c;
                bVar.f3213c = i4;
                if (i5 != i4) {
                    bVar.f3221m = false;
                    bVar.f3218j = false;
                    return;
                }
                return;
            }
            return;
        }
        bVar.getClass();
    }

    public final void b(Drawable drawable) {
        if (this.f3260q == null) {
            this.f3260q = new C0136f();
        }
        C0136f fVar = this.f3260q;
        fVar.f3248g = drawable.getCallback();
        drawable.setCallback(fVar);
        try {
            if (this.f3250f.f3233y <= 0 && this.f3254k) {
                drawable.setAlpha(this.f3253j);
            }
            C0132b bVar = this.f3250f;
            if (bVar.f3204C) {
                drawable.setColorFilter(bVar.f3203B);
            } else {
                if (bVar.f3207F) {
                    a.h(drawable, bVar.f3205D);
                }
                C0132b bVar2 = this.f3250f;
                if (bVar2.f3208G) {
                    a.i(drawable, bVar2.f3206E);
                }
            }
            drawable.setVisible(isVisible(), true);
            drawable.setDither(this.f3250f.f3231w);
            drawable.setState(getState());
            drawable.setLevel(getLevel());
            drawable.setBounds(getBounds());
            if (Build.VERSION.SDK_INT >= 23) {
                C0320a.y0(drawable, C0320a.R(this));
            }
            drawable.setAutoMirrored(this.f3250f.f3202A);
            Rect rect = this.f3251g;
            if (rect != null) {
                a.f(drawable, rect.left, rect.top, rect.right, rect.bottom);
            }
            C0136f fVar2 = this.f3260q;
            fVar2.f3248g = null;
            drawable.setCallback((Drawable.Callback) fVar2.f3248g);
        } catch (Throwable th) {
            C0136f fVar3 = this.f3260q;
            fVar3.f3248g = null;
            drawable.setCallback((Drawable.Callback) fVar3.f3248g);
            throw th;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:31:0x006b  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x0078  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean c(int r10) {
        /*
            r9 = this;
            int r0 = r9.f3255l
            r1 = 0
            if (r10 != r0) goto L_0x0006
            return r1
        L_0x0006:
            long r2 = android.os.SystemClock.uptimeMillis()
            j.b r0 = r9.f3250f
            int r0 = r0.f3234z
            r4 = 0
            r5 = 0
            if (r0 <= 0) goto L_0x002e
            android.graphics.drawable.Drawable r0 = r9.i
            if (r0 == 0) goto L_0x001a
            r0.setVisible(r1, r1)
        L_0x001a:
            android.graphics.drawable.Drawable r0 = r9.f3252h
            if (r0 == 0) goto L_0x0029
            r9.i = r0
            j.b r0 = r9.f3250f
            int r0 = r0.f3234z
            long r0 = (long) r0
            long r0 = r0 + r2
            r9.f3259p = r0
            goto L_0x0035
        L_0x0029:
            r9.i = r4
            r9.f3259p = r5
            goto L_0x0035
        L_0x002e:
            android.graphics.drawable.Drawable r0 = r9.f3252h
            if (r0 == 0) goto L_0x0035
            r0.setVisible(r1, r1)
        L_0x0035:
            if (r10 < 0) goto L_0x0055
            j.b r0 = r9.f3250f
            int r1 = r0.f3217h
            if (r10 >= r1) goto L_0x0055
            android.graphics.drawable.Drawable r0 = r0.d(r10)
            r9.f3252h = r0
            r9.f3255l = r10
            if (r0 == 0) goto L_0x005a
            j.b r10 = r9.f3250f
            int r10 = r10.f3233y
            if (r10 <= 0) goto L_0x0051
            long r7 = (long) r10
            long r2 = r2 + r7
            r9.f3258o = r2
        L_0x0051:
            r9.b(r0)
            goto L_0x005a
        L_0x0055:
            r9.f3252h = r4
            r10 = -1
            r9.f3255l = r10
        L_0x005a:
            long r0 = r9.f3258o
            r10 = 1
            int r2 = (r0 > r5 ? 1 : (r0 == r5 ? 0 : -1))
            if (r2 != 0) goto L_0x0067
            long r0 = r9.f3259p
            int r2 = (r0 > r5 ? 1 : (r0 == r5 ? 0 : -1))
            if (r2 == 0) goto L_0x007e
        L_0x0067:
            N0.B r0 = r9.f3257n
            if (r0 != 0) goto L_0x0078
            N0.B r0 = new N0.B
            r1 = r9
            j.e r1 = (j.C0135e) r1
            r2 = 13
            r0.<init>(r2, r1)
            r9.f3257n = r0
            goto L_0x007b
        L_0x0078:
            r9.unscheduleSelf(r0)
        L_0x007b:
            r9.a(r10)
        L_0x007e:
            r9.invalidateSelf()
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: j.C0137g.c(int):boolean");
    }

    public final boolean canApplyTheme() {
        return this.f3250f.canApplyTheme();
    }

    public final void draw(Canvas canvas) {
        Drawable drawable = this.f3252h;
        if (drawable != null) {
            drawable.draw(canvas);
        }
        Drawable drawable2 = this.i;
        if (drawable2 != null) {
            drawable2.draw(canvas);
        }
    }

    public final int getAlpha() {
        return this.f3253j;
    }

    public final Drawable.ConstantState getConstantState() {
        boolean z2;
        C0132b bVar = this.f3250f;
        if (!bVar.f3229u) {
            bVar.c();
            bVar.f3229u = true;
            int i2 = bVar.f3217h;
            Drawable[] drawableArr = bVar.f3216g;
            int i3 = 0;
            while (true) {
                if (i3 >= i2) {
                    bVar.f3230v = true;
                    z2 = true;
                    break;
                } else if (drawableArr[i3].getConstantState() == null) {
                    bVar.f3230v = false;
                    z2 = false;
                    break;
                } else {
                    i3++;
                }
            }
        } else {
            z2 = bVar.f3230v;
        }
        if (!z2) {
            return null;
        }
        this.f3250f.f3214d = getChangingConfigurations();
        return this.f3250f;
    }

    public final Drawable getCurrent() {
        return this.f3252h;
    }

    public final void getHotspotBounds(Rect rect) {
        Rect rect2 = this.f3251g;
        if (rect2 != null) {
            rect.set(rect2);
        } else {
            super.getHotspotBounds(rect);
        }
    }

    public final int getIntrinsicHeight() {
        C0132b bVar = this.f3250f;
        if (bVar.f3220l) {
            if (!bVar.f3221m) {
                bVar.b();
            }
            return bVar.f3223o;
        }
        Drawable drawable = this.f3252h;
        if (drawable != null) {
            return drawable.getIntrinsicHeight();
        }
        return -1;
    }

    public final int getIntrinsicWidth() {
        C0132b bVar = this.f3250f;
        if (bVar.f3220l) {
            if (!bVar.f3221m) {
                bVar.b();
            }
            return bVar.f3222n;
        }
        Drawable drawable = this.f3252h;
        if (drawable != null) {
            return drawable.getIntrinsicWidth();
        }
        return -1;
    }

    public final int getMinimumHeight() {
        C0132b bVar = this.f3250f;
        if (bVar.f3220l) {
            if (!bVar.f3221m) {
                bVar.b();
            }
            return bVar.f3225q;
        }
        Drawable drawable = this.f3252h;
        if (drawable != null) {
            return drawable.getMinimumHeight();
        }
        return 0;
    }

    public final int getMinimumWidth() {
        C0132b bVar = this.f3250f;
        if (bVar.f3220l) {
            if (!bVar.f3221m) {
                bVar.b();
            }
            return bVar.f3224p;
        }
        Drawable drawable = this.f3252h;
        if (drawable != null) {
            return drawable.getMinimumWidth();
        }
        return 0;
    }

    public final int getOpacity() {
        Drawable drawable = this.f3252h;
        int i2 = -2;
        if (drawable == null || !drawable.isVisible()) {
            return -2;
        }
        C0132b bVar = this.f3250f;
        if (bVar.f3226r) {
            return bVar.f3227s;
        }
        bVar.c();
        int i3 = bVar.f3217h;
        Drawable[] drawableArr = bVar.f3216g;
        if (i3 > 0) {
            i2 = drawableArr[0].getOpacity();
        }
        for (int i4 = 1; i4 < i3; i4++) {
            i2 = Drawable.resolveOpacity(i2, drawableArr[i4].getOpacity());
        }
        bVar.f3227s = i2;
        bVar.f3226r = true;
        return i2;
    }

    public final void getOutline(Outline outline) {
        Drawable drawable = this.f3252h;
        if (drawable != null) {
            drawable.getOutline(outline);
        }
    }

    public final boolean getPadding(Rect rect) {
        C0132b bVar = this.f3250f;
        boolean z2 = false;
        Rect rect2 = null;
        if (!bVar.i) {
            Rect rect3 = bVar.f3219k;
            if (rect3 != null || bVar.f3218j) {
                rect2 = rect3;
            } else {
                bVar.c();
                Rect rect4 = new Rect();
                int i2 = bVar.f3217h;
                Drawable[] drawableArr = bVar.f3216g;
                for (int i3 = 0; i3 < i2; i3++) {
                    if (drawableArr[i3].getPadding(rect4)) {
                        if (rect2 == null) {
                            rect2 = new Rect(0, 0, 0, 0);
                        }
                        int i4 = rect4.left;
                        if (i4 > rect2.left) {
                            rect2.left = i4;
                        }
                        int i5 = rect4.top;
                        if (i5 > rect2.top) {
                            rect2.top = i5;
                        }
                        int i6 = rect4.right;
                        if (i6 > rect2.right) {
                            rect2.right = i6;
                        }
                        int i7 = rect4.bottom;
                        if (i7 > rect2.bottom) {
                            rect2.bottom = i7;
                        }
                    }
                }
                bVar.f3218j = true;
                bVar.f3219k = rect2;
            }
        }
        if (rect2 != null) {
            rect.set(rect2);
            if ((rect2.left | rect2.top | rect2.bottom | rect2.right) != 0) {
                z2 = true;
            }
        } else {
            Drawable drawable = this.f3252h;
            if (drawable != null) {
                z2 = drawable.getPadding(rect);
            } else {
                z2 = super.getPadding(rect);
            }
        }
        if (this.f3250f.f3202A && C0320a.R(this) == 1) {
            int i8 = rect.left;
            rect.left = rect.right;
            rect.right = i8;
        }
        return z2;
    }

    public final void invalidateDrawable(Drawable drawable) {
        C0132b bVar = this.f3250f;
        if (bVar != null) {
            bVar.f3226r = false;
            bVar.f3228t = false;
        }
        if (drawable == this.f3252h && getCallback() != null) {
            getCallback().invalidateDrawable(this);
        }
    }

    public final boolean isAutoMirrored() {
        return this.f3250f.f3202A;
    }

    public void jumpToCurrentState() {
        boolean z2;
        Drawable drawable = this.i;
        boolean z3 = true;
        if (drawable != null) {
            drawable.jumpToCurrentState();
            this.i = null;
            z2 = true;
        } else {
            z2 = false;
        }
        Drawable drawable2 = this.f3252h;
        if (drawable2 != null) {
            drawable2.jumpToCurrentState();
            if (this.f3254k) {
                this.f3252h.setAlpha(this.f3253j);
            }
        }
        if (this.f3259p != 0) {
            this.f3259p = 0;
            z2 = true;
        }
        if (this.f3258o != 0) {
            this.f3258o = 0;
        } else {
            z3 = z2;
        }
        if (z3) {
            invalidateSelf();
        }
    }

    public Drawable mutate() {
        if (!this.f3256m && super.mutate() == this) {
            C0135e eVar = (C0135e) this;
            C0132b bVar = new C0132b(eVar.f3242u, eVar, (Resources) null);
            bVar.I = bVar.I.clone();
            bVar.f3210J = bVar.f3210J.clone();
            d(bVar);
            this.f3256m = true;
        }
        return this;
    }

    public final void onBoundsChange(Rect rect) {
        Drawable drawable = this.i;
        if (drawable != null) {
            drawable.setBounds(rect);
        }
        Drawable drawable2 = this.f3252h;
        if (drawable2 != null) {
            drawable2.setBounds(rect);
        }
    }

    public final boolean onLayoutDirectionChanged(int i2) {
        boolean z2;
        C0132b bVar = this.f3250f;
        int i3 = this.f3255l;
        int i4 = bVar.f3217h;
        Drawable[] drawableArr = bVar.f3216g;
        boolean z3 = false;
        for (int i5 = 0; i5 < i4; i5++) {
            Drawable drawable = drawableArr[i5];
            if (drawable != null) {
                if (Build.VERSION.SDK_INT >= 23) {
                    z2 = C0320a.y0(drawable, i2);
                } else {
                    z2 = false;
                }
                if (i5 == i3) {
                    z3 = z2;
                }
            }
        }
        bVar.f3232x = i2;
        return z3;
    }

    public final boolean onLevelChange(int i2) {
        Drawable drawable = this.i;
        if (drawable != null) {
            return drawable.setLevel(i2);
        }
        Drawable drawable2 = this.f3252h;
        if (drawable2 != null) {
            return drawable2.setLevel(i2);
        }
        return false;
    }

    public final void scheduleDrawable(Drawable drawable, Runnable runnable, long j2) {
        if (drawable == this.f3252h && getCallback() != null) {
            getCallback().scheduleDrawable(this, runnable, j2);
        }
    }

    public final void setAlpha(int i2) {
        if (!this.f3254k || this.f3253j != i2) {
            this.f3254k = true;
            this.f3253j = i2;
            Drawable drawable = this.f3252h;
            if (drawable == null) {
                return;
            }
            if (this.f3258o == 0) {
                drawable.setAlpha(i2);
            } else {
                a(false);
            }
        }
    }

    public final void setAutoMirrored(boolean z2) {
        C0132b bVar = this.f3250f;
        if (bVar.f3202A != z2) {
            bVar.f3202A = z2;
            Drawable drawable = this.f3252h;
            if (drawable != null) {
                drawable.setAutoMirrored(z2);
            }
        }
    }

    public final void setColorFilter(ColorFilter colorFilter) {
        C0132b bVar = this.f3250f;
        bVar.f3204C = true;
        if (bVar.f3203B != colorFilter) {
            bVar.f3203B = colorFilter;
            Drawable drawable = this.f3252h;
            if (drawable != null) {
                drawable.setColorFilter(colorFilter);
            }
        }
    }

    public final void setDither(boolean z2) {
        C0132b bVar = this.f3250f;
        if (bVar.f3231w != z2) {
            bVar.f3231w = z2;
            Drawable drawable = this.f3252h;
            if (drawable != null) {
                drawable.setDither(z2);
            }
        }
    }

    public final void setHotspot(float f2, float f3) {
        Drawable drawable = this.f3252h;
        if (drawable != null) {
            a.e(drawable, f2, f3);
        }
    }

    public final void setHotspotBounds(int i2, int i3, int i4, int i5) {
        Rect rect = this.f3251g;
        if (rect == null) {
            this.f3251g = new Rect(i2, i3, i4, i5);
        } else {
            rect.set(i2, i3, i4, i5);
        }
        Drawable drawable = this.f3252h;
        if (drawable != null) {
            a.f(drawable, i2, i3, i4, i5);
        }
    }

    public final void setTintList(ColorStateList colorStateList) {
        C0132b bVar = this.f3250f;
        bVar.f3207F = true;
        if (bVar.f3205D != colorStateList) {
            bVar.f3205D = colorStateList;
            a.h(this.f3252h, colorStateList);
        }
    }

    public final void setTintMode(PorterDuff.Mode mode) {
        C0132b bVar = this.f3250f;
        bVar.f3208G = true;
        if (bVar.f3206E != mode) {
            bVar.f3206E = mode;
            a.i(this.f3252h, mode);
        }
    }

    public final void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        if (drawable == this.f3252h && getCallback() != null) {
            getCallback().unscheduleDrawable(this, runnable);
        }
    }

    public final int getChangingConfigurations() {
        return super.getChangingConfigurations() | this.f3250f.getChangingConfigurations();
    }

    public final void setTint(int i2) {
        setTintList(ColorStateList.valueOf(i2));
    }

    public boolean setVisible(boolean z2, boolean z3) {
        boolean visible = super.setVisible(z2, z3);
        Drawable drawable = this.i;
        if (drawable != null) {
            drawable.setVisible(z2, z3);
        }
        Drawable drawable2 = this.f3252h;
        if (drawable2 != null) {
            drawable2.setVisible(z2, z3);
        }
        return visible;
    }
}
