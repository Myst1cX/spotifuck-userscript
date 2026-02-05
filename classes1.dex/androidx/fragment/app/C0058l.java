package androidx.fragment.app;

import android.app.Dialog;
import android.view.View;

/* renamed from: androidx.fragment.app.l  reason: case insensitive filesystem */
public final class C0058l extends v {

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ C0061o f1702f;

    /* renamed from: g  reason: collision with root package name */
    public final /* synthetic */ C0059m f1703g;

    public final View e(int i) {
        C0061o oVar = this.f1702f;
        if (oVar.f()) {
            return oVar.e(i);
        }
        Dialog dialog = this.f1703g.f1713i0;
        if (dialog != null) {
            return dialog.findViewById(i);
        }
        return null;
    }

    public final boolean f() {
        if (this.f1702f.f() || this.f1703g.m0) {
            return true;
        }
        return false;
    }

    public C0058l(C0059m mVar, C0061o oVar) {
        this.f1703g = mVar;
        this.f1702f = oVar;
    }
}
