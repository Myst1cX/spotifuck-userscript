package w;

import java.util.ArrayList;
import java.util.Iterator;

public class f implements d {

    /* renamed from: a  reason: collision with root package name */
    public o f4871a = null;

    /* renamed from: b  reason: collision with root package name */
    public boolean f4872b = false;

    /* renamed from: c  reason: collision with root package name */
    public boolean f4873c = false;

    /* renamed from: d  reason: collision with root package name */
    public final o f4874d;
    public int e = 1;

    /* renamed from: f  reason: collision with root package name */
    public int f4875f;

    /* renamed from: g  reason: collision with root package name */
    public int f4876g;

    /* renamed from: h  reason: collision with root package name */
    public int f4877h = 1;
    public g i = null;

    /* renamed from: j  reason: collision with root package name */
    public boolean f4878j = false;

    /* renamed from: k  reason: collision with root package name */
    public final ArrayList f4879k = new ArrayList();

    /* renamed from: l  reason: collision with root package name */
    public final ArrayList f4880l = new ArrayList();

    public final void a(d dVar) {
        ArrayList arrayList = this.f4880l;
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            if (!((f) it2.next()).f4878j) {
                return;
            }
        }
        this.f4873c = true;
        o oVar = this.f4871a;
        if (oVar != null) {
            oVar.a(this);
        }
        if (this.f4872b) {
            this.f4874d.a(this);
            return;
        }
        Iterator it3 = arrayList.iterator();
        f fVar = null;
        int i2 = 0;
        while (it3.hasNext()) {
            f fVar2 = (f) it3.next();
            if (!(fVar2 instanceof g)) {
                i2++;
                fVar = fVar2;
            }
        }
        if (fVar != null && i2 == 1 && fVar.f4878j) {
            g gVar = this.i;
            if (gVar != null) {
                if (gVar.f4878j) {
                    this.f4875f = this.f4877h * gVar.f4876g;
                } else {
                    return;
                }
            }
            d(fVar.f4876g + this.f4875f);
        }
        o oVar2 = this.f4871a;
        if (oVar2 != null) {
            oVar2.a(this);
        }
    }

    public final void b(o oVar) {
        this.f4879k.add(oVar);
        if (this.f4878j) {
            oVar.a(oVar);
        }
    }

    public final void c() {
        this.f4880l.clear();
        this.f4879k.clear();
        this.f4878j = false;
        this.f4876g = 0;
        this.f4873c = false;
        this.f4872b = false;
    }

    public void d(int i2) {
        if (!this.f4878j) {
            this.f4878j = true;
            this.f4876g = i2;
            Iterator it2 = this.f4879k.iterator();
            while (it2.hasNext()) {
                d dVar = (d) it2.next();
                dVar.a(dVar);
            }
        }
    }

    public final String toString() {
        String str;
        Object obj;
        StringBuilder sb = new StringBuilder();
        sb.append(this.f4874d.f4894b.f4747h0);
        sb.append(":");
        switch (this.e) {
            case 1:
                str = "UNKNOWN";
                break;
            case 2:
                str = "HORIZONTAL_DIMENSION";
                break;
            case 3:
                str = "VERTICAL_DIMENSION";
                break;
            case 4:
                str = "LEFT";
                break;
            case 5:
                str = "RIGHT";
                break;
            case 6:
                str = "TOP";
                break;
            case 7:
                str = "BOTTOM";
                break;
            case 8:
                str = "BASELINE";
                break;
            default:
                str = "null";
                break;
        }
        sb.append(str);
        sb.append("(");
        if (this.f4878j) {
            obj = Integer.valueOf(this.f4876g);
        } else {
            obj = "unresolved";
        }
        sb.append(obj);
        sb.append(") <t=");
        sb.append(this.f4880l.size());
        sb.append(":d=");
        sb.append(this.f4879k.size());
        sb.append(">");
        return sb.toString();
    }

    public f(o oVar) {
        this.f4874d = oVar;
    }
}
