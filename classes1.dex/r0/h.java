package R0;

import androidx.activity.z;
import androidx.fragment.app.H;
import it.deviato.spotifuck.MainActivity;
import java.util.concurrent.CopyOnWriteArrayList;

public final class h {

    /* renamed from: a  reason: collision with root package name */
    public boolean f861a;

    /* renamed from: b  reason: collision with root package name */
    public final CopyOnWriteArrayList f862b;

    /* renamed from: c  reason: collision with root package name */
    public z f863c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ int f864d;
    public final /* synthetic */ Object e;

    public h(boolean z2) {
        this.f861a = z2;
        this.f862b = new CopyOnWriteArrayList();
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public h(MainActivity mainActivity) {
        this(true);
        this.f864d = 0;
        this.e = mainActivity;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public h(H h2) {
        this(false);
        this.f864d = 1;
        this.e = h2;
    }
}
