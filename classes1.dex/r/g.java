package r;

import java.util.Iterator;
import java.util.NoSuchElementException;

public final class g implements Iterator {

    /* renamed from: a  reason: collision with root package name */
    public final int f4534a;

    /* renamed from: b  reason: collision with root package name */
    public int f4535b;

    /* renamed from: c  reason: collision with root package name */
    public int f4536c;

    /* renamed from: d  reason: collision with root package name */
    public boolean f4537d = false;
    public final /* synthetic */ C0323a e;

    public final boolean hasNext() {
        if (this.f4536c < this.f4535b) {
            return true;
        }
        return false;
    }

    public final void remove() {
        if (this.f4537d) {
            int i = this.f4536c - 1;
            this.f4536c = i;
            this.f4535b--;
            this.f4537d = false;
            this.e.g(i);
            return;
        }
        throw new IllegalStateException();
    }

    public g(C0323a aVar, int i) {
        this.e = aVar;
        this.f4534a = i;
        this.f4535b = aVar.d();
    }

    public final Object next() {
        if (hasNext()) {
            Object b2 = this.e.b(this.f4536c, this.f4534a);
            this.f4536c++;
            this.f4537d = true;
            return b2;
        }
        throw new NoSuchElementException();
    }
}
