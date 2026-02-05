package androidx.lifecycle;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: androidx.lifecycle.a  reason: case insensitive filesystem */
public final class C0066a {

    /* renamed from: a  reason: collision with root package name */
    public final HashMap f1822a = new HashMap();

    /* renamed from: b  reason: collision with root package name */
    public final HashMap f1823b;

    public static void a(List list, r rVar, C0077l lVar, C0082q qVar) {
        if (list != null) {
            int size = list.size() - 1;
            while (size >= 0) {
                C0067b bVar = (C0067b) list.get(size);
                bVar.getClass();
                try {
                    int i = bVar.f1824a;
                    Method method = bVar.f1825b;
                    if (i == 0) {
                        method.invoke(qVar, (Object[]) null);
                    } else if (i == 1) {
                        method.invoke(qVar, new Object[]{rVar});
                    } else if (i == 2) {
                        method.invoke(qVar, new Object[]{rVar, lVar});
                    }
                    size--;
                } catch (InvocationTargetException e) {
                    throw new RuntimeException("Failed to call observer method", e.getCause());
                } catch (IllegalAccessException e2) {
                    throw new RuntimeException(e2);
                }
            }
        }
    }

    public C0066a(HashMap hashMap) {
        this.f1823b = hashMap;
        for (Map.Entry entry : hashMap.entrySet()) {
            C0077l lVar = (C0077l) entry.getValue();
            List list = (List) this.f1822a.get(lVar);
            if (list == null) {
                list = new ArrayList();
                this.f1822a.put(lVar, list);
            }
            list.add((C0067b) entry.getKey());
        }
    }
}
