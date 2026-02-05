package r;

import java.lang.reflect.Array;
import java.util.Map;
import java.util.Set;

/* renamed from: r.a  reason: case insensitive filesystem */
public final class C0323a {

    /* renamed from: a  reason: collision with root package name */
    public h f4511a;

    /* renamed from: b  reason: collision with root package name */
    public h f4512b;

    /* renamed from: c  reason: collision with root package name */
    public j f4513c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ int f4514d;
    public final /* synthetic */ Object e;

    public /* synthetic */ C0323a(int i, Object obj) {
        this.f4514d = i;
        this.e = obj;
    }

    public static boolean h(Set set, Object obj) {
        if (set == obj) {
            return true;
        }
        if (obj instanceof Set) {
            Set set2 = (Set) obj;
            try {
                if (set.size() != set2.size() || !set.containsAll(set2)) {
                    return false;
                }
                return true;
            } catch (ClassCastException | NullPointerException unused) {
            }
        }
        return false;
    }

    public final void a() {
        switch (this.f4514d) {
            case 0:
                ((b) this.e).clear();
                return;
            default:
                ((c) this.e).clear();
                return;
        }
    }

    public final Object b(int i, int i2) {
        switch (this.f4514d) {
            case 0:
                return ((b) this.e).f4549b[(i << 1) + i2];
            default:
                return ((c) this.e).f4521b[i];
        }
    }

    public final Map c() {
        switch (this.f4514d) {
            case 0:
                return (b) this.e;
            default:
                throw new UnsupportedOperationException("not a map");
        }
    }

    public final int d() {
        switch (this.f4514d) {
            case 0:
                return ((b) this.e).f4550c;
            default:
                return ((c) this.e).f4522c;
        }
    }

    public final int e(Object obj) {
        switch (this.f4514d) {
            case 0:
                return ((b) this.e).e(obj);
            default:
                return ((c) this.e).indexOf(obj);
        }
    }

    public final int f(Object obj) {
        switch (this.f4514d) {
            case 0:
                return ((b) this.e).g(obj);
            default:
                return ((c) this.e).indexOf(obj);
        }
    }

    public final void g(int i) {
        switch (this.f4514d) {
            case 0:
                ((b) this.e).i(i);
                return;
            default:
                ((c) this.e).e(i);
                return;
        }
    }

    public final Object[] i(Object[] objArr, int i) {
        int d2 = d();
        if (objArr.length < d2) {
            objArr = (Object[]) Array.newInstance(objArr.getClass().getComponentType(), d2);
        }
        for (int i2 = 0; i2 < d2; i2++) {
            objArr[i2] = b(i2, i);
        }
        if (objArr.length > d2) {
            objArr[d2] = null;
        }
        return objArr;
    }
}
