package androidx.fragment.app;

import android.app.Dialog;
import android.content.DialogInterface;

/* renamed from: androidx.fragment.app.j  reason: case insensitive filesystem */
public final class C0056j implements DialogInterface.OnCancelListener {

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ C0059m f1700f;

    public final void onCancel(DialogInterface dialogInterface) {
        C0059m mVar = this.f1700f;
        Dialog dialog = mVar.f1713i0;
        if (dialog != null) {
            mVar.onCancel(dialog);
        }
    }

    public C0056j(C0059m mVar) {
        this.f1700f = mVar;
    }
}
