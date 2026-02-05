package d0;

import A.b;
import A.k;
import Q0.j;
import android.app.Service;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.os.IBinder;
import android.support.v4.media.session.MediaSessionCompat$Token;
import android.util.Log;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public abstract class q extends Service {

    /* renamed from: m  reason: collision with root package name */
    public static final /* synthetic */ int f2497m = 0;

    /* renamed from: f  reason: collision with root package name */
    public k f2498f;

    /* renamed from: g  reason: collision with root package name */
    public final b f2499g = new b(24, (Object) this);

    /* renamed from: h  reason: collision with root package name */
    public final c f2500h = new c(this, "android.media.session.MediaController", -1, -1, (b) null);
    public final ArrayList i = new ArrayList();

    /* renamed from: j  reason: collision with root package name */
    public final r.b f2501j = new r.k();

    /* renamed from: k  reason: collision with root package name */
    public final j f2502k;

    /* renamed from: l  reason: collision with root package name */
    public MediaSessionCompat$Token f2503l;

    public abstract void b(String str, k kVar);

    public void onDestroy() {
        this.f2502k.f817b = null;
    }

    static {
        Log.isLoggable("MBServiceCompat", 3);
    }

    public static List a(List list, Bundle bundle) {
        if (list == null) {
            return null;
        }
        int i2 = bundle.getInt("android.media.browse.extra.PAGE", -1);
        int i3 = bundle.getInt("android.media.browse.extra.PAGE_SIZE", -1);
        if (i2 == -1 && i3 == -1) {
            return list;
        }
        int i4 = i3 * i2;
        int i5 = i4 + i3;
        if (i2 < 0 || i3 < 1 || i4 >= list.size()) {
            return Collections.emptyList();
        }
        if (i5 > list.size()) {
            i5 = list.size();
        }
        return list.subList(i4, i5);
    }

    public final void dump(FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
    }

    public final IBinder onBind(Intent intent) {
        return ((d) this.f2498f.f21f).onBind(intent);
    }

    /* JADX WARNING: type inference failed for: r0v3, types: [r.b, r.k] */
    public q() {
        j jVar = new j(3);
        jVar.f817b = this;
        this.f2502k = jVar;
    }

    public void onCreate() {
        super.onCreate();
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 28) {
            this.f2498f = new i(this);
        } else if (i2 >= 26) {
            this.f2498f = new i(this);
        } else if (i2 >= 23) {
            this.f2498f = new f(this);
        } else {
            this.f2498f = new k(this);
        }
        this.f2498f.p();
    }
}
