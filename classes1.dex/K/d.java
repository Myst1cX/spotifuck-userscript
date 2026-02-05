package K;

import E.b;
import android.content.ContentProviderClient;
import android.content.ContentUris;
import android.content.Context;
import android.content.pm.PackageManager;
import android.content.pm.ProviderInfo;
import android.content.pm.Signature;
import android.content.res.Resources;
import android.database.Cursor;
import android.net.Uri;
import android.os.Build;
import android.os.CancellationSignal;
import android.os.RemoteException;
import android.util.Log;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public abstract class d {

    /* renamed from: a  reason: collision with root package name */
    public static final b f315a = new Object();

    /* JADX WARNING: type inference failed for: r9v0, types: [K.k[], android.database.Cursor] */
    public static j a(Context context, e eVar) {
        ? r9;
        c cVar;
        Cursor cursor;
        int i;
        int i2;
        Uri withAppendedId;
        int i3;
        boolean z2;
        Context context2 = context;
        e eVar2 = eVar;
        PackageManager packageManager = context.getPackageManager();
        Resources resources = context.getResources();
        String str = eVar2.f316a;
        ProviderInfo resolveContentProvider = packageManager.resolveContentProvider(str, 0);
        if (resolveContentProvider != null) {
            String str2 = resolveContentProvider.packageName;
            String str3 = eVar2.f317b;
            if (str2.equals(str3)) {
                Signature[] signatureArr = packageManager.getPackageInfo(resolveContentProvider.packageName, 64).signatures;
                ArrayList arrayList = new ArrayList();
                for (Signature byteArray : signatureArr) {
                    arrayList.add(byteArray.toByteArray());
                }
                b bVar = f315a;
                Collections.sort(arrayList, bVar);
                List list = eVar2.f319d;
                if (list == null) {
                    list = b.l(resources, 0);
                }
                int i4 = 0;
                loop1:
                while (true) {
                    r9 = 0;
                    if (i4 >= list.size()) {
                        resolveContentProvider = r9;
                        break;
                    }
                    ArrayList arrayList2 = new ArrayList((Collection) list.get(i4));
                    Collections.sort(arrayList2, bVar);
                    if (arrayList.size() == arrayList2.size()) {
                        int i5 = 0;
                        while (i5 < arrayList.size()) {
                            if (Arrays.equals((byte[]) arrayList.get(i5), (byte[]) arrayList2.get(i5))) {
                                i5++;
                            }
                        }
                        break loop1;
                    }
                    i4++;
                }
                if (resolveContentProvider == null) {
                    return new j(1, (k[]) r9);
                }
                String str4 = resolveContentProvider.authority;
                ArrayList arrayList3 = new ArrayList();
                Uri build = new Uri.Builder().scheme("content").authority(str4).build();
                Uri build2 = new Uri.Builder().scheme("content").authority(str4).appendPath("file").build();
                if (Build.VERSION.SDK_INT < 24) {
                    cVar = new c(context2, build, 0);
                } else {
                    cVar = new c(context2, build, 1);
                }
                try {
                    String[] strArr = {"_id", "file_id", "font_ttc_index", "font_variation_settings", "font_weight", "font_italic", "result_code"};
                    String[] strArr2 = {eVar2.f318c};
                    switch (cVar.f313a) {
                        case 0:
                            cursor = null;
                            ContentProviderClient contentProviderClient = cVar.f314b;
                            if (contentProviderClient != null) {
                                try {
                                    cursor = contentProviderClient.query(build, strArr, "query = ?", strArr2, (String) null, (CancellationSignal) null);
                                    break;
                                } catch (RemoteException e) {
                                    Log.w("FontsProvider", "Unable to query the content provider", e);
                                    break;
                                }
                            }
                            break;
                        default:
                            cursor = null;
                            ContentProviderClient contentProviderClient2 = cVar.f314b;
                            if (contentProviderClient2 != null) {
                                cursor = contentProviderClient2.query(build, strArr, "query = ?", strArr2, (String) null, (CancellationSignal) null);
                                break;
                            }
                            break;
                    }
                } catch (RemoteException e2) {
                    Log.w("FontsProvider", "Unable to query the content provider", e2);
                } catch (Throwable th) {
                    if (r9 != 0) {
                        r9.close();
                    }
                    cVar.a();
                    throw th;
                }
                Cursor cursor2 = cursor;
                if (cursor2 != null && cursor2.getCount() > 0) {
                    int columnIndex = cursor2.getColumnIndex("result_code");
                    arrayList3 = new ArrayList();
                    int columnIndex2 = cursor2.getColumnIndex("_id");
                    int columnIndex3 = cursor2.getColumnIndex("file_id");
                    int columnIndex4 = cursor2.getColumnIndex("font_ttc_index");
                    int columnIndex5 = cursor2.getColumnIndex("font_weight");
                    int columnIndex6 = cursor2.getColumnIndex("font_italic");
                    while (cursor2.moveToNext()) {
                        if (columnIndex != -1) {
                            i = cursor2.getInt(columnIndex);
                        } else {
                            i = 0;
                        }
                        if (columnIndex4 != -1) {
                            i2 = cursor2.getInt(columnIndex4);
                        } else {
                            i2 = 0;
                        }
                        if (columnIndex3 == -1) {
                            withAppendedId = ContentUris.withAppendedId(build, cursor2.getLong(columnIndex2));
                        } else {
                            withAppendedId = ContentUris.withAppendedId(build2, cursor2.getLong(columnIndex3));
                        }
                        Uri uri = withAppendedId;
                        if (columnIndex5 != -1) {
                            i3 = cursor2.getInt(columnIndex5);
                        } else {
                            i3 = 400;
                        }
                        if (columnIndex6 == -1 || cursor2.getInt(columnIndex6) != 1) {
                            z2 = false;
                        } else {
                            z2 = true;
                        }
                        arrayList3.add(new k(uri, i2, i3, z2, i));
                    }
                }
                if (cursor2 != null) {
                    cursor2.close();
                }
                cVar.a();
                return new j(0, (k[]) arrayList3.toArray(new k[0]));
            }
            throw new PackageManager.NameNotFoundException("Found content provider " + str + ", but package was not " + str3);
        }
        throw new PackageManager.NameNotFoundException("No package found for authority: " + str);
    }
}
