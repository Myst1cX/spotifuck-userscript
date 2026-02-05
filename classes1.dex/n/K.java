package N;

import R.a;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.View;
import android.view.contentcapture.ContentCaptureSession;
import java.util.List;

public abstract class K {
    public static void e(View view, a aVar) {
        view.setContentCaptureSession((ContentCaptureSession) null);
    }

    public static View.AccessibilityDelegate a(View view) {
        return view.getAccessibilityDelegate();
    }

    public static ContentCaptureSession b(View view) {
        return view.getContentCaptureSession();
    }

    public static List<Rect> c(View view) {
        return view.getSystemGestureExclusionRects();
    }

    public static void d(View view, Context context, int[] iArr, AttributeSet attributeSet, TypedArray typedArray, int i, int i2) {
        view.saveAttributeDataForStyleable(context, iArr, attributeSet, typedArray, i, i2);
    }

    public static void f(View view, List<Rect> list) {
        view.setSystemGestureExclusionRects(list);
    }
}
