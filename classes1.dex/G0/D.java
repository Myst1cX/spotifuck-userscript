package g0;

import T.k;
import android.os.Parcel;
import android.os.Parcelable;
import android.view.AbsSavedState;

public final class D extends l {
    public static final Parcelable.Creator<D> CREATOR = new k(21);

    /* renamed from: a  reason: collision with root package name */
    public boolean f2548a;

    public D(Parcel parcel) {
        super(parcel);
        this.f2548a = parcel.readInt() != 1 ? false : true;
    }

    public D(AbsSavedState absSavedState) {
        super(absSavedState);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeInt(this.f2548a ? 1 : 0);
    }
}
