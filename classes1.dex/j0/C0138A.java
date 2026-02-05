package j0;

import N.Q;
import android.view.View;
import android.view.ViewPropertyAnimator;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.WeakHashMap;

/* renamed from: j0.A  reason: case insensitive filesystem */
public final class C0138A implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f3261a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ RecyclerView f3262b;

    public /* synthetic */ C0138A(RecyclerView recyclerView, int i) {
        this.f3261a = i;
        this.f3262b = recyclerView;
    }

    public final void run() {
        long j2;
        RecyclerView recyclerView = this.f3262b;
        switch (this.f3261a) {
            case 0:
                if (recyclerView.f2042x && !recyclerView.isLayoutRequested()) {
                    if (!recyclerView.f2038v) {
                        recyclerView.requestLayout();
                        return;
                    } else if (recyclerView.f1981A) {
                        recyclerView.f2046z = true;
                        return;
                    } else {
                        recyclerView.m();
                        return;
                    }
                } else {
                    return;
                }
            default:
                G g2 = recyclerView.f1994O;
                if (g2 != null) {
                    C0148j jVar = (C0148j) g2;
                    ArrayList arrayList = jVar.f3415h;
                    boolean isEmpty = arrayList.isEmpty();
                    ArrayList arrayList2 = jVar.f3416j;
                    boolean isEmpty2 = arrayList2.isEmpty();
                    ArrayList arrayList3 = jVar.f3417k;
                    boolean isEmpty3 = arrayList3.isEmpty();
                    ArrayList arrayList4 = jVar.i;
                    boolean isEmpty4 = arrayList4.isEmpty();
                    if (!isEmpty || !isEmpty2 || !isEmpty4 || !isEmpty3) {
                        Iterator it2 = arrayList.iterator();
                        while (true) {
                            boolean hasNext = it2.hasNext();
                            long j3 = jVar.f3269d;
                            if (hasNext) {
                                a0 a0Var = (a0) it2.next();
                                View view = a0Var.f3338a;
                                ViewPropertyAnimator animate = view.animate();
                                jVar.f3423q.add(a0Var);
                                animate.setDuration(j3).alpha(0.0f).setListener(new C0143e(jVar, a0Var, animate, view)).start();
                                it2 = it2;
                            } else {
                                arrayList.clear();
                                if (!isEmpty2) {
                                    ArrayList arrayList5 = new ArrayList();
                                    arrayList5.addAll(arrayList2);
                                    jVar.f3419m.add(arrayList5);
                                    arrayList2.clear();
                                    C0142d dVar = new C0142d(jVar, arrayList5, 0);
                                    if (!isEmpty) {
                                        View view2 = ((C0147i) arrayList5.get(0)).f3404a.f3338a;
                                        WeakHashMap weakHashMap = Q.f509a;
                                        view2.postOnAnimationDelayed(dVar, j3);
                                    } else {
                                        dVar.run();
                                    }
                                }
                                if (!isEmpty3) {
                                    ArrayList arrayList6 = new ArrayList();
                                    arrayList6.addAll(arrayList3);
                                    jVar.f3420n.add(arrayList6);
                                    arrayList3.clear();
                                    C0142d dVar2 = new C0142d(jVar, arrayList6, 1);
                                    if (!isEmpty) {
                                        View view3 = ((C0146h) arrayList6.get(0)).f3391a.f3338a;
                                        WeakHashMap weakHashMap2 = Q.f509a;
                                        view3.postOnAnimationDelayed(dVar2, j3);
                                    } else {
                                        dVar2.run();
                                    }
                                }
                                if (!isEmpty4) {
                                    ArrayList arrayList7 = new ArrayList();
                                    arrayList7.addAll(arrayList4);
                                    jVar.f3418l.add(arrayList7);
                                    arrayList4.clear();
                                    C0142d dVar3 = new C0142d(jVar, arrayList7, 2);
                                    if (!isEmpty || !isEmpty2 || !isEmpty3) {
                                        long j4 = 0;
                                        if (isEmpty) {
                                            j3 = 0;
                                        }
                                        if (!isEmpty2) {
                                            j2 = jVar.e;
                                        } else {
                                            j2 = 0;
                                        }
                                        if (!isEmpty3) {
                                            j4 = jVar.f3270f;
                                        }
                                        long max = Math.max(j2, j4) + j3;
                                        View view4 = ((a0) arrayList7.get(0)).f3338a;
                                        WeakHashMap weakHashMap3 = Q.f509a;
                                        view4.postOnAnimationDelayed(dVar3, max);
                                    } else {
                                        dVar3.run();
                                    }
                                }
                            }
                        }
                    }
                }
                recyclerView.f2027p0 = false;
                return;
        }
    }
}
