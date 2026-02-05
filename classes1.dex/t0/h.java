package T0;

import S0.a;
import Z0.c;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

public abstract class h extends g {
    public static int V(int i) {
        if (i < 0) {
            return i;
        }
        if (i < 3) {
            return i + 1;
        }
        if (i < 1073741824) {
            return (int) ((((float) i) / 0.75f) + 1.0f);
        }
        return Integer.MAX_VALUE;
    }

    public static Map W(ArrayList arrayList) {
        e eVar = e.f928a;
        int size = arrayList.size();
        if (size == 0) {
            return eVar;
        }
        if (size != 1) {
            LinkedHashMap linkedHashMap = new LinkedHashMap(V(arrayList.size()));
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                a aVar = (a) it2.next();
                linkedHashMap.put(aVar.f882a, aVar.f883b);
            }
            return linkedHashMap;
        }
        a aVar2 = (a) arrayList.get(0);
        c.e("pair", aVar2);
        Map singletonMap = Collections.singletonMap(aVar2.f882a, aVar2.f883b);
        c.d("singletonMap(pair.first, pair.second)", singletonMap);
        return singletonMap;
    }
}
