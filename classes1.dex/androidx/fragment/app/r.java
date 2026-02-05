package androidx.fragment.app;

import Z.d;
import Z.f;
import Z0.c;
import android.app.Application;
import android.content.ComponentCallbacks;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.Log;
import android.util.SparseArray;
import android.view.ContextMenu;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.C0073h;
import androidx.lifecycle.C0078m;
import androidx.lifecycle.I;
import androidx.lifecycle.N;
import androidx.lifecycle.P;
import androidx.lifecycle.Q;
import androidx.lifecycle.t;
import androidx.lifecycle.x;
import h.C0121l;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Objects;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicInteger;
import k0.C0168c;
import k0.C0169d;
import k0.C0170e;

public abstract class r implements ComponentCallbacks, View.OnCreateContextMenuListener, androidx.lifecycle.r, Q, C0073h, C0170e {

    /* renamed from: Y  reason: collision with root package name */
    public static final Object f1728Y = new Object();

    /* renamed from: A  reason: collision with root package name */
    public int f1729A;

    /* renamed from: B  reason: collision with root package name */
    public int f1730B;

    /* renamed from: C  reason: collision with root package name */
    public String f1731C;

    /* renamed from: D  reason: collision with root package name */
    public boolean f1732D;

    /* renamed from: E  reason: collision with root package name */
    public boolean f1733E;

    /* renamed from: F  reason: collision with root package name */
    public boolean f1734F;

    /* renamed from: G  reason: collision with root package name */
    public final boolean f1735G = true;

    /* renamed from: H  reason: collision with root package name */
    public boolean f1736H;
    public ViewGroup I;

    /* renamed from: J  reason: collision with root package name */
    public View f1737J;

    /* renamed from: K  reason: collision with root package name */
    public boolean f1738K;

    /* renamed from: L  reason: collision with root package name */
    public boolean f1739L = true;

    /* renamed from: M  reason: collision with root package name */
    public C0062p f1740M;

    /* renamed from: N  reason: collision with root package name */
    public boolean f1741N;

    /* renamed from: O  reason: collision with root package name */
    public LayoutInflater f1742O;

    /* renamed from: P  reason: collision with root package name */
    public boolean f1743P;

    /* renamed from: Q  reason: collision with root package name */
    public String f1744Q;

    /* renamed from: R  reason: collision with root package name */
    public C0078m f1745R = C0078m.e;

    /* renamed from: S  reason: collision with root package name */
    public t f1746S;

    /* renamed from: T  reason: collision with root package name */
    public O f1747T;

    /* renamed from: U  reason: collision with root package name */
    public final x f1748U = new x();

    /* renamed from: V  reason: collision with root package name */
    public C0169d f1749V;

    /* renamed from: W  reason: collision with root package name */
    public final ArrayList f1750W;

    /* renamed from: X  reason: collision with root package name */
    public final C0060n f1751X;

    /* renamed from: f  reason: collision with root package name */
    public int f1752f = -1;

    /* renamed from: g  reason: collision with root package name */
    public Bundle f1753g;

    /* renamed from: h  reason: collision with root package name */
    public SparseArray f1754h;
    public Bundle i;

    /* renamed from: j  reason: collision with root package name */
    public String f1755j = UUID.randomUUID().toString();

    /* renamed from: k  reason: collision with root package name */
    public Bundle f1756k;

    /* renamed from: l  reason: collision with root package name */
    public r f1757l;

    /* renamed from: m  reason: collision with root package name */
    public String f1758m = null;

    /* renamed from: n  reason: collision with root package name */
    public int f1759n;

    /* renamed from: o  reason: collision with root package name */
    public Boolean f1760o = null;

    /* renamed from: p  reason: collision with root package name */
    public boolean f1761p;

    /* renamed from: q  reason: collision with root package name */
    public boolean f1762q;

    /* renamed from: r  reason: collision with root package name */
    public boolean f1763r;

