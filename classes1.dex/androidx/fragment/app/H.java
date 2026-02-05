package androidx.fragment.app;

import A.k;
import C.t;
import C.u;
import D.f;
import D.g;
import E.j;
import K0.e;
import N.C0012l;
import N0.B;
import Q0.E;
import R0.h;
import Z.d;
import Z0.c;
import android.app.Activity;
import android.os.Bundle;
import android.os.Looper;
import android.os.Parcelable;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import androidx.activity.A;
import androidx.lifecycle.C0078m;
import androidx.lifecycle.O;
import androidx.lifecycle.Q;
import c0.C0087a;
import h.C0121l;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicInteger;
import r.l;

public final class H {

    /* renamed from: A  reason: collision with root package name */
    public j f1569A;

    /* renamed from: B  reason: collision with root package name */
    public j f1570B;

    /* renamed from: C  reason: collision with root package name */
    public ArrayDeque f1571C;

    /* renamed from: D  reason: collision with root package name */
    public boolean f1572D;

    /* renamed from: E  reason: collision with root package name */
    public boolean f1573E;

    /* renamed from: F  reason: collision with root package name */
    public boolean f1574F;

    /* renamed from: G  reason: collision with root package name */
    public boolean f1575G;

    /* renamed from: H  reason: collision with root package name */
    public boolean f1576H;
    public ArrayList I;

    /* renamed from: J  reason: collision with root package name */
    public ArrayList f1577J;

    /* renamed from: K  reason: collision with root package name */
    public ArrayList f1578K;

    /* renamed from: L  reason: collision with root package name */
    public J f1579L;

    /* renamed from: M  reason: collision with root package name */
    public final B f1580M;

    /* renamed from: a  reason: collision with root package name */
    public final ArrayList f1581a = new ArrayList();

    /* renamed from: b  reason: collision with root package name */
    public boolean f1582b;

    /* renamed from: c  reason: collision with root package name */
    public final k f1583c = new k(3);

    /* renamed from: d  reason: collision with root package name */
    public ArrayList f1584d;
    public ArrayList e;

    /* renamed from: f  reason: collision with root package name */
    public final x f1585f = new x(this);

    /* renamed from: g  reason: collision with root package name */
    public A f1586g;

    /* renamed from: h  reason: collision with root package name */
    public final h f1587h = new h(this);
    public final AtomicInteger i = new AtomicInteger();

    /* renamed from: j  reason: collision with root package name */
    public final Map f1588j = Collections.synchronizedMap(new HashMap());

    /* renamed from: k  reason: collision with root package name */
    public final Map f1589k = Collections.synchronizedMap(new HashMap());

    /* renamed from: l  reason: collision with root package name */
    public final j f1590l;

    /* renamed from: m  reason: collision with root package name */
    public final CopyOnWriteArrayList f1591m;

    /* renamed from: n  reason: collision with root package name */
    public final y f1592n;

    /* renamed from: o  reason: collision with root package name */
    public final y f1593o;

    /* renamed from: p  reason: collision with root package name */
    public final y f1594p;

    /* renamed from: q  reason: collision with root package name */
    public final y f1595q;

    /* renamed from: r  reason: collision with root package name */
    public final A f1596r;

    /* renamed from: s  reason: collision with root package name */
    public int f1597s;

    /* renamed from: t  reason: collision with root package name */
    public C0065t f1598t;

    /* renamed from: u  reason: collision with root package name */
    public v f1599u;

    /* renamed from: v  reason: collision with root package name */
    public r f1600v;

    /* renamed from: w  reason: collision with root package name */
    public r f1601w;

    /* renamed from: x  reason: collision with root package name */
    public final B f1602x;

    /* renamed from: y  reason: collision with root package name */
    public final e f1603y;

    /* renamed from: z  reason: collision with root package name */
    public j f1604z;

    public static boolean H(r rVar) {
        if (rVar == null) {
            return true;
        }
        if (!rVar.f1735G || (rVar.f1768w != null && !H(rVar.f1771z))) {
            return false;
        }
        return true;
    }

    public static boolean I(r rVar) {
        if (rVar == null) {
            return true;
        }
        H h2 = rVar.f1768w;
        if (!rVar.equals(h2.f1601w) || !I(h2.f1600v)) {
            return false;
        }
        return true;
    }

    public final boolean L() {
        return M(-1, 0);
    }

    public final boolean M(int i2, int i3) {
        x(false);
        w(true);
        r rVar = this.f1601w;
        if (rVar != null && i2 < 0 && rVar.g().L()) {
            return true;
        }
        boolean N2 = N(this.I, this.f1577J, i2, i3);
        if (N2) {
            this.f1582b = true;
            try {
                P(this.I, this.f1577J);
            } finally {
                d();
            }
        }
        Z();
        if (this.f1576H) {
            this.f1576H = false;
            X();
        }
        ((HashMap) this.f1583c.f21f).values().removeAll(Collections.singleton((Object) null));
        return N2;
    }

