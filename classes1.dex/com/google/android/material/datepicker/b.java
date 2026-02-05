package com.google.android.material.datepicker;

import T.k;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Objects;

public final class b implements Parcelable {
    public static final Parcelable.Creator<b> CREATOR = new k(11);

    /* renamed from: a  reason: collision with root package name */
    public final n f2214a;

    /* renamed from: b  reason: collision with root package name */
    public final n f2215b;

    /* renamed from: c  reason: collision with root package name */
    public final d f2216c;

    /* renamed from: d  reason: collision with root package name */
    public final n f2217d;
    public final int e;

    /* renamed from: f  reason: collision with root package name */
    public final int f2218f;

    /* renamed from: g  reason: collision with root package name */
    public final int f2219g;

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        if (!this.f2214a.equals(bVar.f2214a) || !this.f2215b.equals(bVar.f2215b) || !Objects.equals(this.f2217d, bVar.f2217d) || this.e != bVar.e || !this.f2216c.equals(bVar.f2216c)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        Integer valueOf = Integer.valueOf(this.e);
        d dVar = this.f2216c;
        return Arrays.hashCode(new Object[]{this.f2214a, this.f2215b, this.f2217d, valueOf, dVar});
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.f2214a, 0);
        parcel.writeParcelable(this.f2215b, 0);
        parcel.writeParcelable(this.f2217d, 0);
        parcel.writeParcelable(this.f2216c, 0);
        parcel.writeInt(this.e);
    }

    public b(n nVar, n nVar2, d dVar, n nVar3, int i) {
        Objects.requireNonNull(nVar, "start cannot be null");
        Objects.requireNonNull(nVar2, "end cannot be null");
        Objects.requireNonNull(dVar, "validator cannot be null");
        this.f2214a = nVar;
        this.f2215b = nVar2;
        this.f2217d = nVar3;
        this.e = i;
        this.f2216c = dVar;
        if (nVar3 != null && nVar.f2274a.compareTo(nVar3.f2274a) > 0) {
            throw new IllegalArgumentException("start Month cannot be after current Month");
        } else if (nVar3 != null && nVar3.f2274a.compareTo(nVar2.f2274a) > 0) {
            throw new IllegalArgumentException("current Month cannot be after end Month");
        } else if (i < 0 || i > v.c((Calendar) null).getMaximum(7)) {
            throw new IllegalArgumentException("firstDayOfWeek is not valid");
        } else {
            this.f2219g = nVar.d(nVar2) + 1;
            this.f2218f = (nVar2.f2276c - nVar.f2276c) + 1;
        }
    }
}
