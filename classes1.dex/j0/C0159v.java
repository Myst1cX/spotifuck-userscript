package j0;

import android.content.Context;
import android.graphics.PointF;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.View;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.LinearInterpolator;
import androidx.recyclerview.widget.RecyclerView;

/* renamed from: j0.v  reason: case insensitive filesystem */
public class C0159v {

    /* renamed from: a  reason: collision with root package name */
    public int f3502a = -1;

    /* renamed from: b  reason: collision with root package name */
    public RecyclerView f3503b;

    /* renamed from: c  reason: collision with root package name */
    public K f3504c;

    /* renamed from: d  reason: collision with root package name */
    public boolean f3505d;
    public boolean e;

    /* renamed from: f  reason: collision with root package name */
    public View f3506f;

    /* renamed from: g  reason: collision with root package name */
    public final V f3507g;

    /* renamed from: h  reason: collision with root package name */
    public boolean f3508h;
    public final LinearInterpolator i;

    /* renamed from: j  reason: collision with root package name */
    public final DecelerateInterpolator f3509j;

    /* renamed from: k  reason: collision with root package name */
    public PointF f3510k;

    /* renamed from: l  reason: collision with root package name */
    public final DisplayMetrics f3511l;

    /* renamed from: m  reason: collision with root package name */
    public boolean f3512m;

    /* renamed from: n  reason: collision with root package name */
    public float f3513n;

    /* renamed from: o  reason: collision with root package name */
    public int f3514o;

    /* renamed from: p  reason: collision with root package name */
    public int f3515p;

    public static int a(int i2, int i3, int i4, int i5, int i6) {
        if (i6 == -1) {
            return i4 - i2;
        }
        if (i6 == 0) {
            int i7 = i4 - i2;
            if (i7 > 0) {
                return i7;
            }
            int i8 = i5 - i3;
            if (i8 < 0) {
                return i8;
            }
            return 0;
        } else if (i6 == 1) {
            return i5 - i3;
        } else {
            throw new IllegalArgumentException("snap preference should be one of the constants defined in SmoothScroller, starting with SNAP_");
        }
    }

    public int b(View view, int i2) {
        K k2 = this.f3504c;
        if (k2 == null || !k2.d()) {
            return 0;
        }
        L l2 = (L) view.getLayoutParams();
        return a((view.getLeft() - ((L) view.getLayoutParams()).f3291b.left) - l2.leftMargin, view.getRight() + ((L) view.getLayoutParams()).f3291b.right + l2.rightMargin, k2.E(), k2.f3288n - k2.F(), i2);
    }

    public int c(View view, int i2) {
        K k2 = this.f3504c;
        if (k2 == null || !k2.e()) {
            return 0;
        }
        L l2 = (L) view.getLayoutParams();
        return a((view.getTop() - ((L) view.getLayoutParams()).f3291b.top) - l2.topMargin, view.getBottom() + ((L) view.getLayoutParams()).f3291b.bottom + l2.bottomMargin, k2.G(), k2.f3289o - k2.D(), i2);
    }

    public float d(DisplayMetrics displayMetrics) {
        return 25.0f / ((float) displayMetrics.densityDpi);
    }

    public PointF f(int i2) {
        K k2 = this.f3504c;
        if (k2 instanceof W) {
            return ((W) k2).a(i2);
        }
        Log.w("RecyclerView", "You should override computeScrollVectorForPosition when the LayoutManager does not implement " + W.class.getCanonicalName());
        return null;
    }

