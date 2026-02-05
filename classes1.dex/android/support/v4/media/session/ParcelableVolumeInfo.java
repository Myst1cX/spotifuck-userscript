package android.support.v4.media.session;

import android.annotation.SuppressLint;
import android.os.Parcel;
import android.os.Parcelable;

@SuppressLint({"BanParcelableUsage"})
public class ParcelableVolumeInfo implements Parcelable {
    public static final Parcelable.Creator<ParcelableVolumeInfo> CREATOR = new s(3);

    /* renamed from: a  reason: collision with root package name */
    public int f1092a;

    /* renamed from: b  reason: collision with root package name */
    public int f1093b;

    /* renamed from: c  reason: collision with root package name */
    public int f1094c;

    /* renamed from: d  reason: collision with root package name */
    public int f1095d;
    public int e;

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f1092a);
        parcel.writeInt(this.f1094c);
        parcel.writeInt(this.f1095d);
        parcel.writeInt(this.e);
        parcel.writeInt(this.f1093b);
    }
}
