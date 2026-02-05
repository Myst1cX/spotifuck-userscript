package r;

import java.util.Iterator;
import java.util.Map;
import java.util.NoSuchElementException;

public final class i implements Iterator, Map.Entry {

    /* renamed from: a  reason: collision with root package name */
    public int f4540a;

    /* renamed from: b  reason: collision with root package name */
    public int f4541b;

    /* renamed from: c  reason: collision with root package name */
    public boolean f4542c = false;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ C0323a f4543d;

    public final boolean equals(Object obj) {
        if (!this.f4542c) {
            throw new IllegalStateException("This container does not support retaining Map.Entry objects");
        } else if (!(obj instanceof Map.Entry)) {
            return false;
        } else {
            Map.Entry entry = (Map.Entry) obj;
            Object key = entry.getKey();
            int i = this.f4541b;
            C0323a aVar = this.f4543d;
            Object b2 = aVar.b(i, 0);
            if (key != b2 && (key == null || !key.equals(b2))) {
                return false;
            }
            Object value = entry.getValue();
            Object b3 = aVar.b(this.f4541b, 1);
            if (value == b3 || (value != null && value.equals(b3))) {
                return true;
            }
            return false;
        }
    }

    public final Object getKey() {
        if (this.f4542c) {
            return this.f4543d.b(this.f4541b, 0);
        }
        throw new IllegalStateException("This container does not support retaining Map.Entry objects");
    }

    public final Object getValue() {
        if (this.f4542c) {
            return this.f4543d.b(this.f4541b, 1);
        }
        throw new IllegalStateException("This container does not support retaining Map.Entry objects");
    }

    public final boolean hasNext() {
        if (this.f4541b < this.f4540a) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i;
        if (this.f4542c) {
            int i2 = this.f4541b;
            C0323a aVar = this.f4543d;
            int i3 = 0;
            Object b2 = aVar.b(i2, 0);
            Object b3 = aVar.b(this.f4541b, 1);
            if (b2 == null) {
                i = 0;
            } else {
                i = b2.hashCode();
            }
            if (b3 != null) {
                i3 = b3.hashCode();
            }
            return i ^ i3;
        }
        throw new IllegalStateException("This container does not support retaining Map.Entry objects");
    }

    public final void remove() {
        if (this.f4542c) {
            this.f4543d.g(this.f4541b);
            this.f4541b--;
            this.f4540a--;
            this.f4542c = false;
            return;
        }
        throw new IllegalStateException();
    }

    public final Object setValue(Object obj) {
        if (this.f4542c) {
            C0323a aVar = this.f4543d;
            int i = this.f4541b;
            switch (aVar.f4514d) {
                case 0:
                    int i2 = (i << 1) + 1;
                    Object[] objArr = ((b) aVar.e).f4549b;
                    Object obj2 = objArr[i2];
                    objArr[i2] = obj;
                    return obj2;
                default:
                    throw new UnsupportedOperationException("not a map");
            }
        } else {
            throw new IllegalStateException("This container does not support retaining Map.Entry objects");
        }
    }

    public final String toString() {
        return getKey() + "=" + getValue();
    }

    public i(C0323a aVar) {
        this.f4543d = aVar;
        this.f4540a = aVar.d() - 1;
        this.f4541b = -1;
    }

    public final Object next() {
        if (hasNext()) {
            this.f4541b++;
            this.f4542c = true;
            return this;
        }
        throw new NoSuchElementException();
    }
}
