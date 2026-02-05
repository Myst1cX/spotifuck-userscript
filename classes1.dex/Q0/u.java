package Q0;

import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import java.util.ArrayList;
import java.util.List;
import java.util.WeakHashMap;

public final class u extends Handler {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f842a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public /* synthetic */ u(Looper looper, int i) {
        super(looper);
        this.f842a = i;
    }

    public final void handleMessage(Message message) {
        boolean z2;
        Bitmap bitmap;
        switch (this.f842a) {
            case 0:
                int i = message.what;
                if (i == 3) {
                    n nVar = (n) message.obj;
                    nVar.f831a.getClass();
                    nVar.f831a.a(nVar.a());
                    return;
                } else if (i == 8) {
                    List list = (List) message.obj;
                    int size = list.size();
                    for (int i2 = 0; i2 < size; i2++) {
                        C0037f fVar = (C0037f) list.get(i2);
                        w wVar = fVar.f795b;
                        wVar.getClass();
                        n nVar2 = fVar.f801j;
                        ArrayList arrayList = fVar.f802k;
                        if (arrayList == null || arrayList.isEmpty()) {
                            z2 = false;
                        } else {
                            z2 = true;
                        }
                        if (nVar2 != null || z2) {
                            Uri uri = fVar.f799g.f853a;
                            Exception exc = fVar.f806o;
                            Bitmap bitmap2 = fVar.f803l;
                            int i3 = fVar.f805n;
                            if (nVar2 != null) {
                                wVar.b(bitmap2, i3, nVar2, exc);
                            }
                            if (z2) {
                                int size2 = arrayList.size();
                                for (int i4 = 0; i4 < size2; i4++) {
                                    wVar.b(bitmap2, i3, (n) arrayList.get(i4), exc);
                                }
                            }
                        }
                    }
                    return;
                } else if (i == 13) {
                    List list2 = (List) message.obj;
                    int size3 = list2.size();
                    for (int i5 = 0; i5 < size3; i5++) {
                        n nVar3 = (n) list2.get(i5);
                        w wVar2 = nVar3.f831a;
                        wVar2.getClass();
                        p pVar = (p) ((o) wVar2.f849c.f2g).get(nVar3.f833c);
                        if (pVar != null) {
                            bitmap = pVar.f836a;
                        } else {
                            bitmap = null;
                        }
                        C c2 = wVar2.f850d;
                        if (bitmap != null) {
                            c2.f760b.sendEmptyMessage(0);
                        } else {
                            c2.f760b.sendEmptyMessage(1);
                        }
                        if (bitmap != null) {
                            wVar2.b(bitmap, 1, nVar3, (Exception) null);
                        } else {
                            Object a2 = nVar3.a();
                            if (a2 != null) {
                                WeakHashMap weakHashMap = wVar2.e;
                                if (weakHashMap.get(a2) != nVar3) {
                                    wVar2.a(a2);
                                    weakHashMap.put(a2, nVar3);
                                }
                            }
                            j jVar = wVar2.f848b.f826h;
                            jVar.sendMessage(jVar.obtainMessage(1, nVar3));
                        }
                    }
                    return;
                } else {
                    throw new AssertionError("Unknown handler message received: " + message.what);
                }
            default:
                sendMessageDelayed(obtainMessage(), 1000);
                return;
        }
    }
}
