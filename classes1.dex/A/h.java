package A;

import E0.b;
import L0.d;
import N0.F;
import android.os.Parcel;
import android.os.Parcelable;
import j0.U;
import o.d1;
import v0.C0349a;
import w0.C0353b;

public final class h implements Parcelable.ClassLoaderCreator {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f18a;

    public /* synthetic */ h(int i) {
        this.f18a = i;
    }

    public final Object createFromParcel(Parcel parcel, ClassLoader classLoader) {
        switch (this.f18a) {
            case 0:
                return new i(parcel, classLoader);
            case 1:
                return new b(parcel, classLoader);
            case 2:
                return new d(parcel, classLoader);
            case 3:
                return new F(parcel, classLoader);
            case 4:
                if (parcel.readParcelable(classLoader) == null) {
                    return U.b.f939b;
                }
                throw new IllegalStateException("superState must be null");
            case 5:
                return new U(parcel, classLoader);
            case 6:
                return new d1(parcel, classLoader);
            case 7:
                return new C0349a(parcel, classLoader);
            default:
                return new C0353b(parcel, classLoader);
        }
    }

    public final Object[] newArray(int i) {
        switch (this.f18a) {
            case 0:
                return new i[i];
            case 1:
                return new b[i];
            case 2:
                return new d[i];
            case 3:
                return new F[i];
            case 4:
                return new U.b[i];
            case 5:
                return new U[i];
            case 6:
                return new d1[i];
            case 7:
                return new C0349a[i];
            default:
                return new C0353b[i];
        }
    }

    public final Object createFromParcel(Parcel parcel) {
        switch (this.f18a) {
            case 0:
                return new i(parcel, (ClassLoader) null);
            case 1:
                return new b(parcel, (ClassLoader) null);
            case 2:
                return new d(parcel, (ClassLoader) null);
            case 3:
                return new F(parcel, (ClassLoader) null);
            case 4:
                if (parcel.readParcelable((ClassLoader) null) == null) {
                    return U.b.f939b;
                }
                throw new IllegalStateException("superState must be null");
            case 5:
                return new U(parcel, (ClassLoader) null);
            case 6:
                return new d1(parcel, (ClassLoader) null);
            case 7:
                return new C0349a(parcel, (ClassLoader) null);
            default:
                return new C0353b(parcel, (ClassLoader) null);
        }
    }
}
