package j0;

import android.view.View;
import java.util.List;

/* renamed from: j0.t  reason: case insensitive filesystem */
public final class C0157t {

    /* renamed from: a  reason: collision with root package name */
    public boolean f3489a;

    /* renamed from: b  reason: collision with root package name */
    public int f3490b;

    /* renamed from: c  reason: collision with root package name */
    public int f3491c;

    /* renamed from: d  reason: collision with root package name */
    public int f3492d;
    public int e;

    /* renamed from: f  reason: collision with root package name */
    public int f3493f;

    /* renamed from: g  reason: collision with root package name */
    public int f3494g;

    /* renamed from: h  reason: collision with root package name */
    public int f3495h;
    public int i;

    /* renamed from: j  reason: collision with root package name */
    public int f3496j;

    /* renamed from: k  reason: collision with root package name */
    public List f3497k;

    /* renamed from: l  reason: collision with root package name */
    public boolean f3498l;

    public final void a(View view) {
        int b2;
        int size = this.f3497k.size();
        View view2 = null;
        int i2 = Integer.MAX_VALUE;
        for (int i3 = 0; i3 < size; i3++) {
            View view3 = ((a0) this.f3497k.get(i3)).f3338a;
            L l2 = (L) view3.getLayoutParams();
            if (view3 != view && !l2.f3290a.i() && (b2 = (l2.f3290a.b() - this.f3492d) * this.e) >= 0 && b2 < i2) {
                view2 = view3;
                if (b2 == 0) {
                    break;
                }
                i2 = b2;
            }
        }
        if (view2 == null) {
            this.f3492d = -1;
        } else {
            this.f3492d = ((L) view2.getLayoutParams()).f3290a.b();
        }
    }

    public final View b(Q q2) {
        List list = this.f3497k;
        if (list != null) {
            int size = list.size();
            for (int i2 = 0; i2 < size; i2++) {
                View view = ((a0) this.f3497k.get(i2)).f3338a;
                L l2 = (L) view.getLayoutParams();
                if (!l2.f3290a.i() && this.f3492d == l2.f3290a.b()) {
                    a(view);
                    return view;
                }
            }
            return null;
        }
        View view2 = q2.i(this.f3492d, Long.MAX_VALUE).f3338a;
        this.f3492d += this.e;
        return view2;
    }
}
