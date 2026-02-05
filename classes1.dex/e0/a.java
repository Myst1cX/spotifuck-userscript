package E0;

import N.C0002b;
import O.k;
import android.os.Bundle;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.button.MaterialButtonToggleGroup;
import com.google.android.material.datepicker.j;
import com.google.android.material.internal.CheckableImageButton;
import com.google.android.material.internal.NavigationMenuItemView;
import g0.u;
import g0.x;
import j0.C;
import j0.a0;

public final class a extends C0002b {

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ int f133d;
    public final /* synthetic */ Object e;

    public /* synthetic */ a(int i, Object obj) {
        this.f133d = i;
        this.e = obj;
    }

    public final void d(View view, k kVar) {
        String str;
        RecyclerView recyclerView;
        int i = -1;
        View.AccessibilityDelegate accessibilityDelegate = this.f523a;
        Object obj = this.e;
        switch (this.f133d) {
            case 0:
                AccessibilityNodeInfo accessibilityNodeInfo = kVar.f751a;
                accessibilityDelegate.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
                CheckableImageButton checkableImageButton = (CheckableImageButton) obj;
                accessibilityNodeInfo.setCheckable(checkableImageButton.f2296j);
                accessibilityNodeInfo.setChecked(checkableImageButton.i);
                return;
            case 1:
                AccessibilityNodeInfo accessibilityNodeInfo2 = kVar.f751a;
                accessibilityDelegate.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo2);
                accessibilityNodeInfo2.setCheckable(((NavigationMenuItemView) obj).f2301C);
                return;
            case 2:
                accessibilityDelegate.onInitializeAccessibilityNodeInfo(view, kVar.f751a);
                j jVar = (j) obj;
                if (jVar.f2246k0.getVisibility() == 0) {
                    str = jVar.k().getString(2131755205);
                } else {
                    str = jVar.k().getString(2131755203);
                }
                kVar.j(str);
                return;
            case 3:
                x xVar = (x) obj;
                xVar.f2614g.d(view, kVar);
                RecyclerView recyclerView2 = xVar.f2613f;
                recyclerView2.getClass();
                a0 I = RecyclerView.I(view);
                if (!(I == null || (recyclerView = I.f3353r) == null)) {
                    i = recyclerView.F(I);
                }
                C adapter = recyclerView2.getAdapter();
                if (adapter instanceof u) {
                    ((u) adapter).i(i);
                    return;
                }
                return;
            default:
                accessibilityDelegate.onInitializeAccessibilityNodeInfo(view, kVar.f751a);
                int i2 = MaterialButtonToggleGroup.f2177p;
                MaterialButtonToggleGroup materialButtonToggleGroup = (MaterialButtonToggleGroup) obj;
                materialButtonToggleGroup.getClass();
                if (view instanceof MaterialButton) {
                    int i3 = 0;
                    int i4 = 0;
                    while (true) {
                        if (i3 < materialButtonToggleGroup.getChildCount()) {
                            if (materialButtonToggleGroup.getChildAt(i3) == view) {
                                i = i4;
                            } else {
                                if ((materialButtonToggleGroup.getChildAt(i3) instanceof MaterialButton) && materialButtonToggleGroup.c(i3)) {
                                    i4++;
                                }
                                i3++;
                            }
                        }
                    }
                }
                kVar.i(O.j.a(((MaterialButton) view).f2174t, 0, 1, i, 1));
                return;
        }
    }

    public void c(View view, AccessibilityEvent accessibilityEvent) {
        switch (this.f133d) {
            case 0:
                super.c(view, accessibilityEvent);
                accessibilityEvent.setChecked(((CheckableImageButton) this.e).i);
                return;
            default:
                super.c(view, accessibilityEvent);
                return;
        }
    }

    public boolean g(View view, int i, Bundle bundle) {
        switch (this.f133d) {
            case 3:
                return ((x) this.e).f2614g.g(view, i, bundle);
            default:
                return super.g(view, i, bundle);
        }
    }
}
