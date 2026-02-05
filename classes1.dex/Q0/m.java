package Q0;

import A.b;
import android.content.Context;
import android.content.IntentFilter;
import android.graphics.Bitmap;
import android.os.HandlerThread;
import android.os.Looper;
import android.provider.Settings;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.WeakHashMap;
import java.util.concurrent.Future;
import r1.h;
import t.C0339e;

public final class m {

    /* renamed from: a  reason: collision with root package name */
    public final Context f820a;

    /* renamed from: b  reason: collision with root package name */
    public final y f821b;

    /* renamed from: c  reason: collision with root package name */
    public final b f822c;

    /* renamed from: d  reason: collision with root package name */
    public final LinkedHashMap f823d = new LinkedHashMap();
    public final WeakHashMap e = new WeakHashMap();

    /* renamed from: f  reason: collision with root package name */
    public final WeakHashMap f824f = new WeakHashMap();

    /* renamed from: g  reason: collision with root package name */
    public final LinkedHashSet f825g = new LinkedHashSet();

    /* renamed from: h  reason: collision with root package name */
    public final j f826h;
    public final u i;

    /* renamed from: j  reason: collision with root package name */
    public final b f827j;

    /* renamed from: k  reason: collision with root package name */
    public final C f828k;

    /* renamed from: l  reason: collision with root package name */
    public final ArrayList f829l;

    /* renamed from: m  reason: collision with root package name */
    public final boolean f830m;

    public m(Context context, y yVar, u uVar, b bVar, b bVar2, C c2) {
        boolean z2 = false;
        HandlerThread handlerThread = new HandlerThread("Picasso-Dispatcher", 10);
        handlerThread.start();
        Looper looper = handlerThread.getLooper();
        h hVar = H.f783a;
        u uVar2 = new u(looper, 1);
        uVar2.sendMessageDelayed(uVar2.obtainMessage(), 1000);
        this.f820a = context;
        this.f821b = yVar;
        this.f826h = new j(handlerThread.getLooper(), (Object) this, 0);
        this.f822c = bVar;
        this.i = uVar;
        this.f827j = bVar2;
        this.f828k = c2;
        this.f829l = new ArrayList(4);
        try {
            Settings.Global.getInt(context.getContentResolver(), "airplane_mode_on", 0);
        } catch (NullPointerException | SecurityException unused) {
        }
        this.f830m = context.checkCallingOrSelfPermission("android.permission.ACCESS_NETWORK_STATE") == 0 ? true : z2;
        l lVar = new l(this);
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.intent.action.AIRPLANE_MODE");
        m mVar = (m) lVar.f819b;
        if (mVar.f830m) {
            intentFilter.addAction("android.net.conn.CONNECTIVITY_CHANGE");
        }
        mVar.f820a.registerReceiver(lVar, intentFilter);
    }

    public final void b(C0037f fVar) {
        j jVar = this.f826h;
        jVar.sendMessage(jVar.obtainMessage(4, fVar));
    }

    public final void a(C0037f fVar) {
        Future future = fVar.f804m;
        if (future == null || !future.isCancelled()) {
            Bitmap bitmap = fVar.f803l;
            if (bitmap != null) {
                bitmap.prepareToDraw();
            }
            this.f829l.add(fVar);
            j jVar = this.f826h;
            if (!jVar.hasMessages(7)) {
                jVar.sendEmptyMessageDelayed(7, 200);
            }
        }
    }

    public final void c(C0037f fVar, boolean z2) {
        fVar.f795b.getClass();
        this.f823d.remove(fVar.f798f);
        a(fVar);
    }

    public final void d(n nVar, boolean z2) {
        boolean contains = this.f825g.contains(nVar.f834d);
        w wVar = nVar.f831a;
        if (contains) {
            this.f824f.put(nVar.a(), nVar);
            wVar.getClass();
            return;
        }
        LinkedHashMap linkedHashMap = this.f823d;
        String str = nVar.f833c;
        C0037f fVar = (C0037f) linkedHashMap.get(str);
        if (fVar != null) {
            fVar.f795b.getClass();
            if (fVar.f801j == null) {
                fVar.f801j = nVar;
                return;
            }
            if (fVar.f802k == null) {
                fVar.f802k = new ArrayList(3);
            }
            fVar.f802k.add(nVar);
            int i2 = nVar.f832b.f855c;
            if (C0339e.a(i2) > C0339e.a(fVar.f809r)) {
                fVar.f809r = i2;
                return;
            }
            return;
        }
        y yVar = this.f821b;
        if (yVar.isShutdown()) {
            wVar.getClass();
            return;
        }
        C0037f d2 = C0037f.d(wVar, this, this.f827j, this.f828k, nVar);
        d2.f804m = yVar.submit(d2);
        linkedHashMap.put(str, d2);
        if (z2) {
            this.e.remove(nVar.a());
        }
        wVar.getClass();
    }
}
