package o;

import android.content.Context;
import android.view.View;
import j0.C0160w;
import n.C0185D;
import n.C0197l;
import n.C0205t;
import n.C0207v;

/* renamed from: o.g  reason: case insensitive filesystem */
public final class C0278g extends C0207v {

    /* renamed from: l  reason: collision with root package name */
    public final /* synthetic */ int f4201l = 0;

    /* renamed from: m  reason: collision with root package name */
    public final /* synthetic */ C0286k f4202m;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C0278g(C0286k kVar, Context context, C0197l lVar, View view) {
        super(2130968610, context, view, lVar, true);
        this.f4202m = kVar;
        this.f3940f = 8388613;
        C0160w wVar = kVar.f4240B;
        this.f3942h = wVar;
        C0205t tVar = this.i;
        if (tVar != null) {
            tVar.j(wVar);
        }
    }

    public final void c() {
        switch (this.f4201l) {
            case 0:
                C0286k kVar = this.f4202m;
                kVar.f4259y = null;
                kVar.getClass();
                super.c();
                return;
            default:
                C0286k kVar2 = this.f4202m;
                C0197l lVar = kVar2.f4243h;
                if (lVar != null) {
                    lVar.c(true);
                }
                kVar2.f4258x = null;
                super.c();
                return;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C0278g(C0286k kVar, Context context, C0185D d2, View view) {
        super(2130968610, context, view, d2, false);
        this.f4202m = kVar;
        if (!d2.f3812A.f()) {
            View view2 = kVar.f4248n;
            this.e = view2 == null ? (View) kVar.f4247m : view2;
        }
        C0160w wVar = kVar.f4240B;
        this.f3942h = wVar;
        C0205t tVar = this.i;
        if (tVar != null) {
            tVar.j(wVar);
        }
    }
}
