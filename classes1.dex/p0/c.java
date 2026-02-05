package p0;

import android.os.Parcel;
import android.util.SparseIntArray;
import r.b;
import r.k;

public final class c extends b {

    /* renamed from: d  reason: collision with root package name */
    public final SparseIntArray f4455d;
    public final Parcel e;

    /* renamed from: f  reason: collision with root package name */
    public final int f4456f;

    /* renamed from: g  reason: collision with root package name */
    public final int f4457g;

    /* renamed from: h  reason: collision with root package name */
    public final String f4458h;
    public int i;

    /* renamed from: j  reason: collision with root package name */
    public int f4459j;

    /* renamed from: k  reason: collision with root package name */
    public int f4460k;

    /* JADX WARNING: type inference failed for: r5v0, types: [r.b, r.k] */
    /* JADX WARNING: type inference failed for: r6v0, types: [r.b, r.k] */
    /* JADX WARNING: type inference failed for: r7v0, types: [r.b, r.k] */
    public c(Parcel parcel) {
        this(parcel, parcel.dataPosition(), parcel.dataSize(), "", new k(), new k(), new k());
    }

    public final c a() {
        Parcel parcel = this.e;
        int dataPosition = parcel.dataPosition();
        int i2 = this.f4459j;
        if (i2 == this.f4456f) {
            i2 = this.f4457g;
        }
        int i3 = i2;
        return new c(parcel, dataPosition, i3, this.f4458h + "  ", this.f4452a, this.f4453b, this.f4454c);
    }

    public final boolean e(int i2) {
        while (this.f4459j < this.f4457g) {
            int i3 = this.f4460k;
            if (i3 == i2) {
                return true;
            }
            if (String.valueOf(i3).compareTo(String.valueOf(i2)) > 0) {
                return false;
            }
            int i4 = this.f4459j;
            Parcel parcel = this.e;
            parcel.setDataPosition(i4);
            int readInt = parcel.readInt();
            this.f4460k = parcel.readInt();
            this.f4459j += readInt;
        }
        if (this.f4460k == i2) {
            return true;
        }
        return false;
    }

    public final void i(int i2) {
        int i3 = this.i;
        SparseIntArray sparseIntArray = this.f4455d;
        Parcel parcel = this.e;
        if (i3 >= 0) {
            int i4 = sparseIntArray.get(i3);
            int dataPosition = parcel.dataPosition();
            parcel.setDataPosition(i4);
            parcel.writeInt(dataPosition - i4);
            parcel.setDataPosition(dataPosition);
        }
        this.i = i2;
        sparseIntArray.put(i2, parcel.dataPosition());
        parcel.writeInt(0);
        parcel.writeInt(i2);
    }

    public c(Parcel parcel, int i2, int i3, String str, b bVar, b bVar2, b bVar3) {
        super(bVar, bVar2, bVar3);
        this.f4455d = new SparseIntArray();
        this.i = -1;
        this.f4460k = -1;
        this.e = parcel;
        this.f4456f = i2;
        this.f4457g = i3;
        this.f4459j = i2;
        this.f4458h = str;
    }
}
