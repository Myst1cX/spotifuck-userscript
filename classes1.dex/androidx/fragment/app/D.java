package androidx.fragment.app;

import S0.a;
import T0.e;
import T0.g;
import T0.h;
import android.content.Intent;
import d.C0088a;
import java.util.ArrayList;
import java.util.Iterator;

public final class D extends g {

    /* renamed from: l  reason: collision with root package name */
    public final /* synthetic */ int f1560l;

    public /* synthetic */ D(int i) {
        this.f1560l = i;
    }

    public final Object G(Intent intent, int i) {
        boolean z2;
        switch (this.f1560l) {
            case 0:
                return new C0088a(intent, i);
            case 1:
                e eVar = e.f928a;
                if (i != -1 || intent == null) {
                    return eVar;
                }
                String[] stringArrayExtra = intent.getStringArrayExtra("androidx.activity.result.contract.extra.PERMISSIONS");
                int[] intArrayExtra = intent.getIntArrayExtra("androidx.activity.result.contract.extra.PERMISSION_GRANT_RESULTS");
                if (intArrayExtra == null || stringArrayExtra == null) {
                    return eVar;
                }
                ArrayList arrayList = new ArrayList(intArrayExtra.length);
                for (int i2 : intArrayExtra) {
                    if (i2 == 0) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    arrayList.add(Boolean.valueOf(z2));
                }
                ArrayList arrayList2 = new ArrayList();
                for (String str : stringArrayExtra) {
                    if (str != null) {
                        arrayList2.add(str);
                    }
                }
                Iterator it2 = arrayList2.iterator();
                Iterator it3 = arrayList.iterator();
                ArrayList arrayList3 = new ArrayList(Math.min(arrayList2.size(), arrayList.size()));
                while (it2.hasNext() && it3.hasNext()) {
                    arrayList3.add(new a(it2.next(), it3.next()));
                }
                return h.W(arrayList3);
            default:
                return new C0088a(intent, i);
        }
    }
}
