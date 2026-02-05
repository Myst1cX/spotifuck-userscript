package i1;

import h1.c;
import java.io.Closeable;
import r1.v;

public final class f implements Closeable {

    /* renamed from: a  reason: collision with root package name */
    public final String f3113a;

    /* renamed from: b  reason: collision with root package name */
    public final long f3114b;

    /* renamed from: c  reason: collision with root package name */
    public final v[] f3115c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ g f3116d;

    public final void close() {
        for (v c2 : this.f3115c) {
            c.c(c2);
        }
    }

    public f(g gVar, String str, long j2, v[] vVarArr) {
        this.f3116d = gVar;
        this.f3113a = str;
        this.f3114b = j2;
        this.f3115c = vVarArr;
    }
}
