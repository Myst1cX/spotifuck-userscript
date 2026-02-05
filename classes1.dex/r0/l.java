package R0;

import android.content.DialogInterface;
import it.deviato.spotifuck.MainActivity;
import it.deviato.spotifuck.SettingsActivity;

public final /* synthetic */ class l implements DialogInterface.OnClickListener {

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ SettingsActivity.a f869f;

    public /* synthetic */ l(SettingsActivity.a aVar) {
        this.f869f = aVar;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        SettingsActivity.a aVar = this.f869f;
        aVar.getClass();
        MainActivity.f3175S = true;
        aVar.E().finish();
    }
}
