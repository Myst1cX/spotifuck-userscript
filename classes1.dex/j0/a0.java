package j0;

import N.Q;
import android.util.Log;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.WeakHashMap;

public abstract class a0 {

    /* renamed from: s  reason: collision with root package name */
    public static final List f3337s = Collections.emptyList();

    /* renamed from: a  reason: collision with root package name */
    public final View f3338a;

    /* renamed from: b  reason: collision with root package name */
    public WeakReference f3339b;

    /* renamed from: c  reason: collision with root package name */
    public int f3340c = -1;

    /* renamed from: d  reason: collision with root package name */
    public int f3341d = -1;
    public long e = -1;

    /* renamed from: f  reason: collision with root package name */
    public int f3342f = -1;

    /* renamed from: g  reason: collision with root package name */
    public int f3343g = -1;

    /* renamed from: h  reason: collision with root package name */
    public a0 f3344h = null;
    public a0 i = null;

    /* renamed from: j  reason: collision with root package name */
    public int f3345j;

    /* renamed from: k  reason: collision with root package name */
    public ArrayList f3346k = null;

    /* renamed from: l  reason: collision with root package name */
    public List f3347l = null;

    /* renamed from: m  reason: collision with root package name */
    public int f3348m = 0;

    /* renamed from: n  reason: collision with root package name */
    public Q f3349n = null;

    /* renamed from: o  reason: collision with root package name */
    public boolean f3350o = false;

    /* renamed from: p  reason: collision with root package name */
    public int f3351p = 0;

    /* renamed from: q  reason: collision with root package name */
    public int f3352q = -1;

    /* renamed from: r  reason: collision with root package name */
    public RecyclerView f3353r;

    public final void n() {
        this.f3345j = 0;
        this.f3340c = -1;
        this.f3341d = -1;
        this.e = -1;
        this.f3343g = -1;
        this.f3348m = 0;
        this.f3344h = null;
        this.i = null;
        ArrayList arrayList = this.f3346k;
        if (arrayList != null) {
            arrayList.clear();
        }
        this.f3345j &= -1025;
        this.f3351p = 0;
        this.f3352q = -1;
        RecyclerView.j(this);
    }

    public final void o(boolean z2) {
        int i2;
        int i3 = this.f3348m;
        if (z2) {
            i2 = i3 - 1;
        } else {
            i2 = i3 + 1;
        }
        this.f3348m = i2;
        if (i2 < 0) {
            this.f3348m = 0;
            Log.e("View", "isRecyclable decremented below 0: unmatched pair of setIsRecyable() calls for " + this);
        } else if (!z2 && i2 == 1) {
            this.f3345j |= 16;
        } else if (z2 && i2 == 0) {
            this.f3345j &= -17;
        }
    }

    public final void a(int i2) {
        this.f3345j = i2 | this.f3345j;
    }

    public final int b() {
        int i2 = this.f3343g;
        if (i2 == -1) {
            return this.f3340c;
        }
        return i2;
    }

    public final List c() {
        ArrayList arrayList;
        int i2 = this.f3345j & 1024;
        List list = f3337s;
        if (i2 != 0 || (arrayList = this.f3346k) == null || arrayList.size() == 0) {
            return list;
        }
        return this.f3347l;
    }

    public final boolean d(int i2) {
        if ((i2 & this.f3345j) != 0) {
            return true;
        }
        return false;
    }

    public final boolean e() {
        View view = this.f3338a;
        if (view.getParent() == null || view.getParent() == this.f3353r) {
            return false;
        }
        return true;
    }

    public final boolean f() {
        if ((this.f3345j & 1) != 0) {
            return true;
        }
        return false;
    }

    public final boolean g() {
        if ((this.f3345j & 4) != 0) {
            return true;
        }
        return false;
    }

    public final boolean h() {
        if ((this.f3345j & 16) == 0) {
            WeakHashMap weakHashMap = Q.f509a;
            if (!this.f3338a.hasTransientState()) {
                return true;
            }
        }
        return false;
    }

    public final boolean i() {
        if ((this.f3345j & 8) != 0) {
            return true;
        }
        return false;
    }

    public final boolean j() {
        if (this.f3349n != null) {
            return true;
        }
        return false;
    }

    public final boolean k() {
        if ((this.f3345j & 256) != 0) {
            return true;
        }
        return false;
    }

    public final boolean l() {
        if ((this.f3345j & 2) != 0) {
            return true;
        }
        return false;
    }

    public final void m(int i2, boolean z2) {
        if (this.f3341d == -1) {
            this.f3341d = this.f3340c;
        }
        if (this.f3343g == -1) {
            this.f3343g = this.f3340c;
        }
        if (z2) {
            this.f3343g += i2;
        }
        this.f3340c += i2;
        View view = this.f3338a;
        if (view.getLayoutParams() != null) {
            ((L) view.getLayoutParams()).f3292c = true;
        }
    }

    public final boolean p() {
        if ((this.f3345j & 128) != 0) {
            return true;
        }
        return false;
    }

    public final boolean q() {
        if ((this.f3345j & 32) != 0) {
            return true;
        }
        return false;
    }

    public a0(View view) {
        if (view != null) {
            this.f3338a = view;
            return;
        }
        throw new IllegalArgumentException("itemView may not be null");
    }

    public final String toString() {
        String str;
        String str2;
        if (getClass().isAnonymousClass()) {
            str = "ViewHolder";
        } else {
            str = getClass().getSimpleName();
        }
        StringBuilder sb = new StringBuilder(str + "{" + Integer.toHexString(hashCode()) + " position=" + this.f3340c + " id=" + this.e + ", oldPos=" + this.f3341d + ", pLpos:" + this.f3343g);
        if (j()) {
            sb.append(" scrap ");
            if (this.f3350o) {
                str2 = "[changeScrap]";
            } else {
                str2 = "[attachedScrap]";
            }
            sb.append(str2);
        }
        if (g()) {
            sb.append(" invalid");
        }
        if (!f()) {
            sb.append(" unbound");
        }
        if ((this.f3345j & 2) != 0) {
            sb.append(" update");
        }
        if (i()) {
            sb.append(" removed");
        }
        if (p()) {
            sb.append(" ignored");
        }
        if (k()) {
            sb.append(" tmpDetached");
        }
        if (!h()) {
            sb.append(" not recyclable(" + this.f3348m + ")");
        }
        if ((this.f3345j & 512) != 0 || g()) {
            sb.append(" undefined adapter position");
        }
        if (this.f3338a.getParent() == null) {
            sb.append(" no parent");
        }
        sb.append("}");
        return sb.toString();
    }
}
