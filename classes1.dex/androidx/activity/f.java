package androidx.activity;

import android.os.Bundle;
import androidx.fragment.app.C0065t;
import androidx.fragment.app.H;
import androidx.lifecycle.C0077l;
import h.C0121l;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import k0.C0167b;

public final /* synthetic */ class f implements C0167b {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f1155a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Object f1156b;

    public /* synthetic */ f(int i, Object obj) {
        this.f1155a = i;
        this.f1156b = obj;
    }

    public final Bundle a() {
        switch (this.f1155a) {
            case 0:
                Bundle bundle = new Bundle();
                l lVar = ((C0121l) this.f1156b).f1180m;
                lVar.getClass();
                LinkedHashMap linkedHashMap = lVar.f1167b;
                bundle.putIntegerArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_RCS", new ArrayList(linkedHashMap.values()));
                bundle.putStringArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_KEYS", new ArrayList(linkedHashMap.keySet()));
                bundle.putStringArrayList("KEY_COMPONENT_ACTIVITY_LAUNCHED_KEYS", new ArrayList(lVar.f1169d));
                bundle.putBundle("KEY_COMPONENT_ACTIVITY_PENDING_RESULT", new Bundle(lVar.f1171g));
                return bundle;
            case 1:
                C0121l lVar2 = (C0121l) this.f1156b;
                do {
                } while (C0121l.m(((C0065t) lVar2.f3019x.f2g).i));
                lVar2.f3020y.d(C0077l.ON_STOP);
                return new Bundle();
            default:
                return ((H) this.f1156b).R();
        }
    }
}
