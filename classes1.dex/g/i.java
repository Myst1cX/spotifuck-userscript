package G;

import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Outline;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.Region;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.DrawableContainer;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Build;
import android.util.Log;
import java.lang.reflect.Method;
import p0.C0320a;

public final class i extends Drawable implements Drawable.Callback, h, g {

    /* renamed from: l  reason: collision with root package name */
    public static final PorterDuff.Mode f250l = PorterDuff.Mode.SRC_IN;

    /* renamed from: m  reason: collision with root package name */
    public static Method f251m;

    /* renamed from: f  reason: collision with root package name */
    public int f252f;

    /* renamed from: g  reason: collision with root package name */
    public PorterDuff.Mode f253g;

    /* renamed from: h  reason: collision with root package name */
    public boolean f254h;
    public j i;

    /* renamed from: j  reason: collision with root package name */
    public boolean f255j;

    /* renamed from: k  reason: collision with root package name */
    public Drawable f256k;

    public static void a() {
        if (f251m == null) {
            try {
                f251m = Drawable.class.getDeclaredMethod("isProjected", (Class[]) null);
            } catch (Exception e) {
                Log.w("WrappedDrawableApi21", "Failed to retrieve Drawable#isProjected() method", e);
            }
        }
    }

    public final boolean b() {
        if (Build.VERSION.SDK_INT != 21) {
            return false;
        }
        Drawable drawable = this.f256k;
        if ((drawable instanceof GradientDrawable) || (drawable instanceof DrawableContainer) || (drawable instanceof InsetDrawable) || (drawable instanceof RippleDrawable)) {
            return true;
        }
        return false;
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [android.graphics.drawable.Drawable$ConstantState, G.j] */
    public final j c() {
        j jVar = this.i;
        ? constantState = new Drawable.ConstantState();
        constantState.f259c = null;
        constantState.f260d = f250l;
        if (jVar != null) {
            constantState.f257a = jVar.f257a;
            constantState.f258b = jVar.f258b;
            constantState.f259c = jVar.f259c;
            constantState.f260d = jVar.f260d;
        }
        return constantState;
    }

    public final boolean d(int[] iArr) {
        boolean state = this.f256k.setState(iArr);
        if (i(iArr) || state) {
            return true;
        }
        return false;
    }

    public final void draw(Canvas canvas) {
        this.f256k.draw(canvas);
    }

    public final void f(ColorStateList colorStateList) {
        this.i.f259c = colorStateList;
        i(this.f256k.getState());
    }

    public final void g(PorterDuff.Mode mode) {
        this.i.f260d = mode;
        i(this.f256k.getState());
    }

    public final Drawable.ConstantState getConstantState() {
        j jVar = this.i;
        if (jVar == null || jVar.f258b == null) {
            return null;
        }
        jVar.f257a = getChangingConfigurations();
        return this.i;
    }

    public final Drawable getCurrent() {
        return this.f256k.getCurrent();
    }

    public final Rect getDirtyBounds() {
        return this.f256k.getDirtyBounds();
    }

    public final int getIntrinsicHeight() {
        return this.f256k.getIntrinsicHeight();
    }

    public final int getIntrinsicWidth() {
        return this.f256k.getIntrinsicWidth();
    }

    public final int getLayoutDirection() {
        return C0320a.R(this.f256k);
    }

    public final int getMinimumHeight() {
        return this.f256k.getMinimumHeight();
    }

    public final int getMinimumWidth() {
        return this.f256k.getMinimumWidth();
    }

    public final int getOpacity() {
        return this.f256k.getOpacity();
    }

    public final void getOutline(Outline outline) {
        this.f256k.getOutline(outline);
    }

    public final boolean getPadding(Rect rect) {
        return this.f256k.getPadding(rect);
    }

    public final int[] getState() {
        return this.f256k.getState();
    }

    public final Region getTransparentRegion() {
        return this.f256k.getTransparentRegion();
    }

    public final void h(Drawable drawable) {
        Drawable drawable2 = this.f256k;
        if (drawable2 != null) {
            drawable2.setCallback((Drawable.Callback) null);
        }
        this.f256k = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
            setVisible(drawable.isVisible(), true);
            setState(drawable.getState());
            setLevel(drawable.getLevel());
            setBounds(drawable.getBounds());
            j jVar = this.i;
            if (jVar != null) {
                jVar.f258b = drawable.getConstantState();
            }
        }
        invalidateSelf();
    }

    public final boolean isAutoMirrored() {
        return this.f256k.isAutoMirrored();
    }

    public final boolean isProjected() {
        Method method;
        Drawable drawable = this.f256k;
        if (drawable == null || (method = f251m) == null) {
            return false;
        }
        try {
            return ((Boolean) method.invoke(drawable, (Object[]) null)).booleanValue();
        } catch (Exception e) {
            Log.w("WrappedDrawableApi21", "Error calling Drawable#isProjected() method", e);
            return false;
        }
    }

