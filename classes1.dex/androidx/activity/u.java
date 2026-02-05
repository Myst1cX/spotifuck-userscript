package androidx.activity;

import R0.h;
import T0.a;
import Y0.l;
import Z0.c;
import Z0.d;
import java.util.ListIterator;

public final class u extends d implements l {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f1201a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ A f1202b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public /* synthetic */ u(A a2, int i) {
        super(1);
        this.f1201a = i;
        this.f1202b = a2;
    }

    public final Object b(Object obj) {
        Object obj2;
        Object obj3;
        switch (this.f1201a) {
            case 0:
                c.e("backEvent", (C0046b) obj);
                A a2 = this.f1202b;
                a aVar = a2.f1135b;
                ListIterator listIterator = aVar.listIterator(aVar.size());
                while (true) {
                    if (listIterator.hasPrevious()) {
                        obj2 = listIterator.previous();
                        if (((h) obj2).f861a) {
                        }
                    } else {
                        obj2 = null;
                    }
                }
                h hVar = (h) obj2;
                if (a2.f1136c != null) {
                    a2.b();
                }
                a2.f1136c = hVar;
                return S0.c.f888c;
            default:
                c.e("backEvent", (C0046b) obj);
                A a3 = this.f1202b;
                if (a3.f1136c == null) {
                    a aVar2 = a3.f1135b;
                    ListIterator listIterator2 = aVar2.listIterator(aVar2.size());
                    while (true) {
                        if (listIterator2.hasPrevious()) {
                            obj3 = listIterator2.previous();
                            if (((h) obj3).f861a) {
                            }
                        } else {
                            obj3 = null;
                        }
                    }
                    h hVar2 = (h) obj3;
                }
                return S0.c.f888c;
        }
    }
}
