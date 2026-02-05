package o0;

import android.animation.AnimatorSet;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import java.util.ArrayList;
import r.b;

public final class d extends Drawable.ConstantState {

    /* renamed from: a  reason: collision with root package name */
    public r f4352a;

    /* renamed from: b  reason: collision with root package name */
    public AnimatorSet f4353b;

    /* renamed from: c  reason: collision with root package name */
    public ArrayList f4354c;

    /* renamed from: d  reason: collision with root package name */
    public b f4355d;

    public final int getChangingConfigurations() {
        return 0;
    }

    public final Drawable newDrawable() {
        throw new IllegalStateException("No constant state support for SDK < 24.");
    }

    public final Drawable newDrawable(Resources resources) {
        throw new IllegalStateException("No constant state support for SDK < 24.");
    }
}
