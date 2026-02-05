package b;

import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;

public final class c extends Binder implements b {

    /* renamed from: c  reason: collision with root package name */
    public static final /* synthetic */ int f2072c = 0;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ d f2073b;

    public c(d dVar) {
        this.f2073b = dVar;
        attachInterface(this, b.f2071a);
    }

    public final void T(int i, Bundle bundle) {
        d dVar = this.f2073b;
        dVar.getClass();
        dVar.a(i, bundle);
    }

    public final IBinder asBinder() {
        return this;
    }

    public final boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
        Object obj;
        String str = b.f2071a;
        if (i >= 1 && i <= 16777215) {
            parcel.enforceInterface(str);
        }
        if (i == 1598968902) {
            parcel2.writeString(str);
            return true;
        } else if (i != 1) {
            return super.onTransact(i, parcel, parcel2, i2);
        } else {
            int readInt = parcel.readInt();
            Parcelable.Creator creator = Bundle.CREATOR;
            if (parcel.readInt() != 0) {
                obj = creator.createFromParcel(parcel);
            } else {
                obj = null;
            }
            T(readInt, (Bundle) obj);
            return true;
        }
    }
}
