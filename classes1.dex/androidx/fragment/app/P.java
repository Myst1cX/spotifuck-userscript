package androidx.fragment.app;

import java.io.Writer;

public final class P extends Writer {

    /* renamed from: a  reason: collision with root package name */
    public final StringBuilder f1642a = new StringBuilder(128);

    public final void write(char[] cArr, int i, int i2) {
        for (int i3 = 0; i3 < i2; i3++) {
            char c2 = cArr[i + i3];
            if (c2 == 10) {
                f();
            } else {
                this.f1642a.append(c2);
            }
        }
    }

    public final void f() {
        StringBuilder sb = this.f1642a;
        if (sb.length() > 0) {
            sb.toString();
            sb.delete(0, sb.length());
        }
    }

    public final void close() {
        f();
    }

    public final void flush() {
        f();
    }
}
