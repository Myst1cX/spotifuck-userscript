package o0;

import E.b;
import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.Keyframe;
import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.Path;
import android.graphics.PathMeasure;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.util.Xml;
import android.view.InflateException;
import android.view.animation.AnimationUtils;
import java.util.ArrayList;
import java.util.Iterator;
import p0.C0320a;

/* renamed from: o0.a  reason: case insensitive filesystem */
public abstract class C0318a {

    /* renamed from: a  reason: collision with root package name */
    public static final int[] f4342a = {16842755, 16843041, 16843093, 16843097, 16843551, 16843754, 16843771, 16843778, 16843779};

    /* renamed from: b  reason: collision with root package name */
    public static final int[] f4343b = {16842755, 16843189, 16843190, 16843556, 16843557, 16843558, 16843866, 16843867};

    /* renamed from: c  reason: collision with root package name */
    public static final int[] f4344c = {16842755, 16843780, 16843781, 16843782, 16843783, 16843784, 16843785, 16843786, 16843787, 16843788, 16843789, 16843979, 16843980, 16844062};

    /* renamed from: d  reason: collision with root package name */
    public static final int[] f4345d = {16842755, 16843781, 16844062};
    public static final int[] e = {16843161};

    /* renamed from: f  reason: collision with root package name */
    public static final int[] f4346f = {16842755, 16843213};

    /* renamed from: g  reason: collision with root package name */
    public static final int[] f4347g = {16843073, 16843160, 16843198, 16843199, 16843200, 16843486, 16843487, 16843488};

    /* renamed from: h  reason: collision with root package name */
    public static final int[] f4348h = {16843490};
    public static final int[] i = {16843486, 16843487, 16843488, 16843489};

    /* renamed from: j  reason: collision with root package name */
    public static final int[] f4349j = {16842788, 16843073, 16843488, 16843992};

    /* renamed from: k  reason: collision with root package name */
    public static final int[] f4350k = {16843489, 16843781, 16843892, 16843893};

