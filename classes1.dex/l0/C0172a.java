package l0;

import T0.g;
import android.content.Context;
import android.os.Bundle;
import android.os.Trace;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

/* renamed from: l0.a  reason: case insensitive filesystem */
public final class C0172a {

    /* renamed from: d  reason: collision with root package name */
    public static volatile C0172a f3587d;
    public static final Object e = new Object();

    /* renamed from: a  reason: collision with root package name */
    public final HashMap f3588a = new HashMap();

    /* renamed from: b  reason: collision with root package name */
    public final HashSet f3589b = new HashSet();

    /* renamed from: c  reason: collision with root package name */
    public final Context f3590c;

    public static C0172a c(Context context) {
        if (f3587d == null) {
            synchronized (e) {
                try {
                    if (f3587d == null) {
                        f3587d = new C0172a(context);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return f3587d;
    }

    public final void a(Bundle bundle) {
        HashSet hashSet;
        String string = this.f3590c.getString(2131755040);
        if (bundle != null) {
            try {
                HashSet hashSet2 = new HashSet();
                Iterator<String> it2 = bundle.keySet().iterator();
                while (true) {
                    boolean hasNext = it2.hasNext();
                    hashSet = this.f3589b;
                    if (!hasNext) {
                        break;
                    }
                    String next = it2.next();
                    if (string.equals(bundle.getString(next, (String) null))) {
                        Class<?> cls = Class.forName(next);
                        if (C0173b.class.isAssignableFrom(cls)) {
                            hashSet.add(cls);
                        }
                    }
                }
                Iterator it3 = hashSet.iterator();
                while (it3.hasNext()) {
                    b((Class) it3.next(), hashSet2);
                }
            } catch (ClassNotFoundException e2) {
                throw new RuntimeException(e2);
            }
        }
    }

    public final Object b(Class cls, HashSet hashSet) {
        Object obj;
        if (g.w()) {
            try {
                Trace.beginSection(cls.getSimpleName());
            } catch (Throwable th) {
                Trace.endSection();
                throw th;
            }
        }
        if (!hashSet.contains(cls)) {
            HashMap hashMap = this.f3588a;
            if (!hashMap.containsKey(cls)) {
                hashSet.add(cls);
                C0173b bVar = (C0173b) cls.getDeclaredConstructor((Class[]) null).newInstance((Object[]) null);
                List<Class> a2 = bVar.a();
                if (!a2.isEmpty()) {
                    for (Class cls2 : a2) {
                        if (!hashMap.containsKey(cls2)) {
                            b(cls2, hashSet);
                        }
                    }
                }
                obj = bVar.b(this.f3590c);
                hashSet.remove(cls);
                hashMap.put(cls, obj);
            } else {
                obj = hashMap.get(cls);
            }
            Trace.endSection();
            return obj;
        }
        String name = cls.getName();
        throw new IllegalStateException("Cannot initialize " + name + ". Cycle detected.");
    }

    public C0172a(Context context) {
        this.f3590c = context.getApplicationContext();
    }
}
