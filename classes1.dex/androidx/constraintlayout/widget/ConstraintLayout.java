package androidx.constraintlayout.widget;

import E.j;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import t.C0337c;
import v.C0347d;
import v.C0348e;
import v.h;
import y.c;
import y.d;
import y.e;
import y.f;
import y.n;
import y.o;
import y.p;
import y.r;
import y.s;

public class ConstraintLayout extends ViewGroup {

    /* renamed from: u  reason: collision with root package name */
    public static s f1420u;

    /* renamed from: f  reason: collision with root package name */
    public final SparseArray f1421f = new SparseArray();

    /* renamed from: g  reason: collision with root package name */
    public final ArrayList f1422g = new ArrayList(4);

    /* renamed from: h  reason: collision with root package name */
    public final C0348e f1423h = new C0348e();
    public int i = 0;

    /* renamed from: j  reason: collision with root package name */
    public int f1424j = 0;

    /* renamed from: k  reason: collision with root package name */
    public int f1425k = Integer.MAX_VALUE;

    /* renamed from: l  reason: collision with root package name */
    public int f1426l = Integer.MAX_VALUE;

    /* renamed from: m  reason: collision with root package name */
    public boolean f1427m = true;

    /* renamed from: n  reason: collision with root package name */
    public int f1428n = 257;

    /* renamed from: o  reason: collision with root package name */
    public n f1429o = null;

    /* renamed from: p  reason: collision with root package name */
    public j f1430p = null;

    /* renamed from: q  reason: collision with root package name */
    public int f1431q = -1;

    /* renamed from: r  reason: collision with root package name */
    public HashMap f1432r = new HashMap();

    /* renamed from: s  reason: collision with root package name */
    public final SparseArray f1433s = new SparseArray();

    /* renamed from: t  reason: collision with root package name */
    public final f f1434t = new f(this, this);

