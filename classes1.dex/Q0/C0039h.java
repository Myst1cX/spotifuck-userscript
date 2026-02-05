package Q0;

import N0.p;
import android.content.Context;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.net.Uri;
import java.io.FileNotFoundException;
import java.util.List;
import r1.h;
import r1.o;
import r1.v;

/* renamed from: Q0.h  reason: case insensitive filesystem */
public class C0039h extends B {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f812a;

    /* renamed from: b  reason: collision with root package name */
    public final Context f813b;

    public /* synthetic */ C0039h(Context context, int i) {
        this.f812a = i;
        this.f813b = context;
    }

    public p c(z zVar, int i) {
        Resources resources;
        int i2;
        Context context = this.f813b;
        switch (this.f812a) {
            case 0:
                return new p((v) o.b(context.getContentResolver().openInputStream(zVar.f853a)), 2);
            default:
                h hVar = H.f783a;
                zVar.getClass();
                Uri uri = zVar.f853a;
                if (uri == null) {
                    resources = context.getResources();
                } else {
                    String authority = uri.getAuthority();
                    if (authority != null) {
                        try {
                            resources = context.getPackageManager().getResourcesForApplication(authority);
                        } catch (PackageManager.NameNotFoundException unused) {
                            throw new FileNotFoundException("Unable to obtain resources for package: " + uri);
                        }
                    } else {
                        throw new FileNotFoundException("No package provided: " + uri);
                    }
                }
                if (uri == null) {
                    i2 = 0;
                } else {
                    String authority2 = uri.getAuthority();
                    if (authority2 != null) {
                        List<String> pathSegments = uri.getPathSegments();
                        if (pathSegments == null || pathSegments.isEmpty()) {
                            throw new FileNotFoundException("No path segments: " + uri);
                        } else if (pathSegments.size() == 1) {
                            try {
                                i2 = Integer.parseInt(pathSegments.get(0));
                            } catch (NumberFormatException unused2) {
                                throw new FileNotFoundException("Last path segment is not a resource ID: " + uri);
                            }
                        } else if (pathSegments.size() == 2) {
                            i2 = resources.getIdentifier(pathSegments.get(1), pathSegments.get(0), authority2);
                        } else {
                            throw new FileNotFoundException("More than two path segments: " + uri);
                        }
                    } else {
                        throw new FileNotFoundException("No package provided: " + uri);
                    }
                }
                Bitmap decodeResource = BitmapFactory.decodeResource(resources, i2, (BitmapFactory.Options) null);
                if (decodeResource != null) {
                    return new p(decodeResource, (v) null, 2, 0);
                }
                throw new NullPointerException("bitmap == null");
        }
    }

    public boolean a(z zVar) {
        switch (this.f812a) {
            case 0:
                return "content".equals(zVar.f853a.getScheme());
            default:
                return "android.resource".equals(zVar.f853a.getScheme());
        }
    }
}
