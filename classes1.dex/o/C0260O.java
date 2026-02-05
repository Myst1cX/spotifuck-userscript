package o;

import T.k;
import android.os.Parcel;
import android.os.Parcelable;
import android.view.View;

/* renamed from: o.O  reason: case insensitive filesystem */
public final class C0260O extends View.BaseSavedState {
    public static final Parcelable.Creator<C0260O> CREATOR = new k(25);

    /* renamed from: a  reason: collision with root package name */
    public boolean f4112a;

    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeByte(this.f4112a ? (byte) 1 : 0);
    }
}
