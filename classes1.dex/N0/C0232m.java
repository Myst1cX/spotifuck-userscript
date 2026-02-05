package n0;

import A.k;
import K0.e;
import N.F;
import N.Q;
import N.Y;
import N.d0;
import T0.g;
import android.animation.Animator;
import android.animation.TimeInterpolator;
import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowId;
import android.widget.FrameLayout;
import android.widget.ListView;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.WeakHashMap;
import r.b;
import r.d;

/* renamed from: n0.m  reason: case insensitive filesystem */
public abstract class C0232m implements Cloneable {

    /* renamed from: w  reason: collision with root package name */
    public static final Animator[] f3994w = new Animator[0];

    /* renamed from: x  reason: collision with root package name */
    public static final int[] f3995x = {2, 1, 3, 4};

    /* renamed from: y  reason: collision with root package name */
    public static final e f3996y = new e(24);

    /* renamed from: z  reason: collision with root package name */
    public static final ThreadLocal f3997z = new ThreadLocal();

    /* renamed from: a  reason: collision with root package name */
    public final String f3998a = getClass().getName();

    /* renamed from: b  reason: collision with root package name */
    public long f3999b = -1;

    /* renamed from: c  reason: collision with root package name */
    public long f4000c = -1;

    /* renamed from: d  reason: collision with root package name */
    public TimeInterpolator f4001d = null;
    public final ArrayList e = new ArrayList();

    /* renamed from: f  reason: collision with root package name */
    public final ArrayList f4002f = new ArrayList();

    /* renamed from: g  reason: collision with root package name */
    public k f4003g = new k(7);

    /* renamed from: h  reason: collision with root package name */
    public k f4004h = new k(7);
    public C0220a i = null;

    /* renamed from: j  reason: collision with root package name */
    public final int[] f4005j = f3995x;

    /* renamed from: k  reason: collision with root package name */
    public ArrayList f4006k;

    /* renamed from: l  reason: collision with root package name */
    public ArrayList f4007l;

    /* renamed from: m  reason: collision with root package name */
    public C0230k[] f4008m;

    /* renamed from: n  reason: collision with root package name */
    public final ArrayList f4009n = new ArrayList();

    /* renamed from: o  reason: collision with root package name */
    public Animator[] f4010o = f3994w;

    /* renamed from: p  reason: collision with root package name */
    public int f4011p = 0;

    /* renamed from: q  reason: collision with root package name */
    public boolean f4012q = false;

    /* renamed from: r  reason: collision with root package name */
    public boolean f4013r = false;

    /* renamed from: s  reason: collision with root package name */
    public C0232m f4014s = null;

    /* renamed from: t  reason: collision with root package name */
    public ArrayList f4015t = null;

    /* renamed from: u  reason: collision with root package name */
    public ArrayList f4016u = new ArrayList();

    /* renamed from: v  reason: collision with root package name */
    public e f4017v = f3996y;

    public abstract void d(C0240u uVar);

    public abstract void g(C0240u uVar);

    public Animator k(FrameLayout frameLayout, C0240u uVar, C0240u uVar2) {
        return null;
    }

    public String[] q() {
        return null;
    }

    public boolean s(C0240u uVar, C0240u uVar2) {
        if (uVar == null || uVar2 == null) {
            return false;
        }
        String[] q2 = q();
        if (q2 != null) {
            int length = q2.length;
            int i2 = 0;
            while (i2 < length) {
                if (!u(uVar, uVar2, q2[i2])) {
                    i2++;
                }
            }
            return false;
        }
        for (String u2 : uVar.f4028a.keySet()) {
            if (u(uVar, uVar2, u2)) {
            }
        }
        return false;
        return true;
    }

