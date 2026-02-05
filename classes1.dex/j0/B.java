package j0;

import N.C0017q;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.Collections;

public final class B {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ RecyclerView f3263a;

    public /* synthetic */ B(RecyclerView recyclerView) {
        this.f3263a = recyclerView;
    }

    public void a(C0139a aVar) {
        int i = aVar.f3333a;
        RecyclerView recyclerView = this.f3263a;
        if (i == 1) {
            recyclerView.f2030r.W(aVar.f3334b, aVar.f3336d);
        } else if (i == 2) {
            recyclerView.f2030r.Z(aVar.f3334b, aVar.f3336d);
        } else if (i == 4) {
            recyclerView.f2030r.a0(aVar.f3334b, aVar.f3336d);
        } else if (i == 8) {
            recyclerView.f2030r.Y(aVar.f3334b, aVar.f3336d);
        }
    }

    public a0 b(int i) {
        RecyclerView recyclerView = this.f3263a;
        int u2 = recyclerView.f2015j.u();
        int i2 = 0;
        a0 a0Var = null;
        while (true) {
            if (i2 >= u2) {
                break;
            }
            a0 I = RecyclerView.I(recyclerView.f2015j.t(i2));
            if (I != null && !I.i() && I.f3340c == i) {
                if (!((ArrayList) recyclerView.f2015j.f1133d).contains(I.f3338a)) {
                    a0Var = I;
                    break;
                }
                a0Var = I;
            }
            i2++;
        }
        if (a0Var != null && !((ArrayList) recyclerView.f2015j.f1133d).contains(a0Var.f3338a)) {
            return a0Var;
        }
        return null;
    }

    public void c(int i, int i2, Object obj) {
        int i3;
        int i4;
        RecyclerView recyclerView = this.f3263a;
        int u2 = recyclerView.f2015j.u();
        int i5 = i2 + i;
        for (int i6 = 0; i6 < u2; i6++) {
            View t2 = recyclerView.f2015j.t(i6);
            a0 I = RecyclerView.I(t2);
            if (I != null && !I.p() && (i4 = I.f3340c) >= i && i4 < i5) {
                I.a(2);
                if (obj == null) {
                    I.a(1024);
                } else if ((1024 & I.f3345j) == 0) {
                    if (I.f3346k == null) {
                        ArrayList arrayList = new ArrayList();
                        I.f3346k = arrayList;
                        I.f3347l = Collections.unmodifiableList(arrayList);
                    }
                    I.f3346k.add(obj);
                }
                ((L) t2.getLayoutParams()).f3292c = true;
            }
        }
        Q q2 = recyclerView.f2010g;
        ArrayList arrayList2 = q2.f3302c;
        for (int size = arrayList2.size() - 1; size >= 0; size--) {
            a0 a0Var = (a0) arrayList2.get(size);
            if (a0Var != null && (i3 = a0Var.f3340c) >= i && i3 < i5) {
                a0Var.a(2);
                q2.e(size);
            }
        }
        recyclerView.f2023n0 = true;
    }

    public void d(int i, int i2) {
        RecyclerView recyclerView = this.f3263a;
        int u2 = recyclerView.f2015j.u();
        for (int i3 = 0; i3 < u2; i3++) {
            a0 I = RecyclerView.I(recyclerView.f2015j.t(i3));
            if (I != null && !I.p() && I.f3340c >= i) {
                I.m(i2, false);
                recyclerView.f2016j0.f3319f = true;
            }
        }
        ArrayList arrayList = recyclerView.f2010g.f3302c;
        int size = arrayList.size();
        for (int i4 = 0; i4 < size; i4++) {
            a0 a0Var = (a0) arrayList.get(i4);
            if (a0Var != null && a0Var.f3340c >= i) {
                a0Var.m(i2, true);
            }
        }
        recyclerView.requestLayout();
        recyclerView.m0 = true;
    }

