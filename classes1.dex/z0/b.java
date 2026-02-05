package Z0;

import Y0.a;
import Y0.c;
import Y0.d;
import Y0.e;
import Y0.f;
import Y0.g;
import Y0.h;
import Y0.i;
import Y0.j;
import Y0.k;
import Y0.l;
import Y0.m;
import Y0.n;
import Y0.o;
import Y0.p;
import Y0.q;
import Y0.r;
import Y0.s;
import Y0.t;
import Y0.u;
import Y0.v;
import Y0.w;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public final class b implements d1.b, a {

    /* renamed from: b  reason: collision with root package name */
    public static final Map f1009b;

    /* renamed from: a  reason: collision with root package name */
    public final Class f1010a;

    static {
        int i = 0;
        List asList = Arrays.asList(new Class[]{a.class, l.class, p.class, q.class, r.class, s.class, t.class, u.class, v.class, w.class, Y0.b.class, c.class, d.class, e.class, f.class, g.class, h.class, i.class, j.class, k.class, m.class, n.class, o.class});
        c.d("asList(this)", asList);
        ArrayList arrayList = new ArrayList(asList.size());
        for (Object next : asList) {
            int i2 = i + 1;
            if (i >= 0) {
                arrayList.add(new S0.a((Class) next, Integer.valueOf(i)));
                i = i2;
            } else {
                throw new ArithmeticException("Index overflow has happened.");
            }
        }
        f1009b = T0.h.W(arrayList);
        HashMap hashMap = new HashMap();
        hashMap.put("boolean", "kotlin.Boolean");
        hashMap.put("char", "kotlin.Char");
        hashMap.put("byte", "kotlin.Byte");
        hashMap.put("short", "kotlin.Short");
        hashMap.put("int", "kotlin.Int");
        hashMap.put("float", "kotlin.Float");
        hashMap.put("long", "kotlin.Long");
        hashMap.put("double", "kotlin.Double");
        HashMap hashMap2 = new HashMap();
        hashMap2.put("java.lang.Boolean", "kotlin.Boolean");
        hashMap2.put("java.lang.Character", "kotlin.Char");
        hashMap2.put("java.lang.Byte", "kotlin.Byte");
        hashMap2.put("java.lang.Short", "kotlin.Short");
        hashMap2.put("java.lang.Integer", "kotlin.Int");
        hashMap2.put("java.lang.Float", "kotlin.Float");
        hashMap2.put("java.lang.Long", "kotlin.Long");
        hashMap2.put("java.lang.Double", "kotlin.Double");
        HashMap hashMap3 = new HashMap();
        hashMap3.put("java.lang.Object", "kotlin.Any");
        hashMap3.put("java.lang.String", "kotlin.String");
        hashMap3.put("java.lang.CharSequence", "kotlin.CharSequence");
        hashMap3.put("java.lang.Throwable", "kotlin.Throwable");
        hashMap3.put("java.lang.Cloneable", "kotlin.Cloneable");
        hashMap3.put("java.lang.Number", "kotlin.Number");
        hashMap3.put("java.lang.Comparable", "kotlin.Comparable");
        hashMap3.put("java.lang.Enum", "kotlin.Enum");
        hashMap3.put("java.lang.annotation.Annotation", "kotlin.Annotation");
        hashMap3.put("java.lang.Iterable", "kotlin.collections.Iterable");
        hashMap3.put("java.util.Iterator", "kotlin.collections.Iterator");
        hashMap3.put("java.util.Collection", "kotlin.collections.Collection");
        hashMap3.put("java.util.List", "kotlin.collections.List");
        hashMap3.put("java.util.Set", "kotlin.collections.Set");
        hashMap3.put("java.util.ListIterator", "kotlin.collections.ListIterator");
        hashMap3.put("java.util.Map", "kotlin.collections.Map");
        hashMap3.put("java.util.Map$Entry", "kotlin.collections.Map.Entry");
        hashMap3.put("kotlin.jvm.internal.StringCompanionObject", "kotlin.String.Companion");
        hashMap3.put("kotlin.jvm.internal.EnumCompanionObject", "kotlin.Enum.Companion");
        hashMap3.putAll(hashMap);
        hashMap3.putAll(hashMap2);
        Collection<String> values = hashMap.values();
        c.d("primitiveFqNames.values", values);
        for (String str : values) {
            StringBuilder sb = new StringBuilder("kotlin.jvm.internal.");
            c.d("kotlinName", str);
            sb.append(f1.g.V(str));
            sb.append("CompanionObject");
            hashMap3.put(sb.toString(), str.concat(".Companion"));
        }
        for (Map.Entry entry : f1009b.entrySet()) {
            int intValue = ((Number) entry.getValue()).intValue();
            String name = ((Class) entry.getKey()).getName();
            hashMap3.put(name, "kotlin.Function" + intValue);
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(T0.h.V(hashMap3.size()));
        for (Map.Entry entry2 : hashMap3.entrySet()) {
            linkedHashMap.put(entry2.getKey(), f1.g.V((String) entry2.getValue()));
        }
    }

    public b(Class cls) {
        c.e("jClass", cls);
        this.f1010a = cls;
    }

    public final Class a() {
        return this.f1010a;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof b) || !T0.g.q(this).equals(T0.g.q((d1.b) obj))) {
            return false;
        }
        return true;
    }

    public final String toString() {
        return this.f1010a.toString() + " (Kotlin reflection is not available)";
    }

    public final int hashCode() {
        return T0.g.q(this).hashCode();
    }
}
