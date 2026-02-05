package androidx.lifecycle;

import android.os.Bundle;

public final class SavedStateHandleAttacher implements C0081p {

    /* renamed from: a  reason: collision with root package name */
    public final J f1820a;

    public final void b(r rVar, C0077l lVar) {
        if (lVar == C0077l.ON_CREATE) {
            rVar.d().f(this);
            J j2 = this.f1820a;
            if (!j2.f1807b) {
                Bundle c2 = j2.f1806a.c("androidx.lifecycle.internal.SavedStateHandlesProvider");
                Bundle bundle = new Bundle();
                Bundle bundle2 = j2.f1808c;
                if (bundle2 != null) {
                    bundle.putAll(bundle2);
                }
                if (c2 != null) {
                    bundle.putAll(c2);
                }
                j2.f1808c = bundle;
                j2.f1807b = true;
                K k2 = (K) j2.f1809d.a();
                return;
            }
            return;
        }
        throw new IllegalStateException(("Next event must be ON_CREATE, it was " + lVar).toString());
    }

    public SavedStateHandleAttacher(J j2) {
        this.f1820a = j2;
    }
}
