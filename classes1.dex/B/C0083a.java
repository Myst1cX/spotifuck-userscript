package b;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;

/* renamed from: b.a  reason: case insensitive filesystem */
public final class C0083a implements b {

    /* renamed from: b  reason: collision with root package name */
    public IBinder f2070b;

    public final IBinder asBinder() {
        return this.f2070b;
    }

    public final void T(int i, Bundle bundle) {
        Parcel obtain = Parcel.obtain();
        try {
            obtain.writeInterfaceToken(b.f2071a);
            obtain.writeInt(i);
            if (bundle != null) {
                obtain.writeInt(1);
                bundle.writeToParcel(obtain, 0);
            } else {
                obtain.writeInt(0);
            }
            this.f2070b.transact(1, obtain, (Parcel) null, 1);
        } finally {
            obtain.recycle();
        }
    }
}
