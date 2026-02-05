package d0;

import A.b;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Messenger;
import android.util.Log;
import b.d;
import java.util.ArrayList;

public final class p implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f2493a = 1;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ b f2494b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ String f2495c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ d f2496d;
    public final /* synthetic */ b e;

    public p(b bVar, b bVar2, String str, d dVar) {
        this.e = bVar;
        this.f2494b = bVar2;
        this.f2495c = str;
        this.f2496d = dVar;
    }

    public p(b bVar, b bVar2, String str, Bundle bundle, d dVar) {
        this.e = bVar;
        this.f2494b = bVar2;
        this.f2495c = str;
        this.f2496d = dVar;
    }

    public final void run() {
        switch (this.f2493a) {
            case 0:
                IBinder binder = ((Messenger) this.f2494b.f2g).getBinder();
                b bVar = this.e;
                c cVar = (c) ((q) bVar.f2g).f2501j.getOrDefault(binder, (Object) null);
                String str = this.f2495c;
                if (cVar == null) {
                    Log.w("MBServiceCompat", "getMediaItem for callback that isn't registered id=" + str);
                    return;
                }
                ((q) bVar.f2g).getClass();
                b bVar2 = new b(str, this.f2496d, 0);
                bVar2.f2475d = 2;
                bVar2.d((ArrayList) null);
                if (!bVar2.b()) {
                    throw new IllegalStateException("onLoadItem must call detach() or sendResult() before returning for id=" + str);
                }
                return;
            default:
                IBinder binder2 = ((Messenger) this.f2494b.f2g).getBinder();
                b bVar3 = this.e;
                c cVar2 = (c) ((q) bVar3.f2g).f2501j.getOrDefault(binder2, (Object) null);
                String str2 = this.f2495c;
                if (cVar2 == null) {
                    Log.w("MBServiceCompat", "search for callback that isn't registered query=" + str2);
                    return;
                }
                ((q) bVar3.f2g).getClass();
                b bVar4 = new b(str2, this.f2496d, 1);
                bVar4.f2475d = 4;
                bVar4.d((ArrayList) null);
                if (!bVar4.b()) {
                    throw new IllegalStateException("onSearch must call detach() or sendResult() before returning for query=" + str2);
                }
                return;
        }
    }
}
