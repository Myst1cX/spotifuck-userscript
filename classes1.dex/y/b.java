package y;

import android.content.Context;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.util.TypedValue;
import android.util.Xml;
import java.util.HashMap;
import t.C0339e;

public final class b {

    /* renamed from: a  reason: collision with root package name */
    public boolean f4939a = false;

    /* renamed from: b  reason: collision with root package name */
    public int f4940b;

    /* renamed from: c  reason: collision with root package name */
    public int f4941c;

    /* renamed from: d  reason: collision with root package name */
    public float f4942d;
    public String e;

    /* renamed from: f  reason: collision with root package name */
    public boolean f4943f;

    /* renamed from: g  reason: collision with root package name */
    public int f4944g;

    public final void b(Object obj) {
        switch (C0339e.a(this.f4940b)) {
            case 0:
            case 7:
                this.f4941c = ((Integer) obj).intValue();
                return;
            case 1:
                this.f4942d = ((Float) obj).floatValue();
                return;
            case 2:
            case 3:
                this.f4944g = ((Integer) obj).intValue();
                return;
            case 4:
                this.e = (String) obj;
                return;
            case 5:
                this.f4943f = ((Boolean) obj).booleanValue();
                return;
            case 6:
                this.f4942d = ((Float) obj).floatValue();
                return;
            default:
                return;
        }
    }

    public b(b bVar, Object obj) {
        bVar.getClass();
        this.f4940b = bVar.f4940b;
        b(obj);
    }

    /* JADX WARNING: type inference failed for: r1v2, types: [java.lang.Object, y.b] */
    public static void a(Context context, XmlResourceParser xmlResourceParser, HashMap hashMap) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(Xml.asAttributeSet(xmlResourceParser), r.f5139d);
        int indexCount = obtainStyledAttributes.getIndexCount();
        String str = null;
        Object obj = null;
        int i = 0;
        boolean z2 = false;
        for (int i2 = 0; i2 < indexCount; i2++) {
            int index = obtainStyledAttributes.getIndex(i2);
            if (index == 0) {
                str = obtainStyledAttributes.getString(index);
                if (str != null && str.length() > 0) {
                    str = Character.toUpperCase(str.charAt(0)) + str.substring(1);
                }
            } else if (index == 10) {
                str = obtainStyledAttributes.getString(index);
                z2 = true;
            } else if (index == 1) {
                obj = Boolean.valueOf(obtainStyledAttributes.getBoolean(index, false));
                i = 6;
            } else if (index == 3) {
                obj = Integer.valueOf(obtainStyledAttributes.getColor(index, 0));
                i = 3;
            } else if (index == 2) {
                obj = Integer.valueOf(obtainStyledAttributes.getColor(index, 0));
                i = 4;
            } else {
                if (index == 7) {
                    obj = Float.valueOf(TypedValue.applyDimension(1, obtainStyledAttributes.getDimension(index, 0.0f), context.getResources().getDisplayMetrics()));
                } else if (index == 4) {
                    obj = Float.valueOf(obtainStyledAttributes.getDimension(index, 0.0f));
                } else if (index == 5) {
                    obj = Float.valueOf(obtainStyledAttributes.getFloat(index, Float.NaN));
                    i = 2;
                } else if (index == 6) {
                    obj = Integer.valueOf(obtainStyledAttributes.getInteger(index, -1));
                    i = 1;
                } else if (index == 9) {
                    obj = obtainStyledAttributes.getString(index);
                    i = 5;
                } else if (index == 8) {
                    int resourceId = obtainStyledAttributes.getResourceId(index, -1);
                    if (resourceId == -1) {
                        resourceId = obtainStyledAttributes.getInt(index, -1);
                    }
                    obj = Integer.valueOf(resourceId);
                    i = 8;
                }
                i = 7;
            }
        }
        if (!(str == null || obj == null)) {
            ? obj2 = new Object();
            obj2.f4940b = i;
            obj2.f4939a = z2;
            obj2.b(obj);
            hashMap.put(str, obj2);
        }
        obtainStyledAttributes.recycle();
    }
}
