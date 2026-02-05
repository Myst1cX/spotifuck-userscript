package n;

import android.view.CollapsibleActionView;
import android.view.View;
import android.widget.FrameLayout;
import m.C0175b;

/* renamed from: n.p  reason: case insensitive filesystem */
public final class C0201p extends FrameLayout implements C0175b {

    /* renamed from: f  reason: collision with root package name */
    public final CollapsibleActionView f3927f;

    public C0201p(View view) {
        super(view.getContext());
        this.f3927f = (CollapsibleActionView) view;
        addView(view);
    }
}
