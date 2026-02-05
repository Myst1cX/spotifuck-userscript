package androidx.coordinatorlayout.widget;

import A.b;
import A.c;
import A.e;
import A.f;
import A.g;
import A.i;
import A.j;
import A.k;
import A.l;
import D.a;
import M.d;
import N.C0015o;
import N.C0016p;
import N.C0017q;
import N.D;
import N.F;
import N.Q;
import N.r;
import N.w0;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Parcelable;
import android.os.SystemClock;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.view.Gravity;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.WeakHashMap;
import p0.C0320a;
import z.C0359a;

public class CoordinatorLayout extends ViewGroup implements C0015o, C0016p {

    /* renamed from: A  reason: collision with root package name */
    public static final ThreadLocal f1435A = new ThreadLocal();

    /* renamed from: B  reason: collision with root package name */
    public static final j f1436B = new j(0);

    /* renamed from: C  reason: collision with root package name */
    public static final d f1437C = new d();

    /* renamed from: y  reason: collision with root package name */
    public static final String f1438y;

    /* renamed from: z  reason: collision with root package name */
    public static final Class[] f1439z = {Context.class, AttributeSet.class};

    /* renamed from: f  reason: collision with root package name */
    public final ArrayList f1440f = new ArrayList();

    /* renamed from: g  reason: collision with root package name */
    public final k f1441g = new k(0);

    /* renamed from: h  reason: collision with root package name */
    public final ArrayList f1442h = new ArrayList();
    public final ArrayList i = new ArrayList();

    /* renamed from: j  reason: collision with root package name */
    public final int[] f1443j = new int[2];

    /* renamed from: k  reason: collision with root package name */
    public final int[] f1444k = new int[2];

    /* renamed from: l  reason: collision with root package name */
    public boolean f1445l;

    /* renamed from: m  reason: collision with root package name */
    public boolean f1446m;

    /* renamed from: n  reason: collision with root package name */
    public final int[] f1447n;

    /* renamed from: o  reason: collision with root package name */
    public View f1448o;

    /* renamed from: p  reason: collision with root package name */
    public View f1449p;

    /* renamed from: q  reason: collision with root package name */
    public g f1450q;

    /* renamed from: r  reason: collision with root package name */
    public boolean f1451r;

    /* renamed from: s  reason: collision with root package name */
    public w0 f1452s;

    /* renamed from: t  reason: collision with root package name */
    public boolean f1453t;

    /* renamed from: u  reason: collision with root package name */
    public Drawable f1454u;

    /* renamed from: v  reason: collision with root package name */
    public ViewGroup.OnHierarchyChangeListener f1455v;

    /* renamed from: w  reason: collision with root package name */
    public b f1456w;

    /* renamed from: x  reason: collision with root package name */
    public final C0017q f1457x = new Object();

    static {
        String str;
        Package packageR = CoordinatorLayout.class.getPackage();
        if (packageR != null) {
            str = packageR.getName();
        } else {
            str = null;
        }
        f1438y = str;
    }

