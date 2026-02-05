package e1;

import java.util.Iterator;
import java.util.concurrent.atomic.AtomicReference;

public final class a implements d {

    /* renamed from: a  reason: collision with root package name */
    public final AtomicReference f2508a;

    public final Iterator iterator() {
        d dVar = (d) this.f2508a.getAndSet((Object) null);
        if (dVar != null) {
            return dVar.iterator();
        }
        throw new IllegalStateException("This sequence can be consumed only once.");
    }

    public a(d dVar) {
        this.f2508a = new AtomicReference(dVar);
    }
}
