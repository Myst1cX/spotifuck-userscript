package G;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.Icon;
import android.net.Uri;
import android.os.Build;
import android.util.Log;
import java.lang.reflect.InvocationTargetException;

public abstract class c {
    public static Uri a(Object obj) {
        if (Build.VERSION.SDK_INT >= 28) {
            return e.d(obj);
        }
        try {
            return (Uri) obj.getClass().getMethod("getUri", (Class[]) null).invoke(obj, (Object[]) null);
        } catch (IllegalAccessException e) {
            Log.e("IconCompat", "Unable to get icon uri", e);
            return null;
        } catch (InvocationTargetException e2) {
            Log.e("IconCompat", "Unable to get icon uri", e2);
            return null;
        } catch (NoSuchMethodException e3) {
            Log.e("IconCompat", "Unable to get icon uri", e3);
            return null;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:22:0x007d  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x0097  */
    /* JADX WARNING: Removed duplicated region for block: B:66:0x017f  */
    /* JADX WARNING: Removed duplicated region for block: B:69:0x0188  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static android.graphics.drawable.Icon c(androidx.core.graphics.drawable.IconCompat r7, android.content.Context r8) {
        /*
            int r0 = r7.f1464a
            r1 = 0
            r2 = 26
            switch(r0) {
                case -1: goto L_0x018c;
                case 0: goto L_0x0008;
                case 1: goto L_0x0173;
                case 2: goto L_0x00fb;
                case 3: goto L_0x00ed;
                case 4: goto L_0x00e3;
                case 5: goto L_0x00c7;
                case 6: goto L_0x0010;
                default: goto L_0x0008;
            }
        L_0x0008:
            java.lang.IllegalArgumentException r7 = new java.lang.IllegalArgumentException
            java.lang.String r8 = "Unknown type"
            r7.<init>(r8)
            throw r7
        L_0x0010:
            int r0 = android.os.Build.VERSION.SDK_INT
            r3 = 30
            if (r0 < r3) goto L_0x0020
            android.net.Uri r8 = r7.d()
            android.graphics.drawable.Icon r8 = G.f.a(r8)
            goto L_0x017b
        L_0x0020:
            if (r8 == 0) goto L_0x00af
            android.net.Uri r3 = r7.d()
            java.lang.String r4 = r3.getScheme()
            java.lang.String r5 = "content"
            boolean r5 = r5.equals(r4)
            java.lang.String r6 = "IconCompat"
            if (r5 != 0) goto L_0x005f
            java.lang.String r5 = "file"
            boolean r4 = r5.equals(r4)
            if (r4 == 0) goto L_0x003d
            goto L_0x005f
        L_0x003d:
            java.io.FileInputStream r8 = new java.io.FileInputStream     // Catch:{ FileNotFoundException -> 0x004c }
            java.io.File r4 = new java.io.File     // Catch:{ FileNotFoundException -> 0x004c }
            java.lang.Object r5 = r7.f1465b     // Catch:{ FileNotFoundException -> 0x004c }
            java.lang.String r5 = (java.lang.String) r5     // Catch:{ FileNotFoundException -> 0x004c }
            r4.<init>(r5)     // Catch:{ FileNotFoundException -> 0x004c }
            r8.<init>(r4)     // Catch:{ FileNotFoundException -> 0x004c }
            goto L_0x007b
        L_0x004c:
            r8 = move-exception
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            java.lang.String r5 = "Unable to load image from path: "
            r4.<init>(r5)
            r4.append(r3)
            java.lang.String r3 = r4.toString()
            android.util.Log.w(r6, r3, r8)
            goto L_0x007a
        L_0x005f:
            android.content.ContentResolver r8 = r8.getContentResolver()     // Catch:{ Exception -> 0x0068 }
            java.io.InputStream r8 = r8.openInputStream(r3)     // Catch:{ Exception -> 0x0068 }
            goto L_0x007b
        L_0x0068:
            r8 = move-exception
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            java.lang.String r5 = "Unable to load image from URI: "
            r4.<init>(r5)
            r4.append(r3)
            java.lang.String r3 = r4.toString()
            android.util.Log.w(r6, r3, r8)
        L_0x007a:
            r8 = 0
        L_0x007b:
            if (r8 == 0) goto L_0x0097
            if (r0 < r2) goto L_0x0089
            android.graphics.Bitmap r8 = android.graphics.BitmapFactory.decodeStream(r8)
            android.graphics.drawable.Icon r8 = G.d.b(r8)
            goto L_0x017b
        L_0x0089:
            android.graphics.Bitmap r8 = android.graphics.BitmapFactory.decodeStream(r8)
            android.graphics.Bitmap r8 = androidx.core.graphics.drawable.IconCompat.a(r8, r1)
            android.graphics.drawable.Icon r8 = android.graphics.drawable.Icon.createWithBitmap(r8)
            goto L_0x017b
        L_0x0097:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "Cannot load adaptive icon from uri: "
            r0.<init>(r1)
            android.net.Uri r7 = r7.d()
            r0.append(r7)
            java.lang.String r7 = r0.toString()
            r8.<init>(r7)
            throw r8
        L_0x00af:
            java.lang.IllegalArgumentException r8 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "Context is required to resolve the file uri of the icon: "
            r0.<init>(r1)
            android.net.Uri r7 = r7.d()
            r0.append(r7)
            java.lang.String r7 = r0.toString()
            r8.<init>(r7)
            throw r8
        L_0x00c7:
            int r8 = android.os.Build.VERSION.SDK_INT
            if (r8 < r2) goto L_0x00d5
            java.lang.Object r8 = r7.f1465b
            android.graphics.Bitmap r8 = (android.graphics.Bitmap) r8
            android.graphics.drawable.Icon r8 = G.d.b(r8)
            goto L_0x017b
        L_0x00d5:
            java.lang.Object r8 = r7.f1465b
            android.graphics.Bitmap r8 = (android.graphics.Bitmap) r8
            android.graphics.Bitmap r8 = androidx.core.graphics.drawable.IconCompat.a(r8, r1)
            android.graphics.drawable.Icon r8 = android.graphics.drawable.Icon.createWithBitmap(r8)
            goto L_0x017b
        L_0x00e3:
            java.lang.Object r8 = r7.f1465b
            java.lang.String r8 = (java.lang.String) r8
            android.graphics.drawable.Icon r8 = android.graphics.drawable.Icon.createWithContentUri(r8)
            goto L_0x017b
        L_0x00ed:
            java.lang.Object r8 = r7.f1465b
            byte[] r8 = (byte[]) r8
            int r0 = r7.e
            int r1 = r7.f1468f
            android.graphics.drawable.Icon r8 = android.graphics.drawable.Icon.createWithData(r8, r0, r1)
            goto L_0x017b
        L_0x00fb:
            int r8 = r7.f1464a
            r0 = -1
            if (r8 != r0) goto L_0x013a
            int r1 = android.os.Build.VERSION.SDK_INT
            r2 = 23
            if (r1 < r2) goto L_0x013a
            java.lang.Object r8 = r7.f1465b
            java.lang.String r0 = "Unable to get icon package"
            java.lang.String r2 = "IconCompat"
            r3 = 28
            if (r1 < r3) goto L_0x0115
            java.lang.String r8 = G.e.b(r8)
            goto L_0x0158
        L_0x0115:
            r1 = 0
            java.lang.Class r3 = r8.getClass()     // Catch:{ IllegalAccessException -> 0x012b, InvocationTargetException -> 0x0129, NoSuchMethodException -> 0x0127 }
            java.lang.String r4 = "getResPackage"
            java.lang.reflect.Method r3 = r3.getMethod(r4, r1)     // Catch:{ IllegalAccessException -> 0x012b, InvocationTargetException -> 0x0129, NoSuchMethodException -> 0x0127 }
            java.lang.Object r8 = r3.invoke(r8, r1)     // Catch:{ IllegalAccessException -> 0x012b, InvocationTargetException -> 0x0129, NoSuchMethodException -> 0x0127 }
            java.lang.String r8 = (java.lang.String) r8     // Catch:{ IllegalAccessException -> 0x012b, InvocationTargetException -> 0x0129, NoSuchMethodException -> 0x0127 }
            goto L_0x0158
        L_0x0127:
            r8 = move-exception
            goto L_0x012d
        L_0x0129:
            r8 = move-exception
            goto L_0x0132
        L_0x012b:
            r8 = move-exception
            goto L_0x0136
        L_0x012d:
            android.util.Log.e(r2, r0, r8)
        L_0x0130:
            r8 = r1
            goto L_0x0158
        L_0x0132:
            android.util.Log.e(r2, r0, r8)
            goto L_0x0130
        L_0x0136:
            android.util.Log.e(r2, r0, r8)
            goto L_0x0130
        L_0x013a:
            r1 = 2
            if (r8 != r1) goto L_0x015f
            java.lang.String r8 = r7.f1471j
            if (r8 == 0) goto L_0x014b
            boolean r8 = android.text.TextUtils.isEmpty(r8)
            if (r8 == 0) goto L_0x0148
            goto L_0x014b
        L_0x0148:
            java.lang.String r8 = r7.f1471j
            goto L_0x0158
        L_0x014b:
            java.lang.Object r8 = r7.f1465b
            java.lang.String r8 = (java.lang.String) r8
            java.lang.String r1 = ":"
            java.lang.String[] r8 = r8.split(r1, r0)
            r0 = 0
            r8 = r8[r0]
        L_0x0158:
            int r0 = r7.e
            android.graphics.drawable.Icon r8 = android.graphics.drawable.Icon.createWithResource(r8, r0)
            goto L_0x017b
        L_0x015f:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "called getResPackage() on "
            r0.<init>(r1)
            r0.append(r7)
            java.lang.String r7 = r0.toString()
            r8.<init>(r7)
            throw r8
        L_0x0173:
            java.lang.Object r8 = r7.f1465b
            android.graphics.Bitmap r8 = (android.graphics.Bitmap) r8
            android.graphics.drawable.Icon r8 = android.graphics.drawable.Icon.createWithBitmap(r8)
        L_0x017b:
            android.content.res.ColorStateList r0 = r7.f1469g
            if (r0 == 0) goto L_0x0182
            r8.setTintList(r0)
        L_0x0182:
            android.graphics.PorterDuff$Mode r7 = r7.f1470h
            android.graphics.PorterDuff$Mode r0 = androidx.core.graphics.drawable.IconCompat.f1463k
            if (r7 == r0) goto L_0x018b
            r8.setTintMode(r7)
        L_0x018b:
            return r8
        L_0x018c:
            java.lang.Object r7 = r7.f1465b
            android.graphics.drawable.Icon r7 = (android.graphics.drawable.Icon) r7
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: G.c.c(androidx.core.graphics.drawable.IconCompat, android.content.Context):android.graphics.drawable.Icon");
    }

    public static Drawable b(Icon icon, Context context) {
        return icon.loadDrawable(context);
    }
}
