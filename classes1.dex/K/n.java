package K;

import C.b;
import E.j;
import N.f0;
import N.j0;
import Q0.E;
import android.animation.ValueAnimator;
import android.os.Handler;
import android.view.View;
import androidx.fragment.app.C0055i;
import androidx.fragment.app.S;
import java.util.ArrayList;

public final class n implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f341a = 0;

    /* renamed from: b  reason: collision with root package name */
    public Object f342b;

    /* renamed from: c  reason: collision with root package name */
    public Object f343c;

    /* renamed from: d  reason: collision with root package name */
    public Object f344d;

    public /* synthetic */ n() {
    }

    public n(C0055i iVar, ArrayList arrayList, S s2) {
        this.f344d = iVar;
        this.f342b = arrayList;
        this.f343c = s2;
    }

    public final void run() {
        Object obj;
        switch (this.f341a) {
            case 0:
                try {
                    obj = ((f) this.f342b).call();
                } catch (Exception unused) {
                    obj = null;
                }
                ((Handler) this.f344d).post(new b((Object) (g) this.f343c, obj, 4));
                return;
            case 1:
                f0.h((View) this.f342b, (j) this.f343c);
                ((ValueAnimator) this.f344d).start();
                return;
            default:
                ArrayList arrayList = (ArrayList) this.f342b;
                S s2 = (S) this.f343c;
                if (arrayList.contains(s2)) {
                    arrayList.remove(s2);
                    ((C0055i) this.f344d).getClass();
                    E.a(s2.f1648c.f1737J, s2.f1646a);
                    return;
                }
                return;
        }
    }

    public n(View view, j0 j0Var, j jVar, ValueAnimator valueAnimator) {
        this.f342b = view;
        this.f343c = jVar;
        this.f344d = valueAnimator;
    }
}
