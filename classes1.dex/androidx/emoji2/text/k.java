package androidx.emoji2.text;

import A.b;
import T0.g;
import android.content.Context;
import java.util.concurrent.ThreadPoolExecutor;

public final /* synthetic */ class k implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ b f1522a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ g f1523b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ ThreadPoolExecutor f1524c;

    public /* synthetic */ k(b bVar, g gVar, ThreadPoolExecutor threadPoolExecutor) {
        this.f1522a = bVar;
        this.f1523b = gVar;
        this.f1524c = threadPoolExecutor;
    }

    public final void run() {
        b bVar = this.f1522a;
        g gVar = this.f1523b;
        ThreadPoolExecutor threadPoolExecutor = this.f1524c;
        bVar.getClass();
        try {
            q l2 = g.l((Context) bVar.f2g);
            if (l2 != null) {
                p pVar = (p) ((i) l2.f1511b);
                synchronized (pVar.i) {
                    pVar.f1536k = threadPoolExecutor;
                }
                ((i) l2.f1511b).o(new l(gVar, threadPoolExecutor));
                return;
            }
            throw new RuntimeException("EmojiCompat font provider not available on this device.");
        } catch (Throwable th) {
            gVar.A(th);
            threadPoolExecutor.shutdown();
        }
    }
}
