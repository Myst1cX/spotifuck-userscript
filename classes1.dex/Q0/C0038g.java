package Q0;

import android.content.Context;
import android.content.UriMatcher;
import android.net.Uri;
import android.provider.ContactsContract;

/* renamed from: Q0.g  reason: case insensitive filesystem */
public final class C0038g extends B {

    /* renamed from: b  reason: collision with root package name */
    public static final UriMatcher f810b;

    /* renamed from: a  reason: collision with root package name */
    public final Context f811a;

    static {
        UriMatcher uriMatcher = new UriMatcher(-1);
        f810b = uriMatcher;
        uriMatcher.addURI("com.android.contacts", "contacts/lookup/*/#", 1);
        uriMatcher.addURI("com.android.contacts", "contacts/lookup/*", 1);
        uriMatcher.addURI("com.android.contacts", "contacts/#/photo", 2);
        uriMatcher.addURI("com.android.contacts", "contacts/#", 3);
        uriMatcher.addURI("com.android.contacts", "display_photo/#", 4);
    }

    public final boolean a(z zVar) {
        Uri uri = zVar.f853a;
        if (!"content".equals(uri.getScheme()) || !ContactsContract.Contacts.CONTENT_URI.getHost().equals(uri.getHost()) || f810b.match(uri) == -1) {
            return false;
        }
        return true;
    }

    /* JADX WARNING: Removed duplicated region for block: B:15:0x0043 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x0044  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final N0.p c(Q0.z r6, int r7) {
        /*
            r5 = this;
            android.content.Context r7 = r5.f811a
            android.content.ContentResolver r7 = r7.getContentResolver()
            android.net.Uri r6 = r6.f853a
            android.content.UriMatcher r0 = f810b
            int r0 = r0.match(r6)
            r1 = 2
            r2 = 0
            r3 = 1
            if (r0 == r3) goto L_0x0035
            if (r0 == r1) goto L_0x0030
            r4 = 3
            if (r0 == r4) goto L_0x003d
            r3 = 4
            if (r0 != r3) goto L_0x001c
            goto L_0x0030
        L_0x001c:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "Invalid uri: "
            r0.<init>(r1)
            r0.append(r6)
            java.lang.String r6 = r0.toString()
            r7.<init>(r6)
            throw r7
        L_0x0030:
            java.io.InputStream r6 = r7.openInputStream(r6)
            goto L_0x0041
        L_0x0035:
            android.net.Uri r6 = android.provider.ContactsContract.Contacts.lookupContact(r7, r6)
            if (r6 != 0) goto L_0x003d
            r6 = r2
            goto L_0x0041
        L_0x003d:
            java.io.InputStream r6 = android.provider.ContactsContract.Contacts.openContactPhotoInputStream(r7, r6, r3)
        L_0x0041:
            if (r6 != 0) goto L_0x0044
            return r2
        L_0x0044:
            N0.p r7 = new N0.p
            r1.b r6 = r1.o.b(r6)
            r7.<init>((r1.v) r6, (int) r1)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: Q0.C0038g.c(Q0.z, int):N0.p");
    }

    public C0038g(Context context) {
        this.f811a = context;
    }
}
