package h;

import Q0.j;
import R0.i;
import android.content.Context;
import android.content.DialogInterface;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Message;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewStub;
import android.view.Window;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ListAdapter;
import android.widget.TextView;
import androidx.appcompat.app.AlertController$RecycleListView;
import androidx.core.widget.NestedScrollView;
import g.C0096a;
import java.lang.ref.WeakReference;

/* renamed from: h.h  reason: case insensitive filesystem */
public final class C0117h {

    /* renamed from: A  reason: collision with root package name */
    public final int f2980A;

    /* renamed from: B  reason: collision with root package name */
    public final int f2981B;

    /* renamed from: C  reason: collision with root package name */
    public final int f2982C;

    /* renamed from: D  reason: collision with root package name */
    public final int f2983D;

    /* renamed from: E  reason: collision with root package name */
    public final boolean f2984E;

    /* renamed from: F  reason: collision with root package name */
    public final j f2985F;

    /* renamed from: G  reason: collision with root package name */
    public final i f2986G = new i(3, this);

    /* renamed from: a  reason: collision with root package name */
    public final Context f2987a;

    /* renamed from: b  reason: collision with root package name */
    public final C0118i f2988b;

    /* renamed from: c  reason: collision with root package name */
    public final Window f2989c;

    /* renamed from: d  reason: collision with root package name */
    public CharSequence f2990d;
    public CharSequence e;

    /* renamed from: f  reason: collision with root package name */
    public AlertController$RecycleListView f2991f;

    /* renamed from: g  reason: collision with root package name */
    public View f2992g;

    /* renamed from: h  reason: collision with root package name */
    public boolean f2993h = false;
    public Button i;

    /* renamed from: j  reason: collision with root package name */
    public CharSequence f2994j;

    /* renamed from: k  reason: collision with root package name */
    public Message f2995k;

    /* renamed from: l  reason: collision with root package name */
    public Button f2996l;

    /* renamed from: m  reason: collision with root package name */
    public CharSequence f2997m;

    /* renamed from: n  reason: collision with root package name */
    public Message f2998n;

    /* renamed from: o  reason: collision with root package name */
    public Button f2999o;

    /* renamed from: p  reason: collision with root package name */
    public CharSequence f3000p;

    /* renamed from: q  reason: collision with root package name */
    public Message f3001q;

    /* renamed from: r  reason: collision with root package name */
    public NestedScrollView f3002r;

    /* renamed from: s  reason: collision with root package name */
    public Drawable f3003s;

    /* renamed from: t  reason: collision with root package name */
    public ImageView f3004t;

    /* renamed from: u  reason: collision with root package name */
    public TextView f3005u;

    /* renamed from: v  reason: collision with root package name */
    public TextView f3006v;

    /* renamed from: w  reason: collision with root package name */
    public View f3007w;

    /* renamed from: x  reason: collision with root package name */
    public ListAdapter f3008x;

    /* renamed from: y  reason: collision with root package name */
    public int f3009y = -1;

    /* renamed from: z  reason: collision with root package name */
    public final int f3010z;

    public static void b(ViewGroup viewGroup, View view, View view2) {
        int i2;
        int i3 = 4;
        if (view != null) {
            if (viewGroup.canScrollVertically(-1)) {
                i2 = 0;
            } else {
                i2 = 4;
            }
            view.setVisibility(i2);
        }
        if (view2 != null) {
            if (viewGroup.canScrollVertically(1)) {
                i3 = 0;
            }
            view2.setVisibility(i3);
        }
    }

    public static ViewGroup c(View view, View view2) {
        if (view == null) {
            if (view2 instanceof ViewStub) {
                view2 = ((ViewStub) view2).inflate();
            }
            return (ViewGroup) view2;
        }
        if (view2 != null) {
            ViewParent parent = view2.getParent();
            if (parent instanceof ViewGroup) {
                ((ViewGroup) parent).removeView(view2);
            }
        }
        if (view instanceof ViewStub) {
            view = ((ViewStub) view).inflate();
        }
        return (ViewGroup) view;
    }

    public final void d(int i2, CharSequence charSequence, DialogInterface.OnClickListener onClickListener) {
        Message message;
        if (onClickListener != null) {
            message = this.f2985F.obtainMessage(i2, onClickListener);
        } else {
            message = null;
        }
        if (i2 == -3) {
            this.f3000p = charSequence;
            this.f3001q = message;
        } else if (i2 == -2) {
            this.f2997m = charSequence;
            this.f2998n = message;
        } else if (i2 == -1) {
            this.f2994j = charSequence;
            this.f2995k = message;
        } else {
            throw new IllegalArgumentException("Button does not exist");
        }
    }

    public C0117h(Context context, C0118i iVar, Window window) {
        this.f2987a = context;
        this.f2988b = iVar;
        this.f2989c = window;
        j jVar = new j(5);
        jVar.f817b = new WeakReference(iVar);
        this.f2985F = jVar;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes((AttributeSet) null, C0096a.e, 2130968622, 0);
        this.f3010z = obtainStyledAttributes.getResourceId(0, 0);
        obtainStyledAttributes.getResourceId(2, 0);
        this.f2980A = obtainStyledAttributes.getResourceId(4, 0);
        this.f2981B = obtainStyledAttributes.getResourceId(5, 0);
        this.f2982C = obtainStyledAttributes.getResourceId(7, 0);
        this.f2983D = obtainStyledAttributes.getResourceId(3, 0);
        this.f2984E = obtainStyledAttributes.getBoolean(6, true);
        obtainStyledAttributes.getDimensionPixelSize(1, 0);
        obtainStyledAttributes.recycle();
        iVar.f().g(1);
    }

    public static boolean a(View view) {
        if (view.onCheckIsTextEditor()) {
            return true;
        }
        if (!(view instanceof ViewGroup)) {
            return false;
        }
        ViewGroup viewGroup = (ViewGroup) view;
        int childCount = viewGroup.getChildCount();
        while (childCount > 0) {
            childCount--;
            if (a(viewGroup.getChildAt(childCount))) {
                return true;
            }
        }
        return false;
    }
}
