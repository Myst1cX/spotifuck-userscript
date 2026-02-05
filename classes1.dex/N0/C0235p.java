package n0;

import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: n0.p  reason: case insensitive filesystem */
public final class C0235p implements ViewTreeObserver.OnPreDrawListener, View.OnAttachStateChangeListener {

    /* renamed from: f  reason: collision with root package name */
    public C0232m f4020f;

    /* renamed from: g  reason: collision with root package name */
    public FrameLayout f4021g;

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v10, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v6, resolved type: n0.u} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:104:0x0236  */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x004f  */
    /* JADX WARNING: Removed duplicated region for block: B:132:0x01e6 A[EDGE_INSN: B:132:0x01e6->B:88:0x01e6 ?: BREAK  , SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x008d  */
    /* JADX WARNING: Removed duplicated region for block: B:91:0x01eb  */
    /* JADX WARNING: Removed duplicated region for block: B:98:0x020c  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean onPreDraw() {
        /*
            r18 = this;
            r0 = r18
            android.widget.FrameLayout r1 = r0.f4021g
            android.view.ViewTreeObserver r2 = r1.getViewTreeObserver()
            r2.removeOnPreDrawListener(r0)
            r1.removeOnAttachStateChangeListener(r0)
            java.util.ArrayList r1 = n0.C0236q.f4024c
            android.widget.FrameLayout r3 = r0.f4021g
            boolean r1 = r1.remove(r3)
            r8 = 1
            if (r1 != 0) goto L_0x001a
            return r8
        L_0x001a:
            r.b r1 = n0.C0236q.b()
            r2 = 0
            java.lang.Object r4 = r1.getOrDefault(r3, r2)
            java.util.ArrayList r4 = (java.util.ArrayList) r4
            if (r4 != 0) goto L_0x0031
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            r1.put(r3, r4)
        L_0x002f:
            r5 = r2
            goto L_0x003c
        L_0x0031:
            int r5 = r4.size()
            if (r5 <= 0) goto L_0x002f
            java.util.ArrayList r5 = new java.util.ArrayList
            r5.<init>(r4)
        L_0x003c:
            n0.m r9 = r0.f4020f
            r4.add(r9)
            n0.o r4 = new n0.o
            r4.<init>(r0, r1)
            r9.a(r4)
            r1 = 0
            r9.h(r3, r1)
            if (r5 == 0) goto L_0x0063
            java.util.Iterator r4 = r5.iterator()
        L_0x0053:
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto L_0x0063
            java.lang.Object r5 = r4.next()
            n0.m r5 = (n0.C0232m) r5
            r5.y(r3)
            goto L_0x0053
        L_0x0063:
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            r9.f4006k = r4
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            r9.f4007l = r4
            A.k r4 = r9.f4003g
            A.k r5 = r9.f4004h
            r.b r6 = new r.b
            java.lang.Object r7 = r4.f21f
            r.b r7 = (r.b) r7
            r6.<init>(r7)
            r.b r7 = new r.b
            java.lang.Object r10 = r5.f21f
            r.b r10 = (r.b) r10
            r7.<init>(r10)
            r10 = 0
        L_0x0088:
            int[] r11 = r9.f4005j
            int r12 = r11.length
            if (r10 >= r12) goto L_0x01e6
            r11 = r11[r10]
            if (r11 == r8) goto L_0x01a6
            r12 = 2
            if (r11 == r12) goto L_0x0155
            r12 = 3
            if (r11 == r12) goto L_0x00fe
            r12 = 4
            if (r11 == r12) goto L_0x009c
            goto L_0x01dd
        L_0x009c:
            java.lang.Object r11 = r4.f23h
            r.e r11 = (r.e) r11
            int r12 = r11.g()
            r13 = 0
        L_0x00a5:
            if (r13 >= r12) goto L_0x01dd
            java.lang.Object r14 = r11.h(r13)
            android.view.View r14 = (android.view.View) r14
            if (r14 == 0) goto L_0x00f8
            boolean r15 = r9.t(r14)
            if (r15 == 0) goto L_0x00f8
            boolean r15 = r11.f4526a
            if (r15 == 0) goto L_0x00bc
            r11.d()
        L_0x00bc:
            long[] r15 = r11.f4527b
            r16 = r9
            r8 = r15[r13]
            java.lang.Object r15 = r5.f23h
            r.e r15 = (r.e) r15
            java.lang.Object r8 = r15.e(r8, r2)
            android.view.View r8 = (android.view.View) r8
            r9 = r16
            if (r8 == 0) goto L_0x00f8
            boolean r15 = r9.t(r8)
            if (r15 == 0) goto L_0x00f8
            java.lang.Object r15 = r6.getOrDefault(r14, r2)
            n0.u r15 = (n0.C0240u) r15
            java.lang.Object r16 = r7.getOrDefault(r8, r2)
            r1 = r16
            n0.u r1 = (n0.C0240u) r1
            if (r15 == 0) goto L_0x00f8
            if (r1 == 0) goto L_0x00f8
            java.util.ArrayList r2 = r9.f4006k
            r2.add(r15)
            java.util.ArrayList r2 = r9.f4007l
            r2.add(r1)
            r6.remove(r14)
            r7.remove(r8)
        L_0x00f8:
            int r13 = r13 + 1
            r1 = 0
            r2 = 0
            r8 = 1
            goto L_0x00a5
        L_0x00fe:
            java.lang.Object r1 = r4.f22g
            android.util.SparseArray r1 = (android.util.SparseArray) r1
            java.lang.Object r2 = r5.f22g
            android.util.SparseArray r2 = (android.util.SparseArray) r2
            int r8 = r1.size()
            r11 = 0
        L_0x010b:
            if (r11 >= r8) goto L_0x01dd
            java.lang.Object r12 = r1.valueAt(r11)
            android.view.View r12 = (android.view.View) r12
            if (r12 == 0) goto L_0x0150
            boolean r13 = r9.t(r12)
            if (r13 == 0) goto L_0x0150
            int r13 = r1.keyAt(r11)
            java.lang.Object r13 = r2.get(r13)
            android.view.View r13 = (android.view.View) r13
            if (r13 == 0) goto L_0x0150
            boolean r14 = r9.t(r13)
            if (r14 == 0) goto L_0x0150
            r14 = 0
            java.lang.Object r15 = r6.getOrDefault(r12, r14)
            n0.u r15 = (n0.C0240u) r15
            java.lang.Object r17 = r7.getOrDefault(r13, r14)
            r14 = r17
            n0.u r14 = (n0.C0240u) r14
            if (r15 == 0) goto L_0x0150
            if (r14 == 0) goto L_0x0150
            java.util.ArrayList r0 = r9.f4006k
            r0.add(r15)
            java.util.ArrayList r0 = r9.f4007l
            r0.add(r14)
            r6.remove(r12)
            r7.remove(r13)
        L_0x0150:
            int r11 = r11 + 1
            r0 = r18
            goto L_0x010b
        L_0x0155:
            java.lang.Object r0 = r4.i
            r.b r0 = (r.b) r0
            int r1 = r0.f4550c
            r2 = 0
        L_0x015c:
            if (r2 >= r1) goto L_0x01dd
            java.lang.Object r8 = r0.j(r2)
            android.view.View r8 = (android.view.View) r8
            if (r8 == 0) goto L_0x01a3
            boolean r11 = r9.t(r8)
            if (r11 == 0) goto L_0x01a3
            java.lang.Object r11 = r0.h(r2)
            java.lang.Object r12 = r5.i
            r.b r12 = (r.b) r12
            r13 = 0
            java.lang.Object r11 = r12.getOrDefault(r11, r13)
            android.view.View r11 = (android.view.View) r11
            if (r11 == 0) goto L_0x01a3
            boolean r12 = r9.t(r11)
            if (r12 == 0) goto L_0x01a3
            java.lang.Object r12 = r6.getOrDefault(r8, r13)
            n0.u r12 = (n0.C0240u) r12
            java.lang.Object r14 = r7.getOrDefault(r11, r13)
            n0.u r14 = (n0.C0240u) r14
            if (r12 == 0) goto L_0x01a3
            if (r14 == 0) goto L_0x01a3
            java.util.ArrayList r13 = r9.f4006k
            r13.add(r12)
            java.util.ArrayList r12 = r9.f4007l
            r12.add(r14)
            r6.remove(r8)
            r7.remove(r11)
        L_0x01a3:
            int r2 = r2 + 1
            goto L_0x015c
        L_0x01a6:
            int r0 = r6.f4550c
            r1 = 1
            int r0 = r0 - r1
        L_0x01aa:
            if (r0 < 0) goto L_0x01dd
            java.lang.Object r1 = r6.h(r0)
            android.view.View r1 = (android.view.View) r1
            if (r1 == 0) goto L_0x01da
            boolean r2 = r9.t(r1)
            if (r2 == 0) goto L_0x01da
            java.lang.Object r1 = r7.remove(r1)
            n0.u r1 = (n0.C0240u) r1
            if (r1 == 0) goto L_0x01da
            android.view.View r2 = r1.f4029b
            boolean r2 = r9.t(r2)
            if (r2 == 0) goto L_0x01da
            java.lang.Object r2 = r6.i(r0)
            n0.u r2 = (n0.C0240u) r2
            java.util.ArrayList r8 = r9.f4006k
            r8.add(r2)
            java.util.ArrayList r2 = r9.f4007l
            r2.add(r1)
        L_0x01da:
            int r0 = r0 + -1
            goto L_0x01aa
        L_0x01dd:
            int r10 = r10 + 1
            r0 = r18
            r1 = 0
            r2 = 0
            r8 = 1
            goto L_0x0088
        L_0x01e6:
            r0 = 0
        L_0x01e7:
            int r1 = r6.f4550c
            if (r0 >= r1) goto L_0x0207
            java.lang.Object r1 = r6.j(r0)
            n0.u r1 = (n0.C0240u) r1
            android.view.View r2 = r1.f4029b
            boolean r2 = r9.t(r2)
            if (r2 == 0) goto L_0x0204
            java.util.ArrayList r2 = r9.f4006k
            r2.add(r1)
            java.util.ArrayList r1 = r9.f4007l
            r2 = 0
            r1.add(r2)
        L_0x0204:
            int r0 = r0 + 1
            goto L_0x01e7
        L_0x0207:
            r1 = 0
        L_0x0208:
            int r0 = r7.f4550c
            if (r1 >= r0) goto L_0x0228
            java.lang.Object r0 = r7.j(r1)
            n0.u r0 = (n0.C0240u) r0
            android.view.View r2 = r0.f4029b
            boolean r2 = r9.t(r2)
            if (r2 == 0) goto L_0x0225
            java.util.ArrayList r2 = r9.f4007l
            r2.add(r0)
            java.util.ArrayList r0 = r9.f4006k
            r2 = 0
            r0.add(r2)
        L_0x0225:
            int r1 = r1 + 1
            goto L_0x0208
        L_0x0228:
            r.b r0 = n0.C0232m.p()
            int r1 = r0.f4550c
            android.view.WindowId r2 = r3.getWindowId()
            r4 = 1
            int r1 = r1 - r4
        L_0x0234:
            if (r1 < 0) goto L_0x029e
            java.lang.Object r4 = r0.h(r1)
            android.animation.Animator r4 = (android.animation.Animator) r4
            if (r4 == 0) goto L_0x029a
            r5 = 0
            java.lang.Object r6 = r0.getOrDefault(r4, r5)
            n0.j r6 = (n0.C0229j) r6
            if (r6 == 0) goto L_0x029a
            android.view.View r5 = r6.f3985a
            if (r5 == 0) goto L_0x029a
            android.view.WindowId r7 = r6.f3988d
            boolean r7 = r2.equals(r7)
            if (r7 == 0) goto L_0x029a
            r7 = 1
            n0.u r8 = r9.r(r5, r7)
            n0.u r10 = r9.n(r5, r7)
            if (r8 != 0) goto L_0x026f
            if (r10 != 0) goto L_0x026f
            A.k r7 = r9.f4004h
            java.lang.Object r7 = r7.f21f
            r.b r7 = (r.b) r7
            r11 = 0
            java.lang.Object r5 = r7.getOrDefault(r5, r11)
            r10 = r5
            n0.u r10 = (n0.C0240u) r10
            goto L_0x0270
        L_0x026f:
            r11 = 0
        L_0x0270:
            if (r8 != 0) goto L_0x0274
            if (r10 == 0) goto L_0x029b
        L_0x0274:
            n0.u r5 = r6.f3987c
            n0.m r6 = r6.e
            boolean r5 = r6.s(r5, r10)
            if (r5 == 0) goto L_0x029b
            n0.m r5 = r6.o()
            r5.getClass()
            boolean r5 = r4.isRunning()
            if (r5 != 0) goto L_0x0296
            boolean r5 = r4.isStarted()
            if (r5 == 0) goto L_0x0292
            goto L_0x0296
        L_0x0292:
            r0.remove(r4)
            goto L_0x029b
        L_0x0296:
            r4.cancel()
            goto L_0x029b
        L_0x029a:
            r11 = 0
        L_0x029b:
            int r1 = r1 + -1
            goto L_0x0234
        L_0x029e:
            A.k r4 = r9.f4003g
            A.k r5 = r9.f4004h
            java.util.ArrayList r6 = r9.f4006k
            java.util.ArrayList r7 = r9.f4007l
            r2 = r9
            r2.l(r3, r4, r5, r6, r7)
            r9.z()
            r0 = 1
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: n0.C0235p.onPreDraw():boolean");
    }

    public final void onViewAttachedToWindow(View view) {
    }

    public final void onViewDetachedFromWindow(View view) {
        FrameLayout frameLayout = this.f4021g;
        frameLayout.getViewTreeObserver().removeOnPreDrawListener(this);
        frameLayout.removeOnAttachStateChangeListener(this);
        ArrayList arrayList = C0236q.f4024c;
        FrameLayout frameLayout2 = this.f4021g;
        arrayList.remove(frameLayout2);
        ArrayList arrayList2 = (ArrayList) C0236q.b().getOrDefault(frameLayout2, (Object) null);
        if (arrayList2 != null && arrayList2.size() > 0) {
            Iterator it2 = arrayList2.iterator();
            while (it2.hasNext()) {
                ((C0232m) it2.next()).y(frameLayout2);
            }
        }
        this.f4020f.i(true);
    }
}
