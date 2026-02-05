package android.support.v4.media.session;

import android.annotation.SuppressLint;
import android.os.Parcel;
import android.os.Parcelable;
import p0.d;

@SuppressLint({"BanParcelableUsage"})
public final class MediaSessionCompat$Token implements Parcelable {
    public static final Parcelable.Creator<MediaSessionCompat$Token> CREATOR = new s(2);

    /* renamed from: a  reason: collision with root package name */
    public final Object f1088a = new Object();

    /* renamed from: b  reason: collision with root package name */
    public final Object f1089b;

    /* renamed from: c  reason: collision with root package name */
    public d f1090c;

    /* renamed from: d  reason: collision with root package name */
    public d f1091d;

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MediaSessionCompat$Token)) {
            return false;
        }
        MediaSessionCompat$Token mediaSessionCompat$Token = (MediaSessionCompat$Token) obj;
        Object obj2 = this.f1089b;
        if (obj2 != null) {
            Object obj3 = mediaSessionCompat$Token.f1089b;
            if (obj3 == null) {
                return false;
            }
            return obj2.equals(obj3);
        } else if (mediaSessionCompat$Token.f1089b == null) {
            return true;
        } else {
            return false;
        }
    }

    public final d a() {
        d dVar;
        synchronized (this.f1088a) {
            dVar = this.f1090c;
        }
        return dVar;
    }

    public final void b(d dVar) {
        synchronized (this.f1088a) {
            this.f1090c = dVar;
        }
    }

    public final void c(d dVar) {
        synchronized (this.f1088a) {
            this.f1091d = dVar;
        }
    }

    public final int hashCode() {
        Object obj = this.f1089b;
        if (obj == null) {
            return 0;
        }
        return obj.hashCode();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable((Parcelable) this.f1089b, i);
    }

    public MediaSessionCompat$Token(Object obj, d dVar) {
        this.f1089b = obj;
        this.f1090c = dVar;
        this.f1091d = null;
    }
}
