package com.google.android.material.timepicker;

import C.a;
import K0.g;
import K0.h;
import K0.j;
import N.Q;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.os.Handler;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import java.util.WeakHashMap;
import q0.C0322a;

public abstract class e extends ConstraintLayout {

    /* renamed from: v  reason: collision with root package name */
    public final a f2442v = new a(12, (Object) this);

    /* renamed from: w  reason: collision with root package name */
    public int f2443w;

    /* renamed from: x  reason: collision with root package name */
    public final g f2444x;

    public abstract void m();

    public final void setBackgroundColor(int i) {
        this.f2444x.j(ColorStateList.valueOf(i));
    }

    public e(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 2130969371);
        LayoutInflater.from(context).inflate(2131492926, this);
        g gVar = new g();
        this.f2444x = gVar;
        h hVar = new h(0.5f);
        j e = gVar.f374f.f358a.e();
        e.e = hVar;
        e.f399f = hVar;
        e.f400g = hVar;
        e.f401h = hVar;
        gVar.setShapeAppearanceModel(e.a());
        this.f2444x.j(ColorStateList.valueOf(-1));
        g gVar2 = this.f2444x;
        WeakHashMap weakHashMap = Q.f509a;
        setBackground(gVar2);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C0322a.f4501t, 2130969371, 0);
        this.f2443w = obtainStyledAttributes.getDimensionPixelSize(0, 0);
        obtainStyledAttributes.recycle();
    }

    public final void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        super.addView(view, i, layoutParams);
        if (view.getId() == -1) {
            WeakHashMap weakHashMap = Q.f509a;
            view.setId(View.generateViewId());
        }
        Handler handler = getHandler();
        if (handler != null) {
            a aVar = this.f2442v;
            handler.removeCallbacks(aVar);
            handler.post(aVar);
        }
    }

    public final void onFinishInflate() {
        super.onFinishInflate();
        m();
    }

    public final void onViewRemoved(View view) {
        super.onViewRemoved(view);
        Handler handler = getHandler();
        if (handler != null) {
            a aVar = this.f2442v;
            handler.removeCallbacks(aVar);
            handler.post(aVar);
        }
    }
}
