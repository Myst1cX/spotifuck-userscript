package o;

import android.content.Context;
import android.os.Build;
import android.widget.PopupWindow;
import j0.C0160w;
import java.lang.reflect.Method;
import n.C0197l;
import n.C0199n;

public final class M0 extends H0 implements I0 {

    /* renamed from: J  reason: collision with root package name */
    public static final Method f4107J;
    public C0160w I;

    static {
        try {
            if (Build.VERSION.SDK_INT <= 28) {
                f4107J = PopupWindow.class.getDeclaredMethod("setTouchModal", new Class[]{Boolean.TYPE});
            }
        } catch (NoSuchMethodException unused) {
        }
    }

    public final void g(C0197l lVar, C0199n nVar) {
        C0160w wVar = this.I;
        if (wVar != null) {
            wVar.g(lVar, nVar);
        }
    }

    public final void o(C0197l lVar, C0199n nVar) {
        C0160w wVar = this.I;
        if (wVar != null) {
            wVar.o(lVar, nVar);
        }
    }

    public final C0309v0 q(Context context, boolean z2) {
        L0 l02 = new L0(context, z2);
        l02.setHoverListener(this);
        return l02;
    }
}
