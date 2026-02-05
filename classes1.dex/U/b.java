package U;

import A.h;
import android.os.Parcel;
import android.os.Parcelable;

public abstract class b implements Parcelable {
    public static final Parcelable.Creator<b> CREATOR = new h(4);

    /* renamed from: b  reason: collision with root package name */
    public static final a f939b = new b();

    /* renamed from: a  reason: collision with root package name */
    public final Parcelable f940a;

    public b() {
        this.f940a = null;
    }

    public final int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.f940a, i);
    }

    public b(Parcelable parcelable) {
        if (parcelable != null) {
            this.f940a = parcelable == f939b ? null : parcelable;
            return;
        }
        throw new IllegalArgumentException("superState must not be null");
    }

    public b(Parcel parcel, ClassLoader classLoader) {
        Parcelable readParcelable = parcel.readParcelable(classLoader);
        this.f940a = readParcelable == null ? f939b : readParcelable;
    }
}
