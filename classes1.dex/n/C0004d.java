package N;

import android.content.ClipData;
import android.net.Uri;
import android.os.Bundle;
import android.view.ContentInfo;
import android.view.View;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import r0.C0324a;

/* renamed from: N.d  reason: case insensitive filesystem */
public final class C0004d implements C0003c, C0005e {

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ int f529f;

    /* renamed from: g  reason: collision with root package name */
    public Object f530g;

    /* renamed from: h  reason: collision with root package name */
    public int f531h;
    public int i;

    /* renamed from: j  reason: collision with root package name */
    public Object f532j;

    /* renamed from: k  reason: collision with root package name */
    public Cloneable f533k;

    public /* synthetic */ C0004d() {
        this.f529f = 0;
    }

    public ContentInfo n() {
        return null;
    }

    /* JADX WARNING: type inference failed for: r0v2, types: [java.lang.Cloneable, int[]] */
    public C0004d(View view) {
        this.f529f = 2;
        this.f533k = new int[2];
        this.f532j = view;
    }

    public int a() {
        return this.i;
    }

    public void b(Bundle bundle) {
        this.f533k = bundle;
    }

    public void d(Uri uri) {
        this.f532j = uri;
    }

    public int f() {
        return this.f531h;
    }

    public ClipData i() {
        return (ClipData) this.f530g;
    }

    public C0006f j() {
        return new C0006f(new C0004d(this));
    }

    public void p(int i2) {
        this.i = i2;
    }

    public String toString() {
        String str;
        String str2;
        String str3;
        switch (this.f529f) {
            case 1:
                StringBuilder sb = new StringBuilder("ContentInfoCompat{clip=");
                sb.append(((ClipData) this.f530g).getDescription());
                sb.append(", source=");
                int i2 = this.f531h;
                if (i2 == 0) {
                    str = "SOURCE_APP";
                } else if (i2 == 1) {
                    str = "SOURCE_CLIPBOARD";
                } else if (i2 == 2) {
                    str = "SOURCE_INPUT_METHOD";
                } else if (i2 == 3) {
                    str = "SOURCE_DRAG_AND_DROP";
                } else if (i2 == 4) {
                    str = "SOURCE_AUTOFILL";
                } else if (i2 != 5) {
                    str = String.valueOf(i2);
                } else {
                    str = "SOURCE_PROCESS_TEXT";
                }
                sb.append(str);
                sb.append(", flags=");
                int i3 = this.i;
                if ((i3 & 1) != 0) {
                    str2 = "FLAG_CONVERT_TO_PLAIN_TEXT";
                } else {
                    str2 = String.valueOf(i3);
                }
                sb.append(str2);
                String str4 = "";
                Uri uri = (Uri) this.f532j;
                if (uri == null) {
                    str3 = str4;
                } else {
                    str3 = ", hasLinkUri(" + uri.toString().length() + ")";
                }
                sb.append(str3);
                if (((Bundle) this.f533k) != null) {
                    str4 = ", hasExtras";
                }
                sb.append(str4);
                sb.append("}");
                return sb.toString();
            default:
                return super.toString();
        }
    }

    public void c(w0 w0Var, List list) {
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            j0 j0Var = (j0) it2.next();
            if ((j0Var.f559a.c() & 8) != 0) {
                ((View) this.f532j).setTranslationY((float) C0324a.c(this.i, 0, j0Var.f559a.b()));
                return;
            }
        }
    }

    public C0004d(C0004d dVar) {
        this.f529f = 1;
        ClipData clipData = (ClipData) dVar.f530g;
        clipData.getClass();
        this.f530g = clipData;
        int i2 = dVar.f531h;
        if (i2 < 0) {
            Locale locale = Locale.US;
            throw new IllegalArgumentException("source is out of range of [0, 5] (too low)");
        } else if (i2 <= 5) {
            this.f531h = i2;
            int i3 = dVar.i;
            if ((i3 & 1) == i3) {
                this.i = i3;
                this.f532j = (Uri) dVar.f532j;
                this.f533k = (Bundle) dVar.f533k;
                return;
            }
            throw new IllegalArgumentException("Requested flags 0x" + Integer.toHexString(i3) + ", but only 0x" + Integer.toHexString(1) + " are allowed");
        } else {
            Locale locale2 = Locale.US;
            throw new IllegalArgumentException("source is out of range of [0, 5] (too high)");
        }
    }
}
