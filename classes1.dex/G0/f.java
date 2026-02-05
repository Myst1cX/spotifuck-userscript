package g0;

import T.k;
import android.os.Parcel;
import android.os.Parcelable;
import android.view.AbsSavedState;

public final class f extends l {
    public static final Parcelable.Creator<f> CREATOR = new k(16);

    /* renamed from: a  reason: collision with root package name */
    public String f2559a;

    public f(Parcel parcel) {
        super(parcel);
        this.f2559a = parcel.readString();
    }

    public f(AbsSavedState absSavedState) {
        super(absSavedState);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeString(this.f2559a);
    }
}
