package n0;

import K0.e;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.graphics.Paint;
import android.view.View;

/* renamed from: n0.g  reason: case insensitive filesystem */
public final class C0226g extends AnimatorListenerAdapter implements C0230k {

    /* renamed from: a  reason: collision with root package name */
    public final View f3981a;

    /* renamed from: b  reason: collision with root package name */
    public boolean f3982b = false;

    public final void b(C0232m mVar) {
        throw null;
    }

    public final void c(C0232m mVar) {
    }

    public final void d() {
        this.f3981a.setTag(2131296769, (Object) null);
    }

    public final void e(C0232m mVar) {
        throw null;
    }

    public final void onAnimationEnd(Animator animator) {
        onAnimationEnd(animator, false);
    }

    public final void a() {
        float f2;
        View view = this.f3981a;
        if (view.getVisibility() == 0) {
            f2 = C0242w.f4031a.f(view);
        } else {
            f2 = 0.0f;
        }
        view.setTag(2131296769, Float.valueOf(f2));
    }

    public final void f(C0232m mVar) {
    }

    public final void g(C0232m mVar) {
    }

    public final void onAnimationCancel(Animator animator) {
        C0242w.f4031a.o(this.f3981a, 1.0f);
    }

    public final void onAnimationEnd(Animator animator, boolean z2) {
        boolean z3 = this.f3982b;
        View view = this.f3981a;
        if (z3) {
            view.setLayerType(0, (Paint) null);
        }
        if (!z2) {
            e eVar = C0242w.f4031a;
            eVar.o(view, 1.0f);
            eVar.getClass();
        }
    }

    public final void onAnimationStart(Animator animator) {
        View view = this.f3981a;
        if (view.hasOverlappingRendering() && view.getLayerType() == 0) {
            this.f3982b = true;
            view.setLayerType(2, (Paint) null);
        }
    }

    public C0226g(View view) {
        this.f3981a = view;
    }
}
