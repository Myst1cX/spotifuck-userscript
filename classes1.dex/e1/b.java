package e1;

import Z0.c;
import a1.a;
import d.C0090c;
import java.util.Iterator;
import java.util.NoSuchElementException;

public final class b implements Iterator, a {

    /* renamed from: a  reason: collision with root package name */
    public Object f2509a;

    /* renamed from: b  reason: collision with root package name */
    public int f2510b = -2;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ c f2511c;

    public final void a() {
        Object obj;
        int i = this.f2510b;
        c cVar = this.f2511c;
        if (i == -2) {
            cVar.getClass();
            obj = C0090c.f2454a.a();
        } else {
            e eVar = cVar.f2512a;
            Object obj2 = this.f2509a;
            c.b(obj2);
            eVar.getClass();
            c.e("it", obj2);
            obj = C0090c.f2454a.a();
        }
        this.f2509a = obj;
        this.f2510b = 1;
    }

    public final boolean hasNext() {
        if (this.f2510b < 0) {
            a();
        }
        if (this.f2510b == 1) {
            return true;
        }
        return false;
    }

    public final Object next() {
        if (this.f2510b < 0) {
            a();
        }
        if (this.f2510b != 0) {
            Object obj = this.f2509a;
            c.c("null cannot be cast to non-null type T of kotlin.sequences.GeneratorSequence", obj);
            this.f2510b = -1;
            return obj;
        }
        throw new NoSuchElementException();
    }

    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public b(c cVar) {
        this.f2511c = cVar;
    }
}
