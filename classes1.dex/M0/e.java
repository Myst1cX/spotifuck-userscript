package M0;

import A.b;
import Q0.E;
import android.os.Handler;
import android.os.Message;

public final class e implements Handler.Callback {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ b f493a;

    public final boolean handleMessage(Message message) {
        if (message.what != 0) {
            return false;
        }
        b bVar = this.f493a;
        E.h(message.obj);
        synchronized (bVar.f2g) {
            throw null;
        }
    }

    public e(b bVar) {
        this.f493a = bVar;
    }
}
