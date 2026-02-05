package z0;

import O.f;
import O.k;
import V.b;
import android.content.Context;
import android.graphics.Rect;
import android.text.TextUtils;
import android.view.accessibility.AccessibilityNodeInfo;
import com.google.android.material.chip.Chip;
import java.util.ArrayList;

/* renamed from: z0.c  reason: case insensitive filesystem */
public final class C0362c extends b {

    /* renamed from: q  reason: collision with root package name */
    public final /* synthetic */ Chip f5177q;

    public final void l(ArrayList arrayList) {
        boolean z2 = false;
        arrayList.add(0);
        Rect rect = Chip.f2190B;
        Chip chip = this.f5177q;
        if (chip.c()) {
            C0364e eVar = chip.f2194j;
            if (eVar != null && eVar.f5200P) {
                z2 = true;
            }
            if (z2 && chip.f2197m != null) {
                arrayList.add(1);
            }
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C0362c(Chip chip, Chip chip2) {
        super(chip2);
        this.f5177q = chip;
    }

    public final void o(int i, k kVar) {
        AccessibilityNodeInfo accessibilityNodeInfo = kVar.f751a;
        CharSequence charSequence = "";
        if (i == 1) {
            Chip chip = this.f5177q;
            CharSequence closeIconContentDescription = chip.getCloseIconContentDescription();
            if (closeIconContentDescription != null) {
                accessibilityNodeInfo.setContentDescription(closeIconContentDescription);
            } else {
                CharSequence text = chip.getText();
                Context context = chip.getContext();
                if (!TextUtils.isEmpty(text)) {
                    charSequence = text;
                }
                accessibilityNodeInfo.setContentDescription(context.getString(2131755166, new Object[]{charSequence}).trim());
            }
            accessibilityNodeInfo.setBoundsInParent(chip.getCloseIconTouchBoundsInt());
            kVar.b(f.e);
            accessibilityNodeInfo.setEnabled(chip.isEnabled());
            return;
        }
        accessibilityNodeInfo.setContentDescription(charSequence);
        accessibilityNodeInfo.setBoundsInParent(Chip.f2190B);
    }
}