    public ConstraintLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        i(attributeSet, 0);
    }

    public final void forceLayout() {
        this.f1427m = true;
        super.forceLayout();
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [y.e, android.view.ViewGroup$LayoutParams, android.view.ViewGroup$MarginLayoutParams, java.lang.Object] */
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        Context context = getContext();
        ? marginLayoutParams = new ViewGroup.MarginLayoutParams(context, attributeSet);
        marginLayoutParams.f4977a = -1;
        marginLayoutParams.f4979b = -1;
        marginLayoutParams.f4981c = -1.0f;
        marginLayoutParams.f4983d = true;
        marginLayoutParams.e = -1;
        marginLayoutParams.f4986f = -1;
        marginLayoutParams.f4988g = -1;
        marginLayoutParams.f4990h = -1;
        marginLayoutParams.i = -1;
        marginLayoutParams.f4993j = -1;
        marginLayoutParams.f4995k = -1;
        marginLayoutParams.f4997l = -1;
        marginLayoutParams.f4999m = -1;
        marginLayoutParams.f5000n = -1;
        marginLayoutParams.f5002o = -1;
        marginLayoutParams.f5004p = -1;
        marginLayoutParams.f5006q = 0;
        marginLayoutParams.f5007r = 0.0f;
        marginLayoutParams.f5008s = -1;
        marginLayoutParams.f5009t = -1;
        marginLayoutParams.f5010u = -1;
        marginLayoutParams.f5011v = -1;
        marginLayoutParams.f5012w = Integer.MIN_VALUE;
        marginLayoutParams.f5013x = Integer.MIN_VALUE;
        marginLayoutParams.f5014y = Integer.MIN_VALUE;
        marginLayoutParams.f5015z = Integer.MIN_VALUE;
        marginLayoutParams.f4952A = Integer.MIN_VALUE;
        marginLayoutParams.f4953B = Integer.MIN_VALUE;
        marginLayoutParams.f4954C = Integer.MIN_VALUE;
        marginLayoutParams.f4955D = 0;
        marginLayoutParams.f4956E = 0.5f;
        marginLayoutParams.f4957F = 0.5f;
        marginLayoutParams.f4958G = null;
        marginLayoutParams.f4959H = -1.0f;
        marginLayoutParams.I = -1.0f;
        marginLayoutParams.f4960J = 0;
        marginLayoutParams.f4961K = 0;
        marginLayoutParams.f4962L = 0;
        marginLayoutParams.f4963M = 0;
        marginLayoutParams.f4964N = 0;
        marginLayoutParams.f4965O = 0;
        marginLayoutParams.f4966P = 0;
        marginLayoutParams.f4967Q = 0;
        marginLayoutParams.f4968R = 1.0f;
        marginLayoutParams.f4969S = 1.0f;
        marginLayoutParams.f4970T = -1;
        marginLayoutParams.f4971U = -1;
        marginLayoutParams.f4972V = -1;
        marginLayoutParams.f4973W = false;
        marginLayoutParams.f4974X = false;
        marginLayoutParams.f4975Y = null;
        marginLayoutParams.f4976Z = 0;
        marginLayoutParams.f4978a0 = true;
        marginLayoutParams.f4980b0 = true;
        marginLayoutParams.f4982c0 = false;
        marginLayoutParams.f4984d0 = false;
        marginLayoutParams.f4985e0 = false;
        marginLayoutParams.f4987f0 = -1;
        marginLayoutParams.f4989g0 = -1;
        marginLayoutParams.f4991h0 = -1;
        marginLayoutParams.f4992i0 = -1;
        marginLayoutParams.f4994j0 = Integer.MIN_VALUE;
        marginLayoutParams.f4996k0 = Integer.MIN_VALUE;
        marginLayoutParams.f4998l0 = 0.5f;
        marginLayoutParams.f5005p0 = new C0347d();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, r.f5137b);
        int indexCount = obtainStyledAttributes.getIndexCount();
        for (int i2 = 0; i2 < indexCount; i2++) {
            int index = obtainStyledAttributes.getIndex(i2);
            int i3 = d.f4951a.get(index);
            switch (i3) {
                case 1:
                    marginLayoutParams.f4972V = obtainStyledAttributes.getInt(index, marginLayoutParams.f4972V);
                    break;
                case 2:
                    int resourceId = obtainStyledAttributes.getResourceId(index, marginLayoutParams.f5004p);
                    marginLayoutParams.f5004p = resourceId;
                    if (resourceId != -1) {
                        break;
                    } else {
                        marginLayoutParams.f5004p = obtainStyledAttributes.getInt(index, -1);
                        break;
                    }
                case 3:
                    marginLayoutParams.f5006q = obtainStyledAttributes.getDimensionPixelSize(index, marginLayoutParams.f5006q);
                    break;
                case 4:
                    float f2 = obtainStyledAttributes.getFloat(index, marginLayoutParams.f5007r) % 360.0f;
                    marginLayoutParams.f5007r = f2;
                    if (f2 >= 0.0f) {
                        break;
                    } else {
                        marginLayoutParams.f5007r = (360.0f - f2) % 360.0f;
                        break;
                    }
                case 5:
                    marginLayoutParams.f4977a = obtainStyledAttributes.getDimensionPixelOffset(index, marginLayoutParams.f4977a);
                    break;
                case 6:
                    marginLayoutParams.f4979b = obtainStyledAttributes.getDimensionPixelOffset(index, marginLayoutParams.f4979b);
                    break;
                case 7:
                    marginLayoutParams.f4981c = obtainStyledAttributes.getFloat(index, marginLayoutParams.f4981c);
                    break;
                case 8:
                    int resourceId2 = obtainStyledAttributes.getResourceId(index, marginLayoutParams.e);
                    marginLayoutParams.e = resourceId2;
                    if (resourceId2 != -1) {
                        break;
                    } else {
                        marginLayoutParams.e = obtainStyledAttributes.getInt(index, -1);
                        break;
                    }
                case 9:
                    int resourceId3 = obtainStyledAttributes.getResourceId(index, marginLayoutParams.f4986f);
                    marginLayoutParams.f4986f = resourceId3;
                    if (resourceId3 != -1) {
                        break;
                    } else {
                        marginLayoutParams.f4986f = obtainStyledAttributes.getInt(index, -1);
                        break;
                    }
                case 10:
                    int resourceId4 = obtainStyledAttributes.getResourceId(index, marginLayoutParams.f4988g);
                    marginLayoutParams.f4988g = resourceId4;
                    if (resourceId4 != -1) {
                        break;
                    } else {
                        marginLayoutParams.f4988g = obtainStyledAttributes.getInt(index, -1);
                        break;
                    }
                case 11:
                    int resourceId5 = obtainStyledAttributes.getResourceId(index, marginLayoutParams.f4990h);
                    marginLayoutParams.f4990h = resourceId5;
                    if (resourceId5 != -1) {
                        break;
                    } else {
                        marginLayoutParams.f4990h = obtainStyledAttributes.getInt(index, -1);
                        break;
                    }
                case 12:
                    int resourceId6 = obtainStyledAttributes.getResourceId(index, marginLayoutParams.i);
                    marginLayoutParams.i = resourceId6;
                    if (resourceId6 != -1) {
                        break;
                    } else {
                        marginLayoutParams.i = obtainStyledAttributes.getInt(index, -1);
                        break;
                    }
                case 13:
                    int resourceId7 = obtainStyledAttributes.getResourceId(index, marginLayoutParams.f4993j);
                    marginLayoutParams.f4993j = resourceId7;
                    if (resourceId7 != -1) {
                        break;
                    } else {
                        marginLayoutParams.f4993j = obtainStyledAttributes.getInt(index, -1);
                        break;
                    }
                case 14:
                    int resourceId8 = obtainStyledAttributes.getResourceId(index, marginLayoutParams.f4995k);
                    marginLayoutParams.f4995k = resourceId8;
                    if (resourceId8 != -1) {
                        break;
                    } else {
                        marginLayoutParams.f4995k = obtainStyledAttributes.getInt(index, -1);
                        break;
                    }
                case 15:
                    int resourceId9 = obtainStyledAttributes.getResourceId(index, marginLayoutParams.f4997l);
                    marginLayoutParams.f4997l = resourceId9;
                    if (resourceId9 != -1) {
                        break;
                    } else {
                        marginLayoutParams.f4997l = obtainStyledAttributes.getInt(index, -1);
                        break;
                    }
                case 16:
                    int resourceId10 = obtainStyledAttributes.getResourceId(index, marginLayoutParams.f4999m);
                    marginLayoutParams.f4999m = resourceId10;
                    if (resourceId10 != -1) {
                        break;
                    } else {
                        marginLayoutParams.f4999m = obtainStyledAttributes.getInt(index, -1);
                        break;
                    }
                case 17:
                    int resourceId11 = obtainStyledAttributes.getResourceId(index, marginLayoutParams.f5008s);
                    marginLayoutParams.f5008s = resourceId11;
                    if (resourceId11 != -1) {
                        break;
                    } else {
                        marginLayoutParams.f5008s = obtainStyledAttributes.getInt(index, -1);
                        break;
                    }
                case 18:
                    int resourceId12 = obtainStyledAttributes.getResourceId(index, marginLayoutParams.f5009t);
                    marginLayoutParams.f5009t = resourceId12;
                    if (resourceId12 != -1) {
                        break;
                    } else {
                        marginLayoutParams.f5009t = obtainStyledAttributes.getInt(index, -1);
                        break;
                    }
                case 19:
                    int resourceId13 = obtainStyledAttributes.getResourceId(index, marginLayoutParams.f5010u);
                    marginLayoutParams.f5010u = resourceId13;
                    if (resourceId13 != -1) {
                        break;
                    } else {
                        marginLayoutParams.f5010u = obtainStyledAttributes.getInt(index, -1);
                        break;
                    }
                case 20:
                    int resourceId14 = obtainStyledAttributes.getResourceId(index, marginLayoutParams.f5011v);
                    marginLayoutParams.f5011v = resourceId14;
                    if (resourceId14 != -1) {
                        break;
                    } else {
                        marginLayoutParams.f5011v = obtainStyledAttributes.getInt(index, -1);
                        break;
                    }
                case 21:
                    marginLayoutParams.f5012w = obtainStyledAttributes.getDimensionPixelSize(index, marginLayoutParams.f5012w);
                    break;
                case 22:
                    marginLayoutParams.f5013x = obtainStyledAttributes.getDimensionPixelSize(index, marginLayoutParams.f5013x);
                    break;
                case 23:
                    marginLayoutParams.f5014y = obtainStyledAttributes.getDimensionPixelSize(index, marginLayoutParams.f5014y);
                    break;
                case 24:
                    marginLayoutParams.f5015z = obtainStyledAttributes.getDimensionPixelSize(index, marginLayoutParams.f5015z);
                    break;
                case 25:
                    marginLayoutParams.f4952A = obtainStyledAttributes.getDimensionPixelSize(index, marginLayoutParams.f4952A);
                    break;
                case 26:
                    marginLayoutParams.f4953B = obtainStyledAttributes.getDimensionPixelSize(index, marginLayoutParams.f4953B);
                    break;
                case 27:
                    marginLayoutParams.f4973W = obtainStyledAttributes.getBoolean(index, marginLayoutParams.f4973W);
                    break;
                case 28:
                    marginLayoutParams.f4974X = obtainStyledAttributes.getBoolean(index, marginLayoutParams.f4974X);
                    break;
                case 29:
                    marginLayoutParams.f4956E = obtainStyledAttributes.getFloat(index, marginLayoutParams.f4956E);
                    break;
                case 30:
                    marginLayoutParams.f4957F = obtainStyledAttributes.getFloat(index, marginLayoutParams.f4957F);
                    break;
                case 31:
                    int i4 = obtainStyledAttributes.getInt(index, 0);
                    marginLayoutParams.f4962L = i4;
                    if (i4 != 1) {
                        break;
                    } else {
                        Log.e("ConstraintLayout", "layout_constraintWidth_default=\"wrap\" is deprecated.\nUse layout_width=\"WRAP_CONTENT\" and layout_constrainedWidth=\"true\" instead.");
                        break;
                    }
                case 32:
                    int i5 = obtainStyledAttributes.getInt(index, 0);
                    marginLayoutParams.f4963M = i5;
                    if (i5 != 1) {
                        break;
                    } else {
                        Log.e("ConstraintLayout", "layout_constraintHeight_default=\"wrap\" is deprecated.\nUse layout_height=\"WRAP_CONTENT\" and layout_constrainedHeight=\"true\" instead.");
                        break;
                    }
                case 33:
                    try {
                        marginLayoutParams.f4964N = obtainStyledAttributes.getDimensionPixelSize(index, marginLayoutParams.f4964N);
                        break;
                    } catch (Exception unused) {
                        if (obtainStyledAttributes.getInt(index, marginLayoutParams.f4964N) != -2) {
                            break;
                        } else {
                            marginLayoutParams.f4964N = -2;
                            break;
                        }
                    }
                case 34:
                    try {
                        marginLayoutParams.f4966P = obtainStyledAttributes.getDimensionPixelSize(index, marginLayoutParams.f4966P);
                        break;
                    } catch (Exception unused2) {
                        if (obtainStyledAttributes.getInt(index, marginLayoutParams.f4966P) != -2) {
                            break;
                        } else {
                            marginLayoutParams.f4966P = -2;
                            break;
                        }
                    }
                case 35:
                    marginLayoutParams.f4968R = Math.max(0.0f, obtainStyledAttributes.getFloat(index, marginLayoutParams.f4968R));
                    marginLayoutParams.f4962L = 2;
                    break;
                case 36:
                    try {
                        marginLayoutParams.f4965O = obtainStyledAttributes.getDimensionPixelSize(index, marginLayoutParams.f4965O);
                        break;
                    } catch (Exception unused3) {
                        if (obtainStyledAttributes.getInt(index, marginLayoutParams.f4965O) != -2) {
                            break;
                        } else {
                            marginLayoutParams.f4965O = -2;
                            break;
                        }
                    }
                case 37:
                    try {
                        marginLayoutParams.f4967Q = obtainStyledAttributes.getDimensionPixelSize(index, marginLayoutParams.f4967Q);
                        break;
                    } catch (Exception unused4) {
                        if (obtainStyledAttributes.getInt(index, marginLayoutParams.f4967Q) != -2) {
                            break;
                        } else {
                            marginLayoutParams.f4967Q = -2;
                            break;
                        }
                    }
                case 38:
                    marginLayoutParams.f4969S = Math.max(0.0f, obtainStyledAttributes.getFloat(index, marginLayoutParams.f4969S));
                    marginLayoutParams.f4963M = 2;
                    break;
                default:
                    switch (i3) {
                        case 44:
                            n.h(marginLayoutParams, obtainStyledAttributes.getString(index));
                            break;
                        case 45:
                            marginLayoutParams.f4959H = obtainStyledAttributes.getFloat(index, marginLayoutParams.f4959H);
                            break;
                        case 46:
                            marginLayoutParams.I = obtainStyledAttributes.getFloat(index, marginLayoutParams.I);
                            break;
                        case 47:
                            marginLayoutParams.f4960J = obtainStyledAttributes.getInt(index, 0);
                            break;
                        case 48:
                            marginLayoutParams.f4961K = obtainStyledAttributes.getInt(index, 0);
                            break;
                        case 49:
                            marginLayoutParams.f4970T = obtainStyledAttributes.getDimensionPixelOffset(index, marginLayoutParams.f4970T);
                            break;
                        case 50:
                            marginLayoutParams.f4971U = obtainStyledAttributes.getDimensionPixelOffset(index, marginLayoutParams.f4971U);
                            break;
                        case 51:
                            marginLayoutParams.f4975Y = obtainStyledAttributes.getString(index);
                            break;
                        case 52:
                            int resourceId15 = obtainStyledAttributes.getResourceId(index, marginLayoutParams.f5000n);
                            marginLayoutParams.f5000n = resourceId15;
                            if (resourceId15 != -1) {
                                break;
                            } else {
                                marginLayoutParams.f5000n = obtainStyledAttributes.getInt(index, -1);
                                break;
                            }
                        case 53:
                            int resourceId16 = obtainStyledAttributes.getResourceId(index, marginLayoutParams.f5002o);
                            marginLayoutParams.f5002o = resourceId16;
                            if (resourceId16 != -1) {
                                break;
                            } else {
                                marginLayoutParams.f5002o = obtainStyledAttributes.getInt(index, -1);
                                break;
                            }
                        case 54:
                            marginLayoutParams.f4955D = obtainStyledAttributes.getDimensionPixelSize(index, marginLayoutParams.f4955D);
                            break;
                        case 55:
                            marginLayoutParams.f4954C = obtainStyledAttributes.getDimensionPixelSize(index, marginLayoutParams.f4954C);
                            break;
                        default:
                            switch (i3) {
                                case 64:
                                    n.g(marginLayoutParams, obtainStyledAttributes, index, 0);
                                    break;
                                case 65:
                                    n.g(marginLayoutParams, obtainStyledAttributes, index, 1);
                                    break;
                                case 66:
                                    marginLayoutParams.f4976Z = obtainStyledAttributes.getInt(index, marginLayoutParams.f4976Z);
                                    break;
                                case 67:
                                    marginLayoutParams.f4983d = obtainStyledAttributes.getBoolean(index, marginLayoutParams.f4983d);
                                    break;
                            }
                    }
            }
        }
        obtainStyledAttributes.recycle();
        marginLayoutParams.a();
        return marginLayoutParams;
    }

    /* JADX WARNING: Removed duplicated region for block: B:148:0x02e8  */
    /* JADX WARNING: Removed duplicated region for block: B:149:0x02ea  */
    /* JADX WARNING: Removed duplicated region for block: B:158:0x032b  */
    /* JADX WARNING: Removed duplicated region for block: B:166:0x0348  */
    /* JADX WARNING: Removed duplicated region for block: B:207:0x0422  */
    /* JADX WARNING: Removed duplicated region for block: B:211:0x0431  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x00b3  */
    /* JADX WARNING: Removed duplicated region for block: B:268:0x04d1  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x00d1  */
    /* JADX WARNING: Removed duplicated region for block: B:384:0x0377 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:395:0x04d5 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:408:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x0121  */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x0124  */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x012b  */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x012e  */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x015a  */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x015c  */
    /* JADX WARNING: Removed duplicated region for block: B:60:0x0160  */
    /* JADX WARNING: Removed duplicated region for block: B:93:0x01c0 A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:99:0x01ca  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void k(v.C0348e r26, int r27, int r28, int r29) {
        /*
            r25 = this;
            r0 = r25
            r1 = r26
            r2 = r27
            int r3 = android.view.View.MeasureSpec.getMode(r28)
            int r4 = android.view.View.MeasureSpec.getSize(r28)
            int r5 = android.view.View.MeasureSpec.getMode(r29)
            int r6 = android.view.View.MeasureSpec.getSize(r29)
            int r7 = r25.getPaddingTop()
            r8 = 0
            int r7 = java.lang.Math.max(r8, r7)
            int r9 = r25.getPaddingBottom()
            int r9 = java.lang.Math.max(r8, r9)
            int r10 = r7 + r9
            int r11 = r25.getPaddingWidth()
            y.f r12 = r0.f1434t
            r12.f5017b = r7
            r12.f5018c = r9
            r12.f5019d = r11
            r12.e = r10
            r9 = r28
            r12.f5020f = r9
            r9 = r29
            r12.f5021g = r9
            int r9 = r25.getPaddingStart()
            int r9 = java.lang.Math.max(r8, r9)
            int r13 = r25.getPaddingEnd()
            int r13 = java.lang.Math.max(r8, r13)
            r14 = 1
            if (r9 > 0) goto L_0x005e
            if (r13 <= 0) goto L_0x0055
            goto L_0x005e
        L_0x0055:
            int r9 = r25.getPaddingLeft()
            int r9 = java.lang.Math.max(r8, r9)
            goto L_0x0075
        L_0x005e:
            android.content.Context r15 = r25.getContext()
            android.content.pm.ApplicationInfo r15 = r15.getApplicationInfo()
            int r15 = r15.flags
            r16 = 4194304(0x400000, float:5.877472E-39)
            r15 = r15 & r16
            if (r15 == 0) goto L_0x0075
            int r15 = r25.getLayoutDirection()
            if (r14 != r15) goto L_0x0075
            r9 = r13
        L_0x0075:
            int r4 = r4 - r11
            int r6 = r6 - r10
            int r10 = r12.e
            int r11 = r12.f5019d
            int r12 = r25.getChildCount()
            r15 = 1073741824(0x40000000, float:2.0)
            r13 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r3 == r13) goto L_0x00a5
            if (r3 == 0) goto L_0x0097
            if (r3 == r15) goto L_0x008c
        L_0x0089:
            r17 = 0
            goto L_0x00b1
        L_0x008c:
            int r14 = r0.f1425k
            int r14 = r14 - r11
            int r14 = java.lang.Math.min(r14, r4)
            r17 = r14
            r14 = 1
            goto L_0x00b1
        L_0x0097:
            if (r12 != 0) goto L_0x00a3
            int r14 = r0.i
            int r14 = java.lang.Math.max(r8, r14)
        L_0x009f:
            r17 = r14
        L_0x00a1:
            r14 = 2
            goto L_0x00b1
        L_0x00a3:
            r14 = 2
            goto L_0x0089
        L_0x00a5:
            if (r12 != 0) goto L_0x00ae
            int r14 = r0.i
            int r14 = java.lang.Math.max(r8, r14)
            goto L_0x009f
        L_0x00ae:
            r17 = r4
            goto L_0x00a1
        L_0x00b1:
            if (r5 == r13) goto L_0x00d1
            if (r5 == 0) goto L_0x00c4
            if (r5 == r15) goto L_0x00ba
            r12 = 1
        L_0x00b8:
            r13 = 0
            goto L_0x00dc
        L_0x00ba:
            int r12 = r0.f1426l
            int r12 = r12 - r10
            int r12 = java.lang.Math.min(r12, r6)
            r13 = r12
            r12 = 1
            goto L_0x00dc
        L_0x00c4:
            if (r12 != 0) goto L_0x00cf
            int r12 = r0.f1424j
            int r12 = java.lang.Math.max(r8, r12)
        L_0x00cc:
            r13 = r12
        L_0x00cd:
            r12 = 2
            goto L_0x00dc
        L_0x00cf:
            r12 = 2
            goto L_0x00b8
        L_0x00d1:
            if (r12 != 0) goto L_0x00da
            int r12 = r0.f1424j
            int r12 = java.lang.Math.max(r8, r12)
            goto L_0x00cc
        L_0x00da:
            r13 = r6
            goto L_0x00cd
        L_0x00dc:
            int r15 = r26.q()
            w.e r8 = r1.f4784s0
            r19 = r6
            r6 = r17
            if (r6 != r15) goto L_0x00ee
            int r15 = r26.k()
            if (r13 == r15) goto L_0x00f0
        L_0x00ee:
            r15 = 1
            goto L_0x00f2
        L_0x00f0:
            r15 = 0
            goto L_0x00f5
        L_0x00f2:
            r8.f4866c = r15
            goto L_0x00f0
        L_0x00f5:
            r1.f4731Y = r15
            r1.f4732Z = r15
            int r15 = r0.f1425k
            int r15 = r15 - r11
            r17 = r8
            int[] r8 = r1.f4710C
            r20 = r4
            r4 = 0
            r8[r4] = r15
            int r15 = r0.f1426l
            int r15 = r15 - r10
            r18 = 1
            r8[r18] = r15
            r1.f4736b0 = r4
            r1.f4738c0 = r4
            r1.M(r14)
            r1.O(r6)
            r1.N(r12)
            r1.L(r13)
            int r6 = r0.i
            int r6 = r6 - r11
            if (r6 >= 0) goto L_0x0124
            r1.f4736b0 = r4
            goto L_0x0126
        L_0x0124:
            r1.f4736b0 = r6
        L_0x0126:
            int r6 = r0.f1424j
            int r6 = r6 - r10
            if (r6 >= 0) goto L_0x012e
            r1.f4738c0 = r4
            goto L_0x0130
        L_0x012e:
            r1.f4738c0 = r6
        L_0x0130:
            r1.f4789x0 = r9
            r1.f4790y0 = r7
            android.support.v4.media.session.t r4 = r1.f4783r0
            r4.getClass()
            y.f r6 = r1.f4786u0
            java.util.ArrayList r7 = r1.f4782q0
            int r7 = r7.size()
            int r9 = r26.q()
            int r10 = r26.k()
            r11 = 128(0x80, float:1.794E-43)
            boolean r11 = v.j.c(r2, r11)
            r12 = 64
            if (r11 != 0) goto L_0x015c
            boolean r2 = v.j.c(r2, r12)
            if (r2 == 0) goto L_0x015a
            goto L_0x015c
        L_0x015a:
            r2 = 0
            goto L_0x015d
        L_0x015c:
            r2 = 1
        L_0x015d:
            r13 = 3
            if (r2 == 0) goto L_0x01bc
            r15 = 0
        L_0x0161:
            if (r15 >= r7) goto L_0x01bc
            java.util.ArrayList r12 = r1.f4782q0
            java.lang.Object r12 = r12.get(r15)
            v.d r12 = (v.C0347d) r12
            int[] r14 = r12.f4761p0
            r18 = 0
            r0 = r14[r18]
            if (r0 != r13) goto L_0x0177
            r0 = 1
        L_0x0174:
            r22 = 1
            goto L_0x0179
        L_0x0177:
            r0 = 0
            goto L_0x0174
        L_0x0179:
            r14 = r14[r22]
            if (r14 != r13) goto L_0x017f
            r14 = 1
            goto L_0x0180
        L_0x017f:
            r14 = 0
        L_0x0180:
            if (r0 == 0) goto L_0x018d
            if (r14 == 0) goto L_0x018d
            float r0 = r12.f4729W
            r14 = 0
            int r0 = (r0 > r14 ? 1 : (r0 == r14 ? 0 : -1))
            if (r0 <= 0) goto L_0x018d
            r0 = 1
            goto L_0x018e
        L_0x018d:
            r0 = 0
        L_0x018e:
            boolean r14 = r12.x()
            if (r14 == 0) goto L_0x019a
            if (r0 == 0) goto L_0x019a
        L_0x0196:
            r0 = 1073741824(0x40000000, float:2.0)
            r2 = 0
            goto L_0x01be
        L_0x019a:
            boolean r14 = r12.y()
            if (r14 == 0) goto L_0x01a3
            if (r0 == 0) goto L_0x01a3
            goto L_0x0196
        L_0x01a3:
            boolean r0 = r12 instanceof v.g
            if (r0 == 0) goto L_0x01a8
            goto L_0x0196
        L_0x01a8:
            boolean r0 = r12.x()
            if (r0 != 0) goto L_0x0196
            boolean r0 = r12.y()
            if (r0 == 0) goto L_0x01b5
            goto L_0x0196
        L_0x01b5:
            int r15 = r15 + 1
            r0 = r25
            r12 = 64
            goto L_0x0161
        L_0x01bc:
            r0 = 1073741824(0x40000000, float:2.0)
        L_0x01be:
            if (r3 != r0) goto L_0x01c2
            if (r5 == r0) goto L_0x01c4
        L_0x01c2:
            if (r11 == 0) goto L_0x01c6
        L_0x01c4:
            r0 = 1
            goto L_0x01c7
        L_0x01c6:
            r0 = 0
        L_0x01c7:
            r0 = r0 & r2
            if (r0 == 0) goto L_0x0422
            r12 = 0
            r14 = r8[r12]
            r12 = r20
            int r12 = java.lang.Math.min(r14, r12)
            r14 = 1
            r8 = r8[r14]
            r15 = r19
            int r8 = java.lang.Math.min(r8, r15)
            r15 = 1073741824(0x40000000, float:2.0)
            if (r3 != r15) goto L_0x01ed
            int r13 = r26.q()
            if (r13 == r12) goto L_0x01ed
            r1.O(r12)
            w.e r12 = r1.f4784s0
            r12.f4865b = r14
        L_0x01ed:
            if (r5 != r15) goto L_0x01fc
            int r12 = r26.k()
            if (r12 == r8) goto L_0x01fc
            r1.L(r8)
            w.e r8 = r1.f4784s0
            r8.f4865b = r14
        L_0x01fc:
            if (r3 != r15) goto L_0x0384
            if (r5 != r15) goto L_0x0384
            r8 = r17
            boolean r12 = r8.f4865b
            v.e r13 = r8.f4864a
            if (r12 != 0) goto L_0x020f
            boolean r12 = r8.f4866c
            if (r12 == 0) goto L_0x020d
            goto L_0x020f
        L_0x020d:
            r15 = 0
            goto L_0x0244
        L_0x020f:
            java.util.ArrayList r12 = r13.f4782q0
            java.util.Iterator r12 = r12.iterator()
        L_0x0215:
            boolean r14 = r12.hasNext()
            if (r14 == 0) goto L_0x0232
            java.lang.Object r14 = r12.next()
            v.d r14 = (v.C0347d) r14
            r14.h()
            r15 = 0
            r14.f4733a = r15
            w.k r2 = r14.f4739d
            r2.n()
            w.m r2 = r14.e
            r2.m()
            goto L_0x0215
        L_0x0232:
            r15 = 0
            r13.h()
            r13.f4733a = r15
            w.k r2 = r13.f4739d
            r2.n()
            w.m r2 = r13.e
            r2.m()
            r8.f4866c = r15
        L_0x0244:
            v.e r2 = r8.f4867d
            r8.b(r2)
            r13.f4731Y = r15
            r13.f4732Z = r15
            int r2 = r13.j(r15)
            r12 = 1
            int r14 = r13.j(r12)
            boolean r12 = r8.f4865b
            if (r12 == 0) goto L_0x025d
            r8.c()
        L_0x025d:
            int r12 = r13.r()
            int r15 = r13.s()
            r20 = r0
            w.k r0 = r13.f4739d
            w.f r0 = r0.f4899h
            r0.d(r12)
            w.m r0 = r13.e
            w.f r0 = r0.f4899h
            r0.d(r15)
            r8.g()
            java.util.ArrayList r0 = r8.e
            r22 = r6
            r6 = 2
            if (r2 == r6) goto L_0x0286
            if (r14 != r6) goto L_0x0282
            goto L_0x0286
        L_0x0282:
            r23 = r9
        L_0x0284:
            r6 = 1
            goto L_0x02db
        L_0x0286:
            if (r11 == 0) goto L_0x029f
            java.util.Iterator r6 = r0.iterator()
        L_0x028c:
            boolean r23 = r6.hasNext()
            if (r23 == 0) goto L_0x029f
            java.lang.Object r23 = r6.next()
            w.o r23 = (w.o) r23
            boolean r23 = r23.k()
            if (r23 != 0) goto L_0x028c
            r11 = 0
        L_0x029f:
            if (r11 == 0) goto L_0x02be
            r6 = 2
            if (r2 != r6) goto L_0x02be
            r6 = 1
            r13.M(r6)
            r23 = r9
            r6 = 0
            int r9 = r8.d(r13, r6)
            r13.O(r9)
            w.k r6 = r13.f4739d
            w.g r6 = r6.e
            int r9 = r13.q()
            r6.d(r9)
            goto L_0x02c0
        L_0x02be:
            r23 = r9
        L_0x02c0:
            if (r11 == 0) goto L_0x0284
            r6 = 2
            if (r14 != r6) goto L_0x0284
            r6 = 1
            r13.N(r6)
            int r9 = r8.d(r13, r6)
            r13.L(r9)
            w.m r9 = r13.e
            w.g r9 = r9.e
            int r11 = r13.k()
            r9.d(r11)
        L_0x02db:
            int[] r9 = r13.f4761p0
            r24 = r10
            r11 = 0
            r10 = r9[r11]
            if (r10 == r6) goto L_0x02ea
            r6 = 4
            if (r10 != r6) goto L_0x02e8
            goto L_0x02ea
        L_0x02e8:
            r6 = 0
            goto L_0x0321
        L_0x02ea:
            int r6 = r13.q()
            int r6 = r6 + r12
            w.k r10 = r13.f4739d
            w.f r10 = r10.i
            r10.d(r6)
            w.k r10 = r13.f4739d
            w.g r10 = r10.e
            int r6 = r6 - r12
            r10.d(r6)
            r8.g()
            r6 = 1
            r9 = r9[r6]
            if (r9 == r6) goto L_0x0309
            r6 = 4
            if (r9 != r6) goto L_0x031d
        L_0x0309:
            int r6 = r13.k()
            int r6 = r6 + r15
            w.m r9 = r13.e
            w.f r9 = r9.i
            r9.d(r6)
            w.m r9 = r13.e
            w.g r9 = r9.e
            int r6 = r6 - r15
            r9.d(r6)
        L_0x031d:
            r8.g()
            r6 = 1
        L_0x0321:
            java.util.Iterator r8 = r0.iterator()
        L_0x0325:
            boolean r9 = r8.hasNext()
            if (r9 == 0) goto L_0x033e
            java.lang.Object r9 = r8.next()
            w.o r9 = (w.o) r9
            v.d r10 = r9.f4894b
            if (r10 != r13) goto L_0x033a
            boolean r10 = r9.f4898g
            if (r10 != 0) goto L_0x033a
            goto L_0x0325
        L_0x033a:
            r9.e()
            goto L_0x0325
        L_0x033e:
            java.util.Iterator r0 = r0.iterator()
        L_0x0342:
            boolean r8 = r0.hasNext()
            if (r8 == 0) goto L_0x0377
            java.lang.Object r8 = r0.next()
            w.o r8 = (w.o) r8
            if (r6 != 0) goto L_0x0355
            v.d r9 = r8.f4894b
            if (r9 != r13) goto L_0x0355
            goto L_0x0342
        L_0x0355:
            w.f r9 = r8.f4899h
            boolean r9 = r9.f4878j
            if (r9 != 0) goto L_0x035d
        L_0x035b:
            r0 = 0
            goto L_0x0378
        L_0x035d:
            w.f r9 = r8.i
            boolean r9 = r9.f4878j
            if (r9 != 0) goto L_0x0368
            boolean r9 = r8 instanceof w.i
            if (r9 != 0) goto L_0x0368
            goto L_0x035b
        L_0x0368:
            w.g r9 = r8.e
            boolean r9 = r9.f4878j
            if (r9 != 0) goto L_0x0342
            boolean r9 = r8 instanceof w.c
            if (r9 != 0) goto L_0x0342
            boolean r8 = r8 instanceof w.i
            if (r8 != 0) goto L_0x0342
            goto L_0x035b
        L_0x0377:
            r0 = 1
        L_0x0378:
            r13.M(r2)
            r13.N(r14)
            r6 = r0
            r0 = 1073741824(0x40000000, float:2.0)
            r2 = 2
            goto L_0x0412
        L_0x0384:
            r20 = r0
            r22 = r6
            r23 = r9
            r24 = r10
            r8 = r17
            boolean r0 = r8.f4865b
            v.e r2 = r8.f4864a
            if (r0 == 0) goto L_0x03e3
            java.util.ArrayList r0 = r2.f4782q0
            java.util.Iterator r0 = r0.iterator()
        L_0x039a:
            boolean r6 = r0.hasNext()
            if (r6 == 0) goto L_0x03c3
            java.lang.Object r6 = r0.next()
            v.d r6 = (v.C0347d) r6
            r6.h()
            r9 = 0
            r6.f4733a = r9
            w.k r10 = r6.f4739d
            w.g r12 = r10.e
            r12.f4878j = r9
            r10.f4898g = r9
            r10.n()
            w.m r6 = r6.e
            w.g r10 = r6.e
            r10.f4878j = r9
            r6.f4898g = r9
            r6.m()
            goto L_0x039a
        L_0x03c3:
            r9 = 0
            r2.h()
            r2.f4733a = r9
            w.k r0 = r2.f4739d
            w.g r6 = r0.e
            r6.f4878j = r9
            r0.f4898g = r9
            r0.n()
            w.m r0 = r2.e
            w.g r6 = r0.e
            r6.f4878j = r9
            r0.f4898g = r9
            r0.m()
            r8.c()
            goto L_0x03e4
        L_0x03e3:
            r9 = 0
        L_0x03e4:
            v.e r0 = r8.f4867d
            r8.b(r0)
            r2.f4731Y = r9
            r2.f4732Z = r9
            w.k r0 = r2.f4739d
            w.f r0 = r0.f4899h
            r0.d(r9)
            w.m r0 = r2.e
            w.f r0 = r0.f4899h
            r0.d(r9)
            r0 = 1073741824(0x40000000, float:2.0)
            if (r3 != r0) goto L_0x0406
            boolean r2 = r1.T(r9, r11)
            r6 = r2
            r2 = 1
            goto L_0x0408
        L_0x0406:
            r2 = 0
            r6 = 1
        L_0x0408:
            if (r5 != r0) goto L_0x0412
            r8 = 1
            boolean r9 = r1.T(r8, r11)
            r6 = r6 & r9
            int r2 = r2 + 1
        L_0x0412:
            if (r6 == 0) goto L_0x042c
            if (r3 != r0) goto L_0x0418
            r3 = 1
            goto L_0x0419
        L_0x0418:
            r3 = 0
        L_0x0419:
            if (r5 != r0) goto L_0x041d
            r0 = 1
            goto L_0x041e
        L_0x041d:
            r0 = 0
        L_0x041e:
            r1.P(r3, r0)
            goto L_0x042c
        L_0x0422:
            r20 = r0
            r22 = r6
            r23 = r9
            r24 = r10
            r2 = 0
            r6 = 0
        L_0x042c:
            if (r6 == 0) goto L_0x0431
            r0 = 2
            if (r2 == r0) goto L_0x06cc
        L_0x0431:
            int r0 = r1.f4774D0
            if (r7 <= 0) goto L_0x04ff
            java.util.ArrayList r2 = r1.f4782q0
            int r2 = r2.size()
            r3 = 64
            boolean r3 = r1.W(r3)
            y.f r5 = r1.f4786u0
            r15 = 0
        L_0x0444:
            if (r15 >= r2) goto L_0x04d9
            java.util.ArrayList r6 = r1.f4782q0
            java.lang.Object r6 = r6.get(r15)
            v.d r6 = (v.C0347d) r6
            boolean r8 = r6 instanceof v.h
            if (r8 == 0) goto L_0x0456
        L_0x0452:
            r8 = 3
            r10 = 0
            goto L_0x04d5
        L_0x0456:
            boolean r8 = r6 instanceof v.C0344a
            if (r8 == 0) goto L_0x045b
            goto L_0x0452
        L_0x045b:
            boolean r8 = r6.f4713F
            if (r8 == 0) goto L_0x0460
            goto L_0x0452
        L_0x0460:
            if (r3 == 0) goto L_0x0477
            w.k r8 = r6.f4739d
            if (r8 == 0) goto L_0x0477
            w.m r9 = r6.e
            if (r9 == 0) goto L_0x0477
            w.g r8 = r8.e
            boolean r8 = r8.f4878j
            if (r8 == 0) goto L_0x0477
            w.g r8 = r9.e
            boolean r8 = r8.f4878j
            if (r8 == 0) goto L_0x0477
            goto L_0x0452
        L_0x0477:
            r8 = 0
            int r9 = r6.j(r8)
            r8 = 1
            int r10 = r6.j(r8)
            r11 = 3
            if (r9 != r11) goto L_0x0490
            int r12 = r6.f4763r
            if (r12 == r8) goto L_0x0490
            if (r10 != r11) goto L_0x0490
            int r11 = r6.f4764s
            if (r11 == r8) goto L_0x0490
            r11 = 1
            goto L_0x0491
        L_0x0490:
            r11 = 0
        L_0x0491:
            if (r11 != 0) goto L_0x04cc
            boolean r12 = r1.W(r8)
            if (r12 == 0) goto L_0x04cc
            boolean r8 = r6 instanceof v.g
            if (r8 != 0) goto L_0x04cc
            r8 = 3
            if (r9 != r8) goto L_0x04ad
            int r12 = r6.f4763r
            if (r12 != 0) goto L_0x04ad
            if (r10 == r8) goto L_0x04ad
            boolean r12 = r6.x()
            if (r12 != 0) goto L_0x04ad
            r11 = 1
        L_0x04ad:
            if (r10 != r8) goto L_0x04bc
            int r12 = r6.f4764s
            if (r12 != 0) goto L_0x04bc
            if (r9 == r8) goto L_0x04bc
            boolean r12 = r6.x()
            if (r12 != 0) goto L_0x04bc
            r11 = 1
        L_0x04bc:
            if (r9 == r8) goto L_0x04c3
            if (r10 != r8) goto L_0x04c1
            goto L_0x04c3
        L_0x04c1:
            r10 = 0
            goto L_0x04ce
        L_0x04c3:
            float r9 = r6.f4729W
            r10 = 0
            int r9 = (r9 > r10 ? 1 : (r9 == r10 ? 0 : -1))
            if (r9 <= 0) goto L_0x04ce
            r11 = 1
            goto L_0x04ce
        L_0x04cc:
            r8 = 3
            goto L_0x04c1
        L_0x04ce:
            if (r11 == 0) goto L_0x04d1
            goto L_0x04d5
        L_0x04d1:
            r9 = 0
            r4.z(r9, r6, r5)
        L_0x04d5:
            int r15 = r15 + 1
            goto L_0x0444
        L_0x04d9:
            androidx.constraintlayout.widget.ConstraintLayout r2 = r5.f5016a
            int r3 = r2.getChildCount()
            r15 = 0
        L_0x04e0:
            if (r15 >= r3) goto L_0x04e8
            r2.getChildAt(r15)
            int r15 = r15 + 1
            goto L_0x04e0
        L_0x04e8:
            java.util.ArrayList r2 = r2.f1422g
            int r3 = r2.size()
            if (r3 <= 0) goto L_0x04ff
            r15 = 0
        L_0x04f1:
            if (r15 >= r3) goto L_0x04ff
            java.lang.Object r5 = r2.get(r15)
            y.c r5 = (y.c) r5
            r5.getClass()
            int r15 = r15 + 1
            goto L_0x04f1
        L_0x04ff:
            r4.H(r1)
            java.lang.Object r2 = r4.f1133d
            java.util.ArrayList r2 = (java.util.ArrayList) r2
            int r3 = r2.size()
            r5 = r23
            r6 = r24
            r15 = 0
            if (r7 <= 0) goto L_0x0514
            r4.E(r1, r15, r5, r6)
        L_0x0514:
            if (r3 <= 0) goto L_0x06c2
            int[] r7 = r1.f4761p0
            r8 = r7[r15]
            r9 = 2
            if (r8 != r9) goto L_0x0520
            r8 = 1
        L_0x051e:
            r10 = 1
            goto L_0x0522
        L_0x0520:
            r8 = 0
            goto L_0x051e
        L_0x0522:
            r7 = r7[r10]
            if (r7 != r9) goto L_0x0528
            r7 = 1
            goto L_0x0529
        L_0x0528:
            r7 = 0
        L_0x0529:
            int r9 = r26.q()
            java.lang.Object r10 = r4.f1132c
            v.e r10 = (v.C0348e) r10
            int r11 = r10.f4736b0
            int r9 = java.lang.Math.max(r9, r11)
            int r11 = r26.k()
            int r10 = r10.f4738c0
            int r10 = java.lang.Math.max(r11, r10)
            r11 = 0
            r12 = 0
        L_0x0543:
            if (r11 >= r3) goto L_0x05d2
            java.lang.Object r14 = r2.get(r11)
            v.d r14 = (v.C0347d) r14
            boolean r15 = r14 instanceof v.g
            if (r15 != 0) goto L_0x0555
            r16 = r0
            r1 = r22
            goto L_0x05c7
        L_0x0555:
            int r15 = r14.q()
            int r13 = r14.k()
            r16 = r0
            r1 = r22
            r0 = 1
            boolean r19 = r4.z(r0, r14, r1)
            r0 = r12 | r19
            int r12 = r14.q()
            r19 = r0
            int r0 = r14.k()
            if (r12 == r15) goto L_0x0599
            r14.O(r12)
            if (r8 == 0) goto L_0x0597
            int r12 = r14.r()
            int r15 = r14.f4727U
            int r12 = r12 + r15
            if (r12 <= r9) goto L_0x0597
            int r12 = r14.r()
            int r15 = r14.f4727U
            int r12 = r12 + r15
            r15 = 4
            v.c r19 = r14.i(r15)
            int r15 = r19.e()
            int r15 = r15 + r12
            int r9 = java.lang.Math.max(r9, r15)
        L_0x0597:
            r15 = 1
            goto L_0x059b
        L_0x0599:
            r15 = r19
        L_0x059b:
            if (r0 == r13) goto L_0x05c1
            r14.L(r0)
            if (r7 == 0) goto L_0x05c0
            int r0 = r14.s()
            int r12 = r14.f4728V
            int r0 = r0 + r12
            if (r0 <= r10) goto L_0x05c0
            int r0 = r14.s()
            int r12 = r14.f4728V
            int r0 = r0 + r12
            r12 = 5
            v.c r12 = r14.i(r12)
            int r12 = r12.e()
            int r12 = r12 + r0
            int r10 = java.lang.Math.max(r10, r12)
        L_0x05c0:
            r15 = 1
        L_0x05c1:
            v.g r14 = (v.g) r14
            boolean r0 = r14.f4839y0
            r0 = r0 | r15
            r12 = r0
        L_0x05c7:
            int r11 = r11 + 1
            r22 = r1
            r0 = r16
            r15 = 0
            r1 = r26
            goto L_0x0543
        L_0x05d2:
            r16 = r0
            r1 = r22
            r0 = 0
        L_0x05d7:
            r15 = 2
            if (r0 >= r15) goto L_0x06be
            r11 = 0
        L_0x05db:
            if (r11 >= r3) goto L_0x06a3
            java.lang.Object r13 = r2.get(r11)
            v.d r13 = (v.C0347d) r13
            boolean r14 = r13 instanceof v.i
            if (r14 == 0) goto L_0x05eb
            boolean r14 = r13 instanceof v.g
            if (r14 == 0) goto L_0x060e
        L_0x05eb:
            boolean r14 = r13 instanceof v.h
            if (r14 == 0) goto L_0x05f0
            goto L_0x060e
        L_0x05f0:
            int r14 = r13.f4745g0
            r15 = 8
            if (r14 != r15) goto L_0x05f7
            goto L_0x060e
        L_0x05f7:
            if (r20 == 0) goto L_0x060a
            w.k r14 = r13.f4739d
            w.g r14 = r14.e
            boolean r14 = r14.f4878j
            if (r14 == 0) goto L_0x060a
            w.m r14 = r13.e
            w.g r14 = r14.e
            boolean r14 = r14.f4878j
            if (r14 == 0) goto L_0x060a
            goto L_0x060e
        L_0x060a:
            boolean r14 = r13 instanceof v.g
            if (r14 == 0) goto L_0x0618
        L_0x060e:
            r22 = r1
            r19 = r2
            r21 = r3
            r14 = 4
            r15 = 5
            goto L_0x0698
        L_0x0618:
            int r14 = r13.q()
            int r15 = r13.k()
            r19 = r2
            int r2 = r13.f4734a0
            r21 = r3
            r3 = 1
            if (r0 != r3) goto L_0x062a
            r3 = 2
        L_0x062a:
            boolean r3 = r4.z(r3, r13, r1)
            r3 = r3 | r12
            int r12 = r13.q()
            r22 = r1
            int r1 = r13.k()
            if (r12 == r14) goto L_0x0662
            r13.O(r12)
            if (r8 == 0) goto L_0x065f
            int r3 = r13.r()
            int r12 = r13.f4727U
            int r3 = r3 + r12
            if (r3 <= r9) goto L_0x065f
            int r3 = r13.r()
            int r12 = r13.f4727U
            int r3 = r3 + r12
            r14 = 4
            v.c r12 = r13.i(r14)
            int r12 = r12.e()
            int r12 = r12 + r3
            int r9 = java.lang.Math.max(r9, r12)
            goto L_0x0660
        L_0x065f:
            r14 = 4
        L_0x0660:
            r3 = 1
            goto L_0x0663
        L_0x0662:
            r14 = 4
        L_0x0663:
            if (r1 == r15) goto L_0x068c
            r13.L(r1)
            if (r7 == 0) goto L_0x0689
            int r1 = r13.s()
            int r3 = r13.f4728V
            int r1 = r1 + r3
            if (r1 <= r10) goto L_0x0689
            int r1 = r13.s()
            int r3 = r13.f4728V
            int r1 = r1 + r3
            r15 = 5
            v.c r3 = r13.i(r15)
            int r3 = r3.e()
            int r3 = r3 + r1
            int r10 = java.lang.Math.max(r10, r3)
            goto L_0x068a
        L_0x0689:
            r15 = 5
        L_0x068a:
            r3 = 1
            goto L_0x068d
        L_0x068c:
            r15 = 5
        L_0x068d:
            boolean r1 = r13.f4712E
            if (r1 == 0) goto L_0x0697
            int r1 = r13.f4734a0
            if (r2 == r1) goto L_0x0697
            r12 = 1
            goto L_0x0698
        L_0x0697:
            r12 = r3
        L_0x0698:
            int r11 = r11 + 1
            r2 = r19
            r3 = r21
            r1 = r22
            r15 = 2
            goto L_0x05db
        L_0x06a3:
            r22 = r1
            r19 = r2
            r21 = r3
            r14 = 4
            r15 = 5
            if (r12 == 0) goto L_0x06be
            int r0 = r0 + 1
            r1 = r26
            r2 = r22
            r4.E(r1, r0, r5, r6)
            r1 = r2
            r2 = r19
            r3 = r21
            r12 = 0
            goto L_0x05d7
        L_0x06be:
            r1 = r26
            r0 = r16
        L_0x06c2:
            r1.f4774D0 = r0
            r0 = 512(0x200, float:7.175E-43)
            boolean r0 = r1.W(r0)
            t.C0337c.f4648q = r0
        L_0x06cc:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.widget.ConstraintLayout.k(v.e, int, int, int):void");
    }

    public final void requestLayout() {
        this.f1427m = true;
        super.requestLayout();
    }

    public final boolean shouldDelayChildPressedState() {
        return false;
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [y.e, android.view.ViewGroup$MarginLayoutParams] */
    public static e g() {
        ? marginLayoutParams = new ViewGroup.MarginLayoutParams(-2, -2);
        marginLayoutParams.f4977a = -1;
        marginLayoutParams.f4979b = -1;
        marginLayoutParams.f4981c = -1.0f;
        marginLayoutParams.f4983d = true;
        marginLayoutParams.e = -1;
        marginLayoutParams.f4986f = -1;
        marginLayoutParams.f4988g = -1;
        marginLayoutParams.f4990h = -1;
        marginLayoutParams.i = -1;
        marginLayoutParams.f4993j = -1;
        marginLayoutParams.f4995k = -1;
        marginLayoutParams.f4997l = -1;
        marginLayoutParams.f4999m = -1;
        marginLayoutParams.f5000n = -1;
        marginLayoutParams.f5002o = -1;
        marginLayoutParams.f5004p = -1;
        marginLayoutParams.f5006q = 0;
        marginLayoutParams.f5007r = 0.0f;
        marginLayoutParams.f5008s = -1;
        marginLayoutParams.f5009t = -1;
        marginLayoutParams.f5010u = -1;
        marginLayoutParams.f5011v = -1;
        marginLayoutParams.f5012w = Integer.MIN_VALUE;
        marginLayoutParams.f5013x = Integer.MIN_VALUE;
        marginLayoutParams.f5014y = Integer.MIN_VALUE;
        marginLayoutParams.f5015z = Integer.MIN_VALUE;
        marginLayoutParams.f4952A = Integer.MIN_VALUE;
        marginLayoutParams.f4953B = Integer.MIN_VALUE;
        marginLayoutParams.f4954C = Integer.MIN_VALUE;
        marginLayoutParams.f4955D = 0;
        marginLayoutParams.f4956E = 0.5f;
        marginLayoutParams.f4957F = 0.5f;
        marginLayoutParams.f4958G = null;
        marginLayoutParams.f4959H = -1.0f;
        marginLayoutParams.I = -1.0f;
        marginLayoutParams.f4960J = 0;
        marginLayoutParams.f4961K = 0;
        marginLayoutParams.f4962L = 0;
        marginLayoutParams.f4963M = 0;
        marginLayoutParams.f4964N = 0;
        marginLayoutParams.f4965O = 0;
        marginLayoutParams.f4966P = 0;
        marginLayoutParams.f4967Q = 0;
        marginLayoutParams.f4968R = 1.0f;
        marginLayoutParams.f4969S = 1.0f;
        marginLayoutParams.f4970T = -1;
        marginLayoutParams.f4971U = -1;
        marginLayoutParams.f4972V = -1;
        marginLayoutParams.f4973W = false;
        marginLayoutParams.f4974X = false;
        marginLayoutParams.f4975Y = null;
        marginLayoutParams.f4976Z = 0;
        marginLayoutParams.f4978a0 = true;
        marginLayoutParams.f4980b0 = true;
        marginLayoutParams.f4982c0 = false;
        marginLayoutParams.f4984d0 = false;
        marginLayoutParams.f4985e0 = false;
        marginLayoutParams.f4987f0 = -1;
        marginLayoutParams.f4989g0 = -1;
        marginLayoutParams.f4991h0 = -1;
        marginLayoutParams.f4992i0 = -1;
        marginLayoutParams.f4994j0 = Integer.MIN_VALUE;
        marginLayoutParams.f4996k0 = Integer.MIN_VALUE;
        marginLayoutParams.f4998l0 = 0.5f;
        marginLayoutParams.f5005p0 = new C0347d();
        return marginLayoutParams;
    }

    /* JADX WARNING: type inference failed for: r0v2, types: [java.lang.Object, y.s] */
    public static s getSharedValues() {
        if (f1420u == null) {
            ? obj = new Object();
            new SparseIntArray();
            new HashMap();
            f1420u = obj;
        }
        return f1420u;
    }

    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof e;
    }

    public final void dispatchDraw(Canvas canvas) {
        Object tag;
        int size;
        ArrayList arrayList = this.f1422g;
        if (arrayList != null && (size = arrayList.size()) > 0) {
            for (int i2 = 0; i2 < size; i2++) {
                ((c) arrayList.get(i2)).getClass();
            }
        }
        super.dispatchDraw(canvas);
        if (isInEditMode()) {
            float width = (float) getWidth();
            float height = (float) getHeight();
            int childCount = getChildCount();
            for (int i3 = 0; i3 < childCount; i3++) {
                View childAt = getChildAt(i3);
                if (!(childAt.getVisibility() == 8 || (tag = childAt.getTag()) == null || !(tag instanceof String))) {
                    String[] split = ((String) tag).split(",");
                    if (split.length == 4) {
                        int parseInt = Integer.parseInt(split[0]);
                        int parseInt2 = Integer.parseInt(split[1]);
                        int parseInt3 = Integer.parseInt(split[2]);
                        int i4 = (int) ((((float) parseInt) / 1080.0f) * width);
                        int i5 = (int) ((((float) parseInt2) / 1920.0f) * height);
                        Paint paint = new Paint();
                        paint.setColor(-65536);
                        float f2 = (float) i4;
                        float f3 = (float) i5;
                        float f4 = (float) (i4 + ((int) ((((float) parseInt3) / 1080.0f) * width)));
                        Canvas canvas2 = canvas;
                        float f5 = f3;
                        float f6 = f3;
                        float f7 = f4;
                        float f8 = f2;
                        Paint paint2 = paint;
                        canvas2.drawLine(f2, f5, f7, f6, paint);
                        float parseInt4 = (float) (i5 + ((int) ((((float) Integer.parseInt(split[3])) / 1920.0f) * height)));
                        float f9 = f4;
                        float f10 = parseInt4;
                        canvas2.drawLine(f9, f6, f7, f10, paint);
                        float f11 = parseInt4;
                        float f12 = f8;
                        canvas2.drawLine(f9, f11, f12, f10, paint);
                        float f13 = f8;
                        canvas2.drawLine(f13, f11, f12, f6, paint);
                        paint.setColor(-16711936);
                        float f14 = f4;
                        Paint paint3 = paint;
                        canvas2.drawLine(f13, f6, f14, parseInt4, paint);
                        canvas2.drawLine(f13, parseInt4, f14, f6, paint);
                    }
                }
            }
        }
    }

    public int getMaxHeight() {
        return this.f1426l;
    }

    public int getMaxWidth() {
        return this.f1425k;
    }

    public int getMinHeight() {
        return this.f1424j;
    }

    public int getMinWidth() {
        return this.i;
    }

    public int getOptimizationLevel() {
        return this.f1423h.f4774D0;
    }

    public String getSceneString() {
        int id;
        StringBuilder sb = new StringBuilder();
        C0348e eVar = this.f1423h;
        if (eVar.f4749j == null) {
            int id2 = getId();
            if (id2 != -1) {
                eVar.f4749j = getContext().getResources().getResourceEntryName(id2);
            } else {
                eVar.f4749j = "parent";
            }
        }
        if (eVar.f4747h0 == null) {
            eVar.f4747h0 = eVar.f4749j;
        }
        Iterator it2 = eVar.f4782q0.iterator();
        while (it2.hasNext()) {
            C0347d dVar = (C0347d) it2.next();
            View view = dVar.f4743f0;
            if (view != null) {
                if (dVar.f4749j == null && (id = view.getId()) != -1) {
                    dVar.f4749j = getContext().getResources().getResourceEntryName(id);
                }
                if (dVar.f4747h0 == null) {
                    dVar.f4747h0 = dVar.f4749j;
                }
            }
        }
        eVar.n(sb);
        return sb.toString();
    }

    public final C0347d h(View view) {
        if (view == this) {
            return this.f1423h;
        }
        if (view == null) {
            return null;
        }
        if (view.getLayoutParams() instanceof e) {
            return ((e) view.getLayoutParams()).f5005p0;
        }
        view.setLayoutParams(generateLayoutParams(view.getLayoutParams()));
        if (view.getLayoutParams() instanceof e) {
            return ((e) view.getLayoutParams()).f5005p0;
        }
        return null;
    }

    public final void i(AttributeSet attributeSet, int i2) {
        C0348e eVar = this.f1423h;
        eVar.f4743f0 = this;
        f fVar = this.f1434t;
        eVar.f4786u0 = fVar;
        eVar.f4784s0.f4868f = fVar;
        this.f1421f.put(getId(), this);
        this.f1429o = null;
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, r.f5137b, i2, 0);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i3 = 0; i3 < indexCount; i3++) {
                int index = obtainStyledAttributes.getIndex(i3);
                if (index == 16) {
                    this.i = obtainStyledAttributes.getDimensionPixelOffset(index, this.i);
                } else if (index == 17) {
                    this.f1424j = obtainStyledAttributes.getDimensionPixelOffset(index, this.f1424j);
                } else if (index == 14) {
                    this.f1425k = obtainStyledAttributes.getDimensionPixelOffset(index, this.f1425k);
                } else if (index == 15) {
                    this.f1426l = obtainStyledAttributes.getDimensionPixelOffset(index, this.f1426l);
                } else if (index == 113) {
                    this.f1428n = obtainStyledAttributes.getInt(index, this.f1428n);
                } else if (index == 56) {
                    int resourceId = obtainStyledAttributes.getResourceId(index, 0);
                    if (resourceId != 0) {
                        try {
                            j(resourceId);
                        } catch (Resources.NotFoundException unused) {
                            this.f1430p = null;
                        }
                    }
                } else if (index == 34) {
                    int resourceId2 = obtainStyledAttributes.getResourceId(index, 0);
                    try {
                        n nVar = new n();
                        this.f1429o = nVar;
                        nVar.e(getContext(), resourceId2);
                    } catch (Resources.NotFoundException unused2) {
                        this.f1429o = null;
                    }
                    this.f1431q = resourceId2;
                }
            }
            obtainStyledAttributes.recycle();
        }
        eVar.f4774D0 = this.f1428n;
        C0337c.f4648q = eVar.W(512);
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void j(int r13) {
        /*
            r12 = this;
            E.j r0 = new E.j
            android.content.Context r1 = r12.getContext()
            r2 = 21
            r3 = 0
            r0.<init>((int) r2, (boolean) r3)
            android.util.SparseArray r2 = new android.util.SparseArray
            r2.<init>()
            r0.f108g = r2
            android.util.SparseArray r2 = new android.util.SparseArray
            r2.<init>()
            r0.f109h = r2
            java.lang.String r2 = "Error parsing resource: "
            java.lang.String r3 = "ConstraintLayoutStates"
            android.content.res.Resources r4 = r1.getResources()
            android.content.res.XmlResourceParser r4 = r4.getXml(r13)
            int r5 = r4.getEventType()     // Catch:{ XmlPullParserException -> 0x004d, IOException -> 0x004b }
            r6 = 0
        L_0x002b:
            r7 = 1
            if (r5 == r7) goto L_0x00c5
            r8 = 2
            if (r5 == r8) goto L_0x0033
            goto L_0x00a1
        L_0x0033:
            java.lang.String r5 = r4.getName()     // Catch:{ XmlPullParserException -> 0x004d, IOException -> 0x004b }
            int r9 = r5.hashCode()     // Catch:{ XmlPullParserException -> 0x004d, IOException -> 0x004b }
            r10 = 4
            r11 = 3
            switch(r9) {
                case -1349929691: goto L_0x006d;
                case 80204913: goto L_0x0063;
                case 1382829617: goto L_0x005a;
                case 1657696882: goto L_0x0050;
                case 1901439077: goto L_0x0041;
                default: goto L_0x0040;
            }     // Catch:{ XmlPullParserException -> 0x004d, IOException -> 0x004b }
        L_0x0040:
            goto L_0x0077
        L_0x0041:
            java.lang.String r7 = "Variant"
            boolean r5 = r5.equals(r7)     // Catch:{ XmlPullParserException -> 0x004d, IOException -> 0x004b }
            if (r5 == 0) goto L_0x0077
            r7 = 3
            goto L_0x0078
        L_0x004b:
            r1 = move-exception
            goto L_0x00a6
        L_0x004d:
            r1 = move-exception
            goto L_0x00b6
        L_0x0050:
            java.lang.String r7 = "layoutDescription"
            boolean r5 = r5.equals(r7)     // Catch:{ XmlPullParserException -> 0x004d, IOException -> 0x004b }
            if (r5 == 0) goto L_0x0077
            r7 = 0
            goto L_0x0078
        L_0x005a:
            java.lang.String r9 = "StateSet"
            boolean r5 = r5.equals(r9)     // Catch:{ XmlPullParserException -> 0x004d, IOException -> 0x004b }
            if (r5 == 0) goto L_0x0077
            goto L_0x0078
        L_0x0063:
            java.lang.String r7 = "State"
            boolean r5 = r5.equals(r7)     // Catch:{ XmlPullParserException -> 0x004d, IOException -> 0x004b }
            if (r5 == 0) goto L_0x0077
            r7 = 2
            goto L_0x0078
        L_0x006d:
            java.lang.String r7 = "ConstraintSet"
            boolean r5 = r5.equals(r7)     // Catch:{ XmlPullParserException -> 0x004d, IOException -> 0x004b }
            if (r5 == 0) goto L_0x0077
            r7 = 4
            goto L_0x0078
        L_0x0077:
            r7 = -1
        L_0x0078:
            if (r7 == r8) goto L_0x0092
            if (r7 == r11) goto L_0x0083
            if (r7 == r10) goto L_0x007f
            goto L_0x00a1
        L_0x007f:
            r0.H(r1, r4)     // Catch:{ XmlPullParserException -> 0x004d, IOException -> 0x004b }
            goto L_0x00a1
        L_0x0083:
            y.g r5 = new y.g     // Catch:{ XmlPullParserException -> 0x004d, IOException -> 0x004b }
            r5.<init>(r1, r4)     // Catch:{ XmlPullParserException -> 0x004d, IOException -> 0x004b }
            if (r6 == 0) goto L_0x00a1
            java.lang.Object r7 = r6.f3672c     // Catch:{ XmlPullParserException -> 0x004d, IOException -> 0x004b }
            java.util.ArrayList r7 = (java.util.ArrayList) r7     // Catch:{ XmlPullParserException -> 0x004d, IOException -> 0x004b }
            r7.add(r5)     // Catch:{ XmlPullParserException -> 0x004d, IOException -> 0x004b }
            goto L_0x00a1
        L_0x0092:
            m1.A r5 = new m1.A     // Catch:{ XmlPullParserException -> 0x004d, IOException -> 0x004b }
            r5.<init>((android.content.Context) r1, (android.content.res.XmlResourceParser) r4)     // Catch:{ XmlPullParserException -> 0x004d, IOException -> 0x004b }
            java.lang.Object r6 = r0.f108g     // Catch:{ XmlPullParserException -> 0x004d, IOException -> 0x004b }
            android.util.SparseArray r6 = (android.util.SparseArray) r6     // Catch:{ XmlPullParserException -> 0x004d, IOException -> 0x004b }
            int r7 = r5.f3670a     // Catch:{ XmlPullParserException -> 0x004d, IOException -> 0x004b }
            r6.put(r7, r5)     // Catch:{ XmlPullParserException -> 0x004d, IOException -> 0x004b }
            r6 = r5
        L_0x00a1:
            int r5 = r4.next()     // Catch:{ XmlPullParserException -> 0x004d, IOException -> 0x004b }
            goto L_0x002b
        L_0x00a6:
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>(r2)
            r4.append(r13)
            java.lang.String r13 = r4.toString()
            android.util.Log.e(r3, r13, r1)
            goto L_0x00c5
        L_0x00b6:
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>(r2)
            r4.append(r13)
            java.lang.String r13 = r4.toString()
            android.util.Log.e(r3, r13, r1)
        L_0x00c5:
            r12.f1430p = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.widget.ConstraintLayout.j(int):void");
    }

    public final void l(C0347d dVar, e eVar, SparseArray sparseArray, int i2, int i3) {
        View view = (View) this.f1421f.get(i2);
        C0347d dVar2 = (C0347d) sparseArray.get(i2);
        if (dVar2 != null && view != null && (view.getLayoutParams() instanceof e)) {
            eVar.f4982c0 = true;
            if (i3 == 6) {
                e eVar2 = (e) view.getLayoutParams();
                eVar2.f4982c0 = true;
                eVar2.f5005p0.f4712E = true;
            }
            dVar.i(6).b(dVar2.i(i3), eVar.f4955D, eVar.f4954C, true);
            dVar.f4712E = true;
            dVar.i(3).j();
            dVar.i(5).j();
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v113, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r15v13, resolved type: android.view.View} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:154:0x02ef  */
    /* JADX WARNING: Removed duplicated region for block: B:157:0x030b A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:163:0x032c  */
    /* JADX WARNING: Removed duplicated region for block: B:166:0x0349  */
    /* JADX WARNING: Removed duplicated region for block: B:173:0x0370  */
    /* JADX WARNING: Removed duplicated region for block: B:176:0x038e  */
    /* JADX WARNING: Removed duplicated region for block: B:183:0x03b4  */
    /* JADX WARNING: Removed duplicated region for block: B:185:0x03c1  */
    /* JADX WARNING: Removed duplicated region for block: B:193:0x03e4  */
    /* JADX WARNING: Removed duplicated region for block: B:196:0x03ec  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onMeasure(int r24, int r25) {
        /*
            r23 = this;
            r6 = r23
            r7 = r24
            r8 = r25
            boolean r0 = r6.f1427m
            r6.f1427m = r0
            r9 = 0
            r10 = 1
            if (r0 != 0) goto L_0x0025
            int r0 = r23.getChildCount()
            r1 = 0
        L_0x0013:
            if (r1 >= r0) goto L_0x0025
            android.view.View r2 = r6.getChildAt(r1)
            boolean r2 = r2.isLayoutRequested()
            if (r2 == 0) goto L_0x0022
            r6.f1427m = r10
            goto L_0x0025
        L_0x0022:
            int r1 = r1 + 1
            goto L_0x0013
        L_0x0025:
            android.content.Context r0 = r23.getContext()
            android.content.pm.ApplicationInfo r0 = r0.getApplicationInfo()
            int r0 = r0.flags
            r1 = 4194304(0x400000, float:5.877472E-39)
            r0 = r0 & r1
            if (r0 == 0) goto L_0x003c
            int r0 = r23.getLayoutDirection()
            if (r10 != r0) goto L_0x003c
            r0 = 1
            goto L_0x003d
        L_0x003c:
            r0 = 0
        L_0x003d:
            v.e r11 = r6.f1423h
            r11.f4787v0 = r0
            boolean r0 = r6.f1427m
            if (r0 == 0) goto L_0x059b
            r6.f1427m = r9
            int r0 = r23.getChildCount()
            r1 = 0
        L_0x004c:
            if (r1 >= r0) goto L_0x005d
            android.view.View r2 = r6.getChildAt(r1)
            boolean r2 = r2.isLayoutRequested()
            if (r2 == 0) goto L_0x005a
            r12 = 1
            goto L_0x005e
        L_0x005a:
            int r1 = r1 + 1
            goto L_0x004c
        L_0x005d:
            r12 = 0
        L_0x005e:
            if (r12 == 0) goto L_0x0594
            boolean r13 = r23.isInEditMode()
            int r14 = r23.getChildCount()
            r0 = 0
        L_0x0069:
            if (r0 >= r14) goto L_0x007c
            android.view.View r1 = r6.getChildAt(r0)
            v.d r1 = r6.h(r1)
            if (r1 != 0) goto L_0x0076
            goto L_0x0079
        L_0x0076:
            r1.C()
        L_0x0079:
            int r0 = r0 + 1
            goto L_0x0069
        L_0x007c:
            r0 = 0
            r15 = -1
            if (r13 == 0) goto L_0x0106
            r1 = 0
        L_0x0081:
            if (r1 >= r14) goto L_0x0106
            android.view.View r2 = r6.getChildAt(r1)
            android.content.res.Resources r3 = r23.getResources()     // Catch:{ NotFoundException -> 0x0101 }
            int r4 = r2.getId()     // Catch:{ NotFoundException -> 0x0101 }
            java.lang.String r3 = r3.getResourceName(r4)     // Catch:{ NotFoundException -> 0x0101 }
            int r4 = r2.getId()     // Catch:{ NotFoundException -> 0x0101 }
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)     // Catch:{ NotFoundException -> 0x0101 }
            boolean r5 = r3 instanceof java.lang.String     // Catch:{ NotFoundException -> 0x0101 }
            if (r5 == 0) goto L_0x00bf
            java.util.HashMap r5 = r6.f1432r     // Catch:{ NotFoundException -> 0x0101 }
            if (r5 != 0) goto L_0x00aa
            java.util.HashMap r5 = new java.util.HashMap     // Catch:{ NotFoundException -> 0x0101 }
            r5.<init>()     // Catch:{ NotFoundException -> 0x0101 }
            r6.f1432r = r5     // Catch:{ NotFoundException -> 0x0101 }
        L_0x00aa:
            java.lang.String r5 = "/"
            int r5 = r3.indexOf(r5)     // Catch:{ NotFoundException -> 0x0101 }
            if (r5 == r15) goto L_0x00b9
            int r5 = r5 + 1
            java.lang.String r5 = r3.substring(r5)     // Catch:{ NotFoundException -> 0x0101 }
            goto L_0x00ba
        L_0x00b9:
            r5 = r3
        L_0x00ba:
            java.util.HashMap r10 = r6.f1432r     // Catch:{ NotFoundException -> 0x0101 }
            r10.put(r5, r4)     // Catch:{ NotFoundException -> 0x0101 }
        L_0x00bf:
            r4 = 47
            int r4 = r3.indexOf(r4)     // Catch:{ NotFoundException -> 0x0101 }
            if (r4 == r15) goto L_0x00cd
            int r4 = r4 + 1
            java.lang.String r3 = r3.substring(r4)     // Catch:{ NotFoundException -> 0x0101 }
        L_0x00cd:
            int r2 = r2.getId()     // Catch:{ NotFoundException -> 0x0101 }
            if (r2 != 0) goto L_0x00d5
        L_0x00d3:
            r2 = r11
            goto L_0x00ff
        L_0x00d5:
            android.util.SparseArray r4 = r6.f1421f     // Catch:{ NotFoundException -> 0x0101 }
            java.lang.Object r4 = r4.get(r2)     // Catch:{ NotFoundException -> 0x0101 }
            android.view.View r4 = (android.view.View) r4     // Catch:{ NotFoundException -> 0x0101 }
            if (r4 != 0) goto L_0x00f0
            android.view.View r4 = r6.findViewById(r2)     // Catch:{ NotFoundException -> 0x0101 }
            if (r4 == 0) goto L_0x00f0
            if (r4 == r6) goto L_0x00f0
            android.view.ViewParent r2 = r4.getParent()     // Catch:{ NotFoundException -> 0x0101 }
            if (r2 != r6) goto L_0x00f0
            r6.onViewAdded(r4)     // Catch:{ NotFoundException -> 0x0101 }
        L_0x00f0:
            if (r4 != r6) goto L_0x00f3
            goto L_0x00d3
        L_0x00f3:
            if (r4 != 0) goto L_0x00f7
            r2 = r0
            goto L_0x00ff
        L_0x00f7:
            android.view.ViewGroup$LayoutParams r2 = r4.getLayoutParams()     // Catch:{ NotFoundException -> 0x0101 }
            y.e r2 = (y.e) r2     // Catch:{ NotFoundException -> 0x0101 }
            v.d r2 = r2.f5005p0     // Catch:{ NotFoundException -> 0x0101 }
        L_0x00ff:
            r2.f4747h0 = r3     // Catch:{ NotFoundException -> 0x0101 }
        L_0x0101:
            int r1 = r1 + 1
            r10 = 1
            goto L_0x0081
        L_0x0106:
            int r1 = r6.f1431q
            if (r1 == r15) goto L_0x0117
            r1 = 0
        L_0x010b:
            if (r1 >= r14) goto L_0x0117
            android.view.View r2 = r6.getChildAt(r1)
            r2.getId()
            int r1 = r1 + 1
            goto L_0x010b
        L_0x0117:
            y.n r1 = r6.f1429o
            if (r1 == 0) goto L_0x011e
            r1.a(r6)
        L_0x011e:
            java.util.ArrayList r1 = r11.f4782q0
            r1.clear()
            java.util.ArrayList r1 = r6.f1422g
            int r2 = r1.size()
            if (r2 <= 0) goto L_0x01d2
            r3 = 0
        L_0x012c:
            if (r3 >= r2) goto L_0x01d2
            java.lang.Object r4 = r1.get(r3)
            y.c r4 = (y.c) r4
            boolean r5 = r4.isInEditMode()
            if (r5 == 0) goto L_0x013f
            java.lang.String r5 = r4.f4948j
            r4.setIds(r5)
        L_0x013f:
            v.i r5 = r4.i
            if (r5 != 0) goto L_0x0147
            r17 = r1
            goto L_0x01c9
        L_0x0147:
            r5.f4848r0 = r9
            v.d[] r5 = r5.f4847q0
            java.util.Arrays.fill(r5, r0)
            r5 = 0
        L_0x014f:
            int r0 = r4.f4946g
            if (r5 >= r0) goto L_0x01c2
            int[] r0 = r4.f4945f
            r0 = r0[r5]
            android.util.SparseArray r15 = r6.f1421f
            java.lang.Object r15 = r15.get(r0)
            android.view.View r15 = (android.view.View) r15
            if (r15 != 0) goto L_0x0187
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            java.util.HashMap r9 = r4.f4950l
            java.lang.Object r0 = r9.get(r0)
            java.lang.String r0 = (java.lang.String) r0
            int r10 = r4.f(r6, r0)
            if (r10 == 0) goto L_0x0187
            int[] r15 = r4.f4945f
            r15[r5] = r10
            java.lang.Integer r15 = java.lang.Integer.valueOf(r10)
            r9.put(r15, r0)
            android.util.SparseArray r0 = r6.f1421f
            java.lang.Object r0 = r0.get(r10)
            r15 = r0
            android.view.View r15 = (android.view.View) r15
        L_0x0187:
            if (r15 == 0) goto L_0x01b9
            v.i r0 = r4.i
            v.d r9 = r6.h(r15)
            r0.getClass()
            if (r9 == r0) goto L_0x01b9
            if (r9 != 0) goto L_0x0197
            goto L_0x01b9
        L_0x0197:
            int r10 = r0.f4848r0
            r15 = 1
            int r10 = r10 + r15
            v.d[] r15 = r0.f4847q0
            r17 = r1
            int r1 = r15.length
            if (r10 <= r1) goto L_0x01ae
            int r1 = r15.length
            r10 = 2
            int r1 = r1 * 2
            java.lang.Object[] r1 = java.util.Arrays.copyOf(r15, r1)
            v.d[] r1 = (v.C0347d[]) r1
            r0.f4847q0 = r1
        L_0x01ae:
            v.d[] r1 = r0.f4847q0
            int r10 = r0.f4848r0
            r1[r10] = r9
            r1 = 1
            int r10 = r10 + r1
            r0.f4848r0 = r10
            goto L_0x01bb
        L_0x01b9:
            r17 = r1
        L_0x01bb:
            int r5 = r5 + 1
            r1 = r17
            r9 = 0
            r15 = -1
            goto L_0x014f
        L_0x01c2:
            r17 = r1
            v.i r0 = r4.i
            r0.S()
        L_0x01c9:
            int r3 = r3 + 1
            r1 = r17
            r0 = 0
            r9 = 0
            r15 = -1
            goto L_0x012c
        L_0x01d2:
            r0 = 0
        L_0x01d3:
            if (r0 >= r14) goto L_0x01db
            r6.getChildAt(r0)
            int r0 = r0 + 1
            goto L_0x01d3
        L_0x01db:
            android.util.SparseArray r9 = r6.f1433s
            r9.clear()
            r0 = 0
            r9.put(r0, r11)
            int r0 = r23.getId()
            r9.put(r0, r11)
            r0 = 0
        L_0x01ec:
            if (r0 >= r14) goto L_0x0200
            android.view.View r1 = r6.getChildAt(r0)
            v.d r2 = r6.h(r1)
            int r1 = r1.getId()
            r9.put(r1, r2)
            int r0 = r0 + 1
            goto L_0x01ec
        L_0x0200:
            r10 = 0
        L_0x0201:
            if (r10 >= r14) goto L_0x0594
            android.view.View r0 = r6.getChildAt(r10)
            v.d r15 = r6.h(r0)
            if (r15 != 0) goto L_0x0214
        L_0x020d:
            r16 = r14
            r0 = 2
            r3 = 1
            r4 = -1
            goto L_0x0588
        L_0x0214:
            android.view.ViewGroup$LayoutParams r1 = r0.getLayoutParams()
            r5 = r1
            y.e r5 = (y.e) r5
            java.util.ArrayList r1 = r11.f4782q0
            r1.add(r15)
            v.d r1 = r15.f4726T
            if (r1 == 0) goto L_0x022e
            v.e r1 = (v.C0348e) r1
            java.util.ArrayList r1 = r1.f4782q0
            r1.remove(r15)
            r15.C()
        L_0x022e:
            r15.f4726T = r11
            r5.a()
            int r1 = r0.getVisibility()
            r15.f4745g0 = r1
            r15.f4743f0 = r0
            boolean r1 = r0 instanceof y.c
            if (r1 == 0) goto L_0x0246
            y.c r0 = (y.c) r0
            boolean r1 = r11.f4787v0
            r0.h(r15, r1)
        L_0x0246:
            boolean r0 = r5.f4984d0
            if (r0 == 0) goto L_0x027b
            v.h r15 = (v.h) r15
            int r0 = r5.m0
            int r1 = r5.f5001n0
            float r2 = r5.f5003o0
            r3 = -1082130432(0xffffffffbf800000, float:-1.0)
            int r4 = (r2 > r3 ? 1 : (r2 == r3 ? 0 : -1))
            if (r4 == 0) goto L_0x0264
            if (r4 <= 0) goto L_0x0262
            r15.f4841q0 = r2
            r2 = -1
            r15.f4842r0 = r2
            r15.f4843s0 = r2
            goto L_0x020d
        L_0x0262:
            r2 = -1
            goto L_0x020d
        L_0x0264:
            r2 = -1
            if (r0 == r2) goto L_0x0270
            if (r0 <= r2) goto L_0x020d
            r15.f4841q0 = r3
            r15.f4842r0 = r0
            r15.f4843s0 = r2
            goto L_0x020d
        L_0x0270:
            if (r1 == r2) goto L_0x020d
            if (r1 <= r2) goto L_0x020d
            r15.f4841q0 = r3
            r15.f4842r0 = r2
            r15.f4843s0 = r1
            goto L_0x020d
        L_0x027b:
            int r0 = r5.f4987f0
            int r1 = r5.f4989g0
            int r2 = r5.f4991h0
            int r3 = r5.f4992i0
            int r4 = r5.f4994j0
            r16 = r14
            int r14 = r5.f4996k0
            float r7 = r5.f4998l0
            int r8 = r5.f5004p
            r6 = -1
            if (r8 == r6) goto L_0x02b0
            java.lang.Object r0 = r9.get(r8)
            r22 = r0
            v.d r22 = (v.C0347d) r22
            if (r22 == 0) goto L_0x02ad
            float r0 = r5.f5007r
            int r1 = r5.f5006q
            r19 = 7
            r21 = 0
            r17 = r15
            r18 = r19
            r20 = r1
            r17.v(r18, r19, r20, r21, r22)
            r15.f4711D = r0
        L_0x02ad:
            r14 = r5
            goto L_0x03ee
        L_0x02b0:
            if (r0 == r6) goto L_0x02ce
            java.lang.Object r0 = r9.get(r0)
            r22 = r0
            v.d r22 = (v.C0347d) r22
            if (r22 == 0) goto L_0x02cc
            int r0 = r5.leftMargin
            r17 = r15
            r1 = 2
            r18 = r1
            r19 = r1
            r20 = r0
            r21 = r4
            r17.v(r18, r19, r20, r21, r22)
        L_0x02cc:
            r0 = -1
            goto L_0x02ed
        L_0x02ce:
            r0 = -1
            if (r1 == r0) goto L_0x02ed
            java.lang.Object r0 = r9.get(r1)
            r22 = r0
            v.d r22 = (v.C0347d) r22
            if (r22 == 0) goto L_0x02cc
            int r0 = r5.leftMargin
            r17 = r15
            r1 = 2
            r18 = r1
            r1 = 4
            r19 = r1
            r20 = r0
            r21 = r4
            r17.v(r18, r19, r20, r21, r22)
            goto L_0x02cc
        L_0x02ed:
            if (r2 == r0) goto L_0x030b
            java.lang.Object r0 = r9.get(r2)
            r22 = r0
            v.d r22 = (v.C0347d) r22
            if (r22 == 0) goto L_0x0327
            int r0 = r5.rightMargin
            r17 = r15
            r1 = 4
            r18 = r1
            r1 = 2
            r19 = r1
            r20 = r0
            r21 = r14
            r17.v(r18, r19, r20, r21, r22)
            goto L_0x0327
        L_0x030b:
            if (r3 == r0) goto L_0x0327
            java.lang.Object r0 = r9.get(r3)
            r22 = r0
            v.d r22 = (v.C0347d) r22
            if (r22 == 0) goto L_0x0327
            int r0 = r5.rightMargin
            r17 = r15
            r1 = 4
            r18 = r1
            r19 = r1
            r20 = r0
            r21 = r14
            r17.v(r18, r19, r20, r21, r22)
        L_0x0327:
            int r0 = r5.i
            r1 = -1
            if (r0 == r1) goto L_0x0349
            java.lang.Object r0 = r9.get(r0)
            r22 = r0
            v.d r22 = (v.C0347d) r22
            if (r22 == 0) goto L_0x036b
            int r0 = r5.topMargin
            int r1 = r5.f5013x
            r17 = r15
            r2 = 3
            r18 = r2
            r19 = r2
            r20 = r0
            r21 = r1
            r17.v(r18, r19, r20, r21, r22)
            goto L_0x036b
        L_0x0349:
            int r0 = r5.f4993j
            r1 = -1
            if (r0 == r1) goto L_0x036b
            java.lang.Object r0 = r9.get(r0)
            r22 = r0
            v.d r22 = (v.C0347d) r22
            if (r22 == 0) goto L_0x036b
            int r0 = r5.topMargin
            int r1 = r5.f5013x
            r17 = r15
            r2 = 3
            r18 = r2
            r2 = 5
            r19 = r2
            r20 = r0
            r21 = r1
            r17.v(r18, r19, r20, r21, r22)
        L_0x036b:
            int r0 = r5.f4995k
            r1 = -1
            if (r0 == r1) goto L_0x038e
            java.lang.Object r0 = r9.get(r0)
            r22 = r0
            v.d r22 = (v.C0347d) r22
            if (r22 == 0) goto L_0x03af
            int r0 = r5.bottomMargin
            int r1 = r5.f5015z
            r17 = r15
            r2 = 5
            r18 = r2
            r2 = 3
            r19 = r2
            r20 = r0
            r21 = r1
            r17.v(r18, r19, r20, r21, r22)
            goto L_0x03af
        L_0x038e:
            int r0 = r5.f4997l
            r1 = -1
            if (r0 == r1) goto L_0x03af
            java.lang.Object r0 = r9.get(r0)
            r22 = r0
            v.d r22 = (v.C0347d) r22
            if (r22 == 0) goto L_0x03af
            int r0 = r5.bottomMargin
            int r1 = r5.f5015z
            r17 = r15
            r2 = 5
            r18 = r2
            r19 = r2
            r20 = r0
            r21 = r1
            r17.v(r18, r19, r20, r21, r22)
        L_0x03af:
            int r4 = r5.f4999m
            r6 = -1
            if (r4 == r6) goto L_0x03c1
            r8 = 6
            r0 = r23
            r1 = r15
            r2 = r5
            r3 = r9
            r14 = r5
            r5 = r8
            r0.l(r1, r2, r3, r4, r5)
        L_0x03bf:
            r0 = 0
            goto L_0x03e0
        L_0x03c1:
            r14 = r5
            int r4 = r14.f5000n
            if (r4 == r6) goto L_0x03d1
            r0 = r23
            r1 = r15
            r2 = r14
            r3 = r9
            r8 = 3
            r5 = r8
            r0.l(r1, r2, r3, r4, r5)
            goto L_0x03bf
        L_0x03d1:
            int r4 = r14.f5002o
            if (r4 == r6) goto L_0x03bf
            r0 = r23
            r1 = r15
            r2 = r14
            r3 = r9
            r6 = 5
            r5 = r6
            r0.l(r1, r2, r3, r4, r5)
            goto L_0x03bf
        L_0x03e0:
            int r1 = (r7 > r0 ? 1 : (r7 == r0 ? 0 : -1))
            if (r1 < 0) goto L_0x03e6
            r15.f4740d0 = r7
        L_0x03e6:
            float r1 = r14.f4957F
            int r2 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            if (r2 < 0) goto L_0x03ee
            r15.f4741e0 = r1
        L_0x03ee:
            if (r13 == 0) goto L_0x03ff
            int r0 = r14.f4970T
            r1 = -1
            if (r0 != r1) goto L_0x03f9
            int r2 = r14.f4971U
            if (r2 == r1) goto L_0x03ff
        L_0x03f9:
            int r1 = r14.f4971U
            r15.f4731Y = r0
            r15.f4732Z = r1
        L_0x03ff:
            boolean r0 = r14.f4978a0
            r1 = 3
            r2 = 4
            r3 = -2
            if (r0 != 0) goto L_0x0432
            int r0 = r14.width
            r4 = -1
            if (r0 != r4) goto L_0x042a
            boolean r0 = r14.f4973W
            if (r0 == 0) goto L_0x0414
            r15.M(r1)
        L_0x0412:
            r0 = 2
            goto L_0x0418
        L_0x0414:
            r15.M(r2)
            goto L_0x0412
        L_0x0418:
            v.c r0 = r15.i(r0)
            int r4 = r14.leftMargin
            r0.f4706g = r4
            r0 = 4
            v.c r0 = r15.i(r0)
            int r4 = r14.rightMargin
            r0.f4706g = r4
            goto L_0x0443
        L_0x042a:
            r15.M(r1)
            r0 = 0
            r15.O(r0)
            goto L_0x0443
        L_0x0432:
            r0 = 1
            r15.M(r0)
            int r0 = r14.width
            r15.O(r0)
            int r0 = r14.width
            if (r0 != r3) goto L_0x0443
            r0 = 2
            r15.M(r0)
        L_0x0443:
            boolean r0 = r14.f4980b0
            if (r0 != 0) goto L_0x0473
            int r0 = r14.height
            r4 = -1
            if (r0 != r4) goto L_0x046b
            boolean r0 = r14.f4974X
            if (r0 == 0) goto L_0x0455
            r15.N(r1)
        L_0x0453:
            r0 = 3
            goto L_0x0459
        L_0x0455:
            r15.N(r2)
            goto L_0x0453
        L_0x0459:
            v.c r0 = r15.i(r0)
            int r2 = r14.topMargin
            r0.f4706g = r2
            r0 = 5
            v.c r0 = r15.i(r0)
            int r2 = r14.bottomMargin
            r0.f4706g = r2
            goto L_0x0485
        L_0x046b:
            r15.N(r1)
            r0 = 0
            r15.L(r0)
            goto L_0x0485
        L_0x0473:
            r0 = 1
            r4 = -1
            r15.N(r0)
            int r0 = r14.height
            r15.L(r0)
            int r0 = r14.height
            if (r0 != r3) goto L_0x0485
            r0 = 2
            r15.N(r0)
        L_0x0485:
            java.lang.String r0 = r14.f4958G
            if (r0 == 0) goto L_0x048f
            int r2 = r0.length()
            if (r2 != 0) goto L_0x0492
        L_0x048f:
            r2 = 0
            goto L_0x0521
        L_0x0492:
            int r2 = r0.length()
            r3 = 44
            int r3 = r0.indexOf(r3)
            if (r3 <= 0) goto L_0x04bf
            int r5 = r2 + -1
            if (r3 >= r5) goto L_0x04bf
            r5 = 0
            java.lang.String r6 = r0.substring(r5, r3)
            java.lang.String r5 = "W"
            boolean r5 = r6.equalsIgnoreCase(r5)
            if (r5 == 0) goto L_0x04b1
            r5 = 0
            goto L_0x04bc
        L_0x04b1:
            java.lang.String r5 = "H"
            boolean r5 = r6.equalsIgnoreCase(r5)
            if (r5 == 0) goto L_0x04bb
            r5 = 1
            goto L_0x04bc
        L_0x04bb:
            r5 = -1
        L_0x04bc:
            int r3 = r3 + 1
            goto L_0x04c1
        L_0x04bf:
            r3 = 0
            r5 = -1
        L_0x04c1:
            r6 = 58
            int r6 = r0.indexOf(r6)
            if (r6 < 0) goto L_0x0506
            int r2 = r2 + -1
            if (r6 >= r2) goto L_0x0506
            java.lang.String r2 = r0.substring(r3, r6)
            int r6 = r6 + 1
            java.lang.String r0 = r0.substring(r6)
            int r3 = r2.length()
            if (r3 <= 0) goto L_0x0516
            int r3 = r0.length()
            if (r3 <= 0) goto L_0x0516
            float r2 = java.lang.Float.parseFloat(r2)     // Catch:{ NumberFormatException -> 0x04fd }
            float r0 = java.lang.Float.parseFloat(r0)     // Catch:{ NumberFormatException -> 0x04fd }
            r3 = 0
            int r6 = (r2 > r3 ? 1 : (r2 == r3 ? 0 : -1))
            if (r6 <= 0) goto L_0x0516
            int r6 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r6 <= 0) goto L_0x0516
            r3 = 1
            if (r5 != r3) goto L_0x04ff
            float r0 = r0 / r2
            float r0 = java.lang.Math.abs(r0)     // Catch:{ NumberFormatException -> 0x04fd }
            goto L_0x0504
        L_0x04fd:
            goto L_0x0516
        L_0x04ff:
            float r2 = r2 / r0
            float r0 = java.lang.Math.abs(r2)     // Catch:{ NumberFormatException -> 0x04fd }
        L_0x0504:
            r2 = 0
            goto L_0x0518
        L_0x0506:
            java.lang.String r0 = r0.substring(r3)
            int r2 = r0.length()
            if (r2 <= 0) goto L_0x0516
            float r0 = java.lang.Float.parseFloat(r0)     // Catch:{ NumberFormatException -> 0x0515 }
            goto L_0x0504
        L_0x0515:
        L_0x0516:
            r0 = 0
            goto L_0x0504
        L_0x0518:
            int r3 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r3 <= 0) goto L_0x0523
            r15.f4729W = r0
            r15.f4730X = r5
            goto L_0x0523
        L_0x0521:
            r15.f4729W = r2
        L_0x0523:
            float r0 = r14.f4959H
            float[] r2 = r15.f4752k0
            r3 = 0
            r2[r3] = r0
            float r0 = r14.I
            r3 = 1
            r2[r3] = r0
            int r0 = r14.f4960J
            r15.f4748i0 = r0
            int r0 = r14.f4961K
            r15.f4750j0 = r0
            int r0 = r14.f4976Z
            if (r0 < 0) goto L_0x053f
            if (r0 > r1) goto L_0x053f
            r15.f4762q = r0
        L_0x053f:
            int r0 = r14.f4962L
            int r1 = r14.f4964N
            int r2 = r14.f4966P
            float r5 = r14.f4968R
            r15.f4763r = r0
            r15.f4766u = r1
            r1 = 2147483647(0x7fffffff, float:NaN)
            if (r2 != r1) goto L_0x0551
            r2 = 0
        L_0x0551:
            r15.f4767v = r2
            r15.f4768w = r5
            r2 = 1065353216(0x3f800000, float:1.0)
            r6 = 0
            int r7 = (r5 > r6 ? 1 : (r5 == r6 ? 0 : -1))
            if (r7 <= 0) goto L_0x0565
            int r5 = (r5 > r2 ? 1 : (r5 == r2 ? 0 : -1))
            if (r5 >= 0) goto L_0x0565
            if (r0 != 0) goto L_0x0565
            r0 = 2
            r15.f4763r = r0
        L_0x0565:
            int r0 = r14.f4963M
            int r5 = r14.f4965O
            int r6 = r14.f4967Q
            float r7 = r14.f4969S
            r15.f4764s = r0
            r15.f4769x = r5
            if (r6 != r1) goto L_0x0574
            r6 = 0
        L_0x0574:
            r15.f4770y = r6
            r15.f4771z = r7
            r1 = 0
            int r1 = (r7 > r1 ? 1 : (r7 == r1 ? 0 : -1))
            if (r1 <= 0) goto L_0x0587
            int r1 = (r7 > r2 ? 1 : (r7 == r2 ? 0 : -1))
            if (r1 >= 0) goto L_0x0587
            if (r0 != 0) goto L_0x0587
            r0 = 2
            r15.f4764s = r0
            goto L_0x0588
        L_0x0587:
            r0 = 2
        L_0x0588:
            int r10 = r10 + 1
            r6 = r23
            r7 = r24
            r8 = r25
            r14 = r16
            goto L_0x0201
        L_0x0594:
            if (r12 == 0) goto L_0x059b
            android.support.v4.media.session.t r0 = r11.f4783r0
            r0.H(r11)
        L_0x059b:
            t.c r0 = r11.f4788w0
            r0.getClass()
            r0 = r23
            int r1 = r0.f1428n
            r2 = r24
            r3 = r25
            r0.k(r11, r1, r2, r3)
            int r1 = r11.q()
            int r4 = r11.k()
            boolean r5 = r11.f4775E0
            boolean r6 = r11.F0
            y.f r7 = r0.f1434t
            int r8 = r7.e
            int r7 = r7.f5019d
            int r1 = r1 + r7
            int r4 = r4 + r8
            r7 = 0
            int r1 = android.view.View.resolveSizeAndState(r1, r2, r7)
            int r2 = android.view.View.resolveSizeAndState(r4, r3, r7)
            r3 = 16777215(0xffffff, float:2.3509886E-38)
            r1 = r1 & r3
            r2 = r2 & r3
            int r3 = r0.f1425k
            int r1 = java.lang.Math.min(r3, r1)
            int r3 = r0.f1426l
            int r2 = java.lang.Math.min(r3, r2)
            r3 = 16777216(0x1000000, float:2.3509887E-38)
            if (r5 == 0) goto L_0x05de
            r1 = r1 | r3
        L_0x05de:
            if (r6 == 0) goto L_0x05e1
            r2 = r2 | r3
        L_0x05e1:
            r0.setMeasuredDimension(r1, r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.widget.ConstraintLayout.onMeasure(int, int):void");
    }

    public void setConstraintSet(n nVar) {
        this.f1429o = nVar;
    }

    public void setMaxHeight(int i2) {
        if (i2 != this.f1426l) {
            this.f1426l = i2;
            requestLayout();
        }
    }

    public void setMaxWidth(int i2) {
        if (i2 != this.f1425k) {
            this.f1425k = i2;
            requestLayout();
        }
    }

    public void setMinHeight(int i2) {
        if (i2 != this.f1424j) {
            this.f1424j = i2;
            requestLayout();
        }
    }

    public void setMinWidth(int i2) {
        if (i2 != this.i) {
            this.i = i2;
            requestLayout();
        }
    }

    public void setOnConstraintsChanged(o oVar) {
        j jVar = this.f1430p;
        if (jVar != null) {
            jVar.getClass();
        }
    }

    public void setOptimizationLevel(int i2) {
        this.f1428n = i2;
        C0348e eVar = this.f1423h;
        eVar.f4774D0 = i2;
        C0337c.f4648q = eVar.W(512);
    }

    private int getPaddingWidth() {
        int max = Math.max(0, getPaddingRight()) + Math.max(0, getPaddingLeft());
        int max2 = Math.max(0, getPaddingEnd()) + Math.max(0, getPaddingStart());
        if (max2 > 0) {
            return max2;
        }
        return max;
    }

    public final /* bridge */ /* synthetic */ ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return g();
    }

    public void onLayout(boolean z2, int i2, int i3, int i4, int i5) {
        int childCount = getChildCount();
        boolean isInEditMode = isInEditMode();
        for (int i6 = 0; i6 < childCount; i6++) {
            View childAt = getChildAt(i6);
            e eVar = (e) childAt.getLayoutParams();
            C0347d dVar = eVar.f5005p0;
            if (childAt.getVisibility() != 8 || eVar.f4984d0 || eVar.f4985e0 || isInEditMode) {
                int r2 = dVar.r();
                int s2 = dVar.s();
                childAt.layout(r2, s2, dVar.q() + r2, dVar.k() + s2);
            }
        }
        ArrayList arrayList = this.f1422g;
        int size = arrayList.size();
        if (size > 0) {
            for (int i7 = 0; i7 < size; i7++) {
                ((c) arrayList.get(i7)).getClass();
            }
        }
    }

    public final void onViewAdded(View view) {
        super.onViewAdded(view);
        C0347d h2 = h(view);
        if ((view instanceof p) && !(h2 instanceof h)) {
            e eVar = (e) view.getLayoutParams();
            h hVar = new h();
            eVar.f5005p0 = hVar;
            eVar.f4984d0 = true;
            hVar.S(eVar.f4972V);
        }
        if (view instanceof c) {
            c cVar = (c) view;
            cVar.i();
            ((e) view.getLayoutParams()).f4985e0 = true;
            ArrayList arrayList = this.f1422g;
            if (!arrayList.contains(cVar)) {
                arrayList.add(cVar);
            }
        }
        this.f1421f.put(view.getId(), view);
        this.f1427m = true;
    }

    public void onViewRemoved(View view) {
        super.onViewRemoved(view);
        this.f1421f.remove(view.getId());
        C0347d h2 = h(view);
        this.f1423h.f4782q0.remove(h2);
        h2.C();
        this.f1422g.remove(view);
        this.f1427m = true;
    }

    public void setId(int i2) {
        int id = getId();
        SparseArray sparseArray = this.f1421f;
        sparseArray.remove(id);
        super.setId(i2);
        sparseArray.put(getId(), this);
    }

    public ConstraintLayout(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        i(attributeSet, i2);
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [y.e, android.view.ViewGroup$LayoutParams, android.view.ViewGroup$MarginLayoutParams] */
    public final ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        ? marginLayoutParams = new ViewGroup.MarginLayoutParams(layoutParams);
        marginLayoutParams.f4977a = -1;
        marginLayoutParams.f4979b = -1;
        marginLayoutParams.f4981c = -1.0f;
        marginLayoutParams.f4983d = true;
        marginLayoutParams.e = -1;
        marginLayoutParams.f4986f = -1;
        marginLayoutParams.f4988g = -1;
        marginLayoutParams.f4990h = -1;
        marginLayoutParams.i = -1;
        marginLayoutParams.f4993j = -1;
        marginLayoutParams.f4995k = -1;
        marginLayoutParams.f4997l = -1;
        marginLayoutParams.f4999m = -1;
        marginLayoutParams.f5000n = -1;
        marginLayoutParams.f5002o = -1;
        marginLayoutParams.f5004p = -1;
        marginLayoutParams.f5006q = 0;
        marginLayoutParams.f5007r = 0.0f;
        marginLayoutParams.f5008s = -1;
        marginLayoutParams.f5009t = -1;
        marginLayoutParams.f5010u = -1;
        marginLayoutParams.f5011v = -1;
        marginLayoutParams.f5012w = Integer.MIN_VALUE;
        marginLayoutParams.f5013x = Integer.MIN_VALUE;
        marginLayoutParams.f5014y = Integer.MIN_VALUE;
        marginLayoutParams.f5015z = Integer.MIN_VALUE;
        marginLayoutParams.f4952A = Integer.MIN_VALUE;
        marginLayoutParams.f4953B = Integer.MIN_VALUE;
        marginLayoutParams.f4954C = Integer.MIN_VALUE;
        marginLayoutParams.f4955D = 0;
        marginLayoutParams.f4956E = 0.5f;
        marginLayoutParams.f4957F = 0.5f;
        marginLayoutParams.f4958G = null;
        marginLayoutParams.f4959H = -1.0f;
        marginLayoutParams.I = -1.0f;
        marginLayoutParams.f4960J = 0;
        marginLayoutParams.f4961K = 0;
        marginLayoutParams.f4962L = 0;
        marginLayoutParams.f4963M = 0;
        marginLayoutParams.f4964N = 0;
        marginLayoutParams.f4965O = 0;
        marginLayoutParams.f4966P = 0;
        marginLayoutParams.f4967Q = 0;
        marginLayoutParams.f4968R = 1.0f;
        marginLayoutParams.f4969S = 1.0f;
        marginLayoutParams.f4970T = -1;
        marginLayoutParams.f4971U = -1;
        marginLayoutParams.f4972V = -1;
        marginLayoutParams.f4973W = false;
        marginLayoutParams.f4974X = false;
        marginLayoutParams.f4975Y = null;
        marginLayoutParams.f4976Z = 0;
        marginLayoutParams.f4978a0 = true;
        marginLayoutParams.f4980b0 = true;
        marginLayoutParams.f4982c0 = false;
        marginLayoutParams.f4984d0 = false;
        marginLayoutParams.f4985e0 = false;
        marginLayoutParams.f4987f0 = -1;
        marginLayoutParams.f4989g0 = -1;
        marginLayoutParams.f4991h0 = -1;
        marginLayoutParams.f4992i0 = -1;
        marginLayoutParams.f4994j0 = Integer.MIN_VALUE;
        marginLayoutParams.f4996k0 = Integer.MIN_VALUE;
        marginLayoutParams.f4998l0 = 0.5f;
        marginLayoutParams.f5005p0 = new C0347d();
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) layoutParams;
            marginLayoutParams.leftMargin = marginLayoutParams2.leftMargin;
            marginLayoutParams.rightMargin = marginLayoutParams2.rightMargin;
            marginLayoutParams.topMargin = marginLayoutParams2.topMargin;
            marginLayoutParams.bottomMargin = marginLayoutParams2.bottomMargin;
            marginLayoutParams.setMarginStart(marginLayoutParams2.getMarginStart());
            marginLayoutParams.setMarginEnd(marginLayoutParams2.getMarginEnd());
        }
        if (layoutParams instanceof e) {
            e eVar = (e) layoutParams;
            marginLayoutParams.f4977a = eVar.f4977a;
            marginLayoutParams.f4979b = eVar.f4979b;
            marginLayoutParams.f4981c = eVar.f4981c;
            marginLayoutParams.f4983d = eVar.f4983d;
            marginLayoutParams.e = eVar.e;
            marginLayoutParams.f4986f = eVar.f4986f;
            marginLayoutParams.f4988g = eVar.f4988g;
            marginLayoutParams.f4990h = eVar.f4990h;
            marginLayoutParams.i = eVar.i;
            marginLayoutParams.f4993j = eVar.f4993j;
            marginLayoutParams.f4995k = eVar.f4995k;
            marginLayoutParams.f4997l = eVar.f4997l;
            marginLayoutParams.f4999m = eVar.f4999m;
            marginLayoutParams.f5000n = eVar.f5000n;
            marginLayoutParams.f5002o = eVar.f5002o;
            marginLayoutParams.f5004p = eVar.f5004p;
            marginLayoutParams.f5006q = eVar.f5006q;
            marginLayoutParams.f5007r = eVar.f5007r;
            marginLayoutParams.f5008s = eVar.f5008s;
            marginLayoutParams.f5009t = eVar.f5009t;
            marginLayoutParams.f5010u = eVar.f5010u;
            marginLayoutParams.f5011v = eVar.f5011v;
            marginLayoutParams.f5012w = eVar.f5012w;
            marginLayoutParams.f5013x = eVar.f5013x;
            marginLayoutParams.f5014y = eVar.f5014y;
            marginLayoutParams.f5015z = eVar.f5015z;
            marginLayoutParams.f4952A = eVar.f4952A;
            marginLayoutParams.f4953B = eVar.f4953B;
            marginLayoutParams.f4954C = eVar.f4954C;
            marginLayoutParams.f4955D = eVar.f4955D;
            marginLayoutParams.f4956E = eVar.f4956E;
            marginLayoutParams.f4957F = eVar.f4957F;
            marginLayoutParams.f4958G = eVar.f4958G;
            marginLayoutParams.f4959H = eVar.f4959H;
            marginLayoutParams.I = eVar.I;
            marginLayoutParams.f4960J = eVar.f4960J;
            marginLayoutParams.f4961K = eVar.f4961K;
            marginLayoutParams.f4973W = eVar.f4973W;
            marginLayoutParams.f4974X = eVar.f4974X;
            marginLayoutParams.f4962L = eVar.f4962L;
            marginLayoutParams.f4963M = eVar.f4963M;
            marginLayoutParams.f4964N = eVar.f4964N;
            marginLayoutParams.f4966P = eVar.f4966P;
            marginLayoutParams.f4965O = eVar.f4965O;
            marginLayoutParams.f4967Q = eVar.f4967Q;
            marginLayoutParams.f4968R = eVar.f4968R;
            marginLayoutParams.f4969S = eVar.f4969S;
            marginLayoutParams.f4970T = eVar.f4970T;
            marginLayoutParams.f4971U = eVar.f4971U;
            marginLayoutParams.f4972V = eVar.f4972V;
            marginLayoutParams.f4978a0 = eVar.f4978a0;
            marginLayoutParams.f4980b0 = eVar.f4980b0;
            marginLayoutParams.f4982c0 = eVar.f4982c0;
            marginLayoutParams.f4984d0 = eVar.f4984d0;
            marginLayoutParams.f4987f0 = eVar.f4987f0;
            marginLayoutParams.f4989g0 = eVar.f4989g0;
            marginLayoutParams.f4991h0 = eVar.f4991h0;
            marginLayoutParams.f4992i0 = eVar.f4992i0;
            marginLayoutParams.f4994j0 = eVar.f4994j0;
            marginLayoutParams.f4996k0 = eVar.f4996k0;
            marginLayoutParams.f4998l0 = eVar.f4998l0;
            marginLayoutParams.f4975Y = eVar.f4975Y;
            marginLayoutParams.f4976Z = eVar.f4976Z;
            marginLayoutParams.f5005p0 = eVar.f5005p0;
        }
        return marginLayoutParams;
    }
}
