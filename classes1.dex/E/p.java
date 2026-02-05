package E;

import android.view.View;
import com.google.android.material.sidesheet.SideSheetBehavior;

public final /* synthetic */ class p implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f118a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ int f119b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ Object f120c;

    public /* synthetic */ p(int i, int i2, Object obj) {
        this.f118a = i2;
        this.f120c = obj;
        this.f119b = i;
    }

    public final void run() {
        switch (this.f118a) {
            case 0:
                ((b) this.f120c).i(this.f119b);
                return;
            default:
                SideSheetBehavior sideSheetBehavior = (SideSheetBehavior) this.f120c;
                View view = (View) sideSheetBehavior.f2323p.get();
                if (view != null) {
                    sideSheetBehavior.t(view, this.f119b, false);
                    return;
                }
                return;
        }
    }
}
