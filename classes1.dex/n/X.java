package N;

import A.b;
import N0.l;
import android.animation.ValueAnimator;
import android.view.View;
import h.N;

public final /* synthetic */ class X implements ValueAnimator.AnimatorUpdateListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f516a = 0;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Object f517b;

    public /* synthetic */ X(b bVar, View view) {
        this.f517b = bVar;
    }

    public /* synthetic */ X(l lVar) {
        this.f517b = lVar;
    }

    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f516a) {
            case 0:
                ((View) ((N) ((b) this.f517b).f2g).f2937o.getParent()).invalidate();
                return;
            default:
                l lVar = (l) this.f517b;
                lVar.getClass();
                lVar.f679d.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
        }
    }
}