    public final boolean N(ArrayList arrayList, ArrayList arrayList2, int i2, int i3) {
        boolean z2;
        if ((i3 & 1) != 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        ArrayList arrayList3 = this.f1584d;
        int i4 = -1;
        if (arrayList3 != null && !arrayList3.isEmpty()) {
            if (i2 < 0) {
                i4 = z2 ? 0 : this.f1584d.size() - 1;
            } else {
                int size = this.f1584d.size() - 1;
                while (size >= 0) {
                    C0047a aVar = (C0047a) this.f1584d.get(size);
                    if (i2 >= 0 && i2 == aVar.f1669s) {
                        break;
                    }
                    size--;
                }
                if (size >= 0) {
                    if (z2) {
                        while (size > 0) {
                            C0047a aVar2 = (C0047a) this.f1584d.get(size - 1);
                            if (i2 < 0 || i2 != aVar2.f1669s) {
                                break;
                            }
                            size--;
                        }
                    } else if (size != this.f1584d.size() - 1) {
                        size++;
                    }
                }
                i4 = size;
            }
        }
        if (i4 < 0) {
            return false;
        }
        for (int size2 = this.f1584d.size() - 1; size2 >= i4; size2--) {
            arrayList.add((C0047a) this.f1584d.remove(size2));
            arrayList2.add(Boolean.TRUE);
        }
        return true;
    }

    public final void d() {
        this.f1582b = false;
        this.f1577J.clear();
        this.I.clear();
    }

    public final void k() {
        boolean z2 = true;
        this.f1575G = true;
        x(true);
        Iterator it2 = e().iterator();
        while (it2.hasNext()) {
            ((C0055i) it2.next()).e();
        }
        C0065t tVar = this.f1598t;
        boolean z3 = tVar instanceof Q;
        k kVar = this.f1583c;
        if (z3) {
            z2 = ((J) kVar.i).f1615g;
        } else {
            C0121l lVar = tVar.f1775g;
            if (lVar instanceof Activity) {
                z2 = true ^ lVar.isChangingConfigurations();
            }
        }
        if (z2) {
            for (C0049c cVar : this.f1588j.values()) {
                for (String c2 : cVar.f1682a) {
                    J j2 = (J) kVar.i;
                    j2.getClass();
                    Log.isLoggable("FragmentManager", 3);
                    j2.c(c2);
                }
            }
        }
        t(-1);
        C0065t tVar2 = this.f1598t;
        if (tVar2 instanceof g) {
            C0121l lVar2 = tVar2.f1777j;
            y yVar = this.f1593o;
            lVar2.getClass();
            c.e("listener", yVar);
            lVar2.f1182o.remove(yVar);
        }
        C0065t tVar3 = this.f1598t;
        if (tVar3 instanceof f) {
            C0121l lVar3 = tVar3.f1777j;
            y yVar2 = this.f1592n;
            lVar3.getClass();
            c.e("listener", yVar2);
            lVar3.f1181n.remove(yVar2);
        }
        C0065t tVar4 = this.f1598t;
        if (tVar4 instanceof t) {
            C0121l lVar4 = tVar4.f1777j;
            y yVar3 = this.f1594p;
            lVar4.getClass();
            c.e("listener", yVar3);
            lVar4.f1184q.remove(yVar3);
        }
        C0065t tVar5 = this.f1598t;
        if (tVar5 instanceof u) {
            C0121l lVar5 = tVar5.f1777j;
            y yVar4 = this.f1595q;
            lVar5.getClass();
            c.e("listener", yVar4);
            lVar5.f1185r.remove(yVar4);
        }
        C0065t tVar6 = this.f1598t;
        if (tVar6 instanceof C0012l) {
            C0121l lVar6 = tVar6.f1777j;
            A a2 = this.f1596r;
            lVar6.getClass();
            c.e("provider", a2);
            android.support.v4.media.session.t tVar7 = lVar6.f1176h;
            ((CopyOnWriteArrayList) tVar7.f1132c).remove(a2);
            if (((HashMap) tVar7.f1133d).remove(a2) == null) {
                ((Runnable) tVar7.f1131b).run();
            } else {
                throw new ClassCastException();
            }
        }
        this.f1598t = null;
        this.f1599u = null;
        this.f1600v = null;
        if (this.f1586g != null) {
            Iterator it3 = this.f1587h.f862b.iterator();
            while (it3.hasNext()) {
                ((androidx.activity.c) it3.next()).cancel();
            }
            this.f1586g = null;
        }
        j jVar = this.f1604z;
        if (jVar != null) {
            jVar.N();
            this.f1569A.N();
            this.f1570B.N();
        }
    }

    /* JADX INFO: finally extract failed */
    public final void t(int i2) {
        try {
            this.f1582b = true;
            for (M m2 : ((HashMap) this.f1583c.f21f).values()) {
                if (m2 != null) {
                    m2.e = i2;
                }
            }
            J(i2, false);
            Iterator it2 = e().iterator();
            while (it2.hasNext()) {
                ((C0055i) it2.next()).e();
            }
            this.f1582b = false;
            x(true);
        } catch (Throwable th) {
            this.f1582b = false;
            throw th;
        }
    }

    public final void u(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        int size;
        int size2;
        boolean z2;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        String f2 = E.f(str, "    ");
        k kVar = this.f1583c;
        kVar.getClass();
        String str2 = str + "    ";
        HashMap hashMap = (HashMap) kVar.f21f;
        if (!hashMap.isEmpty()) {
            printWriter.print(str);
            printWriter.println("Active Fragments:");
            for (M m2 : hashMap.values()) {
                printWriter.print(str);
                if (m2 != null) {
                    r rVar = m2.f1630c;
                    printWriter.println(rVar);
                    rVar.getClass();
                    printWriter.print(str2);
                    printWriter.print("mFragmentId=#");
                    printWriter.print(Integer.toHexString(rVar.f1729A));
                    printWriter.print(" mContainerId=#");
                    printWriter.print(Integer.toHexString(rVar.f1730B));
                    printWriter.print(" mTag=");
                    printWriter.println(rVar.f1731C);
                    printWriter.print(str2);
                    printWriter.print("mState=");
                    printWriter.print(rVar.f1752f);
                    printWriter.print(" mWho=");
                    printWriter.print(rVar.f1755j);
                    printWriter.print(" mBackStackNesting=");
                    printWriter.println(rVar.f1767v);
                    printWriter.print(str2);
                    printWriter.print("mAdded=");
                    printWriter.print(rVar.f1761p);
                    printWriter.print(" mRemoving=");
                    printWriter.print(rVar.f1762q);
                    printWriter.print(" mFromLayout=");
                    printWriter.print(rVar.f1763r);
                    printWriter.print(" mInLayout=");
                    printWriter.println(rVar.f1764s);
                    printWriter.print(str2);
                    printWriter.print("mHidden=");
                    printWriter.print(rVar.f1732D);
                    printWriter.print(" mDetached=");
                    printWriter.print(rVar.f1733E);
                    printWriter.print(" mMenuVisible=");
                    printWriter.print(rVar.f1735G);
                    printWriter.print(" mHasMenu=");
                    printWriter.println(false);
                    printWriter.print(str2);
                    printWriter.print("mRetainInstance=");
                    printWriter.print(rVar.f1734F);
                    printWriter.print(" mUserVisibleHint=");
                    printWriter.println(rVar.f1739L);
                    if (rVar.f1768w != null) {
                        printWriter.print(str2);
                        printWriter.print("mFragmentManager=");
                        printWriter.println(rVar.f1768w);
                    }
                    if (rVar.f1769x != null) {
                        printWriter.print(str2);
                        printWriter.print("mHost=");
                        printWriter.println(rVar.f1769x);
                    }
                    if (rVar.f1771z != null) {
                        printWriter.print(str2);
                        printWriter.print("mParentFragment=");
                        printWriter.println(rVar.f1771z);
                    }
                    if (rVar.f1756k != null) {
                        printWriter.print(str2);
                        printWriter.print("mArguments=");
                        printWriter.println(rVar.f1756k);
                    }
                    if (rVar.f1753g != null) {
                        printWriter.print(str2);
                        printWriter.print("mSavedFragmentState=");
                        printWriter.println(rVar.f1753g);
                    }
                    if (rVar.f1754h != null) {
                        printWriter.print(str2);
                        printWriter.print("mSavedViewState=");
                        printWriter.println(rVar.f1754h);
                    }
                    if (rVar.i != null) {
                        printWriter.print(str2);
                        printWriter.print("mSavedViewRegistryState=");
                        printWriter.println(rVar.i);
                    }
                    r l2 = rVar.l(false);
                    if (l2 != null) {
                        printWriter.print(str2);
                        printWriter.print("mTarget=");
                        printWriter.print(l2);
                        printWriter.print(" mTargetRequestCode=");
                        printWriter.println(rVar.f1759n);
                    }
                    printWriter.print(str2);
                    printWriter.print("mPopDirection=");
                    C0062p pVar = rVar.f1740M;
                    if (pVar == null) {
                        z2 = false;
                    } else {
                        z2 = pVar.f1719a;
                    }
                    printWriter.println(z2);
                    C0062p pVar2 = rVar.f1740M;
                    if (pVar2 == null) {
                        i2 = 0;
                    } else {
                        i2 = pVar2.f1720b;
                    }
                    if (i2 != 0) {
                        printWriter.print(str2);
                        printWriter.print("getEnterAnim=");
                        C0062p pVar3 = rVar.f1740M;
                        if (pVar3 == null) {
                            i9 = 0;
                        } else {
                            i9 = pVar3.f1720b;
                        }
                        printWriter.println(i9);
                    }
                    C0062p pVar4 = rVar.f1740M;
                    if (pVar4 == null) {
                        i3 = 0;
                    } else {
                        i3 = pVar4.f1721c;
                    }
                    if (i3 != 0) {
                        printWriter.print(str2);
                        printWriter.print("getExitAnim=");
                        C0062p pVar5 = rVar.f1740M;
                        if (pVar5 == null) {
                            i8 = 0;
                        } else {
                            i8 = pVar5.f1721c;
                        }
                        printWriter.println(i8);
                    }
                    C0062p pVar6 = rVar.f1740M;
                    if (pVar6 == null) {
                        i4 = 0;
                    } else {
                        i4 = pVar6.f1722d;
                    }
                    if (i4 != 0) {
                        printWriter.print(str2);
                        printWriter.print("getPopEnterAnim=");
                        C0062p pVar7 = rVar.f1740M;
                        if (pVar7 == null) {
                            i7 = 0;
                        } else {
                            i7 = pVar7.f1722d;
                        }
                        printWriter.println(i7);
                    }
                    C0062p pVar8 = rVar.f1740M;
                    if (pVar8 == null) {
                        i5 = 0;
                    } else {
                        i5 = pVar8.e;
                    }
                    if (i5 != 0) {
                        printWriter.print(str2);
                        printWriter.print("getPopExitAnim=");
                        C0062p pVar9 = rVar.f1740M;
                        if (pVar9 == null) {
                            i6 = 0;
                        } else {
                            i6 = pVar9.e;
                        }
                        printWriter.println(i6);
                    }
                    if (rVar.I != null) {
                        printWriter.print(str2);
                        printWriter.print("mContainer=");
                        printWriter.println(rVar.I);
                    }
                    if (rVar.f1737J != null) {
                        printWriter.print(str2);
                        printWriter.print("mView=");
                        printWriter.println(rVar.f1737J);
                    }
                    if (rVar.h() != null) {
                        android.support.v4.media.session.t tVar = new android.support.v4.media.session.t(rVar.c(), (O) C0087a.f2083d);
                        Class<C0087a> cls = C0087a.class;
                        String canonicalName = cls.getCanonicalName();
                        if (canonicalName != null) {
                            l lVar = ((C0087a) tVar.k("androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(canonicalName), cls)).f2084c;
                            if (lVar.f4554c > 0) {
                                printWriter.print(str2);
                                printWriter.println("Loaders:");
                                if (lVar.f4554c > 0) {
                                    if (lVar.f4553b[0] == null) {
                                        printWriter.print(str2);
                                        printWriter.print("  #");
                                        printWriter.print(lVar.f4552a[0]);
                                        printWriter.print(": ");
                                        throw null;
                                    }
                                    throw new ClassCastException();
                                }
                            }
                        } else {
                            throw new IllegalArgumentException("Local and anonymous classes can not be ViewModels");
                        }
                    }
                    printWriter.print(str2);
                    printWriter.println("Child " + rVar.f1770y + ":");
                    rVar.f1770y.u(E.f(str2, "  "), fileDescriptor, printWriter, strArr);
                } else {
                    printWriter.println("null");
                }
            }
        }
        ArrayList arrayList = (ArrayList) kVar.f23h;
        int size3 = arrayList.size();
        if (size3 > 0) {
            printWriter.print(str);
            printWriter.println("Added Fragments:");
            for (int i10 = 0; i10 < size3; i10++) {
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(i10);
                printWriter.print(": ");
                printWriter.println(((r) arrayList.get(i10)).toString());
            }
        }
        ArrayList arrayList2 = this.e;
        if (arrayList2 != null && (size2 = arrayList2.size()) > 0) {
            printWriter.print(str);
            printWriter.println("Fragments Created Menus:");
            for (int i11 = 0; i11 < size2; i11++) {
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(i11);
                printWriter.print(": ");
                printWriter.println(((r) this.e.get(i11)).toString());
            }
        }
        ArrayList arrayList3 = this.f1584d;
        if (arrayList3 != null && (size = arrayList3.size()) > 0) {
            printWriter.print(str);
            printWriter.println("Back Stack:");
            for (int i12 = 0; i12 < size; i12++) {
                C0047a aVar = (C0047a) this.f1584d.get(i12);
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(i12);
                printWriter.print(": ");
                printWriter.println(aVar.toString());
                aVar.f(f2, printWriter, true);
            }
        }
        printWriter.print(str);
        printWriter.println("Back Stack Index: " + this.i.get());
        synchronized (this.f1581a) {
            try {
                int size4 = this.f1581a.size();
                if (size4 > 0) {
                    printWriter.print(str);
                    printWriter.println("Pending Actions:");
                    for (int i13 = 0; i13 < size4; i13++) {
                        printWriter.print(str);
                        printWriter.print("  #");
                        printWriter.print(i13);
                        printWriter.print(": ");
                        printWriter.println((F) this.f1581a.get(i13));
                    }
                }
            } catch (Throwable th) {
                while (true) {
                    throw th;
                }
            }
        }
        printWriter.print(str);
        printWriter.println("FragmentManager misc state:");
        printWriter.print(str);
        printWriter.print("  mHost=");
        printWriter.println(this.f1598t);
        printWriter.print(str);
        printWriter.print("  mContainer=");
        printWriter.println(this.f1599u);
        if (this.f1600v != null) {
            printWriter.print(str);
            printWriter.print("  mParent=");
            printWriter.println(this.f1600v);
        }
        printWriter.print(str);
        printWriter.print("  mCurState=");
        printWriter.print(this.f1597s);
        printWriter.print(" mStateSaved=");
        printWriter.print(this.f1573E);
        printWriter.print(" mStopped=");
        printWriter.print(this.f1574F);
        printWriter.print(" mDestroyed=");
        printWriter.println(this.f1575G);
        if (this.f1572D) {
            printWriter.print(str);
            printWriter.print("  mNeedMenuInvalidate=");
            printWriter.println(this.f1572D);
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r20v0, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v33, resolved type: androidx.fragment.app.r} */
    /* JADX WARNING: Code restructure failed: missing block: B:153:0x0350, code lost:
        r16 = r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:168:0x03e5, code lost:
        r12 = r12 + 1;
        r3 = r16;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void y(java.util.ArrayList r24, java.util.ArrayList r25, int r26, int r27) {
        /*
            r23 = this;
            r1 = r23
            r0 = r24
            r2 = r25
            r3 = r26
            r4 = r27
            java.lang.Object r5 = r0.get(r3)
            androidx.fragment.app.a r5 = (androidx.fragment.app.C0047a) r5
            boolean r5 = r5.f1666p
            java.util.ArrayList r6 = r1.f1578K
            if (r6 != 0) goto L_0x001e
            java.util.ArrayList r6 = new java.util.ArrayList
            r6.<init>()
            r1.f1578K = r6
            goto L_0x0021
        L_0x001e:
            r6.clear()
        L_0x0021:
            java.util.ArrayList r6 = r1.f1578K
            A.k r7 = r1.f1583c
            java.util.List r8 = r7.i()
            r6.addAll(r8)
            androidx.fragment.app.r r6 = r1.f1601w
            r9 = r3
            r10 = 0
        L_0x0030:
            r12 = 1
            if (r9 >= r4) goto L_0x0187
            java.lang.Object r14 = r0.get(r9)
            androidx.fragment.app.a r14 = (androidx.fragment.app.C0047a) r14
            java.lang.Object r15 = r2.get(r9)
            java.lang.Boolean r15 = (java.lang.Boolean) r15
            boolean r15 = r15.booleanValue()
            if (r15 != 0) goto L_0x0138
            java.util.ArrayList r15 = r1.f1578K
            r8 = 0
        L_0x0048:
            java.util.ArrayList r13 = r14.f1653a
            int r11 = r13.size()
            if (r8 >= r11) goto L_0x0135
            java.lang.Object r11 = r13.get(r8)
            androidx.fragment.app.N r11 = (androidx.fragment.app.N) r11
            int r3 = r11.f1632a
            if (r3 == r12) goto L_0x0083
            r12 = 2
            if (r3 == r12) goto L_0x00a3
            r12 = 3
            if (r3 == r12) goto L_0x0088
            r12 = 6
            if (r3 == r12) goto L_0x0088
            r12 = 7
            if (r3 == r12) goto L_0x0083
            r12 = 8
            if (r3 == r12) goto L_0x006b
            goto L_0x007e
        L_0x006b:
            androidx.fragment.app.N r3 = new androidx.fragment.app.N
            r2 = 9
            r12 = 0
            r3.<init>(r2, r6, r12)
            r13.add(r8, r3)
            r2 = 1
            r11.f1634c = r2
            int r8 = r8 + 1
            androidx.fragment.app.r r2 = r11.f1633b
            r6 = r2
        L_0x007e:
            r21 = r7
            r0 = 1
            goto L_0x0129
        L_0x0083:
            r21 = r7
            r0 = 1
            goto L_0x0124
        L_0x0088:
            androidx.fragment.app.r r2 = r11.f1633b
            r15.remove(r2)
            androidx.fragment.app.r r2 = r11.f1633b
            if (r2 != r6) goto L_0x007e
            androidx.fragment.app.N r3 = new androidx.fragment.app.N
            r6 = 9
            r3.<init>(r6, r2)
            r13.add(r8, r3)
            int r8 = r8 + 1
            r21 = r7
            r0 = 1
            r6 = 0
            goto L_0x0129
        L_0x00a3:
            androidx.fragment.app.r r2 = r11.f1633b
            int r3 = r2.f1730B
            int r12 = r15.size()
            r17 = 1
            int r12 = r12 + -1
            r19 = 0
        L_0x00b1:
            if (r12 < 0) goto L_0x0111
            java.lang.Object r20 = r15.get(r12)
            r21 = r7
            r7 = r20
            androidx.fragment.app.r r7 = (androidx.fragment.app.r) r7
            int r0 = r7.f1730B
            if (r0 != r3) goto L_0x0105
            if (r7 != r2) goto L_0x00c9
            r18 = r3
            r0 = 1
            r19 = 1
            goto L_0x0108
        L_0x00c9:
            if (r7 != r6) goto L_0x00dd
            androidx.fragment.app.N r0 = new androidx.fragment.app.N
            r18 = r3
            r3 = 9
            r6 = 0
            r0.<init>(r3, r7, r6)
            r13.add(r8, r0)
            int r8 = r8 + 1
            r0 = 0
            r6 = 0
            goto L_0x00e2
        L_0x00dd:
            r18 = r3
            r0 = 0
            r3 = 9
        L_0x00e2:
            androidx.fragment.app.N r3 = new androidx.fragment.app.N
            r22 = r6
            r6 = 3
            r3.<init>(r6, r7, r0)
            int r0 = r11.f1635d
            r3.f1635d = r0
            int r0 = r11.f1636f
            r3.f1636f = r0
            int r0 = r11.e
            r3.e = r0
            int r0 = r11.f1637g
            r3.f1637g = r0
            r13.add(r8, r3)
            r15.remove(r7)
            r0 = 1
            int r8 = r8 + r0
            r6 = r22
            goto L_0x0108
        L_0x0105:
            r18 = r3
            r0 = 1
        L_0x0108:
            int r12 = r12 + -1
            r0 = r24
            r3 = r18
            r7 = r21
            goto L_0x00b1
        L_0x0111:
            r21 = r7
            r0 = 1
            if (r19 == 0) goto L_0x011c
            r13.remove(r8)
            int r8 = r8 + -1
            goto L_0x0129
        L_0x011c:
            r11.f1632a = r0
            r11.f1634c = r0
            r15.add(r2)
            goto L_0x0129
        L_0x0124:
            androidx.fragment.app.r r2 = r11.f1633b
            r15.add(r2)
        L_0x0129:
            int r8 = r8 + r0
            r0 = r24
            r2 = r25
            r3 = r26
            r7 = r21
            r12 = 1
            goto L_0x0048
        L_0x0135:
            r21 = r7
            goto L_0x0171
        L_0x0138:
            r21 = r7
            r0 = 1
            java.util.ArrayList r2 = r1.f1578K
            java.util.ArrayList r3 = r14.f1653a
            int r7 = r3.size()
            int r7 = r7 - r0
        L_0x0144:
            if (r7 < 0) goto L_0x0171
            java.lang.Object r8 = r3.get(r7)
            androidx.fragment.app.N r8 = (androidx.fragment.app.N) r8
            int r11 = r8.f1632a
            if (r11 == r0) goto L_0x0167
            r0 = 3
            if (r11 == r0) goto L_0x0161
            switch(r11) {
                case 6: goto L_0x0161;
                case 7: goto L_0x0168;
                case 8: goto L_0x015f;
                case 9: goto L_0x015c;
                case 10: goto L_0x0157;
                default: goto L_0x0156;
            }
        L_0x0156:
            goto L_0x016d
        L_0x0157:
            androidx.lifecycle.m r11 = r8.f1638h
            r8.i = r11
            goto L_0x016d
        L_0x015c:
            androidx.fragment.app.r r6 = r8.f1633b
            goto L_0x016d
        L_0x015f:
            r6 = 0
            goto L_0x016d
        L_0x0161:
            androidx.fragment.app.r r8 = r8.f1633b
            r2.add(r8)
            goto L_0x016d
        L_0x0167:
            r0 = 3
        L_0x0168:
            androidx.fragment.app.r r8 = r8.f1633b
            r2.remove(r8)
        L_0x016d:
            int r7 = r7 + -1
            r0 = 1
            goto L_0x0144
        L_0x0171:
            if (r10 != 0) goto L_0x017a
            boolean r0 = r14.f1658g
            if (r0 == 0) goto L_0x0178
            goto L_0x017a
        L_0x0178:
            r10 = 0
            goto L_0x017b
        L_0x017a:
            r10 = 1
        L_0x017b:
            int r9 = r9 + 1
            r0 = r24
            r2 = r25
            r3 = r26
            r7 = r21
            goto L_0x0030
        L_0x0187:
            r21 = r7
            java.util.ArrayList r0 = r1.f1578K
            r0.clear()
            if (r5 != 0) goto L_0x01cf
            int r0 = r1.f1597s
            r2 = 1
            if (r0 < r2) goto L_0x01cf
            r0 = r26
        L_0x0197:
            if (r0 >= r4) goto L_0x01cf
            r2 = r24
            java.lang.Object r3 = r2.get(r0)
            androidx.fragment.app.a r3 = (androidx.fragment.app.C0047a) r3
            java.util.ArrayList r3 = r3.f1653a
            java.util.Iterator r3 = r3.iterator()
        L_0x01a7:
            boolean r5 = r3.hasNext()
            if (r5 == 0) goto L_0x01ca
            java.lang.Object r5 = r3.next()
            androidx.fragment.app.N r5 = (androidx.fragment.app.N) r5
            androidx.fragment.app.r r5 = r5.f1633b
            if (r5 == 0) goto L_0x01c5
            androidx.fragment.app.H r6 = r5.f1768w
            if (r6 == 0) goto L_0x01c5
            androidx.fragment.app.M r5 = r1.f(r5)
            r6 = r21
            r6.k(r5)
            goto L_0x01c7
        L_0x01c5:
            r6 = r21
        L_0x01c7:
            r21 = r6
            goto L_0x01a7
        L_0x01ca:
            r6 = r21
            int r0 = r0 + 1
            goto L_0x0197
        L_0x01cf:
            r2 = r24
            r0 = r26
        L_0x01d3:
            r3 = -1
            if (r0 >= r4) goto L_0x03ef
            java.lang.Object r5 = r2.get(r0)
            androidx.fragment.app.a r5 = (androidx.fragment.app.C0047a) r5
            r6 = r25
            java.lang.Object r7 = r6.get(r0)
            java.lang.Boolean r7 = (java.lang.Boolean) r7
            boolean r7 = r7.booleanValue()
            java.lang.String r8 = "FragmentManager"
            java.lang.String r9 = "Unknown cmd: "
            if (r7 == 0) goto L_0x02f5
            r5.c(r3)
            java.util.ArrayList r3 = r5.f1653a
            int r7 = r3.size()
            r10 = 1
            int r7 = r7 - r10
        L_0x01f9:
            if (r7 < 0) goto L_0x02f2
            java.lang.Object r11 = r3.get(r7)
            androidx.fragment.app.N r11 = (androidx.fragment.app.N) r11
            androidx.fragment.app.r r12 = r11.f1633b
            if (r12 == 0) goto L_0x0246
            androidx.fragment.app.p r13 = r12.f1740M
            if (r13 != 0) goto L_0x020a
            goto L_0x0210
        L_0x020a:
            androidx.fragment.app.p r13 = r12.f()
            r13.f1719a = r10
        L_0x0210:
            int r10 = r5.f1657f
            r13 = 8194(0x2002, float:1.1482E-41)
            r14 = 4097(0x1001, float:5.741E-42)
            if (r10 == r14) goto L_0x0230
            if (r10 == r13) goto L_0x022e
            r13 = 4100(0x1004, float:5.745E-42)
            r14 = 8197(0x2005, float:1.1486E-41)
            if (r10 == r14) goto L_0x0230
            r15 = 4099(0x1003, float:5.744E-42)
            if (r10 == r15) goto L_0x022b
            if (r10 == r13) goto L_0x0228
            r13 = 0
            goto L_0x0230
        L_0x0228:
            r13 = 8197(0x2005, float:1.1486E-41)
            goto L_0x0230
        L_0x022b:
            r13 = 4099(0x1003, float:5.744E-42)
            goto L_0x0230
        L_0x022e:
            r13 = 4097(0x1001, float:5.741E-42)
        L_0x0230:
            androidx.fragment.app.p r10 = r12.f1740M
            if (r10 != 0) goto L_0x0237
            if (r13 != 0) goto L_0x0237
            goto L_0x023e
        L_0x0237:
            r12.f()
            androidx.fragment.app.p r10 = r12.f1740M
            r10.f1723f = r13
        L_0x023e:
            r12.f()
            androidx.fragment.app.p r10 = r12.f1740M
            r10.getClass()
        L_0x0246:
            int r10 = r11.f1632a
            androidx.fragment.app.H r13 = r5.f1667q
            switch(r10) {
                case 1: goto L_0x02dc;
                case 2: goto L_0x024d;
                case 3: goto L_0x02cd;
                case 4: goto L_0x02a7;
                case 5: goto L_0x0294;
                case 6: goto L_0x0285;
                case 7: goto L_0x0272;
                case 8: goto L_0x026d;
                case 9: goto L_0x0269;
                case 10: goto L_0x0261;
                default: goto L_0x024d;
            }
        L_0x024d:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>(r9)
            int r3 = r11.f1632a
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            r0.<init>(r2)
            throw r0
        L_0x0261:
            androidx.lifecycle.m r10 = r11.f1638h
            r13.U(r12, r10)
        L_0x0266:
            r10 = 1
            goto L_0x02ee
        L_0x0269:
            r13.V(r12)
            goto L_0x0266
        L_0x026d:
            r10 = 0
            r13.V(r10)
            goto L_0x0266
        L_0x0272:
            int r10 = r11.f1635d
            int r14 = r11.e
            int r15 = r11.f1636f
            int r11 = r11.f1637g
            r12.H(r10, r14, r15, r11)
            r10 = 1
            r13.T(r12, r10)
            r13.g(r12)
            goto L_0x0266
        L_0x0285:
            int r10 = r11.f1635d
            int r14 = r11.e
            int r15 = r11.f1636f
            int r11 = r11.f1637g
            r12.H(r10, r14, r15, r11)
            r13.c(r12)
            goto L_0x0266
        L_0x0294:
            int r10 = r11.f1635d
            int r14 = r11.e
            int r15 = r11.f1636f
            int r11 = r11.f1637g
            r12.H(r10, r14, r15, r11)
            r10 = 1
            r13.T(r12, r10)
            r13.E(r12)
            goto L_0x0266
        L_0x02a7:
            int r10 = r11.f1635d
            int r14 = r11.e
            int r15 = r11.f1636f
            int r11 = r11.f1637g
            r12.H(r10, r14, r15, r11)
            r13.getClass()
            r10 = 2
            boolean r11 = android.util.Log.isLoggable(r8, r10)
            if (r11 == 0) goto L_0x02bf
            java.util.Objects.toString(r12)
        L_0x02bf:
            boolean r10 = r12.f1732D
            if (r10 == 0) goto L_0x0266
            r10 = 0
            r12.f1732D = r10
            boolean r10 = r12.f1741N
            r11 = 1
            r10 = r10 ^ r11
            r12.f1741N = r10
            goto L_0x0266
        L_0x02cd:
            int r10 = r11.f1635d
            int r14 = r11.e
            int r15 = r11.f1636f
            int r11 = r11.f1637g
            r12.H(r10, r14, r15, r11)
            r13.a(r12)
            goto L_0x0266
        L_0x02dc:
            int r10 = r11.f1635d
            int r14 = r11.e
            int r15 = r11.f1636f
            int r11 = r11.f1637g
            r12.H(r10, r14, r15, r11)
            r10 = 1
            r13.T(r12, r10)
            r13.O(r12)
        L_0x02ee:
            int r7 = r7 + -1
            goto L_0x01f9
        L_0x02f2:
            r10 = 0
            goto L_0x03eb
        L_0x02f5:
            r10 = 1
            r5.c(r10)
            java.util.ArrayList r3 = r5.f1653a
            int r7 = r3.size()
            r12 = 0
        L_0x0300:
            if (r12 >= r7) goto L_0x02f2
            java.lang.Object r10 = r3.get(r12)
            androidx.fragment.app.N r10 = (androidx.fragment.app.N) r10
            androidx.fragment.app.r r11 = r10.f1633b
            if (r11 == 0) goto L_0x0330
            androidx.fragment.app.p r13 = r11.f1740M
            if (r13 != 0) goto L_0x0311
            goto L_0x0318
        L_0x0311:
            androidx.fragment.app.p r13 = r11.f()
            r14 = 0
            r13.f1719a = r14
        L_0x0318:
            int r13 = r5.f1657f
            androidx.fragment.app.p r14 = r11.f1740M
            if (r14 != 0) goto L_0x0321
            if (r13 != 0) goto L_0x0321
            goto L_0x0328
        L_0x0321:
            r11.f()
            androidx.fragment.app.p r14 = r11.f1740M
            r14.f1723f = r13
        L_0x0328:
            r11.f()
            androidx.fragment.app.p r13 = r11.f1740M
            r13.getClass()
        L_0x0330:
            int r13 = r10.f1632a
            androidx.fragment.app.H r14 = r5.f1667q
            switch(r13) {
                case 1: goto L_0x03d1;
                case 2: goto L_0x0337;
                case 3: goto L_0x03c0;
                case 4: goto L_0x03ae;
                case 5: goto L_0x0386;
                case 6: goto L_0x0375;
                case 7: goto L_0x035f;
                case 8: goto L_0x035a;
                case 9: goto L_0x0355;
                case 10: goto L_0x034b;
                default: goto L_0x0337;
            }
        L_0x0337:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>(r9)
            int r3 = r10.f1632a
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            r0.<init>(r2)
            throw r0
        L_0x034b:
            androidx.lifecycle.m r10 = r10.i
            r14.U(r11, r10)
        L_0x0350:
            r16 = r3
        L_0x0352:
            r10 = 0
            goto L_0x03e5
        L_0x0355:
            r13 = 0
            r14.V(r13)
            goto L_0x0350
        L_0x035a:
            r13 = 0
            r14.V(r11)
            goto L_0x0350
        L_0x035f:
            r13 = 0
            int r15 = r10.f1635d
            int r13 = r10.e
            r16 = r3
            int r3 = r10.f1636f
            int r10 = r10.f1637g
            r11.H(r15, r13, r3, r10)
            r3 = 0
            r14.T(r11, r3)
            r14.c(r11)
            goto L_0x0352
        L_0x0375:
            r16 = r3
            int r3 = r10.f1635d
            int r13 = r10.e
            int r15 = r10.f1636f
            int r10 = r10.f1637g
            r11.H(r3, r13, r15, r10)
            r14.g(r11)
            goto L_0x0352
        L_0x0386:
            r16 = r3
            int r3 = r10.f1635d
            int r13 = r10.e
            int r15 = r10.f1636f
            int r10 = r10.f1637g
            r11.H(r3, r13, r15, r10)
            r3 = 0
            r14.T(r11, r3)
            r13 = 2
            boolean r10 = android.util.Log.isLoggable(r8, r13)
            if (r10 == 0) goto L_0x03a1
            java.util.Objects.toString(r11)
        L_0x03a1:
            boolean r10 = r11.f1732D
            if (r10 == 0) goto L_0x0352
            r11.f1732D = r3
            boolean r3 = r11.f1741N
            r10 = 1
            r3 = r3 ^ r10
            r11.f1741N = r3
            goto L_0x0352
        L_0x03ae:
            r16 = r3
            r13 = 2
            int r3 = r10.f1635d
            int r15 = r10.e
            int r13 = r10.f1636f
            int r10 = r10.f1637g
            r11.H(r3, r15, r13, r10)
            r14.E(r11)
            goto L_0x0352
        L_0x03c0:
            r16 = r3
            int r3 = r10.f1635d
            int r13 = r10.e
            int r15 = r10.f1636f
            int r10 = r10.f1637g
            r11.H(r3, r13, r15, r10)
            r14.O(r11)
            goto L_0x0352
        L_0x03d1:
            r16 = r3
            int r3 = r10.f1635d
            int r13 = r10.e
            int r15 = r10.f1636f
            int r10 = r10.f1637g
            r11.H(r3, r13, r15, r10)
            r10 = 0
            r14.T(r11, r10)
            r14.a(r11)
        L_0x03e5:
            int r12 = r12 + 1
            r3 = r16
            goto L_0x0300
        L_0x03eb:
            int r0 = r0 + 1
            goto L_0x01d3
        L_0x03ef:
            r6 = r25
            int r0 = r4 + -1
            java.lang.Object r0 = r6.get(r0)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            r5 = r26
        L_0x03ff:
            if (r5 >= r4) goto L_0x044a
            java.lang.Object r7 = r2.get(r5)
            androidx.fragment.app.a r7 = (androidx.fragment.app.C0047a) r7
            if (r0 == 0) goto L_0x0429
            java.util.ArrayList r8 = r7.f1653a
            int r8 = r8.size()
            r9 = 1
            int r8 = r8 - r9
        L_0x0411:
            if (r8 < 0) goto L_0x0447
            java.util.ArrayList r9 = r7.f1653a
            java.lang.Object r9 = r9.get(r8)
            androidx.fragment.app.N r9 = (androidx.fragment.app.N) r9
            androidx.fragment.app.r r9 = r9.f1633b
            if (r9 == 0) goto L_0x0426
            androidx.fragment.app.M r9 = r1.f(r9)
            r9.k()
        L_0x0426:
            int r8 = r8 + -1
            goto L_0x0411
        L_0x0429:
            java.util.ArrayList r7 = r7.f1653a
            java.util.Iterator r7 = r7.iterator()
        L_0x042f:
            boolean r8 = r7.hasNext()
            if (r8 == 0) goto L_0x0447
            java.lang.Object r8 = r7.next()
            androidx.fragment.app.N r8 = (androidx.fragment.app.N) r8
            androidx.fragment.app.r r8 = r8.f1633b
            if (r8 == 0) goto L_0x042f
            androidx.fragment.app.M r8 = r1.f(r8)
            r8.k()
            goto L_0x042f
        L_0x0447:
            int r5 = r5 + 1
            goto L_0x03ff
        L_0x044a:
            int r5 = r1.f1597s
            r7 = 1
            r1.J(r5, r7)
            java.util.HashSet r5 = new java.util.HashSet
            r5.<init>()
            r7 = r26
        L_0x0457:
            if (r7 >= r4) goto L_0x0488
            java.lang.Object r8 = r2.get(r7)
            androidx.fragment.app.a r8 = (androidx.fragment.app.C0047a) r8
            java.util.ArrayList r8 = r8.f1653a
            java.util.Iterator r8 = r8.iterator()
        L_0x0465:
            boolean r9 = r8.hasNext()
            if (r9 == 0) goto L_0x0485
            java.lang.Object r9 = r8.next()
            androidx.fragment.app.N r9 = (androidx.fragment.app.N) r9
            androidx.fragment.app.r r9 = r9.f1633b
            if (r9 == 0) goto L_0x0465
            android.view.ViewGroup r9 = r9.I
            if (r9 == 0) goto L_0x0465
            K0.e r10 = r23.D()
            androidx.fragment.app.i r9 = androidx.fragment.app.C0055i.f(r9, r10)
            r5.add(r9)
            goto L_0x0465
        L_0x0485:
            int r7 = r7 + 1
            goto L_0x0457
        L_0x0488:
            java.util.Iterator r5 = r5.iterator()
        L_0x048c:
            boolean r7 = r5.hasNext()
            if (r7 == 0) goto L_0x04d7
            java.lang.Object r7 = r5.next()
            androidx.fragment.app.i r7 = (androidx.fragment.app.C0055i) r7
            r7.f1699d = r0
            java.util.ArrayList r8 = r7.f1697b
            monitor-enter(r8)
            r7.g()     // Catch:{ all -> 0x04cb }
            r9 = 0
            r7.e = r9     // Catch:{ all -> 0x04cb }
            java.util.ArrayList r10 = r7.f1697b     // Catch:{ all -> 0x04cb }
            int r10 = r10.size()     // Catch:{ all -> 0x04cb }
            int r10 = r10 + -1
        L_0x04ab:
            if (r10 < 0) goto L_0x04d0
            java.util.ArrayList r11 = r7.f1697b     // Catch:{ all -> 0x04cb }
            java.lang.Object r11 = r11.get(r10)     // Catch:{ all -> 0x04cb }
            androidx.fragment.app.S r11 = (androidx.fragment.app.S) r11     // Catch:{ all -> 0x04cb }
            androidx.fragment.app.r r12 = r11.f1648c     // Catch:{ all -> 0x04cb }
            android.view.View r12 = r12.f1737J     // Catch:{ all -> 0x04cb }
            int r12 = Q0.E.c(r12)     // Catch:{ all -> 0x04cb }
            int r13 = r11.f1646a     // Catch:{ all -> 0x04cb }
            r14 = 2
            if (r13 != r14) goto L_0x04cd
            if (r12 == r14) goto L_0x04cd
            androidx.fragment.app.r r10 = r11.f1648c     // Catch:{ all -> 0x04cb }
            androidx.fragment.app.p r10 = r10.f1740M     // Catch:{ all -> 0x04cb }
            r7.e = r9     // Catch:{ all -> 0x04cb }
            goto L_0x04d0
        L_0x04cb:
            r0 = move-exception
            goto L_0x04d5
        L_0x04cd:
            int r10 = r10 + -1
            goto L_0x04ab
        L_0x04d0:
            monitor-exit(r8)     // Catch:{ all -> 0x04cb }
            r7.c()
            goto L_0x048c
        L_0x04d5:
            monitor-exit(r8)     // Catch:{ all -> 0x04cb }
            throw r0
        L_0x04d7:
            r0 = r26
        L_0x04d9:
            if (r0 >= r4) goto L_0x04f9
            java.lang.Object r5 = r2.get(r0)
            androidx.fragment.app.a r5 = (androidx.fragment.app.C0047a) r5
            java.lang.Object r7 = r6.get(r0)
            java.lang.Boolean r7 = (java.lang.Boolean) r7
            boolean r7 = r7.booleanValue()
            if (r7 == 0) goto L_0x04f3
            int r7 = r5.f1669s
            if (r7 < 0) goto L_0x04f3
            r5.f1669s = r3
        L_0x04f3:
            r5.getClass()
            int r0 = r0 + 1
            goto L_0x04d9
        L_0x04f9:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.fragment.app.H.y(java.util.ArrayList, java.util.ArrayList, int, int):void");
    }

    public final r A(String str) {
        k kVar = this.f1583c;
        ArrayList arrayList = (ArrayList) kVar.f23h;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            r rVar = (r) arrayList.get(size);
            if (rVar != null && str.equals(rVar.f1731C)) {
                return rVar;
            }
        }
        for (M m2 : ((HashMap) kVar.f21f).values()) {
            if (m2 != null) {
                r rVar2 = m2.f1630c;
                if (str.equals(rVar2.f1731C)) {
                    return rVar2;
                }
            }
        }
        return null;
    }

    public final ViewGroup B(r rVar) {
        ViewGroup viewGroup = rVar.I;
        if (viewGroup != null) {
            return viewGroup;
        }
        if (rVar.f1730B > 0 && this.f1599u.f()) {
            View e2 = this.f1599u.e(rVar.f1730B);
            if (e2 instanceof ViewGroup) {
                return (ViewGroup) e2;
            }
        }
        return null;
    }

    public final B C() {
        r rVar = this.f1600v;
        if (rVar != null) {
            return rVar.f1768w.C();
        }
        return this.f1602x;
    }

    public final e D() {
        r rVar = this.f1600v;
        if (rVar != null) {
            return rVar.f1768w.D();
        }
        return this.f1603y;
    }

    public final void E(r rVar) {
        if (Log.isLoggable("FragmentManager", 2)) {
            Objects.toString(rVar);
        }
        if (!rVar.f1732D) {
            rVar.f1732D = true;
            rVar.f1741N = true ^ rVar.f1741N;
            W(rVar);
        }
    }

    public final boolean G() {
        r rVar = this.f1600v;
        if (rVar == null) {
            return true;
        }
        if (!rVar.o() || !this.f1600v.j().G()) {
            return false;
        }
        return true;
    }

    public final void J(int i2, boolean z2) {
        HashMap hashMap;
        C0065t tVar;
        if (this.f1598t == null && i2 != -1) {
            throw new IllegalStateException("No activity");
        } else if (z2 || i2 != this.f1597s) {
            this.f1597s = i2;
            k kVar = this.f1583c;
            Iterator it2 = ((ArrayList) kVar.f23h).iterator();
            while (true) {
                boolean hasNext = it2.hasNext();
                hashMap = (HashMap) kVar.f21f;
                if (!hasNext) {
                    break;
                }
                M m2 = (M) hashMap.get(((r) it2.next()).f1755j);
                if (m2 != null) {
                    m2.k();
                }
            }
            for (M m3 : hashMap.values()) {
                if (m3 != null) {
                    m3.k();
                    r rVar = m3.f1630c;
                    if (rVar.f1762q && !rVar.q()) {
                        kVar.l(m3);
                    }
                }
            }
            X();
            if (this.f1572D && (tVar = this.f1598t) != null && this.f1597s == 7) {
                tVar.f1777j.invalidateOptionsMenu();
                this.f1572D = false;
            }
        }
    }

    public final void K() {
        if (this.f1598t != null) {
            this.f1573E = false;
            this.f1574F = false;
            this.f1579L.f1616h = false;
            for (r rVar : this.f1583c.i()) {
                if (rVar != null) {
                    rVar.f1770y.K();
                }
            }
        }
    }

    public final void O(r rVar) {
        if (Log.isLoggable("FragmentManager", 2)) {
            Objects.toString(rVar);
            int i2 = rVar.f1767v;
        }
        boolean q2 = rVar.q();
        if (!rVar.f1733E || !q2) {
            k kVar = this.f1583c;
            synchronized (((ArrayList) kVar.f23h)) {
                ((ArrayList) kVar.f23h).remove(rVar);
            }
            rVar.f1761p = false;
            if (F(rVar)) {
                this.f1572D = true;
            }
            rVar.f1762q = true;
            W(rVar);
        }
    }

    /* JADX WARNING: type inference failed for: r13v1, types: [androidx.fragment.app.N, java.lang.Object] */
    public final void Q(Parcelable parcelable) {
        j jVar;
        boolean z2;
        M m2;
        Bundle bundle;
        Bundle bundle2;
        Bundle bundle3 = (Bundle) parcelable;
        for (String next : bundle3.keySet()) {
            if (next.startsWith("result_") && (bundle2 = bundle3.getBundle(next)) != null) {
                bundle2.setClassLoader(this.f1598t.f1775g.getClassLoader());
                this.f1589k.put(next.substring(7), bundle2);
            }
        }
        ArrayList arrayList = new ArrayList();
        for (String next2 : bundle3.keySet()) {
            if (next2.startsWith("fragment_") && (bundle = bundle3.getBundle(next2)) != null) {
                bundle.setClassLoader(this.f1598t.f1775g.getClassLoader());
                arrayList.add((L) bundle.getParcelable("state"));
            }
        }
        k kVar = this.f1583c;
        HashMap hashMap = (HashMap) kVar.f22g;
        hashMap.clear();
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            L l2 = (L) it2.next();
            hashMap.put(l2.f1618b, l2);
        }
        I i2 = (I) bundle3.getParcelable("state");
        if (i2 != null) {
            HashMap hashMap2 = (HashMap) kVar.f21f;
            hashMap2.clear();
            Iterator it3 = i2.f1605a.iterator();
            while (true) {
                boolean hasNext = it3.hasNext();
                jVar = this.f1590l;
                if (!hasNext) {
                    break;
                }
                L l3 = (L) ((HashMap) kVar.f22g).remove((String) it3.next());
                if (l3 != null) {
                    r rVar = (r) this.f1579L.f1612c.get(l3.f1618b);
                    if (rVar != null) {
                        if (Log.isLoggable("FragmentManager", 2)) {
                            rVar.toString();
                        }
                        m2 = new M(jVar, kVar, rVar, l3);
                    } else {
                        m2 = new M(this.f1590l, this.f1583c, this.f1598t.f1775g.getClassLoader(), C(), l3);
                    }
                    r rVar2 = m2.f1630c;
                    rVar2.f1768w = this;
                    if (Log.isLoggable("FragmentManager", 2)) {
                        rVar2.toString();
                    }
                    m2.m(this.f1598t.f1775g.getClassLoader());
                    kVar.k(m2);
                    m2.e = this.f1597s;
                }
            }
            J j2 = this.f1579L;
            j2.getClass();
            Iterator it4 = new ArrayList(j2.f1612c.values()).iterator();
            while (it4.hasNext()) {
                r rVar3 = (r) it4.next();
                if (hashMap2.get(rVar3.f1755j) == null) {
                    if (Log.isLoggable("FragmentManager", 2)) {
                        rVar3.toString();
                        Objects.toString(i2.f1605a);
                    }
                    this.f1579L.d(rVar3);
                    rVar3.f1768w = this;
                    M m3 = new M(jVar, kVar, rVar3);
                    m3.e = 1;
                    m3.k();
                    rVar3.f1762q = true;
                    m3.k();
                }
            }
            ArrayList<String> arrayList2 = i2.f1606b;
            ((ArrayList) kVar.f23h).clear();
            if (arrayList2 != null) {
                for (String str : arrayList2) {
                    r d2 = kVar.d(str);
                    if (d2 != null) {
                        if (Log.isLoggable("FragmentManager", 2)) {
                            d2.toString();
                        }
                        kVar.a(d2);
                    } else {
                        throw new IllegalStateException(E.g("No instantiated fragment for (", str, ")"));
                    }
                }
            }
            if (i2.f1607c != null) {
                this.f1584d = new ArrayList(i2.f1607c.length);
                int i3 = 0;
                while (true) {
                    C0048b[] bVarArr = i2.f1607c;
                    if (i3 >= bVarArr.length) {
                        break;
                    }
                    C0048b bVar = bVarArr[i3];
                    bVar.getClass();
                    C0047a aVar = new C0047a(this);
                    int i4 = 0;
                    int i5 = 0;
                    while (true) {
                        int[] iArr = bVar.f1670a;
                        if (i4 >= iArr.length) {
                            break;
                        }
                        ? obj = new Object();
                        int i6 = i4 + 1;
                        obj.f1632a = iArr[i4];
                        if (Log.isLoggable("FragmentManager", 2)) {
                            Objects.toString(aVar);
                            int i7 = iArr[i6];
                        }
                        obj.f1638h = C0078m.values()[bVar.f1672c[i5]];
                        obj.i = C0078m.values()[bVar.f1673d[i5]];
                        int i8 = i4 + 2;
                        if (iArr[i6] != 0) {
                            z2 = true;
                        } else {
                            z2 = false;
                        }
                        obj.f1634c = z2;
                        int i9 = iArr[i8];
                        obj.f1635d = i9;
                        int i10 = iArr[i4 + 3];
                        obj.e = i10;
                        int i11 = i4 + 5;
                        int i12 = iArr[i4 + 4];
                        obj.f1636f = i12;
                        i4 += 6;
                        int i13 = iArr[i11];
                        obj.f1637g = i13;
                        aVar.f1654b = i9;
                        aVar.f1655c = i10;
                        aVar.f1656d = i12;
                        aVar.e = i13;
                        aVar.b(obj);
                        i5++;
                    }
                    aVar.f1657f = bVar.e;
                    aVar.i = bVar.f1674f;
                    aVar.f1658g = true;
                    aVar.f1660j = bVar.f1676h;
                    aVar.f1661k = bVar.i;
                    aVar.f1662l = bVar.f1677j;
                    aVar.f1663m = bVar.f1678k;
                    aVar.f1664n = bVar.f1679l;
                    aVar.f1665o = bVar.f1680m;
                    aVar.f1666p = bVar.f1681n;
                    aVar.f1669s = bVar.f1675g;
                    int i14 = 0;
                    while (true) {
                        ArrayList arrayList3 = bVar.f1671b;
                        if (i14 >= arrayList3.size()) {
                            break;
                        }
                        String str2 = (String) arrayList3.get(i14);
                        if (str2 != null) {
                            ((N) aVar.f1653a.get(i14)).f1633b = kVar.d(str2);
                        }
                        i14++;
                    }
                    aVar.c(1);
                    if (Log.isLoggable("FragmentManager", 2)) {
                        aVar.toString();
                        PrintWriter printWriter = new PrintWriter(new P());
                        aVar.f("  ", printWriter, false);
                        printWriter.close();
                    }
                    this.f1584d.add(aVar);
                    i3++;
                }
            } else {
                this.f1584d = null;
            }
            this.i.set(i2.f1608d);
            String str3 = i2.e;
            if (str3 != null) {
                r d3 = kVar.d(str3);
                this.f1601w = d3;
                q(d3);
            }
            ArrayList arrayList4 = i2.f1609f;
            if (arrayList4 != null) {
                for (int i15 = 0; i15 < arrayList4.size(); i15++) {
                    this.f1588j.put((String) arrayList4.get(i15), (C0049c) i2.f1610g.get(i15));
                }
            }
            this.f1571C = new ArrayDeque(i2.f1611h);
        }
    }

    /* JADX WARNING: type inference failed for: r1v17, types: [android.os.Parcelable, java.lang.Object, androidx.fragment.app.I] */
    public final Bundle R() {
        int i2;
        ArrayList arrayList;
        C0048b[] bVarArr;
        int size;
        Bundle bundle = new Bundle();
        Iterator it2 = e().iterator();
        while (true) {
            if (!it2.hasNext()) {
                break;
            }
            C0055i iVar = (C0055i) it2.next();
            if (iVar.e) {
                Log.isLoggable("FragmentManager", 2);
                iVar.e = false;
                iVar.c();
            }
        }
        Iterator it3 = e().iterator();
        while (it3.hasNext()) {
            ((C0055i) it3.next()).e();
        }
        x(true);
        this.f1573E = true;
        this.f1579L.f1616h = true;
        k kVar = this.f1583c;
        kVar.getClass();
        HashMap hashMap = (HashMap) kVar.f21f;
        ArrayList arrayList2 = new ArrayList(hashMap.size());
        Iterator it4 = hashMap.values().iterator();
        while (true) {
            Bundle bundle2 = null;
            if (!it4.hasNext()) {
                break;
            }
            M m2 = (M) it4.next();
            if (m2 != null) {
                r rVar = m2.f1630c;
                L l2 = new L(rVar);
                if (rVar.f1752f <= -1 || l2.f1627m != null) {
                    l2.f1627m = rVar.f1753g;
                } else {
                    Bundle bundle3 = new Bundle();
                    rVar.y(bundle3);
                    rVar.f1749V.c(bundle3);
                    bundle3.putParcelable("android:support:fragments", rVar.f1770y.R());
                    m2.f1628a.p(false);
                    if (!bundle3.isEmpty()) {
                        bundle2 = bundle3;
                    }
                    if (rVar.f1737J != null) {
                        m2.o();
                    }
                    if (rVar.f1754h != null) {
                        if (bundle2 == null) {
                            bundle2 = new Bundle();
                        }
                        bundle2.putSparseParcelableArray("android:view_state", rVar.f1754h);
                    }
                    if (rVar.i != null) {
                        if (bundle2 == null) {
                            bundle2 = new Bundle();
                        }
                        bundle2.putBundle("android:view_registry_state", rVar.i);
                    }
                    if (!rVar.f1739L) {
                        if (bundle2 == null) {
                            bundle2 = new Bundle();
                        }
                        bundle2.putBoolean("android:user_visible_hint", rVar.f1739L);
                    }
                    l2.f1627m = bundle2;
                    if (rVar.f1758m != null) {
                        if (bundle2 == null) {
                            l2.f1627m = new Bundle();
                        }
                        l2.f1627m.putString("android:target_state", rVar.f1758m);
                        int i3 = rVar.f1759n;
                        if (i3 != 0) {
                            l2.f1627m.putInt("android:target_req_state", i3);
                        }
                    }
                }
                L l3 = (L) ((HashMap) m2.f1629b.f22g).put(rVar.f1755j, l2);
                r rVar2 = m2.f1630c;
                arrayList2.add(rVar2.f1755j);
                if (Log.isLoggable("FragmentManager", 2)) {
                    rVar2.toString();
                    Objects.toString(rVar2.f1753g);
                }
            }
        }
        k kVar2 = this.f1583c;
        kVar2.getClass();
        ArrayList arrayList3 = new ArrayList(((HashMap) kVar2.f22g).values());
        if (arrayList3.isEmpty()) {
            Log.isLoggable("FragmentManager", 2);
        } else {
            k kVar3 = this.f1583c;
            synchronized (((ArrayList) kVar3.f23h)) {
                try {
                    if (((ArrayList) kVar3.f23h).isEmpty()) {
                        arrayList = null;
                    } else {
                        arrayList = new ArrayList(((ArrayList) kVar3.f23h).size());
                        Iterator it5 = ((ArrayList) kVar3.f23h).iterator();
                        while (it5.hasNext()) {
                            r rVar3 = (r) it5.next();
                            arrayList.add(rVar3.f1755j);
                            if (Log.isLoggable("FragmentManager", 2)) {
                                rVar3.toString();
                            }
                        }
                    }
                } finally {
                    while (true) {
                    }
                }
            }
            ArrayList arrayList4 = this.f1584d;
            if (arrayList4 == null || (size = arrayList4.size()) <= 0) {
                bVarArr = null;
            } else {
                bVarArr = new C0048b[size];
                for (i2 = 0; i2 < size; i2++) {
                    bVarArr[i2] = new C0048b((C0047a) this.f1584d.get(i2));
                    if (Log.isLoggable("FragmentManager", 2)) {
                        Objects.toString(this.f1584d.get(i2));
                    }
                }
            }
            ? obj = new Object();
            obj.e = null;
            ArrayList arrayList5 = new ArrayList();
            obj.f1609f = arrayList5;
            ArrayList arrayList6 = new ArrayList();
            obj.f1610g = arrayList6;
            obj.f1605a = arrayList2;
            obj.f1606b = arrayList;
            obj.f1607c = bVarArr;
            obj.f1608d = this.i.get();
            r rVar4 = this.f1601w;
            if (rVar4 != null) {
                obj.e = rVar4.f1755j;
            }
            arrayList5.addAll(this.f1588j.keySet());
            arrayList6.addAll(this.f1588j.values());
            obj.f1611h = new ArrayList(this.f1571C);
            bundle.putParcelable("state", obj);
            for (String str : this.f1589k.keySet()) {
                bundle.putBundle("result_" + str, (Bundle) this.f1589k.get(str));
            }
            Iterator it6 = arrayList3.iterator();
            while (it6.hasNext()) {
                L l4 = (L) it6.next();
                Bundle bundle4 = new Bundle();
                bundle4.putParcelable("state", l4);
                bundle.putBundle("fragment_" + l4.f1618b, bundle4);
            }
        }
        return bundle;
    }

    public final void S() {
        synchronized (this.f1581a) {
            try {
                if (this.f1581a.size() == 1) {
                    this.f1598t.f1776h.removeCallbacks(this.f1580M);
                    this.f1598t.f1776h.post(this.f1580M);
                    Z();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void U(r rVar, C0078m mVar) {
        if (!rVar.equals(this.f1583c.d(rVar.f1755j)) || !(rVar.f1769x == null || rVar.f1768w == this)) {
            throw new IllegalArgumentException("Fragment " + rVar + " is not an active fragment of FragmentManager " + this);
        }
        rVar.f1745R = mVar;
    }

    public final void V(r rVar) {
        if (rVar != null) {
            if (!rVar.equals(this.f1583c.d(rVar.f1755j)) || !(rVar.f1769x == null || rVar.f1768w == this)) {
                throw new IllegalArgumentException("Fragment " + rVar + " is not an active fragment of FragmentManager " + this);
            }
        }
        r rVar2 = this.f1601w;
        this.f1601w = rVar;
        q(rVar2);
        q(this.f1601w);
    }

    public final void X() {
        Iterator it2 = this.f1583c.g().iterator();
        while (it2.hasNext()) {
            M m2 = (M) it2.next();
            r rVar = m2.f1630c;
            if (rVar.f1738K) {
                if (this.f1582b) {
                    this.f1576H = true;
                } else {
                    rVar.f1738K = false;
                    m2.k();
                }
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x001c, code lost:
        r0 = r4.f1587h;
        r1 = r4.f1584d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0021, code lost:
        if (r1 == null) goto L_0x0028;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0023, code lost:
        r1 = r1.size();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0028, code lost:
        r1 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0029, code lost:
        if (r1 <= 0) goto L_0x0034;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0031, code lost:
        if (I(r4.f1600v) == false) goto L_0x0034;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0034, code lost:
        r2 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0035, code lost:
        r0.f861a = r2;
        r0 = r0.f863c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0039, code lost:
        if (r0 == null) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x003b, code lost:
        r0.a();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0018, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void Z() {
        /*
            r4 = this;
            java.util.ArrayList r0 = r4.f1581a
            monitor-enter(r0)
            java.util.ArrayList r1 = r4.f1581a     // Catch:{ all -> 0x0019 }
            boolean r1 = r1.isEmpty()     // Catch:{ all -> 0x0019 }
            r2 = 1
            if (r1 != 0) goto L_0x001b
            R0.h r1 = r4.f1587h     // Catch:{ all -> 0x0019 }
            r1.f861a = r2     // Catch:{ all -> 0x0019 }
            androidx.activity.z r1 = r1.f863c     // Catch:{ all -> 0x0019 }
            if (r1 == 0) goto L_0x0017
            r1.a()     // Catch:{ all -> 0x0019 }
        L_0x0017:
            monitor-exit(r0)     // Catch:{ all -> 0x0019 }
            return
        L_0x0019:
            r1 = move-exception
            goto L_0x003f
        L_0x001b:
            monitor-exit(r0)     // Catch:{ all -> 0x0019 }
            R0.h r0 = r4.f1587h
            java.util.ArrayList r1 = r4.f1584d
            r3 = 0
            if (r1 == 0) goto L_0x0028
            int r1 = r1.size()
            goto L_0x0029
        L_0x0028:
            r1 = 0
        L_0x0029:
            if (r1 <= 0) goto L_0x0034
            androidx.fragment.app.r r1 = r4.f1600v
            boolean r1 = I(r1)
            if (r1 == 0) goto L_0x0034
            goto L_0x0035
        L_0x0034:
            r2 = 0
        L_0x0035:
            r0.f861a = r2
            androidx.activity.z r0 = r0.f863c
            if (r0 == 0) goto L_0x003e
            r0.a()
        L_0x003e:
            return
        L_0x003f:
            monitor-exit(r0)     // Catch:{ all -> 0x0019 }
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.fragment.app.H.Z():void");
    }

    public final M a(r rVar) {
        String str = rVar.f1744Q;
        if (str != null) {
            d.c(rVar, str);
        }
        if (Log.isLoggable("FragmentManager", 2)) {
            rVar.toString();
        }
        M f2 = f(rVar);
        rVar.f1768w = this;
        k kVar = this.f1583c;
        kVar.k(f2);
        if (!rVar.f1733E) {
            kVar.a(rVar);
            rVar.f1762q = false;
            if (rVar.f1737J == null) {
                rVar.f1741N = false;
            }
            if (F(rVar)) {
                this.f1572D = true;
            }
        }
        return f2;
    }

    /* JADX WARNING: type inference failed for: r7v0, types: [androidx.fragment.app.r] */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void b(androidx.fragment.app.C0065t r5, androidx.fragment.app.v r6, androidx.fragment.app.r r7) {
        /*
            r4 = this;
            androidx.fragment.app.t r0 = r4.f1598t
            if (r0 != 0) goto L_0x01b4
            r4.f1598t = r5
            r4.f1599u = r6
            r4.f1600v = r7
            java.util.concurrent.CopyOnWriteArrayList r6 = r4.f1591m
            if (r7 == 0) goto L_0x0017
            androidx.fragment.app.C r0 = new androidx.fragment.app.C
            r0.<init>(r7)
            r6.add(r0)
            goto L_0x001e
        L_0x0017:
            boolean r0 = r5 instanceof androidx.fragment.app.K
            if (r0 == 0) goto L_0x001e
            r6.add(r5)
        L_0x001e:
            androidx.fragment.app.r r6 = r4.f1600v
            if (r6 == 0) goto L_0x0025
            r4.Z()
        L_0x0025:
            boolean r6 = r5 instanceof androidx.activity.B
            if (r6 == 0) goto L_0x003b
            h.l r6 = r5.f1777j
            androidx.activity.A r6 = r6.i()
            r4.f1586g = r6
            if (r7 == 0) goto L_0x0035
            r0 = r7
            goto L_0x0036
        L_0x0035:
            r0 = r5
        L_0x0036:
            R0.h r1 = r4.f1587h
            r6.a(r0, r1)
        L_0x003b:
            r6 = 0
            if (r7 == 0) goto L_0x005d
            androidx.fragment.app.H r5 = r7.f1768w
            androidx.fragment.app.J r5 = r5.f1579L
            java.util.HashMap r0 = r5.f1613d
            java.lang.String r1 = r7.f1755j
            java.lang.Object r1 = r0.get(r1)
            androidx.fragment.app.J r1 = (androidx.fragment.app.J) r1
            if (r1 != 0) goto L_0x005a
            androidx.fragment.app.J r1 = new androidx.fragment.app.J
            boolean r5 = r5.f1614f
            r1.<init>(r5)
            java.lang.String r5 = r7.f1755j
            r0.put(r5, r1)
        L_0x005a:
            r4.f1579L = r1
            goto L_0x0094
        L_0x005d:
            boolean r0 = r5 instanceof androidx.lifecycle.Q
            if (r0 == 0) goto L_0x008d
            h.l r5 = r5.f1777j
            androidx.lifecycle.P r5 = r5.c()
            android.support.v4.media.session.t r0 = new android.support.v4.media.session.t
            K0.e r1 = androidx.fragment.app.J.i
            r0.<init>((androidx.lifecycle.P) r5, (androidx.lifecycle.O) r1)
            java.lang.Class<androidx.fragment.app.J> r5 = androidx.fragment.app.J.class
            java.lang.String r1 = r5.getCanonicalName()
            if (r1 == 0) goto L_0x0085
            java.lang.String r2 = "androidx.lifecycle.ViewModelProvider.DefaultKey:"
            java.lang.String r1 = r2.concat(r1)
            androidx.lifecycle.M r5 = r0.k(r1, r5)
            androidx.fragment.app.J r5 = (androidx.fragment.app.J) r5
            r4.f1579L = r5
            goto L_0x0094
        L_0x0085:
            java.lang.IllegalArgumentException r5 = new java.lang.IllegalArgumentException
            java.lang.String r6 = "Local and anonymous classes can not be ViewModels"
            r5.<init>(r6)
            throw r5
        L_0x008d:
            androidx.fragment.app.J r5 = new androidx.fragment.app.J
            r5.<init>(r6)
            r4.f1579L = r5
        L_0x0094:
            androidx.fragment.app.J r5 = r4.f1579L
            boolean r0 = r4.f1573E
            if (r0 != 0) goto L_0x009e
            boolean r0 = r4.f1574F
            if (r0 == 0) goto L_0x009f
        L_0x009e:
            r6 = 1
        L_0x009f:
            r5.f1616h = r6
            A.k r6 = r4.f1583c
            r6.i = r5
            androidx.fragment.app.t r5 = r4.f1598t
            boolean r6 = r5 instanceof k0.C0170e
            if (r6 == 0) goto L_0x00c5
            if (r7 != 0) goto L_0x00c5
            k0.c r5 = r5.b()
            androidx.activity.f r6 = new androidx.activity.f
            r0 = 2
            r6.<init>(r0, r4)
            java.lang.String r0 = "android:support:fragments"
            r5.e(r0, r6)
            android.os.Bundle r5 = r5.c(r0)
            if (r5 == 0) goto L_0x00c5
            r4.Q(r5)
        L_0x00c5:
            androidx.fragment.app.t r5 = r4.f1598t
            boolean r6 = r5 instanceof d.C0091d
            if (r6 == 0) goto L_0x013d
            h.l r5 = r5.f1777j
            if (r7 == 0) goto L_0x00e3
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.lang.String r0 = r7.f1755j
            r6.append(r0)
            java.lang.String r0 = ":"
            r6.append(r0)
            java.lang.String r6 = r6.toString()
            goto L_0x00e5
        L_0x00e3:
            java.lang.String r6 = ""
        L_0x00e5:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "FragmentManager:"
            r0.<init>(r1)
            r0.append(r6)
            java.lang.String r6 = r0.toString()
            java.lang.String r0 = "StartActivityForResult"
            java.lang.String r0 = Q0.E.f(r6, r0)
            androidx.fragment.app.D r1 = new androidx.fragment.app.D
            r2 = 2
            r1.<init>(r2)
            androidx.fragment.app.z r2 = new androidx.fragment.app.z
            r3 = 1
            r2.<init>(r4, r3)
            androidx.activity.l r5 = r5.f1180m
            E.j r0 = r5.b(r0, r1, r2)
            r4.f1604z = r0
            java.lang.String r0 = "StartIntentSenderForResult"
            java.lang.String r0 = Q0.E.f(r6, r0)
            androidx.fragment.app.D r1 = new androidx.fragment.app.D
            r2 = 0
            r1.<init>(r2)
            androidx.fragment.app.z r2 = new androidx.fragment.app.z
            r3 = 2
            r2.<init>(r4, r3)
            E.j r0 = r5.b(r0, r1, r2)
            r4.f1569A = r0
            java.lang.String r0 = "RequestPermissions"
            java.lang.String r6 = Q0.E.f(r6, r0)
            androidx.fragment.app.D r0 = new androidx.fragment.app.D
            r1 = 1
            r0.<init>(r1)
            androidx.fragment.app.z r1 = new androidx.fragment.app.z
            r2 = 0
            r1.<init>(r4, r2)
            E.j r5 = r5.b(r6, r0, r1)
            r4.f1570B = r5
        L_0x013d:
            androidx.fragment.app.t r5 = r4.f1598t
            boolean r6 = r5 instanceof D.f
            if (r6 == 0) goto L_0x014a
            h.l r5 = r5.f1777j
            androidx.fragment.app.y r6 = r4.f1592n
            r5.g(r6)
        L_0x014a:
            androidx.fragment.app.t r5 = r4.f1598t
            boolean r6 = r5 instanceof D.g
            if (r6 == 0) goto L_0x0161
            h.l r5 = r5.f1777j
            androidx.fragment.app.y r6 = r4.f1593o
            r5.getClass()
            java.lang.String r0 = "listener"
            Z0.c.e(r0, r6)
            java.util.concurrent.CopyOnWriteArrayList r5 = r5.f1182o
            r5.add(r6)
        L_0x0161:
            androidx.fragment.app.t r5 = r4.f1598t
            boolean r6 = r5 instanceof C.t
            if (r6 == 0) goto L_0x0178
            h.l r5 = r5.f1777j
            androidx.fragment.app.y r6 = r4.f1594p
            r5.getClass()
            java.lang.String r0 = "listener"
            Z0.c.e(r0, r6)
            java.util.concurrent.CopyOnWriteArrayList r5 = r5.f1184q
            r5.add(r6)
        L_0x0178:
            androidx.fragment.app.t r5 = r4.f1598t
            boolean r6 = r5 instanceof C.u
            if (r6 == 0) goto L_0x018f
            h.l r5 = r5.f1777j
            androidx.fragment.app.y r6 = r4.f1595q
            r5.getClass()
            java.lang.String r0 = "listener"
            Z0.c.e(r0, r6)
            java.util.concurrent.CopyOnWriteArrayList r5 = r5.f1185r
            r5.add(r6)
        L_0x018f:
            androidx.fragment.app.t r5 = r4.f1598t
            boolean r6 = r5 instanceof N.C0012l
            if (r6 == 0) goto L_0x01b3
            if (r7 != 0) goto L_0x01b3
            h.l r5 = r5.f1777j
            androidx.fragment.app.A r6 = r4.f1596r
            r5.getClass()
            java.lang.String r7 = "provider"
            Z0.c.e(r7, r6)
            android.support.v4.media.session.t r5 = r5.f1176h
            java.lang.Object r7 = r5.f1132c
            java.util.concurrent.CopyOnWriteArrayList r7 = (java.util.concurrent.CopyOnWriteArrayList) r7
            r7.add(r6)
            java.lang.Object r5 = r5.f1131b
            java.lang.Runnable r5 = (java.lang.Runnable) r5
            r5.run()
        L_0x01b3:
            return
        L_0x01b4:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "Already attached"
            r5.<init>(r6)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.fragment.app.H.b(androidx.fragment.app.t, androidx.fragment.app.v, androidx.fragment.app.r):void");
    }

    public final void c(r rVar) {
        if (Log.isLoggable("FragmentManager", 2)) {
            Objects.toString(rVar);
        }
        if (rVar.f1733E) {
            rVar.f1733E = false;
            if (!rVar.f1761p) {
                this.f1583c.a(rVar);
                if (Log.isLoggable("FragmentManager", 2)) {
                    rVar.toString();
                }
                if (F(rVar)) {
                    this.f1572D = true;
                }
            }
        }
    }

    public final HashSet e() {
        HashSet hashSet = new HashSet();
        Iterator it2 = this.f1583c.g().iterator();
        while (it2.hasNext()) {
            ViewGroup viewGroup = ((M) it2.next()).f1630c.I;
            if (viewGroup != null) {
                hashSet.add(C0055i.f(viewGroup, D()));
            }
        }
        return hashSet;
    }

    public final M f(r rVar) {
        String str = rVar.f1755j;
        k kVar = this.f1583c;
        M m2 = (M) ((HashMap) kVar.f21f).get(str);
        if (m2 != null) {
            return m2;
        }
        M m3 = new M(this.f1590l, kVar, rVar);
        m3.m(this.f1598t.f1775g.getClassLoader());
        m3.e = this.f1597s;
        return m3;
    }

    public final void g(r rVar) {
        if (Log.isLoggable("FragmentManager", 2)) {
            Objects.toString(rVar);
        }
        if (!rVar.f1733E) {
            rVar.f1733E = true;
            if (rVar.f1761p) {
                if (Log.isLoggable("FragmentManager", 2)) {
                    rVar.toString();
                }
                k kVar = this.f1583c;
                synchronized (((ArrayList) kVar.f23h)) {
                    ((ArrayList) kVar.f23h).remove(rVar);
                }
                rVar.f1761p = false;
                if (F(rVar)) {
                    this.f1572D = true;
                }
                W(rVar);
            }
        }
    }

    public final void h(boolean z2) {
        if (!z2 || !(this.f1598t instanceof f)) {
            for (r rVar : this.f1583c.i()) {
                if (rVar != null) {
                    rVar.f1736H = true;
                    if (z2) {
                        rVar.f1770y.h(true);
                    }
                }
            }
            return;
        }
        Y(new IllegalStateException("Do not call dispatchConfigurationChanged() on host. Host implements OnConfigurationChangedProvider and automatically dispatches configuration changes to fragments."));
        throw null;
    }

    public final boolean i() {
        boolean z2;
        if (this.f1597s < 1) {
            return false;
        }
        for (r rVar : this.f1583c.i()) {
            if (rVar != null) {
                if (!rVar.f1732D) {
                    z2 = rVar.f1770y.i();
                } else {
                    z2 = false;
                }
                if (z2) {
                    return true;
                }
            }
        }
        return false;
    }

    public final boolean j() {
        boolean z2;
        if (this.f1597s < 1) {
            return false;
        }
        ArrayList arrayList = null;
        boolean z3 = false;
        for (r rVar : this.f1583c.i()) {
            if (rVar != null && H(rVar)) {
                if (!rVar.f1732D) {
                    z2 = rVar.f1770y.j();
                } else {
                    z2 = false;
                }
                if (z2) {
                    if (arrayList == null) {
                        arrayList = new ArrayList();
                    }
                    arrayList.add(rVar);
                    z3 = true;
                }
            }
        }
        if (this.e != null) {
            for (int i2 = 0; i2 < this.e.size(); i2++) {
                r rVar2 = (r) this.e.get(i2);
                if (arrayList == null || !arrayList.contains(rVar2)) {
                    rVar2.getClass();
                }
            }
        }
        this.e = arrayList;
        return z3;
    }

    public final void l(boolean z2) {
        if (!z2 || !(this.f1598t instanceof g)) {
            for (r rVar : this.f1583c.i()) {
                if (rVar != null) {
                    rVar.f1736H = true;
                    if (z2) {
                        rVar.f1770y.l(true);
                    }
                }
            }
            return;
        }
        Y(new IllegalStateException("Do not call dispatchLowMemory() on host. Host implements OnTrimMemoryProvider and automatically dispatches low memory callbacks to fragments."));
        throw null;
    }

    public final void m(boolean z2, boolean z3) {
        if (!z3 || !(this.f1598t instanceof t)) {
            for (r rVar : this.f1583c.i()) {
                if (rVar != null && z3) {
                    rVar.f1770y.m(z2, true);
                }
            }
            return;
        }
        Y(new IllegalStateException("Do not call dispatchMultiWindowModeChanged() on host. Host implements OnMultiWindowModeChangedProvider and automatically dispatches multi-window mode changes to fragments."));
        throw null;
    }

    public final void n() {
        Iterator it2 = this.f1583c.h().iterator();
        while (it2.hasNext()) {
            r rVar = (r) it2.next();
            if (rVar != null) {
                rVar.p();
                rVar.f1770y.n();
            }
        }
    }

    public final boolean o() {
        boolean z2;
        if (this.f1597s < 1) {
            return false;
        }
        for (r rVar : this.f1583c.i()) {
            if (rVar != null) {
                if (!rVar.f1732D) {
                    z2 = rVar.f1770y.o();
                } else {
                    z2 = false;
                }
                if (z2) {
                    return true;
                }
            }
        }
        return false;
    }

    public final void p() {
        if (this.f1597s >= 1) {
            for (r rVar : this.f1583c.i()) {
                if (rVar != null && !rVar.f1732D) {
                    rVar.f1770y.p();
                }
            }
        }
    }

    public final void q(r rVar) {
        if (rVar != null) {
            if (rVar.equals(this.f1583c.d(rVar.f1755j))) {
                rVar.f1768w.getClass();
                boolean I2 = I(rVar);
                Boolean bool = rVar.f1760o;
                if (bool == null || bool.booleanValue() != I2) {
                    rVar.f1760o = Boolean.valueOf(I2);
                    H h2 = rVar.f1770y;
                    h2.Z();
                    h2.q(h2.f1601w);
                }
            }
        }
    }

    public final void r(boolean z2, boolean z3) {
        if (!z3 || !(this.f1598t instanceof u)) {
            for (r rVar : this.f1583c.i()) {
                if (rVar != null && z3) {
                    rVar.f1770y.r(z2, true);
                }
            }
            return;
        }
        Y(new IllegalStateException("Do not call dispatchPictureInPictureModeChanged() on host. Host implements OnPictureInPictureModeChangedProvider and automatically dispatches picture-in-picture mode changes to fragments."));
        throw null;
    }

    public final boolean s() {
        boolean z2;
        if (this.f1597s < 1) {
            return false;
        }
        boolean z3 = false;
        for (r rVar : this.f1583c.i()) {
            if (rVar != null && H(rVar)) {
                if (!rVar.f1732D) {
                    z2 = rVar.f1770y.s();
                } else {
                    z2 = false;
                }
                if (z2) {
                    z3 = true;
                }
            }
        }
        return z3;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(128);
        sb.append("FragmentManager{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append(" in ");
        r rVar = this.f1600v;
        if (rVar != null) {
            sb.append(rVar.getClass().getSimpleName());
            sb.append("{");
            sb.append(Integer.toHexString(System.identityHashCode(this.f1600v)));
            sb.append("}");
        } else {
            C0065t tVar = this.f1598t;
            if (tVar != null) {
                sb.append(tVar.getClass().getSimpleName());
                sb.append("{");
                sb.append(Integer.toHexString(System.identityHashCode(this.f1598t)));
                sb.append("}");
            } else {
                sb.append("null");
            }
        }
        sb.append("}}");
        return sb.toString();
    }

    public final void v(F f2, boolean z2) {
        if (!z2) {
            if (this.f1598t == null) {
                if (this.f1575G) {
                    throw new IllegalStateException("FragmentManager has been destroyed");
                }
                throw new IllegalStateException("FragmentManager has not been attached to a host.");
            } else if (this.f1573E || this.f1574F) {
                throw new IllegalStateException("Can not perform this action after onSaveInstanceState");
            }
        }
        synchronized (this.f1581a) {
            try {
                if (this.f1598t != null) {
                    this.f1581a.add(f2);
                    S();
                } else if (!z2) {
                    throw new IllegalStateException("Activity has been destroyed");
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void w(boolean z2) {
        if (this.f1582b) {
            throw new IllegalStateException("FragmentManager is already executing transactions");
        } else if (this.f1598t == null) {
            if (this.f1575G) {
                throw new IllegalStateException("FragmentManager has been destroyed");
            }
            throw new IllegalStateException("FragmentManager has not been attached to a host.");
        } else if (Looper.myLooper() != this.f1598t.f1776h.getLooper()) {
            throw new IllegalStateException("Must be called from main thread of fragment host");
        } else if (!z2 && (this.f1573E || this.f1574F)) {
            throw new IllegalStateException("Can not perform this action after onSaveInstanceState");
        } else if (this.I == null) {
            this.I = new ArrayList();
            this.f1577J = new ArrayList();
        }
    }

    public final r z(int i2) {
        k kVar = this.f1583c;
        ArrayList arrayList = (ArrayList) kVar.f23h;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            r rVar = (r) arrayList.get(size);
            if (rVar != null && rVar.f1729A == i2) {
                return rVar;
            }
        }
        for (M m2 : ((HashMap) kVar.f21f).values()) {
            if (m2 != null) {
                r rVar2 = m2.f1630c;
                if (rVar2.f1729A == i2) {
                    return rVar2;
                }
            }
        }
        return null;
    }

    public H() {
        Collections.synchronizedMap(new HashMap());
        this.f1590l = new j(this);
        this.f1591m = new CopyOnWriteArrayList();
        this.f1592n = new y(this, 0);
        this.f1593o = new y(this, 1);
        this.f1594p = new y(this, 2);
        this.f1595q = new y(this, 3);
        this.f1596r = new A(this);
        this.f1597s = -1;
        this.f1602x = new B(this);
        this.f1603y = new e(14);
        this.f1571C = new ArrayDeque();
        this.f1580M = new B(6, this);
    }

    public static boolean F(r rVar) {
        rVar.getClass();
        Iterator it2 = rVar.f1770y.f1583c.h().iterator();
        boolean z2 = false;
        while (it2.hasNext()) {
            r rVar2 = (r) it2.next();
            if (rVar2 != null) {
                z2 = F(rVar2);
                continue;
            }
            if (z2) {
                return true;
            }
        }
        return false;
    }

    public final void P(ArrayList arrayList, ArrayList arrayList2) {
        if (!arrayList.isEmpty()) {
            if (arrayList.size() == arrayList2.size()) {
                int size = arrayList.size();
                int i2 = 0;
                int i3 = 0;
                while (i2 < size) {
                    if (!((C0047a) arrayList.get(i2)).f1666p) {
                        if (i3 != i2) {
                            y(arrayList, arrayList2, i3, i2);
                        }
                        i3 = i2 + 1;
                        if (((Boolean) arrayList2.get(i2)).booleanValue()) {
                            while (i3 < size && ((Boolean) arrayList2.get(i3)).booleanValue() && !((C0047a) arrayList.get(i3)).f1666p) {
                                i3++;
                            }
                        }
                        y(arrayList, arrayList2, i2, i3);
                        i2 = i3 - 1;
                    }
                    i2++;
                }
                if (i3 != size) {
                    y(arrayList, arrayList2, i3, size);
                    return;
                }
                return;
            }
            throw new IllegalStateException("Internal error with the back stack records");
        }
    }

    public final void T(r rVar, boolean z2) {
        ViewGroup B2 = B(rVar);
        if (B2 != null && (B2 instanceof FragmentContainerView)) {
            ((FragmentContainerView) B2).setDrawDisappearingViewsLast(!z2);
        }
    }

    public final void W(r rVar) {
        int i2;
        int i3;
        int i4;
        int i5;
        ViewGroup B2 = B(rVar);
        if (B2 != null) {
            C0062p pVar = rVar.f1740M;
            boolean z2 = false;
            if (pVar == null) {
                i2 = 0;
            } else {
                i2 = pVar.f1720b;
            }
            if (pVar == null) {
                i3 = 0;
            } else {
                i3 = pVar.f1721c;
            }
            int i6 = i3 + i2;
            if (pVar == null) {
                i4 = 0;
            } else {
                i4 = pVar.f1722d;
            }
            int i7 = i4 + i6;
            if (pVar == null) {
                i5 = 0;
            } else {
                i5 = pVar.e;
            }
            if (i5 + i7 > 0) {
                if (B2.getTag(2131296792) == null) {
                    B2.setTag(2131296792, rVar);
                }
                r rVar2 = (r) B2.getTag(2131296792);
                C0062p pVar2 = rVar.f1740M;
                if (pVar2 != null) {
                    z2 = pVar2.f1719a;
                }
                if (rVar2.f1740M != null) {
                    rVar2.f().f1719a = z2;
                }
            }
        }
    }

    public final void Y(IllegalStateException illegalStateException) {
        Log.e("FragmentManager", illegalStateException.getMessage());
        Log.e("FragmentManager", "Activity state:");
        PrintWriter printWriter = new PrintWriter(new P());
        C0065t tVar = this.f1598t;
        if (tVar != null) {
            try {
                tVar.f1777j.dump("  ", (FileDescriptor) null, printWriter, new String[0]);
            } catch (Exception e2) {
                Log.e("FragmentManager", "Failed dumping state", e2);
            }
        } else {
            try {
                u("  ", (FileDescriptor) null, printWriter, new String[0]);
            } catch (Exception e3) {
                Log.e("FragmentManager", "Failed dumping state", e3);
            }
        }
        throw illegalStateException;
    }

    public final boolean x(boolean z2) {
        boolean z3;
        w(z2);
        boolean z4 = false;
        while (true) {
            ArrayList arrayList = this.I;
            ArrayList arrayList2 = this.f1577J;
            synchronized (this.f1581a) {
                if (this.f1581a.isEmpty()) {
                    z3 = false;
                } else {
                    try {
                        int size = this.f1581a.size();
                        z3 = false;
                        for (int i2 = 0; i2 < size; i2++) {
                            z3 |= ((F) this.f1581a.get(i2)).a(arrayList, arrayList2);
                        }
                    } finally {
                        this.f1581a.clear();
                        this.f1598t.f1776h.removeCallbacks(this.f1580M);
                    }
                }
            }
            if (z3) {
                z4 = true;
                this.f1582b = true;
                try {
                    P(this.I, this.f1577J);
                } finally {
                    d();
                }
            } else {
                Z();
                if (this.f1576H) {
                    this.f1576H = false;
                    X();
                }
                ((HashMap) this.f1583c.f21f).values().removeAll(Collections.singleton((Object) null));
                return z4;
            }
        }
    }
}
