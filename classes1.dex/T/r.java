package T;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.text.Editable;
import android.view.ActionMode;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;

public final class r implements ActionMode.Callback {

    /* renamed from: a  reason: collision with root package name */
    public final ActionMode.Callback f917a;

    /* renamed from: b  reason: collision with root package name */
    public final TextView f918b;

    /* renamed from: c  reason: collision with root package name */
    public Class f919c;

    /* renamed from: d  reason: collision with root package name */
    public Method f920d;
    public boolean e;

    /* renamed from: f  reason: collision with root package name */
    public boolean f921f = false;

    public final boolean onPrepareActionMode(ActionMode actionMode, Menu menu) {
        Method method;
        boolean z2;
        TextView textView = this.f918b;
        Context context = textView.getContext();
        PackageManager packageManager = context.getPackageManager();
        if (!this.f921f) {
            this.f921f = true;
            try {
                Class<?> cls = Class.forName("com.android.internal.view.menu.MenuBuilder");
                this.f919c = cls;
                this.f920d = cls.getDeclaredMethod("removeItemAt", new Class[]{Integer.TYPE});
                this.e = true;
            } catch (ClassNotFoundException | NoSuchMethodException unused) {
                this.f919c = null;
                this.f920d = null;
                this.e = false;
            }
        }
        try {
            if (!this.e || !this.f919c.isInstance(menu)) {
                method = menu.getClass().getDeclaredMethod("removeItemAt", new Class[]{Integer.TYPE});
            } else {
                method = this.f920d;
            }
            for (int size = menu.size() - 1; size >= 0; size--) {
                MenuItem item = menu.getItem(size);
                if (item.getIntent() != null && "android.intent.action.PROCESS_TEXT".equals(item.getIntent().getAction())) {
                    method.invoke(menu, new Object[]{Integer.valueOf(size)});
                }
            }
            ArrayList arrayList = new ArrayList();
            if (context instanceof Activity) {
                for (ResolveInfo next : packageManager.queryIntentActivities(new Intent().setAction("android.intent.action.PROCESS_TEXT").setType("text/plain"), 0)) {
                    if (!context.getPackageName().equals(next.activityInfo.packageName)) {
                        ActivityInfo activityInfo = next.activityInfo;
                        if (activityInfo.exported) {
                            String str = activityInfo.permission;
                            if (!(str == null || context.checkSelfPermission(str) == 0)) {
                            }
                        }
                    }
                    arrayList.add(next);
                }
            }
            for (int i = 0; i < arrayList.size(); i++) {
                ResolveInfo resolveInfo = (ResolveInfo) arrayList.get(i);
                MenuItem add = menu.add(0, 0, i + 100, resolveInfo.loadLabel(packageManager));
                Intent type = new Intent().setAction("android.intent.action.PROCESS_TEXT").setType("text/plain");
                if (!(textView instanceof Editable) || !textView.onCheckIsTextEditor() || !textView.isEnabled()) {
                    z2 = false;
                } else {
                    z2 = true;
                }
                Intent putExtra = type.putExtra("android.intent.extra.PROCESS_TEXT_READONLY", !z2);
                ActivityInfo activityInfo2 = resolveInfo.activityInfo;
                add.setIntent(putExtra.setClassName(activityInfo2.packageName, activityInfo2.name)).setShowAsAction(1);
            }
        } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException unused2) {
        }
        return this.f917a.onPrepareActionMode(actionMode, menu);
    }

    public final boolean onActionItemClicked(ActionMode actionMode, MenuItem menuItem) {
        return this.f917a.onActionItemClicked(actionMode, menuItem);
    }

    public final boolean onCreateActionMode(ActionMode actionMode, Menu menu) {
        return this.f917a.onCreateActionMode(actionMode, menu);
    }

    public final void onDestroyActionMode(ActionMode actionMode) {
        this.f917a.onDestroyActionMode(actionMode);
    }

    public r(ActionMode.Callback callback, TextView textView) {
        this.f917a = callback;
        this.f918b = textView;
    }
}
