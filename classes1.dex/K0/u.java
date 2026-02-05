package K0;

import android.graphics.Matrix;
import android.graphics.Path;
import java.util.ArrayList;

public final class u {

    /* renamed from: a  reason: collision with root package name */
    public float f442a;

    /* renamed from: b  reason: collision with root package name */
    public float f443b;

    /* renamed from: c  reason: collision with root package name */
    public float f444c;

    /* renamed from: d  reason: collision with root package name */
    public float f445d;
    public float e;

    /* renamed from: f  reason: collision with root package name */
    public final ArrayList f446f = new ArrayList();

    /* renamed from: g  reason: collision with root package name */
    public final ArrayList f447g = new ArrayList();

    public final void a(float f2) {
        float f3 = this.f445d;
        if (f3 != f2) {
            float f4 = ((f2 - f3) + 360.0f) % 360.0f;
            if (f4 <= 180.0f) {
                float f5 = this.f443b;
                float f6 = this.f444c;
                q qVar = new q(f5, f6, f5, f6);
                qVar.f435f = this.f445d;
                qVar.f436g = f4;
                this.f447g.add(new o(qVar));
                this.f445d = f2;
            }
        }
    }

    public final void b(Matrix matrix, Path path) {
        ArrayList arrayList = this.f446f;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            ((s) arrayList.get(i)).a(matrix, path);
        }
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [K0.s, java.lang.Object, K0.r] */
    public final void c(float f2, float f3) {
        ? sVar = new s();
        sVar.f437b = f2;
        sVar.f438c = f3;
        this.f446f.add(sVar);
        p pVar = new p(sVar, this.f443b, this.f444c);
        a(pVar.b() + 270.0f);
        this.f447g.add(pVar);
        this.f445d = pVar.b() + 270.0f;
        this.f443b = f2;
        this.f444c = f3;
    }

    public final void d(float f2, float f3, float f4) {
        this.f442a = f2;
        this.f443b = 0.0f;
        this.f444c = f2;
        this.f445d = f3;
        this.e = (f3 + f4) % 360.0f;
        this.f446f.clear();
        this.f447g.clear();
    }

    public u() {
        d(0.0f, 270.0f, 0.0f);
    }
}
