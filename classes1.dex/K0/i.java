package K0;

import p0.C0320a;

public final class i extends C0320a {
    public final void M(u uVar, float f2, float f3) {
        uVar.d(f3 * f2, 180.0f, 90.0f);
        float f4 = f3 * 2.0f * f2;
        q qVar = new q(0.0f, 0.0f, f4, f4);
        qVar.f435f = 180.0f;
        qVar.f436g = 90.0f;
        uVar.f446f.add(qVar);
        o oVar = new o(qVar);
        uVar.a(180.0f);
        uVar.f447g.add(oVar);
        uVar.f445d = 270.0f;
        float f5 = (0.0f + f4) * 0.5f;
        float f6 = (f4 - 0.0f) / 2.0f;
        double d2 = (double) 270.0f;
        uVar.f443b = (((float) Math.cos(Math.toRadians(d2))) * f6) + f5;
        uVar.f444c = (f6 * ((float) Math.sin(Math.toRadians(d2)))) + f5;
    }
}
