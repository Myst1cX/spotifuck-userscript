package y;

import v.C0344a;
import v.C0347d;

/* renamed from: y.a  reason: case insensitive filesystem */
public final class C0355a extends c {

    /* renamed from: m  reason: collision with root package name */
    public int f4936m;

    /* renamed from: n  reason: collision with root package name */
    public int f4937n;

    /* renamed from: o  reason: collision with root package name */
    public C0344a f4938o;

    public boolean getAllowsGoneWidget() {
        return this.f4938o.f4683t0;
    }

    public int getMargin() {
        return this.f4938o.f4684u0;
    }

    public int getType() {
        return this.f4936m;
    }

    public final void h(C0347d dVar, boolean z2) {
        int i = this.f4936m;
        this.f4937n = i;
        if (z2) {
            if (i == 5) {
                this.f4937n = 1;
            } else if (i == 6) {
                this.f4937n = 0;
            }
        } else if (i == 5) {
            this.f4937n = 0;
        } else if (i == 6) {
            this.f4937n = 1;
        }
        if (dVar instanceof C0344a) {
            ((C0344a) dVar).f4682s0 = this.f4937n;
        }
    }

    public void setAllowsGoneWidget(boolean z2) {
        this.f4938o.f4683t0 = z2;
    }

    public void setMargin(int i) {
        this.f4938o.f4684u0 = i;
    }

    public void setType(int i) {
        this.f4936m = i;
    }

    public void setDpMargin(int i) {
        this.f4938o.f4684u0 = (int) ((((float) i) * getResources().getDisplayMetrics().density) + 0.5f);
    }
}
