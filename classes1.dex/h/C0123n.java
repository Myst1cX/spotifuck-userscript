package h;

import android.content.Context;

/* renamed from: h.n  reason: case insensitive filesystem */
public final /* synthetic */ class C0123n implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f3022a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Context f3023b;

    public /* synthetic */ C0123n(Context context, int i) {
        this.f3022a = i;
        this.f3023b = context;
    }

    /* JADX WARNING: type inference failed for: r0v14, types: [java.util.concurrent.Executor, java.lang.Object] */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x008a, code lost:
        if (r2 != null) goto L_0x008f;
     */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x0097  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r11 = this;
            int r0 = r11.f3022a
            switch(r0) {
                case 0: goto L_0x0030;
                case 1: goto L_0x0013;
                default: goto L_0x0005;
            }
        L_0x0005:
            h0.d r0 = new h0.d
            r0.<init>()
            K0.e r1 = h0.C0129f.f3063a
            r2 = 0
            android.content.Context r3 = r11.f3023b
            h0.C0129f.t(r3, r0, r1, r2)
            return
        L_0x0013:
            java.util.concurrent.ThreadPoolExecutor r0 = new java.util.concurrent.ThreadPoolExecutor
            java.util.concurrent.TimeUnit r9 = java.util.concurrent.TimeUnit.MILLISECONDS
            java.util.concurrent.LinkedBlockingQueue r10 = new java.util.concurrent.LinkedBlockingQueue
            r10.<init>()
            r5 = 0
            r6 = 1
            r7 = 0
            r4 = r0
            r4.<init>(r5, r6, r7, r9, r10)
            h.n r1 = new h.n
            android.content.Context r2 = r11.f3023b
            r3 = 2
            r1.<init>(r2, r3)
            r0.execute(r1)
            return
        L_0x0030:
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 1
            r2 = 33
            if (r0 < r2) goto L_0x00af
            android.content.ComponentName r3 = new android.content.ComponentName
            android.content.Context r4 = r11.f3023b
            java.lang.String r5 = "androidx.appcompat.app.AppLocalesMetadataHolderService"
            r3.<init>(r4, r5)
            android.content.pm.PackageManager r5 = r4.getPackageManager()
            int r5 = r5.getComponentEnabledSetting(r3)
            if (r5 == r1) goto L_0x00af
            java.lang.String r5 = "locale"
            if (r0 < r2) goto L_0x0088
            r.c r0 = h.s.f3033l
            java.util.Iterator r0 = r0.iterator()
        L_0x0054:
            r2 = r0
            r.g r2 = (r.g) r2
            boolean r6 = r2.hasNext()
            if (r6 == 0) goto L_0x0076
            java.lang.Object r2 = r2.next()
            java.lang.ref.WeakReference r2 = (java.lang.ref.WeakReference) r2
            java.lang.Object r2 = r2.get()
            h.s r2 = (h.s) r2
            if (r2 == 0) goto L_0x0054
            h.D r2 = (h.D) r2
            android.content.Context r2 = r2.f2889p
            if (r2 == 0) goto L_0x0054
            java.lang.Object r0 = r2.getSystemService(r5)
            goto L_0x0077
        L_0x0076:
            r0 = 0
        L_0x0077:
            if (r0 == 0) goto L_0x008d
            android.os.LocaleList r0 = h.p.a(r0)
            J.f r2 = new J.f
            J.j r6 = new J.j
            r6.<init>(r0)
            r2.<init>(r6)
            goto L_0x008f
        L_0x0088:
            J.f r2 = h.s.f3030h
            if (r2 == 0) goto L_0x008d
            goto L_0x008f
        L_0x008d:
            J.f r2 = J.f.f293b
        L_0x008f:
            J.h r0 = r2.f294a
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L_0x00a8
            java.lang.String r0 = C.e.e(r4)
            java.lang.Object r2 = r4.getSystemService(r5)
            if (r2 == 0) goto L_0x00a8
            android.os.LocaleList r0 = h.o.a(r0)
            h.p.b(r2, r0)
        L_0x00a8:
            android.content.pm.PackageManager r0 = r4.getPackageManager()
            r0.setComponentEnabledSetting(r3, r1, r1)
        L_0x00af:
            h.s.f3032k = r1
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: h.C0123n.run():void");
    }
}
