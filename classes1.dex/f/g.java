package F;

import android.content.res.Resources;
import android.os.Build;
import android.util.Log;
import java.lang.reflect.Method;
import p0.C0320a;
import r.f;

public abstract class g {

    /* renamed from: a  reason: collision with root package name */
    public static final C0320a f232a;

    /* renamed from: b  reason: collision with root package name */
    public static final f f233b = new f(16);

    /* JADX WARNING: Code restructure failed: missing block: B:9:0x002f, code lost:
        if (r5.equals(r6) == false) goto L_0x0033;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static android.graphics.Typeface a(android.content.Context r16, E.f r17, android.content.res.Resources r18, int r19, java.lang.String r20, int r21, int r22, E.b r23, boolean r24) {
        /*
            r0 = r16
            r1 = r17
            r7 = r22
            r2 = r23
            r3 = 3
            r4 = 2
            r8 = 1
            r9 = 0
            boolean r5 = r1 instanceof E.i
            r10 = -3
            if (r5 == 0) goto L_0x0187
            E.i r1 = (E.i) r1
            java.lang.String r5 = r1.f106d
            r11 = 0
            if (r5 == 0) goto L_0x0032
            boolean r6 = r5.isEmpty()
            if (r6 == 0) goto L_0x001f
            goto L_0x0032
        L_0x001f:
            android.graphics.Typeface r5 = android.graphics.Typeface.create(r5, r9)
            android.graphics.Typeface r6 = android.graphics.Typeface.DEFAULT
            android.graphics.Typeface r6 = android.graphics.Typeface.create(r6, r9)
            if (r5 == 0) goto L_0x0032
            boolean r6 = r5.equals(r6)
            if (r6 != 0) goto L_0x0032
            goto L_0x0033
        L_0x0032:
            r5 = r11
        L_0x0033:
            if (r5 == 0) goto L_0x0049
            if (r2 == 0) goto L_0x0048
            android.os.Handler r0 = new android.os.Handler
            android.os.Looper r1 = android.os.Looper.getMainLooper()
            r0.<init>(r1)
            E.o r1 = new E.o
            r1.<init>(r2, r5, r9)
            r0.post(r1)
        L_0x0048:
            return r5
        L_0x0049:
            if (r24 == 0) goto L_0x0053
            int r5 = r1.f105c
            if (r5 != 0) goto L_0x0051
        L_0x004f:
            r5 = 1
            goto L_0x0056
        L_0x0051:
            r5 = 0
            goto L_0x0056
        L_0x0053:
            if (r2 != 0) goto L_0x0051
            goto L_0x004f
        L_0x0056:
            r6 = -1
            if (r24 == 0) goto L_0x005c
            int r12 = r1.f104b
            goto L_0x005d
        L_0x005c:
            r12 = -1
        L_0x005d:
            android.os.Handler r13 = new android.os.Handler
            android.os.Looper r14 = android.os.Looper.getMainLooper()
            r13.<init>(r14)
            A.b r14 = new A.b
            r14.<init>((int) r4)
            r14.f2g = r2
            K.e r15 = r1.f103a
            E.j r2 = new E.j
            r2.<init>((java.lang.Object) r14, (java.lang.Object) r13, (int) r4)
            if (r5 == 0) goto L_0x00f9
            r.f r1 = K.i.f328a
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r4 = r15.e
            r1.append(r4)
            java.lang.String r4 = "-"
            r1.append(r4)
            r1.append(r7)
            java.lang.String r4 = r1.toString()
            r.f r1 = K.i.f328a
            java.lang.Object r1 = r1.a(r4)
            android.graphics.Typeface r1 = (android.graphics.Typeface) r1
            if (r1 == 0) goto L_0x00a3
            C.b r0 = new C.b
            r0.<init>((java.lang.Object) r14, (java.lang.Object) r1, (int) r3)
            r13.post(r0)
            r11 = r1
            goto L_0x0182
        L_0x00a3:
            if (r12 != r6) goto L_0x00b0
            K.h r0 = K.i.a(r4, r0, r15, r7)
            r2.G(r0)
            android.graphics.Typeface r11 = r0.f326a
            goto L_0x0182
        L_0x00b0:
            K.f r8 = new K.f
            r6 = 0
            r1 = r8
            r13 = r2
            r2 = r4
            r3 = r16
            r4 = r15
            r5 = r22
            r1.<init>(r2, r3, r4, r5, r6)
            java.util.concurrent.ThreadPoolExecutor r0 = K.i.f329b     // Catch:{ InterruptedException -> 0x00e7 }
            java.util.concurrent.Future r0 = r0.submit(r8)     // Catch:{ InterruptedException -> 0x00e7 }
            long r1 = (long) r12
            java.util.concurrent.TimeUnit r3 = java.util.concurrent.TimeUnit.MILLISECONDS     // Catch:{ ExecutionException -> 0x00d6, InterruptedException -> 0x00d4, TimeoutException -> 0x00d8 }
            java.lang.Object r0 = r0.get(r1, r3)     // Catch:{ ExecutionException -> 0x00d6, InterruptedException -> 0x00d4, TimeoutException -> 0x00d8 }
            K.h r0 = (K.h) r0     // Catch:{ InterruptedException -> 0x00e7 }
            r13.G(r0)     // Catch:{ InterruptedException -> 0x00e7 }
            android.graphics.Typeface r11 = r0.f326a     // Catch:{ InterruptedException -> 0x00e7 }
            goto L_0x0182
        L_0x00d4:
            r0 = move-exception
            goto L_0x00e0
        L_0x00d6:
            r0 = move-exception
            goto L_0x00e1
        L_0x00d8:
            java.lang.InterruptedException r0 = new java.lang.InterruptedException     // Catch:{ InterruptedException -> 0x00e7 }
            java.lang.String r1 = "timeout"
            r0.<init>(r1)     // Catch:{ InterruptedException -> 0x00e7 }
            throw r0     // Catch:{ InterruptedException -> 0x00e7 }
        L_0x00e0:
            throw r0     // Catch:{ InterruptedException -> 0x00e7 }
        L_0x00e1:
            java.lang.RuntimeException r1 = new java.lang.RuntimeException     // Catch:{ InterruptedException -> 0x00e7 }
            r1.<init>(r0)     // Catch:{ InterruptedException -> 0x00e7 }
            throw r1     // Catch:{ InterruptedException -> 0x00e7 }
        L_0x00e7:
            K.a r0 = new K.a
            java.lang.Object r1 = r13.f108g
            A.b r1 = (A.b) r1
            r0.<init>((int) r10, (int) r9, (java.lang.Object) r1)
            java.lang.Object r1 = r13.f109h
            android.os.Handler r1 = (android.os.Handler) r1
            r1.post(r0)
            goto L_0x0182
        L_0x00f9:
            r1 = r2
            r.f r2 = K.i.f328a
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r4 = r15.e
            r2.append(r4)
            java.lang.String r4 = "-"
            r2.append(r4)
            r2.append(r7)
            java.lang.String r10 = r2.toString()
            r.f r2 = K.i.f328a
            java.lang.Object r2 = r2.a(r10)
            android.graphics.Typeface r2 = (android.graphics.Typeface) r2
            if (r2 == 0) goto L_0x0126
            C.b r0 = new C.b
            r0.<init>((java.lang.Object) r14, (java.lang.Object) r2, (int) r3)
            r13.post(r0)
            r11 = r2
            goto L_0x0182
        L_0x0126:
            K.g r2 = new K.g
            r2.<init>(r9, r1)
            java.lang.Object r3 = K.i.f330c
            monitor-enter(r3)
            r.k r1 = K.i.f331d     // Catch:{ all -> 0x013d }
            java.lang.Object r4 = r1.getOrDefault(r10, r11)     // Catch:{ all -> 0x013d }
            java.util.ArrayList r4 = (java.util.ArrayList) r4     // Catch:{ all -> 0x013d }
            if (r4 == 0) goto L_0x013f
            r4.add(r2)     // Catch:{ all -> 0x013d }
            monitor-exit(r3)     // Catch:{ all -> 0x013d }
            goto L_0x0182
        L_0x013d:
            r0 = move-exception
            goto L_0x0185
        L_0x013f:
            java.util.ArrayList r4 = new java.util.ArrayList     // Catch:{ all -> 0x013d }
            r4.<init>()     // Catch:{ all -> 0x013d }
            r4.add(r2)     // Catch:{ all -> 0x013d }
            r1.put(r10, r4)     // Catch:{ all -> 0x013d }
            monitor-exit(r3)     // Catch:{ all -> 0x013d }
            K.f r9 = new K.f
            r6 = 1
            r1 = r9
            r2 = r10
            r3 = r16
            r4 = r15
            r5 = r22
            r1.<init>(r2, r3, r4, r5, r6)
            java.util.concurrent.ThreadPoolExecutor r0 = K.i.f329b
            K.g r1 = new K.g
            r1.<init>(r8, r10)
            android.os.Looper r2 = android.os.Looper.myLooper()
            if (r2 != 0) goto L_0x016f
            android.os.Handler r2 = new android.os.Handler
            android.os.Looper r3 = android.os.Looper.getMainLooper()
            r2.<init>(r3)
            goto L_0x0174
        L_0x016f:
            android.os.Handler r2 = new android.os.Handler
            r2.<init>()
        L_0x0174:
            K.n r3 = new K.n
            r3.<init>()
            r3.f342b = r9
            r3.f343c = r1
            r3.f344d = r2
            r0.execute(r3)
        L_0x0182:
            r4 = r18
            goto L_0x01aa
        L_0x0185:
            monitor-exit(r3)     // Catch:{ all -> 0x013d }
            throw r0
        L_0x0187:
            p0.a r3 = f232a
            E.g r1 = (E.g) r1
            r4 = r18
            android.graphics.Typeface r11 = r3.t(r0, r1, r4, r7)
            if (r2 == 0) goto L_0x01aa
            if (r11 == 0) goto L_0x01a7
            android.os.Handler r0 = new android.os.Handler
            android.os.Looper r1 = android.os.Looper.getMainLooper()
            r0.<init>(r1)
            E.o r1 = new E.o
            r1.<init>(r2, r11, r9)
            r0.post(r1)
            goto L_0x01aa
        L_0x01a7:
            r2.a(r10)
        L_0x01aa:
            if (r11 == 0) goto L_0x01b5
            r.f r0 = f233b
            java.lang.String r1 = b(r18, r19, r20, r21, r22)
            r0.b(r1, r11)
        L_0x01b5:
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: F.g.a(android.content.Context, E.f, android.content.res.Resources, int, java.lang.String, int, int, E.b, boolean):android.graphics.Typeface");
    }

    static {
        int i = Build.VERSION.SDK_INT;
        if (i >= 29) {
            f232a = new C0320a();
        } else if (i >= 28) {
            f232a = new j();
        } else if (i >= 26) {
            f232a = new j();
        } else {
            if (i >= 24) {
                Method method = i.f241q;
                if (method == null) {
                    Log.w("TypefaceCompatApi24Impl", "Unable to collect necessary private methods.Fallback to legacy implementation.");
                }
                if (method != null) {
                    f232a = new C0320a();
                }
            }
            f232a = new C0320a();
        }
    }

    public static String b(Resources resources, int i, String str, int i2, int i3) {
        return resources.getResourcePackageName(i) + '-' + str + '-' + i2 + '-' + i + '-' + i3;
    }
}
