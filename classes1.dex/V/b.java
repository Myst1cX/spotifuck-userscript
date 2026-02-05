package V;

import K0.e;
import N.C0002b;
import N.Q;
import O.k;
import android.graphics.Rect;
import android.os.Build;
import android.view.View;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityManager;
import android.view.accessibility.AccessibilityNodeInfo;
import com.google.android.material.chip.Chip;
import java.util.ArrayList;
import java.util.WeakHashMap;
import z0.C0362c;

public abstract class b extends C0002b {

    /* renamed from: n  reason: collision with root package name */
    public static final Rect f942n = new Rect(Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MIN_VALUE, Integer.MIN_VALUE);

    /* renamed from: o  reason: collision with root package name */
    public static final e f943o = new e(5);

    /* renamed from: p  reason: collision with root package name */
    public static final e f944p = new e(6);

    /* renamed from: d  reason: collision with root package name */
    public final Rect f945d = new Rect();
    public final Rect e = new Rect();

    /* renamed from: f  reason: collision with root package name */
    public final Rect f946f = new Rect();

    /* renamed from: g  reason: collision with root package name */
    public final int[] f947g = new int[2];

    /* renamed from: h  reason: collision with root package name */
    public final AccessibilityManager f948h;
    public final Chip i;

    /* renamed from: j  reason: collision with root package name */
    public a f949j;

    /* renamed from: k  reason: collision with root package name */
    public int f950k = Integer.MIN_VALUE;

    /* renamed from: l  reason: collision with root package name */
    public int f951l = Integer.MIN_VALUE;

    /* renamed from: m  reason: collision with root package name */
    public int f952m = Integer.MIN_VALUE;

    public abstract void l(ArrayList arrayList);

    public final k n(int i2) {
        if (i2 != -1) {
            return k(i2);
        }
        Chip chip = this.i;
        AccessibilityNodeInfo obtain = AccessibilityNodeInfo.obtain(chip);
        k kVar = new k(obtain);
        WeakHashMap weakHashMap = Q.f509a;
        chip.onInitializeAccessibilityNodeInfo(obtain);
        ArrayList arrayList = new ArrayList();
        l(arrayList);
        if (obtain.getChildCount() <= 0 || arrayList.size() <= 0) {
            int size = arrayList.size();
            for (int i3 = 0; i3 < size; i3++) {
                kVar.f751a.addChild(chip, ((Integer) arrayList.get(i3)).intValue());
            }
            return kVar;
        }
        throw new RuntimeException("Views cannot have both real and virtual children");
    }

    public abstract void o(int i2, k kVar);

    public final A.b b(View view) {
        if (this.f949j == null) {
            this.f949j = new a(this);
        }
        return this.f949j;
    }

    public final void d(View view, k kVar) {
        View.AccessibilityDelegate accessibilityDelegate = this.f523a;
        AccessibilityNodeInfo accessibilityNodeInfo = kVar.f751a;
        accessibilityDelegate.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
        Chip chip = ((C0362c) this).f5177q;
        accessibilityNodeInfo.setCheckable(chip.d());
        accessibilityNodeInfo.setClickable(chip.isClickable());
        accessibilityNodeInfo.setClassName(chip.getAccessibilityClassName());
        CharSequence text = chip.getText();
        if (Build.VERSION.SDK_INT >= 23) {
            kVar.k(text);
        } else {
            accessibilityNodeInfo.setContentDescription(text);
        }
    }

