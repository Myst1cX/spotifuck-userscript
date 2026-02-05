package o;

import A.b;
import N.C0004d;
import N.Q;
import android.app.Activity;
import android.content.ClipData;
import android.os.Build;
import android.text.Selection;
import android.text.Spannable;
import android.view.DragEvent;
import android.view.View;
import android.widget.TextView;

/* renamed from: o.F  reason: case insensitive filesystem */
public abstract class C0251F {
    /* JADX INFO: finally extract failed */
    public static boolean a(DragEvent dragEvent, TextView textView, Activity activity) {
        b bVar;
        activity.requestDragAndDropPermissions(dragEvent);
        int offsetForPosition = textView.getOffsetForPosition(dragEvent.getX(), dragEvent.getY());
        textView.beginBatchEdit();
        try {
            Selection.setSelection((Spannable) textView.getText(), offsetForPosition);
            ClipData clipData = dragEvent.getClipData();
            if (Build.VERSION.SDK_INT >= 31) {
                bVar = new b(clipData, 3);
            } else {
                C0004d dVar = new C0004d();
                dVar.f530g = clipData;
                dVar.f531h = 3;
                bVar = dVar;
            }
            Q.l(textView, bVar.j());
            textView.endBatchEdit();
            return true;
        } catch (Throwable th) {
            textView.endBatchEdit();
            throw th;
        }
    }

    public static boolean b(DragEvent dragEvent, View view, Activity activity) {
        b bVar;
        activity.requestDragAndDropPermissions(dragEvent);
        ClipData clipData = dragEvent.getClipData();
        if (Build.VERSION.SDK_INT >= 31) {
            bVar = new b(clipData, 3);
        } else {
            C0004d dVar = new C0004d();
            dVar.f530g = clipData;
            dVar.f531h = 3;
            bVar = dVar;
        }
        Q.l(view, bVar.j());
        return true;
    }
}
