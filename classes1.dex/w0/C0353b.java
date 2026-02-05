package w0;

import A.h;
import U.b;
import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: w0.b  reason: case insensitive filesystem */
public final class C0353b extends b {
    public static final Parcelable.Creator<C0353b> CREATOR = new h(8);

    /* renamed from: c  reason: collision with root package name */
    public boolean f4901c;

    public C0353b(Parcel parcel, ClassLoader classLoader) {
        super(parcel, classLoader);
        if (classLoader == null) {
            C0353b.class.getClassLoader();
        }
        this.f4901c = parcel.readInt() != 1 ? false : true;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeInt(this.f4901c ? 1 : 0);
    }
}
