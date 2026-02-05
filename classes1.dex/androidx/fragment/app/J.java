package androidx.fragment.app;

import K0.e;
import android.util.Log;
import androidx.lifecycle.M;
import androidx.lifecycle.P;
import java.util.HashMap;
import java.util.Iterator;

public final class J extends M {
    public static final e i = new e(15);

    /* renamed from: c  reason: collision with root package name */
    public final HashMap f1612c = new HashMap();

    /* renamed from: d  reason: collision with root package name */
    public final HashMap f1613d = new HashMap();
    public final HashMap e = new HashMap();

    /* renamed from: f  reason: collision with root package name */
    public final boolean f1614f;

    /* renamed from: g  reason: collision with root package name */
    public boolean f1615g = false;

    /* renamed from: h  reason: collision with root package name */
    public boolean f1616h = false;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || J.class != obj.getClass()) {
            return false;
        }
        J j2 = (J) obj;
        if (!this.f1612c.equals(j2.f1612c) || !this.f1613d.equals(j2.f1613d) || !this.e.equals(j2.e)) {
            return false;
        }
        return true;
    }

    public final void b() {
        if (Log.isLoggable("FragmentManager", 3)) {
            toString();
        }
        this.f1615g = true;
    }

    public final void c(String str) {
        HashMap hashMap = this.f1613d;
        J j2 = (J) hashMap.get(str);
        if (j2 != null) {
            j2.b();
            hashMap.remove(str);
        }
        HashMap hashMap2 = this.e;
        P p2 = (P) hashMap2.get(str);
        if (p2 != null) {
            p2.a();
            hashMap2.remove(str);
        }
    }

    public final void d(r rVar) {
        if (this.f1616h) {
            Log.isLoggable("FragmentManager", 2);
        } else if (this.f1612c.remove(rVar.f1755j) != null && Log.isLoggable("FragmentManager", 2)) {
            rVar.toString();
        }
    }

    public final int hashCode() {
        int hashCode = this.f1613d.hashCode();
        return this.e.hashCode() + ((hashCode + (this.f1612c.hashCode() * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("FragmentManagerViewModel{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append("} Fragments (");
        Iterator it2 = this.f1612c.values().iterator();
        while (it2.hasNext()) {
            sb.append(it2.next());
            if (it2.hasNext()) {
                sb.append(", ");
            }
        }
        sb.append(") Child Non Config (");
        Iterator it3 = this.f1613d.keySet().iterator();
        while (it3.hasNext()) {
            sb.append((String) it3.next());
            if (it3.hasNext()) {
                sb.append(", ");
            }
        }
        sb.append(") ViewModelStores (");
        Iterator it4 = this.e.keySet().iterator();
        while (it4.hasNext()) {
            sb.append((String) it4.next());
            if (it4.hasNext()) {
                sb.append(", ");
            }
        }
        sb.append(')');
        return sb.toString();
    }

    public J(boolean z2) {
        this.f1614f = z2;
    }
}
