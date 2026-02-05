package androidx.fragment.app;

import C.i;
import C.v;
import M.a;
import android.content.res.Configuration;

public final /* synthetic */ class y implements a {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f1785a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ H f1786b;

    public /* synthetic */ y(H h2, int i) {
        this.f1785a = i;
        this.f1786b = h2;
    }

    public final void a(Object obj) {
        switch (this.f1785a) {
            case 0:
                Configuration configuration = (Configuration) obj;
                H h2 = this.f1786b;
                if (h2.G()) {
                    h2.h(false);
                    return;
                }
                return;
            case 1:
                Integer num = (Integer) obj;
                H h3 = this.f1786b;
                if (h3.G() && num.intValue() == 80) {
                    h3.l(false);
                    return;
                }
                return;
            case 2:
                i iVar = (i) obj;
                H h4 = this.f1786b;
                if (h4.G()) {
                    h4.m(iVar.f51a, false);
                    return;
                }
                return;
            default:
                v vVar = (v) obj;
                H h5 = this.f1786b;
                if (h5.G()) {
                    h5.r(vVar.f74a, false);
                    return;
                }
                return;
        }
    }
}
