package Z0;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;

public abstract class c {

    /* renamed from: a  reason: collision with root package name */
    public static final Object[] f1011a = new Object[0];

    public static boolean a(Object obj, Object obj2) {
        if (obj != null) {
            return obj.equals(obj2);
        }
        if (obj2 == null) {
            return true;
        }
        return false;
    }

    public static void b(Object obj) {
        if (obj == null) {
            NullPointerException nullPointerException = new NullPointerException();
            f(nullPointerException, c.class.getName());
            throw nullPointerException;
        }
    }

    public static void c(String str, Object obj) {
        if (obj == null) {
            NullPointerException nullPointerException = new NullPointerException(str);
            f(nullPointerException, c.class.getName());
            throw nullPointerException;
        }
    }

    public static void d(String str, Object obj) {
        if (obj == null) {
            NullPointerException nullPointerException = new NullPointerException(str.concat(" must not be null"));
            f(nullPointerException, c.class.getName());
            throw nullPointerException;
        }
    }

    public static void e(String str, Object obj) {
        if (obj == null) {
            StackTraceElement[] stackTrace = Thread.currentThread().getStackTrace();
            Class<c> cls = c.class;
            String name = cls.getName();
            int i = 0;
            while (!stackTrace[i].getClassName().equals(name)) {
                i++;
            }
            while (stackTrace[i].getClassName().equals(name)) {
                i++;
            }
            StackTraceElement stackTraceElement = stackTrace[i];
            String className = stackTraceElement.getClassName();
            String methodName = stackTraceElement.getMethodName();
            NullPointerException nullPointerException = new NullPointerException("Parameter specified as non-null is null: method " + className + "." + methodName + ", parameter " + str);
            f(nullPointerException, cls.getName());
            throw nullPointerException;
        }
    }

    public static void f(RuntimeException runtimeException, String str) {
        StackTraceElement[] stackTrace = runtimeException.getStackTrace();
        int length = stackTrace.length;
        int i = -1;
        for (int i2 = 0; i2 < length; i2++) {
            if (str.equals(stackTrace[i2].getClassName())) {
                i = i2;
            }
        }
        runtimeException.setStackTrace((StackTraceElement[]) Arrays.copyOfRange(stackTrace, i + 1, length));
    }

    public static final Object[] g(Collection collection) {
        int size = collection.size();
        Object[] objArr = f1011a;
        if (size == 0) {
            return objArr;
        }
        Iterator it2 = collection.iterator();
        if (!it2.hasNext()) {
            return objArr;
        }
        Object[] objArr2 = new Object[size];
        int i = 0;
        while (true) {
            int i2 = i + 1;
            objArr2[i] = it2.next();
            if (i2 >= objArr2.length) {
                if (!it2.hasNext()) {
                    return objArr2;
                }
                int i3 = ((i2 * 3) + 1) >>> 1;
                if (i3 <= i2) {
                    i3 = 2147483645;
                    if (i2 >= 2147483645) {
                        throw new OutOfMemoryError();
                    }
                }
                objArr2 = Arrays.copyOf(objArr2, i3);
                d("copyOf(result, newSize)", objArr2);
            } else if (!it2.hasNext()) {
                Object[] copyOf = Arrays.copyOf(objArr2, i2);
                d("copyOf(result, size)", copyOf);
                return copyOf;
            }
            i = i2;
        }
    }

    public static final Object[] h(Collection collection, Object[] objArr) {
        Object[] objArr2;
        objArr.getClass();
        int size = collection.size();
        int i = 0;
        if (size != 0) {
            Iterator it2 = collection.iterator();
            if (it2.hasNext()) {
                if (size <= objArr.length) {
                    objArr2 = objArr;
                } else {
                    Object newInstance = Array.newInstance(objArr.getClass().getComponentType(), size);
                    c("null cannot be cast to non-null type kotlin.Array<kotlin.Any?>", newInstance);
                    objArr2 = (Object[]) newInstance;
                }
                while (true) {
                    int i2 = i + 1;
                    objArr2[i] = it2.next();
                    if (i2 >= objArr2.length) {
                        if (!it2.hasNext()) {
                            return objArr2;
                        }
                        int i3 = ((i2 * 3) + 1) >>> 1;
                        if (i3 <= i2) {
                            i3 = 2147483645;
                            if (i2 >= 2147483645) {
                                throw new OutOfMemoryError();
                            }
                        }
                        objArr2 = Arrays.copyOf(objArr2, i3);
                        d("copyOf(result, newSize)", objArr2);
                    } else if (!it2.hasNext()) {
                        if (objArr2 == objArr) {
                            objArr[i2] = null;
                            return objArr;
                        }
                        Object[] copyOf = Arrays.copyOf(objArr2, i2);
                        d("copyOf(result, size)", copyOf);
                        return copyOf;
                    }
                    i = i2;
                }
            } else if (objArr.length <= 0) {
                return objArr;
            } else {
                objArr[0] = null;
                return objArr;
            }
        } else if (objArr.length <= 0) {
            return objArr;
        } else {
            objArr[0] = null;
            return objArr;
        }
    }
}
