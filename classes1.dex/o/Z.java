package o;

import Q0.E;
import S.b;
import S.c;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.support.v4.media.session.t;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.TextView;
import g.C0096a;
import g1.o;
import java.lang.ref.WeakReference;
import java.util.Arrays;

public final class Z {

    /* renamed from: a  reason: collision with root package name */
    public final TextView f4154a;

    /* renamed from: b  reason: collision with root package name */
    public o f4155b;

    /* renamed from: c  reason: collision with root package name */
    public o f4156c;

    /* renamed from: d  reason: collision with root package name */
    public o f4157d;
    public o e;

    /* renamed from: f  reason: collision with root package name */
    public o f4158f;

    /* renamed from: g  reason: collision with root package name */
    public o f4159g;

    /* renamed from: h  reason: collision with root package name */
    public o f4160h;
    public final C0283i0 i;

    /* renamed from: j  reason: collision with root package name */
    public int f4161j = 0;

    /* renamed from: k  reason: collision with root package name */
    public int f4162k = -1;

    /* renamed from: l  reason: collision with root package name */
    public Typeface f4163l;

    /* renamed from: m  reason: collision with root package name */
    public boolean f4164m;

    /* JADX WARNING: type inference failed for: r2v1, types: [g1.o, java.lang.Object] */
    public static o c(Context context, C0302s sVar, int i2) {
        ColorStateList i3;
        synchronized (sVar) {
            i3 = sVar.f4296a.i(context, i2);
        }
        if (i3 == null) {
            return null;
        }
        ? obj = new Object();
        obj.f2743b = true;
        obj.f2744c = i3;
        return obj;
    }

    public static void h(EditorInfo editorInfo, InputConnection inputConnection, TextView textView) {
        int i2;
        int i3;
        CharSequence charSequence;
        int i4 = Build.VERSION.SDK_INT;
        if (i4 < 30 && inputConnection != null) {
            CharSequence text = textView.getText();
            if (i4 >= 30) {
                b.a(editorInfo, text);
                return;
            }
            text.getClass();
            if (i4 >= 30) {
                b.a(editorInfo, text);
                return;
            }
            int i5 = editorInfo.initialSelStart;
            int i6 = editorInfo.initialSelEnd;
            if (i5 > i6) {
                i2 = i6;
            } else {
                i2 = i5;
            }
            if (i5 <= i6) {
                i5 = i6;
            }
            int length = text.length();
            if (i2 < 0 || i5 > length) {
                c.a(editorInfo, (CharSequence) null, 0, 0);
                return;
            }
            int i7 = editorInfo.inputType & 4095;
            if (i7 == 129 || i7 == 225 || i7 == 18) {
                c.a(editorInfo, (CharSequence) null, 0, 0);
            } else if (length <= 2048) {
                c.a(editorInfo, text, i2, i5);
            } else {
                int i8 = i5 - i2;
                if (i8 > 1024) {
                    i3 = 0;
                } else {
                    i3 = i8;
                }
                int i9 = 2048 - i3;
                int min = Math.min(text.length() - i5, i9 - Math.min(i2, (int) (((double) i9) * 0.8d)));
                int min2 = Math.min(i2, i9 - min);
                int i10 = i2 - min2;
                if (Character.isLowSurrogate(text.charAt(i10))) {
                    i10++;
                    min2--;
                }
                if (Character.isHighSurrogate(text.charAt((i5 + min) - 1))) {
                    min--;
                }
                int i11 = min2 + i3;
                int i12 = i11 + min;
                if (i3 != i8) {
                    charSequence = TextUtils.concat(new CharSequence[]{text.subSequence(i10, i10 + min2), text.subSequence(i5, min + i5)});
                } else {
                    charSequence = text.subSequence(i10, i12 + i10);
                }
                c.a(editorInfo, charSequence, min2, i11);
            }
        }
    }

    public final void a(Drawable drawable, o oVar) {
        if (drawable != null && oVar != null) {
            C0302s.e(drawable, oVar, this.f4154a.getDrawableState());
        }
    }

    public final void b() {
        o oVar = this.f4155b;
        TextView textView = this.f4154a;
        if (!(oVar == null && this.f4156c == null && this.f4157d == null && this.e == null)) {
            Drawable[] compoundDrawables = textView.getCompoundDrawables();
            a(compoundDrawables[0], this.f4155b);
            a(compoundDrawables[1], this.f4156c);
            a(compoundDrawables[2], this.f4157d);
            a(compoundDrawables[3], this.e);
        }
        if (this.f4158f != null || this.f4159g != null) {
            Drawable[] compoundDrawablesRelative = textView.getCompoundDrawablesRelative();
            a(compoundDrawablesRelative[0], this.f4158f);
            a(compoundDrawablesRelative[2], this.f4159g);
        }
    }

    public final ColorStateList d() {
        o oVar = this.f4160h;
        if (oVar != null) {
            return (ColorStateList) oVar.f2744c;
        }
        return null;
    }

    public final PorterDuff.Mode e() {
        o oVar = this.f4160h;
        if (oVar != null) {
            return (PorterDuff.Mode) oVar.f2745d;
        }
        return null;
    }

