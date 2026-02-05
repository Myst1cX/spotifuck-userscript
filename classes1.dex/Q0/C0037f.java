package Q0;

import A.b;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Rect;
import android.net.Uri;
import java.io.EOFException;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Future;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.logging.Logger;
import r1.d;
import r1.e;
import r1.o;
import r1.q;
import r1.v;
import t.C0339e;

/* renamed from: Q0.f  reason: case insensitive filesystem */
public final class C0037f implements Runnable {

    /* renamed from: s  reason: collision with root package name */
    public static final Object f790s = new Object();

    /* renamed from: t  reason: collision with root package name */
    public static final C0034c f791t = new C0034c(0);

    /* renamed from: u  reason: collision with root package name */
    public static final AtomicInteger f792u = new AtomicInteger();

    /* renamed from: v  reason: collision with root package name */
    public static final C0035d f793v = new Object();

    /* renamed from: a  reason: collision with root package name */
    public final int f794a = f792u.incrementAndGet();

    /* renamed from: b  reason: collision with root package name */
    public final w f795b;

    /* renamed from: c  reason: collision with root package name */
    public final m f796c;

    /* renamed from: d  reason: collision with root package name */
    public final b f797d;
    public final C e;

    /* renamed from: f  reason: collision with root package name */
    public final String f798f;

    /* renamed from: g  reason: collision with root package name */
    public final z f799g;

    /* renamed from: h  reason: collision with root package name */
    public int f800h;
    public final B i;

    /* renamed from: j  reason: collision with root package name */
    public n f801j;

    /* renamed from: k  reason: collision with root package name */
    public ArrayList f802k;

    /* renamed from: l  reason: collision with root package name */
    public Bitmap f803l;

    /* renamed from: m  reason: collision with root package name */
    public Future f804m;

    /* renamed from: n  reason: collision with root package name */
    public int f805n;

    /* renamed from: o  reason: collision with root package name */
    public Exception f806o;

    /* renamed from: p  reason: collision with root package name */
    public int f807p;

    /* renamed from: q  reason: collision with root package name */
    public int f808q;

    /* renamed from: r  reason: collision with root package name */
    public int f809r;

