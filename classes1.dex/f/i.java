package F;

import K.k;
import android.content.Context;
import android.graphics.Typeface;
import android.net.Uri;
import android.util.Log;
import java.lang.reflect.Array;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;
import java.util.List;
import p0.C0320a;

public final class i extends C0320a {

    /* renamed from: o  reason: collision with root package name */
    public static final Class f239o;

    /* renamed from: p  reason: collision with root package name */
    public static final Constructor f240p;

    /* renamed from: q  reason: collision with root package name */
    public static final Method f241q;

    /* renamed from: r  reason: collision with root package name */
    public static final Method f242r;

    static {
        Method method;
        Class<?> cls;
        Method method2;
        Constructor<?> constructor = null;
        try {
            cls = Class.forName("android.graphics.FontFamily");
            Constructor<?> constructor2 = cls.getConstructor((Class[]) null);
            Class cls2 = Integer.TYPE;
            method = cls.getMethod("addFontWeightStyle", new Class[]{ByteBuffer.class, cls2, List.class, cls2, Boolean.TYPE});
            method2 = Typeface.class.getMethod("createFromFamiliesWithDefault", new Class[]{Array.newInstance(cls, 1).getClass()});
            constructor = constructor2;
        } catch (ClassNotFoundException | NoSuchMethodException e) {
            Log.e("TypefaceCompatApi24Impl", e.getClass().getName(), e);
            method2 = null;
            cls = null;
            method = null;
        }
        f240p = constructor;
        f239o = cls;
        f241q = method;
        f242r = method2;
    }

    public static boolean L0(Object obj, ByteBuffer byteBuffer, int i, int i2, boolean z2) {
        try {
            return ((Boolean) f241q.invoke(obj, new Object[]{byteBuffer, Integer.valueOf(i), null, Integer.valueOf(i2), Boolean.valueOf(z2)})).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return false;
        }
    }

    public static Typeface M0(Object obj) {
        try {
            Object newInstance = Array.newInstance(f239o, 1);
            Array.set(newInstance, 0, obj);
            return (Typeface) f242r.invoke((Object) null, new Object[]{newInstance});
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return null;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:39:0x005d  */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x005c A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final android.graphics.Typeface t(android.content.Context r17, E.g r18, android.content.res.Resources r19, int r20) {
        /*
            r16 = this;
            r1 = 0
            java.lang.reflect.Constructor r0 = f240p     // Catch:{ IllegalAccessException | InstantiationException | InvocationTargetException -> 0x0009 }
            java.lang.Object r0 = r0.newInstance(r1)     // Catch:{ IllegalAccessException | InstantiationException | InvocationTargetException -> 0x0009 }
            r2 = r0
            goto L_0x000b
        L_0x0009:
            r2 = r1
        L_0x000b:
            if (r2 != 0) goto L_0x000e
            return r1
        L_0x000e:
            r0 = r18
            E.h[] r3 = r0.f97a
            int r4 = r3.length
            r0 = 0
            r5 = 0
        L_0x0015:
            if (r5 >= r4) goto L_0x0072
            r6 = r3[r5]
            int r0 = r6.f102f
            java.io.File r7 = p0.C0320a.Y(r17)
            if (r7 != 0) goto L_0x0025
            r8 = r19
        L_0x0023:
            r0 = r1
            goto L_0x005a
        L_0x0025:
            r8 = r19
            boolean r0 = p0.C0320a.q(r7, r8, r0)     // Catch:{ all -> 0x006d }
            if (r0 != 0) goto L_0x0031
            r7.delete()
            goto L_0x0023
        L_0x0031:
            java.io.FileInputStream r9 = new java.io.FileInputStream     // Catch:{ IOException -> 0x0056 }
            r9.<init>(r7)     // Catch:{ IOException -> 0x0056 }
            java.nio.channels.FileChannel r10 = r9.getChannel()     // Catch:{ all -> 0x004a }
            long r14 = r10.size()     // Catch:{ all -> 0x004a }
            java.nio.channels.FileChannel$MapMode r11 = java.nio.channels.FileChannel.MapMode.READ_ONLY     // Catch:{ all -> 0x004a }
            r12 = 0
            java.nio.MappedByteBuffer r0 = r10.map(r11, r12, r14)     // Catch:{ all -> 0x004a }
            r9.close()     // Catch:{ IOException -> 0x0056 }
            goto L_0x0057
        L_0x004a:
            r0 = move-exception
            r10 = r0
            r9.close()     // Catch:{ all -> 0x0050 }
            goto L_0x0055
        L_0x0050:
            r0 = move-exception
            r9 = r0
            r10.addSuppressed(r9)     // Catch:{ IOException -> 0x0056 }
        L_0x0055:
            throw r10     // Catch:{ IOException -> 0x0056 }
        L_0x0056:
            r0 = r1
        L_0x0057:
            r7.delete()
        L_0x005a:
            if (r0 != 0) goto L_0x005d
            return r1
        L_0x005d:
            int r7 = r6.f99b
            boolean r9 = r6.f100c
            int r6 = r6.e
            boolean r0 = L0(r2, r0, r6, r7, r9)
            if (r0 != 0) goto L_0x006a
            return r1
        L_0x006a:
            int r5 = r5 + 1
            goto L_0x0015
        L_0x006d:
            r0 = move-exception
            r7.delete()
            throw r0
        L_0x0072:
            android.graphics.Typeface r0 = M0(r2)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: F.i.t(android.content.Context, E.g, android.content.res.Resources, int):android.graphics.Typeface");
    }

    public final Typeface u(Context context, k[] kVarArr, int i) {
        Object obj;
        try {
            obj = f240p.newInstance((Object[]) null);
        } catch (IllegalAccessException | InstantiationException | InvocationTargetException unused) {
            obj = null;
        }
        if (obj == null) {
            return null;
        }
        r.k kVar = new r.k();
        for (k kVar2 : kVarArr) {
            Uri uri = kVar2.f334a;
            ByteBuffer byteBuffer = (ByteBuffer) kVar.getOrDefault(uri, (Object) null);
            if (byteBuffer == null) {
                byteBuffer = C0320a.j0(context, uri);
                kVar.put(uri, byteBuffer);
            }
            if (byteBuffer == null) {
                return null;
            }
            if (!L0(obj, byteBuffer, kVar2.f335b, kVar2.f336c, kVar2.f337d)) {
                return null;
            }
        }
        Typeface M02 = M0(obj);
        if (M02 == null) {
            return null;
        }
        return Typeface.create(M02, i);
    }
}
