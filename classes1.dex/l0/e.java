package L0;

import A.c;
import C.a;
import N.Q;
import N0.B;
import android.view.View;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.material.sidesheet.SideSheetBehavior;
import java.lang.ref.WeakReference;
import java.util.WeakHashMap;

public final class e {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f475a = 1;

    /* renamed from: b  reason: collision with root package name */
    public int f476b;

    /* renamed from: c  reason: collision with root package name */
    public boolean f477c;

    /* renamed from: d  reason: collision with root package name */
    public final Runnable f478d;
    public final /* synthetic */ c e;

    public e(SideSheetBehavior sideSheetBehavior) {
        this.e = sideSheetBehavior;
        this.f478d = new a(2, (Object) this);
    }

    public final void a(int i) {
        Runnable runnable = this.f478d;
        c cVar = this.e;
        switch (this.f475a) {
            case 0:
                SideSheetBehavior sideSheetBehavior = (SideSheetBehavior) cVar;
                WeakReference weakReference = sideSheetBehavior.f2323p;
                if (weakReference != null && weakReference.get() != null) {
                    this.f476b = i;
                    if (!this.f477c) {
                        WeakHashMap weakHashMap = Q.f509a;
                        ((View) sideSheetBehavior.f2323p.get()).postOnAnimation((a) runnable);
                        this.f477c = true;
                        return;
                    }
                    return;
                }
                return;
            default:
                BottomSheetBehavior bottomSheetBehavior = (BottomSheetBehavior) cVar;
                WeakReference weakReference2 = bottomSheetBehavior.f2128U;
                if (weakReference2 != null && weakReference2.get() != null) {
                    this.f476b = i;
                    if (!this.f477c) {
                        WeakHashMap weakHashMap2 = Q.f509a;
                        ((View) bottomSheetBehavior.f2128U.get()).postOnAnimation((B) runnable);
                        this.f477c = true;
                        return;
                    }
                    return;
                }
                return;
        }
    }

    public e(BottomSheetBehavior bottomSheetBehavior) {
        this.e = bottomSheetBehavior;
        this.f478d = new B(19, this);
    }
}
