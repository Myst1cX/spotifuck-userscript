package g0;

import T.k;
import android.os.Parcel;
import android.os.Parcelable;
import android.view.AbsSavedState;

public final class s extends l {
    public static final Parcelable.Creator<s> CREATOR = new k(19);

    /* renamed from: a  reason: collision with root package name */
    public final int f2591a;

    public s(Parcel parcel) {
        super(parcel);
        this.f2591a = parcel.readInt();
    }

    public s(AbsSavedState absSavedState, int i) {
        super(absSavedState);
        this.f2591a = i;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeInt(this.f2591a);
    }
}
