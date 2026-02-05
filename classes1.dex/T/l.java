package T;

import android.os.Parcel;
import android.os.Parcelable;
import android.view.View;

public final class l extends View.BaseSavedState {
    public static final Parcelable.Creator<l> CREATOR = new k(0);

    /* renamed from: a  reason: collision with root package name */
    public int f916a;

    public final String toString() {
        return "HorizontalScrollView.SavedState{" + Integer.toHexString(System.identityHashCode(this)) + " scrollPosition=" + this.f916a + "}";
    }

    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeInt(this.f916a);
    }
}
