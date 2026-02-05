package R0;

import android.content.Context;
import it.deviato.spotifuck.AppSingleton;
import it.deviato.spotifuck.MainActivity;

public final /* synthetic */ class a implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f856a;

    public /* synthetic */ a(int i) {
        this.f856a = i;
    }

    public final void run() {
        switch (this.f856a) {
            case 0:
                Context context = AppSingleton.f3142f;
                MainActivity.u();
                return;
            case 1:
                AppSingleton.f3145j.dispatchWindowVisibilityChanged(0);
                return;
            case 2:
                AppSingleton.f3145j.dispatchWindowVisibilityChanged(8);
                return;
            case 3:
                MainActivity.f3168L.performClick();
                return;
            case 4:
                MainActivity.f3168L.performClick();
                return;
            case 5:
                MainActivity.f3172P = false;
                return;
            default:
                MainActivity.f3169M.setVisibility(4);
                MainActivity.f3166J.setVisibility(8);
                return;
        }
    }

    public /* synthetic */ a(MainActivity mainActivity, int i) {
        this.f856a = i;
    }
}
