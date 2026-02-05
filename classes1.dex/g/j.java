package G;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;

public final class j extends Drawable.ConstantState {

    /* renamed from: a  reason: collision with root package name */
    public int f257a;

    /* renamed from: b  reason: collision with root package name */
    public Drawable.ConstantState f258b;

    /* renamed from: c  reason: collision with root package name */
    public ColorStateList f259c;

    /* renamed from: d  reason: collision with root package name */
    public PorterDuff.Mode f260d;

    public final Drawable newDrawable() {
        return newDrawable((Resources) null);
    }

    public final int getChangingConfigurations() {
        int i;
        int i2 = this.f257a;
        Drawable.ConstantState constantState = this.f258b;
        if (constantState != null) {
            i = constantState.getChangingConfigurations();
        } else {
            i = 0;
        }
        return i2 | i;
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [G.i, android.graphics.drawable.Drawable] */
    public final Drawable newDrawable(Resources resources) {
        ? drawable = new Drawable();
        drawable.i = this;
        Drawable.ConstantState constantState = this.f258b;
        if (constantState != null) {
            drawable.h(constantState.newDrawable(resources));
        }
        i.a();
        return drawable;
    }
}
