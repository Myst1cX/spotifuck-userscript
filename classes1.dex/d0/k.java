package d0;

import java.util.ArrayList;

public abstract class k {

    /* renamed from: a  reason: collision with root package name */
    public final Object f2472a;

    /* renamed from: b  reason: collision with root package name */
    public boolean f2473b;

    /* renamed from: c  reason: collision with root package name */
    public boolean f2474c;

    /* renamed from: d  reason: collision with root package name */
    public int f2475d;

    public abstract void c(ArrayList arrayList);

    public void a() {
        boolean z2 = this.f2473b;
        Object obj = this.f2472a;
        if (z2) {
            throw new IllegalStateException("detach() called when detach() had already been called for: " + obj);
        } else if (!this.f2474c) {
            this.f2473b = true;
        } else {
            throw new IllegalStateException("detach() called when sendResult() had already been called for: " + obj);
        }
    }

    public final boolean b() {
        if (this.f2473b || this.f2474c) {
            return true;
        }
        return false;
    }

    public final void d(ArrayList arrayList) {
        if (!this.f2474c) {
            this.f2474c = true;
            c(arrayList);
            return;
        }
        throw new IllegalStateException("sendResult() called when either sendResult() or sendError() had already been called for: " + this.f2472a);
    }

    public k(Object obj) {
        this.f2472a = obj;
    }
}
