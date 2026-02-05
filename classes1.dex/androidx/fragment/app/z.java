package androidx.fragment.app;

import A.k;
import android.util.Log;
import d.C0088a;
import java.util.ArrayList;
import java.util.Map;
import java.util.Objects;

public final class z {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f1787a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ H f1788b;

    public /* synthetic */ z(H h2, int i) {
        this.f1787a = i;
        this.f1788b = h2;
    }

    public final void a(Object obj) {
        int i;
        switch (this.f1787a) {
            case 0:
                Map map = (Map) obj;
                String[] strArr = (String[]) map.keySet().toArray(new String[0]);
                ArrayList arrayList = new ArrayList(map.values());
                int[] iArr = new int[arrayList.size()];
                for (int i2 = 0; i2 < arrayList.size(); i2++) {
                    if (((Boolean) arrayList.get(i2)).booleanValue()) {
                        i = 0;
                    } else {
                        i = -1;
                    }
                    iArr[i2] = i;
                }
                H h2 = this.f1788b;
                E e = (E) h2.f1571C.pollFirst();
                if (e == null) {
                    Log.w("FragmentManager", "No permissions were requested for " + this);
                    return;
                }
                k kVar = h2.f1583c;
                String str = e.f1561a;
                if (kVar.e(str) == null) {
                    Log.w("FragmentManager", "Permission request result delivered for unknown Fragment " + str);
                    return;
                }
                return;
            case 1:
                C0088a aVar = (C0088a) obj;
                H h3 = this.f1788b;
                E e2 = (E) h3.f1571C.pollFirst();
                if (e2 == null) {
                    Log.w("FragmentManager", "No Activities were started for result for " + this);
                    return;
                }
                String str2 = e2.f1561a;
                r e3 = h3.f1583c.e(str2);
                if (e3 == null) {
                    Log.w("FragmentManager", "Activity result delivered for unknown Fragment " + str2);
                    return;
                }
                int i3 = aVar.f2450a;
                if (Log.isLoggable("FragmentManager", 2)) {
                    e3.toString();
                    Objects.toString(aVar.f2451b);
                    return;
                }
                return;
            default:
                C0088a aVar2 = (C0088a) obj;
                H h4 = this.f1788b;
                E e4 = (E) h4.f1571C.pollFirst();
                if (e4 == null) {
                    Log.w("FragmentManager", "No IntentSenders were started for " + this);
                    return;
                }
                String str3 = e4.f1561a;
                r e5 = h4.f1583c.e(str3);
                if (e5 == null) {
                    Log.w("FragmentManager", "Intent Sender result delivered for unknown Fragment " + str3);
                    return;
                }
                int i4 = aVar2.f2450a;
                if (Log.isLoggable("FragmentManager", 2)) {
                    e5.toString();
                    Objects.toString(aVar2.f2451b);
                    return;
                }
                return;
        }
    }
}
