package androidx.fragment.app;

import H.a;
import J.c;
import Q0.l;
import android.content.Context;
import android.content.IntentFilter;
import android.view.MenuItem;
import h.D;
import java.util.HashSet;
import n.C0204s;
import r.k;

/* renamed from: androidx.fragment.app.g  reason: case insensitive filesystem */
public abstract class C0053g {

    /* renamed from: a  reason: collision with root package name */
    public Object f1694a;

    /* renamed from: b  reason: collision with root package name */
    public Object f1695b;

    public C0053g(Context context) {
        this.f1694a = context;
    }

    public abstract IntentFilter e();

    public abstract int f();

    public abstract void h();

    public void c() {
        l lVar = (l) this.f1694a;
        if (lVar != null) {
            try {
                ((D) this.f1695b).f2889p.unregisterReceiver(lVar);
            } catch (IllegalArgumentException unused) {
            }
            this.f1694a = null;
        }
    }

    public void d() {
        S s2 = (S) this.f1694a;
        HashSet hashSet = s2.e;
        if (hashSet.remove((c) this.f1695b) && hashSet.isEmpty()) {
            s2.b();
        }
    }

    public MenuItem g(MenuItem menuItem) {
        if (!(menuItem instanceof a)) {
            return menuItem;
        }
        a aVar = (a) menuItem;
        if (((k) this.f1695b) == null) {
            this.f1695b = new k();
        }
        MenuItem menuItem2 = (MenuItem) ((k) this.f1695b).getOrDefault(aVar, (Object) null);
        if (menuItem2 != null) {
            return menuItem2;
        }
        C0204s sVar = new C0204s((Context) this.f1694a, aVar);
        ((k) this.f1695b).put(aVar, sVar);
        return sVar;
    }

    public C0053g(S s2, c cVar) {
        this.f1694a = s2;
        this.f1695b = cVar;
    }

    public void i() {
        c();
        IntentFilter e = e();
        if (e.countActions() != 0) {
            if (((l) this.f1694a) == null) {
                this.f1694a = new l(this);
            }
            ((D) this.f1695b).f2889p.registerReceiver((l) this.f1694a, e);
        }
    }

    public C0053g(D d2) {
        this.f1695b = d2;
    }
}
