package androidx.lifecycle;

import Q0.E;
import Z0.c;
import android.os.Looper;
import java.lang.ref.WeakReference;
import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicReference;
import p.C0319a;
import q.C0321a;
import q.b;
import q.d;

public final class t {

    /* renamed from: a  reason: collision with root package name */
    public final boolean f1839a = true;

    /* renamed from: b  reason: collision with root package name */
    public C0321a f1840b = new C0321a();

    /* renamed from: c  reason: collision with root package name */
    public C0078m f1841c = C0078m.f1832b;

    /* renamed from: d  reason: collision with root package name */
    public final WeakReference f1842d;
    public int e;

    /* renamed from: f  reason: collision with root package name */
    public boolean f1843f;

    /* renamed from: g  reason: collision with root package name */
    public boolean f1844g;

    /* renamed from: h  reason: collision with root package name */
    public final ArrayList f1845h = new ArrayList();

    /* JADX WARNING: type inference failed for: r3v2, types: [androidx.lifecycle.s, java.lang.Object] */
    public final void a(C0082q qVar) {
        C0081p pVar;
        r rVar;
        ArrayList arrayList = this.f1845h;
        Object obj = null;
        c("addObserver");
        C0078m mVar = this.f1841c;
        C0078m mVar2 = C0078m.f1831a;
        if (mVar != mVar2) {
            mVar2 = C0078m.f1832b;
        }
        ? obj2 = new Object();
        HashMap hashMap = u.f1846a;
        boolean z2 = qVar instanceof C0081p;
        boolean z3 = qVar instanceof C0069d;
        boolean z4 = false;
        if (z2 && z3) {
            pVar = new DefaultLifecycleObserverAdapter((C0069d) qVar, (C0081p) qVar);
        } else if (z3) {
            pVar = new DefaultLifecycleObserverAdapter((C0069d) qVar, (C0081p) null);
        } else if (z2) {
            pVar = (C0081p) qVar;
        } else {
            Class<?> cls = qVar.getClass();
            if (u.c(cls) == 2) {
                Object obj3 = u.f1847b.get(cls);
                c.b(obj3);
                List list = (List) obj3;
                if (list.size() != 1) {
                    int size = list.size();
                    C0072g[] gVarArr = new C0072g[size];
                    if (size <= 0) {
                        pVar = new CompositeGeneratedAdaptersObserver(gVarArr);
                    } else {
                        u.a((Constructor) list.get(0), qVar);
                        throw null;
                    }
                } else {
                    u.a((Constructor) list.get(0), qVar);
                    throw null;
                }
            } else {
                pVar = new ReflectiveGenericLifecycleObserver(qVar);
            }
        }
        obj2.f1838b = pVar;
        obj2.f1837a = mVar2;
        C0321a aVar = this.f1840b;
        q.c a2 = aVar.a(qVar);
        if (a2 != null) {
            obj = a2.f4472b;
        } else {
            HashMap hashMap2 = aVar.e;
            q.c cVar = new q.c(qVar, obj2);
            aVar.f4481d++;
            q.c cVar2 = aVar.f4479b;
            if (cVar2 == null) {
                aVar.f4478a = cVar;
                aVar.f4479b = cVar;
            } else {
                cVar2.f4473c = cVar;
                cVar.f4474d = cVar2;
                aVar.f4479b = cVar;
            }
            hashMap2.put(qVar, cVar);
        }
        if (((s) obj) == null && (rVar = (r) this.f1842d.get()) != null) {
            if (this.e != 0 || this.f1843f) {
                z4 = true;
            }
            C0078m b2 = b(qVar);
            this.e++;
            while (obj2.f1837a.compareTo(b2) < 0 && this.f1840b.e.containsKey(qVar)) {
                arrayList.add(obj2.f1837a);
                C0075j jVar = C0077l.Companion;
                C0078m mVar3 = obj2.f1837a;
                jVar.getClass();
                C0077l a3 = C0075j.a(mVar3);
                if (a3 != null) {
                    obj2.a(rVar, a3);
                    arrayList.remove(arrayList.size() - 1);
                    b2 = b(qVar);
                } else {
                    throw new IllegalStateException("no event up from " + obj2.f1837a);
                }
            }
            if (!z4) {
                h();
            }
            this.e--;
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v5, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v3, resolved type: androidx.lifecycle.m} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final androidx.lifecycle.C0078m b(androidx.lifecycle.C0082q r4) {
        /*
            r3 = this;
            q.a r0 = r3.f1840b
            java.util.HashMap r0 = r0.e
            boolean r1 = r0.containsKey(r4)
            r2 = 0
            if (r1 == 0) goto L_0x0014
            java.lang.Object r4 = r0.get(r4)
            q.c r4 = (q.c) r4
            q.c r4 = r4.f4474d
            goto L_0x0015
        L_0x0014:
            r4 = r2
        L_0x0015:
            if (r4 == 0) goto L_0x0020
            java.lang.Object r4 = r4.f4472b
            androidx.lifecycle.s r4 = (androidx.lifecycle.s) r4
            if (r4 == 0) goto L_0x0020
            androidx.lifecycle.m r4 = r4.f1837a
            goto L_0x0021
        L_0x0020:
            r4 = r2
        L_0x0021:
            java.util.ArrayList r0 = r3.f1845h
            boolean r1 = r0.isEmpty()
            if (r1 != 0) goto L_0x0036
            int r1 = r0.size()
            int r1 = r1 + -1
            java.lang.Object r0 = r0.get(r1)
            r2 = r0
            androidx.lifecycle.m r2 = (androidx.lifecycle.C0078m) r2
        L_0x0036:
            androidx.lifecycle.m r0 = r3.f1841c
            java.lang.String r1 = "state1"
            Z0.c.e(r1, r0)
            if (r4 == 0) goto L_0x0046
            int r1 = r4.compareTo(r0)
            if (r1 >= 0) goto L_0x0046
            goto L_0x0047
        L_0x0046:
            r4 = r0
        L_0x0047:
            if (r2 == 0) goto L_0x0050
            int r0 = r2.compareTo(r4)
            if (r0 >= 0) goto L_0x0050
            goto L_0x0051
        L_0x0050:
            r2 = r4
        L_0x0051:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.lifecycle.t.b(androidx.lifecycle.q):androidx.lifecycle.m");
    }

    public final void c(String str) {
        if (this.f1839a) {
            C0319a.V().f4436l.getClass();
            if (Looper.getMainLooper().getThread() != Thread.currentThread()) {
                throw new IllegalStateException(E.g("Method ", str, " must be called on the main thread").toString());
            }
        }
    }

    public final void d(C0077l lVar) {
        c.e("event", lVar);
        c("handleLifecycleEvent");
        e(lVar.a());
    }

    public final void e(C0078m mVar) {
        C0078m mVar2 = this.f1841c;
        if (mVar2 != mVar) {
            C0078m mVar3 = C0078m.f1832b;
            C0078m mVar4 = C0078m.f1831a;
            if (mVar2 == mVar3 && mVar == mVar4) {
                throw new IllegalStateException(("no event down from " + this.f1841c + " in component " + this.f1842d.get()).toString());
            }
            this.f1841c = mVar;
            if (this.f1843f || this.e != 0) {
                this.f1844g = true;
                return;
            }
            this.f1843f = true;
            h();
            this.f1843f = false;
            if (this.f1841c == mVar4) {
                this.f1840b = new C0321a();
            }
        }
    }

    public final void f(C0082q qVar) {
        c("removeObserver");
        this.f1840b.b(qVar);
    }

    public final void g() {
        C0078m mVar = C0078m.f1833c;
        c("setCurrentState");
        e(mVar);
    }

    public final void h() {
        C0077l lVar;
        r rVar = (r) this.f1842d.get();
        if (rVar != null) {
            while (true) {
                C0321a aVar = this.f1840b;
                if (aVar.f4481d != 0) {
                    q.c cVar = aVar.f4478a;
                    c.b(cVar);
                    C0078m mVar = ((s) cVar.f4472b).f1837a;
                    q.c cVar2 = this.f1840b.f4479b;
                    c.b(cVar2);
                    C0078m mVar2 = ((s) cVar2.f4472b).f1837a;
                    if (mVar == mVar2 && this.f1841c == mVar2) {
                        break;
                    }
                    this.f1844g = false;
                    C0078m mVar3 = this.f1841c;
                    q.c cVar3 = this.f1840b.f4478a;
                    c.b(cVar3);
                    if (mVar3.compareTo(((s) cVar3.f4472b).f1837a) < 0) {
                        C0321a aVar2 = this.f1840b;
                        b bVar = new b(aVar2.f4479b, aVar2.f4478a, 1);
                        aVar2.f4480c.put(bVar, Boolean.FALSE);
                        while (bVar.hasNext() && !this.f1844g) {
                            Map.Entry entry = (Map.Entry) bVar.next();
                            c.d("next()", entry);
                            C0082q qVar = (C0082q) entry.getKey();
                            s sVar = (s) entry.getValue();
                            while (sVar.f1837a.compareTo(this.f1841c) > 0 && !this.f1844g && this.f1840b.e.containsKey(qVar)) {
                                C0075j jVar = C0077l.Companion;
                                C0078m mVar4 = sVar.f1837a;
                                jVar.getClass();
                                c.e("state", mVar4);
                                int ordinal = mVar4.ordinal();
                                if (ordinal == 2) {
                                    lVar = C0077l.ON_DESTROY;
                                } else if (ordinal == 3) {
                                    lVar = C0077l.ON_STOP;
                                } else if (ordinal != 4) {
                                    lVar = null;
                                } else {
                                    lVar = C0077l.ON_PAUSE;
                                }
                                if (lVar != null) {
                                    this.f1845h.add(lVar.a());
                                    sVar.a(rVar, lVar);
                                    ArrayList arrayList = this.f1845h;
                                    arrayList.remove(arrayList.size() - 1);
                                } else {
                                    throw new IllegalStateException("no event down from " + sVar.f1837a);
                                }
                            }
                        }
                    }
                    q.c cVar4 = this.f1840b.f4479b;
                    if (!this.f1844g && cVar4 != null && this.f1841c.compareTo(((s) cVar4.f4472b).f1837a) > 0) {
                        C0321a aVar3 = this.f1840b;
                        aVar3.getClass();
                        d dVar = new d(aVar3);
                        aVar3.f4480c.put(dVar, Boolean.FALSE);
                        while (dVar.hasNext() && !this.f1844g) {
                            Map.Entry entry2 = (Map.Entry) dVar.next();
                            C0082q qVar2 = (C0082q) entry2.getKey();
                            s sVar2 = (s) entry2.getValue();
                            while (sVar2.f1837a.compareTo(this.f1841c) < 0 && !this.f1844g && this.f1840b.e.containsKey(qVar2)) {
                                this.f1845h.add(sVar2.f1837a);
                                C0075j jVar2 = C0077l.Companion;
                                C0078m mVar5 = sVar2.f1837a;
                                jVar2.getClass();
                                C0077l a2 = C0075j.a(mVar5);
                                if (a2 != null) {
                                    sVar2.a(rVar, a2);
                                    ArrayList arrayList2 = this.f1845h;
                                    arrayList2.remove(arrayList2.size() - 1);
                                } else {
                                    throw new IllegalStateException("no event up from " + sVar2.f1837a);
                                }
                            }
                        }
                    }
                } else {
                    break;
                }
            }
            this.f1844g = false;
            return;
        }
        throw new IllegalStateException("LifecycleOwner of this LifecycleRegistry is already garbage collected. It is too late to change lifecycle state.");
    }

    public t(r rVar) {
        new AtomicReference();
        this.f1842d = new WeakReference(rVar);
    }
}
