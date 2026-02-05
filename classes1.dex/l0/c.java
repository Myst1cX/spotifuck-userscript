package L0;

import T0.g;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.material.sidesheet.SideSheetBehavior;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.LinkedHashSet;
import p0.C0320a;

public final class c extends g {

    /* renamed from: l  reason: collision with root package name */
    public final /* synthetic */ int f472l;

    /* renamed from: m  reason: collision with root package name */
    public final /* synthetic */ A.c f473m;

    public /* synthetic */ c(A.c cVar, int i) {
        this.f472l = i;
        this.f473m = cVar;
    }

    public final void D(int i) {
        switch (this.f472l) {
            case 0:
                if (i == 1) {
                    SideSheetBehavior sideSheetBehavior = (SideSheetBehavior) this.f473m;
                    if (sideSheetBehavior.f2315g) {
                        sideSheetBehavior.r(1);
                        return;
                    }
                    return;
                }
                return;
            default:
                if (i == 1) {
                    BottomSheetBehavior bottomSheetBehavior = (BottomSheetBehavior) this.f473m;
                    if (bottomSheetBehavior.f2118K) {
                        bottomSheetBehavior.C(1);
                        return;
                    }
                    return;
                }
                return;
        }
    }

    public final void E(View view, int i, int i2) {
        View view2;
        ViewGroup.MarginLayoutParams marginLayoutParams;
        switch (this.f472l) {
            case 0:
                SideSheetBehavior sideSheetBehavior = (SideSheetBehavior) this.f473m;
                WeakReference weakReference = sideSheetBehavior.f2324q;
                if (weakReference != null) {
                    view2 = (View) weakReference.get();
                } else {
                    view2 = null;
                }
                if (!(view2 == null || (marginLayoutParams = (ViewGroup.MarginLayoutParams) view2.getLayoutParams()) == null)) {
                    sideSheetBehavior.f2310a.I0(marginLayoutParams, view.getLeft(), view.getRight());
                    view2.setLayoutParams(marginLayoutParams);
                }
                LinkedHashSet linkedHashSet = sideSheetBehavior.f2328u;
                if (!linkedHashSet.isEmpty()) {
                    sideSheetBehavior.f2310a.f(i);
                    Iterator it2 = linkedHashSet.iterator();
                    if (it2.hasNext()) {
                        it2.next().getClass();
                        throw new ClassCastException();
                    }
                    return;
                }
                return;
            default:
                ((BottomSheetBehavior) this.f473m).u(i2);
                return;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0073, code lost:
        if (java.lang.Math.abs(r6.getTop() - r2.x()) < java.lang.Math.abs(r6.getTop() - r2.f2113E)) goto L_0x0014;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x00be, code lost:
        if (java.lang.Math.abs(r7 - r2.f2112D) < java.lang.Math.abs(r7 - r2.f2115G)) goto L_0x0014;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:55:0x0115, code lost:
        if (r0.f2310a.f0(r6) == false) goto L_0x0148;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:62:0x0146, code lost:
        if (java.lang.Math.abs(r7 - r0.f2310a.P()) < java.lang.Math.abs(r7 - r0.f2310a.Q())) goto L_0x0148;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0023, code lost:
        if (r7 > r2.f2113E) goto L_0x00e8;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void F(android.view.View r6, float r7, float r8) {
        /*
            r5 = this;
            int r0 = r5.f472l
            switch(r0) {
                case 0: goto L_0x00f0;
                default: goto L_0x0005;
            }
        L_0x0005:
            r0 = 6
            r1 = 3
            A.c r2 = r5.f473m
            com.google.android.material.bottomsheet.BottomSheetBehavior r2 = (com.google.android.material.bottomsheet.BottomSheetBehavior) r2
            r3 = 0
            int r4 = (r8 > r3 ? 1 : (r8 == r3 ? 0 : -1))
            if (r4 >= 0) goto L_0x0027
            boolean r7 = r2.f2136b
            if (r7 == 0) goto L_0x0017
        L_0x0014:
            r0 = 3
            goto L_0x00e8
        L_0x0017:
            int r7 = r6.getTop()
            java.lang.System.currentTimeMillis()
            r2.getClass()
            int r8 = r2.f2113E
            if (r7 <= r8) goto L_0x0014
            goto L_0x00e8
        L_0x0027:
            boolean r4 = r2.I
            if (r4 == 0) goto L_0x0076
            boolean r4 = r2.D(r6, r8)
            if (r4 == 0) goto L_0x0076
            float r7 = java.lang.Math.abs(r7)
            float r3 = java.lang.Math.abs(r8)
            int r7 = (r7 > r3 ? 1 : (r7 == r3 ? 0 : -1))
            if (r7 >= 0) goto L_0x0044
            int r7 = r2.f2140d
            float r7 = (float) r7
            int r7 = (r8 > r7 ? 1 : (r8 == r7 ? 0 : -1))
            if (r7 > 0) goto L_0x0053
        L_0x0044:
            int r7 = r6.getTop()
            int r8 = r2.f2127T
            int r3 = r2.x()
            int r3 = r3 + r8
            int r3 = r3 / 2
            if (r7 <= r3) goto L_0x0056
        L_0x0053:
            r0 = 5
            goto L_0x00e8
        L_0x0056:
            boolean r7 = r2.f2136b
            if (r7 == 0) goto L_0x005b
            goto L_0x0014
        L_0x005b:
            int r7 = r6.getTop()
            int r8 = r2.x()
            int r7 = r7 - r8
            int r7 = java.lang.Math.abs(r7)
            int r8 = r6.getTop()
            int r3 = r2.f2113E
            int r8 = r8 - r3
            int r8 = java.lang.Math.abs(r8)
            if (r7 >= r8) goto L_0x00e8
            goto L_0x0014
        L_0x0076:
            r4 = 4
            int r3 = (r8 > r3 ? 1 : (r8 == r3 ? 0 : -1))
            if (r3 == 0) goto L_0x00a7
            float r7 = java.lang.Math.abs(r7)
            float r8 = java.lang.Math.abs(r8)
            int r7 = (r7 > r8 ? 1 : (r7 == r8 ? 0 : -1))
            if (r7 <= 0) goto L_0x0088
            goto L_0x00a7
        L_0x0088:
            boolean r7 = r2.f2136b
            if (r7 == 0) goto L_0x008e
        L_0x008c:
            r0 = 4
            goto L_0x00e8
        L_0x008e:
            int r7 = r6.getTop()
            int r8 = r2.f2113E
            int r8 = r7 - r8
            int r8 = java.lang.Math.abs(r8)
            int r1 = r2.f2115G
            int r7 = r7 - r1
            int r7 = java.lang.Math.abs(r7)
            if (r8 >= r7) goto L_0x008c
            r2.getClass()
            goto L_0x00e8
        L_0x00a7:
            int r7 = r6.getTop()
            boolean r8 = r2.f2136b
            if (r8 == 0) goto L_0x00c2
            int r8 = r2.f2112D
            int r8 = r7 - r8
            int r8 = java.lang.Math.abs(r8)
            int r0 = r2.f2115G
            int r7 = r7 - r0
            int r7 = java.lang.Math.abs(r7)
            if (r8 >= r7) goto L_0x008c
            goto L_0x0014
        L_0x00c2:
            int r8 = r2.f2113E
            if (r7 >= r8) goto L_0x00d6
            int r8 = r2.f2115G
            int r8 = r7 - r8
            int r8 = java.lang.Math.abs(r8)
            if (r7 >= r8) goto L_0x00d2
            goto L_0x0014
        L_0x00d2:
            r2.getClass()
            goto L_0x00e8
        L_0x00d6:
            int r8 = r7 - r8
            int r8 = java.lang.Math.abs(r8)
            int r1 = r2.f2115G
            int r7 = r7 - r1
            int r7 = java.lang.Math.abs(r7)
            if (r8 >= r7) goto L_0x008c
            r2.getClass()
        L_0x00e8:
            r2.getClass()
            r7 = 1
            r2.E(r6, r0, r7)
            return
        L_0x00f0:
            A.c r0 = r5.f473m
            com.google.android.material.sidesheet.SideSheetBehavior r0 = (com.google.android.material.sidesheet.SideSheetBehavior) r0
            p0.a r1 = r0.f2310a
            boolean r1 = r1.c0(r7)
            r2 = 3
            if (r1 == 0) goto L_0x00fe
            goto L_0x0148
        L_0x00fe:
            p0.a r1 = r0.f2310a
            boolean r1 = r1.F0(r6, r7)
            r3 = 5
            if (r1 == 0) goto L_0x0119
            p0.a r1 = r0.f2310a
            boolean r7 = r1.g0(r7, r8)
            if (r7 != 0) goto L_0x0117
            p0.a r7 = r0.f2310a
            boolean r7 = r7.f0(r6)
            if (r7 == 0) goto L_0x0148
        L_0x0117:
            r2 = 5
            goto L_0x0148
        L_0x0119:
            r1 = 0
            int r1 = (r7 > r1 ? 1 : (r7 == r1 ? 0 : -1))
            if (r1 == 0) goto L_0x012b
            float r7 = java.lang.Math.abs(r7)
            float r8 = java.lang.Math.abs(r8)
            int r7 = (r7 > r8 ? 1 : (r7 == r8 ? 0 : -1))
            if (r7 <= 0) goto L_0x012b
            goto L_0x0117
        L_0x012b:
            int r7 = r6.getLeft()
            p0.a r8 = r0.f2310a
            int r8 = r8.P()
            int r8 = r7 - r8
            int r8 = java.lang.Math.abs(r8)
            p0.a r1 = r0.f2310a
            int r1 = r1.Q()
            int r7 = r7 - r1
            int r7 = java.lang.Math.abs(r7)
            if (r8 >= r7) goto L_0x0117
        L_0x0148:
            r7 = 1
            r0.t(r6, r2, r7)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: L0.c.F(android.view.View, float, float):void");
    }

    public final boolean S(View view, int i) {
        WeakReference weakReference;
        View view2;
        switch (this.f472l) {
            case 0:
                SideSheetBehavior sideSheetBehavior = (SideSheetBehavior) this.f473m;
                if (sideSheetBehavior.f2316h == 1 || (weakReference = sideSheetBehavior.f2323p) == null || weakReference.get() != view) {
                    return false;
                }
                return true;
            default:
                BottomSheetBehavior bottomSheetBehavior = (BottomSheetBehavior) this.f473m;
                int i2 = bottomSheetBehavior.f2119L;
                if (i2 == 1 || bottomSheetBehavior.f2135a0) {
                    return false;
                }
                if (i2 == 3 && bottomSheetBehavior.f2132Y == i) {
                    WeakReference weakReference2 = bottomSheetBehavior.f2129V;
                    if (weakReference2 != null) {
                        view2 = (View) weakReference2.get();
                    } else {
                        view2 = null;
                    }
                    if (view2 != null && view2.canScrollVertically(-1)) {
                        return false;
                    }
                }
                System.currentTimeMillis();
                WeakReference weakReference3 = bottomSheetBehavior.f2128U;
                if (weakReference3 == null || weakReference3.get() != view) {
                    return false;
                }
                return true;
        }
    }

    public final int f(View view, int i) {
        switch (this.f472l) {
            case 0:
                SideSheetBehavior sideSheetBehavior = (SideSheetBehavior) this.f473m;
                return C0320a.l(i, sideSheetBehavior.f2310a.U(), sideSheetBehavior.f2310a.T());
            default:
                return view.getLeft();
        }
    }

    public final int g(View view, int i) {
        switch (this.f472l) {
            case 0:
                return view.getTop();
            default:
                return C0320a.l(i, ((BottomSheetBehavior) this.f473m).x(), s());
        }
    }

    public int r(View view) {
        switch (this.f472l) {
            case 0:
                SideSheetBehavior sideSheetBehavior = (SideSheetBehavior) this.f473m;
                return sideSheetBehavior.f2319l + sideSheetBehavior.f2322o;
            default:
                return super.r(view);
        }
    }

    public int s() {
        switch (this.f472l) {
            case 1:
                BottomSheetBehavior bottomSheetBehavior = (BottomSheetBehavior) this.f473m;
                if (bottomSheetBehavior.I) {
                    return bottomSheetBehavior.f2127T;
                }
                return bottomSheetBehavior.f2115G;
            default:
                return super.s();
        }
    }
}
