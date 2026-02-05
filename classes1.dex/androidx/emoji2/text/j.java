package androidx.emoji2.text;

import K.a;
import K0.e;
import android.os.Handler;
import android.os.Looper;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import p0.C0320a;
import r.c;

public final class j {

    /* renamed from: j  reason: collision with root package name */
    public static final Object f1513j = new Object();

    /* renamed from: k  reason: collision with root package name */
    public static volatile j f1514k;

    /* renamed from: a  reason: collision with root package name */
    public final ReentrantReadWriteLock f1515a;

    /* renamed from: b  reason: collision with root package name */
    public final c f1516b;

    /* renamed from: c  reason: collision with root package name */
    public volatile int f1517c = 3;

    /* renamed from: d  reason: collision with root package name */
    public final Handler f1518d;
    public final f e;

    /* renamed from: f  reason: collision with root package name */
    public final i f1519f;

    /* renamed from: g  reason: collision with root package name */
    public final e f1520g;

    /* renamed from: h  reason: collision with root package name */
    public final int f1521h;
    public final d i;

    public final void f(h hVar) {
        C0320a.j("initCallback cannot be null", hVar);
        this.f1515a.writeLock().lock();
        try {
            if (this.f1517c != 1) {
                if (this.f1517c != 2) {
                    this.f1516b.add(hVar);
                }
            }
            this.f1518d.post(new a(Arrays.asList(new h[]{hVar}), this.f1517c, (Throwable) null));
        } finally {
            this.f1515a.writeLock().unlock();
        }
    }

