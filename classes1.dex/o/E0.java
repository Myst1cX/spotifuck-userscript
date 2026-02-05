package o;

import android.database.DataSetObserver;

public final class E0 extends DataSetObserver {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ H0 f4058a;

    public E0(H0 h02) {
        this.f4058a = h02;
    }

    public final void onChanged() {
        H0 h02 = this.f4058a;
        if (h02.f4073E.isShowing()) {
            h02.i();
        }
    }

    public final void onInvalidated() {
        this.f4058a.dismiss();
    }
}
