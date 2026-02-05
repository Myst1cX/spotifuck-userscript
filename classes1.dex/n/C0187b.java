package n;

import android.view.View;
import androidx.appcompat.view.menu.ActionMenuItemView;
import o.C0278g;
import o.C0280h;
import o.C0284j;
import o.C0286k;
import o.C0315y0;

/* renamed from: n.b  reason: case insensitive filesystem */
public final class C0187b extends C0315y0 {

    /* renamed from: o  reason: collision with root package name */
    public final /* synthetic */ int f3828o = 0;

    /* renamed from: p  reason: collision with root package name */
    public final /* synthetic */ View f3829p;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C0187b(ActionMenuItemView actionMenuItemView) {
        super(actionMenuItemView);
        this.f3829p = actionMenuItemView;
    }

    public final C0183B b() {
        C0278g gVar;
        switch (this.f3828o) {
            case 0:
                C0188c cVar = ((ActionMenuItemView) this.f3829p).f1227r;
                if (cVar == null || (gVar = ((C0280h) cVar).f4203a.f4259y) == null) {
                    return null;
                }
                return gVar.a();
            default:
                C0278g gVar2 = ((C0284j) this.f3829p).i.f4258x;
                if (gVar2 == null) {
                    return null;
                }
                return gVar2.a();
        }
    }

    public final boolean c() {
        C0183B b2;
        switch (this.f3828o) {
            case 0:
                ActionMenuItemView actionMenuItemView = (ActionMenuItemView) this.f3829p;
                C0196k kVar = actionMenuItemView.f1225p;
                if (kVar == null || !kVar.c(actionMenuItemView.f1222m) || (b2 = b()) == null || !b2.a()) {
                    return false;
                }
                return true;
            default:
                ((C0284j) this.f3829p).i.l();
                return true;
        }
    }

    public boolean d() {
        switch (this.f3828o) {
            case 1:
                C0286k kVar = ((C0284j) this.f3829p).i;
                if (kVar.f4260z != null) {
                    return false;
                }
                kVar.e();
                return true;
            default:
                return super.d();
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C0187b(C0284j jVar, C0284j jVar2) {
        super(jVar2);
        this.f3829p = jVar;
    }
}
