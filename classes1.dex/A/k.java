package A;

import H.a;
import J.b;
import M.c;
import Q0.E;
import T0.g;
import android.content.Context;
import android.graphics.Typeface;
import android.util.Log;
import android.util.SparseArray;
import android.view.ActionMode;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.C0052f;
import androidx.fragment.app.J;
import androidx.fragment.app.M;
import androidx.fragment.app.S;
import androidx.fragment.app.r;
import d0.d;
import d0.q;
import g1.A;
import g1.t;
import g1.u;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Objects;
import m.C0174a;
import n.C0182A;
import n.C0197l;
import n.C0204s;
import p0.C0320a;
import r.e;

public class k implements b {

    /* renamed from: f  reason: collision with root package name */
    public Object f21f;

    /* renamed from: g  reason: collision with root package name */
    public Object f22g;

    /* renamed from: h  reason: collision with root package name */
    public Object f23h;
    public Object i;

    public k(int i2) {
        switch (i2) {
            case 3:
                this.f23h = new ArrayList();
                this.f21f = new HashMap();
                this.f22g = new HashMap();
                return;
            case 5:
                this.f22g = "GET";
                this.f23h = new b(27);
                return;
            case 7:
                this.f21f = new r.k();
                this.f22g = new SparseArray();
                this.f23h = new e();
                this.i = new r.k();
                return;
            default:
                this.f21f = new c(10);
                this.f22g = new r.k();
                this.f23h = new ArrayList();
                this.i = new HashSet();
                return;
        }
    }

    public void a(r rVar) {
        if (!((ArrayList) this.f23h).contains(rVar)) {
            synchronized (((ArrayList) this.f23h)) {
                ((ArrayList) this.f23h).add(rVar);
            }
            rVar.f1761p = true;
            return;
        }
        throw new IllegalStateException("Fragment already added: " + rVar);
    }

    public A b() {
        if (((u) this.f21f) != null) {
            return new A(this);
        }
        throw new IllegalStateException("url == null");
    }

    public r d(String str) {
        M m2 = (M) ((HashMap) this.f21f).get(str);
        if (m2 != null) {
            return m2.f1630c;
        }
        return null;
    }

    public r e(String str) {
        for (M m2 : ((HashMap) this.f21f).values()) {
            if (m2 != null) {
                r rVar = m2.f1630c;
                if (!str.equals(rVar.f1755j)) {
                    rVar = rVar.f1770y.f1583c.e(str);
                }
                if (rVar != null) {
                    return rVar;
                }
            }
        }
        return null;
    }

