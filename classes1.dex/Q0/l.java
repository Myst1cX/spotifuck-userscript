package Q0;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import androidx.fragment.app.C0053g;
import r1.h;

public final class l extends BroadcastReceiver {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f818a = 0;

    /* renamed from: b  reason: collision with root package name */
    public final Object f819b;

    public l(m mVar) {
        this.f819b = mVar;
    }

    public final void onReceive(Context context, Intent intent) {
        Object obj = this.f819b;
        switch (this.f818a) {
            case 0:
                if (intent != null) {
                    String action = intent.getAction();
                    m mVar = (m) obj;
                    if ("android.intent.action.AIRPLANE_MODE".equals(action)) {
                        if (intent.hasExtra("state")) {
                            boolean booleanExtra = intent.getBooleanExtra("state", false);
                            j jVar = mVar.f826h;
                            jVar.sendMessage(jVar.obtainMessage(10, booleanExtra ? 1 : 0, 0));
                            return;
                        }
                        return;
                    } else if ("android.net.conn.CONNECTIVITY_CHANGE".equals(action)) {
                        h hVar = H.f783a;
                        NetworkInfo activeNetworkInfo = ((ConnectivityManager) context.getSystemService("connectivity")).getActiveNetworkInfo();
                        j jVar2 = mVar.f826h;
                        jVar2.sendMessage(jVar2.obtainMessage(9, activeNetworkInfo));
                        return;
                    } else {
                        return;
                    }
                } else {
                    return;
                }
            default:
                ((C0053g) obj).h();
                return;
        }
    }

    public l(C0053g gVar) {
        this.f819b = gVar;
    }
}
