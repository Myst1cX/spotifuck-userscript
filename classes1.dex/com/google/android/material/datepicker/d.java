package com.google.android.material.datepicker;

import T.k;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

public final class d implements Parcelable {
    public static final Parcelable.Creator<d> CREATOR = new k(12);

    /* renamed from: a  reason: collision with root package name */
    public final long f2222a;

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof d) && this.f2222a == ((d) obj).f2222a) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Long.valueOf(this.f2222a)});
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeLong(this.f2222a);
    }

    public d(long j2) {
        this.f2222a = j2;
    }
}
