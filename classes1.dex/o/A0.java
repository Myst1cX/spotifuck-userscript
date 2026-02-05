package o;

import N.Q;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.support.v4.media.session.t;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.LinearLayout;
import g.C0096a;

public abstract class A0 extends ViewGroup {

    /* renamed from: f  reason: collision with root package name */
    public boolean f4034f = true;

    /* renamed from: g  reason: collision with root package name */
    public int f4035g = -1;

    /* renamed from: h  reason: collision with root package name */
    public int f4036h = 0;
    public int i;

    /* renamed from: j  reason: collision with root package name */
    public int f4037j = 8388659;

    /* renamed from: k  reason: collision with root package name */
    public int f4038k;

    /* renamed from: l  reason: collision with root package name */
    public float f4039l;

    /* renamed from: m  reason: collision with root package name */
    public boolean f4040m;

    /* renamed from: n  reason: collision with root package name */
    public int[] f4041n;

    /* renamed from: o  reason: collision with root package name */
    public int[] f4042o;

    /* renamed from: p  reason: collision with root package name */
    public Drawable f4043p;

    /* renamed from: q  reason: collision with root package name */
    public int f4044q;

    /* renamed from: r  reason: collision with root package name */
    public int f4045r;

    /* renamed from: s  reason: collision with root package name */
    public int f4046s;

    /* renamed from: t  reason: collision with root package name */
    public int f4047t;

    public A0(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        int[] iArr = C0096a.f2530n;
        t A2 = t.A(context, attributeSet, iArr, 0);
        Q.o(this, context, iArr, attributeSet, (TypedArray) A2.f1132c, 0);
        TypedArray typedArray = (TypedArray) A2.f1132c;
        int i2 = typedArray.getInt(1, -1);
        if (i2 >= 0) {
            setOrientation(i2);
        }
        int i3 = typedArray.getInt(0, -1);
        if (i3 >= 0) {
            setGravity(i3);
        }
        boolean z2 = typedArray.getBoolean(2, true);
        if (!z2) {
            setBaselineAligned(z2);
        }
        this.f4039l = typedArray.getFloat(4, -1.0f);
        this.f4035g = typedArray.getInt(3, -1);
        this.f4040m = typedArray.getBoolean(7, false);
        setDividerDrawable(A2.o(5));
        this.f4046s = typedArray.getInt(8, 0);
        this.f4047t = typedArray.getDimensionPixelSize(6, 0);
        A2.C();
    }

    public final boolean i(int i2) {
        if (i2 == 0) {
            if ((this.f4046s & 1) != 0) {
                return true;
            }
            return false;
        } else if (i2 == getChildCount()) {
            if ((this.f4046s & 4) != 0) {
                return true;
            }
            return false;
        } else if ((this.f4046s & 2) == 0) {
            return false;
        } else {
            for (int i3 = i2 - 1; i3 >= 0; i3--) {
                if (getChildAt(i3).getVisibility() != 8) {
                    return true;
                }
            }
            return false;
        }
    }

