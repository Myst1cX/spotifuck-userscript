package o;

import android.view.MotionEvent;
import android.view.View;

public final class G0 implements View.OnTouchListener {

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ H0 f4061f;

    public G0(H0 h02) {
        this.f4061f = h02;
    }

    public final boolean onTouch(View view, MotionEvent motionEvent) {
        C0246A a2;
        int action = motionEvent.getAction();
        int x2 = (int) motionEvent.getX();
        int y2 = (int) motionEvent.getY();
        H0 h02 = this.f4061f;
        if (action == 0 && (a2 = h02.f4073E) != null && a2.isShowing() && x2 >= 0 && x2 < h02.f4073E.getWidth() && y2 >= 0 && y2 < h02.f4073E.getHeight()) {
            h02.f4069A.postDelayed(h02.f4090w, 250);
            return false;
        } else if (action != 1) {
            return false;
        } else {
            h02.f4069A.removeCallbacks(h02.f4090w);
            return false;
        }
    }
}
