package j0;

import N.Q;
import O.u;
import android.view.MenuItem;
import android.view.View;
import androidx.appcompat.widget.ActionMenuView;
import androidx.fragment.app.A;
import com.google.android.material.behavior.SwipeDismissBehavior;
import g1.F;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.WeakHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import n.C0185D;
import n.C0191f;
import n.C0195j;
import n.C0197l;
import n.C0199n;
import n.C0208w;
import o.C0267a0;
import o.C0286k;
import o.C0292n;
import o.I0;
import o.Y0;
import w0.C0352a;

/* renamed from: j0.w  reason: case insensitive filesystem */
public class C0160w implements I0, C0208w, C0195j, C0267a0, u, C0352a {

    /* renamed from: f  reason: collision with root package name */
    public final Object f3516f;

    public /* synthetic */ C0160w(Object obj) {
        this.f3516f = obj;
    }

    public synchronized void j(F f2) {
        ((LinkedHashSet) this.f3516f).remove(f2);
    }

    public C0160w() {
        this.f3516f = new LinkedHashSet();
    }

    public void a(int i) {
    }

    public void b(C0197l lVar, boolean z2) {
        if (lVar instanceof C0185D) {
            ((C0185D) lVar).f3813z.k().c(false);
        }
        C0208w wVar = ((C0286k) this.f3516f).f4244j;
        if (wVar != null) {
            wVar.b(lVar, z2);
        }
    }

    public boolean c(View view) {
        int i;
        SwipeDismissBehavior swipeDismissBehavior = (SwipeDismissBehavior) this.f3516f;
        boolean z2 = false;
        if (!swipeDismissBehavior.r(view)) {
            return false;
        }
        WeakHashMap weakHashMap = Q.f509a;
        if (view.getLayoutDirection() == 1) {
            z2 = true;
        }
        int i2 = swipeDismissBehavior.f2106d;
        if ((i2 != 0 || !z2) && (i2 != 1 || z2)) {
            i = view.getWidth();
        } else {
            i = -view.getWidth();
        }
        Q.j(view, i);
        view.setAlpha(0.0f);
        return true;
    }

    public boolean d(C0197l lVar, MenuItem menuItem) {
        C0292n nVar = ((ActionMenuView) this.f3516f).f1311E;
        if (nVar != null) {
            Iterator it2 = ((CopyOnWriteArrayList) ((Y0) nVar).f4153f.f1385L.f1132c).iterator();
            while (it2.hasNext()) {
                if (((A) it2.next()).f1556a.o()) {
                    return true;
                }
            }
        }
        return false;
    }

    public void e(int i, float f2) {
    }

    public void f(C0197l lVar) {
        Y0 y02 = ((ActionMenuView) this.f3516f).f1317z;
        if (y02 != null) {
            y02.f(lVar);
        }
    }

    public void g(C0197l lVar, C0199n nVar) {
        ((C0191f) this.f3516f).f3843k.removeCallbacksAndMessages(lVar);
    }

    public boolean h(C0197l lVar) {
        C0286k kVar = (C0286k) this.f3516f;
        if (lVar == kVar.f4243h) {
            return false;
        }
        ((C0185D) lVar).f3812A.getClass();
        kVar.getClass();
        C0208w wVar = kVar.f4244j;
        if (wVar != null) {
            return wVar.h(lVar);
        }
        return false;
    }

    public void i(int i) {
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v3, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v4, resolved type: n.e} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void o(n.C0197l r10, n.C0199n r11) {
        /*
            r9 = this;
            java.lang.Object r0 = r9.f3516f
            n.f r0 = (n.C0191f) r0
            android.os.Handler r1 = r0.f3843k
            r2 = 0
            r1.removeCallbacksAndMessages(r2)
            java.util.ArrayList r1 = r0.f3845m
            int r3 = r1.size()
            r4 = 0
        L_0x0011:
            r5 = -1
            if (r4 >= r3) goto L_0x0022
            java.lang.Object r6 = r1.get(r4)
            n.e r6 = (n.C0190e) r6
            n.l r6 = r6.f3833b
            if (r10 != r6) goto L_0x001f
            goto L_0x0023
        L_0x001f:
            int r4 = r4 + 1
            goto L_0x0011
        L_0x0022:
            r4 = -1
        L_0x0023:
            if (r4 != r5) goto L_0x0026
            return
        L_0x0026:
            int r4 = r4 + 1
            int r3 = r1.size()
            if (r4 >= r3) goto L_0x0035
            java.lang.Object r1 = r1.get(r4)
            r2 = r1
            n.e r2 = (n.C0190e) r2
        L_0x0035:
            r5 = r2
            d0.o r1 = new d0.o
            r8 = 1
            r3 = r1
            r4 = r9
            r6 = r11
            r7 = r10
            r3.<init>(r4, r5, r6, r7, r8)
            long r2 = android.os.SystemClock.uptimeMillis()
            r4 = 200(0xc8, double:9.9E-322)
            long r2 = r2 + r4
            android.os.Handler r11 = r0.f3843k
            r11.postAtTime(r1, r10, r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: j0.C0160w.o(n.l, n.n):void");
    }
}
