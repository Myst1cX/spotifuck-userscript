package androidx.emoji2.text;

import A.k;
import T0.g;
import java.util.concurrent.ThreadPoolExecutor;

public final class l extends g {

    /* renamed from: l  reason: collision with root package name */
    public final /* synthetic */ g f1525l;

    /* renamed from: m  reason: collision with root package name */
    public final /* synthetic */ ThreadPoolExecutor f1526m;

    public final void A(Throwable th) {
        ThreadPoolExecutor threadPoolExecutor = this.f1526m;
        try {
            this.f1525l.A(th);
        } finally {
            threadPoolExecutor.shutdown();
        }
    }

    public final void B(k kVar) {
        ThreadPoolExecutor threadPoolExecutor = this.f1526m;
        try {
            this.f1525l.B(kVar);
        } finally {
            threadPoolExecutor.shutdown();
        }
    }

    public l(g gVar, ThreadPoolExecutor threadPoolExecutor) {
        this.f1525l = gVar;
        this.f1526m = threadPoolExecutor;
    }
}
