package g1;

import j1.b;
import j1.e;
import j1.f;
import java.lang.ref.Reference;
import java.net.Socket;
import java.util.Iterator;

/* renamed from: g1.b  reason: case insensitive filesystem */
public final class C0103b {

    /* renamed from: a  reason: collision with root package name */
    public static final C0103b f2677a = new Object();

    /* renamed from: b  reason: collision with root package name */
    public static final C0103b f2678b = new Object();

    /* renamed from: c  reason: collision with root package name */
    public static final C0103b f2679c = new Object();

    /* renamed from: d  reason: collision with root package name */
    public static final C0103b f2680d = new Object();
    public static C0103b e;

    public static Socket a(n nVar, C0102a aVar, f fVar) {
        Iterator it2 = nVar.f2740d.iterator();
        while (it2.hasNext()) {
            b bVar = (b) it2.next();
            if (bVar.g(aVar, (F) null) && bVar.f3533h != null && bVar != fVar.a()) {
                if (fVar.f3558l == null && fVar.i.f3538n.size() == 1) {
                    Socket b2 = fVar.b(true, false, false);
                    fVar.i = bVar;
                    bVar.f3538n.add((Reference) fVar.i.f3538n.get(0));
                    return b2;
                }
                throw new IllegalStateException();
            }
        }
        return null;
    }

    public static void b(n nVar, C0102a aVar, f fVar, F f2) {
        Iterator it2 = nVar.f2740d.iterator();
        while (it2.hasNext()) {
            b bVar = (b) it2.next();
            if (bVar.g(aVar, f2)) {
                if (fVar.i == null) {
                    fVar.i = bVar;
                    fVar.f3556j = true;
                    bVar.f3538n.add(new e(fVar, fVar.f3553f));
                    return;
                }
                throw new IllegalStateException();
            }
        }
    }
}
