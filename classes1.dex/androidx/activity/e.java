package androidx.activity;

import Z0.c;
import android.view.View;
import android.view.Window;
import androidx.lifecycle.C0077l;
import androidx.lifecycle.C0081p;
import androidx.lifecycle.r;
import h.C0121l;
import k0.C0168c;

public final /* synthetic */ class e implements C0081p {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f1153a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Object f1154b;

    public /* synthetic */ e(int i, Object obj) {
        this.f1153a = i;
        this.f1154b = obj;
    }

    public final void b(r rVar, C0077l lVar) {
        Window window;
        View peekDecorView;
        switch (this.f1153a) {
            case 0:
                if (lVar == C0077l.ON_STOP && (window = ((C0121l) this.f1154b).getWindow()) != null && (peekDecorView = window.peekDecorView()) != null) {
                    peekDecorView.cancelPendingInputEvents();
                    return;
                }
                return;
            case 1:
                C0121l lVar2 = (C0121l) this.f1154b;
                if (lVar == C0077l.ON_DESTROY) {
                    lVar2.f1175g.f2082b = null;
                    if (!lVar2.isChangingConfigurations()) {
                        lVar2.c().a();
                    }
                    k kVar = lVar2.f1178k;
                    C0121l lVar3 = kVar.f1165d;
                    lVar3.getWindow().getDecorView().removeCallbacks(kVar);
                    lVar3.getWindow().getDecorView().getViewTreeObserver().removeOnDrawListener(kVar);
                    return;
                }
                return;
            default:
                C0168c cVar = (C0168c) this.f1154b;
                c.e("this$0", cVar);
                if (lVar == C0077l.ON_START) {
                    cVar.f3564c = true;
                    return;
                } else if (lVar == C0077l.ON_STOP) {
                    cVar.f3564c = false;
                    return;
                } else {
                    return;
                }
        }
    }
}
