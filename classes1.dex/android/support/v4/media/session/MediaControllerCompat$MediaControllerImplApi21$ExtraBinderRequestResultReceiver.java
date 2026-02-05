package android.support.v4.media.session;

import android.os.ResultReceiver;
import java.lang.ref.WeakReference;

class MediaControllerCompat$MediaControllerImplApi21$ExtraBinderRequestResultReceiver extends ResultReceiver {

    /* renamed from: a  reason: collision with root package name */
    public WeakReference f1084a;

    /* JADX WARNING: type inference failed for: r4v3, types: [android.support.v4.media.session.c, java.lang.Object] */
    /* JADX WARNING: Can't wrap try/catch for region: R(10:5|6|(1:8)(2:9|(1:14)(1:13))|15|16|17|(1:19)(2:20|(1:22)(2:23|24))|25|26|27) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:25:0x0065 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onReceiveResult(int r7, android.os.Bundle r8) {
        /*
            r6 = this;
            java.lang.ref.WeakReference r7 = r6.f1084a
            java.lang.Object r7 = r7.get()
            android.support.v4.media.session.f r7 = (android.support.v4.media.session.f) r7
            if (r7 == 0) goto L_0x0070
            if (r8 != 0) goto L_0x000d
            goto L_0x0070
        L_0x000d:
            java.lang.Object r0 = r7.f1114b
            monitor-enter(r0)
            android.support.v4.media.session.MediaSessionCompat$Token r1 = r7.e     // Catch:{ all -> 0x006d }
            java.lang.String r2 = "android.support.v4.media.session.EXTRA_BINDER"
            android.os.IBinder r2 = r8.getBinder(r2)     // Catch:{ all -> 0x006d }
            int r3 = android.support.v4.media.session.n.f1119c     // Catch:{ all -> 0x006d }
            r3 = 0
            if (r2 != 0) goto L_0x001f
            r4 = r3
            goto L_0x0035
        L_0x001f:
            java.lang.String r4 = "android.support.v4.media.session.IMediaSession"
            android.os.IInterface r4 = r2.queryLocalInterface(r4)     // Catch:{ all -> 0x006d }
            if (r4 == 0) goto L_0x002e
            boolean r5 = r4 instanceof android.support.v4.media.session.d     // Catch:{ all -> 0x006d }
            if (r5 == 0) goto L_0x002e
            android.support.v4.media.session.d r4 = (android.support.v4.media.session.d) r4     // Catch:{ all -> 0x006d }
            goto L_0x0035
        L_0x002e:
            android.support.v4.media.session.c r4 = new android.support.v4.media.session.c     // Catch:{ all -> 0x006d }
            r4.<init>()     // Catch:{ all -> 0x006d }
            r4.f1111b = r2     // Catch:{ all -> 0x006d }
        L_0x0035:
            r1.b(r4)     // Catch:{ all -> 0x006d }
            android.support.v4.media.session.MediaSessionCompat$Token r1 = r7.e     // Catch:{ all -> 0x006d }
            java.lang.String r2 = "android.support.v4.media.session.SESSION_TOKEN2"
            android.os.Parcelable r8 = r8.getParcelable(r2)     // Catch:{ RuntimeException -> 0x0065 }
            android.os.Bundle r8 = (android.os.Bundle) r8     // Catch:{ RuntimeException -> 0x0065 }
            if (r8 != 0) goto L_0x0045
            goto L_0x0065
        L_0x0045:
            java.lang.Class<p0.a> r2 = p0.C0320a.class
            java.lang.ClassLoader r2 = r2.getClassLoader()     // Catch:{ RuntimeException -> 0x0065 }
            r8.setClassLoader(r2)     // Catch:{ RuntimeException -> 0x0065 }
            java.lang.String r2 = "a"
            android.os.Parcelable r8 = r8.getParcelable(r2)     // Catch:{ RuntimeException -> 0x0065 }
            boolean r2 = r8 instanceof androidx.versionedparcelable.ParcelImpl     // Catch:{ RuntimeException -> 0x0065 }
            if (r2 == 0) goto L_0x005d
            androidx.versionedparcelable.ParcelImpl r8 = (androidx.versionedparcelable.ParcelImpl) r8     // Catch:{ RuntimeException -> 0x0065 }
            p0.d r3 = r8.f2069a     // Catch:{ RuntimeException -> 0x0065 }
            goto L_0x0065
        L_0x005d:
            java.lang.IllegalArgumentException r8 = new java.lang.IllegalArgumentException     // Catch:{ RuntimeException -> 0x0065 }
            java.lang.String r2 = "Invalid parcel"
            r8.<init>(r2)     // Catch:{ RuntimeException -> 0x0065 }
            throw r8     // Catch:{ RuntimeException -> 0x0065 }
        L_0x0065:
            r1.c(r3)     // Catch:{ all -> 0x006d }
            r7.a()     // Catch:{ all -> 0x006d }
            monitor-exit(r0)     // Catch:{ all -> 0x006d }
            return
        L_0x006d:
            r7 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x006d }
            throw r7
        L_0x0070:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.v4.media.session.MediaControllerCompat$MediaControllerImplApi21$ExtraBinderRequestResultReceiver.onReceiveResult(int, android.os.Bundle):void");
    }
}
