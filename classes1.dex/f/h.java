package F;

import E.g;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.util.Log;
import java.io.File;
import java.lang.reflect.Array;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import p0.C0320a;

public class h extends C0320a {

    /* renamed from: o  reason: collision with root package name */
    public static Class f234o;

    /* renamed from: p  reason: collision with root package name */
    public static Constructor f235p;

    /* renamed from: q  reason: collision with root package name */
    public static Method f236q;

    /* renamed from: r  reason: collision with root package name */
    public static Method f237r;

    /* renamed from: s  reason: collision with root package name */
    public static boolean f238s;

    public static void M0() {
        Method method;
        Class<?> cls;
        Method method2;
        if (!f238s) {
            f238s = true;
            Constructor<?> constructor = null;
            try {
                cls = Class.forName("android.graphics.FontFamily");
                Constructor<?> constructor2 = cls.getConstructor((Class[]) null);
                method = cls.getMethod("addFontWeightStyle", new Class[]{String.class, Integer.TYPE, Boolean.TYPE});
                method2 = Typeface.class.getMethod("createFromFamiliesWithDefault", new Class[]{Array.newInstance(cls, 1).getClass()});
                constructor = constructor2;
            } catch (ClassNotFoundException | NoSuchMethodException e) {
                Log.e("TypefaceCompatApi21Impl", e.getClass().getName(), e);
                method2 = null;
                cls = null;
                method = null;
            }
            f235p = constructor;
            f234o = cls;
            f236q = method;
            f237r = method2;
        }
    }

    public Typeface t(Context context, g gVar, Resources resources, int i) {
        M0();
        try {
            Object newInstance = f235p.newInstance((Object[]) null);
            E.h[] hVarArr = gVar.f97a;
            int length = hVarArr.length;
            int i2 = 0;
            while (i2 < length) {
                E.h hVar = hVarArr[i2];
                File Y2 = C0320a.Y(context);
                if (Y2 == null) {
                    return null;
                }
                try {
                    if (!C0320a.q(Y2, resources, hVar.f102f)) {
                        Y2.delete();
                        return null;
                    } else if (!L0(newInstance, Y2.getPath(), hVar.f99b, hVar.f100c)) {
                        return null;
                    } else {
                        Y2.delete();
                        i2++;
                    }
                } catch (RuntimeException unused) {
                    return null;
                } finally {
                    Y2.delete();
                }
            }
            M0();
            try {
                Object newInstance2 = Array.newInstance(f234o, 1);
                Array.set(newInstance2, 0, newInstance);
                return (Typeface) f237r.invoke((Object) null, new Object[]{newInstance2});
            } catch (IllegalAccessException | InvocationTargetException e) {
                throw new RuntimeException(e);
            }
        } catch (IllegalAccessException | InstantiationException | InvocationTargetException e2) {
            throw new RuntimeException(e2);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:18:0x004a A[SYNTHETIC, Splitter:B:18:0x004a] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.graphics.Typeface u(android.content.Context r4, K.k[] r5, int r6) {
        /*
            r3 = this;
            int r0 = r5.length
            r1 = 1
            r2 = 0
            if (r0 >= r1) goto L_0x0006
            return r2
        L_0x0006:
            K.k r5 = r3.D(r6, r5)
            android.content.ContentResolver r6 = r4.getContentResolver()
            android.net.Uri r5 = r5.f334a     // Catch:{ IOException -> 0x0082 }
            java.lang.String r0 = "r"
            android.os.ParcelFileDescriptor r5 = r6.openFileDescriptor(r5, r0, r2)     // Catch:{ IOException -> 0x0082 }
            if (r5 != 0) goto L_0x001e
            if (r5 == 0) goto L_0x001d
            r5.close()     // Catch:{ IOException -> 0x0082 }
        L_0x001d:
            return r2
        L_0x001e:
            java.lang.String r6 = "/proc/self/fd/"
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ ErrnoException -> 0x0046 }
            r0.<init>(r6)     // Catch:{ ErrnoException -> 0x0046 }
            int r6 = r5.getFd()     // Catch:{ ErrnoException -> 0x0046 }
            r0.append(r6)     // Catch:{ ErrnoException -> 0x0046 }
            java.lang.String r6 = r0.toString()     // Catch:{ ErrnoException -> 0x0046 }
            java.lang.String r6 = android.system.Os.readlink(r6)     // Catch:{ ErrnoException -> 0x0046 }
            android.system.StructStat r0 = android.system.Os.stat(r6)     // Catch:{ ErrnoException -> 0x0046 }
            int r0 = r0.st_mode     // Catch:{ ErrnoException -> 0x0046 }
            boolean r0 = android.system.OsConstants.S_ISREG(r0)     // Catch:{ ErrnoException -> 0x0046 }
            if (r0 == 0) goto L_0x0047
            java.io.File r0 = new java.io.File     // Catch:{ ErrnoException -> 0x0046 }
            r0.<init>(r6)     // Catch:{ ErrnoException -> 0x0046 }
            goto L_0x0048
        L_0x0046:
        L_0x0047:
            r0 = r2
        L_0x0048:
            if (r0 == 0) goto L_0x005b
            boolean r6 = r0.canRead()     // Catch:{ all -> 0x0059 }
            if (r6 != 0) goto L_0x0051
            goto L_0x005b
        L_0x0051:
            android.graphics.Typeface r4 = android.graphics.Typeface.createFromFile(r0)     // Catch:{ all -> 0x0059 }
            r5.close()     // Catch:{ IOException -> 0x0082 }
            return r4
        L_0x0059:
            r4 = move-exception
            goto L_0x0079
        L_0x005b:
            java.io.FileInputStream r6 = new java.io.FileInputStream     // Catch:{ all -> 0x0059 }
            java.io.FileDescriptor r0 = r5.getFileDescriptor()     // Catch:{ all -> 0x0059 }
            r6.<init>(r0)     // Catch:{ all -> 0x0059 }
            android.graphics.Typeface r4 = r3.v(r4, r6)     // Catch:{ all -> 0x006f }
            r6.close()     // Catch:{ all -> 0x0059 }
            r5.close()     // Catch:{ IOException -> 0x0082 }
            return r4
        L_0x006f:
            r4 = move-exception
            r6.close()     // Catch:{ all -> 0x0074 }
            goto L_0x0078
        L_0x0074:
            r6 = move-exception
            r4.addSuppressed(r6)     // Catch:{ all -> 0x0059 }
        L_0x0078:
            throw r4     // Catch:{ all -> 0x0059 }
        L_0x0079:
            r5.close()     // Catch:{ all -> 0x007d }
            goto L_0x0081
        L_0x007d:
            r5 = move-exception
            r4.addSuppressed(r5)     // Catch:{ IOException -> 0x0082 }
        L_0x0081:
            throw r4     // Catch:{ IOException -> 0x0082 }
        L_0x0082:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: F.h.u(android.content.Context, K.k[], int):android.graphics.Typeface");
    }

    public static boolean L0(Object obj, String str, int i, boolean z2) {
        M0();
        try {
            return ((Boolean) f236q.invoke(obj, new Object[]{str, Integer.valueOf(i), Boolean.valueOf(z2)})).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException e) {
            throw new RuntimeException(e);
        }
    }
}
