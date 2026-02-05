package com.google.android.material.appbar;

import A.j;
import E0.m;
import G.a;
import K0.g;
import N.F;
import N.Q;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.Pair;
import android.view.Menu;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.widget.Toolbar;
import java.util.ArrayList;
import java.util.Collections;
import java.util.WeakHashMap;
import n.C0197l;
import p0.C0320a;
import q0.C0322a;

public class MaterialToolbar extends Toolbar {

    /* renamed from: e0  reason: collision with root package name */
    public static final ImageView.ScaleType[] f2090e0 = {ImageView.ScaleType.MATRIX, ImageView.ScaleType.FIT_XY, ImageView.ScaleType.FIT_START, ImageView.ScaleType.FIT_CENTER, ImageView.ScaleType.FIT_END, ImageView.ScaleType.CENTER, ImageView.ScaleType.CENTER_CROP, ImageView.ScaleType.CENTER_INSIDE};

    /* renamed from: W  reason: collision with root package name */
    public Integer f2091W;

    /* renamed from: a0  reason: collision with root package name */
    public boolean f2092a0;

    /* renamed from: b0  reason: collision with root package name */
    public boolean f2093b0;

    /* renamed from: c0  reason: collision with root package name */
    public ImageView.ScaleType f2094c0;

    /* renamed from: d0  reason: collision with root package name */
    public Boolean f2095d0;

    public ImageView.ScaleType getLogoScaleType() {
        return this.f2094c0;
    }

    public Integer getNavigationIconTint() {
        return this.f2091W;
    }

    public void setLogoAdjustViewBounds(boolean z2) {
        Boolean bool = this.f2095d0;
        if (bool == null || bool.booleanValue() != z2) {
            this.f2095d0 = Boolean.valueOf(z2);
            requestLayout();
        }
    }

    public void setLogoScaleType(ImageView.ScaleType scaleType) {
        if (this.f2094c0 != scaleType) {
            this.f2094c0 = scaleType;
            requestLayout();
        }
    }

    public void setNavigationIcon(Drawable drawable) {
        if (!(drawable == null || this.f2091W == null)) {
            drawable = C0320a.J0(drawable.mutate());
            a.g(drawable, this.f2091W.intValue());
        }
        super.setNavigationIcon(drawable);
    }

    public void setSubtitleCentered(boolean z2) {
        if (this.f2093b0 != z2) {
            this.f2093b0 = z2;
            requestLayout();
        }
    }

    public void setTitleCentered(boolean z2) {
        if (this.f2092a0 != z2) {
            this.f2092a0 = z2;
            requestLayout();
        }
    }

    public MaterialToolbar(Context context, AttributeSet attributeSet) {
        super(P0.a.a(context, attributeSet, 2130969838, 2131821702), attributeSet, 0);
        ColorStateList colorStateList;
        Context context2 = getContext();
        TypedArray f2 = m.f(context2, attributeSet, C0322a.f4500s, 2130969838, 2131821702, new int[0]);
        if (f2.hasValue(2)) {
            setNavigationIconTint(f2.getColor(2, -1));
        }
        this.f2092a0 = f2.getBoolean(4, false);
        this.f2093b0 = f2.getBoolean(3, false);
        int i = f2.getInt(1, -1);
        if (i >= 0) {
            ImageView.ScaleType[] scaleTypeArr = f2090e0;
            if (i < scaleTypeArr.length) {
                this.f2094c0 = scaleTypeArr[i];
            }
        }
        if (f2.hasValue(0)) {
            this.f2095d0 = Boolean.valueOf(f2.getBoolean(0, false));
        }
        f2.recycle();
        Drawable background = getBackground();
        if (background == null) {
            colorStateList = ColorStateList.valueOf(0);
        } else {
            colorStateList = C0320a.L(background);
        }
        if (colorStateList != null) {
            g gVar = new g();
            gVar.j(colorStateList);
            gVar.h(context2);
            WeakHashMap weakHashMap = Q.f509a;
            gVar.i(F.i(this));
            setBackground(gVar);
        }
    }

