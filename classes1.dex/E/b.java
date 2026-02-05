package E;

import F.a;
import K.e;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.Shader;
import android.graphics.Typeface;
import android.os.Handler;
import android.os.Looper;
import android.util.AttributeSet;
import android.util.Base64;
import android.util.Log;
import android.util.TypedValue;
import android.util.Xml;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

public abstract class b {

    /* renamed from: a  reason: collision with root package name */
    public static final float[][] f86a = {new float[]{0.401288f, 0.650173f, -0.051461f}, new float[]{-0.250268f, 1.204414f, 0.045854f}, new float[]{-0.002079f, 0.048952f, 0.953127f}};

    /* renamed from: b  reason: collision with root package name */
    public static final float[][] f87b = {new float[]{1.8620678f, -1.0112547f, 0.14918678f}, new float[]{0.38752654f, 0.62144744f, -0.00897398f}, new float[]{-0.0158415f, -0.03412294f, 1.0499644f}};

    /* renamed from: c  reason: collision with root package name */
    public static final float[] f88c = {95.047f, 100.0f, 108.883f};

    /* renamed from: d  reason: collision with root package name */
    public static final float[][] f89d = {new float[]{0.41233894f, 0.35762063f, 0.18051042f}, new float[]{0.2126f, 0.7152f, 0.0722f}, new float[]{0.01932141f, 0.11916382f, 0.9503448f}};
    public static final Object e = new Object();

    /* renamed from: f  reason: collision with root package name */
    public static Method f90f;

    /* renamed from: g  reason: collision with root package name */
    public static boolean f91g;

    public static float g(int i) {
        float pow;
        float f2 = ((float) i) / 255.0f;
        if (f2 <= 0.04045f) {
            pow = f2 / 12.92f;
        } else {
            pow = (float) Math.pow((double) ((f2 + 0.055f) / 1.055f), 2.4000000953674316d);
        }
        return pow * 100.0f;
    }

    public static void n(XmlResourceParser xmlResourceParser) {
        int i = 1;
        while (i > 0) {
            int next = xmlResourceParser.next();
            if (next == 2) {
                i++;
            } else if (next == 3) {
                i--;
            }
        }
    }

    public abstract void i(int i);

    public abstract void j(Typeface typeface);

    public static int b(Context context, int i, int i2) {
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(i, typedValue, true);
        if (typedValue.resourceId != 0) {
            return i;
        }
        return i2;
    }

