package E0;

import A.h;
import android.os.Parcel;
import android.os.Parcelable;

public final class b extends U.b {
    public static final Parcelable.Creator<b> CREATOR = new h(1);

    /* renamed from: c  reason: collision with root package name */
    public boolean f134c;

    public b(Parcel parcel, ClassLoader classLoader) {
        super(parcel, classLoader);
        this.f134c = parcel.readInt() != 1 ? false : true;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeInt(this.f134c ? 1 : 0);
    }
}
