package e0;

import android.annotation.SuppressLint;
import android.app.Notification;
import android.app.PendingIntent;

/* renamed from: e0.b  reason: case insensitive filesystem */
public abstract class C0094b {
    @SuppressLint({"MissingPermission"})
    public static Notification.MediaStyle a(Notification.MediaStyle mediaStyle, CharSequence charSequence, int i, PendingIntent pendingIntent, Boolean bool) {
        if (bool.booleanValue()) {
            mediaStyle.setRemotePlaybackInfo(charSequence, i, pendingIntent);
        }
        return mediaStyle;
    }
}
