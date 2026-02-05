package L0;

import A.h;
import U.b;
import android.os.Parcel;
import android.os.Parcelable;
import android.view.AbsSavedState;
import com.google.android.material.sidesheet.SideSheetBehavior;

public final class d extends b {
    public static final Parcelable.Creator<d> CREATOR = new h(2);

    /* renamed from: c  reason: collision with root package name */
    public final int f474c;

    public d(Parcel parcel, ClassLoader classLoader) {
        super(parcel, classLoader);
        this.f474c = parcel.readInt();
    }

    public d(AbsSavedState absSavedState, SideSheetBehavior sideSheetBehavior) {
        super(absSavedState);
        this.f474c = sideSheetBehavior.f2316h;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeInt(this.f474c);
    }
}
