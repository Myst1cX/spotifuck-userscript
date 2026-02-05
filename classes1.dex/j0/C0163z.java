package j0;

import android.view.View;
import androidx.emoji2.text.g;
import androidx.recyclerview.widget.RecyclerView;

/* renamed from: j0.z  reason: case insensitive filesystem */
public final class C0163z extends M {

    /* renamed from: a  reason: collision with root package name */
    public RecyclerView f3520a;

    /* renamed from: b  reason: collision with root package name */
    public final d0 f3521b = new d0(this);

    /* renamed from: c  reason: collision with root package name */
    public C0161x f3522c;

    /* renamed from: d  reason: collision with root package name */
    public C0161x f3523d;

    public final int[] a(K k2, View view) {
        int[] iArr = new int[2];
        if (k2.d()) {
            iArr[0] = b(view, d(k2));
        } else {
            iArr[0] = 0;
        }
        if (k2.e()) {
            iArr[1] = b(view, e(k2));
        } else {
            iArr[1] = 0;
        }
        return iArr;
    }

    public final g d(K k2) {
        C0161x xVar = this.f3523d;
        if (xVar == null || ((K) xVar.f1511b) != k2) {
            this.f3523d = new C0161x(k2, 0);
        }
        return this.f3523d;
    }

    public final g e(K k2) {
        C0161x xVar = this.f3522c;
        if (xVar == null || ((K) xVar.f1511b) != k2) {
            this.f3522c = new C0161x(k2, 1);
        }
        return this.f3522c;
    }

    public final void f() {
        K layoutManager;
        View view;
        RecyclerView recyclerView = this.f3520a;
        if (recyclerView != null && (layoutManager = recyclerView.getLayoutManager()) != null) {
            if (layoutManager.e()) {
                view = c(layoutManager, e(layoutManager));
            } else if (layoutManager.d()) {
                view = c(layoutManager, d(layoutManager));
            } else {
                view = null;
            }
            if (view != null) {
                int[] a2 = a(layoutManager, view);
                int i = a2[0];
                if (i != 0 || a2[1] != 0) {
                    this.f3520a.b0(i, a2[1], false);
                }
            }
        }
    }

    public static int b(View view, g gVar) {
        return ((gVar.c(view) / 2) + gVar.e(view)) - ((gVar.l() / 2) + gVar.k());
    }

    public static View c(K k2, g gVar) {
        int v2 = k2.v();
        View view = null;
        if (v2 == 0) {
            return null;
        }
        int l2 = (gVar.l() / 2) + gVar.k();
        int i = Integer.MAX_VALUE;
        for (int i2 = 0; i2 < v2; i2++) {
            View u2 = k2.u(i2);
            int abs = Math.abs(((gVar.c(u2) / 2) + gVar.e(u2)) - l2);
            if (abs < i) {
                view = u2;
                i = abs;
            }
        }
        return view;
    }
}
