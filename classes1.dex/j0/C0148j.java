package j0;

import N.C0017q;
import Q0.E;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.view.View;
import java.util.ArrayList;

/* renamed from: j0.j  reason: case insensitive filesystem */
public final class C0148j extends G {

    /* renamed from: s  reason: collision with root package name */
    public static TimeInterpolator f3413s;

    /* renamed from: g  reason: collision with root package name */
    public boolean f3414g;

    /* renamed from: h  reason: collision with root package name */
    public ArrayList f3415h;
    public ArrayList i;

    /* renamed from: j  reason: collision with root package name */
    public ArrayList f3416j;

    /* renamed from: k  reason: collision with root package name */
    public ArrayList f3417k;

    /* renamed from: l  reason: collision with root package name */
    public ArrayList f3418l;

    /* renamed from: m  reason: collision with root package name */
    public ArrayList f3419m;

    /* renamed from: n  reason: collision with root package name */
    public ArrayList f3420n;

    /* renamed from: o  reason: collision with root package name */
    public ArrayList f3421o;

    /* renamed from: p  reason: collision with root package name */
    public ArrayList f3422p;

    /* renamed from: q  reason: collision with root package name */
    public ArrayList f3423q;

    /* renamed from: r  reason: collision with root package name */
    public ArrayList f3424r;

    /* JADX WARNING: type inference failed for: r12v3, types: [j0.h, java.lang.Object] */
    public final boolean a(a0 a0Var, a0 a0Var2, C0017q qVar, C0017q qVar2) {
        int i2;
        int i3;
        int i4 = qVar.f584a;
        int i5 = qVar.f585b;
        if (a0Var2.p()) {
            int i6 = qVar.f584a;
            i2 = qVar.f585b;
            i3 = i6;
        } else {
            i3 = qVar2.f584a;
            i2 = qVar2.f585b;
        }
        if (a0Var == a0Var2) {
            return g(a0Var, i4, i5, i3, i2);
        }
        View view = a0Var.f3338a;
        float translationX = view.getTranslationX();
        float translationY = view.getTranslationY();
        float alpha = view.getAlpha();
        l(a0Var);
        view.setTranslationX(translationX);
        view.setTranslationY(translationY);
        view.setAlpha(alpha);
        l(a0Var2);
        View view2 = a0Var2.f3338a;
        view2.setTranslationX((float) (-((int) (((float) (i3 - i4)) - translationX))));
        view2.setTranslationY((float) (-((int) (((float) (i2 - i5)) - translationY))));
        view2.setAlpha(0.0f);
        ArrayList arrayList = this.f3417k;
        ? obj = new Object();
        obj.f3391a = a0Var;
        obj.f3392b = a0Var2;
        obj.f3393c = i4;
        obj.f3394d = i5;
        obj.e = i3;
        obj.f3395f = i2;
        arrayList.add(obj);
        return true;
    }

