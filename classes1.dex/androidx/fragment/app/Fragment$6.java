package androidx.fragment.app;

import android.view.View;
import androidx.lifecycle.C0077l;
import androidx.lifecycle.C0081p;
import androidx.lifecycle.r;

class Fragment$6 implements C0081p {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ r f1563a;

    public final void b(r rVar, C0077l lVar) {
        View view;
        if (lVar == C0077l.ON_STOP && (view = this.f1563a.f1737J) != null) {
            view.cancelPendingInputEvents();
        }
    }

    public Fragment$6(r rVar) {
        this.f1563a = rVar;
    }
}
