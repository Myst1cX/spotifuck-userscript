package A;

import android.os.Parcelable;
import android.view.MotionEvent;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;

public abstract class c {
    public boolean a(View view) {
        return false;
    }

    public boolean d(CoordinatorLayout coordinatorLayout, View view, View view2) {
        return false;
    }

    public boolean f(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
        return false;
    }

    public boolean g(CoordinatorLayout coordinatorLayout, View view, int i) {
        return false;
    }

    public boolean h(CoordinatorLayout coordinatorLayout, View view, int i, int i2, int i3) {
        return false;
    }

    public boolean i(View view) {
        return false;
    }

    public void k(CoordinatorLayout coordinatorLayout, View view, int i, int i2, int i3, int[] iArr) {
        iArr[0] = iArr[0] + i2;
        iArr[1] = iArr[1] + i3;
    }

    public boolean o(View view, int i, int i2) {
        return false;
    }

    public boolean q(View view, MotionEvent motionEvent) {
        return false;
    }

    public void b(View view) {
    }

    public void c(f fVar) {
    }

    public void e() {
    }

    public void j(CoordinatorLayout coordinatorLayout, View view, View view2, int i, int i2, int[] iArr, int i3) {
    }

    public void l(CoordinatorLayout coordinatorLayout, View view) {
    }

    public void m(View view, Parcelable parcelable) {
    }

    public Parcelable n(View view) {
        return View.BaseSavedState.EMPTY_STATE;
    }

    public void p(View view, View view2, int i) {
    }
}
