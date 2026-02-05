package g0;

import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.text.TextUtils;
import android.view.ContextMenu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;
import androidx.preference.Preference;

public final class n implements View.OnCreateContextMenuListener, MenuItem.OnMenuItemClickListener {

    /* renamed from: f  reason: collision with root package name */
    public final Preference f2570f;

    public final boolean onMenuItemClick(MenuItem menuItem) {
        Preference preference = this.f2570f;
        CharSequence e = preference.e();
        ((ClipboardManager) preference.f1898a.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("Preference", e));
        Context context = preference.f1898a;
        Toast.makeText(context, context.getString(2131755222, new Object[]{e}), 0).show();
        return true;
    }

    public final void onCreateContextMenu(ContextMenu contextMenu, View view, ContextMenu.ContextMenuInfo contextMenuInfo) {
        Preference preference = this.f2570f;
        CharSequence e = preference.e();
        if (preference.f1888B && !TextUtils.isEmpty(e)) {
            contextMenu.setHeaderTitle(e);
            contextMenu.add(0, 0, 0, 2131755061).setOnMenuItemClickListener(this);
        }
    }

    public n(Preference preference) {
        this.f2570f = preference;
    }
}
