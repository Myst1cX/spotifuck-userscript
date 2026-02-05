package androidx.fragment.app;

import T.k;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import java.util.ArrayList;

/* renamed from: androidx.fragment.app.b  reason: case insensitive filesystem */
public final class C0048b implements Parcelable {
    public static final Parcelable.Creator<C0048b> CREATOR = new k(5);

    /* renamed from: a  reason: collision with root package name */
    public final int[] f1670a;

    /* renamed from: b  reason: collision with root package name */
    public final ArrayList f1671b;

    /* renamed from: c  reason: collision with root package name */
    public final int[] f1672c;

    /* renamed from: d  reason: collision with root package name */
    public final int[] f1673d;
    public final int e;

    /* renamed from: f  reason: collision with root package name */
    public final String f1674f;

    /* renamed from: g  reason: collision with root package name */
    public final int f1675g;

    /* renamed from: h  reason: collision with root package name */
    public final int f1676h;
    public final CharSequence i;

    /* renamed from: j  reason: collision with root package name */
    public final int f1677j;

    /* renamed from: k  reason: collision with root package name */
    public final CharSequence f1678k;

    /* renamed from: l  reason: collision with root package name */
    public final ArrayList f1679l;

    /* renamed from: m  reason: collision with root package name */
    public final ArrayList f1680m;

    /* renamed from: n  reason: collision with root package name */
    public final boolean f1681n;

    public C0048b(C0047a aVar) {
        int size = aVar.f1653a.size();
        this.f1670a = new int[(size * 6)];
        if (aVar.f1658g) {
            this.f1671b = new ArrayList(size);
            this.f1672c = new int[size];
            this.f1673d = new int[size];
            int i2 = 0;
            for (int i3 = 0; i3 < size; i3++) {
                N n2 = (N) aVar.f1653a.get(i3);
                int i4 = i2 + 1;
                this.f1670a[i2] = n2.f1632a;
                ArrayList arrayList = this.f1671b;
                r rVar = n2.f1633b;
                arrayList.add(rVar != null ? rVar.f1755j : null);
                int[] iArr = this.f1670a;
                iArr[i4] = n2.f1634c;
                iArr[i2 + 2] = n2.f1635d;
                iArr[i2 + 3] = n2.e;
                int i5 = i2 + 5;
                iArr[i2 + 4] = n2.f1636f;
                i2 += 6;
                iArr[i5] = n2.f1637g;
                this.f1672c[i3] = n2.f1638h.ordinal();
                this.f1673d[i3] = n2.i.ordinal();
            }
            this.e = aVar.f1657f;
            this.f1674f = aVar.i;
            this.f1675g = aVar.f1669s;
            this.f1676h = aVar.f1660j;
            this.i = aVar.f1661k;
            this.f1677j = aVar.f1662l;
            this.f1678k = aVar.f1663m;
            this.f1679l = aVar.f1664n;
            this.f1680m = aVar.f1665o;
            this.f1681n = aVar.f1666p;
            return;
        }
        throw new IllegalStateException("Not on back stack");
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i2) {
        parcel.writeIntArray(this.f1670a);
        parcel.writeStringList(this.f1671b);
        parcel.writeIntArray(this.f1672c);
        parcel.writeIntArray(this.f1673d);
        parcel.writeInt(this.e);
        parcel.writeString(this.f1674f);
        parcel.writeInt(this.f1675g);
        parcel.writeInt(this.f1676h);
        TextUtils.writeToParcel(this.i, parcel, 0);
        parcel.writeInt(this.f1677j);
        TextUtils.writeToParcel(this.f1678k, parcel, 0);
        parcel.writeStringList(this.f1679l);
        parcel.writeStringList(this.f1680m);
        parcel.writeInt(this.f1681n ? 1 : 0);
    }

    public C0048b(Parcel parcel) {
        this.f1670a = parcel.createIntArray();
        this.f1671b = parcel.createStringArrayList();
        this.f1672c = parcel.createIntArray();
        this.f1673d = parcel.createIntArray();
        this.e = parcel.readInt();
        this.f1674f = parcel.readString();
        this.f1675g = parcel.readInt();
        this.f1676h = parcel.readInt();
        Parcelable.Creator creator = TextUtils.CHAR_SEQUENCE_CREATOR;
        this.i = (CharSequence) creator.createFromParcel(parcel);
        this.f1677j = parcel.readInt();
        this.f1678k = (CharSequence) creator.createFromParcel(parcel);
        this.f1679l = parcel.createStringArrayList();
        this.f1680m = parcel.createStringArrayList();
        this.f1681n = parcel.readInt() != 0;
    }
}
