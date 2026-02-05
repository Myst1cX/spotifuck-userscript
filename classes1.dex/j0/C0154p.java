package j0;

import A.j;
import J.k;
import android.os.Trace;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

/* renamed from: j0.p  reason: case insensitive filesystem */
public final class C0154p implements Runnable {
    public static final ThreadLocal e = new ThreadLocal();

    /* renamed from: f  reason: collision with root package name */
    public static final j f3472f = new j(3);

    /* renamed from: a  reason: collision with root package name */
    public ArrayList f3473a;

    /* renamed from: b  reason: collision with root package name */
    public long f3474b;

    /* renamed from: c  reason: collision with root package name */
    public long f3475c;

    /* renamed from: d  reason: collision with root package name */
    public ArrayList f3476d;

    public static a0 c(RecyclerView recyclerView, int i, long j2) {
        int u2 = recyclerView.f2015j.u();
        for (int i2 = 0; i2 < u2; i2++) {
            a0 I = RecyclerView.I(recyclerView.f2015j.t(i2));
            if (I.f3340c == i && !I.g()) {
                return null;
            }
        }
        Q q2 = recyclerView.f2010g;
        try {
            recyclerView.P();
            a0 i3 = q2.i(i, j2);
            if (i3 != null) {
                if (!i3.f() || i3.g()) {
                    q2.a(i3, false);
                } else {
                    q2.f(i3.f3338a);
                }
            }
            return i3;
        } finally {
            recyclerView.Q(false);
        }
    }

