package androidx.appcompat.widget;

import G.a;
import N.A;
import N.Q;
import T0.g;
import X.h;
import android.animation.ObjectAnimator;
import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.Region;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.InputFilter;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.method.TransformationMethod;
import android.view.ActionMode;
import android.view.VelocityTracker;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.CompoundButton;
import androidx.emoji2.text.j;
import java.util.WeakHashMap;
import l.C0171a;
import n0.C0221b;
import o.C0297p0;
import o.C0308v;
import o.n1;
import p0.C0320a;

public class SwitchCompat extends CompoundButton {

    /* renamed from: W  reason: collision with root package name */
    public static final C0221b f1332W = new C0221b(Float.class, "thumbPos", 7);

    /* renamed from: a0  reason: collision with root package name */
    public static final int[] f1333a0 = {16842912};

    /* renamed from: A  reason: collision with root package name */
    public float f1334A;

    /* renamed from: B  reason: collision with root package name */
    public float f1335B;

    /* renamed from: C  reason: collision with root package name */
    public final VelocityTracker f1336C = VelocityTracker.obtain();

    /* renamed from: D  reason: collision with root package name */
    public final int f1337D;

    /* renamed from: E  reason: collision with root package name */
    public float f1338E;

    /* renamed from: F  reason: collision with root package name */
    public int f1339F;

    /* renamed from: G  reason: collision with root package name */
    public int f1340G;

    /* renamed from: H  reason: collision with root package name */
    public int f1341H;
    public int I;

    /* renamed from: J  reason: collision with root package name */
    public int f1342J;

    /* renamed from: K  reason: collision with root package name */
    public int f1343K;

    /* renamed from: L  reason: collision with root package name */
    public int f1344L;

    /* renamed from: M  reason: collision with root package name */
    public boolean f1345M;

    /* renamed from: N  reason: collision with root package name */
    public final TextPaint f1346N;

    /* renamed from: O  reason: collision with root package name */
    public final ColorStateList f1347O;

    /* renamed from: P  reason: collision with root package name */
    public StaticLayout f1348P;

    /* renamed from: Q  reason: collision with root package name */
    public StaticLayout f1349Q;

    /* renamed from: R  reason: collision with root package name */
    public final C0171a f1350R;

    /* renamed from: S  reason: collision with root package name */
    public ObjectAnimator f1351S;

    /* renamed from: T  reason: collision with root package name */
    public C0308v f1352T;

    /* renamed from: U  reason: collision with root package name */
    public h f1353U;

    /* renamed from: V  reason: collision with root package name */
    public final Rect f1354V;

    /* renamed from: f  reason: collision with root package name */
    public Drawable f1355f;

    /* renamed from: g  reason: collision with root package name */
    public ColorStateList f1356g = null;

    /* renamed from: h  reason: collision with root package name */
    public PorterDuff.Mode f1357h = null;
    public boolean i = false;

    /* renamed from: j  reason: collision with root package name */
    public boolean f1358j = false;

    /* renamed from: k  reason: collision with root package name */
    public Drawable f1359k;

    /* renamed from: l  reason: collision with root package name */
    public ColorStateList f1360l = null;

    /* renamed from: m  reason: collision with root package name */
    public PorterDuff.Mode f1361m = null;

    /* renamed from: n  reason: collision with root package name */
    public boolean f1362n = false;

    /* renamed from: o  reason: collision with root package name */
    public boolean f1363o = false;

    /* renamed from: p  reason: collision with root package name */
    public int f1364p;

    /* renamed from: q  reason: collision with root package name */
    public int f1365q;

    /* renamed from: r  reason: collision with root package name */
    public int f1366r;

    /* renamed from: s  reason: collision with root package name */
    public boolean f1367s;

    /* renamed from: t  reason: collision with root package name */
    public CharSequence f1368t;

    /* renamed from: u  reason: collision with root package name */
    public CharSequence f1369u;

    /* renamed from: v  reason: collision with root package name */
    public CharSequence f1370v;

    /* renamed from: w  reason: collision with root package name */
    public CharSequence f1371w;

    /* renamed from: x  reason: collision with root package name */
    public boolean f1372x;

    /* renamed from: y  reason: collision with root package name */
    public int f1373y;

    /* renamed from: z  reason: collision with root package name */
    public final int f1374z;

