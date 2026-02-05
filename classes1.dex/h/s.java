package h;

import J.f;
import android.content.ComponentName;
import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import r.c;
import r.g;

public abstract class s {

    /* renamed from: f  reason: collision with root package name */
    public static final q f3028f = new q(new Object());

    /* renamed from: g  reason: collision with root package name */
    public static final int f3029g = -100;

    /* renamed from: h  reason: collision with root package name */
    public static f f3030h = null;
    public static f i = null;

    /* renamed from: j  reason: collision with root package name */
    public static Boolean f3031j = null;

    /* renamed from: k  reason: collision with root package name */
    public static boolean f3032k = false;

    /* renamed from: l  reason: collision with root package name */
    public static final c f3033l = new c(0);

    /* renamed from: m  reason: collision with root package name */
    public static final Object f3034m = new Object();

    /* renamed from: n  reason: collision with root package name */
    public static final Object f3035n = new Object();

    public abstract void b();

    public abstract void c();

    public abstract boolean g(int i2);

    public abstract void h(int i2);

    public abstract void i(View view);

    public abstract void j(View view, ViewGroup.LayoutParams layoutParams);

    public abstract void k(CharSequence charSequence);

    public static boolean a(Context context) {
        int i2;
        if (f3031j == null) {
            try {
                int i3 = I.f2911f;
                if (Build.VERSION.SDK_INT >= 24) {
                    i2 = H.a() | 128;
                } else {
                    i2 = 640;
                }
                Bundle bundle = context.getPackageManager().getServiceInfo(new ComponentName(context, I.class), i2).metaData;
                if (bundle != null) {
                    f3031j = Boolean.valueOf(bundle.getBoolean("autoStoreLocales"));
                }
            } catch (PackageManager.NameNotFoundException unused) {
                f3031j = Boolean.FALSE;
            }
        }
        return f3031j.booleanValue();
    }

    public static void e(D d2) {
        synchronized (f3034m) {
            try {
                Iterator it2 = f3033l.iterator();
                while (true) {
                    g gVar = (g) it2;
                    if (gVar.hasNext()) {
                        s sVar = (s) ((WeakReference) gVar.next()).get();
                        if (sVar == d2 || sVar == null) {
                            gVar.remove();
                        }
                    }
                }
            } finally {
            }
        }
    }
}
