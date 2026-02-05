package N0;

import A.b;
import N.C0004d;
import N.Q;
import S.g;
import android.content.ClipData;
import android.content.ClipDescription;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.Log;
import o.C0306u;

public final /* synthetic */ class k {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ Object f634a;

    public /* synthetic */ k(Object obj) {
        this.f634a = obj;
    }

    public boolean a(b bVar, int i, Bundle bundle) {
        b bVar2;
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 25 && (i & 1) != 0) {
            try {
                ((g) bVar.f2g).b();
                Parcelable parcelable = (Parcelable) ((g) bVar.f2g).d();
                if (bundle == null) {
                    bundle = new Bundle();
                } else {
                    bundle = new Bundle(bundle);
                }
                bundle.putParcelable("androidx.core.view.extra.INPUT_CONTENT_INFO", parcelable);
            } catch (Exception e) {
                Log.w("InputConnectionCompat", "Can't insert content from IME; requestPermission() failed", e);
                return false;
            }
        }
        ClipDescription a2 = ((g) bVar.f2g).a();
        g gVar = (g) bVar.f2g;
        ClipData clipData = new ClipData(a2, new ClipData.Item(gVar.e()));
        if (i2 >= 31) {
            bVar2 = new b(clipData, 2);
        } else {
            C0004d dVar = new C0004d();
            dVar.f530g = clipData;
            dVar.f531h = 2;
            bVar2 = dVar;
        }
        bVar2.d(gVar.c());
        bVar2.b(bundle);
        if (Q.l((C0306u) this.f634a, bVar2.j()) == null) {
            return true;
        }
        return false;
    }
}
