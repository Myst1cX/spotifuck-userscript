package com.google.android.material.timepicker;

import N.Q;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.RadialGradient;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import p0.C0320a;
import q0.C0322a;
import y.i;
import y.j;
import y.n;

class ClockFaceView extends e implements d {

    /* renamed from: A  reason: collision with root package name */
    public final RectF f2411A = new RectF();

    /* renamed from: B  reason: collision with root package name */
    public final Rect f2412B = new Rect();

    /* renamed from: C  reason: collision with root package name */
    public final SparseArray f2413C;

    /* renamed from: D  reason: collision with root package name */
    public final c f2414D;

    /* renamed from: E  reason: collision with root package name */
    public final int[] f2415E;

    /* renamed from: F  reason: collision with root package name */
    public final float[] f2416F;

    /* renamed from: G  reason: collision with root package name */
    public final int f2417G;

    /* renamed from: H  reason: collision with root package name */
    public final int f2418H;
    public final int I;

    /* renamed from: J  reason: collision with root package name */
    public final int f2419J;

    /* renamed from: K  reason: collision with root package name */
    public final String[] f2420K;

    /* renamed from: L  reason: collision with root package name */
    public float f2421L;

    /* renamed from: M  reason: collision with root package name */
    public final ColorStateList f2422M;

    /* renamed from: y  reason: collision with root package name */
    public final ClockHandView f2423y;

    /* renamed from: z  reason: collision with root package name */
    public final Rect f2424z = new Rect();

