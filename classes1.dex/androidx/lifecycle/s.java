package androidx.lifecycle;

import Z0.c;

public final class s {

    /* renamed from: a  reason: collision with root package name */
    public C0078m f1837a;

    /* renamed from: b  reason: collision with root package name */
    public C0081p f1838b;

    public final void a(r rVar, C0077l lVar) {
        C0078m a2 = lVar.a();
        C0078m mVar = this.f1837a;
        c.e("state1", mVar);
        if (a2.compareTo(mVar) < 0) {
            mVar = a2;
        }
        this.f1837a = mVar;
        this.f1838b.b(rVar, lVar);
        this.f1837a = a2;
    }
}
