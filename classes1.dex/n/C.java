package N;

import K0.e;
import android.os.Build;
import android.view.View;
import java.nio.ByteBuffer;

public abstract class C {

    /* renamed from: a  reason: collision with root package name */
    public int f497a;

    /* renamed from: b  reason: collision with root package name */
    public int f498b;

    /* renamed from: c  reason: collision with root package name */
    public int f499c;

    /* renamed from: d  reason: collision with root package name */
    public Object f500d;

    public abstract Object b(View view);

    public abstract void c(View view, Object obj);

    public abstract boolean e(Object obj, Object obj2);

    public int a(int i) {
        if (i < this.f499c) {
            return ((ByteBuffer) this.f500d).getShort(this.f498b + i);
        }
        return 0;
    }

    public void d(View view, Object obj) {
        Object obj2;
        C0002b bVar;
        if (Build.VERSION.SDK_INT >= this.f498b) {
            c(view, obj);
            return;
        }
        if (Build.VERSION.SDK_INT >= this.f498b) {
            obj2 = b(view);
        } else {
            obj2 = view.getTag(this.f497a);
            if (!((Class) this.f500d).isInstance(obj2)) {
                obj2 = null;
            }
        }
        if (e(obj2, obj)) {
            View.AccessibilityDelegate c2 = Q.c(view);
            if (c2 == null) {
                bVar = null;
            } else if (c2 instanceof C0000a) {
                bVar = ((C0000a) c2).f521a;
            } else {
                bVar = new C0002b(c2);
            }
            if (bVar == null) {
                bVar = new C0002b();
            }
            Q.p(view, bVar);
            view.setTag(this.f497a, obj);
            Q.i(view, this.f499c);
        }
    }

    public C() {
        if (e.f348g == null) {
            e.f348g = new e(7);
        }
    }
}
