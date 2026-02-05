package o;

import android.database.DataSetObserver;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListAdapter;
import android.widget.SpinnerAdapter;

/* renamed from: o.L  reason: case insensitive filesystem */
public final class C0257L implements ListAdapter, SpinnerAdapter {

    /* renamed from: a  reason: collision with root package name */
    public SpinnerAdapter f4099a;

    /* renamed from: b  reason: collision with root package name */
    public ListAdapter f4100b;

    public final int getItemViewType(int i) {
        return 0;
    }

    public final int getViewTypeCount() {
        return 1;
    }

    public final boolean areAllItemsEnabled() {
        ListAdapter listAdapter = this.f4100b;
        if (listAdapter != null) {
            return listAdapter.areAllItemsEnabled();
        }
        return true;
    }

    public final int getCount() {
        SpinnerAdapter spinnerAdapter = this.f4099a;
        if (spinnerAdapter == null) {
            return 0;
        }
        return spinnerAdapter.getCount();
    }

    public final View getDropDownView(int i, View view, ViewGroup viewGroup) {
        SpinnerAdapter spinnerAdapter = this.f4099a;
        if (spinnerAdapter == null) {
            return null;
        }
        return spinnerAdapter.getDropDownView(i, view, viewGroup);
    }

    public final Object getItem(int i) {
        SpinnerAdapter spinnerAdapter = this.f4099a;
        if (spinnerAdapter == null) {
            return null;
        }
        return spinnerAdapter.getItem(i);
    }

    public final long getItemId(int i) {
        SpinnerAdapter spinnerAdapter = this.f4099a;
        if (spinnerAdapter == null) {
            return -1;
        }
        return spinnerAdapter.getItemId(i);
    }

    public final boolean hasStableIds() {
        SpinnerAdapter spinnerAdapter = this.f4099a;
        if (spinnerAdapter == null || !spinnerAdapter.hasStableIds()) {
            return false;
        }
        return true;
    }

    public final boolean isEnabled(int i) {
        ListAdapter listAdapter = this.f4100b;
        if (listAdapter != null) {
            return listAdapter.isEnabled(i);
        }
        return true;
    }

    public final void registerDataSetObserver(DataSetObserver dataSetObserver) {
        SpinnerAdapter spinnerAdapter = this.f4099a;
        if (spinnerAdapter != null) {
            spinnerAdapter.registerDataSetObserver(dataSetObserver);
        }
    }

    public final void unregisterDataSetObserver(DataSetObserver dataSetObserver) {
        SpinnerAdapter spinnerAdapter = this.f4099a;
        if (spinnerAdapter != null) {
            spinnerAdapter.unregisterDataSetObserver(dataSetObserver);
        }
    }

    public final View getView(int i, View view, ViewGroup viewGroup) {
        return getDropDownView(i, view, viewGroup);
    }

    public final boolean isEmpty() {
        if (getCount() == 0) {
            return true;
        }
        return false;
    }
}
