package k0;

import Z0.c;
import android.os.Bundle;
import androidx.activity.e;
import androidx.lifecycle.C0078m;
import androidx.lifecycle.t;
import androidx.savedstate.Recreator;
import java.util.Map;
import q.d;
import q.f;

/* renamed from: k0.d  reason: case insensitive filesystem */
public final class C0169d {

    /* renamed from: a  reason: collision with root package name */
    public final C0170e f3567a;

    /* renamed from: b  reason: collision with root package name */
    public final C0168c f3568b = new C0168c();

    /* renamed from: c  reason: collision with root package name */
    public boolean f3569c;

    public final void a() {
        C0170e eVar = this.f3567a;
        t d2 = eVar.d();
        if (d2.f1841c == C0078m.f1832b) {
            d2.a(new Recreator(eVar));
            C0168c cVar = this.f3568b;
            cVar.getClass();
            if (!cVar.f3562a) {
                d2.a(new e(2, cVar));
                cVar.f3562a = true;
                this.f3569c = true;
                return;
            }
            throw new IllegalStateException("SavedStateRegistry was already attached.");
        }
        throw new IllegalStateException("Restarter must be created only during owner's initialization stage");
    }

    public final void b(Bundle bundle) {
        Bundle bundle2;
        if (!this.f3569c) {
            a();
        }
        t d2 = this.f3567a.d();
        if (d2.f1841c.compareTo(C0078m.f1834d) < 0) {
            C0168c cVar = this.f3568b;
            if (!cVar.f3562a) {
                throw new IllegalStateException("You must call performAttach() before calling performRestore(Bundle).");
            } else if (!cVar.f3563b) {
                if (bundle != null) {
                    bundle2 = bundle.getBundle("androidx.lifecycle.BundlableSavedStateRegistry.key");
                } else {
                    bundle2 = null;
                }
                cVar.e = bundle2;
                cVar.f3563b = true;
            } else {
                throw new IllegalStateException("SavedStateRegistry was already restored.");
            }
        } else {
            throw new IllegalStateException(("performRestore cannot be called when owner is " + d2.f1841c).toString());
        }
    }

    public final void c(Bundle bundle) {
        c.e("outBundle", bundle);
        C0168c cVar = this.f3568b;
        cVar.getClass();
        Bundle bundle2 = new Bundle();
        Bundle bundle3 = (Bundle) cVar.e;
        if (bundle3 != null) {
            bundle2.putAll(bundle3);
        }
        f fVar = (f) cVar.f3565d;
        fVar.getClass();
        d dVar = new d(fVar);
        fVar.f4480c.put(dVar, Boolean.FALSE);
        while (dVar.hasNext()) {
            Map.Entry entry = (Map.Entry) dVar.next();
            bundle2.putBundle((String) entry.getKey(), ((C0167b) entry.getValue()).a());
        }
        if (!bundle2.isEmpty()) {
            bundle.putBundle("androidx.lifecycle.BundlableSavedStateRegistry.key", bundle2);
        }
    }

    public C0169d(C0170e eVar) {
        this.f3567a = eVar;
    }
}
