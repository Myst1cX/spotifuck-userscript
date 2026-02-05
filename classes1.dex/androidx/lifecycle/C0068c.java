package androidx.lifecycle;

import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;

/* renamed from: androidx.lifecycle.c  reason: case insensitive filesystem */
public final class C0068c {

    /* renamed from: c  reason: collision with root package name */
    public static final C0068c f1826c = new C0068c();

    /* renamed from: a  reason: collision with root package name */
    public final HashMap f1827a = new HashMap();

    /* renamed from: b  reason: collision with root package name */
    public final HashMap f1828b = new HashMap();

    public static void b(HashMap hashMap, C0067b bVar, C0077l lVar, Class cls) {
        C0077l lVar2 = (C0077l) hashMap.get(bVar);
        if (lVar2 != null && lVar != lVar2) {
            Method method = bVar.f1825b;
            throw new IllegalArgumentException("Method " + method.getName() + " in " + cls.getName() + " already declared with different @OnLifecycleEvent value: previous value " + lVar2 + ", new value " + lVar);
        } else if (lVar2 == null) {
            hashMap.put(bVar, lVar);
        }
    }

    public final C0066a a(Class cls, Method[] methodArr) {
        int i;
        Class superclass = cls.getSuperclass();
        HashMap hashMap = new HashMap();
        HashMap hashMap2 = this.f1827a;
        if (superclass != null) {
            C0066a aVar = (C0066a) hashMap2.get(superclass);
            if (aVar == null) {
                aVar = a(superclass, (Method[]) null);
            }
            hashMap.putAll(aVar.f1823b);
        }
        for (Class cls2 : cls.getInterfaces()) {
            C0066a aVar2 = (C0066a) hashMap2.get(cls2);
            if (aVar2 == null) {
                aVar2 = a(cls2, (Method[]) null);
            }
            for (Map.Entry entry : aVar2.f1823b.entrySet()) {
                b(hashMap, (C0067b) entry.getKey(), (C0077l) entry.getValue(), cls);
            }
        }
        if (methodArr == null) {
            try {
                methodArr = cls.getDeclaredMethods();
            } catch (NoClassDefFoundError e) {
                throw new IllegalArgumentException("The observer class has some methods that use newer APIs which are not available in the current OS version. Lifecycles cannot access even other methods so you should make sure that your observer classes only access framework classes that are available in your min API level OR use lifecycle:compiler annotation processor.", e);
            }
        }
        boolean z2 = false;
        for (Method method : methodArr) {
            y yVar = (y) method.getAnnotation(y.class);
            if (yVar != null) {
                Class[] parameterTypes = method.getParameterTypes();
                if (parameterTypes.length <= 0) {
                    i = 0;
                } else if (r.class.isAssignableFrom(parameterTypes[0])) {
                    i = 1;
                } else {
                    throw new IllegalArgumentException("invalid parameter type. Must be one and instanceof LifecycleOwner");
                }
                C0077l value = yVar.value();
                if (parameterTypes.length > 1) {
                    if (!C0077l.class.isAssignableFrom(parameterTypes[1])) {
                        throw new IllegalArgumentException("invalid parameter type. second arg must be an event");
                    } else if (value == C0077l.ON_ANY) {
                        i = 2;
                    } else {
                        throw new IllegalArgumentException("Second arg is supported only for ON_ANY value");
                    }
                }
                if (parameterTypes.length <= 2) {
                    b(hashMap, new C0067b(i, method), value, cls);
                    z2 = true;
                } else {
                    throw new IllegalArgumentException("cannot have more than 2 params");
                }
            }
        }
        C0066a aVar3 = new C0066a(hashMap);
        hashMap2.put(cls, aVar3);
        this.f1828b.put(cls, Boolean.valueOf(z2));
        return aVar3;
    }
}
