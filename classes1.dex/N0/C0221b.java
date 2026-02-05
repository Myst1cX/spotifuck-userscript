package n0;

import android.graphics.PointF;
import android.graphics.Rect;
import android.util.Property;
import android.view.View;
import androidx.appcompat.widget.SwitchCompat;

/* renamed from: n0.b  reason: case insensitive filesystem */
public final class C0221b extends Property {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f3966a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0221b(Class cls, String str, int i) {
        super(cls, str);
        this.f3966a = i;
    }

    public final Object get(Object obj) {
        switch (this.f3966a) {
            case 0:
                C0224e eVar = (C0224e) obj;
                return null;
            case 1:
                C0224e eVar2 = (C0224e) obj;
                return null;
            case 2:
                View view = (View) obj;
                return null;
            case 3:
                View view2 = (View) obj;
                return null;
            case 4:
                View view3 = (View) obj;
                return null;
            case 5:
                return Float.valueOf(C0242w.f4031a.f((View) obj));
            case 6:
                return ((View) obj).getClipBounds();
            default:
                return Float.valueOf(((SwitchCompat) obj).f1338E);
        }
    }

    public final void set(Object obj, Object obj2) {
        switch (this.f3966a) {
            case 0:
                C0224e eVar = (C0224e) obj;
                PointF pointF = (PointF) obj2;
                eVar.getClass();
                eVar.f3969a = Math.round(pointF.x);
                int round = Math.round(pointF.y);
                eVar.f3970b = round;
                int i = eVar.f3973f + 1;
                eVar.f3973f = i;
                if (i == eVar.f3974g) {
                    C0242w.a(eVar.e, eVar.f3969a, round, eVar.f3971c, eVar.f3972d);
                    eVar.f3973f = 0;
                    eVar.f3974g = 0;
                    return;
                }
                return;
            case 1:
                C0224e eVar2 = (C0224e) obj;
                PointF pointF2 = (PointF) obj2;
                eVar2.getClass();
                eVar2.f3971c = Math.round(pointF2.x);
                int round2 = Math.round(pointF2.y);
                eVar2.f3972d = round2;
                int i2 = eVar2.f3974g + 1;
                eVar2.f3974g = i2;
                if (eVar2.f3973f == i2) {
                    C0242w.a(eVar2.e, eVar2.f3969a, eVar2.f3970b, eVar2.f3971c, round2);
                    eVar2.f3973f = 0;
                    eVar2.f3974g = 0;
                    return;
                }
                return;
            case 2:
                View view = (View) obj;
                PointF pointF3 = (PointF) obj2;
                C0242w.a(view, view.getLeft(), view.getTop(), Math.round(pointF3.x), Math.round(pointF3.y));
                return;
            case 3:
                View view2 = (View) obj;
                PointF pointF4 = (PointF) obj2;
                C0242w.a(view2, Math.round(pointF4.x), Math.round(pointF4.y), view2.getRight(), view2.getBottom());
                return;
            case 4:
                View view3 = (View) obj;
                PointF pointF5 = (PointF) obj2;
                int round3 = Math.round(pointF5.x);
                int round4 = Math.round(pointF5.y);
                C0242w.a(view3, round3, round4, view3.getWidth() + round3, view3.getHeight() + round4);
                return;
            case 5:
                float floatValue = ((Float) obj2).floatValue();
                C0242w.f4031a.o((View) obj, floatValue);
                return;
            case 6:
                ((View) obj).setClipBounds((Rect) obj2);
                return;
            default:
                ((SwitchCompat) obj).setThumbPosition(((Float) obj2).floatValue());
                return;
        }
    }
}
