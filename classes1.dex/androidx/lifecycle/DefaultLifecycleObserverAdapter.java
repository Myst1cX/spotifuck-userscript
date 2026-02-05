package androidx.lifecycle;

public final class DefaultLifecycleObserverAdapter implements C0081p {

    /* renamed from: a  reason: collision with root package name */
    public final C0069d f1798a;

    /* renamed from: b  reason: collision with root package name */
    public final C0081p f1799b;

    public final void b(r rVar, C0077l lVar) {
        int i = C0070e.f1829a[lVar.ordinal()];
        C0069d dVar = this.f1798a;
        if (i == 3) {
            dVar.a();
        } else if (i == 7) {
            throw new IllegalArgumentException("ON_ANY must not been send by anybody");
        }
        C0081p pVar = this.f1799b;
        if (pVar != null) {
            pVar.b(rVar, lVar);
        }
    }

    public DefaultLifecycleObserverAdapter(C0069d dVar, C0081p pVar) {
        this.f1798a = dVar;
        this.f1799b = pVar;
    }
}
