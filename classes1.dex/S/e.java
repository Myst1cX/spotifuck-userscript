package S;

import N0.k;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputConnectionWrapper;

public final class e extends InputConnectionWrapper {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ k f880a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public e(InputConnection inputConnection, k kVar) {
        super(inputConnection, false);
        this.f880a = kVar;
    }

    /* JADX WARNING: Removed duplicated region for block: B:44:0x0082  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean performPrivateCommand(java.lang.String r12, android.os.Bundle r13) {
        /*
            r11 = this;
            N0.k r0 = r11.f880a
            r1 = 1
            r2 = 0
            if (r13 != 0) goto L_0x0008
            goto L_0x0086
        L_0x0008:
            java.lang.String r3 = "androidx.core.view.inputmethod.InputConnectionCompat.COMMIT_CONTENT"
            boolean r3 = android.text.TextUtils.equals(r3, r12)
            if (r3 == 0) goto L_0x0012
            r3 = 0
            goto L_0x001b
        L_0x0012:
            java.lang.String r3 = "android.support.v13.view.inputmethod.InputConnectionCompat.COMMIT_CONTENT"
            boolean r3 = android.text.TextUtils.equals(r3, r12)
            if (r3 == 0) goto L_0x0086
            r3 = 1
        L_0x001b:
            r4 = 0
            if (r3 == 0) goto L_0x0024
            java.lang.String r5 = "android.support.v13.view.inputmethod.InputConnectionCompat.CONTENT_RESULT_RECEIVER"
            goto L_0x0026
        L_0x0021:
            r12 = move-exception
            r5 = r4
            goto L_0x0080
        L_0x0024:
            java.lang.String r5 = "androidx.core.view.inputmethod.InputConnectionCompat.CONTENT_RESULT_RECEIVER"
        L_0x0026:
            android.os.Parcelable r5 = r13.getParcelable(r5)     // Catch:{ all -> 0x0021 }
            android.os.ResultReceiver r5 = (android.os.ResultReceiver) r5     // Catch:{ all -> 0x0021 }
            if (r3 == 0) goto L_0x0033
            java.lang.String r6 = "android.support.v13.view.inputmethod.InputConnectionCompat.CONTENT_URI"
            goto L_0x0035
        L_0x0031:
            r12 = move-exception
            goto L_0x0080
        L_0x0033:
            java.lang.String r6 = "androidx.core.view.inputmethod.InputConnectionCompat.CONTENT_URI"
        L_0x0035:
            android.os.Parcelable r6 = r13.getParcelable(r6)     // Catch:{ all -> 0x0031 }
            android.net.Uri r6 = (android.net.Uri) r6     // Catch:{ all -> 0x0031 }
            if (r3 == 0) goto L_0x0040
            java.lang.String r7 = "android.support.v13.view.inputmethod.InputConnectionCompat.CONTENT_DESCRIPTION"
            goto L_0x0042
        L_0x0040:
            java.lang.String r7 = "androidx.core.view.inputmethod.InputConnectionCompat.CONTENT_DESCRIPTION"
        L_0x0042:
            android.os.Parcelable r7 = r13.getParcelable(r7)     // Catch:{ all -> 0x0031 }
            android.content.ClipDescription r7 = (android.content.ClipDescription) r7     // Catch:{ all -> 0x0031 }
            if (r3 == 0) goto L_0x004d
            java.lang.String r8 = "android.support.v13.view.inputmethod.InputConnectionCompat.CONTENT_LINK_URI"
            goto L_0x004f
        L_0x004d:
            java.lang.String r8 = "androidx.core.view.inputmethod.InputConnectionCompat.CONTENT_LINK_URI"
        L_0x004f:
            android.os.Parcelable r8 = r13.getParcelable(r8)     // Catch:{ all -> 0x0031 }
            android.net.Uri r8 = (android.net.Uri) r8     // Catch:{ all -> 0x0031 }
            if (r3 == 0) goto L_0x005a
            java.lang.String r9 = "android.support.v13.view.inputmethod.InputConnectionCompat.CONTENT_FLAGS"
            goto L_0x005c
        L_0x005a:
            java.lang.String r9 = "androidx.core.view.inputmethod.InputConnectionCompat.CONTENT_FLAGS"
        L_0x005c:
            int r9 = r13.getInt(r9)     // Catch:{ all -> 0x0031 }
            if (r3 == 0) goto L_0x0065
            java.lang.String r3 = "android.support.v13.view.inputmethod.InputConnectionCompat.CONTENT_OPTS"
            goto L_0x0067
        L_0x0065:
            java.lang.String r3 = "androidx.core.view.inputmethod.InputConnectionCompat.CONTENT_OPTS"
        L_0x0067:
            android.os.Parcelable r3 = r13.getParcelable(r3)     // Catch:{ all -> 0x0031 }
            android.os.Bundle r3 = (android.os.Bundle) r3     // Catch:{ all -> 0x0031 }
            if (r6 == 0) goto L_0x007a
            if (r7 == 0) goto L_0x007a
            A.b r10 = new A.b     // Catch:{ all -> 0x0031 }
            r10.<init>(r6, r7, r8)     // Catch:{ all -> 0x0031 }
            boolean r2 = r0.a(r10, r9, r3)     // Catch:{ all -> 0x0031 }
        L_0x007a:
            if (r5 == 0) goto L_0x0086
            r5.send(r2, r4)
            goto L_0x0086
        L_0x0080:
            if (r5 == 0) goto L_0x0085
            r5.send(r2, r4)
        L_0x0085:
            throw r12
        L_0x0086:
            if (r2 == 0) goto L_0x0089
            return r1
        L_0x0089:
            boolean r12 = super.performPrivateCommand(r12, r13)
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: S.e.performPrivateCommand(java.lang.String, android.os.Bundle):boolean");
    }
}
