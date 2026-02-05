package m1;

import h1.c;
import java.util.Locale;
import r1.h;

/* renamed from: m1.b  reason: case insensitive filesystem */
public final class C0179b {

    /* renamed from: d  reason: collision with root package name */
    public static final h f3679d = h.f(":");
    public static final h e = h.f(":status");

    /* renamed from: f  reason: collision with root package name */
    public static final h f3680f = h.f(":method");

    /* renamed from: g  reason: collision with root package name */
    public static final h f3681g = h.f(":path");

    /* renamed from: h  reason: collision with root package name */
    public static final h f3682h = h.f(":scheme");
    public static final h i = h.f(":authority");

    /* renamed from: a  reason: collision with root package name */
    public final h f3683a;

    /* renamed from: b  reason: collision with root package name */
    public final h f3684b;

    /* renamed from: c  reason: collision with root package name */
    public final int f3685c;

    public C0179b(String str, String str2) {
        this(h.f(str), h.f(str2));
    }

    public C0179b(h hVar, String str) {
        this(hVar, h.f(str));
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C0179b)) {
            return false;
        }
        C0179b bVar = (C0179b) obj;
        if (!this.f3683a.equals(bVar.f3683a) || !this.f3684b.equals(bVar.f3684b)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return this.f3684b.hashCode() + ((this.f3683a.hashCode() + 527) * 31);
    }

    public final String toString() {
        String o2 = this.f3683a.o();
        String o3 = this.f3684b.o();
        byte[] bArr = c.f3086a;
        Locale locale = Locale.US;
        return o2 + ": " + o3;
    }

    public C0179b(h hVar, h hVar2) {
        this.f3683a = hVar;
        this.f3684b = hVar2;
        this.f3685c = hVar2.l() + hVar.l() + 32;
    }
}
