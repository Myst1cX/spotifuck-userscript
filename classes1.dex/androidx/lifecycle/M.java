package androidx.lifecycle;

import java.io.Closeable;
import java.io.IOException;
import java.util.HashMap;
import java.util.LinkedHashSet;

public abstract class M {

    /* renamed from: a  reason: collision with root package name */
    public final HashMap f1813a = new HashMap();

    /* renamed from: b  reason: collision with root package name */
    public final LinkedHashSet f1814b = new LinkedHashSet();

    public void b() {
    }

    public static void a(Object obj) {
        if (obj instanceof Closeable) {
            try {
                ((Closeable) obj).close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