    public static Animator a(Context context, Resources resources, Resources.Theme theme, XmlResourceParser xmlResourceParser, AttributeSet attributeSet, AnimatorSet animatorSet, int i2) {
        PropertyValuesHolder[] propertyValuesHolderArr;
        AttributeSet attributeSet2;
        String str;
        int i3;
        PropertyValuesHolder propertyValuesHolder;
        int size;
        int i4;
        Keyframe ofObject;
        Keyframe keyframe;
        String str2;
        int i5;
        TypedValue typedValue;
        Keyframe keyframe2;
        int i6;
        float f2;
        int i7;
        TypedValue typedValue2;
        int i8;
        Resources resources2 = resources;
        Resources.Theme theme2 = theme;
        XmlResourceParser xmlResourceParser2 = xmlResourceParser;
        AnimatorSet animatorSet2 = animatorSet;
        int depth = xmlResourceParser.getDepth();
        ValueAnimator valueAnimator = null;
        ArrayList arrayList = null;
        while (true) {
            int next = xmlResourceParser.next();
            boolean z2 = false;
            int i9 = 3;
            if (next == 3 && xmlResourceParser.getDepth() <= depth) {
                break;
            }
            int i10 = 1;
            if (next == 1) {
                break;
            }
            int i11 = 2;
            if (next == 2) {
                String name = xmlResourceParser.getName();
                if (name.equals("objectAnimator")) {
                    ObjectAnimator objectAnimator = new ObjectAnimator();
                    d(context, resources, theme, attributeSet, objectAnimator, xmlResourceParser);
                    valueAnimator = objectAnimator;
                } else if (name.equals("animator")) {
                    valueAnimator = d(context, resources, theme, attributeSet, (ObjectAnimator) null, xmlResourceParser);
                } else if (name.equals("set")) {
                    AnimatorSet animatorSet3 = new AnimatorSet();
                    TypedArray h2 = b.h(resources2, theme2, attributeSet, f4348h);
                    if (!b.e(xmlResourceParser2, "ordering")) {
                        i8 = 0;
                    } else {
                        i8 = h2.getInt(0, 0);
                    }
                    a(context, resources, theme, xmlResourceParser, attributeSet, animatorSet3, i8);
                    h2.recycle();
                    valueAnimator = animatorSet3;
                } else {
                    String str3 = "propertyValuesHolder";
                    if (name.equals(str3)) {
                        AttributeSet asAttributeSet = Xml.asAttributeSet(xmlResourceParser);
                        ArrayList arrayList2 = null;
                        while (true) {
                            int eventType = xmlResourceParser.getEventType();
                            if (eventType != i9 && eventType != i10) {
                                if (eventType != i11) {
                                    xmlResourceParser.next();
                                } else {
                                    if (xmlResourceParser.getName().equals(str3)) {
                                        TypedArray h3 = b.h(resources2, theme2, asAttributeSet, i);
                                        String d2 = b.d(h3, xmlResourceParser2, "propertyName", i9);
                                        if (!b.e(xmlResourceParser2, "valueType")) {
                                            i3 = 4;
                                        } else {
                                            i3 = h3.getInt(i11, 4);
                                        }
                                        int i12 = i3;
                                        ArrayList arrayList3 = null;
                                        while (true) {
                                            int next2 = xmlResourceParser.next();
                                            attributeSet2 = asAttributeSet;
                                            if (next2 == i9 || next2 == 1) {
                                                int i13 = i12;
                                                str = str3;
                                                Context context2 = context;
                                            } else {
                                                if (xmlResourceParser.getName().equals("keyframe")) {
                                                    int[] iArr = f4349j;
                                                    i5 = i12;
                                                    str2 = str3;
                                                    if (i5 == 4) {
                                                        TypedArray h4 = b.h(resources2, theme2, Xml.asAttributeSet(xmlResourceParser), iArr);
                                                        if (!b.e(xmlResourceParser2, "value")) {
                                                            typedValue2 = null;
                                                        } else {
                                                            typedValue2 = h4.peekValue(0);
                                                        }
                                                        int i14 = (typedValue2 == null || !c(typedValue2.type)) ? 0 : 3;
                                                        h4.recycle();
                                                        i5 = i14;
                                                    }
                                                    TypedArray h5 = b.h(resources2, theme2, Xml.asAttributeSet(xmlResourceParser), iArr);
                                                    float f3 = -1.0f;
                                                    if (b.e(xmlResourceParser2, "fraction")) {
                                                        f3 = h5.getFloat(3, -1.0f);
                                                    }
                                                    if (!b.e(xmlResourceParser2, "value")) {
                                                        typedValue = null;
                                                    } else {
                                                        typedValue = h5.peekValue(0);
                                                    }
                                                    boolean z3 = typedValue != null;
                                                    int i15 = i5 == 4 ? (!z3 || !c(typedValue.type)) ? 0 : 3 : i5;
                                                    if (z3) {
                                                        if (i15 == 0) {
                                                            if (!b.e(xmlResourceParser2, "value")) {
                                                                f2 = 0.0f;
                                                            } else {
                                                                f2 = h5.getFloat(0, 0.0f);
                                                            }
                                                            keyframe2 = Keyframe.ofFloat(f3, f2);
                                                        } else if (i15 == 1 || i15 == 3) {
                                                            if (!b.e(xmlResourceParser2, "value")) {
                                                                i7 = 0;
                                                            } else {
                                                                i7 = h5.getInt(0, 0);
                                                            }
                                                            keyframe2 = Keyframe.ofInt(f3, i7);
                                                        } else {
                                                            keyframe2 = null;
                                                        }
                                                    } else if (i15 == 0) {
                                                        keyframe2 = Keyframe.ofFloat(f3);
                                                    } else {
                                                        keyframe2 = Keyframe.ofInt(f3);
                                                    }
                                                    if (!b.e(xmlResourceParser2, "interpolator")) {
                                                        i6 = 0;
                                                    } else {
                                                        i6 = h5.getResourceId(1, 0);
                                                    }
                                                    Context context3 = context;
                                                    if (i6 > 0) {
                                                        keyframe2.setInterpolator(AnimationUtils.loadInterpolator(context3, i6));
                                                    }
                                                    h5.recycle();
                                                    if (keyframe2 != null) {
                                                        if (arrayList3 == null) {
                                                            arrayList3 = new ArrayList();
                                                        }
                                                        arrayList3.add(keyframe2);
                                                    }
                                                    xmlResourceParser.next();
                                                } else {
                                                    i5 = i12;
                                                    str2 = str3;
                                                    Context context4 = context;
                                                }
                                                resources2 = resources;
                                                theme2 = theme;
                                                str3 = str2;
                                                asAttributeSet = attributeSet2;
                                                i12 = i5;
                                                i9 = 3;
                                            }
                                        }
                                        int i132 = i12;
                                        str = str3;
                                        Context context22 = context;
                                        if (arrayList3 == null || (size = arrayList3.size()) <= 0) {
                                            propertyValuesHolder = null;
                                        } else {
                                            Keyframe keyframe3 = (Keyframe) arrayList3.get(0);
                                            Keyframe keyframe4 = (Keyframe) arrayList3.get(size - 1);
                                            float fraction = keyframe4.getFraction();
                                            if (fraction < 1.0f) {
                                                if (fraction < 0.0f) {
                                                    keyframe4.setFraction(1.0f);
                                                } else {
                                                    int size2 = arrayList3.size();
                                                    if (keyframe4.getType() == Float.TYPE) {
                                                        keyframe = Keyframe.ofFloat(1.0f);
                                                    } else if (keyframe4.getType() == Integer.TYPE) {
                                                        keyframe = Keyframe.ofInt(1.0f);
                                                    } else {
                                                        keyframe = Keyframe.ofObject(1.0f);
                                                    }
                                                    arrayList3.add(size2, keyframe);
                                                    size++;
                                                }
                                            }
                                            float fraction2 = keyframe3.getFraction();
                                            if (fraction2 != 0.0f) {
                                                if (fraction2 < 0.0f) {
                                                    keyframe3.setFraction(0.0f);
                                                } else {
                                                    if (keyframe3.getType() == Float.TYPE) {
                                                        ofObject = Keyframe.ofFloat(0.0f);
                                                    } else if (keyframe3.getType() == Integer.TYPE) {
                                                        ofObject = Keyframe.ofInt(0.0f);
                                                    } else {
                                                        ofObject = Keyframe.ofObject(0.0f);
                                                    }
                                                    arrayList3.add(0, ofObject);
                                                    size++;
                                                }
                                            }
                                            Keyframe[] keyframeArr = new Keyframe[size];
                                            arrayList3.toArray(keyframeArr);
                                            int i16 = 0;
                                            while (i16 < size) {
                                                Keyframe keyframe5 = keyframeArr[i16];
                                                if (keyframe5.getFraction() < 0.0f) {
                                                    if (i16 == 0) {
                                                        keyframe5.setFraction(0.0f);
                                                    } else {
                                                        int i17 = size - 1;
                                                        if (i16 == i17) {
                                                            keyframe5.setFraction(1.0f);
                                                        } else {
                                                            int i18 = i16 + 1;
                                                            int i19 = i16;
                                                            while (true) {
                                                                if (i18 >= i17) {
                                                                    break;
                                                                } else if (keyframeArr[i18].getFraction() >= 0.0f) {
                                                                    break;
                                                                } else {
                                                                    i19 = i18;
                                                                    i18++;
                                                                }
                                                            }
                                                            float fraction3 = (keyframeArr[i19 + 1].getFraction() - keyframeArr[i16 - 1].getFraction()) / ((float) ((i19 - i16) + 2));
                                                            int i20 = i16;
                                                            while (i20 <= i19) {
                                                                keyframeArr[i20].setFraction(keyframeArr[i20 - 1].getFraction() + fraction3);
                                                                i20++;
                                                                size = size;
                                                            }
                                                            i4 = size;
                                                            i16++;
                                                            size = i4;
                                                        }
                                                    }
                                                }
                                                i4 = size;
                                                i16++;
                                                size = i4;
                                            }
                                            propertyValuesHolder = PropertyValuesHolder.ofKeyframe(d2, keyframeArr);
                                            if (i132 == 3) {
                                                propertyValuesHolder.setEvaluator(h.f4363a);
                                            }
                                        }
                                        if (propertyValuesHolder == null) {
                                            propertyValuesHolder = b(h3, i3, 0, 1, d2);
                                        }
                                        if (propertyValuesHolder != null) {
                                            if (arrayList2 == null) {
                                                arrayList2 = new ArrayList();
                                            }
                                            arrayList2.add(propertyValuesHolder);
                                        }
                                        h3.recycle();
                                    } else {
                                        attributeSet2 = asAttributeSet;
                                        str = str3;
                                    }
                                    xmlResourceParser.next();
                                    resources2 = resources;
                                    theme2 = theme;
                                    xmlResourceParser2 = xmlResourceParser;
                                    str3 = str;
                                    asAttributeSet = attributeSet2;
                                    i9 = 3;
                                    i10 = 1;
                                    i11 = 2;
                                }
                            }
                        }
                        if (arrayList2 != null) {
                            int size3 = arrayList2.size();
                            propertyValuesHolderArr = new PropertyValuesHolder[size3];
                            for (int i21 = 0; i21 < size3; i21++) {
                                propertyValuesHolderArr[i21] = (PropertyValuesHolder) arrayList2.get(i21);
                            }
                        } else {
                            propertyValuesHolderArr = null;
                        }
                        if (propertyValuesHolderArr != null && (valueAnimator instanceof ValueAnimator)) {
                            valueAnimator.setValues(propertyValuesHolderArr);
                        }
                        z2 = true;
                    } else {
                        throw new RuntimeException("Unknown animator name: " + xmlResourceParser.getName());
                    }
                }
                if (animatorSet2 != null && !z2) {
                    if (arrayList == null) {
                        arrayList = new ArrayList();
                    }
                    arrayList.add(valueAnimator);
                }
                resources2 = resources;
                theme2 = theme;
                xmlResourceParser2 = xmlResourceParser;
            }
        }
        if (!(animatorSet2 == null || arrayList == null)) {
            Animator[] animatorArr = new Animator[arrayList.size()];
            Iterator it2 = arrayList.iterator();
            int i22 = 0;
            while (it2.hasNext()) {
                animatorArr[i22] = (Animator) it2.next();
                i22++;
            }
            if (i2 == 0) {
                animatorSet2.playTogether(animatorArr);
            } else {
                animatorSet2.playSequentially(animatorArr);
            }
        }
        return valueAnimator;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v6, resolved type: java.lang.Object[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v27, resolved type: java.lang.Object[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v31, resolved type: java.lang.Object[]} */
    /* JADX WARNING: type inference failed for: r11v26, types: [android.animation.TypeEvaluator, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r1v2, types: [android.animation.TypeEvaluator, java.lang.Object] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static android.animation.PropertyValuesHolder b(android.content.res.TypedArray r11, int r12, int r13, int r14, java.lang.String r15) {
        /*
            r0 = 2
            android.util.TypedValue r1 = r11.peekValue(r13)
            r2 = 1
            r3 = 0
            if (r1 == 0) goto L_0x000b
            r4 = 1
            goto L_0x000c
        L_0x000b:
            r4 = 0
        L_0x000c:
            if (r4 == 0) goto L_0x0011
            int r1 = r1.type
            goto L_0x0012
        L_0x0011:
            r1 = 0
        L_0x0012:
            android.util.TypedValue r5 = r11.peekValue(r14)
            if (r5 == 0) goto L_0x001a
            r6 = 1
            goto L_0x001b
        L_0x001a:
            r6 = 0
        L_0x001b:
            if (r6 == 0) goto L_0x0020
            int r5 = r5.type
            goto L_0x0021
        L_0x0020:
            r5 = 0
        L_0x0021:
            r7 = 4
            r8 = 3
            if (r12 != r7) goto L_0x0038
            if (r4 == 0) goto L_0x002d
            boolean r12 = c(r1)
            if (r12 != 0) goto L_0x0035
        L_0x002d:
            if (r6 == 0) goto L_0x0037
            boolean r12 = c(r5)
            if (r12 == 0) goto L_0x0037
        L_0x0035:
            r12 = 3
            goto L_0x0038
        L_0x0037:
            r12 = 0
        L_0x0038:
            if (r12 != 0) goto L_0x003c
            r7 = 1
            goto L_0x003d
        L_0x003c:
            r7 = 0
        L_0x003d:
            r9 = 0
            if (r12 != r0) goto L_0x00a6
            java.lang.String r12 = r11.getString(r13)
            java.lang.String r11 = r11.getString(r14)
            F.f[] r13 = p0.C0320a.x(r12)
            F.f[] r14 = p0.C0320a.x(r11)
            if (r13 != 0) goto L_0x0054
            if (r14 == 0) goto L_0x0160
        L_0x0054:
            if (r13 == 0) goto L_0x0095
            o0.g r1 = new o0.g
            r1.<init>()
            if (r14 == 0) goto L_0x008c
            boolean r4 = p0.C0320a.g(r13, r14)
            if (r4 == 0) goto L_0x0070
            java.lang.Object[] r11 = new java.lang.Object[r0]
            r11[r3] = r13
            r11[r2] = r14
            android.animation.PropertyValuesHolder r11 = android.animation.PropertyValuesHolder.ofObject(r15, r1, r11)
        L_0x006d:
            r9 = r11
            goto L_0x0160
        L_0x0070:
            android.view.InflateException r13 = new android.view.InflateException
            java.lang.StringBuilder r14 = new java.lang.StringBuilder
            java.lang.String r15 = " Can't morph from "
            r14.<init>(r15)
            r14.append(r12)
            java.lang.String r12 = " to "
            r14.append(r12)
            r14.append(r11)
            java.lang.String r11 = r14.toString()
            r13.<init>(r11)
            throw r13
        L_0x008c:
            java.lang.Object[] r11 = new java.lang.Object[r2]
            r11[r3] = r13
            android.animation.PropertyValuesHolder r11 = android.animation.PropertyValuesHolder.ofObject(r15, r1, r11)
            goto L_0x006d
        L_0x0095:
            if (r14 == 0) goto L_0x0160
            o0.g r11 = new o0.g
            r11.<init>()
            java.lang.Object[] r12 = new java.lang.Object[r2]
            r12[r3] = r14
            android.animation.PropertyValuesHolder r9 = android.animation.PropertyValuesHolder.ofObject(r15, r11, r12)
            goto L_0x0160
        L_0x00a6:
            if (r12 != r8) goto L_0x00ab
            o0.h r12 = o0.h.f4363a
            goto L_0x00ac
        L_0x00ab:
            r12 = r9
        L_0x00ac:
            r8 = 5
            r10 = 0
            if (r7 == 0) goto L_0x00f4
            if (r4 == 0) goto L_0x00e0
            if (r1 != r8) goto L_0x00b9
            float r13 = r11.getDimension(r13, r10)
            goto L_0x00bd
        L_0x00b9:
            float r13 = r11.getFloat(r13, r10)
        L_0x00bd:
            if (r6 == 0) goto L_0x00d7
            if (r5 != r8) goto L_0x00c6
            float r11 = r11.getDimension(r14, r10)
            goto L_0x00ca
        L_0x00c6:
            float r11 = r11.getFloat(r14, r10)
        L_0x00ca:
            float[] r14 = new float[r0]
            r14[r3] = r13
            r14[r2] = r11
            android.animation.PropertyValuesHolder r11 = android.animation.PropertyValuesHolder.ofFloat(r15, r14)
        L_0x00d4:
            r9 = r11
            goto L_0x0159
        L_0x00d7:
            float[] r11 = new float[r2]
            r11[r3] = r13
            android.animation.PropertyValuesHolder r11 = android.animation.PropertyValuesHolder.ofFloat(r15, r11)
            goto L_0x00d4
        L_0x00e0:
            if (r5 != r8) goto L_0x00e7
            float r11 = r11.getDimension(r14, r10)
            goto L_0x00eb
        L_0x00e7:
            float r11 = r11.getFloat(r14, r10)
        L_0x00eb:
            float[] r13 = new float[r2]
            r13[r3] = r11
            android.animation.PropertyValuesHolder r11 = android.animation.PropertyValuesHolder.ofFloat(r15, r13)
            goto L_0x00d4
        L_0x00f4:
            if (r4 == 0) goto L_0x0138
            if (r1 != r8) goto L_0x00fe
            float r13 = r11.getDimension(r13, r10)
            int r13 = (int) r13
            goto L_0x010d
        L_0x00fe:
            boolean r0 = c(r1)
            if (r0 == 0) goto L_0x0109
            int r13 = r11.getColor(r13, r3)
            goto L_0x010d
        L_0x0109:
            int r13 = r11.getInt(r13, r3)
        L_0x010d:
            if (r6 == 0) goto L_0x012f
            if (r5 != r8) goto L_0x0117
            float r11 = r11.getDimension(r14, r10)
            int r11 = (int) r11
            goto L_0x0126
        L_0x0117:
            boolean r0 = c(r5)
            if (r0 == 0) goto L_0x0122
            int r11 = r11.getColor(r14, r3)
            goto L_0x0126
        L_0x0122:
            int r11 = r11.getInt(r14, r3)
        L_0x0126:
            int[] r11 = new int[]{r13, r11}
            android.animation.PropertyValuesHolder r9 = android.animation.PropertyValuesHolder.ofInt(r15, r11)
            goto L_0x0159
        L_0x012f:
            int[] r11 = new int[]{r13}
            android.animation.PropertyValuesHolder r9 = android.animation.PropertyValuesHolder.ofInt(r15, r11)
            goto L_0x0159
        L_0x0138:
            if (r6 == 0) goto L_0x0159
            if (r5 != r8) goto L_0x0142
            float r11 = r11.getDimension(r14, r10)
            int r11 = (int) r11
            goto L_0x0151
        L_0x0142:
            boolean r13 = c(r5)
            if (r13 == 0) goto L_0x014d
            int r11 = r11.getColor(r14, r3)
            goto L_0x0151
        L_0x014d:
            int r11 = r11.getInt(r14, r3)
        L_0x0151:
            int[] r11 = new int[]{r11}
            android.animation.PropertyValuesHolder r9 = android.animation.PropertyValuesHolder.ofInt(r15, r11)
        L_0x0159:
            if (r9 == 0) goto L_0x0160
            if (r12 == 0) goto L_0x0160
            r9.setEvaluator(r12)
        L_0x0160:
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: o0.C0318a.b(android.content.res.TypedArray, int, int, int, java.lang.String):android.animation.PropertyValuesHolder");
    }

    public static boolean c(int i2) {
        if (i2 < 28 || i2 > 31) {
            return false;
        }
        return true;
    }

    public static ValueAnimator d(Context context, Resources resources, Resources.Theme theme, AttributeSet attributeSet, ObjectAnimator objectAnimator, XmlResourceParser xmlResourceParser) {
        ValueAnimator valueAnimator;
        int i2;
        int i3;
        int i4;
        int i5;
        ValueAnimator valueAnimator2;
        TypedArray typedArray;
        TypedArray typedArray2;
        ValueAnimator valueAnimator3;
        PropertyValuesHolder propertyValuesHolder;
        PropertyValuesHolder propertyValuesHolder2;
        boolean z2;
        int i6;
        boolean z3;
        int i7;
        Resources resources2 = resources;
        Resources.Theme theme2 = theme;
        AttributeSet attributeSet2 = attributeSet;
        XmlResourceParser xmlResourceParser2 = xmlResourceParser;
        int i8 = 0;
        int i9 = 1;
        TypedArray h2 = b.h(resources2, theme2, attributeSet2, f4347g);
        TypedArray h3 = b.h(resources2, theme2, attributeSet2, f4350k);
        if (objectAnimator == null) {
            valueAnimator = new ValueAnimator();
        } else {
            valueAnimator = objectAnimator;
        }
        int i10 = 300;
        if (b.e(xmlResourceParser2, "duration")) {
            i10 = h2.getInt(1, 300);
        }
        long j2 = (long) i10;
        if (!b.e(xmlResourceParser2, "startOffset")) {
            i2 = 0;
        } else {
            i2 = h2.getInt(2, 0);
        }
        long j3 = (long) i2;
        if (!b.e(xmlResourceParser2, "valueType")) {
            i3 = 4;
        } else {
            i3 = h2.getInt(7, 4);
        }
        if (b.e(xmlResourceParser2, "valueFrom") && b.e(xmlResourceParser2, "valueTo")) {
            if (i3 == 4) {
                TypedValue peekValue = h2.peekValue(5);
                if (peekValue != null) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (z2) {
                    i6 = peekValue.type;
                } else {
                    i6 = 0;
                }
                TypedValue peekValue2 = h2.peekValue(6);
                if (peekValue2 != null) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                if (z3) {
                    i7 = peekValue2.type;
                } else {
                    i7 = 0;
                }
                if ((!z2 || !c(i6)) && (!z3 || !c(i7))) {
                    i3 = 0;
                } else {
                    i3 = 3;
                }
            }
            PropertyValuesHolder b2 = b(h2, i3, 5, 6, "");
            if (b2 != null) {
                valueAnimator.setValues(new PropertyValuesHolder[]{b2});
            }
        }
        valueAnimator.setDuration(j2);
        valueAnimator.setStartDelay(j3);
        if (!b.e(xmlResourceParser2, "repeatCount")) {
            i4 = 0;
        } else {
            i4 = h2.getInt(3, 0);
        }
        valueAnimator.setRepeatCount(i4);
        if (!b.e(xmlResourceParser2, "repeatMode")) {
            i5 = 1;
        } else {
            i5 = h2.getInt(4, 1);
        }
        valueAnimator.setRepeatMode(i5);
        if (h3 != null) {
            ObjectAnimator objectAnimator2 = (ObjectAnimator) valueAnimator;
            String d2 = b.d(h3, xmlResourceParser2, "pathData", 1);
            if (d2 != null) {
                String d3 = b.d(h3, xmlResourceParser2, "propertyXName", 2);
                String d4 = b.d(h3, xmlResourceParser2, "propertyYName", 3);
                if (d3 == null && d4 == null) {
                    throw new InflateException(h3.getPositionDescription() + " propertyXName or propertyYName is needed for PathData");
                }
                Path y2 = C0320a.y(d2);
                PathMeasure pathMeasure = new PathMeasure(y2, false);
                ArrayList arrayList = new ArrayList();
                arrayList.add(Float.valueOf(0.0f));
                float f2 = 0.0f;
                while (true) {
                    f2 += pathMeasure.getLength();
                    arrayList.add(Float.valueOf(f2));
                    if (!pathMeasure.nextContour()) {
                        break;
                    }
                    valueAnimator = valueAnimator;
                    i9 = 1;
                }
                PathMeasure pathMeasure2 = new PathMeasure(y2, false);
                int min = Math.min(100, ((int) (f2 / 0.5f)) + i9);
                float[] fArr = new float[min];
                float[] fArr2 = new float[min];
                float[] fArr3 = new float[2];
                float f3 = f2 / ((float) (min - 1));
                valueAnimator2 = valueAnimator;
                typedArray = h2;
                int i11 = 0;
                int i12 = 0;
                float f4 = 0.0f;
                while (true) {
                    propertyValuesHolder = null;
                    if (i12 >= min) {
                        break;
                    }
                    int i13 = min;
                    pathMeasure2.getPosTan(f4 - ((Float) arrayList.get(i11)).floatValue(), fArr3, (float[]) null);
                    fArr[i12] = fArr3[0];
                    fArr2[i12] = fArr3[1];
                    f4 += f3;
                    int i14 = i11 + 1;
                    if (i14 < arrayList.size() && f4 > ((Float) arrayList.get(i14)).floatValue()) {
                        pathMeasure2.nextContour();
                        i11 = i14;
                    }
                    i12++;
                    min = i13;
                }
                if (d3 != null) {
                    propertyValuesHolder2 = PropertyValuesHolder.ofFloat(d3, fArr);
                } else {
                    propertyValuesHolder2 = null;
                }
                if (d4 != null) {
                    propertyValuesHolder = PropertyValuesHolder.ofFloat(d4, fArr2);
                }
                if (propertyValuesHolder2 == null) {
                    i8 = 0;
                    objectAnimator2.setValues(new PropertyValuesHolder[]{propertyValuesHolder});
                } else {
                    i8 = 0;
                    if (propertyValuesHolder == null) {
                        objectAnimator2.setValues(new PropertyValuesHolder[]{propertyValuesHolder2});
                    } else {
                        objectAnimator2.setValues(new PropertyValuesHolder[]{propertyValuesHolder2, propertyValuesHolder});
                    }
                }
            } else {
                valueAnimator2 = valueAnimator;
                typedArray = h2;
                objectAnimator2.setPropertyName(b.d(h3, xmlResourceParser2, "propertyName", 0));
            }
        } else {
            valueAnimator2 = valueAnimator;
            typedArray = h2;
        }
        if (!b.e(xmlResourceParser2, "interpolator")) {
            typedArray2 = typedArray;
        } else {
            typedArray2 = typedArray;
            i8 = typedArray2.getResourceId(i8, i8);
        }
        if (i8 > 0) {
            valueAnimator3 = valueAnimator2;
            valueAnimator3.setInterpolator(AnimationUtils.loadInterpolator(context, i8));
        } else {
            valueAnimator3 = valueAnimator2;
        }
        typedArray2.recycle();
        if (h3 != null) {
            h3.recycle();
        }
        return valueAnimator3;
    }
}