    public final void jumpToCurrentState() {
        this.f256k.jumpToCurrentState();
    }

    public final Drawable mutate() {
        Drawable.ConstantState constantState;
        if (!this.f255j && super.mutate() == this) {
            this.i = c();
            Drawable drawable = this.f256k;
            if (drawable != null) {
                drawable.mutate();
            }
            j jVar = this.i;
            if (jVar != null) {
                Drawable drawable2 = this.f256k;
                if (drawable2 != null) {
                    constantState = drawable2.getConstantState();
                } else {
                    constantState = null;
                }
                jVar.f258b = constantState;
            }
            this.f255j = true;
        }
        return this;
    }

    public final void onBoundsChange(Rect rect) {
        Drawable drawable = this.f256k;
        if (drawable != null) {
            drawable.setBounds(rect);
        }
    }

    public final boolean onLayoutDirectionChanged(int i2) {
        return C0320a.y0(this.f256k, i2);
    }

    public final boolean onLevelChange(int i2) {
        return this.f256k.setLevel(i2);
    }

    public final void setAlpha(int i2) {
        this.f256k.setAlpha(i2);
    }

    public final void setAutoMirrored(boolean z2) {
        this.f256k.setAutoMirrored(z2);
    }

    public final void setChangingConfigurations(int i2) {
        this.f256k.setChangingConfigurations(i2);
    }

    public final void setColorFilter(ColorFilter colorFilter) {
        this.f256k.setColorFilter(colorFilter);
    }

    public final void setDither(boolean z2) {
        this.f256k.setDither(z2);
    }

    public final void setFilterBitmap(boolean z2) {
        this.f256k.setFilterBitmap(z2);
    }

    public final void setHotspot(float f2, float f3) {
        this.f256k.setHotspot(f2, f3);
    }

    public final void setHotspotBounds(int i2, int i3, int i4, int i5) {
        this.f256k.setHotspotBounds(i2, i3, i4, i5);
    }

    public final void e(int i2) {
        setTintList(ColorStateList.valueOf(i2));
    }

    public final int getChangingConfigurations() {
        int i2;
        int changingConfigurations = super.getChangingConfigurations();
        j jVar = this.i;
        if (jVar != null) {
            i2 = jVar.getChangingConfigurations();
        } else {
            i2 = 0;
        }
        return changingConfigurations | i2 | this.f256k.getChangingConfigurations();
    }

    public final boolean i(int[] iArr) {
        if (!b()) {
            return false;
        }
        j jVar = this.i;
        ColorStateList colorStateList = jVar.f259c;
        PorterDuff.Mode mode = jVar.f260d;
        if (colorStateList == null || mode == null) {
            this.f254h = false;
            clearColorFilter();
        } else {
            int colorForState = colorStateList.getColorForState(iArr, colorStateList.getDefaultColor());
            if (!(this.f254h && colorForState == this.f252f && mode == this.f253g)) {
                setColorFilter(colorForState, mode);
                this.f252f = colorForState;
                this.f253g = mode;
                this.f254h = true;
                return true;
            }
        }
        return false;
    }

    public final void invalidateDrawable(Drawable drawable) {
        invalidateSelf();
    }

    public final boolean isStateful() {
        ColorStateList colorStateList;
        j jVar;
        if (!b() || (jVar = this.i) == null) {
            colorStateList = null;
        } else {
            colorStateList = jVar.f259c;
        }
        if ((colorStateList == null || !colorStateList.isStateful()) && !this.f256k.isStateful()) {
            return false;
        }
        return true;
    }

    public final void scheduleDrawable(Drawable drawable, Runnable runnable, long j2) {
        scheduleSelf(runnable, j2);
    }

    public final boolean setState(int[] iArr) {
        if (!d(iArr)) {
            return false;
        }
        invalidateSelf();
        return true;
    }

    public final void setTint(int i2) {
        if (b()) {
            e(i2);
        } else {
            this.f256k.setTint(i2);
        }
    }

    public final void setTintList(ColorStateList colorStateList) {
        if (b()) {
            f(colorStateList);
        } else {
            this.f256k.setTintList(colorStateList);
        }
    }

    public final void setTintMode(PorterDuff.Mode mode) {
        if (b()) {
            g(mode);
        } else {
            this.f256k.setTintMode(mode);
        }
    }

    public final boolean setVisible(boolean z2, boolean z3) {
        if (super.setVisible(z2, z3) || this.f256k.setVisible(z2, z3)) {
            return true;
        }
        return false;
    }

    public final void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        unscheduleSelf(runnable);
    }
}
