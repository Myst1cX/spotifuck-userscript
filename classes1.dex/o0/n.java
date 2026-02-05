package o0;

import F.f;
import p0.C0320a;

public abstract class n extends m {

    /* renamed from: a  reason: collision with root package name */
    public f[] f4383a = null;

    /* renamed from: b  reason: collision with root package name */
    public String f4384b;

    /* renamed from: c  reason: collision with root package name */
    public int f4385c = 0;

    public n() {
    }

    public f[] getPathData() {
        return this.f4383a;
    }

    public String getPathName() {
        return this.f4384b;
    }

    public void setPathData(f[] fVarArr) {
        if (!C0320a.g(this.f4383a, fVarArr)) {
            this.f4383a = C0320a.A(fVarArr);
            return;
        }
        f[] fVarArr2 = this.f4383a;
        for (int i = 0; i < fVarArr.length; i++) {
            fVarArr2[i].f230a = fVarArr[i].f230a;
            int i2 = 0;
            while (true) {
                float[] fArr = fVarArr[i].f231b;
                if (i2 >= fArr.length) {
                    break;
                }
                fVarArr2[i].f231b[i2] = fArr[i2];
                i2++;
            }
        }
    }

    public n(n nVar) {
        this.f4384b = nVar.f4384b;
        this.f4383a = C0320a.A(nVar.f4383a);
    }
}
