package j0;

import M.c;
import N.F;
import N.Q;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.support.v4.media.session.t;
import android.util.AttributeSet;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import g.C0096a;
import g1.o;
import java.util.ArrayList;
import java.util.WeakHashMap;
import o.C0297p0;
import o.C0302s;

/* renamed from: j0.b  reason: case insensitive filesystem */
public final class C0140b {

    /* renamed from: a  reason: collision with root package name */
    public int f3354a;

    /* renamed from: b  reason: collision with root package name */
    public final Object f3355b;

    /* renamed from: c  reason: collision with root package name */
    public final Object f3356c;

    /* renamed from: d  reason: collision with root package name */
    public Object f3357d;
    public Object e;

    /* renamed from: f  reason: collision with root package name */
    public Object f3358f;

    public C0140b(View view) {
        this.f3354a = -1;
        this.f3355b = view;
        this.f3356c = C0302s.a();
    }

    public void m() {
        this.f3354a = -1;
        r((ColorStateList) null);
        a();
    }

    public void a() {
        View view = (View) this.f3355b;
        Drawable background = view.getBackground();
        if (background != null) {
            int i = Build.VERSION.SDK_INT;
            if (i <= 21 ? i == 21 : ((o) this.f3357d) != null) {
                if (((o) this.f3358f) == null) {
                    this.f3358f = new Object();
                }
                o oVar = (o) this.f3358f;
                oVar.f2744c = null;
                oVar.f2743b = false;
                oVar.f2745d = null;
                oVar.f2742a = false;
                WeakHashMap weakHashMap = Q.f509a;
                ColorStateList g2 = F.g(view);
                if (g2 != null) {
                    oVar.f2743b = true;
                    oVar.f2744c = g2;
                }
                PorterDuff.Mode h2 = F.h(view);
                if (h2 != null) {
                    oVar.f2742a = true;
                    oVar.f2745d = h2;
                }
                if (oVar.f2743b || oVar.f2742a) {
                    C0302s.e(background, oVar, view.getDrawableState());
                    return;
                }
            }
            o oVar2 = (o) this.e;
            if (oVar2 != null) {
                C0302s.e(background, oVar2, view.getDrawableState());
                return;
            }
            o oVar3 = (o) this.f3357d;
            if (oVar3 != null) {
                C0302s.e(background, oVar3, view.getDrawableState());
            }
        }
    }

