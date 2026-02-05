package o;

import G.a;
import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.Region;
import android.graphics.drawable.Drawable;

/* renamed from: o.t0  reason: case insensitive filesystem */
public final class C0305t0 extends Drawable implements Drawable.Callback {

    /* renamed from: f  reason: collision with root package name */
    public final Drawable f4298f;

    /* renamed from: g  reason: collision with root package name */
    public boolean f4299g;

    public final void a(Canvas canvas) {
        this.f4298f.draw(canvas);
    }

    public final void b(float f2, float f3) {
        a.e(this.f4298f, f2, f3);
    }

    public final void c(int i, int i2, int i3, int i4) {
        a.f(this.f4298f, i, i2, i3, i4);
    }

    public final void draw(Canvas canvas) {
        if (this.f4299g) {
            a(canvas);
        }
    }

    public final int getChangingConfigurations() {
        return this.f4298f.getChangingConfigurations();
    }

    public final Drawable getCurrent() {
        return this.f4298f.getCurrent();
    }

    public int getIntrinsicHeight() {
        return this.f4298f.getIntrinsicHeight();
    }

    public int getIntrinsicWidth() {
        return this.f4298f.getIntrinsicWidth();
    }

    public final int getMinimumHeight() {
        return this.f4298f.getMinimumHeight();
    }

    public final int getMinimumWidth() {
        return this.f4298f.getMinimumWidth();
    }

    public final int getOpacity() {
        return this.f4298f.getOpacity();
    }

    public final boolean getPadding(Rect rect) {
        return this.f4298f.getPadding(rect);
    }

    public final int[] getState() {
        return this.f4298f.getState();
    }

    public final Region getTransparentRegion() {
        return this.f4298f.getTransparentRegion();
    }

    public final boolean isAutoMirrored() {
        return this.f4298f.isAutoMirrored();
    }

    public final boolean isStateful() {
        return this.f4298f.isStateful();
    }

    public final void jumpToCurrentState() {
        this.f4298f.jumpToCurrentState();
    }

    public final void onBoundsChange(Rect rect) {
        this.f4298f.setBounds(rect);
    }

    public final boolean onLevelChange(int i) {
        return this.f4298f.setLevel(i);
    }

    public final void setAlpha(int i) {
        this.f4298f.setAlpha(i);
    }

    public final void setAutoMirrored(boolean z2) {
        this.f4298f.setAutoMirrored(z2);
    }

    public final void setChangingConfigurations(int i) {
        this.f4298f.setChangingConfigurations(i);
    }

    public final void setColorFilter(ColorFilter colorFilter) {
        this.f4298f.setColorFilter(colorFilter);
    }

    public final void setDither(boolean z2) {
        this.f4298f.setDither(z2);
    }

    public final void setFilterBitmap(boolean z2) {
        this.f4298f.setFilterBitmap(z2);
    }

    public final void setHotspot(float f2, float f3) {
        if (this.f4299g) {
            b(f2, f3);
        }
    }

    public final void setHotspotBounds(int i, int i2, int i3, int i4) {
        if (this.f4299g) {
            c(i, i2, i3, i4);
        }
    }

    public final boolean setState(int[] iArr) {
        if (this.f4299g) {
            return this.f4298f.setState(iArr);
        }
        return false;
    }

    public final void setTint(int i) {
        a.g(this.f4298f, i);
    }

    public final void setTintList(ColorStateList colorStateList) {
        a.h(this.f4298f, colorStateList);
    }

    public final void setTintMode(PorterDuff.Mode mode) {
        a.i(this.f4298f, mode);
    }

    public final boolean setVisible(boolean z2, boolean z3) {
        if (this.f4299g) {
            return d(z2, z3);
        }
        return false;
    }

    public C0305t0(Drawable drawable) {
        Drawable drawable2 = this.f4298f;
        if (drawable2 != null) {
            drawable2.setCallback((Drawable.Callback) null);
        }
        this.f4298f = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
        }
    }

    public final boolean d(boolean z2, boolean z3) {
        if (super.setVisible(z2, z3) || this.f4298f.setVisible(z2, z3)) {
            return true;
        }
        return false;
    }

    public final void invalidateDrawable(Drawable drawable) {
        invalidateSelf();
    }

    public final void scheduleDrawable(Drawable drawable, Runnable runnable, long j2) {
        scheduleSelf(runnable, j2);
    }

    public final void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        unscheduleSelf(runnable);
    }
}
