package androidx.activity;

import Q0.E;
import Y0.a;
import Z0.b;
import Z0.c;
import Z0.e;
import Z0.f;
import java.io.Serializable;

public final /* synthetic */ class z implements a, d1.a, Serializable {

    /* renamed from: a  reason: collision with root package name */
    public transient d1.a f1213a;

    /* renamed from: b  reason: collision with root package name */
    public final Object f1214b;

    /* renamed from: c  reason: collision with root package name */
    public final Class f1215c = A.class;

    /* renamed from: d  reason: collision with root package name */
    public final String f1216d = "updateEnabledCallbacks";
    public final String e = "updateEnabledCallbacks()V";

    /* renamed from: f  reason: collision with root package name */
    public final boolean f1217f = false;

    /* renamed from: g  reason: collision with root package name */
    public final int f1218g = 0;

    /* renamed from: h  reason: collision with root package name */
    public final /* synthetic */ int f1219h;

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof z) {
            z zVar = (z) obj;
            if (!this.f1216d.equals(zVar.f1216d) || !this.e.equals(zVar.e) || this.f1218g != zVar.f1218g || !c.a(this.f1214b, zVar.f1214b) || !c().equals(zVar.c())) {
                return false;
            }
            return true;
        } else if (!(obj instanceof z)) {
            return false;
        } else {
            d1.a aVar = this.f1213a;
            if (aVar == null) {
                b();
                this.f1213a = this;
                aVar = this;
            }
            return obj.equals(aVar);
        }
    }

    public z(int i, Object obj) {
        this.f1219h = i;
        this.f1214b = obj;
    }

    public final Object a() {
        switch (this.f1219h) {
            case 0:
                ((A) this.f1214b).e();
                return S0.c.f888c;
            default:
                ((A) this.f1214b).e();
                return S0.c.f888c;
        }
    }

    public final d1.a b() {
        f.f1013a.getClass();
        return this;
    }

    public final Z0.a c() {
        Class cls = this.f1215c;
        if (this.f1217f) {
            f.f1013a.getClass();
            return new e(cls);
        }
        f.f1013a.getClass();
        return new b(cls);
    }

    public final String toString() {
        d1.a aVar = this.f1213a;
        if (aVar == null) {
            b();
            this.f1213a = this;
            aVar = this;
        }
        if (aVar != this) {
            return aVar.toString();
        }
        String str = this.f1216d;
        if ("<init>".equals(str)) {
            return "constructor (Kotlin reflection is not available)";
        }
        return E.g("function ", str, " (Kotlin reflection is not available)");
    }

    public final int hashCode() {
        c();
        int hashCode = this.f1216d.hashCode();
        return this.e.hashCode() + ((hashCode + (c().hashCode() * 31)) * 31);
    }
}
