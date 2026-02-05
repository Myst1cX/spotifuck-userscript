package j0;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* renamed from: j0.l  reason: case insensitive filesystem */
public final class C0150l extends AnimatorListenerAdapter {

    /* renamed from: a  reason: collision with root package name */
    public boolean f3434a = false;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ C0151m f3435b;

    public final void onAnimationCancel(Animator animator) {
        this.f3434a = true;
    }

    public C0150l(C0151m mVar) {
        this.f3435b = mVar;
    }

    public final void onAnimationEnd(Animator animator) {
        if (this.f3434a) {
            this.f3434a = false;
            return;
        }
        C0151m mVar = this.f3435b;
        if (((Float) mVar.f3463z.getAnimatedValue()).floatValue() == 0.0f) {
            mVar.f3438A = 0;
            mVar.g(0);
            return;
        }
        mVar.f3438A = 2;
        mVar.f3456s.invalidate();
    }
}
