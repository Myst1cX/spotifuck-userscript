package android.support.v4.media.session;

import android.content.Context;
import android.media.session.MediaController;
import android.media.session.MediaSession;
import android.os.Bundle;
import android.os.Handler;
import android.os.ResultReceiver;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

public class f {

    /* renamed from: a  reason: collision with root package name */
    public final MediaController f1113a;

    /* renamed from: b  reason: collision with root package name */
    public final Object f1114b = new Object();

    /* renamed from: c  reason: collision with root package name */
    public final ArrayList f1115c = new ArrayList();

    /* renamed from: d  reason: collision with root package name */
    public final HashMap f1116d = new HashMap();
    public final MediaSessionCompat$Token e;

    public final void a() {
        if (this.e.a() != null) {
            ArrayList arrayList = this.f1115c;
            Iterator it2 = arrayList.iterator();
            if (!it2.hasNext()) {
                arrayList.clear();
            } else if (it2.next() == null) {
                this.f1116d.put((Object) null, new e());
                throw null;
            } else {
                throw new ClassCastException();
            }
        }
    }

    /* JADX WARNING: type inference failed for: r3v2, types: [android.support.v4.media.session.MediaControllerCompat$MediaControllerImplApi21$ExtraBinderRequestResultReceiver, android.os.ResultReceiver] */
    public f(Context context, MediaSessionCompat$Token mediaSessionCompat$Token) {
        this.e = mediaSessionCompat$Token;
        MediaController mediaController = new MediaController(context, (MediaSession.Token) mediaSessionCompat$Token.f1089b);
        this.f1113a = mediaController;
        if (mediaSessionCompat$Token.a() == null) {
            ? resultReceiver = new ResultReceiver((Handler) null);
            resultReceiver.f1084a = new WeakReference(this);
            mediaController.sendCommand("android.support.v4.media.session.command.GET_EXTRA_BINDER", (Bundle) null, resultReceiver);
        }
    }
}
