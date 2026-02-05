package com.google.android.material.timepicker;

import E0.l;
import android.text.Editable;
import android.text.TextUtils;
import com.google.android.material.chip.Chip;

public final class a extends l {

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ ChipTextInputComboView f2439f;

    public a(ChipTextInputComboView chipTextInputComboView) {
        this.f2439f = chipTextInputComboView;
    }

    public final void afterTextChanged(Editable editable) {
        boolean isEmpty = TextUtils.isEmpty(editable);
        ChipTextInputComboView chipTextInputComboView = this.f2439f;
        if (isEmpty) {
            chipTextInputComboView.f2409f.setText(ChipTextInputComboView.a(chipTextInputComboView, "00"));
            return;
        }
        String a2 = ChipTextInputComboView.a(chipTextInputComboView, editable);
        Chip chip = chipTextInputComboView.f2409f;
        if (TextUtils.isEmpty(a2)) {
            a2 = ChipTextInputComboView.a(chipTextInputComboView, "00");
        }
        chip.setText(a2);
    }
}
