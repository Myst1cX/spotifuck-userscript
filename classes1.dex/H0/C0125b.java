package h0;

import android.content.res.AssetManager;
import android.os.Build;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.Serializable;
import java.util.concurrent.Executor;

/* renamed from: h0.b  reason: case insensitive filesystem */
public final class C0125b {

    /* renamed from: a  reason: collision with root package name */
    public final Executor f3049a;

    /* renamed from: b  reason: collision with root package name */
    public final C0128e f3050b;

    /* renamed from: c  reason: collision with root package name */
    public final byte[] f3051c;

    /* renamed from: d  reason: collision with root package name */
    public final File f3052d;
    public final String e;

    /* renamed from: f  reason: collision with root package name */
    public boolean f3053f = false;

    /* renamed from: g  reason: collision with root package name */
    public C0126c[] f3054g;

    /* renamed from: h  reason: collision with root package name */
    public byte[] f3055h;

    public final void b(int i, Serializable serializable) {
        this.f3049a.execute(new C0124a(this, i, serializable));
    }

    public C0125b(AssetManager assetManager, Executor executor, C0128e eVar, String str, File file) {
        this.f3049a = executor;
        this.f3050b = eVar;
        this.e = str;
        this.f3052d = file;
        int i = Build.VERSION.SDK_INT;
        byte[] bArr = null;
        if (i >= 24) {
            if (i < 31) {
                switch (i) {
                    case 24:
                    case 25:
                        bArr = C0129f.f3069h;
                        break;
                    case 26:
                        bArr = C0129f.f3068g;
                        break;
                    case 27:
                        bArr = C0129f.f3067f;
                        break;
                    case 28:
                    case 29:
                    case 30:
                        bArr = C0129f.e;
                        break;
                }
            } else {
                bArr = C0129f.f3066d;
            }
        }
        this.f3051c = bArr;
    }

    public final FileInputStream a(AssetManager assetManager, String str) {
        try {
            return assetManager.openFd(str).createInputStream();
        } catch (FileNotFoundException e2) {
            String message = e2.getMessage();
            if (message != null) {
                message.contains("compressed");
            }
            return null;
        }
    }
}
