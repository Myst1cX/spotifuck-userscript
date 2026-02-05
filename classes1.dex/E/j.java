package E;

import A.k;
import E0.o;
import J.b;
import K.a;
import K.h;
import N.C0017q;
import N.Q;
import N.Z;
import N.r;
import N.u0;
import N.w0;
import N0.B;
import Z0.c;
import android.animation.Animator;
import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.os.Messenger;
import android.text.Spannable;
import android.text.SpannableString;
import android.util.Log;
import android.util.SparseIntArray;
import android.view.ActionMode;
import android.view.Menu;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import androidx.activity.l;
import androidx.emoji2.text.n;
import androidx.emoji2.text.x;
import androidx.fragment.app.H;
import androidx.fragment.app.S;
import androidx.preference.Preference;
import androidx.preference.PreferenceGroup;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import d.C0088a;
import g0.m;
import g0.u;
import g1.z;
import h.C0121l;
import h.D;
import h.v;
import j0.I;
import j0.a0;
import j0.g0;
import j0.j0;
import j0.k0;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Objects;
import java.util.WeakHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import m.C0174a;
import m.e;
import n.C0182A;
import n.C0197l;
import t.C0338d;
import t.C0340f;

public final class j implements r, n, b, m, T.j {

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ int f107f;

    /* renamed from: g  reason: collision with root package name */
    public Object f108g;

    /* renamed from: h  reason: collision with root package name */
    public Object f109h;

    public /* synthetic */ j(int i, boolean z2) {
        this.f107f = i;
    }

    public static int y(int i, int i2) {
        int i3 = 0;
        int i4 = 0;
        for (int i5 = 0; i5 < i; i5++) {
            i3++;
            if (i3 == i2) {
                i4++;
                i3 = 0;
            } else if (i3 > i2) {
                i4++;
                i3 = 1;
            }
        }
        if (i3 + 1 > i2) {
            return i4 + 1;
        }
        return i4;
    }

