package androidx.emoji2.text;

import C.a;
import K.d;
import K.e;
import K.j;
import K.k;
import T0.g;
import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Handler;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import p0.C0320a;

public final class p implements i {

    /* renamed from: f  reason: collision with root package name */
    public final Context f1532f;

    /* renamed from: g  reason: collision with root package name */
    public final e f1533g;

    /* renamed from: h  reason: collision with root package name */
    public final K0.e f1534h;
    public final Object i = new Object();

    /* renamed from: j  reason: collision with root package name */
    public Handler f1535j;

    /* renamed from: k  reason: collision with root package name */
    public ThreadPoolExecutor f1536k;

    /* renamed from: l  reason: collision with root package name */
    public ThreadPoolExecutor f1537l;

    /* renamed from: m  reason: collision with root package name */
    public g f1538m;

    public p(Context context, e eVar) {
        K0.e eVar2 = q.f1539d;
        C0320a.j("Context cannot be null", context);
        this.f1532f = context.getApplicationContext();
        this.f1533g = eVar;
        this.f1534h = eVar2;
    }

    public final void a() {
        synchronized (this.i) {
            try {
                this.f1538m = null;
                Handler handler = this.f1535j;
                if (handler != null) {
                    handler.removeCallbacks((Runnable) null);
                }
                this.f1535j = null;
                ThreadPoolExecutor threadPoolExecutor = this.f1537l;
                if (threadPoolExecutor != null) {
                    threadPoolExecutor.shutdown();
                }
                this.f1536k = null;
                this.f1537l = null;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void b() {
        synchronized (this.i) {
            try {
                if (this.f1538m != null) {
                    if (this.f1536k == null) {
                        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(0, 1, 15, TimeUnit.SECONDS, new LinkedBlockingDeque(), new a("emojiCompat"));
                        threadPoolExecutor.allowCoreThreadTimeOut(true);
                        this.f1537l = threadPoolExecutor;
                        this.f1536k = threadPoolExecutor;
                    }
                    this.f1536k.execute(new a(10, (Object) this));
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final k c() {
        try {
            K0.e eVar = this.f1534h;
            Context context = this.f1532f;
            e eVar2 = this.f1533g;
            eVar.getClass();
            j a2 = d.a(context, eVar2);
            int i2 = a2.f332f;
            if (i2 == 0) {
                k[] kVarArr = (k[]) a2.f333g;
                if (kVarArr != null && kVarArr.length != 0) {
                    return kVarArr[0];
                }
                throw new RuntimeException("fetchFonts failed (empty result)");
            }
            throw new RuntimeException("fetchFonts failed (" + i2 + ")");
        } catch (PackageManager.NameNotFoundException e) {
            throw new RuntimeException("provider not found", e);
        }
    }

    public final void o(g gVar) {
        synchronized (this.i) {
            this.f1538m = gVar;
        }
        b();
    }
}
