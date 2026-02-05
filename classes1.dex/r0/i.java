package R0;

import android.content.Intent;
import android.os.Message;
import android.view.View;
import androidx.appcompat.widget.Toolbar;
import androidx.preference.Preference;
import com.google.android.material.datepicker.j;
import h.C0117h;
import it.deviato.spotifuck.AppSingleton;
import it.deviato.spotifuck.MainActivity;
import it.deviato.spotifuck.WebService;
import m.C0174a;
import n.C0199n;
import o.a1;
import p0.C0320a;

public final class i implements View.OnClickListener {

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ int f865f;

    /* renamed from: g  reason: collision with root package name */
    public final /* synthetic */ Object f866g;

    public /* synthetic */ i(int i, Object obj) {
        this.f865f = i;
        this.f866g = obj;
    }

    public final void onClick(View view) {
        Message message;
        Message message2;
        Message message3;
        Message message4;
        C0199n nVar;
        switch (this.f865f) {
            case 0:
                boolean isChecked = MainActivity.f3168L.isChecked();
                MainActivity mainActivity = (MainActivity) this.f866g;
                if (isChecked) {
                    AppSingleton.f3148m = true;
                    AppSingleton.i.putBoolean("ServiceOn", true);
                    AppSingleton.i.commit();
                    C0320a.G0(AppSingleton.f3142f, MainActivity.f3170N);
                    mainActivity.s();
                } else {
                    AppSingleton.f3148m = false;
                    AppSingleton.i.putBoolean("ServiceOn", false);
                    AppSingleton.i.commit();
                    mainActivity.getClass();
                    MainActivity.f3165H.setText(2131755240);
                    MainActivity.f3164G.removeView(MainActivity.f3167K);
                    mainActivity.startService(new Intent(AppSingleton.f3142f, WebService.class).setAction("STOP_SERVICE"));
                }
                mainActivity.getClass();
                MainActivity.u();
                return;
            case 1:
                j jVar = (j) this.f866g;
                int i = jVar.f2239d0;
                if (i == 2) {
                    jVar.L(1);
                    return;
                } else if (i == 1) {
                    jVar.L(2);
                    return;
                } else {
                    return;
                }
            case 2:
                ((Preference) this.f866g).r(view);
                return;
            case 3:
                C0117h hVar = (C0117h) this.f866g;
                if (view == hVar.i && (message4 = hVar.f2995k) != null) {
                    message = Message.obtain(message4);
                } else if (view == hVar.f2996l && (message3 = hVar.f2998n) != null) {
                    message = Message.obtain(message3);
                } else if (view != hVar.f2999o || (message2 = hVar.f3001q) == null) {
                    message = null;
                } else {
                    message = Message.obtain(message2);
                }
                if (message != null) {
                    message.sendToTarget();
                }
                hVar.f2985F.obtainMessage(1, hVar.f2988b).sendToTarget();
                return;
            case 4:
                ((C0174a) this.f866g).a();
                return;
            default:
                a1 a1Var = ((Toolbar) this.f866g).f1390Q;
                if (a1Var == null) {
                    nVar = null;
                } else {
                    nVar = a1Var.f4169g;
                }
                if (nVar != null) {
                    nVar.collapseActionView();
                    return;
                }
                return;
        }
    }
}
