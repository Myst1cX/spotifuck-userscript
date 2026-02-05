package androidx.fragment.app;

import A.k;
import E.j;
import N.D;
import N.Q;
import N0.o;
import Q0.E;
import Z.c;
import Z.d;
import Z.f;
import android.app.Activity;
import android.content.res.Resources;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.AndroidRuntimeException;
import android.util.Log;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.lifecycle.C0077l;
import androidx.lifecycle.C0078m;
import androidx.lifecycle.O;
import androidx.lifecycle.t;
import c0.C0087a;
import h.C0121l;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Objects;
import java.util.WeakHashMap;
import r.l;

public final class M {

    /* renamed from: a  reason: collision with root package name */
    public final j f1628a;

    /* renamed from: b  reason: collision with root package name */
    public final k f1629b;

    /* renamed from: c  reason: collision with root package name */
    public final r f1630c;

    /* renamed from: d  reason: collision with root package name */
    public boolean f1631d = false;
    public int e = -1;

    public M(j jVar, k kVar, r rVar) {
        this.f1628a = jVar;
        this.f1629b = kVar;
        this.f1630c = rVar;
    }

    public final void n() {
        View view;
        boolean isLoggable = Log.isLoggable("FragmentManager", 3);
        r rVar = this.f1630c;
        if (isLoggable) {
            Objects.toString(rVar);
        }
        C0062p pVar = rVar.f1740M;
        if (pVar == null) {
            view = null;
        } else {
            view = pVar.f1727k;
        }
        if (view != null) {
            if (view != rVar.f1737J) {
                ViewParent parent = view.getParent();
                while (true) {
                    if (parent == null) {
                        break;
                    } else if (parent == rVar.f1737J) {
                        break;
                    } else {
                        parent = parent.getParent();
                    }
                }
            }
            view.requestFocus();
            if (Log.isLoggable("FragmentManager", 2)) {
                view.toString();
                Objects.toString(rVar);
                Objects.toString(rVar.f1737J.findFocus());
            }
        }
        rVar.f().f1727k = null;
        rVar.f1770y.K();
        rVar.f1770y.x(true);
        rVar.f1752f = 7;
        rVar.f1736H = true;
        t tVar = rVar.f1746S;
        C0077l lVar = C0077l.ON_RESUME;
        tVar.d(lVar);
        if (rVar.f1737J != null) {
            rVar.f1747T.f1641h.d(lVar);
        }
        H h2 = rVar.f1770y;
        h2.f1573E = false;
        h2.f1574F = false;
        h2.f1579L.f1616h = false;
        h2.t(7);
        this.f1628a.o(false);
        rVar.f1753g = null;
        rVar.f1754h = null;
        rVar.i = null;
    }

    public final void a() {
        boolean isLoggable = Log.isLoggable("FragmentManager", 3);
        r rVar = this.f1630c;
        if (isLoggable) {
            Objects.toString(rVar);
        }
        Bundle bundle = rVar.f1753g;
        rVar.f1770y.K();
        rVar.f1752f = 3;
        rVar.f1736H = false;
        rVar.r();
        if (rVar.f1736H) {
            if (Log.isLoggable("FragmentManager", 3)) {
                rVar.toString();
            }
            View view = rVar.f1737J;
            if (view != null) {
                Bundle bundle2 = rVar.f1753g;
                SparseArray sparseArray = rVar.f1754h;
                if (sparseArray != null) {
                    view.restoreHierarchyState(sparseArray);
                    rVar.f1754h = null;
                }
                if (rVar.f1737J != null) {
                    O o2 = rVar.f1747T;
                    o2.i.b(rVar.i);
                    rVar.i = null;
                }
                rVar.f1736H = false;
                rVar.C(bundle2);
                if (!rVar.f1736H) {
                    throw new AndroidRuntimeException("Fragment " + rVar + " did not call through to super.onViewStateRestored()");
                } else if (rVar.f1737J != null) {
                    rVar.f1747T.e(C0077l.ON_CREATE);
                }
            }
            rVar.f1753g = null;
            H h2 = rVar.f1770y;
            h2.f1573E = false;
            h2.f1574F = false;
            h2.f1579L.f1616h = false;
            h2.t(4);
            this.f1628a.d(false);
            return;
        }
        throw new AndroidRuntimeException("Fragment " + rVar + " did not call through to super.onActivityCreated()");
    }

