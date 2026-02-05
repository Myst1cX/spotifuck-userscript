package androidx.fragment.app;

import A.b;
import J.c;
import android.util.Log;
import android.view.View;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Objects;
import t.C0339e;

public final class S {

    /* renamed from: a  reason: collision with root package name */
    public int f1646a;

    /* renamed from: b  reason: collision with root package name */
    public int f1647b;

    /* renamed from: c  reason: collision with root package name */
    public final r f1648c;

    /* renamed from: d  reason: collision with root package name */
    public final ArrayList f1649d = new ArrayList();
    public final HashSet e = new HashSet();

    /* renamed from: f  reason: collision with root package name */
    public boolean f1650f = false;

    /* renamed from: g  reason: collision with root package name */
    public boolean f1651g = false;

    /* renamed from: h  reason: collision with root package name */
    public final M f1652h;

    public S(int i, int i2, M m2, c cVar) {
        r rVar = m2.f1630c;
        this.f1646a = i;
        this.f1647b = i2;
        this.f1648c = rVar;
        cVar.a(new b(19, (Object) this));
        this.f1652h = m2;
    }

    public final void a() {
        if (!this.f1650f) {
            this.f1650f = true;
            HashSet hashSet = this.e;
            if (hashSet.isEmpty()) {
                b();
                return;
            }
            Iterator it2 = new ArrayList(hashSet).iterator();
            while (it2.hasNext()) {
                c cVar = (c) it2.next();
                synchronized (cVar) {
                    try {
                        if (!cVar.f289a) {
                            cVar.f289a = true;
                            cVar.f291c = true;
                            J.b bVar = cVar.f290b;
                            if (bVar != null) {
                                try {
                                    bVar.m();
                                } catch (Throwable th) {
                                    synchronized (cVar) {
                                        cVar.f291c = false;
                                        cVar.notifyAll();
                                        throw th;
                                    }
                                }
                            }
                            synchronized (cVar) {
                                cVar.f291c = false;
                                cVar.notifyAll();
                            }
                        }
                    } finally {
                        while (true) {
                        }
                    }
                }
            }
        }
    }

    public final void b() {
        if (!this.f1651g) {
            if (Log.isLoggable("FragmentManager", 2)) {
                toString();
            }
            this.f1651g = true;
            Iterator it2 = this.f1649d.iterator();
            while (it2.hasNext()) {
                ((Runnable) it2.next()).run();
            }
        }
        this.f1652h.k();
    }

    public final void d() {
        float f2;
        int i = this.f1647b;
        M m2 = this.f1652h;
        if (i == 2) {
            r rVar = m2.f1630c;
            View findFocus = rVar.f1737J.findFocus();
            if (findFocus != null) {
                rVar.f().f1727k = findFocus;
                if (Log.isLoggable("FragmentManager", 2)) {
                    findFocus.toString();
                    rVar.toString();
                }
            }
            View G2 = this.f1648c.G();
            if (G2.getParent() == null) {
                m2.b();
                G2.setAlpha(0.0f);
            }
            if (G2.getAlpha() == 0.0f && G2.getVisibility() == 0) {
                G2.setVisibility(4);
            }
            C0062p pVar = rVar.f1740M;
            if (pVar == null) {
                f2 = 1.0f;
            } else {
                f2 = pVar.f1726j;
            }
            G2.setAlpha(f2);
        } else if (i == 3) {
            r rVar2 = m2.f1630c;
            View G3 = rVar2.G();
            if (Log.isLoggable("FragmentManager", 2)) {
                Objects.toString(G3.findFocus());
                G3.toString();
                rVar2.toString();
            }
            G3.clearFocus();
        }
    }

    public final String toString() {
        String str;
        String str2;
        StringBuilder sb = new StringBuilder("Operation {");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append("} {mFinalState = ");
        int i = this.f1646a;
        if (i == 1) {
            str = "REMOVED";
        } else if (i == 2) {
            str = "VISIBLE";
        } else if (i == 3) {
            str = "GONE";
        } else if (i != 4) {
            str = "null";
        } else {
            str = "INVISIBLE";
        }
        sb.append(str);
        sb.append("} {mLifecycleImpact = ");
        int i2 = this.f1647b;
        if (i2 == 1) {
            str2 = "NONE";
        } else if (i2 == 2) {
            str2 = "ADDING";
        } else if (i2 != 3) {
            str2 = "null";
        } else {
            str2 = "REMOVING";
        }
        sb.append(str2);
        sb.append("} {mFragment = ");
        sb.append(this.f1648c);
        sb.append("}");
        return sb.toString();
    }

    public final void c(int i, int i2) {
        int a2 = C0339e.a(i2);
        r rVar = this.f1648c;
        if (a2 != 0) {
            if (a2 != 1) {
                if (a2 == 2) {
                    if (Log.isLoggable("FragmentManager", 2)) {
                        Objects.toString(rVar);
                    }
                    this.f1646a = 1;
                    this.f1647b = 3;
                }
            } else if (this.f1646a == 1) {
                if (Log.isLoggable("FragmentManager", 2)) {
                    Objects.toString(rVar);
                }
                this.f1646a = 2;
                this.f1647b = 2;
            }
        } else if (this.f1646a != 1) {
            if (Log.isLoggable("FragmentManager", 2)) {
                Objects.toString(rVar);
            }
            this.f1646a = i;
        }
    }
}
