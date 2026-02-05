package F;

import E.g;
import E.h;
import K.k;
import android.content.ContentResolver;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.graphics.fonts.Font;
import android.graphics.fonts.FontFamily;
import android.graphics.fonts.FontStyle;
import android.os.CancellationSignal;
import android.os.ParcelFileDescriptor;
import java.io.IOException;
import java.io.InputStream;
import p0.C0320a;

public final class l extends C0320a {
    public final Typeface t(Context context, g gVar, Resources resources, int i) {
        try {
            FontFamily.Builder builder = null;
            for (h hVar : gVar.f97a) {
                try {
                    Font build = new Font.Builder(resources, hVar.f102f).setWeight(hVar.f99b).setSlant(hVar.f100c ? 1 : 0).setTtcIndex(hVar.e).setFontVariationSettings(hVar.f101d).build();
                    if (builder == null) {
                        builder = new FontFamily.Builder(build);
                    } else {
                        builder.addFont(build);
                    }
                } catch (IOException unused) {
                }
            }
            if (builder == null) {
                return null;
            }
            FontFamily build2 = builder.build();
            return new Typeface.CustomFallbackBuilder(build2).setStyle(L0(build2, i).getStyle()).build();
        } catch (Exception unused2) {
            return null;
        }
    }

    public static Font L0(FontFamily fontFamily, int i) {
        int i2;
        int i3;
        if ((i & 1) != 0) {
            i2 = 700;
        } else {
            i2 = 400;
        }
        if ((i & 2) != 0) {
            i3 = 1;
        } else {
            i3 = 0;
        }
        FontStyle fontStyle = new FontStyle(i2, i3);
        Font font = fontFamily.getFont(0);
        int M02 = M0(fontStyle, font.getStyle());
        for (int i4 = 1; i4 < fontFamily.getSize(); i4++) {
            Font font2 = fontFamily.getFont(i4);
            int M03 = M0(fontStyle, font2.getStyle());
            if (M03 < M02) {
                font = font2;
                M02 = M03;
            }
        }
        return font;
    }

    public final k D(int i, k[] kVarArr) {
        throw new RuntimeException("Do not use this function in API 29 or later.");
    }

    public final Typeface v(Context context, InputStream inputStream) {
        throw new RuntimeException("Do not use this function in API 29 or later.");
    }

    public final Typeface w(Context context, Resources resources, int i, String str, int i2) {
        try {
            Font build = new Font.Builder(resources, i).build();
            return new Typeface.CustomFallbackBuilder(new FontFamily.Builder(build).build()).setStyle(build.getStyle()).build();
        } catch (Exception unused) {
            return null;
        }
    }

    public static int M0(FontStyle fontStyle, FontStyle fontStyle2) {
        int i;
        int abs = Math.abs(fontStyle.getWeight() - fontStyle2.getWeight()) / 100;
        if (fontStyle.getSlant() == fontStyle2.getSlant()) {
            i = 0;
        } else {
            i = 2;
        }
        return abs + i;
    }

    public final Typeface u(Context context, k[] kVarArr, int i) {
        ParcelFileDescriptor openFileDescriptor;
        ContentResolver contentResolver = context.getContentResolver();
        try {
            FontFamily.Builder builder = null;
            for (k kVar : kVarArr) {
                try {
                    openFileDescriptor = contentResolver.openFileDescriptor(kVar.f334a, "r", (CancellationSignal) null);
                    if (openFileDescriptor != null) {
                        Font build = new Font.Builder(openFileDescriptor).setWeight(kVar.f336c).setSlant(kVar.f337d ? 1 : 0).setTtcIndex(kVar.f335b).build();
                        if (builder == null) {
                            builder = new FontFamily.Builder(build);
                        } else {
                            builder.addFont(build);
                        }
                    } else if (openFileDescriptor == null) {
                    }
                    openFileDescriptor.close();
                } catch (IOException unused) {
                } catch (Throwable th) {
                    th.addSuppressed(th);
                }
            }
            if (builder == null) {
                return null;
            }
            FontFamily build2 = builder.build();
            return new Typeface.CustomFallbackBuilder(build2).setStyle(L0(build2, i).getStyle()).build();
            throw th;
        } catch (Exception unused2) {
            return null;
        }
    }
}
