package n0;

import A.k;
import K0.e;
import T0.g;
import android.animation.TimeInterpolator;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: n0.a  reason: case insensitive filesystem */
public final class C0220a extends C0232m {

    /* renamed from: A  reason: collision with root package name */
    public ArrayList f3961A;

    /* renamed from: B  reason: collision with root package name */
    public boolean f3962B;

    /* renamed from: C  reason: collision with root package name */
    public int f3963C;

    /* renamed from: D  reason: collision with root package name */
    public boolean f3964D;

    /* renamed from: E  reason: collision with root package name */
    public int f3965E;

    public final void l(FrameLayout frameLayout, k kVar, k kVar2, ArrayList arrayList, ArrayList arrayList2) {
        long j2 = this.f3999b;
        int size = this.f3961A.size();
        for (int i = 0; i < size; i++) {
            C0232m mVar = (C0232m) this.f3961A.get(i);
            if (j2 > 0 && (this.f3962B || i == 0)) {
                long j3 = mVar.f3999b;
                if (j3 > 0) {
                    mVar.F(j3 + j2);
                } else {
                    mVar.F(j2);
                }
            }
            mVar.l(frameLayout, kVar, kVar2, arrayList, arrayList2);
        }
    }

    public final void A(long j2) {
        ArrayList arrayList;
        this.f4000c = j2;
        if (j2 >= 0 && (arrayList = this.f3961A) != null) {
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                ((C0232m) this.f3961A.get(i)).A(j2);
            }
        }
    }

    public final void B(g gVar) {
        this.f3965E |= 8;
        int size = this.f3961A.size();
        for (int i = 0; i < size; i++) {
            ((C0232m) this.f3961A.get(i)).B(gVar);
        }
    }

    public final void C(TimeInterpolator timeInterpolator) {
        this.f3965E |= 1;
        ArrayList arrayList = this.f3961A;
        if (arrayList != null) {
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                ((C0232m) this.f3961A.get(i)).C(timeInterpolator);
            }
        }
        this.f4001d = timeInterpolator;
    }

    public final void E() {
        this.f3965E |= 2;
        int size = this.f3961A.size();
        for (int i = 0; i < size; i++) {
            ((C0232m) this.f3961A.get(i)).E();
        }
    }

    public final void F(long j2) {
        this.f3999b = j2;
    }

    public final void I(C0232m mVar) {
        this.f3961A.add(mVar);
        mVar.i = this;
        long j2 = this.f4000c;
        if (j2 >= 0) {
            mVar.A(j2);
        }
        if ((this.f3965E & 1) != 0) {
            mVar.C(this.f4001d);
        }
        if ((this.f3965E & 2) != 0) {
            mVar.E();
        }
        if ((this.f3965E & 4) != 0) {
            mVar.D(this.f4017v);
        }
        if ((this.f3965E & 8) != 0) {
            mVar.B((g) null);
        }
    }

    public final void d(C0240u uVar) {
        if (t(uVar.f4029b)) {
            Iterator it2 = this.f3961A.iterator();
            while (it2.hasNext()) {
                C0232m mVar = (C0232m) it2.next();
                if (mVar.t(uVar.f4029b)) {
                    mVar.d(uVar);
                    uVar.f4030c.add(mVar);
                }
            }
        }
    }

    public final void f(C0240u uVar) {
        int size = this.f3961A.size();
        for (int i = 0; i < size; i++) {
            ((C0232m) this.f3961A.get(i)).f(uVar);
        }
    }

    public final void g(C0240u uVar) {
        if (t(uVar.f4029b)) {
            Iterator it2 = this.f3961A.iterator();
            while (it2.hasNext()) {
                C0232m mVar = (C0232m) it2.next();
                if (mVar.t(uVar.f4029b)) {
                    mVar.g(uVar);
                    uVar.f4030c.add(mVar);
                }
            }
        }
    }

    public final void z() {
        if (this.f3961A.isEmpty()) {
            G();
            m();
            return;
        }
        C0237r rVar = new C0237r();
        rVar.f4026b = this;
        Iterator it2 = this.f3961A.iterator();
        while (it2.hasNext()) {
            ((C0232m) it2.next()).a(rVar);
        }
        this.f3963C = this.f3961A.size();
        if (!this.f3962B) {
            for (int i = 1; i < this.f3961A.size(); i++) {
                ((C0232m) this.f3961A.get(i - 1)).a(new C0237r((C0232m) this.f3961A.get(i)));
            }
            C0232m mVar = (C0232m) this.f3961A.get(0);
            if (mVar != null) {
                mVar.z();
                return;
            }
            return;
        }
        Iterator it3 = this.f3961A.iterator();
        while (it3.hasNext()) {
            ((C0232m) it3.next()).z();
        }
    }

    public final void D(e eVar) {
        super.D(eVar);
        this.f3965E |= 4;
        if (this.f3961A != null) {
            for (int i = 0; i < this.f3961A.size(); i++) {
                ((C0232m) this.f3961A.get(i)).D(eVar);
            }
        }
    }

    public final String H(String str) {
        String H2 = super.H(str);
        for (int i = 0; i < this.f3961A.size(); i++) {
            StringBuilder sb = new StringBuilder();
            sb.append(H2);
            sb.append("\n");
            sb.append(((C0232m) this.f3961A.get(i)).H(str + "  "));
            H2 = sb.toString();
        }
        return H2;
    }

    public final void c() {
        super.c();
        int size = this.f3961A.size();
        for (int i = 0; i < size; i++) {
            ((C0232m) this.f3961A.get(i)).c();
        }
    }

    /* renamed from: j */
    public final C0232m clone() {
        C0220a aVar = (C0220a) super.clone();
        aVar.f3961A = new ArrayList();
        int size = this.f3961A.size();
        for (int i = 0; i < size; i++) {
            C0232m j2 = ((C0232m) this.f3961A.get(i)).clone();
            aVar.f3961A.add(j2);
            j2.i = aVar;
        }
        return aVar;
    }

    public final void w(ViewGroup viewGroup) {
        super.w(viewGroup);
        int size = this.f3961A.size();
        for (int i = 0; i < size; i++) {
            ((C0232m) this.f3961A.get(i)).w(viewGroup);
        }
    }

    public final C0232m x(C0230k kVar) {
        super.x(kVar);
        return this;
    }

    public final void y(FrameLayout frameLayout) {
        super.y(frameLayout);
        int size = this.f3961A.size();
        for (int i = 0; i < size; i++) {
            ((C0232m) this.f3961A.get(i)).y(frameLayout);
        }
    }
}
