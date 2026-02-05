package y0;

import E0.m;
import G.a;
import N.Y;
import Q0.E;
import T.b;
import T0.g;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.AnimatedStateListDrawable;
import android.graphics.drawable.AnimatedVectorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.os.Build;
import android.os.Parcelable;
import android.text.TextUtils;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.autofill.AutofillManager;
import android.widget.CompoundButton;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashSet;
import o.C0298q;
import o0.d;
import o0.f;
import p0.C0320a;

/* renamed from: y0.c  reason: case insensitive filesystem */
public final class C0358c extends C0298q {

    /* renamed from: D  reason: collision with root package name */
    public static final int[] f5149D = {2130969658};

    /* renamed from: E  reason: collision with root package name */
    public static final int[] f5150E = {2130969657};

    /* renamed from: F  reason: collision with root package name */
    public static final int[][] f5151F = {new int[]{16842910, 2130969657}, new int[]{16842910, 16842912}, new int[]{16842910, -16842912}, new int[]{-16842910, 16842912}, new int[]{-16842910, -16842912}};

    /* renamed from: G  reason: collision with root package name */
    public static final int f5152G = Resources.getSystem().getIdentifier("btn_check_material_anim", "drawable", "android");

    /* renamed from: A  reason: collision with root package name */
    public CompoundButton.OnCheckedChangeListener f5153A;

    /* renamed from: B  reason: collision with root package name */
    public final f f5154B;

    /* renamed from: C  reason: collision with root package name */
    public final C0356a f5155C;

    /* renamed from: j  reason: collision with root package name */
    public final LinkedHashSet f5156j = new LinkedHashSet();

    /* renamed from: k  reason: collision with root package name */
    public final LinkedHashSet f5157k = new LinkedHashSet();

    /* renamed from: l  reason: collision with root package name */
    public ColorStateList f5158l;

    /* renamed from: m  reason: collision with root package name */
    public boolean f5159m;

    /* renamed from: n  reason: collision with root package name */
    public boolean f5160n;

    /* renamed from: o  reason: collision with root package name */
    public boolean f5161o;

    /* renamed from: p  reason: collision with root package name */
    public CharSequence f5162p;

    /* renamed from: q  reason: collision with root package name */
    public Drawable f5163q;

    /* renamed from: r  reason: collision with root package name */
    public Drawable f5164r;

    /* renamed from: s  reason: collision with root package name */
    public boolean f5165s;

    /* renamed from: t  reason: collision with root package name */
    public ColorStateList f5166t;

    /* renamed from: u  reason: collision with root package name */
    public ColorStateList f5167u;

    /* renamed from: v  reason: collision with root package name */
    public PorterDuff.Mode f5168v;

    /* renamed from: w  reason: collision with root package name */
    public int f5169w;

    /* renamed from: x  reason: collision with root package name */
    public int[] f5170x;

    /* renamed from: y  reason: collision with root package name */
    public boolean f5171y;

    /* renamed from: z  reason: collision with root package name */
    public CharSequence f5172z;

