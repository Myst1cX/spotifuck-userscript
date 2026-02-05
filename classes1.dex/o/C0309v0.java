package o;

import N0.B;
import T.g;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListAdapter;
import android.widget.ListView;
import java.lang.reflect.InvocationTargetException;

/* renamed from: o.v0  reason: case insensitive filesystem */
public class C0309v0 extends ListView {

    /* renamed from: f  reason: collision with root package name */
    public final Rect f4308f = new Rect();

    /* renamed from: g  reason: collision with root package name */
    public int f4309g = 0;

    /* renamed from: h  reason: collision with root package name */
    public int f4310h = 0;
    public int i = 0;

    /* renamed from: j  reason: collision with root package name */
    public int f4311j = 0;

    /* renamed from: k  reason: collision with root package name */
    public int f4312k;

    /* renamed from: l  reason: collision with root package name */
    public C0305t0 f4313l;

    /* renamed from: m  reason: collision with root package name */
    public boolean f4314m;

    /* renamed from: n  reason: collision with root package name */
    public final boolean f4315n;

    /* renamed from: o  reason: collision with root package name */
    public boolean f4316o;

    /* renamed from: p  reason: collision with root package name */
    public g f4317p;

    /* renamed from: q  reason: collision with root package name */
    public B f4318q;

    public C0309v0(Context context, boolean z2) {
        super(context, (AttributeSet) null, 2130969001);
        this.f4315n = z2;
        setCacheColorHint(0);
    }

    public final void onDetachedFromWindow() {
        this.f4318q = null;
        super.onDetachedFromWindow();
    }