    public boolean b(int i) {
        ArrayList arrayList = (ArrayList) this.f3357d;
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            C0139a aVar = (C0139a) arrayList.get(i2);
            int i3 = aVar.f3333a;
            if (i3 == 8) {
                if (g(aVar.f3336d, i2 + 1) == i) {
                    return true;
                }
            } else if (i3 == 1) {
                int i4 = aVar.f3334b;
                int i5 = aVar.f3336d + i4;
                while (i4 < i5) {
                    if (g(i4, i2 + 1) == i) {
                        return true;
                    }
                    i4++;
                }
                continue;
            } else {
                continue;
            }
        }
        return false;
    }

    public void c() {
        ArrayList arrayList = (ArrayList) this.f3357d;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            ((B) this.e).a((C0139a) arrayList.get(i));
        }
        q(arrayList);
        this.f3354a = 0;
    }

    public void e(C0139a aVar) {
        int i;
        c cVar;
        int i2 = aVar.f3333a;
        if (i2 == 1 || i2 == 8) {
            throw new IllegalArgumentException("should not dispatch add or move for pre layout");
        }
        int u2 = u(aVar.f3334b, i2);
        int i3 = aVar.f3334b;
        int i4 = aVar.f3333a;
        if (i4 == 2) {
            i = 0;
        } else if (i4 == 4) {
            i = 1;
        } else {
            throw new IllegalArgumentException("op should be remove or update." + aVar);
        }
        int i5 = 1;
        int i6 = 1;
        while (true) {
            int i7 = aVar.f3336d;
            cVar = (c) this.f3355b;
            if (i5 >= i7) {
                break;
            }
            int u3 = u((i * i5) + aVar.f3334b, aVar.f3333a);
            int i8 = aVar.f3333a;
            if (i8 == 2 ? u3 != u2 : !(i8 == 4 && u3 == u2 + 1)) {
                C0139a l2 = l(aVar.f3335c, i8, u2, i6);
                f(l2, i3);
                l2.f3335c = null;
                cVar.c(l2);
                if (aVar.f3333a == 4) {
                    i3 += i6;
                }
                u2 = u3;
                i6 = 1;
            } else {
                i6++;
            }
            i5++;
        }
        Object obj = aVar.f3335c;
        aVar.f3335c = null;
        cVar.c(aVar);
        if (i6 > 0) {
            C0139a l3 = l(obj, aVar.f3333a, u2, i6);
            f(l3, i3);
            l3.f3335c = null;
            cVar.c(l3);
        }
    }

    public void f(C0139a aVar, int i) {
        B b2 = (B) this.e;
        b2.a(aVar);
        int i2 = aVar.f3333a;
        if (i2 == 2) {
            int i3 = aVar.f3336d;
            RecyclerView recyclerView = b2.f3263a;
            recyclerView.O(i, i3, true);
            recyclerView.m0 = true;
            recyclerView.f2016j0.f3317c += i3;
        } else if (i2 == 4) {
            b2.c(i, aVar.f3336d, aVar.f3335c);
        } else {
            throw new IllegalArgumentException("only remove and update ops can be dispatched in first pass");
        }
    }

    public int g(int i, int i2) {
        ArrayList arrayList = (ArrayList) this.f3357d;
        int size = arrayList.size();
        while (i2 < size) {
            C0139a aVar = (C0139a) arrayList.get(i2);
            int i3 = aVar.f3333a;
            if (i3 == 8) {
                int i4 = aVar.f3334b;
                if (i4 == i) {
                    i = aVar.f3336d;
                } else {
                    if (i4 < i) {
                        i--;
                    }
                    if (aVar.f3336d <= i) {
                        i++;
                    }
                }
            } else {
                int i5 = aVar.f3334b;
                if (i5 > i) {
                    continue;
                } else if (i3 == 2) {
                    int i6 = aVar.f3336d;
                    if (i < i5 + i6) {
                        return -1;
                    }
                    i -= i6;
                } else if (i3 == 1) {
                    i += aVar.f3336d;
                }
            }
            i2++;
        }
        return i;
    }

    public ColorStateList h() {
        o oVar = (o) this.e;
        if (oVar != null) {
            return (ColorStateList) oVar.f2744c;
        }
        return null;
    }

    public PorterDuff.Mode i() {
        o oVar = (o) this.e;
        if (oVar != null) {
            return (PorterDuff.Mode) oVar.f2745d;
        }
        return null;
    }

    public boolean j() {
        if (((ArrayList) this.f3356c).size() > 0) {
            return true;
        }
        return false;
    }

    public void k(AttributeSet attributeSet, int i) {
        ColorStateList i2;
        View view = (View) this.f3355b;
        Context context = view.getContext();
        int[] iArr = C0096a.f2542z;
        t A2 = t.A(context, attributeSet, iArr, i);
        TypedArray typedArray = (TypedArray) A2.f1132c;
        View view2 = (View) this.f3355b;
        Q.o(view2, view2.getContext(), iArr, attributeSet, (TypedArray) A2.f1132c, i);
        boolean z2 = false;
        try {
            if (typedArray.hasValue(0)) {
                this.f3354a = typedArray.getResourceId(0, -1);
                C0302s sVar = (C0302s) this.f3356c;
                Context context2 = view.getContext();
                int i3 = this.f3354a;
                synchronized (sVar) {
                    i2 = sVar.f4296a.i(context2, i3);
                }
                if (i2 != null) {
                    r(i2);
                }
            }
            if (typedArray.hasValue(1)) {
                Q.r(view, A2.n(1));
            }
            if (typedArray.hasValue(2)) {
                PorterDuff.Mode c2 = C0297p0.c(typedArray.getInt(2, -1), (PorterDuff.Mode) null);
                int i4 = Build.VERSION.SDK_INT;
                F.r(view, c2);
                if (i4 == 21) {
                    Drawable background = view.getBackground();
                    if (!(F.g(view) == null && F.h(view) == null)) {
                        z2 = true;
                    }
                    if (background != null && z2) {
                        if (background.isStateful()) {
                            background.setState(view.getDrawableState());
                        }
                        view.setBackground(background);
                    }
                }
            }
            A2.C();
        } catch (Throwable th) {
            A2.C();
            throw th;
        }
    }

    /* JADX WARNING: type inference failed for: r0v4, types: [j0.a, java.lang.Object] */
    public C0139a l(Object obj, int i, int i2, int i3) {
        C0139a aVar = (C0139a) ((c) this.f3355b).a();
        if (aVar == null) {
            ? obj2 = new Object();
            obj2.f3333a = i;
            obj2.f3334b = i2;
            obj2.f3336d = i3;
            obj2.f3335c = obj;
            return obj2;
        }
        aVar.f3333a = i;
        aVar.f3334b = i2;
        aVar.f3336d = i3;
        aVar.f3335c = obj;
        return aVar;
    }

    public void n(int i) {
        ColorStateList colorStateList;
        this.f3354a = i;
        C0302s sVar = (C0302s) this.f3356c;
        if (sVar != null) {
            Context context = ((View) this.f3355b).getContext();
            synchronized (sVar) {
                colorStateList = sVar.f4296a.i(context, i);
            }
        } else {
            colorStateList = null;
        }
        r(colorStateList);
        a();
    }

    public void o(C0139a aVar) {
        ((ArrayList) this.f3357d).add(aVar);
        int i = aVar.f3333a;
        B b2 = (B) this.e;
        if (i == 1) {
            b2.d(aVar.f3334b, aVar.f3336d);
        } else if (i == 2) {
            int i2 = aVar.f3334b;
            int i3 = aVar.f3336d;
            RecyclerView recyclerView = b2.f3263a;
            recyclerView.O(i2, i3, false);
            recyclerView.m0 = true;
        } else if (i == 4) {
            b2.c(aVar.f3334b, aVar.f3336d, aVar.f3335c);
        } else if (i == 8) {
            b2.e(aVar.f3334b, aVar.f3336d);
        } else {
            throw new IllegalArgumentException("Unknown update op type for " + aVar);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:177:0x000d A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x006f  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x0074  */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x0090  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x0094  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x00a5  */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x00aa  */
    /* JADX WARNING: Removed duplicated region for block: B:71:0x0121  */
    /* JADX WARNING: Removed duplicated region for block: B:72:0x0135  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void p() {
        /*
            r17 = this;
            r0 = r17
            java.lang.Object r1 = r0.f3356c
            java.util.ArrayList r1 = (java.util.ArrayList) r1
            java.lang.Object r2 = r0.f3358f
            j0.w r2 = (j0.C0160w) r2
            r2.getClass()
        L_0x000d:
            int r3 = r1.size()
            r4 = 1
            int r3 = r3 - r4
            r6 = 0
        L_0x0014:
            r7 = -1
            r8 = 8
            if (r3 < 0) goto L_0x002a
            java.lang.Object r9 = r1.get(r3)
            j0.a r9 = (j0.C0139a) r9
            int r9 = r9.f3333a
            if (r9 != r8) goto L_0x0026
            if (r6 == 0) goto L_0x0027
            goto L_0x002b
        L_0x0026:
            r6 = 1
        L_0x0027:
            int r3 = r3 + -1
            goto L_0x0014
        L_0x002a:
            r3 = -1
        L_0x002b:
            r6 = 4
            r9 = 2
            r10 = 0
            if (r3 == r7) goto L_0x01d5
            int r8 = r3 + 1
            java.lang.Object r11 = r1.get(r3)
            j0.a r11 = (j0.C0139a) r11
            java.lang.Object r12 = r1.get(r8)
            j0.a r12 = (j0.C0139a) r12
            int r13 = r12.f3333a
            if (r13 == r4) goto L_0x01ab
            java.lang.Object r7 = r2.f3516f
            j0.b r7 = (j0.C0140b) r7
            if (r13 == r9) goto L_0x00af
            if (r13 == r6) goto L_0x004b
            goto L_0x000d
        L_0x004b:
            int r5 = r11.f3336d
            int r9 = r12.f3334b
            if (r5 >= r9) goto L_0x0056
            int r9 = r9 + -1
            r12.f3334b = r9
            goto L_0x0068
        L_0x0056:
            int r13 = r12.f3336d
            int r9 = r9 + r13
            if (r5 >= r9) goto L_0x0068
            int r13 = r13 + -1
            r12.f3336d = r13
            int r5 = r11.f3334b
            java.lang.Object r9 = r12.f3335c
            j0.a r4 = r7.l(r9, r6, r5, r4)
            goto L_0x0069
        L_0x0068:
            r4 = r10
        L_0x0069:
            int r5 = r11.f3334b
            int r9 = r12.f3334b
            if (r5 > r9) goto L_0x0074
            int r9 = r9 + 1
            r12.f3334b = r9
            goto L_0x0088
        L_0x0074:
            int r13 = r12.f3336d
            int r9 = r9 + r13
            if (r5 >= r9) goto L_0x0088
            int r9 = r9 - r5
            int r5 = r5 + 1
            java.lang.Object r13 = r12.f3335c
            j0.a r5 = r7.l(r13, r6, r5, r9)
            int r6 = r12.f3336d
            int r6 = r6 - r9
            r12.f3336d = r6
            goto L_0x0089
        L_0x0088:
            r5 = r10
        L_0x0089:
            r1.set(r8, r11)
            int r6 = r12.f3336d
            if (r6 <= 0) goto L_0x0094
            r1.set(r3, r12)
            goto L_0x00a3
        L_0x0094:
            r1.remove(r3)
            r7.getClass()
            r12.f3335c = r10
            java.lang.Object r6 = r7.f3355b
            M.c r6 = (M.c) r6
            r6.c(r12)
        L_0x00a3:
            if (r4 == 0) goto L_0x00a8
            r1.add(r3, r4)
        L_0x00a8:
            if (r5 == 0) goto L_0x000d
            r1.add(r3, r5)
            goto L_0x000d
        L_0x00af:
            int r6 = r11.f3334b
            int r13 = r11.f3336d
            if (r6 >= r13) goto L_0x00c4
            int r14 = r12.f3334b
            if (r14 != r6) goto L_0x00c2
            int r14 = r12.f3336d
            int r6 = r13 - r6
            if (r14 != r6) goto L_0x00c2
            r5 = 1
        L_0x00c0:
            r6 = 0
            goto L_0x00d4
        L_0x00c2:
            r5 = 0
            goto L_0x00c0
        L_0x00c4:
            int r14 = r12.f3334b
            int r15 = r13 + 1
            if (r14 != r15) goto L_0x00d2
            int r14 = r12.f3336d
            int r6 = r6 - r13
            if (r14 != r6) goto L_0x00d2
            r5 = 1
        L_0x00d0:
            r6 = 1
            goto L_0x00d4
        L_0x00d2:
            r5 = 0
            goto L_0x00d0
        L_0x00d4:
            int r14 = r12.f3334b
            if (r13 >= r14) goto L_0x00dd
            int r14 = r14 + -1
            r12.f3334b = r14
            goto L_0x00ff
        L_0x00dd:
            int r15 = r12.f3336d
            int r14 = r14 + r15
            if (r13 >= r14) goto L_0x00ff
            int r15 = r15 + -1
            r12.f3336d = r15
            r11.f3333a = r9
            r11.f3336d = r4
            int r3 = r12.f3336d
            if (r3 != 0) goto L_0x000d
            r1.remove(r8)
            r7.getClass()
            r12.f3335c = r10
            java.lang.Object r3 = r7.f3355b
            M.c r3 = (M.c) r3
            r3.c(r12)
            goto L_0x000d
        L_0x00ff:
            int r4 = r11.f3334b
            int r13 = r12.f3334b
            if (r4 > r13) goto L_0x010a
            int r13 = r13 + 1
            r12.f3334b = r13
            goto L_0x011e
        L_0x010a:
            int r14 = r12.f3336d
            int r13 = r13 + r14
            if (r4 >= r13) goto L_0x011e
            int r13 = r13 - r4
            int r4 = r4 + 1
            j0.a r4 = r7.l(r10, r9, r4, r13)
            int r9 = r11.f3334b
            int r13 = r12.f3334b
            int r9 = r9 - r13
            r12.f3336d = r9
            goto L_0x011f
        L_0x011e:
            r4 = r10
        L_0x011f:
            if (r5 == 0) goto L_0x0135
            r1.set(r3, r12)
            r1.remove(r8)
            r7.getClass()
            r11.f3335c = r10
            java.lang.Object r3 = r7.f3355b
            M.c r3 = (M.c) r3
            r3.c(r11)
            goto L_0x000d
        L_0x0135:
            if (r6 == 0) goto L_0x0166
            if (r4 == 0) goto L_0x014f
            int r5 = r11.f3334b
            int r6 = r4.f3334b
            if (r5 <= r6) goto L_0x0144
            int r6 = r4.f3336d
            int r5 = r5 - r6
            r11.f3334b = r5
        L_0x0144:
            int r5 = r11.f3336d
            int r6 = r4.f3334b
            if (r5 <= r6) goto L_0x014f
            int r6 = r4.f3336d
            int r5 = r5 - r6
            r11.f3336d = r5
        L_0x014f:
            int r5 = r11.f3334b
            int r6 = r12.f3334b
            if (r5 <= r6) goto L_0x015a
            int r6 = r12.f3336d
            int r5 = r5 - r6
            r11.f3334b = r5
        L_0x015a:
            int r5 = r11.f3336d
            int r6 = r12.f3334b
            if (r5 <= r6) goto L_0x0194
            int r6 = r12.f3336d
            int r5 = r5 - r6
            r11.f3336d = r5
            goto L_0x0194
        L_0x0166:
            if (r4 == 0) goto L_0x017e
            int r5 = r11.f3334b
            int r6 = r4.f3334b
            if (r5 < r6) goto L_0x0173
            int r6 = r4.f3336d
            int r5 = r5 - r6
            r11.f3334b = r5
        L_0x0173:
            int r5 = r11.f3336d
            int r6 = r4.f3334b
            if (r5 < r6) goto L_0x017e
            int r6 = r4.f3336d
            int r5 = r5 - r6
            r11.f3336d = r5
        L_0x017e:
            int r5 = r11.f3334b
            int r6 = r12.f3334b
            if (r5 < r6) goto L_0x0189
            int r6 = r12.f3336d
            int r5 = r5 - r6
            r11.f3334b = r5
        L_0x0189:
            int r5 = r11.f3336d
            int r6 = r12.f3334b
            if (r5 < r6) goto L_0x0194
            int r6 = r12.f3336d
            int r5 = r5 - r6
            r11.f3336d = r5
        L_0x0194:
            r1.set(r3, r12)
            int r5 = r11.f3334b
            int r6 = r11.f3336d
            if (r5 == r6) goto L_0x01a1
            r1.set(r8, r11)
            goto L_0x01a4
        L_0x01a1:
            r1.remove(r8)
        L_0x01a4:
            if (r4 == 0) goto L_0x000d
            r1.add(r3, r4)
            goto L_0x000d
        L_0x01ab:
            int r4 = r11.f3336d
            int r6 = r12.f3334b
            if (r4 >= r6) goto L_0x01b3
            r5 = -1
            goto L_0x01b4
        L_0x01b3:
            r5 = 0
        L_0x01b4:
            int r7 = r11.f3334b
            if (r7 >= r6) goto L_0x01ba
            int r5 = r5 + 1
        L_0x01ba:
            if (r6 > r7) goto L_0x01c1
            int r6 = r12.f3336d
            int r7 = r7 + r6
            r11.f3334b = r7
        L_0x01c1:
            int r6 = r12.f3334b
            if (r6 > r4) goto L_0x01ca
            int r7 = r12.f3336d
            int r4 = r4 + r7
            r11.f3336d = r4
        L_0x01ca:
            int r6 = r6 + r5
            r12.f3334b = r6
            r1.set(r3, r12)
            r1.set(r8, r11)
            goto L_0x000d
        L_0x01d5:
            int r2 = r1.size()
            r3 = 0
        L_0x01da:
            if (r3 >= r2) goto L_0x02ad
            java.lang.Object r11 = r1.get(r3)
            j0.a r11 = (j0.C0139a) r11
            int r12 = r11.f3333a
            if (r12 == r4) goto L_0x02a3
            java.lang.Object r13 = r0.f3355b
            M.c r13 = (M.c) r13
            java.lang.Object r14 = r0.e
            j0.B r14 = (j0.B) r14
            if (r12 == r9) goto L_0x024c
            if (r12 == r6) goto L_0x01fb
            if (r12 == r8) goto L_0x01f6
            goto L_0x02a6
        L_0x01f6:
            r0.o(r11)
            goto L_0x02a6
        L_0x01fb:
            int r12 = r11.f3334b
            int r15 = r11.f3336d
            int r15 = r15 + r12
            r5 = r12
            r7 = 0
            r8 = -1
        L_0x0203:
            if (r12 >= r15) goto L_0x0233
            j0.a0 r16 = r14.b(r12)
            if (r16 != 0) goto L_0x0221
            boolean r16 = r0.b(r12)
            if (r16 == 0) goto L_0x0212
            goto L_0x0221
        L_0x0212:
            if (r8 != r4) goto L_0x021f
            java.lang.Object r8 = r11.f3335c
            j0.a r5 = r0.l(r8, r6, r5, r7)
            r0.o(r5)
            r5 = r12
            r7 = 0
        L_0x021f:
            r8 = 0
            goto L_0x022f
        L_0x0221:
            if (r8 != 0) goto L_0x022e
            java.lang.Object r8 = r11.f3335c
            j0.a r5 = r0.l(r8, r6, r5, r7)
            r0.e(r5)
            r5 = r12
            r7 = 0
        L_0x022e:
            r8 = 1
        L_0x022f:
            int r7 = r7 + r4
            int r12 = r12 + 1
            goto L_0x0203
        L_0x0233:
            int r12 = r11.f3336d
            if (r7 == r12) goto L_0x0242
            java.lang.Object r12 = r11.f3335c
            r11.f3335c = r10
            r13.c(r11)
            j0.a r11 = r0.l(r12, r6, r5, r7)
        L_0x0242:
            if (r8 != 0) goto L_0x0248
            r0.e(r11)
            goto L_0x02a6
        L_0x0248:
            r0.o(r11)
            goto L_0x02a6
        L_0x024c:
            int r5 = r11.f3334b
            int r7 = r11.f3336d
            int r7 = r7 + r5
            r8 = r5
            r12 = 0
            r15 = -1
        L_0x0254:
            if (r8 >= r7) goto L_0x028c
            j0.a0 r16 = r14.b(r8)
            if (r16 != 0) goto L_0x0272
            boolean r16 = r0.b(r8)
            if (r16 == 0) goto L_0x0263
            goto L_0x0272
        L_0x0263:
            if (r15 != r4) goto L_0x026e
            j0.a r15 = r0.l(r10, r9, r5, r12)
            r0.o(r15)
            r15 = 1
            goto L_0x026f
        L_0x026e:
            r15 = 0
        L_0x026f:
            r16 = 0
            goto L_0x0280
        L_0x0272:
            if (r15 != 0) goto L_0x027d
            j0.a r15 = r0.l(r10, r9, r5, r12)
            r0.e(r15)
            r15 = 1
            goto L_0x027e
        L_0x027d:
            r15 = 0
        L_0x027e:
            r16 = 1
        L_0x0280:
            if (r15 == 0) goto L_0x0286
            int r8 = r8 - r12
            int r7 = r7 - r12
            r12 = 1
            goto L_0x0288
        L_0x0286:
            int r12 = r12 + 1
        L_0x0288:
            int r8 = r8 + r4
            r15 = r16
            goto L_0x0254
        L_0x028c:
            int r7 = r11.f3336d
            if (r12 == r7) goto L_0x0299
            r11.f3335c = r10
            r13.c(r11)
            j0.a r11 = r0.l(r10, r9, r5, r12)
        L_0x0299:
            if (r15 != 0) goto L_0x029f
            r0.e(r11)
            goto L_0x02a6
        L_0x029f:
            r0.o(r11)
            goto L_0x02a6
        L_0x02a3:
            r0.o(r11)
        L_0x02a6:
            int r3 = r3 + 1
            r7 = -1
            r8 = 8
            goto L_0x01da
        L_0x02ad:
            r1.clear()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: j0.C0140b.p():void");
    }

    public void r(ColorStateList colorStateList) {
        if (colorStateList != null) {
            if (((o) this.f3357d) == null) {
                this.f3357d = new Object();
            }
            o oVar = (o) this.f3357d;
            oVar.f2744c = colorStateList;
            oVar.f2743b = true;
        } else {
            this.f3357d = null;
        }
        a();
    }

    public void s(ColorStateList colorStateList) {
        if (((o) this.e) == null) {
            this.e = new Object();
        }
        o oVar = (o) this.e;
        oVar.f2744c = colorStateList;
        oVar.f2743b = true;
        a();
    }

    public void t(PorterDuff.Mode mode) {
        if (((o) this.e) == null) {
            this.e = new Object();
        }
        o oVar = (o) this.e;
        oVar.f2745d = mode;
        oVar.f2742a = true;
        a();
    }

    public int u(int i, int i2) {
        int i3;
        int i4;
        ArrayList arrayList = (ArrayList) this.f3357d;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            C0139a aVar = (C0139a) arrayList.get(size);
            int i5 = aVar.f3333a;
            if (i5 == 8) {
                int i6 = aVar.f3334b;
                int i7 = aVar.f3336d;
                if (i6 < i7) {
                    i4 = i6;
                    i3 = i7;
                } else {
                    i3 = i6;
                    i4 = i7;
                }
                if (i < i4 || i > i3) {
                    if (i < i6) {
                        if (i2 == 1) {
                            aVar.f3334b = i6 + 1;
                            aVar.f3336d = i7 + 1;
                        } else if (i2 == 2) {
                            aVar.f3334b = i6 - 1;
                            aVar.f3336d = i7 - 1;
                        }
                    }
                } else if (i4 == i6) {
                    if (i2 == 1) {
                        aVar.f3336d = i7 + 1;
                    } else if (i2 == 2) {
                        aVar.f3336d = i7 - 1;
                    }
                    i++;
                } else {
                    if (i2 == 1) {
                        aVar.f3334b = i6 + 1;
                    } else if (i2 == 2) {
                        aVar.f3334b = i6 - 1;
                    }
                    i--;
                }
            } else {
                int i8 = aVar.f3334b;
                if (i8 <= i) {
                    if (i5 == 1) {
                        i -= aVar.f3336d;
                    } else if (i5 == 2) {
                        i += aVar.f3336d;
                    }
                } else if (i2 == 1) {
                    aVar.f3334b = i8 + 1;
                } else if (i2 == 2) {
                    aVar.f3334b = i8 - 1;
                }
            }
        }
        for (int size2 = arrayList.size() - 1; size2 >= 0; size2--) {
            C0139a aVar2 = (C0139a) arrayList.get(size2);
            int i9 = aVar2.f3333a;
            c cVar = (c) this.f3355b;
            if (i9 == 8) {
                int i10 = aVar2.f3336d;
                if (i10 == aVar2.f3334b || i10 < 0) {
                    arrayList.remove(size2);
                    aVar2.f3335c = null;
                    cVar.c(aVar2);
                }
            } else if (aVar2.f3336d <= 0) {
                arrayList.remove(size2);
                aVar2.f3335c = null;
                cVar.c(aVar2);
            }
        }
        return i;
    }

    public void d() {
        c();
        ArrayList arrayList = (ArrayList) this.f3356c;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            C0139a aVar = (C0139a) arrayList.get(i);
            int i2 = aVar.f3333a;
            B b2 = (B) this.e;
            if (i2 == 1) {
                b2.a(aVar);
                b2.d(aVar.f3334b, aVar.f3336d);
            } else if (i2 == 2) {
                b2.a(aVar);
                int i3 = aVar.f3334b;
                int i4 = aVar.f3336d;
                RecyclerView recyclerView = b2.f3263a;
                recyclerView.O(i3, i4, true);
                recyclerView.m0 = true;
                recyclerView.f2016j0.f3317c += i4;
            } else if (i2 == 4) {
                b2.a(aVar);
                b2.c(aVar.f3334b, aVar.f3336d, aVar.f3335c);
            } else if (i2 == 8) {
                b2.a(aVar);
                b2.e(aVar.f3334b, aVar.f3336d);
            }
        }
        q(arrayList);
        this.f3354a = 0;
    }

    public void q(ArrayList arrayList) {
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            C0139a aVar = (C0139a) arrayList.get(i);
            aVar.f3335c = null;
            ((c) this.f3355b).c(aVar);
        }
        arrayList.clear();
    }

    public C0140b(B b2) {
        this.f3355b = new c(30);
        this.f3356c = new ArrayList();
        this.f3357d = new ArrayList();
        this.f3354a = 0;
        this.e = b2;
        this.f3358f = new C0160w(this);
    }
}
