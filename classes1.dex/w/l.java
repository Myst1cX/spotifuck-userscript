package w;

import java.util.ArrayList;

public final class l {

    /* renamed from: a  reason: collision with root package name */
    public o f4884a;

    /* renamed from: b  reason: collision with root package name */
    public ArrayList f4885b;

    public static long a(f fVar, long j2) {
        o oVar = fVar.f4874d;
        if (oVar instanceof j) {
            return j2;
        }
        ArrayList arrayList = fVar.f4879k;
        int size = arrayList.size();
        long j3 = j2;
        for (int i = 0; i < size; i++) {
            d dVar = (d) arrayList.get(i);
            if (dVar instanceof f) {
                f fVar2 = (f) dVar;
                if (fVar2.f4874d != oVar) {
                    j3 = Math.min(j3, a(fVar2, ((long) fVar2.f4875f) + j2));
                }
            }
        }
        if (fVar != oVar.i) {
            return j3;
        }
        long j4 = oVar.j();
        f fVar3 = oVar.f4899h;
        long j5 = j2 - j4;
        return Math.min(Math.min(j3, a(fVar3, j5)), j5 - ((long) fVar3.f4875f));
    }

    public static long b(f fVar, long j2) {
        o oVar = fVar.f4874d;
        if (oVar instanceof j) {
            return j2;
        }
        ArrayList arrayList = fVar.f4879k;
        int size = arrayList.size();
        long j3 = j2;
        for (int i = 0; i < size; i++) {
            d dVar = (d) arrayList.get(i);
            if (dVar instanceof f) {
                f fVar2 = (f) dVar;
                if (fVar2.f4874d != oVar) {
                    j3 = Math.max(j3, b(fVar2, ((long) fVar2.f4875f) + j2));
                }
            }
        }
        if (fVar != oVar.f4899h) {
            return j3;
        }
        long j4 = oVar.j();
        f fVar3 = oVar.i;
        long j5 = j2 + j4;
        return Math.max(Math.max(j3, b(fVar3, j5)), j5 - ((long) fVar3.f4875f));
    }
}