    public static j a() {
        j jVar;
        boolean z2;
        synchronized (f1513j) {
            try {
                jVar = f1514k;
                if (jVar != null) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (!z2) {
                    throw new IllegalStateException("EmojiCompat is not initialized.\n\nYou must initialize EmojiCompat prior to referencing the EmojiCompat instance.\n\nThe most likely cause of this error is disabling the EmojiCompatInitializer\neither explicitly in AndroidManifest.xml, or by including\nandroidx.emoji2:emoji2-bundled.\n\nAutomatic initialization is typically performed by EmojiCompatInitializer. If\nyou are not expecting to initialize EmojiCompat manually in your application,\nplease check to ensure it has not been removed from your APK's manifest. You can\ndo this in Android Studio using Build > Analyze APK.\n\nIn the APK Analyzer, ensure that the startup entry for\nEmojiCompatInitializer and InitializationProvider is present in\n AndroidManifest.xml. If it is missing or contains tools:node=\"remove\", and you\nintend to use automatic configuration, verify:\n\n  1. Your application does not include emoji2-bundled\n  2. All modules do not contain an exclusion manifest rule for\n     EmojiCompatInitializer or InitializationProvider. For more information\n     about manifest exclusions see the documentation for the androidx startup\n     library.\n\nIf you intend to use emoji2-bundled, please call EmojiCompat.init. You can\nlearn more in the documentation for BundledEmojiCompatConfig.\n\nIf you intended to perform manual configuration, it is recommended that you call\nEmojiCompat.init immediately on application startup.\n\nIf you still cannot resolve this issue, please open a bug with your specific\nconfiguration to help improve error message.");
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return jVar;
    }

    public final int b() {
        this.f1515a.readLock().lock();
        try {
            return this.f1517c;
        } finally {
            this.f1515a.readLock().unlock();
        }
    }

    public final void c() {
        boolean z2;
        if (this.f1521h == 1) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (!z2) {
            throw new IllegalStateException("Set metadataLoadStrategy to LOAD_STRATEGY_MANUAL to execute manual loading");
        } else if (b() != 1) {
            this.f1515a.writeLock().lock();
            try {
                if (this.f1517c != 0) {
                    this.f1517c = 0;
                    this.f1515a.writeLock().unlock();
                    f fVar = this.e;
                    j jVar = fVar.f1507a;
                    try {
                        jVar.f1519f.o(new e(fVar));
                    } catch (Throwable th) {
                        jVar.d(th);
                    }
                }
            } finally {
                this.f1515a.writeLock().unlock();
            }
        }
    }

    /* JADX INFO: finally extract failed */
    public final void d(Throwable th) {
        ArrayList arrayList = new ArrayList();
        this.f1515a.writeLock().lock();
        try {
            this.f1517c = 2;
            arrayList.addAll(this.f1516b);
            this.f1516b.clear();
            this.f1515a.writeLock().unlock();
            this.f1518d.post(new a((List) arrayList, this.f1517c, th));
        } catch (Throwable th2) {
            this.f1515a.writeLock().unlock();
            throw th2;
        }
    }

    public j(q qVar) {
        ReentrantReadWriteLock reentrantReadWriteLock = new ReentrantReadWriteLock();
        this.f1515a = reentrantReadWriteLock;
        i iVar = (i) qVar.f1511b;
        this.f1519f = iVar;
        int i2 = qVar.f1510a;
        this.f1521h = i2;
        this.i = (d) qVar.f1512c;
        this.f1518d = new Handler(Looper.getMainLooper());
        this.f1516b = new c(0);
        this.f1520g = new e(11);
        f fVar = new f(this);
        this.e = fVar;
        reentrantReadWriteLock.writeLock().lock();
        if (i2 == 0) {
            try {
                this.f1517c = 0;
            } catch (Throwable th) {
                this.f1515a.writeLock().unlock();
                throw th;
            }
        }
        reentrantReadWriteLock.writeLock().unlock();
        if (b() == 0) {
            try {
                iVar.o(new e(fVar));
            } catch (Throwable th2) {
                d(th2);
            }
        }
    }

    /* JADX WARNING: type inference failed for: r0v6, types: [androidx.emoji2.text.x, java.lang.Object] */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x009b A[Catch:{ all -> 0x007e }] */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x00bd A[Catch:{ all -> 0x007e }] */
    /* JADX WARNING: Removed duplicated region for block: B:81:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.CharSequence e(java.lang.CharSequence r11, int r12, int r13) {
        /*
            r10 = this;
            int r0 = r10.b()
            r1 = 0
            r2 = 1
            if (r0 != r2) goto L_0x000a
            r0 = 1
            goto L_0x000b
        L_0x000a:
            r0 = 0
        L_0x000b:
            if (r0 == 0) goto L_0x010c
            if (r12 < 0) goto L_0x0104
            if (r13 < 0) goto L_0x00fc
            if (r12 > r13) goto L_0x0015
            r0 = 1
            goto L_0x0016
        L_0x0015:
            r0 = 0
        L_0x0016:
            java.lang.String r3 = "start should be <= than end"
            p0.C0320a.h(r3, r0)
            r0 = 0
            if (r11 != 0) goto L_0x001f
            return r0
        L_0x001f:
            int r3 = r11.length()
            if (r12 > r3) goto L_0x0027
            r3 = 1
            goto L_0x0028
        L_0x0027:
            r3 = 0
        L_0x0028:
            java.lang.String r4 = "start should be < than charSequence length"
            p0.C0320a.h(r4, r3)
            int r3 = r11.length()
            if (r13 > r3) goto L_0x0034
            goto L_0x0035
        L_0x0034:
            r2 = 0
        L_0x0035:
            java.lang.String r3 = "end should be < than charSequence length"
            p0.C0320a.h(r3, r2)
            int r2 = r11.length()
            if (r2 == 0) goto L_0x00fb
            if (r12 != r13) goto L_0x0044
            goto L_0x00fb
        L_0x0044:
            androidx.emoji2.text.f r2 = r10.e
            android.support.v4.media.session.t r3 = r2.f1508b
            r3.getClass()
            boolean r2 = r11 instanceof androidx.emoji2.text.t
            if (r2 == 0) goto L_0x0055
            r4 = r11
            androidx.emoji2.text.t r4 = (androidx.emoji2.text.t) r4
            r4.a()
        L_0x0055:
            java.lang.Class<androidx.emoji2.text.v> r4 = androidx.emoji2.text.v.class
            if (r2 != 0) goto L_0x0081
            boolean r5 = r11 instanceof android.text.Spannable     // Catch:{ all -> 0x007e }
            if (r5 == 0) goto L_0x005e
            goto L_0x0081
        L_0x005e:
            boolean r5 = r11 instanceof android.text.Spanned     // Catch:{ all -> 0x007e }
            if (r5 == 0) goto L_0x0089
            r5 = r11
            android.text.Spanned r5 = (android.text.Spanned) r5     // Catch:{ all -> 0x007e }
            int r6 = r12 + -1
            int r7 = r13 + 1
            int r5 = r5.nextSpanTransition(r6, r7, r4)     // Catch:{ all -> 0x007e }
            if (r5 > r13) goto L_0x0089
            androidx.emoji2.text.x r0 = new androidx.emoji2.text.x     // Catch:{ all -> 0x007e }
            r0.<init>()     // Catch:{ all -> 0x007e }
            r0.f1554a = r1     // Catch:{ all -> 0x007e }
            android.text.SpannableString r5 = new android.text.SpannableString     // Catch:{ all -> 0x007e }
            r5.<init>(r11)     // Catch:{ all -> 0x007e }
            r0.f1555b = r5     // Catch:{ all -> 0x007e }
            goto L_0x0089
        L_0x007e:
            r12 = move-exception
            goto L_0x00f3
        L_0x0081:
            androidx.emoji2.text.x r0 = new androidx.emoji2.text.x     // Catch:{ all -> 0x007e }
            r5 = r11
            android.text.Spannable r5 = (android.text.Spannable) r5     // Catch:{ all -> 0x007e }
            r0.<init>(r5)     // Catch:{ all -> 0x007e }
        L_0x0089:
            if (r0 == 0) goto L_0x00b9
            android.text.Spannable r5 = r0.f1555b     // Catch:{ all -> 0x007e }
            java.lang.Object[] r4 = r5.getSpans(r12, r13, r4)     // Catch:{ all -> 0x007e }
            androidx.emoji2.text.v[] r4 = (androidx.emoji2.text.v[]) r4     // Catch:{ all -> 0x007e }
            if (r4 == 0) goto L_0x00b9
            int r5 = r4.length     // Catch:{ all -> 0x007e }
            if (r5 <= 0) goto L_0x00b9
            int r5 = r4.length     // Catch:{ all -> 0x007e }
        L_0x0099:
            if (r1 >= r5) goto L_0x00b9
            r6 = r4[r1]     // Catch:{ all -> 0x007e }
            android.text.Spannable r7 = r0.f1555b     // Catch:{ all -> 0x007e }
            int r7 = r7.getSpanStart(r6)     // Catch:{ all -> 0x007e }
            android.text.Spannable r8 = r0.f1555b     // Catch:{ all -> 0x007e }
            int r8 = r8.getSpanEnd(r6)     // Catch:{ all -> 0x007e }
            if (r7 == r13) goto L_0x00ae
            r0.removeSpan(r6)     // Catch:{ all -> 0x007e }
        L_0x00ae:
            int r12 = java.lang.Math.min(r7, r12)     // Catch:{ all -> 0x007e }
            int r13 = java.lang.Math.max(r8, r13)     // Catch:{ all -> 0x007e }
            int r1 = r1 + 1
            goto L_0x0099
        L_0x00b9:
            r5 = r12
            r6 = r13
            if (r5 == r6) goto L_0x00ef
            int r12 = r11.length()     // Catch:{ all -> 0x007e }
            if (r5 < r12) goto L_0x00c4
            goto L_0x00ef
        L_0x00c4:
            E.j r9 = new E.j     // Catch:{ all -> 0x007e }
            java.lang.Object r12 = r3.f1131b     // Catch:{ all -> 0x007e }
            K0.e r12 = (K0.e) r12     // Catch:{ all -> 0x007e }
            r13 = 6
            r9.<init>((java.lang.Object) r0, (java.lang.Object) r12, (int) r13)     // Catch:{ all -> 0x007e }
            r8 = 0
            r7 = 2147483647(0x7fffffff, float:NaN)
            r4 = r11
            java.lang.Object r12 = r3.B(r4, r5, r6, r7, r8, r9)     // Catch:{ all -> 0x007e }
            androidx.emoji2.text.x r12 = (androidx.emoji2.text.x) r12     // Catch:{ all -> 0x007e }
            if (r12 == 0) goto L_0x00e6
            android.text.Spannable r12 = r12.f1555b     // Catch:{ all -> 0x007e }
            if (r2 == 0) goto L_0x00e4
            androidx.emoji2.text.t r11 = (androidx.emoji2.text.t) r11
            r11.b()
        L_0x00e4:
            r11 = r12
            goto L_0x00f2
        L_0x00e6:
            if (r2 == 0) goto L_0x00f2
        L_0x00e8:
            r12 = r11
            androidx.emoji2.text.t r12 = (androidx.emoji2.text.t) r12
            r12.b()
            goto L_0x00f2
        L_0x00ef:
            if (r2 == 0) goto L_0x00f2
            goto L_0x00e8
        L_0x00f2:
            return r11
        L_0x00f3:
            if (r2 == 0) goto L_0x00fa
            androidx.emoji2.text.t r11 = (androidx.emoji2.text.t) r11
            r11.b()
        L_0x00fa:
            throw r12
        L_0x00fb:
            return r11
        L_0x00fc:
            java.lang.IllegalArgumentException r11 = new java.lang.IllegalArgumentException
            java.lang.String r12 = "end cannot be negative"
            r11.<init>(r12)
            throw r11
        L_0x0104:
            java.lang.IllegalArgumentException r11 = new java.lang.IllegalArgumentException
            java.lang.String r12 = "start cannot be negative"
            r11.<init>(r12)
            throw r11
        L_0x010c:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r12 = "Not initialized yet"
            r11.<init>(r12)
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.emoji2.text.j.e(java.lang.CharSequence, int, int):java.lang.CharSequence");
    }
}