    public final void m(int i) {
        Menu menu = getMenu();
        boolean z2 = menu instanceof C0197l;
        if (z2) {
            ((C0197l) menu).w();
        }
        super.m(i);
        if (z2) {
            ((C0197l) menu).v();
        }
    }

    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        Drawable background = getBackground();
        if (background instanceof g) {
            C0320a.B0(this, (g) background);
        }
    }

    public final void onLayout(boolean z2, int i, int i2, int i3, int i4) {
        ImageView imageView;
        Drawable drawable;
        TextView textView;
        TextView textView2;
        super.onLayout(z2, i, i2, i3, i4);
        int i5 = 0;
        ImageView imageView2 = null;
        if (this.f2092a0 || this.f2093b0) {
            ArrayList d2 = m.d(this, getTitle());
            boolean isEmpty = d2.isEmpty();
            j jVar = m.f220c;
            if (isEmpty) {
                textView = null;
            } else {
                textView = (TextView) Collections.min(d2, jVar);
            }
            ArrayList d3 = m.d(this, getSubtitle());
            if (d3.isEmpty()) {
                textView2 = null;
            } else {
                textView2 = (TextView) Collections.max(d3, jVar);
            }
            if (!(textView == null && textView2 == null)) {
                int measuredWidth = getMeasuredWidth();
                int i6 = measuredWidth / 2;
                int paddingLeft = getPaddingLeft();
                int paddingRight = measuredWidth - getPaddingRight();
                for (int i7 = 0; i7 < getChildCount(); i7++) {
                    View childAt = getChildAt(i7);
                    if (!(childAt.getVisibility() == 8 || childAt == textView || childAt == textView2)) {
                        if (childAt.getRight() < i6 && childAt.getRight() > paddingLeft) {
                            paddingLeft = childAt.getRight();
                        }
                        if (childAt.getLeft() > i6 && childAt.getLeft() < paddingRight) {
                            paddingRight = childAt.getLeft();
                        }
                    }
                }
                Pair pair = new Pair(Integer.valueOf(paddingLeft), Integer.valueOf(paddingRight));
                if (this.f2092a0 && textView != null) {
                    v(textView, pair);
                }
                if (this.f2093b0 && textView2 != null) {
                    v(textView2, pair);
                }
            }
        }
        Drawable logo = getLogo();
        if (logo != null) {
            while (true) {
                if (i5 >= getChildCount()) {
                    break;
                }
                View childAt2 = getChildAt(i5);
                if ((childAt2 instanceof ImageView) && (drawable = imageView.getDrawable()) != null && drawable.getConstantState() != null && drawable.getConstantState().equals(logo.getConstantState())) {
                    imageView2 = (ImageView) childAt2;
                    break;
                }
                i5++;
            }
        }
        if (imageView2 != null) {
            Boolean bool = this.f2095d0;
            if (bool != null) {
                imageView2.setAdjustViewBounds(bool.booleanValue());
            }
            ImageView.ScaleType scaleType = this.f2094c0;
            if (scaleType != null) {
                imageView2.setScaleType(scaleType);
            }
        }
    }

    public void setElevation(float f2) {
        super.setElevation(f2);
        Drawable background = getBackground();
        if (background instanceof g) {
            ((g) background).i(f2);
        }
    }

    public void setNavigationIconTint(int i) {
        this.f2091W = Integer.valueOf(i);
        Drawable navigationIcon = getNavigationIcon();
        if (navigationIcon != null) {
            setNavigationIcon(navigationIcon);
        }
    }

    public final void v(TextView textView, Pair pair) {
        int measuredWidth = getMeasuredWidth();
        int measuredWidth2 = textView.getMeasuredWidth();
        int i = (measuredWidth / 2) - (measuredWidth2 / 2);
        int i2 = measuredWidth2 + i;
        int max = Math.max(Math.max(((Integer) pair.first).intValue() - i, 0), Math.max(i2 - ((Integer) pair.second).intValue(), 0));
        if (max > 0) {
            i += max;
            i2 -= max;
            textView.measure(View.MeasureSpec.makeMeasureSpec(i2 - i, 1073741824), textView.getMeasuredHeightAndState());
        }
        textView.layout(i, textView.getTop(), i2, textView.getBottom());
    }
}
