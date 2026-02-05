package K;

import java.util.concurrent.ThreadFactory;

public final class m implements ThreadFactory {

    /* renamed from: a  reason: collision with root package name */
    public String f339a;

    /* renamed from: b  reason: collision with root package name */
    public int f340b;

    public final Thread newThread(Runnable runnable) {
        return new l(runnable, this.f339a, this.f340b);
    }
}
