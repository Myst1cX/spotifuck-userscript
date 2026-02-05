package Q0;

import N0.p;
import android.content.Context;
import android.content.res.AssetManager;
import android.net.Uri;
import r1.o;
import r1.v;

/* renamed from: Q0.b  reason: case insensitive filesystem */
public final class C0033b extends B {

    /* renamed from: a  reason: collision with root package name */
    public final Context f785a;

    /* renamed from: b  reason: collision with root package name */
    public final Object f786b = new Object();

    /* renamed from: c  reason: collision with root package name */
    public AssetManager f787c;

    public final boolean a(z zVar) {
        Uri uri = zVar.f853a;
        if (!"file".equals(uri.getScheme()) || uri.getPathSegments().isEmpty() || !"android_asset".equals(uri.getPathSegments().get(0))) {
            return false;
        }
        return true;
    }

    public final p c(z zVar, int i) {
        if (this.f787c == null) {
            synchronized (this.f786b) {
                try {
                    if (this.f787c == null) {
                        this.f787c = this.f785a.getAssets();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return new p((v) o.b(this.f787c.open(zVar.f853a.toString().substring(22))), 2);
    }

    public C0033b(Context context) {
        this.f785a = context;
    }
}