    /* JADX WARNING: CFG modification limit reached, blocks count: 111 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized void L() {
        /*
            r1 = this;
            monitor-enter(r1)
            java.lang.Object r0 = r1.f108g     // Catch:{ all -> 0x0013 }
            java.util.ArrayDeque r0 = (java.util.ArrayDeque) r0     // Catch:{ all -> 0x0013 }
            r0.size()     // Catch:{ all -> 0x0013 }
            java.lang.Object r0 = r1.f109h     // Catch:{ all -> 0x0013 }
            java.util.ArrayDeque r0 = (java.util.ArrayDeque) r0     // Catch:{ all -> 0x0013 }
            r0.size()     // Catch:{ all -> 0x0013 }
            monitor-exit(r1)
            return
        L_0x0011:
            monitor-exit(r1)     // Catch:{ all -> 0x0013 }
            throw r0
        L_0x0013:
            r0 = move-exception
            goto L_0x0011
        */
        throw new UnsupportedOperationException("Method not decompiled: E.j.L():void");
    }

    /* JADX WARNING: CFG modification limit reached, blocks count: 111 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized void v(g1.z r2) {
        /*
            r1 = this;
            monitor-enter(r1)
            java.lang.Object r0 = r1.f109h     // Catch:{ all -> 0x000c }
            java.util.ArrayDeque r0 = (java.util.ArrayDeque) r0     // Catch:{ all -> 0x000c }
            r0.add(r2)     // Catch:{ all -> 0x000c }
            monitor-exit(r1)
            return
        L_0x000a:
            monitor-exit(r1)     // Catch:{ all -> 0x000c }
            throw r2
        L_0x000c:
            r2 = move-exception
            goto L_0x000a
        */
        throw new UnsupportedOperationException("Method not decompiled: E.j.v(g1.z):void");
    }

    public /* synthetic */ j(Object obj, Object obj2, int i) {
        this.f107f = i;
        this.f108g = obj;
        this.f109h = obj2;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:28:0x004e, code lost:
        if (r3.f().e == false) goto L_0x0051;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x0051, code lost:
        return false;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean A(g1.C r3, g1.A r4) {
        /*
            int r0 = r3.f2648c
            r1 = 200(0xc8, float:2.8E-43)
            r2 = 0
            if (r0 == r1) goto L_0x0052
            r1 = 410(0x19a, float:5.75E-43)
            if (r0 == r1) goto L_0x0052
            r1 = 414(0x19e, float:5.8E-43)
            if (r0 == r1) goto L_0x0052
            r1 = 501(0x1f5, float:7.02E-43)
            if (r0 == r1) goto L_0x0052
            r1 = 203(0xcb, float:2.84E-43)
            if (r0 == r1) goto L_0x0052
            r1 = 204(0xcc, float:2.86E-43)
            if (r0 == r1) goto L_0x0052
            r1 = 307(0x133, float:4.3E-43)
            if (r0 == r1) goto L_0x002f
            r1 = 308(0x134, float:4.32E-43)
            if (r0 == r1) goto L_0x0052
            r1 = 404(0x194, float:5.66E-43)
            if (r0 == r1) goto L_0x0052
            r1 = 405(0x195, float:5.68E-43)
            if (r0 == r1) goto L_0x0052
            switch(r0) {
                case 300: goto L_0x0052;
                case 301: goto L_0x0052;
                case 302: goto L_0x002f;
                default: goto L_0x002e;
            }
        L_0x002e:
            goto L_0x0051
        L_0x002f:
            java.lang.String r0 = "Expires"
            java.lang.String r0 = r3.g(r0)
            if (r0 != 0) goto L_0x0052
            g1.j r0 = r3.f()
            r1 = -1
            int r0 = r0.f2710c
            if (r0 != r1) goto L_0x0052
            g1.j r0 = r3.f()
            boolean r0 = r0.f2712f
            if (r0 != 0) goto L_0x0052
            g1.j r0 = r3.f()
            boolean r0 = r0.e
            if (r0 == 0) goto L_0x0051
            goto L_0x0052
        L_0x0051:
            return r2
        L_0x0052:
            g1.j r3 = r3.f()
            boolean r3 = r3.f2709b
            if (r3 != 0) goto L_0x006c
            g1.j r3 = r4.e
            if (r3 == 0) goto L_0x005f
            goto L_0x0067
        L_0x005f:
            g1.s r3 = r4.f2634c
            g1.j r3 = g1.j.a(r3)
            r4.e = r3
        L_0x0067:
            boolean r3 = r3.f2709b
            if (r3 != 0) goto L_0x006c
            r2 = 1
        L_0x006c:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: E.j.A(g1.C, g1.A):boolean");
    }

    public boolean B(View view) {
        I i = (I) this.f108g;
        int d2 = i.d();
        int c2 = i.c();
        int b2 = i.b(view);
        int a2 = i.a(view);
        j0 j0Var = (j0) this.f109h;
        j0Var.f3426b = d2;
        j0Var.f3427c = c2;
        j0Var.f3428d = b2;
        j0Var.e = a2;
        j0Var.f3425a = 24579;
        return j0Var.a();
    }

    public void C(int i, int i2) {
        int[] iArr = (int[]) this.f108g;
        if (iArr != null && i < iArr.length) {
            int i3 = i + i2;
            u(i3);
            int[] iArr2 = (int[]) this.f108g;
            System.arraycopy(iArr2, i, iArr2, i3, (iArr2.length - i) - i2);
            Arrays.fill((int[]) this.f108g, i, i3, -1);
            ArrayList arrayList = (ArrayList) this.f109h;
            if (arrayList != null) {
                for (int size = arrayList.size() - 1; size >= 0; size--) {
                    g0 g0Var = (g0) ((ArrayList) this.f109h).get(size);
                    int i4 = g0Var.f3387a;
                    if (i4 >= i) {
                        g0Var.f3387a = i4 + i2;
                    }
                }
            }
        }
    }

    public void D(int i, int i2) {
        int[] iArr = (int[]) this.f108g;
        if (iArr != null && i < iArr.length) {
            int i3 = i + i2;
            u(i3);
            int[] iArr2 = (int[]) this.f108g;
            System.arraycopy(iArr2, i3, iArr2, i, (iArr2.length - i) - i2);
            int[] iArr3 = (int[]) this.f108g;
            Arrays.fill(iArr3, iArr3.length - i2, iArr3.length, -1);
            ArrayList arrayList = (ArrayList) this.f109h;
            if (arrayList != null) {
                for (int size = arrayList.size() - 1; size >= 0; size--) {
                    g0 g0Var = (g0) ((ArrayList) this.f109h).get(size);
                    int i4 = g0Var.f3387a;
                    if (i4 >= i) {
                        if (i4 < i3) {
                            ((ArrayList) this.f109h).remove(size);
                        } else {
                            g0Var.f3387a = i4 - i2;
                        }
                    }
                }
            }
        }
    }

    public void E(C0174a aVar) {
        k kVar = (k) this.f108g;
        ((ActionMode.Callback) kVar.f21f).onDestroyActionMode(kVar.f(aVar));
        D d2 = (D) this.f109h;
        if (d2.f2852B != null) {
            d2.f2890q.getDecorView().removeCallbacks(d2.f2853C);
        }
        if (d2.f2851A != null) {
            Z z2 = d2.f2854D;
            if (z2 != null) {
                z2.b();
            }
            Z a2 = Q.a(d2.f2851A);
            a2.a(0.0f);
            d2.f2854D = a2;
            a2.d(new v(2, this));
        }
        d2.f2899z = null;
        ViewGroup viewGroup = d2.f2857G;
        WeakHashMap weakHashMap = Q.f509a;
        N.D.c(viewGroup);
        d2.H();
    }

    public boolean F(C0174a aVar, C0197l lVar) {
        ViewGroup viewGroup = ((D) this.f109h).f2857G;
        WeakHashMap weakHashMap = Q.f509a;
        N.D.c(viewGroup);
        k kVar = (k) this.f108g;
        e f2 = kVar.f(aVar);
        r.k kVar2 = (r.k) kVar.f22g;
        Menu menu = (Menu) kVar2.getOrDefault(lVar, (Object) null);
        if (menu == null) {
            menu = new C0182A((Context) kVar.i, lVar);
            kVar2.put(lVar, menu);
        }
        return ((ActionMode.Callback) kVar.f21f).onPrepareActionMode(f2, menu);
    }

    public void G(h hVar) {
        int i = hVar.f327b;
        Handler handler = (Handler) this.f109h;
        A.b bVar = (A.b) this.f108g;
        if (i == 0) {
            handler.post(new C.b((Object) bVar, (Object) hVar.f326a, 3));
        } else {
            handler.post(new a(i, 0, (Object) bVar));
        }
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:143:0x022e, code lost:
        continue;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x00b4, code lost:
        r7 = 65535;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x00b5, code lost:
        if (r7 == 0) goto L_0x023b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x00b7, code lost:
        if (r7 == 1) goto L_0x00bf;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x00b9, code lost:
        if (r7 == 2) goto L_0x00bf;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x00bb, code lost:
        if (r7 == 3) goto L_0x00bf;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x00bf, code lost:
        r0.f5134c.put(java.lang.Integer.valueOf(r9.f5037a), r9);
        r9 = null;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void H(android.content.Context r14, android.content.res.XmlResourceParser r15) {
        /*
            r13 = this;
            y.n r0 = new y.n
            r0.<init>()
            int r1 = r15.getAttributeCount()
            r2 = 0
            r3 = 0
        L_0x000b:
            if (r3 >= r1) goto L_0x0247
            java.lang.String r4 = r15.getAttributeName(r3)
            java.lang.String r5 = r15.getAttributeValue(r3)
            if (r4 == 0) goto L_0x0243
            if (r5 != 0) goto L_0x001b
            goto L_0x0243
        L_0x001b:
            java.lang.String r6 = "id"
            boolean r4 = r6.equals(r4)
            if (r4 == 0) goto L_0x0243
            java.lang.String r1 = "/"
            boolean r1 = r5.contains(r1)
            r3 = 1
            r4 = -1
            if (r1 == 0) goto L_0x0045
            r1 = 47
            int r1 = r5.indexOf(r1)
            int r1 = r1 + r3
            java.lang.String r1 = r5.substring(r1)
            android.content.res.Resources r7 = r14.getResources()
            java.lang.String r8 = r14.getPackageName()
            int r1 = r7.getIdentifier(r1, r6, r8)
            goto L_0x0046
        L_0x0045:
            r1 = -1
        L_0x0046:
            if (r1 != r4) goto L_0x005e
            int r6 = r5.length()
            if (r6 <= r3) goto L_0x0057
            java.lang.String r1 = r5.substring(r3)
            int r1 = java.lang.Integer.parseInt(r1)
            goto L_0x005e
        L_0x0057:
            java.lang.String r5 = "ConstraintLayoutStates"
            java.lang.String r6 = "error in parsing id"
            android.util.Log.e(r5, r6)
        L_0x005e:
            java.lang.String r5 = "Error parsing XML resource"
            java.lang.String r6 = "ConstraintSet"
            int r7 = r15.getEventType()     // Catch:{ XmlPullParserException -> 0x0093, IOException -> 0x0090 }
            r8 = 0
            r9 = r8
        L_0x0068:
            if (r7 == r3) goto L_0x023b
            if (r7 == 0) goto L_0x022b
            r10 = 3
            r11 = 2
            if (r7 == r11) goto L_0x00cd
            if (r7 == r10) goto L_0x0074
            goto L_0x022e
        L_0x0074:
            java.lang.String r7 = r15.getName()     // Catch:{ XmlPullParserException -> 0x0093, IOException -> 0x0090 }
            java.util.Locale r12 = java.util.Locale.ROOT     // Catch:{ XmlPullParserException -> 0x0093, IOException -> 0x0090 }
            java.lang.String r7 = r7.toLowerCase(r12)     // Catch:{ XmlPullParserException -> 0x0093, IOException -> 0x0090 }
            int r12 = r7.hashCode()     // Catch:{ XmlPullParserException -> 0x0093, IOException -> 0x0090 }
            switch(r12) {
                case -2075718416: goto L_0x00aa;
                case -190376483: goto L_0x00a0;
                case 426575017: goto L_0x0096;
                case 2146106725: goto L_0x0086;
                default: goto L_0x0085;
            }     // Catch:{ XmlPullParserException -> 0x0093, IOException -> 0x0090 }
        L_0x0085:
            goto L_0x00b4
        L_0x0086:
            java.lang.String r12 = "constraintset"
            boolean r7 = r7.equals(r12)     // Catch:{ XmlPullParserException -> 0x0093, IOException -> 0x0090 }
            if (r7 == 0) goto L_0x00b4
            r7 = 0
            goto L_0x00b5
        L_0x0090:
            r14 = move-exception
            goto L_0x0234
        L_0x0093:
            r14 = move-exception
            goto L_0x0238
        L_0x0096:
            java.lang.String r12 = "constraintoverride"
            boolean r7 = r7.equals(r12)     // Catch:{ XmlPullParserException -> 0x0093, IOException -> 0x0090 }
            if (r7 == 0) goto L_0x00b4
            r7 = 2
            goto L_0x00b5
        L_0x00a0:
            java.lang.String r12 = "constraint"
            boolean r7 = r7.equals(r12)     // Catch:{ XmlPullParserException -> 0x0093, IOException -> 0x0090 }
            if (r7 == 0) goto L_0x00b4
            r7 = 1
            goto L_0x00b5
        L_0x00aa:
            java.lang.String r12 = "guideline"
            boolean r7 = r7.equals(r12)     // Catch:{ XmlPullParserException -> 0x0093, IOException -> 0x0090 }
            if (r7 == 0) goto L_0x00b4
            r7 = 3
            goto L_0x00b5
        L_0x00b4:
            r7 = -1
        L_0x00b5:
            if (r7 == 0) goto L_0x023b
            if (r7 == r3) goto L_0x00bf
            if (r7 == r11) goto L_0x00bf
            if (r7 == r10) goto L_0x00bf
            goto L_0x022e
        L_0x00bf:
            java.util.HashMap r7 = r0.f5134c     // Catch:{ XmlPullParserException -> 0x0093, IOException -> 0x0090 }
            int r10 = r9.f5037a     // Catch:{ XmlPullParserException -> 0x0093, IOException -> 0x0090 }
            java.lang.Integer r10 = java.lang.Integer.valueOf(r10)     // Catch:{ XmlPullParserException -> 0x0093, IOException -> 0x0090 }
            r7.put(r10, r9)     // Catch:{ XmlPullParserException -> 0x0093, IOException -> 0x0090 }
            r9 = r8
            goto L_0x022e
        L_0x00cd:
            java.lang.String r7 = r15.getName()     // Catch:{ XmlPullParserException -> 0x0093, IOException -> 0x0090 }
            int r12 = r7.hashCode()     // Catch:{ XmlPullParserException -> 0x0093, IOException -> 0x0090 }
            switch(r12) {
                case -2025855158: goto L_0x0135;
                case -1984451626: goto L_0x012b;
                case -1962203927: goto L_0x0121;
                case -1269513683: goto L_0x0117;
                case -1238332596: goto L_0x010d;
                case -71750448: goto L_0x0103;
                case 366511058: goto L_0x00f8;
                case 1331510167: goto L_0x00ef;
                case 1791837707: goto L_0x00e4;
                case 1803088381: goto L_0x00da;
                default: goto L_0x00d8;
            }     // Catch:{ XmlPullParserException -> 0x0093, IOException -> 0x0090 }
        L_0x00d8:
            goto L_0x013f
        L_0x00da:
            java.lang.String r10 = "Constraint"
            boolean r7 = r7.equals(r10)     // Catch:{ XmlPullParserException -> 0x0093, IOException -> 0x0090 }
            if (r7 == 0) goto L_0x013f
            r10 = 0
            goto L_0x0140
        L_0x00e4:
            java.lang.String r10 = "CustomAttribute"
            boolean r7 = r7.equals(r10)     // Catch:{ XmlPullParserException -> 0x0093, IOException -> 0x0090 }
            if (r7 == 0) goto L_0x013f
            r10 = 8
            goto L_0x0140
        L_0x00ef:
            java.lang.String r11 = "Barrier"
            boolean r7 = r7.equals(r11)     // Catch:{ XmlPullParserException -> 0x0093, IOException -> 0x0090 }
            if (r7 == 0) goto L_0x013f
            goto L_0x0140
        L_0x00f8:
            java.lang.String r10 = "CustomMethod"
            boolean r7 = r7.equals(r10)     // Catch:{ XmlPullParserException -> 0x0093, IOException -> 0x0090 }
            if (r7 == 0) goto L_0x013f
            r10 = 9
            goto L_0x0140
        L_0x0103:
            java.lang.String r10 = "Guideline"
            boolean r7 = r7.equals(r10)     // Catch:{ XmlPullParserException -> 0x0093, IOException -> 0x0090 }
            if (r7 == 0) goto L_0x013f
            r10 = 2
            goto L_0x0140
        L_0x010d:
            java.lang.String r10 = "Transform"
            boolean r7 = r7.equals(r10)     // Catch:{ XmlPullParserException -> 0x0093, IOException -> 0x0090 }
            if (r7 == 0) goto L_0x013f
            r10 = 5
            goto L_0x0140
        L_0x0117:
            java.lang.String r10 = "PropertySet"
            boolean r7 = r7.equals(r10)     // Catch:{ XmlPullParserException -> 0x0093, IOException -> 0x0090 }
            if (r7 == 0) goto L_0x013f
            r10 = 4
            goto L_0x0140
        L_0x0121:
            java.lang.String r10 = "ConstraintOverride"
            boolean r7 = r7.equals(r10)     // Catch:{ XmlPullParserException -> 0x0093, IOException -> 0x0090 }
            if (r7 == 0) goto L_0x013f
            r10 = 1
            goto L_0x0140
        L_0x012b:
            java.lang.String r10 = "Motion"
            boolean r7 = r7.equals(r10)     // Catch:{ XmlPullParserException -> 0x0093, IOException -> 0x0090 }
            if (r7 == 0) goto L_0x013f
            r10 = 7
            goto L_0x0140
        L_0x0135:
            java.lang.String r10 = "Layout"
            boolean r7 = r7.equals(r10)     // Catch:{ XmlPullParserException -> 0x0093, IOException -> 0x0090 }
            if (r7 == 0) goto L_0x013f
            r10 = 6
            goto L_0x0140
        L_0x013f:
            r10 = -1
        L_0x0140:
            java.lang.String r7 = "XML parser error must be within a Constraint "
            switch(r10) {
                case 0: goto L_0x0222;
                case 1: goto L_0x0219;
                case 2: goto L_0x020c;
                case 3: goto L_0x01ff;
                case 4: goto L_0x01da;
                case 5: goto L_0x01b5;
                case 6: goto L_0x018f;
                case 7: goto L_0x0169;
                case 8: goto L_0x0147;
                case 9: goto L_0x0147;
                default: goto L_0x0145;
            }
        L_0x0145:
            goto L_0x022e
        L_0x0147:
            if (r9 == 0) goto L_0x0150
            java.util.HashMap r7 = r9.f5041f     // Catch:{ XmlPullParserException -> 0x0093, IOException -> 0x0090 }
            y.b.a(r14, r15, r7)     // Catch:{ XmlPullParserException -> 0x0093, IOException -> 0x0090 }
            goto L_0x022e
        L_0x0150:
            java.lang.RuntimeException r14 = new java.lang.RuntimeException     // Catch:{ XmlPullParserException -> 0x0093, IOException -> 0x0090 }
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ XmlPullParserException -> 0x0093, IOException -> 0x0090 }
            r2.<init>()     // Catch:{ XmlPullParserException -> 0x0093, IOException -> 0x0090 }
            r2.append(r7)     // Catch:{ XmlPullParserException -> 0x0093, IOException -> 0x0090 }
            int r15 = r15.getLineNumber()     // Catch:{ XmlPullParserException -> 0x0093, IOException -> 0x0090 }
            r2.append(r15)     // Catch:{ XmlPullParserException -> 0x0093, IOException -> 0x0090 }
            java.lang.String r15 = r2.toString()     // Catch:{ XmlPullParserException -> 0x0093, IOException -> 0x0090 }
            r14.<init>(r15)     // Catch:{ XmlPullParserException -> 0x0093, IOException -> 0x0090 }
            throw r14     // Catch:{ XmlPullParserException -> 0x0093, IOException -> 0x0090 }
        L_0x0169:
            if (r9 == 0) goto L_0x0176
            y.k r7 = r9.f5039c     // Catch:{ XmlPullParserException -> 0x0093, IOException -> 0x0090 }
            android.util.AttributeSet r10 = android.util.Xml.asAttributeSet(r15)     // Catch:{ XmlPullParserException -> 0x0093, IOException -> 0x0090 }
            r7.a(r14, r10)     // Catch:{ XmlPullParserException -> 0x0093, IOException -> 0x0090 }
            goto L_0x022e
        L_0x0176:
            java.lang.RuntimeException r14 = new java.lang.RuntimeException     // Catch:{ XmlPullParserException -> 0x0093, IOException -> 0x0090 }
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ XmlPullParserException -> 0x0093, IOException -> 0x0090 }
            r2.<init>()     // Catch:{ XmlPullParserException -> 0x0093, IOException -> 0x0090 }
            r2.append(r7)     // Catch:{ XmlPullParserException -> 0x0093, IOException -> 0x0090 }
            int r15 = r15.getLineNumber()     // Catch:{ XmlPullParserException -> 0x0093, IOException -> 0x0090 }
            r2.append(r15)     // Catch:{ XmlPullParserException -> 0x0093, IOException -> 0x0090 }
            java.lang.String r15 = r2.toString()     // Catch:{ XmlPullParserException -> 0x0093, IOException -> 0x0090 }
            r14.<init>(r15)     // Catch:{ XmlPullParserException -> 0x0093, IOException -> 0x0090 }
            throw r14     // Catch:{ XmlPullParserException -> 0x0093, IOException -> 0x0090 }
        L_0x018f:
            if (r9 == 0) goto L_0x019c
            y.j r7 = r9.f5040d     // Catch:{ XmlPullParserException -> 0x0093, IOException -> 0x0090 }
            android.util.AttributeSet r10 = android.util.Xml.asAttributeSet(r15)     // Catch:{ XmlPullParserException -> 0x0093, IOException -> 0x0090 }
            r7.a(r14, r10)     // Catch:{ XmlPullParserException -> 0x0093, IOException -> 0x0090 }
            goto L_0x022e
        L_0x019c:
            java.lang.RuntimeException r14 = new java.lang.RuntimeException     // Catch:{ XmlPullParserException -> 0x0093, IOException -> 0x0090 }
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ XmlPullParserException -> 0x0093, IOException -> 0x0090 }
            r2.<init>()     // Catch:{ XmlPullParserException -> 0x0093, IOException -> 0x0090 }
            r2.append(r7)     // Catch:{ XmlPullParserException -> 0x0093, IOException -> 0x0090 }
            int r15 = r15.getLineNumber()     // Catch:{ XmlPullParserException -> 0x0093, IOException -> 0x0090 }
            r2.append(r15)     // Catch:{ XmlPullParserException -> 0x0093, IOException -> 0x0090 }
            java.lang.String r15 = r2.toString()     // Catch:{ XmlPullParserException -> 0x0093, IOException -> 0x0090 }
            r14.<init>(r15)     // Catch:{ XmlPullParserException -> 0x0093, IOException -> 0x0090 }
            throw r14     // Catch:{ XmlPullParserException -> 0x0093, IOException -> 0x0090 }
        L_0x01b5:
            if (r9 == 0) goto L_0x01c1
            y.m r7 = r9.e     // Catch:{ XmlPullParserException -> 0x0093, IOException -> 0x0090 }
            android.util.AttributeSet r10 = android.util.Xml.asAttributeSet(r15)     // Catch:{ XmlPullParserException -> 0x0093, IOException -> 0x0090 }
            r7.a(r14, r10)     // Catch:{ XmlPullParserException -> 0x0093, IOException -> 0x0090 }
            goto L_0x022e
        L_0x01c1:
            java.lang.RuntimeException r14 = new java.lang.RuntimeException     // Catch:{ XmlPullParserException -> 0x0093, IOException -> 0x0090 }
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ XmlPullParserException -> 0x0093, IOException -> 0x0090 }
            r2.<init>()     // Catch:{ XmlPullParserException -> 0x0093, IOException -> 0x0090 }
            r2.append(r7)     // Catch:{ XmlPullParserException -> 0x0093, IOException -> 0x0090 }
            int r15 = r15.getLineNumber()     // Catch:{ XmlPullParserException -> 0x0093, IOException -> 0x0090 }
            r2.append(r15)     // Catch:{ XmlPullParserException -> 0x0093, IOException -> 0x0090 }
            java.lang.String r15 = r2.toString()     // Catch:{ XmlPullParserException -> 0x0093, IOException -> 0x0090 }
            r14.<init>(r15)     // Catch:{ XmlPullParserException -> 0x0093, IOException -> 0x0090 }
            throw r14     // Catch:{ XmlPullParserException -> 0x0093, IOException -> 0x0090 }
        L_0x01da:
            if (r9 == 0) goto L_0x01e6
            y.l r7 = r9.f5038b     // Catch:{ XmlPullParserException -> 0x0093, IOException -> 0x0090 }
            android.util.AttributeSet r10 = android.util.Xml.asAttributeSet(r15)     // Catch:{ XmlPullParserException -> 0x0093, IOException -> 0x0090 }
            r7.a(r14, r10)     // Catch:{ XmlPullParserException -> 0x0093, IOException -> 0x0090 }
            goto L_0x022e
        L_0x01e6:
            java.lang.RuntimeException r14 = new java.lang.RuntimeException     // Catch:{ XmlPullParserException -> 0x0093, IOException -> 0x0090 }
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ XmlPullParserException -> 0x0093, IOException -> 0x0090 }
            r2.<init>()     // Catch:{ XmlPullParserException -> 0x0093, IOException -> 0x0090 }
            r2.append(r7)     // Catch:{ XmlPullParserException -> 0x0093, IOException -> 0x0090 }
            int r15 = r15.getLineNumber()     // Catch:{ XmlPullParserException -> 0x0093, IOException -> 0x0090 }
            r2.append(r15)     // Catch:{ XmlPullParserException -> 0x0093, IOException -> 0x0090 }
            java.lang.String r15 = r2.toString()     // Catch:{ XmlPullParserException -> 0x0093, IOException -> 0x0090 }
            r14.<init>(r15)     // Catch:{ XmlPullParserException -> 0x0093, IOException -> 0x0090 }
            throw r14     // Catch:{ XmlPullParserException -> 0x0093, IOException -> 0x0090 }
        L_0x01ff:
            android.util.AttributeSet r7 = android.util.Xml.asAttributeSet(r15)     // Catch:{ XmlPullParserException -> 0x0093, IOException -> 0x0090 }
            y.i r9 = y.n.d(r14, r7, r2)     // Catch:{ XmlPullParserException -> 0x0093, IOException -> 0x0090 }
            y.j r7 = r9.f5040d     // Catch:{ XmlPullParserException -> 0x0093, IOException -> 0x0090 }
            r7.f5082h0 = r3     // Catch:{ XmlPullParserException -> 0x0093, IOException -> 0x0090 }
            goto L_0x022e
        L_0x020c:
            android.util.AttributeSet r7 = android.util.Xml.asAttributeSet(r15)     // Catch:{ XmlPullParserException -> 0x0093, IOException -> 0x0090 }
            y.i r9 = y.n.d(r14, r7, r2)     // Catch:{ XmlPullParserException -> 0x0093, IOException -> 0x0090 }
            y.j r7 = r9.f5040d     // Catch:{ XmlPullParserException -> 0x0093, IOException -> 0x0090 }
            r7.f5068a = r3     // Catch:{ XmlPullParserException -> 0x0093, IOException -> 0x0090 }
            goto L_0x022e
        L_0x0219:
            android.util.AttributeSet r7 = android.util.Xml.asAttributeSet(r15)     // Catch:{ XmlPullParserException -> 0x0093, IOException -> 0x0090 }
            y.i r9 = y.n.d(r14, r7, r3)     // Catch:{ XmlPullParserException -> 0x0093, IOException -> 0x0090 }
            goto L_0x022e
        L_0x0222:
            android.util.AttributeSet r7 = android.util.Xml.asAttributeSet(r15)     // Catch:{ XmlPullParserException -> 0x0093, IOException -> 0x0090 }
            y.i r9 = y.n.d(r14, r7, r2)     // Catch:{ XmlPullParserException -> 0x0093, IOException -> 0x0090 }
            goto L_0x022e
        L_0x022b:
            r15.getName()     // Catch:{ XmlPullParserException -> 0x0093, IOException -> 0x0090 }
        L_0x022e:
            int r7 = r15.next()     // Catch:{ XmlPullParserException -> 0x0093, IOException -> 0x0090 }
            goto L_0x0068
        L_0x0234:
            android.util.Log.e(r6, r5, r14)
            goto L_0x023b
        L_0x0238:
            android.util.Log.e(r6, r5, r14)
        L_0x023b:
            java.lang.Object r14 = r13.f109h
            android.util.SparseArray r14 = (android.util.SparseArray) r14
            r14.put(r1, r0)
            goto L_0x0247
        L_0x0243:
            int r3 = r3 + 1
            goto L_0x000b
        L_0x0247:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: E.j.H(android.content.Context, android.content.res.XmlResourceParser):void");
    }

    public C0017q I(a0 a0Var, int i) {
        k0 k0Var;
        C0017q qVar;
        r.k kVar = (r.k) this.f108g;
        int e = kVar.e(a0Var);
        if (e >= 0 && (k0Var = (k0) kVar.j(e)) != null) {
            int i2 = k0Var.f3431a;
            if ((i2 & i) != 0) {
                int i3 = i2 & (~i);
                k0Var.f3431a = i3;
                if (i == 4) {
                    qVar = k0Var.f3432b;
                } else if (i == 8) {
                    qVar = k0Var.f3433c;
                } else {
                    throw new IllegalArgumentException("Must provide flag PRE or POST");
                }
                if ((i3 & 12) == 0) {
                    kVar.i(e);
                    k0Var.f3431a = 0;
                    k0Var.f3432b = null;
                    k0Var.f3433c = null;
                    k0.f3430d.c(k0Var);
                }
                return qVar;
            }
        }
        return null;
    }

    public void J(a0 a0Var) {
        k0 k0Var = (k0) ((r.k) this.f108g).getOrDefault(a0Var, (Object) null);
        if (k0Var != null) {
            k0Var.f3431a &= -2;
        }
    }

    public void K(a0 a0Var) {
        r.e eVar = (r.e) this.f109h;
        int g2 = eVar.g() - 1;
        while (true) {
            if (g2 < 0) {
                break;
            } else if (a0Var == eVar.h(g2)) {
                Object[] objArr = eVar.f4528c;
                Object obj = objArr[g2];
                Object obj2 = r.e.e;
                if (obj != obj2) {
                    objArr[g2] = obj2;
                    eVar.f4526a = true;
                }
            } else {
                g2--;
            }
        }
        k0 k0Var = (k0) ((r.k) this.f108g).remove(a0Var);
        if (k0Var != null) {
            k0Var.f3431a = 0;
            k0Var.f3432b = null;
            k0Var.f3433c = null;
            k0.f3430d.c(k0Var);
        }
    }

    public void N() {
        Object obj;
        Integer num;
        l lVar = (l) this.f108g;
        lVar.getClass();
        String str = (String) this.f109h;
        c.e("key", str);
        if (!lVar.f1169d.contains(str) && (num = (Integer) lVar.f1167b.remove(str)) != null) {
            lVar.f1166a.remove(num);
        }
        lVar.e.remove(str);
        LinkedHashMap linkedHashMap = lVar.f1170f;
        if (linkedHashMap.containsKey(str)) {
            Log.w("ActivityResultRegistry", "Dropping pending result for request " + str + ": " + linkedHashMap.get(str));
            linkedHashMap.remove(str);
        }
        Bundle bundle = lVar.f1171g;
        if (bundle.containsKey(str)) {
            Class cls = C0088a.class;
            if (Build.VERSION.SDK_INT >= 34) {
                obj = J.a.a(bundle, str, cls);
            } else {
                obj = bundle.getParcelable(str);
                if (!cls.isInstance(obj)) {
                    obj = null;
                }
            }
            Log.w("ActivityResultRegistry", "Dropping pending result for request " + str + ": " + ((C0088a) obj));
            bundle.remove(str);
        }
        if (lVar.f1168c.get(str) != null) {
            throw new ClassCastException();
        }
    }

    public void a(Preference preference) {
        ((PreferenceGroup) this.f108g).f1927R = Integer.MAX_VALUE;
        u uVar = (u) this.f109h;
        Handler handler = uVar.f2598g;
        B b2 = uVar.f2599h;
        handler.removeCallbacks(b2);
        handler.post(b2);
    }

    public void b(a0 a0Var, C0017q qVar) {
        r.k kVar = (r.k) this.f108g;
        k0 k0Var = (k0) kVar.getOrDefault(a0Var, (Object) null);
        if (k0Var == null) {
            k0Var = k0.a();
            kVar.put(a0Var, k0Var);
        }
        k0Var.f3433c = qVar;
        k0Var.f3431a |= 8;
    }

    public boolean c(CharSequence charSequence, int i, int i2, androidx.emoji2.text.u uVar) {
        Spannable spannable;
        if ((uVar.f1549c & 4) > 0) {
            return true;
        }
        if (((x) this.f108g) == null) {
            if (charSequence instanceof Spannable) {
                spannable = (Spannable) charSequence;
            } else {
                spannable = new SpannableString(charSequence);
            }
            this.f108g = new x(spannable);
        }
        ((K0.e) this.f109h).getClass();
        ((x) this.f108g).setSpan(new androidx.emoji2.text.v(uVar), i, i2, 33);
        return true;
    }

    public void d(boolean z2) {
        androidx.fragment.app.r rVar = ((H) this.f109h).f1600v;
        if (rVar != null) {
            rVar.j().f1590l.d(true);
        }
        Iterator it2 = ((CopyOnWriteArrayList) this.f108g).iterator();
        if (!it2.hasNext()) {
            return;
        }
        if (it2.next() != null) {
            throw new ClassCastException();
        } else if (z2) {
            throw null;
        } else {
            throw null;
        }
    }

    public void e(boolean z2) {
        H h2 = (H) this.f109h;
        C0121l lVar = h2.f1598t.f1775g;
        androidx.fragment.app.r rVar = h2.f1600v;
        if (rVar != null) {
            rVar.j().f1590l.e(true);
        }
        Iterator it2 = ((CopyOnWriteArrayList) this.f108g).iterator();
        if (!it2.hasNext()) {
            return;
        }
        if (it2.next() != null) {
            throw new ClassCastException();
        } else if (z2) {
            throw null;
        } else {
            throw null;
        }
    }

    public void f(boolean z2) {
        androidx.fragment.app.r rVar = ((H) this.f109h).f1600v;
        if (rVar != null) {
            rVar.j().f1590l.f(true);
        }
        Iterator it2 = ((CopyOnWriteArrayList) this.f108g).iterator();
        if (!it2.hasNext()) {
            return;
        }
        if (it2.next() != null) {
            throw new ClassCastException();
        } else if (z2) {
            throw null;
        } else {
            throw null;
        }
    }

    public void g(boolean z2) {
        androidx.fragment.app.r rVar = ((H) this.f109h).f1600v;
        if (rVar != null) {
            rVar.j().f1590l.g(true);
        }
        Iterator it2 = ((CopyOnWriteArrayList) this.f108g).iterator();
        if (!it2.hasNext()) {
            return;
        }
        if (it2.next() != null) {
            throw new ClassCastException();
        } else if (z2) {
            throw null;
        } else {
            throw null;
        }
    }

    public Object h() {
        return (x) this.f108g;
    }

    public void i(boolean z2) {
        androidx.fragment.app.r rVar = ((H) this.f109h).f1600v;
        if (rVar != null) {
            rVar.j().f1590l.i(true);
        }
        Iterator it2 = ((CopyOnWriteArrayList) this.f108g).iterator();
        if (!it2.hasNext()) {
            return;
        }
        if (it2.next() != null) {
            throw new ClassCastException();
        } else if (z2) {
            throw null;
        } else {
            throw null;
        }
    }

    public void j(boolean z2) {
        androidx.fragment.app.r rVar = ((H) this.f109h).f1600v;
        if (rVar != null) {
            rVar.j().f1590l.j(true);
        }
        Iterator it2 = ((CopyOnWriteArrayList) this.f108g).iterator();
        if (!it2.hasNext()) {
            return;
        }
        if (it2.next() != null) {
            throw new ClassCastException();
        } else if (z2) {
            throw null;
        } else {
            throw null;
        }
    }

    public void k(boolean z2) {
        H h2 = (H) this.f109h;
        C0121l lVar = h2.f1598t.f1775g;
        androidx.fragment.app.r rVar = h2.f1600v;
        if (rVar != null) {
            rVar.j().f1590l.k(true);
        }
        Iterator it2 = ((CopyOnWriteArrayList) this.f108g).iterator();
        if (!it2.hasNext()) {
            return;
        }
        if (it2.next() != null) {
            throw new ClassCastException();
        } else if (z2) {
            throw null;
        } else {
            throw null;
        }
    }

    public w0 l(View view, w0 w0Var) {
        boolean z2;
        int i;
        int i2;
        View view2 = view;
        w0 w0Var2 = w0Var;
        o oVar = (o) this.f109h;
        int i3 = oVar.f221a;
        L.j jVar = (L.j) this.f108g;
        u0 u0Var = w0Var2.f597a;
        F.c f2 = u0Var.f(7);
        F.c f3 = u0Var.f(32);
        int i4 = f2.f226b;
        BottomSheetBehavior bottomSheetBehavior = (BottomSheetBehavior) jVar.f463b;
        bottomSheetBehavior.f2158w = i4;
        boolean e = E0.m.e(view);
        int paddingBottom = view.getPaddingBottom();
        int paddingLeft = view.getPaddingLeft();
        int paddingRight = view.getPaddingRight();
        boolean z3 = bottomSheetBehavior.f2150o;
        if (z3) {
            int a2 = w0Var.a();
            bottomSheetBehavior.f2157v = a2;
            paddingBottom = a2 + oVar.f223c;
        }
        int i5 = oVar.f222b;
        boolean z4 = bottomSheetBehavior.f2151p;
        int i6 = f2.f225a;
        if (z4) {
            if (e) {
                i2 = i5;
            } else {
                i2 = i3;
            }
            paddingLeft = i2 + i6;
        }
        boolean z5 = bottomSheetBehavior.f2152q;
        int i7 = f2.f227c;
        if (z5) {
            if (!e) {
                i3 = i5;
            }
            paddingRight = i3 + i7;
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        boolean z6 = true;
        if (!bottomSheetBehavior.f2154s || marginLayoutParams.leftMargin == i6) {
            z2 = false;
        } else {
            marginLayoutParams.leftMargin = i6;
            z2 = true;
        }
        if (bottomSheetBehavior.f2155t && marginLayoutParams.rightMargin != i7) {
            marginLayoutParams.rightMargin = i7;
            z2 = true;
        }
        if (!bottomSheetBehavior.f2156u || marginLayoutParams.topMargin == (i = f2.f226b)) {
            z6 = z2;
        } else {
            marginLayoutParams.topMargin = i;
        }
        if (z6) {
            view2.setLayoutParams(marginLayoutParams);
        }
        view2.setPadding(paddingLeft, view.getPaddingTop(), paddingRight, paddingBottom);
        boolean z7 = jVar.f462a;
        if (z7) {
            bottomSheetBehavior.f2148m = f3.f228d;
        }
        if (z3 || z7) {
            bottomSheetBehavior.I();
        }
        return w0Var2;
    }

    public void m() {
        ((Animator) this.f108g).end();
        if (Log.isLoggable("FragmentManager", 2)) {
            Objects.toString((S) this.f109h);
        }
    }

    public void n(boolean z2) {
        androidx.fragment.app.r rVar = ((H) this.f109h).f1600v;
        if (rVar != null) {
            rVar.j().f1590l.n(true);
        }
        Iterator it2 = ((CopyOnWriteArrayList) this.f108g).iterator();
        if (!it2.hasNext()) {
            return;
        }
        if (it2.next() != null) {
            throw new ClassCastException();
        } else if (z2) {
            throw null;
        } else {
            throw null;
        }
    }

    public void o(boolean z2) {
        androidx.fragment.app.r rVar = ((H) this.f109h).f1600v;
        if (rVar != null) {
            rVar.j().f1590l.o(true);
        }
        Iterator it2 = ((CopyOnWriteArrayList) this.f108g).iterator();
        if (!it2.hasNext()) {
            return;
        }
        if (it2.next() != null) {
            throw new ClassCastException();
        } else if (z2) {
            throw null;
        } else {
            throw null;
        }
    }

    public void p(boolean z2) {
        androidx.fragment.app.r rVar = ((H) this.f109h).f1600v;
        if (rVar != null) {
            rVar.j().f1590l.p(true);
        }
        Iterator it2 = ((CopyOnWriteArrayList) this.f108g).iterator();
        if (!it2.hasNext()) {
            return;
        }
        if (it2.next() != null) {
            throw new ClassCastException();
        } else if (z2) {
            throw null;
        } else {
            throw null;
        }
    }

    public void q(boolean z2) {
        androidx.fragment.app.r rVar = ((H) this.f109h).f1600v;
        if (rVar != null) {
            rVar.j().f1590l.q(true);
        }
        Iterator it2 = ((CopyOnWriteArrayList) this.f108g).iterator();
        if (!it2.hasNext()) {
            return;
        }
        if (it2.next() != null) {
            throw new ClassCastException();
        } else if (z2) {
            throw null;
        } else {
            throw null;
        }
    }

    public void r(boolean z2) {
        androidx.fragment.app.r rVar = ((H) this.f109h).f1600v;
        if (rVar != null) {
            rVar.j().f1590l.r(true);
        }
        Iterator it2 = ((CopyOnWriteArrayList) this.f108g).iterator();
        if (!it2.hasNext()) {
            return;
        }
        if (it2.next() != null) {
            throw new ClassCastException();
        } else if (z2) {
            throw null;
        } else {
            throw null;
        }
    }

    public void s(boolean z2) {
        androidx.fragment.app.r rVar = ((H) this.f109h).f1600v;
        if (rVar != null) {
            rVar.j().f1590l.s(true);
        }
        Iterator it2 = ((CopyOnWriteArrayList) this.f108g).iterator();
        if (!it2.hasNext()) {
            return;
        }
        if (it2.next() != null) {
            throw new ClassCastException();
        } else if (z2) {
            throw null;
        } else {
            throw null;
        }
    }

    public void t(boolean z2) {
        androidx.fragment.app.r rVar = ((H) this.f109h).f1600v;
        if (rVar != null) {
            rVar.j().f1590l.t(true);
        }
        Iterator it2 = ((CopyOnWriteArrayList) this.f108g).iterator();
        if (!it2.hasNext()) {
            return;
        }
        if (it2.next() != null) {
            throw new ClassCastException();
        } else if (z2) {
            throw null;
        } else {
            throw null;
        }
    }

    public String toString() {
        switch (this.f107f) {
            case 3:
                return "Bounds{lower=" + ((F.c) this.f108g) + " upper=" + ((F.c) this.f109h) + "}";
            case 20:
                String str = "[ ";
                if (((C0340f) this.f108g) != null) {
                    for (int i = 0; i < 9; i++) {
                        str = str + ((C0340f) this.f108g).f4673h[i] + " ";
                    }
                }
                return str + "] " + ((C0340f) this.f108g);
            default:
                return super.toString();
        }
    }

    public void u(int i) {
        int[] iArr = (int[]) this.f108g;
        if (iArr == null) {
            int[] iArr2 = new int[(Math.max(i, 10) + 1)];
            this.f108g = iArr2;
            Arrays.fill(iArr2, -1);
        } else if (i >= iArr.length) {
            int length = iArr.length;
            while (length <= i) {
                length *= 2;
            }
            int[] iArr3 = new int[length];
            this.f108g = iArr3;
            System.arraycopy(iArr, 0, iArr3, 0, iArr.length);
            int[] iArr4 = (int[]) this.f108g;
            Arrays.fill(iArr4, iArr.length, iArr4.length, -1);
        }
    }

    public View w(int i, int i2, int i3, int i4) {
        int i5;
        View view;
        I i6 = (I) this.f108g;
        int d2 = i6.d();
        int c2 = i6.c();
        if (i2 > i) {
            i5 = 1;
        } else {
            i5 = -1;
        }
        View view2 = null;
        while (i != i2) {
            switch (i6.f3271a) {
                case 0:
                    view = i6.f3272b.u(i);
                    break;
                default:
                    view = i6.f3272b.u(i);
                    break;
            }
            int b2 = i6.b(view);
            int a2 = i6.a(view);
            j0 j0Var = (j0) this.f109h;
            j0Var.f3426b = d2;
            j0Var.f3427c = c2;
            j0Var.f3428d = b2;
            j0Var.e = a2;
            if (i3 != 0) {
                j0Var.f3425a = i3;
                if (j0Var.a()) {
                    return view;
                }
            }
            if (i4 != 0) {
                j0Var.f3425a = i4;
                if (j0Var.a()) {
                    view2 = view;
                }
            }
            i += i5;
        }
        return view2;
    }

    public void x(z zVar) {
        ArrayDeque arrayDeque = (ArrayDeque) this.f109h;
        synchronized (this) {
            try {
                if (arrayDeque.remove(zVar)) {
                    L();
                } else {
                    throw new AssertionError("Call wasn't in-flight!");
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void z() {
        ((SparseIntArray) this.f108g).clear();
    }

    public /* synthetic */ j(Object obj, Object obj2, int i, boolean z2) {
        this.f107f = i;
        this.f109h = obj;
        this.f108g = obj2;
    }

    public void M(int i, Bundle bundle, Messenger messenger) {
        Message obtain = Message.obtain();
        obtain.what = i;
        obtain.arg1 = 1;
        obtain.setData(bundle);
        obtain.replyTo = messenger;
        ((Messenger) this.f108g).send(obtain);
    }

    public j(C0338d dVar) {
        this.f107f = 20;
        this.f109h = dVar;
    }

    public j(H h2) {
        this.f107f = 9;
        this.f108g = new CopyOnWriteArrayList();
        this.f109h = h2;
    }

    public j(int i) {
        this.f107f = i;
        switch (i) {
            case 16:
                this.f108g = new SparseIntArray();
                this.f109h = new SparseIntArray();
                return;
            case 19:
                this.f108g = new r.k();
                this.f109h = new r.e();
                return;
            default:
                new ArrayDeque();
                this.f108g = new ArrayDeque();
                this.f109h = new ArrayDeque();
                return;
        }
    }

    /* JADX WARNING: type inference failed for: r2v1, types: [j0.j0, java.lang.Object] */
    public j(I i) {
        this.f107f = 18;
        this.f108g = i;
        ? obj = new Object();
        obj.f3425a = 0;
        this.f109h = obj;
    }

    public j(Animation animation) {
        this.f107f = 8;
        this.f108g = animation;
        this.f109h = null;
    }

    public j(Animator animator) {
        this.f107f = 8;
        this.f108g = null;
        this.f109h = animator;
    }

    public j(ArrayList arrayList, ArrayList arrayList2) {
        this.f107f = 0;
        int size = arrayList.size();
        this.f108g = new int[size];
        this.f109h = new float[size];
        for (int i = 0; i < size; i++) {
            ((int[]) this.f108g)[i] = ((Integer) arrayList.get(i)).intValue();
            ((float[]) this.f109h)[i] = ((Float) arrayList2.get(i)).floatValue();
        }
    }

    public j(int i, int i2) {
        this.f107f = 0;
        this.f108g = new int[]{i, i2};
        this.f109h = new float[]{0.0f, 1.0f};
    }

    public j(int i, int i2, int i3) {
        this.f107f = 0;
        this.f108g = new int[]{i, i2, i3};
        this.f109h = new float[]{0.0f, 0.5f, 1.0f};
    }

    /* JADX WARNING: type inference failed for: r2v1, types: [android.text.Editable$Factory, X.a] */
    /* JADX WARNING: Can't wrap try/catch for region: R(6:7|8|9|10|11|12) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x0031 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public j(android.widget.EditText r6) {
        /*
            r5 = this;
            r0 = 4
            r5.f107f = r0
            r0 = 0
            r5.<init>()
            r5.f108g = r6
            X.i r1 = new X.i
            r1.<init>(r6)
            r5.f109h = r1
            r6.addTextChangedListener(r1)
            X.a r1 = X.a.f980b
            if (r1 != 0) goto L_0x003a
            java.lang.Object r1 = X.a.f979a
            monitor-enter(r1)
            X.a r2 = X.a.f980b     // Catch:{ all -> 0x0034 }
            if (r2 != 0) goto L_0x0036
            X.a r2 = new X.a     // Catch:{ all -> 0x0034 }
            r2.<init>()     // Catch:{ all -> 0x0034 }
            java.lang.String r3 = "android.text.DynamicLayout$ChangeWatcher"
            java.lang.Class<X.a> r4 = X.a.class
            java.lang.ClassLoader r4 = r4.getClassLoader()     // Catch:{ all -> 0x0031 }
            java.lang.Class r0 = java.lang.Class.forName(r3, r0, r4)     // Catch:{ all -> 0x0031 }
            X.a.f981c = r0     // Catch:{ all -> 0x0031 }
        L_0x0031:
            X.a.f980b = r2     // Catch:{ all -> 0x0034 }
            goto L_0x0036
        L_0x0034:
            r6 = move-exception
            goto L_0x0038
        L_0x0036:
            monitor-exit(r1)     // Catch:{ all -> 0x0034 }
            goto L_0x003a
        L_0x0038:
            monitor-exit(r1)     // Catch:{ all -> 0x0034 }
            throw r6
        L_0x003a:
            X.a r0 = X.a.f980b
            r6.setEditableFactory(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: E.j.<init>(android.widget.EditText):void");
    }
}
