package E0;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.Gravity;
import o.A0;
import q0.C0322a;

public abstract class e extends A0 {

    /* renamed from: u  reason: collision with root package name */
    public Drawable f192u;

    /* renamed from: v  reason: collision with root package name */
    public final Rect f193v = new Rect();

    /* renamed from: w  reason: collision with root package name */
    public final Rect f194w = new Rect();

    /* renamed from: x  reason: collision with root package name */
    public int f195x = 119;

    /* renamed from: y  reason: collision with root package name */
    public final boolean f196y = true;

    /* renamed from: z  reason: collision with root package name */
    public boolean f197z = false;

    public Drawable getForeground() {
        return this.f192u;
    }

    public int getForegroundGravity() {
        return this.f195x;
    }

    public void setForeground(Drawable drawable) {
        Drawable drawable2 = this.f192u;
        if (drawable2 != drawable) {
            if (drawable2 != null) {
                drawable2.setCallback((Drawable.Callback) null);
                unscheduleDrawable(this.f192u);
            }
            this.f192u = drawable;
            this.f197z = true;
            if (drawable != null) {
                setWillNotDraw(false);
                drawable.setCallback(this);
                if (drawable.isStateful()) {
                    drawable.setState(getDrawableState());
                }
                if (this.f195x == 119) {
                    drawable.getPadding(new Rect());
                }
            } else {
                setWillNotDraw(true);
            }
            requestLayout();
            invalidate();
        }
    }

    public void setForegroundGravity(int i) {
        if (this.f195x != i) {
            if ((8388615 & i) == 0) {
                i |= 8388611;
            }
            if ((i & 112) == 0) {
                i |= 48;
            }
            this.f195x = i;
            if (i == 119 && this.f192u != null) {
                this.f192u.getPadding(new Rect());
            }
            requestLayout();
        }
    }

    public e(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        int[] iArr = C0322a.f4490h;
        m.a(context, attributeSet, 0, 0);
        m.b(context, attributeSet, iArr, 0, 0, new int[0]);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr, 0, 0);
        this.f195x = obtainStyledAttributes.getInt(1, this.f195x);
        Drawable drawable = obtainStyledAttributes.getDrawable(0);
        if (drawable != null) {
            setForeground(drawable);
        }
        this.f196y = obtainStyledAttributes.getBoolean(2, true);
        obtainStyledAttributes.recycle();
    }

    public final void draw(Canvas canvas) {
        super.draw(canvas);
        Drawable drawable = this.f192u;
        if (drawable != null) {
            if (this.f197z) {
                this.f197z = false;
                int right = getRight() - getLeft();
                int bottom = getBottom() - getTop();
                boolean z2 = this.f196y;
                Rect rect = this.f193v;
                if (z2) {
                    rect.set(0, 0, right, bottom);
                } else {
                    rect.set(getPaddingLeft(), getPaddingTop(), right - getPaddingRight(), bottom - getPaddingBottom());
                }
                int i = this.f195x;
                int intrinsicWidth = drawable.getIntrinsicWidth();
                int intrinsicHeight = drawable.getIntrinsicHeight();
                Rect rect2 = this.f194w;
                Gravity.apply(i, intrinsicWidth, intrinsicHeight, rect, rect2);
                drawable.setBounds(rect2);
            }
            drawable.draw(canvas);
        }
    }

    public final void drawableHotspotChanged(float f2, float f3) {
        super.drawableHotspotChanged(f2, f3);
        Drawable drawable = this.f192u;
        if (drawable != null) {
            drawable.setHotspot(f2, f3);
        }
    }

    public final void drawableStateChanged() {
        super.drawableStateChanged();
        Drawable drawable = this.f192u;
        if (drawable != null && drawable.isStateful()) {
            this.f192u.setState(getDrawableState());
        }
    }

    public final void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        Drawable drawable = this.f192u;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
    }

    public final void onLayout(boolean z2, int i, int i2, int i3, int i4) {
        super.onLayout(z2, i, i2, i3, i4);
        this.f197z = z2 | this.f197z;
    }

    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        this.f197z = true;
    }

    public final boolean verifyDrawable(Drawable drawable) {
        if (super.verifyDrawable(drawable) || drawable == this.f192u) {
            return true;
        }
        return false;
    }
}
