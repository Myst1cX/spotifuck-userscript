package F;

import E.g;
import E.h;
import K.k;
import android.content.Context;
import android.content.res.AssetManager;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.graphics.fonts.FontVariationAxis;
import android.net.Uri;
import android.os.CancellationSignal;
import android.os.ParcelFileDescriptor;
import android.util.Log;
import java.io.IOException;
import java.lang.reflect.Array;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import p0.C0320a;

public class j extends h {

    /* renamed from: t  reason: collision with root package name */
    public final Class f243t;

    /* renamed from: u  reason: collision with root package name */
    public final Constructor f244u;

    /* renamed from: v  reason: collision with root package name */
    public final Method f245v;

    /* renamed from: w  reason: collision with root package name */
    public final Method f246w;

    /* renamed from: x  reason: collision with root package name */
    public final Method f247x;

    /* renamed from: y  reason: collision with root package name */
    public final Method f248y;

    /* renamed from: z  reason: collision with root package name */
    public final Method f249z;

    public final boolean O0(Context context, Object obj, String str, int i, int i2, int i3, FontVariationAxis[] fontVariationAxisArr) {
        try {
            return ((Boolean) this.f245v.invoke(obj, new Object[]{context.getAssets(), str, 0, Boolean.FALSE, Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), fontVariationAxisArr})).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return false;
        }
    }

    public Typeface P0(Object obj) {
        try {
            Object newInstance = Array.newInstance(this.f243t, 1);
            Array.set(newInstance, 0, obj);
            return (Typeface) this.f249z.invoke((Object) null, new Object[]{newInstance, -1, -1});
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return null;
        }
    }

    public final Object S0() {
        try {
            return this.f244u.newInstance((Object[]) null);
        } catch (IllegalAccessException | InstantiationException | InvocationTargetException unused) {
            return null;
        }
    }

    public Method U0(Class cls) {
        Class cls2 = Integer.TYPE;
        Method declaredMethod = Typeface.class.getDeclaredMethod("createFromFamiliesWithDefault", new Class[]{Array.newInstance(cls, 1).getClass(), cls2, cls2});
        declaredMethod.setAccessible(true);
        return declaredMethod;
    }

    public final Typeface u(Context context, k[] kVarArr, int i) {
        Typeface P02;
        boolean z2;
        ParcelFileDescriptor openFileDescriptor;
        if (kVarArr.length < 1) {
            return null;
        }
        if (!R0()) {
            k D2 = D(i, kVarArr);
            try {
                openFileDescriptor = context.getContentResolver().openFileDescriptor(D2.f334a, "r", (CancellationSignal) null);
                if (openFileDescriptor == null) {
                    if (openFileDescriptor != null) {
                        openFileDescriptor.close();
                    }
                    return null;
                }
                Typeface build = new Typeface.Builder(openFileDescriptor.getFileDescriptor()).setWeight(D2.f336c).setItalic(D2.f337d).build();
                openFileDescriptor.close();
                return build;
            } catch (IOException unused) {
                return null;
            } catch (Throwable th) {
                th.addSuppressed(th);
            }
        } else {
            HashMap hashMap = new HashMap();
            for (k kVar : kVarArr) {
                if (kVar.e == 0) {
                    Uri uri = kVar.f334a;
                    if (!hashMap.containsKey(uri)) {
                        hashMap.put(uri, C0320a.j0(context, uri));
                    }
                }
            }
            Map unmodifiableMap = Collections.unmodifiableMap(hashMap);
            Object S02 = S0();
            if (S02 == null) {
                return null;
            }
            boolean z3 = false;
            for (k kVar2 : kVarArr) {
                ByteBuffer byteBuffer = (ByteBuffer) unmodifiableMap.get(kVar2.f334a);
                if (byteBuffer != null) {
                    try {
                        z2 = ((Boolean) this.f246w.invoke(S02, new Object[]{byteBuffer, Integer.valueOf(kVar2.f335b), null, Integer.valueOf(kVar2.f336c), Integer.valueOf(kVar2.f337d ? 1 : 0)})).booleanValue();
                    } catch (IllegalAccessException | InvocationTargetException unused2) {
                        z2 = false;
                    }
                    if (!z2) {
                        N0(S02);
                        return null;
                    }
                    z3 = true;
                }
            }
            if (!z3) {
                N0(S02);
                return null;
            } else if (Q0(S02) && (P02 = P0(S02)) != null) {
                return Typeface.create(P02, i);
            } else {
                return null;
            }
        }
        throw th;
    }

    public static Method T0(Class cls) {
        Class cls2 = Integer.TYPE;
        return cls.getMethod("addFontFromAssetManager", new Class[]{AssetManager.class, String.class, cls2, Boolean.TYPE, cls2, cls2, cls2, FontVariationAxis[].class});
    }

    public final void N0(Object obj) {
        try {
            this.f248y.invoke(obj, (Object[]) null);
        } catch (IllegalAccessException | InvocationTargetException unused) {
        }
    }

    public final boolean Q0(Object obj) {
        try {
            return ((Boolean) this.f247x.invoke(obj, (Object[]) null)).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return false;
        }
    }

    public final boolean R0() {
        Method method = this.f245v;
        if (method == null) {
            Log.w("TypefaceCompatApi26Impl", "Unable to collect necessary private methods. Fallback to legacy implementation.");
        }
        if (method != null) {
            return true;
        }
        return false;
    }

    public j() {
        Method method;
        Method method2;
        Method method3;
        Method method4;
        Constructor<?> constructor;
        Method method5;
        Class<?> cls = null;
        try {
            Class<?> cls2 = Class.forName("android.graphics.FontFamily");
            constructor = cls2.getConstructor((Class[]) null);
            method4 = T0(cls2);
            Class cls3 = Integer.TYPE;
            method3 = cls2.getMethod("addFontFromBuffer", new Class[]{ByteBuffer.class, cls3, FontVariationAxis[].class, cls3, cls3});
            method2 = cls2.getMethod("freeze", (Class[]) null);
            method = cls2.getMethod("abortCreation", (Class[]) null);
            Class<?> cls4 = cls2;
            method5 = U0(cls2);
            cls = cls4;
        } catch (ClassNotFoundException | NoSuchMethodException e) {
            Log.e("TypefaceCompatApi26Impl", "Unable to collect necessary methods for class ".concat(e.getClass().getName()), e);
            method5 = null;
            constructor = null;
            method4 = null;
            method3 = null;
            method2 = null;
            method = null;
        }
        this.f243t = cls;
        this.f244u = constructor;
        this.f245v = method4;
        this.f246w = method3;
        this.f247x = method2;
        this.f248y = method;
        this.f249z = method5;
    }

    public final Typeface t(Context context, g gVar, Resources resources, int i) {
        if (!R0()) {
            return super.t(context, gVar, resources, i);
        }
        Object S02 = S0();
        if (S02 == null) {
            return null;
        }
        for (h hVar : gVar.f97a) {
            String str = hVar.f98a;
            FontVariationAxis[] fromFontVariationSettings = FontVariationAxis.fromFontVariationSettings(hVar.f101d);
            if (!O0(context, S02, str, hVar.e, hVar.f99b, hVar.f100c ? 1 : 0, fromFontVariationSettings)) {
                N0(S02);
                return null;
            }
        }
        if (!Q0(S02)) {
            return null;
        }
        return P0(S02);
    }

    public final Typeface w(Context context, Resources resources, int i, String str, int i2) {
        if (!R0()) {
            return super.w(context, resources, i, str, i2);
        }
        Object S02 = S0();
        if (S02 == null) {
            return null;
        }
        if (!O0(context, S02, str, 0, -1, -1, (FontVariationAxis[]) null)) {
            N0(S02);
            return null;
        } else if (!Q0(S02)) {
            return null;
        } else {
            return P0(S02);
        }
    }
}