    public final void g(int i2, int i3) {
        PointF f2;
        RecyclerView recyclerView = this.f3503b;
        int i4 = -1;
        if (this.f3502a == -1 || recyclerView == null) {
            i();
        }
        if (this.f3505d && this.f3506f == null && this.f3504c != null && (f2 = f(this.f3502a)) != null) {
            float f3 = f2.x;
            if (!(f3 == 0.0f && f2.y == 0.0f)) {
                recyclerView.Z((int) Math.signum(f3), (int) Math.signum(f2.y), (int[]) null);
            }
        }
        boolean z2 = false;
        this.f3505d = false;
        View view = this.f3506f;
        V v2 = this.f3507g;
        if (view != null) {
            this.f3503b.getClass();
            a0 I = RecyclerView.I(view);
            if (I != null) {
                i4 = I.b();
            }
            if (i4 == this.f3502a) {
                View view2 = this.f3506f;
                X x2 = recyclerView.f2016j0;
                h(view2, v2);
                v2.a(recyclerView);
                i();
            } else {
                Log.e("RecyclerView", "Passed over target position while smooth scrolling.");
                this.f3506f = null;
            }
        }
        if (this.e) {
            X x3 = recyclerView.f2016j0;
            if (this.f3503b.f2030r.v() == 0) {
                i();
            } else {
                int i5 = this.f3514o;
                int i6 = i5 - i2;
                if (i5 * i6 <= 0) {
                    i6 = 0;
                }
                this.f3514o = i6;
                int i7 = this.f3515p;
                int i8 = i7 - i3;
                if (i7 * i8 <= 0) {
                    i8 = 0;
                }
                this.f3515p = i8;
                if (i6 == 0 && i8 == 0) {
                    PointF f4 = f(this.f3502a);
                    if (f4 != null) {
                        float f5 = f4.x;
                        if (!(f5 == 0.0f && f4.y == 0.0f)) {
                            float f6 = f4.y;
                            float sqrt = (float) Math.sqrt((double) ((f6 * f6) + (f5 * f5)));
                            float f7 = f4.x / sqrt;
                            f4.x = f7;
                            float f8 = f4.y / sqrt;
                            f4.y = f8;
                            this.f3510k = f4;
                            this.f3514o = (int) (f7 * 10000.0f);
                            this.f3515p = (int) (f8 * 10000.0f);
                            int e2 = e(10000);
                            LinearInterpolator linearInterpolator = this.i;
                            v2.f3309a = (int) (((float) this.f3514o) * 1.2f);
                            v2.f3310b = (int) (((float) this.f3515p) * 1.2f);
                            v2.f3311c = (int) (((float) e2) * 1.2f);
                            v2.e = linearInterpolator;
                            v2.f3313f = true;
                        }
                    }
                    v2.f3312d = this.f3502a;
                    i();
                }
            }
            if (v2.f3312d >= 0) {
                z2 = true;
            }
            v2.a(recyclerView);
            if (z2 && this.e) {
                this.f3505d = true;
                recyclerView.f2011g0.a();
            }
        }
    }

    public void h(View view, V v2) {
        int i2;
        int i3;
        int i4;
        PointF pointF = this.f3510k;
        int i5 = 0;
        if (pointF == null || pointF.x == 0.0f) {
            i2 = 0;
        } else if (i4 > 0) {
            i2 = 1;
        } else {
            i2 = -1;
        }
        int b2 = b(view, i2);
        PointF pointF2 = this.f3510k;
        if (!(pointF2 == null || pointF2.y == 0.0f)) {
            i5 = i3 > 0 ? 1 : -1;
        }
        int c2 = c(view, i5);
        int ceil = (int) Math.ceil(((double) e((int) Math.sqrt((double) ((c2 * c2) + (b2 * b2))))) / 0.3356d);
        if (ceil > 0) {
            DecelerateInterpolator decelerateInterpolator = this.f3509j;
            v2.f3309a = -b2;
            v2.f3310b = -c2;
            v2.f3311c = ceil;
            v2.e = decelerateInterpolator;
            v2.f3313f = true;
        }
    }

    public final void i() {
        if (this.e) {
            this.e = false;
            this.f3515p = 0;
            this.f3514o = 0;
            this.f3510k = null;
            this.f3503b.f2016j0.f3315a = -1;
            this.f3506f = null;
            this.f3502a = -1;
            this.f3505d = false;
            K k2 = this.f3504c;
            if (k2.e == this) {
                k2.e = null;
            }
            this.f3504c = null;
            this.f3503b = null;
        }
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [java.lang.Object, j0.V] */
    public C0159v(Context context) {
        ? obj = new Object();
        obj.f3312d = -1;
        obj.f3313f = false;
        obj.f3314g = 0;
        obj.f3309a = 0;
        obj.f3310b = 0;
        obj.f3311c = Integer.MIN_VALUE;
        obj.e = null;
        this.f3507g = obj;
        this.i = new LinearInterpolator();
        this.f3509j = new DecelerateInterpolator();
        this.f3512m = false;
        this.f3514o = 0;
        this.f3515p = 0;
        this.f3511l = context.getResources().getDisplayMetrics();
    }

    public int e(int i2) {
        float abs = (float) Math.abs(i2);
        if (!this.f3512m) {
            this.f3513n = d(this.f3511l);
            this.f3512m = true;
        }
        return (int) Math.ceil((double) (abs * this.f3513n));
    }
}
