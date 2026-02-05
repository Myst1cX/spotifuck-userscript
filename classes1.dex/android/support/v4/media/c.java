package android.support.v4.media;

import E.j;
import android.content.ComponentName;
import android.content.Context;
import android.media.browse.MediaBrowser;
import android.os.Bundle;
import android.os.Messenger;
import android.os.Process;
import android.support.v4.media.session.MediaSessionCompat$Token;
import r.b;
import r.k;

public class c {

    /* renamed from: a  reason: collision with root package name */
    public final Context f1074a;

    /* renamed from: b  reason: collision with root package name */
    public final MediaBrowser f1075b;

    /* renamed from: c  reason: collision with root package name */
    public final Bundle f1076c;

    /* renamed from: d  reason: collision with root package name */
    public final a f1077d = new a(this);
    public final b e = new k();

    /* renamed from: f  reason: collision with root package name */
    public j f1078f;

    /* renamed from: g  reason: collision with root package name */
    public Messenger f1079g;

    /* renamed from: h  reason: collision with root package name */
    public MediaSessionCompat$Token f1080h;

    /* JADX WARNING: type inference failed for: r0v1, types: [r.b, r.k] */
    public c(Context context, ComponentName componentName, f0.b bVar) {
        this.f1074a = context;
        Bundle bundle = new Bundle();
        this.f1076c = bundle;
        bundle.putInt("extra_client_version", 1);
        bundle.putInt("extra_calling_pid", Process.myPid());
        bVar.f2514b = this;
        this.f1075b = new MediaBrowser(context, componentName, (b) bVar.f2513a, bundle);
    }
}
