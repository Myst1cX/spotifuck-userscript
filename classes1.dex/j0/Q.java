package j0;

import N.C0002b;
import android.util.SparseArray;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public final class Q {

    /* renamed from: a  reason: collision with root package name */
    public final ArrayList f3300a;

    /* renamed from: b  reason: collision with root package name */
    public ArrayList f3301b = null;

    /* renamed from: c  reason: collision with root package name */
    public final ArrayList f3302c = new ArrayList();

    /* renamed from: d  reason: collision with root package name */
    public final List f3303d;
    public int e;

    /* renamed from: f  reason: collision with root package name */
    public int f3304f;

    /* renamed from: g  reason: collision with root package name */
    public P f3305g;

    /* renamed from: h  reason: collision with root package name */
    public final /* synthetic */ RecyclerView f3306h;

    public final int b(int i) {
        RecyclerView recyclerView = this.f3306h;
        if (i < 0 || i >= recyclerView.f2016j0.b()) {
            throw new IndexOutOfBoundsException("invalid position " + i + ". State item count is " + recyclerView.f2016j0.b() + recyclerView.y());
        } else if (!recyclerView.f2016j0.f3320g) {
            return i;
        } else {
            return recyclerView.i.g(i, 0);
        }
    }

    /* JADX WARNING: type inference failed for: r0v2, types: [j0.P, java.lang.Object] */
    public final P c() {
        if (this.f3305g == null) {
            ? obj = new Object();
            obj.f3298a = new SparseArray();
            obj.f3299b = 0;
            this.f3305g = obj;
        }
        return this.f3305g;
    }

    public final void d() {
        ArrayList arrayList = this.f3302c;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            e(size);
        }
        arrayList.clear();
        if (RecyclerView.f1977C0) {
            C0152n nVar = this.f3306h.f2014i0;
            int[] iArr = nVar.f3466c;
            if (iArr != null) {
                Arrays.fill(iArr, -1);
            }
            nVar.f3467d = 0;
        }
    }

    public final void e(int i) {
        ArrayList arrayList = this.f3302c;
        a((a0) arrayList.get(i), true);
        arrayList.remove(i);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v46, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v15, resolved type: j0.a0} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r16v4, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v17, resolved type: j0.a0} */
    /* JADX WARNING: type inference failed for: r2v39, types: [N.q, java.lang.Object] */
    /* JADX WARNING: Code restructure failed: missing block: B:156:0x02d4, code lost:
        r11 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:233:0x041f, code lost:
        if (r11.g() == false) goto L_0x0422;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:219:0x03e5  */
    /* JADX WARNING: Removed duplicated region for block: B:224:0x0407  */
    /* JADX WARNING: Removed duplicated region for block: B:225:0x040a  */
    /* JADX WARNING: Removed duplicated region for block: B:287:0x0517  */
    /* JADX WARNING: Removed duplicated region for block: B:288:0x0521  */
    /* JADX WARNING: Removed duplicated region for block: B:294:0x0537 A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x0080  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x0082  */
    /* JADX WARNING: Removed duplicated region for block: B:75:0x0130  */
    /* JADX WARNING: Removed duplicated region for block: B:76:0x013f  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final j0.a0 i(int r26, long r27) {
        /*
            r25 = this;
            r1 = r25
            r0 = r26
            r2 = -1
            r3 = 1
            androidx.recyclerview.widget.RecyclerView r4 = r1.f3306h
            if (r0 < 0) goto L_0x053f
            j0.X r5 = r4.f2016j0
            int r5 = r5.b()
            if (r0 >= r5) goto L_0x053f
            j0.X r5 = r4.f2016j0
            boolean r6 = r5.f3320g
            r8 = 0
            r9 = 32
            if (r6 == 0) goto L_0x0084
            java.util.ArrayList r6 = r1.f3301b
            if (r6 == 0) goto L_0x007d
            int r6 = r6.size()
            if (r6 != 0) goto L_0x0026
            goto L_0x007d
        L_0x0026:
            r10 = 0
        L_0x0027:
            if (r10 >= r6) goto L_0x0043
            java.util.ArrayList r11 = r1.f3301b
            java.lang.Object r11 = r11.get(r10)
            j0.a0 r11 = (j0.a0) r11
            boolean r12 = r11.q()
            if (r12 != 0) goto L_0x0041
            int r12 = r11.b()
            if (r12 != r0) goto L_0x0041
            r11.a(r9)
            goto L_0x007e
        L_0x0041:
            int r10 = r10 + r3
            goto L_0x0027
        L_0x0043:
            j0.C r10 = r4.f2028q
            boolean r10 = r10.f3265b
            if (r10 == 0) goto L_0x007d
            j0.b r10 = r4.i
            int r10 = r10.g(r0, r8)
            if (r10 <= 0) goto L_0x007d
            j0.C r11 = r4.f2028q
            int r11 = r11.a()
            if (r10 >= r11) goto L_0x007d
            j0.C r11 = r4.f2028q
            long r10 = r11.b(r10)
            r12 = 0
        L_0x0060:
            if (r12 >= r6) goto L_0x007d
            java.util.ArrayList r13 = r1.f3301b
            java.lang.Object r13 = r13.get(r12)
            j0.a0 r13 = (j0.a0) r13
            boolean r14 = r13.q()
            if (r14 != 0) goto L_0x007b
            long r14 = r13.e
            int r16 = (r14 > r10 ? 1 : (r14 == r10 ? 0 : -1))
            if (r16 != 0) goto L_0x007b
            r13.a(r9)
            r11 = r13
            goto L_0x007e
        L_0x007b:
            int r12 = r12 + r3
            goto L_0x0060
        L_0x007d:
            r11 = 0
        L_0x007e:
            if (r11 == 0) goto L_0x0082
            r6 = 1
            goto L_0x0086
        L_0x0082:
            r6 = 0
            goto L_0x0086
        L_0x0084:
            r6 = 0
            r11 = 0
        L_0x0086:
            java.util.ArrayList r10 = r1.f3302c
            java.util.ArrayList r12 = r1.f3300a
            if (r11 != 0) goto L_0x022a
            int r11 = r12.size()
            r13 = 0
        L_0x0091:
            if (r13 >= r11) goto L_0x00bd
            java.lang.Object r14 = r12.get(r13)
            j0.a0 r14 = (j0.a0) r14
            boolean r15 = r14.q()
            if (r15 != 0) goto L_0x00bb
            int r15 = r14.b()
            if (r15 != r0) goto L_0x00bb
            boolean r15 = r14.g()
            if (r15 != 0) goto L_0x00bb
            boolean r15 = r5.f3320g
            if (r15 != 0) goto L_0x00b5
            boolean r15 = r14.i()
            if (r15 != 0) goto L_0x00bb
        L_0x00b5:
            r14.a(r9)
            r11 = r14
            goto L_0x01a9
        L_0x00bb:
            int r13 = r13 + r3
            goto L_0x0091
        L_0x00bd:
            android.support.v4.media.session.t r11 = r4.f2015j
            java.lang.Object r11 = r11.f1133d
            java.util.ArrayList r11 = (java.util.ArrayList) r11
            int r13 = r11.size()
            r14 = 0
        L_0x00c8:
            if (r14 >= r13) goto L_0x00e9
            java.lang.Object r15 = r11.get(r14)
            android.view.View r15 = (android.view.View) r15
            j0.a0 r16 = androidx.recyclerview.widget.RecyclerView.I(r15)
            int r7 = r16.b()
            if (r7 != r0) goto L_0x00e7
            boolean r7 = r16.g()
            if (r7 != 0) goto L_0x00e7
            boolean r7 = r16.i()
            if (r7 != 0) goto L_0x00e7
            goto L_0x00ea
        L_0x00e7:
            int r14 = r14 + r3
            goto L_0x00c8
        L_0x00e9:
            r15 = 0
        L_0x00ea:
            if (r15 == 0) goto L_0x0182
            j0.a0 r7 = androidx.recyclerview.widget.RecyclerView.I(r15)
            android.support.v4.media.session.t r11 = r4.f2015j
            java.lang.Object r13 = r11.f1131b
            j0.B r13 = (j0.B) r13
            androidx.recyclerview.widget.RecyclerView r13 = r13.f3263a
            int r13 = r13.indexOfChild(r15)
            if (r13 < 0) goto L_0x016e
            java.lang.Object r14 = r11.f1132c
            j0.c r14 = (j0.C0141c) r14
            boolean r16 = r14.d(r13)
            if (r16 == 0) goto L_0x015a
            r14.a(r13)
            r11.F(r15)
            android.support.v4.media.session.t r11 = r4.f2015j
            java.lang.Object r13 = r11.f1131b
            j0.B r13 = (j0.B) r13
            androidx.recyclerview.widget.RecyclerView r13 = r13.f3263a
            int r13 = r13.indexOfChild(r15)
            if (r13 != r2) goto L_0x011e
        L_0x011c:
            r13 = -1
            goto L_0x012e
        L_0x011e:
            java.lang.Object r11 = r11.f1132c
            j0.c r11 = (j0.C0141c) r11
            boolean r14 = r11.d(r13)
            if (r14 == 0) goto L_0x0129
            goto L_0x011c
        L_0x0129:
            int r11 = r11.b(r13)
            int r13 = r13 - r11
        L_0x012e:
            if (r13 == r2) goto L_0x013f
            android.support.v4.media.session.t r11 = r4.f2015j
            r11.i(r13)
            r1.h(r15)
            r11 = 8224(0x2020, float:1.1524E-41)
            r7.a(r11)
            r11 = r7
            goto L_0x01a9
        L_0x013f:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "layout index should not be -1 after unhiding a view:"
            r2.<init>(r3)
            r2.append(r7)
            java.lang.String r3 = r4.y()
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            r0.<init>(r2)
            throw r0
        L_0x015a:
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "trying to unhide a view that was not hidden"
            r2.<init>(r3)
            r2.append(r15)
            java.lang.String r2 = r2.toString()
            r0.<init>(r2)
            throw r0
        L_0x016e:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "view is not a child, cannot hide "
            r2.<init>(r3)
            r2.append(r15)
            java.lang.String r2 = r2.toString()
            r0.<init>(r2)
            throw r0
        L_0x0182:
            int r7 = r10.size()
            r11 = 0
        L_0x0187:
            if (r11 >= r7) goto L_0x01a8
            java.lang.Object r13 = r10.get(r11)
            j0.a0 r13 = (j0.a0) r13
            boolean r14 = r13.g()
            if (r14 != 0) goto L_0x01a6
            int r14 = r13.b()
            if (r14 != r0) goto L_0x01a6
            boolean r14 = r13.e()
            if (r14 != 0) goto L_0x01a6
            r10.remove(r11)
            r11 = r13
            goto L_0x01a9
        L_0x01a6:
            int r11 = r11 + r3
            goto L_0x0187
        L_0x01a8:
            r11 = 0
        L_0x01a9:
            if (r11 == 0) goto L_0x022a
            boolean r7 = r11.i()
            if (r7 == 0) goto L_0x01b4
            boolean r7 = r5.f3320g
            goto L_0x01e5
        L_0x01b4:
            int r7 = r11.f3340c
            if (r7 < 0) goto L_0x020f
            j0.C r13 = r4.f2028q
            int r13 = r13.a()
            if (r7 >= r13) goto L_0x020f
            boolean r7 = r5.f3320g
            if (r7 != 0) goto L_0x01d2
            j0.C r7 = r4.f2028q
            int r13 = r11.f3340c
            int r7 = r7.c(r13)
            int r13 = r11.f3342f
            if (r7 == r13) goto L_0x01d2
        L_0x01d0:
            r7 = 0
            goto L_0x01e5
        L_0x01d2:
            j0.C r7 = r4.f2028q
            boolean r13 = r7.f3265b
            if (r13 == 0) goto L_0x01e4
            long r13 = r11.e
            int r15 = r11.f3340c
            long r15 = r7.b(r15)
            int r7 = (r13 > r15 ? 1 : (r13 == r15 ? 0 : -1))
            if (r7 != 0) goto L_0x01d0
        L_0x01e4:
            r7 = 1
        L_0x01e5:
            if (r7 != 0) goto L_0x020d
            r7 = 4
            r11.a(r7)
            boolean r7 = r11.j()
            if (r7 == 0) goto L_0x01fc
            android.view.View r7 = r11.f3338a
            r4.removeDetachedView(r7, r8)
            j0.Q r7 = r11.f3349n
            r7.j(r11)
            goto L_0x0208
        L_0x01fc:
            boolean r7 = r11.q()
            if (r7 == 0) goto L_0x0208
            int r7 = r11.f3345j
            r7 = r7 & -33
            r11.f3345j = r7
        L_0x0208:
            r1.g(r11)
            r11 = 0
            goto L_0x022a
        L_0x020d:
            r6 = 1
            goto L_0x022a
        L_0x020f:
            java.lang.IndexOutOfBoundsException r0 = new java.lang.IndexOutOfBoundsException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "Inconsistency detected. Invalid view holder adapter position"
            r2.<init>(r3)
            r2.append(r11)
            java.lang.String r3 = r4.y()
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            r0.<init>(r2)
            throw r0
        L_0x022a:
            r18 = 0
            r20 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            if (r11 != 0) goto L_0x039c
            j0.b r7 = r4.i
            int r7 = r7.g(r0, r8)
            if (r7 < 0) goto L_0x039e
            j0.C r13 = r4.f2028q
            int r13 = r13.a()
            if (r7 >= r13) goto L_0x039e
            j0.C r13 = r4.f2028q
            int r13 = r13.c(r7)
            j0.C r14 = r4.f2028q
            boolean r15 = r14.f3265b
            if (r15 == 0) goto L_0x02dd
            long r14 = r14.b(r7)
            int r11 = r12.size()
            int r11 = r11 - r3
        L_0x0258:
            if (r11 < 0) goto L_0x02ae
            java.lang.Object r16 = r12.get(r11)
            r3 = r16
            j0.a0 r3 = (j0.a0) r3
            long r8 = r3.e
            int r24 = (r8 > r14 ? 1 : (r8 == r14 ? 0 : -1))
            if (r24 != 0) goto L_0x02a8
            boolean r8 = r3.q()
            if (r8 != 0) goto L_0x02a8
            int r8 = r3.f3342f
            if (r13 != r8) goto L_0x028b
            r8 = 32
            r3.a(r8)
            boolean r8 = r3.i()
            if (r8 == 0) goto L_0x0289
            boolean r8 = r5.f3320g
            if (r8 != 0) goto L_0x0289
            int r8 = r3.f3345j
            r8 = r8 & -15
            r8 = r8 | 2
            r3.f3345j = r8
        L_0x0289:
            r11 = r3
            goto L_0x02d8
        L_0x028b:
            r8 = 32
            r12.remove(r11)
            android.view.View r3 = r3.f3338a
            r9 = 0
            r4.removeDetachedView(r3, r9)
            j0.a0 r3 = androidx.recyclerview.widget.RecyclerView.I(r3)
            r8 = 0
            r3.f3349n = r8
            r3.f3350o = r9
            int r8 = r3.f3345j
            r8 = r8 & -33
            r3.f3345j = r8
            r1.g(r3)
        L_0x02a8:
            int r11 = r11 + r2
            r3 = 1
            r8 = 0
            r9 = 32
            goto L_0x0258
        L_0x02ae:
            int r3 = r10.size()
            r8 = 1
            int r3 = r3 - r8
        L_0x02b4:
            if (r3 < 0) goto L_0x02d4
            java.lang.Object r8 = r10.get(r3)
            j0.a0 r8 = (j0.a0) r8
            long r11 = r8.e
            int r9 = (r11 > r14 ? 1 : (r11 == r14 ? 0 : -1))
            if (r9 != 0) goto L_0x02d6
            boolean r9 = r8.e()
            if (r9 != 0) goto L_0x02d6
            int r9 = r8.f3342f
            if (r13 != r9) goto L_0x02d1
            r10.remove(r3)
            r11 = r8
            goto L_0x02d8
        L_0x02d1:
            r1.e(r3)
        L_0x02d4:
            r11 = 0
            goto L_0x02d8
        L_0x02d6:
            int r3 = r3 + r2
            goto L_0x02b4
        L_0x02d8:
            if (r11 == 0) goto L_0x02dd
            r11.f3340c = r7
            r6 = 1
        L_0x02dd:
            if (r11 != 0) goto L_0x031c
            j0.P r3 = r25.c()
            android.util.SparseArray r3 = r3.f3298a
            java.lang.Object r3 = r3.get(r13)
            j0.O r3 = (j0.O) r3
            if (r3 == 0) goto L_0x0313
            java.util.ArrayList r3 = r3.f3294a
            boolean r7 = r3.isEmpty()
            if (r7 != 0) goto L_0x0313
            int r7 = r3.size()
            r8 = 1
            int r7 = r7 - r8
        L_0x02fb:
            if (r7 < 0) goto L_0x0313
            java.lang.Object r8 = r3.get(r7)
            j0.a0 r8 = (j0.a0) r8
            boolean r8 = r8.e()
            if (r8 != 0) goto L_0x0311
            java.lang.Object r2 = r3.remove(r7)
            r8 = r2
            j0.a0 r8 = (j0.a0) r8
            goto L_0x0314
        L_0x0311:
            int r7 = r7 + r2
            goto L_0x02fb
        L_0x0313:
            r8 = 0
        L_0x0314:
            if (r8 == 0) goto L_0x031b
            r8.n()
            int[] r2 = androidx.recyclerview.widget.RecyclerView.f1980z0
        L_0x031b:
            r11 = r8
        L_0x031c:
            if (r11 != 0) goto L_0x039c
            long r2 = r4.getNanoTime()
            int r7 = (r27 > r20 ? 1 : (r27 == r20 ? 0 : -1))
            if (r7 == 0) goto L_0x033f
            j0.P r7 = r1.f3305g
            j0.O r7 = r7.a(r13)
            long r7 = r7.f3296c
            int r9 = (r7 > r18 ? 1 : (r7 == r18 ? 0 : -1))
            if (r9 == 0) goto L_0x033a
            long r7 = r7 + r2
            int r9 = (r7 > r27 ? 1 : (r7 == r27 ? 0 : -1))
            if (r9 >= 0) goto L_0x0338
            goto L_0x033a
        L_0x0338:
            r7 = 0
            goto L_0x033b
        L_0x033a:
            r7 = 1
        L_0x033b:
            if (r7 != 0) goto L_0x033f
            r8 = 0
            return r8
        L_0x033f:
            r8 = 0
            j0.C r7 = r4.f2028q
            r7.getClass()
            java.lang.String r9 = "RV CreateView"
            int r10 = J.k.f299a     // Catch:{ all -> 0x038c }
            android.os.Trace.beginSection(r9)     // Catch:{ all -> 0x038c }
            j0.a0 r11 = r7.e(r4, r13)     // Catch:{ all -> 0x038c }
            android.view.View r7 = r11.f3338a
            android.view.ViewParent r9 = r7.getParent()     // Catch:{ all -> 0x038c }
            if (r9 != 0) goto L_0x038e
            r11.f3342f = r13     // Catch:{ all -> 0x038c }
            android.os.Trace.endSection()
            boolean r9 = androidx.recyclerview.widget.RecyclerView.f1977C0
            if (r9 == 0) goto L_0x036e
            androidx.recyclerview.widget.RecyclerView r7 = androidx.recyclerview.widget.RecyclerView.D(r7)
            if (r7 == 0) goto L_0x036e
            java.lang.ref.WeakReference r9 = new java.lang.ref.WeakReference
            r9.<init>(r7)
            r11.f3339b = r9
        L_0x036e:
            long r9 = r4.getNanoTime()
            j0.P r7 = r1.f3305g
            long r9 = r9 - r2
            j0.O r2 = r7.a(r13)
            long r12 = r2.f3296c
            int r3 = (r12 > r18 ? 1 : (r12 == r18 ? 0 : -1))
            if (r3 != 0) goto L_0x0380
            goto L_0x0389
        L_0x0380:
            r14 = 4
            long r12 = r12 / r14
            r22 = 3
            long r12 = r12 * r22
            long r9 = r9 / r14
            long r9 = r9 + r12
        L_0x0389:
            r2.f3296c = r9
            goto L_0x03cd
        L_0x038c:
            r0 = move-exception
            goto L_0x0396
        L_0x038e:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException     // Catch:{ all -> 0x038c }
            java.lang.String r2 = "ViewHolder views must not be attached when created. Ensure that you are not passing 'true' to the attachToRoot parameter of LayoutInflater.inflate(..., boolean attachToRoot)"
            r0.<init>(r2)     // Catch:{ all -> 0x038c }
            throw r0     // Catch:{ all -> 0x038c }
        L_0x0396:
            int r2 = J.k.f299a
            android.os.Trace.endSection()
            throw r0
        L_0x039c:
            r8 = 0
            goto L_0x03cd
        L_0x039e:
            java.lang.IndexOutOfBoundsException r2 = new java.lang.IndexOutOfBoundsException
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r6 = "Inconsistency detected. Invalid item position "
            r3.<init>(r6)
            r3.append(r0)
            java.lang.String r0 = "(offset:"
            r3.append(r0)
            r3.append(r7)
            java.lang.String r0 = ").state:"
            r3.append(r0)
            int r0 = r5.b()
            r3.append(r0)
            java.lang.String r0 = r4.y()
            r3.append(r0)
            java.lang.String r0 = r3.toString()
            r2.<init>(r0)
            throw r2
        L_0x03cd:
            if (r6 == 0) goto L_0x03fb
            boolean r2 = r5.f3320g
            if (r2 != 0) goto L_0x03fb
            r2 = 8192(0x2000, float:1.14794E-41)
            boolean r2 = r11.d(r2)
            if (r2 == 0) goto L_0x03fb
            int r2 = r11.f3345j
            r2 = r2 & -8193(0xffffffffffffdfff, float:NaN)
            r11.f3345j = r2
            boolean r2 = r5.f3322j
            if (r2 == 0) goto L_0x03fb
            j0.G.b(r11)
            j0.G r2 = r4.f1994O
            r11.c()
            r2.getClass()
            N.q r2 = new N.q
            r2.<init>()
            r2.a(r11)
            r4.V(r11, r2)
        L_0x03fb:
            boolean r2 = r5.f3320g
            android.view.View r3 = r11.f3338a
            if (r2 == 0) goto L_0x040a
            boolean r2 = r11.f()
            if (r2 == 0) goto L_0x040a
            r11.f3343g = r0
            goto L_0x0422
        L_0x040a:
            boolean r2 = r11.f()
            if (r2 == 0) goto L_0x0428
            int r2 = r11.f3345j
            r2 = r2 & 2
            if (r2 == 0) goto L_0x0418
            r2 = 1
            goto L_0x0419
        L_0x0418:
            r2 = 0
        L_0x0419:
            if (r2 != 0) goto L_0x0428
            boolean r2 = r11.g()
            if (r2 == 0) goto L_0x0422
            goto L_0x0428
        L_0x0422:
            r2 = 1
            r9 = 0
            r16 = 0
            goto L_0x0511
        L_0x0428:
            j0.b r2 = r4.i
            r9 = 0
            int r2 = r2.g(r0, r9)
            r11.f3353r = r4
            int r7 = r11.f3342f
            long r12 = r4.getNanoTime()
            int r10 = (r27 > r20 ? 1 : (r27 == r20 ? 0 : -1))
            if (r10 == 0) goto L_0x0451
            j0.P r10 = r1.f3305g
            j0.O r7 = r10.a(r7)
            long r14 = r7.f3297d
            int r7 = (r14 > r18 ? 1 : (r14 == r18 ? 0 : -1))
            if (r7 == 0) goto L_0x0451
            long r14 = r14 + r12
            int r7 = (r14 > r27 ? 1 : (r14 == r27 ? 0 : -1))
            if (r7 >= 0) goto L_0x044d
            goto L_0x0451
        L_0x044d:
            r0 = 0
            r2 = 1
            goto L_0x050f
        L_0x0451:
            j0.C r7 = r4.f2028q
            r7.getClass()
            r11.f3340c = r2
            boolean r10 = r7.f3265b
            if (r10 == 0) goto L_0x0462
            long r14 = r7.b(r2)
            r11.e = r14
        L_0x0462:
            int r10 = r11.f3345j
            r10 = r10 & -520(0xfffffffffffffdf8, float:NaN)
            r14 = 1
            r10 = r10 | r14
            r11.f3345j = r10
            int r10 = J.k.f299a
            java.lang.String r10 = "RV OnBindView"
            android.os.Trace.beginSection(r10)
            r11.c()
            r7.d(r11, r2)
            java.util.ArrayList r2 = r11.f3346k
            if (r2 == 0) goto L_0x047e
            r2.clear()
        L_0x047e:
            int r2 = r11.f3345j
            r2 = r2 & -1025(0xfffffffffffffbff, float:NaN)
            r11.f3345j = r2
            android.view.ViewGroup$LayoutParams r2 = r3.getLayoutParams()
            boolean r7 = r2 instanceof j0.L
            if (r7 == 0) goto L_0x0491
            j0.L r2 = (j0.L) r2
            r7 = 1
            r2.f3292c = r7
        L_0x0491:
            android.os.Trace.endSection()
            long r14 = r4.getNanoTime()
            j0.P r2 = r1.f3305g
            int r7 = r11.f3342f
            long r14 = r14 - r12
            j0.O r2 = r2.a(r7)
            long r12 = r2.f3297d
            int r7 = (r12 > r18 ? 1 : (r12 == r18 ? 0 : -1))
            if (r7 != 0) goto L_0x04a8
            goto L_0x04b3
        L_0x04a8:
            r16 = 4
            long r12 = r12 / r16
            r18 = 3
            long r12 = r12 * r18
            long r14 = r14 / r16
            long r14 = r14 + r12
        L_0x04b3:
            r2.f3297d = r14
            android.view.accessibility.AccessibilityManager r2 = r4.f1985E
            if (r2 == 0) goto L_0x04c1
            boolean r2 = r2.isEnabled()
            if (r2 == 0) goto L_0x04c1
            r2 = 1
            goto L_0x04c2
        L_0x04c1:
            r2 = 0
        L_0x04c2:
            if (r2 == 0) goto L_0x0507
            java.util.WeakHashMap r2 = N.Q.f509a
            int r2 = r3.getImportantForAccessibility()
            if (r2 != 0) goto L_0x04d1
            r2 = 1
            r3.setImportantForAccessibility(r2)
            goto L_0x04d2
        L_0x04d1:
            r2 = 1
        L_0x04d2:
            j0.c0 r7 = r4.f2029q0
            if (r7 != 0) goto L_0x04d7
            goto L_0x0508
        L_0x04d7:
            N.b r7 = r7.j()
            boolean r10 = r7 instanceof j0.b0
            if (r10 == 0) goto L_0x0503
            r10 = r7
            j0.b0 r10 = (j0.b0) r10
            r10.getClass()
            android.view.View$AccessibilityDelegate r12 = N.Q.c(r3)
            if (r12 != 0) goto L_0x04ec
            goto L_0x04fa
        L_0x04ec:
            boolean r8 = r12 instanceof N.C0000a
            if (r8 == 0) goto L_0x04f5
            N.a r12 = (N.C0000a) r12
            N.b r8 = r12.f521a
            goto L_0x04fa
        L_0x04f5:
            N.b r8 = new N.b
            r8.<init>(r12)
        L_0x04fa:
            if (r8 == 0) goto L_0x0503
            if (r8 == r10) goto L_0x0503
            java.util.WeakHashMap r10 = r10.e
            r10.put(r3, r8)
        L_0x0503:
            N.Q.p(r3, r7)
            goto L_0x0508
        L_0x0507:
            r2 = 1
        L_0x0508:
            boolean r5 = r5.f3320g
            if (r5 == 0) goto L_0x050e
            r11.f3343g = r0
        L_0x050e:
            r0 = 1
        L_0x050f:
            r16 = r0
        L_0x0511:
            android.view.ViewGroup$LayoutParams r0 = r3.getLayoutParams()
            if (r0 != 0) goto L_0x0521
            android.view.ViewGroup$LayoutParams r0 = r4.generateDefaultLayoutParams()
            j0.L r0 = (j0.L) r0
            r3.setLayoutParams(r0)
            goto L_0x0533
        L_0x0521:
            boolean r5 = r4.checkLayoutParams(r0)
            if (r5 != 0) goto L_0x0531
            android.view.ViewGroup$LayoutParams r0 = r4.generateLayoutParams((android.view.ViewGroup.LayoutParams) r0)
            j0.L r0 = (j0.L) r0
            r3.setLayoutParams(r0)
            goto L_0x0533
        L_0x0531:
            j0.L r0 = (j0.L) r0
        L_0x0533:
            r0.f3290a = r11
            if (r6 == 0) goto L_0x053b
            if (r16 == 0) goto L_0x053b
            r3 = 1
            goto L_0x053c
        L_0x053b:
            r3 = 0
        L_0x053c:
            r0.f3293d = r3
            return r11
        L_0x053f:
            java.lang.IndexOutOfBoundsException r2 = new java.lang.IndexOutOfBoundsException
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r5 = "Invalid item position "
            r3.<init>(r5)
            r3.append(r0)
            java.lang.String r5 = "("
            r3.append(r5)
            r3.append(r0)
            java.lang.String r0 = "). Item count:"
            r3.append(r0)
            j0.X r0 = r4.f2016j0
            int r0 = r0.b()
            r3.append(r0)
            java.lang.String r0 = r4.y()
            r3.append(r0)
            java.lang.String r0 = r3.toString()
            r2.<init>(r0)
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: j0.Q.i(int, long):j0.a0");
    }

    public final void j(a0 a0Var) {
        if (a0Var.f3350o) {
            this.f3301b.remove(a0Var);
        } else {
            this.f3300a.remove(a0Var);
        }
        a0Var.f3349n = null;
        a0Var.f3350o = false;
        a0Var.f3345j &= -33;
    }

    public final void k() {
        int i;
        K k2 = this.f3306h.f2030r;
        if (k2 != null) {
            i = k2.f3284j;
        } else {
            i = 0;
        }
        this.f3304f = this.e + i;
        ArrayList arrayList = this.f3302c;
        for (int size = arrayList.size() - 1; size >= 0 && arrayList.size() > this.f3304f; size--) {
            e(size);
        }
    }

    public Q(RecyclerView recyclerView) {
        this.f3306h = recyclerView;
        ArrayList arrayList = new ArrayList();
        this.f3300a = arrayList;
        this.f3303d = Collections.unmodifiableList(arrayList);
        this.e = 2;
        this.f3304f = 2;
    }

    public final void a(a0 a0Var, boolean z2) {
        C0002b bVar;
        RecyclerView.j(a0Var);
        RecyclerView recyclerView = this.f3306h;
        c0 c0Var = recyclerView.f2029q0;
        if (c0Var != null) {
            C0002b j2 = c0Var.j();
            boolean z3 = j2 instanceof b0;
            View view = a0Var.f3338a;
            if (z3) {
                bVar = (C0002b) ((b0) j2).e.remove(view);
            } else {
                bVar = null;
            }
            N.Q.p(view, bVar);
        }
        if (z2 && recyclerView.f2016j0 != null) {
            recyclerView.f2017k.K(a0Var);
        }
        a0Var.f3353r = null;
        P c2 = c();
        c2.getClass();
        int i = a0Var.f3342f;
        ArrayList arrayList = c2.a(i).f3294a;
        if (((O) c2.f3298a.get(i)).f3295b > arrayList.size()) {
            a0Var.n();
            arrayList.add(a0Var);
        }
    }

    public final void f(View view) {
        a0 I = RecyclerView.I(view);
        boolean k2 = I.k();
        RecyclerView recyclerView = this.f3306h;
        if (k2) {
            recyclerView.removeDetachedView(view, false);
        }
        if (I.j()) {
            I.f3349n.j(I);
        } else if (I.q()) {
            I.f3345j &= -33;
        }
        g(I);
        if (recyclerView.f1994O != null && !I.h()) {
            recyclerView.f1994O.d(I);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:16:0x0039  */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x00b0 A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:72:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void g(j0.a0 r12) {
        /*
            r11 = this;
            boolean r0 = r12.j()
            r1 = 0
            r2 = 1
            androidx.recyclerview.widget.RecyclerView r3 = r11.f3306h
            android.view.View r4 = r12.f3338a
            if (r0 != 0) goto L_0x00eb
            android.view.ViewParent r0 = r4.getParent()
            if (r0 == 0) goto L_0x0014
            goto L_0x00eb
        L_0x0014:
            boolean r0 = r12.k()
            if (r0 != 0) goto L_0x00d0
            boolean r0 = r12.p()
            if (r0 != 0) goto L_0x00b8
            int r0 = r12.f3345j
            r0 = r0 & 16
            if (r0 != 0) goto L_0x0030
            java.util.WeakHashMap r0 = N.Q.f509a
            boolean r0 = r4.hasTransientState()
            if (r0 == 0) goto L_0x0030
            r0 = 1
            goto L_0x0031
        L_0x0030:
            r0 = 0
        L_0x0031:
            j0.C r4 = r3.f2028q
            boolean r4 = r12.h()
            if (r4 == 0) goto L_0x00a8
            int r4 = r11.f3304f
            if (r4 <= 0) goto L_0x009f
            r4 = 526(0x20e, float:7.37E-43)
            boolean r4 = r12.d(r4)
            if (r4 != 0) goto L_0x009f
            java.util.ArrayList r4 = r11.f3302c
            int r5 = r4.size()
            int r6 = r11.f3304f
            if (r5 < r6) goto L_0x0056
            if (r5 <= 0) goto L_0x0056
            r11.e(r1)
            int r5 = r5 + -1
        L_0x0056:
            boolean r6 = androidx.recyclerview.widget.RecyclerView.f1977C0
            if (r6 == 0) goto L_0x009a
            if (r5 <= 0) goto L_0x009a
            j0.n r6 = r3.f2014i0
            int r7 = r12.f3340c
            int[] r8 = r6.f3466c
            if (r8 == 0) goto L_0x0075
            int r8 = r6.f3467d
            int r8 = r8 * 2
            r9 = 0
        L_0x0069:
            if (r9 >= r8) goto L_0x0075
            int[] r10 = r6.f3466c
            r10 = r10[r9]
            if (r10 != r7) goto L_0x0072
            goto L_0x009a
        L_0x0072:
            int r9 = r9 + 2
            goto L_0x0069
        L_0x0075:
            int r5 = r5 - r2
        L_0x0076:
            if (r5 < 0) goto L_0x0099
            java.lang.Object r6 = r4.get(r5)
            j0.a0 r6 = (j0.a0) r6
            int r6 = r6.f3340c
            j0.n r7 = r3.f2014i0
            int[] r8 = r7.f3466c
            if (r8 == 0) goto L_0x0099
            int r8 = r7.f3467d
            int r8 = r8 * 2
            r9 = 0
        L_0x008b:
            if (r9 >= r8) goto L_0x0099
            int[] r10 = r7.f3466c
            r10 = r10[r9]
            if (r10 != r6) goto L_0x0096
            int r5 = r5 + -1
            goto L_0x0076
        L_0x0096:
            int r9 = r9 + 2
            goto L_0x008b
        L_0x0099:
            int r5 = r5 + r2
        L_0x009a:
            r4.add(r5, r12)
            r4 = 1
            goto L_0x00a0
        L_0x009f:
            r4 = 0
        L_0x00a0:
            if (r4 != 0) goto L_0x00a7
            r11.a(r12, r2)
            r1 = r4
            goto L_0x00a9
        L_0x00a7:
            r1 = r4
        L_0x00a8:
            r2 = 0
        L_0x00a9:
            E.j r3 = r3.f2017k
            r3.K(r12)
            if (r1 != 0) goto L_0x00b7
            if (r2 != 0) goto L_0x00b7
            if (r0 == 0) goto L_0x00b7
            r0 = 0
            r12.f3353r = r0
        L_0x00b7:
            return
        L_0x00b8:
            java.lang.IllegalArgumentException r12 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "Trying to recycle an ignored view holder. You should first call stopIgnoringView(view) before calling recycle."
            r0.<init>(r1)
            java.lang.String r1 = r3.y()
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            r12.<init>(r0)
            throw r12
        L_0x00d0:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "Tmp detached view should be removed from RecyclerView before it can be recycled: "
            r1.<init>(r2)
            r1.append(r12)
            java.lang.String r12 = r3.y()
            r1.append(r12)
            java.lang.String r12 = r1.toString()
            r0.<init>(r12)
            throw r0
        L_0x00eb:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            java.lang.String r6 = "Scrapped or attached views may not be recycled. isScrap:"
            r5.<init>(r6)
            boolean r12 = r12.j()
            r5.append(r12)
            java.lang.String r12 = " isAttached:"
            r5.append(r12)
            android.view.ViewParent r12 = r4.getParent()
            if (r12 == 0) goto L_0x0107
            r1 = 1
        L_0x0107:
            r5.append(r1)
            java.lang.String r12 = r3.y()
            r5.append(r12)
            java.lang.String r12 = r5.toString()
            r0.<init>(r12)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: j0.Q.g(j0.a0):void");
    }

    public final void h(View view) {
        G g2;
        a0 I = RecyclerView.I(view);
        boolean d2 = I.d(12);
        RecyclerView recyclerView = this.f3306h;
        if (!d2 && I.l() && (g2 = recyclerView.f1994O) != null) {
            C0148j jVar = (C0148j) g2;
            if (I.c().isEmpty() && jVar.f3414g && !I.g()) {
                if (this.f3301b == null) {
                    this.f3301b = new ArrayList();
                }
                I.f3349n = this;
                I.f3350o = true;
                this.f3301b.add(I);
                return;
            }
        }
        if (!I.g() || I.i() || recyclerView.f2028q.f3265b) {
            I.f3349n = this;
            I.f3350o = false;
            this.f3300a.add(I);
            return;
        }
        throw new IllegalArgumentException("Called scrap view with an invalid view. Invalid views cannot be reused from scrap, they should rebound from recycler pool." + recyclerView.y());
    }
}
