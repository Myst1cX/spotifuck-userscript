package androidx.lifecycle;

import A.b;

public abstract class w {

    /* renamed from: a  reason: collision with root package name */
    public final b f1848a;

    /* renamed from: b  reason: collision with root package name */
    public boolean f1849b;

    /* renamed from: c  reason: collision with root package name */
    public int f1850c = -1;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ x f1851d;

    public void d() {
    }

    public abstract boolean e();

    public final void c(boolean z2) {
        int i;
        if (z2 != this.f1849b) {
            this.f1849b = z2;
            if (z2) {
                i = 1;
            } else {
                i = -1;
            }
            x xVar = this.f1851d;
            int i2 = xVar.f1855c;
            xVar.f1855c = i + i2;
            if (!xVar.f1856d) {
                xVar.f1856d = true;
                while (true) {
                    try {
                        int i3 = xVar.f1855c;
                        if (i2 == i3) {
                            break;
                        }
                        i2 = i3;
                    } finally {
                        xVar.f1856d = false;
                    }
                }
            }
            if (this.f1849b) {
                xVar.c(this);
            }
        }
    }

    public w(x xVar, b bVar) {
        this.f1851d = xVar;
        this.f1848a = bVar;
    }
}
