package o;

public final /* synthetic */ class h1 implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f4204a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ i1 f4205b;

    public /* synthetic */ h1(i1 i1Var, int i) {
        this.f4204a = i;
        this.f4205b = i1Var;
    }

    public final void run() {
        switch (this.f4204a) {
            case 0:
                this.f4205b.c(false);
                return;
            default:
                this.f4205b.a();
                return;
        }
    }
}
