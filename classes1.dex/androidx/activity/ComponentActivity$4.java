package androidx.activity;

import androidx.lifecycle.C0077l;
import androidx.lifecycle.C0081p;
import androidx.lifecycle.P;
import androidx.lifecycle.r;
import h.C0121l;

public final class ComponentActivity$4 implements C0081p {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ C0121l f1140a;

    public final void b(r rVar, C0077l lVar) {
        int i = n.f1174w;
        C0121l lVar2 = this.f1140a;
        if (lVar2.f1177j == null) {
            j jVar = (j) lVar2.getLastNonConfigurationInstance();
            if (jVar != null) {
                lVar2.f1177j = jVar.f1161a;
            }
            if (lVar2.f1177j == null) {
                lVar2.f1177j = new P();
            }
        }
        lVar2.f50f.f(this);
    }

    public ComponentActivity$4(C0121l lVar) {
        this.f1140a = lVar;
    }
}
