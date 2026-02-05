package N0;

import K0.f;
import K0.k;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;

public final class g extends f {

    /* renamed from: q  reason: collision with root package name */
    public final RectF f629q;

    public g(k kVar, RectF rectF) {
        super(kVar);
        this.f629q = rectF;
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [N0.h, K0.g, android.graphics.drawable.Drawable] */
    public final Drawable newDrawable() {
        ? gVar = new K0.g((f) this);
        gVar.f631C = this;
        gVar.invalidateSelf();
        return gVar;
    }

    public g(g gVar) {
        super((f) gVar);
        this.f629q = gVar.f629q;
    }
}
