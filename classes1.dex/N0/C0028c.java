package N0;

import android.animation.ValueAnimator;
import com.google.android.material.internal.CheckableImageButton;

/* renamed from: N0.c  reason: case insensitive filesystem */
public final /* synthetic */ class C0028c implements ValueAnimator.AnimatorUpdateListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f618a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ C0030e f619b;

    public /* synthetic */ C0028c(C0030e eVar, int i) {
        this.f618a = i;
        this.f619b = eVar;
    }

    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f618a) {
            case 0:
                C0030e eVar = this.f619b;
                eVar.getClass();
                eVar.f679d.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            default:
                C0030e eVar2 = this.f619b;
                eVar2.getClass();
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                CheckableImageButton checkableImageButton = eVar2.f679d;
                checkableImageButton.setScaleX(floatValue);
                checkableImageButton.setScaleY(floatValue);
                return;
        }
    }
}
