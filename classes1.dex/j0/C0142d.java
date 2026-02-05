package j0;

import android.view.View;
import android.view.ViewPropertyAnimator;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: j0.d  reason: case insensitive filesystem */
public final class C0142d implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f3363a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ ArrayList f3364b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ C0148j f3365c;

    public /* synthetic */ C0142d(C0148j jVar, ArrayList arrayList, int i) {
        this.f3363a = i;
        this.f3365c = jVar;
        this.f3364b = arrayList;
    }

    public final void run() {
        View view;
        View view2;
        Iterator it2;
        switch (this.f3363a) {
            case 0:
                ArrayList arrayList = this.f3364b;
                Iterator it3 = arrayList.iterator();
                while (true) {
                    boolean hasNext = it3.hasNext();
                    C0148j jVar = this.f3365c;
                    if (hasNext) {
                        C0147i iVar = (C0147i) it3.next();
                        a0 a0Var = iVar.f3404a;
                        jVar.getClass();
                        View view3 = a0Var.f3338a;
                        int i = iVar.f3407d - iVar.f3405b;
                        int i2 = iVar.e - iVar.f3406c;
                        if (i != 0) {
                            view3.animate().translationX(0.0f);
                        }
                        if (i2 != 0) {
                            view3.animate().translationY(0.0f);
                        }
                        ViewPropertyAnimator animate = view3.animate();
                        jVar.f3422p.add(a0Var);
                        animate.setDuration(jVar.e).setListener(new C0144f(jVar, a0Var, i, view3, i2, animate)).start();
                    } else {
                        arrayList.clear();
                        jVar.f3419m.remove(arrayList);
                        return;
                    }
                }
            case 1:
                ArrayList arrayList2 = this.f3364b;
                Iterator it4 = arrayList2.iterator();
                while (true) {
                    boolean hasNext2 = it4.hasNext();
                    C0148j jVar2 = this.f3365c;
                    if (hasNext2) {
                        C0146h hVar = (C0146h) it4.next();
                        jVar2.getClass();
                        a0 a0Var2 = hVar.f3391a;
                        if (a0Var2 == null) {
                            view = null;
                        } else {
                            view = a0Var2.f3338a;
                        }
                        a0 a0Var3 = hVar.f3392b;
                        if (a0Var3 != null) {
                            view2 = a0Var3.f3338a;
                        } else {
                            view2 = null;
                        }
                        ArrayList arrayList3 = jVar2.f3424r;
                        long j2 = jVar2.f3270f;
                        if (view != null) {
                            ViewPropertyAnimator duration = view.animate().setDuration(j2);
                            arrayList3.add(hVar.f3391a);
                            duration.translationX((float) (hVar.e - hVar.f3393c));
                            duration.translationY((float) (hVar.f3395f - hVar.f3394d));
                            C0145g gVar = r4;
                            it2 = it4;
                            C0145g gVar2 = new C0145g(jVar2, hVar, duration, view, 0);
                            duration.alpha(0.0f).setListener(gVar).start();
                        } else {
                            it2 = it4;
                        }
                        if (view2 != null) {
                            ViewPropertyAnimator animate2 = view2.animate();
                            arrayList3.add(hVar.f3392b);
                            animate2.translationX(0.0f).translationY(0.0f).setDuration(j2).alpha(1.0f).setListener(new C0145g(jVar2, hVar, animate2, view2, 1)).start();
                        }
                        it4 = it2;
                    } else {
                        arrayList2.clear();
                        jVar2.f3420n.remove(arrayList2);
                        return;
                    }
                }
            default:
                ArrayList arrayList4 = this.f3364b;
                Iterator it5 = arrayList4.iterator();
                while (true) {
                    boolean hasNext3 = it5.hasNext();
                    C0148j jVar3 = this.f3365c;
                    if (hasNext3) {
                        a0 a0Var4 = (a0) it5.next();
                        jVar3.getClass();
                        View view4 = a0Var4.f3338a;
                        ViewPropertyAnimator animate3 = view4.animate();
                        jVar3.f3421o.add(a0Var4);
                        animate3.alpha(1.0f).setDuration(jVar3.f3268c).setListener(new C0143e(jVar3, a0Var4, view4, animate3)).start();
                    } else {
                        arrayList4.clear();
                        jVar3.f3418l.remove(arrayList4);
                        return;
                    }
                }
        }
    }
}
