package androidx.fragment.app;

import E.j;
import J.c;
import K.n;
import K0.e;
import N.Q;
import Q0.E;
import android.animation.Animator;
import android.content.Context;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Objects;
import java.util.WeakHashMap;
import t.C0339e;

/* renamed from: androidx.fragment.app.i  reason: case insensitive filesystem */
public final class C0055i {

    /* renamed from: a  reason: collision with root package name */
    public final ViewGroup f1696a;

    /* renamed from: b  reason: collision with root package name */
    public final ArrayList f1697b = new ArrayList();

    /* renamed from: c  reason: collision with root package name */
    public final ArrayList f1698c = new ArrayList();

    /* renamed from: d  reason: collision with root package name */
    public boolean f1699d = false;
    public boolean e = false;

    /* JADX WARNING: type inference failed for: r1v0, types: [java.lang.Object, J.c] */
    public final void a(int i, int i2, M m2) {
        synchronized (this.f1697b) {
            try {
                ? obj = new Object();
                S d2 = d(m2.f1630c);
                if (d2 != null) {
                    d2.c(i, i2);
                    return;
                }
                S s2 = new S(i, i2, m2, obj);
                this.f1697b.add(s2);
                s2.f1649d.add(new Q(this, s2, 0));
                s2.f1649d.add(new Q(this, s2, 1));
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX WARNING: type inference failed for: r9v6, types: [java.lang.Object, A.k, J.b] */
    /* JADX WARNING: type inference failed for: r13v7, types: [java.lang.Object, J.c] */
    /* JADX WARNING: type inference failed for: r15v3, types: [java.lang.Object, androidx.fragment.app.f, androidx.fragment.app.g] */
    /* JADX WARNING: type inference failed for: r13v8, types: [java.lang.Object, J.c] */
    public final void b(ArrayList arrayList, boolean z2) {
        int i;
        boolean z3;
        ArrayList arrayList2 = arrayList;
        boolean z4 = z2;
        Iterator it2 = arrayList.iterator();
        S s2 = null;
        S s3 = null;
        while (true) {
            i = 2;
            if (!it2.hasNext()) {
                break;
            }
            S s4 = (S) it2.next();
            int c2 = E.c(s4.f1648c.f1737J);
            int a2 = C0339e.a(s4.f1646a);
            if (a2 != 0) {
                if (a2 != 1) {
                    if (!(a2 == 2 || a2 == 3)) {
                    }
                } else if (c2 != 2) {
                    s3 = s4;
                }
            }
            if (c2 == 2 && s2 == null) {
                s2 = s4;
            }
        }
        if (Log.isLoggable("FragmentManager", 2)) {
            Objects.toString(s2);
            Objects.toString(s3);
        }
        ArrayList arrayList3 = new ArrayList();
        ArrayList arrayList4 = new ArrayList();
        ArrayList arrayList5 = new ArrayList(arrayList2);
        r rVar = ((S) arrayList2.get(arrayList.size() - 1)).f1648c;
        Iterator it3 = arrayList.iterator();
        while (it3.hasNext()) {
            C0062p pVar = ((S) it3.next()).f1648c.f1740M;
            C0062p pVar2 = rVar.f1740M;
            pVar.f1720b = pVar2.f1720b;
            pVar.f1721c = pVar2.f1721c;
            pVar.f1722d = pVar2.f1722d;
            pVar.e = pVar2.e;
        }
        Iterator it4 = arrayList.iterator();
        while (true) {
            boolean z5 = false;
            if (!it4.hasNext()) {
                break;
            }
            S s5 = (S) it4.next();
            ? obj = new Object();
            s5.d();
            HashSet hashSet = s5.e;
            hashSet.add(obj);
            ? gVar = new C0053g(s5, obj);
            gVar.f1693d = false;
            gVar.f1692c = z4;
            arrayList3.add(gVar);
            ? obj2 = new Object();
            s5.d();
            hashSet.add(obj2);
            if (!z4 ? s5 == s3 : s5 == s2) {
                z5 = true;
            }
            C0053g gVar2 = new C0053g(s5, obj2);
            int i2 = s5.f1646a;
            r rVar2 = s5.f1648c;
            if (i2 == 2) {
                if (z4) {
                    C0062p pVar3 = rVar2.f1740M;
                } else {
                    rVar2.getClass();
                }
                if (z4) {
                    C0062p pVar4 = rVar2.f1740M;
                } else {
                    C0062p pVar5 = rVar2.f1740M;
                }
            } else if (z4) {
                C0062p pVar6 = rVar2.f1740M;
            } else {
                rVar2.getClass();
            }
            if (z5) {
                if (z4) {
                    C0062p pVar7 = rVar2.f1740M;
                } else {
                    rVar2.getClass();
                }
            }
            arrayList4.add(gVar2);
            s5.f1649d.add(new n(this, arrayList5, s5));
        }
        HashMap hashMap = new HashMap();
        Iterator it5 = arrayList4.iterator();
        while (it5.hasNext()) {
            S s6 = (S) ((C0054h) it5.next()).f1694a;
            int c3 = E.c(s6.f1648c.f1737J);
            int i3 = s6.f1646a;
        }
        Iterator it6 = arrayList4.iterator();
        while (it6.hasNext()) {
            C0054h hVar = (C0054h) it6.next();
            hashMap.put((S) hVar.f1694a, Boolean.FALSE);
            hVar.d();
        }
        boolean containsValue = hashMap.containsValue(Boolean.TRUE);
        ViewGroup viewGroup = this.f1696a;
        Context context = viewGroup.getContext();
        ArrayList arrayList6 = new ArrayList();
        Iterator it7 = arrayList3.iterator();
        boolean z6 = false;
        while (it7.hasNext()) {
            C0052f fVar = (C0052f) it7.next();
            S s7 = (S) fVar.f1694a;
            int c4 = E.c(s7.f1648c.f1737J);
            int i4 = s7.f1646a;
            if (c4 == i4 || !(c4 == i || i4 == i)) {
                fVar.d();
            } else {
                j j2 = fVar.j(context);
                if (j2 == null) {
                    fVar.d();
                } else {
                    Animator animator = (Animator) j2.f109h;
                    if (animator == null) {
                        arrayList6.add(fVar);
                    } else {
                        S s8 = (S) fVar.f1694a;
                        boolean equals = Boolean.TRUE.equals(hashMap.get(s8));
                        r rVar3 = s8.f1648c;
                        if (equals) {
                            if (Log.isLoggable("FragmentManager", 2)) {
                                Objects.toString(rVar3);
                            }
                            fVar.d();
                        } else {
                            if (s8.f1646a == 3) {
                                z3 = true;
                            } else {
                                z3 = false;
                            }
                            if (z3) {
                                arrayList5.remove(s8);
                            }
                            View view = rVar3.f1737J;
                            viewGroup.startViewTransition(view);
                            animator.addListener(new C0050d(viewGroup, view, z3, s8, fVar));
                            animator.setTarget(view);
                            animator.start();
                            if (Log.isLoggable("FragmentManager", 2)) {
                                s8.toString();
                            }
                            ((c) fVar.f1695b).a(new j((Object) animator, (Object) s8, 7));
                            i = 2;
                            z6 = true;
                        }
                    }
                }
            }
            i = 2;
        }
        Iterator it8 = arrayList6.iterator();
        while (it8.hasNext()) {
            C0052f fVar2 = (C0052f) it8.next();
            S s9 = (S) fVar2.f1694a;
            r rVar4 = s9.f1648c;
            if (containsValue) {
                if (Log.isLoggable("FragmentManager", 2)) {
                    Objects.toString(rVar4);
                }
                fVar2.d();
            } else if (z6) {
                if (Log.isLoggable("FragmentManager", 2)) {
                    Objects.toString(rVar4);
                }
                fVar2.d();
            } else {
                View view2 = rVar4.f1737J;
                j j3 = fVar2.j(context);
                j3.getClass();
                Animation animation = (Animation) j3.f108g;
                animation.getClass();
                if (s9.f1646a != 1) {
                    view2.startAnimation(animation);
                    fVar2.d();
                } else {
                    viewGroup.startViewTransition(view2);
                    u uVar = new u(animation, viewGroup, view2);
                    uVar.setAnimationListener(new C0051e(s9, viewGroup, view2, fVar2));
                    view2.startAnimation(uVar);
                    if (Log.isLoggable("FragmentManager", 2)) {
                        s9.toString();
                    }
                }
                ? obj3 = new Object();
                obj3.f21f = view2;
                obj3.f22g = viewGroup;
                obj3.f23h = fVar2;
                obj3.i = s9;
                ((c) fVar2.f1695b).a(obj3);
            }
        }
        Iterator it9 = arrayList5.iterator();
        while (it9.hasNext()) {
            S s10 = (S) it9.next();
            E.a(s10.f1648c.f1737J, s10.f1646a);
        }
        arrayList5.clear();
        if (Log.isLoggable("FragmentManager", 2)) {
            Objects.toString(s2);
            Objects.toString(s3);
        }
    }

    public final void c() {
        if (!this.e) {
            ViewGroup viewGroup = this.f1696a;
            WeakHashMap weakHashMap = Q.f509a;
            if (!viewGroup.isAttachedToWindow()) {
                e();
                this.f1699d = false;
                return;
            }
            synchronized (this.f1697b) {
                try {
                    if (!this.f1697b.isEmpty()) {
                        ArrayList arrayList = new ArrayList(this.f1698c);
                        this.f1698c.clear();
                        Iterator it2 = arrayList.iterator();
                        while (it2.hasNext()) {
                            S s2 = (S) it2.next();
                            if (Log.isLoggable("FragmentManager", 2)) {
                                Objects.toString(s2);
                            }
                            s2.a();
                            if (!s2.f1651g) {
                                this.f1698c.add(s2);
                            }
                        }
                        g();
                        ArrayList arrayList2 = new ArrayList(this.f1697b);
                        this.f1697b.clear();
                        this.f1698c.addAll(arrayList2);
                        Log.isLoggable("FragmentManager", 2);
                        Iterator it3 = arrayList2.iterator();
                        while (it3.hasNext()) {
                            ((S) it3.next()).d();
                        }
                        b(arrayList2, this.f1699d);
                        this.f1699d = false;
                        Log.isLoggable("FragmentManager", 2);
                    }
                } finally {
                }
            }
        }
    }

    public final S d(r rVar) {
        Iterator it2 = this.f1697b.iterator();
        while (it2.hasNext()) {
            S s2 = (S) it2.next();
            if (s2.f1648c.equals(rVar) && !s2.f1650f) {
                return s2;
            }
        }
        return null;
    }

    public final void e() {
        Log.isLoggable("FragmentManager", 2);
        ViewGroup viewGroup = this.f1696a;
        WeakHashMap weakHashMap = Q.f509a;
        boolean isAttachedToWindow = viewGroup.isAttachedToWindow();
        synchronized (this.f1697b) {
            try {
                g();
                Iterator it2 = this.f1697b.iterator();
                while (it2.hasNext()) {
                    ((S) it2.next()).d();
                }
                Iterator it3 = new ArrayList(this.f1698c).iterator();
                while (it3.hasNext()) {
                    S s2 = (S) it3.next();
                    if (Log.isLoggable("FragmentManager", 2)) {
                        if (!isAttachedToWindow) {
                            StringBuilder sb = new StringBuilder();
                            sb.append("Container ");
                            sb.append(this.f1696a);
                            sb.append(" is not attached to window. ");
                        }
                        Objects.toString(s2);
                    }
                    s2.a();
                }
                Iterator it4 = new ArrayList(this.f1697b).iterator();
                while (it4.hasNext()) {
                    S s3 = (S) it4.next();
                    if (Log.isLoggable("FragmentManager", 2)) {
                        if (!isAttachedToWindow) {
                            StringBuilder sb2 = new StringBuilder();
                            sb2.append("Container ");
                            sb2.append(this.f1696a);
                            sb2.append(" is not attached to window. ");
                        }
                        Objects.toString(s3);
                    }
                    s3.a();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void g() {
        Iterator it2 = this.f1697b.iterator();
        while (it2.hasNext()) {
            S s2 = (S) it2.next();
            if (s2.f1647b == 2) {
                s2.c(E.b(s2.f1648c.G().getVisibility()), 1);
            }
        }
    }

    public C0055i(ViewGroup viewGroup) {
        this.f1696a = viewGroup;
    }

    public static C0055i f(ViewGroup viewGroup, e eVar) {
        Object tag = viewGroup.getTag(2131296697);
        if (tag instanceof C0055i) {
            return (C0055i) tag;
        }
        eVar.getClass();
        C0055i iVar = new C0055i(viewGroup);
        viewGroup.setTag(2131296697, iVar);
        return iVar;
    }
}
