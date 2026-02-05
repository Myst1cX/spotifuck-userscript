package androidx.core.widget;

import A.b;
import N.C0008h;
import N.C0014n;
import N.C0016p;
import N.C0017q;
import N.F;
import N.Q;
import T.e;
import T.h;
import T.i;
import T.j;
import T.l;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.os.Build;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import android.view.FocusFinder;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.animation.AnimationUtils;
import android.widget.EdgeEffect;
import android.widget.FrameLayout;
import android.widget.OverScroller;
import h.C0117h;
import java.util.ArrayList;
import java.util.WeakHashMap;
import p0.C0320a;

public class NestedScrollView extends FrameLayout implements C0016p {

    /* renamed from: H  reason: collision with root package name */
    public static final float f1472H = ((float) (Math.log(0.78d) / Math.log(0.9d)));
    public static final h I = new h(0);

    /* renamed from: J  reason: collision with root package name */
    public static final int[] f1473J = {16843130};

    /* renamed from: A  reason: collision with root package name */
    public int f1474A;

    /* renamed from: B  reason: collision with root package name */
    public l f1475B;

    /* renamed from: C  reason: collision with root package name */
    public final C0017q f1476C;

    /* renamed from: D  reason: collision with root package name */
    public final C0014n f1477D;

    /* renamed from: E  reason: collision with root package name */
    public float f1478E;

    /* renamed from: F  reason: collision with root package name */
    public j f1479F;

    /* renamed from: G  reason: collision with root package name */
    public final C0008h f1480G = new C0008h(getContext(), new b(11, (Object) this));

    /* renamed from: f  reason: collision with root package name */
    public final float f1481f;

    /* renamed from: g  reason: collision with root package name */
    public long f1482g;

    /* renamed from: h  reason: collision with root package name */
    public final Rect f1483h = new Rect();
    public final OverScroller i;

    /* renamed from: j  reason: collision with root package name */
    public final EdgeEffect f1484j;

    /* renamed from: k  reason: collision with root package name */
    public final EdgeEffect f1485k;

    /* renamed from: l  reason: collision with root package name */
    public int f1486l;

    /* renamed from: m  reason: collision with root package name */
    public boolean f1487m = true;

    /* renamed from: n  reason: collision with root package name */
    public boolean f1488n = false;

    /* renamed from: o  reason: collision with root package name */
    public View f1489o = null;

    /* renamed from: p  reason: collision with root package name */
    public boolean f1490p = false;

    /* renamed from: q  reason: collision with root package name */
    public VelocityTracker f1491q;

    /* renamed from: r  reason: collision with root package name */
    public boolean f1492r;

    /* renamed from: s  reason: collision with root package name */
    public boolean f1493s = true;

    /* renamed from: t  reason: collision with root package name */
    public final int f1494t;

    /* renamed from: u  reason: collision with root package name */
    public final int f1495u;

    /* renamed from: v  reason: collision with root package name */
    public final int f1496v;

    /* renamed from: w  reason: collision with root package name */
    public int f1497w = -1;

    /* renamed from: x  reason: collision with root package name */
    public final int[] f1498x = new int[2];

    /* renamed from: y  reason: collision with root package name */
    public final int[] f1499y = new int[2];

    /* renamed from: z  reason: collision with root package name */
    public int f1500z;

    public static boolean l(View view, NestedScrollView nestedScrollView) {
        if (view == nestedScrollView) {
            return true;
        }
        ViewParent parent = view.getParent();
        if (!(parent instanceof ViewGroup) || !l((View) parent, nestedScrollView)) {
            return false;
        }
        return true;
    }

    public final void a(View view, View view2, int i2, int i3) {
        C0017q qVar = this.f1476C;
        if (i3 == 1) {
            qVar.f585b = i2;
        } else {
            qVar.f584a = i2;
        }
        this.f1477D.g(2, i3);
    }

    public final void addView(View view) {
        if (getChildCount() <= 0) {
            super.addView(view);
            return;
        }
        throw new IllegalStateException("ScrollView can host only one direct child");
    }

    public final void c(View view, int i2, int i3, int i4, int i5, int i6) {
        n(i5, i6, (int[]) null);
    }

    public final int computeVerticalScrollOffset() {
        return Math.max(0, super.computeVerticalScrollOffset());
    }

    public final boolean dispatchNestedScroll(int i2, int i3, int i4, int i5, int[] iArr) {
        return this.f1477D.d(i2, i3, i4, i5, iArr, 0, (int[]) null);
    }

    public final void e(View view, int i2, int i3, int[] iArr, int i4) {
        this.f1477D.c(i2, i3, iArr, (int[]) null, i4);
    }

    public final boolean f(View view, View view2, int i2, int i3) {
        return (i2 & 2) != 0;
    }

    public final void onNestedPreScroll(View view, int i2, int i3, int[] iArr) {
        this.f1477D.c(i2, i3, iArr, (int[]) null, 0);
    }

    public final void onNestedScroll(View view, int i2, int i3, int i4, int i5) {
        n(i5, 0, (int[]) null);
    }

    public final void onNestedScrollAccepted(View view, View view2, int i2) {
        a(view, view2, i2, 0);
    }

    public final boolean onRequestFocusInDescendants(int i2, Rect rect) {
        View view;
        if (i2 == 2) {
            i2 = 130;
        } else if (i2 == 1) {
            i2 = 33;
        }
        if (rect == null) {
            view = FocusFinder.getInstance().findNextFocus(this, (View) null, i2);
        } else {
            view = FocusFinder.getInstance().findNextFocusFromRect(this, rect, i2);
        }
        if (view != null && m(view, 0, getHeight())) {
            return view.requestFocus(i2, rect);
        }
        return false;
    }

    public final boolean onStartNestedScroll(View view, View view2, int i2) {
        return f(view, view2, i2, 0);
    }

    public final void onStopNestedScroll(View view) {
        d(view, 0);
    }

    public final void requestLayout() {
        this.f1487m = true;
        super.requestLayout();
    }

    public final boolean shouldDelayChildPressedState() {
        return true;
    }

    public final void stopNestedScroll() {
        w(0);
    }

    public final boolean t(EdgeEffect edgeEffect, int i2) {
        if (i2 > 0) {
            return true;
        }
        float N2 = C0320a.N(edgeEffect) * ((float) getHeight());
        float f2 = this.f1481f * 0.015f;
        double log = Math.log((double) ((((float) Math.abs(-i2)) * 0.35f) / f2));
        double d2 = (double) f1472H;
        if (((float) (Math.exp((d2 / (d2 - 1.0d)) * log) * ((double) f2))) < N2) {
            return true;
        }
        return false;
    }

