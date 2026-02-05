package y;

import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewParent;
import androidx.constraintlayout.widget.ConstraintLayout;
import v.g;

public abstract class t extends c {

    /* renamed from: m  reason: collision with root package name */
    public boolean f5144m;

    /* renamed from: n  reason: collision with root package name */
    public boolean f5145n;

    public abstract void j(g gVar, int i, int i2);

    public final void e(ConstraintLayout constraintLayout) {
        d(constraintLayout);
    }

    public void g(AttributeSet attributeSet) {
        super.g(attributeSet);
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, r.f5137b);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = obtainStyledAttributes.getIndex(i);
                if (index == 6) {
                    this.f5144m = true;
                } else if (index == 22) {
                    this.f5145n = true;
                }
            }
            obtainStyledAttributes.recycle();
        }
    }

    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.f5144m || this.f5145n) {
            ViewParent parent = getParent();
            if (parent instanceof ConstraintLayout) {
                ConstraintLayout constraintLayout = (ConstraintLayout) parent;
                int visibility = getVisibility();
                float elevation = getElevation();
                for (int i = 0; i < this.f4946g; i++) {
                    View view = (View) constraintLayout.f1421f.get(this.f4945f[i]);
                    if (view != null) {
                        if (this.f5144m) {
                            view.setVisibility(visibility);
                        }
                        if (this.f5145n && elevation > 0.0f) {
                            view.setTranslationZ(view.getTranslationZ() + elevation);
                        }
                    }
                }
            }
        }
    }

    public void setElevation(float f2) {
        super.setElevation(f2);
        ViewParent parent = getParent();
        if (parent != null && (parent instanceof ConstraintLayout)) {
            d((ConstraintLayout) parent);
        }
    }

    public void setVisibility(int i) {
        super.setVisibility(i);
        ViewParent parent = getParent();
        if (parent != null && (parent instanceof ConstraintLayout)) {
            d((ConstraintLayout) parent);
        }
    }
}
