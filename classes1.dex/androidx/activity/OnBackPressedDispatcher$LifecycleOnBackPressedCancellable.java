package androidx.activity;

import R0.h;
import Z0.c;
import androidx.lifecycle.C0077l;
import androidx.lifecycle.C0081p;
import androidx.lifecycle.r;
import androidx.lifecycle.t;

final class OnBackPressedDispatcher$LifecycleOnBackPressedCancellable implements C0081p, c {

    /* renamed from: a  reason: collision with root package name */
    public final t f1143a;

    /* renamed from: b  reason: collision with root package name */
    public final h f1144b;

    /* renamed from: c  reason: collision with root package name */
    public y f1145c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ A f1146d;

    public final void b(r rVar, C0077l lVar) {
        if (lVar == C0077l.ON_START) {
            A a2 = this.f1146d;
            a2.getClass();
            h hVar = this.f1144b;
            c.e("onBackPressedCallback", hVar);
            a2.f1135b.addLast(hVar);
            y yVar = new y(a2, hVar);
            hVar.f862b.add(yVar);
            a2.e();
            hVar.f863c = new z(1, a2);
            this.f1145c = yVar;
        } else if (lVar == C0077l.ON_STOP) {
            y yVar2 = this.f1145c;
            if (yVar2 != null) {
                yVar2.cancel();
            }
        } else if (lVar == C0077l.ON_DESTROY) {
            cancel();
        }
    }

    public final void cancel() {
        this.f1143a.f(this);
        this.f1144b.f862b.remove(this);
        y yVar = this.f1145c;
        if (yVar != null) {
            yVar.cancel();
        }
        this.f1145c = null;
    }

    public OnBackPressedDispatcher$LifecycleOnBackPressedCancellable(A a2, t tVar, h hVar) {
        c.e("onBackPressedCallback", hVar);
        this.f1146d = a2;
        this.f1143a = tVar;
        this.f1144b = hVar;
        tVar.a(this);
    }
}
