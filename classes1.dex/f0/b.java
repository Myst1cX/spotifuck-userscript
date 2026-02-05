package f0;

import E.j;
import F.a;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Shader;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.os.Bundle;
import android.os.Messenger;
import android.os.RemoteException;
import android.support.v4.media.c;
import android.support.v4.media.f;
import o.C0302s;
import o.P0;
import o.U0;
import p0.C0320a;

public final class b {

    /* renamed from: a  reason: collision with root package name */
    public final Object f2513a;

    /* renamed from: b  reason: collision with root package name */
    public Object f2514b;

    /* renamed from: c  reason: collision with root package name */
    public final Object f2515c;

    /* renamed from: d  reason: collision with root package name */
    public final Cloneable f2516d;
    public final Object e;

    /* renamed from: f  reason: collision with root package name */
    public Object f2517f;

    /* JADX WARNING: type inference failed for: r0v5, types: [java.lang.Cloneable, int[]] */
    public b() {
        this.f2513a = new int[]{2131230836, 2131230834, 2131230760};
        this.f2514b = new int[]{2131230784, 2131230819, 2131230791, 2131230786, 2131230787, 2131230790, 2131230789};
        this.f2515c = new int[]{2131230833, 2131230835, 2131230777, 2131230829, 2131230830, 2131230831, 2131230832};
        this.f2516d = new int[]{2131230809, 2131230775, 2131230808};
        this.e = new int[]{2131230827, 2131230837};
        this.f2517f = new int[]{2131230763, 2131230769, 2131230764, 2131230770};
    }

    public static boolean a(int[] iArr, int i) {
        for (int i2 : iArr) {
            if (i2 == i) {
                return true;
            }
        }
        return false;
    }

    public static LayerDrawable d(P0 p02, Context context, int i) {
        BitmapDrawable bitmapDrawable;
        BitmapDrawable bitmapDrawable2;
        BitmapDrawable bitmapDrawable3;
        int dimensionPixelSize = context.getResources().getDimensionPixelSize(i);
        Drawable f2 = p02.f(context, 2131230823);
        Drawable f3 = p02.f(context, 2131230824);
        if ((f2 instanceof BitmapDrawable) && f2.getIntrinsicWidth() == dimensionPixelSize && f2.getIntrinsicHeight() == dimensionPixelSize) {
            bitmapDrawable2 = (BitmapDrawable) f2;
            bitmapDrawable = new BitmapDrawable(bitmapDrawable2.getBitmap());
        } else {
            Bitmap createBitmap = Bitmap.createBitmap(dimensionPixelSize, dimensionPixelSize, Bitmap.Config.ARGB_8888);
            Canvas canvas = new Canvas(createBitmap);
            f2.setBounds(0, 0, dimensionPixelSize, dimensionPixelSize);
            f2.draw(canvas);
            bitmapDrawable2 = new BitmapDrawable(createBitmap);
            bitmapDrawable = new BitmapDrawable(createBitmap);
        }
        bitmapDrawable.setTileModeX(Shader.TileMode.REPEAT);
        if ((f3 instanceof BitmapDrawable) && f3.getIntrinsicWidth() == dimensionPixelSize && f3.getIntrinsicHeight() == dimensionPixelSize) {
            bitmapDrawable3 = (BitmapDrawable) f3;
        } else {
            Bitmap createBitmap2 = Bitmap.createBitmap(dimensionPixelSize, dimensionPixelSize, Bitmap.Config.ARGB_8888);
            Canvas canvas2 = new Canvas(createBitmap2);
            f3.setBounds(0, 0, dimensionPixelSize, dimensionPixelSize);
            f3.draw(canvas2);
            bitmapDrawable3 = new BitmapDrawable(createBitmap2);
        }
        LayerDrawable layerDrawable = new LayerDrawable(new Drawable[]{bitmapDrawable2, bitmapDrawable3, bitmapDrawable});
        layerDrawable.setId(0, 16908288);
        layerDrawable.setId(1, 16908303);
        layerDrawable.setId(2, 16908301);
        return layerDrawable;
    }

    public static void f(Drawable drawable, int i) {
        drawable.mutate().setColorFilter(C0302s.c(i, C0302s.f4294b));
    }

    public void c() {
        Messenger messenger;
        c cVar = ((f) this.f2517f).f1082a;
        j jVar = cVar.f1078f;
        if (!(jVar == null || (messenger = cVar.f1079g) == null)) {
            try {
                jVar.M(7, (Bundle) null, messenger);
            } catch (RemoteException unused) {
            }
        }
        cVar.f1075b.disconnect();
        ((BroadcastReceiver.PendingResult) this.e).finish();
    }

    public static ColorStateList b(Context context, int i) {
        int c2 = U0.c(context, 2130968836);
        int b2 = U0.b(context, 2130968833);
        int b3 = a.b(c2, i);
        int b4 = a.b(c2, i);
        return new ColorStateList(new int[][]{U0.f4145b, U0.f4147d, U0.f4146c, U0.f4148f}, new int[]{b2, b3, b4, i});
    }

    public ColorStateList e(Context context, int i) {
        if (i == 2131230780) {
            return C0320a.I(context, 2131099669);
        }
        if (i == 2131230826) {
            return C0320a.I(context, 2131099672);
        }
        if (i == 2131230825) {
            int[][] iArr = new int[3][];
            int[] iArr2 = new int[3];
            ColorStateList d2 = U0.d(context, 2130968886);
            if (d2 == null || !d2.isStateful()) {
                iArr[0] = U0.f4145b;
                iArr2[0] = U0.b(context, 2130968886);
                iArr[1] = U0.e;
                iArr2[1] = U0.c(context, 2130968835);
                iArr[2] = U0.f4148f;
                iArr2[2] = U0.c(context, 2130968886);
            } else {
                int[] iArr3 = U0.f4145b;
                iArr[0] = iArr3;
                iArr2[0] = d2.getColorForState(iArr3, 0);
                iArr[1] = U0.e;
                iArr2[1] = U0.c(context, 2130968835);
                iArr[2] = U0.f4148f;
                iArr2[2] = d2.getDefaultColor();
            }
            return new ColorStateList(iArr, iArr2);
        } else if (i == 2131230768) {
            return b(context, U0.c(context, 2130968833));
        } else {
            if (i == 2131230762) {
                return b(context, 0);
            }
            if (i == 2131230767) {
                return b(context, U0.c(context, 2130968831));
            }
            if (i == 2131230821 || i == 2131230822) {
                return C0320a.I(context, 2131099671);
            }
            if (a((int[]) this.f2514b, i)) {
                return U0.d(context, 2130968837);
            }
            if (a((int[]) this.e, i)) {
                return C0320a.I(context, 2131099668);
            }
            if (a((int[]) this.f2517f, i)) {
                return C0320a.I(context, 2131099667);
            }
            if (i == 2131230818) {
                return C0320a.I(context, 2131099670);
            }
            return null;
        }
    }

    public b(Context context, Intent intent, BroadcastReceiver.PendingResult pendingResult) {
        this.f2513a = new android.support.v4.media.b(this);
        this.f2515c = context;
        this.f2516d = intent;
        this.e = pendingResult;
    }
}
