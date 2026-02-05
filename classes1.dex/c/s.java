package C;

import android.app.Notification;

public abstract class s {
    public static Notification.Action.Builder a(Notification.Action.Builder builder, boolean z2) {
        return builder.setAuthenticationRequired(z2);
    }

    public static Notification.Builder b(Notification.Builder builder, int i) {
        return builder.setForegroundServiceBehavior(i);
    }
}
