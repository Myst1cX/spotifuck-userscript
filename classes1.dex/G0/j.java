package g0;

import android.content.DialogInterface;

public final class j implements DialogInterface.OnMultiChoiceClickListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ k f2565a;

    public final void onClick(DialogInterface dialogInterface, int i, boolean z2) {
        k kVar = this.f2565a;
        if (z2) {
            kVar.f2567w0 = kVar.f2566v0.add(kVar.f2569y0[i].toString()) | kVar.f2567w0;
            return;
        }
        kVar.f2567w0 = kVar.f2566v0.remove(kVar.f2569y0[i].toString()) | kVar.f2567w0;
    }

    public j(k kVar) {
        this.f2565a = kVar;
    }
}
