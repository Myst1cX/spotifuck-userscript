package g0;

import K.j;
import android.app.Dialog;
import android.content.DialogInterface;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.TextView;
import androidx.fragment.app.C0059m;
import androidx.fragment.app.r;
import androidx.preference.DialogPreference;
import androidx.preference.Preference;
import androidx.preference.PreferenceScreen;
import h.C0115f;
import h.C0118i;

public abstract class p extends C0059m implements DialogInterface.OnClickListener {

    /* renamed from: n0  reason: collision with root package name */
    public DialogPreference f2571n0;

    /* renamed from: o0  reason: collision with root package name */
    public CharSequence f2572o0;

    /* renamed from: p0  reason: collision with root package name */
    public CharSequence f2573p0;

    /* renamed from: q0  reason: collision with root package name */
    public CharSequence f2574q0;

    /* renamed from: r0  reason: collision with root package name */
    public CharSequence f2575r0;

    /* renamed from: s0  reason: collision with root package name */
    public int f2576s0;

    /* renamed from: t0  reason: collision with root package name */
    public BitmapDrawable f2577t0;

    /* renamed from: u0  reason: collision with root package name */
    public int f2578u0;

    public final Dialog K() {
        this.f2578u0 = -2;
        j jVar = new j(F());
        CharSequence charSequence = this.f2572o0;
        C0115f fVar = (C0115f) jVar.f333g;
        fVar.f2965d = charSequence;
        fVar.f2964c = this.f2577t0;
        fVar.f2967g = this.f2573p0;
        fVar.f2968h = this;
        fVar.i = this.f2574q0;
        fVar.f2969j = this;
        F();
        int i = this.f2576s0;
        View view = null;
        if (i != 0) {
            LayoutInflater layoutInflater = this.f1742O;
            if (layoutInflater == null) {
                layoutInflater = x((Bundle) null);
                this.f1742O = layoutInflater;
            }
            view = layoutInflater.inflate(i, (ViewGroup) null);
        }
        if (view != null) {
            M(view);
            fVar.f2974o = view;
        } else {
            fVar.f2966f = this.f2575r0;
        }
        O(jVar);
        C0118i a2 = jVar.a();
        if (this instanceof C0101d) {
            Window window = a2.getWindow();
            if (Build.VERSION.SDK_INT >= 30) {
                o.a(window);
            } else {
                C0101d dVar = (C0101d) this;
                dVar.f2557y0 = SystemClock.currentThreadTimeMillis();
                dVar.P();
            }
        }
        return a2;
    }

    public abstract void N(boolean z2);

    public final DialogPreference L() {
        PreferenceScreen preferenceScreen;
        if (this.f2571n0 == null) {
            Bundle bundle = this.f1756k;
            if (bundle != null) {
                String string = bundle.getString("key");
                w wVar = ((r) l(true)).f2584a0;
                Preference preference = null;
                if (!(wVar == null || (preferenceScreen = wVar.f2610g) == null)) {
                    preference = preferenceScreen.w(string);
                }
                this.f2571n0 = (DialogPreference) preference;
            } else {
                throw new IllegalStateException("Fragment " + this + " does not have any arguments.");
            }
        }
        return this.f2571n0;
    }

    public void O(j jVar) {
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        this.f2578u0 = i;
    }

    public void M(View view) {
        int i;
        View findViewById = view.findViewById(16908299);
        if (findViewById != null) {
            CharSequence charSequence = this.f2575r0;
            if (!TextUtils.isEmpty(charSequence)) {
                if (findViewById instanceof TextView) {
                    ((TextView) findViewById).setText(charSequence);
                }
                i = 0;
            } else {
                i = 8;
            }
            if (findViewById.getVisibility() != i) {
                findViewById.setVisibility(i);
            }
        }
    }

    public final void onDismiss(DialogInterface dialogInterface) {
        boolean z2;
        super.onDismiss(dialogInterface);
        if (this.f2578u0 == -1) {
            z2 = true;
        } else {
            z2 = false;
        }
        N(z2);
    }

    public void t(Bundle bundle) {
        PreferenceScreen preferenceScreen;
        super.t(bundle);
        r l2 = l(true);
        if (l2 instanceof r) {
            r rVar = (r) l2;
            Bundle bundle2 = this.f1756k;
            if (bundle2 != null) {
                String string = bundle2.getString("key");
                if (bundle == null) {
                    w wVar = rVar.f2584a0;
                    Preference preference = null;
                    if (!(wVar == null || (preferenceScreen = wVar.f2610g) == null)) {
                        preference = preferenceScreen.w(string);
                    }
                    DialogPreference dialogPreference = (DialogPreference) preference;
                    this.f2571n0 = dialogPreference;
                    this.f2572o0 = dialogPreference.f1869M;
                    this.f2573p0 = dialogPreference.f1872P;
                    this.f2574q0 = dialogPreference.f1873Q;
                    this.f2575r0 = dialogPreference.f1870N;
                    this.f2576s0 = dialogPreference.f1874R;
                    Drawable drawable = dialogPreference.f1871O;
                    if (drawable == null || (drawable instanceof BitmapDrawable)) {
                        this.f2577t0 = (BitmapDrawable) drawable;
                        return;
                    }
                    Bitmap createBitmap = Bitmap.createBitmap(drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight(), Bitmap.Config.ARGB_8888);
                    Canvas canvas = new Canvas(createBitmap);
                    drawable.setBounds(0, 0, canvas.getWidth(), canvas.getHeight());
                    drawable.draw(canvas);
                    this.f2577t0 = new BitmapDrawable(k(), createBitmap);
                    return;
                }
                this.f2572o0 = bundle.getCharSequence("PreferenceDialogFragment.title");
                this.f2573p0 = bundle.getCharSequence("PreferenceDialogFragment.positiveText");
                this.f2574q0 = bundle.getCharSequence("PreferenceDialogFragment.negativeText");
                this.f2575r0 = bundle.getCharSequence("PreferenceDialogFragment.message");
                this.f2576s0 = bundle.getInt("PreferenceDialogFragment.layout", 0);
                Bitmap bitmap = (Bitmap) bundle.getParcelable("PreferenceDialogFragment.icon");
                if (bitmap != null) {
                    this.f2577t0 = new BitmapDrawable(k(), bitmap);
                    return;
                }
                return;
            }
            throw new IllegalStateException("Fragment " + this + " does not have any arguments.");
        }
        throw new IllegalStateException("Target fragment must implement TargetFragment interface");
    }

    public void y(Bundle bundle) {
        super.y(bundle);
        bundle.putCharSequence("PreferenceDialogFragment.title", this.f2572o0);
        bundle.putCharSequence("PreferenceDialogFragment.positiveText", this.f2573p0);
        bundle.putCharSequence("PreferenceDialogFragment.negativeText", this.f2574q0);
        bundle.putCharSequence("PreferenceDialogFragment.message", this.f2575r0);
        bundle.putInt("PreferenceDialogFragment.layout", this.f2576s0);
        BitmapDrawable bitmapDrawable = this.f2577t0;
        if (bitmapDrawable != null) {
            bundle.putParcelable("PreferenceDialogFragment.icon", bitmapDrawable.getBitmap());
        }
    }
}
