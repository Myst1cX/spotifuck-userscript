package androidx.fragment.app;

import Q0.E;
import java.util.ArrayList;

public final class Q implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f1643a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ S f1644b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ C0055i f1645c;

    public /* synthetic */ Q(C0055i iVar, S s2, int i) {
        this.f1643a = i;
        this.f1645c = iVar;
        this.f1644b = s2;
    }

    public final void run() {
        switch (this.f1643a) {
            case 0:
                ArrayList arrayList = this.f1645c.f1697b;
                S s2 = this.f1644b;
                if (arrayList.contains(s2)) {
                    E.a(s2.f1648c.f1737J, s2.f1646a);
                    return;
                }
                return;
            default:
                C0055i iVar = this.f1645c;
                ArrayList arrayList2 = iVar.f1697b;
                S s3 = this.f1644b;
                arrayList2.remove(s3);
                iVar.f1698c.remove(s3);
                return;
        }
    }
}