    /* JADX WARNING: type inference failed for: r3v6, types: [N.q, java.lang.Object] */
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CoordinatorLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 2130968918);
        int[] iArr = C0359a.f5173a;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr, 2130968918, 0);
        if (Build.VERSION.SDK_INT >= 29) {
            saveAttributeDataForStyleable(context, iArr, attributeSet, obtainStyledAttributes, 2130968918, 0);
        }
        int resourceId = obtainStyledAttributes.getResourceId(0, 0);
        if (resourceId != 0) {
            Resources resources = context.getResources();
            int[] intArray = resources.getIntArray(resourceId);
            this.f1447n = intArray;
            float f2 = resources.getDisplayMetrics().density;
            int length = intArray.length;
            for (int i2 = 0; i2 < length; i2++) {
                int[] iArr2 = this.f1447n;
                iArr2[i2] = (int) (((float) iArr2[i2]) * f2);
            }
        }
        this.f1454u = obtainStyledAttributes.getDrawable(1);
        obtainStyledAttributes.recycle();
        w();
        super.setOnHierarchyChangeListener(new e(this));
        WeakHashMap weakHashMap = Q.f509a;
        if (getImportantForAccessibility() == 0) {
            setImportantForAccessibility(1);
        }
    }

    public final void a(View view, View view2, int i2, int i3) {
        C0017q qVar = this.f1457x;
        if (i3 == 1) {
            qVar.f585b = i2;
        } else {
            qVar.f584a = i2;
        }
        this.f1449p = view2;
        int childCount = getChildCount();
        for (int i4 = 0; i4 < childCount; i4++) {
            ((f) getChildAt(i4).getLayoutParams()).getClass();
        }
    }

    public final void c(View view, int i2, int i3, int i4, int i5, int i6) {
        b(view, i2, i3, i4, i5, 0, this.f1444k);
    }

    public final void d(View view, int i2) {
        C0017q qVar = this.f1457x;
        if (i2 == 1) {
            qVar.f585b = 0;
        } else {
            qVar.f584a = 0;
        }
        int childCount = getChildCount();
        for (int i3 = 0; i3 < childCount; i3++) {
            View childAt = getChildAt(i3);
            f fVar = (f) childAt.getLayoutParams();
            if (fVar.a(i2)) {
                c cVar = fVar.f4a;
                if (cVar != null) {
                    cVar.p(childAt, view, i2);
                }
                if (i2 == 0) {
                    fVar.f14m = false;
                } else if (i2 == 1) {
                    fVar.f15n = false;
                }
            }
        }
        this.f1449p = null;
    }

    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new f(getContext(), attributeSet);
    }

    public final int m(int i2) {
        int[] iArr = this.f1447n;
        if (iArr == null) {
            Log.e("CoordinatorLayout", "No keylines defined for " + this + " - attempted index lookup " + i2);
            return 0;
        } else if (i2 >= 0 && i2 < iArr.length) {
            return iArr[i2];
        } else {
            Log.e("CoordinatorLayout", "Keyline index " + i2 + " out of range for " + this);
            return 0;
        }
    }

    public final void onNestedPreScroll(View view, int i2, int i3, int[] iArr) {
        e(view, i2, i3, iArr, 0);
    }

    public final void onNestedScroll(View view, int i2, int i3, int i4, int i5) {
        c(view, i2, i3, i4, i5, 0);
    }

    public final void onNestedScrollAccepted(View view, View view2, int i2) {
        a(view, view2, i2, 0);
    }

    public final boolean onStartNestedScroll(View view, View view2, int i2) {
        return f(view, view2, i2, 0);
    }

    public final void onStopNestedScroll(View view) {
        d(view, 0);
    }

    public static Rect g() {
        Rect rect = (Rect) f1437C.a();
        if (rect == null) {
            return new Rect();
        }
        return rect;
    }

    public static void l(int i2, Rect rect, Rect rect2, f fVar, int i3, int i4) {
        int i5;
        int i6;
        int i7 = fVar.f6c;
        if (i7 == 0) {
            i7 = 17;
        }
        int absoluteGravity = Gravity.getAbsoluteGravity(i7, i2);
        int i8 = fVar.f7d;
        if ((i8 & 7) == 0) {
            i8 |= 8388611;
        }
        if ((i8 & 112) == 0) {
            i8 |= 48;
        }
        int absoluteGravity2 = Gravity.getAbsoluteGravity(i8, i2);
        int i9 = absoluteGravity & 7;
        int i10 = absoluteGravity & 112;
        int i11 = absoluteGravity2 & 7;
        int i12 = absoluteGravity2 & 112;
        if (i11 == 1) {
            i5 = rect.left + (rect.width() / 2);
        } else if (i11 != 5) {
            i5 = rect.left;
        } else {
            i5 = rect.right;
        }
        if (i12 == 16) {
            i6 = rect.top + (rect.height() / 2);
        } else if (i12 != 80) {
            i6 = rect.top;
        } else {
            i6 = rect.bottom;
        }
        if (i9 == 1) {
            i5 -= i3 / 2;
        } else if (i9 != 5) {
            i5 -= i3;
        }
        if (i10 == 16) {
            i6 -= i4 / 2;
        } else if (i10 != 80) {
            i6 -= i4;
        }
        rect2.set(i5, i6, i3 + i5, i4 + i6);
    }

    public final void b(View view, int i2, int i3, int i4, int i5, int i6, int[] iArr) {
        c cVar;
        int min;
        int min2;
        int childCount = getChildCount();
        boolean z2 = false;
        int i7 = 0;
        int i8 = 0;
        for (int i9 = 0; i9 < childCount; i9++) {
            View childAt = getChildAt(i9);
            if (childAt.getVisibility() == 8) {
                int i10 = i6;
            } else {
                f fVar = (f) childAt.getLayoutParams();
                if (fVar.a(i6) && (cVar = fVar.f4a) != null) {
                    int[] iArr2 = this.f1443j;
                    iArr2[0] = 0;
                    iArr2[1] = 0;
                    cVar.k(this, childAt, i3, i4, i5, iArr2);
                    if (i4 > 0) {
                        min = Math.max(i7, iArr2[0]);
                    } else {
                        min = Math.min(i7, iArr2[0]);
                    }
                    i7 = min;
                    if (i5 > 0) {
                        min2 = Math.max(i8, iArr2[1]);
                    } else {
                        min2 = Math.min(i8, iArr2[1]);
                    }
                    i8 = min2;
                    z2 = true;
                }
            }
        }
        iArr[0] = iArr[0] + i7;
        iArr[1] = iArr[1] + i8;
        if (z2) {
            p(1);
        }
    }

    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        if (!(layoutParams instanceof f) || !super.checkLayoutParams(layoutParams)) {
            return false;
        }
        return true;
    }

    public final void e(View view, int i2, int i3, int[] iArr, int i4) {
        c cVar;
        int min;
        int min2;
        int childCount = getChildCount();
        boolean z2 = false;
        int i5 = 0;
        int i6 = 0;
        for (int i7 = 0; i7 < childCount; i7++) {
            View childAt = getChildAt(i7);
            if (childAt.getVisibility() == 8) {
                int i8 = i4;
            } else {
                f fVar = (f) childAt.getLayoutParams();
                if (fVar.a(i4) && (cVar = fVar.f4a) != null) {
                    int[] iArr2 = this.f1443j;
                    iArr2[0] = 0;
                    iArr2[1] = 0;
                    int[] iArr3 = iArr2;
                    cVar.j(this, childAt, view, i2, i3, iArr2, i4);
                    if (i2 > 0) {
                        min = Math.max(i5, iArr3[0]);
                    } else {
                        min = Math.min(i5, iArr3[0]);
                    }
                    i5 = min;
                    if (i3 > 0) {
                        min2 = Math.max(i6, iArr3[1]);
                    } else {
                        min2 = Math.min(i6, iArr3[1]);
                    }
                    i6 = min2;
                    z2 = true;
                }
            }
        }
        iArr[0] = i5;
        iArr[1] = i6;
        if (z2) {
            p(1);
        }
    }

    public final ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new f();
    }

    public final ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        if (layoutParams instanceof f) {
            return new f((f) layoutParams);
        }
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            return new f((ViewGroup.MarginLayoutParams) layoutParams);
        }
        return new f(layoutParams);
    }

    public final w0 getLastWindowInsets() {
        return this.f1452s;
    }

    public int getNestedScrollAxes() {
        C0017q qVar = this.f1457x;
        return qVar.f585b | qVar.f584a;
    }

    public Drawable getStatusBarBackground() {
        return this.f1454u;
    }

    public final ArrayList j(View view) {
        r.k kVar = (r.k) this.f1441g.f22g;
        int i2 = kVar.f4550c;
        ArrayList arrayList = null;
        for (int i3 = 0; i3 < i2; i3++) {
            ArrayList arrayList2 = (ArrayList) kVar.j(i3);
            if (arrayList2 != null && arrayList2.contains(view)) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                arrayList.add(kVar.h(i3));
            }
        }
        ArrayList arrayList3 = this.i;
        arrayList3.clear();
        if (arrayList != null) {
            arrayList3.addAll(arrayList);
        }
        return arrayList3;
    }

    public final void k(View view, Rect rect) {
        ThreadLocal threadLocal = l.f24a;
        rect.set(0, 0, view.getWidth(), view.getHeight());
        ThreadLocal threadLocal2 = l.f24a;
        Matrix matrix = (Matrix) threadLocal2.get();
        if (matrix == null) {
            matrix = new Matrix();
            threadLocal2.set(matrix);
        } else {
            matrix.reset();
        }
        l.a(this, view, matrix);
        ThreadLocal threadLocal3 = l.f25b;
        RectF rectF = (RectF) threadLocal3.get();
        if (rectF == null) {
            rectF = new RectF();
            threadLocal3.set(rectF);
        }
        rectF.set(rect);
        matrix.mapRect(rectF);
        rect.set((int) (rectF.left + 0.5f), (int) (rectF.top + 0.5f), (int) (rectF.right + 0.5f), (int) (rectF.bottom + 0.5f));
    }

    public final boolean o(View view, int i2, int i3) {
        d dVar = f1437C;
        Rect g2 = g();
        k(view, g2);
        try {
            return g2.contains(i2, i3);
        } finally {
            g2.setEmpty();
            dVar.c(g2);
        }
    }

    public final void onLayout(boolean z2, int i2, int i3, int i4, int i5) {
        c cVar;
        WeakHashMap weakHashMap = Q.f509a;
        int layoutDirection = getLayoutDirection();
        ArrayList arrayList = this.f1440f;
        int size = arrayList.size();
        for (int i6 = 0; i6 < size; i6++) {
            View view = (View) arrayList.get(i6);
            if (view.getVisibility() != 8 && ((cVar = ((f) view.getLayoutParams()).f4a) == null || !cVar.g(this, view, layoutDirection))) {
                q(view, layoutDirection);
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:74:0x0186, code lost:
        if (r0.h(r32, r20, r25, r8, r26) == false) goto L_0x01a0;
     */
    /* JADX WARNING: Removed duplicated region for block: B:69:0x012c  */
    /* JADX WARNING: Removed duplicated region for block: B:70:0x0159  */
    /* JADX WARNING: Removed duplicated region for block: B:73:0x0163  */
    /* JADX WARNING: Removed duplicated region for block: B:75:0x0189  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onMeasure(int r33, int r34) {
        /*
            r32 = this;
            r6 = r32
            r7 = 1
            r32.s()
            int r0 = r32.getChildCount()
            r8 = 0
            r1 = 0
        L_0x000c:
            if (r1 >= r0) goto L_0x0031
            android.view.View r2 = r6.getChildAt(r1)
            A.k r3 = r6.f1441g
            java.lang.Object r3 = r3.f22g
            r.k r3 = (r.k) r3
            int r4 = r3.f4550c
            r5 = 0
        L_0x001b:
            if (r5 >= r4) goto L_0x002f
            java.lang.Object r9 = r3.j(r5)
            java.util.ArrayList r9 = (java.util.ArrayList) r9
            if (r9 == 0) goto L_0x002d
            boolean r9 = r9.contains(r2)
            if (r9 == 0) goto L_0x002d
            r0 = 1
            goto L_0x0032
        L_0x002d:
            int r5 = r5 + r7
            goto L_0x001b
        L_0x002f:
            int r1 = r1 + r7
            goto L_0x000c
        L_0x0031:
            r0 = 0
        L_0x0032:
            boolean r1 = r6.f1451r
            if (r0 == r1) goto L_0x0066
            if (r0 == 0) goto L_0x0053
            boolean r0 = r6.f1446m
            if (r0 == 0) goto L_0x0050
            A.g r0 = r6.f1450q
            if (r0 != 0) goto L_0x0047
            A.g r0 = new A.g
            r0.<init>(r6)
            r6.f1450q = r0
        L_0x0047:
            android.view.ViewTreeObserver r0 = r32.getViewTreeObserver()
            A.g r1 = r6.f1450q
            r0.addOnPreDrawListener(r1)
        L_0x0050:
            r6.f1451r = r7
            goto L_0x0066
        L_0x0053:
            boolean r0 = r6.f1446m
            if (r0 == 0) goto L_0x0064
            A.g r0 = r6.f1450q
            if (r0 == 0) goto L_0x0064
            android.view.ViewTreeObserver r0 = r32.getViewTreeObserver()
            A.g r1 = r6.f1450q
            r0.removeOnPreDrawListener(r1)
        L_0x0064:
            r6.f1451r = r8
        L_0x0066:
            int r9 = r32.getPaddingLeft()
            int r0 = r32.getPaddingTop()
            int r10 = r32.getPaddingRight()
            int r1 = r32.getPaddingBottom()
            java.util.WeakHashMap r2 = N.Q.f509a
            int r11 = r32.getLayoutDirection()
            if (r11 != r7) goto L_0x0080
            r12 = 1
            goto L_0x0081
        L_0x0080:
            r12 = 0
        L_0x0081:
            int r13 = android.view.View.MeasureSpec.getMode(r33)
            int r14 = android.view.View.MeasureSpec.getSize(r33)
            int r15 = android.view.View.MeasureSpec.getMode(r34)
            int r16 = android.view.View.MeasureSpec.getSize(r34)
            int r17 = r9 + r10
            int r18 = r0 + r1
            int r0 = r32.getSuggestedMinimumWidth()
            int r1 = r32.getSuggestedMinimumHeight()
            N.w0 r2 = r6.f1452s
            if (r2 == 0) goto L_0x00aa
            boolean r2 = r32.getFitsSystemWindows()
            if (r2 == 0) goto L_0x00aa
            r19 = 1
            goto L_0x00ac
        L_0x00aa:
            r19 = 0
        L_0x00ac:
            java.util.ArrayList r5 = r6.f1440f
            int r4 = r5.size()
            r3 = r0
            r2 = r1
            r0 = 0
            r1 = 0
        L_0x00b6:
            if (r1 >= r4) goto L_0x01ea
            java.lang.Object r20 = r5.get(r1)
            android.view.View r20 = (android.view.View) r20
            int r7 = r20.getVisibility()
            r8 = 8
            if (r7 != r8) goto L_0x00d7
            r22 = r1
            r28 = r4
            r29 = r5
            r23 = r9
            r24 = r10
            r27 = r11
            r1 = 1
            r21 = 0
            goto L_0x01d9
        L_0x00d7:
            android.view.ViewGroup$LayoutParams r7 = r20.getLayoutParams()
            A.f r7 = (A.f) r7
            int r8 = r7.e
            if (r8 < 0) goto L_0x011e
            if (r13 == 0) goto L_0x011e
            int r8 = r6.m(r8)
            r22 = r0
            int r0 = r7.f6c
            if (r0 != 0) goto L_0x00f0
            r0 = 8388661(0x800035, float:1.1755018E-38)
        L_0x00f0:
            int r0 = android.view.Gravity.getAbsoluteGravity(r0, r11)
            r0 = r0 & 7
            r23 = r1
            r1 = 3
            if (r0 != r1) goto L_0x00fd
            if (r12 == 0) goto L_0x0102
        L_0x00fd:
            r1 = 5
            if (r0 != r1) goto L_0x010c
            if (r12 == 0) goto L_0x010c
        L_0x0102:
            int r0 = r14 - r10
            int r0 = r0 - r8
            r1 = 0
            int r0 = java.lang.Math.max(r1, r0)
        L_0x010a:
            r8 = r0
            goto L_0x0124
        L_0x010c:
            if (r0 != r1) goto L_0x0110
            if (r12 == 0) goto L_0x0115
        L_0x0110:
            r1 = 3
            if (r0 != r1) goto L_0x011c
            if (r12 == 0) goto L_0x011c
        L_0x0115:
            int r8 = r8 - r9
            r1 = 0
            int r0 = java.lang.Math.max(r1, r8)
            goto L_0x010a
        L_0x011c:
            r1 = 0
            goto L_0x0123
        L_0x011e:
            r22 = r0
            r23 = r1
            goto L_0x011c
        L_0x0123:
            r8 = 0
        L_0x0124:
            if (r19 == 0) goto L_0x0159
            boolean r0 = r20.getFitsSystemWindows()
            if (r0 != 0) goto L_0x0159
            N.w0 r0 = r6.f1452s
            int r0 = r0.b()
            N.w0 r1 = r6.f1452s
            int r1 = r1.c()
            int r1 = r1 + r0
            N.w0 r0 = r6.f1452s
            int r0 = r0.d()
            r24 = r2
            N.w0 r2 = r6.f1452s
            int r2 = r2.a()
            int r2 = r2 + r0
            int r0 = r14 - r1
            int r0 = android.view.View.MeasureSpec.makeMeasureSpec(r0, r13)
            int r1 = r16 - r2
            int r1 = android.view.View.MeasureSpec.makeMeasureSpec(r1, r15)
            r25 = r0
            r26 = r1
            goto L_0x015f
        L_0x0159:
            r24 = r2
            r25 = r33
            r26 = r34
        L_0x015f:
            A.c r0 = r7.f4a
            if (r0 == 0) goto L_0x0189
            r2 = r22
            r22 = r23
            r21 = 0
            r1 = r32
            r23 = r9
            r9 = r2
            r30 = r24
            r24 = r10
            r10 = r30
            r2 = r20
            r27 = r11
            r11 = r3
            r3 = r25
            r28 = r4
            r4 = r8
            r29 = r5
            r5 = r26
            boolean r0 = r0.h(r1, r2, r3, r4, r5)
            if (r0 != 0) goto L_0x01ad
            goto L_0x01a0
        L_0x0189:
            r28 = r4
            r29 = r5
            r27 = r11
            r21 = 0
            r11 = r3
            r30 = r23
            r23 = r9
            r9 = r22
            r22 = r30
            r31 = r24
            r24 = r10
            r10 = r31
        L_0x01a0:
            r5 = 0
            r0 = r32
            r1 = r20
            r2 = r25
            r3 = r8
            r4 = r26
            r0.measureChildWithMargins(r1, r2, r3, r4, r5)
        L_0x01ad:
            int r0 = r20.getMeasuredWidth()
            int r0 = r0 + r17
            int r1 = r7.leftMargin
            int r0 = r0 + r1
            int r1 = r7.rightMargin
            int r0 = r0 + r1
            int r0 = java.lang.Math.max(r11, r0)
            int r1 = r20.getMeasuredHeight()
            int r1 = r1 + r18
            int r2 = r7.topMargin
            int r1 = r1 + r2
            int r2 = r7.bottomMargin
            int r1 = r1 + r2
            int r1 = java.lang.Math.max(r10, r1)
            int r2 = r20.getMeasuredState()
            int r2 = android.view.View.combineMeasuredStates(r9, r2)
            r3 = r0
            r0 = r2
            r2 = r1
            r1 = 1
        L_0x01d9:
            int r4 = r22 + 1
            r1 = r4
            r9 = r23
            r10 = r24
            r11 = r27
            r4 = r28
            r5 = r29
            r7 = 1
            r8 = 0
            goto L_0x00b6
        L_0x01ea:
            r9 = r0
            r10 = r2
            r11 = r3
            r0 = -16777216(0xffffffffff000000, float:-1.7014118E38)
            r0 = r0 & r9
            r1 = r33
            int r0 = android.view.View.resolveSizeAndState(r11, r1, r0)
            int r1 = r9 << 16
            r2 = r34
            int r1 = android.view.View.resolveSizeAndState(r10, r2, r1)
            r6.setMeasuredDimension(r0, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.coordinatorlayout.widget.CoordinatorLayout.onMeasure(int, int):void");
    }

    public final void onRestoreInstanceState(Parcelable parcelable) {
        Parcelable parcelable2;
        if (!(parcelable instanceof i)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        i iVar = (i) parcelable;
        super.onRestoreInstanceState(iVar.f940a);
        SparseArray sparseArray = iVar.f19c;
        int childCount = getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = getChildAt(i2);
            int id = childAt.getId();
            c cVar = n(childAt).f4a;
            if (!(id == -1 || cVar == null || (parcelable2 = (Parcelable) sparseArray.get(id)) == null)) {
                cVar.m(childAt, parcelable2);
            }
        }
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [android.os.Parcelable, U.b, A.i] */
    public final Parcelable onSaveInstanceState() {
        Parcelable n2;
        ? bVar = new U.b(super.onSaveInstanceState());
        SparseArray sparseArray = new SparseArray();
        int childCount = getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = getChildAt(i2);
            int id = childAt.getId();
            c cVar = ((f) childAt.getLayoutParams()).f4a;
            if (!(id == -1 || cVar == null || (n2 = cVar.n(childAt)) == null)) {
                sparseArray.append(id, n2);
            }
        }
        bVar.f19c = sparseArray;
        return bVar;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0012, code lost:
        if (r3 != false) goto L_0x0018;
     */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x002f  */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x0035  */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x004a  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean onTouchEvent(android.view.MotionEvent r18) {
        /*
            r17 = this;
            r0 = r17
            r1 = r18
            int r2 = r18.getActionMasked()
            android.view.View r3 = r0.f1448o
            r4 = 1
            r5 = 0
            if (r3 != 0) goto L_0x0017
            boolean r3 = r0.r(r1, r4)
            if (r3 == 0) goto L_0x0015
            goto L_0x0018
        L_0x0015:
            r6 = 0
            goto L_0x002a
        L_0x0017:
            r3 = 0
        L_0x0018:
            android.view.View r6 = r0.f1448o
            android.view.ViewGroup$LayoutParams r6 = r6.getLayoutParams()
            A.f r6 = (A.f) r6
            A.c r6 = r6.f4a
            if (r6 == 0) goto L_0x0015
            android.view.View r7 = r0.f1448o
            boolean r6 = r6.q(r7, r1)
        L_0x002a:
            android.view.View r7 = r0.f1448o
            r8 = 0
            if (r7 != 0) goto L_0x0035
            boolean r1 = super.onTouchEvent(r18)
            r6 = r6 | r1
            goto L_0x0048
        L_0x0035:
            if (r3 == 0) goto L_0x0048
            long r11 = android.os.SystemClock.uptimeMillis()
            r13 = 3
            r14 = 0
            r15 = 0
            r16 = 0
            r9 = r11
            android.view.MotionEvent r8 = android.view.MotionEvent.obtain(r9, r11, r13, r14, r15, r16)
            super.onTouchEvent(r8)
        L_0x0048:
            if (r8 == 0) goto L_0x004d
            r8.recycle()
        L_0x004d:
            if (r2 == r4) goto L_0x0052
            r1 = 3
            if (r2 != r1) goto L_0x0055
        L_0x0052:
            r0.t(r5)
        L_0x0055:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.coordinatorlayout.widget.CoordinatorLayout.onTouchEvent(android.view.MotionEvent):boolean");
    }

    /* JADX WARNING: Removed duplicated region for block: B:108:0x02aa  */
    /* JADX WARNING: Removed duplicated region for block: B:113:0x02d0  */
    /* JADX WARNING: Removed duplicated region for block: B:117:0x02db  */
    /* JADX WARNING: Removed duplicated region for block: B:127:0x004b A[EDGE_INSN: B:127:0x004b->B:8:0x004b ?: BREAK  , SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void p(int r26) {
        /*
            r25 = this;
            r0 = r25
            r1 = r26
            java.util.WeakHashMap r7 = N.Q.f509a
            int r7 = r25.getLayoutDirection()
            java.util.ArrayList r14 = r0.f1440f
            int r15 = r14.size()
            android.graphics.Rect r13 = g()
            android.graphics.Rect r12 = g()
            android.graphics.Rect r11 = g()
            r9 = 0
        L_0x001d:
            M.d r8 = f1437C
            if (r9 >= r15) goto L_0x02ff
            java.lang.Object r16 = r14.get(r9)
            r2 = r16
            android.view.View r2 = (android.view.View) r2
            android.view.ViewGroup$LayoutParams r16 = r2.getLayoutParams()
            r3 = r16
            A.f r3 = (A.f) r3
            if (r1 != 0) goto L_0x004e
            int r4 = r2.getVisibility()
            r5 = 8
            if (r4 != r5) goto L_0x004e
            r5 = r1
            r6 = r7
            r21 = r9
            r8 = r11
            r4 = r12
            r7 = r13
            r13 = r14
            r1 = r15
            r9 = 48
            r10 = 0
            r11 = 80
            r12 = 3
            r14 = 5
        L_0x004b:
            r15 = 1
            goto L_0x02f3
        L_0x004e:
            r4 = 0
        L_0x004f:
            if (r4 >= r9) goto L_0x0110
            java.lang.Object r5 = r14.get(r4)
            android.view.View r5 = (android.view.View) r5
            android.view.View r6 = r3.f13l
            if (r6 != r5) goto L_0x00e8
            android.view.ViewGroup$LayoutParams r5 = r2.getLayoutParams()
            A.f r5 = (A.f) r5
            android.view.View r6 = r5.f12k
            if (r6 == 0) goto L_0x00e8
            android.graphics.Rect r6 = g()
            android.graphics.Rect r10 = g()
            r18 = r14
            android.graphics.Rect r14 = g()
            r19 = r8
            android.view.View r8 = r5.f12k
            r0.k(r8, r6)
            r8 = 0
            r0.i(r2, r10, r8)
            r17 = r15
            int r15 = r2.getMeasuredWidth()
            int r1 = r2.getMeasuredHeight()
            r20 = r3
            r3 = r19
            r19 = 0
            r8 = r7
            r21 = r9
            r9 = r6
            r19 = r7
            r7 = r10
            r10 = r14
            r22 = r11
            r11 = r5
            r23 = r12
            r12 = r15
            r24 = r13
            r13 = r1
            l(r8, r9, r10, r11, r12, r13)
            int r8 = r14.left
            int r9 = r7.left
            if (r8 != r9) goto L_0x00b1
            int r8 = r14.top
            int r9 = r7.top
            if (r8 == r9) goto L_0x00af
            goto L_0x00b1
        L_0x00af:
            r10 = 0
            goto L_0x00b2
        L_0x00b1:
            r10 = 1
        L_0x00b2:
            r0.h(r5, r14, r15, r1)
            int r1 = r14.left
            int r8 = r7.left
            int r1 = r1 - r8
            int r8 = r14.top
            int r9 = r7.top
            int r8 = r8 - r9
            if (r1 == 0) goto L_0x00c4
            N.Q.j(r2, r1)
        L_0x00c4:
            if (r8 == 0) goto L_0x00c9
            N.Q.k(r2, r8)
        L_0x00c9:
            if (r10 == 0) goto L_0x00d4
            A.c r1 = r5.f4a
            if (r1 == 0) goto L_0x00d4
            android.view.View r5 = r5.f12k
            r1.d(r0, r2, r5)
        L_0x00d4:
            r6.setEmpty()
            r3.c(r6)
            r7.setEmpty()
            r3.c(r7)
            r14.setEmpty()
            r3.c(r14)
        L_0x00e6:
            r1 = 1
            goto L_0x00fa
        L_0x00e8:
            r20 = r3
            r19 = r7
            r3 = r8
            r21 = r9
            r22 = r11
            r23 = r12
            r24 = r13
            r18 = r14
            r17 = r15
            goto L_0x00e6
        L_0x00fa:
            int r4 = r4 + r1
            r1 = r26
            r8 = r3
            r15 = r17
            r14 = r18
            r7 = r19
            r3 = r20
            r9 = r21
            r11 = r22
            r12 = r23
            r13 = r24
            goto L_0x004f
        L_0x0110:
            r20 = r3
            r19 = r7
            r3 = r8
            r21 = r9
            r22 = r11
            r4 = r12
            r24 = r13
            r18 = r14
            r17 = r15
            r1 = 1
            r0.i(r2, r4, r1)
            r1 = r20
            int r5 = r1.f9g
            if (r5 == 0) goto L_0x0187
            boolean r5 = r4.isEmpty()
            if (r5 != 0) goto L_0x0187
            int r5 = r1.f9g
            r6 = r19
            int r5 = android.view.Gravity.getAbsoluteGravity(r5, r6)
            r7 = r5 & 112(0x70, float:1.57E-43)
            r8 = 48
            if (r7 == r8) goto L_0x0157
            r8 = 80
            if (r7 == r8) goto L_0x0145
            r7 = r24
            goto L_0x0163
        L_0x0145:
            r7 = r24
            int r8 = r7.bottom
            int r9 = r25.getHeight()
            int r10 = r4.top
            int r9 = r9 - r10
            int r8 = java.lang.Math.max(r8, r9)
            r7.bottom = r8
            goto L_0x0163
        L_0x0157:
            r7 = r24
            int r8 = r7.top
            int r9 = r4.bottom
            int r8 = java.lang.Math.max(r8, r9)
            r7.top = r8
        L_0x0163:
            r5 = r5 & 7
            r8 = 3
            if (r5 == r8) goto L_0x017c
            r8 = 5
            if (r5 == r8) goto L_0x016c
            goto L_0x018b
        L_0x016c:
            int r5 = r7.right
            int r8 = r25.getWidth()
            int r9 = r4.left
            int r8 = r8 - r9
            int r5 = java.lang.Math.max(r5, r8)
            r7.right = r5
            goto L_0x018b
        L_0x017c:
            int r5 = r7.left
            int r8 = r4.right
            int r5 = java.lang.Math.max(r5, r8)
            r7.left = r5
            goto L_0x018b
        L_0x0187:
            r6 = r19
            r7 = r24
        L_0x018b:
            int r1 = r1.f10h
            if (r1 == 0) goto L_0x029e
            int r1 = r2.getVisibility()
            if (r1 != 0) goto L_0x029e
            java.util.WeakHashMap r1 = N.Q.f509a
            boolean r1 = r2.isLaidOut()
            if (r1 != 0) goto L_0x019f
            goto L_0x029e
        L_0x019f:
            int r1 = r2.getWidth()
            if (r1 <= 0) goto L_0x029e
            int r1 = r2.getHeight()
            if (r1 > 0) goto L_0x01ad
            goto L_0x029e
        L_0x01ad:
            android.view.ViewGroup$LayoutParams r1 = r2.getLayoutParams()
            A.f r1 = (A.f) r1
            A.c r5 = r1.f4a
            android.graphics.Rect r8 = g()
            android.graphics.Rect r9 = g()
            int r10 = r2.getLeft()
            int r11 = r2.getTop()
            int r12 = r2.getRight()
            int r13 = r2.getBottom()
            r9.set(r10, r11, r12, r13)
            if (r5 == 0) goto L_0x0203
            boolean r5 = r5.a(r2)
            if (r5 == 0) goto L_0x0203
            boolean r5 = r9.contains(r8)
            if (r5 == 0) goto L_0x01df
            goto L_0x0206
        L_0x01df:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "Rect should be within the child's bounds. Rect:"
            r2.<init>(r3)
            java.lang.String r3 = r8.toShortString()
            r2.append(r3)
            java.lang.String r3 = " | Bounds:"
            r2.append(r3)
            java.lang.String r3 = r9.toShortString()
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            r1.<init>(r2)
            throw r1
        L_0x0203:
            r8.set(r9)
        L_0x0206:
            r9.setEmpty()
            r3.c(r9)
            boolean r5 = r8.isEmpty()
            if (r5 == 0) goto L_0x021a
            r8.setEmpty()
            r3.c(r8)
            goto L_0x029e
        L_0x021a:
            int r5 = r1.f10h
            int r5 = android.view.Gravity.getAbsoluteGravity(r5, r6)
            r9 = 48
            r10 = r5 & 48
            if (r10 != r9) goto L_0x023a
            int r10 = r8.top
            int r11 = r1.topMargin
            int r10 = r10 - r11
            int r11 = r1.f11j
            int r10 = r10 - r11
            int r11 = r7.top
            if (r10 >= r11) goto L_0x023a
            int r11 = r11 - r10
            v(r2, r11)
            r10 = 1
        L_0x0237:
            r11 = 80
            goto L_0x023c
        L_0x023a:
            r10 = 0
            goto L_0x0237
        L_0x023c:
            r12 = r5 & 80
            if (r12 != r11) goto L_0x0256
            int r12 = r25.getHeight()
            int r13 = r8.bottom
            int r12 = r12 - r13
            int r13 = r1.bottomMargin
            int r12 = r12 - r13
            int r13 = r1.f11j
            int r12 = r12 + r13
            int r13 = r7.bottom
            if (r12 >= r13) goto L_0x0256
            int r12 = r12 - r13
            v(r2, r12)
            r10 = 1
        L_0x0256:
            if (r10 != 0) goto L_0x025e
            r10 = 0
            v(r2, r10)
        L_0x025c:
            r12 = 3
            goto L_0x0260
        L_0x025e:
            r10 = 0
            goto L_0x025c
        L_0x0260:
            r13 = r5 & 3
            if (r13 != r12) goto L_0x0277
            int r13 = r8.left
            int r14 = r1.leftMargin
            int r13 = r13 - r14
            int r14 = r1.i
            int r13 = r13 - r14
            int r14 = r7.left
            if (r13 >= r14) goto L_0x0277
            int r14 = r14 - r13
            u(r2, r14)
            r13 = 1
        L_0x0275:
            r14 = 5
            goto L_0x0279
        L_0x0277:
            r13 = 0
            goto L_0x0275
        L_0x0279:
            r5 = r5 & r14
            if (r5 != r14) goto L_0x0292
            int r5 = r25.getWidth()
            int r15 = r8.right
            int r5 = r5 - r15
            int r15 = r1.rightMargin
            int r5 = r5 - r15
            int r1 = r1.i
            int r5 = r5 + r1
            int r1 = r7.right
            if (r5 >= r1) goto L_0x0292
            int r5 = r5 - r1
            u(r2, r5)
            r13 = 1
        L_0x0292:
            if (r13 != 0) goto L_0x0297
            u(r2, r10)
        L_0x0297:
            r8.setEmpty()
            r3.c(r8)
            goto L_0x02a5
        L_0x029e:
            r9 = 48
            r10 = 0
            r11 = 80
            r12 = 3
            r14 = 5
        L_0x02a5:
            r1 = 2
            r5 = r26
            if (r5 == r1) goto L_0x02d0
            android.view.ViewGroup$LayoutParams r1 = r2.getLayoutParams()
            A.f r1 = (A.f) r1
            android.graphics.Rect r1 = r1.f16o
            r8 = r22
            r8.set(r1)
            boolean r1 = r8.equals(r4)
            if (r1 == 0) goto L_0x02c3
            r1 = r17
            r13 = r18
            goto L_0x004b
        L_0x02c3:
            android.view.ViewGroup$LayoutParams r1 = r2.getLayoutParams()
            A.f r1 = (A.f) r1
            android.graphics.Rect r1 = r1.f16o
            r1.set(r4)
        L_0x02ce:
            r1 = 1
            goto L_0x02d3
        L_0x02d0:
            r8 = r22
            goto L_0x02ce
        L_0x02d3:
            int r2 = r21 + 1
            r1 = r17
        L_0x02d7:
            r13 = r18
            if (r2 >= r1) goto L_0x004b
            java.lang.Object r3 = r13.get(r2)
            android.view.View r3 = (android.view.View) r3
            android.view.ViewGroup$LayoutParams r15 = r3.getLayoutParams()
            A.f r15 = (A.f) r15
            A.c r15 = r15.f4a
            if (r15 == 0) goto L_0x02ee
            r15.b(r3)
        L_0x02ee:
            r15 = 1
            int r2 = r2 + r15
            r18 = r13
            goto L_0x02d7
        L_0x02f3:
            int r2 = r21 + 1
            r15 = r1
            r9 = r2
            r12 = r4
            r1 = r5
            r11 = r8
            r14 = r13
            r13 = r7
            r7 = r6
            goto L_0x001d
        L_0x02ff:
            r3 = r8
            r8 = r11
            r4 = r12
            r7 = r13
            r7.setEmpty()
            r3.c(r7)
            r4.setEmpty()
            r3.c(r4)
            r8.setEmpty()
            r3.c(r8)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.coordinatorlayout.widget.CoordinatorLayout.p(int):void");
    }

    public final boolean r(MotionEvent motionEvent, int i2) {
        int i3;
        MotionEvent motionEvent2 = motionEvent;
        int i4 = i2;
        int actionMasked = motionEvent.getActionMasked();
        ArrayList arrayList = this.f1442h;
        arrayList.clear();
        boolean isChildrenDrawingOrderEnabled = isChildrenDrawingOrderEnabled();
        int childCount = getChildCount();
        for (int i5 = childCount - 1; i5 >= 0; i5--) {
            if (isChildrenDrawingOrderEnabled) {
                i3 = getChildDrawingOrder(childCount, i5);
            } else {
                i3 = i5;
            }
            arrayList.add(getChildAt(i3));
        }
        j jVar = f1436B;
        if (jVar != null) {
            Collections.sort(arrayList, jVar);
        }
        int size = arrayList.size();
        MotionEvent motionEvent3 = null;
        boolean z2 = false;
        for (int i6 = 0; i6 < size; i6++) {
            View view = (View) arrayList.get(i6);
            c cVar = ((f) view.getLayoutParams()).f4a;
            if (z2 && actionMasked != 0) {
                if (cVar != null) {
                    if (motionEvent3 == null) {
                        long uptimeMillis = SystemClock.uptimeMillis();
                        motionEvent3 = MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0);
                    }
                    if (i4 == 0) {
                        cVar.f(this, view, motionEvent3);
                    } else if (i4 == 1) {
                        cVar.q(view, motionEvent3);
                    }
                }
            } else if (!z2 && cVar != null) {
                if (i4 == 0) {
                    z2 = cVar.f(this, view, motionEvent2);
                } else if (i4 == 1) {
                    z2 = cVar.q(view, motionEvent2);
                }
                if (z2) {
                    this.f1448o = view;
                }
            }
        }
        arrayList.clear();
        return z2;
    }

    public final void s() {
        M.c cVar;
        ArrayList arrayList = this.f1440f;
        arrayList.clear();
        k kVar = this.f1441g;
        r.k kVar2 = (r.k) kVar.f22g;
        int i2 = kVar2.f4550c;
        int i3 = 0;
        while (true) {
            cVar = (M.c) kVar.f21f;
            if (i3 >= i2) {
                break;
            }
            ArrayList arrayList2 = (ArrayList) kVar2.j(i3);
            if (arrayList2 != null) {
                arrayList2.clear();
                cVar.c(arrayList2);
            }
            i3++;
        }
        kVar2.clear();
        int childCount = getChildCount();
        int i4 = 0;
        loop1:
        while (true) {
            r.k kVar3 = (r.k) kVar.f22g;
            if (i4 < childCount) {
                View childAt = getChildAt(i4);
                f n2 = n(childAt);
                int i5 = n2.f8f;
                if (i5 == -1) {
                    n2.f13l = null;
                    n2.f12k = null;
                } else {
                    View view = n2.f12k;
                    if (view != null && view.getId() == i5) {
                        View view2 = n2.f12k;
                        ViewParent parent = view2.getParent();
                        while (parent != this) {
                            if (parent == null || parent == childAt) {
                                n2.f13l = null;
                                n2.f12k = null;
                            } else {
                                if (parent instanceof View) {
                                    view2 = (View) parent;
                                }
                                parent = parent.getParent();
                            }
                        }
                        n2.f13l = view2;
                    }
                    View findViewById = findViewById(i5);
                    n2.f12k = findViewById;
                    if (findViewById != null) {
                        if (findViewById != this) {
                            ViewParent parent2 = findViewById.getParent();
                            while (true) {
                                if (parent2 == this || parent2 == null) {
                                    n2.f13l = findViewById;
                                } else if (parent2 != childAt) {
                                    if (parent2 instanceof View) {
                                        findViewById = (View) parent2;
                                    }
                                    parent2 = parent2.getParent();
                                } else if (isInEditMode()) {
                                    n2.f13l = null;
                                    n2.f12k = null;
                                } else {
                                    throw new IllegalStateException("Anchor must not be a descendant of the anchored view");
                                }
                            }
                        } else if (isInEditMode()) {
                            n2.f13l = null;
                            n2.f12k = null;
                        } else {
                            throw new IllegalStateException("View can not be anchored to the the parent CoordinatorLayout");
                        }
                    } else if (isInEditMode()) {
                        n2.f13l = null;
                        n2.f12k = null;
                    } else {
                        throw new IllegalStateException("Could not find CoordinatorLayout descendant view with id " + getResources().getResourceName(i5) + " to anchor view " + childAt);
                    }
                }
                if (!kVar3.containsKey(childAt)) {
                    kVar3.put(childAt, (Object) null);
                }
                for (int i6 = 0; i6 < childCount; i6++) {
                    if (i6 != i4) {
                        View childAt2 = getChildAt(i6);
                        if (childAt2 != n2.f13l) {
                            WeakHashMap weakHashMap = Q.f509a;
                            int layoutDirection = getLayoutDirection();
                            int absoluteGravity = Gravity.getAbsoluteGravity(((f) childAt2.getLayoutParams()).f9g, layoutDirection);
                            if (absoluteGravity == 0 || (Gravity.getAbsoluteGravity(n2.f10h, layoutDirection) & absoluteGravity) != absoluteGravity) {
                                c cVar2 = n2.f4a;
                                if (cVar2 != null) {
                                    cVar2.b(childAt);
                                }
                            }
                        }
                        if (!kVar3.containsKey(childAt2) && !kVar3.containsKey(childAt2)) {
                            kVar3.put(childAt2, (Object) null);
                        }
                        if (kVar3.containsKey(childAt2) && kVar3.containsKey(childAt)) {
                            ArrayList arrayList3 = (ArrayList) kVar3.getOrDefault(childAt2, (Object) null);
                            if (arrayList3 == null) {
                                arrayList3 = (ArrayList) cVar.a();
                                if (arrayList3 == null) {
                                    arrayList3 = new ArrayList();
                                }
                                kVar3.put(childAt2, arrayList3);
                            }
                            arrayList3.add(childAt);
                        }
                    }
                }
                i4++;
            } else {
                ArrayList arrayList4 = (ArrayList) kVar.f23h;
                arrayList4.clear();
                HashSet hashSet = (HashSet) kVar.i;
                hashSet.clear();
                int i7 = kVar3.f4550c;
                for (int i8 = 0; i8 < i7; i8++) {
                    kVar.c(kVar3.h(i8), arrayList4, hashSet);
                }
                arrayList.addAll(arrayList4);
                Collections.reverse(arrayList);
                return;
            }
        }
        throw new IllegalArgumentException("All nodes must be present in the graph before being added as an edge");
    }

    public void setOnHierarchyChangeListener(ViewGroup.OnHierarchyChangeListener onHierarchyChangeListener) {
        this.f1455v = onHierarchyChangeListener;
    }

    public void setStatusBarBackground(Drawable drawable) {
        boolean z2;
        Drawable drawable2 = this.f1454u;
        if (drawable2 != drawable) {
            Drawable drawable3 = null;
            if (drawable2 != null) {
                drawable2.setCallback((Drawable.Callback) null);
            }
            if (drawable != null) {
                drawable3 = drawable.mutate();
            }
            this.f1454u = drawable3;
            if (drawable3 != null) {
                if (drawable3.isStateful()) {
                    this.f1454u.setState(getDrawableState());
                }
                Drawable drawable4 = this.f1454u;
                WeakHashMap weakHashMap = Q.f509a;
                C0320a.y0(drawable4, getLayoutDirection());
                Drawable drawable5 = this.f1454u;
                if (getVisibility() == 0) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                drawable5.setVisible(z2, false);
                this.f1454u.setCallback(this);
            }
            WeakHashMap weakHashMap2 = Q.f509a;
            postInvalidateOnAnimation();
        }
    }

    public void setStatusBarBackgroundColor(int i2) {
        setStatusBarBackground(new ColorDrawable(i2));
    }

    public void setStatusBarBackgroundResource(int i2) {
        Drawable drawable;
        if (i2 != 0) {
            drawable = a.b(getContext(), i2);
        } else {
            drawable = null;
        }
        setStatusBarBackground(drawable);
    }

    public final void w() {
        WeakHashMap weakHashMap = Q.f509a;
        if (getFitsSystemWindows()) {
            if (this.f1456w == null) {
                this.f1456w = new b(0, (Object) this);
            }
            F.u(this, this.f1456w);
            setSystemUiVisibility(1280);
            return;
        }
        F.u(this, (r) null);
    }

    public static f n(View view) {
        f fVar = (f) view.getLayoutParams();
        if (!fVar.f5b) {
            A.d dVar = null;
            for (Class cls = view.getClass(); cls != null; cls = cls.getSuperclass()) {
                dVar = (A.d) cls.getAnnotation(A.d.class);
                if (dVar != null) {
                    break;
                }
            }
            if (dVar != null) {
                try {
                    c cVar = (c) dVar.value().getDeclaredConstructor((Class[]) null).newInstance((Object[]) null);
                    c cVar2 = fVar.f4a;
                    if (cVar2 != cVar) {
                        if (cVar2 != null) {
                            cVar2.e();
                        }
                        fVar.f4a = cVar;
                        fVar.f5b = true;
                        if (cVar != null) {
                            cVar.c(fVar);
                        }
                    }
                } catch (Exception e) {
                    Log.e("CoordinatorLayout", "Default behavior class " + dVar.value().getName() + " could not be instantiated. Did you forget a default constructor?", e);
                }
            }
            fVar.f5b = true;
        }
        return fVar;
    }

    public static void u(View view, int i2) {
        f fVar = (f) view.getLayoutParams();
        int i3 = fVar.i;
        if (i3 != i2) {
            Q.j(view, i2 - i3);
            fVar.i = i2;
        }
    }

    public static void v(View view, int i2) {
        f fVar = (f) view.getLayoutParams();
        int i3 = fVar.f11j;
        if (i3 != i2) {
            Q.k(view, i2 - i3);
            fVar.f11j = i2;
        }
    }

    public final boolean drawChild(Canvas canvas, View view, long j2) {
        c cVar = ((f) view.getLayoutParams()).f4a;
        if (cVar != null) {
            cVar.getClass();
        }
        return super.drawChild(canvas, view, j2);
    }

    public final void drawableStateChanged() {
        boolean z2;
        super.drawableStateChanged();
        int[] drawableState = getDrawableState();
        Drawable drawable = this.f1454u;
        if (drawable == null || !drawable.isStateful()) {
            z2 = false;
        } else {
            z2 = drawable.setState(drawableState);
        }
        if (z2) {
            invalidate();
        }
    }

    public final boolean f(View view, View view2, int i2, int i3) {
        int childCount = getChildCount();
        boolean z2 = false;
        for (int i4 = 0; i4 < childCount; i4++) {
            View childAt = getChildAt(i4);
            if (childAt.getVisibility() != 8) {
                f fVar = (f) childAt.getLayoutParams();
                c cVar = fVar.f4a;
                if (cVar != null) {
                    boolean o2 = cVar.o(childAt, i2, i3);
                    z2 |= o2;
                    if (i3 == 0) {
                        fVar.f14m = o2;
                    } else if (i3 == 1) {
                        fVar.f15n = o2;
                    }
                } else if (i3 == 0) {
                    fVar.f14m = false;
                } else if (i3 == 1) {
                    fVar.f15n = false;
                }
            }
        }
        return z2;
    }

    public final List<View> getDependencySortedChildren() {
        s();
        return Collections.unmodifiableList(this.f1440f);
    }

    public int getSuggestedMinimumHeight() {
        return Math.max(super.getSuggestedMinimumHeight(), getPaddingBottom() + getPaddingTop());
    }

    public int getSuggestedMinimumWidth() {
        return Math.max(super.getSuggestedMinimumWidth(), getPaddingRight() + getPaddingLeft());
    }

    public final void h(f fVar, Rect rect, int i2, int i3) {
        int width = getWidth();
        int height = getHeight();
        int max = Math.max(getPaddingLeft() + fVar.leftMargin, Math.min(rect.left, ((width - getPaddingRight()) - i2) - fVar.rightMargin));
        int max2 = Math.max(getPaddingTop() + fVar.topMargin, Math.min(rect.top, ((height - getPaddingBottom()) - i3) - fVar.bottomMargin));
        rect.set(max, max2, i2 + max, i3 + max2);
    }

    public final void i(View view, Rect rect, boolean z2) {
        if (view.isLayoutRequested() || view.getVisibility() == 8) {
            rect.setEmpty();
        } else if (z2) {
            k(view, rect);
        } else {
            rect.set(view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
        }
    }

    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        t(false);
        if (this.f1451r) {
            if (this.f1450q == null) {
                this.f1450q = new g(this);
            }
            getViewTreeObserver().addOnPreDrawListener(this.f1450q);
        }
        if (this.f1452s == null) {
            WeakHashMap weakHashMap = Q.f509a;
            if (getFitsSystemWindows()) {
                D.c(this);
            }
        }
        this.f1446m = true;
    }

    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        t(false);
        if (this.f1451r && this.f1450q != null) {
            getViewTreeObserver().removeOnPreDrawListener(this.f1450q);
        }
        View view = this.f1449p;
        if (view != null) {
            d(view, 0);
        }
        this.f1446m = false;
    }

    public final void onDraw(Canvas canvas) {
        int i2;
        super.onDraw(canvas);
        if (this.f1453t && this.f1454u != null) {
            w0 w0Var = this.f1452s;
            if (w0Var != null) {
                i2 = w0Var.d();
            } else {
                i2 = 0;
            }
            if (i2 > 0) {
                this.f1454u.setBounds(0, 0, getWidth(), i2);
                this.f1454u.draw(canvas);
            }
        }
    }

    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            t(true);
        }
        boolean r2 = r(motionEvent, 0);
        if (actionMasked == 1 || actionMasked == 3) {
            t(true);
        }
        return r2;
    }

    public final boolean onNestedFling(View view, float f2, float f3, boolean z2) {
        int childCount = getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = getChildAt(i2);
            if (childAt.getVisibility() != 8) {
                f fVar = (f) childAt.getLayoutParams();
                if (fVar.a(0)) {
                    c cVar = fVar.f4a;
                }
            }
        }
        return false;
    }

    public final boolean onNestedPreFling(View view, float f2, float f3) {
        c cVar;
        int childCount = getChildCount();
        boolean z2 = false;
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = getChildAt(i2);
            if (childAt.getVisibility() != 8) {
                f fVar = (f) childAt.getLayoutParams();
                if (fVar.a(0) && (cVar = fVar.f4a) != null) {
                    z2 |= cVar.i(view);
                }
            }
        }
        return z2;
    }

    public final void q(View view, int i2) {
        int i3;
        f fVar = (f) view.getLayoutParams();
        View view2 = fVar.f12k;
        if (view2 != null || fVar.f8f == -1) {
            d dVar = f1437C;
            if (view2 != null) {
                Rect g2 = g();
                Rect g3 = g();
                try {
                    k(view2, g2);
                    f fVar2 = (f) view.getLayoutParams();
                    int measuredWidth = view.getMeasuredWidth();
                    int measuredHeight = view.getMeasuredHeight();
                    l(i2, g2, g3, fVar2, measuredWidth, measuredHeight);
                    h(fVar2, g3, measuredWidth, measuredHeight);
                    view.layout(g3.left, g3.top, g3.right, g3.bottom);
                } finally {
                    g2.setEmpty();
                    dVar.c(g2);
                    g3.setEmpty();
                    dVar.c(g3);
                }
            } else {
                int i4 = fVar.e;
                if (i4 >= 0) {
                    f fVar3 = (f) view.getLayoutParams();
                    int i5 = fVar3.f6c;
                    if (i5 == 0) {
                        i5 = 8388661;
                    }
                    int absoluteGravity = Gravity.getAbsoluteGravity(i5, i2);
                    int i6 = absoluteGravity & 7;
                    int i7 = absoluteGravity & 112;
                    int width = getWidth();
                    int height = getHeight();
                    int measuredWidth2 = view.getMeasuredWidth();
                    int measuredHeight2 = view.getMeasuredHeight();
                    if (i2 == 1) {
                        i4 = width - i4;
                    }
                    int m2 = m(i4) - measuredWidth2;
                    if (i6 == 1) {
                        m2 += measuredWidth2 / 2;
                    } else if (i6 == 5) {
                        m2 += measuredWidth2;
                    }
                    if (i7 == 16) {
                        i3 = measuredHeight2 / 2;
                    } else if (i7 != 80) {
                        i3 = 0;
                    } else {
                        i3 = measuredHeight2;
                    }
                    int max = Math.max(getPaddingLeft() + fVar3.leftMargin, Math.min(m2, ((width - getPaddingRight()) - measuredWidth2) - fVar3.rightMargin));
                    int max2 = Math.max(getPaddingTop() + fVar3.topMargin, Math.min(i3, ((height - getPaddingBottom()) - measuredHeight2) - fVar3.bottomMargin));
                    view.layout(max, max2, measuredWidth2 + max, measuredHeight2 + max2);
                    return;
                }
                f fVar4 = (f) view.getLayoutParams();
                Rect g4 = g();
                g4.set(getPaddingLeft() + fVar4.leftMargin, getPaddingTop() + fVar4.topMargin, (getWidth() - getPaddingRight()) - fVar4.rightMargin, (getHeight() - getPaddingBottom()) - fVar4.bottomMargin);
                if (this.f1452s != null) {
                    WeakHashMap weakHashMap = Q.f509a;
                    if (getFitsSystemWindows() && !view.getFitsSystemWindows()) {
                        g4.left = this.f1452s.b() + g4.left;
                        g4.top = this.f1452s.d() + g4.top;
                        g4.right -= this.f1452s.c();
                        g4.bottom -= this.f1452s.a();
                    }
                }
                Rect g5 = g();
                int i8 = fVar4.f6c;
                if ((i8 & 7) == 0) {
                    i8 |= 8388611;
                }
                if ((i8 & 112) == 0) {
                    i8 |= 48;
                }
                Gravity.apply(i8, view.getMeasuredWidth(), view.getMeasuredHeight(), g4, g5, i2);
                view.layout(g5.left, g5.top, g5.right, g5.bottom);
                g4.setEmpty();
                dVar.c(g4);
                g5.setEmpty();
                dVar.c(g5);
            }
        } else {
            throw new IllegalStateException("An anchor may not be changed after CoordinatorLayout measurement begins before layout is complete.");
        }
    }

    public final boolean requestChildRectangleOnScreen(View view, Rect rect, boolean z2) {
        c cVar = ((f) view.getLayoutParams()).f4a;
        if (cVar != null) {
            cVar.l(this, view);
        }
        return super.requestChildRectangleOnScreen(view, rect, z2);
    }

    public final void requestDisallowInterceptTouchEvent(boolean z2) {
        super.requestDisallowInterceptTouchEvent(z2);
        if (z2 && !this.f1445l) {
            t(false);
            this.f1445l = true;
        }
    }

    public void setFitsSystemWindows(boolean z2) {
        super.setFitsSystemWindows(z2);
        w();
    }

    public void setVisibility(int i2) {
        boolean z2;
        super.setVisibility(i2);
        if (i2 == 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        Drawable drawable = this.f1454u;
        if (drawable != null && drawable.isVisible() != z2) {
            this.f1454u.setVisible(z2, false);
        }
    }

    public final void t(boolean z2) {
        int childCount = getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = getChildAt(i2);
            c cVar = ((f) childAt.getLayoutParams()).f4a;
            if (cVar != null) {
                long uptimeMillis = SystemClock.uptimeMillis();
                MotionEvent obtain = MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0);
                if (z2) {
                    cVar.f(this, childAt, obtain);
                } else {
                    cVar.q(childAt, obtain);
                }
                obtain.recycle();
            }
        }
        for (int i3 = 0; i3 < childCount; i3++) {
            ((f) getChildAt(i3).getLayoutParams()).getClass();
        }
        this.f1448o = null;
        this.f1445l = false;
    }

    public final boolean verifyDrawable(Drawable drawable) {
        if (super.verifyDrawable(drawable) || drawable == this.f1454u) {
            return true;
        }
        return false;
    }
}
