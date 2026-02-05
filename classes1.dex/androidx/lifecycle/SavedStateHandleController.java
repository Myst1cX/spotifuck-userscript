package androidx.lifecycle;

public final class SavedStateHandleController implements C0081p {

    /* renamed from: a  reason: collision with root package name */
    public boolean f1821a;

    public final void b(r rVar, C0077l lVar) {
        if (lVar == C0077l.ON_DESTROY) {
            this.f1821a = false;
            rVar.d().f(this);
        }
    }
}
