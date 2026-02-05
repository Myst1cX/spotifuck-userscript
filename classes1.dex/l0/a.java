package L0;

import android.view.View;
import android.view.ViewGroup;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.sidesheet.SideSheetBehavior;
import p0.C0320a;

public final class a extends C0320a {

    /* renamed from: o  reason: collision with root package name */
    public final /* synthetic */ int f468o;

    /* renamed from: p  reason: collision with root package name */
    public final SideSheetBehavior f469p;

    public /* synthetic */ a(SideSheetBehavior sideSheetBehavior, int i) {
        this.f468o = i;
        this.f469p = sideSheetBehavior;
    }

    public final int X() {
        switch (this.f468o) {
            case 0:
                return 1;
            default:
                return 0;
        }
    }

    public final boolean c0(float f2) {
        switch (this.f468o) {
            case 0:
                return f2 > 0.0f;
            default:
                return f2 < 0.0f;
        }
    }

    public final boolean F0(View view, float f2) {
        switch (this.f468o) {
            case 0:
                SideSheetBehavior sideSheetBehavior = this.f469p;
                float abs = Math.abs((f2 * sideSheetBehavior.f2318k) + ((float) view.getLeft()));
                sideSheetBehavior.getClass();
                if (abs > 0.5f) {
                    return true;
                }
                return false;
            default:
                SideSheetBehavior sideSheetBehavior2 = this.f469p;
                float abs2 = Math.abs((f2 * sideSheetBehavior2.f2318k) + ((float) view.getRight()));
                sideSheetBehavior2.getClass();
                if (abs2 > 0.5f) {
                    return true;
                }
                return false;
        }
    }

    public final void I0(ViewGroup.MarginLayoutParams marginLayoutParams, int i, int i2) {
        switch (this.f468o) {
            case 0:
                if (i <= this.f469p.f2320m) {
                    marginLayoutParams.leftMargin = i2;
                    return;
                }
                return;
            default:
                int i3 = this.f469p.f2320m;
                if (i <= i3) {
                    marginLayoutParams.rightMargin = i3 - i;
                    return;
                }
                return;
        }
    }

    public final int P() {
        switch (this.f468o) {
            case 0:
                SideSheetBehavior sideSheetBehavior = this.f469p;
                return Math.max(0, sideSheetBehavior.f2321n + sideSheetBehavior.f2322o);
            default:
                SideSheetBehavior sideSheetBehavior2 = this.f469p;
                return Math.max(0, (sideSheetBehavior2.f2320m - sideSheetBehavior2.f2319l) - sideSheetBehavior2.f2322o);
        }
    }

    public final int Q() {
        switch (this.f468o) {
            case 0:
                SideSheetBehavior sideSheetBehavior = this.f469p;
                return (-sideSheetBehavior.f2319l) - sideSheetBehavior.f2322o;
            default:
                return this.f469p.f2320m;
        }
    }

    public final int T() {
        switch (this.f468o) {
            case 0:
                return this.f469p.f2322o;
            default:
                return this.f469p.f2320m;
        }
    }

    public final int U() {
        switch (this.f468o) {
            case 0:
                return -this.f469p.f2319l;
            default:
                return P();
        }
    }

    public final int V(View view) {
        switch (this.f468o) {
            case 0:
                return view.getRight() + this.f469p.f2322o;
            default:
                return view.getLeft() - this.f469p.f2322o;
        }
    }

    public final int W(CoordinatorLayout coordinatorLayout) {
        switch (this.f468o) {
            case 0:
                return coordinatorLayout.getLeft();
            default:
                return coordinatorLayout.getRight();
        }
    }

    public final int e(ViewGroup.MarginLayoutParams marginLayoutParams) {
        switch (this.f468o) {
            case 0:
                return marginLayoutParams.leftMargin;
            default:
                return marginLayoutParams.rightMargin;
        }
    }

    public final float f(int i) {
        switch (this.f468o) {
            case 0:
                float Q2 = (float) Q();
                return (((float) i) - Q2) / (((float) P()) - Q2);
            default:
                float f2 = (float) this.f469p.f2320m;
                return (f2 - ((float) i)) / (f2 - ((float) P()));
        }
    }

    public final boolean f0(View view) {
        switch (this.f468o) {
            case 0:
                if (view.getRight() < (P() - Q()) / 2) {
                    return true;
                }
                return false;
            default:
                if (view.getLeft() > (P() + this.f469p.f2320m) / 2) {
                    return true;
                }
                return false;
        }
    }

    public final boolean g0(float f2, float f3) {
        switch (this.f468o) {
            case 0:
                if (Math.abs(f2) > Math.abs(f3)) {
                    float abs = Math.abs(f2);
                    this.f469p.getClass();
                    if (abs > ((float) 500)) {
                        return true;
                    }
                }
                return false;
            default:
                if (Math.abs(f2) > Math.abs(f3)) {
                    float abs2 = Math.abs(f2);
                    this.f469p.getClass();
                    if (abs2 > ((float) 500)) {
                        return true;
                    }
                }
                return false;
        }
    }
}
