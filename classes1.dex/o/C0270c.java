package o;

import androidx.appcompat.widget.ActionBarOverlayLayout;

/* renamed from: o.c  reason: case insensitive filesystem */
public final class C0270c implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f4175a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ ActionBarOverlayLayout f4176b;

    public /* synthetic */ C0270c(ActionBarOverlayLayout actionBarOverlayLayout, int i) {
        this.f4175a = i;
        this.f4176b = actionBarOverlayLayout;
    }

    public final void run() {
        switch (this.f4175a) {
            case 0:
                ActionBarOverlayLayout actionBarOverlayLayout = this.f4176b;
                actionBarOverlayLayout.h();
                actionBarOverlayLayout.f1281B = actionBarOverlayLayout.i.animate().translationY(0.0f).setListener(actionBarOverlayLayout.f1282C);
                return;
            default:
                ActionBarOverlayLayout actionBarOverlayLayout2 = this.f4176b;
                actionBarOverlayLayout2.h();
                actionBarOverlayLayout2.f1281B = actionBarOverlayLayout2.i.animate().translationY((float) (-actionBarOverlayLayout2.i.getHeight())).setListener(actionBarOverlayLayout2.f1282C);
                return;
        }
    }
}