    public final void a() {
        LayerDrawable layerDrawable;
        ColorStateList colorStateList;
        ColorStateList colorStateList2;
        Y y2;
        this.f5163q = C0320a.z(this.f5163q, this.f5166t, b.b(this));
        this.f5164r = C0320a.z(this.f5164r, this.f5167u, this.f5168v);
        if (this.f5165s) {
            f fVar = this.f5154B;
            if (fVar != null) {
                Drawable drawable = fVar.f4364f;
                C0356a aVar = this.f5155C;
                if (drawable != null) {
                    AnimatedVectorDrawable animatedVectorDrawable = (AnimatedVectorDrawable) drawable;
                    if (aVar.f5146a == null) {
                        aVar.f5146a = new o0.b(aVar);
                    }
                    boolean unused = animatedVectorDrawable.unregisterAnimationCallback(aVar.f5146a);
                }
                ArrayList arrayList = fVar.f4360j;
                d dVar = fVar.f4358g;
                if (!(arrayList == null || aVar == null)) {
                    arrayList.remove(aVar);
                    if (fVar.f4360j.size() == 0 && (y2 = fVar.i) != null) {
                        dVar.f4353b.removeListener(y2);
                        fVar.i = null;
                    }
                }
                Drawable drawable2 = fVar.f4364f;
                if (drawable2 != null) {
                    AnimatedVectorDrawable animatedVectorDrawable2 = (AnimatedVectorDrawable) drawable2;
                    if (aVar.f5146a == null) {
                        aVar.f5146a = new o0.b(aVar);
                    }
                    animatedVectorDrawable2.registerAnimationCallback(aVar.f5146a);
                } else if (aVar != null) {
                    if (fVar.f4360j == null) {
                        fVar.f4360j = new ArrayList();
                    }
                    if (!fVar.f4360j.contains(aVar)) {
                        fVar.f4360j.add(aVar);
                        if (fVar.i == null) {
                            fVar.i = new Y(4, (Object) fVar);
                        }
                        dVar.f4353b.addListener(fVar.i);
                    }
                }
            }
            if (Build.VERSION.SDK_INT >= 24) {
                Drawable drawable3 = this.f5163q;
                if ((drawable3 instanceof AnimatedStateListDrawable) && fVar != null) {
                    ((AnimatedStateListDrawable) drawable3).addTransition(2131296380, 2131296777, fVar, false);
                    ((AnimatedStateListDrawable) this.f5163q).addTransition(2131296500, 2131296777, fVar, false);
                }
            }
        }
        Drawable drawable4 = this.f5163q;
        if (!(drawable4 == null || (colorStateList2 = this.f5166t) == null)) {
            a.h(drawable4, colorStateList2);
        }
        Drawable drawable5 = this.f5164r;
        if (!(drawable5 == null || (colorStateList = this.f5167u) == null)) {
            a.h(drawable5, colorStateList);
        }
        Drawable drawable6 = this.f5163q;
        Drawable drawable7 = this.f5164r;
        if (drawable6 == null) {
            drawable6 = drawable7;
        } else if (drawable7 != null) {
            int intrinsicWidth = drawable7.getIntrinsicWidth();
            if (intrinsicWidth == -1) {
                intrinsicWidth = drawable6.getIntrinsicWidth();
            }
            int intrinsicHeight = drawable7.getIntrinsicHeight();
            if (intrinsicHeight == -1) {
                intrinsicHeight = drawable6.getIntrinsicHeight();
            }
            if (intrinsicWidth > drawable6.getIntrinsicWidth() || intrinsicHeight > drawable6.getIntrinsicHeight()) {
                float f2 = ((float) intrinsicWidth) / ((float) intrinsicHeight);
                if (f2 >= ((float) drawable6.getIntrinsicWidth()) / ((float) drawable6.getIntrinsicHeight())) {
                    int intrinsicWidth2 = drawable6.getIntrinsicWidth();
                    intrinsicHeight = (int) (((float) intrinsicWidth2) / f2);
                    intrinsicWidth = intrinsicWidth2;
                } else {
                    intrinsicHeight = drawable6.getIntrinsicHeight();
                    intrinsicWidth = (int) (f2 * ((float) intrinsicHeight));
                }
            }
            if (Build.VERSION.SDK_INT >= 23) {
                layerDrawable = new LayerDrawable(new Drawable[]{drawable6, drawable7});
                layerDrawable.setLayerSize(1, intrinsicWidth, intrinsicHeight);
                layerDrawable.setLayerGravity(1, 17);
            } else {
                layerDrawable = new LayerDrawable(new Drawable[]{drawable6, drawable7});
                int max = Math.max((drawable6.getIntrinsicWidth() - intrinsicWidth) / 2, 0);
                int max2 = Math.max((drawable6.getIntrinsicHeight() - intrinsicHeight) / 2, 0);
                layerDrawable.setLayerInset(1, max, max2, max, max2);
            }
            drawable6 = layerDrawable;
        }
        super.setButtonDrawable(drawable6);
        refreshDrawableState();
    }

