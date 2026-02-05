package k1;

import g1.A;
import g1.C;
import g1.C0103b;
import g1.v;
import g1.z;
import j1.b;
import j1.f;
import java.util.ArrayList;

public final class e {

    /* renamed from: a  reason: collision with root package name */
    public final ArrayList f3574a;

    /* renamed from: b  reason: collision with root package name */
    public final f f3575b;

    /* renamed from: c  reason: collision with root package name */
    public final b f3576c;

    /* renamed from: d  reason: collision with root package name */
    public final b f3577d;
    public final int e;

    /* renamed from: f  reason: collision with root package name */
    public final A f3578f;

    /* renamed from: g  reason: collision with root package name */
    public final z f3579g;

    /* renamed from: h  reason: collision with root package name */
    public final C0103b f3580h;
    public final int i;

    /* renamed from: j  reason: collision with root package name */
    public final int f3581j;

    /* renamed from: k  reason: collision with root package name */
    public final int f3582k;

    /* renamed from: l  reason: collision with root package name */
    public int f3583l;

    public final C a(A a2) {
        return b(a2, this.f3575b, this.f3576c, this.f3577d);
    }

    public final C b(A a2, f fVar, b bVar, b bVar2) {
        ArrayList arrayList = this.f3574a;
        int size = arrayList.size();
        int i2 = this.e;
        if (i2 < size) {
            this.f3583l++;
            b bVar3 = this.f3576c;
            A a3 = a2;
            if (bVar3 != null) {
                if (!this.f3577d.j(a3.f2632a)) {
                    throw new IllegalStateException("network interceptor " + arrayList.get(i2 - 1) + " must retain the same host and port");
                }
            }
            if (bVar3 == null || this.f3583l <= 1) {
                int i3 = i2 + 1;
                C0103b bVar4 = this.f3580h;
                int i4 = this.i;
                z zVar = this.f3579g;
                int i5 = this.f3581j;
                int i6 = this.f3582k;
                C0103b bVar5 = bVar4;
                int i7 = i3;
                e eVar = r1;
                String str = " must call proceed() exactly once";
                String str2 = "network interceptor ";
                e eVar2 = new e(arrayList, fVar, bVar, bVar2, i3, a2, zVar, bVar5, i4, i5, i6);
                v vVar = (v) arrayList.get(i2);
                C a4 = vVar.a(eVar);
                if (bVar != null && i7 < arrayList.size() && eVar.f3583l != 1) {
                    throw new IllegalStateException(str2 + vVar + str);
                } else if (a4 == null) {
                    throw new NullPointerException("interceptor " + vVar + " returned null");
                } else if (a4.f2651g != null) {
                    return a4;
                } else {
                    throw new IllegalStateException("interceptor " + vVar + " returned a response with no body");
                }
            } else {
                throw new IllegalStateException("network interceptor " + arrayList.get(i2 - 1) + " must call proceed() exactly once");
            }
        } else {
            throw new AssertionError();
        }
    }

    public e(ArrayList arrayList, f fVar, b bVar, b bVar2, int i2, A a2, z zVar, C0103b bVar3, int i3, int i4, int i5) {
        this.f3574a = arrayList;
        this.f3577d = bVar2;
        this.f3575b = fVar;
        this.f3576c = bVar;
        this.e = i2;
        this.f3578f = a2;
        this.f3579g = zVar;
        this.f3580h = bVar3;
        this.i = i3;
        this.f3581j = i4;
        this.f3582k = i5;
    }
}
