package t;

import E.j;
import java.util.Arrays;

/* renamed from: t.d  reason: case insensitive filesystem */
public final class C0338d extends C0336b {

    /* renamed from: f  reason: collision with root package name */
    public C0340f[] f4663f;

    /* renamed from: g  reason: collision with root package name */
    public C0340f[] f4664g;

    /* renamed from: h  reason: collision with root package name */
    public int f4665h;
    public j i;

    public final C0340f d(boolean[] zArr) {
        int i2 = -1;
        for (int i3 = 0; i3 < this.f4665h; i3++) {
            C0340f[] fVarArr = this.f4663f;
            C0340f fVar = fVarArr[i3];
            if (!zArr[fVar.f4668b]) {
                j jVar = this.i;
                jVar.f108g = fVar;
                int i4 = 8;
                if (i2 != -1) {
                    C0340f fVar2 = fVarArr[i2];
                    while (true) {
                        if (i4 < 0) {
                            break;
                        }
                        float f2 = fVar2.f4673h[i4];
                        float f3 = ((C0340f) jVar.f108g).f4673h[i4];
                        if (f3 == f2) {
                            i4--;
                        } else if (f3 >= f2) {
                        }
                    }
                } else {
                    while (true) {
                        if (i4 < 0) {
                            break;
                        }
                        float f4 = ((C0340f) jVar.f108g).f4673h[i4];
                        if (f4 > 0.0f) {
                            break;
                        } else if (f4 < 0.0f) {
                            break;
                        } else {
                            i4--;
                        }
                    }
                }
                i2 = i3;
            }
        }
        if (i2 == -1) {
            return null;
        }
        return this.f4663f[i2];
    }

    public final void k(C0340f fVar) {
        int i2 = 0;
        while (i2 < this.f4665h) {
            if (this.f4663f[i2] == fVar) {
                while (true) {
                    int i3 = this.f4665h;
                    if (i2 < i3 - 1) {
                        C0340f[] fVarArr = this.f4663f;
                        int i4 = i2 + 1;
                        fVarArr[i2] = fVarArr[i4];
                        i2 = i4;
                    } else {
                        this.f4665h = i3 - 1;
                        fVar.f4667a = false;
                        return;
                    }
                }
            } else {
                i2++;
            }
        }
    }

    public final boolean e() {
        if (this.f4665h == 0) {
            return true;
        }
        return false;
    }

    public final void i(C0337c cVar, C0336b bVar, boolean z2) {
        C0336b bVar2 = bVar;
        C0340f fVar = bVar2.f4644a;
        if (fVar != null) {
            C0335a aVar = bVar2.f4647d;
            int d2 = aVar.d();
            for (int i2 = 0; i2 < d2; i2++) {
                C0340f e = aVar.e(i2);
                float f2 = aVar.f(i2);
                j jVar = this.i;
                jVar.f108g = e;
                boolean z3 = e.f4667a;
                float[] fArr = fVar.f4673h;
                if (z3) {
                    boolean z4 = true;
                    for (int i3 = 0; i3 < 9; i3++) {
                        float[] fArr2 = ((C0340f) jVar.f108g).f4673h;
                        float f3 = (fArr[i3] * f2) + fArr2[i3];
                        fArr2[i3] = f3;
                        if (Math.abs(f3) < 1.0E-4f) {
                            ((C0340f) jVar.f108g).f4673h[i3] = 0.0f;
                        } else {
                            z4 = false;
                        }
                    }
                    if (z4) {
                        ((C0338d) jVar.f109h).k((C0340f) jVar.f108g);
                    }
                } else {
                    for (int i4 = 0; i4 < 9; i4++) {
                        float f4 = fArr[i4];
                        if (f4 != 0.0f) {
                            float f5 = f4 * f2;
                            if (Math.abs(f5) < 1.0E-4f) {
                                f5 = 0.0f;
                            }
                            ((C0340f) jVar.f108g).f4673h[i4] = f5;
                        } else {
                            ((C0340f) jVar.f108g).f4673h[i4] = 0.0f;
                        }
                    }
                    j(e);
                }
                this.f4645b = (bVar2.f4645b * f2) + this.f4645b;
            }
            k(fVar);
        }
    }

    public final void j(C0340f fVar) {
        int i2;
        int i3 = this.f4665h + 1;
        C0340f[] fVarArr = this.f4663f;
        if (i3 > fVarArr.length) {
            C0340f[] fVarArr2 = (C0340f[]) Arrays.copyOf(fVarArr, fVarArr.length * 2);
            this.f4663f = fVarArr2;
            this.f4664g = (C0340f[]) Arrays.copyOf(fVarArr2, fVarArr2.length * 2);
        }
        C0340f[] fVarArr3 = this.f4663f;
        int i4 = this.f4665h;
        fVarArr3[i4] = fVar;
        int i5 = i4 + 1;
        this.f4665h = i5;
        if (i5 > 1 && fVarArr3[i4].f4668b > fVar.f4668b) {
            int i6 = 0;
            while (true) {
                i2 = this.f4665h;
                if (i6 >= i2) {
                    break;
                }
                this.f4664g[i6] = this.f4663f[i6];
                i6++;
            }
            Arrays.sort(this.f4664g, 0, i2, new A.j(4));
            for (int i7 = 0; i7 < this.f4665h; i7++) {
                this.f4663f[i7] = this.f4664g[i7];
            }
        }
        fVar.f4667a = true;
        fVar.a(this);
    }

    public final String toString() {
        String str = " goal -> (" + this.f4645b + ") : ";
        for (int i2 = 0; i2 < this.f4665h; i2++) {
            C0340f fVar = this.f4663f[i2];
            j jVar = this.i;
            jVar.f108g = fVar;
            str = str + jVar + " ";
        }
        return str;
    }
}
