package X;

import android.widget.EditText;
import androidx.appcompat.widget.SwitchCompat;
import java.lang.ref.WeakReference;

public final class h extends androidx.emoji2.text.h {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f994a = 0;

    /* renamed from: b  reason: collision with root package name */
    public final WeakReference f995b;

    public h(EditText editText) {
        this.f995b = new WeakReference(editText);
    }

    public void a() {
        switch (this.f994a) {
            case 1:
                SwitchCompat switchCompat = (SwitchCompat) this.f995b.get();
                if (switchCompat != null) {
                    switchCompat.c();
                    return;
                }
                return;
            default:
                return;
        }
    }

    public final void b() {
        switch (this.f994a) {
            case 0:
                i.a((EditText) this.f995b.get(), 1);
                return;
            default:
                SwitchCompat switchCompat = (SwitchCompat) this.f995b.get();
                if (switchCompat != null) {
                    switchCompat.c();
                    return;
                }
                return;
        }
    }

    public h(SwitchCompat switchCompat) {
        this.f995b = new WeakReference(switchCompat);
    }
}
