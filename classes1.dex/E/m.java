package E;

import android.content.res.ColorStateList;
import android.content.res.Configuration;
import android.content.res.Resources;

public final class m {

    /* renamed from: a  reason: collision with root package name */
    public final ColorStateList f110a;

    /* renamed from: b  reason: collision with root package name */
    public final Configuration f111b;

    /* renamed from: c  reason: collision with root package name */
    public final int f112c;

    public m(ColorStateList colorStateList, Configuration configuration, Resources.Theme theme) {
        int i;
        this.f110a = colorStateList;
        this.f111b = configuration;
        if (theme == null) {
            i = 0;
        } else {
            i = theme.hashCode();
        }
        this.f112c = i;
    }
}
