package y;

import android.content.Context;
import android.graphics.Canvas;
import android.view.View;

public final class p extends View {

    /* renamed from: f  reason: collision with root package name */
    public boolean f5135f = true;

    public final void onMeasure(int i, int i2) {
        setMeasuredDimension(0, 0);
    }

    public final void draw(Canvas canvas) {
    }

    public void setFilterRedundantCalls(boolean z2) {
        this.f5135f = z2;
    }

    public void setVisibility(int i) {
    }

    public p(Context context) {
        super(context);
        super.setVisibility(8);
    }

    public void setGuidelineBegin(int i) {
        e eVar = (e) getLayoutParams();
        if (!this.f5135f || eVar.f4977a != i) {
            eVar.f4977a = i;
            setLayoutParams(eVar);
        }
    }

    public void setGuidelineEnd(int i) {
        e eVar = (e) getLayoutParams();
        if (!this.f5135f || eVar.f4979b != i) {
            eVar.f4979b = i;
            setLayoutParams(eVar);
        }
    }

    public void setGuidelinePercent(float f2) {
        e eVar = (e) getLayoutParams();
        if (!this.f5135f || eVar.f4981c != f2) {
            eVar.f4981c = f2;
            setLayoutParams(eVar);
        }
    }
}
