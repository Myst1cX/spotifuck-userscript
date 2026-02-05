package androidx.appcompat.app;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.widget.ListView;
import g.C0096a;

public class AlertController$RecycleListView extends ListView {

    /* renamed from: f  reason: collision with root package name */
    public final int f1220f;

    /* renamed from: g  reason: collision with root package name */
    public final int f1221g;

    public AlertController$RecycleListView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C0096a.f2536t);
        this.f1221g = obtainStyledAttributes.getDimensionPixelOffset(0, -1);
        this.f1220f = obtainStyledAttributes.getDimensionPixelOffset(1, -1);
    }
}
