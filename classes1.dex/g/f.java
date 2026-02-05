package G;

import android.graphics.drawable.Icon;
import android.net.Uri;

public abstract class f {
    public static Icon a(Uri uri) {
        return Icon.createWithAdaptiveBitmapContentUri(uri);
    }
}
