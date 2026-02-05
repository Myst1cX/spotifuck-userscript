package o;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.SeekBar;

/* renamed from: o.G  reason: case insensitive filesystem */
public final class C0252G extends SeekBar {

    /* renamed from: f  reason: collision with root package name */
    public final C0253H f4060f;

    public final synchronized void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        this.f4060f.g(canvas);
    }

    public C0252G(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 2130969581);
        U0.a(this, getContext());
        C0253H h2 = new C0253H(this);
        this.f4060f = h2;
        h2.b(attributeSet, 2130969581);
    }

    public final void drawableStateChanged() {
        super.drawableStateChanged();
        C0253H h2 = this.f4060f;
        Drawable drawable = h2.f4062f;
        if (drawable != null && drawable.isStateful()) {
            C0252G g2 = h2.e;
            if (drawable.setState(g2.getDrawableState())) {
                g2.invalidateDrawable(drawable);
            }
        }
    }

    public final void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        Drawable drawable = this.f4060f.f4062f;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
    }
}
