package R0;

import android.view.ContextThemeWrapper;
import androidx.preference.Preference;
import g0.m;
import h.C0115f;
import it.deviato.spotifuck.MainActivity;
import it.deviato.spotifuck.SettingsActivity;

public final /* synthetic */ class j implements m {

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ int f867f;

    /* renamed from: g  reason: collision with root package name */
    public final /* synthetic */ SettingsActivity.a f868g;

    public /* synthetic */ j(SettingsActivity.a aVar, int i) {
        this.f867f = i;
        this.f868g = aVar;
    }

    /* JADX WARNING: type inference failed for: r3v3, types: [android.content.DialogInterface$OnClickListener, java.lang.Object] */
    public final void a(Preference preference) {
        switch (this.f867f) {
            case 0:
                SettingsActivity.a aVar = this.f868g;
                aVar.getClass();
                MainActivity.f3174R = true;
                aVar.E().finish();
                return;
            default:
                SettingsActivity.a aVar2 = this.f868g;
                K.j jVar = new K.j(aVar2.F());
                C0115f fVar = (C0115f) jVar.f333g;
                fVar.f2965d = fVar.f2962a.getText(2131755064);
                ContextThemeWrapper contextThemeWrapper = fVar.f2962a;
                fVar.f2966f = contextThemeWrapper.getText(2131755063);
                ? obj = new Object();
                fVar.i = contextThemeWrapper.getText(2131755062);
                fVar.f2969j = obj;
                l lVar = new l(aVar2);
                fVar.f2967g = contextThemeWrapper.getText(2131755065);
                fVar.f2968h = lVar;
                jVar.a().show();
                return;
        }
    }
}
