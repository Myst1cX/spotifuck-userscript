package com.google.android.material.datepicker;

import T.k;
import android.content.Context;
import android.icu.text.DateFormat;
import android.icu.text.DisplayContext;
import android.icu.util.TimeZone;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.format.DateUtils;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Locale;
import java.util.concurrent.atomic.AtomicReference;

public final class n implements Comparable, Parcelable {
    public static final Parcelable.Creator<n> CREATOR = new k(13);

    /* renamed from: a  reason: collision with root package name */
    public final Calendar f2274a;

    /* renamed from: b  reason: collision with root package name */
    public final int f2275b;

    /* renamed from: c  reason: collision with root package name */
    public final int f2276c;

    /* renamed from: d  reason: collision with root package name */
    public final int f2277d;
    public final int e;

    /* renamed from: f  reason: collision with root package name */
    public final long f2278f;

    /* renamed from: g  reason: collision with root package name */
    public String f2279g;

    public static n a(int i, int i2) {
        Calendar c2 = v.c((Calendar) null);
        c2.set(1, i);
        c2.set(2, i2);
        return new n(c2);
    }

    public static n b(long j2) {
        Calendar c2 = v.c((Calendar) null);
        c2.setTimeInMillis(j2);
        return new n(c2);
    }

    public final int describeContents() {
        return 0;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x000a, code lost:
        r5 = (com.google.android.material.datepicker.n) r5;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean equals(java.lang.Object r5) {
        /*
            r4 = this;
            r0 = 1
            if (r4 != r5) goto L_0x0004
            return r0
        L_0x0004:
            boolean r1 = r5 instanceof com.google.android.material.datepicker.n
            r2 = 0
            if (r1 != 0) goto L_0x000a
            return r2
        L_0x000a:
            com.google.android.material.datepicker.n r5 = (com.google.android.material.datepicker.n) r5
            int r1 = r5.f2275b
            int r3 = r4.f2275b
            if (r3 != r1) goto L_0x0019
            int r1 = r4.f2276c
            int r5 = r5.f2276c
            if (r1 != r5) goto L_0x0019
            goto L_0x001a
        L_0x0019:
            r0 = 0
        L_0x001a:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.datepicker.n.equals(java.lang.Object):boolean");
    }

    public final String c() {
        String str;
        if (this.f2279g == null) {
            long timeInMillis = this.f2274a.getTimeInMillis();
            if (Build.VERSION.SDK_INT >= 24) {
                Locale locale = Locale.getDefault();
                AtomicReference atomicReference = v.f2291a;
                DateFormat c2 = DateFormat.getInstanceForSkeleton("yMMMM", locale);
                c2.setTimeZone(TimeZone.getTimeZone("UTC"));
                c2.setContext(DisplayContext.CAPITALIZATION_FOR_STANDALONE);
                str = c2.format(new Date(timeInMillis));
            } else {
                str = DateUtils.formatDateTime((Context) null, timeInMillis, 8228);
            }
            this.f2279g = str;
        }
        return this.f2279g;
    }

    public final int compareTo(Object obj) {
        return this.f2274a.compareTo(((n) obj).f2274a);
    }

    public final int d(n nVar) {
        if (this.f2274a instanceof GregorianCalendar) {
            return (nVar.f2275b - this.f2275b) + ((nVar.f2276c - this.f2276c) * 12);
        }
        throw new IllegalArgumentException("Only Gregorian calendars are supported.");
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f2275b), Integer.valueOf(this.f2276c)});
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f2276c);
        parcel.writeInt(this.f2275b);
    }

    public n(Calendar calendar) {
        calendar.set(5, 1);
        Calendar a2 = v.a(calendar);
        this.f2274a = a2;
        this.f2275b = a2.get(2);
        this.f2276c = a2.get(1);
        this.f2277d = a2.getMaximum(7);
        this.e = a2.getActualMaximum(5);
        this.f2278f = a2.getTimeInMillis();
    }
}
