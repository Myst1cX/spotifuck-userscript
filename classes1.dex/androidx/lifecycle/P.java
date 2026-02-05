package androidx.lifecycle;

import java.io.Closeable;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;

public final class P {

    /* renamed from: a  reason: collision with root package name */
    public final LinkedHashMap f1817a = new LinkedHashMap();

    public final void a() {
        for (M m2 : this.f1817a.values()) {
            m2.getClass();
            HashMap hashMap = m2.f1813a;
            if (hashMap != null) {
                synchronized (hashMap) {
                    try {
                        for (Object a2 : m2.f1813a.values()) {
                            M.a(a2);
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            }
            LinkedHashSet linkedHashSet = m2.f1814b;
            if (linkedHashSet != null) {
                synchronized (linkedHashSet) {
                    try {
                        for (Closeable a3 : m2.f1814b) {
                            M.a(a3);
                        }
                    } finally {
                    }
                }
            }
            m2.b();
        }
        this.f1817a.clear();
    }
}
