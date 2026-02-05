package j0;

import A.h;
import U.b;
import android.os.Parcel;
import android.os.Parcelable;

public final class U extends b {
    public static final Parcelable.Creator<U> CREATOR = new h(5);

    /* renamed from: c  reason: collision with root package name */
    public Parcelable f3308c;

    public U(Parcel parcel, ClassLoader classLoader) {
        super(parcel, classLoader);
        this.f3308c = parcel.readParcelable(classLoader == null ? K.class.getClassLoader() : classLoader);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeParcelable(this.f3308c, 0);
    }
}
