package android.support.v4.media;

import Q0.E;
import android.os.BadParcelableException;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.os.Messenger;
import android.support.v4.media.session.MediaSessionCompat$Token;
import android.support.v4.media.session.t;
import android.util.Log;
import java.lang.ref.WeakReference;

public final class a extends Handler {

    /* renamed from: a  reason: collision with root package name */
    public final WeakReference f1071a;

    /* renamed from: b  reason: collision with root package name */
    public WeakReference f1072b;

    public final void handleMessage(Message message) {
        WeakReference weakReference = this.f1072b;
        if (weakReference != null && weakReference.get() != null) {
            WeakReference weakReference2 = this.f1071a;
            if (weakReference2.get() != null) {
                Bundle data = message.getData();
                t.j(data);
                c cVar = (c) weakReference2.get();
                Messenger messenger = (Messenger) this.f1072b.get();
                try {
                    int i = message.what;
                    if (i == 1) {
                        t.j(data.getBundle("data_root_hints"));
                        data.getString("data_media_item_id");
                        MediaSessionCompat$Token mediaSessionCompat$Token = (MediaSessionCompat$Token) data.getParcelable("data_media_session_token");
                        cVar.getClass();
                    } else if (i == 2) {
                        cVar.getClass();
                    } else if (i != 3) {
                        Log.w("MediaBrowserCompat", "Unhandled message: " + message + "\n  Client version: 1\n  Service version: " + message.arg1);
                    } else {
                        t.j(data.getBundle("data_options"));
                        t.j(data.getBundle("data_notify_children_changed_options"));
                        String string = data.getString("data_media_item_id");
                        data.getParcelableArrayList("data_media_item_list");
                        if (cVar.f1079g == messenger) {
                            E.h(cVar.e.getOrDefault(string, (Object) null));
                            int i2 = f.f1081b;
                        }
                    }
                } catch (BadParcelableException unused) {
                    Log.e("MediaBrowserCompat", "Could not unparcel the data.");
                    if (message.what == 1) {
                        cVar.getClass();
                    }
                }
            }
        }
    }

    public a(c cVar) {
        this.f1071a = new WeakReference(cVar);
    }
}
