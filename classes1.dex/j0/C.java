package j0;

import android.database.Observable;
import android.view.ViewGroup;

public abstract class C {

    /* renamed from: a  reason: collision with root package name */
    public final D f3264a = new Observable();

    /* renamed from: b  reason: collision with root package name */
    public boolean f3265b = false;

    public abstract int a();

    public int c(int i) {
        return 0;
    }

    public abstract void d(a0 a0Var, int i);

    public abstract a0 e(ViewGroup viewGroup, int i);

    public long b(int i) {
        return -1;
    }

    public final void f(boolean z2) {
        if (!this.f3264a.a()) {
            this.f3265b = z2;
            return;
        }
        throw new IllegalStateException("Cannot change whether this adapter has stable IDs while the adapter has registered observers.");
    }
}
