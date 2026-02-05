package androidx.preference;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.view.accessibility.AccessibilityManager;
import android.widget.Checkable;
import android.widget.CompoundButton;
import androidx.appcompat.widget.SwitchCompat;
import g0.C0098a;
import g0.y;
import g0.z;

public class SwitchPreferenceCompat extends TwoStatePreference {

    /* renamed from: R  reason: collision with root package name */
    public final C0098a f1944R = new C0098a(this, 2);

    /* renamed from: S  reason: collision with root package name */
    public final String f1945S;

    /* renamed from: T  reason: collision with root package name */
    public final String f1946T;

    public final void y(View view) {
        boolean z2 = view instanceof SwitchCompat;
        if (z2) {
            ((SwitchCompat) view).setOnCheckedChangeListener((CompoundButton.OnCheckedChangeListener) null);
        }
        if (view instanceof Checkable) {
            ((Checkable) view).setChecked(this.f1947M);
        }
        if (z2) {
            SwitchCompat switchCompat = (SwitchCompat) view;
            switchCompat.setTextOn(this.f1945S);
            switchCompat.setTextOff(this.f1946T);
            switchCompat.setOnCheckedChangeListener(this.f1944R);
        }
    }

    public SwitchPreferenceCompat(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 2130969687);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, z.f2631m, 2130969687, 0);
        String string = obtainStyledAttributes.getString(7);
        this.f1948N = string == null ? obtainStyledAttributes.getString(0) : string;
        if (this.f1947M) {
            g();
        }
        String string2 = obtainStyledAttributes.getString(6);
        this.f1949O = string2 == null ? obtainStyledAttributes.getString(1) : string2;
        if (!this.f1947M) {
            g();
        }
        String string3 = obtainStyledAttributes.getString(9);
        this.f1945S = string3 == null ? obtainStyledAttributes.getString(3) : string3;
        g();
        String string4 = obtainStyledAttributes.getString(8);
        this.f1946T = string4 == null ? obtainStyledAttributes.getString(4) : string4;
        g();
        this.f1951Q = obtainStyledAttributes.getBoolean(5, obtainStyledAttributes.getBoolean(2, false));
        obtainStyledAttributes.recycle();
    }

    public final void k(y yVar) {
        super.k(yVar);
        y(yVar.r(2131296723));
        x(yVar.r(16908304));
    }

    public final void r(View view) {
        super.r(view);
        if (((AccessibilityManager) this.f1898a.getSystemService("accessibility")).isEnabled()) {
            y(view.findViewById(2131296723));
            x(view.findViewById(16908304));
        }
    }
}
