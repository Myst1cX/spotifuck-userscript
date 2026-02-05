package androidx.fragment.app;

import T.k;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;

public final class L implements Parcelable {
    public static final Parcelable.Creator<L> CREATOR = new k(9);

    /* renamed from: a  reason: collision with root package name */
    public final String f1617a;

    /* renamed from: b  reason: collision with root package name */
    public final String f1618b;

    /* renamed from: c  reason: collision with root package name */
    public final boolean f1619c;

    /* renamed from: d  reason: collision with root package name */
    public final int f1620d;
    public final int e;

    /* renamed from: f  reason: collision with root package name */
    public final String f1621f;

    /* renamed from: g  reason: collision with root package name */
    public final boolean f1622g;

    /* renamed from: h  reason: collision with root package name */
    public final boolean f1623h;
    public final boolean i;

    /* renamed from: j  reason: collision with root package name */
    public final Bundle f1624j;

    /* renamed from: k  reason: collision with root package name */
    public final boolean f1625k;

    /* renamed from: l  reason: collision with root package name */
    public final int f1626l;

    /* renamed from: m  reason: collision with root package name */
    public Bundle f1627m;

    public L(r rVar) {
        this.f1617a = rVar.getClass().getName();
        this.f1618b = rVar.f1755j;
        this.f1619c = rVar.f1763r;
        this.f1620d = rVar.f1729A;
        this.e = rVar.f1730B;
        this.f1621f = rVar.f1731C;
        this.f1622g = rVar.f1734F;
        this.f1623h = rVar.f1762q;
        this.i = rVar.f1733E;
        this.f1624j = rVar.f1756k;
        this.f1625k = rVar.f1732D;
        this.f1626l = rVar.f1745R.ordinal();
    }

    public final int describeContents() {
        return 0;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(128);
        sb.append("FragmentState{");
        sb.append(this.f1617a);
        sb.append(" (");
        sb.append(this.f1618b);
        sb.append(")}:");
        if (this.f1619c) {
            sb.append(" fromLayout");
        }
        int i2 = this.e;
        if (i2 != 0) {
            sb.append(" id=0x");
            sb.append(Integer.toHexString(i2));
        }
        String str = this.f1621f;
        if (str != null && !str.isEmpty()) {
            sb.append(" tag=");
            sb.append(str);
        }
        if (this.f1622g) {
            sb.append(" retainInstance");
        }
        if (this.f1623h) {
            sb.append(" removing");
        }
        if (this.i) {
            sb.append(" detached");
        }
        if (this.f1625k) {
            sb.append(" hidden");
        }
        return sb.toString();
    }

    public final void writeToParcel(Parcel parcel, int i2) {
        parcel.writeString(this.f1617a);
        parcel.writeString(this.f1618b);
        parcel.writeInt(this.f1619c ? 1 : 0);
        parcel.writeInt(this.f1620d);
        parcel.writeInt(this.e);
        parcel.writeString(this.f1621f);
        parcel.writeInt(this.f1622g ? 1 : 0);
        parcel.writeInt(this.f1623h ? 1 : 0);
        parcel.writeInt(this.i ? 1 : 0);
        parcel.writeBundle(this.f1624j);
        parcel.writeInt(this.f1625k ? 1 : 0);
        parcel.writeBundle(this.f1627m);
        parcel.writeInt(this.f1626l);
    }

    public L(Parcel parcel) {
        this.f1617a = parcel.readString();
        this.f1618b = parcel.readString();
        boolean z2 = false;
        this.f1619c = parcel.readInt() != 0;
        this.f1620d = parcel.readInt();
        this.e = parcel.readInt();
        this.f1621f = parcel.readString();
        this.f1622g = parcel.readInt() != 0;
        this.f1623h = parcel.readInt() != 0;
        this.i = parcel.readInt() != 0;
        this.f1624j = parcel.readBundle();
        this.f1625k = parcel.readInt() != 0 ? true : z2;
        this.f1627m = parcel.readBundle();
        this.f1626l = parcel.readInt();
    }
}