    public static void b(k kVar, View view, C0240u uVar) {
        ((b) kVar.f21f).put(view, uVar);
        int id = view.getId();
        if (id >= 0) {
            SparseArray sparseArray = (SparseArray) kVar.f22g;
            if (sparseArray.indexOfKey(id) >= 0) {
                sparseArray.put(id, (Object) null);
            } else {
                sparseArray.put(id, view);
            }
        }
        WeakHashMap weakHashMap = Q.f509a;
        String k2 = F.k(view);
        if (k2 != null) {
            b bVar = (b) kVar.i;
            if (bVar.containsKey(k2)) {
                bVar.put(k2, (Object) null);
            } else {
                bVar.put(k2, view);
            }
        }
        if (view.getParent() instanceof ListView) {
            ListView listView = (ListView) view.getParent();
            if (listView.getAdapter().hasStableIds()) {
                long itemIdAtPosition = listView.getItemIdAtPosition(listView.getPositionForView(view));
                r.e eVar = (r.e) kVar.f23h;
                if (eVar.f4526a) {
                    eVar.d();
                }
                if (d.b(eVar.f4527b, eVar.f4529d, itemIdAtPosition) >= 0) {
                    View view2 = (View) eVar.e(itemIdAtPosition, (Long) null);
                    if (view2 != null) {
                        view2.setHasTransientState(false);
                        eVar.f(itemIdAtPosition, (Object) null);
                        return;
                    }
                    return;
                }
                view.setHasTransientState(true);
                eVar.f(itemIdAtPosition, view);
            }
        }
    }

    /* JADX WARNING: type inference failed for: r1v2, types: [r.b, java.lang.Object, r.k] */
    public static b p() {
        ThreadLocal threadLocal = f3997z;
        b bVar = (b) threadLocal.get();
        if (bVar != null) {
            return bVar;
        }
        ? kVar = new r.k();
        threadLocal.set(kVar);
        return kVar;
    }

    public static boolean u(C0240u uVar, C0240u uVar2, String str) {
        Object obj = uVar.f4028a.get(str);
        Object obj2 = uVar2.f4028a.get(str);
        if (obj == null && obj2 == null) {
            return false;
        }
        if (obj == null || obj2 == null) {
            return true;
        }
        return !obj.equals(obj2);
    }

    public void A(long j2) {
        this.f4000c = j2;
    }

    public void B(g gVar) {
    }

    public void C(TimeInterpolator timeInterpolator) {
        this.f4001d = timeInterpolator;
    }

    public void D(e eVar) {
        if (eVar == null) {
            this.f4017v = f3996y;
        } else {
            this.f4017v = eVar;
        }
    }

    public void E() {
    }

    public void F(long j2) {
        this.f3999b = j2;
    }

    public final void G() {
        if (this.f4011p == 0) {
            v(this, C0231l.f3990a);
            this.f4013r = false;
        }
        this.f4011p++;
    }

    public String H(String str) {
        StringBuilder sb = new StringBuilder(str);
        sb.append(getClass().getSimpleName());
        sb.append("@");
        sb.append(Integer.toHexString(hashCode()));
        sb.append(": ");
        if (this.f4000c != -1) {
            sb.append("dur(");
            sb.append(this.f4000c);
            sb.append(") ");
        }
        if (this.f3999b != -1) {
            sb.append("dly(");
            sb.append(this.f3999b);
            sb.append(") ");
        }
        if (this.f4001d != null) {
            sb.append("interp(");
            sb.append(this.f4001d);
            sb.append(") ");
        }
        ArrayList arrayList = this.e;
        int size = arrayList.size();
        ArrayList arrayList2 = this.f4002f;
        if (size > 0 || arrayList2.size() > 0) {
            sb.append("tgts(");
            if (arrayList.size() > 0) {
                for (int i2 = 0; i2 < arrayList.size(); i2++) {
                    if (i2 > 0) {
                        sb.append(", ");
                    }
                    sb.append(arrayList.get(i2));
                }
            }
            if (arrayList2.size() > 0) {
                for (int i3 = 0; i3 < arrayList2.size(); i3++) {
                    if (i3 > 0) {
                        sb.append(", ");
                    }
                    sb.append(arrayList2.get(i3));
                }
            }
            sb.append(")");
        }
        return sb.toString();
    }

    public void a(C0230k kVar) {
        if (this.f4015t == null) {
            this.f4015t = new ArrayList();
        }
        this.f4015t.add(kVar);
    }

    public void c() {
        ArrayList arrayList = this.f4009n;
        int size = arrayList.size();
        Animator[] animatorArr = (Animator[]) arrayList.toArray(this.f4010o);
        this.f4010o = f3994w;
        for (int i2 = size - 1; i2 >= 0; i2--) {
            Animator animator = animatorArr[i2];
            animatorArr[i2] = null;
            animator.cancel();
        }
        this.f4010o = animatorArr;
        v(this, C0231l.f3992c);
    }

