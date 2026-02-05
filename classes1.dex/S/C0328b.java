package s;

import java.util.concurrent.CancellationException;

/* renamed from: s.b  reason: case insensitive filesystem */
public final class C0328b {

    /* renamed from: b  reason: collision with root package name */
    public static final C0328b f4617b;

    /* renamed from: c  reason: collision with root package name */
    public static final C0328b f4618c;

    /* renamed from: a  reason: collision with root package name */
    public final CancellationException f4619a;

    static {
        if (h.f4629d) {
            f4618c = null;
            f4617b = null;
            return;
        }
        f4618c = new C0328b(false, (CancellationException) null);
        f4617b = new C0328b(true, (CancellationException) null);
    }

    public C0328b(boolean z2, CancellationException cancellationException) {
        this.f4619a = cancellationException;
    }
}
