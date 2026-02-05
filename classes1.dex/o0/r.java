package o0;

import E.b;
import E.c;
import G.a;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import java.util.ArrayDeque;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import p0.C0320a;

public final class r extends i {

    /* renamed from: o  reason: collision with root package name */
    public static final PorterDuff.Mode f4411o = PorterDuff.Mode.SRC_IN;

    /* renamed from: g  reason: collision with root package name */
    public p f4412g;

    /* renamed from: h  reason: collision with root package name */
    public PorterDuffColorFilter f4413h;
    public ColorFilter i;

    /* renamed from: j  reason: collision with root package name */
    public boolean f4414j;

    /* renamed from: k  reason: collision with root package name */
    public boolean f4415k = true;

    /* renamed from: l  reason: collision with root package name */
    public final float[] f4416l = new float[9];

    /* renamed from: m  reason: collision with root package name */
    public final Matrix f4417m = new Matrix();

    /* renamed from: n  reason: collision with root package name */
    public final Rect f4418n = new Rect();

    /* JADX WARNING: type inference failed for: r0v5, types: [o0.p, android.graphics.drawable.Drawable$ConstantState] */
    public r() {
        ? constantState = new Drawable.ConstantState();
        constantState.f4402c = null;
        constantState.f4403d = f4411o;
        constantState.f4401b = new o();
        this.f4412g = constantState;
    }

