package C;

import android.os.Handler;
import android.os.Looper;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public abstract class d {

    /* renamed from: a  reason: collision with root package name */
    public static final Class f43a;

    /* renamed from: b  reason: collision with root package name */
    public static final Field f44b;

    /* renamed from: c  reason: collision with root package name */
    public static final Field f45c;

    /* renamed from: d  reason: collision with root package name */
    public static final Method f46d;
    public static final Method e;

    /* renamed from: f  reason: collision with root package name */
    public static final Method f47f;

    /* renamed from: g  reason: collision with root package name */
    public static final Handler f48g = new Handler(Looper.getMainLooper());

    /* JADX WARNING: Removed duplicated region for block: B:25:0x005b A[SYNTHETIC, Splitter:B:25:0x005b] */
    static {
        /*
            r0 = 3
            java.lang.Class<android.os.IBinder> r1 = android.os.IBinder.class
            r2 = 2
            r3 = 0
            r4 = 1
            java.lang.Class<android.app.Activity> r5 = android.app.Activity.class
            android.os.Handler r6 = new android.os.Handler
            android.os.Looper r7 = android.os.Looper.getMainLooper()
            r6.<init>(r7)
            f48g = r6
            r6 = 0
            java.lang.String r7 = "android.app.ActivityThread"
            java.lang.Class r7 = java.lang.Class.forName(r7)     // Catch:{ all -> 0x001b }
            goto L_0x001c
        L_0x001b:
            r7 = r6
        L_0x001c:
            f43a = r7
            java.lang.String r7 = "mMainThread"
            java.lang.reflect.Field r7 = r5.getDeclaredField(r7)     // Catch:{ all -> 0x0028 }
            r7.setAccessible(r4)     // Catch:{ all -> 0x0028 }
            goto L_0x0029
        L_0x0028:
            r7 = r6
        L_0x0029:
            f44b = r7
            java.lang.String r7 = "mToken"
            java.lang.reflect.Field r5 = r5.getDeclaredField(r7)     // Catch:{ all -> 0x0035 }
            r5.setAccessible(r4)     // Catch:{ all -> 0x0035 }
            goto L_0x0036
        L_0x0035:
            r5 = r6
        L_0x0036:
            f45c = r5
            java.lang.Class r5 = f43a
            java.lang.String r7 = "performStopActivity"
            if (r5 != 0) goto L_0x0040
        L_0x003e:
            r5 = r6
            goto L_0x0053
        L_0x0040:
            java.lang.Class[] r8 = new java.lang.Class[r0]     // Catch:{ all -> 0x003e }
            r8[r3] = r1     // Catch:{ all -> 0x003e }
            java.lang.Class r9 = java.lang.Boolean.TYPE     // Catch:{ all -> 0x003e }
            r8[r4] = r9     // Catch:{ all -> 0x003e }
            java.lang.Class<java.lang.String> r9 = java.lang.String.class
            r8[r2] = r9     // Catch:{ all -> 0x003e }
            java.lang.reflect.Method r5 = r5.getDeclaredMethod(r7, r8)     // Catch:{ all -> 0x003e }
            r5.setAccessible(r4)     // Catch:{ all -> 0x003e }
        L_0x0053:
            f46d = r5
            java.lang.Class r5 = f43a
            if (r5 != 0) goto L_0x005b
        L_0x0059:
            r5 = r6
            goto L_0x006a
        L_0x005b:
            java.lang.Class[] r8 = new java.lang.Class[r2]     // Catch:{ all -> 0x0059 }
            r8[r3] = r1     // Catch:{ all -> 0x0059 }
            java.lang.Class r9 = java.lang.Boolean.TYPE     // Catch:{ all -> 0x0059 }
            r8[r4] = r9     // Catch:{ all -> 0x0059 }
            java.lang.reflect.Method r5 = r5.getDeclaredMethod(r7, r8)     // Catch:{ all -> 0x0059 }
            r5.setAccessible(r4)     // Catch:{ all -> 0x0059 }
        L_0x006a:
            e = r5
            java.lang.Class r5 = f43a
            int r7 = android.os.Build.VERSION.SDK_INT
            r8 = 26
            if (r7 == r8) goto L_0x0078
            r8 = 27
            if (r7 != r8) goto L_0x00a9
        L_0x0078:
            if (r5 != 0) goto L_0x007b
            goto L_0x00a9
        L_0x007b:
            java.lang.String r7 = "requestRelaunchActivity"
            r8 = 9
            java.lang.Class[] r8 = new java.lang.Class[r8]     // Catch:{ all -> 0x00a9 }
            r8[r3] = r1     // Catch:{ all -> 0x00a9 }
            java.lang.Class<java.util.List> r1 = java.util.List.class
            r8[r4] = r1     // Catch:{ all -> 0x00a9 }
            r8[r2] = r1     // Catch:{ all -> 0x00a9 }
            java.lang.Class r1 = java.lang.Integer.TYPE     // Catch:{ all -> 0x00a9 }
            r8[r0] = r1     // Catch:{ all -> 0x00a9 }
            java.lang.Class r0 = java.lang.Boolean.TYPE     // Catch:{ all -> 0x00a9 }
            r1 = 4
            r8[r1] = r0     // Catch:{ all -> 0x00a9 }
            java.lang.Class<android.content.res.Configuration> r1 = android.content.res.Configuration.class
            r2 = 5
            r8[r2] = r1     // Catch:{ all -> 0x00a9 }
            r2 = 6
            r8[r2] = r1     // Catch:{ all -> 0x00a9 }
            r1 = 7
            r8[r1] = r0     // Catch:{ all -> 0x00a9 }
            r1 = 8
            r8[r1] = r0     // Catch:{ all -> 0x00a9 }
            java.lang.reflect.Method r0 = r5.getDeclaredMethod(r7, r8)     // Catch:{ all -> 0x00a9 }
            r0.setAccessible(r4)     // Catch:{ all -> 0x00a9 }
            r6 = r0
        L_0x00a9:
            f47f = r6
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: C.d.<clinit>():void");
    }
}
