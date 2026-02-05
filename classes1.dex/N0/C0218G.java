package n0;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.widget.FrameLayout;

/* renamed from: n0.G  reason: case insensitive filesystem */
public final class C0218G extends AnimatorListenerAdapter implements C0230k {

    /* renamed from: a  reason: collision with root package name */
    public final FrameLayout f3952a;

    /* renamed from: b  reason: collision with root package name */
    public final View f3953b;

    /* renamed from: c  reason: collision with root package name */
    public final View f3954c;

    /* renamed from: d  reason: collision with root package name */
    public boolean f3955d = true;
    public final /* synthetic */ C0227h e;

    public final void e(C0232m mVar) {
        throw null;
    }

    public final void f(C0232m mVar) {
    }

    public final void h() {
        this.f3954c.setTag(2131296656, (Object) null);
        this.f3952a.getOverlay().remove(this.f3953b);
        this.f3955d = false;
    }

    public final void onAnimationEnd(Animator animator) {
        h();
    }

    public C0218G(C0227h hVar, FrameLayout frameLayout, View view, View view2) {
        this.e = hVar;
        this.f3952a = frameLayout;
        this.f3953b = view;
        this.f3954c = view2;
    }

    public final void a() {
    }

    public final void d() {
    }

    public final void g(C0232m mVar) {
        if (this.f3955d) {
            h();
        }
    }

    public final void onAnimationEnd(Animator animator, boolean z2) {
        if (!z2) {
            h();
        }
    }

    public final void onAnimationPause(Animator animator) {
        this.f3952a.getOverlay().remove(this.f3953b);
    }

    public final void onAnimationResume(Animator animator) {
        View view = this.f3953b;
        if (view.getParent() == null) {
            this.f3952a.getOverlay().add(view);
        } else {
            this.e.c();
        }
    }

    public final void onAnimationStart(Animator animator, boolean z2) {
        if (z2) {
            View view = this.f3954c;
            View view2 = this.f3953b;
            view.setTag(2131296656, view2);
            this.f3952a.getOverlay().add(view2);
            this.f3955d = true;
        }
    }

    public final void b(C0232m mVar) {
        mVar.x(this);
    }

    public final void c(C0232m mVar) {
        mVar.x(this);
    }
}
