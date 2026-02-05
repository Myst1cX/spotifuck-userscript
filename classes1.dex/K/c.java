package K;

import android.content.ContentProviderClient;
import android.content.Context;
import android.net.Uri;

public final class c {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f313a;

    /* renamed from: b  reason: collision with root package name */
    public final ContentProviderClient f314b;

    public c(Context context, Uri uri, int i) {
        this.f313a = i;
        switch (i) {
            case 1:
                this.f314b = context.getContentResolver().acquireUnstableContentProviderClient(uri);
                return;
            default:
                this.f314b = context.getContentResolver().acquireUnstableContentProviderClient(uri);
                return;
        }
    }

    public final void a() {
        switch (this.f313a) {
            case 0:
                ContentProviderClient contentProviderClient = this.f314b;
                if (contentProviderClient != null) {
                    contentProviderClient.release();
                    return;
                }
                return;
            default:
                ContentProviderClient contentProviderClient2 = this.f314b;
                if (contentProviderClient2 != null) {
                    contentProviderClient2.release();
                    return;
                }
                return;
        }
    }
}
