package o;

import android.content.Context;
import android.graphics.Rect;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.TextView;

public final class j1 {

    /* renamed from: a  reason: collision with root package name */
    public final Context f4233a;

    /* renamed from: b  reason: collision with root package name */
    public final View f4234b;

    /* renamed from: c  reason: collision with root package name */
    public final TextView f4235c;

    /* renamed from: d  reason: collision with root package name */
    public final WindowManager.LayoutParams f4236d;
    public final Rect e = new Rect();

    /* renamed from: f  reason: collision with root package name */
    public final int[] f4237f = new int[2];

    /* renamed from: g  reason: collision with root package name */
    public final int[] f4238g = new int[2];

    public j1(Context context) {
        WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams();
        this.f4236d = layoutParams;
        this.f4233a = context;
        View inflate = LayoutInflater.from(context).inflate(2131492891, (ViewGroup) null);
        this.f4234b = inflate;
        this.f4235c = (TextView) inflate.findViewById(2131296549);
        layoutParams.setTitle(j1.class.getSimpleName());
        layoutParams.packageName = context.getPackageName();
        layoutParams.type = 1002;
        layoutParams.width = -2;
        layoutParams.height = -2;
        layoutParams.format = -3;
        layoutParams.windowAnimations = 2131820548;
        layoutParams.flags = 24;
    }
}
