package C;

import android.app.Notification;
import android.app.PendingIntent;
import android.graphics.drawable.Icon;

public abstract class n {
    public static Notification.Action.Builder a(Icon icon, CharSequence charSequence, PendingIntent pendingIntent) {
        return new Notification.Action.Builder(icon, charSequence, pendingIntent);
    }

    public static Notification.Builder c(Notification.Builder builder, Object obj) {
        return builder.setSmallIcon((Icon) obj);
    }

    public static Notification.Builder b(Notification.Builder builder, Icon icon) {
        return builder.setLargeIcon(icon);
    }
}
