package I0;

import G.g;
import K0.k;
import K0.v;
import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;

public final class b extends Drawable implements v, g {

    /* renamed from: f  reason: collision with root package name */
    public a f286f;

    public final boolean isStateful() {
        return true;
    }

    public final void draw(Canvas canvas) {
        a aVar = this.f286f;
        if (aVar.f285b) {
            aVar.f284a.draw(canvas);
        }
    }

    public final Drawable.ConstantState getConstantState() {
        return this.f286f;
    }

    public final int getOpacity() {
        this.f286f.f284a.getClass();
        return -3;
    }

    public final Drawable mutate() {
        this.f286f = new a(this.f286f);
        return this;
    }

    public final void setAlpha(int i) {
        this.f286f.f284a.setAlpha(i);
    }

    public final void setColorFilter(ColorFilter colorFilter) {
        this.f286f.f284a.setColorFilter(colorFilter);
    }

    public final void setShapeAppearanceModel(k kVar) {
        this.f286f.f284a.setShapeAppearanceModel(kVar);
    }

    public final void setTint(int i) {
        this.f286f.f284a.setTint(i);
    }

    public final void setTintList(ColorStateList colorStateList) {
        this.f286f.f284a.setTintList(colorStateList);
    }

    public final void setTintMode(PorterDuff.Mode mode) {
        this.f286f.f284a.setTintMode(mode);
    }

    public b(a aVar) {
        this.f286f = aVar;
    }

    public final void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        this.f286f.f284a.setBounds(rect);
    }

    public final boolean onStateChange(int[] iArr) {
        boolean onStateChange = super.onStateChange(iArr);
        if (this.f286f.f284a.setState(iArr)) {
            onStateChange = true;
        }
        boolean b2 = d.b(iArr);
        a aVar = this.f286f;
        if (aVar.f285b == b2) {
            return onStateChange;
        }
        aVar.f285b = b2;
        return true;
    }
}
