package androidx.activity;

import android.window.OnBackInvokedDispatcher;
import androidx.lifecycle.C0077l;
import androidx.lifecycle.C0081p;
import androidx.lifecycle.r;
import h.C0121l;

public final /* synthetic */ class h implements C0081p {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ A f1159a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ C0121l f1160b;

    public /* synthetic */ h(A a2, C0121l lVar) {
        this.f1159a = a2;
        this.f1160b = lVar;
    }

    public final void b(r rVar, C0077l lVar) {
        if (lVar == C0077l.ON_CREATE) {
            OnBackInvokedDispatcher a2 = i.a(this.f1160b);
            A a3 = this.f1159a;
            a3.e = a2;
            a3.d(a3.f1139g);
        }
    }
}
