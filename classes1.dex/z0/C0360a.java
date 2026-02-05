package z0;

import android.widget.CompoundButton;
import com.google.android.material.chip.Chip;

/* renamed from: z0.a  reason: case insensitive filesystem */
public final /* synthetic */ class C0360a implements CompoundButton.OnCheckedChangeListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ Chip f5175a;

    public /* synthetic */ C0360a(Chip chip) {
        this.f5175a = chip;
    }

    public final void onCheckedChanged(CompoundButton compoundButton, boolean z2) {
        CompoundButton.OnCheckedChangeListener onCheckedChangeListener = this.f5175a.f2198n;
        if (onCheckedChangeListener != null) {
            onCheckedChangeListener.onCheckedChanged(compoundButton, z2);
        }
    }
}
