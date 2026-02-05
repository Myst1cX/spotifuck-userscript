package androidx.activity;

import Z0.c;
import h.C0121l;

public final /* synthetic */ class d implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f1151a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ C0121l f1152b;

    public /* synthetic */ d(C0121l lVar, int i) {
        this.f1151a = i;
        this.f1152b = lVar;
    }

    public final void run() {
        switch (this.f1151a) {
            case 0:
                this.f1152b.invalidateOptionsMenu();
                return;
            default:
                try {
                    d.super.onBackPressed();
                    return;
                } catch (IllegalStateException e) {
                    if (!c.a(e.getMessage(), "Can not perform this action after onSaveInstanceState")) {
                        throw e;
                    }
                    return;
                } catch (NullPointerException e2) {
                    if (!c.a(e2.getMessage(), "Attempt to invoke virtual method 'android.os.Handler android.app.FragmentHostCallback.getHandler()' on a null object reference")) {
                        throw e2;
                    }
                    return;
                }
        }
    }
}
