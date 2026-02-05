package j0;

import androidx.recyclerview.widget.RecyclerView;

public final class d0 extends N {

    /* renamed from: a  reason: collision with root package name */
    public boolean f3366a = false;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ C0163z f3367b;

    public final void a(RecyclerView recyclerView, int i) {
        if (i == 0 && this.f3366a) {
            this.f3366a = false;
            this.f3367b.f();
        }
    }

    public final void b(RecyclerView recyclerView, int i, int i2) {
        if (i != 0 || i2 != 0) {
            this.f3366a = true;
        }
    }

    public d0(C0163z zVar) {
        this.f3367b = zVar;
    }
}
