package t;

import Q0.E;
import android.support.v4.media.session.t;
import java.util.Arrays;

/* renamed from: t.a  reason: case insensitive filesystem */
public final class C0335a {

    /* renamed from: a  reason: collision with root package name */
    public int f4636a = 0;

    /* renamed from: b  reason: collision with root package name */
    public final C0336b f4637b;

    /* renamed from: c  reason: collision with root package name */
    public final t f4638c;

    /* renamed from: d  reason: collision with root package name */
    public int f4639d = 8;
    public int[] e = new int[8];

    /* renamed from: f  reason: collision with root package name */
    public int[] f4640f = new int[8];

    /* renamed from: g  reason: collision with root package name */
    public float[] f4641g = new float[8];

    /* renamed from: h  reason: collision with root package name */
    public int f4642h = -1;
    public int i = -1;

    /* renamed from: j  reason: collision with root package name */
    public boolean f4643j = false;

    public final void g(C0340f fVar, float f2) {
        if (f2 == 0.0f) {
            h(fVar, true);
            return;
        }
        int i2 = this.f4642h;
        C0336b bVar = this.f4637b;
        if (i2 == -1) {
            this.f4642h = 0;
            this.f4641g[0] = f2;
            this.e[0] = fVar.f4668b;
            this.f4640f[0] = -1;
            fVar.f4675k++;
            fVar.a(bVar);
            this.f4636a++;
            if (!this.f4643j) {
                int i3 = this.i + 1;
                this.i = i3;
                int[] iArr = this.e;
                if (i3 >= iArr.length) {
                    this.f4643j = true;
                    this.i = iArr.length - 1;
                    return;
                }
                return;
            }
            return;
        }
        int i4 = 0;
        int i5 = -1;
        while (i2 != -1 && i4 < this.f4636a) {
            int i6 = this.e[i2];
            int i7 = fVar.f4668b;
            if (i6 == i7) {
                this.f4641g[i2] = f2;
                return;
            }
            if (i6 < i7) {
                i5 = i2;
            }
            i2 = this.f4640f[i2];
            i4++;
        }
        int i8 = this.i;
        int i9 = i8 + 1;
        if (this.f4643j) {
            int[] iArr2 = this.e;
            if (iArr2[i8] != -1) {
                i8 = iArr2.length;
            }
        } else {
            i8 = i9;
        }
        int[] iArr3 = this.e;
        if (i8 >= iArr3.length && this.f4636a < iArr3.length) {
            int i10 = 0;
            while (true) {
                int[] iArr4 = this.e;
                if (i10 >= iArr4.length) {
                    break;
                } else if (iArr4[i10] == -1) {
                    i8 = i10;
                    break;
                } else {
                    i10++;
                }
            }
        }
        int[] iArr5 = this.e;
        if (i8 >= iArr5.length) {
            i8 = iArr5.length;
            int i11 = this.f4639d * 2;
            this.f4639d = i11;
            this.f4643j = false;
            this.i = i8 - 1;
            this.f4641g = Arrays.copyOf(this.f4641g, i11);
            this.e = Arrays.copyOf(this.e, this.f4639d);
            this.f4640f = Arrays.copyOf(this.f4640f, this.f4639d);
        }
        this.e[i8] = fVar.f4668b;
        this.f4641g[i8] = f2;
        if (i5 != -1) {
            int[] iArr6 = this.f4640f;
            iArr6[i8] = iArr6[i5];
            iArr6[i5] = i8;
        } else {
            this.f4640f[i8] = this.f4642h;
            this.f4642h = i8;
        }
        fVar.f4675k++;
        fVar.a(bVar);
        int i12 = this.f4636a + 1;
        this.f4636a = i12;
        if (!this.f4643j) {
            this.i++;
        }
        int[] iArr7 = this.e;
        if (i12 >= iArr7.length) {
            this.f4643j = true;
        }
        if (this.i >= iArr7.length) {
            this.f4643j = true;
            this.i = iArr7.length - 1;
        }
    }

    public final void b() {
        int i2 = this.f4642h;
        int i3 = 0;
        while (i2 != -1 && i3 < this.f4636a) {
            C0340f fVar = ((C0340f[]) this.f4638c.f1133d)[this.e[i2]];
            if (fVar != null) {
                fVar.b(this.f4637b);
            }
            i2 = this.f4640f[i2];
            i3++;
        }
        this.f4642h = -1;
        this.i = -1;
        this.f4643j = false;
        this.f4636a = 0;
    }

    public final float c(C0340f fVar) {
        int i2 = this.f4642h;
        int i3 = 0;
        while (i2 != -1 && i3 < this.f4636a) {
            if (this.e[i2] == fVar.f4668b) {
                return this.f4641g[i2];
            }
            i2 = this.f4640f[i2];
            i3++;
        }
        return 0.0f;
    }

    public final int d() {
        return this.f4636a;
    }

    public final C0340f e(int i2) {
        int i3 = this.f4642h;
        int i4 = 0;
        while (i3 != -1 && i4 < this.f4636a) {
            if (i4 == i2) {
                return ((C0340f[]) this.f4638c.f1133d)[this.e[i3]];
            }
            i3 = this.f4640f[i3];
            i4++;
        }
        return null;
    }