    public final void a(RecyclerView recyclerView, int i, int i2) {
        if (recyclerView.f2038v && this.f3474b == 0) {
            this.f3474b = recyclerView.getNanoTime();
            recyclerView.post(this);
        }
        C0152n nVar = recyclerView.f2014i0;
        nVar.f3464a = i;
        nVar.f3465b = i2;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v3, resolved type: j0.o} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v6, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v7, resolved type: j0.o} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v8, resolved type: j0.o} */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x008e, code lost:
        r3 = (j0.C0153o) r5.get(r2);
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void b(long r17) {
        /*
            r16 = this;
            r1 = r16
            r0 = 1
            java.util.ArrayList r2 = r1.f3473a
            int r3 = r2.size()
            r4 = 0
            r5 = 0
            r6 = 0
        L_0x000c:
            if (r5 >= r3) goto L_0x0024
            java.lang.Object r7 = r2.get(r5)
            androidx.recyclerview.widget.RecyclerView r7 = (androidx.recyclerview.widget.RecyclerView) r7
            int r8 = r7.getWindowVisibility()
            if (r8 != 0) goto L_0x0022
            j0.n r8 = r7.f2014i0
            r8.b(r7, r4)
            int r7 = r8.f3467d
            int r6 = r6 + r7
        L_0x0022:
            int r5 = r5 + r0
            goto L_0x000c
        L_0x0024:
            java.util.ArrayList r5 = r1.f3476d
            r5.ensureCapacity(r6)
            r6 = 0
            r7 = 0
        L_0x002b:
            if (r6 >= r3) goto L_0x0082
            java.lang.Object r8 = r2.get(r6)
            androidx.recyclerview.widget.RecyclerView r8 = (androidx.recyclerview.widget.RecyclerView) r8
            int r9 = r8.getWindowVisibility()
            if (r9 == 0) goto L_0x003a
            goto L_0x0080
        L_0x003a:
            j0.n r9 = r8.f2014i0
            int r10 = r9.f3464a
            int r10 = java.lang.Math.abs(r10)
            int r11 = r9.f3465b
            int r11 = java.lang.Math.abs(r11)
            int r11 = r11 + r10
            r10 = 0
        L_0x004a:
            int r12 = r9.f3467d
            int r12 = r12 * 2
            if (r10 >= r12) goto L_0x0080
            int r12 = r5.size()
            if (r7 < r12) goto L_0x005f
            j0.o r12 = new j0.o
            r12.<init>()
            r5.add(r12)
            goto L_0x0065
        L_0x005f:
            java.lang.Object r12 = r5.get(r7)
            j0.o r12 = (j0.C0153o) r12
        L_0x0065:
            int[] r13 = r9.f3466c
            int r14 = r10 + 1
            r14 = r13[r14]
            if (r14 > r11) goto L_0x006f
            r15 = 1
            goto L_0x0070
        L_0x006f:
            r15 = 0
        L_0x0070:
            r12.f3468a = r15
            r12.f3469b = r11
            r12.f3470c = r14
            r12.f3471d = r8
            r13 = r13[r10]
            r12.e = r13
            int r7 = r7 + r0
            int r10 = r10 + 2
            goto L_0x004a
        L_0x0080:
            int r6 = r6 + r0
            goto L_0x002b
        L_0x0082:
            A.j r2 = f3472f
            java.util.Collections.sort(r5, r2)
            r2 = 0
        L_0x0088:
            int r3 = r5.size()
            if (r2 >= r3) goto L_0x0145
            java.lang.Object r3 = r5.get(r2)
            j0.o r3 = (j0.C0153o) r3
            androidx.recyclerview.widget.RecyclerView r6 = r3.f3471d
            if (r6 != 0) goto L_0x009a
            goto L_0x0145
        L_0x009a:
            boolean r7 = r3.f3468a
            if (r7 == 0) goto L_0x00a4
            r7 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            goto L_0x00a6
        L_0x00a4:
            r7 = r17
        L_0x00a6:
            int r9 = r3.e
            j0.a0 r6 = c(r6, r9, r7)
            if (r6 == 0) goto L_0x0135
            java.lang.ref.WeakReference r7 = r6.f3339b
            if (r7 == 0) goto L_0x0135
            boolean r7 = r6.f()
            if (r7 == 0) goto L_0x0135
            boolean r7 = r6.g()
            if (r7 != 0) goto L_0x0135
            java.lang.ref.WeakReference r6 = r6.f3339b
            java.lang.Object r6 = r6.get()
            androidx.recyclerview.widget.RecyclerView r6 = (androidx.recyclerview.widget.RecyclerView) r6
            if (r6 != 0) goto L_0x00c9
            goto L_0x0135
        L_0x00c9:
            boolean r7 = r6.f1986F
            if (r7 == 0) goto L_0x00f2
            android.support.v4.media.session.t r7 = r6.f2015j
            int r7 = r7.u()
            if (r7 == 0) goto L_0x00f2
            j0.G r7 = r6.f1994O
            if (r7 == 0) goto L_0x00dc
            r7.e()
        L_0x00dc:
            j0.K r7 = r6.f2030r
            j0.Q r8 = r6.f2010g
            if (r7 == 0) goto L_0x00ea
            r7.g0(r8)
            j0.K r7 = r6.f2030r
            r7.h0(r8)
        L_0x00ea:
            java.util.ArrayList r7 = r8.f3300a
            r7.clear()
            r8.d()
        L_0x00f2:
            j0.n r7 = r6.f2014i0
            r7.b(r6, r0)
            int r8 = r7.f3467d
            if (r8 == 0) goto L_0x0135
            java.lang.String r8 = "RV Nested Prefetch"
            int r9 = J.k.f299a     // Catch:{ all -> 0x0127 }
            android.os.Trace.beginSection(r8)     // Catch:{ all -> 0x0127 }
            j0.X r8 = r6.f2016j0     // Catch:{ all -> 0x0127 }
            j0.C r9 = r6.f2028q     // Catch:{ all -> 0x0127 }
            r8.f3318d = r0     // Catch:{ all -> 0x0127 }
            int r9 = r9.a()     // Catch:{ all -> 0x0127 }
            r8.e = r9     // Catch:{ all -> 0x0127 }
            r8.f3320g = r4     // Catch:{ all -> 0x0127 }
            r8.f3321h = r4     // Catch:{ all -> 0x0127 }
            r8.i = r4     // Catch:{ all -> 0x0127 }
            r8 = 0
        L_0x0115:
            int r9 = r7.f3467d     // Catch:{ all -> 0x0127 }
            int r9 = r9 * 2
            if (r8 >= r9) goto L_0x0129
            int[] r9 = r7.f3466c     // Catch:{ all -> 0x0127 }
            r9 = r9[r8]     // Catch:{ all -> 0x0127 }
            r10 = r17
            c(r6, r9, r10)     // Catch:{ all -> 0x0127 }
            int r8 = r8 + 2
            goto L_0x0115
        L_0x0127:
            r0 = move-exception
            goto L_0x012f
        L_0x0129:
            r10 = r17
            android.os.Trace.endSection()
            goto L_0x0137
        L_0x012f:
            int r2 = J.k.f299a
            android.os.Trace.endSection()
            throw r0
        L_0x0135:
            r10 = r17
        L_0x0137:
            r3.f3468a = r4
            r3.f3469b = r4
            r3.f3470c = r4
            r6 = 0
            r3.f3471d = r6
            r3.e = r4
            int r2 = r2 + r0
            goto L_0x0088
        L_0x0145:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: j0.C0154p.b(long):void");
    }

    public final void run() {
        try {
            int i = k.f299a;
            Trace.beginSection("RV Prefetch");
            ArrayList arrayList = this.f3473a;
            if (arrayList.isEmpty()) {
                this.f3474b = 0;
                Trace.endSection();
                return;
            }
            int size = arrayList.size();
            long j2 = 0;
            for (int i2 = 0; i2 < size; i2++) {
                RecyclerView recyclerView = (RecyclerView) arrayList.get(i2);
                if (recyclerView.getWindowVisibility() == 0) {
                    j2 = Math.max(recyclerView.getDrawingTime(), j2);
                }
            }
            if (j2 == 0) {
                this.f3474b = 0;
                Trace.endSection();
                return;
            }
            b(TimeUnit.MILLISECONDS.toNanos(j2) + this.f3475c);
            this.f3474b = 0;
            Trace.endSection();
        } catch (Throwable th) {
            this.f3474b = 0;
            int i3 = k.f299a;
            Trace.endSection();
            throw th;
        }
    }
}
