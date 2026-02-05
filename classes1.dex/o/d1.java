package o;

import A.h;
import U.b;
import android.os.Parcel;
import android.os.Parcelable;

public final class d1 extends b {
    public static final Parcelable.Creator<d1> CREATOR = new h(6);

    /* renamed from: c  reason: collision with root package name */
    public int f4184c;

    /* renamed from: d  reason: collision with root package name */
    public boolean f4185d;

    public d1(Parcel parcel, ClassLoader classLoader) {
        super(parcel, classLoader);
        boolean z2;
        this.f4184c = parcel.readInt();
        if (parcel.readInt() != 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        this.f4185d = z2;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeInt(this.f4184c);
        parcel.writeInt(this.f4185d ? 1 : 0);
    }
}
