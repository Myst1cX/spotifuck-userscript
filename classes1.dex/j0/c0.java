package j0;

import N.C0002b;
import O.k;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import androidx.recyclerview.widget.RecyclerView;

public class c0 extends C0002b {

    /* renamed from: d  reason: collision with root package name */
    public final RecyclerView f3362d;
    public final b0 e;

    public final void d(View view, k kVar) {
        View.AccessibilityDelegate accessibilityDelegate = this.f523a;
        AccessibilityNodeInfo accessibilityNodeInfo = kVar.f751a;
        accessibilityDelegate.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
        RecyclerView recyclerView = this.f3362d;
        if (!recyclerView.K() && recyclerView.getLayoutManager() != null) {
            K layoutManager = recyclerView.getLayoutManager();
            RecyclerView recyclerView2 = layoutManager.f3278b;
            Q q2 = recyclerView2.f2010g;
            if (recyclerView2.canScrollVertically(-1) || layoutManager.f3278b.canScrollHorizontally(-1)) {
                kVar.a(8192);
                accessibilityNodeInfo.setScrollable(true);
            }
            if (layoutManager.f3278b.canScrollVertically(1) || layoutManager.f3278b.canScrollHorizontally(1)) {
                kVar.a(4096);
                accessibilityNodeInfo.setScrollable(true);
            }
            X x2 = recyclerView2.f2016j0;
            accessibilityNodeInfo.setCollectionInfo(AccessibilityNodeInfo.CollectionInfo.obtain(layoutManager.J(q2, x2), layoutManager.x(q2, x2), false, 0));
        }
    }

    public C0002b j() {
        return this.e;
    }

    public c0(RecyclerView recyclerView) {
        this.f3362d = recyclerView;
        C0002b j2 = j();
        if (j2 == null || !(j2 instanceof b0)) {
            this.e = new b0(this);
        } else {
            this.e = (b0) j2;
        }
    }

    public final void c(View view, AccessibilityEvent accessibilityEvent) {
        super.c(view, accessibilityEvent);
        if ((view instanceof RecyclerView) && !this.f3362d.K()) {
            RecyclerView recyclerView = (RecyclerView) view;
            if (recyclerView.getLayoutManager() != null) {
                recyclerView.getLayoutManager().T(accessibilityEvent);
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:28:0x0083 A[ADDED_TO_REGION] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean g(android.view.View r4, int r5, android.os.Bundle r6) {
        /*
            r3 = this;
            boolean r4 = super.g(r4, r5, r6)
            r6 = 1
            if (r4 == 0) goto L_0x0008
            return r6
        L_0x0008:
            androidx.recyclerview.widget.RecyclerView r4 = r3.f3362d
            boolean r0 = r4.K()
            r1 = 0
            if (r0 != 0) goto L_0x008d
            j0.K r0 = r4.getLayoutManager()
            if (r0 == 0) goto L_0x008d
            j0.K r4 = r4.getLayoutManager()
            androidx.recyclerview.widget.RecyclerView r0 = r4.f3278b
            j0.Q r2 = r0.f2010g
            r2 = 4096(0x1000, float:5.74E-42)
            if (r5 == r2) goto L_0x0058
            r2 = 8192(0x2000, float:1.14794E-41)
            if (r5 == r2) goto L_0x002a
            r5 = 0
            r0 = 0
            goto L_0x0081
        L_0x002a:
            r5 = -1
            boolean r0 = r0.canScrollVertically(r5)
            if (r0 == 0) goto L_0x003f
            int r0 = r4.f3289o
            int r2 = r4.G()
            int r0 = r0 - r2
            int r2 = r4.D()
            int r0 = r0 - r2
            int r0 = -r0
            goto L_0x0040
        L_0x003f:
            r0 = 0
        L_0x0040:
            androidx.recyclerview.widget.RecyclerView r2 = r4.f3278b
            boolean r5 = r2.canScrollHorizontally(r5)
            if (r5 == 0) goto L_0x0056
            int r5 = r4.f3288n
            int r2 = r4.E()
            int r5 = r5 - r2
            int r2 = r4.F()
            int r5 = r5 - r2
            int r5 = -r5
            goto L_0x0081
        L_0x0056:
            r5 = 0
            goto L_0x0081
        L_0x0058:
            boolean r5 = r0.canScrollVertically(r6)
            if (r5 == 0) goto L_0x006c
            int r5 = r4.f3289o
            int r0 = r4.G()
            int r5 = r5 - r0
            int r0 = r4.D()
            int r5 = r5 - r0
            r0 = r5
            goto L_0x006d
        L_0x006c:
            r0 = 0
        L_0x006d:
            androidx.recyclerview.widget.RecyclerView r5 = r4.f3278b
            boolean r5 = r5.canScrollHorizontally(r6)
            if (r5 == 0) goto L_0x0056
            int r5 = r4.f3288n
            int r2 = r4.E()
            int r5 = r5 - r2
            int r2 = r4.F()
            int r5 = r5 - r2
        L_0x0081:
            if (r0 != 0) goto L_0x0087
            if (r5 != 0) goto L_0x0087
            r6 = 0
            goto L_0x008c
        L_0x0087:
            androidx.recyclerview.widget.RecyclerView r4 = r4.f3278b
            r4.b0(r5, r0, r6)
        L_0x008c:
            return r6
        L_0x008d:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: j0.c0.g(android.view.View, int, android.os.Bundle):boolean");
    }
}