    /* renamed from: s  reason: collision with root package name */
    public boolean f1764s;

    /* renamed from: t  reason: collision with root package name */
    public boolean f1765t;

    /* renamed from: u  reason: collision with root package name */
    public boolean f1766u;

    /* renamed from: v  reason: collision with root package name */
    public int f1767v;

    /* renamed from: w  reason: collision with root package name */
    public H f1768w;

    /* renamed from: x  reason: collision with root package name */
    public C0065t f1769x;

    /* renamed from: y  reason: collision with root package name */
    public H f1770y = new H();

    /* renamed from: z  reason: collision with root package name */
    public r f1771z;

    public void A() {
        this.f1736H = true;
    }

    public void C(Bundle bundle) {
        this.f1736H = true;
    }

    public final void onConfigurationChanged(Configuration configuration) {
        this.f1736H = true;
    }

    public final void onLowMemory() {
        this.f1736H = true;
    }

    public void r() {
        this.f1736H = true;
    }

    public void s(C0121l lVar) {
        C0121l lVar2;
        this.f1736H = true;
        C0065t tVar = this.f1769x;
        if (tVar == null) {
            lVar2 = null;
        } else {
            lVar2 = tVar.f1774f;
        }
        if (lVar2 != null) {
            this.f1736H = true;
        }
    }

    public void t(Bundle bundle) {
        Parcelable parcelable;
        this.f1736H = true;
        if (!(bundle == null || (parcelable = bundle.getParcelable("android:support:fragments")) == null)) {
            this.f1770y.Q(parcelable);
            H h2 = this.f1770y;
            h2.f1573E = false;
            h2.f1574F = false;
            h2.f1579L.f1616h = false;
            h2.t(1);
        }
        H h3 = this.f1770y;
        if (h3.f1597s < 1) {
            h3.f1573E = false;
            h3.f1574F = false;
            h3.f1579L.f1616h = false;
            h3.t(1);
        }
    }

    public View u(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return null;
    }

    public void v() {
        this.f1736H = true;
    }

    public void w() {
        this.f1736H = true;
    }

    public abstract void y(Bundle bundle);

    public void z() {
        this.f1736H = true;
    }

    public void B(Bundle bundle) {
    }

    public void D(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.f1770y.K();
        this.f1766u = true;
        this.f1747T = new O(this, c());
        View u2 = u(layoutInflater, viewGroup);
        this.f1737J = u2;
        if (u2 != null) {
            this.f1747T.f();
            View view = this.f1737J;
            O o2 = this.f1747T;
            c.e("<this>", view);
            view.setTag(2131296787, o2);
            View view2 = this.f1737J;
            O o3 = this.f1747T;
            c.e("<this>", view2);
            view2.setTag(2131296790, o3);
            View view3 = this.f1737J;
            O o4 = this.f1747T;
            c.e("<this>", view3);
            view3.setTag(2131296789, o4);
            this.f1748U.e(this.f1747T);
        } else if (this.f1747T.f1641h == null) {
            this.f1747T = null;
        } else {
            throw new IllegalStateException("Called getViewLifecycleOwner() but onCreateView() returned null");
        }
    }

    public final C0121l E() {
        C0121l lVar;
        C0065t tVar = this.f1769x;
        if (tVar == null) {
            lVar = null;
        } else {
            lVar = tVar.f1774f;
        }
        if (lVar != null) {
            return lVar;
        }
        throw new IllegalStateException("Fragment " + this + " not attached to an activity.");
    }

    public final View G() {
        View view = this.f1737J;
        if (view != null) {
            return view;
        }
        throw new IllegalStateException("Fragment " + this + " did not return a View from onCreateView() or this was called before onCreateView().");
    }

    public final void H(int i2, int i3, int i4, int i5) {
        if (this.f1740M != null || i2 != 0 || i3 != 0 || i4 != 0 || i5 != 0) {
            f().f1720b = i2;
            f().f1721c = i3;
            f().f1722d = i4;
            f().e = i5;
        }
    }

