package Z0;

import java.io.Serializable;

public abstract class d implements Serializable {
    public final String toString() {
        f.f1013a.getClass();
        String obj = getClass().getGenericInterfaces()[0].toString();
        if (obj.startsWith("kotlin.jvm.functions.")) {
            obj = obj.substring(21);
        }
        c.d("renderLambdaToString(this)", obj);
        return obj;
    }

    public d(int i) {
    }
}
