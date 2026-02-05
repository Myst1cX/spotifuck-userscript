package j0;

import android.graphics.Rect;
import android.view.View;
import androidx.emoji2.text.g;

/* renamed from: j0.x  reason: case insensitive filesystem */
public final class C0161x extends g {

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ int f3517d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0161x(K k2, int i) {
        super(k2);
        this.f3517d = i;
    }

    public final int b(View view) {
        switch (this.f3517d) {
            case 0:
                ((K) this.f1511b).getClass();
                return view.getRight() + ((L) view.getLayoutParams()).f3291b.right + ((L) view.getLayoutParams()).rightMargin;
            default:
                ((K) this.f1511b).getClass();
                return view.getBottom() + ((L) view.getLayoutParams()).f3291b.bottom + ((L) view.getLayoutParams()).bottomMargin;
        }
    }

    public final int c(View view) {
        switch (this.f3517d) {
            case 0:
                L l2 = (L) view.getLayoutParams();
                ((K) this.f1511b).getClass();
                return K.A(view) + l2.leftMargin + l2.rightMargin;
            default:
                L l3 = (L) view.getLayoutParams();
                ((K) this.f1511b).getClass();
                return K.z(view) + l3.topMargin + l3.bottomMargin;
        }
    }

    public final int d(View view) {
        switch (this.f3517d) {
            case 0:
                L l2 = (L) view.getLayoutParams();
                ((K) this.f1511b).getClass();
                return K.z(view) + l2.topMargin + l2.bottomMargin;
            default:
                L l3 = (L) view.getLayoutParams();
                ((K) this.f1511b).getClass();
                return K.A(view) + l3.leftMargin + l3.rightMargin;
        }
    }

    public final int e(View view) {
        switch (this.f3517d) {
            case 0:
                ((K) this.f1511b).getClass();
                return (view.getLeft() - ((L) view.getLayoutParams()).f3291b.left) - ((L) view.getLayoutParams()).leftMargin;
            default:
                ((K) this.f1511b).getClass();
                return (view.getTop() - ((L) view.getLayoutParams()).f3291b.top) - ((L) view.getLayoutParams()).topMargin;
        }
    }

    public final int f() {
        switch (this.f3517d) {
            case 0:
                return ((K) this.f1511b).f3288n;
            default:
                return ((K) this.f1511b).f3289o;
        }
    }

    public final int g() {
        switch (this.f3517d) {
            case 0:
                K k2 = (K) this.f1511b;
                return k2.f3288n - k2.F();
            default:
                K k3 = (K) this.f1511b;
                return k3.f3289o - k3.D();
        }
    }

    public final int h() {
        switch (this.f3517d) {
            case 0:
                return ((K) this.f1511b).F();
            default:
                return ((K) this.f1511b).D();
        }
    }

    public final int i() {
        switch (this.f3517d) {
            case 0:
                return ((K) this.f1511b).f3286l;
            default:
                return ((K) this.f1511b).f3287m;
        }
    }

    public final int j() {
        switch (this.f3517d) {
            case 0:
                return ((K) this.f1511b).f3287m;
            default:
                return ((K) this.f1511b).f3286l;
        }
    }

    public final int k() {
        switch (this.f3517d) {
            case 0:
                return ((K) this.f1511b).E();
            default:
                return ((K) this.f1511b).G();
        }
    }

    public final int l() {
        switch (this.f3517d) {
            case 0:
                K k2 = (K) this.f1511b;
                return (k2.f3288n - k2.E()) - k2.F();
            default:
                K k3 = (K) this.f1511b;
                return (k3.f3289o - k3.G()) - k3.D();
        }
    }

    public final int n(View view) {
        switch (this.f3517d) {
            case 0:
                Rect rect = (Rect) this.f1512c;
                ((K) this.f1511b).K(view, rect);
                return rect.right;
            default:
                Rect rect2 = (Rect) this.f1512c;
                ((K) this.f1511b).K(view, rect2);
                return rect2.bottom;
        }
    }

    public final int o(View view) {
        switch (this.f3517d) {
            case 0:
                Rect rect = (Rect) this.f1512c;
                ((K) this.f1511b).K(view, rect);
                return rect.left;
            default:
                Rect rect2 = (Rect) this.f1512c;
                ((K) this.f1511b).K(view, rect2);
                return rect2.top;
        }
    }

    public final void p(int i) {
        switch (this.f3517d) {
            case 0:
                ((K) this.f1511b).O(i);
                return;
            default:
                ((K) this.f1511b).P(i);
                return;
        }
    }
}
