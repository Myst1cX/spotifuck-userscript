package p0;

import android.os.Parcel;
import android.os.Parcelable;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public abstract class b {

    /* renamed from: a  reason: collision with root package name */
    public final r.b f4452a;

    /* renamed from: b  reason: collision with root package name */
    public final r.b f4453b;

    /* renamed from: c  reason: collision with root package name */
    public final r.b f4454c;

    public abstract c a();

    public final Method c(String str) {
        r.b bVar = this.f4452a;
        Method method = (Method) bVar.getOrDefault(str, (Object) null);
        if (method != null) {
            return method;
        }
        System.currentTimeMillis();
        Class<b> cls = b.class;
        Method declaredMethod = Class.forName(str, true, cls.getClassLoader()).getDeclaredMethod("read", new Class[]{cls});
        bVar.put(str, declaredMethod);
        return declaredMethod;
    }

    public abstract boolean e(int i);

    public final d h() {
        String readString = ((c) this).e.readString();
        if (readString == null) {
            return null;
        }
        c a2 = a();
        try {
            return (d) c(readString).invoke((Object) null, new Object[]{a2});
        } catch (IllegalAccessException e) {
            throw new RuntimeException("VersionedParcel encountered IllegalAccessException", e);
        } catch (InvocationTargetException e2) {
            if (e2.getCause() instanceof RuntimeException) {
                throw ((RuntimeException) e2.getCause());
            }
            throw new RuntimeException("VersionedParcel encountered InvocationTargetException", e2);
        } catch (NoSuchMethodException e3) {
            throw new RuntimeException("VersionedParcel encountered NoSuchMethodException", e3);
        } catch (ClassNotFoundException e4) {
            throw new RuntimeException("VersionedParcel encountered ClassNotFoundException", e4);
        }
    }

    public abstract void i(int i);

    public final void l(d dVar) {
        if (dVar == null) {
            ((c) this).e.writeString((String) null);
            return;
        }
        try {
            ((c) this).e.writeString(b(dVar.getClass()).getName());
            c a2 = a();
            try {
                d(dVar.getClass()).invoke((Object) null, new Object[]{dVar, a2});
                int i = a2.i;
                if (i >= 0) {
                    int i2 = a2.f4455d.get(i);
                    Parcel parcel = a2.e;
                    int dataPosition = parcel.dataPosition();
                    parcel.setDataPosition(i2);
                    parcel.writeInt(dataPosition - i2);
                    parcel.setDataPosition(dataPosition);
                }
            } catch (IllegalAccessException e) {
                throw new RuntimeException("VersionedParcel encountered IllegalAccessException", e);
            } catch (InvocationTargetException e2) {
                if (e2.getCause() instanceof RuntimeException) {
                    throw ((RuntimeException) e2.getCause());
                }
                throw new RuntimeException("VersionedParcel encountered InvocationTargetException", e2);
            } catch (NoSuchMethodException e3) {
                throw new RuntimeException("VersionedParcel encountered NoSuchMethodException", e3);
            } catch (ClassNotFoundException e4) {
                throw new RuntimeException("VersionedParcel encountered ClassNotFoundException", e4);
            }
        } catch (ClassNotFoundException e5) {
            throw new RuntimeException(dVar.getClass().getSimpleName().concat(" does not have a Parcelizer"), e5);
        }
    }

    public b(r.b bVar, r.b bVar2, r.b bVar3) {
        this.f4452a = bVar;
        this.f4453b = bVar2;
        this.f4454c = bVar3;
    }

    public final Class b(Class cls) {
        String name = cls.getName();
        r.b bVar = this.f4454c;
        Class cls2 = (Class) bVar.getOrDefault(name, (Object) null);
        if (cls2 != null) {
            return cls2;
        }
        String name2 = cls.getPackage().getName();
        String simpleName = cls.getSimpleName();
        Class<?> cls3 = Class.forName(name2 + "." + simpleName + "Parcelizer", false, cls.getClassLoader());
        bVar.put(cls.getName(), cls3);
        return cls3;
    }

    public final Method d(Class cls) {
        String name = cls.getName();
        r.b bVar = this.f4453b;
        Method method = (Method) bVar.getOrDefault(name, (Object) null);
        if (method != null) {
            return method;
        }
        Class b2 = b(cls);
        System.currentTimeMillis();
        Method declaredMethod = b2.getDeclaredMethod("write", new Class[]{cls, b.class});
        bVar.put(cls.getName(), declaredMethod);
        return declaredMethod;
    }

    public final int f(int i, int i2) {
        if (!e(i2)) {
            return i;
        }
        return ((c) this).e.readInt();
    }

    public final Parcelable g(Parcelable parcelable, int i) {
        if (!e(i)) {
            return parcelable;
        }
        return ((c) this).e.readParcelable(c.class.getClassLoader());
    }

    public final void j(int i, int i2) {
        i(i2);
        ((c) this).e.writeInt(i);
    }

    public final void k(Parcelable parcelable, int i) {
        i(i);
        ((c) this).e.writeParcelable(parcelable, 0);
    }
}
