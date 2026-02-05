package o;

import android.view.View;
import n.C0195j;
import n.C0197l;

/* renamed from: o.i  reason: case insensitive filesystem */
public final class C0282i implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final C0278g f4206a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ C0286k f4207b;

    public final void run() {
        C0195j jVar;
        C0286k kVar = this.f4207b;
        C0197l lVar = kVar.f4243h;
        if (!(lVar == null || (jVar = lVar.e) == null)) {
            jVar.f(lVar);
        }
        View view = (View) kVar.f4247m;
        if (!(view == null || view.getWindowToken() == null)) {
            C0278g gVar = this.f4206a;
            if (!gVar.b()) {
                if (gVar.e != null) {
                    gVar.d(0, 0, false, false);
                }
            }
            kVar.f4258x = gVar;
        }
        kVar.f4260z = null;
    }

    public C0282i(C0286k kVar, C0278g gVar) {
        this.f4207b = kVar;
        this.f4206a = gVar;
    }
}
