package S;

import A.b;
import N0.k;
import android.os.Build;
import android.os.Bundle;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputConnectionWrapper;
import android.view.inputmethod.InputContentInfo;

public final class d extends InputConnectionWrapper {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ k f879a;

    public final boolean commitContent(InputContentInfo inputContentInfo, int i, Bundle bundle) {
        b bVar = null;
        if (inputContentInfo != null && Build.VERSION.SDK_INT >= 25) {
            bVar = new b(10, (Object) new f(inputContentInfo));
        }
        if (this.f879a.a(bVar, i, bundle)) {
            return true;
        }
        return super.commitContent(inputContentInfo, i, bundle);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public d(InputConnection inputConnection, k kVar) {
        super(inputConnection, false);
        this.f879a = kVar;
    }
}
