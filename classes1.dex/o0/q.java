package o0;

import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.VectorDrawable;

public final class q extends Drawable.ConstantState {

    /* renamed from: a  reason: collision with root package name */
    public final Drawable.ConstantState f4410a;

    public final Drawable newDrawable() {
        r rVar = new r();
        rVar.f4364f = (VectorDrawable) this.f4410a.newDrawable();
        return rVar;
    }

    public final boolean canApplyTheme() {
        return this.f4410a.canApplyTheme();
    }

    public int getChangingConfigurations() {
        return this.f4410a.getChangingConfigurations();
    }

    public q(Drawable.ConstantState constantState) {
        this.f4410a = constantState;
    }

    public final Drawable newDrawable(Resources resources) {
        r rVar = new r();
        rVar.f4364f = (VectorDrawable) this.f4410a.newDrawable(resources);
        return rVar;
    }

    public final Drawable newDrawable(Resources resources, Resources.Theme theme) {
        r rVar = new r();
        rVar.f4364f = (VectorDrawable) this.f4410a.newDrawable(resources, theme);
        return rVar;
    }
}
