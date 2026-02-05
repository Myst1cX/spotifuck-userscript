package L0;

import E.p;
import N.Q;
import O.u;
import android.view.View;
import android.view.ViewParent;
import com.google.android.material.sidesheet.SideSheetBehavior;
import java.lang.ref.WeakReference;
import java.util.WeakHashMap;

public final /* synthetic */ class b implements u {

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ SideSheetBehavior f470f;

    /* renamed from: g  reason: collision with root package name */
    public final /* synthetic */ int f471g;

    public /* synthetic */ b(SideSheetBehavior sideSheetBehavior, int i) {
        this.f470f = sideSheetBehavior;
        this.f471g = i;
    }

    public final boolean c(View view) {
        String str;
        SideSheetBehavior sideSheetBehavior = this.f470f;
        sideSheetBehavior.getClass();
        int i = this.f471g;
        if (i == 1 || i == 2) {
            StringBuilder sb = new StringBuilder("STATE_");
            if (i == 1) {
                str = "DRAGGING";
            } else {
                str = "SETTLING";
            }
            sb.append(str);
            sb.append(" should not be set externally.");
            throw new IllegalArgumentException(sb.toString());
        }
        WeakReference weakReference = sideSheetBehavior.f2323p;
        if (weakReference == null || weakReference.get() == null) {
            sideSheetBehavior.r(i);
        } else {
            View view2 = (View) sideSheetBehavior.f2323p.get();
            p pVar = new p(i, 1, sideSheetBehavior);
            ViewParent parent = view2.getParent();
            if (parent != null && parent.isLayoutRequested()) {
                WeakHashMap weakHashMap = Q.f509a;
                if (view2.isAttachedToWindow()) {
                    view2.post(pVar);
                }
            }
            pVar.run();
        }
        return true;
    }
}
