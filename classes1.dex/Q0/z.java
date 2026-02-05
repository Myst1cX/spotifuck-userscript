package Q0;

import android.net.Uri;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;

public final class z {

    /* renamed from: a  reason: collision with root package name */
    public final Uri f853a;

    /* renamed from: b  reason: collision with root package name */
    public final List f854b = null;

    /* renamed from: c  reason: collision with root package name */
    public final int f855c;

    static {
        TimeUnit.SECONDS.toNanos(5);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Request{");
        sb.append(this.f853a);
        List list = this.f854b;
        if (list != null && !list.isEmpty()) {
            Iterator it2 = list.iterator();
            if (it2.hasNext()) {
                if (it2.next() == null) {
                    sb.append(' ');
                    throw null;
                }
                throw new ClassCastException();
            }
        }
        sb.append('}');
        return sb.toString();
    }

    public z(Uri uri, int i) {
        this.f853a = uri;
        this.f855c = i;
    }
}
