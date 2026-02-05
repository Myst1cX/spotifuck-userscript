package B0;

import android.app.Dialog;
import android.graphics.Rect;
import android.graphics.RectF;
import android.os.Build;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;

public final class a implements View.OnTouchListener {

    /* renamed from: f  reason: collision with root package name */
    public final Dialog f30f;

    /* renamed from: g  reason: collision with root package name */
    public final int f31g;

    /* renamed from: h  reason: collision with root package name */
    public final int f32h;
    public final int i;

    public a(Dialog dialog, Rect rect) {
        this.f30f = dialog;
        this.f31g = rect.left;
        this.f32h = rect.top;
        this.i = ViewConfiguration.get(dialog.getContext()).getScaledWindowTouchSlop();
    }

    public final boolean onTouch(View view, MotionEvent motionEvent) {
        View findViewById = view.findViewById(16908290);
        int left = findViewById.getLeft() + this.f31g;
        int width = findViewById.getWidth() + left;
        int top = findViewById.getTop() + this.f32h;
        if (new RectF((float) left, (float) top, (float) width, (float) (findViewById.getHeight() + top)).contains(motionEvent.getX(), motionEvent.getY())) {
            return false;
        }
        MotionEvent obtain = MotionEvent.obtain(motionEvent);
        if (motionEvent.getAction() == 1) {
            obtain.setAction(4);
        }
        if (Build.VERSION.SDK_INT < 28) {
            obtain.setAction(0);
            int i2 = this.i;
            obtain.setLocation((float) ((-i2) - 1), (float) ((-i2) - 1));
        }
        view.performClick();
        return this.f30f.onTouchEvent(obtain);
    }
}
