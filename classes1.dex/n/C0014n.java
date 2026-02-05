package N;

import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;

/* renamed from: N.n  reason: case insensitive filesystem */
public final class C0014n {

    /* renamed from: a  reason: collision with root package name */
    public ViewParent f570a;

    /* renamed from: b  reason: collision with root package name */
    public ViewParent f571b;

    /* renamed from: c  reason: collision with root package name */
    public final ViewGroup f572c;

    /* renamed from: d  reason: collision with root package name */
    public boolean f573d;
    public int[] e;

    public final boolean c(int i, int i2, int[] iArr, int[] iArr2, int i3) {
        ViewParent e2;
        int i4;
        int i5;
        int[] iArr3;
        int i6 = i;
        int i7 = i2;
        int[] iArr4 = iArr2;
        int i8 = i3;
        if (!this.f573d || (e2 = e(i8)) == null) {
            return false;
        }
        if (i6 != 0 || i7 != 0) {
            ViewGroup viewGroup = this.f572c;
            if (iArr4 != null) {
                viewGroup.getLocationInWindow(iArr4);
                i5 = iArr4[0];
                i4 = iArr4[1];
            } else {
                i5 = 0;
                i4 = 0;
            }
            if (iArr == null) {
                if (this.e == null) {
                    this.e = new int[2];
                }
                iArr3 = this.e;
            } else {
                iArr3 = iArr;
            }
            iArr3[0] = 0;
            iArr3[1] = 0;
            if (e2 instanceof C0015o) {
                ((C0015o) e2).e(viewGroup, i, i2, iArr3, i3);
            } else if (i8 == 0) {
                try {
                    W.c(e2, viewGroup, i6, i7, iArr3);
                } catch (AbstractMethodError e3) {
                    AbstractMethodError abstractMethodError = e3;
                    Log.e("ViewParentCompat", "ViewParent " + e2 + " does not implement interface method onNestedPreScroll", abstractMethodError);
                }
            }
            if (iArr4 != null) {
                viewGroup.getLocationInWindow(iArr4);
                iArr4[0] = iArr4[0] - i5;
                iArr4[1] = iArr4[1] - i4;
            }
            if (iArr3[0] == 0 && iArr3[1] == 0) {
                return false;
            }
            return true;
        } else if (iArr4 == null) {
            return false;
        } else {
            iArr4[0] = 0;
            iArr4[1] = 0;
            return false;
        }
    }

    public final boolean a(float f2, float f3, boolean z2) {
        ViewParent e2;
        if (!this.f573d || (e2 = e(0)) == null) {
            return false;
        }
        try {
            return W.a(e2, this.f572c, f2, f3, z2);
        } catch (AbstractMethodError e3) {
            Log.e("ViewParentCompat", "ViewParent " + e2 + " does not implement interface method onNestedFling", e3);
            return false;
        }
    }

    public final boolean b(float f2, float f3) {
        ViewParent e2;
        if (!this.f573d || (e2 = e(0)) == null) {
            return false;
        }
        try {
            return W.b(e2, this.f572c, f2, f3);
        } catch (AbstractMethodError e3) {
            Log.e("ViewParentCompat", "ViewParent " + e2 + " does not implement interface method onNestedPreFling", e3);
            return false;
        }
    }

