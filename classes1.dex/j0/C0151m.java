package j0;

import N.Q;
import N0.B;
import N0.C;
import android.animation.ValueAnimator;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.StateListDrawable;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.WeakHashMap;

/* renamed from: j0.m  reason: case insensitive filesystem */
public final class C0151m extends H {

    /* renamed from: C  reason: collision with root package name */
    public static final int[] f3436C = {16842919};

    /* renamed from: D  reason: collision with root package name */
    public static final int[] f3437D = new int[0];

    /* renamed from: A  reason: collision with root package name */
    public int f3438A;

    /* renamed from: B  reason: collision with root package name */
    public final B f3439B;

    /* renamed from: a  reason: collision with root package name */
    public final int f3440a;

    /* renamed from: b  reason: collision with root package name */
    public final int f3441b;

    /* renamed from: c  reason: collision with root package name */
    public final StateListDrawable f3442c;

    /* renamed from: d  reason: collision with root package name */
    public final Drawable f3443d;
    public final int e;

    /* renamed from: f  reason: collision with root package name */
    public final int f3444f;

    /* renamed from: g  reason: collision with root package name */
    public final StateListDrawable f3445g;

    /* renamed from: h  reason: collision with root package name */
    public final Drawable f3446h;
    public final int i;

    /* renamed from: j  reason: collision with root package name */
    public final int f3447j;

    /* renamed from: k  reason: collision with root package name */
    public int f3448k;

    /* renamed from: l  reason: collision with root package name */
    public int f3449l;

    /* renamed from: m  reason: collision with root package name */
    public float f3450m;

    /* renamed from: n  reason: collision with root package name */
    public int f3451n;

    /* renamed from: o  reason: collision with root package name */
    public int f3452o;

    /* renamed from: p  reason: collision with root package name */
    public float f3453p;

    /* renamed from: q  reason: collision with root package name */
    public int f3454q = 0;

    /* renamed from: r  reason: collision with root package name */
    public int f3455r = 0;

    /* renamed from: s  reason: collision with root package name */
    public final RecyclerView f3456s;

    /* renamed from: t  reason: collision with root package name */
    public boolean f3457t = false;

    /* renamed from: u  reason: collision with root package name */
    public boolean f3458u = false;

    /* renamed from: v  reason: collision with root package name */
    public int f3459v = 0;

    /* renamed from: w  reason: collision with root package name */
    public int f3460w = 0;

    /* renamed from: x  reason: collision with root package name */
    public final int[] f3461x = new int[2];

    /* renamed from: y  reason: collision with root package name */
    public final int[] f3462y = new int[2];

    /* renamed from: z  reason: collision with root package name */
    public final ValueAnimator f3463z;

    public C0151m(RecyclerView recyclerView, StateListDrawable stateListDrawable, Drawable drawable, StateListDrawable stateListDrawable2, Drawable drawable2, int i2, int i3, int i4) {
        boolean z2 = true;
        ValueAnimator ofFloat = ValueAnimator.ofFloat(new float[]{0.0f, 1.0f});
        this.f3463z = ofFloat;
        this.f3438A = 0;
        B b2 = new B(14, this);
        this.f3439B = b2;
        C0149k kVar = new C0149k(this);
        this.f3442c = stateListDrawable;
        this.f3443d = drawable;
        this.f3445g = stateListDrawable2;
        this.f3446h = drawable2;
        this.e = Math.max(i2, stateListDrawable.getIntrinsicWidth());
        this.f3444f = Math.max(i2, drawable.getIntrinsicWidth());
        this.i = Math.max(i2, stateListDrawable2.getIntrinsicWidth());
        this.f3447j = Math.max(i2, drawable2.getIntrinsicWidth());
        this.f3440a = i3;
        this.f3441b = i4;
        stateListDrawable.setAlpha(255);
        drawable.setAlpha(255);
        ofFloat.addListener(new C0150l(this));
        ofFloat.addUpdateListener(new C(1, this));
        RecyclerView recyclerView2 = this.f3456s;
        if (recyclerView2 != recyclerView) {
            if (recyclerView2 != null) {
                K k2 = recyclerView2.f2030r;
                if (k2 != null) {
                    k2.c("Cannot remove item decoration during a scroll  or layout");
                }
                ArrayList arrayList = recyclerView2.f2032s;
                arrayList.remove(this);
                if (arrayList.isEmpty()) {
                    recyclerView2.setWillNotDraw(recyclerView2.getOverScrollMode() != 2 ? false : z2);
                }
                recyclerView2.N();
                recyclerView2.requestLayout();
                RecyclerView recyclerView3 = this.f3456s;
                recyclerView3.f2034t.remove(this);
                if (recyclerView3.f2036u == this) {
                    recyclerView3.f2036u = null;
                }
                ArrayList arrayList2 = this.f3456s.f2020l0;
                if (arrayList2 != null) {
                    arrayList2.remove(kVar);
                }
                this.f3456s.removeCallbacks(b2);
            }
            this.f3456s = recyclerView;
            if (recyclerView != null) {
                recyclerView.g(this);
                this.f3456s.f2034t.add(this);
                this.f3456s.h(kVar);
            }
        }
    }