    public final void d(a0 a0Var) {
        View view = a0Var.f3338a;
        view.animate().cancel();
        ArrayList arrayList = this.f3416j;
        int size = arrayList.size();
        while (true) {
            size--;
            if (size < 0) {
                break;
            } else if (((C0147i) arrayList.get(size)).f3404a == a0Var) {
                view.setTranslationY(0.0f);
                view.setTranslationX(0.0f);
                c(a0Var);
                arrayList.remove(size);
            }
        }
        j(this.f3417k, a0Var);
        if (this.f3415h.remove(a0Var)) {
            view.setAlpha(1.0f);
            c(a0Var);
        }
        if (this.i.remove(a0Var)) {
            view.setAlpha(1.0f);
            c(a0Var);
        }
        ArrayList arrayList2 = this.f3420n;
        for (int size2 = arrayList2.size() - 1; size2 >= 0; size2--) {
            ArrayList arrayList3 = (ArrayList) arrayList2.get(size2);
            j(arrayList3, a0Var);
            if (arrayList3.isEmpty()) {
                arrayList2.remove(size2);
            }
        }
        ArrayList arrayList4 = this.f3419m;
        for (int size3 = arrayList4.size() - 1; size3 >= 0; size3--) {
            ArrayList arrayList5 = (ArrayList) arrayList4.get(size3);
            int size4 = arrayList5.size() - 1;
            while (true) {
                if (size4 < 0) {
                    break;
                } else if (((C0147i) arrayList5.get(size4)).f3404a == a0Var) {
                    view.setTranslationY(0.0f);
                    view.setTranslationX(0.0f);
                    c(a0Var);
                    arrayList5.remove(size4);
                    if (arrayList5.isEmpty()) {
                        arrayList4.remove(size3);
                    }
                } else {
                    size4--;
                }
            }
        }
        ArrayList arrayList6 = this.f3418l;
        for (int size5 = arrayList6.size() - 1; size5 >= 0; size5--) {
            ArrayList arrayList7 = (ArrayList) arrayList6.get(size5);
            if (arrayList7.remove(a0Var)) {
                view.setAlpha(1.0f);
                c(a0Var);
                if (arrayList7.isEmpty()) {
                    arrayList6.remove(size5);
                }
            }
        }
        this.f3423q.remove(a0Var);
        this.f3421o.remove(a0Var);
        this.f3424r.remove(a0Var);
        this.f3422p.remove(a0Var);
        i();
    }

    public final void e() {
        ArrayList arrayList = this.f3416j;
        int size = arrayList.size();
        while (true) {
            size--;
            if (size < 0) {
                break;
            }
            C0147i iVar = (C0147i) arrayList.get(size);
            View view = iVar.f3404a.f3338a;
            view.setTranslationY(0.0f);
            view.setTranslationX(0.0f);
            c(iVar.f3404a);
            arrayList.remove(size);
        }
        ArrayList arrayList2 = this.f3415h;
        for (int size2 = arrayList2.size() - 1; size2 >= 0; size2--) {
            c((a0) arrayList2.get(size2));
            arrayList2.remove(size2);
        }
        ArrayList arrayList3 = this.i;
        int size3 = arrayList3.size();
        while (true) {
            size3--;
            if (size3 < 0) {
                break;
            }
            a0 a0Var = (a0) arrayList3.get(size3);
            a0Var.f3338a.setAlpha(1.0f);
            c(a0Var);
            arrayList3.remove(size3);
        }
        ArrayList arrayList4 = this.f3417k;
        for (int size4 = arrayList4.size() - 1; size4 >= 0; size4--) {
            C0146h hVar = (C0146h) arrayList4.get(size4);
            a0 a0Var2 = hVar.f3391a;
            if (a0Var2 != null) {
                k(hVar, a0Var2);
            }
            a0 a0Var3 = hVar.f3392b;
            if (a0Var3 != null) {
                k(hVar, a0Var3);
            }
        }
        arrayList4.clear();
        if (f()) {
            ArrayList arrayList5 = this.f3419m;
            for (int size5 = arrayList5.size() - 1; size5 >= 0; size5--) {
                ArrayList arrayList6 = (ArrayList) arrayList5.get(size5);
                for (int size6 = arrayList6.size() - 1; size6 >= 0; size6--) {
                    C0147i iVar2 = (C0147i) arrayList6.get(size6);
                    View view2 = iVar2.f3404a.f3338a;
                    view2.setTranslationY(0.0f);
                    view2.setTranslationX(0.0f);
                    c(iVar2.f3404a);
                    arrayList6.remove(size6);
                    if (arrayList6.isEmpty()) {
                        arrayList5.remove(arrayList6);
                    }
                }
            }
            ArrayList arrayList7 = this.f3418l;
            for (int size7 = arrayList7.size() - 1; size7 >= 0; size7--) {
                ArrayList arrayList8 = (ArrayList) arrayList7.get(size7);
                for (int size8 = arrayList8.size() - 1; size8 >= 0; size8--) {
                    a0 a0Var4 = (a0) arrayList8.get(size8);
                    a0Var4.f3338a.setAlpha(1.0f);
                    c(a0Var4);
                    arrayList8.remove(size8);
                    if (arrayList8.isEmpty()) {
                        arrayList7.remove(arrayList8);
                    }
                }
            }
            ArrayList arrayList9 = this.f3420n;
            for (int size9 = arrayList9.size() - 1; size9 >= 0; size9--) {
                ArrayList arrayList10 = (ArrayList) arrayList9.get(size9);
                for (int size10 = arrayList10.size() - 1; size10 >= 0; size10--) {
                    C0146h hVar2 = (C0146h) arrayList10.get(size10);
                    a0 a0Var5 = hVar2.f3391a;
                    if (a0Var5 != null) {
                        k(hVar2, a0Var5);
                    }
                    a0 a0Var6 = hVar2.f3392b;
                    if (a0Var6 != null) {
                        k(hVar2, a0Var6);
                    }
                    if (arrayList10.isEmpty()) {
                        arrayList9.remove(arrayList10);
                    }
                }
            }
            h(this.f3423q);
            h(this.f3422p);
            h(this.f3421o);
            h(this.f3424r);
            ArrayList arrayList11 = this.f3267b;
            if (arrayList11.size() <= 0) {
                arrayList11.clear();
            } else {
                E.h(arrayList11.get(0));
                throw null;
            }
        }
    }