    public final boolean d(int i, int i2, int i3, int i4, int[] iArr, int i5, int[] iArr2) {
        ViewParent e2;
        int i6;
        int i7;
        int[] iArr3;
        int[] iArr4 = iArr;
        int i8 = i5;
        if (!this.f573d || (e2 = e(i8)) == null) {
            return false;
        }
        if (i == 0 && i2 == 0 && i3 == 0 && i4 == 0) {
            if (iArr4 != null) {
                iArr4[0] = 0;
                iArr4[1] = 0;
            }
            return false;
        }
        ViewGroup viewGroup = this.f572c;
        if (iArr4 != null) {
            viewGroup.getLocationInWindow(iArr4);
            i7 = iArr4[0];
            i6 = iArr4[1];
        } else {
            i7 = 0;
            i6 = 0;
        }
        if (iArr2 == null) {
            if (this.e == null) {
                this.e = new int[2];
            }
            int[] iArr5 = this.e;
            iArr5[0] = 0;
            iArr5[1] = 0;
            iArr3 = iArr5;
        } else {
            iArr3 = iArr2;
        }
        if (e2 instanceof C0016p) {
            ((C0016p) e2).b(viewGroup, i, i2, i3, i4, i5, iArr3);
        } else {
            iArr3[0] = iArr3[0] + i3;
            iArr3[1] = iArr3[1] + i4;
            if (e2 instanceof C0015o) {
                ((C0015o) e2).c(viewGroup, i, i2, i3, i4, i5);
            } else if (i8 == 0) {
                try {
                    W.d(e2, viewGroup, i, i2, i3, i4);
                } catch (AbstractMethodError e3) {
                    AbstractMethodError abstractMethodError = e3;
                    Log.e("ViewParentCompat", "ViewParent " + e2 + " does not implement interface method onNestedScroll", abstractMethodError);
                }
            }
        }
        if (iArr4 != null) {
            viewGroup.getLocationInWindow(iArr4);
            iArr4[0] = iArr4[0] - i7;
            iArr4[1] = iArr4[1] - i6;
        }
        return true;
    }

    public final ViewParent e(int i) {
        if (i == 0) {
            return this.f570a;
        }
        if (i != 1) {
            return null;
        }
        return this.f571b;
    }

    public C0014n(ViewGroup viewGroup) {
        this.f572c = viewGroup;
    }

    public final boolean f(int i) {
        if (e(i) != null) {
            return true;
        }
        return false;
    }

    public final boolean g(int i, int i2) {
        boolean z2;
        if (f(i2)) {
            return true;
        }
        if (this.f573d) {
            View view = this.f572c;
            View view2 = view;
            for (ViewParent parent = view.getParent(); parent != null; parent = parent.getParent()) {
                boolean z3 = parent instanceof C0015o;
                if (z3) {
                    z2 = ((C0015o) parent).f(view2, view, i, i2);
                } else {
                    if (i2 == 0) {
                        try {
                            z2 = W.f(parent, view2, view, i);
                        } catch (AbstractMethodError e2) {
                            Log.e("ViewParentCompat", "ViewParent " + parent + " does not implement interface method onStartNestedScroll", e2);
                        }
                    }
                    z2 = false;
                }
                if (z2) {
                    if (i2 == 0) {
                        this.f570a = parent;
                    } else if (i2 == 1) {
                        this.f571b = parent;
                    }
                    if (z3) {
                        ((C0015o) parent).a(view2, view, i, i2);
                    } else if (i2 == 0) {
                        try {
                            W.e(parent, view2, view, i);
                        } catch (AbstractMethodError e3) {
                            Log.e("ViewParentCompat", "ViewParent " + parent + " does not implement interface method onNestedScrollAccepted", e3);
                        }
                    }
                    return true;
                }
                if (parent instanceof View) {
                    view2 = (View) parent;
                }
            }
        }
        return false;
    }

    public final void h(int i) {
        ViewParent e2 = e(i);
        if (e2 != null) {
            boolean z2 = e2 instanceof C0015o;
            ViewGroup viewGroup = this.f572c;
            if (z2) {
                ((C0015o) e2).d(viewGroup, i);
            } else if (i == 0) {
                try {
                    W.g(e2, viewGroup);
                } catch (AbstractMethodError e3) {
                    Log.e("ViewParentCompat", "ViewParent " + e2 + " does not implement interface method onStopNestedScroll", e3);
                }
            }
            if (i == 0) {
                this.f570a = null;
            } else if (i == 1) {
                this.f571b = null;
            }
        }
    }
}