    public final boolean j(int i2) {
        if (this.f951l != i2) {
            return false;
        }
        this.f951l = Integer.MIN_VALUE;
        C0362c cVar = (C0362c) this;
        if (i2 == 1) {
            Chip chip = cVar.f5177q;
            chip.f2202r = false;
            chip.refreshDrawableState();
        }
        q(i2, 8);
        return true;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v3, resolved type: O.k} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v4, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v5, resolved type: O.k} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v6, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v21, resolved type: O.k} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v22, resolved type: O.k} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x00bc  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x00eb  */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x0104  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean m(int r20, android.graphics.Rect r21) {
        /*
            r19 = this;
            r0 = r19
            r1 = r20
            r2 = r21
            r3 = 1
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            r0.l(r4)
            r.l r5 = new r.l
            r5.<init>()
            r7 = 0
        L_0x0015:
            int r8 = r4.size()
            if (r7 >= r8) goto L_0x0038
            java.lang.Object r8 = r4.get(r7)
            java.lang.Integer r8 = (java.lang.Integer) r8
            int r8 = r8.intValue()
            O.k r8 = r0.k(r8)
            java.lang.Object r9 = r4.get(r7)
            java.lang.Integer r9 = (java.lang.Integer) r9
            int r9 = r9.intValue()
            r5.d(r9, r8)
            int r7 = r7 + r3
            goto L_0x0015
        L_0x0038:
            int r4 = r0.f951l
            r7 = -2147483648(0xffffffff80000000, float:-0.0)
            r8 = 0
            if (r4 != r7) goto L_0x0041
            r4 = r8
            goto L_0x0047
        L_0x0041:
            java.lang.Object r4 = r5.c(r4, r8)
            O.k r4 = (O.k) r4
        L_0x0047:
            K0.e r9 = f943o
            K0.e r10 = f944p
            com.google.android.material.chip.Chip r11 = r0.i
            r12 = 2
            if (r1 == r3) goto L_0x015c
            if (r1 == r12) goto L_0x015c
            r12 = 130(0x82, float:1.82E-43)
            r14 = 66
            r15 = 33
            r8 = 17
            if (r1 == r8) goto L_0x006b
            if (r1 == r15) goto L_0x006b
            if (r1 == r14) goto L_0x006b
            if (r1 != r12) goto L_0x0063
            goto L_0x006b
        L_0x0063:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.String r2 = "direction must be one of {FOCUS_FORWARD, FOCUS_BACKWARD, FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}."
            r1.<init>(r2)
            throw r1
        L_0x006b:
            android.graphics.Rect r3 = new android.graphics.Rect
            r3.<init>()
            int r6 = r0.f951l
            java.lang.String r13 = "direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}."
            if (r6 == r7) goto L_0x0080
            O.k r2 = r0.n(r6)
            r2.f(r3)
        L_0x007d:
            r18 = -1
            goto L_0x00b5
        L_0x0080:
            if (r2 == 0) goto L_0x0086
            r3.set(r2)
            goto L_0x007d
        L_0x0086:
            int r2 = r11.getWidth()
            int r6 = r11.getHeight()
            if (r1 == r8) goto L_0x00af
            if (r1 == r15) goto L_0x00a8
            if (r1 == r14) goto L_0x00a2
            if (r1 != r12) goto L_0x009c
            r6 = -1
            r11 = 0
            r3.set(r11, r6, r2, r6)
            goto L_0x007d
        L_0x009c:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            r1.<init>(r13)
            throw r1
        L_0x00a2:
            r2 = -1
            r11 = 0
            r3.set(r2, r11, r2, r6)
            goto L_0x007d
        L_0x00a8:
            r11 = 0
            r18 = -1
            r3.set(r11, r6, r2, r6)
            goto L_0x00b5
        L_0x00af:
            r11 = 0
            r18 = -1
            r3.set(r2, r11, r2, r6)
        L_0x00b5:
            android.graphics.Rect r2 = new android.graphics.Rect
            r2.<init>(r3)
            if (r1 == r8) goto L_0x00eb
            if (r1 == r15) goto L_0x00e0
            if (r1 == r14) goto L_0x00d4
            if (r1 != r12) goto L_0x00ce
            int r6 = r3.height()
            r8 = 1
            int r6 = r6 + r8
            int r6 = -r6
            r14 = 0
            r2.offset(r14, r6)
            goto L_0x00f5
        L_0x00ce:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            r1.<init>(r13)
            throw r1
        L_0x00d4:
            r8 = 1
            r14 = 0
            int r6 = r3.width()
            int r6 = r6 + r8
            int r6 = -r6
            r2.offset(r6, r14)
            goto L_0x00f5
        L_0x00e0:
            r8 = 1
            r14 = 0
            int r6 = r3.height()
            int r6 = r6 + r8
            r2.offset(r14, r6)
            goto L_0x00f5
        L_0x00eb:
            r8 = 1
            r14 = 0
            int r6 = r3.width()
            int r6 = r6 + r8
            r2.offset(r6, r14)
        L_0x00f5:
            r10.getClass()
            int r6 = r5.f4554c
            android.graphics.Rect r8 = new android.graphics.Rect
            r8.<init>()
            r11 = 0
            r16 = 0
        L_0x0102:
            if (r11 >= r6) goto L_0x0158
            java.lang.Object[] r10 = r5.f4553b
            r10 = r10[r11]
            O.k r10 = (O.k) r10
            if (r10 != r4) goto L_0x010d
            goto L_0x0155
        L_0x010d:
            r9.getClass()
            r10.f(r8)
            boolean r12 = T0.g.u(r1, r3, r8)
            if (r12 != 0) goto L_0x011a
            goto L_0x0155
        L_0x011a:
            boolean r12 = T0.g.u(r1, r3, r2)
            if (r12 != 0) goto L_0x0121
            goto L_0x0150
        L_0x0121:
            boolean r12 = T0.g.c(r1, r3, r8, r2)
            if (r12 == 0) goto L_0x0128
            goto L_0x0150
        L_0x0128:
            boolean r12 = T0.g.c(r1, r3, r2, r8)
            if (r12 == 0) goto L_0x012f
            goto L_0x0155
        L_0x012f:
            int r12 = T0.g.x(r1, r3, r8)
            int r13 = T0.g.y(r1, r3, r8)
            int r15 = r12 * 13
            int r15 = r15 * r12
            int r13 = r13 * r13
            int r13 = r13 + r15
            int r12 = T0.g.x(r1, r3, r2)
            int r15 = T0.g.y(r1, r3, r2)
            int r17 = r12 * 13
            int r17 = r17 * r12
            int r15 = r15 * r15
            int r15 = r15 + r17
            if (r13 >= r15) goto L_0x0155
        L_0x0150:
            r2.set(r8)
            r16 = r10
        L_0x0155:
            r13 = 1
            int r11 = r11 + r13
            goto L_0x0102
        L_0x0158:
            r1 = r16
            goto L_0x01c8
        L_0x015c:
            r13 = 1
            r14 = 0
            r18 = -1
            java.util.WeakHashMap r2 = N.Q.f509a
            int r2 = r11.getLayoutDirection()
            if (r2 != r13) goto L_0x016a
            r2 = 1
            goto L_0x016b
        L_0x016a:
            r2 = 0
        L_0x016b:
            r10.getClass()
            int r3 = r5.f4554c
            java.util.ArrayList r6 = new java.util.ArrayList
            r6.<init>(r3)
            r11 = 0
        L_0x0176:
            if (r11 >= r3) goto L_0x0184
            java.lang.Object[] r8 = r5.f4553b
            r8 = r8[r11]
            O.k r8 = (O.k) r8
            r6.add(r8)
            r8 = 1
            int r11 = r11 + r8
            goto L_0x0176
        L_0x0184:
            r8 = 1
            V.c r3 = new V.c
            r3.<init>(r2, r9)
            java.util.Collections.sort(r6, r3)
            if (r1 == r8) goto L_0x01af
            if (r1 != r12) goto L_0x01a7
            int r1 = r6.size()
            if (r4 != 0) goto L_0x0199
            r2 = -1
            goto L_0x019d
        L_0x0199:
            int r2 = r6.lastIndexOf(r4)
        L_0x019d:
            int r2 = r2 + r8
            if (r2 >= r1) goto L_0x01a5
            java.lang.Object r8 = r6.get(r2)
            goto L_0x01c3
        L_0x01a5:
            r8 = 0
            goto L_0x01c3
        L_0x01a7:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.String r2 = "direction must be one of {FOCUS_FORWARD, FOCUS_BACKWARD}."
            r1.<init>(r2)
            throw r1
        L_0x01af:
            int r1 = r6.size()
            if (r4 != 0) goto L_0x01b7
        L_0x01b5:
            r2 = 1
            goto L_0x01bc
        L_0x01b7:
            int r1 = r6.indexOf(r4)
            goto L_0x01b5
        L_0x01bc:
            int r1 = r1 - r2
            if (r1 < 0) goto L_0x01a5
            java.lang.Object r8 = r6.get(r1)
        L_0x01c3:
            r16 = r8
            O.k r16 = (O.k) r16
            goto L_0x0158
        L_0x01c8:
            if (r1 != 0) goto L_0x01cb
            goto L_0x01e0
        L_0x01cb:
            r6 = 0
        L_0x01cc:
            int r2 = r5.f4554c
            if (r6 >= r2) goto L_0x01db
            java.lang.Object[] r2 = r5.f4553b
            r2 = r2[r6]
            if (r2 != r1) goto L_0x01d8
            r13 = r6
            goto L_0x01dc
        L_0x01d8:
            r2 = 1
            int r6 = r6 + r2
            goto L_0x01cc
        L_0x01db:
            r13 = -1
        L_0x01dc:
            int[] r1 = r5.f4552a
            r7 = r1[r13]
        L_0x01e0:
            boolean r1 = r0.p(r7)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: V.b.m(int, android.graphics.Rect):boolean");
    }

    public final boolean p(int i2) {
        int i3;
        Chip chip = this.i;
        if ((!chip.isFocused() && !chip.requestFocus()) || (i3 = this.f951l) == i2) {
            return false;
        }
        if (i3 != Integer.MIN_VALUE) {
            j(i3);
        }
        if (i2 == Integer.MIN_VALUE) {
            return false;
        }
        this.f951l = i2;
        C0362c cVar = (C0362c) this;
        if (i2 == 1) {
            Chip chip2 = cVar.f5177q;
            chip2.f2202r = true;
            chip2.refreshDrawableState();
        }
        q(i2, 8);
        return true;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:4:0x000e, code lost:
        r0 = r5.i;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void q(int r6, int r7) {
        /*
            r5 = this;
            r0 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r6 == r0) goto L_0x008b
            android.view.accessibility.AccessibilityManager r0 = r5.f948h
            boolean r0 = r0.isEnabled()
            if (r0 != 0) goto L_0x000e
            goto L_0x008b
        L_0x000e:
            com.google.android.material.chip.Chip r0 = r5.i
            android.view.ViewParent r1 = r0.getParent()
            if (r1 != 0) goto L_0x0017
            return
        L_0x0017:
            r2 = -1
            if (r6 == r2) goto L_0x0081
            android.view.accessibility.AccessibilityEvent r7 = android.view.accessibility.AccessibilityEvent.obtain(r7)
            O.k r2 = r5.n(r6)
            java.util.List r3 = r7.getText()
            java.lang.CharSequence r4 = r2.g()
            r3.add(r4)
            android.view.accessibility.AccessibilityNodeInfo r2 = r2.f751a
            java.lang.CharSequence r3 = r2.getContentDescription()
            r7.setContentDescription(r3)
            boolean r3 = r2.isScrollable()
            r7.setScrollable(r3)
            boolean r3 = r2.isPassword()
            r7.setPassword(r3)
            boolean r3 = r2.isEnabled()
            r7.setEnabled(r3)
            boolean r3 = r2.isChecked()
            r7.setChecked(r3)
            java.util.List r3 = r7.getText()
            boolean r3 = r3.isEmpty()
            if (r3 == 0) goto L_0x006b
            java.lang.CharSequence r3 = r7.getContentDescription()
            if (r3 == 0) goto L_0x0063
            goto L_0x006b
        L_0x0063:
            java.lang.RuntimeException r6 = new java.lang.RuntimeException
            java.lang.String r7 = "Callbacks must add text or a content description in populateEventForVirtualViewId()"
            r6.<init>(r7)
            throw r6
        L_0x006b:
            java.lang.CharSequence r2 = r2.getClassName()
            r7.setClassName(r2)
            r7.setSource(r0, r6)
            android.content.Context r6 = r0.getContext()
            java.lang.String r6 = r6.getPackageName()
            r7.setPackageName(r6)
            goto L_0x0088
        L_0x0081:
            android.view.accessibility.AccessibilityEvent r7 = android.view.accessibility.AccessibilityEvent.obtain(r7)
            r0.onInitializeAccessibilityEvent(r7)
        L_0x0088:
            r1.requestSendAccessibilityEvent(r0, r7)
        L_0x008b:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: V.b.q(int, int):void");
    }

    public b(Chip chip) {
        if (chip != null) {
            this.i = chip;
            this.f948h = (AccessibilityManager) chip.getContext().getSystemService("accessibility");
            chip.setFocusable(true);
            WeakHashMap weakHashMap = Q.f509a;
            if (chip.getImportantForAccessibility() == 0) {
                chip.setImportantForAccessibility(1);
                return;
            }
            return;
        }
        throw new IllegalArgumentException("View may not be null");
    }

    public final k k(int i2) {
        boolean z2;
        AccessibilityNodeInfo obtain = AccessibilityNodeInfo.obtain();
        k kVar = new k(obtain);
        obtain.setEnabled(true);
        obtain.setFocusable(true);
        obtain.setClassName("android.view.View");
        Rect rect = f942n;
        obtain.setBoundsInParent(rect);
        obtain.setBoundsInScreen(rect);
        Chip chip = this.i;
        obtain.setParent(chip);
        o(i2, kVar);
        if (kVar.g() == null && obtain.getContentDescription() == null) {
            throw new RuntimeException("Callbacks must add text or a content description in populateNodeForVirtualViewId()");
        }
        Rect rect2 = this.e;
        kVar.f(rect2);
        if (!rect2.equals(rect)) {
            int actions = obtain.getActions();
            if ((actions & 64) != 0) {
                throw new RuntimeException("Callbacks must not add ACTION_ACCESSIBILITY_FOCUS in populateNodeForVirtualViewId()");
            } else if ((actions & 128) == 0) {
                obtain.setPackageName(chip.getContext().getPackageName());
                kVar.f752b = i2;
                obtain.setSource(chip, i2);
                if (this.f950k == i2) {
                    obtain.setAccessibilityFocused(true);
                    kVar.a(128);
                } else {
                    obtain.setAccessibilityFocused(false);
                    kVar.a(64);
                }
                if (this.f951l == i2) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (z2) {
                    kVar.a(2);
                } else if (obtain.isFocusable()) {
                    kVar.a(1);
                }
                obtain.setFocused(z2);
                int[] iArr = this.f947g;
                chip.getLocationOnScreen(iArr);
                Rect rect3 = this.f945d;
                obtain.getBoundsInScreen(rect3);
                if (rect3.equals(rect)) {
                    kVar.f(rect3);
                    rect3.offset(iArr[0] - chip.getScrollX(), iArr[1] - chip.getScrollY());
                }
                Rect rect4 = this.f946f;
                if (chip.getLocalVisibleRect(rect4)) {
                    rect4.offset(iArr[0] - chip.getScrollX(), iArr[1] - chip.getScrollY());
                    if (rect3.intersect(rect4)) {
                        obtain.setBoundsInScreen(rect3);
                        if (!rect3.isEmpty() && chip.getWindowVisibility() == 0) {
                            ViewParent parent = chip.getParent();
                            while (true) {
                                if (parent instanceof View) {
                                    View view = (View) parent;
                                    if (view.getAlpha() <= 0.0f || view.getVisibility() != 0) {
                                        break;
                                    }
                                    parent = view.getParent();
                                } else if (parent != null) {
                                    obtain.setVisibleToUser(true);
                                }
                            }
                        }
                    }
                }
                return kVar;
            } else {
                throw new RuntimeException("Callbacks must not add ACTION_CLEAR_ACCESSIBILITY_FOCUS in populateNodeForVirtualViewId()");
            }
        } else {
            throw new RuntimeException("Callbacks must set parent bounds in populateNodeForVirtualViewId()");
        }
    }
}
