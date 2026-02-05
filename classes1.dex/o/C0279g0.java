package o;

import android.text.StaticLayout;
import android.widget.TextView;

/* renamed from: o.g0  reason: case insensitive filesystem */
public final class C0279g0 extends C0277f0 {
    public void a(StaticLayout.Builder builder, TextView textView) {
        builder.setTextDirection(textView.getTextDirectionHeuristic());
    }

    public boolean b(TextView textView) {
        return textView.isHorizontallyScrollable();
    }
}
