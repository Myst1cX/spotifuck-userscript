package R0;

import android.webkit.ValueCallback;

public final /* synthetic */ class b implements ValueCallback {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ c f857a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ int f858b;

    public /* synthetic */ b(c cVar, int i) {
        this.f857a = cVar;
        this.f858b = i;
    }

    public final void onReceiveValue(Object obj) {
        c.a(this.f857a, this.f858b, (String) obj);
    }
}
