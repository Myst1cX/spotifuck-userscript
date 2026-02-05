package androidx.fragment.app;

import M.a;
import android.content.Intent;
import android.content.res.Configuration;
import h.C0121l;

/* renamed from: androidx.fragment.app.s  reason: case insensitive filesystem */
public final /* synthetic */ class C0064s implements a {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f1772a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ C0121l f1773b;

    public /* synthetic */ C0064s(C0121l lVar, int i) {
        this.f1772a = i;
        this.f1773b = lVar;
    }

    public final void a(Object obj) {
        switch (this.f1772a) {
            case 0:
                Configuration configuration = (Configuration) obj;
                this.f1773b.f3019x.x();
                return;
            default:
                Intent intent = (Intent) obj;
                this.f1773b.f3019x.x();
                return;
        }
    }
}
