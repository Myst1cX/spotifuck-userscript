package O;

import android.os.Bundle;
import android.text.style.ClickableSpan;
import android.view.View;

public final class a extends ClickableSpan {

    /* renamed from: a  reason: collision with root package name */
    public final int f735a;

    /* renamed from: b  reason: collision with root package name */
    public final k f736b;

    /* renamed from: c  reason: collision with root package name */
    public final int f737c;

    public final void onClick(View view) {
        Bundle bundle = new Bundle();
        bundle.putInt("ACCESSIBILITY_CLICKABLE_SPAN_ID", this.f735a);
        this.f736b.f751a.performAction(this.f737c, bundle);
    }

    public a(int i, k kVar, int i2) {
        this.f735a = i;
        this.f736b = kVar;
        this.f737c = i2;
    }
}
