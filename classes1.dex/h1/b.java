package h1;

import java.util.concurrent.ThreadFactory;

public final class b implements ThreadFactory {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ String f3084a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ boolean f3085b;

    public final Thread newThread(Runnable runnable) {
        Thread thread = new Thread(runnable, this.f3084a);
        thread.setDaemon(this.f3085b);
        return thread;
    }

    public b(String str, boolean z2) {
        this.f3084a = str;
        this.f3085b = z2;
    }
}
