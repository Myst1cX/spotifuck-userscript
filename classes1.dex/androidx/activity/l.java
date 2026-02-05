package androidx.activity;

import E.j;
import T0.g;
import Z0.c;
import Z0.d;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import androidx.fragment.app.z;
import d.C0088a;
import d.C0089b;
import e1.a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.NoSuchElementException;

public final class l {

    /* renamed from: a  reason: collision with root package name */
    public final LinkedHashMap f1166a = new LinkedHashMap();

    /* renamed from: b  reason: collision with root package name */
    public final LinkedHashMap f1167b = new LinkedHashMap();

    /* renamed from: c  reason: collision with root package name */
    public final LinkedHashMap f1168c = new LinkedHashMap();

    /* renamed from: d  reason: collision with root package name */
    public final ArrayList f1169d = new ArrayList();
    public final transient LinkedHashMap e = new LinkedHashMap();

    /* renamed from: f  reason: collision with root package name */
    public final LinkedHashMap f1170f = new LinkedHashMap();

    /* renamed from: g  reason: collision with root package name */
    public final Bundle f1171g = new Bundle();

    public final boolean a(int i, int i2, Intent intent) {
        z zVar;
        String str = (String) this.f1166a.get(Integer.valueOf(i));
        if (str == null) {
            return false;
        }
        C0089b bVar = (C0089b) this.e.get(str);
        if (bVar != null) {
            zVar = bVar.f2452a;
        } else {
            zVar = null;
        }
        if (zVar != null) {
            ArrayList arrayList = this.f1169d;
            if (arrayList.contains(str)) {
                bVar.f2452a.a(bVar.f2453b.G(intent, i2));
                arrayList.remove(str);
                return true;
            }
        }
        this.f1170f.remove(str);
        this.f1171g.putParcelable(str, new C0088a(intent, i2));
        return true;
    }

    /* JADX WARNING: type inference failed for: r2v2, types: [Z0.d, e1.e] */
    public final j b(String str, g gVar, z zVar) {
        Object obj;
        c.e("key", str);
        LinkedHashMap linkedHashMap = this.f1167b;
        if (((Integer) linkedHashMap.get(str)) == null) {
            Iterator it2 = new a(new e1.c(new d(1))).iterator();
            while (it2.hasNext()) {
                Number number = (Number) it2.next();
                int intValue = number.intValue();
                LinkedHashMap linkedHashMap2 = this.f1166a;
                if (!linkedHashMap2.containsKey(Integer.valueOf(intValue))) {
                    int intValue2 = number.intValue();
                    linkedHashMap2.put(Integer.valueOf(intValue2), str);
                    linkedHashMap.put(str, Integer.valueOf(intValue2));
                }
            }
            throw new NoSuchElementException("Sequence contains no element matching the predicate.");
        }
        this.e.put(str, new C0089b(zVar, gVar));
        LinkedHashMap linkedHashMap3 = this.f1170f;
        if (linkedHashMap3.containsKey(str)) {
            Object obj2 = linkedHashMap3.get(str);
            linkedHashMap3.remove(str);
            zVar.a(obj2);
        }
        int i = Build.VERSION.SDK_INT;
        Bundle bundle = this.f1171g;
        Class cls = C0088a.class;
        if (i >= 34) {
            obj = J.a.a(bundle, str, cls);
        } else {
            obj = bundle.getParcelable(str);
            if (!cls.isInstance(obj)) {
                obj = null;
            }
        }
        C0088a aVar = (C0088a) obj;
        if (aVar != null) {
            bundle.remove(str);
            zVar.a(gVar.G(aVar.f2451b, aVar.f2450a));
        }
        return new j((Object) this, (Object) str, 10);
    }
}
