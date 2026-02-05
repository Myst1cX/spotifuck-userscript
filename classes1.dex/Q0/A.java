package Q0;

import K.j;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Looper;
import java.util.concurrent.atomic.AtomicInteger;
import r1.h;

public final class A {

    /* renamed from: c  reason: collision with root package name */
    public static final AtomicInteger f756c = new AtomicInteger();

    /* renamed from: a  reason: collision with root package name */
    public final w f757a;

    /* renamed from: b  reason: collision with root package name */
    public final j f758b;

    /* JADX WARNING: type inference failed for: r1v1, types: [K.j, java.lang.Object] */
    public A(w wVar, Uri uri) {
        wVar.getClass();
        this.f757a = wVar;
        ? obj = new Object();
        obj.f333g = uri;
        this.f758b = obj;
    }

    public final Bitmap a() {
        System.nanoTime();
        h hVar = H.f783a;
        if (Looper.getMainLooper().getThread() != Thread.currentThread()) {
            j jVar = this.f758b;
            if (((Uri) jVar.f333g) == null) {
                return null;
            }
            f756c.getAndIncrement();
            if (jVar.f332f == 0) {
                jVar.f332f = 2;
            }
            int i = jVar.f332f;
            Uri uri = (Uri) jVar.f333g;
            z zVar = new z(uri, i);
            w wVar = this.f757a;
            wVar.getClass();
            StringBuilder sb = new StringBuilder();
            if (uri != null) {
                String uri2 = uri.toString();
                sb.ensureCapacity(uri2.length() + 50);
                sb.append(uri2);
            } else {
                sb.ensureCapacity(50);
                sb.append(0);
            }
            sb.append(10);
            return C0037f.d(wVar, wVar.f848b, wVar.f849c, wVar.f850d, new n(wVar, zVar, sb.toString())).e();
        }
        throw new IllegalStateException("Method call should not happen from the main thread.");
    }
}
