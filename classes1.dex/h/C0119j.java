package h;

import Z0.c;
import android.os.Bundle;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import k0.C0167b;
import k0.C0168c;

/* renamed from: h.j  reason: case insensitive filesystem */
public final class C0119j implements C0167b {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f3013a = 0;

    /* renamed from: b  reason: collision with root package name */
    public final Object f3014b;

    public C0119j(C0168c cVar) {
        c.e("registry", cVar);
        this.f3014b = new LinkedHashSet();
        cVar.e("androidx.savedstate.Restarter", this);
    }

    public final Bundle a() {
        switch (this.f3013a) {
            case 0:
                Bundle bundle = new Bundle();
                ((C0121l) this.f3014b).k().getClass();
                return bundle;
            default:
                Bundle bundle2 = new Bundle();
                bundle2.putStringArrayList("classes_to_restore", new ArrayList((LinkedHashSet) this.f3014b));
                return bundle2;
        }
    }

    public C0119j(C0121l lVar) {
        this.f3014b = lVar;
    }
}
