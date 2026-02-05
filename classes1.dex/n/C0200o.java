package n;

import android.view.ActionProvider;
import j0.C0160w;

/* renamed from: n.o  reason: case insensitive filesystem */
public final class C0200o implements ActionProvider.VisibilityListener {

    /* renamed from: a  reason: collision with root package name */
    public C0160w f3924a;

    /* renamed from: b  reason: collision with root package name */
    public final ActionProvider f3925b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ C0204s f3926c;

    public final void onActionProviderVisibilityChanged(boolean z2) {
        C0160w wVar = this.f3924a;
        if (wVar != null) {
            C0197l lVar = ((C0199n) wVar.f3516f).f3911n;
            lVar.f3878h = true;
            lVar.p(true);
        }
    }

    public C0200o(C0204s sVar, ActionProvider actionProvider) {
        this.f3926c = sVar;
        this.f3925b = actionProvider;
    }
}
