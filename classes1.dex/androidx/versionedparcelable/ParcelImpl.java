package androidx.versionedparcelable;

import T.k;
import android.annotation.SuppressLint;
import android.os.Parcel;
import android.os.Parcelable;
import p0.c;
import p0.d;

@SuppressLint({"BanParcelableUsage"})
public class ParcelImpl implements Parcelable {
    public static final Parcelable.Creator<ParcelImpl> CREATOR = new k(26);

    /* renamed from: a  reason: collision with root package name */
    public final d f2069a;

    public ParcelImpl(d dVar) {
        this.f2069a = dVar;
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        new c(parcel).l(this.f2069a);
    }

    public ParcelImpl(Parcel parcel) {
        this.f2069a = new c(parcel).h();
    }
}
