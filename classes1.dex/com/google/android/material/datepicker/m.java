package com.google.android.material.datepicker;

import android.os.Bundle;
import android.os.Parcelable;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public final class m<S> extends s {

    /* renamed from: a0  reason: collision with root package name */
    public int f2272a0;

    /* renamed from: b0  reason: collision with root package name */
    public b f2273b0;

    public final View u(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        layoutInflater.cloneInContext(new ContextThemeWrapper(h(), this.f2272a0));
        throw null;
    }

    public final void y(Bundle bundle) {
        bundle.putInt("THEME_RES_ID_KEY", this.f2272a0);
        bundle.putParcelable("DATE_SELECTOR_KEY", (Parcelable) null);
        bundle.putParcelable("CALENDAR_CONSTRAINTS_KEY", this.f2273b0);
    }

    public final void t(Bundle bundle) {
        super.t(bundle);
        if (bundle == null) {
            bundle = this.f1756k;
        }
        this.f2272a0 = bundle.getInt("THEME_RES_ID_KEY");
        if (bundle.getParcelable("DATE_SELECTOR_KEY") == null) {
            this.f2273b0 = (b) bundle.getParcelable("CALENDAR_CONSTRAINTS_KEY");
            return;
        }
        throw new ClassCastException();
    }
}
