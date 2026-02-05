package o;

import android.os.Handler;
import android.widget.AbsListView;

public final class F0 implements AbsListView.OnScrollListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ H0 f4059a;

    public final void onScrollStateChanged(AbsListView absListView, int i) {
        if (i == 1) {
            H0 h02 = this.f4059a;
            if (h02.f4073E.getInputMethodMode() != 2 && h02.f4073E.getContentView() != null) {
                Handler handler = h02.f4069A;
                D0 d02 = h02.f4090w;
                handler.removeCallbacks(d02);
                d02.run();
            }
        }
    }

    public final void onScroll(AbsListView absListView, int i, int i2, int i3) {
    }

    public F0(H0 h02) {
        this.f4059a = h02;
    }
}
