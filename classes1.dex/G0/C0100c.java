package g0;

import T.k;
import android.os.Parcel;
import android.os.Parcelable;
import android.view.AbsSavedState;

/* renamed from: g0.c  reason: case insensitive filesystem */
public final class C0100c extends l {
    public static final Parcelable.Creator<C0100c> CREATOR = new k(15);

    /* renamed from: a  reason: collision with root package name */
    public String f2553a;

    public C0100c(Parcel parcel) {
        super(parcel);
        this.f2553a = parcel.readString();
    }

    public C0100c(AbsSavedState absSavedState) {
        super(absSavedState);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeString(this.f2553a);
    }
}
