package N0;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* renamed from: N0.d  reason: case insensitive filesystem */
public final class C0029d extends AnimatorListenerAdapter {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f620a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ C0030e f621b;

    public /* synthetic */ C0029d(C0030e eVar, int i) {
        this.f620a = i;
        this.f621b = eVar;
    }

    public void onAnimationEnd(Animator animator) {
        switch (this.f620a) {
            case 1:
                this.f621b.f677b.h(false);
                return;
            default:
                super.onAnimationEnd(animator);
                return;
        }
    }

    public void onAnimationStart(Animator animator) {
        switch (this.f620a) {
            case 0:
                this.f621b.f677b.h(true);
                return;
            default:
                super.onAnimationStart(animator);
                return;
        }
    }
}
