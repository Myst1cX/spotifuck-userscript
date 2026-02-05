package o;

import android.view.MenuItem;
import androidx.appcompat.widget.Toolbar;
import androidx.fragment.app.A;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import n.C0195j;
import n.C0197l;

public final class Y0 implements C0292n, C0195j {

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ Toolbar f4153f;

    public /* synthetic */ Y0(Toolbar toolbar) {
        this.f4153f = toolbar;
    }

    public boolean d(C0197l lVar, MenuItem menuItem) {
        this.f4153f.getClass();
        return false;
    }

    public void f(C0197l lVar) {
        Toolbar toolbar = this.f4153f;
        C0286k kVar = toolbar.f1396f.f1316y;
        if (kVar == null || !kVar.i()) {
            Iterator it2 = ((CopyOnWriteArrayList) toolbar.f1385L.f1132c).iterator();
            while (it2.hasNext()) {
                ((A) it2.next()).f1556a.s();
            }
        }
    }
}
