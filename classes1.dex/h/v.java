package h;

import E.j;
import N.C0001a0;
import N.D;
import N.Q;
import android.view.View;
import android.view.ViewGroup;
import android.widget.PopupWindow;
import java.util.WeakHashMap;
import p0.C0320a;

public final class v extends C0320a {

    /* renamed from: o  reason: collision with root package name */
    public final /* synthetic */ int f3040o;

    /* renamed from: p  reason: collision with root package name */
    public final /* synthetic */ Object f3041p;

    public /* synthetic */ v(int i, Object obj) {
        this.f3040o = i;
        this.f3041p = obj;
    }

    public void c() {
        Object obj = this.f3041p;
        switch (this.f3040o) {
            case 0:
                ((t) obj).f3037b.f2851A.setVisibility(0);
                return;
            case 1:
                D d2 = (D) obj;
                d2.f2851A.setVisibility(0);
                if (d2.f2851A.getParent() instanceof View) {
                    WeakHashMap weakHashMap = Q.f509a;
                    D.c((View) d2.f2851A.getParent());
                    return;
                }
                return;
            default:
                return;
        }
    }

    public final void a() {
        Object obj = this.f3041p;
        switch (this.f3040o) {
            case 0:
                t tVar = (t) obj;
                tVar.f3037b.f2851A.setAlpha(1.0f);
                D d2 = tVar.f3037b;
                d2.f2854D.d((C0001a0) null);
                d2.f2854D = null;
                return;
            case 1:
                D d3 = (D) obj;
                d3.f2851A.setAlpha(1.0f);
                d3.f2854D.d((C0001a0) null);
                d3.f2854D = null;
                return;
            default:
                j jVar = (j) obj;
                ((D) jVar.f109h).f2851A.setVisibility(8);
                D d4 = (D) jVar.f109h;
                PopupWindow popupWindow = d4.f2852B;
                if (popupWindow != null) {
                    popupWindow.dismiss();
                } else if (d4.f2851A.getParent() instanceof View) {
                    WeakHashMap weakHashMap = Q.f509a;
                    D.c((View) d4.f2851A.getParent());
                }
                d4.f2851A.e();
                d4.f2854D.d((C0001a0) null);
                d4.f2854D = null;
                ViewGroup viewGroup = d4.f2857G;
                WeakHashMap weakHashMap2 = Q.f509a;
                D.c(viewGroup);
                return;
        }
    }
}
