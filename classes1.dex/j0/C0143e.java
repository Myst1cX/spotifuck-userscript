package j0;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewPropertyAnimator;

/* renamed from: j0.e  reason: case insensitive filesystem */
public final class C0143e extends AnimatorListenerAdapter {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f3368a = 1;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ a0 f3369b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ View f3370c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ ViewPropertyAnimator f3371d;
    public final /* synthetic */ C0148j e;

    public C0143e(C0148j jVar, a0 a0Var, ViewPropertyAnimator viewPropertyAnimator, View view) {
        this.e = jVar;
        this.f3369b = a0Var;
        this.f3371d = viewPropertyAnimator;
        this.f3370c = view;
    }

    public C0143e(C0148j jVar, a0 a0Var, View view, ViewPropertyAnimator viewPropertyAnimator) {
        this.e = jVar;
        this.f3369b = a0Var;
        this.f3370c = view;
        this.f3371d = viewPropertyAnimator;
    }

    public void onAnimationCancel(Animator animator) {
        switch (this.f3368a) {
            case 1:
                this.f3370c.setAlpha(1.0f);
                return;
            default:
                super.onAnimationCancel(animator);
                return;
        }
    }

    public final void onAnimationEnd(Animator animator) {
        switch (this.f3368a) {
            case 0:
                this.f3371d.setListener((Animator.AnimatorListener) null);
                this.f3370c.setAlpha(1.0f);
                C0148j jVar = this.e;
                a0 a0Var = this.f3369b;
                jVar.c(a0Var);
                jVar.f3423q.remove(a0Var);
                jVar.i();
                return;
            default:
                this.f3371d.setListener((Animator.AnimatorListener) null);
                C0148j jVar2 = this.e;
                a0 a0Var2 = this.f3369b;
                jVar2.c(a0Var2);
                jVar2.f3421o.remove(a0Var2);
                jVar2.i();
                return;
        }
    }

    public final void onAnimationStart(Animator animator) {
        switch (this.f3368a) {
            case 0:
                this.e.getClass();
                return;
            default:
                this.e.getClass();
                return;
        }
    }
}
