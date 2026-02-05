package N;

import F.c;
import N0.E;
import android.view.View;
import it.deviato.spotifuck.LockableHScrollView;
import it.deviato.spotifuck.MainActivity;
import n0.C0230k;
import n0.C0231l;
import n0.C0232m;

/* renamed from: N.g  reason: case insensitive filesystem */
public final /* synthetic */ class C0007g implements E, r, C0231l {

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ int f542f;

    public /* synthetic */ C0007g(int i) {
        this.f542f = i;
    }

    public void a(C0230k kVar, C0232m mVar) {
        switch (this.f542f) {
            case 3:
                kVar.f(mVar);
                return;
            case 4:
                kVar.c(mVar);
                return;
            case 5:
                kVar.g(mVar);
                return;
            case 6:
                kVar.a();
                return;
            default:
                kVar.d();
                return;
        }
    }

    public w0 l(View view, w0 w0Var) {
        LockableHScrollView lockableHScrollView = MainActivity.f3163F;
        c f2 = w0Var.f597a.f(7);
        view.setPadding(f2.f225a, f2.f226b, f2.f227c, f2.f228d);
        return w0Var;
    }
}
