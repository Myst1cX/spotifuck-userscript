package com.google.android.material.datepicker;

import N.Q;
import T.h;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.View;
import android.widget.Adapter;
import android.widget.GridView;
import android.widget.ListAdapter;
import java.util.Calendar;

final class MaterialCalendarGridView extends GridView {

    /* renamed from: f  reason: collision with root package name */
    public final boolean f2211f;

    public MaterialCalendarGridView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        v.c((Calendar) null);
        if (l.N(getContext(), 16843277)) {
            setNextFocusLeftId(2131296369);
            setNextFocusRightId(2131296390);
        }
        this.f2211f = l.N(getContext(), 2130969472);
        Q.p(this, new h(3));
    }

    public final Adapter getAdapter() {
        return (o) super.getAdapter();
    }

    /* renamed from: getAdapter  reason: collision with other method in class */
    public final ListAdapter m9getAdapter() {
        return (o) super.getAdapter();
    }

    public final void onFocusChanged(boolean z2, int i, Rect rect) {
        if (!z2) {
            super.onFocusChanged(false, i, rect);
        } else if (i == 33) {
            setSelection(((o) super.getAdapter()).c());
        } else if (i == 130) {
            setSelection(((o) super.getAdapter()).a());
        } else {
            super.onFocusChanged(true, i, rect);
        }
    }

    public final void onMeasure(int i, int i2) {
        if (this.f2211f) {
            super.onMeasure(i, View.MeasureSpec.makeMeasureSpec(16777215, Integer.MIN_VALUE));
            getLayoutParams().height = getMeasuredHeight();
            return;
        }
        super.onMeasure(i, i2);
    }

    public final void setAdapter(ListAdapter listAdapter) {
        if (listAdapter instanceof o) {
            super.setAdapter(listAdapter);
            return;
        }
        throw new IllegalArgumentException(String.format("%1$s must have its Adapter set to a %2$s", new Object[]{MaterialCalendarGridView.class.getCanonicalName(), o.class.getCanonicalName()}));
    }

    public final o a() {
        return (o) super.getAdapter();
    }

    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        ((o) super.getAdapter()).notifyDataSetChanged();
    }

    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        o oVar = (o) super.getAdapter();
        oVar.getClass();
        int max = Math.max(oVar.a(), getFirstVisiblePosition());
        int min = Math.min(oVar.c(), getLastVisiblePosition());
        oVar.getItem(max);
        oVar.getItem(min);
        throw null;
    }

    public final boolean onKeyDown(int i, KeyEvent keyEvent) {
        if (!super.onKeyDown(i, keyEvent)) {
            return false;
        }
        if (getSelectedItemPosition() == -1 || getSelectedItemPosition() >= ((o) super.getAdapter()).a()) {
            return true;
        }
        if (19 != i) {
            return false;
        }
        setSelection(((o) super.getAdapter()).a());
        return true;
    }

    public final void setSelection(int i) {
        if (i < ((o) super.getAdapter()).a()) {
            super.setSelection(((o) super.getAdapter()).a());
        } else {
            super.setSelection(i);
        }
    }
}
