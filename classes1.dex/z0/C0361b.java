package z0;

import android.graphics.Outline;
import android.view.View;
import android.view.ViewOutlineProvider;
import com.google.android.material.chip.Chip;

/* renamed from: z0.b  reason: case insensitive filesystem */
public final class C0361b extends ViewOutlineProvider {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ Chip f5176a;

    public C0361b(Chip chip) {
        this.f5176a = chip;
    }

    public final void getOutline(View view, Outline outline) {
        C0364e eVar = this.f5176a.f2194j;
        if (eVar != null) {
            eVar.getOutline(outline);
        } else {
            outline.setAlpha(0.0f);
        }
    }
}