    public final void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet) {
        Drawable drawable = this.f4364f;
        if (drawable != null) {
            drawable.inflate(resources, xmlPullParser, attributeSet);
        } else {
            inflate(resources, xmlPullParser, attributeSet, (Resources.Theme) null);
        }
    }

    public final PorterDuffColorFilter a(ColorStateList colorStateList, PorterDuff.Mode mode) {
        if (colorStateList == null || mode == null) {
            return null;
        }
        return new PorterDuffColorFilter(colorStateList.getColorForState(getState(), 0), mode);
    }

    public final boolean canApplyTheme() {
        Drawable drawable = this.f4364f;
        if (drawable == null) {
            return false;
        }
        a.b(drawable);
        return false;
    }

    public final void draw(Canvas canvas) {
        Paint paint;
        Canvas canvas2 = canvas;
        Drawable drawable = this.f4364f;
        if (drawable != null) {
            drawable.draw(canvas2);
            return;
        }
        Rect rect = this.f4418n;
        copyBounds(rect);
        if (rect.width() > 0 && rect.height() > 0) {
            ColorFilter colorFilter = this.i;
            if (colorFilter == null) {
                colorFilter = this.f4413h;
            }
            Matrix matrix = this.f4417m;
            canvas2.getMatrix(matrix);
            float[] fArr = this.f4416l;
            matrix.getValues(fArr);
            float abs = Math.abs(fArr[0]);
            float abs2 = Math.abs(fArr[4]);
            float abs3 = Math.abs(fArr[1]);
            float abs4 = Math.abs(fArr[3]);
            if (!(abs3 == 0.0f && abs4 == 0.0f)) {
                abs = 1.0f;
                abs2 = 1.0f;
            }
            int min = Math.min(2048, (int) (((float) rect.width()) * abs));
            int min2 = Math.min(2048, (int) (((float) rect.height()) * abs2));
            if (min > 0 && min2 > 0) {
                int save = canvas.save();
                canvas2.translate((float) rect.left, (float) rect.top);
                if (isAutoMirrored() && C0320a.R(this) == 1) {
                    canvas2.translate((float) rect.width(), 0.0f);
                    canvas2.scale(-1.0f, 1.0f);
                }
                rect.offsetTo(0, 0);
                p pVar = this.f4412g;
                Bitmap bitmap = pVar.f4404f;
                if (!(bitmap != null && min == bitmap.getWidth() && min2 == pVar.f4404f.getHeight())) {
                    pVar.f4404f = Bitmap.createBitmap(min, min2, Bitmap.Config.ARGB_8888);
                    pVar.f4408k = true;
                }
                if (!this.f4415k) {
                    p pVar2 = this.f4412g;
                    pVar2.f4404f.eraseColor(0);
                    Canvas canvas3 = new Canvas(pVar2.f4404f);
                    o oVar = pVar2.f4401b;
                    oVar.a(oVar.f4392g, o.f4386p, canvas3, min, min2);
                } else {
                    p pVar3 = this.f4412g;
                    if (!(!pVar3.f4408k && pVar3.f4405g == pVar3.f4402c && pVar3.f4406h == pVar3.f4403d && pVar3.f4407j == pVar3.e && pVar3.i == pVar3.f4401b.getRootAlpha())) {
                        p pVar4 = this.f4412g;
                        pVar4.f4404f.eraseColor(0);
                        Canvas canvas4 = new Canvas(pVar4.f4404f);
                        o oVar2 = pVar4.f4401b;
                        oVar2.a(oVar2.f4392g, o.f4386p, canvas4, min, min2);
                        p pVar5 = this.f4412g;
                        pVar5.f4405g = pVar5.f4402c;
                        pVar5.f4406h = pVar5.f4403d;
                        pVar5.i = pVar5.f4401b.getRootAlpha();
                        pVar5.f4407j = pVar5.e;
                        pVar5.f4408k = false;
                    }
                }
                p pVar6 = this.f4412g;
                if (pVar6.f4401b.getRootAlpha() >= 255 && colorFilter == null) {
                    paint = null;
                } else {
                    if (pVar6.f4409l == null) {
                        Paint paint2 = new Paint();
                        pVar6.f4409l = paint2;
                        paint2.setFilterBitmap(true);
                    }
                    pVar6.f4409l.setAlpha(pVar6.f4401b.getRootAlpha());
                    pVar6.f4409l.setColorFilter(colorFilter);
                    paint = pVar6.f4409l;
                }
                canvas2.drawBitmap(pVar6.f4404f, (Rect) null, rect, paint);
                canvas2.restoreToCount(save);
            }
        }
    }

    public final int getAlpha() {
        Drawable drawable = this.f4364f;
        if (drawable != null) {
            return drawable.getAlpha();
        }
        return this.f4412g.f4401b.getRootAlpha();
    }

    public final int getChangingConfigurations() {
        Drawable drawable = this.f4364f;
        if (drawable != null) {
            return drawable.getChangingConfigurations();
        }
        return super.getChangingConfigurations() | this.f4412g.getChangingConfigurations();
    }

    public final ColorFilter getColorFilter() {
        Drawable drawable = this.f4364f;
        if (drawable != null) {
            return a.c(drawable);
        }
        return this.i;
    }

    public final Drawable.ConstantState getConstantState() {
        if (this.f4364f != null && Build.VERSION.SDK_INT >= 24) {
            return new q(this.f4364f.getConstantState());
        }
        this.f4412g.f4400a = getChangingConfigurations();
        return this.f4412g;
    }

    public final int getIntrinsicHeight() {
        Drawable drawable = this.f4364f;
        if (drawable != null) {
            return drawable.getIntrinsicHeight();
        }
        return (int) this.f4412g.f4401b.i;
    }

    public final int getIntrinsicWidth() {
        Drawable drawable = this.f4364f;
        if (drawable != null) {
            return drawable.getIntrinsicWidth();
        }
        return (int) this.f4412g.f4401b.f4393h;
    }

    public final int getOpacity() {
        Drawable drawable = this.f4364f;
        if (drawable != null) {
            return drawable.getOpacity();
        }
        return -3;
    }

    public final void invalidateSelf() {
        Drawable drawable = this.f4364f;
        if (drawable != null) {
            drawable.invalidateSelf();
        } else {
            super.invalidateSelf();
        }
    }

    public final boolean isAutoMirrored() {
        Drawable drawable = this.f4364f;
        if (drawable != null) {
            return drawable.isAutoMirrored();
        }
        return this.f4412g.e;
    }

    public final boolean isStateful() {
        ColorStateList colorStateList;
        Drawable drawable = this.f4364f;
        if (drawable != null) {
            return drawable.isStateful();
        }
        if (!super.isStateful()) {
            p pVar = this.f4412g;
            if (pVar != null) {
                o oVar = pVar.f4401b;
                if (oVar.f4398n == null) {
                    oVar.f4398n = Boolean.valueOf(oVar.f4392g.a());
                }
                if (oVar.f4398n.booleanValue() || ((colorStateList = this.f4412g.f4402c) != null && colorStateList.isStateful())) {
                    return true;
                }
            }
            return false;
        }
        return true;
    }

    /* JADX WARNING: type inference failed for: r0v3, types: [o0.p, android.graphics.drawable.Drawable$ConstantState] */
    public final Drawable mutate() {
        Drawable drawable = this.f4364f;
        if (drawable != null) {
            drawable.mutate();
            return this;
        }
        if (!this.f4414j && super.mutate() == this) {
            p pVar = this.f4412g;
            ? constantState = new Drawable.ConstantState();
            constantState.f4402c = null;
            constantState.f4403d = f4411o;
            if (pVar != null) {
                constantState.f4400a = pVar.f4400a;
                o oVar = new o(pVar.f4401b);
                constantState.f4401b = oVar;
                if (pVar.f4401b.e != null) {
                    oVar.e = new Paint(pVar.f4401b.e);
                }
                if (pVar.f4401b.f4390d != null) {
                    constantState.f4401b.f4390d = new Paint(pVar.f4401b.f4390d);
                }
                constantState.f4402c = pVar.f4402c;
                constantState.f4403d = pVar.f4403d;
                constantState.e = pVar.e;
            }
            this.f4412g = constantState;
            this.f4414j = true;
        }
        return this;
    }

    public final void onBoundsChange(Rect rect) {
        Drawable drawable = this.f4364f;
        if (drawable != null) {
            drawable.setBounds(rect);
        }
    }

    public final boolean onStateChange(int[] iArr) {
        boolean z2;
        PorterDuff.Mode mode;
        Drawable drawable = this.f4364f;
        if (drawable != null) {
            return drawable.setState(iArr);
        }
        p pVar = this.f4412g;
        ColorStateList colorStateList = pVar.f4402c;
        if (colorStateList == null || (mode = pVar.f4403d) == null) {
            z2 = false;
        } else {
            this.f4413h = a(colorStateList, mode);
            invalidateSelf();
            z2 = true;
        }
        o oVar = pVar.f4401b;
        if (oVar.f4398n == null) {
            oVar.f4398n = Boolean.valueOf(oVar.f4392g.a());
        }
        if (oVar.f4398n.booleanValue()) {
            boolean b2 = pVar.f4401b.f4392g.b(iArr);
            pVar.f4408k |= b2;
            if (b2) {
                invalidateSelf();
                return true;
            }
        }
        return z2;
    }

    public final void scheduleSelf(Runnable runnable, long j2) {
        Drawable drawable = this.f4364f;
        if (drawable != null) {
            drawable.scheduleSelf(runnable, j2);
        } else {
            super.scheduleSelf(runnable, j2);
        }
    }

    public final void setAlpha(int i2) {
        Drawable drawable = this.f4364f;
        if (drawable != null) {
            drawable.setAlpha(i2);
        } else if (this.f4412g.f4401b.getRootAlpha() != i2) {
            this.f4412g.f4401b.setRootAlpha(i2);
            invalidateSelf();
        }
    }

    public final void setAutoMirrored(boolean z2) {
        Drawable drawable = this.f4364f;
        if (drawable != null) {
            drawable.setAutoMirrored(z2);
        } else {
            this.f4412g.e = z2;
        }
    }

    public final void setColorFilter(ColorFilter colorFilter) {
        Drawable drawable = this.f4364f;
        if (drawable != null) {
            drawable.setColorFilter(colorFilter);
            return;
        }
        this.i = colorFilter;
        invalidateSelf();
    }

    public final void setTint(int i2) {
        Drawable drawable = this.f4364f;
        if (drawable != null) {
            C0320a.D0(drawable, i2);
        } else {
            setTintList(ColorStateList.valueOf(i2));
        }
    }

    public final void setTintList(ColorStateList colorStateList) {
        Drawable drawable = this.f4364f;
        if (drawable != null) {
            a.h(drawable, colorStateList);
            return;
        }
        p pVar = this.f4412g;
        if (pVar.f4402c != colorStateList) {
            pVar.f4402c = colorStateList;
            this.f4413h = a(colorStateList, pVar.f4403d);
            invalidateSelf();
        }
    }

    public final void setTintMode(PorterDuff.Mode mode) {
        Drawable drawable = this.f4364f;
        if (drawable != null) {
            a.i(drawable, mode);
            return;
        }
        p pVar = this.f4412g;
        if (pVar.f4403d != mode) {
            pVar.f4403d = mode;
            this.f4413h = a(pVar.f4402c, mode);
            invalidateSelf();
        }
    }

    public final boolean setVisible(boolean z2, boolean z3) {
        Drawable drawable = this.f4364f;
        if (drawable != null) {
            return drawable.setVisible(z2, z3);
        }
        return super.setVisible(z2, z3);
    }

    public final void unscheduleSelf(Runnable runnable) {
        Drawable drawable = this.f4364f;
        if (drawable != null) {
            drawable.unscheduleSelf(runnable);
        } else {
            super.unscheduleSelf(runnable);
        }
    }

    /* JADX WARNING: type inference failed for: r9v19, types: [o0.n, java.lang.Object, o0.k] */
    public final void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) {
        int i2;
        o oVar;
        int i3;
        int i4;
        int i5;
        Paint.Join join;
        Paint.Cap cap;
        int i6;
        Paint.Join join2;
        Resources resources2 = resources;
        XmlPullParser xmlPullParser2 = xmlPullParser;
        AttributeSet attributeSet2 = attributeSet;
        Resources.Theme theme2 = theme;
        Drawable drawable = this.f4364f;
        if (drawable != null) {
            a.d(drawable, resources2, xmlPullParser2, attributeSet2, theme2);
            return;
        }
        p pVar = this.f4412g;
        pVar.f4401b = new o();
        TypedArray h2 = b.h(resources2, theme2, attributeSet2, C0318a.f4342a);
        p pVar2 = this.f4412g;
        o oVar2 = pVar2.f4401b;
        if (!b.e(xmlPullParser2, "tintMode")) {
            i2 = -1;
        } else {
            i2 = h2.getInt(6, -1);
        }
        PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
        int i7 = 3;
        if (i2 == 3) {
            mode = PorterDuff.Mode.SRC_OVER;
        } else if (i2 != 5) {
            if (i2 != 9) {
                switch (i2) {
                    case 14:
                        mode = PorterDuff.Mode.MULTIPLY;
                        break;
                    case 15:
                        mode = PorterDuff.Mode.SCREEN;
                        break;
                    case 16:
                        mode = PorterDuff.Mode.ADD;
                        break;
                }
            } else {
                mode = PorterDuff.Mode.SRC_ATOP;
            }
        }
        pVar2.f4403d = mode;
        int i8 = 1;
        ColorStateList colorStateList = null;
        if (b.e(xmlPullParser2, "tint")) {
            TypedValue typedValue = new TypedValue();
            h2.getValue(1, typedValue);
            int i9 = typedValue.type;
            if (i9 == 2) {
                throw new UnsupportedOperationException("Failed to resolve attribute at index 1: " + typedValue);
            } else if (i9 < 28 || i9 > 31) {
                Resources resources3 = h2.getResources();
                int resourceId = h2.getResourceId(1, 0);
                ThreadLocal threadLocal = c.f92a;
                try {
                    colorStateList = c.a(resources3, resources3.getXml(resourceId), theme2);
                } catch (Exception e) {
                    Log.e("CSLCompat", "Failed to inflate ColorStateList.", e);
                }
            } else {
                colorStateList = ColorStateList.valueOf(typedValue.data);
            }
        }
        ColorStateList colorStateList2 = colorStateList;
        if (colorStateList2 != null) {
            pVar2.f4402c = colorStateList2;
        }
        boolean z2 = pVar2.e;
        if (b.e(xmlPullParser2, "autoMirrored")) {
            z2 = h2.getBoolean(5, z2);
        }
        pVar2.e = z2;
        float f2 = oVar2.f4394j;
        if (b.e(xmlPullParser2, "viewportWidth")) {
            f2 = h2.getFloat(7, f2);
        }
        oVar2.f4394j = f2;
        float f3 = oVar2.f4395k;
        if (b.e(xmlPullParser2, "viewportHeight")) {
            f3 = h2.getFloat(8, f3);
        }
        oVar2.f4395k = f3;
        if (oVar2.f4394j <= 0.0f) {
            throw new XmlPullParserException(h2.getPositionDescription() + "<vector> tag requires viewportWidth > 0");
        } else if (f3 > 0.0f) {
            oVar2.f4393h = h2.getDimension(3, oVar2.f4393h);
            float dimension = h2.getDimension(2, oVar2.i);
            oVar2.i = dimension;
            if (oVar2.f4393h <= 0.0f) {
                throw new XmlPullParserException(h2.getPositionDescription() + "<vector> tag requires width > 0");
            } else if (dimension > 0.0f) {
                float alpha = oVar2.getAlpha();
                if (b.e(xmlPullParser2, "alpha")) {
                    alpha = h2.getFloat(4, alpha);
                }
                oVar2.setAlpha(alpha);
                String string = h2.getString(0);
                if (string != null) {
                    oVar2.f4397m = string;
                    oVar2.f4399o.put(string, oVar2);
                }
                h2.recycle();
                pVar.f4400a = getChangingConfigurations();
                pVar.f4408k = true;
                p pVar3 = this.f4412g;
                o oVar3 = pVar3.f4401b;
                ArrayDeque arrayDeque = new ArrayDeque();
                arrayDeque.push(oVar3.f4392g);
                int eventType = xmlPullParser.getEventType();
                int depth = xmlPullParser.getDepth() + 1;
                boolean z3 = true;
                while (eventType != i8 && (xmlPullParser.getDepth() >= depth || eventType != i7)) {
                    if (eventType == 2) {
                        String name = xmlPullParser.getName();
                        l lVar = (l) arrayDeque.peek();
                        boolean equals = "path".equals(name);
                        i3 = depth;
                        r.b bVar = oVar3.f4399o;
                        if (equals) {
                            ? nVar = new n();
                            nVar.e = 0.0f;
                            nVar.f4367g = 1.0f;
                            nVar.f4368h = 1.0f;
                            nVar.i = 0.0f;
                            nVar.f4369j = 1.0f;
                            nVar.f4370k = 0.0f;
                            Paint.Cap cap2 = Paint.Cap.BUTT;
                            nVar.f4371l = cap2;
                            Paint.Join join3 = Paint.Join.MITER;
                            nVar.f4372m = join3;
                            oVar = oVar3;
                            nVar.f4373n = 4.0f;
                            TypedArray h3 = b.h(resources2, theme2, attributeSet2, C0318a.f4344c);
                            if (b.e(xmlPullParser2, "pathData")) {
                                Paint.Cap cap3 = cap2;
                                String string2 = h3.getString(0);
                                if (string2 != null) {
                                    nVar.f4384b = string2;
                                }
                                String string3 = h3.getString(2);
                                if (string3 != null) {
                                    nVar.f4383a = C0320a.x(string3);
                                }
                                nVar.f4366f = b.c(h3, xmlPullParser2, theme2, "fillColor", 1);
                                float f4 = nVar.f4368h;
                                if (b.e(xmlPullParser2, "fillAlpha")) {
                                    f4 = h3.getFloat(12, f4);
                                }
                                nVar.f4368h = f4;
                                if (!b.e(xmlPullParser2, "strokeLineCap")) {
                                    i5 = -1;
                                } else {
                                    i5 = h3.getInt(8, -1);
                                }
                                Paint.Cap cap4 = nVar.f4371l;
                                if (i5 != 0) {
                                    join = join3;
                                    cap = i5 != 1 ? i5 != 2 ? cap4 : Paint.Cap.SQUARE : Paint.Cap.ROUND;
                                } else {
                                    join = join3;
                                    cap = cap3;
                                }
                                nVar.f4371l = cap;
                                if (!b.e(xmlPullParser2, "strokeLineJoin")) {
                                    i6 = -1;
                                } else {
                                    i6 = h3.getInt(9, -1);
                                }
                                Paint.Join join4 = nVar.f4372m;
                                if (i6 != 0) {
                                    join2 = i6 != 1 ? i6 != 2 ? join4 : Paint.Join.BEVEL : Paint.Join.ROUND;
                                } else {
                                    join2 = join;
                                }
                                nVar.f4372m = join2;
                                float f5 = nVar.f4373n;
                                if (b.e(xmlPullParser2, "strokeMiterLimit")) {
                                    f5 = h3.getFloat(10, f5);
                                }
                                nVar.f4373n = f5;
                                nVar.f4365d = b.c(h3, xmlPullParser2, theme2, "strokeColor", 3);
                                float f6 = nVar.f4367g;
                                if (b.e(xmlPullParser2, "strokeAlpha")) {
                                    f6 = h3.getFloat(11, f6);
                                }
                                nVar.f4367g = f6;
                                float f7 = nVar.e;
                                if (b.e(xmlPullParser2, "strokeWidth")) {
                                    f7 = h3.getFloat(4, f7);
                                }
                                nVar.e = f7;
                                float f8 = nVar.f4369j;
                                if (b.e(xmlPullParser2, "trimPathEnd")) {
                                    f8 = h3.getFloat(6, f8);
                                }
                                nVar.f4369j = f8;
                                float f9 = nVar.f4370k;
                                if (b.e(xmlPullParser2, "trimPathOffset")) {
                                    f9 = h3.getFloat(7, f9);
                                }
                                nVar.f4370k = f9;
                                float f10 = nVar.i;
                                if (b.e(xmlPullParser2, "trimPathStart")) {
                                    f10 = h3.getFloat(5, f10);
                                }
                                nVar.i = f10;
                                int i10 = nVar.f4385c;
                                if (b.e(xmlPullParser2, "fillType")) {
                                    i10 = h3.getInt(13, i10);
                                }
                                nVar.f4385c = i10;
                            }
                            h3.recycle();
                            lVar.f4375b.add(nVar);
                            if (nVar.getPathName() != null) {
                                bVar.put(nVar.getPathName(), nVar);
                            }
                            pVar3.f4400a = pVar3.f4400a;
                            z3 = false;
                        } else {
                            oVar = oVar3;
                            if ("clip-path".equals(name)) {
                                n nVar2 = new n();
                                if (b.e(xmlPullParser2, "pathData")) {
                                    TypedArray h4 = b.h(resources2, theme2, attributeSet2, C0318a.f4345d);
                                    String string4 = h4.getString(0);
                                    if (string4 != null) {
                                        nVar2.f4384b = string4;
                                    }
                                    String string5 = h4.getString(1);
                                    if (string5 != null) {
                                        nVar2.f4383a = C0320a.x(string5);
                                    }
                                    if (!b.e(xmlPullParser2, "fillType")) {
                                        i4 = 0;
                                    } else {
                                        i4 = h4.getInt(2, 0);
                                    }
                                    nVar2.f4385c = i4;
                                    h4.recycle();
                                }
                                lVar.f4375b.add(nVar2);
                                if (nVar2.getPathName() != null) {
                                    bVar.put(nVar2.getPathName(), nVar2);
                                }
                                pVar3.f4400a = pVar3.f4400a;
                            } else if ("group".equals(name)) {
                                l lVar2 = new l();
                                TypedArray h5 = b.h(resources2, theme2, attributeSet2, C0318a.f4343b);
                                float f11 = lVar2.f4376c;
                                if (b.e(xmlPullParser2, "rotation")) {
                                    f11 = h5.getFloat(5, f11);
                                }
                                lVar2.f4376c = f11;
                                lVar2.f4377d = h5.getFloat(1, lVar2.f4377d);
                                lVar2.e = h5.getFloat(2, lVar2.e);
                                float f12 = lVar2.f4378f;
                                if (b.e(xmlPullParser2, "scaleX")) {
                                    f12 = h5.getFloat(3, f12);
                                }
                                lVar2.f4378f = f12;
                                float f13 = lVar2.f4379g;
                                if (b.e(xmlPullParser2, "scaleY")) {
                                    f13 = h5.getFloat(4, f13);
                                }
                                lVar2.f4379g = f13;
                                float f14 = lVar2.f4380h;
                                if (b.e(xmlPullParser2, "translateX")) {
                                    f14 = h5.getFloat(6, f14);
                                }
                                lVar2.f4380h = f14;
                                float f15 = lVar2.i;
                                if (b.e(xmlPullParser2, "translateY")) {
                                    f15 = h5.getFloat(7, f15);
                                }
                                lVar2.i = f15;
                                String string6 = h5.getString(0);
                                if (string6 != null) {
                                    lVar2.f4382k = string6;
                                }
                                lVar2.c();
                                h5.recycle();
                                lVar.f4375b.add(lVar2);
                                arrayDeque.push(lVar2);
                                if (lVar2.getGroupName() != null) {
                                    bVar.put(lVar2.getGroupName(), lVar2);
                                }
                                pVar3.f4400a = pVar3.f4400a;
                            }
                        }
                    } else {
                        oVar = oVar3;
                        i3 = depth;
                        if (eventType == 3 && "group".equals(xmlPullParser.getName())) {
                            arrayDeque.pop();
                        }
                    }
                    eventType = xmlPullParser.next();
                    depth = i3;
                    oVar3 = oVar;
                    i8 = 1;
                    i7 = 3;
                }
                if (!z3) {
                    this.f4413h = a(pVar.f4402c, pVar.f4403d);
                    return;
                }
                throw new XmlPullParserException("no path defined");
            } else {
                throw new XmlPullParserException(h2.getPositionDescription() + "<vector> tag requires height > 0");
            }
        } else {
            throw new XmlPullParserException(h2.getPositionDescription() + "<vector> tag requires viewportHeight > 0");
        }
    }

    public r(p pVar) {
        this.f4412g = pVar;
        this.f4413h = a(pVar.f4402c, pVar.f4403d);
    }
}
