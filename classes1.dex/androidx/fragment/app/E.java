package androidx.fragment.app;

import T.k;
import android.os.Parcel;
import android.os.Parcelable;

public final class E implements Parcelable {
    public static final Parcelable.Creator<E> CREATOR = new k(7);

    /* renamed from: a  reason: collision with root package name */
    public String f1561a;

    /* renamed from: b  reason: collision with root package name */
    public int f1562b;

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f1561a);
        parcel.writeInt(this.f1562b);
    }
}
