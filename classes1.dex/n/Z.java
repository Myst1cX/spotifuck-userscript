package N;

import android.animation.Animator;
import android.view.View;
import java.lang.ref.WeakReference;

public final class Z {

    /* renamed from: a  reason: collision with root package name */
    public final WeakReference f520a;

    public final void a(float f2) {
        View view = (View) this.f520a.get();
        if (view != null) {
            view.animate().alpha(f2);
        }
    }

    public final void b() {
        View view = (View) this.f520a.get();
        if (view != null) {
            view.animate().cancel();
        }
    }

    public final void c(long j2) {
        View view = (View) this.f520a.get();
        if (view != null) {
            view.animate().setDuration(j2);
        }
    }

    public final void d(C0001a0 a0Var) {
        View view = (View) this.f520a.get();
        if (view == null) {
            return;
        }
        if (a0Var != null) {
            view.animate().setListener(new Y(a0Var, view));
        } else {
            view.animate().setListener((Animator.AnimatorListener) null);
        }
    }

    public final void e(float f2) {
        View view = (View) this.f520a.get();
        if (view != null) {
            view.animate().translationY(f2);
        }
    }

    public Z(View view) {
        this.f520a = new WeakReference(view);
    }
}
