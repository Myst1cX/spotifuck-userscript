package o0;

import G.a;
import android.content.res.ColorStateList;
import android.graphics.drawable.Animatable2;
import android.graphics.drawable.Drawable;
import y0.C0356a;
import y0.C0358c;

public final class b extends Animatable2.AnimationCallback {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ C0356a f4351a;

    public b(C0356a aVar) {
        this.f4351a = aVar;
    }

    public final void onAnimationEnd(Drawable drawable) {
        ColorStateList colorStateList = this.f4351a.f5147b.f5166t;
        if (colorStateList != null) {
            a.h(drawable, colorStateList);
        }
    }

    public final void onAnimationStart(Drawable drawable) {
        C0358c cVar = this.f4351a.f5147b;
        ColorStateList colorStateList = cVar.f5166t;
        if (colorStateList != null) {
            a.g(drawable, colorStateList.getColorForState(cVar.f5170x, colorStateList.getDefaultColor()));
        }
    }
}
