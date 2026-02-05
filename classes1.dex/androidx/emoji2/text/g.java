package androidx.emoji2.text;

import android.graphics.Rect;
import android.view.View;
import j0.C0161x;
import j0.K;

public abstract class g {

    /* renamed from: a  reason: collision with root package name */
    public int f1510a;

    /* renamed from: b  reason: collision with root package name */
    public final Object f1511b;

    /* renamed from: c  reason: collision with root package name */
    public final Object f1512c;

    public g(K k2) {
        this.f1510a = Integer.MIN_VALUE;
        this.f1512c = new Rect();
        this.f1511b = k2;
    }

    public abstract int b(View view);

    public abstract int c(View view);

    public abstract int d(View view);

    public abstract int e(View view);

    public abstract int f();

    public abstract int g();

    public abstract int h();

    public abstract int i();

    public abstract int j();

    public abstract int k();

    public abstract int l();

    public abstract int n(View view);

    public abstract int o(View view);

    public abstract void p(int i);

    public static g a(K k2, int i) {
        if (i == 0) {
            return new C0161x(k2, 0);
        }
        if (i == 1) {
            return new C0161x(k2, 1);
        }
        throw new IllegalArgumentException("invalid orientation");
    }

    public int m() {
        if (Integer.MIN_VALUE == this.f1510a) {
            return 0;
        }
        return l() - this.f1510a;
    }

    public g(i iVar) {
        this.f1510a = 0;
        this.f1512c = new d();
        this.f1511b = iVar;
    }
}
