package j0;

import T.k;
import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: j0.u  reason: case insensitive filesystem */
public final class C0158u implements Parcelable {
    public static final Parcelable.Creator<C0158u> CREATOR = new k(22);

    /* renamed from: a  reason: collision with root package name */
    public int f3499a;

    /* renamed from: b  reason: collision with root package name */
    public int f3500b;

    /* renamed from: c  reason: collision with root package name */
    public boolean f3501c;

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f3499a);
        parcel.writeInt(this.f3500b);
        parcel.writeInt(this.f3501c ? 1 : 0);
    }
}
