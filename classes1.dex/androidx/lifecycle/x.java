package androidx.lifecycle;

import A.b;
import Q0.E;
import android.os.Looper;
import android.util.Log;
import android.view.View;
import androidx.fragment.app.C0059m;
import java.util.Map;
import java.util.Objects;
import p.C0319a;
import q.c;
import q.d;
import q.f;

public class x {

    /* renamed from: j  reason: collision with root package name */
    public static final Object f1852j = new Object();

    /* renamed from: a  reason: collision with root package name */
    public final Object f1853a;

    /* renamed from: b  reason: collision with root package name */
    public final f f1854b = new f();

    /* renamed from: c  reason: collision with root package name */
    public int f1855c = 0;

    /* renamed from: d  reason: collision with root package name */
    public boolean f1856d;
    public volatile Object e;

    /* renamed from: f  reason: collision with root package name */
    public volatile Object f1857f;

    /* renamed from: g  reason: collision with root package name */
    public int f1858g;

    /* renamed from: h  reason: collision with root package name */
    public boolean f1859h;
    public boolean i;

    public final void b(w wVar) {
        if (wVar.f1849b) {
            if (!wVar.e()) {
                wVar.c(false);
                return;
            }
            int i2 = wVar.f1850c;
            int i3 = this.f1858g;
            if (i2 < i3) {
                wVar.f1850c = i3;
                b bVar = wVar.f1848a;
                Object obj = this.e;
                bVar.getClass();
                if (((r) obj) != null) {
                    C0059m mVar = (C0059m) bVar.f2g;
                    if (mVar.f1709e0) {
                        View G2 = mVar.G();
                        if (G2.getParent() != null) {
                            throw new IllegalStateException("DialogFragment can not be attached to a container view");
                        } else if (mVar.f1713i0 != null) {
                            if (Log.isLoggable("FragmentManager", 3)) {
                                Objects.toString(mVar.f1713i0);
                            }
                            mVar.f1713i0.setContentView(G2);
                        }
                    }
                }
            }
        }
    }

    public final void c(w wVar) {
        if (this.f1859h) {
            this.i = true;
            return;
        }
        this.f1859h = true;
        do {
            this.i = false;
            if (wVar == null) {
                f fVar = this.f1854b;
                fVar.getClass();
                d dVar = new d(fVar);
                fVar.f4480c.put(dVar, Boolean.FALSE);
                while (dVar.hasNext()) {
                    b((w) ((Map.Entry) dVar.next()).getValue());
                    if (this.i) {
                        break;
                    }
                }
            } else {
                b(wVar);
                wVar = null;
            }
        } while (this.i);
        this.f1859h = false;
    }

    public final void d(b bVar) {
        Object obj;
        a("observeForever");
        w wVar = new w(this, bVar);
        f fVar = this.f1854b;
        c a2 = fVar.a(bVar);
        if (a2 != null) {
            obj = a2.f4472b;
        } else {
            c cVar = new c(bVar, wVar);
            fVar.f4481d++;
            c cVar2 = fVar.f4479b;
            if (cVar2 == null) {
                fVar.f4478a = cVar;
                fVar.f4479b = cVar;
            } else {
                cVar2.f4473c = cVar;
                cVar.f4474d = cVar2;
                fVar.f4479b = cVar;
            }
            obj = null;
        }
        w wVar2 = (w) obj;
        if (wVar2 instanceof LiveData$LifecycleBoundObserver) {
            throw new IllegalArgumentException("Cannot add the same observer with different lifecycles");
        } else if (wVar2 == null) {
            wVar.c(true);
        }
    }

    public final void e(Object obj) {
        a("setValue");
        this.f1858g++;
        this.e = obj;
        c((w) null);
    }

    public x() {
        Object obj = f1852j;
        this.f1857f = obj;
        this.e = obj;
        this.f1858g = -1;
    }

    public static void a(String str) {
        C0319a.V().f4436l.getClass();
        if (Looper.getMainLooper().getThread() != Thread.currentThread()) {
            throw new IllegalStateException(E.g("Cannot invoke ", str, " on a background thread"));
        }
    }
}
