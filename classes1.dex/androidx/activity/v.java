package androidx.activity;

import S0.c;
import Y0.a;
import Z0.d;

public final class v extends d implements a {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f1203a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ A f1204b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public /* synthetic */ v(A a2, int i) {
        super(0);
        this.f1203a = i;
        this.f1204b = a2;
    }

    public final Object a() {
        switch (this.f1203a) {
            case 0:
                this.f1204b.c();
                return c.f888c;
            case 1:
                this.f1204b.b();
                return c.f888c;
            default:
                this.f1204b.c();
                return c.f888c;
        }
    }
}
