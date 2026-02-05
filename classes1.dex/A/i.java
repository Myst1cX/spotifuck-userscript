package A;

import U.b;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.SparseArray;

public final class i extends b {
    public static final Parcelable.Creator<i> CREATOR = new h(0);

    /* renamed from: c  reason: collision with root package name */
    public SparseArray f19c;

    public i(Parcel parcel, ClassLoader classLoader) {
        super(parcel, classLoader);
        int readInt = parcel.readInt();
        int[] iArr = new int[readInt];
        parcel.readIntArray(iArr);
        Parcelable[] readParcelableArray = parcel.readParcelableArray(classLoader);
        this.f19c = new SparseArray(readInt);
        for (int i = 0; i < readInt; i++) {
            this.f19c.append(iArr[i], readParcelableArray[i]);
        }
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int i2;
        super.writeToParcel(parcel, i);
        SparseArray sparseArray = this.f19c;
        if (sparseArray != null) {
            i2 = sparseArray.size();
        } else {
            i2 = 0;
        }
        parcel.writeInt(i2);
        int[] iArr = new int[i2];
        Parcelable[] parcelableArr = new Parcelable[i2];
        for (int i3 = 0; i3 < i2; i3++) {
            iArr[i3] = this.f19c.keyAt(i3);
            parcelableArr[i3] = (Parcelable) this.f19c.valueAt(i3);
        }
        parcel.writeIntArray(iArr);
        parcel.writeParcelableArray(parcelableArr, i);
    }
}
