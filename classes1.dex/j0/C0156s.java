package j0;

import android.view.View;
import androidx.emoji2.text.g;

/* renamed from: j0.s  reason: case insensitive filesystem */
public final class C0156s {

    /* renamed from: a  reason: collision with root package name */
    public g f3485a;

    /* renamed from: b  reason: collision with root package name */
    public int f3486b;

    /* renamed from: c  reason: collision with root package name */
    public int f3487c;

    /* renamed from: d  reason: collision with root package name */
    public boolean f3488d;
    public boolean e;

    public final void d() {
        this.f3486b = -1;
        this.f3487c = Integer.MIN_VALUE;
        this.f3488d = false;
        this.e = false;
    }

    public final void a() {
        int i;
        if (this.f3488d) {
            i = this.f3485a.g();
        } else {
            i = this.f3485a.k();
        }
        this.f3487c = i;
    }

    public final void b(View view, int i) {
        if (this.f3488d) {
            this.f3487c = this.f3485a.m() + this.f3485a.b(view);
        } else {
            this.f3487c = this.f3485a.e(view);
        }
        this.f3486b = i;
    }

    public final void c(View view, int i) {
        int m2 = this.f3485a.m();
        if (m2 >= 0) {
            b(view, i);
            return;
        }
        this.f3486b = i;
        if (this.f3488d) {
            int g2 = (this.f3485a.g() - m2) - this.f3485a.b(view);
            this.f3487c = this.f3485a.g() - g2;
            if (g2 > 0) {
                int c2 = this.f3487c - this.f3485a.c(view);
                int k2 = this.f3485a.k();
                int min = c2 - (Math.min(this.f3485a.e(view) - k2, 0) + k2);
                if (min < 0) {
                    this.f3487c = Math.min(g2, -min) + this.f3487c;
                    return;
                }
                return;
            }
            return;
        }
        int e2 = this.f3485a.e(view);
        int k3 = e2 - this.f3485a.k();
        this.f3487c = e2;
        if (k3 > 0) {
            int g3 = (this.f3485a.g() - Math.min(0, (this.f3485a.g() - m2) - this.f3485a.b(view))) - (this.f3485a.c(view) + e2);
            if (g3 < 0) {
                this.f3487c -= Math.min(k3, -g3);
            }
        }
    }

    public final String toString() {
        return "AnchorInfo{mPosition=" + this.f3486b + ", mCoordinate=" + this.f3487c + ", mLayoutFromEnd=" + this.f3488d + ", mValid=" + this.e + '}';
    }

    public C0156s() {
        d();
    }
}
