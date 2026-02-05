package androidx.core.app;

import android.app.PendingIntent;
import android.os.Parcel;
import android.text.TextUtils;
import androidx.core.graphics.drawable.IconCompat;
import p0.b;
import p0.c;

public class RemoteActionCompatParcelizer {
    public static RemoteActionCompat read(b bVar) {
        RemoteActionCompat remoteActionCompat = new RemoteActionCompat();
        Object obj = remoteActionCompat.f1458a;
        boolean z2 = true;
        if (bVar.e(1)) {
            obj = bVar.h();
        }
        remoteActionCompat.f1458a = (IconCompat) obj;
        CharSequence charSequence = remoteActionCompat.f1459b;
        if (bVar.e(2)) {
            charSequence = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(((c) bVar).e);
        }
        remoteActionCompat.f1459b = charSequence;
        CharSequence charSequence2 = remoteActionCompat.f1460c;
        if (bVar.e(3)) {
            charSequence2 = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(((c) bVar).e);
        }
        remoteActionCompat.f1460c = charSequence2;
        remoteActionCompat.f1461d = (PendingIntent) bVar.g(remoteActionCompat.f1461d, 4);
        boolean z3 = remoteActionCompat.e;
        if (bVar.e(5)) {
            if (((c) bVar).e.readInt() != 0) {
                z3 = true;
            } else {
                z3 = false;
            }
        }
        remoteActionCompat.e = z3;
        boolean z4 = remoteActionCompat.f1462f;
        if (bVar.e(6)) {
            if (((c) bVar).e.readInt() == 0) {
                z2 = false;
            }
            z4 = z2;
        }
        remoteActionCompat.f1462f = z4;
        return remoteActionCompat;
    }

    public static void write(RemoteActionCompat remoteActionCompat, b bVar) {
        bVar.getClass();
        IconCompat iconCompat = remoteActionCompat.f1458a;
        bVar.i(1);
        bVar.l(iconCompat);
        CharSequence charSequence = remoteActionCompat.f1459b;
        bVar.i(2);
        Parcel parcel = ((c) bVar).e;
        TextUtils.writeToParcel(charSequence, parcel, 0);
        CharSequence charSequence2 = remoteActionCompat.f1460c;
        bVar.i(3);
        TextUtils.writeToParcel(charSequence2, parcel, 0);
        bVar.k(remoteActionCompat.f1461d, 4);
        boolean z2 = remoteActionCompat.e;
        bVar.i(5);
        parcel.writeInt(z2 ? 1 : 0);
        boolean z3 = remoteActionCompat.f1462f;
        bVar.i(6);
        parcel.writeInt(z3 ? 1 : 0);
    }
}
