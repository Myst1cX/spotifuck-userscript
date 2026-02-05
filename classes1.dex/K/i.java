package K;

import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import r.f;
import r.k;

public abstract class i {

    /* renamed from: a  reason: collision with root package name */
    public static final f f328a = new f(16);

    /* renamed from: b  reason: collision with root package name */
    public static final ThreadPoolExecutor f329b;

    /* renamed from: c  reason: collision with root package name */
    public static final Object f330c = new Object();

    /* renamed from: d  reason: collision with root package name */
    public static final k f331d = new k();

    /* JADX WARNING: type inference failed for: r9v0, types: [java.lang.Object, K.m, java.util.concurrent.ThreadFactory] */
    static {
        ? obj = new Object();
        obj.f339a = "fonts-androidx";
        obj.f340b = 10;
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(0, 1, (long) 10000, TimeUnit.MILLISECONDS, new LinkedBlockingDeque(), obj);
        threadPoolExecutor.allowCoreThreadTimeOut(true);
        f329b = threadPoolExecutor;
    }

    /* JADX WARNING: Removed duplicated region for block: B:22:0x003f  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x0045  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static K.h a(java.lang.String r6, android.content.Context r7, K.e r8, int r9) {
        /*
            r.f r0 = f328a
            java.lang.Object r1 = r0.a(r6)
            android.graphics.Typeface r1 = (android.graphics.Typeface) r1
            if (r1 == 0) goto L_0x0010
            K.h r6 = new K.h
            r6.<init>((android.graphics.Typeface) r1)
            return r6
        L_0x0010:
            K.j r8 = K.d.a(r7, r8)     // Catch:{ NameNotFoundException -> 0x005c }
            r1 = 1
            r2 = -3
            java.lang.Object r3 = r8.f333g
            K.k[] r3 = (K.k[]) r3
            int r8 = r8.f332f
            if (r8 == 0) goto L_0x0024
            if (r8 == r1) goto L_0x0022
        L_0x0020:
            r1 = -3
            goto L_0x003d
        L_0x0022:
            r1 = -2
            goto L_0x003d
        L_0x0024:
            if (r3 == 0) goto L_0x003d
            int r8 = r3.length
            if (r8 != 0) goto L_0x002a
            goto L_0x003d
        L_0x002a:
            int r8 = r3.length
            r1 = 0
            r4 = 0
        L_0x002d:
            if (r4 >= r8) goto L_0x003d
            r5 = r3[r4]
            int r5 = r5.e
            if (r5 == 0) goto L_0x003a
            if (r5 >= 0) goto L_0x0038
            goto L_0x0020
        L_0x0038:
            r1 = r5
            goto L_0x003d
        L_0x003a:
            int r4 = r4 + 1
            goto L_0x002d
        L_0x003d:
            if (r1 == 0) goto L_0x0045
            K.h r6 = new K.h
            r6.<init>((int) r1)
            return r6
        L_0x0045:
            p0.a r8 = F.g.f232a
            android.graphics.Typeface r7 = r8.u(r7, r3, r9)
            if (r7 == 0) goto L_0x0056
            r0.b(r6, r7)
            K.h r6 = new K.h
            r6.<init>((android.graphics.Typeface) r7)
            return r6
        L_0x0056:
            K.h r6 = new K.h
            r6.<init>((int) r2)
            return r6
        L_0x005c:
            K.h r6 = new K.h
            r7 = -1
            r6.<init>((int) r7)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: K.i.a(java.lang.String, android.content.Context, K.e, int):K.h");
    }
}
