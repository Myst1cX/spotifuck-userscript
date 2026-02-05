package androidx.lifecycle;

import Z0.c;
import android.app.Activity;
import android.app.Fragment;
import android.app.FragmentManager;
import android.os.Build;
import java.util.Iterator;
import java.util.Map;
import k0.C0167b;
import k0.C0170e;
import q.b;
import q.f;

public abstract class I {

    /* renamed from: a  reason: collision with root package name */
    public static final N f1803a = new Object();

    /* renamed from: b  reason: collision with root package name */
    public static final N f1804b = new Object();

    /* renamed from: c  reason: collision with root package name */
    public static final N f1805c = new Object();

    public static void a(Activity activity, C0077l lVar) {
        c.e("activity", activity);
        c.e("event", lVar);
        if (activity instanceof r) {
            t d2 = ((r) activity).d();
            if (d2 instanceof t) {
                d2.d(lVar);
            }
        }
    }

    public static void c(Activity activity) {
        c.e("activity", activity);
        if (Build.VERSION.SDK_INT >= 29) {
            E.Companion.getClass();
            activity.registerActivityLifecycleCallbacks(new E());
        }
        FragmentManager fragmentManager = activity.getFragmentManager();
        if (fragmentManager.findFragmentByTag("androidx.lifecycle.LifecycleDispatcher.report_fragment_tag") == null) {
            fragmentManager.beginTransaction().add(new Fragment(), "androidx.lifecycle.LifecycleDispatcher.report_fragment_tag").commit();
            fragmentManager.executePendingTransactions();
        }
    }

    public static final void b(C0170e eVar) {
        C0167b bVar;
        C0078m mVar = eVar.d().f1841c;
        if (mVar == C0078m.f1832b || mVar == C0078m.f1833c) {
            Iterator it2 = ((f) eVar.b().f3565d).iterator();
            while (true) {
                b bVar2 = (b) it2;
                if (!bVar2.hasNext()) {
                    bVar = null;
                    break;
                }
                Map.Entry entry = (Map.Entry) bVar2.next();
                c.d("components", entry);
                bVar = (C0167b) entry.getValue();
                if (c.a((String) entry.getKey(), "androidx.lifecycle.internal.SavedStateHandlesProvider")) {
                    break;
                }
            }
            if (bVar == null) {
                J j2 = new J(eVar.b(), (Q) eVar);
                eVar.b().e("androidx.lifecycle.internal.SavedStateHandlesProvider", j2);
                eVar.d().a(new SavedStateHandleAttacher(j2));
                return;
            }
            return;
        }
        throw new IllegalArgumentException("Failed requirement.");
    }
}
