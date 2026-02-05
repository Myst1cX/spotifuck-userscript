package androidx.lifecycle;

import Z0.c;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

public abstract class u {

    /* renamed from: a  reason: collision with root package name */
    public static final HashMap f1846a = new HashMap();

    /* renamed from: b  reason: collision with root package name */
    public static final HashMap f1847b = new HashMap();

    public static void a(Constructor constructor, C0082q qVar) {
        try {
            c.d("{\n            constructo…tance(`object`)\n        }", constructor.newInstance(new Object[]{qVar}));
            throw new ClassCastException();
        } catch (IllegalAccessException e) {
            throw new RuntimeException(e);
        } catch (InstantiationException e2) {
            throw new RuntimeException(e2);
        } catch (InvocationTargetException e3) {
            throw new RuntimeException(e3);
        }
    }

    public static int c(Class cls) {
        Constructor<?> constructor;
        boolean z2;
        boolean z3;
        boolean z4;
        String str;
        int i = 1;
        HashMap hashMap = f1846a;
        Integer num = (Integer) hashMap.get(cls);
        if (num != null) {
            return num.intValue();
        }
        if (cls.getCanonicalName() != null) {
            ArrayList arrayList = null;
            try {
                Package packageR = cls.getPackage();
                String canonicalName = cls.getCanonicalName();
                if (packageR != null) {
                    str = packageR.getName();
                } else {
                    str = "";
                }
                c.d("fullPackage", str);
                if (str.length() != 0) {
                    c.d("name", canonicalName);
                    canonicalName = canonicalName.substring(str.length() + 1);
                    c.d("this as java.lang.String).substring(startIndex)", canonicalName);
                }
                c.d("if (fullPackage.isEmpty(…g(fullPackage.length + 1)", canonicalName);
                String b2 = b(canonicalName);
                if (str.length() != 0) {
                    b2 = str + '.' + b2;
                }
                constructor = Class.forName(b2).getDeclaredConstructor(new Class[]{cls});
                if (!constructor.isAccessible()) {
                    constructor.setAccessible(true);
                }
            } catch (ClassNotFoundException unused) {
                constructor = null;
            } catch (NoSuchMethodException e) {
                throw new RuntimeException(e);
            }
            HashMap hashMap2 = f1847b;
            if (constructor != null) {
                List<?> singletonList = Collections.singletonList(constructor);
                c.d("singletonList(element)", singletonList);
                hashMap2.put(cls, singletonList);
            } else {
                C0068c cVar = C0068c.f1826c;
                HashMap hashMap3 = cVar.f1828b;
                Boolean bool = (Boolean) hashMap3.get(cls);
                if (bool != null) {
                    z2 = bool.booleanValue();
                } else {
                    try {
                        Method[] declaredMethods = cls.getDeclaredMethods();
                        int length = declaredMethods.length;
                        int i2 = 0;
                        while (true) {
                            if (i2 >= length) {
                                hashMap3.put(cls, Boolean.FALSE);
                                z2 = false;
                                break;
                            } else if (((y) declaredMethods[i2].getAnnotation(y.class)) != null) {
                                cVar.a(cls, declaredMethods);
                                z2 = true;
                                break;
                            } else {
                                i2++;
                            }
                        }
                    } catch (NoClassDefFoundError e2) {
                        throw new IllegalArgumentException("The observer class has some methods that use newer APIs which are not available in the current OS version. Lifecycles cannot access even other methods so you should make sure that your observer classes only access framework classes that are available in your min API level OR use lifecycle:compiler annotation processor.", e2);
                    }
                }
                if (!z2) {
                    Class superclass = cls.getSuperclass();
                    Class<C0082q> cls2 = C0082q.class;
                    if (superclass == null || !cls2.isAssignableFrom(superclass)) {
                        z3 = false;
                    } else {
                        z3 = true;
                    }
                    if (z3) {
                        c.d("superclass", superclass);
                        if (c(superclass) != 1) {
                            Object obj = hashMap2.get(superclass);
                            c.b(obj);
                            arrayList = new ArrayList((Collection) obj);
                        }
                    }
                    Class[] interfaces = cls.getInterfaces();
                    c.d("klass.interfaces", interfaces);
                    int length2 = interfaces.length;
                    int i3 = 0;
                    while (true) {
                        if (i3 < length2) {
                            Class cls3 = interfaces[i3];
                            if (cls3 == null || !cls2.isAssignableFrom(cls3)) {
                                z4 = false;
                            } else {
                                z4 = true;
                            }
                            if (z4) {
                                c.d("intrface", cls3);
                                if (c(cls3) == 1) {
                                    break;
                                }
                                if (arrayList == null) {
                                    arrayList = new ArrayList();
                                }
                                Object obj2 = hashMap2.get(cls3);
                                c.b(obj2);
                                arrayList.addAll((Collection) obj2);
                            }
                            i3++;
                        } else if (arrayList != null) {
                            hashMap2.put(cls, arrayList);
                        }
                    }
                }
            }
            i = 2;
        }
        hashMap.put(cls, Integer.valueOf(i));
        return i;
    }

    public static final String b(String str) {
        StringBuilder sb = new StringBuilder();
        int i = 0;
        int indexOf = str.indexOf(".", 0);
        if (indexOf >= 0) {
            int length = str.length();
            if (length >= 0) {
                StringBuilder sb2 = new StringBuilder(length);
                do {
                    sb2.append(str, i, indexOf);
                    sb2.append("_");
                    i = indexOf + 1;
                    if (indexOf >= str.length() || (indexOf = str.indexOf(".", i)) <= 0) {
                        sb2.append(str, i, str.length());
                        str = sb2.toString();
                        c.d("stringBuilder.append(this, i, length).toString()", str);
                    }
                    sb2.append(str, i, indexOf);
                    sb2.append("_");
                    i = indexOf + 1;
                    break;
                } while ((indexOf = str.indexOf(".", i)) <= 0);
                sb2.append(str, i, str.length());
                str = sb2.toString();
                c.d("stringBuilder.append(this, i, length).toString()", str);
            } else {
                throw new OutOfMemoryError();
            }
        }
        sb.append(str);
        sb.append("_LifecycleAdapter");
        return sb.toString();
    }
}