    public final int[] onCreateDrawableState(int i) {
        int[] copyOf;
        int[] onCreateDrawableState = super.onCreateDrawableState(i + 2);
        if (getCheckedState() == 2) {
            View.mergeDrawableStates(onCreateDrawableState, f5149D);
        }
        if (this.f5161o) {
            View.mergeDrawableStates(onCreateDrawableState, f5150E);
        }
        int i2 = 0;
        while (true) {
            if (i2 >= onCreateDrawableState.length) {
                copyOf = Arrays.copyOf(onCreateDrawableState, onCreateDrawableState.length + 1);
                copyOf[onCreateDrawableState.length] = 16842912;
                break;
            }
            int i3 = onCreateDrawableState[i2];
            if (i3 == 16842912) {
                copyOf = onCreateDrawableState;
                break;
            } else if (i3 == 0) {
                copyOf = (int[]) onCreateDrawableState.clone();
                copyOf[i2] = 16842912;
                break;
            } else {
                i2++;
            }
        }
        this.f5170x = copyOf;
        return onCreateDrawableState;
    }

    public void setButtonDrawable(int i) {
        setButtonDrawable(g.n(getContext(), i));
    }

    private String getButtonStateDescription() {
        int i = this.f5169w;
        if (i == 1) {
            return getResources().getString(2131755163);
        }
        if (i == 0) {
            return getResources().getString(2131755165);
        }
        return getResources().getString(2131755164);
    }

    private ColorStateList getMaterialThemeColorsTintList() {
        if (this.f5158l == null) {
            int H2 = C0320a.H(this, 2130968835);
            int H3 = C0320a.H(this, 2130968838);
            int H4 = C0320a.H(this, 2130968876);
            int H5 = C0320a.H(this, 2130968854);
            this.f5158l = new ColorStateList(f5151F, new int[]{C0320a.h0(H4, H3, 1.0f), C0320a.h0(H4, H2, 1.0f), C0320a.h0(H4, H5, 0.54f), C0320a.h0(H4, H5, 0.38f), C0320a.h0(H4, H5, 0.38f)});
        }
        return this.f5158l;
    }

    private ColorStateList getSuperButtonTintList() {
        ColorStateList colorStateList = this.f5166t;
        if (colorStateList != null) {
            return colorStateList;
        }
        if (super.getButtonTintList() != null) {
            return super.getButtonTintList();
        }
        return getSupportButtonTintList();
    }

    public Drawable getButtonDrawable() {
        return this.f5163q;
    }

    public Drawable getButtonIconDrawable() {
        return this.f5164r;
    }

    public ColorStateList getButtonIconTintList() {
        return this.f5167u;
    }

    public PorterDuff.Mode getButtonIconTintMode() {
        return this.f5168v;
    }

    public ColorStateList getButtonTintList() {
        return this.f5166t;
    }

    public int getCheckedState() {
        return this.f5169w;
    }

    public CharSequence getErrorAccessibilityLabel() {
        return this.f5162p;
    }

    public final boolean isChecked() {
        if (this.f5169w == 1) {
            return true;
        }
        return false;
    }

