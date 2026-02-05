package t;

import android.support.v4.media.session.t;
import java.util.ArrayList;

/* renamed from: t.b  reason: case insensitive filesystem */
public class C0336b {

    /* renamed from: a  reason: collision with root package name */
    public C0340f f4644a = null;

    /* renamed from: b  reason: collision with root package name */
    public float f4645b = 0.0f;

    /* renamed from: c  reason: collision with root package name */
    public final ArrayList f4646c = new ArrayList();

    /* renamed from: d  reason: collision with root package name */
    public final C0335a f4647d;
    public boolean e = false;

    public final void b(C0340f fVar, C0340f fVar2, C0340f fVar3, int i) {
        boolean z2 = false;
        if (i != 0) {
            if (i < 0) {
                i *= -1;
                z2 = true;
            }
            this.f4645b = (float) i;
        }
        if (!z2) {
            this.f4647d.g(fVar, -1.0f);
            this.f4647d.g(fVar2, 1.0f);
            this.f4647d.g(fVar3, 1.0f);
            return;
        }
        this.f4647d.g(fVar, 1.0f);
        this.f4647d.g(fVar2, -1.0f);
        this.f4647d.g(fVar3, -1.0f);
    }

    public final void c(C0340f fVar, C0340f fVar2, C0340f fVar3, int i) {
        boolean z2 = false;
        if (i != 0) {
            if (i < 0) {
                i *= -1;
                z2 = true;
            }
            this.f4645b = (float) i;
        }
        if (!z2) {
            this.f4647d.g(fVar, -1.0f);
            this.f4647d.g(fVar2, 1.0f);
            this.f4647d.g(fVar3, -1.0f);
            return;
        }
        this.f4647d.g(fVar, 1.0f);
        this.f4647d.g(fVar2, -1.0f);
        this.f4647d.g(fVar3, 1.0f);
    }

    public C0340f d(boolean[] zArr) {
        return f(zArr, (C0340f) null);
    }

    public final void a(C0337c cVar, int i) {
        this.f4647d.g(cVar.j(i), 1.0f);
        this.f4647d.g(cVar.j(i), -1.0f);
    }

    public boolean e() {
        if (this.f4644a == null && this.f4645b == 0.0f && this.f4647d.d() == 0) {
            return true;
        }
        return false;
    }

    public final C0340f f(boolean[] zArr, C0340f fVar) {
        int i;
        int d2 = this.f4647d.d();
        C0340f fVar2 = null;
        float f2 = 0.0f;
        for (int i2 = 0; i2 < d2; i2++) {
            float f3 = this.f4647d.f(i2);
            if (f3 < 0.0f) {
                C0340f e2 = this.f4647d.e(i2);
                if ((zArr == null || !zArr[e2.f4668b]) && e2 != fVar && (((i = e2.f4676l) == 3 || i == 4) && f3 < f2)) {
                    f2 = f3;
                    fVar2 = e2;
                }
            }
        }
        return fVar2;
    }

    public final void g(C0340f fVar) {
        C0340f fVar2 = this.f4644a;
        if (fVar2 != null) {
            this.f4647d.g(fVar2, -1.0f);
            this.f4644a.f4669c = -1;
            this.f4644a = null;
        }
        float h2 = this.f4647d.h(fVar, true) * -1.0f;
        this.f4644a = fVar;
        if (h2 != 1.0f) {
            this.f4645b /= h2;
            C0335a aVar = this.f4647d;
            int i = aVar.f4642h;
            int i2 = 0;
            while (i != -1 && i2 < aVar.f4636a) {
                float[] fArr = aVar.f4641g;
                fArr[i] = fArr[i] / h2;
                i = aVar.f4640f[i];
                i2++;
            }
        }
    }

    public final void h(C0337c cVar, C0340f fVar, boolean z2) {
        if (fVar != null && fVar.f4671f) {
            float c2 = this.f4647d.c(fVar);
            this.f4645b = (fVar.e * c2) + this.f4645b;
            this.f4647d.h(fVar, z2);
            if (z2) {
                fVar.b(this);
            }
            if (this.f4647d.d() == 0) {
                this.e = true;
                cVar.f4650b = true;
            }
        }
    }

