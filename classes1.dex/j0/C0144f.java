package j0;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewPropertyAnimator;

/* renamed from: j0.f  reason: case insensitive filesystem */
public final class C0144f extends AnimatorListenerAdapter {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ a0 f3378a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ int f3379b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ View f3380c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ int f3381d;
    public final /* synthetic */ ViewPropertyAnimator e;

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ C0148j f3382f;

    public C0144f(C0148j jVar, a0 a0Var, int i, View view, int i2, ViewPropertyAnimator viewPropertyAnimator) {
        this.f3382f = jVar;
        this.f3378a = a0Var;
        this.f3379b = i;
        this.f3380c = view;
        this.f3381d = i2;
        this.e = viewPropertyAnimator;
    }

    public final void onAnimationCancel(Animator animator) {
        int i = this.f3379b;
        View view = this.f3380c;
        if (i != 0) {
            view.setTranslationX(0.0f);
        }
        if (this.f3381d != 0) {
            view.setTranslationY(0.0f);
        }
    }

    public final void onAnimationEnd(Animator animator) {
        this.e.setListener((Animator.AnimatorListener) null);
        C0148j jVar = this.f3382f;
        a0 a0Var = this.f3378a;
        jVar.c(a0Var);
        jVar.f3422p.remove(a0Var);
        jVar.i();
    }

    public final void onAnimationStart(Animator animator) {
        this.f3382f.getClass();
    }
}
