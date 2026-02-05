package V;

import A.b;
import N.Q;
import O.k;
import android.os.Bundle;
import android.view.View;
import android.view.accessibility.AccessibilityManager;
import android.view.accessibility.AccessibilityNodeInfo;
import com.google.android.material.chip.Chip;
import java.util.WeakHashMap;
import z0.C0362c;

public final class a extends b {
    public final /* synthetic */ b i;

    public final k u(int i2) {
        int i3;
        b bVar = this.i;
        if (i2 == 2) {
            i3 = bVar.f950k;
        } else {
            i3 = bVar.f951l;
        }
        if (i3 == Integer.MIN_VALUE) {
            return null;
        }
        return t(i3);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public a(b bVar) {
        super(7);
        this.i = bVar;
    }

    public final boolean A(int i2, int i3, Bundle bundle) {
        int i4;
        b bVar = this.i;
        Chip chip = bVar.i;
        if (i2 != -1) {
            boolean z2 = true;
            if (i3 == 1) {
                return bVar.p(i2);
            }
            if (i3 == 2) {
                return bVar.j(i2);
            }
            boolean z3 = false;
            if (i3 == 64) {
                AccessibilityManager accessibilityManager = bVar.f948h;
                if (accessibilityManager.isEnabled() && accessibilityManager.isTouchExplorationEnabled() && (i4 = bVar.f950k) != i2) {
                    if (i4 != Integer.MIN_VALUE) {
                        bVar.f950k = Integer.MIN_VALUE;
                        bVar.i.invalidate();
                        bVar.q(i4, 65536);
                    }
                    bVar.f950k = i2;
                    chip.invalidate();
                    bVar.q(i2, 32768);
                    return z2;
                }
            } else if (i3 != 128) {
                C0362c cVar = (C0362c) bVar;
                if (i3 != 16) {
                    return false;
                }
                Chip chip2 = cVar.f5177q;
                if (i2 == 0) {
                    return chip2.performClick();
                }
                if (i2 != 1) {
                    return false;
                }
                chip2.playSoundEffect(0);
                View.OnClickListener onClickListener = chip2.f2197m;
                if (onClickListener != null) {
                    onClickListener.onClick(chip2);
                    z3 = true;
                }
                if (!chip2.f2208x) {
                    return z3;
                }
                chip2.f2207w.q(1, 1);
                return z3;
            } else if (bVar.f950k == i2) {
                bVar.f950k = Integer.MIN_VALUE;
                chip.invalidate();
                bVar.q(i2, 65536);
                return z2;
            }
            z2 = false;
            return z2;
        }
        WeakHashMap weakHashMap = Q.f509a;
        return chip.performAccessibilityAction(i3, bundle);
    }

    public final k t(int i2) {
        return new k(AccessibilityNodeInfo.obtain(this.i.n(i2).f751a));
    }
}
