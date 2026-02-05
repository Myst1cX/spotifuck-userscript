package N;

import android.text.TextUtils;
import android.view.View;

public final class A extends C {
    public final /* synthetic */ int e;

    public A(int i, Class cls, int i2, int i3, int i4) {
        this.e = i4;
        this.f497a = i;
        this.f500d = cls;
        this.f499c = i2;
        this.f498b = i3;
    }

    public final Object b(View view) {
        switch (this.e) {
            case 0:
                return Boolean.valueOf(J.d(view));
            case 1:
                return J.b(view);
            case 2:
                return L.b(view);
            default:
                return Boolean.valueOf(J.c(view));
        }
    }

    public final void c(View view, Object obj) {
        switch (this.e) {
            case 0:
                J.j(view, ((Boolean) obj).booleanValue());
                return;
            case 1:
                J.h(view, (CharSequence) obj);
                return;
            case 2:
                L.e(view, (CharSequence) obj);
                return;
            default:
                J.g(view, ((Boolean) obj).booleanValue());
                return;
        }
    }

    public final boolean e(Object obj, Object obj2) {
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        switch (this.e) {
            case 0:
                Boolean bool = (Boolean) obj;
                Boolean bool2 = (Boolean) obj2;
                boolean z6 = false;
                if (bool == null || !bool.booleanValue()) {
                    z2 = false;
                } else {
                    z2 = true;
                }
                if (bool2 == null || !bool2.booleanValue()) {
                    z3 = false;
                } else {
                    z3 = true;
                }
                if (z2 == z3) {
                    z6 = true;
                }
                return !z6;
            case 1:
                return !TextUtils.equals((CharSequence) obj, (CharSequence) obj2);
            case 2:
                return !TextUtils.equals((CharSequence) obj, (CharSequence) obj2);
            default:
                Boolean bool3 = (Boolean) obj;
                Boolean bool4 = (Boolean) obj2;
                boolean z7 = false;
                if (bool3 == null || !bool3.booleanValue()) {
                    z4 = false;
                } else {
                    z4 = true;
                }
                if (bool4 == null || !bool4.booleanValue()) {
                    z5 = false;
                } else {
                    z5 = true;
                }
                if (z4 == z5) {
                    z7 = true;
                }
                return !z7;
        }
    }
}
