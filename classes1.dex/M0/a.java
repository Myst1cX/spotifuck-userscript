package M0;

import Q0.E;
import android.os.Handler;
import android.os.Message;

public final class a implements Handler.Callback {
    public final boolean handleMessage(Message message) {
        int i = message.what;
        if (i == 0) {
            E.h(message.obj);
            throw null;
        } else if (i != 1) {
            return false;
        } else {
            E.h(message.obj);
            throw null;
        }
    }
}
