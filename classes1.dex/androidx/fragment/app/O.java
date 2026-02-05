package androidx.fragment.app;

import android.app.Application;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Bundle;
import androidx.lifecycle.C0073h;
import androidx.lifecycle.C0077l;
import androidx.lifecycle.I;
import androidx.lifecycle.N;
import androidx.lifecycle.P;
import androidx.lifecycle.Q;
import androidx.lifecycle.t;
import b0.c;
import java.util.LinkedHashMap;
import k0.C0168c;
import k0.C0169d;
import k0.C0170e;

public final class O implements C0073h, C0170e, Q {

    /* renamed from: f  reason: collision with root package name */
    public final r f1639f;

    /* renamed from: g  reason: collision with root package name */
    public final P f1640g;

    /* renamed from: h  reason: collision with root package name */
    public t f1641h = null;
    public C0169d i = null;

    public final c a() {
        Application application;
        r rVar = this.f1639f;
        Context applicationContext = rVar.F().getApplicationContext();
        while (true) {
            if (!(applicationContext instanceof ContextWrapper)) {
                application = null;
                break;
            } else if (applicationContext instanceof Application) {
                application = (Application) applicationContext;
                break;
            } else {
                applicationContext = ((ContextWrapper) applicationContext).getBaseContext();
            }
        }
        c cVar = new c(0);
        LinkedHashMap linkedHashMap = cVar.f2076a;
        if (application != null) {
            linkedHashMap.put(N.f1815a, application);
        }
        linkedHashMap.put(I.f1803a, this);
        linkedHashMap.put(I.f1804b, this);
        Bundle bundle = rVar.f1756k;
        if (bundle != null) {
            linkedHashMap.put(I.f1805c, bundle);
        }
        return cVar;
    }

    public final void e(C0077l lVar) {
        this.f1641h.d(lVar);
    }

    public final void f() {
        if (this.f1641h == null) {
            this.f1641h = new t(this);
            C0169d dVar = new C0169d(this);
            this.i = dVar;
            dVar.a();
            I.b(this);
        }
    }

    public O(r rVar, P p2) {
        this.f1639f = rVar;
        this.f1640g = p2;
    }

    public final C0168c b() {
        f();
        return this.i.f3568b;
    }

    public final P c() {
        f();
        return this.f1640g;
    }

    public final t d() {
        f();
        return this.f1641h;
    }
}
