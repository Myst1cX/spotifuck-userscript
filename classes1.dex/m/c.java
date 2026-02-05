package M;

import t.C0336b;

public class c {

    /* renamed from: a  reason: collision with root package name */
    public final Object[] f481a;

    /* renamed from: b  reason: collision with root package name */
    public int f482b;

    public c(int i) {
        if (i > 0) {
            this.f481a = new Object[i];
            return;
        }
        throw new IllegalArgumentException("The max pool size must be > 0");
    }

    public Object a() {
        int i = this.f482b;
        if (i <= 0) {
            return null;
        }
        int i2 = i - 1;
        Object[] objArr = this.f481a;
        Object obj = objArr[i2];
        Z0.c.c("null cannot be cast to non-null type T of androidx.core.util.Pools.SimplePool", obj);
        objArr[i2] = null;
        this.f482b--;
        return obj;
    }

    public void b(C0336b bVar) {
        int i = this.f482b;
        Object[] objArr = this.f481a;
        if (i < objArr.length) {
            objArr[i] = bVar;
            this.f482b = i + 1;
        }
    }

    public boolean c(Object obj) {
        Object[] objArr;
        boolean z2;
        Z0.c.e("instance", obj);
        int i = this.f482b;
        int i2 = 0;
        while (true) {
            objArr = this.f481a;
            if (i2 >= i) {
                z2 = false;
                break;
            } else if (objArr[i2] == obj) {
                z2 = true;
                break;
            } else {
                i2++;
            }
        }
        if (!z2) {
            int i3 = this.f482b;
            if (i3 >= objArr.length) {
                return false;
            }
            objArr[i3] = obj;
            this.f482b = i3 + 1;
            return true;
        }
        throw new IllegalStateException("Already in the pool!");
    }

    public c() {
        this.f481a = new Object[256];
    }
}
