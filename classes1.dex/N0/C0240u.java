package n0;

import Q0.E;
import android.view.View;
import java.util.ArrayList;
import java.util.HashMap;

/* renamed from: n0.u  reason: case insensitive filesystem */
public final class C0240u {

    /* renamed from: a  reason: collision with root package name */
    public final HashMap f4028a = new HashMap();

    /* renamed from: b  reason: collision with root package name */
    public final View f4029b;

    /* renamed from: c  reason: collision with root package name */
    public final ArrayList f4030c = new ArrayList();

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0004, code lost:
        r3 = (n0.C0240u) r3;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean equals(java.lang.Object r3) {
        /*
            r2 = this;
            boolean r0 = r3 instanceof n0.C0240u
            if (r0 == 0) goto L_0x0018
            n0.u r3 = (n0.C0240u) r3
            android.view.View r0 = r3.f4029b
            android.view.View r1 = r2.f4029b
            if (r1 != r0) goto L_0x0018
            java.util.HashMap r0 = r2.f4028a
            java.util.HashMap r3 = r3.f4028a
            boolean r3 = r0.equals(r3)
            if (r3 == 0) goto L_0x0018
            r3 = 1
            return r3
        L_0x0018:
            r3 = 0
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: n0.C0240u.equals(java.lang.Object):boolean");
    }

    public final int hashCode() {
        return this.f4028a.hashCode() + (this.f4029b.hashCode() * 31);
    }

    public final String toString() {
        String f2 = E.f(("TransitionValues@" + Integer.toHexString(hashCode()) + ":\n") + "    view = " + this.f4029b + "\n", "    values:");
        HashMap hashMap = this.f4028a;
        for (String str : hashMap.keySet()) {
            f2 = f2 + "    " + str + ": " + hashMap.get(str) + "\n";
        }
        return f2;
    }

    public C0240u(View view) {
        this.f4029b = view;
    }
}
