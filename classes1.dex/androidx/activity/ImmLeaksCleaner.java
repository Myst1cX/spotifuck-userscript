package androidx.activity;

import S0.b;
import androidx.lifecycle.C0081p;

public final class ImmLeaksCleaner implements C0081p {

    /* renamed from: b  reason: collision with root package name */
    public static final b f1141b = new b(r.f1196a);

    /* renamed from: a  reason: collision with root package name */
    public final n f1142a;

    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0039, code lost:
        if (r4 == false) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x003b, code lost:
        r3.isActive();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:?, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void b(androidx.lifecycle.r r3, androidx.lifecycle.C0077l r4) {
        /*
            r2 = this;
            androidx.lifecycle.l r3 = androidx.lifecycle.C0077l.ON_DESTROY
            if (r4 == r3) goto L_0x0005
            return
        L_0x0005:
            androidx.activity.n r3 = r2.f1142a
            java.lang.String r4 = "input_method"
            java.lang.Object r3 = r3.getSystemService(r4)
            java.lang.String r4 = "null cannot be cast to non-null type android.view.inputmethod.InputMethodManager"
            Z0.c.c(r4, r3)
            android.view.inputmethod.InputMethodManager r3 = (android.view.inputmethod.InputMethodManager) r3
            S0.b r4 = f1141b
            java.lang.Object r4 = r4.a()
            androidx.activity.q r4 = (androidx.activity.q) r4
            java.lang.Object r0 = r4.b(r3)
            if (r0 != 0) goto L_0x0023
            return
        L_0x0023:
            monitor-enter(r0)
            android.view.View r1 = r4.c(r3)     // Catch:{ all -> 0x003f }
            if (r1 != 0) goto L_0x002c
            monitor-exit(r0)
            return
        L_0x002c:
            boolean r1 = r1.isAttachedToWindow()     // Catch:{ all -> 0x003f }
            if (r1 == 0) goto L_0x0034
            monitor-exit(r0)
            return
        L_0x0034:
            boolean r4 = r4.a(r3)     // Catch:{ all -> 0x003f }
            monitor-exit(r0)
            if (r4 == 0) goto L_0x003e
            r3.isActive()
        L_0x003e:
            return
        L_0x003f:
            r3 = move-exception
            monitor-exit(r0)
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.activity.ImmLeaksCleaner.b(androidx.lifecycle.r, androidx.lifecycle.l):void");
    }

    public ImmLeaksCleaner(n nVar) {
        this.f1142a = nVar;
    }
}
