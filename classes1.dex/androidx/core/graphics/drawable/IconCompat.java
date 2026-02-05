package androidx.core.graphics.drawable;

import G.c;
import G.e;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.Shader;
import android.graphics.drawable.Icon;
import android.net.Uri;
import android.os.Build;
import android.os.Parcelable;
import android.util.Log;
import androidx.versionedparcelable.CustomVersionedParcelable;
import it.deviato.spotifuck.WebService;
import java.lang.reflect.InvocationTargetException;

public class IconCompat extends CustomVersionedParcelable {

    /* renamed from: k  reason: collision with root package name */
    public static final PorterDuff.Mode f1463k = PorterDuff.Mode.SRC_IN;

    /* renamed from: a  reason: collision with root package name */
    public int f1464a;

    /* renamed from: b  reason: collision with root package name */
    public Object f1465b;

    /* renamed from: c  reason: collision with root package name */
    public byte[] f1466c;

    /* renamed from: d  reason: collision with root package name */
    public Parcelable f1467d;
    public int e;

    /* renamed from: f  reason: collision with root package name */
    public int f1468f;

    /* renamed from: g  reason: collision with root package name */
    public ColorStateList f1469g;

    /* renamed from: h  reason: collision with root package name */
    public PorterDuff.Mode f1470h;
    public String i;

    /* renamed from: j  reason: collision with root package name */
    public String f1471j;

    public IconCompat() {
        this.f1464a = -1;
        this.f1466c = null;
        this.f1467d = null;
        this.e = 0;
        this.f1468f = 0;
        this.f1469g = null;
        this.f1470h = f1463k;
        this.i = null;
    }

    public final int c() {
        int i2;
        int i3 = this.f1464a;
        if (i3 == -1 && (i2 = Build.VERSION.SDK_INT) >= 23) {
            Object obj = this.f1465b;
            if (i2 >= 28) {
                return e.a(obj);
            }
            try {
                return ((Integer) obj.getClass().getMethod("getResId", (Class[]) null).invoke(obj, (Object[]) null)).intValue();
            } catch (IllegalAccessException e2) {
                Log.e("IconCompat", "Unable to get icon resource", e2);
                return 0;
            } catch (InvocationTargetException e3) {
                Log.e("IconCompat", "Unable to get icon resource", e3);
                return 0;
            } catch (NoSuchMethodException e4) {
                Log.e("IconCompat", "Unable to get icon resource", e4);
                return 0;
            }
        } else if (i3 == 2) {
            return this.e;
        } else {
            throw new IllegalStateException("called getResId() on " + this);
        }
    }

    public final Uri d() {
        int i2 = this.f1464a;
        if (i2 == -1 && Build.VERSION.SDK_INT >= 23) {
            return c.a(this.f1465b);
        }
        if (i2 == 4 || i2 == 6) {
            return Uri.parse((String) this.f1465b);
        }
        throw new IllegalStateException("called getUri() on " + this);
    }

    public final Icon e(WebService webService) {
        if (Build.VERSION.SDK_INT >= 23) {
            return c.c(this, webService);
        }
        throw new UnsupportedOperationException("This method is only supported on API level 23+");
    }

    public final String toString() {
        String str;
        if (this.f1464a == -1) {
            return String.valueOf(this.f1465b);
        }
        StringBuilder sb = new StringBuilder("Icon(typ=");
        switch (this.f1464a) {
            case 1:
                str = "BITMAP";
                break;
            case 2:
                str = "RESOURCE";
                break;
            case 3:
                str = "DATA";
                break;
            case 4:
                str = "URI";
                break;
            case 5:
                str = "BITMAP_MASKABLE";
                break;
            case 6:
                str = "URI_MASKABLE";
                break;
            default:
                str = "UNKNOWN";
                break;
        }
        sb.append(str);
        switch (this.f1464a) {
            case 1:
            case 5:
                sb.append(" size=");
                sb.append(((Bitmap) this.f1465b).getWidth());
                sb.append("x");
                sb.append(((Bitmap) this.f1465b).getHeight());
                break;
            case 2:
                sb.append(" pkg=");
                sb.append(this.f1471j);
                sb.append(" id=");
                sb.append(String.format("0x%08x", new Object[]{Integer.valueOf(c())}));
                break;
            case 3:
                sb.append(" len=");
                sb.append(this.e);
                if (this.f1468f != 0) {
                    sb.append(" off=");
                    sb.append(this.f1468f);
                    break;
                }
                break;
            case 4:
            case 6:
                sb.append(" uri=");
                sb.append(this.f1465b);
                break;
        }
        if (this.f1469g != null) {
            sb.append(" tint=");
            sb.append(this.f1469g);
        }
        if (this.f1470h != f1463k) {
            sb.append(" mode=");
            sb.append(this.f1470h);
        }
        sb.append(")");
        return sb.toString();
    }

    public static Bitmap a(Bitmap bitmap, boolean z2) {
        int min = (int) (((float) Math.min(bitmap.getWidth(), bitmap.getHeight())) * 0.6666667f);
        Bitmap createBitmap = Bitmap.createBitmap(min, min, Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(createBitmap);
        Paint paint = new Paint(3);
        float f2 = (float) min;
        float f3 = 0.5f * f2;
        float f4 = 0.9166667f * f3;
        if (z2) {
            float f5 = 0.010416667f * f2;
            paint.setColor(0);
            paint.setShadowLayer(f5, 0.0f, f2 * 0.020833334f, 1023410176);
            canvas.drawCircle(f3, f3, f4, paint);
            paint.setShadowLayer(f5, 0.0f, 0.0f, 503316480);
            canvas.drawCircle(f3, f3, f4, paint);
            paint.clearShadowLayer();
        }
        paint.setColor(-16777216);
        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
        BitmapShader bitmapShader = new BitmapShader(bitmap, tileMode, tileMode);
        Matrix matrix = new Matrix();
        matrix.setTranslate(((float) (-(bitmap.getWidth() - min))) / 2.0f, ((float) (-(bitmap.getHeight() - min))) / 2.0f);
        bitmapShader.setLocalMatrix(matrix);
        paint.setShader(bitmapShader);
        canvas.drawCircle(f3, f3, f4, paint);
        canvas.setBitmap((Bitmap) null);
        return createBitmap;
    }

    public static IconCompat b(Resources resources, String str, int i2) {
        str.getClass();
        if (i2 != 0) {
            IconCompat iconCompat = new IconCompat(2);
            iconCompat.e = i2;
            if (resources != null) {
                try {
                    iconCompat.f1465b = resources.getResourceName(i2);
                } catch (Resources.NotFoundException unused) {
                    throw new IllegalArgumentException("Icon resource cannot be found");
                }
            } else {
                iconCompat.f1465b = str;
            }
            iconCompat.f1471j = str;
            return iconCompat;
        }
        throw new IllegalArgumentException("Drawable resource ID must not be 0");
    }

    public IconCompat(int i2) {
        this.f1466c = null;
        this.f1467d = null;
        this.e = 0;
        this.f1468f = 0;
        this.f1469g = null;
        this.f1470h = f1463k;
        this.i = null;
        this.f1464a = i2;
    }
}
