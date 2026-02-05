package Q0;

import java.util.concurrent.ThreadFactory;

public final class G implements ThreadFactory {
    public final Thread newThread(Runnable runnable) {
        return new F(runnable);
    }
}
