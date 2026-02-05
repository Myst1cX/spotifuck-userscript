package N;

import android.view.View;
import android.view.ViewTreeObserver;

/* renamed from: N.u  reason: case insensitive filesystem */
public final class C0020u implements ViewTreeObserver.OnPreDrawListener, View.OnAttachStateChangeListener {

    /* renamed from: f  reason: collision with root package name */
    public final View f591f;

    /* renamed from: g  reason: collision with root package name */
    public ViewTreeObserver f592g;

    /* renamed from: h  reason: collision with root package name */
    public final Runnable f593h;

    public static void a(View view, Runnable runnable) {
        if (view != null) {
            C0020u uVar = new C0020u(view, runnable);
            view.getViewTreeObserver().addOnPreDrawListener(uVar);
            view.addOnAttachStateChangeListener(uVar);
            return;
        }
        throw new NullPointerException("view == null");
    }

    public final boolean onPreDraw() {
        boolean isAlive = this.f592g.isAlive();
        View view = this.f591f;
        if (isAlive) {
            this.f592g.removeOnPreDrawListener(this);
        } else {
            view.getViewTreeObserver().removeOnPreDrawListener(this);
        }
        view.removeOnAttachStateChangeListener(this);
        this.f593h.run();
        return true;
    }

    public final void onViewDetachedFromWindow(View view) {
        boolean isAlive = this.f592g.isAlive();
        View view2 = this.f591f;
        if (isAlive) {
            this.f592g.removeOnPreDrawListener(this);
        } else {
            view2.getViewTreeObserver().removeOnPreDrawListener(this);
        }
        view2.removeOnAttachStateChangeListener(this);
    }

    public C0020u(View view, Runnable runnable) {
        this.f591f = view;
        this.f592g = view.getViewTreeObserver();
        this.f593h = runnable;
    }

    public final void onViewAttachedToWindow(View view) {
        this.f592g = view.getViewTreeObserver();
    }
}