    public boolean onHoverEvent(MotionEvent motionEvent) {
        int i2 = Build.VERSION.SDK_INT;
        if (i2 < 26) {
            return super.onHoverEvent(motionEvent);
        }
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 10 && this.f4318q == null) {
            B b2 = new B(16, this);
            this.f4318q = b2;
            post(b2);
        }
        boolean onHoverEvent = super.onHoverEvent(motionEvent);
        if (actionMasked == 9 || actionMasked == 7) {
            int pointToPosition = pointToPosition((int) motionEvent.getX(), (int) motionEvent.getY());
            if (!(pointToPosition == -1 || pointToPosition == getSelectedItemPosition())) {
                View childAt = getChildAt(pointToPosition - getFirstVisiblePosition());
                if (childAt.isEnabled()) {
                    requestFocus();
                    if (i2 < 30 || !C0301r0.f4293d) {
                        setSelectionFromTop(pointToPosition, childAt.getTop() - getTop());
                    } else {
                        try {
                            C0301r0.f4290a.invoke(this, new Object[]{Integer.valueOf(pointToPosition), childAt, Boolean.FALSE, -1, -1});
                            C0301r0.f4291b.invoke(this, new Object[]{Integer.valueOf(pointToPosition)});
                            C0301r0.f4292c.invoke(this, new Object[]{Integer.valueOf(pointToPosition)});
                        } catch (IllegalAccessException e) {
                            e.printStackTrace();
                        } catch (InvocationTargetException e2) {
                            e2.printStackTrace();
                        }
                    }
                }
                Drawable selector = getSelector();
                if (selector != null && this.f4316o && isPressed()) {
                    selector.setState(getDrawableState());
                }
            }
        } else {
            setSelection(-1);
        }
        return onHoverEvent;
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0022  */
    /* JADX WARNING: Removed duplicated region for block: B:83:0x0160  */
    /* JADX WARNING: Removed duplicated region for block: B:85:0x0165  */
    /* JADX WARNING: Removed duplicated region for block: B:89:0x017a  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean b(android.view.MotionEvent r17, int r18) {
        /*
            r16 = this;
            r1 = r16
            r2 = r17
            int r3 = r17.getActionMasked()
            r4 = 1
            r5 = 0
            if (r3 == r4) goto L_0x001a
            r0 = 2
            if (r3 == r0) goto L_0x0018
            r0 = 3
            if (r3 == r0) goto L_0x0015
            r0 = 1
            goto L_0x0146
        L_0x0015:
            r0 = 0
            goto L_0x0146
        L_0x0018:
            r0 = 1
            goto L_0x001b
        L_0x001a:
            r0 = 0
        L_0x001b:
            int r6 = r17.findPointerIndex(r18)
            if (r6 >= 0) goto L_0x0022
            goto L_0x0015
        L_0x0022:
            float r7 = r2.getX(r6)
            int r7 = (int) r7
            float r6 = r2.getY(r6)
            int r6 = (int) r6
            int r8 = r1.pointToPosition(r7, r6)
            r9 = -1
            if (r8 != r9) goto L_0x0036
            r5 = 1
            goto L_0x0146
        L_0x0036:
            int r0 = r16.getFirstVisiblePosition()
            int r0 = r8 - r0
            android.view.View r10 = r1.getChildAt(r0)
            float r7 = (float) r7
            float r6 = (float) r6
            r1.f4316o = r4
            int r0 = android.os.Build.VERSION.SDK_INT
            o.C0299q0.a(r1, r7, r6)
            boolean r11 = r16.isPressed()
            if (r11 != 0) goto L_0x0052
            r1.setPressed(r4)
        L_0x0052:
            r16.layoutChildren()
            int r11 = r1.f4312k
            if (r11 == r9) goto L_0x006f
            int r12 = r16.getFirstVisiblePosition()
            int r11 = r11 - r12
            android.view.View r11 = r1.getChildAt(r11)
            if (r11 == 0) goto L_0x006f
            if (r11 == r10) goto L_0x006f
            boolean r12 = r11.isPressed()
            if (r12 == 0) goto L_0x006f
            r11.setPressed(r5)
        L_0x006f:
            r1.f4312k = r8
            int r11 = r10.getLeft()
            float r11 = (float) r11
            float r11 = r7 - r11
            int r12 = r10.getTop()
            float r12 = (float) r12
            float r12 = r6 - r12
            o.C0299q0.a(r10, r11, r12)
            boolean r11 = r10.isPressed()
            if (r11 != 0) goto L_0x008b
            r10.setPressed(r4)
        L_0x008b:
            android.graphics.drawable.Drawable r11 = r16.getSelector()
            if (r11 == 0) goto L_0x0095
            if (r8 == r9) goto L_0x0095
            r12 = 1
            goto L_0x0096
        L_0x0095:
            r12 = 0
        L_0x0096:
            if (r12 == 0) goto L_0x009b
            r11.setVisible(r5, r5)
        L_0x009b:
            int r13 = r10.getLeft()
            int r14 = r10.getTop()
            int r15 = r10.getRight()
            int r5 = r10.getBottom()
            android.graphics.Rect r9 = r1.f4308f
            r9.set(r13, r14, r15, r5)
            int r5 = r9.left
            int r13 = r1.f4309g
            int r5 = r5 - r13
            r9.left = r5
            int r5 = r9.top
            int r13 = r1.f4310h
            int r5 = r5 - r13
            r9.top = r5
            int r5 = r9.right
            int r13 = r1.i
            int r5 = r5 + r13
            r9.right = r5
            int r5 = r9.bottom
            int r13 = r1.f4311j
            int r5 = r5 + r13
            r9.bottom = r5
            r5 = 33
            if (r0 < r5) goto L_0x00d5
            boolean r0 = o.C0303s0.a(r16)
            goto L_0x00e4
        L_0x00d5:
            java.lang.reflect.Field r0 = o.C0307u0.f4305a
            if (r0 == 0) goto L_0x00e3
            boolean r0 = r0.getBoolean(r1)     // Catch:{ IllegalAccessException -> 0x00de }
            goto L_0x00e4
        L_0x00de:
            r0 = move-exception
            r13 = r0
            r13.printStackTrace()
        L_0x00e3:
            r0 = 0
        L_0x00e4:
            boolean r13 = r10.isEnabled()
            if (r13 == r0) goto L_0x010a
            r0 = r0 ^ r4
            int r13 = android.os.Build.VERSION.SDK_INT
            if (r13 < r5) goto L_0x00f4
            o.C0303s0.b(r1, r0)
        L_0x00f2:
            r5 = -1
            goto L_0x0105
        L_0x00f4:
            java.lang.reflect.Field r5 = o.C0307u0.f4305a
            if (r5 == 0) goto L_0x00f2
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)     // Catch:{ IllegalAccessException -> 0x0100 }
            r5.set(r1, r0)     // Catch:{ IllegalAccessException -> 0x0100 }
            goto L_0x00f2
        L_0x0100:
            r0 = move-exception
            r0.printStackTrace()
            goto L_0x00f2
        L_0x0105:
            if (r8 == r5) goto L_0x010a
            r16.refreshDrawableState()
        L_0x010a:
            if (r12 == 0) goto L_0x0125
            float r0 = r9.exactCenterX()
            float r5 = r9.exactCenterY()
            int r9 = r16.getVisibility()
            if (r9 != 0) goto L_0x011d
            r9 = 1
        L_0x011b:
            r12 = 0
            goto L_0x011f
        L_0x011d:
            r9 = 0
            goto L_0x011b
        L_0x011f:
            r11.setVisible(r9, r12)
            G.a.e(r11, r0, r5)
        L_0x0125:
            android.graphics.drawable.Drawable r0 = r16.getSelector()
            if (r0 == 0) goto L_0x0131
            r5 = -1
            if (r8 == r5) goto L_0x0131
            G.a.e(r0, r7, r6)
        L_0x0131:
            o.t0 r0 = r1.f4313l
            if (r0 == 0) goto L_0x0138
            r5 = 0
            r0.f4299g = r5
        L_0x0138:
            r16.refreshDrawableState()
            if (r3 != r4) goto L_0x0144
            long r5 = r1.getItemIdAtPosition(r8)
            r1.performItemClick(r10, r8, r5)
        L_0x0144:
            r0 = 1
            r5 = 0
        L_0x0146:
            if (r0 == 0) goto L_0x014a
            if (r5 == 0) goto L_0x0163
        L_0x014a:
            r3 = 0
            r1.f4316o = r3
            r1.setPressed(r3)
            r16.drawableStateChanged()
            int r5 = r1.f4312k
            int r6 = r16.getFirstVisiblePosition()
            int r5 = r5 - r6
            android.view.View r5 = r1.getChildAt(r5)
            if (r5 == 0) goto L_0x0163
            r5.setPressed(r3)
        L_0x0163:
            if (r0 == 0) goto L_0x017a
            T.g r3 = r1.f4317p
            if (r3 != 0) goto L_0x0170
            T.g r3 = new T.g
            r3.<init>(r1)
            r1.f4317p = r3
        L_0x0170:
            T.g r3 = r1.f4317p
            boolean r5 = r3.f912u
            r3.f912u = r4
            r3.onTouch(r1, r2)
            goto L_0x0188
        L_0x017a:
            T.g r2 = r1.f4317p
            if (r2 == 0) goto L_0x0188
            boolean r3 = r2.f912u
            if (r3 == 0) goto L_0x0185
            r2.d()
        L_0x0185:
            r3 = 0
            r2.f912u = r3
        L_0x0188:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: o.C0309v0.b(android.view.MotionEvent, int):boolean");
    }

    public final void dispatchDraw(Canvas canvas) {
        Drawable selector;
        Rect rect = this.f4308f;
        if (!rect.isEmpty() && (selector = getSelector()) != null) {
            selector.setBounds(rect);
            selector.draw(canvas);
        }
        super.dispatchDraw(canvas);
    }

    public final void drawableStateChanged() {
        if (this.f4318q == null) {
            super.drawableStateChanged();
            C0305t0 t0Var = this.f4313l;
            if (t0Var != null) {
                t0Var.f4299g = true;
            }
            Drawable selector = getSelector();
            if (selector != null && this.f4316o && isPressed()) {
                selector.setState(getDrawableState());
            }
        }
    }

    public final boolean hasFocus() {
        if (this.f4315n || super.hasFocus()) {
            return true;
        }
        return false;
    }

    public final boolean hasWindowFocus() {
        if (this.f4315n || super.hasWindowFocus()) {
            return true;
        }
        return false;
    }

    public final boolean isFocused() {
        if (this.f4315n || super.isFocused()) {
            return true;
        }
        return false;
    }

    public final boolean isInTouchMode() {
        if ((!this.f4315n || !this.f4314m) && !super.isInTouchMode()) {
            return false;
        }
        return true;
    }

    public void setListSelectionHidden(boolean z2) {
        this.f4314m = z2;
    }

    public void setSelector(Drawable drawable) {
        C0305t0 t0Var;
        if (drawable != null) {
            t0Var = new C0305t0(drawable);
            t0Var.f4299g = true;
        } else {
            t0Var = null;
        }
        this.f4313l = t0Var;
        super.setSelector(t0Var);
        Rect rect = new Rect();
        if (drawable != null) {
            drawable.getPadding(rect);
        }
        this.f4309g = rect.left;
        this.f4310h = rect.top;
        this.i = rect.right;
        this.f4311j = rect.bottom;
    }

    public final int a(int i2, int i3) {
        int i4;
        int listPaddingTop = getListPaddingTop();
        int listPaddingBottom = getListPaddingBottom();
        int dividerHeight = getDividerHeight();
        Drawable divider = getDivider();
        ListAdapter adapter = getAdapter();
        if (adapter == null) {
            return listPaddingTop + listPaddingBottom;
        }
        int i5 = listPaddingTop + listPaddingBottom;
        if (dividerHeight <= 0 || divider == null) {
            dividerHeight = 0;
        }
        int count = adapter.getCount();
        View view = null;
        int i6 = 0;
        for (int i7 = 0; i7 < count; i7++) {
            int itemViewType = adapter.getItemViewType(i7);
            if (itemViewType != i6) {
                view = null;
                i6 = itemViewType;
            }
            view = adapter.getView(i7, view, this);
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            if (layoutParams == null) {
                layoutParams = generateDefaultLayoutParams();
                view.setLayoutParams(layoutParams);
            }
            int i8 = layoutParams.height;
            if (i8 > 0) {
                i4 = View.MeasureSpec.makeMeasureSpec(i8, 1073741824);
            } else {
                i4 = View.MeasureSpec.makeMeasureSpec(0, 0);
            }
            view.measure(i2, i4);
            view.forceLayout();
            if (i7 > 0) {
                i5 += dividerHeight;
            }
            i5 += view.getMeasuredHeight();
            if (i5 >= i3) {
                return i3;
            }
        }
        return i5;
    }

    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            this.f4312k = pointToPosition((int) motionEvent.getX(), (int) motionEvent.getY());
        }
        B b2 = this.f4318q;
        if (b2 != null) {
            C0309v0 v0Var = (C0309v0) b2.f608b;
            v0Var.f4318q = null;
            v0Var.removeCallbacks(b2);
        }
        return super.onTouchEvent(motionEvent);
    }
}
