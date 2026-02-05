package h;

import T0.g;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.MotionEvent;
import androidx.appcompat.widget.ContentFrameLayout;
import m.C0176c;

public final class B extends ContentFrameLayout {

    /* renamed from: n  reason: collision with root package name */
    public final /* synthetic */ D f2833n;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public B(D d2, C0176c cVar) {
        super(cVar, (AttributeSet) null);
        this.f2833n = d2;
    }

    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        if (this.f2833n.s(keyEvent) || super.dispatchKeyEvent(keyEvent)) {
            return true;
        }
        return false;
    }

    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            int x2 = (int) motionEvent.getX();
            int y2 = (int) motionEvent.getY();
            if (x2 < -5 || y2 < -5 || x2 > getWidth() + 5 || y2 > getHeight() + 5) {
                D d2 = this.f2833n;
                d2.q(d2.y(0), true);
                return true;
            }
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    public final void setBackgroundResource(int i) {
        setBackgroundDrawable(g.n(getContext(), i));
    }
}