    public static boolean e(XmlPullParser xmlPullParser, String str) {
        if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", str) != null) {
            return true;
        }
        return false;
    }

    public static int f(float f2) {
        float f3;
        boolean z2;
        float f4;
        if (f2 < 1.0f) {
            return -16777216;
        }
        if (f2 > 99.0f) {
            return -1;
        }
        float f5 = (f2 + 16.0f) / 116.0f;
        if (f2 > 8.0f) {
            f3 = f5 * f5 * f5;
        } else {
            f3 = f2 / 903.2963f;
        }
        float f6 = f5 * f5 * f5;
        if (f6 > 0.008856452f) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (z2) {
            f4 = f6;
        } else {
            f4 = ((f5 * 116.0f) - 16.0f) / 903.2963f;
        }
        if (!z2) {
            f6 = ((f5 * 116.0f) - 16.0f) / 903.2963f;
        }
        float[] fArr = f88c;
        return a.a((double) (f4 * fArr[0]), (double) (f3 * fArr[1]), (double) (f6 * fArr[2]));
    }

    public static TypedArray h(Resources resources, Resources.Theme theme, AttributeSet attributeSet, int[] iArr) {
        if (theme == null) {
            return resources.obtainAttributes(attributeSet, iArr);
        }
        return theme.obtainStyledAttributes(attributeSet, iArr, 0, 0);
    }

    public static f k(XmlResourceParser xmlResourceParser, Resources resources) {
        int next;
        int i;
        boolean z2;
        int i2;
        Resources resources2 = resources;
        do {
            next = xmlResourceParser.next();
            if (next == 2) {
                break;
            }
        } while (next != 1);
        if (next == 2) {
            xmlResourceParser.require(2, (String) null, "font-family");
            if (xmlResourceParser.getName().equals("font-family")) {
                TypedArray obtainAttributes = resources2.obtainAttributes(Xml.asAttributeSet(xmlResourceParser), B.a.f27b);
                String string = obtainAttributes.getString(0);
                String string2 = obtainAttributes.getString(4);
                String string3 = obtainAttributes.getString(5);
                int resourceId = obtainAttributes.getResourceId(1, 0);
                int integer = obtainAttributes.getInteger(2, 1);
                int integer2 = obtainAttributes.getInteger(3, 500);
                String string4 = obtainAttributes.getString(6);
                obtainAttributes.recycle();
                if (string == null || string2 == null || string3 == null) {
                    ArrayList arrayList = new ArrayList();
                    while (xmlResourceParser.next() != 3) {
                        if (xmlResourceParser.getEventType() == 2) {
                            if (xmlResourceParser.getName().equals("font")) {
                                TypedArray obtainAttributes2 = resources2.obtainAttributes(Xml.asAttributeSet(xmlResourceParser), B.a.f28c);
                                int i3 = 8;
                                if (!obtainAttributes2.hasValue(8)) {
                                    i3 = 1;
                                }
                                int i4 = obtainAttributes2.getInt(i3, 400);
                                if (obtainAttributes2.hasValue(6)) {
                                    i = 6;
                                } else {
                                    i = 2;
                                }
                                if (1 == obtainAttributes2.getInt(i, 0)) {
                                    z2 = true;
                                } else {
                                    z2 = false;
                                }
                                int i5 = 9;
                                if (!obtainAttributes2.hasValue(9)) {
                                    i5 = 3;
                                }
                                int i6 = 7;
                                if (!obtainAttributes2.hasValue(7)) {
                                    i6 = 4;
                                }
                                String string5 = obtainAttributes2.getString(i6);
                                int i7 = obtainAttributes2.getInt(i5, 0);
                                if (obtainAttributes2.hasValue(5)) {
                                    i2 = 5;
                                } else {
                                    i2 = 0;
                                }
                                int resourceId2 = obtainAttributes2.getResourceId(i2, 0);
                                String string6 = obtainAttributes2.getString(i2);
                                obtainAttributes2.recycle();
                                while (xmlResourceParser.next() != 3) {
                                    n(xmlResourceParser);
                                }
                                arrayList.add(new h(string6, i4, z2, string5, i7, resourceId2));
                            } else {
                                n(xmlResourceParser);
                            }
                        }
                    }
                    if (!arrayList.isEmpty()) {
                        return new g((h[]) arrayList.toArray(new h[0]));
                    }
                } else {
                    while (xmlResourceParser.next() != 3) {
                        n(xmlResourceParser);
                    }
                    return new i(new e(string, string2, string3, l(resources2, resourceId)), integer, integer2, string4);
                }
            } else {
                n(xmlResourceParser);
            }
            return null;
        }
        throw new XmlPullParserException("No start tag found");
    }

    public static List l(Resources resources, int i) {
        if (i == 0) {
            return Collections.emptyList();
        }
        TypedArray obtainTypedArray = resources.obtainTypedArray(i);
        try {
            if (obtainTypedArray.length() == 0) {
                return Collections.emptyList();
            }
            ArrayList arrayList = new ArrayList();
            if (e.a(obtainTypedArray, 0) == 1) {
                for (int i2 = 0; i2 < obtainTypedArray.length(); i2++) {
                    int resourceId = obtainTypedArray.getResourceId(i2, 0);
                    if (resourceId != 0) {
                        String[] stringArray = resources.getStringArray(resourceId);
                        ArrayList arrayList2 = new ArrayList();
                        for (String decode : stringArray) {
                            arrayList2.add(Base64.decode(decode, 0));
                        }
                        arrayList.add(arrayList2);
                    }
                }
            } else {
                String[] stringArray2 = resources.getStringArray(i);
                ArrayList arrayList3 = new ArrayList();
                for (String decode2 : stringArray2) {
                    arrayList3.add(Base64.decode(decode2, 0));
                }
                arrayList.add(arrayList3);
            }
            obtainTypedArray.recycle();
            return arrayList;
        } finally {
            obtainTypedArray.recycle();
        }
    }

    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* JADX WARNING: Missing exception handler attribute for start block: B:15:0x0027 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:21:0x0031 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void m(android.content.res.Resources.Theme r5) {
        /*
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 29
            if (r0 < r1) goto L_0x000a
            E.q.a(r5)
            goto L_0x0037
        L_0x000a:
            r1 = 23
            if (r0 < r1) goto L_0x0037
            java.lang.Object r0 = e
            monitor-enter(r0)
            boolean r1 = f91g     // Catch:{ all -> 0x0025 }
            r2 = 0
            if (r1 != 0) goto L_0x0029
            r1 = 1
            java.lang.Class<android.content.res.Resources$Theme> r3 = android.content.res.Resources.Theme.class
            java.lang.String r4 = "rebase"
            java.lang.reflect.Method r3 = r3.getDeclaredMethod(r4, r2)     // Catch:{ NoSuchMethodException -> 0x0027 }
            f90f = r3     // Catch:{ NoSuchMethodException -> 0x0027 }
            r3.setAccessible(r1)     // Catch:{ NoSuchMethodException -> 0x0027 }
            goto L_0x0027
        L_0x0025:
            r5 = move-exception
            goto L_0x0035
        L_0x0027:
            f91g = r1     // Catch:{ all -> 0x0025 }
        L_0x0029:
            java.lang.reflect.Method r1 = f90f     // Catch:{ all -> 0x0025 }
            if (r1 == 0) goto L_0x0033
            r1.invoke(r5, r2)     // Catch:{ IllegalAccessException | InvocationTargetException -> 0x0031 }
            goto L_0x0033
        L_0x0031:
            f90f = r2     // Catch:{ all -> 0x0025 }
        L_0x0033:
            monitor-exit(r0)     // Catch:{ all -> 0x0025 }
            goto L_0x0037
        L_0x0035:
            monitor-exit(r0)     // Catch:{ all -> 0x0025 }
            throw r5
        L_0x0037:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: E.b.m(android.content.res.Resources$Theme):void");
    }

    public static float o() {
        return ((float) Math.pow((((double) 50.0f) + 16.0d) / 116.0d, 3.0d)) * 100.0f;
    }

    public void a(int i) {
        new Handler(Looper.getMainLooper()).post(new p(i, 0, this));
    }

    public static d c(TypedArray typedArray, XmlPullParser xmlPullParser, Resources.Theme theme, String str, int i) {
        d dVar;
        if (e(xmlPullParser, str)) {
            TypedValue typedValue = new TypedValue();
            typedArray.getValue(i, typedValue);
            int i2 = typedValue.type;
            if (i2 >= 28 && i2 <= 31) {
                return new d((Shader) null, (ColorStateList) null, typedValue.data);
            }
            try {
                dVar = d.a(typedArray.getResources(), typedArray.getResourceId(i, 0), theme);
            } catch (Exception e2) {
                Log.e("ComplexColorCompat", "Failed to inflate ComplexColor.", e2);
                dVar = null;
            }
            if (dVar != null) {
                return dVar;
            }
        }
        return new d((Shader) null, (ColorStateList) null, 0);
    }

    public static String d(TypedArray typedArray, XmlResourceParser xmlResourceParser, String str, int i) {
        if (!e(xmlResourceParser, str)) {
            return null;
        }
        return typedArray.getString(i);
    }
}
