package g0;

import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.util.SparseArray;
import android.view.View;
import android.widget.TextView;
import j0.a0;

public final class y extends a0 {

    /* renamed from: t  reason: collision with root package name */
    public final Drawable f2616t;

    /* renamed from: u  reason: collision with root package name */
    public final ColorStateList f2617u;

    /* renamed from: v  reason: collision with root package name */
    public final SparseArray f2618v;

    /* renamed from: w  reason: collision with root package name */
    public boolean f2619w;

    /* renamed from: x  reason: collision with root package name */
    public boolean f2620x;

    public final View r(int i) {
        SparseArray sparseArray = this.f2618v;
        View view = (View) sparseArray.get(i);
        if (view != null) {
            return view;
        }
        View findViewById = this.f3338a.findViewById(i);
        if (findViewById != null) {
            sparseArray.put(i, findViewById);
        }
        return findViewById;
    }

    public y(View view) {
        super(view);
        SparseArray sparseArray = new SparseArray(4);
        this.f2618v = sparseArray;
        TextView textView = (TextView) view.findViewById(16908310);
        sparseArray.put(16908310, textView);
        sparseArray.put(16908304, view.findViewById(16908304));
        sparseArray.put(16908294, view.findViewById(16908294));
        sparseArray.put(2131296491, view.findViewById(2131296491));
        sparseArray.put(16908350, view.findViewById(16908350));
        this.f2616t = view.getBackground();
        if (textView != null) {
            this.f2617u = textView.getTextColors();
        }
    }
}
