package R0;

import android.webkit.WebView;
import it.deviato.spotifuck.AppSingleton;

public final class c extends WebView {
    public final void onWindowVisibilityChanged(int i) {
        if (i == 8 || i == 4) {
            AppSingleton.f3145j.evaluateJavascript("typeof playing!=='undefined'&&playing&&!!document.querySelector('.VideoPlayer__container video');", new b(this, i));
        } else {
            super.onWindowVisibilityChanged(i);
        }
    }

    public static /* synthetic */ void a(c cVar, int i, String str) {
        cVar.getClass();
        if ("true".equals(str)) {
            super.onWindowVisibilityChanged(0);
        } else {
            super.onWindowVisibilityChanged(i);
        }
    }
}