    public static int f(float f2, float f3, int[] iArr, int i2, int i3, int i4) {
        int i5 = iArr[1] - iArr[0];
        if (i5 == 0) {
            return 0;
        }
        int i6 = i2 - i4;
        int i7 = (int) (((f3 - f2) / ((float) i5)) * ((float) i6));
        int i8 = i3 + i7;
        if (i8 >= i6 || i8 < 0) {
            return 0;
        }
        return i7;
    }

    public final void h() {
        int i2 = this.f3438A;
        ValueAnimator valueAnimator = this.f3463z;
        if (i2 != 0) {
            if (i2 == 3) {
                valueAnimator.cancel();
            } else {
                return;
            }
        }
        this.f3438A = 1;
        valueAnimator.setFloatValues(new float[]{((Float) valueAnimator.getAnimatedValue()).floatValue(), 1.0f});
        valueAnimator.setDuration(500);
        valueAnimator.setStartDelay(0);
        valueAnimator.start();
    }

    public final void c(Canvas canvas, RecyclerView recyclerView) {
        int i2 = this.f3454q;
        RecyclerView recyclerView2 = this.f3456s;
        if (i2 != recyclerView2.getWidth() || this.f3455r != recyclerView2.getHeight()) {
            this.f3454q = recyclerView2.getWidth();
            this.f3455r = recyclerView2.getHeight();
            g(0);
        } else if (this.f3438A != 0) {
            if (this.f3457t) {
                int i3 = this.f3454q;
                int i4 = this.e;
                int i5 = i3 - i4;
                int i6 = this.f3449l;
                int i7 = this.f3448k;
                int i8 = i6 - (i7 / 2);
                StateListDrawable stateListDrawable = this.f3442c;
                stateListDrawable.setBounds(0, 0, i4, i7);
                int i9 = this.f3455r;
                int i10 = this.f3444f;
                Drawable drawable = this.f3443d;
                drawable.setBounds(0, 0, i10, i9);
                WeakHashMap weakHashMap = Q.f509a;
                if (recyclerView2.getLayoutDirection() == 1) {
                    drawable.draw(canvas);
                    canvas.translate((float) i4, (float) i8);
                    canvas.scale(-1.0f, 1.0f);
                    stateListDrawable.draw(canvas);
                    canvas.scale(1.0f, 1.0f);
                    canvas.translate((float) (-i4), (float) (-i8));
                } else {
                    canvas.translate((float) i5, 0.0f);
                    drawable.draw(canvas);
                    canvas.translate(0.0f, (float) i8);
                    stateListDrawable.draw(canvas);
                    canvas.translate((float) (-i5), (float) (-i8));
                }
            }
            if (this.f3458u) {
                int i11 = this.f3455r;
                int i12 = this.i;
                int i13 = i11 - i12;
                int i14 = this.f3452o;
                int i15 = this.f3451n;
                int i16 = i14 - (i15 / 2);
                StateListDrawable stateListDrawable2 = this.f3445g;
                stateListDrawable2.setBounds(0, 0, i15, i12);
                int i17 = this.f3454q;
                int i18 = this.f3447j;
                Drawable drawable2 = this.f3446h;
                drawable2.setBounds(0, 0, i17, i18);
                canvas.translate(0.0f, (float) i13);
                drawable2.draw(canvas);
                canvas.translate((float) i16, 0.0f);
                stateListDrawable2.draw(canvas);
                canvas.translate((float) (-i16), (float) (-i13));
            }
        }
    }

    public final boolean d(float f2, float f3) {
        if (f3 >= ((float) (this.f3455r - this.i))) {
            int i2 = this.f3452o;
            int i3 = this.f3451n;
            if (f2 < ((float) (i2 - (i3 / 2))) || f2 > ((float) ((i3 / 2) + i2))) {
                return false;
            }
            return true;
        }
        return false;
    }

    public final boolean e(float f2, float f3) {
        boolean z2;
        RecyclerView recyclerView = this.f3456s;
        WeakHashMap weakHashMap = Q.f509a;
        if (recyclerView.getLayoutDirection() == 1) {
            z2 = true;
        } else {
            z2 = false;
        }
        int i2 = this.e;
        if (z2) {
            if (f2 > ((float) (i2 / 2))) {
                return false;
            }
        } else if (f2 < ((float) (this.f3454q - i2))) {
            return false;
        }
        int i3 = this.f3449l;
        int i4 = this.f3448k / 2;
        if (f3 < ((float) (i3 - i4)) || f3 > ((float) (i4 + i3))) {
            return false;
        }
        return true;
    }

    public final void g(int i2) {
        B b2 = this.f3439B;
        StateListDrawable stateListDrawable = this.f3442c;
        if (i2 == 2 && this.f3459v != 2) {
            stateListDrawable.setState(f3436C);
            this.f3456s.removeCallbacks(b2);
        }
        if (i2 == 0) {
            this.f3456s.invalidate();
        } else {
            h();
        }
        if (this.f3459v == 2 && i2 != 2) {
            stateListDrawable.setState(f3437D);
            this.f3456s.removeCallbacks(b2);
            this.f3456s.postDelayed(b2, (long) 1200);
        } else if (i2 == 1) {
            this.f3456s.removeCallbacks(b2);
            this.f3456s.postDelayed(b2, (long) 1500);
        }
        this.f3459v = i2;
    }
}
