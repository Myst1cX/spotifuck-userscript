package androidx.activity;

import android.window.OnBackInvokedCallback;
import h.D;

public final /* synthetic */ class w implements OnBackInvokedCallback {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f1205a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Object f1206b;

    public /* synthetic */ w(int i, Object obj) {
        this.f1205a = i;
        this.f1206b = obj;
    }

    public final void onBackInvoked() {
        switch (this.f1205a) {
            case 0:
                ((v) this.f1206b).a();
                return;
            case 1:
                ((D) this.f1206b).C();
                return;
            default:
                ((Runnable) this.f1206b).run();
                return;
        }
    }
}
