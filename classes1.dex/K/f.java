package K;

import android.content.Context;
import java.util.concurrent.Callable;

public final class f implements Callable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f320a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ String f321b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ Context f322c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ e f323d;
    public final /* synthetic */ int e;

    public /* synthetic */ f(String str, Context context, e eVar, int i, int i2) {
        this.f320a = i2;
        this.f321b = str;
        this.f322c = context;
        this.f323d = eVar;
        this.e = i;
    }

    public final Object call() {
        switch (this.f320a) {
            case 0:
                return i.a(this.f321b, this.f322c, this.f323d, this.e);
            default:
                try {
                    return i.a(this.f321b, this.f322c, this.f323d, this.e);
                } catch (Throwable unused) {
                    return new h(-3);
                }
        }
    }
}
