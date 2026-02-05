package androidx.savedstate;

import Q0.E;
import Z0.c;
import android.os.Bundle;
import androidx.lifecycle.C0077l;
import androidx.lifecycle.C0078m;
import androidx.lifecycle.C0081p;
import androidx.lifecycle.LegacySavedStateHandleController$tryToAddRecreator$1;
import androidx.lifecycle.M;
import androidx.lifecycle.P;
import androidx.lifecycle.Q;
import androidx.lifecycle.SavedStateHandleController;
import androidx.lifecycle.r;
import androidx.lifecycle.t;
import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import k0.C0166a;
import k0.C0167b;
import k0.C0168c;
import k0.C0170e;

public final class Recreator implements C0081p {

    /* renamed from: a  reason: collision with root package name */
    public final C0170e f2068a;

    public final void b(r rVar, C0077l lVar) {
        Object obj;
        if (lVar == C0077l.ON_CREATE) {
            rVar.d().f(this);
            C0170e eVar = this.f2068a;
            Bundle c2 = eVar.b().c("androidx.savedstate.Restarter");
            if (c2 != null) {
                ArrayList<String> stringArrayList = c2.getStringArrayList("classes_to_restore");
                if (stringArrayList != null) {
                    for (String next : stringArrayList) {
                        try {
                            Class<? extends U> asSubclass = Class.forName(next, false, Recreator.class.getClassLoader()).asSubclass(C0166a.class);
                            c.d("{\n                Class.…class.java)\n            }", asSubclass);
                            try {
                                Constructor<? extends U> declaredConstructor = asSubclass.getDeclaredConstructor((Class[]) null);
                                declaredConstructor.setAccessible(true);
                                try {
                                    Object newInstance = declaredConstructor.newInstance((Object[]) null);
                                    c.d("{\n                constr…wInstance()\n            }", newInstance);
                                    C0166a aVar = (C0166a) newInstance;
                                    if (eVar instanceof Q) {
                                        P c3 = ((Q) eVar).c();
                                        C0168c b2 = eVar.b();
                                        c3.getClass();
                                        LinkedHashMap linkedHashMap = c3.f1817a;
                                        Iterator it2 = new HashSet(linkedHashMap.keySet()).iterator();
                                        while (it2.hasNext()) {
                                            String str = (String) it2.next();
                                            c.e("key", str);
                                            M m2 = (M) linkedHashMap.get(str);
                                            c.b(m2);
                                            t d2 = eVar.d();
                                            c.e("registry", b2);
                                            c.e("lifecycle", d2);
                                            HashMap hashMap = m2.f1813a;
                                            if (hashMap == null) {
                                                obj = null;
                                            } else {
                                                synchronized (hashMap) {
                                                    obj = m2.f1813a.get("androidx.lifecycle.savedstate.vm.tag");
                                                }
                                            }
                                            SavedStateHandleController savedStateHandleController = (SavedStateHandleController) obj;
                                            if (savedStateHandleController != null && !savedStateHandleController.f1821a) {
                                                savedStateHandleController.getClass();
                                                c.e("registry", b2);
                                                c.e("lifecycle", d2);
                                                if (!savedStateHandleController.f1821a) {
                                                    savedStateHandleController.f1821a = true;
                                                    d2.a(savedStateHandleController);
                                                    b2.e((String) null, (C0167b) null);
                                                    C0078m mVar = d2.f1841c;
                                                    if (mVar == C0078m.f1832b || mVar.compareTo(C0078m.f1834d) >= 0) {
                                                        b2.f();
                                                    } else {
                                                        d2.a(new LegacySavedStateHandleController$tryToAddRecreator$1(d2, b2));
                                                    }
                                                } else {
                                                    throw new IllegalStateException("Already attached to lifecycleOwner");
                                                }
                                            }
                                        }
                                        if (!new HashSet(linkedHashMap.keySet()).isEmpty()) {
                                            b2.f();
                                        }
                                    } else {
                                        throw new IllegalStateException("Internal error: OnRecreation should be registered only on components that implement ViewModelStoreOwner");
                                    }
                                } catch (Exception e) {
                                    throw new RuntimeException("Failed to instantiate " + next, e);
                                }
                            } catch (NoSuchMethodException e2) {
                                throw new IllegalStateException("Class " + asSubclass.getSimpleName() + " must have default constructor in order to be automatically recreated", e2);
                            }
                        } catch (ClassNotFoundException e3) {
                            throw new RuntimeException(E.g("Class ", next, " wasn't found"), e3);
                        }
                    }
                    return;
                }
                throw new IllegalStateException("Bundle with restored state for the component \"androidx.savedstate.Restarter\" must contain list of strings by the key \"classes_to_restore\"");
            }
            return;
        }
        throw new AssertionError("Next event must be ON_CREATE");
    }

    public Recreator(C0170e eVar) {
        this.f2068a = eVar;
    }
}
