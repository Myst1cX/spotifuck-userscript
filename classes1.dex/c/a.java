package C;

import it.deviato.spotifuck.MainActivity;

public final /* synthetic */ class a implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f33a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Object f34b;

    public /* synthetic */ a(int i, Object obj) {
        this.f33a = i;
        this.f34b = obj;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:182:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:184:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:?, code lost:
        r5 = r1.c();
        r6 = r5.e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0059, code lost:
        if (r6 != 2) goto L_0x0066;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x005b, code lost:
        r0 = r1.i;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x005d, code lost:
        monitor-enter(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:?, code lost:
        monitor-exit(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x0063, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x0066, code lost:
        if (r6 != 0) goto L_0x00ca;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:?, code lost:
        r4 = J.k.f299a;
        android.os.Trace.beginSection("EmojiCompat.FontRequestEmojiCompatConfig.buildTypeface");
        r0 = r1.f1534h;
        r4 = r1.f1532f;
        r0.getClass();
        r0 = F.g.f232a.u(r4, new K.k[]{r5}, 0);
        r2 = p0.C0320a.j0(r1.f1532f, r5.f334a);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x0088, code lost:
        if (r2 == null) goto L_0x00bb;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x008a, code lost:
        if (r0 == null) goto L_0x00bb;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:?, code lost:
        android.os.Trace.beginSection("EmojiCompat.MetadataRepo.create");
        r3 = new A.k(r0, T0.g.I(r2));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:?, code lost:
        android.os.Trace.endSection();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:?, code lost:
        android.os.Trace.endSection();
        r0 = r1.i;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x00a2, code lost:
        monitor-enter(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:?, code lost:
        r2 = r1.f1538m;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:0x00a5, code lost:
        if (r2 == null) goto L_0x00ad;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:54:0x00a7, code lost:
        r2.B(r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:55:0x00ab, code lost:
        r2 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:57:0x00ad, code lost:
        monitor-exit(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:59:?, code lost:
        r1.a();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:63:?, code lost:
        throw r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:64:0x00b4, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:66:?, code lost:
        r2 = J.k.f299a;
        android.os.Trace.endSection();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:67:0x00ba, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:69:0x00c2, code lost:
        throw new java.lang.RuntimeException("Unable to open file.");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:70:0x00c3, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:72:?, code lost:
        r2 = J.k.f299a;
        android.os.Trace.endSection();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:73:0x00c9, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:75:0x00e0, code lost:
        throw new java.lang.RuntimeException("fetchFonts result is not OK. (" + r6 + ")");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:77:0x00e3, code lost:
        monitor-enter(r1.i);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:79:?, code lost:
        r3 = r1.f1538m;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:80:0x00e6, code lost:
        if (r3 != null) goto L_0x00e8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:81:0x00e8, code lost:
        r3.A(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:82:0x00ec, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:85:0x00ef, code lost:
        r1.a();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:88:0x00f4, code lost:
        throw r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r15 = this;
            r0 = 2
            r1 = 0
            r2 = 0
            r3 = 1
            int r4 = r15.f33a
            switch(r4) {
                case 0: goto L_0x01ab;
                case 1: goto L_0x017b;
                case 2: goto L_0x0157;
                case 3: goto L_0x014f;
                case 4: goto L_0x013f;
                case 5: goto L_0x0135;
                case 6: goto L_0x0115;
                case 7: goto L_0x010d;
                case 8: goto L_0x00ff;
                case 9: goto L_0x00f7;
                case 10: goto L_0x003f;
                case 11: goto L_0x0019;
                case 12: goto L_0x0011;
                default: goto L_0x0009;
            }
        L_0x0009:
            java.lang.Object r0 = r15.f34b
            com.google.android.material.carousel.CarouselLayoutManager r0 = (com.google.android.material.carousel.CarouselLayoutManager) r0
            r0.l0()
            return
        L_0x0011:
            java.lang.Object r0 = r15.f34b
            com.google.android.material.timepicker.e r0 = (com.google.android.material.timepicker.e) r0
            r0.m()
            return
        L_0x0019:
            java.lang.Object r0 = r15.f34b
            androidx.lifecycle.C r0 = (androidx.lifecycle.C) r0
            java.lang.String r1 = "this$0"
            Z0.c.e(r1, r0)
            int r1 = r0.f1791g
            androidx.lifecycle.t r2 = r0.f1794k
            if (r1 != 0) goto L_0x002f
            r0.f1792h = r3
            androidx.lifecycle.l r1 = androidx.lifecycle.C0077l.ON_PAUSE
            r2.d(r1)
        L_0x002f:
            int r1 = r0.f1790f
            if (r1 != 0) goto L_0x003e
            boolean r1 = r0.f1792h
            if (r1 == 0) goto L_0x003e
            androidx.lifecycle.l r1 = androidx.lifecycle.C0077l.ON_STOP
            r2.d(r1)
            r0.i = r3
        L_0x003e:
            return
        L_0x003f:
            java.lang.Object r1 = r15.f34b
            androidx.emoji2.text.p r1 = (androidx.emoji2.text.p) r1
            java.lang.String r4 = "fetchFonts result is not OK. ("
            java.lang.Object r5 = r1.i
            monitor-enter(r5)
            T0.g r6 = r1.f1538m     // Catch:{ all -> 0x004f }
            if (r6 != 0) goto L_0x0052
            monitor-exit(r5)     // Catch:{ all -> 0x004f }
            goto L_0x00f2
        L_0x004f:
            r0 = move-exception
            goto L_0x00f5
        L_0x0052:
            monitor-exit(r5)     // Catch:{ all -> 0x004f }
            K.k r5 = r1.c()     // Catch:{ all -> 0x0063 }
            int r6 = r5.e     // Catch:{ all -> 0x0063 }
            if (r6 != r0) goto L_0x0066
            java.lang.Object r0 = r1.i     // Catch:{ all -> 0x0063 }
            monitor-enter(r0)     // Catch:{ all -> 0x0063 }
            monitor-exit(r0)     // Catch:{ all -> 0x0060 }
            goto L_0x0066
        L_0x0060:
            r2 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0060 }
            throw r2     // Catch:{ all -> 0x0063 }
        L_0x0063:
            r0 = move-exception
            goto L_0x00e1
        L_0x0066:
            if (r6 != 0) goto L_0x00ca
            java.lang.String r0 = "EmojiCompat.FontRequestEmojiCompatConfig.buildTypeface"
            int r4 = J.k.f299a     // Catch:{ all -> 0x00c3 }
            android.os.Trace.beginSection(r0)     // Catch:{ all -> 0x00c3 }
            K0.e r0 = r1.f1534h     // Catch:{ all -> 0x00c3 }
            android.content.Context r4 = r1.f1532f     // Catch:{ all -> 0x00c3 }
            r0.getClass()     // Catch:{ all -> 0x00c3 }
            K.k[] r0 = new K.k[r3]     // Catch:{ all -> 0x00c3 }
            r0[r2] = r5     // Catch:{ all -> 0x00c3 }
            p0.a r3 = F.g.f232a     // Catch:{ all -> 0x00c3 }
            android.graphics.Typeface r0 = r3.u(r4, r0, r2)     // Catch:{ all -> 0x00c3 }
            android.content.Context r2 = r1.f1532f     // Catch:{ all -> 0x00c3 }
            android.net.Uri r3 = r5.f334a     // Catch:{ all -> 0x00c3 }
            java.nio.MappedByteBuffer r2 = p0.C0320a.j0(r2, r3)     // Catch:{ all -> 0x00c3 }
            if (r2 == 0) goto L_0x00bb
            if (r0 == 0) goto L_0x00bb
            java.lang.String r3 = "EmojiCompat.MetadataRepo.create"
            android.os.Trace.beginSection(r3)     // Catch:{ all -> 0x00b4 }
            A.k r3 = new A.k     // Catch:{ all -> 0x00b4 }
            W.b r2 = T0.g.I(r2)     // Catch:{ all -> 0x00b4 }
            r3.<init>(r0, r2)     // Catch:{ all -> 0x00b4 }
            android.os.Trace.endSection()     // Catch:{ all -> 0x00c3 }
            android.os.Trace.endSection()     // Catch:{ all -> 0x0063 }
            java.lang.Object r0 = r1.i     // Catch:{ all -> 0x0063 }
            monitor-enter(r0)     // Catch:{ all -> 0x0063 }
            T0.g r2 = r1.f1538m     // Catch:{ all -> 0x00ab }
            if (r2 == 0) goto L_0x00ad
            r2.B(r3)     // Catch:{ all -> 0x00ab }
            goto L_0x00ad
        L_0x00ab:
            r2 = move-exception
            goto L_0x00b2
        L_0x00ad:
            monitor-exit(r0)     // Catch:{ all -> 0x00ab }
            r1.a()     // Catch:{ all -> 0x0063 }
            goto L_0x00f2
        L_0x00b2:
            monitor-exit(r0)     // Catch:{ all -> 0x00ab }
            throw r2     // Catch:{ all -> 0x0063 }
        L_0x00b4:
            r0 = move-exception
            int r2 = J.k.f299a     // Catch:{ all -> 0x00c3 }
            android.os.Trace.endSection()     // Catch:{ all -> 0x00c3 }
            throw r0     // Catch:{ all -> 0x00c3 }
        L_0x00bb:
            java.lang.RuntimeException r0 = new java.lang.RuntimeException     // Catch:{ all -> 0x00c3 }
            java.lang.String r2 = "Unable to open file."
            r0.<init>(r2)     // Catch:{ all -> 0x00c3 }
            throw r0     // Catch:{ all -> 0x00c3 }
        L_0x00c3:
            r0 = move-exception
            int r2 = J.k.f299a     // Catch:{ all -> 0x0063 }
            android.os.Trace.endSection()     // Catch:{ all -> 0x0063 }
            throw r0     // Catch:{ all -> 0x0063 }
        L_0x00ca:
            java.lang.RuntimeException r0 = new java.lang.RuntimeException     // Catch:{ all -> 0x0063 }
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ all -> 0x0063 }
            r2.<init>(r4)     // Catch:{ all -> 0x0063 }
            r2.append(r6)     // Catch:{ all -> 0x0063 }
            java.lang.String r3 = ")"
            r2.append(r3)     // Catch:{ all -> 0x0063 }
            java.lang.String r2 = r2.toString()     // Catch:{ all -> 0x0063 }
            r0.<init>(r2)     // Catch:{ all -> 0x0063 }
            throw r0     // Catch:{ all -> 0x0063 }
        L_0x00e1:
            java.lang.Object r2 = r1.i
            monitor-enter(r2)
            T0.g r3 = r1.f1538m     // Catch:{ all -> 0x00ec }
            if (r3 == 0) goto L_0x00ee
            r3.A(r0)     // Catch:{ all -> 0x00ec }
            goto L_0x00ee
        L_0x00ec:
            r0 = move-exception
            goto L_0x00f3
        L_0x00ee:
            monitor-exit(r2)     // Catch:{ all -> 0x00ec }
            r1.a()
        L_0x00f2:
            return
        L_0x00f3:
            monitor-exit(r2)     // Catch:{ all -> 0x00ec }
            throw r0
        L_0x00f5:
            monitor-exit(r5)     // Catch:{ all -> 0x004f }
            throw r0
        L_0x00f7:
            java.lang.Object r0 = r15.f34b
            androidx.activity.o r0 = (androidx.activity.o) r0
            androidx.activity.o.a(r0)
            return
        L_0x00ff:
            java.lang.Object r0 = r15.f34b
            androidx.activity.k r0 = (androidx.activity.k) r0
            java.lang.Runnable r2 = r0.f1163b
            if (r2 == 0) goto L_0x010c
            r2.run()
            r0.f1163b = r1
        L_0x010c:
            return
        L_0x010d:
            java.lang.Object r0 = r15.f34b
            java.lang.String r0 = (java.lang.String) r0
            it.deviato.spotifuck.MainActivity.t(r0)
            return
        L_0x0115:
            java.lang.Object r0 = r15.f34b
            android.webkit.PermissionRequest r0 = (android.webkit.PermissionRequest) r0
            java.lang.String[] r1 = r0.getResources()
            java.util.List r1 = java.util.Arrays.asList(r1)
            java.lang.String r2 = "android.webkit.resource.PROTECTED_MEDIA_ID"
            boolean r1 = r1.contains(r2)
            if (r1 == 0) goto L_0x0131
            java.lang.String[] r1 = r0.getResources()
            r0.grant(r1)
            goto L_0x0134
        L_0x0131:
            r0.deny()
        L_0x0134:
            return
        L_0x0135:
            java.lang.Object r0 = r15.f34b
            com.google.android.material.textfield.TextInputLayout r0 = (com.google.android.material.textfield.TextInputLayout) r0
            android.widget.EditText r0 = r0.i
            r0.requestLayout()
            return
        L_0x013f:
            java.lang.Object r0 = r15.f34b
            N0.l r0 = (N0.l) r0
            android.widget.AutoCompleteTextView r1 = r0.f637h
            boolean r1 = r1.isPopupShowing()
            r0.t(r1)
            r0.f641m = r1
            return
        L_0x014f:
            java.lang.Object r0 = r15.f34b
            N0.e r0 = (N0.C0030e) r0
            r0.t(r3)
            return
        L_0x0157:
            java.lang.Object r1 = r15.f34b
            L0.e r1 = (L0.e) r1
            r1.f477c = r2
            A.c r2 = r1.e
            com.google.android.material.sidesheet.SideSheetBehavior r2 = (com.google.android.material.sidesheet.SideSheetBehavior) r2
            V.e r3 = r2.i
            if (r3 == 0) goto L_0x0171
            boolean r3 = r3.f()
            if (r3 == 0) goto L_0x0171
            int r0 = r1.f476b
            r1.a(r0)
            goto L_0x017a
        L_0x0171:
            int r3 = r2.f2316h
            if (r3 != r0) goto L_0x017a
            int r0 = r1.f476b
            r2.r(r0)
        L_0x017a:
            return
        L_0x017b:
            java.lang.Object r0 = r15.f34b
            android.view.View r0 = (android.view.View) r0
            android.content.Context r2 = r0.getContext()
            int r4 = android.os.Build.VERSION.SDK_INT
            java.lang.Class<android.view.inputmethod.InputMethodManager> r5 = android.view.inputmethod.InputMethodManager.class
            r6 = 23
            if (r4 < r6) goto L_0x0190
            java.lang.Object r1 = D.b.b(r2, r5)
            goto L_0x01a5
        L_0x0190:
            if (r4 < r6) goto L_0x0197
            java.lang.String r4 = D.b.c(r2, r5)
            goto L_0x019f
        L_0x0197:
            java.util.HashMap r4 = D.e.f75a
            java.lang.Object r4 = r4.get(r5)
            java.lang.String r4 = (java.lang.String) r4
        L_0x019f:
            if (r4 == 0) goto L_0x01a5
            java.lang.Object r1 = r2.getSystemService(r4)
        L_0x01a5:
            android.view.inputmethod.InputMethodManager r1 = (android.view.inputmethod.InputMethodManager) r1
            r1.showSoftInput(r0, r3)
            return
        L_0x01ab:
            java.lang.Object r4 = r15.f34b
            android.app.Activity r4 = (android.app.Activity) r4
            boolean r5 = r4.isFinishing()
            if (r5 != 0) goto L_0x0255
            int r5 = android.os.Build.VERSION.SDK_INT
            r6 = 28
            if (r5 < r6) goto L_0x01c2
            java.lang.Class r0 = C.d.f43a
            r4.recreate()
            goto L_0x0255
        L_0x01c2:
            java.lang.Class r6 = C.d.f43a
            r6 = 27
            r7 = 26
            if (r5 == r7) goto L_0x01cf
            if (r5 != r6) goto L_0x01cd
            goto L_0x01cf
        L_0x01cd:
            r8 = 0
            goto L_0x01d0
        L_0x01cf:
            r8 = 1
        L_0x01d0:
            java.lang.reflect.Method r9 = C.d.f47f
            if (r8 == 0) goto L_0x01d8
            if (r9 != 0) goto L_0x01d8
            goto L_0x0252
        L_0x01d8:
            java.lang.reflect.Method r8 = C.d.e
            if (r8 != 0) goto L_0x01e2
            java.lang.reflect.Method r8 = C.d.f46d
            if (r8 != 0) goto L_0x01e2
            goto L_0x0252
        L_0x01e2:
            java.lang.reflect.Field r8 = C.d.f45c     // Catch:{ all -> 0x0252 }
            java.lang.Object r8 = r8.get(r4)     // Catch:{ all -> 0x0252 }
            if (r8 != 0) goto L_0x01eb
            goto L_0x0252
        L_0x01eb:
            java.lang.reflect.Field r10 = C.d.f44b     // Catch:{ all -> 0x0252 }
            java.lang.Object r10 = r10.get(r4)     // Catch:{ all -> 0x0252 }
            if (r10 != 0) goto L_0x01f4
            goto L_0x0252
        L_0x01f4:
            android.app.Application r11 = r4.getApplication()     // Catch:{ all -> 0x0252 }
            C.c r12 = new C.c     // Catch:{ all -> 0x0252 }
            r12.<init>(r4)     // Catch:{ all -> 0x0252 }
            r11.registerActivityLifecycleCallbacks(r12)     // Catch:{ all -> 0x0252 }
            android.os.Handler r13 = C.d.f48g
            C.b r14 = new C.b     // Catch:{ all -> 0x0252 }
            r14.<init>((java.lang.Object) r12, (java.lang.Object) r8, (int) r2)     // Catch:{ all -> 0x0252 }
            r13.post(r14)     // Catch:{ all -> 0x0252 }
            if (r5 == r7) goto L_0x0211
            if (r5 != r6) goto L_0x020f
            goto L_0x0211
        L_0x020f:
            r5 = 0
            goto L_0x0212
        L_0x0211:
            r5 = 1
        L_0x0212:
            if (r5 == 0) goto L_0x023d
            java.lang.Integer r5 = java.lang.Integer.valueOf(r2)     // Catch:{ all -> 0x023b }
            r6 = 9
            java.lang.Object[] r6 = new java.lang.Object[r6]     // Catch:{ all -> 0x023b }
            r6[r2] = r8     // Catch:{ all -> 0x023b }
            r6[r3] = r1     // Catch:{ all -> 0x023b }
            r6[r0] = r1     // Catch:{ all -> 0x023b }
            r0 = 3
            r6[r0] = r5     // Catch:{ all -> 0x023b }
            java.lang.Boolean r0 = java.lang.Boolean.FALSE     // Catch:{ all -> 0x023b }
            r5 = 4
            r6[r5] = r0     // Catch:{ all -> 0x023b }
            r5 = 5
            r6[r5] = r1     // Catch:{ all -> 0x023b }
            r5 = 6
            r6[r5] = r1     // Catch:{ all -> 0x023b }
            r1 = 7
            r6[r1] = r0     // Catch:{ all -> 0x023b }
            r1 = 8
            r6[r1] = r0     // Catch:{ all -> 0x023b }
            r9.invoke(r10, r6)     // Catch:{ all -> 0x023b }
            goto L_0x0240
        L_0x023b:
            r0 = move-exception
            goto L_0x0249
        L_0x023d:
            r4.recreate()     // Catch:{ all -> 0x023b }
        L_0x0240:
            C.b r0 = new C.b     // Catch:{ all -> 0x0252 }
            r0.<init>(r11, r12, r3, r2)     // Catch:{ all -> 0x0252 }
            r13.post(r0)     // Catch:{ all -> 0x0252 }
            goto L_0x0255
        L_0x0249:
            C.b r1 = new C.b     // Catch:{ all -> 0x0252 }
            r1.<init>(r11, r12, r3, r2)     // Catch:{ all -> 0x0252 }
            r13.post(r1)     // Catch:{ all -> 0x0252 }
            throw r0     // Catch:{ all -> 0x0252 }
        L_0x0252:
            r4.recreate()
        L_0x0255:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: C.a.run():void");
    }

    public /* synthetic */ a(MainActivity mainActivity, String str) {
        this.f33a = 7;
        this.f34b = str;
    }
}