    public void e(int i, int i2) {
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        RecyclerView recyclerView = this.f3263a;
        int u2 = recyclerView.f2015j.u();
        int i10 = -1;
        if (i < i2) {
            i5 = i;
            i4 = i2;
            i3 = -1;
        } else {
            i4 = i;
            i5 = i2;
            i3 = 1;
        }
        for (int i11 = 0; i11 < u2; i11++) {
            a0 I = RecyclerView.I(recyclerView.f2015j.t(i11));
            if (I != null && (i9 = I.f3340c) >= i5 && i9 <= i4) {
                if (i9 == i) {
                    I.m(i2 - i, false);
                } else {
                    I.m(i3, false);
                }
                recyclerView.f2016j0.f3319f = true;
            }
        }
        Q q2 = recyclerView.f2010g;
        q2.getClass();
        if (i < i2) {
            i7 = i;
            i6 = i2;
        } else {
            i6 = i;
            i7 = i2;
            i10 = 1;
        }
        ArrayList arrayList = q2.f3302c;
        int size = arrayList.size();
        for (int i12 = 0; i12 < size; i12++) {
            a0 a0Var = (a0) arrayList.get(i12);
            if (a0Var != null && (i8 = a0Var.f3340c) >= i7 && i8 <= i6) {
                if (i8 == i) {
                    a0Var.m(i2 - i, false);
                } else {
                    a0Var.m(i10, false);
                }
            }
        }
        recyclerView.requestLayout();
        recyclerView.m0 = true;
    }

    /* JADX WARNING: Removed duplicated region for block: B:11:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x003a  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void f(j0.a0 r9, N.C0017q r10, N.C0017q r11) {
        /*
            r8 = this;
            androidx.recyclerview.widget.RecyclerView r0 = r8.f3263a
            r0.getClass()
            r1 = 0
            r9.o(r1)
            j0.G r1 = r0.f1994O
            r2 = r1
            j0.j r2 = (j0.C0148j) r2
            if (r10 == 0) goto L_0x0029
            r2.getClass()
            int r4 = r10.f584a
            int r6 = r11.f584a
            if (r4 != r6) goto L_0x001f
            int r1 = r10.f585b
            int r3 = r11.f585b
            if (r1 == r3) goto L_0x0029
        L_0x001f:
            int r5 = r10.f585b
            int r7 = r11.f585b
            r3 = r9
            boolean r9 = r2.g(r3, r4, r5, r6, r7)
            goto L_0x0038
        L_0x0029:
            r2.l(r9)
            android.view.View r10 = r9.f3338a
            r11 = 0
            r10.setAlpha(r11)
            java.util.ArrayList r10 = r2.i
            r10.add(r9)
            r9 = 1
        L_0x0038:
            if (r9 == 0) goto L_0x003d
            r0.S()
        L_0x003d:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: j0.B.f(j0.a0, N.q, N.q):void");
    }

    public void g(a0 a0Var, C0017q qVar, C0017q qVar2) {
        int i;
        int i2;
        boolean z2;
        RecyclerView recyclerView = this.f3263a;
        recyclerView.f2010g.j(a0Var);
        recyclerView.f(a0Var);
        a0Var.o(false);
        C0148j jVar = (C0148j) recyclerView.f1994O;
        jVar.getClass();
        int i3 = qVar.f584a;
        int i4 = qVar.f585b;
        View view = a0Var.f3338a;
        if (qVar2 == null) {
            i = view.getLeft();
        } else {
            i = qVar2.f584a;
        }
        int i5 = i;
        if (qVar2 == null) {
            i2 = view.getTop();
        } else {
            i2 = qVar2.f585b;
        }
        int i6 = i2;
        if (a0Var.i() || (i3 == i5 && i4 == i6)) {
            jVar.l(a0Var);
            jVar.f3415h.add(a0Var);
            z2 = true;
        } else {
            view.layout(i5, i6, view.getWidth() + i5, view.getHeight() + i6);
            z2 = jVar.g(a0Var, i3, i4, i5, i6);
        }
        if (z2) {
            recyclerView.S();
        }
    }

    public void h(int i) {
        RecyclerView recyclerView = this.f3263a;
        View childAt = recyclerView.getChildAt(i);
        if (childAt != null) {
            RecyclerView.I(childAt);
            childAt.clearAnimation();
        }
        recyclerView.removeViewAt(i);
    }
}
