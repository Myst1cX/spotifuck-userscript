package g0;

import android.content.DialogInterface;

public final class g implements DialogInterface.OnClickListener {

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ h f2560f;

    public final void onClick(DialogInterface dialogInterface, int i) {
        h hVar = this.f2560f;
        hVar.f2561v0 = i;
        hVar.f2578u0 = -1;
        dialogInterface.dismiss();
    }

    public g(h hVar) {
        this.f2560f = hVar;
    }
}