    public final void I(Bundle bundle) {
        H h2 = this.f1768w;
        if (h2 == null || (!h2.f1573E && !h2.f1574F)) {
            this.f1756k = bundle;
            return;
        }
        throw new IllegalStateException("Fragment already added and state has been saved");
    }

    public final void J(g0.r rVar) {
        H h2;
        if (rVar != null) {
            Z.c cVar = d.f1007a;
            d.b(new f(this, "Attempting to set target fragment " + rVar + " with request code 0 for fragment " + this));
            d.a(this).getClass();
        }
        H h3 = this.f1768w;
        if (rVar != null) {
            h2 = rVar.f1768w;
        } else {
            h2 = null;
        }
        if (h3 == null || h2 == null || h3 == h2) {
            r rVar2 = rVar;
            while (rVar2 != null) {
                if (!super.equals(this)) {
                    rVar2 = rVar2.l(false);
                } else {
                    throw new IllegalArgumentException("Setting " + rVar + " as the target of " + this + " would create a target cycle");
                }
            }
            if (rVar == null) {
                this.f1758m = null;
                this.f1757l = null;
            } else if (this.f1768w == null || rVar.f1768w == null) {
                this.f1758m = null;
                this.f1757l = rVar;
            } else {
                this.f1758m = rVar.f1755j;
                this.f1757l = null;
            }
            this.f1759n = 0;
            return;
        }
        throw new IllegalArgumentException("Fragment " + rVar + " must share the same FragmentManager to be set as a target fragment");
    }

    public final C0168c b() {
        return this.f1749V.f3568b;
    }

    public final P c() {
        if (this.f1768w == null) {
            throw new IllegalStateException("Can't access ViewModels from detached fragment");
        } else if (i() != 1) {
            HashMap hashMap = this.f1768w.f1579L.e;
            P p2 = (P) hashMap.get(this.f1755j);
            if (p2 != null) {
                return p2;
            }
            P p3 = new P();
            hashMap.put(this.f1755j, p3);
            return p3;
        } else {
            throw new IllegalStateException("Calling getViewModelStore() before a Fragment reaches onCreate() when using setMaxLifecycle(INITIALIZED) is not supported");
        }
    }

    public final t d() {
        return this.f1746S;
    }

    public v e() {
        return new C0061o(this);
    }

    /* JADX WARNING: type inference failed for: r0v2, types: [androidx.fragment.app.p, java.lang.Object] */
    public final C0062p f() {
        if (this.f1740M == null) {
            ? obj = new Object();
            Object obj2 = f1728Y;
            obj.f1724g = obj2;
            obj.f1725h = obj2;
            obj.i = obj2;
            obj.f1726j = 1.0f;
            obj.f1727k = null;
            this.f1740M = obj;
        }
        return this.f1740M;
    }

    public final H g() {
        if (this.f1769x != null) {
            return this.f1770y;
        }
        throw new IllegalStateException("Fragment " + this + " has not been attached yet.");
    }

    public final Context h() {
        C0065t tVar = this.f1769x;
        if (tVar == null) {
            return null;
        }
        return tVar.f1775g;
    }

    public final int i() {
        C0078m mVar = this.f1745R;
        if (mVar == C0078m.f1832b || this.f1771z == null) {
            return mVar.ordinal();
        }
        return Math.min(mVar.ordinal(), this.f1771z.i());
    }

    public final H j() {
        H h2 = this.f1768w;
        if (h2 != null) {
            return h2;
        }
        throw new IllegalStateException("Fragment " + this + " not associated with a fragment manager.");
    }

    public final r l(boolean z2) {
        String str;
        if (z2) {
            Z.c cVar = d.f1007a;
            d.b(new f(this, "Attempting to get target fragment from fragment " + this));
            d.a(this).getClass();
        }
        r rVar = this.f1757l;
        if (rVar != null) {
            return rVar;
        }
        H h2 = this.f1768w;
        if (h2 == null || (str = this.f1758m) == null) {
            return null;
        }
        return h2.f1583c.d(str);
    }

