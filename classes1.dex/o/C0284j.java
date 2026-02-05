package o;

import G.a;
import T0.g;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import n.C0187b;

/* renamed from: o.j  reason: case insensitive filesystem */
public final class C0284j extends C0314y implements C0288l {
    public final /* synthetic */ C0286k i;

    public final boolean b() {
        return false;
    }

    public final boolean c() {
        return false;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C0284j(C0286k kVar, Context context) {
        super(context, (AttributeSet) null, 2130968609);
        this.i = kVar;
        setClickable(true);
        setFocusable(true);
        setVisibility(0);
        setEnabled(true);
        g.N(this, getContentDescription());
        setOnTouchListener(new C0187b(this, this));
    }

    public final boolean performClick() {
        if (super.performClick()) {
            return true;
        }
        playSoundEffect(0);
        this.i.l();
        return true;
    }

    public final boolean setFrame(int i2, int i3, int i4, int i5) {
        boolean frame = super.setFrame(i2, i3, i4, i5);
        Drawable drawable = getDrawable();
        Drawable background = getBackground();
        if (!(drawable == null || background == null)) {
            int width = getWidth();
            int height = getHeight();
            int max = Math.max(width, height) / 2;
            int paddingLeft = (width + (getPaddingLeft() - getPaddingRight())) / 2;
            int paddingTop = (height + (getPaddingTop() - getPaddingBottom())) / 2;
            a.f(background, paddingLeft - max, paddingTop - max, paddingLeft + max, paddingTop + max);
        }
        return frame;
    }
}