    public final boolean f() {
        if (!this.i.isEmpty() || !this.f3417k.isEmpty() || !this.f3416j.isEmpty() || !this.f3415h.isEmpty() || !this.f3422p.isEmpty() || !this.f3423q.isEmpty() || !this.f3421o.isEmpty() || !this.f3424r.isEmpty() || !this.f3419m.isEmpty() || !this.f3418l.isEmpty() || !this.f3420n.isEmpty()) {
            return true;
        }
        return false;
    }

    /* JADX WARNING: type inference failed for: r1v6, types: [j0.i, java.lang.Object] */
    public final boolean g(a0 a0Var, int i2, int i3, int i4, int i5) {
        View view = a0Var.f3338a;
        int translationX = i2 + ((int) view.getTranslationX());
        int translationY = i3 + ((int) a0Var.f3338a.getTranslationY());
        l(a0Var);
        int i6 = i4 - translationX;
        int i7 = i5 - translationY;
        if (i6 == 0 && i7 == 0) {
            c(a0Var);
            return false;
        }
        if (i6 != 0) {
            view.setTranslationX((float) (-i6));
        }
        if (i7 != 0) {
            view.setTranslationY((float) (-i7));
        }
        ArrayList arrayList = this.f3416j;
        ? obj = new Object();
        obj.f3404a = a0Var;
        obj.f3405b = translationX;
        obj.f3406c = translationY;
        obj.f3407d = i4;
        obj.e = i5;
        arrayList.add(obj);
        return true;
    }

    public final boolean k(C0146h hVar, a0 a0Var) {
        if (hVar.f3392b == a0Var) {
            hVar.f3392b = null;
        } else if (hVar.f3391a != a0Var) {
            return false;
        } else {
            hVar.f3391a = null;
        }
        a0Var.f3338a.setAlpha(1.0f);
        View view = a0Var.f3338a;
        view.setTranslationX(0.0f);
        view.setTranslationY(0.0f);
        c(a0Var);
        return true;
    }

    public final void l(a0 a0Var) {
        if (f3413s == null) {
            f3413s = new ValueAnimator().getInterpolator();
        }
        a0Var.f3338a.animate().setInterpolator(f3413s);
        d(a0Var);
    }

    public static void h(ArrayList arrayList) {
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            ((a0) arrayList.get(size)).f3338a.animate().cancel();
        }
    }

    public final void i() {
        if (!f()) {
            ArrayList arrayList = this.f3267b;
            if (arrayList.size() <= 0) {
                arrayList.clear();
            } else {
                E.h(arrayList.get(0));
                throw null;
            }
        }
    }

    public final void j(ArrayList arrayList, a0 a0Var) {
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            C0146h hVar = (C0146h) arrayList.get(size);
            if (k(hVar, a0Var) && hVar.f3391a == null && hVar.f3392b == null) {
                arrayList.remove(hVar);
            }
        }
    }
}
