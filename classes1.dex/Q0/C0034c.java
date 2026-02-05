package Q0;

import h1.c;
import java.text.SimpleDateFormat;
import java.util.Locale;
import java.util.Random;

/* renamed from: Q0.c  reason: case insensitive filesystem */
public final class C0034c extends ThreadLocal {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f788a;

    public /* synthetic */ C0034c(int i) {
        this.f788a = i;
    }

    public final Object initialValue() {
        switch (this.f788a) {
            case 0:
                return new StringBuilder("Picasso-");
            case 1:
                return new Random();
            default:
                SimpleDateFormat simpleDateFormat = new SimpleDateFormat("EEE, dd MMM yyyy HH:mm:ss 'GMT'", Locale.US);
                simpleDateFormat.setLenient(false);
                simpleDateFormat.setTimeZone(c.e);
                return simpleDateFormat;
        }
    }
}