    public final void m() {
        this.f1746S = new t(this);
        this.f1749V = new C0169d(this);
        ArrayList arrayList = this.f1750W;
        C0060n nVar = this.f1751X;
        if (arrayList.contains(nVar)) {
            return;
        }
        if (this.f1752f >= 0) {
            nVar.a();
        } else {
            arrayList.add(nVar);
        }
    }

    public final boolean o() {
        if (this.f1769x == null || !this.f1761p) {
            return false;
        }
        return true;
    }

    public final boolean p() {
        boolean z2;
        if (!this.f1732D) {
            H h2 = this.f1768w;
            if (h2 == null) {
                return false;
            }
            r rVar = this.f1771z;
            h2.getClass();
            if (rVar == null) {
                z2 = false;
            } else {
                z2 = rVar.p();
            }
            if (z2) {
                return true;
            }
            return false;
        }
        return true;
    }

    public final boolean q() {
        if (this.f1767v > 0) {
            return true;
        }
        return false;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(128);
        sb.append(getClass().getSimpleName());
        sb.append("{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append("} (");
        sb.append(this.f1755j);
        if (this.f1729A != 0) {
            sb.append(" id=0x");
            sb.append(Integer.toHexString(this.f1729A));
        }
        if (this.f1731C != null) {
            sb.append(" tag=");
            sb.append(this.f1731C);
        }
        sb.append(")");
        return sb.toString();
    }

    public LayoutInflater x(Bundle bundle) {
        C0065t tVar = this.f1769x;
        if (tVar != null) {
            C0121l lVar = tVar.f1777j;
            LayoutInflater cloneInContext = lVar.getLayoutInflater().cloneInContext(lVar);
            cloneInContext.setFactory2(this.f1770y.f1585f);
            return cloneInContext;
        }
        throw new IllegalStateException("onGetLayoutInflater() cannot be executed until the Fragment is attached to the FragmentManager.");
    }

    public r() {
        new AtomicInteger();
        this.f1750W = new ArrayList();
        this.f1751X = new C0060n(this);
        m();
    }

    public final Context F() {
        Context h2 = h();
        if (h2 != null) {
            return h2;
        }
        throw new IllegalStateException("Fragment " + this + " not attached to a context.");
    }

    public final b0.c a() {
        Application application;
        Context applicationContext = F().getApplicationContext();
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
        if (application == null && Log.isLoggable("FragmentManager", 3)) {
            Objects.toString(F().getApplicationContext());
        }
        b0.c cVar = new b0.c(0);
        LinkedHashMap linkedHashMap = cVar.f2076a;
        if (application != null) {
            linkedHashMap.put(N.f1815a, application);
        }
        linkedHashMap.put(I.f1803a, this);
        linkedHashMap.put(I.f1804b, this);
        Bundle bundle = this.f1756k;
        if (bundle != null) {
            linkedHashMap.put(I.f1805c, bundle);
        }
        return cVar;
    }

    public final Resources k() {
        return F().getResources();
    }

    public final void n() {
        m();
        this.f1744Q = this.f1755j;
        this.f1755j = UUID.randomUUID().toString();
        this.f1761p = false;
        this.f1762q = false;
        this.f1763r = false;
        this.f1764s = false;
        this.f1765t = false;
        this.f1767v = 0;
        this.f1768w = null;
        this.f1770y = new H();
        this.f1769x = null;
        this.f1729A = 0;
        this.f1730B = 0;
        this.f1731C = null;
        this.f1732D = false;
        this.f1733E = false;
    }

    public final void onCreateContextMenu(ContextMenu contextMenu, View view, ContextMenu.ContextMenuInfo contextMenuInfo) {
        E().onCreateContextMenu(contextMenu, view, contextMenuInfo);
    }
}