    public ClockFaceView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        SparseArray sparseArray = new SparseArray();
        this.f2413C = sparseArray;
        this.f2416F = new float[]{0.0f, 0.9f, 1.0f};
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C0322a.f4487d, 2130969371, 2131821694);
        Resources resources = getResources();
        ColorStateList J2 = C0320a.J(context, obtainStyledAttributes, 1);
        this.f2422M = J2;
        LayoutInflater.from(context).inflate(2131492925, this, true);
        ClockHandView clockHandView = (ClockHandView) findViewById(2131296529);
        this.f2423y = clockHandView;
        this.f2417G = resources.getDimensionPixelSize(2131165736);
        int colorForState = J2.getColorForState(new int[]{16842913}, J2.getDefaultColor());
        this.f2415E = new int[]{colorForState, colorForState, J2.getDefaultColor()};
        clockHandView.f2427h.add(this);
        int defaultColor = C0320a.I(context, 2131100346).getDefaultColor();
        ColorStateList J3 = C0320a.J(context, obtainStyledAttributes, 0);
        setBackgroundColor(J3 != null ? J3.getDefaultColor() : defaultColor);
        getViewTreeObserver().addOnPreDrawListener(new b(this));
        setFocusable(true);
        obtainStyledAttributes.recycle();
        this.f2414D = new c(this);
        String[] strArr = new String[12];
        Arrays.fill(strArr, "");
        this.f2420K = strArr;
        LayoutInflater from = LayoutInflater.from(getContext());
        int size = sparseArray.size();
        boolean z2 = false;
        for (int i = 0; i < Math.max(this.f2420K.length, size); i++) {
            TextView textView = (TextView) sparseArray.get(i);
            if (i >= this.f2420K.length) {
                removeView(textView);
                sparseArray.remove(i);
            } else {
                if (textView == null) {
                    textView = (TextView) from.inflate(2131492924, this, false);
                    sparseArray.put(i, textView);
                    addView(textView);
                }
                textView.setText(this.f2420K[i]);
                textView.setTag(2131296545, Integer.valueOf(i));
                int i2 = (i / 12) + 1;
                textView.setTag(2131296530, Integer.valueOf(i2));
                z2 = i2 > 1 ? true : z2;
                Q.p(textView, this.f2414D);
                textView.setTextColor(this.f2422M);
            }
        }
        ClockHandView clockHandView2 = this.f2423y;
        if (clockHandView2.f2426g && !z2) {
            clockHandView2.f2436r = 1;
        }
        clockHandView2.f2426g = z2;
        clockHandView2.invalidate();
        this.f2418H = resources.getDimensionPixelSize(2131165764);
        this.I = resources.getDimensionPixelSize(2131165765);
        this.f2419J = resources.getDimensionPixelSize(2131165743);
    }

    public final void m() {
        int i;
        n nVar = new n();
        nVar.b(this);
        HashMap hashMap = new HashMap();
        for (int i2 = 0; i2 < getChildCount(); i2++) {
            View childAt = getChildAt(i2);
            if (childAt.getId() != 2131296382 && !"skip".equals(childAt.getTag())) {
                int i3 = (Integer) childAt.getTag(2131296530);
                if (i3 == null) {
                    i3 = 1;
                }
                if (!hashMap.containsKey(i3)) {
                    hashMap.put(i3, new ArrayList());
                }
                ((List) hashMap.get(i3)).add(childAt);
            }
        }
        for (Map.Entry entry : hashMap.entrySet()) {
            List<View> list = (List) entry.getValue();
            if (((Integer) entry.getKey()).intValue() == 2) {
                i = Math.round(((float) this.f2443w) * 0.66f);
            } else {
                i = this.f2443w;
            }
            float f2 = 0.0f;
            for (View id : list) {
                int id2 = id.getId();
                HashMap hashMap2 = nVar.f5134c;
                if (!hashMap2.containsKey(Integer.valueOf(id2))) {
                    hashMap2.put(Integer.valueOf(id2), new i());
                }
                j jVar = ((i) hashMap2.get(Integer.valueOf(id2))).f5040d;
                jVar.f5105z = 2131296382;
                jVar.f5043A = i;
                jVar.f5044B = f2;
                f2 += 360.0f / ((float) list.size());
            }
        }
        nVar.a(this);
        setConstraintSet((n) null);
        requestLayout();
        int i4 = 0;
        while (true) {
            SparseArray sparseArray = this.f2413C;
            if (i4 < sparseArray.size()) {
                ((TextView) sparseArray.get(i4)).setVisibility(0);
                i4++;
            } else {
                return;
            }
        }
    }

    public final void n() {
        SparseArray sparseArray;
        RectF rectF;
        Rect rect;
        boolean z2;
        RadialGradient radialGradient;
        RectF rectF2 = this.f2423y.f2430l;
        float f2 = Float.MAX_VALUE;
        TextView textView = null;
        int i = 0;
        while (true) {
            sparseArray = this.f2413C;
            int size = sparseArray.size();
            rectF = this.f2411A;
            rect = this.f2424z;
            if (i >= size) {
                break;
            }
            TextView textView2 = (TextView) sparseArray.get(i);
            if (textView2 != null) {
                textView2.getHitRect(rect);
                rectF.set(rect);
                rectF.union(rectF2);
                float height = rectF.height() * rectF.width();
                if (height < f2) {
                    textView = textView2;
                    f2 = height;
                }
            }
            i++;
        }
        for (int i2 = 0; i2 < sparseArray.size(); i2++) {
            TextView textView3 = (TextView) sparseArray.get(i2);
            if (textView3 != null) {
                if (textView3 == textView) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                textView3.setSelected(z2);
                textView3.getHitRect(rect);
                rectF.set(rect);
                Rect rect2 = this.f2412B;
                textView3.getLineBounds(0, rect2);
                rectF.inset((float) rect2.left, (float) rect2.top);
                if (!RectF.intersects(rectF2, rectF)) {
                    radialGradient = null;
                } else {
                    radialGradient = new RadialGradient(rectF2.centerX() - rectF.left, rectF2.centerY() - rectF.top, 0.5f * rectF2.width(), this.f2415E, this.f2416F, Shader.TileMode.CLAMP);
                }
                textView3.getPaint().setShader(radialGradient);
                textView3.invalidate();
            }
        }
    }

    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setCollectionInfo(AccessibilityNodeInfo.CollectionInfo.obtain(1, this.f2420K.length, false, 1));
    }

    public final void onLayout(boolean z2, int i, int i2, int i3, int i4) {
        super.onLayout(z2, i, i2, i3, i4);
        n();
    }

    public final void onMeasure(int i, int i2) {
        DisplayMetrics displayMetrics = getResources().getDisplayMetrics();
        int max = (int) (((float) this.f2419J) / Math.max(Math.max(((float) this.f2418H) / ((float) displayMetrics.heightPixels), ((float) this.I) / ((float) displayMetrics.widthPixels)), 1.0f));
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(max, 1073741824);
        setMeasuredDimension(max, max);
        super.onMeasure(makeMeasureSpec, makeMeasureSpec);
    }
}
