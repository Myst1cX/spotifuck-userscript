package android.support.v4.media;

import Q0.E;
import android.os.Bundle;
import r.b;

public final class i {

    /* renamed from: a  reason: collision with root package name */
    public final Bundle f1083a;

    public i() {
        this.f1083a = new Bundle();
    }

    public void a(String str, String str2) {
        b bVar = MediaMetadataCompat.f1065c;
        if (!bVar.containsKey(str) || ((Integer) bVar.getOrDefault(str, (Object) null)).intValue() == 1) {
            this.f1083a.putCharSequence(str, str2);
            return;
        }
        throw new IllegalArgumentException(E.g("The ", str, " key cannot be used to put a String"));
    }

    public i(Bundle bundle) {
        this.f1083a = bundle;
    }
}
