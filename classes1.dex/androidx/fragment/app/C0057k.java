package androidx.fragment.app;

import android.app.Dialog;
import android.content.DialogInterface;

/* renamed from: androidx.fragment.app.k  reason: case insensitive filesystem */
public final class C0057k implements DialogInterface.OnDismissListener {

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ C0059m f1701f;

    public final void onDismiss(DialogInterface dialogInterface) {
        C0059m mVar = this.f1701f;
        Dialog dialog = mVar.f1713i0;
        if (dialog != null) {
            mVar.onDismiss(dialog);
        }
    }

    public C0057k(C0059m mVar) {
        this.f1701f = mVar;
    }
}
