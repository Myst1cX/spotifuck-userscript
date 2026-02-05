package N0;

public final class B implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f607a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Object f608b;

    public /* synthetic */ B(int i, Object obj) {
        this.f607a = i;
        this.f608b = obj;
    }

    /* JADX WARNING: type inference failed for: r2v4, types: [r1.u, java.lang.Object] */
    /* JADX WARNING: Code restructure failed: missing block: B:17:?, code lost:
        r1 = (i1.g) r5.f608b;
        r1.f3132q = true;
        r2 = r1.o.f4594a;
        r1.f3125j = new r1.p(new java.lang.Object());
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* JADX WARNING: Missing exception handler attribute for start block: B:10:0x001a */
    /* JADX WARNING: Missing exception handler attribute for start block: B:16:0x0039 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void a() {
        /*
            r5 = this;
            java.lang.Object r0 = r5.f608b
            i1.g r0 = (i1.g) r0
            monitor-enter(r0)
            java.lang.Object r1 = r5.f608b     // Catch:{ all -> 0x0014 }
            i1.g r1 = (i1.g) r1     // Catch:{ all -> 0x0014 }
            boolean r2 = r1.f3129n     // Catch:{ all -> 0x0014 }
            r3 = 1
            r2 = r2 ^ r3
            boolean r4 = r1.f3130o     // Catch:{ all -> 0x0014 }
            r2 = r2 | r4
            if (r2 == 0) goto L_0x0016
            monitor-exit(r0)     // Catch:{ all -> 0x0014 }
            return
        L_0x0014:
            r1 = move-exception
            goto L_0x004f
        L_0x0016:
            r1.s()     // Catch:{ IOException -> 0x001a }
            goto L_0x0020
        L_0x001a:
            java.lang.Object r1 = r5.f608b     // Catch:{ all -> 0x0014 }
            i1.g r1 = (i1.g) r1     // Catch:{ all -> 0x0014 }
            r1.f3131p = r3     // Catch:{ all -> 0x0014 }
        L_0x0020:
            java.lang.Object r1 = r5.f608b     // Catch:{ IOException -> 0x0039 }
            i1.g r1 = (i1.g) r1     // Catch:{ IOException -> 0x0039 }
            boolean r1 = r1.l()     // Catch:{ IOException -> 0x0039 }
            if (r1 == 0) goto L_0x004d
            java.lang.Object r1 = r5.f608b     // Catch:{ IOException -> 0x0039 }
            i1.g r1 = (i1.g) r1     // Catch:{ IOException -> 0x0039 }
            r1.q()     // Catch:{ IOException -> 0x0039 }
            java.lang.Object r1 = r5.f608b     // Catch:{ IOException -> 0x0039 }
            i1.g r1 = (i1.g) r1     // Catch:{ IOException -> 0x0039 }
            r2 = 0
            r1.f3127l = r2     // Catch:{ IOException -> 0x0039 }
            goto L_0x004d
        L_0x0039:
            java.lang.Object r1 = r5.f608b     // Catch:{ all -> 0x0014 }
            i1.g r1 = (i1.g) r1     // Catch:{ all -> 0x0014 }
            r1.f3132q = r3     // Catch:{ all -> 0x0014 }
            java.util.logging.Logger r2 = r1.o.f4594a     // Catch:{ all -> 0x0014 }
            r1.n r2 = new r1.n     // Catch:{ all -> 0x0014 }
            r2.<init>()     // Catch:{ all -> 0x0014 }
            r1.p r3 = new r1.p     // Catch:{ all -> 0x0014 }
            r3.<init>(r2)     // Catch:{ all -> 0x0014 }
            r1.f3125j = r3     // Catch:{ all -> 0x0014 }
        L_0x004d:
            monitor-exit(r0)     // Catch:{ all -> 0x0014 }
            return
        L_0x004f:
            monitor-exit(r0)     // Catch:{ all -> 0x0014 }
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: N0.B.a():void");
    }

    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* JADX WARNING: Missing exception handler attribute for start block: B:41:0x00dd */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r17 = this;
            r1 = r17
            r2 = 0
            r4 = -1
            r0 = 2
            r6 = 1
            r7 = 0
            int r8 = r1.f607a
            switch(r8) {
                case 0: goto L_0x01dc;
                case 1: goto L_0x01d2;
                case 2: goto L_0x013e;
                case 3: goto L_0x0136;
                case 4: goto L_0x0125;
                case 5: goto L_0x0119;
                case 6: goto L_0x0111;
                case 7: goto L_0x00fb;
                case 8: goto L_0x00f3;
                case 9: goto L_0x00e9;
                case 10: goto L_0x00e1;
                case 11: goto L_0x00af;
                case 12: goto L_0x00ab;
                case 13: goto L_0x00a0;
                case 14: goto L_0x006f;
                case 15: goto L_0x0067;
                case 16: goto L_0x005c;
                case 17: goto L_0x0042;
                case 18: goto L_0x0032;
                default: goto L_0x000e;
            }
        L_0x000e:
            java.lang.Object r2 = r1.f608b
            L0.e r2 = (L0.e) r2
            r2.f477c = r7
            A.c r3 = r2.e
            com.google.android.material.bottomsheet.BottomSheetBehavior r3 = (com.google.android.material.bottomsheet.BottomSheetBehavior) r3
            V.e r4 = r3.f2120M
            if (r4 == 0) goto L_0x0028
            boolean r4 = r4.f()
            if (r4 == 0) goto L_0x0028
            int r0 = r2.f476b
            r2.a(r0)
            goto L_0x0031
        L_0x0028:
            int r4 = r3.f2119L
            if (r4 != r0) goto L_0x0031
            int r0 = r2.f476b
            r3.C(r0)
        L_0x0031:
            return
        L_0x0032:
            java.lang.Object r0 = r1.f608b
            androidx.appcompat.widget.Toolbar r0 = (androidx.appcompat.widget.Toolbar) r0
            androidx.appcompat.widget.ActionMenuView r0 = r0.f1396f
            if (r0 == 0) goto L_0x0041
            o.k r0 = r0.f1316y
            if (r0 == 0) goto L_0x0041
            r0.l()
        L_0x0041:
            return
        L_0x0042:
            java.lang.Object r0 = r1.f608b
            androidx.appcompat.widget.SearchView$SearchAutoComplete r0 = (androidx.appcompat.widget.SearchView$SearchAutoComplete) r0
            boolean r2 = r0.f1330k
            if (r2 == 0) goto L_0x005b
            android.content.Context r2 = r0.getContext()
            java.lang.String r3 = "input_method"
            java.lang.Object r2 = r2.getSystemService(r3)
            android.view.inputmethod.InputMethodManager r2 = (android.view.inputmethod.InputMethodManager) r2
            r2.showSoftInput(r0, r7)
            r0.f1330k = r7
        L_0x005b:
            return
        L_0x005c:
            r0 = 0
            java.lang.Object r2 = r1.f608b
            o.v0 r2 = (o.C0309v0) r2
            r2.f4318q = r0
            r2.drawableStateChanged()
            return
        L_0x0067:
            java.lang.Object r0 = r1.f608b
            androidx.recyclerview.widget.StaggeredGridLayoutManager r0 = (androidx.recyclerview.widget.StaggeredGridLayoutManager) r0
            r0.B0()
            return
        L_0x006f:
            java.lang.Object r2 = r1.f608b
            j0.m r2 = (j0.C0151m) r2
            int r3 = r2.f3438A
            android.animation.ValueAnimator r4 = r2.f3463z
            if (r3 == r6) goto L_0x007c
            if (r3 == r0) goto L_0x007f
            goto L_0x009f
        L_0x007c:
            r4.cancel()
        L_0x007f:
            r3 = 3
            r2.f3438A = r3
            java.lang.Object r2 = r4.getAnimatedValue()
            java.lang.Float r2 = (java.lang.Float) r2
            float r2 = r2.floatValue()
            float[] r0 = new float[r0]
            r0[r7] = r2
            r2 = 0
            r0[r6] = r2
            r4.setFloatValues(r0)
            r0 = 500(0x1f4, float:7.0E-43)
            long r2 = (long) r0
            r4.setDuration(r2)
            r4.start()
        L_0x009f:
            return
        L_0x00a0:
            java.lang.Object r0 = r1.f608b
            j.e r0 = (j.C0135e) r0
            r0.a(r6)
            r0.invalidateSelf()
            return
        L_0x00ab:
            r17.a()
            return
        L_0x00af:
            java.lang.Object r0 = r1.f608b
            g1.n r0 = (g1.n) r0
            long r6 = java.lang.System.nanoTime()
            long r6 = r0.a(r6)
            int r0 = (r6 > r4 ? 1 : (r6 == r4 ? 0 : -1))
            if (r0 != 0) goto L_0x00c0
            return
        L_0x00c0:
            int r0 = (r6 > r2 ? 1 : (r6 == r2 ? 0 : -1))
            if (r0 <= 0) goto L_0x00af
            r8 = 1000000(0xf4240, double:4.940656E-318)
            long r10 = r6 / r8
            long r8 = r8 * r10
            long r6 = r6 - r8
            java.lang.Object r0 = r1.f608b
            r8 = r0
            g1.n r8 = (g1.n) r8
            monitor-enter(r8)
            java.lang.Object r0 = r1.f608b     // Catch:{ InterruptedException -> 0x00dd }
            g1.n r0 = (g1.n) r0     // Catch:{ InterruptedException -> 0x00dd }
            int r7 = (int) r6     // Catch:{ InterruptedException -> 0x00dd }
            r0.wait(r10, r7)     // Catch:{ InterruptedException -> 0x00dd }
            goto L_0x00dd
        L_0x00db:
            r0 = move-exception
            goto L_0x00df
        L_0x00dd:
            monitor-exit(r8)     // Catch:{ all -> 0x00db }
            goto L_0x00af
        L_0x00df:
            monitor-exit(r8)     // Catch:{ all -> 0x00db }
            throw r0
        L_0x00e1:
            java.lang.Object r0 = r1.f608b
            g0.u r0 = (g0.u) r0
            r0.k()
            return
        L_0x00e9:
            java.lang.Object r0 = r1.f608b
            g0.r r0 = (g0.r) r0
            androidx.recyclerview.widget.RecyclerView r0 = r0.f2585b0
            r0.focusableViewAvailable(r0)
            return
        L_0x00f3:
            java.lang.Object r0 = r1.f608b
            g0.d r0 = (g0.C0101d) r0
            r0.P()
            return
        L_0x00fb:
            java.lang.Object r0 = r1.f608b
            d0.c r0 = (d0.c) r0
            d0.q r2 = r0.f2464g
            r.b r2 = r2.f2501j
            A.b r0 = r0.f2462d
            java.lang.Object r0 = r0.f2g
            android.os.Messenger r0 = (android.os.Messenger) r0
            android.os.IBinder r0 = r0.getBinder()
            r2.remove(r0)
            return
        L_0x0111:
            java.lang.Object r0 = r1.f608b
            androidx.fragment.app.H r0 = (androidx.fragment.app.H) r0
            r0.x(r6)
            return
        L_0x0119:
            java.lang.Object r0 = r1.f608b
            androidx.fragment.app.m r0 = (androidx.fragment.app.C0059m) r0
            androidx.fragment.app.k r2 = r0.f1705a0
            android.app.Dialog r0 = r0.f1713i0
            r2.onDismiss(r0)
            return
        L_0x0125:
            java.lang.Object r0 = r1.f608b
            androidx.fragment.app.e r0 = (androidx.fragment.app.C0051e) r0
            android.view.ViewGroup r2 = r0.f1689b
            android.view.View r3 = r0.f1690c
            r2.endViewTransition(r3)
            androidx.fragment.app.f r0 = r0.f1691d
            r0.d()
            return
        L_0x0136:
            java.lang.Object r0 = r1.f608b
            V.e r0 = (V.e) r0
            r0.n(r7)
            return
        L_0x013e:
            java.lang.Object r0 = r1.f608b
            T.g r0 = (T.g) r0
            boolean r6 = r0.f911t
            if (r6 != 0) goto L_0x0148
            goto L_0x01c9
        L_0x0148:
            boolean r6 = r0.f909r
            T.a r8 = r0.f898f
            if (r6 == 0) goto L_0x015e
            r0.f909r = r7
            long r9 = android.view.animation.AnimationUtils.currentAnimationTimeMillis()
            r8.e = r9
            r8.f895g = r4
            r8.f894f = r9
            r4 = 1056964608(0x3f000000, float:0.5)
            r8.f896h = r4
        L_0x015e:
            long r4 = r8.f895g
            int r6 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r6 <= 0) goto L_0x0173
            long r4 = android.view.animation.AnimationUtils.currentAnimationTimeMillis()
            long r9 = r8.f895g
            int r6 = r8.i
            long r11 = (long) r6
            long r9 = r9 + r11
            int r6 = (r4 > r9 ? 1 : (r4 == r9 ? 0 : -1))
            if (r6 <= 0) goto L_0x0173
            goto L_0x0179
        L_0x0173:
            boolean r4 = r0.e()
            if (r4 != 0) goto L_0x017c
        L_0x0179:
            r0.f911t = r7
            goto L_0x01c9
        L_0x017c:
            boolean r4 = r0.f910s
            android.widget.ListView r5 = r0.f900h
            if (r4 == 0) goto L_0x0198
            r0.f910s = r7
            long r11 = android.os.SystemClock.uptimeMillis()
            r15 = 0
            r16 = 0
            r13 = 3
            r14 = 0
            r9 = r11
            android.view.MotionEvent r4 = android.view.MotionEvent.obtain(r9, r11, r13, r14, r15, r16)
            r5.onTouchEvent(r4)
            r4.recycle()
        L_0x0198:
            long r6 = r8.f894f
            int r4 = (r6 > r2 ? 1 : (r6 == r2 ? 0 : -1))
            if (r4 == 0) goto L_0x01ca
            long r2 = android.view.animation.AnimationUtils.currentAnimationTimeMillis()
            float r4 = r8.a(r2)
            r6 = -1065353216(0xffffffffc0800000, float:-4.0)
            float r6 = r6 * r4
            float r6 = r6 * r4
            r7 = 1082130432(0x40800000, float:4.0)
            float r4 = r4 * r7
            float r4 = r4 + r6
            long r6 = r8.f894f
            long r6 = r2 - r6
            r8.f894f = r2
            float r2 = (float) r6
            float r2 = r2 * r4
            float r3 = r8.f893d
            float r2 = r2 * r3
            int r2 = (int) r2
            o.v0 r0 = r0.f913v
            r0.scrollListBy(r2)
            java.util.WeakHashMap r0 = N.Q.f509a
            r5.postOnAnimation(r1)
        L_0x01c9:
            return
        L_0x01ca:
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            java.lang.String r2 = "Cannot compute scroll delta before calling start()"
            r0.<init>(r2)
            throw r0
        L_0x01d2:
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            java.lang.Object r2 = r1.f608b
            java.lang.Exception r2 = (java.lang.Exception) r2
            r0.<init>(r2)
            throw r0
        L_0x01dc:
            java.lang.Object r0 = r1.f608b
            com.google.android.material.textfield.TextInputLayout r0 = (com.google.android.material.textfield.TextInputLayout) r0
            N0.q r0 = r0.f2373h
            com.google.android.material.internal.CheckableImageButton r0 = r0.f661l
            r0.performClick()
            r0.jumpDrawablesToCurrentState()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: N0.B.run():void");
    }
}
