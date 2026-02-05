package g0;

import android.content.Context;
import android.content.SharedPreferences;
import androidx.preference.PreferenceScreen;

public final class w {

    /* renamed from: a  reason: collision with root package name */
    public final Context f2605a;

    /* renamed from: b  reason: collision with root package name */
    public long f2606b = 0;

    /* renamed from: c  reason: collision with root package name */
    public SharedPreferences f2607c;

    /* renamed from: d  reason: collision with root package name */
    public SharedPreferences.Editor f2608d;
    public boolean e;

    /* renamed from: f  reason: collision with root package name */
    public final String f2609f;

    /* renamed from: g  reason: collision with root package name */
    public PreferenceScreen f2610g;

    /* renamed from: h  reason: collision with root package name */
    public r f2611h;
    public r i;

    /* renamed from: j  reason: collision with root package name */
    public r f2612j;

    public final long b() {
        long j2;
        synchronized (this) {
            j2 = this.f2606b;
            this.f2606b = 1 + j2;
        }
        return j2;
    }

    public final SharedPreferences.Editor a() {
        if (!this.e) {
            return c().edit();
        }
        if (this.f2608d == null) {
            this.f2608d = c().edit();
        }
        return this.f2608d;
    }

    public final SharedPreferences c() {
        if (this.f2607c == null) {
            this.f2607c = this.f2605a.getSharedPreferences(this.f2609f, 0);
        }
        return this.f2607c;
    }

    public w(Context context) {
        this.f2605a = context;
        this.f2609f = context.getPackageName() + "_preferences";
        this.f2607c = null;
    }
}
