package j0;

import N.C0017q;
import android.support.v4.media.session.t;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;

public abstract class G {

    /* renamed from: a  reason: collision with root package name */
    public B f3266a;

    /* renamed from: b  reason: collision with root package name */
    public ArrayList f3267b;

    /* renamed from: c  reason: collision with root package name */
    public long f3268c;

    /* renamed from: d  reason: collision with root package name */
    public long f3269d;
    public long e;

    /* renamed from: f  reason: collision with root package name */
    public long f3270f;

    public abstract boolean a(a0 a0Var, a0 a0Var2, C0017q qVar, C0017q qVar2);

    public abstract void d(a0 a0Var);

    public abstract void e();

    public abstract boolean f();

    public static void b(a0 a0Var) {
        RecyclerView recyclerView;
        int i = a0Var.f3345j;
        if (!a0Var.g() && (i & 4) == 0 && (recyclerView = a0Var.f3353r) != null) {
            recyclerView.F(a0Var);
        }
    }

    public final void c(a0 a0Var) {
        B b2 = this.f3266a;
        if (b2 != null) {
            boolean z2 = true;
            a0Var.o(true);
            if (a0Var.f3344h != null && a0Var.i == null) {
                a0Var.f3344h = null;
            }
            a0Var.i = null;
            if ((a0Var.f3345j & 16) == 0) {
                RecyclerView recyclerView = b2.f3263a;
                recyclerView.c0();
                t tVar = recyclerView.f2015j;
                B b3 = (B) tVar.f1131b;
                RecyclerView recyclerView2 = b3.f3263a;
                View view = a0Var.f3338a;
                int indexOfChild = recyclerView2.indexOfChild(view);
                if (indexOfChild == -1) {
                    tVar.F(view);
                } else {
                    C0141c cVar = (C0141c) tVar.f1132c;
                    if (cVar.d(indexOfChild)) {
                        cVar.f(indexOfChild);
                        tVar.F(view);
                        b3.h(indexOfChild);
                    } else {
                        z2 = false;
                    }
                }
                if (z2) {
                    a0 I = RecyclerView.I(view);
                    Q q2 = recyclerView.f2010g;
                    q2.j(I);
                    q2.g(I);
                }
                recyclerView.d0(!z2);
                if (!z2 && a0Var.k()) {
                    recyclerView.removeDetachedView(view, false);
                }
            }
        }
    }
}
