package N0;

import android.view.MotionEvent;
import android.view.View;

public final /* synthetic */ class i implements View.OnTouchListener {

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ l f632f;

    public /* synthetic */ i(l lVar) {
        this.f632f = lVar;
    }

    public final boolean onTouch(View view, MotionEvent motionEvent) {
        boolean z2;
        l lVar = this.f632f;
        lVar.getClass();
        if (motionEvent.getAction() == 1) {
            long currentTimeMillis = System.currentTimeMillis() - lVar.f643o;
            if (currentTimeMillis < 0 || currentTimeMillis > 300) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (z2) {
                lVar.f641m = false;
            }
            lVar.u();
            lVar.f641m = true;
            lVar.f643o = System.currentTimeMillis();
        }
        return false;
    }
}
