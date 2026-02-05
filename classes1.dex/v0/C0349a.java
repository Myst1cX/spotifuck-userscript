package v0;

import A.h;
import U.b;
import android.os.Parcel;
import android.os.Parcelable;
import android.view.AbsSavedState;
import com.google.android.material.bottomsheet.BottomSheetBehavior;

/* renamed from: v0.a  reason: case insensitive filesystem */
public final class C0349a extends b {
    public static final Parcelable.Creator<C0349a> CREATOR = new h(7);

    /* renamed from: c  reason: collision with root package name */
    public final int f4850c;

    /* renamed from: d  reason: collision with root package name */
    public final int f4851d;
    public final boolean e;

    /* renamed from: f  reason: collision with root package name */
    public final boolean f4852f;

    /* renamed from: g  reason: collision with root package name */
    public final boolean f4853g;

    public C0349a(Parcel parcel, ClassLoader classLoader) {
        super(parcel, classLoader);
        this.f4850c = parcel.readInt();
        this.f4851d = parcel.readInt();
        boolean z2 = false;
        this.e = parcel.readInt() == 1;
        this.f4852f = parcel.readInt() == 1;
        this.f4853g = parcel.readInt() == 1 ? true : z2;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeInt(this.f4850c);
        parcel.writeInt(this.f4851d);
        parcel.writeInt(this.e ? 1 : 0);
        parcel.writeInt(this.f4852f ? 1 : 0);
        parcel.writeInt(this.f4853g ? 1 : 0);
    }

    public C0349a(AbsSavedState absSavedState, BottomSheetBehavior bottomSheetBehavior) {
        super(absSavedState);
        this.f4850c = bottomSheetBehavior.f2119L;
        this.f4851d = bottomSheetBehavior.e;
        this.e = bottomSheetBehavior.f2136b;
        this.f4852f = bottomSheetBehavior.I;
        this.f4853g = bottomSheetBehavior.f2117J;
    }
}
