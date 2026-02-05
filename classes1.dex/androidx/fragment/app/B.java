package androidx.fragment.app;

import Q0.E;
import java.lang.reflect.InvocationTargetException;
import r.k;

public final class B {

    /* renamed from: b  reason: collision with root package name */
    public static final k f1557b = new k();

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ H f1558a;

    public static Class b(ClassLoader classLoader, String str) {
        k kVar = f1557b;
        k kVar2 = (k) kVar.getOrDefault(classLoader, (Object) null);
        if (kVar2 == null) {
            kVar2 = new k();
            kVar.put(classLoader, kVar2);
        }
        Class cls = (Class) kVar2.getOrDefault(str, (Object) null);
        if (cls != null) {
            return cls;
        }
        Class<?> cls2 = Class.forName(str, false, classLoader);
        kVar2.put(str, cls2);
        return cls2;
    }

    public static Class c(ClassLoader classLoader, String str) {
        try {
            return b(classLoader, str);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(E.g("Unable to instantiate fragment ", str, ": make sure class name exists"), e);
        } catch (ClassCastException e2) {
            throw new RuntimeException(E.g("Unable to instantiate fragment ", str, ": make sure class is a valid subclass of Fragment"), e2);
        }
    }

    public final r a(String str) {
        try {
            return (r) c(this.f1558a.f1598t.f1775g.getClassLoader(), str).getConstructor((Class[]) null).newInstance((Object[]) null);
        } catch (InstantiationException e) {
            throw new RuntimeException(E.g("Unable to instantiate fragment ", str, ": make sure class name exists, is public, and has an empty constructor that is public"), e);
        } catch (IllegalAccessException e2) {
            throw new RuntimeException(E.g("Unable to instantiate fragment ", str, ": make sure class name exists, is public, and has an empty constructor that is public"), e2);
        } catch (NoSuchMethodException e3) {
            throw new RuntimeException(E.g("Unable to instantiate fragment ", str, ": could not find Fragment constructor"), e3);
        } catch (InvocationTargetException e4) {
            throw new RuntimeException(E.g("Unable to instantiate fragment ", str, ": calling Fragment constructor caused an exception"), e4);
        }
    }

    public B(H h2) {
        this.f1558a = h2;
    }
}
