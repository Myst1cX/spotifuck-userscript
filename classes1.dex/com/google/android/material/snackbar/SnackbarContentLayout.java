package com.google.android.material.snackbar;

import N.Q;
import android.content.Context;
import android.text.Layout;
import android.util.AttributeSet;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import java.util.WeakHashMap;
import p0.C0320a;
import r0.C0324a;

public class SnackbarContentLayout extends LinearLayout {

    /* renamed from: f  reason: collision with root package name */
    public TextView f2331f;

    /* renamed from: g  reason: collision with root package name */
    public Button f2332g;

    /* renamed from: h  reason: collision with root package name */
    public int f2333h;

    public Button getActionView() {
        return this.f2332g;
    }

    public TextView getMessageView() {
        return this.f2331f;
    }

    public void setMaxInlineActionWidth(int i) {
        this.f2333h = i;
    }

    public SnackbarContentLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        C0320a.r0(context, 2130969438, C0324a.f4556b);
    }

    public final boolean a(int i, int i2, int i3) {
        boolean z2;
        if (i != getOrientation()) {
            setOrientation(i);
            z2 = true;
        } else {
            z2 = false;
        }
        if (this.f2331f.getPaddingTop() == i2 && this.f2331f.getPaddingBottom() == i3) {
            return z2;
        }
        TextView textView = this.f2331f;
        WeakHashMap weakHashMap = Q.f509a;
        if (textView.isPaddingRelative()) {
            textView.setPaddingRelative(textView.getPaddingStart(), i2, textView.getPaddingEnd(), i3);
            return true;
        }
        textView.setPadding(textView.getPaddingLeft(), i2, textView.getPaddingRight(), i3);
        return true;
    }

    public final void onFinishInflate() {
        super.onFinishInflate();
        this.f2331f = (TextView) findViewById(2131296692);
        this.f2332g = (Button) findViewById(2131296691);
    }

    public final void onMeasure(int i, int i2) {
        boolean z2;
        super.onMeasure(i, i2);
        if (getOrientation() != 1) {
            int dimensionPixelSize = getResources().getDimensionPixelSize(2131165319);
            int dimensionPixelSize2 = getResources().getDimensionPixelSize(2131165318);
            Layout layout = this.f2331f.getLayout();
            if (layout == null || layout.getLineCount() <= 1) {
                z2 = false;
            } else {
                z2 = true;
            }
            if (!z2 || this.f2333h <= 0 || this.f2332g.getMeasuredWidth() <= this.f2333h) {
                if (!z2) {
                    dimensionPixelSize = dimensionPixelSize2;
                }
                if (!a(0, dimensionPixelSize, dimensionPixelSize)) {
                    return;
                }
            } else if (!a(1, dimensionPixelSize, dimensionPixelSize - dimensionPixelSize2)) {
                return;
            }
            super.onMeasure(i, i2);
        }
    }
}