    public final void onDraw(Canvas canvas) {
        Drawable E2;
        int i;
        if (!this.f5160n || !TextUtils.isEmpty(getText()) || (E2 = C0320a.E(this)) == null) {
            super.onDraw(canvas);
            return;
        }
        if (m.e(this)) {
            i = -1;
        } else {
            i = 1;
        }
        int width = ((getWidth() - E2.getIntrinsicWidth()) / 2) * i;
        int save = canvas.save();
        canvas.translate((float) width, 0.0f);
        super.onDraw(canvas);
        canvas.restoreToCount(save);
        if (getBackground() != null) {
            Rect bounds = E2.getBounds();
            a.f(getBackground(), bounds.left + width, bounds.top, bounds.right + width, bounds.bottom);
        }
    }

    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof C0357b)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        C0357b bVar = (C0357b) parcelable;
        super.onRestoreInstanceState(bVar.getSuperState());
        setCheckedState(bVar.f5148a);
    }

    public void setButtonDrawable(Drawable drawable) {
        this.f5163q = drawable;
        this.f5165s = false;
        a();
    }

    public void setButtonIconDrawable(Drawable drawable) {
        this.f5164r = drawable;
        a();
    }

    public void setButtonIconTintList(ColorStateList colorStateList) {
        if (this.f5167u != colorStateList) {
            this.f5167u = colorStateList;
            a();
        }
    }

    public void setButtonIconTintMode(PorterDuff.Mode mode) {
        if (this.f5168v != mode) {
            this.f5168v = mode;
            a();
        }
    }

    public void setButtonTintList(ColorStateList colorStateList) {
        if (this.f5166t != colorStateList) {
            this.f5166t = colorStateList;
            a();
        }
    }

    public void setCenterIfNoTextEnabled(boolean z2) {
        this.f5160n = z2;
    }

    public void setCheckedState(int i) {
        boolean z2;
        AutofillManager autofillManager;
        CompoundButton.OnCheckedChangeListener onCheckedChangeListener;
        if (this.f5169w != i) {
            this.f5169w = i;
            if (i == 1) {
                z2 = true;
            } else {
                z2 = false;
            }
            super.setChecked(z2);
            refreshDrawableState();
            int i2 = Build.VERSION.SDK_INT;
            if (i2 >= 30 && this.f5172z == null) {
                super.setStateDescription(getButtonStateDescription());
            }
            if (!this.f5171y) {
                this.f5171y = true;
                LinkedHashSet linkedHashSet = this.f5157k;
                if (linkedHashSet != null) {
                    Iterator it2 = linkedHashSet.iterator();
                    if (it2.hasNext()) {
                        it2.next().getClass();
                        throw new ClassCastException();
                    }
                }
                if (!(this.f5169w == 2 || (onCheckedChangeListener = this.f5153A) == null)) {
                    onCheckedChangeListener.onCheckedChanged(this, isChecked());
                }
                if (i2 >= 26 && (autofillManager = (AutofillManager) getContext().getSystemService(AutofillManager.class)) != null) {
                    autofillManager.notifyValueChanged(this);
                }
                this.f5171y = false;
            }
        }
    }

    public void setErrorAccessibilityLabel(CharSequence charSequence) {
        this.f5162p = charSequence;
    }

    public void setErrorAccessibilityLabelResource(int i) {
        CharSequence charSequence;
        if (i != 0) {
            charSequence = getResources().getText(i);
        } else {
            charSequence = null;
        }
        setErrorAccessibilityLabel(charSequence);
    }

    public void setErrorShown(boolean z2) {
        if (this.f5161o != z2) {
            this.f5161o = z2;
            refreshDrawableState();
            Iterator it2 = this.f5156j.iterator();
            if (it2.hasNext()) {
                E.h(it2.next());
                throw null;
            }
        }
    }

    public void setOnCheckedChangeListener(CompoundButton.OnCheckedChangeListener onCheckedChangeListener) {
        this.f5153A = onCheckedChangeListener;
    }

    public void setStateDescription(CharSequence charSequence) {
        this.f5172z = charSequence;
        if (charSequence != null) {
            super.setStateDescription(charSequence);
        } else if (Build.VERSION.SDK_INT >= 30 && charSequence == null) {
            super.setStateDescription(getButtonStateDescription());
        }
    }

    public void setUseMaterialThemeColors(boolean z2) {
        this.f5159m = z2;
        if (z2) {
            b.c(this, getMaterialThemeColorsTintList());
        } else {
            b.c(this, (ColorStateList) null);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:11:0x006e A[Catch:{ XmlPullParserException -> 0x0082, IOException -> 0x0080 }] */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x0084 A[Catch:{ XmlPullParserException -> 0x0082, IOException -> 0x0080 }] */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x00ff  */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x0143  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C0358c(android.content.Context r14, android.util.AttributeSet r15) {
        /*
            r13 = this;
            r6 = 2130968765(0x7f0400bd, float:1.7546193E38)
            r0 = 2131821626(0x7f11043a, float:1.9276E38)
            android.content.Context r14 = P0.a.a(r14, r15, r6, r0)
            r13.<init>(r14, r15, r6)
            java.util.LinkedHashSet r14 = new java.util.LinkedHashSet
            r14.<init>()
            r13.f5156j = r14
            java.util.LinkedHashSet r14 = new java.util.LinkedHashSet
            r14.<init>()
            r13.f5157k = r14
            android.content.Context r14 = r13.getContext()
            java.lang.String r0 = "parser error"
            java.lang.String r1 = "AnimatedVDCompat"
            int r2 = android.os.Build.VERSION.SDK_INT
            r3 = 24
            r7 = 2
            r8 = 0
            r9 = 1
            r4 = 2131230911(0x7f0800bf, float:1.8077888E38)
            if (r2 < r3) goto L_0x0055
            o0.f r0 = new o0.f
            r0.<init>(r14)
            android.content.res.Resources r1 = r14.getResources()
            android.content.res.Resources$Theme r14 = r14.getTheme()
            java.lang.ThreadLocal r2 = E.r.f121a
            android.graphics.drawable.Drawable r14 = E.k.a(r1, r4, r14)
            r0.f4364f = r14
            j.f r1 = r0.f4361k
            r14.setCallback(r1)
            o0.e r14 = new o0.e
            android.graphics.drawable.Drawable r1 = r0.f4364f
            android.graphics.drawable.Drawable$ConstantState r1 = r1.getConstantState()
            r14.<init>(r1)
            goto L_0x0094
        L_0x0055:
            int r2 = o0.f.f4357l
            android.content.res.Resources r2 = r14.getResources()
            android.content.res.XmlResourceParser r2 = r2.getXml(r4)     // Catch:{ XmlPullParserException -> 0x0082, IOException -> 0x0080 }
            android.util.AttributeSet r3 = android.util.Xml.asAttributeSet(r2)     // Catch:{ XmlPullParserException -> 0x0082, IOException -> 0x0080 }
        L_0x0063:
            int r4 = r2.next()     // Catch:{ XmlPullParserException -> 0x0082, IOException -> 0x0080 }
            if (r4 == r7) goto L_0x006c
            if (r4 == r9) goto L_0x006c
            goto L_0x0063
        L_0x006c:
            if (r4 != r7) goto L_0x0084
            android.content.res.Resources r4 = r14.getResources()     // Catch:{ XmlPullParserException -> 0x0082, IOException -> 0x0080 }
            android.content.res.Resources$Theme r5 = r14.getTheme()     // Catch:{ XmlPullParserException -> 0x0082, IOException -> 0x0080 }
            o0.f r10 = new o0.f     // Catch:{ XmlPullParserException -> 0x0082, IOException -> 0x0080 }
            r10.<init>(r14)     // Catch:{ XmlPullParserException -> 0x0082, IOException -> 0x0080 }
            r10.inflate(r4, r2, r3, r5)     // Catch:{ XmlPullParserException -> 0x0082, IOException -> 0x0080 }
            r0 = r10
            goto L_0x0094
        L_0x0080:
            r14 = move-exception
            goto L_0x008c
        L_0x0082:
            r14 = move-exception
            goto L_0x0090
        L_0x0084:
            org.xmlpull.v1.XmlPullParserException r14 = new org.xmlpull.v1.XmlPullParserException     // Catch:{ XmlPullParserException -> 0x0082, IOException -> 0x0080 }
            java.lang.String r2 = "No start tag found"
            r14.<init>(r2)     // Catch:{ XmlPullParserException -> 0x0082, IOException -> 0x0080 }
            throw r14     // Catch:{ XmlPullParserException -> 0x0082, IOException -> 0x0080 }
        L_0x008c:
            android.util.Log.e(r1, r0, r14)
            goto L_0x0093
        L_0x0090:
            android.util.Log.e(r1, r0, r14)
        L_0x0093:
            r0 = r8
        L_0x0094:
            r13.f5154B = r0
            y0.a r14 = new y0.a
            r14.<init>(r13)
            r13.f5155C = r14
            android.content.Context r14 = r13.getContext()
            android.graphics.drawable.Drawable r0 = p0.C0320a.E(r13)
            r13.f5163q = r0
            android.content.res.ColorStateList r0 = r13.getSuperButtonTintList()
            r13.f5166t = r0
            r13.setSupportButtonTintList(r8)
            int[] r10 = q0.C0322a.f4495n
            r11 = 0
            int[] r5 = new int[r11]
            r12 = 2131821626(0x7f11043a, float:1.9276E38)
            E0.m.a(r14, r15, r6, r12)
            r0 = r14
            r1 = r15
            r2 = r10
            r3 = r6
            r4 = r12
            E0.m.b(r0, r1, r2, r3, r4, r5)
            android.support.v4.media.session.t r0 = new android.support.v4.media.session.t
            android.content.res.TypedArray r15 = r14.obtainStyledAttributes(r15, r10, r6, r12)
            r0.<init>((android.content.Context) r14, (android.content.res.TypedArray) r15)
            android.graphics.drawable.Drawable r1 = r0.o(r7)
            r13.f5164r = r1
            android.graphics.drawable.Drawable r1 = r13.f5163q
            if (r1 == 0) goto L_0x0108
            r1 = 2130969195(0x7f04026b, float:1.7547065E38)
            boolean r1 = p0.C0320a.p0(r14, r1, r11)
            if (r1 == 0) goto L_0x0108
            int r1 = r15.getResourceId(r11, r11)
            int r2 = r15.getResourceId(r9, r11)
            int r3 = f5152G
            if (r1 != r3) goto L_0x0108
            if (r2 != 0) goto L_0x0108
            super.setButtonDrawable((android.graphics.drawable.Drawable) r8)
            r1 = 2131230910(0x7f0800be, float:1.8077886E38)
            android.graphics.drawable.Drawable r1 = T0.g.n(r14, r1)
            r13.f5163q = r1
            r13.f5165s = r9
            android.graphics.drawable.Drawable r1 = r13.f5164r
            if (r1 != 0) goto L_0x0108
            r1 = 2131230912(0x7f0800c0, float:1.807789E38)
            android.graphics.drawable.Drawable r1 = T0.g.n(r14, r1)
            r13.f5164r = r1
        L_0x0108:
            r1 = 3
            android.content.res.ColorStateList r14 = p0.C0320a.K(r14, r0, r1)
            r13.f5167u = r14
            r14 = 4
            r1 = -1
            int r14 = r15.getInt(r14, r1)
            android.graphics.PorterDuff$Mode r1 = android.graphics.PorterDuff.Mode.SRC_IN
            android.graphics.PorterDuff$Mode r14 = E0.m.g(r14, r1)
            r13.f5168v = r14
            r14 = 10
            boolean r14 = r15.getBoolean(r14, r11)
            r13.f5159m = r14
            r14 = 6
            boolean r14 = r15.getBoolean(r14, r9)
            r13.f5160n = r14
            r14 = 9
            boolean r14 = r15.getBoolean(r14, r11)
            r13.f5161o = r14
            r14 = 8
            java.lang.CharSequence r14 = r15.getText(r14)
            r13.f5162p = r14
            r14 = 7
            boolean r1 = r15.hasValue(r14)
            if (r1 == 0) goto L_0x014a
            int r14 = r15.getInt(r14, r11)
            r13.setCheckedState(r14)
        L_0x014a:
            r0.C()
            r13.a()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: y0.C0358c.<init>(android.content.Context, android.util.AttributeSet):void");
    }

    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.f5159m && this.f5166t == null && this.f5167u == null) {
            setUseMaterialThemeColors(true);
        }
    }

    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        if (accessibilityNodeInfo != null && this.f5161o) {
            accessibilityNodeInfo.setText(accessibilityNodeInfo.getText() + ", " + this.f5162p);
        }
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [android.view.View$BaseSavedState, android.os.Parcelable, y0.b] */
    public final Parcelable onSaveInstanceState() {
        ? baseSavedState = new View.BaseSavedState(super.onSaveInstanceState());
        baseSavedState.f5148a = getCheckedState();
        return baseSavedState;
    }

    public void setButtonIconDrawableResource(int i) {
        setButtonIconDrawable(g.n(getContext(), i));
    }

    public void setButtonTintMode(PorterDuff.Mode mode) {
        setSupportButtonTintMode(mode);
        a();
    }

    public void setChecked(boolean z2) {
        setCheckedState(z2 ? 1 : 0);
    }

    public void setEnabled(boolean z2) {
        super.setEnabled(z2);
    }

    public final void toggle() {
        setChecked(!isChecked());
    }
}
