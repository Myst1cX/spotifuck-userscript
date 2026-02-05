package androidx.core.graphics.drawable;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.os.Parcel;
import android.os.Parcelable;
import java.nio.charset.Charset;
import p0.b;
import p0.c;

public class IconCompatParcelizer {
    public static IconCompat read(b bVar) {
        IconCompat iconCompat = new IconCompat();
        iconCompat.f1464a = bVar.f(iconCompat.f1464a, 1);
        byte[] bArr = iconCompat.f1466c;
        if (bVar.e(2)) {
            Parcel parcel = ((c) bVar).e;
            int readInt = parcel.readInt();
            if (readInt < 0) {
                bArr = null;
            } else {
                byte[] bArr2 = new byte[readInt];
                parcel.readByteArray(bArr2);
                bArr = bArr2;
            }
        }
        iconCompat.f1466c = bArr;
        iconCompat.f1467d = bVar.g(iconCompat.f1467d, 3);
        iconCompat.e = bVar.f(iconCompat.e, 4);
        iconCompat.f1468f = bVar.f(iconCompat.f1468f, 5);
        iconCompat.f1469g = (ColorStateList) bVar.g(iconCompat.f1469g, 6);
        String str = iconCompat.i;
        if (bVar.e(7)) {
            str = ((c) bVar).e.readString();
        }
        iconCompat.i = str;
        String str2 = iconCompat.f1471j;
        if (bVar.e(8)) {
            str2 = ((c) bVar).e.readString();
        }
        iconCompat.f1471j = str2;
        iconCompat.f1470h = PorterDuff.Mode.valueOf(iconCompat.i);
        switch (iconCompat.f1464a) {
            case -1:
                Parcelable parcelable = iconCompat.f1467d;
                if (parcelable != null) {
                    iconCompat.f1465b = parcelable;
                    break;
                } else {
                    throw new IllegalArgumentException("Invalid icon");
                }
            case 1:
            case 5:
                Parcelable parcelable2 = iconCompat.f1467d;
                if (parcelable2 == null) {
                    byte[] bArr3 = iconCompat.f1466c;
                    iconCompat.f1465b = bArr3;
                    iconCompat.f1464a = 3;
                    iconCompat.e = 0;
                    iconCompat.f1468f = bArr3.length;
                    break;
                } else {
                    iconCompat.f1465b = parcelable2;
                    break;
                }
            case 2:
            case 4:
            case 6:
                String str3 = new String(iconCompat.f1466c, Charset.forName("UTF-16"));
                iconCompat.f1465b = str3;
                if (iconCompat.f1464a == 2 && iconCompat.f1471j == null) {
                    iconCompat.f1471j = str3.split(":", -1)[0];
                    break;
                }
            case 3:
                iconCompat.f1465b = iconCompat.f1466c;
                break;
        }
        return iconCompat;
    }

    public static void write(IconCompat iconCompat, b bVar) {
        bVar.getClass();
        iconCompat.i = iconCompat.f1470h.name();
        switch (iconCompat.f1464a) {
            case -1:
                iconCompat.f1467d = (Parcelable) iconCompat.f1465b;
                break;
            case 1:
            case 5:
                iconCompat.f1467d = (Parcelable) iconCompat.f1465b;
                break;
            case 2:
                iconCompat.f1466c = ((String) iconCompat.f1465b).getBytes(Charset.forName("UTF-16"));
                break;
            case 3:
                iconCompat.f1466c = (byte[]) iconCompat.f1465b;
                break;
            case 4:
            case 6:
                iconCompat.f1466c = iconCompat.f1465b.toString().getBytes(Charset.forName("UTF-16"));
                break;
        }
        int i = iconCompat.f1464a;
        if (-1 != i) {
            bVar.j(i, 1);
        }
        byte[] bArr = iconCompat.f1466c;
        if (bArr != null) {
            bVar.i(2);
            int length = bArr.length;
            Parcel parcel = ((c) bVar).e;
            parcel.writeInt(length);
            parcel.writeByteArray(bArr);
        }
        Parcelable parcelable = iconCompat.f1467d;
        if (parcelable != null) {
            bVar.k(parcelable, 3);
        }
        int i2 = iconCompat.e;
        if (i2 != 0) {
            bVar.j(i2, 4);
        }
        int i3 = iconCompat.f1468f;
        if (i3 != 0) {
            bVar.j(i3, 5);
        }
        ColorStateList colorStateList = iconCompat.f1469g;
        if (colorStateList != null) {
            bVar.k(colorStateList, 6);
        }
        String str = iconCompat.i;
        if (str != null) {
            bVar.i(7);
            ((c) bVar).e.writeString(str);
        }
        String str2 = iconCompat.f1471j;
        if (str2 != null) {
            bVar.i(8);
            ((c) bVar).e.writeString(str2);
        }
    }
}
