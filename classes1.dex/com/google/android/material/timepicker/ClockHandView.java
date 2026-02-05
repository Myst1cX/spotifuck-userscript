package com.google.android.material.timepicker;

import N.Q;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.WeakHashMap;
import p0.C0320a;
import q0.C0322a;
import r0.C0324a;

class ClockHandView extends View {

    /* renamed from: f  reason: collision with root package name */
    public final ValueAnimator f2425f = new ValueAnimator();

    /* renamed from: g  reason: collision with root package name */
    public boolean f2426g;

    /* renamed from: h  reason: collision with root package name */
    public final ArrayList f2427h = new ArrayList();
    public final int i;

    /* renamed from: j  reason: collision with root package name */
    public final float f2428j;

    /* renamed from: k  reason: collision with root package name */
    public final Paint f2429k;

    /* renamed from: l  reason: collision with root package name */
    public final RectF f2430l;

    /* renamed from: m  reason: collision with root package name */
    public final int f2431m;

    /* renamed from: n  reason: collision with root package name */
    public float f2432n;

    /* renamed from: o  reason: collision with root package name */
    public boolean f2433o;

    /* renamed from: p  reason: collision with root package name */
    public double f2434p;

    /* renamed from: q  reason: collision with root package name */
    public int f2435q;

    /* renamed from: r  reason: collision with root package name */
    public int f2436r;

    public final int a(int i2) {
        if (i2 == 2) {
            return Math.round(((float) this.f2435q) * 0.66f);
        }
        return this.f2435q;
    }

    public final void b(float f2) {
        ValueAnimator valueAnimator = this.f2425f;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        float f3 = f2 % 360.0f;
        this.f2432n = f3;
        this.f2434p = Math.toRadians((double) (f3 - 90.0f));
        float a2 = (float) a(this.f2436r);
        float cos = (((float) Math.cos(this.f2434p)) * a2) + ((float) (getWidth() / 2));
        float sin = (a2 * ((float) Math.sin(this.f2434p))) + ((float) (getHeight() / 2));
        float f4 = (float) this.i;
        this.f2430l.set(cos - f4, sin - f4, cos + f4, sin + f4);
        Iterator it2 = this.f2427h.iterator();
        while (it2.hasNext()) {
            ClockFaceView clockFaceView = (ClockFaceView) ((d) it2.next());
            if (Math.abs(clockFaceView.f2421L - f3) > 0.001f) {
                clockFaceView.f2421L = f3;
                clockFaceView.n();
            }
        }
        invalidate();
    }

    public ClockHandView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 2130969371);
        Paint paint = new Paint();
        this.f2429k = paint;
        this.f2430l = new RectF();
        this.f2436r = 1;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C0322a.e, 2130969371, 2131821694);
        C0320a.q0(context, 2130969422, 200);
        C0320a.r0(context, 2130969438, C0324a.f4556b);
        this.f2435q = obtainStyledAttributes.getDimensionPixelSize(1, 0);
        this.i = obtainStyledAttributes.getDimensionPixelSize(2, 0);
        Resources resources = getResources();
        this.f2431m = resources.getDimensionPixelSize(2131165737);
        this.f2428j = (float) resources.getDimensionPixelSize(2131165735);
        int color = obtainStyledAttributes.getColor(0, 0);
        paint.setAntiAlias(true);
        paint.setColor(color);
        b(0.0f);
        ViewConfiguration.get(context).getScaledTouchSlop();
        WeakHashMap weakHashMap = Q.f509a;
        setImportantForAccessibility(2);
        obtainStyledAttributes.recycle();
    }

    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        int height = getHeight() / 2;
        int width = getWidth() / 2;
        int a2 = a(this.f2436r);
        float f2 = (float) width;
        float f3 = (float) a2;
        float f4 = (float) height;
        Paint paint = this.f2429k;
        paint.setStrokeWidth(0.0f);
        int i2 = this.i;
        canvas.drawCircle((((float) Math.cos(this.f2434p)) * f3) + f2, (f3 * ((float) Math.sin(this.f2434p))) + f4, (float) i2, paint);
        double sin = Math.sin(this.f2434p);
        double d2 = (double) ((float) (a2 - i2));
        paint.setStrokeWidth((float) this.f2431m);
        canvas.drawLine(f2, f4, (float) (width + ((int) (Math.cos(this.f2434p) * d2))), (float) (height + ((int) (d2 * sin))), paint);
        canvas.drawCircle(f2, f4, this.f2428j, paint);
    }

    public final void onLayout(boolean z2, int i2, int i3, int i4, int i5) {
        super.onLayout(z2, i2, i3, i4, i5);
        if (!this.f2425f.isRunning()) {
            b(this.f2432n);
        }
    }

    public final boolean onTouchEvent(MotionEvent motionEvent) {
        boolean z2;
        boolean z3;
        boolean z4;
        int i2;
        int actionMasked = motionEvent.getActionMasked();
        float x2 = motionEvent.getX();
        float y2 = motionEvent.getY();
        boolean z5 = false;
        if (actionMasked != 0) {
            if (actionMasked == 1 || actionMasked == 2) {
                z3 = this.f2433o;
                if (this.f2426g) {
                    if (((float) Math.hypot((double) (x2 - ((float) (getWidth() / 2))), (double) (y2 - ((float) (getHeight() / 2))))) <= ((float) a(2)) + TypedValue.applyDimension(1, (float) 12, getContext().getResources().getDisplayMetrics())) {
                        i2 = 2;
                    } else {
                        i2 = 1;
                    }
                    this.f2436r = i2;
                }
            } else {
                z3 = false;
            }
            z2 = false;
        } else {
            this.f2433o = false;
            z3 = false;
            z2 = true;
        }
        boolean z6 = this.f2433o;
        int degrees = (int) Math.toDegrees(Math.atan2((double) (y2 - ((float) (getHeight() / 2))), (double) (x2 - ((float) (getWidth() / 2)))));
        int i3 = degrees + 90;
        if (i3 < 0) {
            i3 = degrees + 450;
        }
        float f2 = (float) i3;
        if (this.f2432n != f2) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (!z2 || !z4) {
            if (z4 || z3) {
                b(f2);
            }
            this.f2433o = z6 | z5;
            return true;
        }
        z5 = true;
        this.f2433o = z6 | z5;
        return true;
    }
}
