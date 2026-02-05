package j0;

import android.view.View;

public final class I {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f3271a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ K f3272b;

    public /* synthetic */ I(K k2, int i) {
        this.f3271a = i;
        this.f3272b = k2;
    }

    public final int a(View view) {
        switch (this.f3271a) {
            case 0:
                this.f3272b.getClass();
                return view.getRight() + ((L) view.getLayoutParams()).f3291b.right + ((L) view.getLayoutParams()).rightMargin;
            default:
                this.f3272b.getClass();
                return view.getBottom() + ((L) view.getLayoutParams()).f3291b.bottom + ((L) view.getLayoutParams()).bottomMargin;
        }
    }

    public final int b(View view) {
        switch (this.f3271a) {
            case 0:
                this.f3272b.getClass();
                return (view.getLeft() - ((L) view.getLayoutParams()).f3291b.left) - ((L) view.getLayoutParams()).leftMargin;
            default:
                this.f3272b.getClass();
                return (view.getTop() - ((L) view.getLayoutParams()).f3291b.top) - ((L) view.getLayoutParams()).topMargin;
        }
    }

    public final int c() {
        switch (this.f3271a) {
            case 0:
                K k2 = this.f3272b;
                return k2.f3288n - k2.F();
            default:
                K k3 = this.f3272b;
                return k3.f3289o - k3.D();
        }
    }

    public final int d() {
        switch (this.f3271a) {
            case 0:
                return this.f3272b.E();
            default:
                return this.f3272b.G();
        }
    }
}
