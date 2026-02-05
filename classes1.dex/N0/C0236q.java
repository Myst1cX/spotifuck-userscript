package n0;

import android.widget.FrameLayout;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import r.b;
import r.k;

/* renamed from: n0.q  reason: case insensitive filesystem */
public abstract class C0236q {

    /* renamed from: a  reason: collision with root package name */
    public static final C0220a f4022a;

    /* renamed from: b  reason: collision with root package name */
    public static final ThreadLocal f4023b = new ThreadLocal();

    /* renamed from: c  reason: collision with root package name */
    public static final ArrayList f4024c = new ArrayList();

    /* JADX WARNING: type inference failed for: r0v0, types: [n0.m, n0.a] */
    static {
        ? mVar = new C0232m();
        mVar.f3961A = new ArrayList();
        mVar.f3964D = false;
        mVar.f3965E = 0;
        mVar.f3962B = false;
        mVar.I(new C0227h(2));
        mVar.I(new C0232m());
        mVar.I(new C0227h(1));
        f4022a = mVar;
    }

    /* JADX WARNING: type inference failed for: r0v6, types: [n0.p, android.view.ViewTreeObserver$OnPreDrawListener, java.lang.Object, android.view.View$OnAttachStateChangeListener] */
    public static void a(FrameLayout frameLayout, C0232m mVar) {
        ArrayList arrayList = f4024c;
        if (!arrayList.contains(frameLayout) && frameLayout.isLaidOut()) {
            arrayList.add(frameLayout);
            if (mVar == null) {
                mVar = f4022a;
            }
            C0232m j2 = mVar.clone();
            ArrayList arrayList2 = (ArrayList) b().getOrDefault(frameLayout, (Object) null);
            if (arrayList2 != null && arrayList2.size() > 0) {
                Iterator it2 = arrayList2.iterator();
                while (it2.hasNext()) {
                    ((C0232m) it2.next()).w(frameLayout);
                }
            }
            j2.h(frameLayout, true);
            if (frameLayout.getTag(2131296766) == null) {
                frameLayout.setTag(2131296766, (Object) null);
                ? obj = new Object();
                obj.f4020f = j2;
                obj.f4021g = frameLayout;
                frameLayout.addOnAttachStateChangeListener(obj);
                frameLayout.getViewTreeObserver().addOnPreDrawListener(obj);
                return;
            }
            throw new ClassCastException();
        }
    }

    /* JADX WARNING: type inference failed for: r1v2, types: [r.b, java.lang.Object, r.k] */
    public static b b() {
        b bVar;
        ThreadLocal threadLocal = f4023b;
        WeakReference weakReference = (WeakReference) threadLocal.get();
        if (weakReference != null && (bVar = (b) weakReference.get()) != null) {
            return bVar;
        }
        ? kVar = new k();
        threadLocal.set(new WeakReference(kVar));
        return kVar;
    }
}
