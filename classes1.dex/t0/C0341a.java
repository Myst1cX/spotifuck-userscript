package t0;

import N.Q;
import T0.g;
import android.view.View;
import android.view.ViewParent;
import com.google.android.material.behavior.SwipeDismissBehavior;
import java.util.WeakHashMap;

/* renamed from: t0.a  reason: case insensitive filesystem */
public final class C0341a extends g {

    /* renamed from: l  reason: collision with root package name */
    public int f4677l;

    /* renamed from: m  reason: collision with root package name */
    public int f4678m = -1;

    /* renamed from: n  reason: collision with root package name */
    public final /* synthetic */ SwipeDismissBehavior f4679n;

    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0054, code lost:
        if (java.lang.Math.abs(r4) >= java.lang.Math.round(((float) r9.getWidth()) * 0.5f)) goto L_0x0056;
     */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x0079  */
    /* JADX WARNING: Removed duplicated region for block: B:31:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void F(android.view.View r9, float r10, float r11) {
        /*
            r8 = this;
            r11 = -1
            r8.f4678m = r11
            int r11 = r9.getWidth()
            r0 = 0
            r1 = 1
            com.google.android.material.behavior.SwipeDismissBehavior r2 = r8.f4679n
            r3 = 0
            int r4 = (r10 > r0 ? 1 : (r10 == r0 ? 0 : -1))
            if (r4 == 0) goto L_0x0039
            java.util.WeakHashMap r5 = N.Q.f509a
            int r5 = r9.getLayoutDirection()
            if (r5 != r1) goto L_0x001a
            r5 = 1
            goto L_0x001b
        L_0x001a:
            r5 = 0
        L_0x001b:
            int r6 = r2.f2106d
            r7 = 2
            if (r6 != r7) goto L_0x0021
            goto L_0x0056
        L_0x0021:
            if (r6 != 0) goto L_0x002d
            if (r5 == 0) goto L_0x002a
            int r4 = (r10 > r0 ? 1 : (r10 == r0 ? 0 : -1))
            if (r4 >= 0) goto L_0x006a
            goto L_0x0056
        L_0x002a:
            if (r4 <= 0) goto L_0x006a
            goto L_0x0056
        L_0x002d:
            if (r6 != r1) goto L_0x006a
            if (r5 == 0) goto L_0x0034
            if (r4 <= 0) goto L_0x006a
            goto L_0x0056
        L_0x0034:
            int r4 = (r10 > r0 ? 1 : (r10 == r0 ? 0 : -1))
            if (r4 >= 0) goto L_0x006a
            goto L_0x0056
        L_0x0039:
            int r4 = r9.getLeft()
            int r5 = r8.f4677l
            int r4 = r4 - r5
            int r5 = r9.getWidth()
            float r5 = (float) r5
            r2.getClass()
            r6 = 1056964608(0x3f000000, float:0.5)
            float r5 = r5 * r6
            int r5 = java.lang.Math.round(r5)
            int r4 = java.lang.Math.abs(r4)
            if (r4 < r5) goto L_0x006a
        L_0x0056:
            int r10 = (r10 > r0 ? 1 : (r10 == r0 ? 0 : -1))
            if (r10 < 0) goto L_0x0065
            int r10 = r9.getLeft()
            int r0 = r8.f4677l
            if (r10 >= r0) goto L_0x0063
            goto L_0x0065
        L_0x0063:
            int r0 = r0 + r11
            goto L_0x006d
        L_0x0065:
            int r10 = r8.f4677l
            int r0 = r10 - r11
            goto L_0x006d
        L_0x006a:
            int r0 = r8.f4677l
            r1 = 0
        L_0x006d:
            V.e r10 = r2.f2103a
            int r11 = r9.getTop()
            boolean r10 = r10.o(r0, r11)
            if (r10 == 0) goto L_0x0083
            C.b r10 = new C.b
            r10.<init>((com.google.android.material.behavior.SwipeDismissBehavior) r2, (android.view.View) r9, (boolean) r1)
            java.util.WeakHashMap r11 = N.Q.f509a
            r9.postOnAnimation(r10)
        L_0x0083:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: t0.C0341a.F(android.view.View, float, float):void");
    }

    public final void C(View view, int i) {
        this.f4678m = i;
        this.f4677l = view.getLeft();
        ViewParent parent = view.getParent();
        if (parent != null) {
            SwipeDismissBehavior swipeDismissBehavior = this.f4679n;
            swipeDismissBehavior.f2105c = true;
            parent.requestDisallowInterceptTouchEvent(true);
            swipeDismissBehavior.f2105c = false;
        }
    }

    public final void D(int i) {
        this.f4679n.getClass();
    }

    public final boolean S(View view, int i) {
        int i2 = this.f4678m;
        if ((i2 == -1 || i2 == i) && this.f4679n.r(view)) {
            return true;
        }
        return false;
    }

    public final int f(View view, int i) {
        boolean z2;
        int i2;
        int i3;
        int width;
        WeakHashMap weakHashMap = Q.f509a;
        if (view.getLayoutDirection() == 1) {
            z2 = true;
        } else {
            z2 = false;
        }
        int i4 = this.f4679n.f2106d;
        if (i4 != 0) {
            if (i4 != 1) {
                i3 = this.f4677l - view.getWidth();
                i2 = view.getWidth() + this.f4677l;
            } else if (z2) {
                i3 = this.f4677l;
                width = view.getWidth();
            } else {
                i3 = this.f4677l - view.getWidth();
                i2 = this.f4677l;
            }
            return Math.min(Math.max(i3, i), i2);
        } else if (z2) {
            i3 = this.f4677l - view.getWidth();
            i2 = this.f4677l;
            return Math.min(Math.max(i3, i), i2);
        } else {
            i3 = this.f4677l;
            width = view.getWidth();
        }
        i2 = width + i3;
        return Math.min(Math.max(i3, i), i2);
    }

    public C0341a(SwipeDismissBehavior swipeDismissBehavior) {
        this.f4679n = swipeDismissBehavior;
    }

    public final void E(View view, int i, int i2) {
        SwipeDismissBehavior swipeDismissBehavior = this.f4679n;
        float width = ((float) view.getWidth()) * swipeDismissBehavior.e;
        float width2 = ((float) view.getWidth()) * swipeDismissBehavior.f2107f;
        float abs = (float) Math.abs(i - this.f4677l);
        if (abs <= width) {
            view.setAlpha(1.0f);
        } else if (abs >= width2) {
            view.setAlpha(0.0f);
        } else {
            view.setAlpha(Math.min(Math.max(0.0f, 1.0f - ((abs - width) / (width2 - width))), 1.0f));
        }
    }

    public final int g(View view, int i) {
        return view.getTop();
    }

    public final int r(View view) {
        return view.getWidth();
    }
}
