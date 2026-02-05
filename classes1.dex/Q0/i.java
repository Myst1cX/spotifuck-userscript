package Q0;

import android.os.Message;

public final class i implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f814a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Message f815b;

    public /* synthetic */ i(Message message, int i) {
        this.f814a = i;
        this.f815b = message;
    }

    public final void run() {
        switch (this.f814a) {
            case 0:
                throw new AssertionError("Unknown handler message received: " + this.f815b.what);
            default:
                throw new AssertionError("Unhandled stats message." + this.f815b.what);
        }
    }
}