    public final void onDraw(Canvas canvas) {
        boolean z2;
        int i2;
        int left;
        int i3;
        int i4;
        int i5;
        if (this.f4043p != null) {
            int i6 = 0;
            if (this.i == 1) {
                int virtualChildCount = getVirtualChildCount();
                while (i6 < virtualChildCount) {
                    View childAt = getChildAt(i6);
                    if (!(childAt == null || childAt.getVisibility() == 8 || !i(i6))) {
                        d(canvas, (childAt.getTop() - ((C0317z0) childAt.getLayoutParams()).topMargin) - this.f4045r);
                    }
                    i6++;
                }
                if (i(virtualChildCount)) {
                    View childAt2 = getChildAt(virtualChildCount - 1);
                    if (childAt2 == null) {
                        i5 = (getHeight() - getPaddingBottom()) - this.f4045r;
                    } else {
                        i5 = childAt2.getBottom() + ((C0317z0) childAt2.getLayoutParams()).bottomMargin;
                    }
                    d(canvas, i5);
                    return;
                }
                return;
            }
            int virtualChildCount2 = getVirtualChildCount();
            boolean z3 = n1.f4272a;
            if (getLayoutDirection() == 1) {
                z2 = true;
            } else {
                z2 = false;
            }
            while (i6 < virtualChildCount2) {
                View childAt3 = getChildAt(i6);
                if (!(childAt3 == null || childAt3.getVisibility() == 8 || !i(i6))) {
                    C0317z0 z0Var = (C0317z0) childAt3.getLayoutParams();
                    if (z2) {
                        i4 = childAt3.getRight() + z0Var.rightMargin;
                    } else {
                        i4 = (childAt3.getLeft() - z0Var.leftMargin) - this.f4044q;
                    }
                    e(canvas, i4);
                }
                i6++;
            }
            if (i(virtualChildCount2)) {
                View childAt4 = getChildAt(virtualChildCount2 - 1);
                if (childAt4 != null) {
                    C0317z0 z0Var2 = (C0317z0) childAt4.getLayoutParams();
                    if (z2) {
                        left = childAt4.getLeft() - z0Var2.leftMargin;
                        i3 = this.f4044q;
                    } else {
                        i2 = childAt4.getRight() + z0Var2.rightMargin;
                        e(canvas, i2);
                    }
                } else if (z2) {
                    i2 = getPaddingLeft();
                    e(canvas, i2);
                } else {
                    left = getWidth() - getPaddingRight();
                    i3 = this.f4044q;
                }
                i2 = left - i3;
                e(canvas, i2);
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:136:0x02df, code lost:
        if (r13.width == -1) goto L_0x02e6;
     */
    /* JADX WARNING: Removed duplicated region for block: B:203:0x0483  */
    /* JADX WARNING: Removed duplicated region for block: B:204:0x0488  */
    /* JADX WARNING: Removed duplicated region for block: B:207:0x04b0  */
    /* JADX WARNING: Removed duplicated region for block: B:208:0x04b5  */
    /* JADX WARNING: Removed duplicated region for block: B:211:0x04bd  */
    /* JADX WARNING: Removed duplicated region for block: B:212:0x04c9  */
    /* JADX WARNING: Removed duplicated region for block: B:214:0x04db  */
    /* JADX WARNING: Removed duplicated region for block: B:219:0x04ea  */
    /* JADX WARNING: Removed duplicated region for block: B:220:0x04ee  */
    /* JADX WARNING: Removed duplicated region for block: B:225:0x050a  */
    /* JADX WARNING: Removed duplicated region for block: B:230:0x0533  */
    /* JADX WARNING: Removed duplicated region for block: B:235:0x0541  */
    /* JADX WARNING: Removed duplicated region for block: B:236:0x0543  */
    /* JADX WARNING: Removed duplicated region for block: B:239:0x054b  */
    /* JADX WARNING: Removed duplicated region for block: B:242:0x0556  */
    /* JADX WARNING: Removed duplicated region for block: B:269:0x05df  */
    /* JADX WARNING: Removed duplicated region for block: B:301:0x0693  */
    /* JADX WARNING: Removed duplicated region for block: B:304:0x06af  */
    /* JADX WARNING: Removed duplicated region for block: B:347:0x07a1  */
    /* JADX WARNING: Removed duplicated region for block: B:351:0x07c5  */
    /* JADX WARNING: Removed duplicated region for block: B:360:0x07f8  */
    /* JADX WARNING: Removed duplicated region for block: B:363:0x0800  */
    /* JADX WARNING: Removed duplicated region for block: B:372:0x085a  */
    /* JADX WARNING: Removed duplicated region for block: B:423:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onMeasure(int r38, int r39) {
        /*
            r37 = this;
            r6 = r37
            r7 = r38
            r8 = r39
            int r0 = r6.i
            r10 = -2
            r11 = 1073741824(0x40000000, float:2.0)
            r12 = 8
            r14 = -2147483648(0xffffffff80000000, float:-0.0)
            r15 = 0
            r5 = 0
            r4 = 1
            if (r0 != r4) goto L_0x0380
            r6.f4038k = r5
            int r3 = r37.getVirtualChildCount()
            int r2 = android.view.View.MeasureSpec.getMode(r38)
            int r1 = android.view.View.MeasureSpec.getMode(r39)
            int r0 = r6.f4035g
            boolean r9 = r6.f4040m
            r13 = 0
            r17 = 0
            r18 = 0
            r19 = 0
            r20 = 0
            r21 = 0
            r22 = 0
            r23 = 0
            r24 = 1
            r25 = 0
        L_0x0039:
            if (r13 >= r3) goto L_0x0173
            android.view.View r26 = r6.getChildAt(r13)
            if (r26 != 0) goto L_0x0051
            int r4 = r6.f4038k
            r6.f4038k = r4
        L_0x0045:
            r10 = r0
            r29 = r1
            r1 = r2
            r31 = r3
            r3 = r22
            r27 = 1
            goto L_0x015d
        L_0x0051:
            int r4 = r26.getVisibility()
            if (r4 != r12) goto L_0x0058
            goto L_0x0045
        L_0x0058:
            boolean r4 = r6.i(r13)
            if (r4 == 0) goto L_0x0065
            int r4 = r6.f4038k
            int r5 = r6.f4045r
            int r4 = r4 + r5
            r6.f4038k = r4
        L_0x0065:
            android.view.ViewGroup$LayoutParams r4 = r26.getLayoutParams()
            r5 = r4
            o.z0 r5 = (o.C0317z0) r5
            float r4 = r5.weight
            float r17 = r17 + r4
            if (r1 != r11) goto L_0x0094
            int r12 = r5.height
            if (r12 != 0) goto L_0x0094
            int r12 = (r4 > r15 ? 1 : (r4 == r15 ? 0 : -1))
            if (r12 <= 0) goto L_0x0094
            int r4 = r6.f4038k
            int r12 = r5.topMargin
            int r12 = r12 + r4
            int r11 = r5.bottomMargin
            int r12 = r12 + r11
            int r4 = java.lang.Math.max(r4, r12)
            r6.f4038k = r4
            r10 = r0
            r29 = r1
            r30 = r2
            r31 = r3
            r15 = r5
            r4 = 1
            r27 = 1
            goto L_0x00e5
        L_0x0094:
            int r11 = r5.height
            if (r11 != 0) goto L_0x00a0
            int r4 = (r4 > r15 ? 1 : (r4 == r15 ? 0 : -1))
            if (r4 <= 0) goto L_0x00a0
            r5.height = r10
            r11 = 0
            goto L_0x00a2
        L_0x00a0:
            r11 = -2147483648(0xffffffff80000000, float:-0.0)
        L_0x00a2:
            int r4 = (r17 > r15 ? 1 : (r17 == r15 ? 0 : -1))
            if (r4 != 0) goto L_0x00aa
            int r4 = r6.f4038k
            r12 = r4
            goto L_0x00ab
        L_0x00aa:
            r12 = 0
        L_0x00ab:
            r4 = 0
            r10 = r0
            r0 = r37
            r29 = r1
            r1 = r26
            r30 = r2
            r2 = r38
            r31 = r3
            r3 = r4
            r27 = 1
            r4 = r39
            r15 = r5
            r5 = r12
            r0.measureChildWithMargins(r1, r2, r3, r4, r5)
            if (r11 == r14) goto L_0x00c7
            r15.height = r11
        L_0x00c7:
            int r0 = r26.getMeasuredHeight()
            int r1 = r6.f4038k
            int r2 = r1 + r0
            int r3 = r15.topMargin
            int r2 = r2 + r3
            int r3 = r15.bottomMargin
            int r2 = r2 + r3
            int r1 = java.lang.Math.max(r1, r2)
            r6.f4038k = r1
            r5 = r21
            if (r9 == 0) goto L_0x00e3
            int r21 = java.lang.Math.max(r0, r5)
        L_0x00e3:
            r4 = r20
        L_0x00e5:
            if (r10 < 0) goto L_0x00ef
            int r0 = r13 + 1
            if (r10 != r0) goto L_0x00ef
            int r0 = r6.f4038k
            r6.f4036h = r0
        L_0x00ef:
            if (r13 >= r10) goto L_0x00f8
            float r0 = r15.weight
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 > 0) goto L_0x00fd
        L_0x00f8:
            r1 = r30
            r0 = 1073741824(0x40000000, float:2.0)
            goto L_0x0105
        L_0x00fd:
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            java.lang.String r1 = "A child of LinearLayout with index less than mBaselineAlignedChildIndex has weight > 0, which won't work.  Either remove the weight, or don't set mBaselineAlignedChildIndex."
            r0.<init>(r1)
            throw r0
        L_0x0105:
            if (r1 == r0) goto L_0x0110
            int r0 = r15.width
            r2 = -1
            if (r0 != r2) goto L_0x0110
            r5 = 1
            r25 = 1
            goto L_0x0111
        L_0x0110:
            r5 = 0
        L_0x0111:
            int r0 = r15.leftMargin
            int r2 = r15.rightMargin
            int r0 = r0 + r2
            int r2 = r26.getMeasuredWidth()
            int r2 = r2 + r0
            r3 = r22
            int r3 = java.lang.Math.max(r3, r2)
            int r11 = r26.getMeasuredState()
            r12 = r23
            int r11 = android.view.View.combineMeasuredStates(r12, r11)
            if (r24 == 0) goto L_0x0134
            int r12 = r15.width
            r14 = -1
            if (r12 != r14) goto L_0x0134
            r12 = 1
            goto L_0x0135
        L_0x0134:
            r12 = 0
        L_0x0135:
            float r14 = r15.weight
            r15 = 0
            int r14 = (r14 > r15 ? 1 : (r14 == r15 ? 0 : -1))
            if (r14 <= 0) goto L_0x0148
            if (r5 == 0) goto L_0x0141
        L_0x013e:
            r14 = r19
            goto L_0x0143
        L_0x0141:
            r0 = r2
            goto L_0x013e
        L_0x0143:
            int r19 = java.lang.Math.max(r14, r0)
            goto L_0x0157
        L_0x0148:
            r14 = r19
            if (r5 == 0) goto L_0x014f
        L_0x014c:
            r2 = r18
            goto L_0x0151
        L_0x014f:
            r0 = r2
            goto L_0x014c
        L_0x0151:
            int r18 = java.lang.Math.max(r2, r0)
            r19 = r14
        L_0x0157:
            r20 = r4
            r23 = r11
            r24 = r12
        L_0x015d:
            int r13 = r13 + 1
            r2 = r1
            r22 = r3
            r0 = r10
            r1 = r29
            r3 = r31
            r4 = 1
            r5 = 0
            r10 = -2
            r11 = 1073741824(0x40000000, float:2.0)
            r12 = 8
            r14 = -2147483648(0xffffffff80000000, float:-0.0)
            r15 = 0
            goto L_0x0039
        L_0x0173:
            r29 = r1
            r1 = r2
            r31 = r3
            r2 = r18
            r14 = r19
            r5 = r21
            r3 = r22
            r12 = r23
            r27 = 1
            int r0 = r6.f4038k
            r10 = r31
            if (r0 <= 0) goto L_0x0197
            boolean r0 = r6.i(r10)
            if (r0 == 0) goto L_0x0197
            int r0 = r6.f4038k
            int r4 = r6.f4045r
            int r0 = r0 + r4
            r6.f4038k = r0
        L_0x0197:
            r4 = r29
            if (r9 == 0) goto L_0x01d7
            r0 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r4 == r0) goto L_0x01a1
            if (r4 != 0) goto L_0x01d7
        L_0x01a1:
            r11 = 0
            r6.f4038k = r11
            r0 = 0
        L_0x01a5:
            if (r0 >= r10) goto L_0x01d7
            android.view.View r13 = r6.getChildAt(r0)
            if (r13 != 0) goto L_0x01b2
            int r13 = r6.f4038k
            r6.f4038k = r13
            goto L_0x01d3
        L_0x01b2:
            int r15 = r13.getVisibility()
            r11 = 8
            if (r15 != r11) goto L_0x01bb
            goto L_0x01d3
        L_0x01bb:
            android.view.ViewGroup$LayoutParams r11 = r13.getLayoutParams()
            o.z0 r11 = (o.C0317z0) r11
            int r13 = r6.f4038k
            int r21 = r13 + r5
            int r15 = r11.topMargin
            int r21 = r21 + r15
            int r11 = r11.bottomMargin
            int r11 = r21 + r11
            int r11 = java.lang.Math.max(r13, r11)
            r6.f4038k = r11
        L_0x01d3:
            int r0 = r0 + 1
            r11 = 0
            goto L_0x01a5
        L_0x01d7:
            int r0 = r6.f4038k
            int r11 = r37.getPaddingTop()
            int r13 = r37.getPaddingBottom()
            int r13 = r13 + r11
            int r13 = r13 + r0
            r6.f4038k = r13
            int r0 = r37.getSuggestedMinimumHeight()
            int r0 = java.lang.Math.max(r13, r0)
            r11 = 0
            int r0 = android.view.View.resolveSizeAndState(r0, r8, r11)
            r11 = 16777215(0xffffff, float:2.3509886E-38)
            r11 = r11 & r0
            int r13 = r6.f4038k
            int r11 = r11 - r13
            if (r20 != 0) goto L_0x0244
            if (r11 == 0) goto L_0x0203
            r13 = 0
            int r15 = (r17 > r13 ? 1 : (r17 == r13 ? 0 : -1))
            if (r15 <= 0) goto L_0x0203
            goto L_0x0244
        L_0x0203:
            int r2 = java.lang.Math.max(r2, r14)
            if (r9 == 0) goto L_0x0240
            r9 = 1073741824(0x40000000, float:2.0)
            if (r4 == r9) goto L_0x0240
            r4 = 0
        L_0x020e:
            if (r4 >= r10) goto L_0x0240
            android.view.View r9 = r6.getChildAt(r4)
            if (r9 == 0) goto L_0x023d
            int r11 = r9.getVisibility()
            r13 = 8
            if (r11 != r13) goto L_0x021f
            goto L_0x023d
        L_0x021f:
            android.view.ViewGroup$LayoutParams r11 = r9.getLayoutParams()
            o.z0 r11 = (o.C0317z0) r11
            float r11 = r11.weight
            r13 = 0
            int r11 = (r11 > r13 ? 1 : (r11 == r13 ? 0 : -1))
            if (r11 <= 0) goto L_0x023d
            int r11 = r9.getMeasuredWidth()
            r13 = 1073741824(0x40000000, float:2.0)
            int r11 = android.view.View.MeasureSpec.makeMeasureSpec(r11, r13)
            int r14 = android.view.View.MeasureSpec.makeMeasureSpec(r5, r13)
            r9.measure(r11, r14)
        L_0x023d:
            int r4 = r4 + 1
            goto L_0x020e
        L_0x0240:
            r22 = r3
            goto L_0x0320
        L_0x0244:
            float r5 = r6.f4039l
            r9 = 0
            int r13 = (r5 > r9 ? 1 : (r5 == r9 ? 0 : -1))
            if (r13 <= 0) goto L_0x024d
            r17 = r5
        L_0x024d:
            r5 = 0
            r6.f4038k = r5
            r5 = 0
        L_0x0251:
            if (r5 >= r10) goto L_0x0310
            android.view.View r9 = r6.getChildAt(r5)
            int r13 = r9.getVisibility()
            r14 = 8
            if (r13 != r14) goto L_0x0263
            r29 = r4
            goto L_0x030a
        L_0x0263:
            android.view.ViewGroup$LayoutParams r13 = r9.getLayoutParams()
            o.z0 r13 = (o.C0317z0) r13
            float r14 = r13.weight
            r15 = 0
            int r16 = (r14 > r15 ? 1 : (r14 == r15 ? 0 : -1))
            if (r16 <= 0) goto L_0x02c6
            float r15 = (float) r11
            float r15 = r15 * r14
            float r15 = r15 / r17
            int r15 = (int) r15
            float r17 = r17 - r14
            int r11 = r11 - r15
            int r14 = r37.getPaddingLeft()
            int r16 = r37.getPaddingRight()
            int r16 = r16 + r14
            int r14 = r13.leftMargin
            int r16 = r16 + r14
            int r14 = r13.rightMargin
            int r14 = r16 + r14
            r16 = r11
            int r11 = r13.width
            int r11 = android.view.ViewGroup.getChildMeasureSpec(r7, r14, r11)
            int r14 = r13.height
            if (r14 != 0) goto L_0x02a8
            r14 = 1073741824(0x40000000, float:2.0)
            if (r4 == r14) goto L_0x029c
            goto L_0x02aa
        L_0x029c:
            if (r15 <= 0) goto L_0x029f
            goto L_0x02a0
        L_0x029f:
            r15 = 0
        L_0x02a0:
            int r15 = android.view.View.MeasureSpec.makeMeasureSpec(r15, r14)
            r9.measure(r11, r15)
            goto L_0x02ba
        L_0x02a8:
            r14 = 1073741824(0x40000000, float:2.0)
        L_0x02aa:
            int r18 = r9.getMeasuredHeight()
            int r15 = r18 + r15
            if (r15 >= 0) goto L_0x02b3
            r15 = 0
        L_0x02b3:
            int r15 = android.view.View.MeasureSpec.makeMeasureSpec(r15, r14)
            r9.measure(r11, r15)
        L_0x02ba:
            int r11 = r9.getMeasuredState()
            r11 = r11 & -256(0xffffffffffffff00, float:NaN)
            int r12 = android.view.View.combineMeasuredStates(r12, r11)
            r11 = r16
        L_0x02c6:
            int r14 = r13.leftMargin
            int r15 = r13.rightMargin
            int r14 = r14 + r15
            int r15 = r9.getMeasuredWidth()
            int r15 = r15 + r14
            int r3 = java.lang.Math.max(r3, r15)
            r16 = r3
            r3 = 1073741824(0x40000000, float:2.0)
            if (r1 == r3) goto L_0x02e2
            int r3 = r13.width
            r29 = r4
            r4 = -1
            if (r3 != r4) goto L_0x02e5
            goto L_0x02e6
        L_0x02e2:
            r29 = r4
            r4 = -1
        L_0x02e5:
            r14 = r15
        L_0x02e6:
            int r2 = java.lang.Math.max(r2, r14)
            if (r24 == 0) goto L_0x02f2
            int r3 = r13.width
            if (r3 != r4) goto L_0x02f2
            r3 = 1
            goto L_0x02f3
        L_0x02f2:
            r3 = 0
        L_0x02f3:
            int r4 = r6.f4038k
            int r9 = r9.getMeasuredHeight()
            int r9 = r9 + r4
            int r14 = r13.topMargin
            int r9 = r9 + r14
            int r13 = r13.bottomMargin
            int r9 = r9 + r13
            int r4 = java.lang.Math.max(r4, r9)
            r6.f4038k = r4
            r24 = r3
            r3 = r16
        L_0x030a:
            int r5 = r5 + 1
            r4 = r29
            goto L_0x0251
        L_0x0310:
            int r4 = r6.f4038k
            int r5 = r37.getPaddingTop()
            int r9 = r37.getPaddingBottom()
            int r9 = r9 + r5
            int r9 = r9 + r4
            r6.f4038k = r9
            goto L_0x0240
        L_0x0320:
            if (r24 != 0) goto L_0x0327
            r3 = 1073741824(0x40000000, float:2.0)
            if (r1 == r3) goto L_0x0327
            goto L_0x0329
        L_0x0327:
            r2 = r22
        L_0x0329:
            int r1 = r37.getPaddingLeft()
            int r3 = r37.getPaddingRight()
            int r3 = r3 + r1
            int r3 = r3 + r2
            int r1 = r37.getSuggestedMinimumWidth()
            int r1 = java.lang.Math.max(r3, r1)
            int r1 = android.view.View.resolveSizeAndState(r1, r7, r12)
            r6.setMeasuredDimension(r1, r0)
            if (r25 == 0) goto L_0x0899
            int r0 = r37.getMeasuredWidth()
            r1 = 1073741824(0x40000000, float:2.0)
            int r7 = android.view.View.MeasureSpec.makeMeasureSpec(r0, r1)
            r9 = 0
        L_0x034f:
            if (r9 >= r10) goto L_0x0899
            android.view.View r1 = r6.getChildAt(r9)
            int r0 = r1.getVisibility()
            r2 = 8
            if (r0 == r2) goto L_0x037d
            android.view.ViewGroup$LayoutParams r0 = r1.getLayoutParams()
            r11 = r0
            o.z0 r11 = (o.C0317z0) r11
            int r0 = r11.width
            r2 = -1
            if (r0 != r2) goto L_0x037d
            int r12 = r11.height
            int r0 = r1.getMeasuredHeight()
            r11.height = r0
            r3 = 0
            r5 = 0
            r0 = r37
            r2 = r7
            r4 = r39
            r0.measureChildWithMargins(r1, r2, r3, r4, r5)
            r11.height = r12
        L_0x037d:
            int r9 = r9 + 1
            goto L_0x034f
        L_0x0380:
            r0 = 0
            r27 = 1
            r6.f4038k = r0
            int r9 = r37.getVirtualChildCount()
            int r10 = android.view.View.MeasureSpec.getMode(r38)
            int r11 = android.view.View.MeasureSpec.getMode(r39)
            int[] r0 = r6.f4041n
            r12 = 4
            if (r0 == 0) goto L_0x039a
            int[] r0 = r6.f4042o
            if (r0 != 0) goto L_0x03a2
        L_0x039a:
            int[] r0 = new int[r12]
            r6.f4041n = r0
            int[] r0 = new int[r12]
            r6.f4042o = r0
        L_0x03a2:
            int[] r13 = r6.f4041n
            int[] r14 = r6.f4042o
            r15 = 3
            r0 = -1
            r13[r15] = r0
            r17 = 2
            r13[r17] = r0
            r13[r27] = r0
            r1 = 0
            r13[r1] = r0
            r14[r15] = r0
            r14[r17] = r0
            r14[r27] = r0
            r14[r1] = r0
            boolean r5 = r6.f4034f
            boolean r4 = r6.f4040m
            r0 = 1073741824(0x40000000, float:2.0)
            if (r10 != r0) goto L_0x03c6
            r18 = 1
            goto L_0x03c8
        L_0x03c6:
            r18 = 0
        L_0x03c8:
            r0 = 0
            r1 = 0
            r2 = 0
            r3 = 0
            r8 = 0
            r12 = 0
            r15 = 0
            r19 = 1
            r21 = 0
            r24 = 0
        L_0x03d5:
            if (r3 >= r9) goto L_0x0572
            android.view.View r7 = r6.getChildAt(r3)
            if (r7 != 0) goto L_0x03e9
            int r7 = r6.f4038k
            r6.f4038k = r7
            r25 = r3
            r26 = r4
            r30 = r5
            goto L_0x0568
        L_0x03e9:
            r25 = r0
            int r0 = r7.getVisibility()
            r26 = r2
            r2 = 8
            if (r0 != r2) goto L_0x0401
            r30 = r5
            r0 = r25
            r2 = r26
            r25 = r3
            r26 = r4
            goto L_0x0568
        L_0x0401:
            boolean r0 = r6.i(r3)
            if (r0 == 0) goto L_0x040e
            int r0 = r6.f4038k
            int r2 = r6.f4044q
            int r0 = r0 + r2
            r6.f4038k = r0
        L_0x040e:
            android.view.ViewGroup$LayoutParams r0 = r7.getLayoutParams()
            r2 = r0
            o.z0 r2 = (o.C0317z0) r2
            float r0 = r2.weight
            float r29 = r1 + r0
            r1 = 1073741824(0x40000000, float:2.0)
            if (r10 != r1) goto L_0x046c
            int r1 = r2.width
            if (r1 != 0) goto L_0x046c
            r1 = 0
            int r30 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r30 <= 0) goto L_0x046c
            if (r18 == 0) goto L_0x0435
            int r0 = r6.f4038k
            int r1 = r2.leftMargin
            r30 = r3
            int r3 = r2.rightMargin
            int r1 = r1 + r3
            int r1 = r1 + r0
            r6.f4038k = r1
            goto L_0x0445
        L_0x0435:
            r30 = r3
            int r0 = r6.f4038k
            int r1 = r2.leftMargin
            int r1 = r1 + r0
            int r3 = r2.rightMargin
            int r1 = r1 + r3
            int r0 = java.lang.Math.max(r0, r1)
            r6.f4038k = r0
        L_0x0445:
            if (r5 == 0) goto L_0x045c
            r0 = 0
            int r1 = android.view.View.MeasureSpec.makeMeasureSpec(r0, r0)
            r7.measure(r1, r1)
            r0 = r2
            r33 = r25
            r34 = r26
            r25 = r30
            r26 = r4
            r30 = r5
            goto L_0x04df
        L_0x045c:
            r0 = r2
            r33 = r25
            r34 = r26
            r25 = r30
            r1 = 1073741824(0x40000000, float:2.0)
            r26 = r4
            r30 = r5
            r4 = 1
            goto L_0x04e3
        L_0x046c:
            r30 = r3
            int r1 = r2.width
            if (r1 != 0) goto L_0x047c
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 <= 0) goto L_0x047d
            r0 = -2
            r2.width = r0
            r3 = 0
            goto L_0x047f
        L_0x047c:
            r1 = 0
        L_0x047d:
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
        L_0x047f:
            int r0 = (r29 > r1 ? 1 : (r29 == r1 ? 0 : -1))
            if (r0 != 0) goto L_0x0488
            int r0 = r6.f4038k
            r31 = r0
            goto L_0x048a
        L_0x0488:
            r31 = 0
        L_0x048a:
            r32 = 0
            r1 = r25
            r0 = r37
            r33 = r1
            r1 = r7
            r35 = r2
            r34 = r26
            r2 = r38
            r36 = r3
            r25 = r30
            r3 = r31
            r26 = r4
            r4 = r39
            r30 = r5
            r5 = r32
            r0.measureChildWithMargins(r1, r2, r3, r4, r5)
            r1 = r36
            r0 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r1 == r0) goto L_0x04b5
            r0 = r35
            r0.width = r1
            goto L_0x04b7
        L_0x04b5:
            r0 = r35
        L_0x04b7:
            int r1 = r7.getMeasuredWidth()
            if (r18 == 0) goto L_0x04c9
            int r2 = r6.f4038k
            int r3 = r0.leftMargin
            int r3 = r3 + r1
            int r4 = r0.rightMargin
            int r3 = r3 + r4
            int r3 = r3 + r2
            r6.f4038k = r3
            goto L_0x04d9
        L_0x04c9:
            int r2 = r6.f4038k
            int r3 = r2 + r1
            int r4 = r0.leftMargin
            int r3 = r3 + r4
            int r4 = r0.rightMargin
            int r3 = r3 + r4
            int r2 = java.lang.Math.max(r2, r3)
            r6.f4038k = r2
        L_0x04d9:
            if (r26 == 0) goto L_0x04df
            int r12 = java.lang.Math.max(r1, r12)
        L_0x04df:
            r4 = r21
            r1 = 1073741824(0x40000000, float:2.0)
        L_0x04e3:
            if (r11 == r1) goto L_0x04ee
            int r1 = r0.height
            r2 = -1
            if (r1 != r2) goto L_0x04ee
            r5 = 1
            r24 = 1
            goto L_0x04ef
        L_0x04ee:
            r5 = 0
        L_0x04ef:
            int r1 = r0.topMargin
            int r2 = r0.bottomMargin
            int r1 = r1 + r2
            int r2 = r7.getMeasuredHeight()
            int r2 = r2 + r1
            int r3 = r7.getMeasuredState()
            int r3 = android.view.View.combineMeasuredStates(r8, r3)
            if (r30 == 0) goto L_0x0533
            int r7 = r7.getBaseline()
            r8 = -1
            if (r7 == r8) goto L_0x0533
            int r8 = r0.gravity
            if (r8 >= 0) goto L_0x0510
            int r8 = r6.f4037j
        L_0x0510:
            r8 = r8 & 112(0x70, float:1.57E-43)
            r21 = 4
            int r8 = r8 >> 4
            r21 = -2
            r8 = r8 & -2
            int r8 = r8 >> 1
            r21 = r1
            r1 = r13[r8]
            int r1 = java.lang.Math.max(r1, r7)
            r13[r8] = r1
            r1 = r14[r8]
            int r7 = r2 - r7
            int r1 = java.lang.Math.max(r1, r7)
            r14[r8] = r1
        L_0x0530:
            r7 = r34
            goto L_0x0536
        L_0x0533:
            r21 = r1
            goto L_0x0530
        L_0x0536:
            int r1 = java.lang.Math.max(r7, r2)
            if (r19 == 0) goto L_0x0543
            int r7 = r0.height
            r8 = -1
            if (r7 != r8) goto L_0x0543
            r7 = 1
            goto L_0x0544
        L_0x0543:
            r7 = 0
        L_0x0544:
            float r0 = r0.weight
            r8 = 0
            int r0 = (r0 > r8 ? 1 : (r0 == r8 ? 0 : -1))
            if (r0 <= 0) goto L_0x0556
            if (r5 == 0) goto L_0x054f
            r2 = r21
        L_0x054f:
            int r15 = java.lang.Math.max(r15, r2)
            r0 = r33
            goto L_0x0560
        L_0x0556:
            if (r5 == 0) goto L_0x055a
            r2 = r21
        L_0x055a:
            r0 = r33
            int r0 = java.lang.Math.max(r0, r2)
        L_0x0560:
            r2 = r1
            r8 = r3
            r21 = r4
            r19 = r7
            r1 = r29
        L_0x0568:
            int r3 = r25 + 1
            r7 = r38
            r4 = r26
            r5 = r30
            goto L_0x03d5
        L_0x0572:
            r7 = r2
            r26 = r4
            r30 = r5
            int r2 = r6.f4038k
            if (r2 <= 0) goto L_0x0588
            boolean r2 = r6.i(r9)
            if (r2 == 0) goto L_0x0588
            int r2 = r6.f4038k
            int r3 = r6.f4044q
            int r2 = r2 + r3
            r6.f4038k = r2
        L_0x0588:
            r2 = r13[r27]
            r3 = -1
            if (r2 != r3) goto L_0x05a0
            r4 = 0
            r5 = r13[r4]
            if (r5 != r3) goto L_0x05a0
            r4 = r13[r17]
            if (r4 != r3) goto L_0x05a0
            r4 = 3
            r5 = r13[r4]
            if (r5 == r3) goto L_0x059c
            goto L_0x05a1
        L_0x059c:
            r2 = r7
            r25 = r8
            goto L_0x05d1
        L_0x05a0:
            r4 = 3
        L_0x05a1:
            r3 = r13[r4]
            r5 = 0
            r4 = r13[r5]
            r5 = r13[r17]
            int r2 = java.lang.Math.max(r2, r5)
            int r2 = java.lang.Math.max(r4, r2)
            int r2 = java.lang.Math.max(r3, r2)
            r3 = 3
            r4 = r14[r3]
            r3 = 0
            r5 = r14[r3]
            r3 = r14[r27]
            r25 = r8
            r8 = r14[r17]
            int r3 = java.lang.Math.max(r3, r8)
            int r3 = java.lang.Math.max(r5, r3)
            int r3 = java.lang.Math.max(r4, r3)
            int r3 = r3 + r2
            int r2 = java.lang.Math.max(r7, r3)
        L_0x05d1:
            if (r26 == 0) goto L_0x061a
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r10 == r3) goto L_0x05d9
            if (r10 != 0) goto L_0x061a
        L_0x05d9:
            r3 = 0
            r6.f4038k = r3
            r5 = 0
        L_0x05dd:
            if (r5 >= r9) goto L_0x061a
            android.view.View r3 = r6.getChildAt(r5)
            if (r3 != 0) goto L_0x05ea
            int r3 = r6.f4038k
            r6.f4038k = r3
            goto L_0x0617
        L_0x05ea:
            int r4 = r3.getVisibility()
            r7 = 8
            if (r4 != r7) goto L_0x05f3
            goto L_0x0617
        L_0x05f3:
            android.view.ViewGroup$LayoutParams r3 = r3.getLayoutParams()
            o.z0 r3 = (o.C0317z0) r3
            if (r18 == 0) goto L_0x0607
            int r4 = r6.f4038k
            int r7 = r3.leftMargin
            int r7 = r7 + r12
            int r3 = r3.rightMargin
            int r7 = r7 + r3
            int r7 = r7 + r4
            r6.f4038k = r7
            goto L_0x0617
        L_0x0607:
            int r4 = r6.f4038k
            int r7 = r4 + r12
            int r8 = r3.leftMargin
            int r7 = r7 + r8
            int r3 = r3.rightMargin
            int r7 = r7 + r3
            int r3 = java.lang.Math.max(r4, r7)
            r6.f4038k = r3
        L_0x0617:
            int r5 = r5 + 1
            goto L_0x05dd
        L_0x061a:
            int r3 = r6.f4038k
            int r4 = r37.getPaddingLeft()
            int r5 = r37.getPaddingRight()
            int r5 = r5 + r4
            int r5 = r5 + r3
            r6.f4038k = r5
            int r3 = r37.getSuggestedMinimumWidth()
            int r3 = java.lang.Math.max(r5, r3)
            r7 = r38
            r4 = 0
            int r3 = android.view.View.resolveSizeAndState(r3, r7, r4)
            r4 = 16777215(0xffffff, float:2.3509886E-38)
            r4 = r4 & r3
            int r5 = r6.f4038k
            int r4 = r4 - r5
            if (r21 != 0) goto L_0x068c
            if (r4 == 0) goto L_0x0648
            r8 = 0
            int r16 = (r1 > r8 ? 1 : (r1 == r8 ? 0 : -1))
            if (r16 <= 0) goto L_0x0648
            goto L_0x068c
        L_0x0648:
            int r0 = java.lang.Math.max(r0, r15)
            if (r26 == 0) goto L_0x0685
            r1 = 1073741824(0x40000000, float:2.0)
            if (r10 == r1) goto L_0x0685
            r1 = 0
        L_0x0653:
            if (r1 >= r9) goto L_0x0685
            android.view.View r4 = r6.getChildAt(r1)
            if (r4 == 0) goto L_0x0682
            int r8 = r4.getVisibility()
            r10 = 8
            if (r8 != r10) goto L_0x0664
            goto L_0x0682
        L_0x0664:
            android.view.ViewGroup$LayoutParams r8 = r4.getLayoutParams()
            o.z0 r8 = (o.C0317z0) r8
            float r8 = r8.weight
            r10 = 0
            int r8 = (r8 > r10 ? 1 : (r8 == r10 ? 0 : -1))
            if (r8 <= 0) goto L_0x0682
            r8 = 1073741824(0x40000000, float:2.0)
            int r10 = android.view.View.MeasureSpec.makeMeasureSpec(r12, r8)
            int r13 = r4.getMeasuredHeight()
            int r13 = android.view.View.MeasureSpec.makeMeasureSpec(r13, r8)
            r4.measure(r10, r13)
        L_0x0682:
            int r1 = r1 + 1
            goto L_0x0653
        L_0x0685:
            r4 = r39
            r22 = r9
            r8 = 0
            goto L_0x0830
        L_0x068c:
            float r2 = r6.f4039l
            r8 = 0
            int r12 = (r2 > r8 ? 1 : (r2 == r8 ? 0 : -1))
            if (r12 <= 0) goto L_0x0694
            r1 = r2
        L_0x0694:
            r2 = -1
            r8 = 3
            r13[r8] = r2
            r13[r17] = r2
            r13[r27] = r2
            r12 = 0
            r13[r12] = r2
            r14[r8] = r2
            r14[r17] = r2
            r14[r27] = r2
            r14[r12] = r2
            r6.f4038k = r12
            r12 = r25
            r2 = -1
            r8 = 0
        L_0x06ad:
            if (r8 >= r9) goto L_0x07d8
            android.view.View r15 = r6.getChildAt(r8)
            if (r15 == 0) goto L_0x06bd
            int r5 = r15.getVisibility()
            r7 = 8
            if (r5 != r7) goto L_0x06ca
        L_0x06bd:
            r7 = r4
            r22 = r9
            r21 = 0
            r23 = 4
            r28 = -2
            r4 = r39
            goto L_0x07cf
        L_0x06ca:
            android.view.ViewGroup$LayoutParams r5 = r15.getLayoutParams()
            o.z0 r5 = (o.C0317z0) r5
            float r7 = r5.weight
            r21 = 0
            int r22 = (r7 > r21 ? 1 : (r7 == r21 ? 0 : -1))
            if (r22 <= 0) goto L_0x0736
            r22 = r9
            float r9 = (float) r4
            float r9 = r9 * r7
            float r9 = r9 / r1
            int r9 = (int) r9
            float r1 = r1 - r7
            int r4 = r4 - r9
            int r7 = r37.getPaddingTop()
            int r25 = r37.getPaddingBottom()
            int r25 = r25 + r7
            int r7 = r5.topMargin
            int r25 = r25 + r7
            int r7 = r5.bottomMargin
            int r7 = r25 + r7
            r25 = r1
            int r1 = r5.height
            r26 = r4
            r4 = r39
            int r1 = android.view.ViewGroup.getChildMeasureSpec(r4, r7, r1)
            int r7 = r5.width
            if (r7 != 0) goto L_0x0714
            r7 = 1073741824(0x40000000, float:2.0)
            if (r10 == r7) goto L_0x0708
            goto L_0x0716
        L_0x0708:
            if (r9 <= 0) goto L_0x070b
            goto L_0x070c
        L_0x070b:
            r9 = 0
        L_0x070c:
            int r9 = android.view.View.MeasureSpec.makeMeasureSpec(r9, r7)
            r15.measure(r9, r1)
            goto L_0x0726
        L_0x0714:
            r7 = 1073741824(0x40000000, float:2.0)
        L_0x0716:
            int r28 = r15.getMeasuredWidth()
            int r9 = r28 + r9
            if (r9 >= 0) goto L_0x071f
            r9 = 0
        L_0x071f:
            int r9 = android.view.View.MeasureSpec.makeMeasureSpec(r9, r7)
            r15.measure(r9, r1)
        L_0x0726:
            int r1 = r15.getMeasuredState()
            r7 = -16777216(0xffffffffff000000, float:-1.7014118E38)
            r1 = r1 & r7
            int r12 = android.view.View.combineMeasuredStates(r12, r1)
            r1 = r25
            r7 = r26
            goto L_0x073b
        L_0x0736:
            r7 = r4
            r22 = r9
            r4 = r39
        L_0x073b:
            if (r18 == 0) goto L_0x0756
            int r9 = r6.f4038k
            int r25 = r15.getMeasuredWidth()
            r26 = r1
            int r1 = r5.leftMargin
            int r25 = r25 + r1
            int r1 = r5.rightMargin
            int r25 = r25 + r1
            int r1 = r25 + r9
            r6.f4038k = r1
            r25 = r7
        L_0x0753:
            r1 = 1073741824(0x40000000, float:2.0)
            goto L_0x076e
        L_0x0756:
            r26 = r1
            int r1 = r6.f4038k
            int r9 = r15.getMeasuredWidth()
            int r9 = r9 + r1
            r25 = r7
            int r7 = r5.leftMargin
            int r9 = r9 + r7
            int r7 = r5.rightMargin
            int r9 = r9 + r7
            int r1 = java.lang.Math.max(r1, r9)
            r6.f4038k = r1
            goto L_0x0753
        L_0x076e:
            if (r11 == r1) goto L_0x0777
            int r1 = r5.height
            r7 = -1
            if (r1 != r7) goto L_0x0777
            r1 = 1
            goto L_0x0778
        L_0x0777:
            r1 = 0
        L_0x0778:
            int r7 = r5.topMargin
            int r9 = r5.bottomMargin
            int r7 = r7 + r9
            int r9 = r15.getMeasuredHeight()
            int r9 = r9 + r7
            int r2 = java.lang.Math.max(r2, r9)
            if (r1 == 0) goto L_0x0789
            goto L_0x078a
        L_0x0789:
            r7 = r9
        L_0x078a:
            int r0 = java.lang.Math.max(r0, r7)
            if (r19 == 0) goto L_0x0797
            int r1 = r5.height
            r7 = -1
            if (r1 != r7) goto L_0x0798
            r1 = 1
            goto L_0x0799
        L_0x0797:
            r7 = -1
        L_0x0798:
            r1 = 0
        L_0x0799:
            if (r30 == 0) goto L_0x07c5
            int r15 = r15.getBaseline()
            if (r15 == r7) goto L_0x07c5
            int r5 = r5.gravity
            if (r5 >= 0) goto L_0x07a7
            int r5 = r6.f4037j
        L_0x07a7:
            r5 = r5 & 112(0x70, float:1.57E-43)
            r23 = 4
            int r5 = r5 >> 4
            r28 = -2
            r5 = r5 & -2
            int r5 = r5 >> 1
            r7 = r13[r5]
            int r7 = java.lang.Math.max(r7, r15)
            r13[r5] = r7
            r7 = r14[r5]
            int r9 = r9 - r15
            int r7 = java.lang.Math.max(r7, r9)
            r14[r5] = r7
            goto L_0x07c9
        L_0x07c5:
            r23 = 4
            r28 = -2
        L_0x07c9:
            r19 = r1
            r7 = r25
            r1 = r26
        L_0x07cf:
            int r8 = r8 + 1
            r4 = r7
            r9 = r22
            r7 = r38
            goto L_0x06ad
        L_0x07d8:
            r4 = r39
            r22 = r9
            int r1 = r6.f4038k
            int r5 = r37.getPaddingLeft()
            int r7 = r37.getPaddingRight()
            int r7 = r7 + r5
            int r7 = r7 + r1
            r6.f4038k = r7
            r1 = r13[r27]
            r5 = -1
            if (r1 != r5) goto L_0x0800
            r7 = 0
            r8 = r13[r7]
            if (r8 != r5) goto L_0x0800
            r7 = r13[r17]
            if (r7 != r5) goto L_0x0800
            r7 = 3
            r8 = r13[r7]
            if (r8 == r5) goto L_0x07fe
            goto L_0x0801
        L_0x07fe:
            r8 = 0
            goto L_0x082e
        L_0x0800:
            r7 = 3
        L_0x0801:
            r5 = r13[r7]
            r8 = 0
            r9 = r13[r8]
            r10 = r13[r17]
            int r1 = java.lang.Math.max(r1, r10)
            int r1 = java.lang.Math.max(r9, r1)
            int r1 = java.lang.Math.max(r5, r1)
            r5 = r14[r7]
            r7 = r14[r8]
            r9 = r14[r27]
            r10 = r14[r17]
            int r9 = java.lang.Math.max(r9, r10)
            int r7 = java.lang.Math.max(r7, r9)
            int r5 = java.lang.Math.max(r5, r7)
            int r5 = r5 + r1
            int r1 = java.lang.Math.max(r2, r5)
            r2 = r1
        L_0x082e:
            r25 = r12
        L_0x0830:
            if (r19 != 0) goto L_0x0837
            r1 = 1073741824(0x40000000, float:2.0)
            if (r11 == r1) goto L_0x0837
            goto L_0x0838
        L_0x0837:
            r0 = r2
        L_0x0838:
            int r1 = r37.getPaddingTop()
            int r2 = r37.getPaddingBottom()
            int r2 = r2 + r1
            int r2 = r2 + r0
            int r0 = r37.getSuggestedMinimumHeight()
            int r0 = java.lang.Math.max(r2, r0)
            r1 = -16777216(0xffffffffff000000, float:-1.7014118E38)
            r1 = r25 & r1
            r1 = r1 | r3
            int r2 = r25 << 16
            int r0 = android.view.View.resolveSizeAndState(r0, r4, r2)
            r6.setMeasuredDimension(r1, r0)
            if (r24 == 0) goto L_0x0899
            int r0 = r37.getMeasuredHeight()
            r1 = 1073741824(0x40000000, float:2.0)
            int r7 = android.view.View.MeasureSpec.makeMeasureSpec(r0, r1)
            r9 = r22
        L_0x0866:
            if (r8 >= r9) goto L_0x0899
            android.view.View r1 = r6.getChildAt(r8)
            int r0 = r1.getVisibility()
            r10 = 8
            if (r0 == r10) goto L_0x0895
            android.view.ViewGroup$LayoutParams r0 = r1.getLayoutParams()
            r11 = r0
            o.z0 r11 = (o.C0317z0) r11
            int r0 = r11.height
            r12 = -1
            if (r0 != r12) goto L_0x0896
            int r13 = r11.width
            int r0 = r1.getMeasuredWidth()
            r11.width = r0
            r3 = 0
            r5 = 0
            r0 = r37
            r2 = r38
            r4 = r7
            r0.measureChildWithMargins(r1, r2, r3, r4, r5)
            r11.width = r13
            goto L_0x0896
        L_0x0895:
            r12 = -1
        L_0x0896:
            int r8 = r8 + 1
            goto L_0x0866
        L_0x0899:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: o.A0.onMeasure(int, int):void");
    }

    public void setWeightSum(float f2) {
        this.f4039l = Math.max(0.0f, f2);
    }

    public final boolean shouldDelayChildPressedState() {
        return false;
    }

    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof C0317z0;
    }

    public final void d(Canvas canvas, int i2) {
        this.f4043p.setBounds(getPaddingLeft() + this.f4047t, i2, (getWidth() - getPaddingRight()) - this.f4047t, this.f4045r + i2);
        this.f4043p.draw(canvas);
    }

    public final void e(Canvas canvas, int i2) {
        this.f4043p.setBounds(i2, getPaddingTop() + this.f4047t, this.f4044q + i2, (getHeight() - getPaddingBottom()) - this.f4047t);
        this.f4043p.draw(canvas);
    }

    /* JADX WARNING: type inference failed for: r0v2, types: [o.z0, android.widget.LinearLayout$LayoutParams] */
    /* JADX WARNING: type inference failed for: r0v3, types: [o.z0, android.widget.LinearLayout$LayoutParams] */
    /* renamed from: f */
    public C0317z0 generateDefaultLayoutParams() {
        int i2 = this.i;
        if (i2 == 0) {
            return new LinearLayout.LayoutParams(-2, -2);
        }
        if (i2 == 1) {
            return new LinearLayout.LayoutParams(-1, -2);
        }
        return null;
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [o.z0, android.widget.LinearLayout$LayoutParams] */
    /* renamed from: g */
    public C0317z0 generateLayoutParams(AttributeSet attributeSet) {
        return new LinearLayout.LayoutParams(getContext(), attributeSet);
    }

    public int getBaseline() {
        int i2;
        if (this.f4035g < 0) {
            return super.getBaseline();
        }
        int childCount = getChildCount();
        int i3 = this.f4035g;
        if (childCount > i3) {
            View childAt = getChildAt(i3);
            int baseline = childAt.getBaseline();
            if (baseline != -1) {
                int i4 = this.f4036h;
                if (this.i == 1 && (i2 = this.f4037j & 112) != 48) {
                    if (i2 == 16) {
                        i4 += ((((getBottom() - getTop()) - getPaddingTop()) - getPaddingBottom()) - this.f4038k) / 2;
                    } else if (i2 == 80) {
                        i4 = ((getBottom() - getTop()) - getPaddingBottom()) - this.f4038k;
                    }
                }
                return i4 + ((C0317z0) childAt.getLayoutParams()).topMargin + baseline;
            } else if (this.f4035g == 0) {
                return -1;
            } else {
                throw new RuntimeException("mBaselineAlignedChildIndex of LinearLayout points to a View that doesn't know how to get its baseline.");
            }
        } else {
            throw new RuntimeException("mBaselineAlignedChildIndex of LinearLayout set to an index that is out of bounds.");
        }
    }

    public int getBaselineAlignedChildIndex() {
        return this.f4035g;
    }

    public Drawable getDividerDrawable() {
        return this.f4043p;
    }

    public int getDividerPadding() {
        return this.f4047t;
    }

    public int getDividerWidth() {
        return this.f4044q;
    }

    public int getGravity() {
        return this.f4037j;
    }

    public int getOrientation() {
        return this.i;
    }

    public int getShowDividers() {
        return this.f4046s;
    }

    public float getWeightSum() {
        return this.f4039l;
    }

    /* JADX WARNING: type inference failed for: r0v2, types: [o.z0, android.widget.LinearLayout$LayoutParams] */
    /* JADX WARNING: type inference failed for: r0v3, types: [o.z0, android.widget.LinearLayout$LayoutParams] */
    /* JADX WARNING: type inference failed for: r0v4, types: [o.z0, android.widget.LinearLayout$LayoutParams] */
    /* renamed from: h */
    public C0317z0 generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        if (layoutParams instanceof C0317z0) {
            return new LinearLayout.LayoutParams((C0317z0) layoutParams);
        }
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            return new LinearLayout.LayoutParams((ViewGroup.MarginLayoutParams) layoutParams);
        }
        return new LinearLayout.LayoutParams(layoutParams);
    }

    /* JADX WARNING: Removed duplicated region for block: B:26:0x0099  */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x0156  */
    /* JADX WARNING: Removed duplicated region for block: B:61:0x015f  */
    /* JADX WARNING: Removed duplicated region for block: B:72:0x018f  */
    /* JADX WARNING: Removed duplicated region for block: B:75:0x01a1  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onLayout(boolean r23, int r24, int r25, int r26, int r27) {
        /*
            r22 = this;
            r0 = r22
            int r1 = r0.i
            r2 = 5
            r3 = 8
            r5 = 80
            r6 = 2
            r7 = 16
            r8 = 8388615(0x800007, float:1.1754953E-38)
            r9 = 1
            if (r1 != r9) goto L_0x00af
            int r1 = r22.getPaddingLeft()
            int r10 = r26 - r24
            int r11 = r22.getPaddingRight()
            int r11 = r10 - r11
            int r10 = r10 - r1
            int r12 = r22.getPaddingRight()
            int r10 = r10 - r12
            int r12 = r22.getVirtualChildCount()
            int r13 = r0.f4037j
            r14 = r13 & 112(0x70, float:1.57E-43)
            r8 = r8 & r13
            if (r14 == r7) goto L_0x0042
            if (r14 == r5) goto L_0x0036
            int r5 = r22.getPaddingTop()
            goto L_0x004d
        L_0x0036:
            int r5 = r22.getPaddingTop()
            int r5 = r5 + r27
            int r5 = r5 - r25
            int r7 = r0.f4038k
            int r5 = r5 - r7
            goto L_0x004d
        L_0x0042:
            int r5 = r22.getPaddingTop()
            int r7 = r27 - r25
            int r13 = r0.f4038k
            int r7 = r7 - r13
            int r7 = r7 / r6
            int r5 = r5 + r7
        L_0x004d:
            r4 = 0
        L_0x004e:
            if (r4 >= r12) goto L_0x01cc
            android.view.View r7 = r0.getChildAt(r4)
            if (r7 != 0) goto L_0x0057
            goto L_0x00aa
        L_0x0057:
            int r13 = r7.getVisibility()
            if (r13 == r3) goto L_0x00aa
            int r13 = r7.getMeasuredWidth()
            int r14 = r7.getMeasuredHeight()
            android.view.ViewGroup$LayoutParams r15 = r7.getLayoutParams()
            o.z0 r15 = (o.C0317z0) r15
            int r3 = r15.gravity
            if (r3 >= 0) goto L_0x0070
            r3 = r8
        L_0x0070:
            int r6 = r22.getLayoutDirection()
            int r3 = android.view.Gravity.getAbsoluteGravity(r3, r6)
            r3 = r3 & 7
            if (r3 == r9) goto L_0x0088
            if (r3 == r2) goto L_0x0082
            int r3 = r15.leftMargin
            int r3 = r3 + r1
            goto L_0x0093
        L_0x0082:
            int r3 = r11 - r13
            int r6 = r15.rightMargin
        L_0x0086:
            int r3 = r3 - r6
            goto L_0x0093
        L_0x0088:
            int r3 = r10 - r13
            r6 = 2
            int r3 = r3 / r6
            int r3 = r3 + r1
            int r6 = r15.leftMargin
            int r3 = r3 + r6
            int r6 = r15.rightMargin
            goto L_0x0086
        L_0x0093:
            boolean r6 = r0.i(r4)
            if (r6 == 0) goto L_0x009c
            int r6 = r0.f4045r
            int r5 = r5 + r6
        L_0x009c:
            int r6 = r15.topMargin
            int r5 = r5 + r6
            int r13 = r13 + r3
            int r6 = r5 + r14
            r7.layout(r3, r5, r13, r6)
            int r3 = r15.bottomMargin
            int r14 = r14 + r3
            int r14 = r14 + r5
            r5 = r14
        L_0x00aa:
            int r4 = r4 + r9
            r3 = 8
            r6 = 2
            goto L_0x004e
        L_0x00af:
            boolean r1 = o.n1.f4272a
            int r1 = r22.getLayoutDirection()
            if (r1 != r9) goto L_0x00b9
            r1 = 1
            goto L_0x00ba
        L_0x00b9:
            r1 = 0
        L_0x00ba:
            int r3 = r22.getPaddingTop()
            int r6 = r27 - r25
            int r10 = r22.getPaddingBottom()
            int r10 = r6 - r10
            int r6 = r6 - r3
            int r11 = r22.getPaddingBottom()
            int r6 = r6 - r11
            int r11 = r22.getVirtualChildCount()
            int r12 = r0.f4037j
            r8 = r8 & r12
            r12 = r12 & 112(0x70, float:1.57E-43)
            boolean r13 = r0.f4034f
            int[] r14 = r0.f4041n
            int[] r15 = r0.f4042o
            int r4 = r22.getLayoutDirection()
            int r4 = android.view.Gravity.getAbsoluteGravity(r8, r4)
            if (r4 == r9) goto L_0x00f8
            if (r4 == r2) goto L_0x00ec
            int r2 = r22.getPaddingLeft()
            goto L_0x0104
        L_0x00ec:
            int r2 = r22.getPaddingLeft()
            int r2 = r2 + r26
            int r2 = r2 - r24
            int r4 = r0.f4038k
            int r2 = r2 - r4
            goto L_0x0104
        L_0x00f8:
            int r2 = r22.getPaddingLeft()
            int r4 = r26 - r24
            int r8 = r0.f4038k
            int r4 = r4 - r8
            r8 = 2
            int r4 = r4 / r8
            int r2 = r2 + r4
        L_0x0104:
            if (r1 == 0) goto L_0x010a
            int r1 = r11 + -1
            r8 = -1
            goto L_0x010c
        L_0x010a:
            r1 = 0
            r8 = 1
        L_0x010c:
            r9 = 0
        L_0x010d:
            if (r9 >= r11) goto L_0x01cc
            int r17 = r8 * r9
            int r5 = r17 + r1
            android.view.View r7 = r0.getChildAt(r5)
            if (r7 != 0) goto L_0x0125
            r25 = r1
            r26 = r8
            r27 = r11
            r19 = r12
            r1 = 1
            r12 = -1
            goto L_0x01bd
        L_0x0125:
            int r4 = r7.getVisibility()
            r25 = r1
            r1 = 8
            if (r4 == r1) goto L_0x01b5
            int r4 = r7.getMeasuredWidth()
            int r18 = r7.getMeasuredHeight()
            android.view.ViewGroup$LayoutParams r19 = r7.getLayoutParams()
            r1 = r19
            o.z0 r1 = (o.C0317z0) r1
            r26 = r8
            if (r13 == 0) goto L_0x014f
            int r8 = r1.height
            r27 = r11
            r11 = -1
            if (r8 == r11) goto L_0x0151
            int r11 = r7.getBaseline()
            goto L_0x0152
        L_0x014f:
            r27 = r11
        L_0x0151:
            r11 = -1
        L_0x0152:
            int r8 = r1.gravity
            if (r8 >= 0) goto L_0x0157
            r8 = r12
        L_0x0157:
            r8 = r8 & 112(0x70, float:1.57E-43)
            r19 = r12
            r12 = 16
            if (r8 == r12) goto L_0x018f
            r12 = 48
            if (r8 == r12) goto L_0x0180
            r12 = 80
            if (r8 == r12) goto L_0x016a
            r8 = r3
            r12 = -1
            goto L_0x019b
        L_0x016a:
            int r8 = r10 - r18
            int r12 = r1.bottomMargin
            int r8 = r8 - r12
            r12 = -1
            if (r11 == r12) goto L_0x019b
            int r20 = r7.getMeasuredHeight()
            int r20 = r20 - r11
            r11 = 2
            r21 = r15[r11]
            int r21 = r21 - r20
            int r8 = r8 - r21
            goto L_0x019b
        L_0x0180:
            r12 = -1
            int r8 = r1.topMargin
            int r8 = r8 + r3
            if (r11 == r12) goto L_0x019b
            r16 = 1
            r20 = r14[r16]
            int r20 = r20 - r11
            int r8 = r20 + r8
            goto L_0x019b
        L_0x018f:
            r12 = -1
            int r8 = r6 - r18
            r11 = 2
            int r8 = r8 / r11
            int r8 = r8 + r3
            int r11 = r1.topMargin
            int r8 = r8 + r11
            int r11 = r1.bottomMargin
            int r8 = r8 - r11
        L_0x019b:
            boolean r5 = r0.i(r5)
            if (r5 == 0) goto L_0x01a4
            int r5 = r0.f4044q
            int r2 = r2 + r5
        L_0x01a4:
            int r5 = r1.leftMargin
            int r2 = r2 + r5
            int r5 = r2 + r4
            int r11 = r8 + r18
            r7.layout(r2, r8, r5, r11)
            int r1 = r1.rightMargin
            int r4 = r4 + r1
            int r4 = r4 + r2
            r2 = r4
        L_0x01b3:
            r1 = 1
            goto L_0x01bd
        L_0x01b5:
            r26 = r8
            r27 = r11
            r19 = r12
            r12 = -1
            goto L_0x01b3
        L_0x01bd:
            int r9 = r9 + r1
            r1 = r25
            r8 = r26
            r11 = r27
            r12 = r19
            r5 = 80
            r7 = 16
            goto L_0x010d
        L_0x01cc:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: o.A0.onLayout(boolean, int, int, int, int):void");
    }

    public void setBaselineAligned(boolean z2) {
        this.f4034f = z2;
    }

    public void setBaselineAlignedChildIndex(int i2) {
        if (i2 < 0 || i2 >= getChildCount()) {
            throw new IllegalArgumentException("base aligned child index out of range (0, " + getChildCount() + ")");
        }
        this.f4035g = i2;
    }

    public void setDividerDrawable(Drawable drawable) {
        if (drawable != this.f4043p) {
            this.f4043p = drawable;
            boolean z2 = false;
            if (drawable != null) {
                this.f4044q = drawable.getIntrinsicWidth();
                this.f4045r = drawable.getIntrinsicHeight();
            } else {
                this.f4044q = 0;
                this.f4045r = 0;
            }
            if (drawable == null) {
                z2 = true;
            }
            setWillNotDraw(z2);
            requestLayout();
        }
    }

    public void setDividerPadding(int i2) {
        this.f4047t = i2;
    }

    public void setGravity(int i2) {
        if (this.f4037j != i2) {
            if ((8388615 & i2) == 0) {
                i2 |= 8388611;
            }
            if ((i2 & 112) == 0) {
                i2 |= 48;
            }
            this.f4037j = i2;
            requestLayout();
        }
    }

    public void setMeasureWithLargestChildEnabled(boolean z2) {
        this.f4040m = z2;
    }

    public void setOrientation(int i2) {
        if (this.i != i2) {
            this.i = i2;
            requestLayout();
        }
    }

    public void setShowDividers(int i2) {
        if (i2 != this.f4046s) {
            requestLayout();
        }
        this.f4046s = i2;
    }

    public void setVerticalGravity(int i2) {
        int i3 = i2 & 112;
        int i4 = this.f4037j;
        if ((i4 & 112) != i3) {
            this.f4037j = i3 | (i4 & -113);
            requestLayout();
        }
    }

    public int getVirtualChildCount() {
        return getChildCount();
    }

    public final void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName("androidx.appcompat.widget.LinearLayoutCompat");
    }

    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName("androidx.appcompat.widget.LinearLayoutCompat");
    }

    public void setHorizontalGravity(int i2) {
        int i3 = i2 & 8388615;
        int i4 = this.f4037j;
        if ((8388615 & i4) != i3) {
            this.f4037j = i3 | (-8388616 & i4);
            requestLayout();
        }
    }
}
