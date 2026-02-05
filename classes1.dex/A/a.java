package A;

import android.graphics.drawable.ColorStateListDrawable;
import android.graphics.drawable.Drawable;
import android.media.session.MediaSession;
import android.os.Bundle;
import android.view.WindowInsets;
import it.deviato.spotifuck.WebService;

public abstract /* synthetic */ class a {
    public static /* bridge */ /* synthetic */ ColorStateListDrawable d(Drawable drawable) {
        return (ColorStateListDrawable) drawable;
    }

    public static /* synthetic */ MediaSession f(WebService webService, String str) {
        return new MediaSession(webService, str, (Bundle) null);
    }

    public static /* synthetic */ WindowInsets.Builder g() {
        return new WindowInsets.Builder();
    }

    public static /* synthetic */ WindowInsets.Builder h(WindowInsets windowInsets) {
        return new WindowInsets.Builder(windowInsets);
    }

    public static /* bridge */ /* synthetic */ boolean t(Drawable drawable) {
        return drawable instanceof ColorStateListDrawable;
    }
}