    /* JADX WARNING: Removed duplicated region for block: B:113:0x0233  */
    /* JADX WARNING: Removed duplicated region for block: B:116:0x0243  */
    /* JADX WARNING: Removed duplicated region for block: B:118:0x0249  */
    /* JADX WARNING: Removed duplicated region for block: B:121:0x0252  */
    /* JADX WARNING: Removed duplicated region for block: B:122:0x0258  */
    /* JADX WARNING: Removed duplicated region for block: B:125:0x0261  */
    /* JADX WARNING: Removed duplicated region for block: B:127:0x0267  */
    /* JADX WARNING: Removed duplicated region for block: B:134:0x0287  */
    /* JADX WARNING: Removed duplicated region for block: B:141:0x02aa  */
    /* JADX WARNING: Removed duplicated region for block: B:157:0x02e1  */
    /* JADX WARNING: Removed duplicated region for block: B:164:0x02f1  */
    /* JADX WARNING: Removed duplicated region for block: B:170:0x0326  */
    /* JADX WARNING: Removed duplicated region for block: B:172:0x032d  */
    /* JADX WARNING: Removed duplicated region for block: B:175:0x0335  */
    /* JADX WARNING: Removed duplicated region for block: B:176:0x033a  */
    /* JADX WARNING: Removed duplicated region for block: B:179:0x0343  */
    /* JADX WARNING: Removed duplicated region for block: B:181:0x0349  */
    /* JADX WARNING: Removed duplicated region for block: B:184:0x0351  */
    /* JADX WARNING: Removed duplicated region for block: B:185:0x0356  */
    /* JADX WARNING: Removed duplicated region for block: B:188:0x035f  */
    /* JADX WARNING: Removed duplicated region for block: B:189:0x0364  */
    /* JADX WARNING: Removed duplicated region for block: B:192:0x036c  */
    /* JADX WARNING: Removed duplicated region for block: B:193:0x0371  */
    /* JADX WARNING: Removed duplicated region for block: B:223:0x03c8  */
    /* JADX WARNING: Removed duplicated region for block: B:225:0x03ce  */
    /* JADX WARNING: Removed duplicated region for block: B:227:0x03d4  */
    /* JADX WARNING: Removed duplicated region for block: B:229:0x03da  */
    /* JADX WARNING: Removed duplicated region for block: B:233:0x03e8  */
    /* JADX WARNING: Removed duplicated region for block: B:248:0x041c  */
    /* JADX WARNING: Removed duplicated region for block: B:256:0x044f  */
    /* JADX WARNING: Removed duplicated region for block: B:263:0x046d  */
    /* JADX WARNING: Removed duplicated region for block: B:266:0x0476  */
    /* JADX WARNING: Removed duplicated region for block: B:268:0x047b  */
    /* JADX WARNING: Removed duplicated region for block: B:271:0x0484  */
    /* JADX WARNING: Removed duplicated region for block: B:279:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x0106  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x010d  */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x011b  */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x0120  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void f(android.util.AttributeSet r29, int r30) {
        /*
            r28 = this;
            r0 = r28
            r7 = r29
            r8 = r30
            android.widget.TextView r9 = r0.f4154a
            android.content.Context r10 = r9.getContext()
            o.s r11 = o.C0302s.a()
            int[] r3 = g.C0096a.f2525h
            android.support.v4.media.session.t r12 = android.support.v4.media.session.t.A(r10, r7, r3, r8)
            android.content.Context r2 = r9.getContext()
            java.lang.Object r1 = r12.f1132c
            r5 = r1
            android.content.res.TypedArray r5 = (android.content.res.TypedArray) r5
            r1 = r9
            r4 = r29
            r6 = r30
            N.Q.o(r1, r2, r3, r4, r5, r6)
            java.lang.Object r1 = r12.f1132c
            android.content.res.TypedArray r1 = (android.content.res.TypedArray) r1
            r13 = 0
            r14 = -1
            int r2 = r1.getResourceId(r13, r14)
            r15 = 3
            boolean r3 = r1.hasValue(r15)
            if (r3 == 0) goto L_0x0042
            int r3 = r1.getResourceId(r15, r13)
            g1.o r3 = c(r10, r11, r3)
            r0.f4155b = r3
        L_0x0042:
            r6 = 1
            boolean r3 = r1.hasValue(r6)
            if (r3 == 0) goto L_0x0053
            int r3 = r1.getResourceId(r6, r13)
            g1.o r3 = c(r10, r11, r3)
            r0.f4156c = r3
        L_0x0053:
            r5 = 4
            boolean r3 = r1.hasValue(r5)
            if (r3 == 0) goto L_0x0064
            int r3 = r1.getResourceId(r5, r13)
            g1.o r3 = c(r10, r11, r3)
            r0.f4157d = r3
        L_0x0064:
            r4 = 2
            boolean r3 = r1.hasValue(r4)
            if (r3 == 0) goto L_0x0075
            int r3 = r1.getResourceId(r4, r13)
            g1.o r3 = c(r10, r11, r3)
            r0.e = r3
        L_0x0075:
            r3 = 5
            boolean r16 = r1.hasValue(r3)
            if (r16 == 0) goto L_0x0086
            int r4 = r1.getResourceId(r3, r13)
            g1.o r4 = c(r10, r11, r4)
            r0.f4158f = r4
        L_0x0086:
            r4 = 6
            boolean r17 = r1.hasValue(r4)
            if (r17 == 0) goto L_0x0097
            int r1 = r1.getResourceId(r4, r13)
            g1.o r1 = c(r10, r11, r1)
            r0.f4159g = r1
        L_0x0097:
            r12.C()
            android.text.method.TransformationMethod r1 = r9.getTransformationMethod()
            boolean r1 = r1 instanceof android.text.method.PasswordTransformationMethod
            int[] r12 = g.C0096a.f2539w
            r6 = 23
            r4 = 14
            if (r2 == r14) goto L_0x0125
            android.support.v4.media.session.t r3 = new android.support.v4.media.session.t
            android.content.res.TypedArray r2 = r10.obtainStyledAttributes(r2, r12)
            r3.<init>((android.content.Context) r10, (android.content.res.TypedArray) r2)
            if (r1 != 0) goto L_0x00c0
            boolean r22 = r2.hasValue(r4)
            if (r22 == 0) goto L_0x00c0
            boolean r22 = r2.getBoolean(r4, r13)
            r23 = 1
            goto L_0x00c4
        L_0x00c0:
            r22 = 0
            r23 = 0
        L_0x00c4:
            r0.n(r10, r3)
            int r14 = android.os.Build.VERSION.SDK_INT
            if (r14 >= r6) goto L_0x00f9
            boolean r24 = r2.hasValue(r15)
            if (r24 == 0) goto L_0x00d6
            android.content.res.ColorStateList r24 = r3.n(r15)
            goto L_0x00d8
        L_0x00d6:
            r24 = 0
        L_0x00d8:
            boolean r25 = r2.hasValue(r5)
            if (r25 == 0) goto L_0x00e4
            android.content.res.ColorStateList r25 = r3.n(r5)
            r5 = 5
            goto L_0x00e7
        L_0x00e4:
            r5 = 5
            r25 = 0
        L_0x00e7:
            boolean r17 = r2.hasValue(r5)
            if (r17 == 0) goto L_0x00f4
            android.content.res.ColorStateList r26 = r3.n(r5)
            r5 = 15
            goto L_0x0100
        L_0x00f4:
            r5 = 15
        L_0x00f6:
            r26 = 0
            goto L_0x0100
        L_0x00f9:
            r5 = 15
            r24 = 0
            r25 = 0
            goto L_0x00f6
        L_0x0100:
            boolean r20 = r2.hasValue(r5)
            if (r20 == 0) goto L_0x010d
            java.lang.String r27 = r2.getString(r5)
            r5 = 26
            goto L_0x0111
        L_0x010d:
            r5 = 26
            r27 = 0
        L_0x0111:
            if (r14 < r5) goto L_0x0120
            r5 = 13
            boolean r14 = r2.hasValue(r5)
            if (r14 == 0) goto L_0x0120
            java.lang.String r2 = r2.getString(r5)
            goto L_0x0121
        L_0x0120:
            r2 = 0
        L_0x0121:
            r3.C()
            goto L_0x0132
        L_0x0125:
            r2 = 0
            r22 = 0
            r23 = 0
            r24 = 0
            r25 = 0
            r26 = 0
            r27 = 0
        L_0x0132:
            android.support.v4.media.session.t r3 = new android.support.v4.media.session.t
            android.content.res.TypedArray r5 = r10.obtainStyledAttributes(r7, r12, r8, r13)
            r3.<init>((android.content.Context) r10, (android.content.res.TypedArray) r5)
            if (r1 != 0) goto L_0x014c
            boolean r12 = r5.hasValue(r4)
            if (r12 == 0) goto L_0x014c
            boolean r22 = r5.getBoolean(r4, r13)
            r4 = r22
            r23 = 1
            goto L_0x014e
        L_0x014c:
            r4 = r22
        L_0x014e:
            int r12 = android.os.Build.VERSION.SDK_INT
            if (r12 >= r6) goto L_0x0172
            boolean r6 = r5.hasValue(r15)
            if (r6 == 0) goto L_0x015c
            android.content.res.ColorStateList r24 = r3.n(r15)
        L_0x015c:
            r6 = 4
            boolean r14 = r5.hasValue(r6)
            if (r14 == 0) goto L_0x0167
            android.content.res.ColorStateList r25 = r3.n(r6)
        L_0x0167:
            r14 = 5
            boolean r17 = r5.hasValue(r14)
            if (r17 == 0) goto L_0x0172
            android.content.res.ColorStateList r26 = r3.n(r14)
        L_0x0172:
            r6 = r24
            r14 = r25
            r15 = r26
            r13 = 15
            boolean r24 = r5.hasValue(r13)
            if (r24 == 0) goto L_0x0184
            java.lang.String r27 = r5.getString(r13)
        L_0x0184:
            r19 = r2
            r13 = r27
            r2 = 26
            if (r12 < r2) goto L_0x019d
            r2 = 13
            boolean r21 = r5.hasValue(r2)
            if (r21 == 0) goto L_0x0198
            java.lang.String r19 = r5.getString(r2)
        L_0x0198:
            r2 = r19
            r19 = r11
            goto L_0x01a0
        L_0x019d:
            r2 = 13
            goto L_0x0198
        L_0x01a0:
            r11 = 28
            if (r12 < r11) goto L_0x01b6
            r11 = 0
            boolean r22 = r5.hasValue(r11)
            if (r22 == 0) goto L_0x01b6
            r7 = -1
            int r5 = r5.getDimensionPixelSize(r11, r7)
            if (r5 != 0) goto L_0x01b6
            r5 = 0
            r9.setTextSize(r11, r5)
        L_0x01b6:
            r0.n(r10, r3)
            r3.C()
            if (r6 == 0) goto L_0x01c1
            r9.setTextColor(r6)
        L_0x01c1:
            if (r14 == 0) goto L_0x01c6
            r9.setHintTextColor(r14)
        L_0x01c6:
            if (r15 == 0) goto L_0x01cb
            r9.setLinkTextColor(r15)
        L_0x01cb:
            if (r1 != 0) goto L_0x01d2
            if (r23 == 0) goto L_0x01d2
            r9.setAllCaps(r4)
        L_0x01d2:
            android.graphics.Typeface r1 = r0.f4163l
            if (r1 == 0) goto L_0x01e4
            int r3 = r0.f4162k
            r4 = -1
            if (r3 != r4) goto L_0x01e1
            int r3 = r0.f4161j
            r9.setTypeface(r1, r3)
            goto L_0x01e4
        L_0x01e1:
            r9.setTypeface(r1)
        L_0x01e4:
            if (r2 == 0) goto L_0x01e9
            o.X.d(r9, r2)
        L_0x01e9:
            r7 = 24
            if (r13 == 0) goto L_0x01f6
            if (r12 < r7) goto L_0x01f8
            android.os.LocaleList r1 = o.W.a(r13)
            o.W.b(r9, r1)
        L_0x01f6:
            r2 = 0
            goto L_0x0208
        L_0x01f8:
            java.lang.String r1 = ","
            java.lang.String[] r1 = r13.split(r1)
            r2 = 0
            r1 = r1[r2]
            java.util.Locale r1 = o.V.a(r1)
            r9.setTextLocale(r1)
        L_0x0208:
            int[] r11 = g.C0096a.i
            o.i0 r12 = r0.i
            android.content.Context r13 = r12.f4217j
            r14 = r29
            android.content.res.TypedArray r15 = r13.obtainStyledAttributes(r14, r11, r8, r2)
            android.widget.TextView r1 = r12.i
            android.content.Context r2 = r1.getContext()
            r3 = 13
            r4 = 15
            r5 = 5
            r6 = 0
            r7 = 13
            r3 = r11
            r7 = 2
            r4 = r29
            r7 = 5
            r5 = r15
            r6 = r30
            N.Q.o(r1, r2, r3, r4, r5, r6)
            boolean r1 = r15.hasValue(r7)
            if (r1 == 0) goto L_0x023a
            r1 = 0
            int r2 = r15.getInt(r7, r1)
            r12.f4210a = r2
        L_0x023a:
            r1 = 4
            boolean r2 = r15.hasValue(r1)
            r3 = -1082130432(0xffffffffbf800000, float:-1.0)
            if (r2 == 0) goto L_0x0249
            float r1 = r15.getDimension(r1, r3)
        L_0x0247:
            r2 = 2
            goto L_0x024c
        L_0x0249:
            r1 = -1082130432(0xffffffffbf800000, float:-1.0)
            goto L_0x0247
        L_0x024c:
            boolean r4 = r15.hasValue(r2)
            if (r4 == 0) goto L_0x0258
            float r4 = r15.getDimension(r2, r3)
            r2 = 1
            goto L_0x025b
        L_0x0258:
            r2 = 1
            r4 = -1082130432(0xffffffffbf800000, float:-1.0)
        L_0x025b:
            boolean r5 = r15.hasValue(r2)
            if (r5 == 0) goto L_0x0267
            float r5 = r15.getDimension(r2, r3)
        L_0x0265:
            r6 = 3
            goto L_0x026a
        L_0x0267:
            r5 = -1082130432(0xffffffffbf800000, float:-1.0)
            goto L_0x0265
        L_0x026a:
            boolean r8 = r15.hasValue(r6)
            if (r8 == 0) goto L_0x02a1
            r8 = 0
            int r7 = r15.getResourceId(r6, r8)
            if (r7 <= 0) goto L_0x02a1
            android.content.res.Resources r6 = r15.getResources()
            android.content.res.TypedArray r6 = r6.obtainTypedArray(r7)
            int r7 = r6.length()
            int[] r8 = new int[r7]
            if (r7 <= 0) goto L_0x029e
            r3 = 0
        L_0x0288:
            if (r3 >= r7) goto L_0x0295
            r2 = -1
            int r18 = r6.getDimensionPixelSize(r3, r2)
            r8[r3] = r18
            int r3 = r3 + 1
            r2 = 1
            goto L_0x0288
        L_0x0295:
            int[] r2 = o.C0283i0.b(r8)
            r12.f4214f = r2
            r12.i()
        L_0x029e:
            r6.recycle()
        L_0x02a1:
            r15.recycle()
            boolean r2 = r12.j()
            if (r2 == 0) goto L_0x02e1
            int r2 = r12.f4210a
            r3 = 1
            if (r2 != r3) goto L_0x02e4
            boolean r2 = r12.f4215g
            if (r2 != 0) goto L_0x02dd
            android.content.res.Resources r2 = r13.getResources()
            android.util.DisplayMetrics r2 = r2.getDisplayMetrics()
            r3 = -1082130432(0xffffffffbf800000, float:-1.0)
            int r6 = (r4 > r3 ? 1 : (r4 == r3 ? 0 : -1))
            if (r6 != 0) goto L_0x02c9
            r4 = 1094713344(0x41400000, float:12.0)
            r6 = 2
            float r4 = android.util.TypedValue.applyDimension(r6, r4, r2)
            goto L_0x02ca
        L_0x02c9:
            r6 = 2
        L_0x02ca:
            int r7 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r7 != 0) goto L_0x02d4
            r5 = 1121976320(0x42e00000, float:112.0)
            float r5 = android.util.TypedValue.applyDimension(r6, r5, r2)
        L_0x02d4:
            int r2 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r2 != 0) goto L_0x02da
            r1 = 1065353216(0x3f800000, float:1.0)
        L_0x02da:
            r12.k(r4, r5, r1)
        L_0x02dd:
            r12.h()
            goto L_0x02e4
        L_0x02e1:
            r1 = 0
            r12.f4210a = r1
        L_0x02e4:
            boolean r1 = o.n1.f4274c
            if (r1 == 0) goto L_0x0317
            int r1 = r12.f4210a
            if (r1 == 0) goto L_0x0317
            int[] r1 = r12.f4214f
            int r2 = r1.length
            if (r2 <= 0) goto L_0x0317
            int r2 = o.X.a(r9)
            float r2 = (float) r2
            r3 = -1082130432(0xffffffffbf800000, float:-1.0)
            int r2 = (r2 > r3 ? 1 : (r2 == r3 ? 0 : -1))
            if (r2 == 0) goto L_0x0313
            float r1 = r12.f4213d
            int r1 = java.lang.Math.round(r1)
            float r2 = r12.e
            int r2 = java.lang.Math.round(r2)
            float r3 = r12.f4212c
            int r3 = java.lang.Math.round(r3)
            r4 = 0
            o.X.b(r9, r1, r2, r3, r4)
            goto L_0x0317
        L_0x0313:
            r4 = 0
            o.X.c(r9, r1, r4)
        L_0x0317:
            android.content.res.TypedArray r1 = r10.obtainStyledAttributes(r14, r11)
            r2 = 8
            r3 = -1
            int r2 = r1.getResourceId(r2, r3)
            r4 = r19
            if (r2 == r3) goto L_0x032d
            android.graphics.drawable.Drawable r2 = r4.b(r10, r2)
        L_0x032a:
            r5 = 13
            goto L_0x032f
        L_0x032d:
            r2 = 0
            goto L_0x032a
        L_0x032f:
            int r5 = r1.getResourceId(r5, r3)
            if (r5 == r3) goto L_0x033a
            android.graphics.drawable.Drawable r5 = r4.b(r10, r5)
            goto L_0x033b
        L_0x033a:
            r5 = 0
        L_0x033b:
            r6 = 9
            int r6 = r1.getResourceId(r6, r3)
            if (r6 == r3) goto L_0x0349
            android.graphics.drawable.Drawable r6 = r4.b(r10, r6)
        L_0x0347:
            r7 = 6
            goto L_0x034b
        L_0x0349:
            r6 = 0
            goto L_0x0347
        L_0x034b:
            int r7 = r1.getResourceId(r7, r3)
            if (r7 == r3) goto L_0x0356
            android.graphics.drawable.Drawable r7 = r4.b(r10, r7)
            goto L_0x0357
        L_0x0356:
            r7 = 0
        L_0x0357:
            r8 = 10
            int r8 = r1.getResourceId(r8, r3)
            if (r8 == r3) goto L_0x0364
            android.graphics.drawable.Drawable r8 = r4.b(r10, r8)
            goto L_0x0365
        L_0x0364:
            r8 = 0
        L_0x0365:
            r11 = 7
            int r11 = r1.getResourceId(r11, r3)
            if (r11 == r3) goto L_0x0371
            android.graphics.drawable.Drawable r3 = r4.b(r10, r11)
            goto L_0x0372
        L_0x0371:
            r3 = 0
        L_0x0372:
            if (r8 != 0) goto L_0x03c1
            if (r3 == 0) goto L_0x0377
            goto L_0x03c1
        L_0x0377:
            if (r2 != 0) goto L_0x037f
            if (r5 != 0) goto L_0x037f
            if (r6 != 0) goto L_0x037f
            if (r7 == 0) goto L_0x03e0
        L_0x037f:
            android.graphics.drawable.Drawable[] r3 = r9.getCompoundDrawablesRelative()
            r4 = 0
            r8 = r3[r4]
            if (r8 != 0) goto L_0x038d
            r11 = 2
            r12 = r3[r11]
            if (r12 == 0) goto L_0x038f
        L_0x038d:
            r4 = 3
            goto L_0x03ae
        L_0x038f:
            android.graphics.drawable.Drawable[] r3 = r9.getCompoundDrawables()
            if (r2 == 0) goto L_0x0396
            goto L_0x0398
        L_0x0396:
            r2 = r3[r4]
        L_0x0398:
            if (r5 == 0) goto L_0x039b
            goto L_0x039e
        L_0x039b:
            r4 = 1
            r5 = r3[r4]
        L_0x039e:
            if (r6 == 0) goto L_0x03a1
            goto L_0x03a4
        L_0x03a1:
            r4 = 2
            r6 = r3[r4]
        L_0x03a4:
            if (r7 == 0) goto L_0x03a7
            goto L_0x03aa
        L_0x03a7:
            r4 = 3
            r7 = r3[r4]
        L_0x03aa:
            r9.setCompoundDrawablesWithIntrinsicBounds(r2, r5, r6, r7)
            goto L_0x03e0
        L_0x03ae:
            if (r5 == 0) goto L_0x03b1
            goto L_0x03b4
        L_0x03b1:
            r2 = 1
            r5 = r3[r2]
        L_0x03b4:
            if (r7 == 0) goto L_0x03b8
        L_0x03b6:
            r2 = 2
            goto L_0x03bb
        L_0x03b8:
            r7 = r3[r4]
            goto L_0x03b6
        L_0x03bb:
            r2 = r3[r2]
            r9.setCompoundDrawablesRelativeWithIntrinsicBounds(r8, r5, r2, r7)
            goto L_0x03e0
        L_0x03c1:
            android.graphics.drawable.Drawable[] r2 = r9.getCompoundDrawablesRelative()
            if (r8 == 0) goto L_0x03c8
            goto L_0x03cb
        L_0x03c8:
            r4 = 0
            r8 = r2[r4]
        L_0x03cb:
            if (r5 == 0) goto L_0x03ce
            goto L_0x03d1
        L_0x03ce:
            r4 = 1
            r5 = r2[r4]
        L_0x03d1:
            if (r3 == 0) goto L_0x03d4
            goto L_0x03d7
        L_0x03d4:
            r3 = 2
            r3 = r2[r3]
        L_0x03d7:
            if (r7 == 0) goto L_0x03da
            goto L_0x03dd
        L_0x03da:
            r4 = 3
            r7 = r2[r4]
        L_0x03dd:
            r9.setCompoundDrawablesRelativeWithIntrinsicBounds(r8, r5, r3, r7)
        L_0x03e0:
            r2 = 11
            boolean r3 = r1.hasValue(r2)
            if (r3 == 0) goto L_0x0414
            boolean r3 = r1.hasValue(r2)
            if (r3 == 0) goto L_0x03fc
            r3 = 0
            int r3 = r1.getResourceId(r2, r3)
            if (r3 == 0) goto L_0x03fc
            android.content.res.ColorStateList r3 = p0.C0320a.I(r10, r3)
            if (r3 == 0) goto L_0x03fc
            goto L_0x0400
        L_0x03fc:
            android.content.res.ColorStateList r3 = r1.getColorStateList(r2)
        L_0x0400:
            int r2 = android.os.Build.VERSION.SDK_INT
            r4 = 24
            if (r2 < r4) goto L_0x040a
            T.n.f(r9, r3)
            goto L_0x0414
        L_0x040a:
            boolean r2 = r9 instanceof T.u
            if (r2 == 0) goto L_0x0414
            r2 = r9
            T.u r2 = (T.u) r2
            r2.setSupportCompoundDrawablesTintList(r3)
        L_0x0414:
            r2 = 12
            boolean r3 = r1.hasValue(r2)
            if (r3 == 0) goto L_0x043a
            r3 = -1
            int r2 = r1.getInt(r2, r3)
            r3 = 0
            android.graphics.PorterDuff$Mode r2 = o.C0297p0.c(r2, r3)
            int r3 = android.os.Build.VERSION.SDK_INT
            r4 = 24
            if (r3 < r4) goto L_0x0430
            T.n.g(r9, r2)
            goto L_0x043a
        L_0x0430:
            boolean r3 = r9 instanceof T.u
            if (r3 == 0) goto L_0x043a
            r3 = r9
            T.u r3 = (T.u) r3
            r3.setSupportCompoundDrawablesTintMode(r2)
        L_0x043a:
            r2 = -1
            r3 = 15
            int r3 = r1.getDimensionPixelSize(r3, r2)
            r4 = 18
            int r4 = r1.getDimensionPixelSize(r4, r2)
            r2 = 19
            boolean r5 = r1.hasValue(r2)
            if (r5 == 0) goto L_0x046d
            android.util.TypedValue r5 = r1.peekValue(r2)
            if (r5 == 0) goto L_0x0465
            int r6 = r5.type
            r7 = 5
            if (r6 != r7) goto L_0x0465
            int r2 = r5.data
            r7 = r2 & 15
            float r2 = android.util.TypedValue.complexToFloat(r2)
            r5 = r7
            r7 = -1
            goto L_0x0471
        L_0x0465:
            r7 = -1
            int r2 = r1.getDimensionPixelSize(r2, r7)
            float r2 = (float) r2
        L_0x046b:
            r5 = -1
            goto L_0x0471
        L_0x046d:
            r7 = -1
            r2 = -1082130432(0xffffffffbf800000, float:-1.0)
            goto L_0x046b
        L_0x0471:
            r1.recycle()
            if (r3 == r7) goto L_0x0479
            p0.C0320a.v0(r9, r3)
        L_0x0479:
            if (r4 == r7) goto L_0x047e
            p0.C0320a.x0(r9, r4)
        L_0x047e:
            r1 = -1082130432(0xffffffffbf800000, float:-1.0)
            int r1 = (r2 > r1 ? 1 : (r2 == r1 ? 0 : -1))
            if (r1 == 0) goto L_0x04a8
            if (r5 != r7) goto L_0x048b
            int r1 = (int) r2
            p0.C0320a.z0(r9, r1)
            goto L_0x04a8
        L_0x048b:
            int r1 = android.os.Build.VERSION.SDK_INT
            r3 = 34
            if (r1 < r3) goto L_0x0495
            T.q.a(r9, r5, r2)
            goto L_0x04a8
        L_0x0495:
            android.content.res.Resources r1 = r9.getResources()
            android.util.DisplayMetrics r1 = r1.getDisplayMetrics()
            float r1 = android.util.TypedValue.applyDimension(r5, r2, r1)
            int r1 = java.lang.Math.round(r1)
            p0.C0320a.z0(r9, r1)
        L_0x04a8:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: o.Z.f(android.util.AttributeSet, int):void");
    }

    public final void g(Context context, int i2) {
        String string;
        ColorStateList n2;
        ColorStateList n3;
        ColorStateList n4;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(i2, C0096a.f2539w);
        t tVar = new t(context, obtainStyledAttributes);
        boolean hasValue = obtainStyledAttributes.hasValue(14);
        TextView textView = this.f4154a;
        if (hasValue) {
            textView.setAllCaps(obtainStyledAttributes.getBoolean(14, false));
        }
        int i3 = Build.VERSION.SDK_INT;
        if (i3 < 23) {
            if (obtainStyledAttributes.hasValue(3) && (n4 = tVar.n(3)) != null) {
                textView.setTextColor(n4);
            }
            if (obtainStyledAttributes.hasValue(5) && (n3 = tVar.n(5)) != null) {
                textView.setLinkTextColor(n3);
            }
            if (obtainStyledAttributes.hasValue(4) && (n2 = tVar.n(4)) != null) {
                textView.setHintTextColor(n2);
            }
        }
        if (obtainStyledAttributes.hasValue(0) && obtainStyledAttributes.getDimensionPixelSize(0, -1) == 0) {
            textView.setTextSize(0, 0.0f);
        }
        n(context, tVar);
        if (i3 >= 26 && obtainStyledAttributes.hasValue(13) && (string = obtainStyledAttributes.getString(13)) != null) {
            X.d(textView, string);
        }
        tVar.C();
        Typeface typeface = this.f4163l;
        if (typeface != null) {
            textView.setTypeface(typeface, this.f4161j);
        }
    }

    public final void i(int i2, int i3, int i4, int i5) {
        C0283i0 i0Var = this.i;
        if (i0Var.j()) {
            DisplayMetrics displayMetrics = i0Var.f4217j.getResources().getDisplayMetrics();
            i0Var.k(TypedValue.applyDimension(i5, (float) i2, displayMetrics), TypedValue.applyDimension(i5, (float) i3, displayMetrics), TypedValue.applyDimension(i5, (float) i4, displayMetrics));
            if (i0Var.h()) {
                i0Var.a();
            }
        }
    }

    public final void j(int[] iArr, int i2) {
        C0283i0 i0Var = this.i;
        if (i0Var.j()) {
            int length = iArr.length;
            if (length > 0) {
                int[] iArr2 = new int[length];
                if (i2 == 0) {
                    iArr2 = Arrays.copyOf(iArr, length);
                } else {
                    DisplayMetrics displayMetrics = i0Var.f4217j.getResources().getDisplayMetrics();
                    for (int i3 = 0; i3 < length; i3++) {
                        iArr2[i3] = Math.round(TypedValue.applyDimension(i2, (float) iArr[i3], displayMetrics));
                    }
                }
                i0Var.f4214f = C0283i0.b(iArr2);
                if (!i0Var.i()) {
                    throw new IllegalArgumentException("None of the preset sizes is valid: " + Arrays.toString(iArr));
                }
            } else {
                i0Var.f4215g = false;
            }
            if (i0Var.h()) {
                i0Var.a();
            }
        }
    }

    public final void k(int i2) {
        C0283i0 i0Var = this.i;
        if (!i0Var.j()) {
            return;
        }
        if (i2 == 0) {
            i0Var.f4210a = 0;
            i0Var.f4213d = -1.0f;
            i0Var.e = -1.0f;
            i0Var.f4212c = -1.0f;
            i0Var.f4214f = new int[0];
            i0Var.f4211b = false;
        } else if (i2 == 1) {
            DisplayMetrics displayMetrics = i0Var.f4217j.getResources().getDisplayMetrics();
            i0Var.k(TypedValue.applyDimension(2, 12.0f, displayMetrics), TypedValue.applyDimension(2, 112.0f, displayMetrics), 1.0f);
            if (i0Var.h()) {
                i0Var.a();
            }
        } else {
            throw new IllegalArgumentException(E.e("Unknown auto-size text type: ", i2));
        }
    }

    /* JADX WARNING: type inference failed for: r0v2, types: [g1.o, java.lang.Object] */
    public final void l(ColorStateList colorStateList) {
        boolean z2;
        if (this.f4160h == null) {
            this.f4160h = new Object();
        }
        o oVar = this.f4160h;
        oVar.f2744c = colorStateList;
        if (colorStateList != null) {
            z2 = true;
        } else {
            z2 = false;
        }
        oVar.f2743b = z2;
        this.f4155b = oVar;
        this.f4156c = oVar;
        this.f4157d = oVar;
        this.e = oVar;
        this.f4158f = oVar;
        this.f4159g = oVar;
    }

    /* JADX WARNING: type inference failed for: r0v2, types: [g1.o, java.lang.Object] */
    public final void m(PorterDuff.Mode mode) {
        boolean z2;
        if (this.f4160h == null) {
            this.f4160h = new Object();
        }
        o oVar = this.f4160h;
        oVar.f2745d = mode;
        if (mode != null) {
            z2 = true;
        } else {
            z2 = false;
        }
        oVar.f2742a = z2;
        this.f4155b = oVar;
        this.f4156c = oVar;
        this.f4157d = oVar;
        this.e = oVar;
        this.f4158f = oVar;
        this.f4159g = oVar;
    }

    public final void n(Context context, t tVar) {
        String string;
        boolean z2;
        boolean z3;
        int i2 = this.f4161j;
        TypedArray typedArray = (TypedArray) tVar.f1132c;
        this.f4161j = typedArray.getInt(2, i2);
        int i3 = Build.VERSION.SDK_INT;
        if (i3 >= 28) {
            int i4 = typedArray.getInt(11, -1);
            this.f4162k = i4;
            if (i4 != -1) {
                this.f4161j &= 2;
            }
        }
        int i5 = 10;
        boolean z4 = false;
        if (typedArray.hasValue(10) || typedArray.hasValue(12)) {
            this.f4163l = null;
            if (typedArray.hasValue(12)) {
                i5 = 12;
            }
            int i6 = this.f4162k;
            int i7 = this.f4161j;
            if (!context.isRestricted()) {
                try {
                    Typeface q2 = tVar.q(i5, this.f4161j, new C0264T(this, i6, i7, new WeakReference(this.f4154a)));
                    if (q2 != null) {
                        if (i3 < 28 || this.f4162k == -1) {
                            this.f4163l = q2;
                        } else {
                            Typeface create = Typeface.create(q2, 0);
                            int i8 = this.f4162k;
                            if ((this.f4161j & 2) != 0) {
                                z3 = true;
                            } else {
                                z3 = false;
                            }
                            this.f4163l = Y.a(create, i8, z3);
                        }
                    }
                    if (this.f4163l == null) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    this.f4164m = z2;
                } catch (Resources.NotFoundException | UnsupportedOperationException unused) {
                }
            }
            if (this.f4163l == null && (string = typedArray.getString(i5)) != null) {
                if (Build.VERSION.SDK_INT < 28 || this.f4162k == -1) {
                    this.f4163l = Typeface.create(string, this.f4161j);
                    return;
                }
                Typeface create2 = Typeface.create(string, 0);
                int i9 = this.f4162k;
                if ((this.f4161j & 2) != 0) {
                    z4 = true;
                }
                this.f4163l = Y.a(create2, i9, z4);
            }
        } else if (typedArray.hasValue(1)) {
            this.f4164m = false;
            int i10 = typedArray.getInt(1, 1);
            if (i10 == 1) {
                this.f4163l = Typeface.SANS_SERIF;
            } else if (i10 == 2) {
                this.f4163l = Typeface.SERIF;
            } else if (i10 == 3) {
                this.f4163l = Typeface.MONOSPACE;
            }
        }
    }

    public Z(TextView textView) {
        this.f4154a = textView;
        this.i = new C0283i0(textView);
    }
}