    public final void e(View view, boolean z2) {
        if (view != null) {
            view.getId();
            if (view.getParent() instanceof ViewGroup) {
                C0240u uVar = new C0240u(view);
                if (z2) {
                    g(uVar);
                } else {
                    d(uVar);
                }
                uVar.f4030c.add(this);
                f(uVar);
                if (z2) {
                    b(this.f4003g, view, uVar);
                } else {
                    b(this.f4004h, view, uVar);
                }
            }
            if (view instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) view;
                for (int i2 = 0; i2 < viewGroup.getChildCount(); i2++) {
                    e(viewGroup.getChildAt(i2), z2);
                }
            }
        }
    }

    public void f(C0240u uVar) {
    }

    public final void i(boolean z2) {
        if (z2) {
            ((b) this.f4003g.f21f).clear();
            ((SparseArray) this.f4003g.f22g).clear();
            ((r.e) this.f4003g.f23h).b();
            return;
        }
        ((b) this.f4004h.f21f).clear();
        ((SparseArray) this.f4004h.f22g).clear();
        ((r.e) this.f4004h.f23h).b();
    }

    /* JADX WARNING: type inference failed for: r3v11, types: [java.lang.Object, n0.j] */
    public void l(FrameLayout frameLayout, k kVar, k kVar2, ArrayList arrayList, ArrayList arrayList2) {
        int i2;
        View view;
        C0240u uVar;
        C0240u uVar2;
        Animator animator;
        b p2 = p();
        SparseIntArray sparseIntArray = new SparseIntArray();
        int size = arrayList.size();
        o().getClass();
        int i3 = 0;
        while (i3 < size) {
            C0240u uVar3 = (C0240u) arrayList.get(i3);
            C0240u uVar4 = (C0240u) arrayList2.get(i3);
            if (uVar3 != null && !uVar3.f4030c.contains(this)) {
                uVar3 = null;
            }
            if (uVar4 != null && !uVar4.f4030c.contains(this)) {
                uVar4 = null;
            }
            if (!(uVar3 == null && uVar4 == null) && (uVar3 == null || uVar4 == null || s(uVar3, uVar4))) {
                Animator k2 = k(frameLayout, uVar3, uVar4);
                if (k2 != null) {
                    String str = this.f3998a;
                    if (uVar4 != null) {
                        String[] q2 = q();
                        view = uVar4.f4029b;
                        if (q2 != null && q2.length > 0) {
                            uVar2 = new C0240u(view);
                            C0240u uVar5 = (C0240u) ((b) kVar2.f21f).getOrDefault(view, (Object) null);
                            i2 = size;
                            if (uVar5 != null) {
                                int i4 = 0;
                                while (i4 < q2.length) {
                                    HashMap hashMap = uVar2.f4028a;
                                    String str2 = q2[i4];
                                    hashMap.put(str2, uVar5.f4028a.get(str2));
                                    i4++;
                                    ArrayList arrayList3 = arrayList;
                                    q2 = q2;
                                }
                            }
                            int i5 = p2.f4550c;
                            int i6 = 0;
                            while (true) {
                                if (i6 >= i5) {
                                    animator = k2;
                                    break;
                                }
                                C0229j jVar = (C0229j) p2.getOrDefault((Animator) p2.h(i6), (Object) null);
                                if (jVar.f3987c != null && jVar.f3985a == view && jVar.f3986b.equals(str) && jVar.f3987c.equals(uVar2)) {
                                    animator = null;
                                    break;
                                }
                                i6++;
                            }
                        } else {
                            k kVar3 = kVar2;
                            i2 = size;
                            animator = k2;
                            uVar2 = null;
                        }
                        k2 = animator;
                        uVar = uVar2;
                    } else {
                        k kVar4 = kVar2;
                        i2 = size;
                        view = uVar3.f4029b;
                        uVar = null;
                    }
                    if (k2 != null) {
                        WindowId windowId = frameLayout.getWindowId();
                        ? obj = new Object();
                        obj.f3985a = view;
                        obj.f3986b = str;
                        obj.f3987c = uVar;
                        obj.f3988d = windowId;
                        obj.e = this;
                        obj.f3989f = k2;
                        p2.put(k2, obj);
                        this.f4016u.add(k2);
                    }
                    i3++;
                    size = i2;
                }
            } else {
                FrameLayout frameLayout2 = frameLayout;
            }
            k kVar5 = kVar2;
            i2 = size;
            i3++;
            size = i2;
        }
        if (sparseIntArray.size() != 0) {
            for (int i7 = 0; i7 < sparseIntArray.size(); i7++) {
                C0229j jVar2 = (C0229j) p2.getOrDefault((Animator) this.f4016u.get(sparseIntArray.keyAt(i7)), (Object) null);
                jVar2.f3989f.setStartDelay(jVar2.f3989f.getStartDelay() + (((long) sparseIntArray.valueAt(i7)) - Long.MAX_VALUE));
            }
        }
    }

    public final void m() {
        int i2 = this.f4011p - 1;
        this.f4011p = i2;
        if (i2 == 0) {
            v(this, C0231l.f3991b);
            for (int i3 = 0; i3 < ((r.e) this.f4003g.f23h).g(); i3++) {
                View view = (View) ((r.e) this.f4003g.f23h).h(i3);
                if (view != null) {
                    view.setHasTransientState(false);
                }
            }
            for (int i4 = 0; i4 < ((r.e) this.f4004h.f23h).g(); i4++) {
                View view2 = (View) ((r.e) this.f4004h.f23h).h(i4);
                if (view2 != null) {
                    view2.setHasTransientState(false);
                }
            }
            this.f4013r = true;
        }
    }

    public final C0240u n(View view, boolean z2) {
        ArrayList arrayList;
        ArrayList arrayList2;
        C0220a aVar = this.i;
        if (aVar != null) {
            return aVar.n(view, z2);
        }
        if (z2) {
            arrayList = this.f4006k;
        } else {
            arrayList = this.f4007l;
        }
        if (arrayList == null) {
            return null;
        }
        int size = arrayList.size();
        int i2 = 0;
        while (true) {
            if (i2 >= size) {
                i2 = -1;
                break;
            }
            C0240u uVar = (C0240u) arrayList.get(i2);
            if (uVar == null) {
                return null;
            }
            if (uVar.f4029b == view) {
                break;
            }
            i2++;
        }
        if (i2 < 0) {
            return null;
        }
        if (z2) {
            arrayList2 = this.f4007l;
        } else {
            arrayList2 = this.f4006k;
        }
        return (C0240u) arrayList2.get(i2);
    }

    public final C0232m o() {
        C0220a aVar = this.i;
        if (aVar != null) {
            return aVar.o();
        }
        return this;
    }

    public final C0240u r(View view, boolean z2) {
        k kVar;
        C0220a aVar = this.i;
        if (aVar != null) {
            return aVar.r(view, z2);
        }
        if (z2) {
            kVar = this.f4003g;
        } else {
            kVar = this.f4004h;
        }
        return (C0240u) ((b) kVar.f21f).getOrDefault(view, (Object) null);
    }

    public final String toString() {
        return H("");
    }

    public final void v(C0232m mVar, C0231l lVar) {
        C0232m mVar2 = this.f4014s;
        if (mVar2 != null) {
            mVar2.v(mVar, lVar);
        }
        ArrayList arrayList = this.f4015t;
        if (arrayList != null && !arrayList.isEmpty()) {
            int size = this.f4015t.size();
            C0230k[] kVarArr = this.f4008m;
            if (kVarArr == null) {
                kVarArr = new C0230k[size];
            }
            this.f4008m = null;
            C0230k[] kVarArr2 = (C0230k[]) this.f4015t.toArray(kVarArr);
            for (int i2 = 0; i2 < size; i2++) {
                lVar.a(kVarArr2[i2], mVar);
                kVarArr2[i2] = null;
            }
            this.f4008m = kVarArr2;
        }
    }

    public void w(ViewGroup viewGroup) {
        if (!this.f4013r) {
            ArrayList arrayList = this.f4009n;
            int size = arrayList.size();
            Animator[] animatorArr = (Animator[]) arrayList.toArray(this.f4010o);
            this.f4010o = f3994w;
            for (int i2 = size - 1; i2 >= 0; i2--) {
                Animator animator = animatorArr[i2];
                animatorArr[i2] = null;
                animator.pause();
            }
            this.f4010o = animatorArr;
            v(this, C0231l.f3993d);
            this.f4012q = true;
        }
    }

    public C0232m x(C0230k kVar) {
        C0232m mVar;
        ArrayList arrayList = this.f4015t;
        if (arrayList == null) {
            return this;
        }
        if (!arrayList.remove(kVar) && (mVar = this.f4014s) != null) {
            mVar.x(kVar);
        }
        if (this.f4015t.size() == 0) {
            this.f4015t = null;
        }
        return this;
    }

    public void y(FrameLayout frameLayout) {
        if (this.f4012q) {
            if (!this.f4013r) {
                ArrayList arrayList = this.f4009n;
                int size = arrayList.size();
                Animator[] animatorArr = (Animator[]) arrayList.toArray(this.f4010o);
                this.f4010o = f3994w;
                for (int i2 = size - 1; i2 >= 0; i2--) {
                    Animator animator = animatorArr[i2];
                    animatorArr[i2] = null;
                    animator.resume();
                }
                this.f4010o = animatorArr;
                v(this, C0231l.e);
            }
            this.f4012q = false;
        }
    }

    public final void h(FrameLayout frameLayout, boolean z2) {
        i(z2);
        ArrayList arrayList = this.e;
        int size = arrayList.size();
        ArrayList arrayList2 = this.f4002f;
        if (size > 0 || arrayList2.size() > 0) {
            for (int i2 = 0; i2 < arrayList.size(); i2++) {
                View findViewById = frameLayout.findViewById(((Integer) arrayList.get(i2)).intValue());
                if (findViewById != null) {
                    C0240u uVar = new C0240u(findViewById);
                    if (z2) {
                        g(uVar);
                    } else {
                        d(uVar);
                    }
                    uVar.f4030c.add(this);
                    f(uVar);
                    if (z2) {
                        b(this.f4003g, findViewById, uVar);
                    } else {
                        b(this.f4004h, findViewById, uVar);
                    }
                }
            }
            for (int i3 = 0; i3 < arrayList2.size(); i3++) {
                View view = (View) arrayList2.get(i3);
                C0240u uVar2 = new C0240u(view);
                if (z2) {
                    g(uVar2);
                } else {
                    d(uVar2);
                }
                uVar2.f4030c.add(this);
                f(uVar2);
                if (z2) {
                    b(this.f4003g, view, uVar2);
                } else {
                    b(this.f4004h, view, uVar2);
                }
            }
            return;
        }
        e(frameLayout, z2);
    }

    /* renamed from: j */
    public C0232m clone() {
        try {
            C0232m mVar = (C0232m) super.clone();
            mVar.f4016u = new ArrayList();
            mVar.f4003g = new k(7);
            mVar.f4004h = new k(7);
            mVar.f4006k = null;
            mVar.f4007l = null;
            mVar.f4014s = this;
            mVar.f4015t = null;
            return mVar;
        } catch (CloneNotSupportedException e2) {
            throw new RuntimeException(e2);
        }
    }

    public final boolean t(View view) {
        int id = view.getId();
        ArrayList arrayList = this.e;
        int size = arrayList.size();
        ArrayList arrayList2 = this.f4002f;
        if ((size != 0 || arrayList2.size() != 0) && !arrayList.contains(Integer.valueOf(id)) && !arrayList2.contains(view)) {
            return false;
        }
        return true;
    }

    public void z() {
        G();
        b p2 = p();
        Iterator it2 = this.f4016u.iterator();
        while (it2.hasNext()) {
            Animator animator = (Animator) it2.next();
            if (p2.containsKey(animator)) {
                G();
                if (animator != null) {
                    animator.addListener(new d0(this, p2));
                    long j2 = this.f4000c;
                    if (j2 >= 0) {
                        animator.setDuration(j2);
                    }
                    long j3 = this.f3999b;
                    if (j3 >= 0) {
                        animator.setStartDelay(animator.getStartDelay() + j3);
                    }
                    TimeInterpolator timeInterpolator = this.f4001d;
                    if (timeInterpolator != null) {
                        animator.setInterpolator(timeInterpolator);
                    }
                    animator.addListener(new Y(2, (Object) this));
                    animator.start();
                }
            }
        }
        this.f4016u.clear();
        m();
    }
}
