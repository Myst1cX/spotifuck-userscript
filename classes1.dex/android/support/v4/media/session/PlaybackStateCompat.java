package android.support.v4.media.session;

import android.annotation.SuppressLint;
import android.media.session.PlaybackState;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import java.util.ArrayList;

@SuppressLint({"BanParcelableUsage"})
public final class PlaybackStateCompat implements Parcelable {
    public static final Parcelable.Creator<PlaybackStateCompat> CREATOR = new s(4);

    /* renamed from: a  reason: collision with root package name */
    public final int f1096a;

    /* renamed from: b  reason: collision with root package name */
    public final long f1097b;

    /* renamed from: c  reason: collision with root package name */
    public final long f1098c;

    /* renamed from: d  reason: collision with root package name */
    public final float f1099d;
    public final long e;

    /* renamed from: f  reason: collision with root package name */
    public final int f1100f;

    /* renamed from: g  reason: collision with root package name */
    public final CharSequence f1101g;

    /* renamed from: h  reason: collision with root package name */
    public final long f1102h;
    public final ArrayList i;

    /* renamed from: j  reason: collision with root package name */
    public final long f1103j;

    /* renamed from: k  reason: collision with root package name */
    public final Bundle f1104k;

    /* renamed from: l  reason: collision with root package name */
    public PlaybackState f1105l;

    public static final class CustomAction implements Parcelable {
        public static final Parcelable.Creator<CustomAction> CREATOR = new Object();

        /* renamed from: a  reason: collision with root package name */
        public final String f1106a;

        /* renamed from: b  reason: collision with root package name */
        public final CharSequence f1107b;

        /* renamed from: c  reason: collision with root package name */
        public final int f1108c;

        /* renamed from: d  reason: collision with root package name */
        public final Bundle f1109d;
        public PlaybackState.CustomAction e;

        public CustomAction(String str, CharSequence charSequence, int i, Bundle bundle) {
            this.f1106a = str;
            this.f1107b = charSequence;
            this.f1108c = i;
            this.f1109d = bundle;
        }

        public final int describeContents() {
            return 0;
        }

        public final String toString() {
            return "Action:mName='" + this.f1107b + ", mIcon=" + this.f1108c + ", mExtras=" + this.f1109d;
        }

        public final void writeToParcel(Parcel parcel, int i) {
            parcel.writeString(this.f1106a);
            TextUtils.writeToParcel(this.f1107b, parcel, i);
            parcel.writeInt(this.f1108c);
            parcel.writeBundle(this.f1109d);
        }

        public CustomAction(Parcel parcel) {
            this.f1106a = parcel.readString();
            this.f1107b = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
            this.f1108c = parcel.readInt();
            this.f1109d = parcel.readBundle(t.class.getClassLoader());
        }
    }

    public PlaybackStateCompat(int i2, long j2, long j3, float f2, long j4, int i3, CharSequence charSequence, long j5, ArrayList arrayList, long j6, Bundle bundle) {
        this.f1096a = i2;
        this.f1097b = j2;
        this.f1098c = j3;
        this.f1099d = f2;
        this.e = j4;
        this.f1100f = i3;
        this.f1101g = charSequence;
        this.f1102h = j5;
        this.i = new ArrayList(arrayList);
        this.f1103j = j6;
        this.f1104k = bundle;
    }

    public final int describeContents() {
        return 0;
    }

    public final String toString() {
        return "PlaybackState {state=" + this.f1096a + ", position=" + this.f1097b + ", buffered position=" + this.f1098c + ", speed=" + this.f1099d + ", updated=" + this.f1102h + ", actions=" + this.e + ", error code=" + this.f1100f + ", error message=" + this.f1101g + ", custom actions=" + this.i + ", active item id=" + this.f1103j + "}";
    }

    public final void writeToParcel(Parcel parcel, int i2) {
        parcel.writeInt(this.f1096a);
        parcel.writeLong(this.f1097b);
        parcel.writeFloat(this.f1099d);
        parcel.writeLong(this.f1102h);
        parcel.writeLong(this.f1098c);
        parcel.writeLong(this.e);
        TextUtils.writeToParcel(this.f1101g, parcel, i2);
        parcel.writeTypedList(this.i);
        parcel.writeLong(this.f1103j);
        parcel.writeBundle(this.f1104k);
        parcel.writeInt(this.f1100f);
    }

    public PlaybackStateCompat(Parcel parcel) {
        this.f1096a = parcel.readInt();
        this.f1097b = parcel.readLong();
        this.f1099d = parcel.readFloat();
        this.f1102h = parcel.readLong();
        this.f1098c = parcel.readLong();
        this.e = parcel.readLong();
        this.f1101g = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
        this.i = parcel.createTypedArrayList(CustomAction.CREATOR);
        this.f1103j = parcel.readLong();
        this.f1104k = parcel.readBundle(t.class.getClassLoader());
        this.f1100f = parcel.readInt();
    }
}
