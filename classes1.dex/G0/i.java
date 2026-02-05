package g0;

import T.k;
import android.os.Parcel;
import android.os.Parcelable;
import android.view.AbsSavedState;
import java.util.Collections;
import java.util.HashSet;

public final class i extends l {
    public static final Parcelable.Creator<i> CREATOR = new k(17);

    /* renamed from: a  reason: collision with root package name */
    public HashSet f2564a;

    public i(Parcel parcel) {
        super(parcel);
        int readInt = parcel.readInt();
        this.f2564a = new HashSet();
        String[] strArr = new String[readInt];
        parcel.readStringArray(strArr);
        Collections.addAll(this.f2564a, strArr);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeInt(this.f2564a.size());
        HashSet hashSet = this.f2564a;
        parcel.writeStringArray((String[]) hashSet.toArray(new String[hashSet.size()]));
    }

    public i(AbsSavedState absSavedState) {
        super(absSavedState);
    }
}
