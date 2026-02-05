package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import g.C0096a;
import o.C0268b;
import o.S0;

public class ActionBarContainer extends FrameLayout {

    /* renamed from: f  reason: collision with root package name */
    public boolean f1251f;

    /* renamed from: g  reason: collision with root package name */
    public View f1252g;

    /* renamed from: h  reason: collision with root package name */
    public View f1253h;
    public Drawable i;

    /* renamed from: j  reason: collision with root package name */
    public Drawable f1254j;

    /* renamed from: k  reason: collision with root package name */
    public Drawable f1255k;

    /* renamed from: l  reason: collision with root package name */
    public final boolean f1256l;

    /* renamed from: m  reason: collision with root package name */
    public boolean f1257m;

    /* renamed from: n  reason: collision with root package name */
    public final int f1258n;

    public View getTabContainer() {
        return null;
    }

    public final ActionMode startActionModeForChild(View view, ActionMode.Callback callback) {
        return null;
    }

    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (this.f1251f || super.onInterceptTouchEvent(motionEvent)) {
            return true;
        }
        return false;
    }

    public final void onMeasure(int i2, int i3) {
        int i4;
        if (this.f1252g == null && View.MeasureSpec.getMode(i3) == Integer.MIN_VALUE && (i4 = this.f1258n) >= 0) {
            i3 = View.MeasureSpec.makeMeasureSpec(Math.min(i4, View.MeasureSpec.getSize(i3)), Integer.MIN_VALUE);
        }
        super.onMeasure(i2, i3);
        if (this.f1252g != null) {
            View.MeasureSpec.getMode(i3);
        }
    }

    public void setPrimaryBackground(Drawable drawable) {
        Drawable drawable2 = this.i;
        if (drawable2 != null) {
            drawable2.setCallback((Drawable.Callback) null);
            unscheduleDrawable(this.i);
        }
        this.i = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
            View view = this.f1252g;
            if (view != null) {
                this.i.setBounds(view.getLeft(), this.f1252g.getTop(), this.f1252g.getRight(), this.f1252g.getBottom());
            }
        }
        boolean z2 = false;
        if (!this.f1256l ? this.i == null && this.f1254j == null : this.f1255k == null) {
            z2 = true;
        }
        setWillNotDraw(z2);
        invalidate();
        invalidateOutline();
    }

    public void setSplitBackground(Drawable drawable) {
        Drawable drawable2;
        Drawable drawable3 = this.f1255k;
        if (drawable3 != null) {
            drawable3.setCallback((Drawable.Callback) null);
            unscheduleDrawable(this.f1255k);
        }
        this.f1255k = drawable;
        boolean z2 = this.f1256l;
        boolean z3 = false;
        if (drawable != null) {
            drawable.setCallback(this);
            if (z2 && (drawable2 = this.f1255k) != null) {
                drawable2.setBounds(0, 0, getMeasuredWidth(), getMeasuredHeight());
            }
        }
        if (!z2 ? this.i == null && this.f1254j == null : this.f1255k == null) {
            z3 = true;
        }
        setWillNotDraw(z3);
        invalidate();
        invalidateOutline();
    }

    public void setStackedBackground(Drawable drawable) {
        Drawable drawable2 = this.f1254j;
        if (drawable2 != null) {
            drawable2.setCallback((Drawable.Callback) null);
            unscheduleDrawable(this.f1254j);
        }
        this.f1254j = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
            if (this.f1257m && this.f1254j != null) {
                throw null;
            }
        }
        boolean z2 = false;
        if (!this.f1256l ? this.i == null && this.f1254j == null : this.f1255k == null) {
            z2 = true;
        }
        setWillNotDraw(z2);
        invalidate();
        invalidateOutline();
    }

    public void setTabContainer(S0 s02) {
    }

    public void setTransitioning(boolean z2) {
        int i2;
        this.f1251f = z2;
        if (z2) {
            i2 = 393216;
        } else {
            i2 = 262144;
        }
        setDescendantFocusability(i2);
    }

    public final ActionMode startActionModeForChild(View view, ActionMode.Callback callback, int i2) {
        if (i2 != 0) {
            return super.startActionModeForChild(view, callback, i2);
        }
        return null;
    }

    public final boolean verifyDrawable(Drawable drawable) {
        Drawable drawable2 = this.i;
        boolean z2 = this.f1256l;
        if ((drawable != drawable2 || z2) && ((drawable != this.f1254j || !this.f1257m) && ((drawable != this.f1255k || !z2) && !super.verifyDrawable(drawable)))) {
            return false;
        }
        return true;
    }

    public ActionBarContainer(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        setBackground(new C0268b(this));
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C0096a.f2519a);
        boolean z2 = false;
        this.i = obtainStyledAttributes.getDrawable(0);
        this.f1254j = obtainStyledAttributes.getDrawable(2);
        this.f1258n = obtainStyledAttributes.getDimensionPixelSize(13, -1);
        if (getId() == 2131296700) {
            this.f1256l = true;
            this.f1255k = obtainStyledAttributes.getDrawable(1);
        }
        obtainStyledAttributes.recycle();
        if (!this.f1256l ? this.i == null && this.f1254j == null : this.f1255k == null) {
            z2 = true;
        }
        setWillNotDraw(z2);
    }

    public final void drawableStateChanged() {
        super.drawableStateChanged();
        Drawable drawable = this.i;
        if (drawable != null && drawable.isStateful()) {
            this.i.setState(getDrawableState());
        }
        Drawable drawable2 = this.f1254j;
        if (drawable2 != null && drawable2.isStateful()) {
            this.f1254j.setState(getDrawableState());
        }
        Drawable drawable3 = this.f1255k;
        if (drawable3 != null && drawable3.isStateful()) {
            this.f1255k.setState(getDrawableState());
        }
    }

    public final void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        Drawable drawable = this.i;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
        Drawable drawable2 = this.f1254j;
        if (drawable2 != null) {
            drawable2.jumpToCurrentState();
        }
        Drawable drawable3 = this.f1255k;
        if (drawable3 != null) {
            drawable3.jumpToCurrentState();
        }
    }

    public final void onFinishInflate() {
        super.onFinishInflate();
        this.f1252g = findViewById(2131296309);
        this.f1253h = findViewById(2131296317);
    }

    public final boolean onHoverEvent(MotionEvent motionEvent) {
        super.onHoverEvent(motionEvent);
        return true;
    }

    public final void onLayout(boolean z2, int i2, int i3, int i4, int i5) {
        super.onLayout(z2, i2, i3, i4, i5);
        boolean z3 = true;
        if (this.f1256l) {
            Drawable drawable = this.f1255k;
            if (drawable != null) {
                drawable.setBounds(0, 0, getMeasuredWidth(), getMeasuredHeight());
            } else {
                z3 = false;
            }
        } else {
            if (this.i == null) {
                z3 = false;
            } else if (this.f1252g.getVisibility() == 0) {
                this.i.setBounds(this.f1252g.getLeft(), this.f1252g.getTop(), this.f1252g.getRight(), this.f1252g.getBottom());
            } else {
                View view = this.f1253h;
                if (view == null || view.getVisibility() != 0) {
                    this.i.setBounds(0, 0, 0, 0);
                } else {
                    this.i.setBounds(this.f1253h.getLeft(), this.f1253h.getTop(), this.f1253h.getRight(), this.f1253h.getBottom());
                }
            }
            this.f1257m = false;
        }
        if (z3) {
            invalidate();
        }
    }

    public final boolean onTouchEvent(MotionEvent motionEvent) {
        super.onTouchEvent(motionEvent);
        return true;
    }

    public void setVisibility(int i2) {
        boolean z2;
        super.setVisibility(i2);
        if (i2 == 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        Drawable drawable = this.i;
        if (drawable != null) {
            drawable.setVisible(z2, false);
        }
        Drawable drawable2 = this.f1254j;
        if (drawable2 != null) {
            drawable2.setVisible(z2, false);
        }
        Drawable drawable3 = this.f1255k;
        if (drawable3 != null) {
            drawable3.setVisible(z2, false);
        }
    }
}
