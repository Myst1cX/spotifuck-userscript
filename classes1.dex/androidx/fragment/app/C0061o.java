package androidx.fragment.app;

import android.view.View;

/* renamed from: androidx.fragment.app.o  reason: case insensitive filesystem */
public final class C0061o extends v {

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ r f1718f;

    public final View e(int i) {
        r rVar = this.f1718f;
        View view = rVar.f1737J;
        if (view != null) {
            return view.findViewById(i);
        }
        throw new IllegalStateException("Fragment " + rVar + " does not have a view");
    }

    public final boolean f() {
        if (this.f1718f.f1737J != null) {
            return true;
        }
        return false;
    }

    public C0061o(r rVar) {
        this.f1718f = rVar;
    }
}
