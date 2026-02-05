package A;

import java.util.Comparator;

public final class j implements Comparator {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f20a;

    public /* synthetic */ j(int i) {
        this.f20a = i;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0026, code lost:
        if (r3 == null) goto L_0x0028;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0031, code lost:
        if (r3 != false) goto L_0x0029;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int compare(java.lang.Object r7, java.lang.Object r8) {
        /*
            r6 = this;
            r0 = -1
            r1 = 1
            r2 = 0
            int r3 = r6.f20a
            switch(r3) {
                case 0: goto L_0x005c;
                case 1: goto L_0x004e;
                case 2: goto L_0x0045;
                case 3: goto L_0x0012;
                default: goto L_0x0008;
            }
        L_0x0008:
            t.f r7 = (t.C0340f) r7
            t.f r8 = (t.C0340f) r8
            int r7 = r7.f4668b
            int r8 = r8.f4668b
            int r7 = r7 - r8
            return r7
        L_0x0012:
            j0.o r7 = (j0.C0153o) r7
            j0.o r8 = (j0.C0153o) r8
            androidx.recyclerview.widget.RecyclerView r3 = r7.f3471d
            if (r3 != 0) goto L_0x001c
            r4 = 1
            goto L_0x001d
        L_0x001c:
            r4 = 0
        L_0x001d:
            androidx.recyclerview.widget.RecyclerView r5 = r8.f3471d
            if (r5 != 0) goto L_0x0023
            r5 = 1
            goto L_0x0024
        L_0x0023:
            r5 = 0
        L_0x0024:
            if (r4 == r5) goto L_0x002b
            if (r3 != 0) goto L_0x0029
        L_0x0028:
            r0 = 1
        L_0x0029:
            r2 = r0
            goto L_0x0044
        L_0x002b:
            boolean r3 = r7.f3468a
            boolean r4 = r8.f3468a
            if (r3 == r4) goto L_0x0034
            if (r3 == 0) goto L_0x0028
            goto L_0x0029
        L_0x0034:
            int r0 = r8.f3469b
            int r1 = r7.f3469b
            int r0 = r0 - r1
            if (r0 == 0) goto L_0x003c
            goto L_0x0029
        L_0x003c:
            int r7 = r7.f3470c
            int r8 = r8.f3470c
            int r7 = r7 - r8
            if (r7 == 0) goto L_0x0044
            r2 = r7
        L_0x0044:
            return r2
        L_0x0045:
            java.lang.String r7 = (java.lang.String) r7
            java.lang.String r8 = (java.lang.String) r8
            int r7 = r7.compareTo(r8)
            return r7
        L_0x004e:
            android.view.View r7 = (android.view.View) r7
            android.view.View r8 = (android.view.View) r8
            int r7 = r7.getTop()
            int r8 = r8.getTop()
            int r7 = r7 - r8
            return r7
        L_0x005c:
            android.view.View r7 = (android.view.View) r7
            android.view.View r8 = (android.view.View) r8
            java.util.WeakHashMap r3 = N.Q.f509a
            float r7 = N.F.m(r7)
            float r8 = N.F.m(r8)
            int r3 = (r7 > r8 ? 1 : (r7 == r8 ? 0 : -1))
            if (r3 <= 0) goto L_0x006f
            goto L_0x0076
        L_0x006f:
            int r7 = (r7 > r8 ? 1 : (r7 == r8 ? 0 : -1))
            if (r7 >= 0) goto L_0x0075
            r0 = 1
            goto L_0x0076
        L_0x0075:
            r0 = 0
        L_0x0076:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: A.j.compare(java.lang.Object, java.lang.Object):int");
    }
}
