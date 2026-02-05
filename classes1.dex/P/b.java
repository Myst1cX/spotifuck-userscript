package p;

import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

public final class b implements ThreadFactory {

    /* renamed from: a  reason: collision with root package name */
    public final AtomicInteger f4437a = new AtomicInteger(0);

    public final Thread newThread(Runnable runnable) {
        Thread thread = new Thread(runnable);
        thread.setName("arch_disk_io_" + this.f4437a.getAndIncrement());
        return thread;
    }
}
