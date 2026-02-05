package K0;

import D0.a;
import android.content.res.ColorStateList;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;

public class f extends Drawable.ConstantState {

    /* renamed from: a  reason: collision with root package name */
    public k f358a;

    /* renamed from: b  reason: collision with root package name */
    public a f359b;

    /* renamed from: c  reason: collision with root package name */
    public ColorStateList f360c = null;

    /* renamed from: d  reason: collision with root package name */
    public ColorStateList f361d = null;
    public ColorStateList e = null;

    /* renamed from: f  reason: collision with root package name */
    public PorterDuff.Mode f362f = PorterDuff.Mode.SRC_IN;

    /* renamed from: g  reason: collision with root package name */
    public Rect f363g = null;

    /* renamed from: h  reason: collision with root package name */
    public final float f364h = 1.0f;
    public float i = 1.0f;

    /* renamed from: j  reason: collision with root package name */
    public float f365j;

    /* renamed from: k  reason: collision with root package name */
    public int f366k = 255;

    /* renamed from: l  reason: collision with root package name */
    public float f367l = 0.0f;

    /* renamed from: m  reason: collision with root package name */
    public float f368m = 0.0f;

    /* renamed from: n  reason: collision with root package name */
    public int f369n = 0;

    /* renamed from: o  reason: collision with root package name */
    public int f370o = 0;

    /* renamed from: p  reason: collision with root package name */
    public final Paint.Style f371p = Paint.Style.FILL_AND_STROKE;

    public f(k kVar) {
        this.f358a = kVar;
        this.f359b = null;
    }

    public final int getChangingConfigurations() {
        return 0;
    }

    public Drawable newDrawable() {
        g gVar = new g(this);
        gVar.f377j = true;
        return gVar;
    }

    public f(f fVar) {
        this.f358a = fVar.f358a;
        this.f359b = fVar.f359b;
        this.f365j = fVar.f365j;
        this.f360c = fVar.f360c;
        this.f361d = fVar.f361d;
        this.f362f = fVar.f362f;
        this.e = fVar.e;
        this.f366k = fVar.f366k;
        this.f364h = fVar.f364h;
        this.f370o = fVar.f370o;
        this.i = fVar.i;
        this.f367l = fVar.f367l;
        this.f368m = fVar.f368m;
        this.f369n = fVar.f369n;
        this.f371p = fVar.f371p;
        if (fVar.f363g != null) {
            this.f363g = new Rect(fVar.f363g);
        }
    }
}
