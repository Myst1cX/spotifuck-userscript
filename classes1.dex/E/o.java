package E;

import android.graphics.Typeface;
import androidx.activity.A;
import androidx.activity.h;
import androidx.activity.n;
import h.C0121l;
import h.q;

public final /* synthetic */ class o implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f115a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Object f116b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ Object f117c;

    public /* synthetic */ o(Object obj, Object obj2, int i) {
        this.f115a = i;
        this.f116b = obj;
        this.f117c = obj2;
    }

    public final void run() {
        Object obj = this.f116b;
        Object obj2 = this.f117c;
        switch (this.f115a) {
            case 0:
                ((b) obj).j((Typeface) obj2);
                return;
            case 1:
                C0121l lVar = (C0121l) obj;
                int i = n.f1174w;
                lVar.f50f.a(new h((A) obj2, lVar));
                return;
            default:
                Runnable runnable = (Runnable) obj2;
                q qVar = (q) obj;
                qVar.getClass();
                try {
                    runnable.run();
                    return;
                } finally {
                    qVar.a();
                }
        }
    }
}
