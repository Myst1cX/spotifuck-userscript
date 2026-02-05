package S;

import android.content.ClipDescription;
import android.net.Uri;
import android.view.inputmethod.InputContentInfo;

public final class f implements g {

    /* renamed from: a  reason: collision with root package name */
    public final InputContentInfo f881a;

    public f(Object obj) {
        this.f881a = (InputContentInfo) obj;
    }

    public final ClipDescription a() {
        return this.f881a.getDescription();
    }

    public final void b() {
        this.f881a.requestPermission();
    }

    public final Uri c() {
        return this.f881a.getLinkUri();
    }

    public final Object d() {
        return this.f881a;
    }

    public final Uri e() {
        return this.f881a.getContentUri();
    }

    public f(Uri uri, ClipDescription clipDescription, Uri uri2) {
        this.f881a = new InputContentInfo(uri, clipDescription, uri2);
    }
}
