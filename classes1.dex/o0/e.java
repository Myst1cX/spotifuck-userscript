package o0;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;

public final class e extends Drawable.ConstantState {

    /* renamed from: a  reason: collision with root package name */
    public final Drawable.ConstantState f4356a;

    public final Drawable newDrawable() {
        f fVar = new f((Context) null);
        Drawable newDrawable = this.f4356a.newDrawable();
        fVar.f4364f = newDrawable;
        newDrawable.setCallback(fVar.f4361k);
        return fVar;
    }

    public final boolean canApplyTheme() {
        return this.f4356a.canApplyTheme();
    }

    public final int getChangingConfigurations() {
        return this.f4356a.getChangingConfigurations();
    }

    public e(Drawable.ConstantState constantState) {
        this.f4356a = constantState;
    }

    public final Drawable newDrawable(Resources resources) {
        f fVar = new f((Context) null);
        Drawable newDrawable = this.f4356a.newDrawable(resources);
        fVar.f4364f = newDrawable;
        newDrawable.setCallback(fVar.f4361k);
        return fVar;
    }

    public final Drawable newDrawable(Resources resources, Resources.Theme theme) {
        f fVar = new f((Context) null);
        Drawable newDrawable = this.f4356a.newDrawable(resources, theme);
        fVar.f4364f = newDrawable;
        newDrawable.setCallback(fVar.f4361k);
        return fVar;
    }
}
