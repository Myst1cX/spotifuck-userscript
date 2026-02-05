package j1;

import java.io.IOException;
import java.lang.reflect.Method;

public final class c extends RuntimeException {

    /* renamed from: b  reason: collision with root package name */
    public static final Method f3540b;

    /* renamed from: a  reason: collision with root package name */
    public IOException f3541a;

    static {
        Method method;
        Class<Throwable> cls = Throwable.class;
        try {
            method = cls.getDeclaredMethod("addSuppressed", new Class[]{cls});
        } catch (Exception unused) {
            method = null;
        }
        f3540b = method;
    }

    public c(IOException iOException) {
        super(iOException);
        this.f3541a = iOException;
    }
}
