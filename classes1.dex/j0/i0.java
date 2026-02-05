package j0;

import android.view.View;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;
import java.util.ArrayList;

public final class i0 {

    /* renamed from: a  reason: collision with root package name */
    public final ArrayList f3408a = new ArrayList();

    /* renamed from: b  reason: collision with root package name */
    public int f3409b = Integer.MIN_VALUE;

    /* renamed from: c  reason: collision with root package name */
    public int f3410c = Integer.MIN_VALUE;

    /* renamed from: d  reason: collision with root package name */
    public int f3411d = 0;
    public final int e;

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ StaggeredGridLayoutManager f3412f;

    public final void a() {
        ArrayList arrayList = this.f3408a;
        View view = (View) arrayList.get(arrayList.size() - 1);
        this.f3410c = this.f3412f.f2059r.b(view);
        ((f0) view.getLayoutParams()).getClass();
    }

    public final void b() {
        this.f3408a.clear();
        this.f3409b = Integer.MIN_VALUE;
        this.f3410c = Integer.MIN_VALUE;
        this.f3411d = 0;
    }

    public final int c() {
        boolean z2 = this.f3412f.f2064w;
        ArrayList arrayList = this.f3408a;
        if (z2) {
            return e(arrayList.size() - 1, -1);
        }
        return e(0, arrayList.size());
    }

    public final int d() {
        boolean z2 = this.f3412f.f2064w;
        ArrayList arrayList = this.f3408a;
        if (z2) {
            return e(0, arrayList.size());
        }
        return e(arrayList.size() - 1, -1);
    }

    public final int e(int i, int i2) {
        int i3;
        boolean z2;
        StaggeredGridLayoutManager staggeredGridLayoutManager = this.f3412f;
        int k2 = staggeredGridLayoutManager.f2059r.k();
        int g2 = staggeredGridLayoutManager.f2059r.g();
        if (i2 > i) {
            i3 = 1;
        } else {
            i3 = -1;
        }
        while (i != i2) {
            View view = (View) this.f3408a.get(i);
            int e2 = staggeredGridLayoutManager.f2059r.e(view);
            int b2 = staggeredGridLayoutManager.f2059r.b(view);
            boolean z3 = false;
            if (e2 <= g2) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (b2 >= k2) {
                z3 = true;
            }
            if (z2 && z3 && (e2 < k2 || b2 > g2)) {
                return K.H(view);
            }
            i += i3;
        }
        return -1;
    }

    public final int f(int i) {
        int i2 = this.f3410c;
        if (i2 != Integer.MIN_VALUE) {
            return i2;
        }
        if (this.f3408a.size() == 0) {
            return i;
        }
        a();
        return this.f3410c;
    }

    public final View g(int i, int i2) {
        ArrayList arrayList = this.f3408a;
        StaggeredGridLayoutManager staggeredGridLayoutManager = this.f3412f;
        View view = null;
        if (i2 != -1) {
            int size = arrayList.size() - 1;
            while (size >= 0) {
                View view2 = (View) arrayList.get(size);
                if ((staggeredGridLayoutManager.f2064w && K.H(view2) >= i) || ((!staggeredGridLayoutManager.f2064w && K.H(view2) <= i) || !view2.hasFocusable())) {
                    break;
                }
                size--;
                view = view2;
            }
        } else {
            int size2 = arrayList.size();
            int i3 = 0;
            while (i3 < size2) {
                View view3 = (View) arrayList.get(i3);
                if ((staggeredGridLayoutManager.f2064w && K.H(view3) <= i) || ((!staggeredGridLayoutManager.f2064w && K.H(view3) >= i) || !view3.hasFocusable())) {
                    break;
                }
                i3++;
                view = view3;
            }
        }
        return view;
    }

    public final int h(int i) {
        int i2 = this.f3409b;
        if (i2 != Integer.MIN_VALUE) {
            return i2;
        }
        if (this.f3408a.size() == 0) {
            return i;
        }
        View view = (View) this.f3408a.get(0);
        this.f3409b = this.f3412f.f2059r.e(view);
        ((f0) view.getLayoutParams()).getClass();
        return this.f3409b;
    }

    public i0(StaggeredGridLayoutManager staggeredGridLayoutManager, int i) {
        this.f3412f = staggeredGridLayoutManager;
        this.e = i;
    }
}
