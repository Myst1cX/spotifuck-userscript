package com.google.android.material.datepicker;

import android.os.Build;
import android.widget.BaseAdapter;
import java.util.Calendar;

public final class e extends BaseAdapter {

    /* renamed from: d  reason: collision with root package name */
    public static final int f2223d;

    /* renamed from: a  reason: collision with root package name */
    public final Calendar f2224a;

    /* renamed from: b  reason: collision with root package name */
    public final int f2225b;

    /* renamed from: c  reason: collision with root package name */
    public final int f2226c;

    public e() {
        Calendar c2 = v.c((Calendar) null);
        this.f2224a = c2;
        this.f2225b = c2.getMaximum(7);
        this.f2226c = c2.getFirstDayOfWeek();
    }

    public final long getItemId(int i) {
        return 0;
    }

    /* JADX WARNING: type inference failed for: r6v7, types: [android.view.View] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final android.view.View getView(int r5, android.view.View r6, android.view.ViewGroup r7) {
        /*
            r4 = this;
            r0 = 0
            r1 = r6
            android.widget.TextView r1 = (android.widget.TextView) r1
            if (r6 != 0) goto L_0x0018
            android.content.Context r6 = r7.getContext()
            android.view.LayoutInflater r6 = android.view.LayoutInflater.from(r6)
            r1 = 2131492941(0x7f0c004d, float:1.8609348E38)
            android.view.View r6 = r6.inflate(r1, r7, r0)
            r1 = r6
            android.widget.TextView r1 = (android.widget.TextView) r1
        L_0x0018:
            int r6 = r4.f2226c
            int r5 = r5 + r6
            int r6 = r4.f2225b
            if (r5 <= r6) goto L_0x0020
            int r5 = r5 - r6
        L_0x0020:
            java.util.Calendar r6 = r4.f2224a
            r2 = 7
            r6.set(r2, r5)
            android.content.res.Resources r5 = r1.getResources()
            android.content.res.Configuration r5 = r5.getConfiguration()
            java.util.Locale r5 = r5.locale
            int r3 = f2223d
            java.lang.String r5 = r6.getDisplayName(r2, r3, r5)
            r1.setText(r5)
            android.content.Context r5 = r7.getContext()
            r7 = 2131755179(0x7f1000ab, float:1.914123E38)
            java.lang.String r5 = r5.getString(r7)
            r7 = 2
            java.util.Locale r3 = java.util.Locale.getDefault()
            java.lang.String r6 = r6.getDisplayName(r2, r7, r3)
            r7 = 1
            java.lang.Object[] r7 = new java.lang.Object[r7]
            r7[r0] = r6
            java.lang.String r5 = java.lang.String.format(r5, r7)
            r1.setContentDescription(r5)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.datepicker.e.getView(int, android.view.View, android.view.ViewGroup):android.view.View");
    }

    static {
        int i;
        if (Build.VERSION.SDK_INT >= 26) {
            i = 4;
        } else {
            i = 1;
        }
        f2223d = i;
    }

    public final int getCount() {
        return this.f2225b;
    }

    public final Object getItem(int i) {
        int i2 = this.f2225b;
        if (i >= i2) {
            return null;
        }
        int i3 = i + this.f2226c;
        if (i3 > i2) {
            i3 -= i2;
        }
        return Integer.valueOf(i3);
    }

    public e(int i) {
        Calendar c2 = v.c((Calendar) null);
        this.f2224a = c2;
        this.f2225b = c2.getMaximum(7);
        this.f2226c = i;
    }
}