    public final float f(int i2) {
        int i3 = this.f4642h;
        int i4 = 0;
        while (i3 != -1 && i4 < this.f4636a) {
            if (i4 == i2) {
                return this.f4641g[i3];
            }
            i3 = this.f4640f[i3];
            i4++;
        }
        return 0.0f;
    }

    public final float h(C0340f fVar, boolean z2) {
        int i2 = this.f4642h;
        if (i2 == -1) {
            return 0.0f;
        }
        int i3 = 0;
        int i4 = -1;
        while (i2 != -1 && i3 < this.f4636a) {
            if (this.e[i2] == fVar.f4668b) {
                if (i2 == this.f4642h) {
                    this.f4642h = this.f4640f[i2];
                } else {
                    int[] iArr = this.f4640f;
                    iArr[i4] = iArr[i2];
                }
                if (z2) {
                    fVar.b(this.f4637b);
                }
                fVar.f4675k--;
                this.f4636a--;
                this.e[i2] = -1;
                if (this.f4643j) {
                    this.i = i2;
                }
                return this.f4641g[i2];
            }
            i3++;
            i4 = i2;
            i2 = this.f4640f[i2];
        }
        return 0.0f;
    }

    public final String toString() {
        int i2 = this.f4642h;
        String str = "";
        int i3 = 0;
        while (i2 != -1 && i3 < this.f4636a) {
            str = (E.f(str, " -> ") + this.f4641g[i2] + " : ") + ((C0340f[]) this.f4638c.f1133d)[this.e[i2]];
            i2 = this.f4640f[i2];
            i3++;
        }
        return str;
    }

    public C0335a(C0336b bVar, t tVar) {
        this.f4637b = bVar;
        this.f4638c = tVar;
    }

    public final void a(C0340f fVar, float f2, boolean z2) {
        if (f2 <= -0.001f || f2 >= 0.001f) {
            int i2 = this.f4642h;
            C0336b bVar = this.f4637b;
            if (i2 == -1) {
                this.f4642h = 0;
                this.f4641g[0] = f2;
                this.e[0] = fVar.f4668b;
                this.f4640f[0] = -1;
                fVar.f4675k++;
                fVar.a(bVar);
                this.f4636a++;
                if (!this.f4643j) {
                    int i3 = this.i + 1;
                    this.i = i3;
                    int[] iArr = this.e;
                    if (i3 >= iArr.length) {
                        this.f4643j = true;
                        this.i = iArr.length - 1;
                        return;
                    }
                    return;
                }
                return;
            }
            int i4 = 0;
            int i5 = -1;
            while (i2 != -1 && i4 < this.f4636a) {
                int i6 = this.e[i2];
                int i7 = fVar.f4668b;
                if (i6 == i7) {
                    float[] fArr = this.f4641g;
                    float f3 = fArr[i2] + f2;
                    if (f3 > -0.001f && f3 < 0.001f) {
                        f3 = 0.0f;
                    }
                    fArr[i2] = f3;
                    if (f3 == 0.0f) {
                        if (i2 == this.f4642h) {
                            this.f4642h = this.f4640f[i2];
                        } else {
                            int[] iArr2 = this.f4640f;
                            iArr2[i5] = iArr2[i2];
                        }
                        if (z2) {
                            fVar.b(bVar);
                        }
                        if (this.f4643j) {
                            this.i = i2;
                        }
                        fVar.f4675k--;
                        this.f4636a--;
                        return;
                    }
                    return;
                }
                if (i6 < i7) {
                    i5 = i2;
                }
                i2 = this.f4640f[i2];
                i4++;
            }
            int i8 = this.i;
            int i9 = i8 + 1;
            if (this.f4643j) {
                int[] iArr3 = this.e;
                if (iArr3[i8] != -1) {
                    i8 = iArr3.length;
                }
            } else {
                i8 = i9;
            }
            int[] iArr4 = this.e;
            if (i8 >= iArr4.length && this.f4636a < iArr4.length) {
                int i10 = 0;
                while (true) {
                    int[] iArr5 = this.e;
                    if (i10 >= iArr5.length) {
                        break;
                    } else if (iArr5[i10] == -1) {
                        i8 = i10;
                        break;
                    } else {
                        i10++;
                    }
                }
            }
            int[] iArr6 = this.e;
            if (i8 >= iArr6.length) {
                i8 = iArr6.length;
                int i11 = this.f4639d * 2;
                this.f4639d = i11;
                this.f4643j = false;
                this.i = i8 - 1;
                this.f4641g = Arrays.copyOf(this.f4641g, i11);
                this.e = Arrays.copyOf(this.e, this.f4639d);
                this.f4640f = Arrays.copyOf(this.f4640f, this.f4639d);
            }
            this.e[i8] = fVar.f4668b;
            this.f4641g[i8] = f2;
            if (i5 != -1) {
                int[] iArr7 = this.f4640f;
                iArr7[i8] = iArr7[i5];
                iArr7[i5] = i8;
            } else {
                this.f4640f[i8] = this.f4642h;
                this.f4642h = i8;
            }
            fVar.f4675k++;
            fVar.a(bVar);
            this.f4636a++;
            if (!this.f4643j) {
                this.i++;
            }
            int i12 = this.i;
            int[] iArr8 = this.e;
            if (i12 >= iArr8.length) {
                this.f4643j = true;
                this.i = iArr8.length - 1;
            }
        }
    }
}
