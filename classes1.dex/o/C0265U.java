package o;

import android.graphics.Typeface;
import android.view.View;
import android.widget.TextView;
import com.google.android.material.bottomsheet.BottomSheetBehavior;

/* renamed from: o.U  reason: case insensitive filesystem */
public final class C0265U implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f4140a = 0;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ int f4141b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ View f4142c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ Object f4143d;

    public C0265U(TextView textView, Typeface typeface, int i) {
        this.f4142c = textView;
        this.f4143d = typeface;
        this.f4141b = i;
    }

    public C0265U(BottomSheetBehavior bottomSheetBehavior, View view, int i) {
        this.f4143d = bottomSheetBehavior;
        this.f4142c = view;
        this.f4141b = i;
    }

    public final void run() {
        switch (this.f4140a) {
            case 0:
                int i = this.f4141b;
                ((TextView) this.f4142c).setTypeface((Typeface) this.f4143d, i);
                return;
            default:
                ((BottomSheetBehavior) this.f4143d).E(this.f4142c, this.f4141b, false);
                return;
        }
    }
}
