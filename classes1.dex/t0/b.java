package T0;

import Z0.c;
import s.C0327a;

public abstract class b extends C0327a {
    public static final void f(Object[] objArr, Object[] objArr2, int i, int i2, int i3) {
        c.e("<this>", objArr);
        c.e("destination", objArr2);
        System.arraycopy(objArr, i2, objArr2, i, i3 - i2);
    }
}
