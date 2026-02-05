package o;

import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewParent;

/* renamed from: o.x0  reason: case insensitive filesystem */
public final class C0313x0 implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f4326a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ C0315y0 f4327b;

    public /* synthetic */ C0313x0(C0315y0 y0Var, int i) {
        this.f4326a = i;
        this.f4327b = y0Var;
    }

    public final void run() {
        switch (this.f4326a) {
            case 0:
                ViewParent parent = this.f4327b.i.getParent();
                if (parent != null) {
                    parent.requestDisallowInterceptTouchEvent(true);
                    return;
                }
                return;
            default:
                C0315y0 y0Var = this.f4327b;
                y0Var.a();
                View view = y0Var.i;
                if (view.isEnabled() && !view.isLongClickable() && y0Var.c()) {
                    view.getParent().requestDisallowInterceptTouchEvent(true);
                    long uptimeMillis = SystemClock.uptimeMillis();
                    MotionEvent obtain = MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0);
                    view.onTouchEvent(obtain);
                    obtain.recycle();
                    y0Var.f4336l = true;
                    return;
                }
                return;
        }
    }
}
