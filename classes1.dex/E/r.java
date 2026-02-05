package E;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.util.SparseArray;
import android.util.TypedValue;
import java.util.WeakHashMap;

public abstract class r {

    /* renamed from: a  reason: collision with root package name */
    public static final ThreadLocal f121a = new ThreadLocal();

    /* renamed from: b  reason: collision with root package name */
    public static final WeakHashMap f122b = new WeakHashMap(0);

    /* renamed from: c  reason: collision with root package name */
    public static final Object f123c = new Object();

    public static void a(n nVar, int i, ColorStateList colorStateList, Resources.Theme theme) {
        synchronized (f123c) {
            try {
                WeakHashMap weakHashMap = f122b;
                SparseArray sparseArray = (SparseArray) weakHashMap.get(nVar);
                if (sparseArray == null) {
                    sparseArray = new SparseArray();
                    weakHashMap.put(nVar, sparseArray);
                }
                sparseArray.append(i, new m(colorStateList, nVar.f113a.getConfiguration(), theme));
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:35:0x00d8  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x00dd A[ADDED_TO_REGION] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static android.graphics.Typeface c(android.content.Context r16, int r17, android.util.TypedValue r18, int r19, E.b r20, boolean r21, boolean r22) {
        /*
            r10 = r17
            r0 = r18
            r7 = r19
            r11 = r20
            android.content.res.Resources r8 = r16.getResources()
            r1 = 1
            r8.getValue(r10, r0, r1)
            java.lang.String r12 = "ResourcesCompat"
            java.lang.CharSequence r1 = r0.string
            if (r1 == 0) goto L_0x0100
            java.lang.String r13 = r1.toString()
            java.lang.String r1 = "res/"
            boolean r1 = r13.startsWith(r1)
            r14 = 0
            r15 = -3
            if (r1 != 0) goto L_0x002b
            if (r11 == 0) goto L_0x00db
            r11.a(r15)
            goto L_0x00db
        L_0x002b:
            int r1 = r0.assetCookie
            r.f r9 = F.g.f233b
            java.lang.String r1 = F.g.b(r8, r10, r13, r1, r7)
            java.lang.Object r1 = r9.a(r1)
            android.graphics.Typeface r1 = (android.graphics.Typeface) r1
            if (r1 == 0) goto L_0x0052
            if (r11 == 0) goto L_0x004f
            android.os.Handler r0 = new android.os.Handler
            android.os.Looper r2 = android.os.Looper.getMainLooper()
            r0.<init>(r2)
            E.o r2 = new E.o
            r3 = 0
            r2.<init>(r11, r1, r3)
            r0.post(r2)
        L_0x004f:
            r14 = r1
            goto L_0x00db
        L_0x0052:
            if (r22 == 0) goto L_0x0056
            goto L_0x00db
        L_0x0056:
            java.lang.String r1 = r13.toLowerCase()     // Catch:{ XmlPullParserException -> 0x007a, IOException -> 0x0078 }
            java.lang.String r2 = ".xml"
            boolean r1 = r1.endsWith(r2)     // Catch:{ XmlPullParserException -> 0x007a, IOException -> 0x0078 }
            if (r1 == 0) goto L_0x008f
            android.content.res.XmlResourceParser r1 = r8.getXml(r10)     // Catch:{ XmlPullParserException -> 0x007a, IOException -> 0x0078 }
            E.f r2 = E.b.k(r1, r8)     // Catch:{ XmlPullParserException -> 0x007a, IOException -> 0x0078 }
            if (r2 != 0) goto L_0x007c
            java.lang.String r0 = "Failed to find font-family tag"
            android.util.Log.e(r12, r0)     // Catch:{ XmlPullParserException -> 0x007a, IOException -> 0x0078 }
            if (r11 == 0) goto L_0x00db
            r11.a(r15)     // Catch:{ XmlPullParserException -> 0x007a, IOException -> 0x0078 }
            goto L_0x00db
        L_0x0078:
            r0 = move-exception
            goto L_0x00c3
        L_0x007a:
            r0 = move-exception
            goto L_0x00cd
        L_0x007c:
            int r6 = r0.assetCookie     // Catch:{ XmlPullParserException -> 0x007a, IOException -> 0x0078 }
            r1 = r16
            r3 = r8
            r4 = r17
            r5 = r13
            r7 = r19
            r8 = r20
            r9 = r21
            android.graphics.Typeface r14 = F.g.a(r1, r2, r3, r4, r5, r6, r7, r8, r9)     // Catch:{ XmlPullParserException -> 0x007a, IOException -> 0x0078 }
            goto L_0x00db
        L_0x008f:
            int r0 = r0.assetCookie     // Catch:{ XmlPullParserException -> 0x007a, IOException -> 0x0078 }
            p0.a r1 = F.g.f232a     // Catch:{ XmlPullParserException -> 0x007a, IOException -> 0x0078 }
            r2 = r16
            r3 = r8
            r4 = r17
            r5 = r13
            r6 = r19
            android.graphics.Typeface r1 = r1.w(r2, r3, r4, r5, r6)     // Catch:{ XmlPullParserException -> 0x007a, IOException -> 0x0078 }
            if (r1 == 0) goto L_0x00a8
            java.lang.String r0 = F.g.b(r8, r10, r13, r0, r7)     // Catch:{ XmlPullParserException -> 0x007a, IOException -> 0x0078 }
            r9.b(r0, r1)     // Catch:{ XmlPullParserException -> 0x007a, IOException -> 0x0078 }
        L_0x00a8:
            if (r11 == 0) goto L_0x004f
            if (r1 == 0) goto L_0x00bf
            android.os.Handler r0 = new android.os.Handler     // Catch:{ XmlPullParserException -> 0x007a, IOException -> 0x0078 }
            android.os.Looper r2 = android.os.Looper.getMainLooper()     // Catch:{ XmlPullParserException -> 0x007a, IOException -> 0x0078 }
            r0.<init>(r2)     // Catch:{ XmlPullParserException -> 0x007a, IOException -> 0x0078 }
            E.o r2 = new E.o     // Catch:{ XmlPullParserException -> 0x007a, IOException -> 0x0078 }
            r3 = 0
            r2.<init>(r11, r1, r3)     // Catch:{ XmlPullParserException -> 0x007a, IOException -> 0x0078 }
            r0.post(r2)     // Catch:{ XmlPullParserException -> 0x007a, IOException -> 0x0078 }
            goto L_0x004f
        L_0x00bf:
            r11.a(r15)     // Catch:{ XmlPullParserException -> 0x007a, IOException -> 0x0078 }
            goto L_0x004f
        L_0x00c3:
            java.lang.String r1 = "Failed to read xml resource "
            java.lang.String r1 = r1.concat(r13)
            android.util.Log.e(r12, r1, r0)
            goto L_0x00d6
        L_0x00cd:
            java.lang.String r1 = "Failed to parse xml resource "
            java.lang.String r1 = r1.concat(r13)
            android.util.Log.e(r12, r1, r0)
        L_0x00d6:
            if (r11 == 0) goto L_0x00db
            r11.a(r15)
        L_0x00db:
            if (r14 != 0) goto L_0x00ff
            if (r11 != 0) goto L_0x00ff
            if (r22 == 0) goto L_0x00e2
            goto L_0x00ff
        L_0x00e2:
            android.content.res.Resources$NotFoundException r0 = new android.content.res.Resources$NotFoundException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "Font resource ID #0x"
            r1.<init>(r2)
            java.lang.String r2 = java.lang.Integer.toHexString(r17)
            r1.append(r2)
            java.lang.String r2 = " could not be retrieved."
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L_0x00ff:
            return r14
        L_0x0100:
            android.content.res.Resources$NotFoundException r1 = new android.content.res.Resources$NotFoundException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "Resource \""
            r2.<init>(r3)
            java.lang.String r3 = r8.getResourceName(r10)
            r2.append(r3)
            java.lang.String r3 = "\" ("
            r2.append(r3)
            java.lang.String r3 = java.lang.Integer.toHexString(r17)
            r2.append(r3)
            java.lang.String r3 = ") is not a Font: "
            r2.append(r3)
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: E.r.c(android.content.Context, int, android.util.TypedValue, int, E.b, boolean, boolean):android.graphics.Typeface");
    }

    public static Typeface b(Context context, int i) {
        if (context.isRestricted()) {
            return null;
        }
        return c(context, i, new TypedValue(), 0, (b) null, false, false);
    }
}