    public void i(C0337c cVar, C0336b bVar, boolean z2) {
        C0335a aVar = this.f4647d;
        aVar.getClass();
        float c2 = aVar.c(bVar.f4644a);
        aVar.h(bVar.f4644a, z2);
        C0335a aVar2 = bVar.f4647d;
        int d2 = aVar2.d();
        for (int i = 0; i < d2; i++) {
            C0340f e2 = aVar2.e(i);
            aVar.a(e2, aVar2.c(e2) * c2, z2);
        }
        this.f4645b = (bVar.f4645b * c2) + this.f4645b;
        if (z2) {
            bVar.f4644a.b(this);
        }
        if (this.f4644a != null && this.f4647d.d() == 0) {
            this.e = true;
            cVar.f4650b = true;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x004b, code lost:
        r7 = r10.f4647d.f(r3);
     */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x0081  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x0086  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.String toString() {
        /*
            r10 = this;
            t.f r0 = r10.f4644a
            if (r0 != 0) goto L_0x0007
            java.lang.String r0 = "0"
            goto L_0x0017
        L_0x0007:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = ""
            r0.<init>(r1)
            t.f r1 = r10.f4644a
            r0.append(r1)
            java.lang.String r0 = r0.toString()
        L_0x0017:
            java.lang.String r1 = " = "
            java.lang.String r0 = Q0.E.f(r0, r1)
            float r1 = r10.f4645b
            r2 = 1
            r3 = 0
            r4 = 0
            int r1 = (r1 > r4 ? 1 : (r1 == r4 ? 0 : -1))
            if (r1 == 0) goto L_0x0039
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r0)
            float r0 = r10.f4645b
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            r1 = 1
            goto L_0x003a
        L_0x0039:
            r1 = 0
        L_0x003a:
            t.a r5 = r10.f4647d
            int r5 = r5.d()
        L_0x0040:
            if (r3 >= r5) goto L_0x00a1
            t.a r6 = r10.f4647d
            t.f r6 = r6.e(r3)
            if (r6 != 0) goto L_0x004b
            goto L_0x009e
        L_0x004b:
            t.a r7 = r10.f4647d
            float r7 = r7.f(r3)
            int r8 = (r7 > r4 ? 1 : (r7 == r4 ? 0 : -1))
            if (r8 != 0) goto L_0x0056
            goto L_0x009e
        L_0x0056:
            java.lang.String r6 = r6.toString()
            r9 = -1082130432(0xffffffffbf800000, float:-1.0)
            if (r1 != 0) goto L_0x006b
            int r1 = (r7 > r4 ? 1 : (r7 == r4 ? 0 : -1))
            if (r1 >= 0) goto L_0x007b
            java.lang.String r1 = "- "
            java.lang.String r0 = Q0.E.f(r0, r1)
        L_0x0068:
            float r7 = r7 * r9
            goto L_0x007b
        L_0x006b:
            if (r8 <= 0) goto L_0x0074
            java.lang.String r1 = " + "
            java.lang.String r0 = Q0.E.f(r0, r1)
            goto L_0x007b
        L_0x0074:
            java.lang.String r1 = " - "
            java.lang.String r0 = Q0.E.f(r0, r1)
            goto L_0x0068
        L_0x007b:
            r1 = 1065353216(0x3f800000, float:1.0)
            int r1 = (r7 > r1 ? 1 : (r7 == r1 ? 0 : -1))
            if (r1 != 0) goto L_0x0086
            java.lang.String r0 = Q0.E.f(r0, r6)
            goto L_0x009d
        L_0x0086:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r0)
            r1.append(r7)
            java.lang.String r0 = " "
            r1.append(r0)
            r1.append(r6)
            java.lang.String r0 = r1.toString()
        L_0x009d:
            r1 = 1
        L_0x009e:
            int r3 = r3 + 1
            goto L_0x0040
        L_0x00a1:
            if (r1 != 0) goto L_0x00a9
            java.lang.String r1 = "0.0"
            java.lang.String r0 = Q0.E.f(r0, r1)
        L_0x00a9:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: t.C0336b.toString():java.lang.String");
    }

    public C0336b(t tVar) {
        this.f4647d = new C0335a(this, tVar);
    }
}
