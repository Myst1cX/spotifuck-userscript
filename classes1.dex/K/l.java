package K;

import android.os.Process;

public final class l extends Thread {

    /* renamed from: a  reason: collision with root package name */
    public final int f338a;

    public final void run() {
        Process.setThreadPriority(this.f338a);
        super.run();
    }

    public l(Runnable runnable, String str, int i) {
        super(runnable, str);
        this.f338a = i;
    }
}
