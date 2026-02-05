package o;

import android.content.Context;
import android.graphics.Bitmap;
import android.util.AttributeSet;
import android.view.View;
import android.widget.AbsSeekBar;
import android.widget.RatingBar;

/* renamed from: o.E  reason: case insensitive filesystem */
public final class C0250E extends RatingBar {

    /* renamed from: f  reason: collision with root package name */
    public final C0248C f4057f;

    public final synchronized void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        Bitmap bitmap = (Bitmap) this.f4057f.f4051c;
        if (bitmap != null) {
            setMeasuredDimension(View.resolveSizeAndState(bitmap.getWidth() * getNumStars(), i, 0), getMeasuredHeight());
        }
    }

    public C0250E(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 2130969550);
        U0.a(this, getContext());
        C0248C c2 = new C0248C((AbsSeekBar) this);
        this.f4057f = c2;
        c2.b(attributeSet, 2130969550);
    }
}
