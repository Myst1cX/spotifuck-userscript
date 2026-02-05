package com.google.android.material.datepicker;

import android.widget.BaseAdapter;
import java.util.Calendar;

public final class o extends BaseAdapter {

    /* renamed from: d  reason: collision with root package name */
    public static final int f2280d = v.c((Calendar) null).getMaximum(4);
    public static final int e = ((v.c((Calendar) null).getMaximum(7) + v.c((Calendar) null).getMaximum(5)) - 1);

    /* renamed from: a  reason: collision with root package name */
    public final n f2281a;

    /* renamed from: b  reason: collision with root package name */
    public c f2282b;

    /* renamed from: c  reason: collision with root package name */
    public final b f2283c;

    /* JADX WARNING: type inference failed for: r6v10, types: [android.view.View] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final android.view.View getView(int r5, android.view.View r6, android.view.ViewGroup r7) {
        /*
            r4 = this;
            r0 = 1
            r1 = 0
            android.content.Context r2 = r7.getContext()
            com.google.android.material.datepicker.c r3 = r4.f2282b
            if (r3 != 0) goto L_0x0011
            com.google.android.material.datepicker.c r3 = new com.google.android.material.datepicker.c
            r3.<init>(r2)
            r4.f2282b = r3
        L_0x0011:
            r2 = r6
            android.widget.TextView r2 = (android.widget.TextView) r2
            if (r6 != 0) goto L_0x0028
            android.content.Context r6 = r7.getContext()
            android.view.LayoutInflater r6 = android.view.LayoutInflater.from(r6)
            r2 = 2131492940(0x7f0c004c, float:1.8609346E38)
            android.view.View r6 = r6.inflate(r2, r7, r1)
            r2 = r6
            android.widget.TextView r2 = (android.widget.TextView) r2
        L_0x0028:
            int r6 = r4.a()
            int r6 = r5 - r6
            if (r6 < 0) goto L_0x005d
            com.google.android.material.datepicker.n r7 = r4.f2281a
            int r3 = r7.e
            if (r6 < r3) goto L_0x0037
            goto L_0x005d
        L_0x0037:
            int r6 = r6 + r0
            r2.setTag(r7)
            android.content.res.Resources r7 = r2.getResources()
            android.content.res.Configuration r7 = r7.getConfiguration()
            java.util.Locale r7 = r7.locale
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
            java.lang.Object[] r3 = new java.lang.Object[r0]
            r3[r1] = r6
            java.lang.String r6 = "%d"
            java.lang.String r6 = java.lang.String.format(r7, r6, r3)
            r2.setText(r6)
            r2.setVisibility(r1)
            r2.setEnabled(r0)
            goto L_0x0065
        L_0x005d:
            r6 = 8
            r2.setVisibility(r6)
            r2.setEnabled(r1)
        L_0x0065:
            java.lang.Long r5 = r4.getItem(r5)
            if (r5 != 0) goto L_0x006c
            goto L_0x006e
        L_0x006c:
            if (r2 != 0) goto L_0x006f
        L_0x006e:
            return r2
        L_0x006f:
            r2.getContext()
            java.util.Calendar r5 = com.google.android.material.datepicker.v.b()
            r5.getTimeInMillis()
            r5 = 0
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.datepicker.o.getView(int, android.view.View, android.view.ViewGroup):android.view.View");
    }

    public final boolean hasStableIds() {
        return true;
    }

    public final int a() {
        int i = this.f2283c.e;
        n nVar = this.f2281a;
        Calendar calendar = nVar.f2274a;
        int i2 = calendar.get(7);
        if (i <= 0) {
            i = calendar.getFirstDayOfWeek();
        }
        int i3 = i2 - i;
        if (i3 < 0) {
            return i3 + nVar.f2277d;
        }
        return i3;
    }

    public final int getCount() {
        return e;
    }

    public final long getItemId(int i) {
        return (long) (i / this.f2281a.f2277d);
    }

    public o(n nVar, b bVar) {
        this.f2281a = nVar;
        this.f2283c = bVar;
        throw null;
    }

    /* renamed from: b */
    public final Long getItem(int i) {
        if (i < a() || i > c()) {
            return null;
        }
        Calendar a2 = v.a(this.f2281a.f2274a);
        a2.set(5, (i - a()) + 1);
        return Long.valueOf(a2.getTimeInMillis());
    }

    public final int c() {
        return (a() + this.f2281a.e) - 1;
    }
}
