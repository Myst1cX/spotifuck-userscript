package com.google.android.material.timepicker;

import C.a;
import N.Q;
import android.content.Context;
import android.content.res.Configuration;
import android.os.Build;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Checkable;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.google.android.material.chip.Chip;
import com.google.android.material.textfield.TextInputLayout;
import java.util.WeakHashMap;

class ChipTextInputComboView extends FrameLayout implements Checkable {

    /* renamed from: f  reason: collision with root package name */
    public final Chip f2409f;

    /* renamed from: g  reason: collision with root package name */
    public final EditText f2410g;

    public ChipTextInputComboView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        LayoutInflater from = LayoutInflater.from(context);
        Chip chip = (Chip) from.inflate(2131492928, this, false);
        this.f2409f = chip;
        chip.setAccessibilityClassName("android.view.View");
        TextInputLayout textInputLayout = (TextInputLayout) from.inflate(2131492929, this, false);
        EditText editText = textInputLayout.getEditText();
        this.f2410g = editText;
        editText.setVisibility(4);
        editText.addTextChangedListener(new a(this));
        if (Build.VERSION.SDK_INT >= 24) {
            editText.setImeHintLocales(getContext().getResources().getConfiguration().getLocales());
        }
        addView(chip);
        addView(textInputLayout);
        WeakHashMap weakHashMap = Q.f509a;
        editText.setId(View.generateViewId());
        ((TextView) findViewById(2131296536)).setLabelFor(editText.getId());
        editText.setSaveEnabled(false);
        editText.setLongClickable(false);
    }

    public final boolean isChecked() {
        return this.f2409f.isChecked();
    }

    public final void setChecked(boolean z2) {
        int i;
        Chip chip = this.f2409f;
        chip.setChecked(z2);
        int i2 = 0;
        if (z2) {
            i = 0;
        } else {
            i = 4;
        }
        EditText editText = this.f2410g;
        editText.setVisibility(i);
        if (z2) {
            i2 = 8;
        }
        chip.setVisibility(i2);
        if (chip.isChecked()) {
            editText.requestFocus();
            editText.post(new a(1, (Object) editText));
        }
    }

    public final void setOnClickListener(View.OnClickListener onClickListener) {
        this.f2409f.setOnClickListener(onClickListener);
    }

    public final void setTag(int i, Object obj) {
        this.f2409f.setTag(i, obj);
    }

    public final void toggle() {
        this.f2409f.toggle();
    }

    public static String a(ChipTextInputComboView chipTextInputComboView, CharSequence charSequence) {
        try {
            return String.format(chipTextInputComboView.getResources().getConfiguration().locale, "%02d", new Object[]{Integer.valueOf(Integer.parseInt(String.valueOf(charSequence)))});
        } catch (NumberFormatException unused) {
            return null;
        }
    }

    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        if (Build.VERSION.SDK_INT >= 24) {
            this.f2410g.setImeHintLocales(getContext().getResources().getConfiguration().getLocales());
        }
    }
}