    public final void b() {
        View view;
        View view2;
        k kVar = this.f1629b;
        kVar.getClass();
        r rVar = this.f1630c;
        ViewGroup viewGroup = rVar.I;
        int i = -1;
        if (viewGroup != null) {
            ArrayList arrayList = (ArrayList) kVar.f23h;
            int indexOf = arrayList.indexOf(rVar);
            int i2 = indexOf - 1;
            while (true) {
                if (i2 < 0) {
                    while (true) {
                        indexOf++;
                        if (indexOf >= arrayList.size()) {
                            break;
                        }
                        r rVar2 = (r) arrayList.get(indexOf);
                        if (rVar2.I == viewGroup && (view = rVar2.f1737J) != null) {
                            i = viewGroup.indexOfChild(view);
                            break;
                        }
                    }
                } else {
                    r rVar3 = (r) arrayList.get(i2);
                    if (rVar3.I == viewGroup && (view2 = rVar3.f1737J) != null) {
                        i = viewGroup.indexOfChild(view2) + 1;
                        break;
                    }
                    i2--;
                }
            }
        }
        rVar.I.addView(rVar.f1737J, i);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v8, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v7, resolved type: androidx.fragment.app.M} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void c() {
        /*
            r7 = this;
            java.lang.String r0 = "FragmentManager"
            r1 = 3
            boolean r0 = android.util.Log.isLoggable(r0, r1)
            androidx.fragment.app.r r1 = r7.f1630c
            if (r0 == 0) goto L_0x000e
            java.util.Objects.toString(r1)
        L_0x000e:
            androidx.fragment.app.r r0 = r1.f1757l
            r2 = 0
            java.lang.String r3 = " that does not belong to this FragmentManager!"
            java.lang.String r4 = " declared target fragment "
            A.k r5 = r7.f1629b
            java.lang.String r6 = "Fragment "
            if (r0 == 0) goto L_0x0050
            java.lang.String r0 = r0.f1755j
            java.lang.Object r5 = r5.f21f
            java.util.HashMap r5 = (java.util.HashMap) r5
            java.lang.Object r0 = r5.get(r0)
            androidx.fragment.app.M r0 = (androidx.fragment.app.M) r0
            if (r0 == 0) goto L_0x0033
            androidx.fragment.app.r r3 = r1.f1757l
            java.lang.String r3 = r3.f1755j
            r1.f1758m = r3
            r1.f1757l = r2
            r2 = r0
            goto L_0x007f
        L_0x0033:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>(r6)
            r2.append(r1)
            r2.append(r4)
            androidx.fragment.app.r r1 = r1.f1757l
            r2.append(r1)
            r2.append(r3)
            java.lang.String r1 = r2.toString()
            r0.<init>(r1)
            throw r0
        L_0x0050:
            java.lang.String r0 = r1.f1758m
            if (r0 == 0) goto L_0x007f
            java.lang.Object r2 = r5.f21f
            java.util.HashMap r2 = (java.util.HashMap) r2
            java.lang.Object r0 = r2.get(r0)
            r2 = r0
            androidx.fragment.app.M r2 = (androidx.fragment.app.M) r2
            if (r2 == 0) goto L_0x0062
            goto L_0x007f
        L_0x0062:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>(r6)
            r2.append(r1)
            r2.append(r4)
            java.lang.String r1 = r1.f1758m
            r2.append(r1)
            r2.append(r3)
            java.lang.String r1 = r2.toString()
            r0.<init>(r1)
            throw r0
        L_0x007f:
            if (r2 == 0) goto L_0x0084
            r2.k()
        L_0x0084:
            androidx.fragment.app.H r0 = r1.f1768w
            androidx.fragment.app.t r2 = r0.f1598t
            r1.f1769x = r2
            androidx.fragment.app.r r0 = r0.f1600v
            r1.f1771z = r0
            E.j r0 = r7.f1628a
            r2 = 0
            r0.k(r2)
            java.util.ArrayList r3 = r1.f1750W
            java.util.Iterator r4 = r3.iterator()
        L_0x009a:
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto L_0x00aa
            java.lang.Object r5 = r4.next()
            androidx.fragment.app.n r5 = (androidx.fragment.app.C0060n) r5
            r5.a()
            goto L_0x009a
        L_0x00aa:
            r3.clear()
            androidx.fragment.app.H r3 = r1.f1770y
            androidx.fragment.app.t r4 = r1.f1769x
            androidx.fragment.app.v r5 = r1.e()
            r3.b(r4, r5, r1)
            r1.f1752f = r2
            r1.f1736H = r2
            androidx.fragment.app.t r3 = r1.f1769x
            h.l r3 = r3.f1775g
            r1.s(r3)
            boolean r3 = r1.f1736H
            if (r3 == 0) goto L_0x00f0
            androidx.fragment.app.H r3 = r1.f1768w
            java.util.concurrent.CopyOnWriteArrayList r3 = r3.f1591m
            java.util.Iterator r3 = r3.iterator()
        L_0x00cf:
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto L_0x00df
            java.lang.Object r4 = r3.next()
            androidx.fragment.app.K r4 = (androidx.fragment.app.K) r4
            r4.a()
            goto L_0x00cf
        L_0x00df:
            androidx.fragment.app.H r1 = r1.f1770y
            r1.f1573E = r2
            r1.f1574F = r2
            androidx.fragment.app.J r3 = r1.f1579L
            r3.f1616h = r2
            r1.t(r2)
            r0.e(r2)
            return
        L_0x00f0:
            androidx.fragment.app.T r0 = new androidx.fragment.app.T
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>(r6)
            r2.append(r1)
            java.lang.String r1 = " did not call through to super.onAttach()"
            r2.append(r1)
            java.lang.String r1 = r2.toString()
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.fragment.app.M.c():void");
    }

    public final int d() {
        S s2;
        r rVar = this.f1630c;
        if (rVar.f1768w == null) {
            return rVar.f1752f;
        }
        int i = this.e;
        int ordinal = rVar.f1745R.ordinal();
        int i2 = 0;
        if (ordinal == 1) {
            i = Math.min(i, 0);
        } else if (ordinal == 2) {
            i = Math.min(i, 1);
        } else if (ordinal == 3) {
            i = Math.min(i, 5);
        } else if (ordinal != 4) {
            i = Math.min(i, -1);
        }
        if (rVar.f1763r) {
            if (rVar.f1764s) {
                i = Math.max(this.e, 2);
                View view = rVar.f1737J;
                if (view != null && view.getParent() == null) {
                    i = Math.min(i, 2);
                }
            } else {
                i = this.e < 4 ? Math.min(i, rVar.f1752f) : Math.min(i, 1);
            }
        }
        if (!rVar.f1761p) {
            i = Math.min(i, 1);
        }
        ViewGroup viewGroup = rVar.I;
        if (viewGroup != null) {
            C0055i f2 = C0055i.f(viewGroup, rVar.j().D());
            f2.getClass();
            S d2 = f2.d(rVar);
            if (d2 != null) {
                i2 = d2.f1647b;
            }
            Iterator it2 = f2.f1698c.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    s2 = null;
                    break;
                }
                s2 = (S) it2.next();
                if (s2.f1648c.equals(rVar) && !s2.f1650f) {
                    break;
                }
            }
            if (s2 != null && (i2 == 0 || i2 == 1)) {
                i2 = s2.f1647b;
            }
        }
        if (i2 == 2) {
            i = Math.min(i, 6);
        } else if (i2 == 3) {
            i = Math.max(i, 3);
        } else if (rVar.f1762q) {
            if (rVar.q()) {
                i = Math.min(i, 1);
            } else {
                i = Math.min(i, -1);
            }
        }
        if (rVar.f1738K && rVar.f1752f < 5) {
            i = Math.min(i, 4);
        }
        if (Log.isLoggable("FragmentManager", 2)) {
            Objects.toString(rVar);
        }
        return i;
    }

    public final void e() {
        Parcelable parcelable;
        boolean isLoggable = Log.isLoggable("FragmentManager", 3);
        r rVar = this.f1630c;
        if (isLoggable) {
            Objects.toString(rVar);
        }
        if (!rVar.f1743P) {
            j jVar = this.f1628a;
            jVar.n(false);
            Bundle bundle = rVar.f1753g;
            rVar.f1770y.K();
            rVar.f1752f = 1;
            rVar.f1736H = false;
            rVar.f1746S.a(new Fragment$6(rVar));
            rVar.f1749V.b(bundle);
            rVar.t(bundle);
            rVar.f1743P = true;
            if (rVar.f1736H) {
                rVar.f1746S.d(C0077l.ON_CREATE);
                jVar.f(false);
                return;
            }
            throw new AndroidRuntimeException("Fragment " + rVar + " did not call through to super.onCreate()");
        }
        Bundle bundle2 = rVar.f1753g;
        if (!(bundle2 == null || (parcelable = bundle2.getParcelable("android:support:fragments")) == null)) {
            rVar.f1770y.Q(parcelable);
            H h2 = rVar.f1770y;
            h2.f1573E = false;
            h2.f1574F = false;
            h2.f1579L.f1616h = false;
            h2.t(1);
        }
        rVar.f1752f = 1;
    }

    public final void f() {
        String str;
        r rVar = this.f1630c;
        if (!rVar.f1763r) {
            if (Log.isLoggable("FragmentManager", 3)) {
                Objects.toString(rVar);
            }
            LayoutInflater x2 = rVar.x(rVar.f1753g);
            rVar.f1742O = x2;
            ViewGroup viewGroup = rVar.I;
            if (viewGroup == null) {
                int i = rVar.f1730B;
                if (i == 0) {
                    viewGroup = null;
                } else if (i != -1) {
                    viewGroup = (ViewGroup) rVar.f1768w.f1599u.e(i);
                    if (viewGroup == null) {
                        if (!rVar.f1765t) {
                            try {
                                str = rVar.k().getResourceName(rVar.f1730B);
                            } catch (Resources.NotFoundException unused) {
                                str = "unknown";
                            }
                            throw new IllegalArgumentException("No view found for id 0x" + Integer.toHexString(rVar.f1730B) + " (" + str + ") for fragment " + rVar);
                        }
                    } else if (!(viewGroup instanceof FragmentContainerView)) {
                        c cVar = d.f1007a;
                        d.b(new f(rVar, "Attempting to add fragment " + rVar + " to container " + viewGroup + " which is not a FragmentContainerView"));
                        d.a(rVar).getClass();
                    }
                } else {
                    throw new IllegalArgumentException("Cannot create fragment " + rVar + " for a container view with no id");
                }
            }
            rVar.I = viewGroup;
            rVar.D(x2, viewGroup, rVar.f1753g);
            View view = rVar.f1737J;
            if (view != null) {
                view.setSaveFromParentEnabled(false);
                rVar.f1737J.setTag(2131296468, rVar);
                if (viewGroup != null) {
                    b();
                }
                if (rVar.f1732D) {
                    rVar.f1737J.setVisibility(8);
                }
                View view2 = rVar.f1737J;
                WeakHashMap weakHashMap = Q.f509a;
                if (view2.isAttachedToWindow()) {
                    D.c(rVar.f1737J);
                } else {
                    View view3 = rVar.f1737J;
                    view3.addOnAttachStateChangeListener(new o(1, view3));
                }
                rVar.B(rVar.f1753g);
                rVar.f1770y.t(2);
                this.f1628a.s(false);
                int visibility = rVar.f1737J.getVisibility();
                rVar.f().f1726j = rVar.f1737J.getAlpha();
                if (rVar.I != null && visibility == 0) {
                    View findFocus = rVar.f1737J.findFocus();
                    if (findFocus != null) {
                        rVar.f().f1727k = findFocus;
                        if (Log.isLoggable("FragmentManager", 2)) {
                            findFocus.toString();
                            Objects.toString(rVar);
                        }
                    }
                    rVar.f1737J.setAlpha(0.0f);
                }
            }
            rVar.f1752f = 2;
        }
    }

    public final void g() {
        boolean z2;
        boolean z3;
        boolean z4;
        r d2;
        boolean isLoggable = Log.isLoggable("FragmentManager", 3);
        r rVar = this.f1630c;
        if (isLoggable) {
            Objects.toString(rVar);
        }
        if (!rVar.f1762q || rVar.q()) {
            z2 = false;
        } else {
            z2 = true;
        }
        k kVar = this.f1629b;
        if (z2) {
            L l2 = (L) ((HashMap) kVar.f22g).remove(rVar.f1755j);
        }
        if (!z2) {
            J j2 = (J) kVar.i;
            if (j2.f1612c.containsKey(rVar.f1755j) && j2.f1614f) {
                z4 = j2.f1615g;
            } else {
                z4 = true;
            }
            if (!z4) {
                String str = rVar.f1758m;
                if (!(str == null || (d2 = kVar.d(str)) == null || !d2.f1734F)) {
                    rVar.f1757l = d2;
                }
                rVar.f1752f = 0;
                return;
            }
        }
        C0065t tVar = rVar.f1769x;
        if (tVar instanceof androidx.lifecycle.Q) {
            z3 = ((J) kVar.i).f1615g;
        } else {
            C0121l lVar = tVar.f1775g;
            if (lVar instanceof Activity) {
                z3 = !lVar.isChangingConfigurations();
            } else {
                z3 = true;
            }
        }
        if (z2 || z3) {
            J j3 = (J) kVar.i;
            j3.getClass();
            if (Log.isLoggable("FragmentManager", 3)) {
                Objects.toString(rVar);
            }
            j3.c(rVar.f1755j);
        }
        rVar.f1770y.k();
        rVar.f1746S.d(C0077l.ON_DESTROY);
        rVar.f1752f = 0;
        rVar.f1743P = false;
        rVar.f1736H = true;
        this.f1628a.g(false);
        Iterator it2 = kVar.g().iterator();
        while (it2.hasNext()) {
            M m2 = (M) it2.next();
            if (m2 != null) {
                String str2 = rVar.f1755j;
                r rVar2 = m2.f1630c;
                if (str2.equals(rVar2.f1758m)) {
                    rVar2.f1757l = rVar;
                    rVar2.f1758m = null;
                }
            }
        }
        String str3 = rVar.f1758m;
        if (str3 != null) {
            rVar.f1757l = kVar.d(str3);
        }
        kVar.l(this);
    }

    public final void h() {
        View view;
        boolean isLoggable = Log.isLoggable("FragmentManager", 3);
        r rVar = this.f1630c;
        if (isLoggable) {
            Objects.toString(rVar);
        }
        ViewGroup viewGroup = rVar.I;
        if (!(viewGroup == null || (view = rVar.f1737J) == null)) {
            viewGroup.removeView(view);
        }
        rVar.f1770y.t(1);
        if (rVar.f1737J != null && rVar.f1747T.d().f1841c.compareTo(C0078m.f1833c) >= 0) {
            rVar.f1747T.e(C0077l.ON_DESTROY);
        }
        rVar.f1752f = 1;
        rVar.f1736H = false;
        rVar.v();
        if (rVar.f1736H) {
            android.support.v4.media.session.t tVar = new android.support.v4.media.session.t(rVar.c(), (O) C0087a.f2083d);
            Class<C0087a> cls = C0087a.class;
            String canonicalName = cls.getCanonicalName();
            if (canonicalName != null) {
                l lVar = ((C0087a) tVar.k("androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(canonicalName), cls)).f2084c;
                if (lVar.f4554c <= 0) {
                    rVar.f1766u = false;
                    this.f1628a.t(false);
                    rVar.I = null;
                    rVar.f1737J = null;
                    rVar.f1747T = null;
                    rVar.f1748U.e((Object) null);
                    rVar.f1764s = false;
                    return;
                }
                lVar.f4553b[0].getClass();
                throw new ClassCastException();
            }
            throw new IllegalArgumentException("Local and anonymous classes can not be ViewModels");
        }
        throw new AndroidRuntimeException("Fragment " + rVar + " did not call through to super.onDestroyView()");
    }

    public final void i() {
        boolean isLoggable = Log.isLoggable("FragmentManager", 3);
        r rVar = this.f1630c;
        if (isLoggable) {
            Objects.toString(rVar);
        }
        rVar.f1752f = -1;
        rVar.f1736H = false;
        rVar.w();
        rVar.f1742O = null;
        if (rVar.f1736H) {
            H h2 = rVar.f1770y;
            if (!h2.f1575G) {
                h2.k();
                rVar.f1770y = new H();
            }
            this.f1628a.i(false);
            rVar.f1752f = -1;
            rVar.f1769x = null;
            rVar.f1771z = null;
            rVar.f1768w = null;
            if (!rVar.f1762q || rVar.q()) {
                J j2 = (J) this.f1629b.i;
                boolean z2 = true;
                if (j2.f1612c.containsKey(rVar.f1755j) && j2.f1614f) {
                    z2 = j2.f1615g;
                }
                if (!z2) {
                    return;
                }
            }
            if (Log.isLoggable("FragmentManager", 3)) {
                Objects.toString(rVar);
            }
            rVar.n();
            return;
        }
        throw new AndroidRuntimeException("Fragment " + rVar + " did not call through to super.onDetach()");
    }

    public final void j() {
        r rVar = this.f1630c;
        if (rVar.f1763r && rVar.f1764s && !rVar.f1766u) {
            if (Log.isLoggable("FragmentManager", 3)) {
                Objects.toString(rVar);
            }
            LayoutInflater x2 = rVar.x(rVar.f1753g);
            rVar.f1742O = x2;
            rVar.D(x2, (ViewGroup) null, rVar.f1753g);
            View view = rVar.f1737J;
            if (view != null) {
                view.setSaveFromParentEnabled(false);
                rVar.f1737J.setTag(2131296468, rVar);
                if (rVar.f1732D) {
                    rVar.f1737J.setVisibility(8);
                }
                rVar.B(rVar.f1753g);
                rVar.f1770y.t(2);
                this.f1628a.s(false);
                rVar.f1752f = 2;
            }
        }
    }

    public final void k() {
        ViewGroup viewGroup;
        ViewGroup viewGroup2;
        ViewGroup viewGroup3;
        k kVar = this.f1629b;
        boolean z2 = this.f1631d;
        r rVar = this.f1630c;
        if (!z2) {
            try {
                this.f1631d = true;
                boolean z3 = false;
                while (true) {
                    int d2 = d();
                    int i = rVar.f1752f;
                    if (d2 != i) {
                        if (d2 <= i) {
                            switch (i - 1) {
                                case -1:
                                    i();
                                    break;
                                case 0:
                                    g();
                                    break;
                                case 1:
                                    h();
                                    rVar.f1752f = 1;
                                    break;
                                case 2:
                                    rVar.f1764s = false;
                                    rVar.f1752f = 2;
                                    break;
                                case 3:
                                    if (Log.isLoggable("FragmentManager", 3)) {
                                        Objects.toString(rVar);
                                    }
                                    if (rVar.f1737J != null && rVar.f1754h == null) {
                                        o();
                                    }
                                    if (!(rVar.f1737J == null || (viewGroup2 = rVar.I) == null)) {
                                        C0055i f2 = C0055i.f(viewGroup2, rVar.j().D());
                                        f2.getClass();
                                        if (Log.isLoggable("FragmentManager", 2)) {
                                            Objects.toString(rVar);
                                        }
                                        f2.a(1, 3, this);
                                    }
                                    rVar.f1752f = 3;
                                    break;
                                case 4:
                                    q();
                                    break;
                                case 5:
                                    rVar.f1752f = 5;
                                    break;
                                case 6:
                                    l();
                                    break;
                            }
                        } else {
                            switch (i + 1) {
                                case 0:
                                    c();
                                    break;
                                case 1:
                                    e();
                                    break;
                                case 2:
                                    j();
                                    f();
                                    break;
                                case 3:
                                    a();
                                    break;
                                case 4:
                                    if (!(rVar.f1737J == null || (viewGroup3 = rVar.I) == null)) {
                                        C0055i f3 = C0055i.f(viewGroup3, rVar.j().D());
                                        int b2 = E.b(rVar.f1737J.getVisibility());
                                        f3.getClass();
                                        if (Log.isLoggable("FragmentManager", 2)) {
                                            Objects.toString(rVar);
                                        }
                                        f3.a(b2, 2, this);
                                    }
                                    rVar.f1752f = 4;
                                    break;
                                case 5:
                                    p();
                                    break;
                                case 6:
                                    rVar.f1752f = 6;
                                    break;
                                case 7:
                                    n();
                                    break;
                            }
                        }
                        z3 = true;
                    } else {
                        if (!z3 && i == -1 && rVar.f1762q && !rVar.q()) {
                            if (Log.isLoggable("FragmentManager", 3)) {
                                Objects.toString(rVar);
                            }
                            J j2 = (J) kVar.i;
                            j2.getClass();
                            if (Log.isLoggable("FragmentManager", 3)) {
                                Objects.toString(rVar);
                            }
                            j2.c(rVar.f1755j);
                            kVar.l(this);
                            if (Log.isLoggable("FragmentManager", 3)) {
                                Objects.toString(rVar);
                            }
                            rVar.n();
                        }
                        if (rVar.f1741N) {
                            if (!(rVar.f1737J == null || (viewGroup = rVar.I) == null)) {
                                C0055i f4 = C0055i.f(viewGroup, rVar.j().D());
                                if (rVar.f1732D) {
                                    f4.getClass();
                                    if (Log.isLoggable("FragmentManager", 2)) {
                                        Objects.toString(rVar);
                                    }
                                    f4.a(3, 1, this);
                                } else {
                                    f4.getClass();
                                    if (Log.isLoggable("FragmentManager", 2)) {
                                        Objects.toString(rVar);
                                    }
                                    f4.a(2, 1, this);
                                }
                            }
                            H h2 = rVar.f1768w;
                            if (h2 != null && rVar.f1761p && H.F(rVar)) {
                                h2.f1572D = true;
                            }
                            rVar.f1741N = false;
                            rVar.f1770y.n();
                        }
                        this.f1631d = false;
                        return;
                    }
                }
            } catch (Throwable th) {
                this.f1631d = false;
                throw th;
            }
        } else if (Log.isLoggable("FragmentManager", 2)) {
            Objects.toString(rVar);
        }
    }

    public final void l() {
        boolean isLoggable = Log.isLoggable("FragmentManager", 3);
        r rVar = this.f1630c;
        if (isLoggable) {
            Objects.toString(rVar);
        }
        rVar.f1770y.t(5);
        if (rVar.f1737J != null) {
            rVar.f1747T.e(C0077l.ON_PAUSE);
        }
        rVar.f1746S.d(C0077l.ON_PAUSE);
        rVar.f1752f = 6;
        rVar.f1736H = true;
        this.f1628a.j(false);
    }

    public final void m(ClassLoader classLoader) {
        r rVar = this.f1630c;
        Bundle bundle = rVar.f1753g;
        if (bundle != null) {
            bundle.setClassLoader(classLoader);
            rVar.f1754h = rVar.f1753g.getSparseParcelableArray("android:view_state");
            rVar.i = rVar.f1753g.getBundle("android:view_registry_state");
            String string = rVar.f1753g.getString("android:target_state");
            rVar.f1758m = string;
            if (string != null) {
                rVar.f1759n = rVar.f1753g.getInt("android:target_req_state", 0);
            }
            boolean z2 = rVar.f1753g.getBoolean("android:user_visible_hint", true);
            rVar.f1739L = z2;
            if (!z2) {
                rVar.f1738K = true;
            }
        }
    }

    public final void o() {
        r rVar = this.f1630c;
        if (rVar.f1737J != null) {
            if (Log.isLoggable("FragmentManager", 2)) {
                Objects.toString(rVar);
                Objects.toString(rVar.f1737J);
            }
            SparseArray sparseArray = new SparseArray();
            rVar.f1737J.saveHierarchyState(sparseArray);
            if (sparseArray.size() > 0) {
                rVar.f1754h = sparseArray;
            }
            Bundle bundle = new Bundle();
            rVar.f1747T.i.c(bundle);
            if (!bundle.isEmpty()) {
                rVar.i = bundle;
            }
        }
    }

    public final void p() {
        boolean isLoggable = Log.isLoggable("FragmentManager", 3);
        r rVar = this.f1630c;
        if (isLoggable) {
            Objects.toString(rVar);
        }
        rVar.f1770y.K();
        rVar.f1770y.x(true);
        rVar.f1752f = 5;
        rVar.f1736H = false;
        rVar.z();
        if (rVar.f1736H) {
            t tVar = rVar.f1746S;
            C0077l lVar = C0077l.ON_START;
            tVar.d(lVar);
            if (rVar.f1737J != null) {
                rVar.f1747T.f1641h.d(lVar);
            }
            H h2 = rVar.f1770y;
            h2.f1573E = false;
            h2.f1574F = false;
            h2.f1579L.f1616h = false;
            h2.t(5);
            this.f1628a.q(false);
            return;
        }
        throw new AndroidRuntimeException("Fragment " + rVar + " did not call through to super.onStart()");
    }

    public final void q() {
        boolean isLoggable = Log.isLoggable("FragmentManager", 3);
        r rVar = this.f1630c;
        if (isLoggable) {
            Objects.toString(rVar);
        }
        H h2 = rVar.f1770y;
        h2.f1574F = true;
        h2.f1579L.f1616h = true;
        h2.t(4);
        if (rVar.f1737J != null) {
            rVar.f1747T.e(C0077l.ON_STOP);
        }
        rVar.f1746S.d(C0077l.ON_STOP);
        rVar.f1752f = 4;
        rVar.f1736H = false;
        rVar.A();
        if (rVar.f1736H) {
            this.f1628a.r(false);
            return;
        }
        throw new AndroidRuntimeException("Fragment " + rVar + " did not call through to super.onStop()");
    }

    public M(j jVar, k kVar, ClassLoader classLoader, B b2, L l2) {
        this.f1628a = jVar;
        this.f1629b = kVar;
        r a2 = b2.a(l2.f1617a);
        Bundle bundle = l2.f1624j;
        if (bundle != null) {
            bundle.setClassLoader(classLoader);
        }
        a2.I(bundle);
        a2.f1755j = l2.f1618b;
        a2.f1763r = l2.f1619c;
        a2.f1765t = true;
        a2.f1729A = l2.f1620d;
        a2.f1730B = l2.e;
        a2.f1731C = l2.f1621f;
        a2.f1734F = l2.f1622g;
        a2.f1762q = l2.f1623h;
        a2.f1733E = l2.i;
        a2.f1732D = l2.f1625k;
        a2.f1745R = C0078m.values()[l2.f1626l];
        Bundle bundle2 = l2.f1627m;
        if (bundle2 != null) {
            a2.f1753g = bundle2;
        } else {
            a2.f1753g = new Bundle();
        }
        this.f1630c = a2;
        if (Log.isLoggable("FragmentManager", 2)) {
            Objects.toString(a2);
        }
    }

    public M(j jVar, k kVar, r rVar, L l2) {
        this.f1628a = jVar;
        this.f1629b = kVar;
        this.f1630c = rVar;
        rVar.f1754h = null;
        rVar.i = null;
        rVar.f1767v = 0;
        rVar.f1764s = false;
        rVar.f1761p = false;
        r rVar2 = rVar.f1757l;
        rVar.f1758m = rVar2 != null ? rVar2.f1755j : null;
        rVar.f1757l = null;
        Bundle bundle = l2.f1627m;
        if (bundle != null) {
            rVar.f1753g = bundle;
        } else {
            rVar.f1753g = new Bundle();
        }
    }
}
