package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import g.C0096a;
import java.lang.ref.WeakReference;
import o.l1;

public final class ViewStubCompat extends View {

    /* renamed from: f  reason: collision with root package name */
    public int f1416f = 0;

    /* renamed from: g  reason: collision with root package name */
    public int f1417g;

    /* renamed from: h  reason: collision with root package name */
    public WeakReference f1418h;
    public LayoutInflater i;

    public ViewStubCompat(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C0096a.f2518A, 0, 0);
        this.f1417g = obtainStyledAttributes.getResourceId(2, -1);
        this.f1416f = obtainStyledAttributes.getResourceId(1, 0);
        setId(obtainStyledAttributes.getResourceId(0, -1));
        obtainStyledAttributes.recycle();
        setVisibility(8);
        setWillNotDraw(true);
    }

    public final void dispatchDraw(Canvas canvas) {
    }

    public final void draw(Canvas canvas) {
    }

    public final void onMeasure(int i2, int i3) {
        setMeasuredDimension(0, 0);
    }

    public int getInflatedId() {
        return this.f1417g;
    }

    public LayoutInflater getLayoutInflater() {
        return this.i;
    }

    public int getLayoutResource() {
        return this.f1416f;
    }

    public void setInflatedId(int i2) {
        this.f1417g = i2;
    }

    public void setLayoutInflater(LayoutInflater layoutInflater) {
        this.i = layoutInflater;
    }

    public void setLayoutResource(int i2) {
        this.f1416f = i2;
    }

    public void setOnInflateListener(l1 l1Var) {
    }

    public void setVisibility(int i2) {
        WeakReference weakReference = this.f1418h;
        if (weakReference != null) {
            View view = (View) weakReference.get();
            if (view != null) {
                view.setVisibility(i2);
                return;
            }
            throw new IllegalStateException("setVisibility called on un-referenced view");
        }
        super.setVisibility(i2);
        if (i2 == 0 || i2 == 4) {
            a();
        }
    }

    public final View a() {
        ViewParent parent = getParent();
        if (!(parent instanceof ViewGroup)) {
            throw new IllegalStateException("ViewStub must have a non-null ViewGroup viewParent");
        } else if (this.f1416f != 0) {
            ViewGroup viewGroup = (ViewGroup) parent;
            LayoutInflater layoutInflater = this.i;
            if (layoutInflater == null) {
                layoutInflater = LayoutInflater.from(getContext());
            }
            View inflate = layoutInflater.inflate(this.f1416f, viewGroup, false);
            int i2 = this.f1417g;
            if (i2 != -1) {
                inflate.setId(i2);
            }
            int indexOfChild = viewGroup.indexOfChild(this);
            viewGroup.removeViewInLayout(this);
            ViewGroup.LayoutParams layoutParams = getLayoutParams();
            if (layoutParams != null) {
                viewGroup.addView(inflate, indexOfChild, layoutParams);
            } else {
                viewGroup.addView(inflate, indexOfChild);
            }
            this.f1418h = new WeakReference(inflate);
            return inflate;
        } else {
            throw new IllegalArgumentException("ViewStub must have a valid layoutResource");
        }
    }
}
