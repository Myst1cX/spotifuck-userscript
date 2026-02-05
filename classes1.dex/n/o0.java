package N;

import F.c;
import Q0.E;

public abstract class o0 {

    /* renamed from: a  reason: collision with root package name */
    public final w0 f574a;

    /* renamed from: b  reason: collision with root package name */
    public c[] f575b;

    public o0() {
        this(new w0());
    }

    public abstract w0 b();

    public abstract void e(c cVar);

    public abstract void g(c cVar);

    public o0(w0 w0Var) {
        this.f574a = w0Var;
    }

    public final void a() {
        c[] cVarArr = this.f575b;
        if (cVarArr != null) {
            c cVar = cVarArr[0];
            c cVar2 = cVarArr[1];
            w0 w0Var = this.f574a;
            if (cVar2 == null) {
                cVar2 = w0Var.f597a.f(2);
            }
            if (cVar == null) {
                cVar = w0Var.f597a.f(1);
            }
            g(c.a(cVar, cVar2));
            c cVar3 = this.f575b[4];
            if (cVar3 != null) {
                f(cVar3);
            }
            c cVar4 = this.f575b[5];
            if (cVar4 != null) {
                d(cVar4);
            }
            c cVar5 = this.f575b[6];
            if (cVar5 != null) {
                h(cVar5);
            }
        }
    }

    public void c(int i, c cVar) {
        char c2;
        if (this.f575b == null) {
            this.f575b = new c[9];
        }
        for (int i2 = 1; i2 <= 256; i2 <<= 1) {
            if ((i & i2) != 0) {
                c[] cVarArr = this.f575b;
                if (i2 != 1) {
                    c2 = 2;
                    if (i2 == 2) {
                        c2 = 1;
                    } else if (i2 != 4) {
                        c2 = 8;
                        if (i2 == 8) {
                            c2 = 3;
                        } else if (i2 == 16) {
                            c2 = 4;
                        } else if (i2 == 32) {
                            c2 = 5;
                        } else if (i2 == 64) {
                            c2 = 6;
                        } else if (i2 == 128) {
                            c2 = 7;
                        } else if (i2 != 256) {
                            throw new IllegalArgumentException(E.e("type needs to be >= FIRST and <= LAST, type=", i2));
                        }
                    }
                } else {
                    c2 = 0;
                }
                cVarArr[c2] = cVar;
            }
        }
    }

    public void d(c cVar) {
    }

    public void f(c cVar) {
    }

    public void h(c cVar) {
    }
}
