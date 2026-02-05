package j0;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewPropertyAnimator;

/* renamed from: j0.g  reason: case insensitive filesystem */
public final class C0145g extends AnimatorListenerAdapter {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f3383a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ C0146h f3384b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ ViewPropertyAnimator f3385c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ View f3386d;
    public final /* synthetic */ C0148j e;

    public /* synthetic */ C0145g(C0148j jVar, C0146h hVar, ViewPropertyAnimator viewPropertyAnimator, View view, int i) {
        this.f3383a = i;
        this.e = jVar;
        this.f3384b = hVar;
        this.f3385c = viewPropertyAnimator;
        this.f3386d = view;
    }

    public final void onAnimationEnd(Animator animator) {
        switch (this.f3383a) {
            case 0:
                this.f3385c.setListener((Animator.AnimatorListener) null);
                View view = this.f3386d;
                view.setAlpha(1.0f);
                view.setTranslationX(0.0f);
                view.setTranslationY(0.0f);
                C0146h hVar = this.f3384b;
                a0 a0Var = hVar.f3391a;
                C0148j jVar = this.e;
                jVar.c(a0Var);
                jVar.f3424r.remove(hVar.f3391a);
                jVar.i();
                return;
            default:
                this.f3385c.setListener((Animator.AnimatorListener) null);
                View view2 = this.f3386d;
                view2.setAlpha(1.0f);
                view2.setTranslationX(0.0f);
                view2.setTranslationY(0.0f);
                C0146h hVar2 = this.f3384b;
                a0 a0Var2 = hVar2.f3392b;
                C0148j jVar2 = this.e;
                jVar2.c(a0Var2);
                jVar2.f3424r.remove(hVar2.f3392b);
                jVar2.i();
                return;
        }
    }

    public final void onAnimationStart(Animator animator) {
        switch (this.f3383a) {
            case 0:
                a0 a0Var = this.f3384b.f3391a;
                this.e.getClass();
                return;
            default:
                a0 a0Var2 = this.f3384b.f3392b;
                this.e.getClass();
                return;
        }
    }
}
