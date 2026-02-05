package Q0;

import java.util.concurrent.Future;
import java.util.concurrent.ThreadPoolExecutor;

public final class y extends ThreadPoolExecutor {
    public final Future submit(Runnable runnable) {
        x xVar = new x((C0037f) runnable);
        execute(xVar);
        return xVar;
    }

    public final void f(int i) {
        setCorePoolSize(i);
        setMaximumPoolSize(i);
    }
}
