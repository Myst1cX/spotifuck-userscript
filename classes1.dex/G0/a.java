package G0;

import T.b;
import android.content.res.ColorStateList;
import o.C0249D;
import p0.C0320a;

public final class a extends C0249D {

    /* renamed from: l  reason: collision with root package name */
    public static final int[][] f261l = {new int[]{16842910, 16842912}, new int[]{16842910, -16842912}, new int[]{-16842910, 16842912}, new int[]{-16842910, -16842912}};

    /* renamed from: j  reason: collision with root package name */
    public ColorStateList f262j;

    /* renamed from: k  reason: collision with root package name */
    public boolean f263k;

    private ColorStateList getMaterialThemeColorsTintList() {
        if (this.f262j == null) {
            int H2 = C0320a.H(this, 2130968835);
            int H3 = C0320a.H(this, 2130968854);
            int H4 = C0320a.H(this, 2130968876);
            this.f262j = new ColorStateList(f261l, new int[]{C0320a.h0(H4, H2, 1.0f), C0320a.h0(H4, H3, 0.54f), C0320a.h0(H4, H3, 0.38f), C0320a.h0(H4, H3, 0.38f)});
        }
        return this.f262j;
    }

    public void setUseMaterialThemeColors(boolean z2) {
        this.f263k = z2;
        if (z2) {
            b.c(this, getMaterialThemeColorsTintList());
        } else {
            b.c(this, (ColorStateList) null);
        }
    }

    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.f263k && b.a(this) == null) {
            setUseMaterialThemeColors(true);
        }
    }
}
