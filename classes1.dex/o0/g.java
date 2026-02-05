package o0;

import F.f;
import android.animation.TypeEvaluator;
import p0.C0320a;

public final class g implements TypeEvaluator {

    /* renamed from: a  reason: collision with root package name */
    public f[] f4362a;

    public final Object evaluate(float f2, Object obj, Object obj2) {
        f[] fVarArr = (f[]) obj;
        f[] fVarArr2 = (f[]) obj2;
        if (C0320a.g(fVarArr, fVarArr2)) {
            if (!C0320a.g(this.f4362a, fVarArr)) {
                this.f4362a = C0320a.A(fVarArr);
            }
            for (int i = 0; i < fVarArr.length; i++) {
                f fVar = this.f4362a[i];
                f fVar2 = fVarArr[i];
                f fVar3 = fVarArr2[i];
                fVar.getClass();
                fVar.f230a = fVar2.f230a;
                int i2 = 0;
                while (true) {
                    float[] fArr = fVar2.f231b;
                    if (i2 >= fArr.length) {
                        break;
                    }
                    fVar.f231b[i2] = (fVar3.f231b[i2] * f2) + ((1.0f - f2) * fArr[i2]);
                    i2++;
                }
            }
            return this.f4362a;
        }
        throw new IllegalArgumentException("Can't interpolate between two incompatible pathData");
    }
}
