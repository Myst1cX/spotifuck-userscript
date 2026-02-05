package o;

import n.C0183B;

/* renamed from: o.I  reason: case insensitive filesystem */
public final class C0254I extends C0315y0 {

    /* renamed from: o  reason: collision with root package name */
    public final /* synthetic */ C0259N f4094o;

    /* renamed from: p  reason: collision with root package name */
    public final /* synthetic */ C0262Q f4095p;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C0254I(C0262Q q2, C0262Q q3, C0259N n2) {
        super(q3);
        this.f4095p = q2;
        this.f4094o = n2;
    }

    public final C0183B b() {
        return this.f4094o;
    }

    public final boolean c() {
        C0262Q q2 = this.f4095p;
        if (q2.getInternalPopup().a()) {
            return true;
        }
        q2.f4127k.f(q2.getTextDirection(), q2.getTextAlignment());
        return true;
    }
}
