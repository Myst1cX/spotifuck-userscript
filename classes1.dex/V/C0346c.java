package v;

import Q0.E;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import t.C0339e;
import t.C0340f;
import w.h;
import w.n;

/* renamed from: v.c  reason: case insensitive filesystem */
public final class C0346c {

    /* renamed from: a  reason: collision with root package name */
    public HashSet f4701a = null;

    /* renamed from: b  reason: collision with root package name */
    public int f4702b;

    /* renamed from: c  reason: collision with root package name */
    public boolean f4703c;

    /* renamed from: d  reason: collision with root package name */
    public final C0347d f4704d;
    public final int e;

    /* renamed from: f  reason: collision with root package name */
    public C0346c f4705f;

    /* renamed from: g  reason: collision with root package name */
    public int f4706g = 0;

    /* renamed from: h  reason: collision with root package name */
    public int f4707h = Integer.MIN_VALUE;
    public C0340f i;

    public final boolean b(C0346c cVar, int i2, int i3, boolean z2) {
        if (cVar == null) {
            j();
            return true;
        } else if (!z2 && !i(cVar)) {
            return false;
        } else {
            this.f4705f = cVar;
            if (cVar.f4701a == null) {
                cVar.f4701a = new HashSet();
            }
            HashSet hashSet = this.f4705f.f4701a;
            if (hashSet != null) {
                hashSet.add(this);
            }
            this.f4706g = i2;
            this.f4707h = i3;
            return true;
        }
    }

    public final boolean i(C0346c cVar) {
        boolean z2;
        boolean z3;
        boolean z4 = false;
        if (cVar == null) {
            return false;
        }
        int i2 = this.e;
        C0347d dVar = cVar.f4704d;
        int i3 = cVar.e;
        if (i3 != i2) {
            switch (C0339e.a(i2)) {
                case 0:
                case 7:
                case 8:
                    return false;
                case 1:
                case 3:
                    if (i3 == 2 || i3 == 4) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    if (!(dVar instanceof h)) {
                        return z2;
                    }
                    if (z2 || i3 == 8) {
                        z4 = true;
                    }
                    return z4;
                case 2:
                case 4:
                    if (i3 == 3 || i3 == 5) {
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                    if (!(dVar instanceof h)) {
                        return z3;
                    }
                    if (z3 || i3 == 9) {
                        z4 = true;
                    }
                    return z4;
                case 5:
                    if (i3 == 2 || i3 == 4) {
                        return false;
                    }
                    return true;
                case 6:
                    if (i3 == 6 || i3 == 8 || i3 == 9) {
                        return false;
                    }
                    return true;
                default:
                    throw new AssertionError(E.i(i2));
            }
        } else if (i2 != 6 || (dVar.f4712E && this.f4704d.f4712E)) {
            return true;
        } else {
            return false;
        }
    }

    public final void a(C0346c cVar, int i2) {
        b(cVar, i2, Integer.MIN_VALUE, false);
    }

    public final void c(int i2, ArrayList arrayList, n nVar) {
        HashSet hashSet = this.f4701a;
        if (hashSet != null) {
            Iterator it2 = hashSet.iterator();
            while (it2.hasNext()) {
                h.b(((C0346c) it2.next()).f4704d, i2, arrayList, nVar);
            }
        }
    }

    public final int d() {
        if (!this.f4703c) {
            return 0;
        }
        return this.f4702b;
    }

    public final int e() {
        C0346c cVar;
        if (this.f4704d.f4745g0 == 8) {
            return 0;
        }
        int i2 = this.f4707h;
        if (i2 == Integer.MIN_VALUE || (cVar = this.f4705f) == null || cVar.f4704d.f4745g0 != 8) {
            return this.f4706g;
        }
        return i2;
    }

    public final C0346c f() {
        int i2 = this.e;
        int a2 = C0339e.a(i2);
        C0347d dVar = this.f4704d;
        switch (a2) {
            case 0:
            case 5:
            case 6:
            case 7:
            case 8:
                return null;
            case 1:
                return dVar.f4717K;
            case 2:
                return dVar.f4718L;
            case 3:
                return dVar.I;
            case 4:
                return dVar.f4716J;
            default:
                throw new AssertionError(E.i(i2));
        }
    }

    public final boolean g() {
        HashSet hashSet = this.f4701a;
        if (hashSet == null) {
            return false;
        }
        Iterator it2 = hashSet.iterator();
        while (it2.hasNext()) {
            if (((C0346c) it2.next()).f().h()) {
                return true;
            }
        }
        return false;
    }

    public final boolean h() {
        if (this.f4705f != null) {
            return true;
        }
        return false;
    }

    public final void j() {
        HashSet hashSet;
        C0346c cVar = this.f4705f;
        if (!(cVar == null || (hashSet = cVar.f4701a) == null)) {
            hashSet.remove(this);
            if (this.f4705f.f4701a.size() == 0) {
                this.f4705f.f4701a = null;
            }
        }
        this.f4701a = null;
        this.f4705f = null;
        this.f4706g = 0;
        this.f4707h = Integer.MIN_VALUE;
        this.f4703c = false;
        this.f4702b = 0;
    }

    public final void k() {
        C0340f fVar = this.i;
        if (fVar == null) {
            this.i = new C0340f(1);
        } else {
            fVar.c();
        }
    }

    public final void l(int i2) {
        this.f4702b = i2;
        this.f4703c = true;
    }

    public final String toString() {
        return this.f4704d.f4747h0 + ":" + E.i(this.e);
    }

    public C0346c(C0347d dVar, int i2) {
        this.f4704d = dVar;
        this.e = i2;
    }
}
