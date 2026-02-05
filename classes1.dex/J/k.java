package J;

import android.os.Build;
import android.os.Trace;

public abstract class k {

    /* renamed from: a  reason: collision with root package name */
    public static final /* synthetic */ int f299a = 0;

    static {
        Class<String> cls = String.class;
        Class<Trace> cls2 = Trace.class;
        if (Build.VERSION.SDK_INT < 29) {
            try {
                cls2.getField("TRACE_TAG_APP").getLong((Object) null);
                Class cls3 = Long.TYPE;
                cls2.getMethod("isTagEnabled", new Class[]{cls3});
                Class cls4 = Integer.TYPE;
                cls2.getMethod("asyncTraceBegin", new Class[]{cls3, cls, cls4});
                cls2.getMethod("asyncTraceEnd", new Class[]{cls3, cls, cls4});
                cls2.getMethod("traceCounter", new Class[]{cls3, cls, cls4});
            } catch (Exception unused) {
            }
        }
    }
}
