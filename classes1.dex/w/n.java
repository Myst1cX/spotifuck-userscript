package w;

import K0.e;
import Q0.E;
import java.io.PrintStream;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import t.C0337c;
import v.C0347d;
import v.C0348e;
import v.j;

public final class n {

    /* renamed from: f  reason: collision with root package name */
    public static int f4888f;

    /* renamed from: a  reason: collision with root package name */
    public ArrayList f4889a;

    /* renamed from: b  reason: collision with root package name */
    public int f4890b;

    /* renamed from: c  reason: collision with root package name */
    public int f4891c;

    /* renamed from: d  reason: collision with root package name */
    public ArrayList f4892d;
    public int e;

    public final void a(ArrayList arrayList) {
        int size = this.f4889a.size();
        if (this.e != -1 && size > 0) {
            for (int i = 0; i < arrayList.size(); i++) {
                n nVar = (n) arrayList.get(i);
                if (this.e == nVar.f4890b) {
                    c(this.f4891c, nVar);
                }
            }
        }
        if (size == 0) {
            arrayList.remove(this);
        }
    }

    public final int b(C0337c cVar, int i) {
        int n2;
        int n3;
        ArrayList arrayList = this.f4889a;
        if (arrayList.size() == 0) {
            return 0;
        }
        C0348e eVar = (C0348e) ((C0347d) arrayList.get(0)).f4726T;
        cVar.t();
        eVar.b(cVar, false);
        for (int i2 = 0; i2 < arrayList.size(); i2++) {
            ((C0347d) arrayList.get(i2)).b(cVar, false);
        }
        if (i == 0 && eVar.f4791z0 > 0) {
            j.a(eVar, cVar, arrayList, 0);
        }
        if (i == 1 && eVar.A0 > 0) {
            j.a(eVar, cVar, arrayList, 1);
        }
        try {
            cVar.p();
        } catch (Exception e2) {
            PrintStream printStream = System.err;
            printStream.println(e2.toString() + "\n" + Arrays.toString(e2.getStackTrace()).replace("[", "   at ").replace(",", "\n   at").replace("]", ""));
        }
        this.f4892d = new ArrayList();
        for (int i3 = 0; i3 < arrayList.size(); i3++) {
            C0347d dVar = (C0347d) arrayList.get(i3);
            e eVar2 = new e(27);
            new WeakReference(dVar);
            C0337c.n(dVar.I);
            C0337c.n(dVar.f4716J);
            C0337c.n(dVar.f4717K);
            C0337c.n(dVar.f4718L);
            C0337c.n(dVar.f4719M);
            this.f4892d.add(eVar2);
        }
        if (i == 0) {
            n2 = C0337c.n(eVar.I);
            n3 = C0337c.n(eVar.f4717K);
            cVar.t();
        } else {
            n2 = C0337c.n(eVar.f4716J);
            n3 = C0337c.n(eVar.f4718L);
            cVar.t();
        }
        return n3 - n2;
    }

    public final void c(int i, n nVar) {
        Iterator it2 = this.f4889a.iterator();
        while (it2.hasNext()) {
            C0347d dVar = (C0347d) it2.next();
            ArrayList arrayList = nVar.f4889a;
            if (!arrayList.contains(dVar)) {
                arrayList.add(dVar);
            }
            int i2 = nVar.f4890b;
            if (i == 0) {
                dVar.f4757n0 = i2;
            } else {
                dVar.f4759o0 = i2;
            }
        }
        this.e = nVar.f4890b;
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder();
        int i = this.f4891c;
        if (i == 0) {
            str = "Horizontal";
        } else if (i == 1) {
            str = "Vertical";
        } else if (i == 2) {
            str = "Both";
        } else {
            str = "Unknown";
        }
        sb.append(str);
        sb.append(" [");
        sb.append(this.f4890b);
        sb.append("] <");
        String sb2 = sb.toString();
        Iterator it2 = this.f4889a.iterator();
        while (it2.hasNext()) {
            sb2 = sb2 + " " + ((C0347d) it2.next()).f4747h0;
        }
        return E.f(sb2, " >");
    }
}
