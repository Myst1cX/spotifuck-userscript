package o;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.XmlResourceParser;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.Log;
import j.C0135e;
import k.C0164a;
import o0.f;
import o0.r;

public final class O0 {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f4113a;

    public /* synthetic */ O0(int i) {
        this.f4113a = i;
    }

    public final Drawable a(Context context, XmlResourceParser xmlResourceParser, AttributeSet attributeSet, Resources.Theme theme) {
        switch (this.f4113a) {
            case 0:
                String classAttribute = attributeSet.getClassAttribute();
                if (classAttribute == null) {
                    return null;
                }
                try {
                    Drawable drawable = (Drawable) O0.class.getClassLoader().loadClass(classAttribute).asSubclass(Drawable.class).getDeclaredConstructor((Class[]) null).newInstance((Object[]) null);
                    C0164a.c(drawable, context.getResources(), xmlResourceParser, attributeSet, theme);
                    return drawable;
                } catch (Exception e) {
                    Log.e("DrawableDelegate", "Exception while inflating <drawable>", e);
                    return null;
                }
            case 1:
                try {
                    return C0135e.e(context, context.getResources(), xmlResourceParser, attributeSet, theme);
                } catch (Exception e2) {
                    Log.e("AsldcInflateDelegate", "Exception while inflating <animated-selector>", e2);
                    return null;
                }
            case 2:
                try {
                    Resources resources = context.getResources();
                    f fVar = new f(context);
                    fVar.inflate(resources, xmlResourceParser, attributeSet, theme);
                    return fVar;
                } catch (Exception e3) {
                    Log.e("AvdcInflateDelegate", "Exception while inflating <animated-vector>", e3);
                    return null;
                }
            default:
                try {
                    Resources resources2 = context.getResources();
                    r rVar = new r();
                    rVar.inflate(resources2, xmlResourceParser, attributeSet, theme);
                    return rVar;
                } catch (Exception e4) {
                    Log.e("VdcInflateDelegate", "Exception while inflating <vector>", e4);
                    return null;
                }
        }
    }
}
