package androidx.emoji2.text;

import W.a;
import java.nio.ByteBuffer;

public final class o {

    /* renamed from: a  reason: collision with root package name */
    public int f1527a = 1;

    /* renamed from: b  reason: collision with root package name */
    public final r f1528b;

    /* renamed from: c  reason: collision with root package name */
    public r f1529c;

    /* renamed from: d  reason: collision with root package name */
    public r f1530d;
    public int e;

    /* renamed from: f  reason: collision with root package name */
    public int f1531f;

    public final void a() {
        this.f1527a = 1;
        this.f1529c = this.f1528b;
        this.f1531f = 0;
    }

    public final boolean b() {
        a c2 = this.f1529c.f1541b.c();
        int a2 = c2.a(6);
        if ((a2 == 0 || ((ByteBuffer) c2.f500d).get(a2 + c2.f497a) == 0) && this.e != 65039) {
            return false;
        }
        return true;
    }

    public o(r rVar) {
        this.f1528b = rVar;
        this.f1529c = rVar;
    }
}
