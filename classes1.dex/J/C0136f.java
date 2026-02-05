package j;

import android.graphics.drawable.Drawable;
import o0.f;

/* renamed from: j.f  reason: case insensitive filesystem */
public final class C0136f implements Drawable.Callback {

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ int f3247f = 0;

    /* renamed from: g  reason: collision with root package name */
    public Object f3248g;

    public /* synthetic */ C0136f() {
    }

    public C0136f(f fVar) {
        this.f3248g = fVar;
    }

    private final void a(Drawable drawable) {
    }

    public final void invalidateDrawable(Drawable drawable) {
        switch (this.f3247f) {
            case 0:
                return;
            default:
                ((f) this.f3248g).invalidateSelf();
                return;
        }
    }

    public final void scheduleDrawable(Drawable drawable, Runnable runnable, long j2) {
        switch (this.f3247f) {
            case 0:
                Drawable.Callback callback = (Drawable.Callback) this.f3248g;
                if (callback != null) {
                    callback.scheduleDrawable(drawable, runnable, j2);
                    return;
                }
                return;
            default:
                ((f) this.f3248g).scheduleSelf(runnable, j2);
                return;
        }
    }

    public final void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        switch (this.f3247f) {
            case 0:
                Drawable.Callback callback = (Drawable.Callback) this.f3248g;
                if (callback != null) {
                    callback.unscheduleDrawable(drawable, runnable);
                    return;
                }
                return;
            default:
                ((f) this.f3248g).unscheduleSelf(runnable);
                return;
        }
    }
}
