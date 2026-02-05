package androidx.appcompat.widget;

import N.Q;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import g.C0096a;
import java.util.WeakHashMap;

public class ButtonBarLayout extends LinearLayout {

    /* renamed from: f  reason: collision with root package name */
    public boolean f1319f;

    /* renamed from: g  reason: collision with root package name */
    public boolean f1320g;

    /* renamed from: h  reason: collision with root package name */
    public int f1321h = -1;

    public final void onMeasure(int i, int i2) {
        boolean z2;
        int i3;
        int i4;
        int size = View.MeasureSpec.getSize(i);
        int i5 = 0;
        if (this.f1319f) {
            if (size > this.f1321h && this.f1320g) {
                setStacked(false);
            }
            this.f1321h = size;
        }
        if (this.f1320g || View.MeasureSpec.getMode(i) != 1073741824) {
            i3 = i;
            z2 = false;
        } else {
            i3 = View.MeasureSpec.makeMeasureSpec(size, Integer.MIN_VALUE);
            z2 = true;
        }
        super.onMeasure(i3, i2);
        if (this.f1319f && !this.f1320g && (getMeasuredWidthAndState() & -16777216) == 16777216) {
            setStacked(true);
            z2 = true;
        }
        if (z2) {
            super.onMeasure(i, i2);
        }
        int childCount = getChildCount();
        int i6 = 0;
        while (true) {
            i4 = -1;
            if (i6 >= childCount) {
                i6 = -1;
                break;
            } else if (getChildAt(i6).getVisibility() == 0) {
                break;
            } else {
                i6++;
            }
        }
        if (i6 >= 0) {
            View childAt = getChildAt(i6);
            LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) childAt.getLayoutParams();
            int measuredHeight = childAt.getMeasuredHeight() + getPaddingTop() + layoutParams.topMargin + layoutParams.bottomMargin;
            if (this.f1320g) {
                int i7 = i6 + 1;
                int childCount2 = getChildCount();
                while (true) {
                    if (i7 >= childCount2) {
                        break;
                    } else if (getChildAt(i7).getVisibility() == 0) {
                        i4 = i7;
                        break;
                    } else {
                        i7++;
                    }
                }
                if (i4 >= 0) {
                    i5 = getChildAt(i4).getPaddingTop() + ((int) (getResources().getDisplayMetrics().density * 16.0f)) + measuredHeight;
                } else {
                    i5 = measuredHeight;
                }
            } else {
                i5 = getPaddingBottom() + measuredHeight;
            }
        }
        WeakHashMap weakHashMap = Q.f509a;
        if (getMinimumHeight() != i5) {
            setMinimumHeight(i5);
            if (i2 == 0) {
                super.onMeasure(i, i2);
            }
        }
    }

    private void setStacked(boolean z2) {
        int i;
        int i2;
        if (this.f1320g == z2) {
            return;
        }
        if (!z2 || this.f1319f) {
            this.f1320g = z2;
            setOrientation(z2 ? 1 : 0);
            if (z2) {
                i = 8388613;
            } else {
                i = 80;
            }
            setGravity(i);
            View findViewById = findViewById(2131296696);
            if (findViewById != null) {
                if (z2) {
                    i2 = 8;
                } else {
                    i2 = 4;
                }
                findViewById.setVisibility(i2);
            }
            for (int childCount = getChildCount() - 2; childCount >= 0; childCount--) {
                bringChildToFront(getChildAt(childCount));
            }
        }
    }

    public void setAllowStacking(boolean z2) {
        if (this.f1319f != z2) {
            this.f1319f = z2;
            if (!z2 && this.f1320g) {
                setStacked(false);
            }
            requestLayout();
        }
    }

    public ButtonBarLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        int[] iArr = C0096a.f2527k;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr);
        Q.o(this, context, iArr, attributeSet, obtainStyledAttributes, 0);
        this.f1319f = obtainStyledAttributes.getBoolean(0, true);
        obtainStyledAttributes.recycle();
        if (getOrientation() == 1) {
            setStacked(this.f1319f);
        }
    }
}
