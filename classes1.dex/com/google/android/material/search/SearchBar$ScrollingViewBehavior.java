package com.google.android.material.search;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.appbar.AppBarLayout$ScrollingViewBehavior;

public class SearchBar$ScrollingViewBehavior extends AppBarLayout$ScrollingViewBehavior {
    public SearchBar$ScrollingViewBehavior() {
    }

    public SearchBar$ScrollingViewBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public final boolean d(CoordinatorLayout coordinatorLayout, View view, View view2) {
        super.d(coordinatorLayout, view, view2);
        return false;
    }
}
