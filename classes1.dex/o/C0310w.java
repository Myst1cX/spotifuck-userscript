package o;

import T0.g;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.net.Uri;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;
import g1.o;
import j0.C0140b;

/* renamed from: o.w  reason: case insensitive filesystem */
public class C0310w extends ImageButton {

    /* renamed from: f  reason: collision with root package name */
    public final C0140b f4319f;

    /* renamed from: g  reason: collision with root package name */
    public final C0312x f4320g;

    /* renamed from: h  reason: collision with root package name */
    public boolean f4321h = false;

    public ColorStateList getSupportImageTintList() {
        o oVar;
        C0312x xVar = this.f4320g;
        if (xVar == null || (oVar = xVar.f4323b) == null) {
            return null;
        }
        return (ColorStateList) oVar.f2744c;
    }

    public PorterDuff.Mode getSupportImageTintMode() {
        o oVar;
        C0312x xVar = this.f4320g;
        if (xVar == null || (oVar = xVar.f4323b) == null) {
            return null;
        }
        return (PorterDuff.Mode) oVar.f2745d;
    }

    public ColorStateList getSupportBackgroundTintList() {
        C0140b bVar = this.f4319f;
        if (bVar != null) {
            return bVar.h();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        C0140b bVar = this.f4319f;
        if (bVar != null) {
            return bVar.i();
        }
        return null;
    }

    public final boolean hasOverlappingRendering() {
        if ((this.f4320g.f4322a.getBackground() instanceof RippleDrawable) || !super.hasOverlappingRendering()) {
            return false;
        }
        return true;
    }

    public void setImageDrawable(Drawable drawable) {
        C0312x xVar = this.f4320g;
        if (!(xVar == null || drawable == null || this.f4321h)) {
            xVar.f4325d = drawable.getLevel();
        }
        super.setImageDrawable(drawable);
        if (xVar != null) {
            xVar.a();
            if (!this.f4321h) {
                ImageView imageView = xVar.f4322a;
                if (imageView.getDrawable() != null) {
                    imageView.getDrawable().setLevel(xVar.f4325d);
                }
            }
        }
    }

    public void setImageResource(int i) {
        C0312x xVar = this.f4320g;
        ImageView imageView = xVar.f4322a;
        if (i != 0) {
            Drawable n2 = g.n(imageView.getContext(), i);
            if (n2 != null) {
                C0297p0.a(n2);
            }
            imageView.setImageDrawable(n2);
        } else {
            imageView.setImageDrawable((Drawable) null);
        }
        xVar.a();
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        C0140b bVar = this.f4319f;
        if (bVar != null) {
            bVar.s(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        C0140b bVar = this.f4319f;
        if (bVar != null) {
            bVar.t(mode);
        }
    }

    /* JADX WARNING: type inference failed for: r1v2, types: [g1.o, java.lang.Object] */
    public void setSupportImageTintList(ColorStateList colorStateList) {
        C0312x xVar = this.f4320g;
        if (xVar != null) {
            if (xVar.f4323b == null) {
                xVar.f4323b = new Object();
            }
            o oVar = xVar.f4323b;
            oVar.f2744c = colorStateList;
            oVar.f2743b = true;
            xVar.a();
        }
    }

    /* JADX WARNING: type inference failed for: r1v2, types: [g1.o, java.lang.Object] */
    public void setSupportImageTintMode(PorterDuff.Mode mode) {
        C0312x xVar = this.f4320g;
        if (xVar != null) {
            if (xVar.f4323b == null) {
                xVar.f4323b = new Object();
            }
            o oVar = xVar.f4323b;
            oVar.f2745d = mode;
            oVar.f2742a = true;
            xVar.a();
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C0310w(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        V0.a(context);
        U0.a(this, getContext());
        C0140b bVar = new C0140b((View) this);
        this.f4319f = bVar;
        bVar.k(attributeSet, i);
        C0312x xVar = new C0312x(this);
        this.f4320g = xVar;
        xVar.b(attributeSet, i);
    }

    public final void drawableStateChanged() {
        super.drawableStateChanged();
        C0140b bVar = this.f4319f;
        if (bVar != null) {
            bVar.a();
        }
        C0312x xVar = this.f4320g;
        if (xVar != null) {
            xVar.a();
        }
    }

    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        C0140b bVar = this.f4319f;
        if (bVar != null) {
            bVar.m();
        }
    }

    public void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        C0140b bVar = this.f4319f;
        if (bVar != null) {
            bVar.n(i);
        }
    }

    public void setImageBitmap(Bitmap bitmap) {
        super.setImageBitmap(bitmap);
        C0312x xVar = this.f4320g;
        if (xVar != null) {
            xVar.a();
        }
    }

    public void setImageLevel(int i) {
        super.setImageLevel(i);
        this.f4321h = true;
    }

    public void setImageURI(Uri uri) {
        super.setImageURI(uri);
        C0312x xVar = this.f4320g;
        if (xVar != null) {
            xVar.a();
        }
    }
}
