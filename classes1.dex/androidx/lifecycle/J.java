package androidx.lifecycle;

import S0.b;
import Z0.c;
import android.os.Bundle;
import androidx.activity.m;
import java.util.Iterator;
import java.util.Map;
import k0.C0167b;
import k0.C0168c;

public final class J implements C0167b {

    /* renamed from: a  reason: collision with root package name */
    public final C0168c f1806a;

    /* renamed from: b  reason: collision with root package name */
    public boolean f1807b;

    /* renamed from: c  reason: collision with root package name */
    public Bundle f1808c;

    /* renamed from: d  reason: collision with root package name */
    public final b f1809d;

    public J(C0168c cVar, Q q2) {
        c.e("savedStateRegistry", cVar);
        this.f1806a = cVar;
        this.f1809d = new b(new m(q2, 3));
    }

    public final Bundle a() {
        Bundle bundle = new Bundle();
        Bundle bundle2 = this.f1808c;
        if (bundle2 != null) {
            bundle.putAll(bundle2);
        }
        Iterator it2 = ((K) this.f1809d.a()).f1810c.entrySet().iterator();
        if (!it2.hasNext()) {
            this.f1807b = false;
            return bundle;
        }
        Map.Entry entry = (Map.Entry) it2.next();
        String str = (String) entry.getKey();
        ((G) entry.getValue()).getClass();
        throw null;
    }
}
