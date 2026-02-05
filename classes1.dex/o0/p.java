package o0;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;

public final class p extends Drawable.ConstantState {

    /* renamed from: a  reason: collision with root package name */
    public int f4400a;

    /* renamed from: b  reason: collision with root package name */
    public o f4401b;

    /* renamed from: c  reason: collision with root package name */
    public ColorStateList f4402c;

    /* renamed from: d  reason: collision with root package name */
    public PorterDuff.Mode f4403d;
    public boolean e;

    /* renamed from: f  reason: collision with root package name */
    public Bitmap f4404f;

    /* renamed from: g  reason: collision with root package name */
    public ColorStateList f4405g;

    /* renamed from: h  reason: collision with root package name */
    public PorterDuff.Mode f4406h;
    public int i;

    /* renamed from: j  reason: collision with root package name */
    public boolean f4407j;

    /* renamed from: k  reason: collision with root package name */
    public boolean f4408k;

    /* renamed from: l  reason: collision with root package name */
    public Paint f4409l;

    public final Drawable newDrawable() {
        return new r(this);
    }

    public int getChangingConfigurations() {
        return this.f4400a;
    }

    public final Drawable newDrawable(Resources resources) {
        return new r(this);
    }
}