    public void setChecked(boolean z2) {
        super.setChecked(z2);
        boolean isChecked = isChecked();
        Class<CharSequence> cls = CharSequence.class;
        if (isChecked) {
            if (Build.VERSION.SDK_INT >= 30) {
                Object obj = this.f1368t;
                if (obj == null) {
                    obj = getResources().getString(2131755020);
                }
                Object obj2 = obj;
                WeakHashMap weakHashMap = Q.f509a;
                new A(2131296733, cls, 64, 30, 2).d(this, obj2);
            }
        } else if (Build.VERSION.SDK_INT >= 30) {
            Object obj3 = this.f1370v;
            if (obj3 == null) {
                obj3 = getResources().getString(2131755019);
            }
            Object obj4 = obj3;
            WeakHashMap weakHashMap2 = Q.f509a;
            new A(2131296733, cls, 64, 30, 2).d(this, obj4);
        }
        float f2 = 0.0f;
        if (getWindowToken() == null || !isLaidOut()) {
            ObjectAnimator objectAnimator = this.f1351S;
            if (objectAnimator != null) {
                objectAnimator.cancel();
            }
            if (isChecked) {
                f2 = 1.0f;
            }
            setThumbPosition(f2);
            return;
        }
        if (isChecked) {
            f2 = 1.0f;
        }
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this, f1332W, new float[]{f2});
        this.f1351S = ofFloat;
        ofFloat.setDuration(250);
        this.f1351S.setAutoCancel(true);
        this.f1351S.start();
    }

    private C0308v getEmojiTextViewHelper() {
        if (this.f1352T == null) {
            this.f1352T = new C0308v(this);
        }
        return this.f1352T;
    }

    private boolean getTargetCheckedState() {
        if (this.f1338E > 0.5f) {
            return true;
        }
        return false;
    }

    private int getThumbOffset() {
        float f2;
        boolean z2 = n1.f4272a;
        if (getLayoutDirection() == 1) {
            f2 = 1.0f - this.f1338E;
        } else {
            f2 = this.f1338E;
        }
        return (int) ((f2 * ((float) getThumbScrollRange())) + 0.5f);
    }

    private int getThumbScrollRange() {
        Rect rect;
        Drawable drawable = this.f1359k;
        if (drawable == null) {
            return 0;
        }
        Rect rect2 = this.f1354V;
        drawable.getPadding(rect2);
        Drawable drawable2 = this.f1355f;
        if (drawable2 != null) {
            rect = C0297p0.b(drawable2);
        } else {
            rect = C0297p0.f4283c;
        }
        return ((((this.f1339F - this.f1341H) - rect2.left) - rect2.right) - rect.left) - rect.right;
    }

    private void setTextOffInternal(CharSequence charSequence) {
        this.f1370v = charSequence;
        C0308v emojiTextViewHelper = getEmojiTextViewHelper();
        TransformationMethod T2 = ((g) emojiTextViewHelper.f4307b.f2g).T(this.f1350R);
        if (T2 != null) {
            charSequence = T2.getTransformation(charSequence, this);
        }
        this.f1371w = charSequence;
        this.f1349Q = null;
        if (this.f1372x) {
            d();
        }
    }

    private void setTextOnInternal(CharSequence charSequence) {
        this.f1368t = charSequence;
        C0308v emojiTextViewHelper = getEmojiTextViewHelper();
        TransformationMethod T2 = ((g) emojiTextViewHelper.f4307b.f2g).T(this.f1350R);
        if (T2 != null) {
            charSequence = T2.getTransformation(charSequence, this);
        }
        this.f1369u = charSequence;
        this.f1348P = null;
        if (this.f1372x) {
            d();
        }
    }

    public final void a() {
        Drawable drawable = this.f1355f;
        if (drawable == null) {
            return;
        }
        if (this.i || this.f1358j) {
            Drawable mutate = C0320a.J0(drawable).mutate();
            this.f1355f = mutate;
            if (this.i) {
                a.h(mutate, this.f1356g);
            }
            if (this.f1358j) {
                a.i(this.f1355f, this.f1357h);
            }
            if (this.f1355f.isStateful()) {
                this.f1355f.setState(getDrawableState());
            }
        }
    }

    public final void b() {
        Drawable drawable = this.f1359k;
        if (drawable == null) {
            return;
        }
        if (this.f1362n || this.f1363o) {
            Drawable mutate = C0320a.J0(drawable).mutate();
            this.f1359k = mutate;
            if (this.f1362n) {
                a.h(mutate, this.f1360l);
            }
            if (this.f1363o) {
                a.i(this.f1359k, this.f1361m);
            }
            if (this.f1359k.isStateful()) {
                this.f1359k.setState(getDrawableState());
            }
        }
    }

    public final void c() {
        setTextOnInternal(this.f1368t);
        setTextOffInternal(this.f1370v);
        requestLayout();
    }

    public final void d() {
        if (this.f1353U == null && ((g) this.f1352T.f4307b.f2g).v() && j.f1514k != null) {
            j a2 = j.a();
            int b2 = a2.b();
            if (b2 == 3 || b2 == 0) {
                h hVar = new h(this);
                this.f1353U = hVar;
                a2.f(hVar);
            }
        }
    }

    public final void draw(Canvas canvas) {
        Rect rect;
        int i2;
        int i3;
        int i4 = this.I;
        int i5 = this.f1342J;
        int i6 = this.f1343K;
        int i7 = this.f1344L;
        int thumbOffset = getThumbOffset() + i4;
        Drawable drawable = this.f1355f;
        if (drawable != null) {
            rect = C0297p0.b(drawable);
        } else {
            rect = C0297p0.f4283c;
        }
        Drawable drawable2 = this.f1359k;
        Rect rect2 = this.f1354V;
        if (drawable2 != null) {
            drawable2.getPadding(rect2);
            int i8 = rect2.left;
            thumbOffset += i8;
            if (rect != null) {
                int i9 = rect.left;
                if (i9 > i8) {
                    i4 += i9 - i8;
                }
                int i10 = rect.top;
                int i11 = rect2.top;
                if (i10 > i11) {
                    i2 = (i10 - i11) + i5;
                } else {
                    i2 = i5;
                }
                int i12 = rect.right;
                int i13 = rect2.right;
                if (i12 > i13) {
                    i6 -= i12 - i13;
                }
                int i14 = rect.bottom;
                int i15 = rect2.bottom;
                if (i14 > i15) {
                    i3 = i7 - (i14 - i15);
                    this.f1359k.setBounds(i4, i2, i6, i3);
                }
            } else {
                i2 = i5;
            }
            i3 = i7;
            this.f1359k.setBounds(i4, i2, i6, i3);
        }
        Drawable drawable3 = this.f1355f;
        if (drawable3 != null) {
            drawable3.getPadding(rect2);
            int i16 = thumbOffset - rect2.left;
            int i17 = thumbOffset + this.f1341H + rect2.right;
            this.f1355f.setBounds(i16, i5, i17, i7);
            Drawable background = getBackground();
            if (background != null) {
                a.f(background, i16, i5, i17, i7);
            }
        }
        super.draw(canvas);
    }

    public int getCompoundPaddingLeft() {
        boolean z2 = n1.f4272a;
        if (getLayoutDirection() != 1) {
            return super.getCompoundPaddingLeft();
        }
        int compoundPaddingLeft = super.getCompoundPaddingLeft() + this.f1339F;
        if (!TextUtils.isEmpty(getText())) {
            return compoundPaddingLeft + this.f1366r;
        }
        return compoundPaddingLeft;
    }

    public int getCompoundPaddingRight() {
        boolean z2 = n1.f4272a;
        if (getLayoutDirection() == 1) {
            return super.getCompoundPaddingRight();
        }
        int compoundPaddingRight = super.getCompoundPaddingRight() + this.f1339F;
        if (!TextUtils.isEmpty(getText())) {
            return compoundPaddingRight + this.f1366r;
        }
        return compoundPaddingRight;
    }

    public boolean getShowText() {
        return this.f1372x;
    }

    public boolean getSplitTrack() {
        return this.f1367s;
    }

    public int getSwitchMinWidth() {
        return this.f1365q;
    }

    public int getSwitchPadding() {
        return this.f1366r;
    }

    public CharSequence getTextOff() {
        return this.f1370v;
    }

    public CharSequence getTextOn() {
        return this.f1368t;
    }

    public Drawable getThumbDrawable() {
        return this.f1355f;
    }

    public final float getThumbPosition() {
        return this.f1338E;
    }

    public int getThumbTextPadding() {
        return this.f1364p;
    }

    public ColorStateList getThumbTintList() {
        return this.f1356g;
    }

    public PorterDuff.Mode getThumbTintMode() {
        return this.f1357h;
    }

    public Drawable getTrackDrawable() {
        return this.f1359k;
    }

    public ColorStateList getTrackTintList() {
        return this.f1360l;
    }

    public PorterDuff.Mode getTrackTintMode() {
        return this.f1361m;
    }

    public final int[] onCreateDrawableState(int i2) {
        int[] onCreateDrawableState = super.onCreateDrawableState(i2 + 1);
        if (isChecked()) {
            View.mergeDrawableStates(onCreateDrawableState, f1333a0);
        }
        return onCreateDrawableState;
    }

    public final void onMeasure(int i2, int i3) {
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10 = 0;
        if (this.f1372x) {
            StaticLayout staticLayout = this.f1348P;
            TextPaint textPaint = this.f1346N;
            if (staticLayout == null) {
                CharSequence charSequence = this.f1369u;
                if (charSequence != null) {
                    i9 = (int) Math.ceil((double) Layout.getDesiredWidth(charSequence, textPaint));
                } else {
                    i9 = 0;
                }
                this.f1348P = new StaticLayout(charSequence, textPaint, i9, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, true);
            }
            if (this.f1349Q == null) {
                CharSequence charSequence2 = this.f1371w;
                if (charSequence2 != null) {
                    i8 = (int) Math.ceil((double) Layout.getDesiredWidth(charSequence2, textPaint));
                } else {
                    i8 = 0;
                }
                this.f1349Q = new StaticLayout(charSequence2, textPaint, i8, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, true);
            }
        }
        Drawable drawable = this.f1355f;
        Rect rect = this.f1354V;
        if (drawable != null) {
            drawable.getPadding(rect);
            i5 = (this.f1355f.getIntrinsicWidth() - rect.left) - rect.right;
            i4 = this.f1355f.getIntrinsicHeight();
        } else {
            i5 = 0;
            i4 = 0;
        }
        if (this.f1372x) {
            i6 = (this.f1364p * 2) + Math.max(this.f1348P.getWidth(), this.f1349Q.getWidth());
        } else {
            i6 = 0;
        }
        this.f1341H = Math.max(i6, i5);
        Drawable drawable2 = this.f1359k;
        if (drawable2 != null) {
            drawable2.getPadding(rect);
            i10 = this.f1359k.getIntrinsicHeight();
        } else {
            rect.setEmpty();
        }
        int i11 = rect.left;
        int i12 = rect.right;
        Drawable drawable3 = this.f1355f;
        if (drawable3 != null) {
            Rect b2 = C0297p0.b(drawable3);
            i11 = Math.max(i11, b2.left);
            i12 = Math.max(i12, b2.right);
        }
        if (this.f1345M) {
            i7 = Math.max(this.f1365q, (this.f1341H * 2) + i11 + i12);
        } else {
            i7 = this.f1365q;
        }
        int max = Math.max(i10, i4);
        this.f1339F = i7;
        this.f1340G = max;
        super.onMeasure(i2, i3);
        if (getMeasuredHeight() < max) {
            setMeasuredDimension(getMeasuredWidthAndState(), max);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0015, code lost:
        if (r1 != 3) goto L_0x0147;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean onTouchEvent(android.view.MotionEvent r10) {
        /*
            r9 = this;
            android.view.VelocityTracker r0 = r9.f1336C
            r0.addMovement(r10)
            int r1 = r10.getActionMasked()
            int r2 = r9.f1374z
            r3 = 1
            if (r1 == 0) goto L_0x00fb
            r4 = 3
            r5 = 0
            r6 = 2
            if (r1 == r3) goto L_0x0091
            if (r1 == r6) goto L_0x0019
            if (r1 == r4) goto L_0x0091
            goto L_0x0147
        L_0x0019:
            int r0 = r9.f1373y
            if (r0 == r3) goto L_0x0062
            if (r0 == r6) goto L_0x0021
            goto L_0x0147
        L_0x0021:
            float r10 = r10.getX()
            int r0 = r9.getThumbScrollRange()
            float r1 = r9.f1334A
            float r1 = r10 - r1
            r2 = 1065353216(0x3f800000, float:1.0)
            if (r0 == 0) goto L_0x0034
            float r0 = (float) r0
            float r1 = r1 / r0
            goto L_0x003f
        L_0x0034:
            int r0 = (r1 > r5 ? 1 : (r1 == r5 ? 0 : -1))
            if (r0 <= 0) goto L_0x003b
            r1 = 1065353216(0x3f800000, float:1.0)
            goto L_0x003f
        L_0x003b:
            r0 = -1082130432(0xffffffffbf800000, float:-1.0)
            r1 = -1082130432(0xffffffffbf800000, float:-1.0)
        L_0x003f:
            boolean r0 = o.n1.f4272a
            int r0 = r9.getLayoutDirection()
            if (r0 != r3) goto L_0x0048
            float r1 = -r1
        L_0x0048:
            float r0 = r9.f1338E
            float r1 = r1 + r0
            int r4 = (r1 > r5 ? 1 : (r1 == r5 ? 0 : -1))
            if (r4 >= 0) goto L_0x0050
            goto L_0x0058
        L_0x0050:
            int r4 = (r1 > r2 ? 1 : (r1 == r2 ? 0 : -1))
            if (r4 <= 0) goto L_0x0057
            r5 = 1065353216(0x3f800000, float:1.0)
            goto L_0x0058
        L_0x0057:
            r5 = r1
        L_0x0058:
            int r0 = (r5 > r0 ? 1 : (r5 == r0 ? 0 : -1))
            if (r0 == 0) goto L_0x0061
            r9.f1334A = r10
            r9.setThumbPosition(r5)
        L_0x0061:
            return r3
        L_0x0062:
            float r0 = r10.getX()
            float r1 = r10.getY()
            float r4 = r9.f1334A
            float r4 = r0 - r4
            float r4 = java.lang.Math.abs(r4)
            float r2 = (float) r2
            int r4 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r4 > 0) goto L_0x0083
            float r4 = r9.f1335B
            float r4 = r1 - r4
            float r4 = java.lang.Math.abs(r4)
            int r2 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r2 <= 0) goto L_0x0147
        L_0x0083:
            r9.f1373y = r6
            android.view.ViewParent r10 = r9.getParent()
            r10.requestDisallowInterceptTouchEvent(r3)
            r9.f1334A = r0
            r9.f1335B = r1
            return r3
        L_0x0091:
            int r1 = r9.f1373y
            r2 = 0
            if (r1 != r6) goto L_0x00f5
            r9.f1373y = r2
            int r1 = r10.getAction()
            if (r1 != r3) goto L_0x00a6
            boolean r1 = r9.isEnabled()
            if (r1 == 0) goto L_0x00a6
            r1 = 1
            goto L_0x00a7
        L_0x00a6:
            r1 = 0
        L_0x00a7:
            boolean r6 = r9.isChecked()
            if (r1 == 0) goto L_0x00db
            r1 = 1000(0x3e8, float:1.401E-42)
            r0.computeCurrentVelocity(r1)
            float r0 = r0.getXVelocity()
            float r1 = java.lang.Math.abs(r0)
            int r7 = r9.f1337D
            float r7 = (float) r7
            int r1 = (r1 > r7 ? 1 : (r1 == r7 ? 0 : -1))
            if (r1 <= 0) goto L_0x00d6
            boolean r1 = o.n1.f4272a
            int r1 = r9.getLayoutDirection()
            if (r1 != r3) goto L_0x00d1
            int r0 = (r0 > r5 ? 1 : (r0 == r5 ? 0 : -1))
            if (r0 >= 0) goto L_0x00cf
        L_0x00cd:
            r0 = 1
            goto L_0x00dc
        L_0x00cf:
            r0 = 0
            goto L_0x00dc
        L_0x00d1:
            int r0 = (r0 > r5 ? 1 : (r0 == r5 ? 0 : -1))
            if (r0 <= 0) goto L_0x00cf
            goto L_0x00cd
        L_0x00d6:
            boolean r0 = r9.getTargetCheckedState()
            goto L_0x00dc
        L_0x00db:
            r0 = r6
        L_0x00dc:
            if (r0 == r6) goto L_0x00e1
            r9.playSoundEffect(r2)
        L_0x00e1:
            r9.setChecked(r0)
            android.view.MotionEvent r0 = android.view.MotionEvent.obtain(r10)
            r0.setAction(r4)
            super.onTouchEvent(r0)
            r0.recycle()
            super.onTouchEvent(r10)
            return r3
        L_0x00f5:
            r9.f1373y = r2
            r0.clear()
            goto L_0x0147
        L_0x00fb:
            float r0 = r10.getX()
            float r1 = r10.getY()
            boolean r4 = r9.isEnabled()
            if (r4 == 0) goto L_0x0147
            android.graphics.drawable.Drawable r4 = r9.f1355f
            if (r4 != 0) goto L_0x010e
            goto L_0x0147
        L_0x010e:
            int r4 = r9.getThumbOffset()
            android.graphics.drawable.Drawable r5 = r9.f1355f
            android.graphics.Rect r6 = r9.f1354V
            r5.getPadding(r6)
            int r5 = r9.f1342J
            int r5 = r5 - r2
            int r7 = r9.I
            int r7 = r7 + r4
            int r7 = r7 - r2
            int r4 = r9.f1341H
            int r4 = r4 + r7
            int r8 = r6.left
            int r4 = r4 + r8
            int r6 = r6.right
            int r4 = r4 + r6
            int r4 = r4 + r2
            int r6 = r9.f1344L
            int r6 = r6 + r2
            float r2 = (float) r7
            int r2 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r2 <= 0) goto L_0x0147
            float r2 = (float) r4
            int r2 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r2 >= 0) goto L_0x0147
            float r2 = (float) r5
            int r2 = (r1 > r2 ? 1 : (r1 == r2 ? 0 : -1))
            if (r2 <= 0) goto L_0x0147
            float r2 = (float) r6
            int r2 = (r1 > r2 ? 1 : (r1 == r2 ? 0 : -1))
            if (r2 >= 0) goto L_0x0147
            r9.f1373y = r3
            r9.f1334A = r0
            r9.f1335B = r1
        L_0x0147:
            boolean r10 = super.onTouchEvent(r10)
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.SwitchCompat.onTouchEvent(android.view.MotionEvent):boolean");
    }

    public final void setEnforceSwitchWidth(boolean z2) {
        this.f1345M = z2;
        invalidate();
    }

    public void setShowText(boolean z2) {
        if (this.f1372x != z2) {
            this.f1372x = z2;
            requestLayout();
            if (z2) {
                d();
            }
        }
    }

    public void setSplitTrack(boolean z2) {
        this.f1367s = z2;
        invalidate();
    }

    public void setSwitchMinWidth(int i2) {
        this.f1365q = i2;
        requestLayout();
    }

    public void setSwitchPadding(int i2) {
        this.f1366r = i2;
        requestLayout();
    }

    public void setSwitchTypeface(Typeface typeface) {
        TextPaint textPaint = this.f1346N;
        if ((textPaint.getTypeface() != null && !textPaint.getTypeface().equals(typeface)) || (textPaint.getTypeface() == null && typeface != null)) {
            textPaint.setTypeface(typeface);
            requestLayout();
            invalidate();
        }
    }

    public void setThumbDrawable(Drawable drawable) {
        Drawable drawable2 = this.f1355f;
        if (drawable2 != null) {
            drawable2.setCallback((Drawable.Callback) null);
        }
        this.f1355f = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
        }
        requestLayout();
    }

    public void setThumbPosition(float f2) {
        this.f1338E = f2;
        invalidate();
    }

    public void setThumbTextPadding(int i2) {
        this.f1364p = i2;
        requestLayout();
    }

    public void setThumbTintList(ColorStateList colorStateList) {
        this.f1356g = colorStateList;
        this.i = true;
        a();
    }

    public void setThumbTintMode(PorterDuff.Mode mode) {
        this.f1357h = mode;
        this.f1358j = true;
        a();
    }

    public void setTrackDrawable(Drawable drawable) {
        Drawable drawable2 = this.f1359k;
        if (drawable2 != null) {
            drawable2.setCallback((Drawable.Callback) null);
        }
        this.f1359k = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
        }
        requestLayout();
    }

    public void setTrackTintList(ColorStateList colorStateList) {
        this.f1360l = colorStateList;
        this.f1362n = true;
        b();
    }

    public void setTrackTintMode(PorterDuff.Mode mode) {
        this.f1361m = mode;
        this.f1363o = true;
        b();
    }

    /* JADX WARNING: type inference failed for: r0v15, types: [java.lang.Object, l.a] */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x010f, code lost:
        r3 = p0.C0320a.I(r13, (r3 = r1.getResourceId(3, 0)));
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public SwitchCompat(android.content.Context r13, android.util.AttributeSet r14) {
        /*
            r12 = this;
            r6 = 2130969689(0x7f040459, float:1.7548067E38)
            r12.<init>(r13, r14, r6)
            r7 = 0
            r12.f1356g = r7
            r12.f1357h = r7
            r8 = 0
            r12.i = r8
            r12.f1358j = r8
            r12.f1360l = r7
            r12.f1361m = r7
            r12.f1362n = r8
            r12.f1363o = r8
            android.view.VelocityTracker r0 = android.view.VelocityTracker.obtain()
            r12.f1336C = r0
            r9 = 1
            r12.f1345M = r9
            android.graphics.Rect r0 = new android.graphics.Rect
            r0.<init>()
            r12.f1354V = r0
            android.content.Context r0 = r12.getContext()
            o.U0.a(r12, r0)
            android.text.TextPaint r10 = new android.text.TextPaint
            r10.<init>(r9)
            r12.f1346N = r10
            android.content.res.Resources r0 = r12.getResources()
            android.util.DisplayMetrics r0 = r0.getDisplayMetrics()
            float r0 = r0.density
            r10.density = r0
            int[] r2 = g.C0096a.f2538v
            android.support.v4.media.session.t r11 = android.support.v4.media.session.t.A(r13, r14, r2, r6)
            java.lang.Object r0 = r11.f1132c
            r4 = r0
            android.content.res.TypedArray r4 = (android.content.res.TypedArray) r4
            r0 = r12
            r1 = r13
            r3 = r14
            r5 = r6
            N.Q.o(r0, r1, r2, r3, r4, r5)
            r0 = 2
            android.graphics.drawable.Drawable r1 = r11.o(r0)
            r12.f1355f = r1
            if (r1 == 0) goto L_0x0060
            r1.setCallback(r12)
        L_0x0060:
            r1 = 11
            android.graphics.drawable.Drawable r1 = r11.o(r1)
            r12.f1359k = r1
            if (r1 == 0) goto L_0x006d
            r1.setCallback(r12)
        L_0x006d:
            java.lang.Object r1 = r11.f1132c
            android.content.res.TypedArray r1 = (android.content.res.TypedArray) r1
            java.lang.CharSequence r2 = r1.getText(r8)
            r12.setTextOnInternal(r2)
            java.lang.CharSequence r2 = r1.getText(r9)
            r12.setTextOffInternal(r2)
            r2 = 3
            boolean r3 = r1.getBoolean(r2, r9)
            r12.f1372x = r3
            r3 = 8
            int r3 = r1.getDimensionPixelSize(r3, r8)
            r12.f1364p = r3
            r3 = 5
            int r3 = r1.getDimensionPixelSize(r3, r8)
            r12.f1365q = r3
            r3 = 6
            int r3 = r1.getDimensionPixelSize(r3, r8)
            r12.f1366r = r3
            r3 = 4
            boolean r3 = r1.getBoolean(r3, r8)
            r12.f1367s = r3
            r3 = 9
            android.content.res.ColorStateList r3 = r11.n(r3)
            if (r3 == 0) goto L_0x00af
            r12.f1356g = r3
            r12.i = r9
        L_0x00af:
            r3 = 10
            r4 = -1
            int r3 = r1.getInt(r3, r4)
            android.graphics.PorterDuff$Mode r3 = o.C0297p0.c(r3, r7)
            android.graphics.PorterDuff$Mode r5 = r12.f1357h
            if (r5 == r3) goto L_0x00c2
            r12.f1357h = r3
            r12.f1358j = r9
        L_0x00c2:
            boolean r3 = r12.i
            if (r3 != 0) goto L_0x00ca
            boolean r3 = r12.f1358j
            if (r3 == 0) goto L_0x00cd
        L_0x00ca:
            r12.a()
        L_0x00cd:
            r3 = 12
            android.content.res.ColorStateList r3 = r11.n(r3)
            if (r3 == 0) goto L_0x00d9
            r12.f1360l = r3
            r12.f1362n = r9
        L_0x00d9:
            r3 = 13
            int r3 = r1.getInt(r3, r4)
            android.graphics.PorterDuff$Mode r3 = o.C0297p0.c(r3, r7)
            android.graphics.PorterDuff$Mode r5 = r12.f1361m
            if (r5 == r3) goto L_0x00eb
            r12.f1361m = r3
            r12.f1363o = r9
        L_0x00eb:
            boolean r3 = r12.f1362n
            if (r3 != 0) goto L_0x00f3
            boolean r3 = r12.f1363o
            if (r3 == 0) goto L_0x00f6
        L_0x00f3:
            r12.b()
        L_0x00f6:
            r3 = 7
            int r1 = r1.getResourceId(r3, r8)
            if (r1 == 0) goto L_0x01b7
            int[] r3 = g.C0096a.f2539w
            android.content.res.TypedArray r1 = r13.obtainStyledAttributes(r1, r3)
            boolean r3 = r1.hasValue(r2)
            if (r3 == 0) goto L_0x0116
            int r3 = r1.getResourceId(r2, r8)
            if (r3 == 0) goto L_0x0116
            android.content.res.ColorStateList r3 = p0.C0320a.I(r13, r3)
            if (r3 == 0) goto L_0x0116
            goto L_0x011a
        L_0x0116:
            android.content.res.ColorStateList r3 = r1.getColorStateList(r2)
        L_0x011a:
            if (r3 == 0) goto L_0x011f
            r12.f1347O = r3
            goto L_0x0125
        L_0x011f:
            android.content.res.ColorStateList r3 = r12.getTextColors()
            r12.f1347O = r3
        L_0x0125:
            int r3 = r1.getDimensionPixelSize(r8, r8)
            if (r3 == 0) goto L_0x013a
            float r3 = (float) r3
            float r5 = r10.getTextSize()
            int r5 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r5 == 0) goto L_0x013a
            r10.setTextSize(r3)
            r12.requestLayout()
        L_0x013a:
            int r3 = r1.getInt(r9, r4)
            int r4 = r1.getInt(r0, r4)
            if (r3 == r9) goto L_0x0150
            if (r3 == r0) goto L_0x014d
            if (r3 == r2) goto L_0x014a
            r2 = r7
            goto L_0x0152
        L_0x014a:
            android.graphics.Typeface r2 = android.graphics.Typeface.MONOSPACE
            goto L_0x0152
        L_0x014d:
            android.graphics.Typeface r2 = android.graphics.Typeface.SERIF
            goto L_0x0152
        L_0x0150:
            android.graphics.Typeface r2 = android.graphics.Typeface.SANS_SERIF
        L_0x0152:
            r3 = 0
            if (r4 <= 0) goto L_0x017f
            if (r2 != 0) goto L_0x015c
            android.graphics.Typeface r2 = android.graphics.Typeface.defaultFromStyle(r4)
            goto L_0x0160
        L_0x015c:
            android.graphics.Typeface r2 = android.graphics.Typeface.create(r2, r4)
        L_0x0160:
            r12.setSwitchTypeface(r2)
            if (r2 == 0) goto L_0x016a
            int r2 = r2.getStyle()
            goto L_0x016b
        L_0x016a:
            r2 = 0
        L_0x016b:
            int r2 = ~r2
            r2 = r2 & r4
            r4 = r2 & 1
            if (r4 == 0) goto L_0x0172
            goto L_0x0173
        L_0x0172:
            r9 = 0
        L_0x0173:
            r10.setFakeBoldText(r9)
            r0 = r0 & r2
            if (r0 == 0) goto L_0x017b
            r3 = -1098907648(0xffffffffbe800000, float:-0.25)
        L_0x017b:
            r10.setTextSkewX(r3)
            goto L_0x0188
        L_0x017f:
            r10.setFakeBoldText(r8)
            r10.setTextSkewX(r3)
            r12.setSwitchTypeface(r2)
        L_0x0188:
            r0 = 14
            boolean r0 = r1.getBoolean(r0, r8)
            if (r0 == 0) goto L_0x01a8
            l.a r0 = new l.a
            android.content.Context r2 = r12.getContext()
            r0.<init>()
            android.content.res.Resources r2 = r2.getResources()
            android.content.res.Configuration r2 = r2.getConfiguration()
            java.util.Locale r2 = r2.locale
            r0.f3586a = r2
            r12.f1350R = r0
            goto L_0x01aa
        L_0x01a8:
            r12.f1350R = r7
        L_0x01aa:
            java.lang.CharSequence r0 = r12.f1368t
            r12.setTextOnInternal(r0)
            java.lang.CharSequence r0 = r12.f1370v
            r12.setTextOffInternal(r0)
            r1.recycle()
        L_0x01b7:
            o.Z r0 = new o.Z
            r0.<init>(r12)
            r0.f(r14, r6)
            r11.C()
            android.view.ViewConfiguration r13 = android.view.ViewConfiguration.get(r13)
            int r0 = r13.getScaledTouchSlop()
            r12.f1374z = r0
            int r13 = r13.getScaledMinimumFlingVelocity()
            r12.f1337D = r13
            o.v r13 = r12.getEmojiTextViewHelper()
            r13.b(r14, r6)
            r12.refreshDrawableState()
            boolean r13 = r12.isChecked()
            r12.setChecked(r13)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.SwitchCompat.<init>(android.content.Context, android.util.AttributeSet):void");
    }

    public final void drawableHotspotChanged(float f2, float f3) {
        super.drawableHotspotChanged(f2, f3);
        Drawable drawable = this.f1355f;
        if (drawable != null) {
            a.e(drawable, f2, f3);
        }
        Drawable drawable2 = this.f1359k;
        if (drawable2 != null) {
            a.e(drawable2, f2, f3);
        }
    }

    public final void drawableStateChanged() {
        boolean z2;
        super.drawableStateChanged();
        int[] drawableState = getDrawableState();
        Drawable drawable = this.f1355f;
        if (drawable == null || !drawable.isStateful()) {
            z2 = false;
        } else {
            z2 = drawable.setState(drawableState);
        }
        Drawable drawable2 = this.f1359k;
        if (drawable2 != null && drawable2.isStateful()) {
            z2 |= drawable2.setState(drawableState);
        }
        if (z2) {
            invalidate();
        }
    }

    public ActionMode.Callback getCustomSelectionActionModeCallback() {
        return C0320a.H0(super.getCustomSelectionActionModeCallback());
    }

    public final void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        Drawable drawable = this.f1355f;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
        Drawable drawable2 = this.f1359k;
        if (drawable2 != null) {
            drawable2.jumpToCurrentState();
        }
        ObjectAnimator objectAnimator = this.f1351S;
        if (objectAnimator != null && objectAnimator.isStarted()) {
            this.f1351S.end();
            this.f1351S = null;
        }
    }

    public final void onDraw(Canvas canvas) {
        StaticLayout staticLayout;
        int i2;
        super.onDraw(canvas);
        Drawable drawable = this.f1359k;
        Rect rect = this.f1354V;
        if (drawable != null) {
            drawable.getPadding(rect);
        } else {
            rect.setEmpty();
        }
        int i3 = this.f1342J;
        int i4 = this.f1344L;
        int i5 = i3 + rect.top;
        int i6 = i4 - rect.bottom;
        Drawable drawable2 = this.f1355f;
        if (drawable != null) {
            if (!this.f1367s || drawable2 == null) {
                drawable.draw(canvas);
            } else {
                Rect b2 = C0297p0.b(drawable2);
                drawable2.copyBounds(rect);
                rect.left += b2.left;
                rect.right -= b2.right;
                int save = canvas.save();
                canvas.clipRect(rect, Region.Op.DIFFERENCE);
                drawable.draw(canvas);
                canvas.restoreToCount(save);
            }
        }
        int save2 = canvas.save();
        if (drawable2 != null) {
            drawable2.draw(canvas);
        }
        if (getTargetCheckedState()) {
            staticLayout = this.f1348P;
        } else {
            staticLayout = this.f1349Q;
        }
        if (staticLayout != null) {
            int[] drawableState = getDrawableState();
            ColorStateList colorStateList = this.f1347O;
            TextPaint textPaint = this.f1346N;
            if (colorStateList != null) {
                textPaint.setColor(colorStateList.getColorForState(drawableState, 0));
            }
            textPaint.drawableState = drawableState;
            if (drawable2 != null) {
                Rect bounds = drawable2.getBounds();
                i2 = bounds.left + bounds.right;
            } else {
                i2 = getWidth();
            }
            canvas.translate((float) ((i2 / 2) - (staticLayout.getWidth() / 2)), (float) (((i5 + i6) / 2) - (staticLayout.getHeight() / 2)));
            staticLayout.draw(canvas);
        }
        canvas.restoreToCount(save2);
    }

    public final void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName("android.widget.Switch");
    }

    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        CharSequence charSequence;
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName("android.widget.Switch");
        if (Build.VERSION.SDK_INT < 30) {
            if (isChecked()) {
                charSequence = this.f1368t;
            } else {
                charSequence = this.f1370v;
            }
            if (!TextUtils.isEmpty(charSequence)) {
                CharSequence text = accessibilityNodeInfo.getText();
                if (TextUtils.isEmpty(text)) {
                    accessibilityNodeInfo.setText(charSequence);
                    return;
                }
                StringBuilder sb = new StringBuilder();
                sb.append(text);
                sb.append(' ');
                sb.append(charSequence);
                accessibilityNodeInfo.setText(sb);
            }
        }
    }

    public final void onLayout(boolean z2, int i2, int i3, int i4, int i5) {
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        super.onLayout(z2, i2, i3, i4, i5);
        int i11 = 0;
        if (this.f1355f != null) {
            Drawable drawable = this.f1359k;
            Rect rect = this.f1354V;
            if (drawable != null) {
                drawable.getPadding(rect);
            } else {
                rect.setEmpty();
            }
            Rect b2 = C0297p0.b(this.f1355f);
            i6 = Math.max(0, b2.left - rect.left);
            i11 = Math.max(0, b2.right - rect.right);
        } else {
            i6 = 0;
        }
        boolean z3 = n1.f4272a;
        if (getLayoutDirection() == 1) {
            i8 = getPaddingLeft() + i6;
            i7 = ((this.f1339F + i8) - i6) - i11;
        } else {
            i7 = (getWidth() - getPaddingRight()) - i11;
            i8 = (i7 - this.f1339F) + i6 + i11;
        }
        int gravity = getGravity() & 112;
        if (gravity == 16) {
            int paddingTop = getPaddingTop();
            int i12 = this.f1340G;
            int height = (((getHeight() + paddingTop) - getPaddingBottom()) / 2) - (i12 / 2);
            int i13 = height;
            i9 = i12 + height;
            i10 = i13;
        } else if (gravity != 80) {
            i10 = getPaddingTop();
            i9 = this.f1340G + i10;
        } else {
            i9 = getHeight() - getPaddingBottom();
            i10 = i9 - this.f1340G;
        }
        this.I = i8;
        this.f1342J = i10;
        this.f1344L = i9;
        this.f1343K = i7;
    }

    public final void onPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        CharSequence charSequence;
        super.onPopulateAccessibilityEvent(accessibilityEvent);
        if (isChecked()) {
            charSequence = this.f1368t;
        } else {
            charSequence = this.f1370v;
        }
        if (charSequence != null) {
            accessibilityEvent.getText().add(charSequence);
        }
    }

    public void setAllCaps(boolean z2) {
        super.setAllCaps(z2);
        getEmojiTextViewHelper().c(z2);
    }

    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(C0320a.K0(callback, this));
    }

    public void setEmojiCompatEnabled(boolean z2) {
        getEmojiTextViewHelper().d(z2);
        setTextOnInternal(this.f1368t);
        setTextOffInternal(this.f1370v);
        requestLayout();
    }

    public void setFilters(InputFilter[] inputFilterArr) {
        super.setFilters(getEmojiTextViewHelper().a(inputFilterArr));
    }

    public void setTextOff(CharSequence charSequence) {
        setTextOffInternal(charSequence);
        requestLayout();
        if (!isChecked() && Build.VERSION.SDK_INT >= 30) {
            Object obj = this.f1370v;
            if (obj == null) {
                obj = getResources().getString(2131755019);
            }
            WeakHashMap weakHashMap = Q.f509a;
            new A(2131296733, CharSequence.class, 64, 30, 2).d(this, obj);
        }
    }

    public void setTextOn(CharSequence charSequence) {
        setTextOnInternal(charSequence);
        requestLayout();
        if (isChecked() && Build.VERSION.SDK_INT >= 30) {
            Object obj = this.f1368t;
            if (obj == null) {
                obj = getResources().getString(2131755020);
            }
            WeakHashMap weakHashMap = Q.f509a;
            new A(2131296733, CharSequence.class, 64, 30, 2).d(this, obj);
        }
    }

    public void setThumbResource(int i2) {
        setThumbDrawable(g.n(getContext(), i2));
    }

    public void setTrackResource(int i2) {
        setTrackDrawable(g.n(getContext(), i2));
    }

    public final void toggle() {
        setChecked(!isChecked());
    }

    public final boolean verifyDrawable(Drawable drawable) {
        if (super.verifyDrawable(drawable) || drawable == this.f1355f || drawable == this.f1359k) {
            return true;
        }
        return false;
    }
}
