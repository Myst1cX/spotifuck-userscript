package n0;

/* renamed from: n0.r  reason: case insensitive filesystem */
public final class C0237r extends C0233n {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f4025a = 1;

    /* renamed from: b  reason: collision with root package name */
    public C0232m f4026b;

    public /* synthetic */ C0237r() {
    }

    public C0237r(C0232m mVar) {
        this.f4026b = mVar;
    }

    public final void b(C0232m mVar) {
        switch (this.f4025a) {
            case 0:
                this.f4026b.z();
                mVar.x(this);
                return;
            default:
                C0220a aVar = (C0220a) this.f4026b;
                int i = aVar.f3963C - 1;
                aVar.f3963C = i;
                if (i == 0) {
                    aVar.f3964D = false;
                    aVar.m();
                }
                mVar.x(this);
                return;
        }
    }

    public void e(C0232m mVar) {
        switch (this.f4025a) {
            case 1:
                C0220a aVar = (C0220a) this.f4026b;
                if (!aVar.f3964D) {
                    aVar.G();
                    aVar.f3964D = true;
                    return;
                }
                return;
            default:
                return;
        }
    }
}
