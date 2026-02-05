package n0;

import T0.g;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewGroup;

/* renamed from: n0.F  reason: case insensitive filesystem */
public final class C0217F extends AnimatorListenerAdapter implements C0230k {

    /* renamed from: a  reason: collision with root package name */
    public final View f3947a;

    /* renamed from: b  reason: collision with root package name */
    public final int f3948b;

    /* renamed from: c  reason: collision with root package name */
    public final ViewGroup f3949c;

    /* renamed from: d  reason: collision with root package name */
    public final boolean f3950d;
    public boolean e;

    /* renamed from: f  reason: collision with root package name */
    public boolean f3951f = false;

    public final void a() {
        h(false);
        if (!this.f3951f) {
            C0242w.b(this.f3947a, this.f3948b);
        }
    }

    public final void d() {
        h(true);
        if (!this.f3951f) {
            C0242w.b(this.f3947a, 0);
        }
    }

    public final void e(C0232m mVar) {
        throw null;
    }

    public final void f(C0232m mVar) {
    }

    public final void onAnimationCancel(Animator animator) {
        this.f3951f = true;
    }

    public final void onAnimationEnd(Animator animator) {
        if (!this.f3951f) {
            C0242w.b(this.f3947a, this.f3948b);
            ViewGroup viewGroup = this.f3949c;
            if (viewGroup != null) {
                viewGroup.invalidate();
            }
        }
        h(false);
    }

    public final void onAnimationStart(Animator animator) {
    }

    public final void g(C0232m mVar) {
    }

    public final void h(boolean z2) {
        ViewGroup viewGroup;
        if (this.f3950d && this.e != z2 && (viewGroup = this.f3949c) != null) {
            this.e = z2;
            g.Q(viewGroup, z2);
        }
    }

    public final void onAnimationRepeat(Animator animator) {
    }

    public final void onAnimationStart(Animator animator, boolean z2) {
        if (z2) {
            C0242w.b(this.f3947a, 0);
            ViewGroup viewGroup = this.f3949c;
            if (viewGroup != null) {
                viewGroup.invalidate();
            }
        }
    }

    public C0217F(View view, int i) {
        this.f3947a = view;
        this.f3948b = i;
        this.f3949c = (ViewGroup) view.getParent();
        this.f3950d = true;
        h(true);
    }

    public final void b(C0232m mVar) {
        mVar.x(this);
    }

    public final void c(C0232m mVar) {
        mVar.x(this);
    }

    public final void onAnimationEnd(Animator animator, boolean z2) {
        if (!z2) {
            if (!this.f3951f) {
                C0242w.b(this.f3947a, this.f3948b);
                ViewGroup viewGroup = this.f3949c;
                if (viewGroup != null) {
                    viewGroup.invalidate();
                }
            }
            h(false);
        }
    }
}
