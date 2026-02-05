package Q0;

import N0.B;
import android.os.Process;
import java.lang.ref.ReferenceQueue;

public final class v extends Thread {

    /* renamed from: a  reason: collision with root package name */
    public final ReferenceQueue f843a;

    /* renamed from: b  reason: collision with root package name */
    public final u f844b;

    public final void run() {
        u uVar = this.f844b;
        Process.setThreadPriority(10);
        while (true) {
            try {
                C0032a aVar = (C0032a) this.f843a.remove(1000);
                uVar.obtainMessage().recycle();
            } catch (InterruptedException unused) {
                return;
            } catch (Exception e) {
                uVar.post(new B(1, e));
                return;
            }
        }
    }

    public v(ReferenceQueue referenceQueue, u uVar) {
        this.f843a = referenceQueue;
        this.f844b = uVar;
        setDaemon(true);
        setName("Picasso-refQueue");
    }
}
