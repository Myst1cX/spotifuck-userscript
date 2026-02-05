package com.google.android.material.timepicker;

import android.content.Context;
import android.util.AttributeSet;
import android.view.GestureDetector;
import android.view.LayoutInflater;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.material.button.MaterialButtonToggleGroup;
import com.google.android.material.chip.Chip;

class TimePickerView extends ConstraintLayout {

    /* renamed from: w  reason: collision with root package name */
    public static final /* synthetic */ int f2437w = 0;

    /* renamed from: v  reason: collision with root package name */
    public final Chip f2438v;

    public TimePickerView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        g gVar = new g(this);
        LayoutInflater.from(context).inflate(2131492930, this);
        ClockFaceView clockFaceView = (ClockFaceView) findViewById(2131296528);
        ((MaterialButtonToggleGroup) findViewById(2131296533)).f2180h.add(new f(this));
        Chip chip = (Chip) findViewById(2131296538);
        Chip chip2 = (Chip) findViewById(2131296535);
        this.f2438v = chip2;
        ClockHandView clockHandView = (ClockHandView) findViewById(2131296529);
        i iVar = new i(new GestureDetector(getContext(), new h(this)));
        chip.setOnTouchListener(iVar);
        chip2.setOnTouchListener(iVar);
        chip.setTag(2131296679, 12);
        chip2.setTag(2131296679, 10);
        chip.setOnClickListener(gVar);
        chip2.setOnClickListener(gVar);
        chip.setAccessibilityClassName("android.view.View");
        chip2.setAccessibilityClassName("android.view.View");
    }

    public final void onVisibilityChanged(View view, int i) {
        super.onVisibilityChanged(view, i);
        if (view == this && i == 0) {
            this.f2438v.sendAccessibilityEvent(8);
        }
    }
}
