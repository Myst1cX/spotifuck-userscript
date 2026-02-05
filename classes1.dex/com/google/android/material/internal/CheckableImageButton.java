package com.google.android.material.internal;

import E0.a;
import E0.b;
import N.Q;
import android.content.Context;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.widget.Checkable;
import o.C0310w;

public class CheckableImageButton extends C0310w implements Checkable {

    /* renamed from: l  reason: collision with root package name */
    public static final int[] f2295l = {16842912};
    public boolean i;

    /* renamed from: j  reason: collision with root package name */
    public boolean f2296j = true;

    /* renamed from: k  reason: collision with root package name */
    public boolean f2297k = true;

    public final boolean isChecked() {
        return this.i;
    }

    public final int[] onCreateDrawableState(int i2) {
        if (this.i) {
            return View.mergeDrawableStates(super.onCreateDrawableState(i2 + 1), f2295l);
        }
        return super.onCreateDrawableState(i2);
    }

    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof b)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        b bVar = (b) parcelable;
        super.onRestoreInstanceState(bVar.f940a);
        setChecked(bVar.f134c);
    }

    public void setCheckable(boolean z2) {
        if (this.f2296j != z2) {
            this.f2296j = z2;
            sendAccessibilityEvent(0);
        }
    }

    public void setChecked(boolean z2) {
        if (this.f2296j && this.i != z2) {
            this.i = z2;
            refreshDrawableState();
            sendAccessibilityEvent(2048);
        }
    }

    public void setPressable(boolean z2) {
        this.f2297k = z2;
    }

    public void setPressed(boolean z2) {
        if (this.f2297k) {
            super.setPressed(z2);
        }
    }

    public final void toggle() {
        setChecked(!this.i);
    }

    public CheckableImageButton(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 2130969177);
        Q.p(this, new a(0, this));
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [android.os.Parcelable, U.b, E0.b] */
    public final Parcelable onSaveInstanceState() {
        ? bVar = new U.b(super.onSaveInstanceState());
        bVar.f134c = this.i;
        return bVar;
    }
}
