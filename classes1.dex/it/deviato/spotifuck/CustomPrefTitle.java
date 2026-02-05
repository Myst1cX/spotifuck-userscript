package it.deviato.spotifuck;

import android.content.Context;
import android.graphics.Color;
import android.util.AttributeSet;
import android.widget.TextView;
import androidx.preference.Preference;
import g0.y;

public class CustomPrefTitle extends Preference {
    public CustomPrefTitle(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public final void k(y yVar) {
        super.k(yVar);
        yVar.f3338a.setBackgroundColor(Color.parseColor("#B71C1C"));
        TextView textView = (TextView) yVar.r(16908310);
        if (textView != null) {
            textView.setTextColor(-1);
            textView.setTextSize(18.0f);
            textView.setTypeface(textView.getTypeface(), 1);
        }
        TextView textView2 = (TextView) yVar.r(16908304);
        if (textView2 != null) {
            textView2.setTextColor(-3355444);
            textView2.setTextSize(13.0f);
            textView2.setTypeface(textView.getTypeface(), 1);
        }
    }
}
