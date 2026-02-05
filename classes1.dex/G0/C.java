package g0;

import T.k;
import android.os.Parcel;
import android.os.Parcelable;
import android.view.AbsSavedState;

public final class C extends l {
    public static final Parcelable.Creator<C> CREATOR = new k(20);

    /* renamed from: a  reason: collision with root package name */
    public int f2545a;

    /* renamed from: b  reason: collision with root package name */
    public int f2546b;

    /* renamed from: c  reason: collision with root package name */
    public int f2547c;

    public C(Parcel parcel) {
        super(parcel);
        this.f2545a = parcel.readInt();
        this.f2546b = parcel.readInt();
        this.f2547c = parcel.readInt();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeInt(this.f2545a);
        parcel.writeInt(this.f2546b);
        parcel.writeInt(this.f2547c);
    }

    public C(AbsSavedState absSavedState) {
        super(absSavedState);
    }
}
