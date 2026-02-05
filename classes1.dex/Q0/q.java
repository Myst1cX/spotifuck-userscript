package Q0;

import android.content.Context;
import android.net.Uri;

public final class q extends C0039h {

    /* renamed from: d  reason: collision with root package name */
    public static final String[] f838d = {"orientation"};

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ int f839c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public /* synthetic */ q(Context context, int i) {
        super(context, 0);
        this.f839c = i;
    }

    public final boolean a(z zVar) {
        switch (this.f839c) {
            case 0:
                Uri uri = zVar.f853a;
                if (!"content".equals(uri.getScheme()) || !"media".equals(uri.getAuthority())) {
                    return false;
                }
                return true;
            default:
                return "file".equals(zVar.f853a.getScheme());
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0062, code lost:
        if (r0 != null) goto L_0x0059;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x0070, code lost:
        if (r0 != null) goto L_0x0059;
     */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x006c  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final N0.p c(Q0.z r10, int r11) {
        /*
            r9 = this;
            int r11 = r9.f839c
            switch(r11) {
                case 0: goto L_0x0038;
                default: goto L_0x0005;
            }
        L_0x0005:
            android.content.Context r11 = r9.f813b
            android.content.ContentResolver r11 = r11.getContentResolver()
            android.net.Uri r0 = r10.f853a
            java.io.InputStream r11 = r11.openInputStream(r0)
            r1.b r11 = r1.o.b(r11)
            N0.p r0 = new N0.p
            a.e r1 = new a.e
            android.net.Uri r10 = r10.f853a
            java.lang.String r10 = r10.getPath()
            r1.<init>(r10)
            java.lang.String r10 = "Orientation"
            a.b r10 = r1.d(r10)
            r2 = 1
            if (r10 != 0) goto L_0x002c
            goto L_0x0032
        L_0x002c:
            java.nio.ByteOrder r1 = r1.f1048d     // Catch:{ NumberFormatException -> 0x0032 }
            int r2 = r10.e(r1)     // Catch:{ NumberFormatException -> 0x0032 }
        L_0x0032:
            r10 = 0
            r1 = 2
            r0.<init>(r10, r11, r1, r2)
            return r0
        L_0x0038:
            android.content.Context r11 = r9.f813b
            android.content.ContentResolver r6 = r11.getContentResolver()
            android.net.Uri r1 = r10.f853a
            r7 = 0
            r8 = 0
            java.lang.String[] r2 = f838d     // Catch:{ RuntimeException -> 0x0067, all -> 0x0065 }
            r3 = 0
            r4 = 0
            r5 = 0
            r0 = r6
            android.database.Cursor r0 = r0.query(r1, r2, r3, r4, r5)     // Catch:{ RuntimeException -> 0x0067, all -> 0x0065 }
            if (r0 == 0) goto L_0x0062
            boolean r1 = r0.moveToFirst()     // Catch:{ RuntimeException -> 0x0060, all -> 0x005d }
            if (r1 != 0) goto L_0x0055
            goto L_0x0062
        L_0x0055:
            int r7 = r0.getInt(r7)     // Catch:{ RuntimeException -> 0x0060, all -> 0x005d }
        L_0x0059:
            r0.close()
            goto L_0x0073
        L_0x005d:
            r10 = move-exception
            r8 = r0
            goto L_0x006a
        L_0x0060:
            goto L_0x0070
        L_0x0062:
            if (r0 == 0) goto L_0x0073
            goto L_0x0059
        L_0x0065:
            r10 = move-exception
            goto L_0x006a
        L_0x0067:
            r0 = r8
            goto L_0x0070
        L_0x006a:
            if (r8 == 0) goto L_0x006f
            r8.close()
        L_0x006f:
            throw r10
        L_0x0070:
            if (r0 == 0) goto L_0x0073
            goto L_0x0059
        L_0x0073:
            android.net.Uri r10 = r10.f853a
            java.lang.String r0 = r6.getType(r10)
            if (r0 == 0) goto L_0x0081
            java.lang.String r1 = "video/"
            boolean r0 = r0.startsWith(r1)
        L_0x0081:
            android.content.ContentResolver r11 = r11.getContentResolver()
            java.io.InputStream r10 = r11.openInputStream(r10)
            r1.b r10 = r1.o.b(r10)
            N0.p r11 = new N0.p
            r0 = 2
            r11.<init>(r8, r10, r0, r7)
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: Q0.q.c(Q0.z, int):N0.p");
    }
}
