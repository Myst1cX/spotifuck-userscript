package R0;

import it.deviato.spotifuck.AppSingleton;
import it.deviato.spotifuck.LockableHScrollView;
import it.deviato.spotifuck.MainActivity;
import p0.C0320a;

public final /* synthetic */ class g implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f859a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ MainActivity f860b;

    public /* synthetic */ g(MainActivity mainActivity, int i) {
        this.f859a = i;
        this.f860b = mainActivity;
    }

    public final void run() {
        MainActivity mainActivity = this.f860b;
        switch (this.f859a) {
            case 0:
                LockableHScrollView lockableHScrollView = MainActivity.f3163F;
                mainActivity.s();
                MainActivity.f3167K.isAttachedToWindow();
                return;
            default:
                LockableHScrollView lockableHScrollView2 = MainActivity.f3163F;
                mainActivity.getClass();
                C0320a.G0(AppSingleton.f3142f, MainActivity.f3170N);
                mainActivity.s();
                return;
        }
    }
}
