package o;

import A.b;
import E.j;
import G.h;
import G.i;
import X.e;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.drawable.AnimationDrawable;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.ClipDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.RoundRectShape;
import android.os.Build;
import android.support.v4.media.session.t;
import android.text.method.KeyListener;
import android.text.method.NumberKeyListener;
import android.util.AttributeSet;
import android.view.View;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.AbsSeekBar;
import android.widget.EditText;
import g.C0096a;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import p0.C0320a;

/* renamed from: o.C  reason: case insensitive filesystem */
public class C0248C {

    /* renamed from: d  reason: collision with root package name */
    public static final int[] f4048d = {16843067, 16843068};

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f4049a = 2;

    /* renamed from: b  reason: collision with root package name */
    public View f4050b;

    /* renamed from: c  reason: collision with root package name */
    public Object f4051c;

    public /* synthetic */ C0248C() {
    }

    public Drawable e(Drawable drawable, boolean z2) {
        boolean z3;
        if (drawable instanceof h) {
            i iVar = (i) ((h) drawable);
            Drawable drawable2 = iVar.f256k;
            if (drawable2 != null) {
                iVar.h(e(drawable2, z2));
            }
        } else if (drawable instanceof LayerDrawable) {
            LayerDrawable layerDrawable = (LayerDrawable) drawable;
            int numberOfLayers = layerDrawable.getNumberOfLayers();
            Drawable[] drawableArr = new Drawable[numberOfLayers];
            for (int i = 0; i < numberOfLayers; i++) {
                int id = layerDrawable.getId(i);
                Drawable drawable3 = layerDrawable.getDrawable(i);
                if (id == 16908301 || id == 16908303) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                drawableArr[i] = e(drawable3, z3);
            }
            LayerDrawable layerDrawable2 = new LayerDrawable(drawableArr);
            for (int i2 = 0; i2 < numberOfLayers; i2++) {
                layerDrawable2.setId(i2, layerDrawable.getId(i2));
                if (Build.VERSION.SDK_INT >= 23) {
                    C0247B.a(layerDrawable, layerDrawable2, i2);
                }
            }
            return layerDrawable2;
        } else if (drawable instanceof BitmapDrawable) {
            BitmapDrawable bitmapDrawable = (BitmapDrawable) drawable;
            Bitmap bitmap = bitmapDrawable.getBitmap();
            if (((Bitmap) this.f4051c) == null) {
                this.f4051c = bitmap;
            }
            ShapeDrawable shapeDrawable = new ShapeDrawable(new RoundRectShape(new float[]{5.0f, 5.0f, 5.0f, 5.0f, 5.0f, 5.0f, 5.0f, 5.0f}, (RectF) null, (float[]) null));
            shapeDrawable.getPaint().setShader(new BitmapShader(bitmap, Shader.TileMode.REPEAT, Shader.TileMode.CLAMP));
            shapeDrawable.getPaint().setColorFilter(bitmapDrawable.getPaint().getColorFilter());
            if (z2) {
                return new ClipDrawable(shapeDrawable, 3, 1);
            }
            return shapeDrawable;
        }
        return drawable;
    }

    public C0248C(AbsSeekBar absSeekBar) {
        this.f4050b = absSeekBar;
    }

    public KeyListener a(KeyListener keyListener) {
        if (keyListener instanceof NumberKeyListener) {
            return keyListener;
        }
        ((j) ((b) this.f4051c).f2g).getClass();
        if (keyListener instanceof e) {
            return keyListener;
        }
        if (keyListener == null) {
            return null;
        }
        if (keyListener instanceof NumberKeyListener) {
            return keyListener;
        }
        return new e(keyListener);
    }

    /* JADX INFO: finally extract failed */
    public void b(AttributeSet attributeSet, int i) {
        switch (this.f4049a) {
            case 0:
                AbsSeekBar absSeekBar = (AbsSeekBar) this.f4050b;
                t A2 = t.A(absSeekBar.getContext(), attributeSet, f4048d, i);
                Drawable p2 = A2.p(0);
                if (p2 != null) {
                    if (p2 instanceof AnimationDrawable) {
                        AnimationDrawable animationDrawable = (AnimationDrawable) p2;
                        int numberOfFrames = animationDrawable.getNumberOfFrames();
                        AnimationDrawable animationDrawable2 = new AnimationDrawable();
                        animationDrawable2.setOneShot(animationDrawable.isOneShot());
                        for (int i2 = 0; i2 < numberOfFrames; i2++) {
                            Drawable e = e(animationDrawable.getFrame(i2), true);
                            e.setLevel(10000);
                            animationDrawable2.addFrame(e, animationDrawable.getDuration(i2));
                        }
                        animationDrawable2.setLevel(10000);
                        p2 = animationDrawable2;
                    }
                    absSeekBar.setIndeterminateDrawable(p2);
                }
                Drawable p3 = A2.p(1);
                if (p3 != null) {
                    absSeekBar.setProgressDrawable(e(p3, false));
                }
                A2.C();
                return;
            default:
                TypedArray obtainStyledAttributes = ((EditText) this.f4050b).getContext().obtainStyledAttributes(attributeSet, C0096a.i, i, 0);
                try {
                    boolean z2 = true;
                    if (obtainStyledAttributes.hasValue(14)) {
                        z2 = obtainStyledAttributes.getBoolean(14, true);
                    }
                    obtainStyledAttributes.recycle();
                    d(z2);
                    return;
                } catch (Throwable th) {
                    obtainStyledAttributes.recycle();
                    throw th;
                }
        }
    }

    public X.b c(InputConnection inputConnection, EditorInfo editorInfo) {
        b bVar = (b) this.f4051c;
        if (inputConnection == null) {
            bVar.getClass();
            inputConnection = null;
        } else {
            j jVar = (j) bVar.f2g;
            jVar.getClass();
            if (!(inputConnection instanceof X.b)) {
                inputConnection = new X.b((EditText) jVar.f108g, inputConnection, editorInfo);
            }
        }
        return (X.b) inputConnection;
    }

    public void d(boolean z2) {
        X.i iVar = (X.i) ((j) ((b) this.f4051c).f2g).f109h;
        if (iVar.f998h != z2) {
            if (iVar.f997g != null) {
                androidx.emoji2.text.j a2 = androidx.emoji2.text.j.a();
                X.h hVar = iVar.f997g;
                a2.getClass();
                C0320a.j("initCallback cannot be null", hVar);
                ReentrantReadWriteLock reentrantReadWriteLock = a2.f1515a;
                reentrantReadWriteLock.writeLock().lock();
                try {
                    a2.f1516b.remove(hVar);
                } finally {
                    reentrantReadWriteLock.writeLock().unlock();
                }
            }
            iVar.f998h = z2;
            if (z2) {
                X.i.a(iVar.f996f, androidx.emoji2.text.j.a().b());
            }
        }
    }

    public C0248C(EditText editText) {
        this.f4050b = editText;
        this.f4051c = new b(editText);
    }
}
