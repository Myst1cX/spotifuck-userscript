package E0;

import android.graphics.Typeface;
import com.google.android.material.chip.Chip;
import p0.C0320a;
import z0.C0364e;

public final class i extends C0320a {

    /* renamed from: o  reason: collision with root package name */
    public final /* synthetic */ int f211o;

    /* renamed from: p  reason: collision with root package name */
    public final /* synthetic */ Object f212p;

    public /* synthetic */ i(int i, Object obj) {
        this.f211o = i;
        this.f212p = obj;
    }

    private final void L0(int i) {
    }

    public final void k0(int i) {
        switch (this.f211o) {
            case 0:
                k kVar = (k) this.f212p;
                kVar.f216d = true;
                j jVar = (j) kVar.e.get();
                if (jVar != null) {
                    C0364e eVar = (C0364e) jVar;
                    eVar.u();
                    eVar.invalidateSelf();
                    return;
                }
                return;
            default:
                return;
        }
    }

    public final void l0(Typeface typeface, boolean z2) {
        CharSequence charSequence;
        switch (this.f211o) {
            case 0:
                if (!z2) {
                    k kVar = (k) this.f212p;
                    kVar.f216d = true;
                    j jVar = (j) kVar.e.get();
                    if (jVar != null) {
                        C0364e eVar = (C0364e) jVar;
                        eVar.u();
                        eVar.invalidateSelf();
                        return;
                    }
                    return;
                }
                return;
            default:
                Chip chip = (Chip) this.f212p;
                C0364e eVar2 = chip.f2194j;
                if (eVar2.f5191H0) {
                    charSequence = eVar2.f5193J;
                } else {
                    charSequence = chip.getText();
                }
                chip.setText(charSequence);
                chip.requestLayout();
                chip.invalidate();
                return;
        }
    }
}
