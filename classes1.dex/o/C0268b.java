package o;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Outline;
import android.graphics.drawable.Drawable;
import androidx.appcompat.widget.ActionBarContainer;

/* renamed from: o.b  reason: case insensitive filesystem */
public final class C0268b extends Drawable {

    /* renamed from: a  reason: collision with root package name */
    public final ActionBarContainer f4171a;

    public final int getOpacity() {
        return 0;
    }

    public final void draw(Canvas canvas) {
        ActionBarContainer actionBarContainer = this.f4171a;
        if (actionBarContainer.f1256l) {
            Drawable drawable = actionBarContainer.f1255k;
            if (drawable != null) {
                drawable.draw(canvas);
                return;
            }
            return;
        }
        Drawable drawable2 = actionBarContainer.i;
        if (drawable2 != null) {
            drawable2.draw(canvas);
        }
        Drawable drawable3 = actionBarContainer.f1254j;
        if (drawable3 != null && actionBarContainer.f1257m) {
            drawable3.draw(canvas);
        }
    }

    public final void getOutline(Outline outline) {
        ActionBarContainer actionBarContainer = this.f4171a;
        if (!actionBarContainer.f1256l) {
            Drawable drawable = actionBarContainer.i;
            if (drawable != null) {
                drawable.getOutline(outline);
            }
        } else if (actionBarContainer.f1255k != null) {
            actionBarContainer.i.getOutline(outline);
        }
    }

    public final void setAlpha(int i) {
    }

    public final void setColorFilter(ColorFilter colorFilter) {
    }

    public C0268b(ActionBarContainer actionBarContainer) {
        this.f4171a = actionBarContainer;
    }
}
