package N;

import K0.e;
import android.view.View;
import android.view.Window;
import android.view.WindowInsetsController;
import p0.C0320a;

public final class A0 extends C0320a {

    /* renamed from: o  reason: collision with root package name */
    public final WindowInsetsController f494o;

    /* renamed from: p  reason: collision with root package name */
    public Window f495p;

    public final void t0(boolean z2) {
        Window window = this.f495p;
        if (z2) {
            if (window != null) {
                View decorView = window.getDecorView();
                decorView.setSystemUiVisibility(decorView.getSystemUiVisibility() | 16);
            }
            this.f494o.setSystemBarsAppearance(16, 16);
            return;
        }
        if (window != null) {
            View decorView2 = window.getDecorView();
            decorView2.setSystemUiVisibility(decorView2.getSystemUiVisibility() & -17);
        }
        this.f494o.setSystemBarsAppearance(0, 16);
    }

    public final void u0(boolean z2) {
        Window window = this.f495p;
        if (z2) {
            if (window != null) {
                View decorView = window.getDecorView();
                decorView.setSystemUiVisibility(decorView.getSystemUiVisibility() | 8192);
            }
            this.f494o.setSystemBarsAppearance(8, 8);
            return;
        }
        if (window != null) {
            View decorView2 = window.getDecorView();
            decorView2.setSystemUiVisibility(decorView2.getSystemUiVisibility() & -8193);
        }
        this.f494o.setSystemBarsAppearance(0, 8);
    }

    public A0(WindowInsetsController windowInsetsController, e eVar) {
        this.f494o = windowInsetsController;
    }
}
