package h;

import android.content.Context;
import android.content.IntentFilter;
import android.os.PowerManager;
import android.support.v4.media.session.t;
import androidx.fragment.app.C0053g;

/* renamed from: h.A  reason: case insensitive filesystem */
public final class C0109A extends C0053g {

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ int f2831c = 0;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ D f2832d;
    public final Object e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C0109A(D d2, t tVar) {
        super(d2);
        this.f2832d = d2;
        this.e = tVar;
    }

    public final IntentFilter e() {
        switch (this.f2831c) {
            case 0:
                IntentFilter intentFilter = new IntentFilter();
                intentFilter.addAction("android.os.action.POWER_SAVE_MODE_CHANGED");
                return intentFilter;
            default:
                IntentFilter intentFilter2 = new IntentFilter();
                intentFilter2.addAction("android.intent.action.TIME_SET");
                intentFilter2.addAction("android.intent.action.TIMEZONE_CHANGED");
                intentFilter2.addAction("android.intent.action.TIME_TICK");
                return intentFilter2;
        }
    }

    /* JADX WARNING: type inference failed for: r3v14, types: [h.J, java.lang.Object] */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x0046  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x006c  */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x00e0  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int f() {
        /*
            r21 = this;
            r0 = r21
            int r1 = r0.f2831c
            switch(r1) {
                case 0: goto L_0x00f6;
                default: goto L_0x0007;
            }
        L_0x0007:
            java.lang.Object r1 = r0.e
            android.support.v4.media.session.t r1 = (android.support.v4.media.session.t) r1
            java.lang.Object r2 = r1.f1133d
            h.K r2 = (h.K) r2
            long r3 = r2.f2917b
            long r5 = java.lang.System.currentTimeMillis()
            r7 = 1
            int r8 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r8 <= 0) goto L_0x001e
            boolean r1 = r2.f2916a
            goto L_0x00f2
        L_0x001e:
            java.lang.Object r3 = r1.f1131b
            android.content.Context r3 = (android.content.Context) r3
            java.lang.String r4 = "android.permission.ACCESS_COARSE_LOCATION"
            int r4 = p0.C0320a.k(r3, r4)
            r5 = 0
            java.lang.Object r1 = r1.f1132c
            android.location.LocationManager r1 = (android.location.LocationManager) r1
            if (r4 != 0) goto L_0x003d
            java.lang.String r4 = "network"
            boolean r6 = r1.isProviderEnabled(r4)     // Catch:{ Exception -> 0x003c }
            if (r6 == 0) goto L_0x003d
            android.location.Location r4 = r1.getLastKnownLocation(r4)     // Catch:{ Exception -> 0x003c }
            goto L_0x003e
        L_0x003c:
        L_0x003d:
            r4 = r5
        L_0x003e:
            java.lang.String r6 = "android.permission.ACCESS_FINE_LOCATION"
            int r3 = p0.C0320a.k(r3, r6)
            if (r3 != 0) goto L_0x0054
            java.lang.String r3 = "gps"
            boolean r6 = r1.isProviderEnabled(r3)     // Catch:{ Exception -> 0x0053 }
            if (r6 == 0) goto L_0x0054
            android.location.Location r5 = r1.getLastKnownLocation(r3)     // Catch:{ Exception -> 0x0053 }
            goto L_0x0054
        L_0x0053:
        L_0x0054:
            if (r5 == 0) goto L_0x0066
            if (r4 == 0) goto L_0x0066
            long r8 = r5.getTime()
            long r10 = r4.getTime()
            int r1 = (r8 > r10 ? 1 : (r8 == r10 ? 0 : -1))
            if (r1 <= 0) goto L_0x0069
        L_0x0064:
            r4 = r5
            goto L_0x0069
        L_0x0066:
            if (r5 == 0) goto L_0x0069
            goto L_0x0064
        L_0x0069:
            r1 = 0
            if (r4 == 0) goto L_0x00e0
            long r5 = java.lang.System.currentTimeMillis()
            h.J r3 = h.J.f2912d
            if (r3 != 0) goto L_0x007b
            h.J r3 = new h.J
            r3.<init>()
            h.J.f2912d = r3
        L_0x007b:
            h.J r3 = h.J.f2912d
            r15 = 86400000(0x5265c00, double:4.2687272E-316)
            long r9 = r5 - r15
            double r11 = r4.getLatitude()
            double r13 = r4.getLongitude()
            r8 = r3
            r8.a(r9, r11, r13)
            double r11 = r4.getLatitude()
            double r13 = r4.getLongitude()
            r9 = r5
            r8.a(r9, r11, r13)
            int r8 = r3.f2915c
            if (r8 != r7) goto L_0x009f
            r1 = 1
        L_0x009f:
            long r13 = r3.f2914b
            long r11 = r3.f2913a
            long r9 = r5 + r15
            double r15 = r4.getLatitude()
            double r17 = r4.getLongitude()
            r8 = r3
            r19 = r11
            r11 = r15
            r15 = r13
            r13 = r17
            r8.a(r9, r11, r13)
            long r13 = r3.f2914b
            r3 = -1
            int r8 = (r15 > r3 ? 1 : (r15 == r3 ? 0 : -1))
            if (r8 == 0) goto L_0x00d6
            int r8 = (r19 > r3 ? 1 : (r19 == r3 ? 0 : -1))
            if (r8 != 0) goto L_0x00c4
            goto L_0x00d6
        L_0x00c4:
            int r3 = (r5 > r19 ? 1 : (r5 == r19 ? 0 : -1))
            if (r3 <= 0) goto L_0x00c9
            goto L_0x00d1
        L_0x00c9:
            int r3 = (r5 > r15 ? 1 : (r5 == r15 ? 0 : -1))
            if (r3 <= 0) goto L_0x00d0
            r13 = r19
            goto L_0x00d1
        L_0x00d0:
            r13 = r15
        L_0x00d1:
            r3 = 60000(0xea60, double:2.9644E-319)
            long r13 = r13 + r3
            goto L_0x00db
        L_0x00d6:
            r3 = 43200000(0x2932e00, double:2.1343636E-316)
            long r13 = r5 + r3
        L_0x00db:
            r2.f2916a = r1
            r2.f2917b = r13
            goto L_0x00f2
        L_0x00e0:
            java.util.Calendar r2 = java.util.Calendar.getInstance()
            r3 = 11
            int r2 = r2.get(r3)
            r3 = 6
            if (r2 < r3) goto L_0x00f1
            r3 = 22
            if (r2 < r3) goto L_0x00f2
        L_0x00f1:
            r1 = 1
        L_0x00f2:
            if (r1 == 0) goto L_0x00f5
            r7 = 2
        L_0x00f5:
            return r7
        L_0x00f6:
            java.lang.Object r1 = r0.e
            android.os.PowerManager r1 = (android.os.PowerManager) r1
            boolean r1 = h.w.a(r1)
            if (r1 == 0) goto L_0x0102
            r1 = 2
            goto L_0x0103
        L_0x0102:
            r1 = 1
        L_0x0103:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: h.C0109A.f():int");
    }

    public final void h() {
        switch (this.f2831c) {
            case 0:
                this.f2832d.l(true, true);
                return;
            default:
                this.f2832d.l(true, true);
                return;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C0109A(D d2, Context context) {
        super(d2);
        this.f2832d = d2;
        this.e = (PowerManager) context.getApplicationContext().getSystemService("power");
    }
}
