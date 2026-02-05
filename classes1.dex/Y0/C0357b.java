package y0;

import T.k;
import android.os.Parcel;
import android.os.Parcelable;
import android.view.View;

/* renamed from: y0.b  reason: case insensitive filesystem */
public final class C0357b extends View.BaseSavedState {
    public static final Parcelable.Creator<C0357b> CREATOR = new k(27);

    /* renamed from: a  reason: collision with root package name */
    public int f5148a;

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder("MaterialCheckBox.SavedState{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append(" CheckedState=");
        int i = this.f5148a;
        if (i == 1) {
            str = "checked";
        } else if (i != 2) {
            str = "unchecked";
        } else {
            str = "indeterminate";
        }
        sb.append(str);
        sb.append("}");
        return sb.toString();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeValue(Integer.valueOf(this.f5148a));
    }
}
