package C;

import android.app.Notification;
import android.content.LocusId;

public abstract class r {
    public static Notification.Builder d(Notification.Builder builder, Object obj) {
        return builder.setLocusId((LocusId) obj);
    }

    public static Notification.Builder a(Notification.Builder builder, boolean z2) {
        return builder.setAllowSystemGeneratedContextualActions(z2);
    }

    public static Notification.Builder b(Notification.Builder builder, Notification.BubbleMetadata bubbleMetadata) {
        return builder.setBubbleMetadata(bubbleMetadata);
    }

    public static Notification.Action.Builder c(Notification.Action.Builder builder, boolean z2) {
        return builder.setContextual(z2);
    }
}
