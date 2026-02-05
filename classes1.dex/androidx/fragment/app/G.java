package androidx.fragment.app;

import java.util.ArrayList;

public final class G implements F {

    /* renamed from: a  reason: collision with root package name */
    public final int f1567a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ H f1568b;

    public final boolean a(ArrayList arrayList, ArrayList arrayList2) {
        H h2 = this.f1568b;
        r rVar = h2.f1601w;
        int i = this.f1567a;
        if (rVar == null || i >= 0 || !rVar.g().M(-1, 0)) {
            return h2.N(arrayList, arrayList2, i, 1);
        }
        return false;
    }

    public G(H h2, int i) {
        this.f1568b = h2;
        this.f1567a = i;
    }
}
