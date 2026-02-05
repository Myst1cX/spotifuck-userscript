package I0;

import K0.g;
import android.graphics.drawable.Drawable;

public final class a extends Drawable.ConstantState {

    /* renamed from: a  reason: collision with root package name */
    public g f284a;

    /* renamed from: b  reason: collision with root package name */
    public boolean f285b;

    public final int getChangingConfigurations() {
        return 0;
    }

    public final Drawable newDrawable() {
        return new b(new a(this));
    }

    public a(a aVar) {
        this.f284a = (g) aVar.f284a.f374f.newDrawable();
        this.f285b = aVar.f285b;
    }
}
