package androidx.activity;

import Z0.c;
import Z0.h;
import a1.a;
import android.os.Bundle;
import androidx.fragment.app.C0065t;
import androidx.fragment.app.r;
import c.C0086b;
import h.C0121l;
import java.util.ArrayList;
import java.util.LinkedHashMap;

public final /* synthetic */ class g implements C0086b {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f1157a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ C0121l f1158b;

    public /* synthetic */ g(C0121l lVar, int i) {
        this.f1157a = i;
        this.f1158b = lVar;
    }

    public final void a(n nVar) {
        String str;
        switch (this.f1157a) {
            case 0:
                c.e("it", nVar);
                C0121l lVar = this.f1158b;
                Bundle c2 = lVar.i.f3568b.c("android:support:activity-result");
                if (c2 != null) {
                    l lVar2 = lVar.f1180m;
                    lVar2.getClass();
                    ArrayList<Integer> integerArrayList = c2.getIntegerArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_RCS");
                    ArrayList<String> stringArrayList = c2.getStringArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_KEYS");
                    if (stringArrayList != null && integerArrayList != null) {
                        ArrayList<String> stringArrayList2 = c2.getStringArrayList("KEY_COMPONENT_ACTIVITY_LAUNCHED_KEYS");
                        if (stringArrayList2 != null) {
                            lVar2.f1169d.addAll(stringArrayList2);
                        }
                        Bundle bundle = c2.getBundle("KEY_COMPONENT_ACTIVITY_PENDING_RESULT");
                        Bundle bundle2 = lVar2.f1171g;
                        if (bundle != null) {
                            bundle2.putAll(bundle);
                        }
                        int size = stringArrayList.size();
                        for (int i = 0; i < size; i++) {
                            String str2 = stringArrayList.get(i);
                            LinkedHashMap linkedHashMap = lVar2.f1167b;
                            boolean containsKey = linkedHashMap.containsKey(str2);
                            LinkedHashMap linkedHashMap2 = lVar2.f1166a;
                            if (containsKey) {
                                Integer num = (Integer) linkedHashMap.remove(str2);
                                if (bundle2.containsKey(str2)) {
                                    continue;
                                } else if (!(linkedHashMap2 instanceof a)) {
                                    linkedHashMap2.remove(num);
                                } else {
                                    if (linkedHashMap2 == null) {
                                        str = "null";
                                    } else {
                                        str = linkedHashMap2.getClass().getName();
                                    }
                                    ClassCastException classCastException = new ClassCastException(str + " cannot be cast to " + "kotlin.collections.MutableMap");
                                    c.f(classCastException, h.class.getName());
                                    throw classCastException;
                                }
                            }
                            Integer num2 = integerArrayList.get(i);
                            c.d("rcs[i]", num2);
                            int intValue = num2.intValue();
                            String str3 = stringArrayList.get(i);
                            c.d("keys[i]", str3);
                            String str4 = str3;
                            linkedHashMap2.put(Integer.valueOf(intValue), str4);
                            linkedHashMap.put(str4, Integer.valueOf(intValue));
                        }
                        return;
                    }
                    return;
                }
                return;
            default:
                C0065t tVar = (C0065t) this.f1158b.f3019x.f2g;
                tVar.i.b(tVar, tVar, (r) null);
                return;
        }
    }
}