    /* JADX WARNING: Removed duplicated region for block: B:19:0x0084  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x00a9  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x00e6  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x00ea  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void computeScroll() {
        /*
            r14 = this;
            android.widget.OverScroller r0 = r14.i
            boolean r0 = r0.isFinished()
            if (r0 == 0) goto L_0x0009
            return
        L_0x0009:
            android.widget.OverScroller r0 = r14.i
            r0.computeScrollOffset()
            android.widget.OverScroller r0 = r14.i
            int r0 = r0.getCurrY()
            int r1 = r14.f1474A
            int r1 = r0 - r1
            int r2 = r14.getHeight()
            android.widget.EdgeEffect r3 = r14.f1485k
            android.widget.EdgeEffect r4 = r14.f1484j
            r5 = 1056964608(0x3f000000, float:0.5)
            r6 = 0
            r7 = 1082130432(0x40800000, float:4.0)
            if (r1 <= 0) goto L_0x0049
            float r8 = p0.C0320a.N(r4)
            int r8 = (r8 > r6 ? 1 : (r8 == r6 ? 0 : -1))
            if (r8 == 0) goto L_0x0049
            int r6 = -r1
            float r6 = (float) r6
            float r6 = r6 * r7
            float r8 = (float) r2
            float r6 = r6 / r8
            int r2 = -r2
            float r2 = (float) r2
            float r2 = r2 / r7
            float r5 = p0.C0320a.m0(r4, r6, r5)
            float r5 = r5 * r2
            int r2 = java.lang.Math.round(r5)
            if (r2 == r1) goto L_0x0047
            r4.finish()
        L_0x0047:
            int r1 = r1 - r2
            goto L_0x0069
        L_0x0049:
            if (r1 >= 0) goto L_0x0069
            float r8 = p0.C0320a.N(r3)
            int r6 = (r8 > r6 ? 1 : (r8 == r6 ? 0 : -1))
            if (r6 == 0) goto L_0x0069
            float r6 = (float) r1
            float r6 = r6 * r7
            float r2 = (float) r2
            float r6 = r6 / r2
            float r2 = r2 / r7
            float r5 = p0.C0320a.m0(r3, r6, r5)
            float r5 = r5 * r2
            int r2 = java.lang.Math.round(r5)
            if (r2 == r1) goto L_0x0047
            r3.finish()
            goto L_0x0047
        L_0x0069:
            r14.f1474A = r0
            int[] r0 = r14.f1499y
            r2 = 1
            r11 = 0
            r0[r2] = r11
            r9 = 0
            N.n r5 = r14.f1477D
            r6 = 0
            r10 = 1
            r7 = r1
            r8 = r0
            r5.c(r6, r7, r8, r9, r10)
            r5 = r0[r2]
            int r1 = r1 - r5
            int r13 = r14.getScrollRange()
            if (r1 == 0) goto L_0x00a7
            int r5 = r14.getScrollY()
            int r6 = r14.getScrollX()
            r14.p(r1, r6, r5, r13)
            int r6 = r14.getScrollY()
            int r7 = r6 - r5
            int r1 = r1 - r7
            r0[r2] = r11
            r6 = 0
            r8 = 0
            N.n r5 = r14.f1477D
            int[] r10 = r14.f1498x
            r11 = 1
            r9 = r1
            r12 = r0
            r5.d(r6, r7, r8, r9, r10, r11, r12)
            r0 = r0[r2]
            int r1 = r1 - r0
        L_0x00a7:
            if (r1 == 0) goto L_0x00de
            int r0 = r14.getOverScrollMode()
            if (r0 == 0) goto L_0x00b3
            if (r0 != r2) goto L_0x00d6
            if (r13 <= 0) goto L_0x00d6
        L_0x00b3:
            if (r1 >= 0) goto L_0x00c6
            boolean r0 = r4.isFinished()
            if (r0 == 0) goto L_0x00d6
            android.widget.OverScroller r0 = r14.i
            float r0 = r0.getCurrVelocity()
            int r0 = (int) r0
            r4.onAbsorb(r0)
            goto L_0x00d6
        L_0x00c6:
            boolean r0 = r3.isFinished()
            if (r0 == 0) goto L_0x00d6
            android.widget.OverScroller r0 = r14.i
            float r0 = r0.getCurrVelocity()
            int r0 = (int) r0
            r3.onAbsorb(r0)
        L_0x00d6:
            android.widget.OverScroller r0 = r14.i
            r0.abortAnimation()
            r14.w(r2)
        L_0x00de:
            android.widget.OverScroller r0 = r14.i
            boolean r0 = r0.isFinished()
            if (r0 != 0) goto L_0x00ea
            r14.postInvalidateOnAnimation()
            goto L_0x00ed
        L_0x00ea:
            r14.w(r2)
        L_0x00ed:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.core.widget.NestedScrollView.computeScroll():void");
    }

    public final void d(View view, int i2) {
        C0017q qVar = this.f1476C;
        if (i2 == 1) {
            qVar.f585b = 0;
        } else {
            qVar.f584a = 0;
        }
        w(i2);
    }

    public final boolean dispatchNestedFling(float f2, float f3, boolean z2) {
        return this.f1477D.a(f2, f3, z2);
    }

    public final boolean dispatchNestedPreFling(float f2, float f3) {
        return this.f1477D.b(f2, f3);
    }

    public final boolean dispatchNestedPreScroll(int i2, int i3, int[] iArr, int[] iArr2) {
        return this.f1477D.c(i2, i3, iArr, iArr2, 0);
    }

    public int getNestedScrollAxes() {
        C0017q qVar = this.f1476C;
        return qVar.f585b | qVar.f584a;
    }

    public float getVerticalScrollFactorCompat() {
        if (this.f1478E == 0.0f) {
            TypedValue typedValue = new TypedValue();
            Context context = getContext();
            if (context.getTheme().resolveAttribute(16842829, typedValue, true)) {
                this.f1478E = typedValue.getDimension(context.getResources().getDisplayMetrics());
            } else {
                throw new IllegalStateException("Expected theme to define listPreferredItemHeight.");
            }
        }
        return this.f1478E;
    }

    public final boolean hasNestedScrollingParent() {
        return this.f1477D.f(0);
    }

    public final boolean i(KeyEvent keyEvent) {
        this.f1483h.setEmpty();
        int i2 = 130;
        if (getChildCount() > 0) {
            View childAt = getChildAt(0);
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
            if (childAt.getHeight() + layoutParams.topMargin + layoutParams.bottomMargin > (getHeight() - getPaddingTop()) - getPaddingBottom()) {
                if (keyEvent.getAction() != 0) {
                    return false;
                }
                int keyCode = keyEvent.getKeyCode();
                if (keyCode != 19) {
                    if (keyCode != 20) {
                        if (keyCode == 62) {
                            if (keyEvent.isShiftPressed()) {
                                i2 = 33;
                            }
                            q(i2);
                            return false;
                        } else if (keyCode == 92) {
                            return k(33);
                        } else {
                            if (keyCode == 93) {
                                return k(130);
                            }
                            if (keyCode == 122) {
                                q(33);
                                return false;
                            } else if (keyCode != 123) {
                                return false;
                            } else {
                                q(130);
                                return false;
                            }
                        }
                    } else if (keyEvent.isAltPressed()) {
                        return k(130);
                    } else {
                        return g(130);
                    }
                } else if (keyEvent.isAltPressed()) {
                    return k(33);
                } else {
                    return g(33);
                }
            }
        }
        if (!isFocused() || keyEvent.getKeyCode() == 4) {
            return false;
        }
        View findFocus = findFocus();
        if (findFocus == this) {
            findFocus = null;
        }
        View findNextFocus = FocusFinder.getInstance().findNextFocus(this, findFocus, 130);
        if (findNextFocus == null || findNextFocus == this || !findNextFocus.requestFocus(130)) {
            return false;
        }
        return true;
    }

    public final boolean isNestedScrollingEnabled() {
        return this.f1477D.f573d;
    }

    public final boolean k(int i2) {
        boolean z2;
        int childCount;
        if (i2 == 130) {
            z2 = true;
        } else {
            z2 = false;
        }
        int height = getHeight();
        Rect rect = this.f1483h;
        rect.top = 0;
        rect.bottom = height;
        if (z2 && (childCount = getChildCount()) > 0) {
            View childAt = getChildAt(childCount - 1);
            int paddingBottom = getPaddingBottom() + childAt.getBottom() + ((FrameLayout.LayoutParams) childAt.getLayoutParams()).bottomMargin;
            rect.bottom = paddingBottom;
            rect.top = paddingBottom - height;
        }
        return r(i2, rect.top, rect.bottom);
    }

    public final boolean m(View view, int i2, int i3) {
        Rect rect = this.f1483h;
        view.getDrawingRect(rect);
        offsetDescendantRectToMyCoords(view, rect);
        if (rect.bottom + i2 < getScrollY() || rect.top - i2 > getScrollY() + i3) {
            return false;
        }
        return true;
    }

    /* JADX WARNING: Removed duplicated region for block: B:143:0x02b3  */
    /* JADX WARNING: Removed duplicated region for block: B:144:0x02bb  */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x00f3  */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x00f9  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean onGenericMotionEvent(android.view.MotionEvent r27) {
        /*
            r26 = this;
            r0 = r26
            r1 = r27
            r3 = 1
            int r4 = r27.getAction()
            r5 = 8
            if (r4 != r5) goto L_0x0356
            boolean r4 = r0.f1490p
            if (r4 != 0) goto L_0x0356
            int r4 = r27.getSource()
            r5 = 2
            r4 = r4 & r5
            if (r4 != r5) goto L_0x001b
            r4 = 1
            goto L_0x001c
        L_0x001b:
            r4 = 0
        L_0x001c:
            r7 = 0
            r8 = 4194304(0x400000, float:5.877472E-39)
            r9 = 26
            if (r4 == 0) goto L_0x002f
            r4 = 9
            float r10 = r1.getAxisValue(r4)
            float r11 = r27.getX()
            int r11 = (int) r11
            goto L_0x0046
        L_0x002f:
            int r4 = r27.getSource()
            r4 = r4 & r8
            if (r4 != r8) goto L_0x0043
            float r10 = r1.getAxisValue(r9)
            int r4 = r26.getWidth()
            int r11 = r4 / 2
            r4 = 26
            goto L_0x0046
        L_0x0043:
            r4 = 0
            r10 = 0
            r11 = 0
        L_0x0046:
            int r12 = (r10 > r7 ? 1 : (r10 == r7 ? 0 : -1))
            if (r12 == 0) goto L_0x0356
            float r12 = r26.getVerticalScrollFactorCompat()
            float r12 = r12 * r10
            int r10 = (int) r12
            int r12 = r27.getSource()
            r13 = 8194(0x2002, float:1.1482E-41)
            r12 = r12 & r13
            if (r12 != r13) goto L_0x005c
            r12 = 1
            goto L_0x005d
        L_0x005c:
            r12 = 0
        L_0x005d:
            int r10 = -r10
            r0.s(r10, r11, r3, r12)
            if (r4 == 0) goto L_0x0354
            N.h r10 = r0.f1480G
            r10.getClass()
            int r11 = r27.getSource()
            int r12 = r27.getDeviceId()
            int r13 = r10.f551f
            int[] r14 = r10.f553h
            r5 = 34
            if (r13 != r11) goto L_0x0085
            int r13 = r10.f552g
            if (r13 != r12) goto L_0x0085
            int r13 = r10.e
            if (r13 == r4) goto L_0x0081
            goto L_0x0085
        L_0x0081:
            r2 = 0
            r6 = 0
            goto L_0x0143
        L_0x0085:
            android.content.Context r13 = r10.f547a
            android.view.ViewConfiguration r2 = android.view.ViewConfiguration.get(r13)
            int r7 = r27.getDeviceId()
            int r15 = r27.getSource()
            int r3 = android.os.Build.VERSION.SDK_INT
            java.lang.String r6 = "android"
            java.lang.String r9 = "dimen"
            r8 = -1
            if (r3 < r5) goto L_0x00a4
            java.lang.reflect.Method r21 = N.V.f515a
            int r7 = N.U.b(r2, r7, r4, r15)
        L_0x00a2:
            r5 = 0
            goto L_0x00e5
        L_0x00a4:
            java.lang.reflect.Method r21 = N.V.f515a
            android.view.InputDevice r7 = android.view.InputDevice.getDevice(r7)
            if (r7 == 0) goto L_0x00e1
            android.view.InputDevice$MotionRange r7 = r7.getMotionRange(r4, r15)
            if (r7 == 0) goto L_0x00e1
            android.content.res.Resources r7 = r13.getResources()
            r5 = 4194304(0x400000, float:5.877472E-39)
            if (r15 != r5) goto L_0x00c5
            r5 = 26
            if (r4 != r5) goto L_0x00c5
            java.lang.String r5 = "config_viewMinRotaryEncoderFlingVelocity"
            int r5 = r7.getIdentifier(r5, r9, r6)
            goto L_0x00c6
        L_0x00c5:
            r5 = -1
        L_0x00c6:
            java.util.Objects.requireNonNull(r2)
            if (r5 == r8) goto L_0x00dc
            if (r5 == 0) goto L_0x00d8
            int r5 = r7.getDimensionPixelSize(r5)
            if (r5 >= 0) goto L_0x00d6
            r5 = 2147483647(0x7fffffff, float:NaN)
        L_0x00d6:
            r7 = r5
            goto L_0x00a2
        L_0x00d8:
            r7 = 2147483647(0x7fffffff, float:NaN)
            goto L_0x00a2
        L_0x00dc:
            int r5 = r2.getScaledMinimumFlingVelocity()
            goto L_0x00d6
        L_0x00e1:
            r5 = 0
            r7 = 2147483647(0x7fffffff, float:NaN)
        L_0x00e5:
            r14[r5] = r7
            int r5 = r27.getDeviceId()
            int r7 = r27.getSource()
            r15 = 34
            if (r3 < r15) goto L_0x00f9
            int r2 = N.U.a(r2, r5, r4, r7)
        L_0x00f7:
            r3 = 1
            goto L_0x0139
        L_0x00f9:
            android.view.InputDevice r3 = android.view.InputDevice.getDevice(r5)
            if (r3 == 0) goto L_0x0107
            android.view.InputDevice$MotionRange r3 = r3.getMotionRange(r4, r7)
            if (r3 == 0) goto L_0x0107
            r3 = 1
            goto L_0x0108
        L_0x0107:
            r3 = 0
        L_0x0108:
            r5 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r3 != 0) goto L_0x010f
        L_0x010c:
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            goto L_0x00f7
        L_0x010f:
            android.content.res.Resources r3 = r13.getResources()
            r13 = 4194304(0x400000, float:5.877472E-39)
            if (r7 != r13) goto L_0x0122
            r7 = 26
            if (r4 != r7) goto L_0x0122
            java.lang.String r7 = "config_viewMaxRotaryEncoderFlingVelocity"
            int r6 = r3.getIdentifier(r7, r9, r6)
            goto L_0x0123
        L_0x0122:
            r6 = -1
        L_0x0123:
            java.util.Objects.requireNonNull(r2)
            if (r6 == r8) goto L_0x0134
            if (r6 == 0) goto L_0x010c
            int r2 = r3.getDimensionPixelSize(r6)
            if (r2 >= 0) goto L_0x0131
            goto L_0x0132
        L_0x0131:
            r5 = r2
        L_0x0132:
            r2 = r5
            goto L_0x00f7
        L_0x0134:
            int r2 = r2.getScaledMaximumFlingVelocity()
            goto L_0x00f7
        L_0x0139:
            r14[r3] = r2
            r10.f551f = r11
            r10.f552g = r12
            r10.e = r4
            r2 = 0
            r6 = 1
        L_0x0143:
            r3 = r14[r2]
            r2 = 2147483647(0x7fffffff, float:NaN)
            if (r3 != r2) goto L_0x0156
            android.view.VelocityTracker r1 = r10.f549c
            if (r1 == 0) goto L_0x0354
            r1.recycle()
            r1 = 0
            r10.f549c = r1
            goto L_0x0354
        L_0x0156:
            android.view.VelocityTracker r2 = r10.f549c
            if (r2 != 0) goto L_0x0160
            android.view.VelocityTracker r2 = android.view.VelocityTracker.obtain()
            r10.f549c = r2
        L_0x0160:
            android.view.VelocityTracker r2 = r10.f549c
            java.util.Map r3 = N.C0023x.f598a
            r2.addMovement(r1)
            int r3 = android.os.Build.VERSION.SDK_INT
            r5 = 34
            if (r3 < r5) goto L_0x016e
            goto L_0x01c9
        L_0x016e:
            int r3 = r27.getSource()
            r5 = 4194304(0x400000, float:5.877472E-39)
            if (r3 != r5) goto L_0x01c9
            java.util.Map r3 = N.C0023x.f598a
            boolean r5 = r3.containsKey(r2)
            if (r5 != 0) goto L_0x0186
            N.y r5 = new N.y
            r5.<init>()
            r3.put(r2, r5)
        L_0x0186:
            java.lang.Object r3 = r3.get(r2)
            N.y r3 = (N.C0024y) r3
            r3.getClass()
            long r7 = r27.getEventTime()
            int r5 = r3.f603d
            long[] r9 = r3.f601b
            if (r5 == 0) goto L_0x01ab
            int r5 = r3.e
            r11 = r9[r5]
            long r11 = r7 - r11
            r22 = 40
            int r5 = (r11 > r22 ? 1 : (r11 == r22 ? 0 : -1))
            if (r5 <= 0) goto L_0x01ab
            r5 = 0
            r3.f603d = r5
            r5 = 0
            r3.f602c = r5
        L_0x01ab:
            int r5 = r3.e
            r11 = 1
            int r5 = r5 + r11
            r12 = 20
            int r5 = r5 % r12
            r3.e = r5
            int r13 = r3.f603d
            if (r13 == r12) goto L_0x01bb
            int r13 = r13 + r11
            r3.f603d = r13
        L_0x01bb:
            r11 = 26
            float r1 = r1.getAxisValue(r11)
            float[] r11 = r3.f600a
            r11[r5] = r1
            int r1 = r3.e
            r9[r1] = r7
        L_0x01c9:
            r1 = 1000(0x3e8, float:1.401E-42)
            r3 = 2139095039(0x7f7fffff, float:3.4028235E38)
            r2.computeCurrentVelocity(r1, r3)
            java.util.Map r5 = N.C0023x.f598a
            java.lang.Object r5 = r5.get(r2)
            N.y r5 = (N.C0024y) r5
            if (r5 == 0) goto L_0x02cc
            int r7 = r5.f603d
            r8 = 2
            if (r7 >= r8) goto L_0x01e7
        L_0x01e0:
            r24 = r2
            r1 = 0
        L_0x01e3:
            r2 = 1000(0x3e8, float:1.401E-42)
            goto L_0x02a2
        L_0x01e7:
            int r8 = r5.e
            r9 = 20
            int r11 = r8 + 20
            r12 = 1
            int r7 = r7 - r12
            int r11 = r11 - r7
            int r11 = r11 % r9
            long[] r7 = r5.f601b
            r8 = r7[r8]
        L_0x01f5:
            r12 = r7[r11]
            long r22 = r8 - r12
            r24 = 100
            int r15 = (r22 > r24 ? 1 : (r22 == r24 ? 0 : -1))
            if (r15 <= 0) goto L_0x020b
            int r12 = r5.f603d
            r15 = 1
            int r12 = r12 - r15
            r5.f603d = r12
            int r11 = r11 + r15
            r17 = 20
            int r11 = r11 % 20
            goto L_0x01f5
        L_0x020b:
            r15 = 1
            r17 = 20
            int r8 = r5.f603d
            r9 = 2
            if (r8 >= r9) goto L_0x0214
            goto L_0x01e0
        L_0x0214:
            float[] r3 = r5.f600a
            if (r8 != r9) goto L_0x022b
            int r11 = r11 + r15
            int r11 = r11 % 20
            r8 = r7[r11]
            int r7 = (r12 > r8 ? 1 : (r12 == r8 ? 0 : -1))
            if (r7 != 0) goto L_0x0222
            goto L_0x01e0
        L_0x0222:
            r3 = r3[r11]
            long r8 = r8 - r12
            float r7 = (float) r8
            float r3 = r3 / r7
            r24 = r2
            r1 = r3
            goto L_0x01e3
        L_0x022b:
            r8 = 0
            r9 = 0
            r12 = 0
        L_0x022e:
            int r13 = r5.f603d
            r15 = 1
            int r13 = r13 - r15
            r16 = 1073741824(0x40000000, float:2.0)
            r18 = 1065353216(0x3f800000, float:1.0)
            r20 = -1082130432(0xffffffffbf800000, float:-1.0)
            if (r9 >= r13) goto L_0x0289
            int r13 = r9 + r11
            r17 = 20
            int r19 = r13 % 20
            r22 = r7[r19]
            int r13 = r13 + r15
            int r13 = r13 % 20
            r24 = r7[r13]
            int r19 = (r24 > r22 ? 1 : (r24 == r22 ? 0 : -1))
            if (r19 != 0) goto L_0x0250
            r24 = r2
            r13 = r3
            r2 = 1
            goto L_0x0282
        L_0x0250:
            int r12 = r12 + r15
            r15 = 0
            int r24 = (r8 > r15 ? 1 : (r8 == r15 ? 0 : -1))
            if (r24 >= 0) goto L_0x0258
            r18 = -1082130432(0xffffffffbf800000, float:-1.0)
        L_0x0258:
            float r15 = java.lang.Math.abs(r8)
            float r15 = r15 * r16
            r24 = r2
            double r1 = (double) r15
            double r1 = java.lang.Math.sqrt(r1)
            float r1 = (float) r1
            float r18 = r18 * r1
            r1 = r3[r13]
            r15 = r7[r13]
            r13 = r3
            long r2 = r15 - r22
            float r2 = (float) r2
            float r1 = r1 / r2
            float r2 = r1 - r18
            float r1 = java.lang.Math.abs(r1)
            float r1 = r1 * r2
            float r1 = r1 + r8
            r2 = 1
            if (r12 != r2) goto L_0x0281
            r3 = 1056964608(0x3f000000, float:0.5)
            float r1 = r1 * r3
        L_0x0281:
            r8 = r1
        L_0x0282:
            int r9 = r9 + r2
            r3 = r13
            r2 = r24
            r1 = 1000(0x3e8, float:1.401E-42)
            goto L_0x022e
        L_0x0289:
            r24 = r2
            r1 = 0
            int r2 = (r8 > r1 ? 1 : (r8 == r1 ? 0 : -1))
            if (r2 >= 0) goto L_0x0292
            r18 = -1082130432(0xffffffffbf800000, float:-1.0)
        L_0x0292:
            float r1 = java.lang.Math.abs(r8)
            float r1 = r1 * r16
            double r1 = (double) r1
            double r1 = java.lang.Math.sqrt(r1)
            float r1 = (float) r1
            float r1 = r1 * r18
            goto L_0x01e3
        L_0x02a2:
            float r2 = (float) r2
            float r1 = r1 * r2
            r5.f602c = r1
            r2 = 2139095039(0x7f7fffff, float:3.4028235E38)
            float r3 = java.lang.Math.abs(r2)
            float r3 = -r3
            int r1 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r1 >= 0) goto L_0x02bb
            float r1 = java.lang.Math.abs(r2)
            float r1 = -r1
            r5.f602c = r1
            goto L_0x02ce
        L_0x02bb:
            float r1 = r5.f602c
            float r3 = java.lang.Math.abs(r2)
            int r1 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r1 <= 0) goto L_0x02ce
            float r1 = java.lang.Math.abs(r2)
            r5.f602c = r1
            goto L_0x02ce
        L_0x02cc:
            r24 = r2
        L_0x02ce:
            int r1 = android.os.Build.VERSION.SDK_INT
            r2 = 34
            if (r1 < r2) goto L_0x02db
            r1 = r24
            float r1 = N.C0022w.a(r1, r4)
            goto L_0x02ff
        L_0x02db:
            r1 = r24
            if (r4 != 0) goto L_0x02e4
            float r1 = r1.getXVelocity()
            goto L_0x02ff
        L_0x02e4:
            r2 = 1
            if (r4 != r2) goto L_0x02ec
            float r1 = r1.getYVelocity()
            goto L_0x02ff
        L_0x02ec:
            java.util.Map r2 = N.C0023x.f598a
            java.lang.Object r1 = r2.get(r1)
            N.y r1 = (N.C0024y) r1
            if (r1 == 0) goto L_0x02fe
            r2 = 26
            if (r4 == r2) goto L_0x02fb
            goto L_0x02fe
        L_0x02fb:
            float r1 = r1.f602c
            goto L_0x02ff
        L_0x02fe:
            r1 = 0
        L_0x02ff:
            A.b r2 = r10.f548b
            java.lang.Object r2 = r2.f2g
            androidx.core.widget.NestedScrollView r2 = (androidx.core.widget.NestedScrollView) r2
            float r3 = r2.getVerticalScrollFactorCompat()
            float r3 = -r3
            float r1 = r1 * r3
            float r3 = java.lang.Math.signum(r1)
            if (r6 != 0) goto L_0x0321
            float r4 = r10.f550d
            float r4 = java.lang.Math.signum(r4)
            int r4 = (r3 > r4 ? 1 : (r3 == r4 ? 0 : -1))
            if (r4 == 0) goto L_0x0326
            r4 = 0
            int r3 = (r3 > r4 ? 1 : (r3 == r4 ? 0 : -1))
            if (r3 == 0) goto L_0x0326
        L_0x0321:
            android.widget.OverScroller r3 = r2.i
            r3.abortAnimation()
        L_0x0326:
            float r3 = java.lang.Math.abs(r1)
            r4 = 0
            r4 = r14[r4]
            float r4 = (float) r4
            int r3 = (r3 > r4 ? 1 : (r3 == r4 ? 0 : -1))
            if (r3 >= 0) goto L_0x0333
            goto L_0x0354
        L_0x0333:
            r3 = 1
            r4 = r14[r3]
            int r3 = -r4
            float r3 = (float) r3
            float r4 = (float) r4
            float r1 = java.lang.Math.min(r1, r4)
            float r1 = java.lang.Math.max(r3, r1)
            r3 = 0
            int r4 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r4 != 0) goto L_0x0348
            r7 = 0
            goto L_0x0352
        L_0x0348:
            android.widget.OverScroller r3 = r2.i
            r3.abortAnimation()
            int r3 = (int) r1
            r2.j(r3)
            r7 = r1
        L_0x0352:
            r10.f550d = r7
        L_0x0354:
            r1 = 1
            return r1
        L_0x0356:
            r1 = 0
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.core.widget.NestedScrollView.onGenericMotionEvent(android.view.MotionEvent):boolean");
    }

    public final boolean onNestedFling(View view, float f2, float f3, boolean z2) {
        if (z2) {
            return false;
        }
        dispatchNestedFling(0.0f, f3, true);
        j((int) f3);
        return true;
    }

    public final boolean onNestedPreFling(View view, float f2, float f3) {
        return this.f1477D.b(f2, f3);
    }

    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof l)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        l lVar = (l) parcelable;
        super.onRestoreInstanceState(lVar.getSuperState());
        this.f1475B = lVar;
        requestLayout();
    }

    public final boolean onTouchEvent(MotionEvent motionEvent) {
        ViewParent parent;
        MotionEvent motionEvent2 = motionEvent;
        if (this.f1491q == null) {
            this.f1491q = VelocityTracker.obtain();
        }
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.f1500z = 0;
        }
        MotionEvent obtain = MotionEvent.obtain(motionEvent);
        float f2 = 0.0f;
        obtain.offsetLocation(0.0f, (float) this.f1500z);
        C0014n nVar = this.f1477D;
        if (actionMasked != 0) {
            EdgeEffect edgeEffect = this.f1485k;
            EdgeEffect edgeEffect2 = this.f1484j;
            if (actionMasked == 1) {
                VelocityTracker velocityTracker = this.f1491q;
                velocityTracker.computeCurrentVelocity(1000, (float) this.f1496v);
                int yVelocity = (int) velocityTracker.getYVelocity(this.f1497w);
                if (Math.abs(yVelocity) >= this.f1495u) {
                    if (C0320a.N(edgeEffect2) != 0.0f) {
                        if (t(edgeEffect2, yVelocity)) {
                            edgeEffect2.onAbsorb(yVelocity);
                        } else {
                            j(-yVelocity);
                        }
                    } else if (C0320a.N(edgeEffect) != 0.0f) {
                        int i2 = -yVelocity;
                        if (t(edgeEffect, i2)) {
                            edgeEffect.onAbsorb(i2);
                        } else {
                            j(i2);
                        }
                    } else {
                        int i3 = -yVelocity;
                        float f3 = (float) i3;
                        if (!nVar.b(0.0f, f3)) {
                            dispatchNestedFling(0.0f, f3, true);
                            j(i3);
                        }
                    }
                } else if (this.i.springBack(getScrollX(), getScrollY(), 0, 0, 0, getScrollRange())) {
                    postInvalidateOnAnimation();
                }
                this.f1497w = -1;
                this.f1490p = false;
                VelocityTracker velocityTracker2 = this.f1491q;
                if (velocityTracker2 != null) {
                    velocityTracker2.recycle();
                    this.f1491q = null;
                }
                w(0);
                this.f1484j.onRelease();
                this.f1485k.onRelease();
            } else if (actionMasked == 2) {
                int findPointerIndex = motionEvent2.findPointerIndex(this.f1497w);
                if (findPointerIndex == -1) {
                    Log.e("NestedScrollView", "Invalid pointerId=" + this.f1497w + " in onTouchEvent");
                } else {
                    int y2 = (int) motionEvent2.getY(findPointerIndex);
                    int i4 = this.f1486l - y2;
                    float x2 = motionEvent2.getX(findPointerIndex) / ((float) getWidth());
                    float height = ((float) i4) / ((float) getHeight());
                    if (C0320a.N(edgeEffect2) != 0.0f) {
                        float f4 = -C0320a.m0(edgeEffect2, -height, x2);
                        if (C0320a.N(edgeEffect2) == 0.0f) {
                            edgeEffect2.onRelease();
                        }
                        f2 = f4;
                    } else if (C0320a.N(edgeEffect) != 0.0f) {
                        float m0 = C0320a.m0(edgeEffect, height, 1.0f - x2);
                        if (C0320a.N(edgeEffect) == 0.0f) {
                            edgeEffect.onRelease();
                        }
                        f2 = m0;
                    }
                    int round = Math.round(f2 * ((float) getHeight()));
                    if (round != 0) {
                        invalidate();
                    }
                    int i5 = i4 - round;
                    if (!this.f1490p && Math.abs(i5) > this.f1494t) {
                        ViewParent parent2 = getParent();
                        if (parent2 != null) {
                            parent2.requestDisallowInterceptTouchEvent(true);
                        }
                        this.f1490p = true;
                        i5 = i5 > 0 ? i5 - this.f1494t : i5 + this.f1494t;
                    }
                    if (this.f1490p) {
                        int s2 = s(i5, (int) motionEvent2.getX(findPointerIndex), 0, false);
                        this.f1486l = y2 - s2;
                        this.f1500z += s2;
                    }
                }
            } else if (actionMasked == 3) {
                if (this.f1490p && getChildCount() > 0 && this.i.springBack(getScrollX(), getScrollY(), 0, 0, 0, getScrollRange())) {
                    postInvalidateOnAnimation();
                }
                this.f1497w = -1;
                this.f1490p = false;
                VelocityTracker velocityTracker3 = this.f1491q;
                if (velocityTracker3 != null) {
                    velocityTracker3.recycle();
                    this.f1491q = null;
                }
                w(0);
                this.f1484j.onRelease();
                this.f1485k.onRelease();
            } else if (actionMasked == 5) {
                int actionIndex = motionEvent.getActionIndex();
                this.f1486l = (int) motionEvent2.getY(actionIndex);
                this.f1497w = motionEvent2.getPointerId(actionIndex);
            } else if (actionMasked == 6) {
                o(motionEvent);
                this.f1486l = (int) motionEvent2.getY(motionEvent2.findPointerIndex(this.f1497w));
            }
        } else if (getChildCount() == 0) {
            return false;
        } else {
            if (this.f1490p && (parent = getParent()) != null) {
                parent.requestDisallowInterceptTouchEvent(true);
            }
            if (!this.i.isFinished()) {
                this.i.abortAnimation();
                w(1);
            }
            int pointerId = motionEvent2.getPointerId(0);
            this.f1486l = (int) motionEvent.getY();
            this.f1497w = pointerId;
            nVar.g(2, 0);
        }
        VelocityTracker velocityTracker4 = this.f1491q;
        if (velocityTracker4 != null) {
            velocityTracker4.addMovement(obtain);
        }
        obtain.recycle();
        return true;
    }

    public final void q(int i2) {
        boolean z2;
        if (i2 == 130) {
            z2 = true;
        } else {
            z2 = false;
        }
        int height = getHeight();
        Rect rect = this.f1483h;
        if (z2) {
            rect.top = getScrollY() + height;
            int childCount = getChildCount();
            if (childCount > 0) {
                View childAt = getChildAt(childCount - 1);
                int paddingBottom = getPaddingBottom() + childAt.getBottom() + ((FrameLayout.LayoutParams) childAt.getLayoutParams()).bottomMargin;
                if (rect.top + height > paddingBottom) {
                    rect.top = paddingBottom - height;
                }
            }
        } else {
            int scrollY = getScrollY() - height;
            rect.top = scrollY;
            if (scrollY < 0) {
                rect.top = 0;
            }
        }
        int i3 = rect.top;
        int i4 = height + i3;
        rect.bottom = i4;
        r(i2, i3, i4);
    }

    public final boolean r(int i2, int i3, int i4) {
        boolean z2;
        boolean z3;
        int i5;
        boolean z4;
        boolean z5;
        int i6 = i2;
        int i7 = i3;
        int i8 = i4;
        int height = getHeight();
        int scrollY = getScrollY();
        int i9 = height + scrollY;
        if (i6 == 33) {
            z2 = true;
        } else {
            z2 = false;
        }
        ArrayList<View> focusables = getFocusables(2);
        int size = focusables.size();
        View view = null;
        boolean z6 = false;
        for (int i10 = 0; i10 < size; i10++) {
            View view2 = focusables.get(i10);
            int top = view2.getTop();
            int bottom = view2.getBottom();
            if (i7 < bottom && top < i8) {
                if (i7 >= top || bottom >= i8) {
                    z4 = false;
                } else {
                    z4 = true;
                }
                if (view == null) {
                    view = view2;
                    z6 = z4;
                } else {
                    if ((!z2 || top >= view.getTop()) && (z2 || bottom <= view.getBottom())) {
                        z5 = false;
                    } else {
                        z5 = true;
                    }
                    if (z6) {
                        if (z4) {
                            if (!z5) {
                            }
                        }
                    } else if (z4) {
                        view = view2;
                        z6 = true;
                    } else if (!z5) {
                    }
                    view = view2;
                }
            }
        }
        if (view == null) {
            view = this;
        }
        if (i7 < scrollY || i8 > i9) {
            if (z2) {
                i5 = i7 - scrollY;
            } else {
                i5 = i8 - i9;
            }
            s(i5, 0, 1, true);
            z3 = true;
        } else {
            z3 = false;
        }
        if (view != findFocus()) {
            view.requestFocus(i6);
        }
        return z3;
    }

    public final void requestChildFocus(View view, View view2) {
        if (!this.f1487m) {
            Rect rect = this.f1483h;
            view2.getDrawingRect(rect);
            offsetDescendantRectToMyCoords(view2, rect);
            int h2 = h(rect);
            if (h2 != 0) {
                scrollBy(0, h2);
            }
        } else {
            this.f1489o = view2;
        }
        super.requestChildFocus(view, view2);
    }

    public final void requestDisallowInterceptTouchEvent(boolean z2) {
        VelocityTracker velocityTracker;
        if (z2 && (velocityTracker = this.f1491q) != null) {
            velocityTracker.recycle();
            this.f1491q = null;
        }
        super.requestDisallowInterceptTouchEvent(z2);
    }

    public final int s(int i2, int i3, int i4, boolean z2) {
        int i5;
        int i6;
        boolean z3;
        boolean z4;
        boolean z5;
        VelocityTracker velocityTracker;
        int i7 = i3;
        int i8 = i4;
        C0014n nVar = this.f1477D;
        if (i8 == 1) {
            nVar.g(2, i8);
        }
        boolean c2 = this.f1477D.c(0, i2, this.f1499y, this.f1498x, i4);
        int[] iArr = this.f1499y;
        int[] iArr2 = this.f1498x;
        if (c2) {
            i6 = i2 - iArr[1];
            i5 = iArr2[1];
        } else {
            i6 = i2;
            i5 = 0;
        }
        int scrollY = getScrollY();
        int scrollRange = getScrollRange();
        int overScrollMode = getOverScrollMode();
        if ((overScrollMode == 0 || (overScrollMode == 1 && getScrollRange() > 0)) && !z2) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (!p(i6, 0, scrollY, scrollRange) || nVar.f(i8)) {
            z4 = false;
        } else {
            z4 = true;
        }
        int scrollY2 = getScrollY() - scrollY;
        iArr[1] = 0;
        int i9 = scrollRange;
        this.f1477D.d(0, scrollY2, 0, i6 - scrollY2, this.f1498x, i4, iArr);
        int i10 = i5 + iArr2[1];
        int i11 = i6 - iArr[1];
        int i12 = scrollY + i11;
        EdgeEffect edgeEffect = this.f1485k;
        EdgeEffect edgeEffect2 = this.f1484j;
        if (i12 < 0) {
            if (z3) {
                C0320a.m0(edgeEffect2, ((float) (-i11)) / ((float) getHeight()), ((float) i7) / ((float) getWidth()));
                if (!edgeEffect.isFinished()) {
                    edgeEffect.onRelease();
                }
            }
        } else if (i12 > i9 && z3) {
            C0320a.m0(edgeEffect, ((float) i11) / ((float) getHeight()), 1.0f - (((float) i7) / ((float) getWidth())));
            if (!edgeEffect2.isFinished()) {
                edgeEffect2.onRelease();
            }
        }
        if (!edgeEffect2.isFinished() || !edgeEffect.isFinished()) {
            postInvalidateOnAnimation();
            z5 = false;
        } else {
            z5 = z4;
        }
        if (z5 && i8 == 0 && (velocityTracker = this.f1491q) != null) {
            velocityTracker.clear();
        }
        if (i8 == 1) {
            w(i8);
            edgeEffect2.onRelease();
            edgeEffect.onRelease();
        }
        return i10;
    }

    public void setFillViewport(boolean z2) {
        if (z2 != this.f1492r) {
            this.f1492r = z2;
            requestLayout();
        }
    }

    public void setNestedScrollingEnabled(boolean z2) {
        C0014n nVar = this.f1477D;
        if (nVar.f573d) {
            WeakHashMap weakHashMap = Q.f509a;
            F.z(nVar.f572c);
        }
        nVar.f573d = z2;
    }

    public void setOnScrollChangeListener(j jVar) {
        this.f1479F = jVar;
    }

    public void setSmoothScrollingEnabled(boolean z2) {
        this.f1493s = z2;
    }

    public final boolean startNestedScroll(int i2) {
        return this.f1477D.g(i2, 0);
    }

    public final boolean v(MotionEvent motionEvent) {
        boolean z2;
        EdgeEffect edgeEffect = this.f1484j;
        if (C0320a.N(edgeEffect) != 0.0f) {
            C0320a.m0(edgeEffect, 0.0f, motionEvent.getX() / ((float) getWidth()));
            z2 = true;
        } else {
            z2 = false;
        }
        EdgeEffect edgeEffect2 = this.f1485k;
        if (C0320a.N(edgeEffect2) == 0.0f) {
            return z2;
        }
        C0320a.m0(edgeEffect2, 0.0f, 1.0f - (motionEvent.getX() / ((float) getWidth())));
        return true;
    }

    public final void w(int i2) {
        this.f1477D.h(i2);
    }

    /* JADX WARNING: type inference failed for: r7v2, types: [N.q, java.lang.Object] */
    public NestedScrollView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 2130969471);
        EdgeEffect edgeEffect;
        EdgeEffect edgeEffect2;
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 31) {
            edgeEffect = e.a(context, attributeSet);
        } else {
            edgeEffect = new EdgeEffect(context);
        }
        this.f1484j = edgeEffect;
        if (i2 >= 31) {
            edgeEffect2 = e.a(context, attributeSet);
        } else {
            edgeEffect2 = new EdgeEffect(context);
        }
        this.f1485k = edgeEffect2;
        this.f1481f = context.getResources().getDisplayMetrics().density * 160.0f * 386.0878f * 0.84f;
        this.i = new OverScroller(getContext());
        setFocusable(true);
        setDescendantFocusability(262144);
        setWillNotDraw(false);
        ViewConfiguration viewConfiguration = ViewConfiguration.get(getContext());
        this.f1494t = viewConfiguration.getScaledTouchSlop();
        this.f1495u = viewConfiguration.getScaledMinimumFlingVelocity();
        this.f1496v = viewConfiguration.getScaledMaximumFlingVelocity();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, f1473J, 2130969471, 0);
        setFillViewport(obtainStyledAttributes.getBoolean(0, false));
        obtainStyledAttributes.recycle();
        this.f1476C = new Object();
        this.f1477D = new C0014n(this);
        setNestedScrollingEnabled(true);
        Q.p(this, I);
    }

    public final void b(View view, int i2, int i3, int i4, int i5, int i6, int[] iArr) {
        n(i5, i6, iArr);
    }

    public final int computeHorizontalScrollExtent() {
        return super.computeHorizontalScrollExtent();
    }

    public final int computeHorizontalScrollOffset() {
        return super.computeHorizontalScrollOffset();
    }

    public final int computeHorizontalScrollRange() {
        return super.computeHorizontalScrollRange();
    }

    public final int computeVerticalScrollExtent() {
        return super.computeVerticalScrollExtent();
    }

    public final int computeVerticalScrollRange() {
        int childCount = getChildCount();
        int height = (getHeight() - getPaddingBottom()) - getPaddingTop();
        if (childCount == 0) {
            return height;
        }
        View childAt = getChildAt(0);
        int bottom = childAt.getBottom() + ((FrameLayout.LayoutParams) childAt.getLayoutParams()).bottomMargin;
        int scrollY = getScrollY();
        int max = Math.max(0, bottom - height);
        if (scrollY < 0) {
            return bottom - scrollY;
        }
        if (scrollY > max) {
            return bottom + (scrollY - max);
        }
        return bottom;
    }

    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        if (super.dispatchKeyEvent(keyEvent) || i(keyEvent)) {
            return true;
        }
        return false;
    }

    public final void draw(Canvas canvas) {
        int i2;
        super.draw(canvas);
        int scrollY = getScrollY();
        EdgeEffect edgeEffect = this.f1484j;
        int i3 = 0;
        if (!edgeEffect.isFinished()) {
            int save = canvas.save();
            int width = getWidth();
            int height = getHeight();
            int min = Math.min(0, scrollY);
            if (i.a(this)) {
                width -= getPaddingRight() + getPaddingLeft();
                i2 = getPaddingLeft();
            } else {
                i2 = 0;
            }
            if (i.a(this)) {
                height -= getPaddingBottom() + getPaddingTop();
                min += getPaddingTop();
            }
            canvas.translate((float) i2, (float) min);
            edgeEffect.setSize(width, height);
            if (edgeEffect.draw(canvas)) {
                postInvalidateOnAnimation();
            }
            canvas.restoreToCount(save);
        }
        EdgeEffect edgeEffect2 = this.f1485k;
        if (!edgeEffect2.isFinished()) {
            int save2 = canvas.save();
            int width2 = getWidth();
            int height2 = getHeight();
            int max = Math.max(getScrollRange(), scrollY) + height2;
            if (i.a(this)) {
                width2 -= getPaddingRight() + getPaddingLeft();
                i3 = getPaddingLeft();
            }
            if (i.a(this)) {
                height2 -= getPaddingBottom() + getPaddingTop();
                max -= getPaddingBottom();
            }
            canvas.translate((float) (i3 - width2), (float) max);
            canvas.rotate(180.0f, (float) width2, 0.0f);
            edgeEffect2.setSize(width2, height2);
            if (edgeEffect2.draw(canvas)) {
                postInvalidateOnAnimation();
            }
            canvas.restoreToCount(save2);
        }
    }

    public final boolean g(int i2) {
        View findFocus = findFocus();
        if (findFocus == this) {
            findFocus = null;
        }
        View findNextFocus = FocusFinder.getInstance().findNextFocus(this, findFocus, i2);
        int maxScrollAmount = getMaxScrollAmount();
        if (findNextFocus == null || !m(findNextFocus, maxScrollAmount, getHeight())) {
            if (i2 == 33 && getScrollY() < maxScrollAmount) {
                maxScrollAmount = getScrollY();
            } else if (i2 == 130 && getChildCount() > 0) {
                View childAt = getChildAt(0);
                maxScrollAmount = Math.min((childAt.getBottom() + ((FrameLayout.LayoutParams) childAt.getLayoutParams()).bottomMargin) - ((getHeight() + getScrollY()) - getPaddingBottom()), maxScrollAmount);
            }
            if (maxScrollAmount == 0) {
                return false;
            }
            if (i2 != 130) {
                maxScrollAmount = -maxScrollAmount;
            }
            s(maxScrollAmount, 0, 1, true);
        } else {
            Rect rect = this.f1483h;
            findNextFocus.getDrawingRect(rect);
            offsetDescendantRectToMyCoords(findNextFocus, rect);
            s(h(rect), 0, 1, true);
            findNextFocus.requestFocus(i2);
        }
        if (findFocus != null && findFocus.isFocused() && !m(findFocus, 0, getHeight())) {
            int descendantFocusability = getDescendantFocusability();
            setDescendantFocusability(131072);
            requestFocus();
            setDescendantFocusability(descendantFocusability);
        }
        return true;
    }

    public float getBottomFadingEdgeStrength() {
        if (getChildCount() == 0) {
            return 0.0f;
        }
        View childAt = getChildAt(0);
        int verticalFadingEdgeLength = getVerticalFadingEdgeLength();
        int bottom = ((childAt.getBottom() + ((FrameLayout.LayoutParams) childAt.getLayoutParams()).bottomMargin) - getScrollY()) - (getHeight() - getPaddingBottom());
        if (bottom < verticalFadingEdgeLength) {
            return ((float) bottom) / ((float) verticalFadingEdgeLength);
        }
        return 1.0f;
    }

    public int getMaxScrollAmount() {
        return (int) (((float) getHeight()) * 0.5f);
    }

    public int getScrollRange() {
        if (getChildCount() <= 0) {
            return 0;
        }
        View childAt = getChildAt(0);
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
        return Math.max(0, ((childAt.getHeight() + layoutParams.topMargin) + layoutParams.bottomMargin) - ((getHeight() - getPaddingTop()) - getPaddingBottom()));
    }

    public float getTopFadingEdgeStrength() {
        if (getChildCount() == 0) {
            return 0.0f;
        }
        int verticalFadingEdgeLength = getVerticalFadingEdgeLength();
        int scrollY = getScrollY();
        if (scrollY < verticalFadingEdgeLength) {
            return ((float) scrollY) / ((float) verticalFadingEdgeLength);
        }
        return 1.0f;
    }

    public final int h(Rect rect) {
        int i2;
        int i3;
        int i4;
        if (getChildCount() == 0) {
            return 0;
        }
        int height = getHeight();
        int scrollY = getScrollY();
        int i5 = scrollY + height;
        int verticalFadingEdgeLength = getVerticalFadingEdgeLength();
        if (rect.top > 0) {
            scrollY += verticalFadingEdgeLength;
        }
        View childAt = getChildAt(0);
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
        if (rect.bottom < childAt.getHeight() + layoutParams.topMargin + layoutParams.bottomMargin) {
            i2 = i5 - verticalFadingEdgeLength;
        } else {
            i2 = i5;
        }
        int i6 = rect.bottom;
        if (i6 > i2 && rect.top > scrollY) {
            if (rect.height() > height) {
                i4 = rect.top - scrollY;
            } else {
                i4 = rect.bottom - i2;
            }
            return Math.min(i4, (childAt.getBottom() + layoutParams.bottomMargin) - i5);
        } else if (rect.top >= scrollY || i6 >= i2) {
            return 0;
        } else {
            if (rect.height() > height) {
                i3 = 0 - (i2 - rect.bottom);
            } else {
                i3 = 0 - (scrollY - rect.top);
            }
            return Math.max(i3, -getScrollY());
        }
    }

    public final void j(int i2) {
        if (getChildCount() > 0) {
            this.i.fling(getScrollX(), getScrollY(), 0, i2, 0, 0, Integer.MIN_VALUE, Integer.MAX_VALUE, 0, 0);
            this.f1477D.g(2, 1);
            this.f1474A = getScrollY();
            postInvalidateOnAnimation();
        }
    }

    public final void measureChild(View view, int i2, int i3) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        view.measure(ViewGroup.getChildMeasureSpec(i2, getPaddingRight() + getPaddingLeft(), layoutParams.width), View.MeasureSpec.makeMeasureSpec(0, 0));
    }

    public final void measureChildWithMargins(View view, int i2, int i3, int i4, int i5) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        view.measure(ViewGroup.getChildMeasureSpec(i2, getPaddingRight() + getPaddingLeft() + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin + i3, marginLayoutParams.width), View.MeasureSpec.makeMeasureSpec(marginLayoutParams.topMargin + marginLayoutParams.bottomMargin, 0));
    }

    public final void n(int i2, int i3, int[] iArr) {
        int scrollY = getScrollY();
        scrollBy(0, i2);
        int scrollY2 = getScrollY() - scrollY;
        if (iArr != null) {
            iArr[1] = iArr[1] + scrollY2;
        }
        this.f1477D.d(0, scrollY2, 0, i2 - scrollY2, (int[]) null, i3, iArr);
    }

    public final void o(MotionEvent motionEvent) {
        int i2;
        int actionIndex = motionEvent.getActionIndex();
        if (motionEvent.getPointerId(actionIndex) == this.f1497w) {
            if (actionIndex == 0) {
                i2 = 1;
            } else {
                i2 = 0;
            }
            this.f1486l = (int) motionEvent.getY(i2);
            this.f1497w = motionEvent.getPointerId(i2);
            VelocityTracker velocityTracker = this.f1491q;
            if (velocityTracker != null) {
                velocityTracker.clear();
            }
        }
    }

    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f1488n = false;
    }

    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        boolean z2 = true;
        if (action == 2 && this.f1490p) {
            return true;
        }
        int i2 = action & 255;
        if (i2 != 0) {
            if (i2 != 1) {
                if (i2 == 2) {
                    int i3 = this.f1497w;
                    if (i3 != -1) {
                        int findPointerIndex = motionEvent.findPointerIndex(i3);
                        if (findPointerIndex == -1) {
                            Log.e("NestedScrollView", "Invalid pointerId=" + i3 + " in onInterceptTouchEvent");
                        } else {
                            int y2 = (int) motionEvent.getY(findPointerIndex);
                            if (Math.abs(y2 - this.f1486l) > this.f1494t && (2 & getNestedScrollAxes()) == 0) {
                                this.f1490p = true;
                                this.f1486l = y2;
                                if (this.f1491q == null) {
                                    this.f1491q = VelocityTracker.obtain();
                                }
                                this.f1491q.addMovement(motionEvent);
                                this.f1500z = 0;
                                ViewParent parent = getParent();
                                if (parent != null) {
                                    parent.requestDisallowInterceptTouchEvent(true);
                                }
                            }
                        }
                    }
                } else if (i2 != 3) {
                    if (i2 == 6) {
                        o(motionEvent);
                    }
                }
            }
            this.f1490p = false;
            this.f1497w = -1;
            VelocityTracker velocityTracker = this.f1491q;
            if (velocityTracker != null) {
                velocityTracker.recycle();
                this.f1491q = null;
            }
            if (this.i.springBack(getScrollX(), getScrollY(), 0, 0, 0, getScrollRange())) {
                postInvalidateOnAnimation();
            }
            w(0);
        } else {
            int y3 = (int) motionEvent.getY();
            int x2 = (int) motionEvent.getX();
            if (getChildCount() > 0) {
                int scrollY = getScrollY();
                View childAt = getChildAt(0);
                if (y3 >= childAt.getTop() - scrollY && y3 < childAt.getBottom() - scrollY && x2 >= childAt.getLeft() && x2 < childAt.getRight()) {
                    this.f1486l = y3;
                    this.f1497w = motionEvent.getPointerId(0);
                    VelocityTracker velocityTracker2 = this.f1491q;
                    if (velocityTracker2 == null) {
                        this.f1491q = VelocityTracker.obtain();
                    } else {
                        velocityTracker2.clear();
                    }
                    this.f1491q.addMovement(motionEvent);
                    this.i.computeScrollOffset();
                    if (!v(motionEvent) && this.i.isFinished()) {
                        z2 = false;
                    }
                    this.f1490p = z2;
                    this.f1477D.g(2, 0);
                }
            }
            if (!v(motionEvent) && this.i.isFinished()) {
                z2 = false;
            }
            this.f1490p = z2;
            VelocityTracker velocityTracker3 = this.f1491q;
            if (velocityTracker3 != null) {
                velocityTracker3.recycle();
                this.f1491q = null;
            }
        }
        return this.f1490p;
    }

    public final void onLayout(boolean z2, int i2, int i3, int i4, int i5) {
        int i6;
        super.onLayout(z2, i2, i3, i4, i5);
        int i7 = 0;
        this.f1487m = false;
        View view = this.f1489o;
        if (view != null && l(view, this)) {
            View view2 = this.f1489o;
            Rect rect = this.f1483h;
            view2.getDrawingRect(rect);
            offsetDescendantRectToMyCoords(view2, rect);
            int h2 = h(rect);
            if (h2 != 0) {
                scrollBy(0, h2);
            }
        }
        this.f1489o = null;
        if (!this.f1488n) {
            if (this.f1475B != null) {
                scrollTo(getScrollX(), this.f1475B.f916a);
                this.f1475B = null;
            }
            if (getChildCount() > 0) {
                View childAt = getChildAt(0);
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
                i6 = childAt.getMeasuredHeight() + layoutParams.topMargin + layoutParams.bottomMargin;
            } else {
                i6 = 0;
            }
            int paddingTop = ((i5 - i3) - getPaddingTop()) - getPaddingBottom();
            int scrollY = getScrollY();
            if (paddingTop < i6 && scrollY >= 0) {
                i7 = paddingTop + scrollY > i6 ? i6 - paddingTop : scrollY;
            }
            if (i7 != scrollY) {
                scrollTo(getScrollX(), i7);
            }
        }
        scrollTo(getScrollX(), getScrollY());
        this.f1488n = true;
    }

    public final void onMeasure(int i2, int i3) {
        super.onMeasure(i2, i3);
        if (this.f1492r && View.MeasureSpec.getMode(i3) != 0 && getChildCount() > 0) {
            View childAt = getChildAt(0);
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
            int measuredHeight = childAt.getMeasuredHeight();
            int measuredHeight2 = (((getMeasuredHeight() - getPaddingTop()) - getPaddingBottom()) - layoutParams.topMargin) - layoutParams.bottomMargin;
            if (measuredHeight < measuredHeight2) {
                childAt.measure(ViewGroup.getChildMeasureSpec(i2, getPaddingRight() + getPaddingLeft() + layoutParams.leftMargin + layoutParams.rightMargin, layoutParams.width), View.MeasureSpec.makeMeasureSpec(measuredHeight2, 1073741824));
            }
        }
    }

    public final void onOverScrolled(int i2, int i3, boolean z2, boolean z3) {
        super.scrollTo(i2, i3);
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [android.view.View$BaseSavedState, T.l, android.os.Parcelable] */
    public final Parcelable onSaveInstanceState() {
        ? baseSavedState = new View.BaseSavedState(super.onSaveInstanceState());
        baseSavedState.f916a = getScrollY();
        return baseSavedState;
    }

    public final void onScrollChanged(int i2, int i3, int i4, int i5) {
        super.onScrollChanged(i2, i3, i4, i5);
        j jVar = this.f1479F;
        if (jVar != null) {
            E.j jVar2 = (E.j) jVar;
            C0117h.b(this, (View) jVar2.f108g, (View) jVar2.f109h);
        }
    }

    public final void onSizeChanged(int i2, int i3, int i4, int i5) {
        super.onSizeChanged(i2, i3, i4, i5);
        View findFocus = findFocus();
        if (findFocus != null && this != findFocus && m(findFocus, 0, i5)) {
            Rect rect = this.f1483h;
            findFocus.getDrawingRect(rect);
            offsetDescendantRectToMyCoords(findFocus, rect);
            int h2 = h(rect);
            if (h2 == 0) {
                return;
            }
            if (this.f1493s) {
                u(0, h2, false);
            } else {
                scrollBy(0, h2);
            }
        }
    }

    public final boolean p(int i2, int i3, int i4, int i5) {
        boolean z2;
        boolean z3;
        int overScrollMode = getOverScrollMode();
        super.computeHorizontalScrollRange();
        super.computeHorizontalScrollExtent();
        computeVerticalScrollRange();
        super.computeVerticalScrollExtent();
        int i6 = i4 + i2;
        if (i3 <= 0 && i3 >= 0) {
            z2 = false;
        } else {
            i3 = 0;
            z2 = true;
        }
        if (i6 > i5) {
            z3 = true;
        } else if (i6 < 0) {
            z3 = true;
            i5 = 0;
        } else {
            i5 = i6;
            z3 = false;
        }
        if (z3 && !this.f1477D.f(1)) {
            this.i.springBack(i3, i5, 0, 0, 0, getScrollRange());
        }
        super.scrollTo(i3, i5);
        if (z2 || z3) {
            return true;
        }
        return false;
    }

    public final boolean requestChildRectangleOnScreen(View view, Rect rect, boolean z2) {
        boolean z3;
        rect.offset(view.getLeft() - view.getScrollX(), view.getTop() - view.getScrollY());
        int h2 = h(rect);
        if (h2 != 0) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (z3) {
            if (z2) {
                scrollBy(0, h2);
            } else {
                u(0, h2, false);
            }
        }
        return z3;
    }

    public final void scrollTo(int i2, int i3) {
        if (getChildCount() > 0) {
            View childAt = getChildAt(0);
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
            int width = (getWidth() - getPaddingLeft()) - getPaddingRight();
            int width2 = childAt.getWidth() + layoutParams.leftMargin + layoutParams.rightMargin;
            int height = (getHeight() - getPaddingTop()) - getPaddingBottom();
            int height2 = childAt.getHeight() + layoutParams.topMargin + layoutParams.bottomMargin;
            if (width >= width2 || i2 < 0) {
                i2 = 0;
            } else if (width + i2 > width2) {
                i2 = width2 - width;
            }
            if (height >= height2 || i3 < 0) {
                i3 = 0;
            } else if (height + i3 > height2) {
                i3 = height2 - height;
            }
            if (i2 != getScrollX() || i3 != getScrollY()) {
                super.scrollTo(i2, i3);
            }
        }
    }

    public final void u(int i2, int i3, boolean z2) {
        if (getChildCount() != 0) {
            if (AnimationUtils.currentAnimationTimeMillis() - this.f1482g > 250) {
                View childAt = getChildAt(0);
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
                int scrollY = getScrollY();
                OverScroller overScroller = this.i;
                int scrollX = getScrollX();
                overScroller.startScroll(scrollX, scrollY, 0, Math.max(0, Math.min(i3 + scrollY, Math.max(0, ((childAt.getHeight() + layoutParams.topMargin) + layoutParams.bottomMargin) - ((getHeight() - getPaddingTop()) - getPaddingBottom())))) - scrollY, 250);
                if (z2) {
                    this.f1477D.g(2, 1);
                } else {
                    w(1);
                }
                this.f1474A = getScrollY();
                postInvalidateOnAnimation();
            } else {
                if (!this.i.isFinished()) {
                    this.i.abortAnimation();
                    w(1);
                }
                scrollBy(i2, i3);
            }
            this.f1482g = AnimationUtils.currentAnimationTimeMillis();
        }
    }

    public final void addView(View view, int i2) {
        if (getChildCount() <= 0) {
            super.addView(view, i2);
            return;
        }
        throw new IllegalStateException("ScrollView can host only one direct child");
    }

    public final void addView(View view, ViewGroup.LayoutParams layoutParams) {
        if (getChildCount() <= 0) {
            super.addView(view, layoutParams);
            return;
        }
        throw new IllegalStateException("ScrollView can host only one direct child");
    }

    public final void addView(View view, int i2, ViewGroup.LayoutParams layoutParams) {
        if (getChildCount() <= 0) {
            super.addView(view, i2, layoutParams);
            return;
        }
        throw new IllegalStateException("ScrollView can host only one direct child");
    }
}
