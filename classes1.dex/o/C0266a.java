package o;

import N.C0001a0;
import androidx.appcompat.widget.ActionBarContextView;

/* renamed from: o.a  reason: case insensitive filesystem */
public final class C0266a implements C0001a0 {

    /* renamed from: a  reason: collision with root package name */
    public boolean f4165a = false;

    /* renamed from: b  reason: collision with root package name */
    public int f4166b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ ActionBarContextView f4167c;

    public final void b() {
        this.f4165a = true;
    }

    public final void a() {
        if (!this.f4165a) {
            ActionBarContextView actionBarContextView = this.f4167c;
            actionBarContextView.f1263k = null;
            C0266a.super.setVisibility(this.f4166b);
        }
    }

    public final void c() {
        C0266a.super.setVisibility(0);
        this.f4165a = false;
    }

    public C0266a(ActionBarContextView actionBarContextView) {
        this.f4167c = actionBarContextView;
    }
}