    public static Bitmap b(v vVar, z zVar) {
        boolean z2;
        Logger logger = o.f4594a;
        q qVar = new q(vVar);
        if (!qVar.h(0, H.f783a) || !qVar.h(8, H.f784b)) {
            z2 = false;
        } else {
            z2 = true;
        }
        zVar.getClass();
        if (!z2) {
            Bitmap decodeStream = BitmapFactory.decodeStream(new d(qVar, 1), (Rect) null, (BitmapFactory.Options) null);
            if (decodeStream != null) {
                return decodeStream;
            }
            throw new IOException("Failed to decode stream.");
        }
        e eVar = qVar.f4598a;
        do {
        } while (vVar.e(eVar, 8192) != -1);
        try {
            byte[] k2 = eVar.k(eVar.f4579b);
            return BitmapFactory.decodeByteArray(k2, 0, k2.length, (BitmapFactory.Options) null);
        } catch (EOFException e2) {
            throw new AssertionError(e2);
        }
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(4:76|77|78|79) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:78:0x010a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final android.graphics.Bitmap e() {
        /*
            r13 = this;
            r0 = 0
            A.b r1 = r13.f797d
            java.lang.String r2 = r13.f798f
            java.lang.Object r1 = r1.f2g
            Q0.o r1 = (Q0.o) r1
            java.lang.Object r1 = r1.get(r2)
            Q0.p r1 = (Q0.p) r1
            r2 = 0
            if (r1 == 0) goto L_0x0015
            android.graphics.Bitmap r1 = r1.f836a
            goto L_0x0016
        L_0x0015:
            r1 = r2
        L_0x0016:
            r3 = 1
            if (r1 == 0) goto L_0x0028
            Q0.C r2 = r13.e
            Q0.j r2 = r2.f760b
            r2.sendEmptyMessage(r0)
            r13.f805n = r3
            Q0.w r0 = r13.f795b
            r0.getClass()
            return r1
        L_0x0028:
            int r4 = r13.f808q
            r5 = 4
            if (r4 != 0) goto L_0x002f
            r4 = 4
            goto L_0x0031
        L_0x002f:
            int r4 = r13.f800h
        L_0x0031:
            r13.f800h = r4
            Q0.B r6 = r13.i
            Q0.z r7 = r13.f799g
            N0.p r4 = r6.c(r7, r4)
            if (r4 == 0) goto L_0x0061
            int r1 = r4.f651a
            r13.f805n = r1
            int r1 = r4.f652b
            r13.f807p = r1
            java.lang.Object r1 = r4.f653c
            android.graphics.Bitmap r1 = (android.graphics.Bitmap) r1
            if (r1 != 0) goto L_0x0061
            java.lang.Object r1 = r4.f654d
            r1.v r1 = (r1.v) r1
            Q0.z r4 = r13.f799g     // Catch:{ all -> 0x005c }
            android.graphics.Bitmap r4 = b(r1, r4)     // Catch:{ all -> 0x005c }
            r1.close()     // Catch:{ IOException -> 0x0059 }
            goto L_0x005a
        L_0x0059:
        L_0x005a:
            r1 = r4
            goto L_0x0061
        L_0x005c:
            r0 = move-exception
            r1.close()     // Catch:{ IOException -> 0x0060 }
        L_0x0060:
            throw r0
        L_0x0061:
            if (r1 == 0) goto L_0x0164
            Q0.w r4 = r13.f795b
            r4.getClass()
            Q0.C r4 = r13.e
            r4.getClass()
            r1.h r6 = Q0.H.f783a
            int r6 = r1.getAllocationByteCount()
            if (r6 < 0) goto L_0x0150
            Q0.j r4 = r4.f760b
            r7 = 2
            android.os.Message r6 = r4.obtainMessage(r7, r6, r0)
            r4.sendMessage(r6)
            Q0.z r4 = r13.f799g
            r4.getClass()
            java.util.List r4 = r4.f854b
            if (r4 == 0) goto L_0x0089
            goto L_0x008d
        L_0x0089:
            int r4 = r13.f807p
            if (r4 == 0) goto L_0x0164
        L_0x008d:
            java.lang.Object r11 = f790s
            monitor-enter(r11)
            Q0.z r4 = r13.f799g     // Catch:{ all -> 0x00ef }
            r4.getClass()     // Catch:{ all -> 0x00ef }
            int r4 = r13.f807p     // Catch:{ all -> 0x00ef }
            if (r4 == 0) goto L_0x00f1
            Q0.z r6 = r13.f799g     // Catch:{ all -> 0x00ef }
            int r8 = r1.getWidth()     // Catch:{ all -> 0x00ef }
            int r9 = r1.getHeight()     // Catch:{ all -> 0x00ef }
            r6.getClass()     // Catch:{ all -> 0x00ef }
            android.graphics.Matrix r10 = new android.graphics.Matrix     // Catch:{ all -> 0x00ef }
            r10.<init>()     // Catch:{ all -> 0x00ef }
            if (r4 == 0) goto L_0x00d7
            if (r4 == 0) goto L_0x00d7
            switch(r4) {
                case 3: goto L_0x00ba;
                case 4: goto L_0x00ba;
                case 5: goto L_0x00b7;
                case 6: goto L_0x00b7;
                case 7: goto L_0x00b4;
                case 8: goto L_0x00b4;
                default: goto L_0x00b2;
            }     // Catch:{ all -> 0x00ef }
        L_0x00b2:
            r6 = 0
            goto L_0x00bc
        L_0x00b4:
            r6 = 270(0x10e, float:3.78E-43)
            goto L_0x00bc
        L_0x00b7:
            r6 = 90
            goto L_0x00bc
        L_0x00ba:
            r6 = 180(0xb4, float:2.52E-43)
        L_0x00bc:
            if (r4 == r7) goto L_0x00c8
            r7 = 7
            if (r4 == r7) goto L_0x00c8
            if (r4 == r5) goto L_0x00c8
            r5 = 5
            if (r4 == r5) goto L_0x00c8
            r4 = 1
            goto L_0x00c9
        L_0x00c8:
            r4 = -1
        L_0x00c9:
            if (r6 == 0) goto L_0x00cf
            float r5 = (float) r6     // Catch:{ all -> 0x00ef }
            r10.preRotate(r5)     // Catch:{ all -> 0x00ef }
        L_0x00cf:
            if (r4 == r3) goto L_0x00d7
            float r4 = (float) r4     // Catch:{ all -> 0x00ef }
            r5 = 1065353216(0x3f800000, float:1.0)
            r10.postScale(r4, r5)     // Catch:{ all -> 0x00ef }
        L_0x00d7:
            r12 = 1
            r6 = 0
            r5 = 0
            r4 = r1
            r7 = r8
            r8 = r9
            r9 = r10
            r10 = r12
            android.graphics.Bitmap r4 = android.graphics.Bitmap.createBitmap(r4, r5, r6, r7, r8, r9, r10)     // Catch:{ all -> 0x00ef }
            if (r4 == r1) goto L_0x00e9
            r1.recycle()     // Catch:{ all -> 0x00ef }
            r1 = r4
        L_0x00e9:
            Q0.w r4 = r13.f795b     // Catch:{ all -> 0x00ef }
            r4.getClass()     // Catch:{ all -> 0x00ef }
            goto L_0x00f1
        L_0x00ef:
            r0 = move-exception
            goto L_0x014e
        L_0x00f1:
            Q0.z r4 = r13.f799g     // Catch:{ all -> 0x00ef }
            java.util.List r4 = r4.f854b     // Catch:{ all -> 0x00ef }
            if (r4 == 0) goto L_0x00f8
            goto L_0x00f9
        L_0x00f8:
            r3 = 0
        L_0x00f9:
            if (r3 == 0) goto L_0x0121
            int r3 = r4.size()     // Catch:{ all -> 0x00ef }
            if (r3 > 0) goto L_0x0103
            r2 = r1
            goto L_0x0114
        L_0x0103:
            java.lang.Object r1 = r4.get(r0)     // Catch:{ all -> 0x00ef }
            if (r1 != 0) goto L_0x011b
            throw r2     // Catch:{ RuntimeException -> 0x010a }
        L_0x010a:
            Q0.u r1 = Q0.w.f845g     // Catch:{ all -> 0x00ef }
            Q0.e r3 = new Q0.e     // Catch:{ all -> 0x00ef }
            r3.<init>(r0)     // Catch:{ all -> 0x00ef }
            r1.post(r3)     // Catch:{ all -> 0x00ef }
        L_0x0114:
            Q0.w r1 = r13.f795b     // Catch:{ all -> 0x00ef }
            r1.getClass()     // Catch:{ all -> 0x00ef }
            r1 = r2
            goto L_0x0121
        L_0x011b:
            java.lang.ClassCastException r0 = new java.lang.ClassCastException     // Catch:{ all -> 0x00ef }
            r0.<init>()     // Catch:{ all -> 0x00ef }
            throw r0     // Catch:{ all -> 0x00ef }
        L_0x0121:
            monitor-exit(r11)     // Catch:{ all -> 0x00ef }
            if (r1 == 0) goto L_0x0164
            Q0.C r2 = r13.e
            r2.getClass()
            int r3 = r1.getAllocationByteCount()
            if (r3 < 0) goto L_0x013a
            Q0.j r2 = r2.f760b
            r4 = 3
            android.os.Message r0 = r2.obtainMessage(r4, r3, r0)
            r2.sendMessage(r0)
            goto L_0x0164
        L_0x013a:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "Negative size: "
            r2.<init>(r3)
            r2.append(r1)
            java.lang.String r1 = r2.toString()
            r0.<init>(r1)
            throw r0
        L_0x014e:
            monitor-exit(r11)     // Catch:{ all -> 0x00ef }
            throw r0
        L_0x0150:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "Negative size: "
            r2.<init>(r3)
            r2.append(r1)
            java.lang.String r1 = r2.toString()
            r0.<init>(r1)
            throw r0
        L_0x0164:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: Q0.C0037f.e():android.graphics.Bitmap");
    }

    public static C0037f d(w wVar, m mVar, b bVar, C c2, n nVar) {
        z zVar = nVar.f832b;
        List list = wVar.f847a;
        int size = list.size();
        for (int i2 = 0; i2 < size; i2++) {
            B b2 = (B) list.get(i2);
            if (b2.a(zVar)) {
                return new C0037f(wVar, mVar, bVar, c2, nVar, b2);
            }
        }
        return new C0037f(wVar, mVar, bVar, c2, nVar, f793v);
    }

    public static void f(z zVar) {
        String str;
        Uri uri = zVar.f853a;
        if (uri != null) {
            str = String.valueOf(uri.getPath());
        } else {
            str = Integer.toHexString(0);
        }
        StringBuilder sb = (StringBuilder) f791t.get();
        sb.ensureCapacity(str.length() + 8);
        sb.replace(8, sb.length(), str);
        Thread.currentThread().setName(sb.toString());
    }

    public final boolean a() {
        Future future;
        if (this.f801j != null) {
            return false;
        }
        ArrayList arrayList = this.f802k;
        if ((arrayList == null || arrayList.isEmpty()) && (future = this.f804m) != null && future.cancel(false)) {
            return true;
        }
        return false;
    }

    public final void c(n nVar) {
        boolean z2;
        boolean z3;
        int i2 = 1;
        if (this.f801j == nVar) {
            this.f801j = null;
            z2 = true;
        } else {
            ArrayList arrayList = this.f802k;
            if (arrayList != null) {
                z2 = arrayList.remove(nVar);
            } else {
                z2 = false;
            }
        }
        if (z2) {
            z zVar = nVar.f832b;
            if (zVar.f855c == this.f809r) {
                ArrayList arrayList2 = this.f802k;
                if (arrayList2 == null || arrayList2.isEmpty()) {
                    z3 = false;
                } else {
                    z3 = true;
                }
                n nVar2 = this.f801j;
                if (nVar2 != null || z3) {
                    if (nVar2 != null) {
                        i2 = nVar2.f832b.f855c;
                    }
                    if (z3) {
                        int size = this.f802k.size();
                        for (int i3 = 0; i3 < size; i3++) {
                            int i4 = ((n) this.f802k.get(i3)).f832b.f855c;
                            if (C0339e.a(i4) > C0339e.a(i2)) {
                                i2 = i4;
                            }
                        }
                    }
                }
                this.f809r = i2;
            }
        }
        this.f795b.getClass();
    }

    public final void run() {
        m mVar = this.f796c;
        try {
            f(this.f799g);
            this.f795b.getClass();
            Bitmap e2 = e();
            this.f803l = e2;
            if (e2 == null) {
                j jVar = mVar.f826h;
                jVar.sendMessage(jVar.obtainMessage(6, this));
            } else {
                mVar.b(this);
            }
        } catch (s e3) {
            this.f806o = e3;
            j jVar2 = mVar.f826h;
            jVar2.sendMessage(jVar2.obtainMessage(6, this));
        } catch (IOException e4) {
            this.f806o = e4;
            j jVar3 = mVar.f826h;
            jVar3.sendMessageDelayed(jVar3.obtainMessage(5, this), 500);
        } catch (OutOfMemoryError e5) {
            StringWriter stringWriter = new StringWriter();
            this.e.a().a(new PrintWriter(stringWriter));
            this.f806o = new RuntimeException(stringWriter.toString(), e5);
            j jVar4 = mVar.f826h;
            jVar4.sendMessage(jVar4.obtainMessage(6, this));
        } catch (Exception e6) {
            this.f806o = e6;
            j jVar5 = mVar.f826h;
            jVar5.sendMessage(jVar5.obtainMessage(6, this));
        } catch (Throwable th) {
            Thread.currentThread().setName("Picasso-Idle");
            throw th;
        }
        Thread.currentThread().setName("Picasso-Idle");
    }

    public C0037f(w wVar, m mVar, b bVar, C c2, n nVar, B b2) {
        this.f795b = wVar;
        this.f796c = mVar;
        this.f797d = bVar;
        this.e = c2;
        this.f801j = nVar;
        this.f798f = nVar.f833c;
        z zVar = nVar.f832b;
        this.f799g = zVar;
        this.f809r = zVar.f855c;
        this.f800h = 0;
        this.i = b2;
        this.f808q = b2.b();
    }
}
