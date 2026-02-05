package Q0;

import A.b;
import android.content.Context;
import android.graphics.Bitmap;
import android.os.Looper;
import android.widget.ImageView;
import com.squareup.picasso.PicassoProvider;
import java.lang.ref.ReferenceQueue;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.WeakHashMap;
import java.util.concurrent.PriorityBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import r1.h;

public final class w {

    /* renamed from: g  reason: collision with root package name */
    public static final u f845g = new u(Looper.getMainLooper(), 0);

    /* renamed from: h  reason: collision with root package name */
    public static volatile w f846h = null;

    /* renamed from: a  reason: collision with root package name */
    public final List f847a;

    /* renamed from: b  reason: collision with root package name */
    public final m f848b;

    /* renamed from: c  reason: collision with root package name */
    public final b f849c;

    /* renamed from: d  reason: collision with root package name */
    public final C f850d;
    public final WeakHashMap e = new WeakHashMap();

    /* renamed from: f  reason: collision with root package name */
    public final WeakHashMap f851f = new WeakHashMap();

    /* JADX WARNING: type inference failed for: r17v0, types: [java.lang.Object, java.util.concurrent.ThreadFactory] */
    public static w c() {
        if (f846h == null) {
            synchronized (w.class) {
                try {
                    if (f846h == null) {
                        Context context = PicassoProvider.f2449f;
                        if (context != null) {
                            Context applicationContext = context.getApplicationContext();
                            b bVar = new b(applicationContext, 9);
                            b bVar2 = new b(applicationContext, 8);
                            ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(3, 3, 0, TimeUnit.MILLISECONDS, new PriorityBlockingQueue(), new Object());
                            C c2 = new C(bVar2);
                            f846h = new w(applicationContext, new m(applicationContext, threadPoolExecutor, f845g, bVar, bVar2, c2), bVar2, c2);
                        } else {
                            throw new IllegalStateException("context == null");
                        }
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return f846h;
    }

    public final void a(Object obj) {
        h hVar = H.f783a;
        if (Looper.getMainLooper().getThread() == Thread.currentThread()) {
            n nVar = (n) this.e.remove(obj);
            if (nVar != null) {
                nVar.f835f = true;
                j jVar = this.f848b.f826h;
                jVar.sendMessage(jVar.obtainMessage(2, nVar));
            }
            if (obj instanceof ImageView) {
                if (this.f851f.remove((ImageView) obj) != null) {
                    throw new ClassCastException();
                }
                return;
            }
            return;
        }
        throw new IllegalStateException("Method call should happen from the main thread.");
    }

    public final void b(Bitmap bitmap, int i, n nVar, Exception exc) {
        if (!nVar.f835f) {
            if (!nVar.e) {
                this.e.remove(nVar.a());
            }
            if (bitmap != null && i == 0) {
                throw new AssertionError("LoadedFrom cannot be null.");
            }
        }
    }

    public w(Context context, m mVar, b bVar, C c2) {
        this.f848b = mVar;
        this.f849c = bVar;
        ArrayList arrayList = new ArrayList(7);
        arrayList.add(new C0039h(context, 1));
        arrayList.add(new C0038g(context));
        arrayList.add(new q(context, 0));
        arrayList.add(new C0039h(context, 0));
        arrayList.add(new C0033b(context));
        arrayList.add(new q(context, 1));
        arrayList.add(new t(mVar.f822c, c2));
        this.f847a = Collections.unmodifiableList(arrayList);
        this.f850d = c2;
        new v(new ReferenceQueue(), f845g).start();
    }
}
