package h;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import java.lang.reflect.Constructor;
import o.C0249D;
import o.C0273d0;
import o.C0294o;
import o.C0296p;
import o.C0298q;
import r.k;

public class G {

    /* renamed from: b  reason: collision with root package name */
    public static final Class[] f2904b = {Context.class, AttributeSet.class};

    /* renamed from: c  reason: collision with root package name */
    public static final int[] f2905c = {16843375};

    /* renamed from: d  reason: collision with root package name */
    public static final int[] f2906d = {16844160};
    public static final int[] e = {16844156};

    /* renamed from: f  reason: collision with root package name */
    public static final int[] f2907f = {16844148};

    /* renamed from: g  reason: collision with root package name */
    public static final String[] f2908g = {"android.widget.", "android.view.", "android.webkit."};

    /* renamed from: h  reason: collision with root package name */
    public static final k f2909h = new k();

    /* renamed from: a  reason: collision with root package name */
    public final Object[] f2910a = new Object[2];

    public C0294o a(Context context, AttributeSet attributeSet) {
        return new C0294o(context, attributeSet);
    }

    public C0296p b(Context context, AttributeSet attributeSet) {
        return new C0296p(context, attributeSet, 2130968736);
    }

    public C0298q c(Context context, AttributeSet attributeSet) {
        return new C0298q(context, attributeSet, 2130968765);
    }

    public C0249D d(Context context, AttributeSet attributeSet) {
        return new C0249D(context, attributeSet);
    }

    public C0273d0 e(Context context, AttributeSet attributeSet) {
        return new C0273d0(context, attributeSet);
    }

    public final View f(Context context, String str, String str2) {
        String str3;
        k kVar = f2909h;
        Constructor<? extends U> constructor = (Constructor) kVar.getOrDefault(str, (Object) null);
        if (constructor == null) {
            if (str2 != null) {
                try {
                    str3 = str2.concat(str);
                } catch (Exception unused) {
                    return null;
                }
            } else {
                str3 = str;
            }
            constructor = Class.forName(str3, false, context.getClassLoader()).asSubclass(View.class).getConstructor(f2904b);
            kVar.put(str, constructor);
        }
        constructor.setAccessible(true);
        return (View) constructor.newInstance(this.f2910a);
    }
}
