package androidx.appcompat.widget;

import N0.B;
import android.content.Context;
import android.content.res.Configuration;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputMethodManager;
import o.C0294o;
import o.T0;

public class SearchView$SearchAutoComplete extends C0294o {

    /* renamed from: j  reason: collision with root package name */
    public int f1329j = getThreshold();

    /* renamed from: k  reason: collision with root package name */
    public boolean f1330k;

    /* renamed from: l  reason: collision with root package name */
    public final B f1331l = new B(17, this);

    public final boolean onKeyPreIme(int i, KeyEvent keyEvent) {
        if (i == 4) {
            if (keyEvent.getAction() == 0 && keyEvent.getRepeatCount() == 0) {
                KeyEvent.DispatcherState keyDispatcherState = getKeyDispatcherState();
                if (keyDispatcherState != null) {
                    keyDispatcherState.startTracking(keyEvent, this);
                }
                return true;
            } else if (keyEvent.getAction() == 1) {
                KeyEvent.DispatcherState keyDispatcherState2 = getKeyDispatcherState();
                if (keyDispatcherState2 != null) {
                    keyDispatcherState2.handleUpEvent(keyEvent);
                }
                if (keyEvent.isTracking() && !keyEvent.isCanceled()) {
                    throw null;
                }
            }
        }
        return super.onKeyPreIme(i, keyEvent);
    }

    public final void performCompletion() {
    }

    public final void replaceText(CharSequence charSequence) {
    }

    public final boolean enoughToFilter() {
        if (this.f1329j <= 0 || super.enoughToFilter()) {
            return true;
        }
        return false;
    }

    public void setSearchView(T0 t02) {
    }

    public SearchView$SearchAutoComplete(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    private int getSearchViewTextMinWidthDp() {
        Configuration configuration = getResources().getConfiguration();
        int i = configuration.screenWidthDp;
        int i2 = configuration.screenHeightDp;
        if (i >= 960 && i2 >= 720 && configuration.orientation == 2) {
            return 256;
        }
        if (i >= 600) {
            return 192;
        }
        if (i < 640 || i2 < 480) {
            return 160;
        }
        return 192;
    }

    public final InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        InputConnection onCreateInputConnection = super.onCreateInputConnection(editorInfo);
        if (this.f1330k) {
            B b2 = this.f1331l;
            removeCallbacks(b2);
            post(b2);
        }
        return onCreateInputConnection;
    }

    public final void onFinishInflate() {
        super.onFinishInflate();
        setMinWidth((int) TypedValue.applyDimension(1, (float) getSearchViewTextMinWidthDp(), getResources().getDisplayMetrics()));
    }

    public final void onFocusChanged(boolean z2, int i, Rect rect) {
        super.onFocusChanged(z2, i, rect);
        throw null;
    }

    public final void onWindowFocusChanged(boolean z2) {
        super.onWindowFocusChanged(z2);
        if (z2) {
            throw null;
        }
    }

    public void setImeVisibility(boolean z2) {
        InputMethodManager inputMethodManager = (InputMethodManager) getContext().getSystemService("input_method");
        B b2 = this.f1331l;
        if (!z2) {
            this.f1330k = false;
            removeCallbacks(b2);
            inputMethodManager.hideSoftInputFromWindow(getWindowToken(), 0);
        } else if (inputMethodManager.isActive(this)) {
            this.f1330k = false;
            removeCallbacks(b2);
            inputMethodManager.showSoftInput(this, 0);
        } else {
            this.f1330k = true;
        }
    }

    public void setThreshold(int i) {
        super.setThreshold(i);
        this.f1329j = i;
    }
}
