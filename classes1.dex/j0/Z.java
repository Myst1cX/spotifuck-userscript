package j0;

import N.Q;
import V.d;
import android.os.Build;
import android.view.animation.Interpolator;
import android.widget.OverScroller;
import androidx.recyclerview.widget.RecyclerView;
import java.util.Arrays;
import java.util.WeakHashMap;

public final class Z implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public int f3327a;

    /* renamed from: b  reason: collision with root package name */
    public int f3328b;

    /* renamed from: c  reason: collision with root package name */
    public OverScroller f3329c;

    /* renamed from: d  reason: collision with root package name */
    public Interpolator f3330d;
    public boolean e = false;

    /* renamed from: f  reason: collision with root package name */
    public boolean f3331f = false;

    /* renamed from: g  reason: collision with root package name */
    public final /* synthetic */ RecyclerView f3332g;

    public final void a() {
        if (this.e) {
            this.f3331f = true;
            return;
        }
        RecyclerView recyclerView = this.f3332g;
        recyclerView.removeCallbacks(this);
        WeakHashMap weakHashMap = Q.f509a;
        recyclerView.postOnAnimation(this);
    }

    public final void b(int i, int i2, int i3, Interpolator interpolator) {
        boolean z2;
        int i4;
        int i5;
        RecyclerView recyclerView = this.f3332g;
        if (i3 == Integer.MIN_VALUE) {
            int abs = Math.abs(i);
            int abs2 = Math.abs(i2);
            if (abs > abs2) {
                z2 = true;
            } else {
                z2 = false;
            }
            int sqrt = (int) Math.sqrt((double) 0);
            int sqrt2 = (int) Math.sqrt((double) ((i2 * i2) + (i * i)));
            if (z2) {
                i4 = recyclerView.getWidth();
            } else {
                i4 = recyclerView.getHeight();
            }
            int i6 = i4 / 2;
            float f2 = (float) i4;
            float f3 = (float) i6;
            float sin = (((float) Math.sin((double) ((Math.min(1.0f, (((float) sqrt2) * 1.0f) / f2) - 0.5f) * 0.47123894f))) * f3) + f3;
            if (sqrt > 0) {
                i5 = Math.round(Math.abs(sin / ((float) sqrt)) * 1000.0f) * 4;
            } else {
                if (!z2) {
                    abs = abs2;
                }
                i5 = (int) (((((float) abs) / f2) + 1.0f) * 300.0f);
            }
            i3 = Math.min(i5, 2000);
        }
        int i7 = i3;
        if (interpolator == null) {
            interpolator = RecyclerView.f1979E0;
        }
        if (this.f3330d != interpolator) {
            this.f3330d = interpolator;
            this.f3329c = new OverScroller(recyclerView.getContext(), interpolator);
        }
        this.f3328b = 0;
        this.f3327a = 0;
        recyclerView.setScrollState(2);
        this.f3329c.startScroll(0, 0, i, i2, i7);
        if (Build.VERSION.SDK_INT < 23) {
            this.f3329c.computeScrollOffset();
        }
        a();
    }

    public final void run() {
        int i;
        int i2;
        int i3;
        int i4;
        boolean z2;
        boolean z3;
        boolean z4;
        int i5;
        RecyclerView recyclerView = this.f3332g;
        if (recyclerView.f2030r == null) {
            recyclerView.removeCallbacks(this);
            this.f3329c.abortAnimation();
            return;
        }
        this.f3331f = false;
        this.e = true;
        recyclerView.m();
        OverScroller overScroller = this.f3329c;
        if (overScroller.computeScrollOffset()) {
            int currX = overScroller.getCurrX();
            int currY = overScroller.getCurrY();
            int i6 = currX - this.f3327a;
            int i7 = currY - this.f3328b;
            this.f3327a = currX;
            this.f3328b = currY;
            int[] iArr = recyclerView.f2039v0;
            iArr[0] = 0;
            iArr[1] = 0;
            boolean r2 = recyclerView.r(i6, i7, iArr, (int[]) null, 1);
            int[] iArr2 = recyclerView.f2039v0;
            if (r2) {
                i6 -= iArr2[0];
                i7 -= iArr2[1];
            }
            if (recyclerView.getOverScrollMode() != 2) {
                recyclerView.l(i6, i7);
            }
            if (recyclerView.f2028q != null) {
                iArr2[0] = 0;
                iArr2[1] = 0;
                recyclerView.Z(i6, i7, iArr2);
                int i8 = iArr2[0];
                int i9 = iArr2[1];
                int i10 = i6 - i8;
                int i11 = i7 - i9;
                C0159v vVar = recyclerView.f2030r.e;
                if (vVar != null && !vVar.f3505d && vVar.e) {
                    int b2 = recyclerView.f2016j0.b();
                    if (b2 == 0) {
                        vVar.i();
                    } else if (vVar.f3502a >= b2) {
                        vVar.f3502a = b2 - 1;
                        vVar.g(i8, i9);
                    } else {
                        vVar.g(i8, i9);
                    }
                }
                i3 = i8;
                i2 = i10;
                i = i11;
                i4 = i9;
            } else {
                i2 = i6;
                i = i7;
                i4 = 0;
                i3 = 0;
            }
            if (!recyclerView.f2032s.isEmpty()) {
                recyclerView.invalidate();
            }
            int[] iArr3 = recyclerView.f2039v0;
            iArr3[0] = 0;
            iArr3[1] = 0;
            int i12 = i4;
            recyclerView.s(i3, i4, i2, i, (int[]) null, 1, iArr3);
            int i13 = i2 - iArr2[0];
            int i14 = i - iArr2[1];
            if (!(i3 == 0 && i12 == 0)) {
                recyclerView.t(i3, i12);
            }
            if (!recyclerView.awakenScrollBars()) {
                recyclerView.invalidate();
            }
            if (overScroller.getCurrX() == overScroller.getFinalX()) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (overScroller.getCurrY() == overScroller.getFinalY()) {
                z3 = true;
            } else {
                z3 = false;
            }
            if (overScroller.isFinished() || ((z2 || i13 != 0) && (z3 || i14 != 0))) {
                z4 = true;
            } else {
                z4 = false;
            }
            C0159v vVar2 = recyclerView.f2030r.e;
            if ((vVar2 == null || !vVar2.f3505d) && z4) {
                if (recyclerView.getOverScrollMode() != 2) {
                    int currVelocity = (int) overScroller.getCurrVelocity();
                    if (i13 < 0) {
                        i5 = -currVelocity;
                    } else if (i13 > 0) {
                        i5 = currVelocity;
                    } else {
                        i5 = 0;
                    }
                    if (i14 < 0) {
                        currVelocity = -currVelocity;
                    } else if (i14 <= 0) {
                        currVelocity = 0;
                    }
                    if (i5 < 0) {
                        recyclerView.v();
                        if (recyclerView.f1990K.isFinished()) {
                            recyclerView.f1990K.onAbsorb(-i5);
                        }
                    } else if (i5 > 0) {
                        recyclerView.w();
                        if (recyclerView.f1992M.isFinished()) {
                            recyclerView.f1992M.onAbsorb(i5);
                        }
                    }
                    if (currVelocity < 0) {
                        recyclerView.x();
                        if (recyclerView.f1991L.isFinished()) {
                            recyclerView.f1991L.onAbsorb(-currVelocity);
                        }
                    } else if (currVelocity > 0) {
                        recyclerView.u();
                        if (recyclerView.f1993N.isFinished()) {
                            recyclerView.f1993N.onAbsorb(currVelocity);
                        }
                    }
                    if (!(i5 == 0 && currVelocity == 0)) {
                        WeakHashMap weakHashMap = Q.f509a;
                        recyclerView.postInvalidateOnAnimation();
                    }
                }
                if (RecyclerView.f1977C0) {
                    C0152n nVar = recyclerView.f2014i0;
                    int[] iArr4 = nVar.f3466c;
                    if (iArr4 != null) {
                        Arrays.fill(iArr4, -1);
                    }
                    nVar.f3467d = 0;
                }
            } else {
                a();
                C0154p pVar = recyclerView.f2013h0;
                if (pVar != null) {
                    pVar.a(recyclerView, i3, i12);
                }
            }
        }
        C0159v vVar3 = recyclerView.f2030r.e;
        if (vVar3 != null && vVar3.f3505d) {
            vVar3.g(0, 0);
        }
        this.e = false;
        if (this.f3331f) {
            recyclerView.removeCallbacks(this);
            WeakHashMap weakHashMap2 = Q.f509a;
            recyclerView.postOnAnimation(this);
            return;
        }
        recyclerView.setScrollState(0);
        recyclerView.e0(1);
    }

    public Z(RecyclerView recyclerView) {
        this.f3332g = recyclerView;
        d dVar = RecyclerView.f1979E0;
        this.f3330d = dVar;
        this.f3329c = new OverScroller(recyclerView.getContext(), dVar);
    }
}
