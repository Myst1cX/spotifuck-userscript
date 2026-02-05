package N0;

import A.h;
import U.b;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;

public final class F extends b {
    public static final Parcelable.Creator<F> CREATOR = new h(3);

    /* renamed from: c  reason: collision with root package name */
    public CharSequence f612c;

    /* renamed from: d  reason: collision with root package name */
    public boolean f613d;

    public final String toString() {
        return "TextInputLayout.SavedState{" + Integer.toHexString(System.identityHashCode(this)) + " error=" + this.f612c + "}";
    }

    public F(Parcel parcel, ClassLoader classLoader) {
        super(parcel, classLoader);
        this.f612c = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
        this.f613d = parcel.readInt() != 1 ? false : true;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        TextUtils.writeToParcel(this.f612c, parcel, i);
        parcel.writeInt(this.f613d ? 1 : 0);
    }
}
