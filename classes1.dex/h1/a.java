package h1;

import java.util.Locale;

public abstract class a implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final String f3083a;

    public abstract void a();

    public a(String str, Object... objArr) {
        byte[] bArr = c.f3086a;
        this.f3083a = String.format(Locale.US, str, objArr);
    }

    public final void run() {
        String name = Thread.currentThread().getName();
        Thread.currentThread().setName(this.f3083a);
        try {
            a();
        } finally {
            Thread.currentThread().setName(name);
        }
    }
}
