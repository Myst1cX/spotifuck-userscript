package o;

public final class D0 implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f4055a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ H0 f4056b;

    public /* synthetic */ D0(H0 h02, int i) {
        this.f4055a = i;
        this.f4056b = h02;
    }

    public final void run() {
        switch (this.f4055a) {
            case 0:
                C0309v0 v0Var = this.f4056b.f4076h;
                if (v0Var != null) {
                    v0Var.setListSelectionHidden(true);
                    v0Var.requestLayout();
                    return;
                }
                return;
            default:
                H0 h02 = this.f4056b;
                C0309v0 v0Var2 = h02.f4076h;
                if (v0Var2 != null && v0Var2.isAttachedToWindow() && h02.f4076h.getCount() > h02.f4076h.getChildCount() && h02.f4076h.getChildCount() <= h02.f4085r) {
                    h02.f4073E.setInputMethodMode(2);
                    h02.i();
                    return;
                }
                return;
        }
    }
}
