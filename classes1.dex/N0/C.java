package N0;

import K0.f;
import K0.g;
import android.animation.ValueAnimator;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.material.textfield.TextInputLayout;
import j0.C0151m;

public final class C implements ValueAnimator.AnimatorUpdateListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f609a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Object f610b;

    public /* synthetic */ C(int i, Object obj) {
        this.f609a = i;
        this.f610b = obj;
    }

    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f609a) {
            case 0:
                ((TextInputLayout) this.f610b).A0.k(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            case 1:
                int floatValue = (int) (((Float) valueAnimator.getAnimatedValue()).floatValue() * 255.0f);
                C0151m mVar = (C0151m) this.f610b;
                mVar.f3442c.setAlpha(floatValue);
                mVar.f3443d.setAlpha(floatValue);
                mVar.f3456s.invalidate();
                return;
            default:
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                g gVar = ((BottomSheetBehavior) this.f610b).i;
                if (gVar != null) {
                    f fVar = gVar.f374f;
                    if (fVar.i != floatValue2) {
                        fVar.i = floatValue2;
                        gVar.f377j = true;
                        gVar.invalidateSelf();
                        return;
                    }
                    return;
                }
                return;
        }
    }
}
