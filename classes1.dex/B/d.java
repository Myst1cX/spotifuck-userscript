package b;

import T.k;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;

public class d implements Parcelable {
    public static final Parcelable.Creator<d> CREATOR = new k(10);

    /* renamed from: a  reason: collision with root package name */
    public b f2074a;

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        synchronized (this) {
            try {
                if (this.f2074a == null) {
                    this.f2074a = new c(this);
                }
                parcel.writeStrongBinder(this.f2074a.asBinder());
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void a(int i, Bundle bundle) {
    }

    public final void b(int i, Bundle bundle) {
        b bVar = this.f2074a;
        if (bVar != null) {
            try {
                bVar.T(i, bundle);
            } catch (RemoteException unused) {
            }
        }
    }
}