    public m.e f(C0174a aVar) {
        ArrayList arrayList = (ArrayList) this.f23h;
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            m.e eVar = (m.e) arrayList.get(i2);
            if (eVar != null && eVar.f3623b == aVar) {
                return eVar;
            }
        }
        m.e eVar2 = new m.e((Context) this.i, aVar);
        arrayList.add(eVar2);
        return eVar2;
    }

    public ArrayList g() {
        ArrayList arrayList = new ArrayList();
        for (M m2 : ((HashMap) this.f21f).values()) {
            if (m2 != null) {
                arrayList.add(m2);
            }
        }
        return arrayList;
    }

    public ArrayList h() {
        ArrayList arrayList = new ArrayList();
        for (M m2 : ((HashMap) this.f21f).values()) {
            if (m2 != null) {
                arrayList.add(m2.f1630c);
            } else {
                arrayList.add((Object) null);
            }
        }
        return arrayList;
    }

    public List i() {
        ArrayList arrayList;
        if (((ArrayList) this.f23h).isEmpty()) {
            return Collections.emptyList();
        }
        synchronized (((ArrayList) this.f23h)) {
            arrayList = new ArrayList((ArrayList) this.f23h);
        }
        return arrayList;
    }

    public void j(String str, String str2) {
        b bVar = (b) this.f23h;
        bVar.getClass();
        b.s(str, str2);
        bVar.B(str);
        bVar.r(str, str2);
    }

    public void k(M m2) {
        r rVar = m2.f1630c;
        String str = rVar.f1755j;
        HashMap hashMap = (HashMap) this.f21f;
        if (hashMap.get(str) == null) {
            hashMap.put(rVar.f1755j, m2);
            if (Log.isLoggable("FragmentManager", 2)) {
                rVar.toString();
            }
        }
    }

    public void l(M m2) {
        r rVar = m2.f1630c;
        if (rVar.f1734F) {
            ((J) this.i).d(rVar);
        }
        if (((M) ((HashMap) this.f21f).put(rVar.f1755j, (Object) null)) != null && Log.isLoggable("FragmentManager", 2)) {
            rVar.toString();
        }
    }

    public void m() {
        View view = (View) this.f21f;
        view.clearAnimation();
        ((ViewGroup) this.f22g).endViewTransition(view);
        ((C0052f) this.f23h).d();
        if (Log.isLoggable("FragmentManager", 2)) {
            Objects.toString((S) this.i);
        }
    }

    public void n(String str, g gVar) {
        if (str == null) {
            throw new NullPointerException("method == null");
        } else if (str.length() == 0) {
            throw new IllegalArgumentException("method.length() == 0");
        } else if (gVar != null && !g.H(str)) {
            throw new IllegalArgumentException(E.g("method ", str, " must not have a request body."));
        } else if (gVar != null || (!str.equals("POST") && !str.equals("PUT") && !str.equals("PATCH") && !str.equals("PROPPATCH") && !str.equals("REPORT"))) {
            this.f22g = str;
        } else {
            throw new IllegalArgumentException(E.g("method ", str, " must have a request body."));
        }
    }

    public void p() {
        d dVar = new d(this, (q) this.i);
        this.f21f = dVar;
        dVar.onCreate();
    }

    public void r(String str) {
        ((b) this.f23h).B(str);
    }

    public void s(String str) {
        if (str != null) {
            if (str.regionMatches(true, 0, "ws:", 0, 3)) {
                str = "http:" + str.substring(3);
            } else if (str.regionMatches(true, 0, "wss:", 0, 4)) {
                str = "https:" + str.substring(4);
            }
            t tVar = new t();
            u uVar = null;
            if (tVar.b((u) null, str) == 1) {
                uVar = tVar.a();
            }
            if (uVar != null) {
                this.f21f = uVar;
                return;
            }
            throw new IllegalArgumentException("unexpected url: ".concat(str));
        }
        throw new NullPointerException("url == null");
    }

    public void c(Object obj, ArrayList arrayList, HashSet hashSet) {
        if (!arrayList.contains(obj)) {
            if (!hashSet.contains(obj)) {
                hashSet.add(obj);
                ArrayList arrayList2 = (ArrayList) ((r.k) this.f22g).getOrDefault(obj, (Object) null);
                if (arrayList2 != null) {
                    int size = arrayList2.size();
                    for (int i2 = 0; i2 < size; i2++) {
                        c(arrayList2.get(i2), arrayList, hashSet);
                    }
                }
                hashSet.remove(obj);
                arrayList.add(obj);
                return;
            }
            throw new RuntimeException("This graph contains cyclic dependencies");
        }
    }

    public boolean o(C0174a aVar, MenuItem menuItem) {
        return ((ActionMode.Callback) this.f21f).onActionItemClicked(f(aVar), new C0204s((Context) this.i, (a) menuItem));
    }

    public boolean q(C0174a aVar, C0197l lVar) {
        m.e f2 = f(aVar);
        r.k kVar = (r.k) this.f22g;
        Menu menu = (Menu) kVar.getOrDefault(lVar, (Object) null);
        if (menu == null) {
            menu = new C0182A((Context) this.i, lVar);
            kVar.put(lVar, menu);
        }
        return ((ActionMode.Callback) this.f21f).onCreateActionMode(f2, menu);
    }

    public k(Typeface typeface, W.b bVar) {
        int i2;
        int i3;
        this.i = typeface;
        this.f21f = bVar;
        this.f23h = new androidx.emoji2.text.r(1024);
        int a2 = bVar.a(6);
        if (a2 != 0) {
            int i4 = a2 + bVar.f497a;
            i2 = ((ByteBuffer) bVar.f500d).getInt(((ByteBuffer) bVar.f500d).getInt(i4) + i4);
        } else {
            i2 = 0;
        }
        this.f22g = new char[(i2 * 2)];
        int a3 = bVar.a(6);
        if (a3 != 0) {
            int i5 = a3 + bVar.f497a;
            i3 = ((ByteBuffer) bVar.f500d).getInt(((ByteBuffer) bVar.f500d).getInt(i5) + i5);
        } else {
            i3 = 0;
        }
        for (int i6 = 0; i6 < i3; i6++) {
            androidx.emoji2.text.u uVar = new androidx.emoji2.text.u(this, i6);
            W.a c2 = uVar.c();
            int a4 = c2.a(4);
            Character.toChars(a4 != 0 ? ((ByteBuffer) c2.f500d).getInt(a4 + c2.f497a) : 0, (char[]) this.f22g, i6 * 2);
            C0320a.h("invalid metadata codepoint length", uVar.b() > 0);
            ((androidx.emoji2.text.r) this.f23h).a(uVar, 0, uVar.b() - 1);
        }
    }

    public k(q qVar) {
        this.i = qVar;
        this.f23h = new ArrayList();
    }
}
