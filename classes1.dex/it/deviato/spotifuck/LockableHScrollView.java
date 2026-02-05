package it.deviato.spotifuck;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.widget.HorizontalScrollView;

public class LockableHScrollView extends HorizontalScrollView {

    /* renamed from: f  reason: collision with root package name */
    public boolean f3162f = true;

    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (!this.f3162f || !super.onInterceptTouchEvent(motionEvent)) {
            return false;
        }
        return true;
    }

    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (!this.f3162f || !super.onTouchEvent(motionEvent)) {
            return false;
        }
        return true;
    }

    public void setScrollingEnabled(boolean z2) {
        this.f3162f = z2;
    }

    public LockableHScrollView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }
}
