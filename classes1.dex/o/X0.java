package o;

import androidx.appcompat.widget.Toolbar;
import n.C0199n;

public final /* synthetic */ class X0 implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f4151a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Toolbar f4152b;

    public /* synthetic */ X0(Toolbar toolbar, int i) {
        this.f4151a = i;
        this.f4152b = toolbar;
    }

    public final void run() {
        C0199n nVar;
        switch (this.f4151a) {
            case 0:
                a1 a1Var = this.f4152b.f1390Q;
                if (a1Var == null) {
                    nVar = null;
                } else {
                    nVar = a1Var.f4169g;
                }
                if (nVar != null) {
                    nVar.collapseActionView();
                    return;
                }
                return;
            default:
                this.f4152b.n();
                return;
        }
    }
}
