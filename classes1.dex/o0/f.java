package o0;

import G.a;
import N.Y;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.AnimatedVectorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import j.C0136f;
import java.util.ArrayList;
import org.xmlpull.v1.XmlPullParser;
import p0.C0320a;

public final class f extends i implements Animatable {

    /* renamed from: l  reason: collision with root package name */
    public static final /* synthetic */ int f4357l = 0;

    /* renamed from: g  reason: collision with root package name */
    public final d f4358g;

    /* renamed from: h  reason: collision with root package name */
    public final Context f4359h;
    public Y i = null;

    /* renamed from: j  reason: collision with root package name */
    public ArrayList f4360j = null;

    /* renamed from: k  reason: collision with root package name */
    public final C0136f f4361k = new C0136f(this);

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v0, resolved type: android.content.Context} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v10, resolved type: android.content.res.XmlResourceParser} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v12, resolved type: android.content.Context} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v13, resolved type: android.content.Context} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v14, resolved type: android.content.Context} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v15, resolved type: android.content.res.XmlResourceParser} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v17, resolved type: android.content.res.XmlResourceParser} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v18, resolved type: android.content.res.XmlResourceParser} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v25, resolved type: android.content.res.XmlResourceParser} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v26, resolved type: android.content.Context} */
    /* JADX WARNING: type inference failed for: r11v9, types: [r.b, r.k] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x007f A[Catch:{ XmlPullParserException -> 0x0092, IOException -> 0x0090 }] */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x00a7  */
    /* JADX WARNING: Removed duplicated region for block: B:79:0x0170  */
    /* JADX WARNING: Removed duplicated region for block: B:93:0x0088 A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void inflate(android.content.res.Resources r24, org.xmlpull.v1.XmlPullParser r25, android.util.AttributeSet r26, android.content.res.Resources.Theme r27) {
        /*
            r23 = this;
            r1 = r23
            r2 = r24
            r3 = r26
            r4 = r27
            android.graphics.drawable.Drawable r0 = r1.f4364f
            if (r0 == 0) goto L_0x0012
            r5 = r25
            G.a.d(r0, r2, r5, r3, r4)
            return
        L_0x0012:
            r5 = r25
            int r0 = r25.getEventType()
            int r6 = r25.getDepth()
            r7 = 1
            int r6 = r6 + r7
        L_0x001e:
            o0.d r8 = r1.f4358g
            if (r0 == r7) goto L_0x0188
            int r9 = r25.getDepth()
            if (r9 >= r6) goto L_0x002b
            r9 = 3
            if (r0 == r9) goto L_0x0188
        L_0x002b:
            r9 = 2
            if (r0 != r9) goto L_0x0182
            java.lang.String r0 = r25.getName()
            java.lang.String r10 = "animated-vector"
            boolean r10 = r10.equals(r0)
            r12 = 24
            r13 = 0
            if (r10 == 0) goto L_0x00b2
            int[] r0 = o0.C0318a.e
            android.content.res.TypedArray r10 = E.b.h(r2, r4, r3, r0)
            int r0 = r10.getResourceId(r13, r13)
            if (r0 == 0) goto L_0x00ad
            android.graphics.PorterDuff$Mode r14 = o0.r.f4411o
            java.lang.String r14 = "parser error"
            java.lang.String r15 = "VectorDrawableCompat"
            int r11 = android.os.Build.VERSION.SDK_INT
            if (r11 < r12) goto L_0x006c
            o0.r r9 = new o0.r
            r9.<init>()
            java.lang.ThreadLocal r11 = E.r.f121a
            android.graphics.drawable.Drawable r0 = E.k.a(r2, r0, r4)
            r9.f4364f = r0
            o0.q r0 = new o0.q
            android.graphics.drawable.Drawable r11 = r9.f4364f
            android.graphics.drawable.Drawable$ConstantState r11 = r11.getConstantState()
            r0.<init>(r11)
            goto L_0x009c
        L_0x006c:
            android.content.res.XmlResourceParser r0 = r2.getXml(r0)     // Catch:{ XmlPullParserException -> 0x0092, IOException -> 0x0090 }
            android.util.AttributeSet r11 = android.util.Xml.asAttributeSet(r0)     // Catch:{ XmlPullParserException -> 0x0092, IOException -> 0x0090 }
        L_0x0074:
            int r12 = r0.next()     // Catch:{ XmlPullParserException -> 0x0092, IOException -> 0x0090 }
            if (r12 == r9) goto L_0x007d
            if (r12 == r7) goto L_0x007d
            goto L_0x0074
        L_0x007d:
            if (r12 != r9) goto L_0x0088
            o0.r r9 = new o0.r     // Catch:{ XmlPullParserException -> 0x0092, IOException -> 0x0090 }
            r9.<init>()     // Catch:{ XmlPullParserException -> 0x0092, IOException -> 0x0090 }
            r9.inflate(r2, r0, r11, r4)     // Catch:{ XmlPullParserException -> 0x0092, IOException -> 0x0090 }
            goto L_0x009c
        L_0x0088:
            org.xmlpull.v1.XmlPullParserException r0 = new org.xmlpull.v1.XmlPullParserException     // Catch:{ XmlPullParserException -> 0x0092, IOException -> 0x0090 }
            java.lang.String r9 = "No start tag found"
            r0.<init>(r9)     // Catch:{ XmlPullParserException -> 0x0092, IOException -> 0x0090 }
            throw r0     // Catch:{ XmlPullParserException -> 0x0092, IOException -> 0x0090 }
        L_0x0090:
            r0 = move-exception
            goto L_0x0094
        L_0x0092:
            r0 = move-exception
            goto L_0x0098
        L_0x0094:
            android.util.Log.e(r15, r14, r0)
            goto L_0x009b
        L_0x0098:
            android.util.Log.e(r15, r14, r0)
        L_0x009b:
            r9 = 0
        L_0x009c:
            r9.f4415k = r13
            j.f r0 = r1.f4361k
            r9.setCallback(r0)
            o0.r r0 = r8.f4352a
            if (r0 == 0) goto L_0x00ab
            r11 = 0
            r0.setCallback(r11)
        L_0x00ab:
            r8.f4352a = r9
        L_0x00ad:
            r10.recycle()
            goto L_0x0182
        L_0x00b2:
            java.lang.String r9 = "target"
            boolean r0 = r9.equals(r0)
            if (r0 == 0) goto L_0x0182
            int[] r0 = o0.C0318a.f4346f
            android.content.res.TypedArray r0 = r2.obtainAttributes(r3, r0)
            java.lang.String r9 = r0.getString(r13)
            int r10 = r0.getResourceId(r7, r13)
            if (r10 == 0) goto L_0x017f
            android.content.Context r11 = r1.f4359h
            if (r11 == 0) goto L_0x0174
            int r13 = android.os.Build.VERSION.SDK_INT
            if (r13 < r12) goto L_0x00d7
            android.animation.Animator r10 = android.animation.AnimatorInflater.loadAnimator(r11, r10)
            goto L_0x00fa
        L_0x00d7:
            android.content.res.Resources r12 = r11.getResources()
            android.content.res.Resources$Theme r18 = r11.getTheme()
            java.lang.String r13 = "Can't load animation resource ID #0x"
            android.content.res.XmlResourceParser r14 = r12.getAnimation(r10)     // Catch:{ XmlPullParserException -> 0x0152, IOException -> 0x0134, all -> 0x0130 }
            android.util.AttributeSet r20 = android.util.Xml.asAttributeSet(r14)     // Catch:{ XmlPullParserException -> 0x012d, IOException -> 0x012a, all -> 0x0127 }
            r21 = 0
            r22 = 0
            r16 = r11
            r17 = r12
            r19 = r14
            android.animation.Animator r10 = o0.C0318a.a(r16, r17, r18, r19, r20, r21, r22)     // Catch:{ XmlPullParserException -> 0x012d, IOException -> 0x012a, all -> 0x0127 }
            r14.close()
        L_0x00fa:
            o0.r r11 = r8.f4352a
            o0.p r11 = r11.f4412g
            o0.o r11 = r11.f4401b
            r.b r11 = r11.f4399o
            r12 = 0
            java.lang.Object r11 = r11.getOrDefault(r9, r12)
            r10.setTarget(r11)
            java.util.ArrayList r11 = r8.f4354c
            if (r11 != 0) goto L_0x011c
            java.util.ArrayList r11 = new java.util.ArrayList
            r11.<init>()
            r8.f4354c = r11
            r.b r11 = new r.b
            r11.<init>()
            r8.f4355d = r11
        L_0x011c:
            java.util.ArrayList r11 = r8.f4354c
            r11.add(r10)
            r.b r8 = r8.f4355d
            r8.put(r10, r9)
            goto L_0x017f
        L_0x0127:
            r0 = move-exception
            r11 = r14
            goto L_0x016e
        L_0x012a:
            r0 = move-exception
            r11 = r14
            goto L_0x0137
        L_0x012d:
            r0 = move-exception
            r11 = r14
            goto L_0x0155
        L_0x0130:
            r0 = move-exception
            r12 = 0
            r11 = r12
            goto L_0x016e
        L_0x0134:
            r0 = move-exception
            r12 = 0
            r11 = r12
        L_0x0137:
            android.content.res.Resources$NotFoundException r2 = new android.content.res.Resources$NotFoundException     // Catch:{ all -> 0x0150 }
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ all -> 0x0150 }
            r3.<init>(r13)     // Catch:{ all -> 0x0150 }
            java.lang.String r4 = java.lang.Integer.toHexString(r10)     // Catch:{ all -> 0x0150 }
            r3.append(r4)     // Catch:{ all -> 0x0150 }
            java.lang.String r3 = r3.toString()     // Catch:{ all -> 0x0150 }
            r2.<init>(r3)     // Catch:{ all -> 0x0150 }
            r2.initCause(r0)     // Catch:{ all -> 0x0150 }
            throw r2     // Catch:{ all -> 0x0150 }
        L_0x0150:
            r0 = move-exception
            goto L_0x016e
        L_0x0152:
            r0 = move-exception
            r12 = 0
            r11 = r12
        L_0x0155:
            android.content.res.Resources$NotFoundException r2 = new android.content.res.Resources$NotFoundException     // Catch:{ all -> 0x0150 }
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ all -> 0x0150 }
            r3.<init>(r13)     // Catch:{ all -> 0x0150 }
            java.lang.String r4 = java.lang.Integer.toHexString(r10)     // Catch:{ all -> 0x0150 }
            r3.append(r4)     // Catch:{ all -> 0x0150 }
            java.lang.String r3 = r3.toString()     // Catch:{ all -> 0x0150 }
            r2.<init>(r3)     // Catch:{ all -> 0x0150 }
            r2.initCause(r0)     // Catch:{ all -> 0x0150 }
            throw r2     // Catch:{ all -> 0x0150 }
        L_0x016e:
            if (r11 == 0) goto L_0x0173
            r11.close()
        L_0x0173:
            throw r0
        L_0x0174:
            r0.recycle()
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r2 = "Context can't be null when inflating animators"
            r0.<init>(r2)
            throw r0
        L_0x017f:
            r0.recycle()
        L_0x0182:
            int r0 = r25.next()
            goto L_0x001e
        L_0x0188:
            android.animation.AnimatorSet r0 = r8.f4353b
            if (r0 != 0) goto L_0x0193
            android.animation.AnimatorSet r0 = new android.animation.AnimatorSet
            r0.<init>()
            r8.f4353b = r0
        L_0x0193:
            android.animation.AnimatorSet r0 = r8.f4353b
            java.util.ArrayList r2 = r8.f4354c
            r0.playTogether(r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: o0.f.inflate(android.content.res.Resources, org.xmlpull.v1.XmlPullParser, android.util.AttributeSet, android.content.res.Resources$Theme):void");
    }

    public final void applyTheme(Resources.Theme theme) {
        Drawable drawable = this.f4364f;
        if (drawable != null) {
            a.a(drawable, theme);
        }
    }

    public final boolean canApplyTheme() {
        Drawable drawable = this.f4364f;
        if (drawable != null) {
            return a.b(drawable);
        }
        return false;
    }

    public final void draw(Canvas canvas) {
        Drawable drawable = this.f4364f;
        if (drawable != null) {
            drawable.draw(canvas);
            return;
        }
        d dVar = this.f4358g;
        dVar.f4352a.draw(canvas);
        if (dVar.f4353b.isStarted()) {
            invalidateSelf();
        }
    }

    public final int getAlpha() {
        Drawable drawable = this.f4364f;
        if (drawable != null) {
            return drawable.getAlpha();
        }
        return this.f4358g.f4352a.getAlpha();
    }

    public final int getChangingConfigurations() {
        Drawable drawable = this.f4364f;
        if (drawable != null) {
            return drawable.getChangingConfigurations();
        }
        int changingConfigurations = super.getChangingConfigurations();
        this.f4358g.getClass();
        return changingConfigurations;
    }

    public final ColorFilter getColorFilter() {
        Drawable drawable = this.f4364f;
        if (drawable != null) {
            return a.c(drawable);
        }
        return this.f4358g.f4352a.getColorFilter();
    }

    public final Drawable.ConstantState getConstantState() {
        if (this.f4364f == null || Build.VERSION.SDK_INT < 24) {
            return null;
        }
        return new e(this.f4364f.getConstantState());
    }

    public final int getIntrinsicHeight() {
        Drawable drawable = this.f4364f;
        if (drawable != null) {
            return drawable.getIntrinsicHeight();
        }
        return this.f4358g.f4352a.getIntrinsicHeight();
    }

    public final int getIntrinsicWidth() {
        Drawable drawable = this.f4364f;
        if (drawable != null) {
            return drawable.getIntrinsicWidth();
        }
        return this.f4358g.f4352a.getIntrinsicWidth();
    }

    public final int getOpacity() {
        Drawable drawable = this.f4364f;
        if (drawable != null) {
            return drawable.getOpacity();
        }
        return this.f4358g.f4352a.getOpacity();
    }

    public final boolean isAutoMirrored() {
        Drawable drawable = this.f4364f;
        if (drawable != null) {
            return drawable.isAutoMirrored();
        }
        return this.f4358g.f4352a.isAutoMirrored();
    }

    public final boolean isRunning() {
        Drawable drawable = this.f4364f;
        if (drawable != null) {
            return ((AnimatedVectorDrawable) drawable).isRunning();
        }
        return this.f4358g.f4353b.isRunning();
    }

    public final boolean isStateful() {
        Drawable drawable = this.f4364f;
        if (drawable != null) {
            return drawable.isStateful();
        }
        return this.f4358g.f4352a.isStateful();
    }

    public final Drawable mutate() {
        Drawable drawable = this.f4364f;
        if (drawable != null) {
            drawable.mutate();
        }
        return this;
    }

    public final void onBoundsChange(Rect rect) {
        Drawable drawable = this.f4364f;
        if (drawable != null) {
            drawable.setBounds(rect);
        } else {
            this.f4358g.f4352a.setBounds(rect);
        }
    }

    public final boolean onLevelChange(int i2) {
        Drawable drawable = this.f4364f;
        if (drawable != null) {
            return drawable.setLevel(i2);
        }
        return this.f4358g.f4352a.setLevel(i2);
    }

    public final boolean onStateChange(int[] iArr) {
        Drawable drawable = this.f4364f;
        if (drawable != null) {
            return drawable.setState(iArr);
        }
        return this.f4358g.f4352a.setState(iArr);
    }

    public final void setAlpha(int i2) {
        Drawable drawable = this.f4364f;
        if (drawable != null) {
            drawable.setAlpha(i2);
        } else {
            this.f4358g.f4352a.setAlpha(i2);
        }
    }

    public final void setAutoMirrored(boolean z2) {
        Drawable drawable = this.f4364f;
        if (drawable != null) {
            drawable.setAutoMirrored(z2);
        } else {
            this.f4358g.f4352a.setAutoMirrored(z2);
        }
    }

    public final void setColorFilter(ColorFilter colorFilter) {
        Drawable drawable = this.f4364f;
        if (drawable != null) {
            drawable.setColorFilter(colorFilter);
        } else {
            this.f4358g.f4352a.setColorFilter(colorFilter);
        }
    }

    public final void setTint(int i2) {
        Drawable drawable = this.f4364f;
        if (drawable != null) {
            C0320a.D0(drawable, i2);
        } else {
            this.f4358g.f4352a.setTint(i2);
        }
    }

    public final void setTintList(ColorStateList colorStateList) {
        Drawable drawable = this.f4364f;
        if (drawable != null) {
            a.h(drawable, colorStateList);
        } else {
            this.f4358g.f4352a.setTintList(colorStateList);
        }
    }

    public final void setTintMode(PorterDuff.Mode mode) {
        Drawable drawable = this.f4364f;
        if (drawable != null) {
            a.i(drawable, mode);
        } else {
            this.f4358g.f4352a.setTintMode(mode);
        }
    }

    public final boolean setVisible(boolean z2, boolean z3) {
        Drawable drawable = this.f4364f;
        if (drawable != null) {
            return drawable.setVisible(z2, z3);
        }
        this.f4358g.f4352a.setVisible(z2, z3);
        return super.setVisible(z2, z3);
    }

    public final void start() {
        Drawable drawable = this.f4364f;
        if (drawable != null) {
            ((AnimatedVectorDrawable) drawable).start();
            return;
        }
        d dVar = this.f4358g;
        if (!dVar.f4353b.isStarted()) {
            dVar.f4353b.start();
            invalidateSelf();
        }
    }

    public final void stop() {
        Drawable drawable = this.f4364f;
        if (drawable != null) {
            ((AnimatedVectorDrawable) drawable).stop();
        } else {
            this.f4358g.f4353b.end();
        }
    }

    /* JADX WARNING: type inference failed for: r2v1, types: [android.graphics.drawable.Drawable$ConstantState, o0.d] */
    public f(Context context) {
        this.f4359h = context;
        this.f4358g = new Drawable.ConstantState();
    }

    public final void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet) {
        inflate(resources, xmlPullParser, attributeSet, (Resources.Theme) null);
    }
}
