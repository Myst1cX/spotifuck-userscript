package R0;

import C.a;
import android.os.Handler;
import android.os.Looper;
import android.webkit.PermissionRequest;
import android.webkit.WebChromeClient;

public final class d extends WebChromeClient {
    public final void onPermissionRequest(PermissionRequest permissionRequest) {
        new Handler(Looper.getMainLooper()).post(new a(6, (Object) permissionRequest));
    }
}
