package o;

import android.view.ViewTreeObserver;
import android.widget.PopupWindow;
import n.C0189d;

/* renamed from: o.M  reason: case insensitive filesystem */
public final class C0258M implements PopupWindow.OnDismissListener {

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ C0189d f4105f;

    /* renamed from: g  reason: collision with root package name */
    public final /* synthetic */ C0259N f4106g;

    public final void onDismiss() {
        ViewTreeObserver viewTreeObserver = this.f4106g.f4111M.getViewTreeObserver();
        if (viewTreeObserver != null) {
            viewTreeObserver.removeGlobalOnLayoutListener(this.f4105f);
        }
    }

    public C0258M(C0259N n2, C0189d dVar) {
        this.f4106g = n2;
        this.f4105f = dVar;
    }
}
