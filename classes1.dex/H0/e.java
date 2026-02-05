package H0;

import android.app.ForegroundServiceStartNotAllowedException;
import android.content.ClipData;
import android.view.ContentInfo;

public abstract /* synthetic */ class e {
    public static /* bridge */ /* synthetic */ ForegroundServiceStartNotAllowedException d(IllegalStateException illegalStateException) {
        return (ForegroundServiceStartNotAllowedException) illegalStateException;
    }

    public static /* synthetic */ ContentInfo.Builder f(ClipData clipData, int i) {
        return new ContentInfo.Builder(clipData, i);
    }

    public static /* bridge */ /* synthetic */ ContentInfo h(Object obj) {
        return (ContentInfo) obj;
    }

    public static /* bridge */ /* synthetic */ boolean n(IllegalStateException illegalStateException) {
        return illegalStateException instanceof ForegroundServiceStartNotAllowedException;
    }
}
