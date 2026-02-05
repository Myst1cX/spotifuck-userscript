package Q0;

import J.k;
import R0.a;
import R0.f;
import android.os.Trace;
import android.support.v4.media.session.t;
import androidx.emoji2.text.j;
import it.deviato.spotifuck.AppSingleton;
import it.deviato.spotifuck.MainActivity;
import it.deviato.spotifuck.WebService;

/* renamed from: Q0.e  reason: case insensitive filesystem */
public final class C0036e implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f789a;

    public /* synthetic */ C0036e(int i) {
        this.f789a = i;
    }

    public final void run() {
        boolean z2 = false;
        switch (this.f789a) {
            case 0:
                throw null;
            case 1:
                MainActivity mainActivity = (MainActivity) AppSingleton.f3143g.get();
                f.deferMessage(mainActivity.getString(2131755130));
                mainActivity.runOnUiThread(new a(mainActivity, 3));
                t tVar = WebService.f3187n;
                AppSingleton.a();
                return;
            case 2:
                MainActivity mainActivity2 = (MainActivity) AppSingleton.f3143g.get();
                f.deferMessage(mainActivity2.getString(2131755131));
                mainActivity2.runOnUiThread(new a(mainActivity2, 4));
                AppSingleton.f3136A = 0;
                AppSingleton.i.putString("AutoSleep", "0");
                AppSingleton.i.commit();
                t tVar2 = WebService.f3187n;
                AppSingleton.a();
                return;
            default:
                try {
                    int i = k.f299a;
                    Trace.beginSection("EmojiCompat.EmojiCompatInitializer.run");
                    if (j.f1514k != null) {
                        z2 = true;
                    }
                    if (z2) {
                        j.a().c();
                    }
                    Trace.endSection();
                    return;
                } catch (Throwable th) {
                    int i2 = k.f299a;
                    Trace.endSection();
                    throw th;
                }
        }
    }
}
