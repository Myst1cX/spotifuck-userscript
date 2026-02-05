package androidx.preference;

import E.b;
import android.content.Context;
import android.os.Build;
import android.util.AttributeSet;
import g0.y;

public class PreferenceCategory extends PreferenceGroup {
    public final boolean f() {
        return false;
    }

    public PreferenceCategory(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, b.b(context, 2130969524, 16842892));
    }

    public final void k(y yVar) {
        super.k(yVar);
        if (Build.VERSION.SDK_INT >= 28) {
            yVar.f3338a.setAccessibilityHeading(true);
        }
    }

    public final boolean u() {
        return !super.f();
    }
}
