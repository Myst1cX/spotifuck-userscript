package T;

import android.os.Parcelable;
import android.support.v4.media.MediaBrowserCompat$MediaItem;
import android.support.v4.media.MediaDescriptionCompat;
import android.support.v4.media.MediaMetadataCompat;
import android.support.v4.media.RatingCompat;
import androidx.fragment.app.C0048b;
import androidx.fragment.app.C0049c;
import androidx.fragment.app.E;
import androidx.fragment.app.I;
import androidx.fragment.app.L;
import androidx.versionedparcelable.ParcelImpl;
import b.d;
import com.google.android.material.datepicker.b;
import com.google.android.material.datepicker.n;
import d.C0088a;
import g0.C;
import g0.C0100c;
import g0.D;
import g0.f;
import g0.i;
import g0.l;
import g0.s;
import j0.C0158u;
import j0.g0;
import j0.h0;
import o.C0260O;
import y0.C0357b;

public final class k implements Parcelable.Creator {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f915a;

    public /* synthetic */ k(int i) {
        this.f915a = i;
    }

    /* JADX WARNING: type inference failed for: r0v0 */
    /* JADX WARNING: type inference failed for: r0v1, types: [android.view.View$BaseSavedState, T.l, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r0v4 */
    /* JADX WARNING: type inference failed for: r0v10, types: [androidx.fragment.app.E, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r1v4, types: [java.lang.Object, androidx.fragment.app.I] */
    /* JADX WARNING: type inference failed for: r1v5, types: [b.d, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r0v25, types: [b.b] */
    /* JADX WARNING: type inference failed for: r0v28, types: [b.a, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r0v38, types: [android.content.Intent] */
    /* JADX WARNING: type inference failed for: r0v49, types: [java.lang.Object, j0.u] */
    /* JADX WARNING: type inference failed for: r0v50, types: [java.lang.Object, j0.g0] */
    /* JADX WARNING: type inference failed for: r0v51, types: [java.lang.Object, j0.h0] */
    /* JADX WARNING: type inference failed for: r0v52, types: [android.view.View$BaseSavedState, o.O, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r0v54, types: [android.view.View$BaseSavedState, java.lang.Object, y0.b] */
    /* JADX WARNING: type inference failed for: r0v55 */
    /* JADX WARNING: type inference failed for: r0v56 */
    /* JADX WARNING: type inference failed for: r0v57 */
    /* JADX WARNING: type inference failed for: r0v58 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:109:0x0272  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object createFromParcel(android.os.Parcel r15) {
        /*
            r14 = this;
            r0 = 0
            r1 = 0
            r2 = 1
            int r3 = r14.f915a
            switch(r3) {
                case 0: goto L_0x028a;
                case 1: goto L_0x0284;
                case 2: goto L_0x021b;
                case 3: goto L_0x0215;
                case 4: goto L_0x0207;
                case 5: goto L_0x0201;
                case 6: goto L_0x01fb;
                case 7: goto L_0x01e9;
                case 8: goto L_0x019b;
                case 9: goto L_0x0195;
                case 10: goto L_0x016e;
                case 11: goto L_0x0133;
                case 12: goto L_0x0129;
                case 13: goto L_0x011c;
                case 14: goto L_0x00fd;
                case 15: goto L_0x00f7;
                case 16: goto L_0x00f1;
                case 17: goto L_0x00eb;
                case 18: goto L_0x00e5;
                case 19: goto L_0x00df;
                case 20: goto L_0x00d9;
                case 21: goto L_0x00d3;
                case 22: goto L_0x00b8;
                case 23: goto L_0x0090;
                case 24: goto L_0x0035;
                case 25: goto L_0x0026;
                case 26: goto L_0x0020;
                default: goto L_0x0008;
            }
        L_0x0008:
            y0.b r0 = new y0.b
            r0.<init>(r15)
            java.lang.Class<y0.b> r1 = y0.C0357b.class
            java.lang.ClassLoader r1 = r1.getClassLoader()
            java.lang.Object r15 = r15.readValue(r1)
            java.lang.Integer r15 = (java.lang.Integer) r15
            int r15 = r15.intValue()
            r0.f5148a = r15
            return r0
        L_0x0020:
            androidx.versionedparcelable.ParcelImpl r0 = new androidx.versionedparcelable.ParcelImpl
            r0.<init>((android.os.Parcel) r15)
            return r0
        L_0x0026:
            o.O r0 = new o.O
            r0.<init>(r15)
            byte r15 = r15.readByte()
            if (r15 == 0) goto L_0x0032
            r1 = 1
        L_0x0032:
            r0.f4112a = r1
            return r0
        L_0x0035:
            j0.h0 r0 = new j0.h0
            r0.<init>()
            int r3 = r15.readInt()
            r0.f3396a = r3
            int r3 = r15.readInt()
            r0.f3397b = r3
            int r3 = r15.readInt()
            r0.f3398c = r3
            if (r3 <= 0) goto L_0x0055
            int[] r3 = new int[r3]
            r0.f3399d = r3
            r15.readIntArray(r3)
        L_0x0055:
            int r3 = r15.readInt()
            r0.e = r3
            if (r3 <= 0) goto L_0x0064
            int[] r3 = new int[r3]
            r0.f3400f = r3
            r15.readIntArray(r3)
        L_0x0064:
            int r3 = r15.readInt()
            if (r3 != r2) goto L_0x006c
            r3 = 1
            goto L_0x006d
        L_0x006c:
            r3 = 0
        L_0x006d:
            r0.f3402h = r3
            int r3 = r15.readInt()
            if (r3 != r2) goto L_0x0077
            r3 = 1
            goto L_0x0078
        L_0x0077:
            r3 = 0
        L_0x0078:
            r0.i = r3
            int r3 = r15.readInt()
            if (r3 != r2) goto L_0x0081
            r1 = 1
        L_0x0081:
            r0.f3403j = r1
            java.lang.Class<j0.g0> r1 = j0.g0.class
            java.lang.ClassLoader r1 = r1.getClassLoader()
            java.util.ArrayList r15 = r15.readArrayList(r1)
            r0.f3401g = r15
            return r0
        L_0x0090:
            j0.g0 r0 = new j0.g0
            r0.<init>()
            int r3 = r15.readInt()
            r0.f3387a = r3
            int r3 = r15.readInt()
            r0.f3388b = r3
            int r3 = r15.readInt()
            if (r3 != r2) goto L_0x00a8
            r1 = 1
        L_0x00a8:
            r0.f3390d = r1
            int r1 = r15.readInt()
            if (r1 <= 0) goto L_0x00b7
            int[] r1 = new int[r1]
            r0.f3389c = r1
            r15.readIntArray(r1)
        L_0x00b7:
            return r0
        L_0x00b8:
            j0.u r0 = new j0.u
            r0.<init>()
            int r3 = r15.readInt()
            r0.f3499a = r3
            int r3 = r15.readInt()
            r0.f3500b = r3
            int r15 = r15.readInt()
            if (r15 != r2) goto L_0x00d0
            r1 = 1
        L_0x00d0:
            r0.f3501c = r1
            return r0
        L_0x00d3:
            g0.D r0 = new g0.D
            r0.<init>((android.os.Parcel) r15)
            return r0
        L_0x00d9:
            g0.C r0 = new g0.C
            r0.<init>((android.os.Parcel) r15)
            return r0
        L_0x00df:
            g0.s r0 = new g0.s
            r0.<init>(r15)
            return r0
        L_0x00e5:
            g0.l r0 = new g0.l
            r0.<init>(r15)
            return r0
        L_0x00eb:
            g0.i r0 = new g0.i
            r0.<init>((android.os.Parcel) r15)
            return r0
        L_0x00f1:
            g0.f r0 = new g0.f
            r0.<init>((android.os.Parcel) r15)
            return r0
        L_0x00f7:
            g0.c r0 = new g0.c
            r0.<init>((android.os.Parcel) r15)
            return r0
        L_0x00fd:
            java.lang.String r1 = "parcel"
            Z0.c.e(r1, r15)
            d.a r1 = new d.a
            int r2 = r15.readInt()
            int r3 = r15.readInt()
            if (r3 != 0) goto L_0x010f
            goto L_0x0118
        L_0x010f:
            android.os.Parcelable$Creator r0 = android.content.Intent.CREATOR
            java.lang.Object r15 = r0.createFromParcel(r15)
            r0 = r15
            android.content.Intent r0 = (android.content.Intent) r0
        L_0x0118:
            r1.<init>(r0, r2)
            return r1
        L_0x011c:
            int r0 = r15.readInt()
            int r15 = r15.readInt()
            com.google.android.material.datepicker.n r15 = com.google.android.material.datepicker.n.a(r0, r15)
            return r15
        L_0x0129:
            com.google.android.material.datepicker.d r0 = new com.google.android.material.datepicker.d
            long r1 = r15.readLong()
            r0.<init>(r1)
            return r0
        L_0x0133:
            java.lang.Class<com.google.android.material.datepicker.n> r0 = com.google.android.material.datepicker.n.class
            java.lang.ClassLoader r1 = r0.getClassLoader()
            android.os.Parcelable r1 = r15.readParcelable(r1)
            r3 = r1
            com.google.android.material.datepicker.n r3 = (com.google.android.material.datepicker.n) r3
            java.lang.ClassLoader r1 = r0.getClassLoader()
            android.os.Parcelable r1 = r15.readParcelable(r1)
            r4 = r1
            com.google.android.material.datepicker.n r4 = (com.google.android.material.datepicker.n) r4
            java.lang.ClassLoader r0 = r0.getClassLoader()
            android.os.Parcelable r0 = r15.readParcelable(r0)
            r6 = r0
            com.google.android.material.datepicker.n r6 = (com.google.android.material.datepicker.n) r6
            java.lang.Class<com.google.android.material.datepicker.d> r0 = com.google.android.material.datepicker.d.class
            java.lang.ClassLoader r0 = r0.getClassLoader()
            android.os.Parcelable r0 = r15.readParcelable(r0)
            r5 = r0
            com.google.android.material.datepicker.d r5 = (com.google.android.material.datepicker.d) r5
            int r7 = r15.readInt()
            com.google.android.material.datepicker.b r15 = new com.google.android.material.datepicker.b
            r2 = r15
            r2.<init>(r3, r4, r5, r6, r7)
            return r15
        L_0x016e:
            b.d r1 = new b.d
            r1.<init>()
            android.os.IBinder r15 = r15.readStrongBinder()
            int r2 = b.c.f2072c
            if (r15 != 0) goto L_0x017c
            goto L_0x0192
        L_0x017c:
            java.lang.String r0 = b.b.f2071a
            android.os.IInterface r0 = r15.queryLocalInterface(r0)
            if (r0 == 0) goto L_0x018b
            boolean r2 = r0 instanceof b.b
            if (r2 == 0) goto L_0x018b
            b.b r0 = (b.b) r0
            goto L_0x0192
        L_0x018b:
            b.a r0 = new b.a
            r0.<init>()
            r0.f2070b = r15
        L_0x0192:
            r1.f2074a = r0
            return r1
        L_0x0195:
            androidx.fragment.app.L r0 = new androidx.fragment.app.L
            r0.<init>((android.os.Parcel) r15)
            return r0
        L_0x019b:
            androidx.fragment.app.I r1 = new androidx.fragment.app.I
            r1.<init>()
            r1.e = r0
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r1.f1609f = r0
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r1.f1610g = r0
            java.util.ArrayList r0 = r15.createStringArrayList()
            r1.f1605a = r0
            java.util.ArrayList r0 = r15.createStringArrayList()
            r1.f1606b = r0
            android.os.Parcelable$Creator<androidx.fragment.app.b> r0 = androidx.fragment.app.C0048b.CREATOR
            java.lang.Object[] r0 = r15.createTypedArray(r0)
            androidx.fragment.app.b[] r0 = (androidx.fragment.app.C0048b[]) r0
            r1.f1607c = r0
            int r0 = r15.readInt()
            r1.f1608d = r0
            java.lang.String r0 = r15.readString()
            r1.e = r0
            java.util.ArrayList r0 = r15.createStringArrayList()
            r1.f1609f = r0
            android.os.Parcelable$Creator<androidx.fragment.app.c> r0 = androidx.fragment.app.C0049c.CREATOR
            java.util.ArrayList r0 = r15.createTypedArrayList(r0)
            r1.f1610g = r0
            android.os.Parcelable$Creator<androidx.fragment.app.E> r0 = androidx.fragment.app.E.CREATOR
            java.util.ArrayList r15 = r15.createTypedArrayList(r0)
            r1.f1611h = r15
            return r1
        L_0x01e9:
            androidx.fragment.app.E r0 = new androidx.fragment.app.E
            r0.<init>()
            java.lang.String r1 = r15.readString()
            r0.f1561a = r1
            int r15 = r15.readInt()
            r0.f1562b = r15
            return r0
        L_0x01fb:
            androidx.fragment.app.c r0 = new androidx.fragment.app.c
            r0.<init>(r15)
            return r0
        L_0x0201:
            androidx.fragment.app.b r0 = new androidx.fragment.app.b
            r0.<init>((android.os.Parcel) r15)
            return r0
        L_0x0207:
            android.support.v4.media.RatingCompat r0 = new android.support.v4.media.RatingCompat
            int r1 = r15.readInt()
            float r15 = r15.readFloat()
            r0.<init>(r1, r15)
            return r0
        L_0x0215:
            android.support.v4.media.MediaMetadataCompat r0 = new android.support.v4.media.MediaMetadataCompat
            r0.<init>((android.os.Parcel) r15)
            return r0
        L_0x021b:
            int r1 = android.os.Build.VERSION.SDK_INT
            android.os.Parcelable$Creator r2 = android.media.MediaDescription.CREATOR
            java.lang.Object r15 = r2.createFromParcel(r15)
            if (r15 == 0) goto L_0x0283
            android.media.MediaDescription r15 = (android.media.MediaDescription) r15
            java.lang.String r3 = android.support.v4.media.g.g(r15)
            java.lang.CharSequence r4 = android.support.v4.media.g.i(r15)
            java.lang.CharSequence r5 = android.support.v4.media.g.h(r15)
            java.lang.CharSequence r6 = android.support.v4.media.g.c(r15)
            android.graphics.Bitmap r7 = android.support.v4.media.g.e(r15)
            android.net.Uri r8 = android.support.v4.media.g.f(r15)
            android.os.Bundle r2 = android.support.v4.media.g.d(r15)
            if (r2 == 0) goto L_0x0249
            android.os.Bundle r2 = android.support.v4.media.session.t.G(r2)
        L_0x0249:
            java.lang.String r9 = "android.support.v4.media.description.MEDIA_URI"
            if (r2 == 0) goto L_0x0254
            android.os.Parcelable r10 = r2.getParcelable(r9)
            android.net.Uri r10 = (android.net.Uri) r10
            goto L_0x0255
        L_0x0254:
            r10 = r0
        L_0x0255:
            if (r10 == 0) goto L_0x026e
            java.lang.String r11 = "android.support.v4.media.description.NULL_BUNDLE_FLAG"
            boolean r12 = r2.containsKey(r11)
            if (r12 == 0) goto L_0x0268
            int r12 = r2.size()
            r13 = 2
            if (r12 != r13) goto L_0x0268
            r9 = r0
            goto L_0x026f
        L_0x0268:
            r2.remove(r9)
            r2.remove(r11)
        L_0x026e:
            r9 = r2
        L_0x026f:
            if (r10 == 0) goto L_0x0272
            goto L_0x027b
        L_0x0272:
            r2 = 23
            if (r1 < r2) goto L_0x027a
            android.net.Uri r0 = android.support.v4.media.h.a(r15)
        L_0x027a:
            r10 = r0
        L_0x027b:
            android.support.v4.media.MediaDescriptionCompat r0 = new android.support.v4.media.MediaDescriptionCompat
            r2 = r0
            r2.<init>(r3, r4, r5, r6, r7, r8, r9, r10)
            r0.i = r15
        L_0x0283:
            return r0
        L_0x0284:
            android.support.v4.media.MediaBrowserCompat$MediaItem r0 = new android.support.v4.media.MediaBrowserCompat$MediaItem
            r0.<init>(r15)
            return r0
        L_0x028a:
            T.l r0 = new T.l
            r0.<init>(r15)
            int r15 = r15.readInt()
            r0.f916a = r15
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: T.k.createFromParcel(android.os.Parcel):java.lang.Object");
    }

    public final Object[] newArray(int i) {
        switch (this.f915a) {
            case 0:
                return new l[i];
            case 1:
                return new MediaBrowserCompat$MediaItem[i];
            case 2:
                return new MediaDescriptionCompat[i];
            case 3:
                return new MediaMetadataCompat[i];
            case 4:
                return new RatingCompat[i];
            case 5:
                return new C0048b[i];
            case 6:
                return new C0049c[i];
            case 7:
                return new E[i];
            case 8:
                return new I[i];
            case 9:
                return new L[i];
            case 10:
                return new d[i];
            case 11:
                return new b[i];
            case 12:
                return new com.google.android.material.datepicker.d[i];
            case 13:
                return new n[i];
            case 14:
                return new C0088a[i];
            case 15:
                return new C0100c[i];
            case 16:
                return new f[i];
            case 17:
                return new i[i];
            case 18:
                return new l[i];
            case 19:
                return new s[i];
            case 20:
                return new C[i];
            case 21:
                return new D[i];
            case 22:
                return new C0158u[i];
            case 23:
                return new g0[i];
            case 24:
                return new h0[i];
            case 25:
                return new C0260O[i];
            case 26:
                return new ParcelImpl[i];
            default:
                return new C0357b[i];
        }
    }
}
