package h;

import android.content.Context;
import android.content.ContextWrapper;
import android.view.View;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public final class F implements View.OnClickListener {

    /* renamed from: f  reason: collision with root package name */
    public final View f2901f;

    /* renamed from: g  reason: collision with root package name */
    public final String f2902g;

    /* renamed from: h  reason: collision with root package name */
    public Method f2903h;
    public Context i;

    public final void onClick(View view) {
        String str;
        Method method;
        if (this.f2903h == null) {
            View view2 = this.f2901f;
            Context context = view2.getContext();
            while (true) {
                String str2 = this.f2902g;
                if (context != null) {
                    try {
                        if (!context.isRestricted() && (method = context.getClass().getMethod(str2, new Class[]{View.class})) != null) {
                            this.f2903h = method;
                            this.i = context;
                            break;
                        }
                    } catch (NoSuchMethodException unused) {
                    }
                    if (context instanceof ContextWrapper) {
                        context = ((ContextWrapper) context).getBaseContext();
                    } else {
                        context = null;
                    }
                } else {
                    int id = view2.getId();
                    if (id == -1) {
                        str = "";
                    } else {
                        str = " with id '" + view2.getContext().getResources().getResourceEntryName(id) + "'";
                    }
                    throw new IllegalStateException("Could not find method " + str2 + "(View) in a parent or ancestor Context for android:onClick attribute defined on view " + view2.getClass() + str);
                }
            }
        }
        try {
            this.f2903h.invoke(this.i, new Object[]{view});
        } catch (IllegalAccessException e) {
            throw new IllegalStateException("Could not execute non-public method for android:onClick", e);
        } catch (InvocationTargetException e2) {
            throw new IllegalStateException("Could not execute method for android:onClick", e2);
        }
    }

    public F(View view, String str) {
        this.f2901f = view;
        this.f2902g = str;
    }
}
