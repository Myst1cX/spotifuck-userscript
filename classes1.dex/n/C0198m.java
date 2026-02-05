package n;

import android.content.DialogInterface;
import android.view.KeyEvent;
import android.view.View;
import android.view.Window;
import h.C0118i;

/* renamed from: n.m  reason: case insensitive filesystem */
public final class C0198m implements DialogInterface.OnKeyListener, DialogInterface.OnClickListener, DialogInterface.OnDismissListener, C0208w {

    /* renamed from: f  reason: collision with root package name */
    public C0185D f3894f;

    /* renamed from: g  reason: collision with root package name */
    public C0118i f3895g;

    /* renamed from: h  reason: collision with root package name */
    public C0193h f3896h;

    public final boolean h(C0197l lVar) {
        return false;
    }

    public final void b(C0197l lVar, boolean z2) {
        C0118i iVar;
        if ((z2 || lVar == this.f3894f) && (iVar = this.f3895g) != null) {
            iVar.dismiss();
        }
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        C0193h hVar = this.f3896h;
        if (hVar.f3865k == null) {
            hVar.f3865k = new C0192g(hVar);
        }
        this.f3894f.q(hVar.f3865k.getItem(i), (C0209x) null, 0);
    }

    public final void onDismiss(DialogInterface dialogInterface) {
        this.f3896h.b(this.f3894f, true);
    }

    public final boolean onKey(DialogInterface dialogInterface, int i, KeyEvent keyEvent) {
        Window window;
        View decorView;
        KeyEvent.DispatcherState keyDispatcherState;
        View decorView2;
        KeyEvent.DispatcherState keyDispatcherState2;
        C0185D d2 = this.f3894f;
        if (i == 82 || i == 4) {
            if (keyEvent.getAction() == 0 && keyEvent.getRepeatCount() == 0) {
                Window window2 = this.f3895g.getWindow();
                if (!(window2 == null || (decorView2 = window2.getDecorView()) == null || (keyDispatcherState2 = decorView2.getKeyDispatcherState()) == null)) {
                    keyDispatcherState2.startTracking(keyEvent, this);
                    return true;
                }
            } else if (keyEvent.getAction() == 1 && !keyEvent.isCanceled() && (window = this.f3895g.getWindow()) != null && (decorView = window.getDecorView()) != null && (keyDispatcherState = decorView.getKeyDispatcherState()) != null && keyDispatcherState.isTracking(keyEvent)) {
                d2.c(true);
                dialogInterface.dismiss();
                return true;
            }
        }
        return d2.performShortcut(i, keyEvent, 0);
    }
}
