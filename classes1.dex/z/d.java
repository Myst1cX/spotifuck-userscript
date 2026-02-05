package Z;

import Z0.c;
import android.util.Log;
import androidx.fragment.app.r;

public abstract class d {

    /* renamed from: a  reason: collision with root package name */
    public static final c f1007a = c.f1006a;

    public static c a(r rVar) {
        while (rVar != null) {
            if (rVar.o()) {
                rVar.j();
            }
            rVar = rVar.f1771z;
        }
        return f1007a;
    }

    public static void b(f fVar) {
        if (Log.isLoggable("FragmentManager", 3)) {
            fVar.f1008a.getClass();
        }
    }

    public static final void c(r rVar, String str) {
        c.e("fragment", rVar);
        c.e("previousFragmentId", str);
        b(new f(rVar, "Attempting to reuse fragment " + rVar + " with previous ID " + str));
        a(rVar).getClass();
    }
}
