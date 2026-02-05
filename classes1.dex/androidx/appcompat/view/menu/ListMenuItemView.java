package androidx.appcompat.view.menu;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.support.v4.media.session.t;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AbsListView;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.TextView;
import g.C0096a;
import n.C0199n;
import n.C0210y;

public class ListMenuItemView extends LinearLayout implements C0210y, AbsListView.SelectionBoundsAdjuster {

    /* renamed from: f  reason: collision with root package name */
    public C0199n f1235f;

    /* renamed from: g  reason: collision with root package name */
    public ImageView f1236g;

    /* renamed from: h  reason: collision with root package name */
    public RadioButton f1237h;
    public TextView i;

    /* renamed from: j  reason: collision with root package name */
    public CheckBox f1238j;

    /* renamed from: k  reason: collision with root package name */
    public TextView f1239k;

    /* renamed from: l  reason: collision with root package name */
    public ImageView f1240l;

    /* renamed from: m  reason: collision with root package name */
    public ImageView f1241m;

    /* renamed from: n  reason: collision with root package name */
    public LinearLayout f1242n;

    /* renamed from: o  reason: collision with root package name */
    public final Drawable f1243o;

    /* renamed from: p  reason: collision with root package name */
    public final int f1244p;

    /* renamed from: q  reason: collision with root package name */
    public final Context f1245q;

    /* renamed from: r  reason: collision with root package name */
    public boolean f1246r;

    /* renamed from: s  reason: collision with root package name */
    public final Drawable f1247s;

    /* renamed from: t  reason: collision with root package name */
    public final boolean f1248t;

    /* renamed from: u  reason: collision with root package name */
    public LayoutInflater f1249u;

    /* renamed from: v  reason: collision with root package name */
    public boolean f1250v;

    private LayoutInflater getInflater() {
        if (this.f1249u == null) {
            this.f1249u = LayoutInflater.from(getContext());
        }
        return this.f1249u;
    }

    private void setSubMenuArrowVisible(boolean z2) {
        int i2;
        ImageView imageView = this.f1240l;
        if (imageView != null) {
            if (z2) {
                i2 = 0;
            } else {
                i2 = 8;
            }
            imageView.setVisibility(i2);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:24:0x005c, code lost:
        if (r0 == false) goto L_0x005f;
     */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x0040  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x0063  */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x0127  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a(n.C0199n r11) {
        /*
            r10 = this;
            r10.f1235f = r11
            boolean r0 = r11.isVisible()
            r1 = 8
            r2 = 0
            if (r0 == 0) goto L_0x000d
            r0 = 0
            goto L_0x000f
        L_0x000d:
            r0 = 8
        L_0x000f:
            r10.setVisibility(r0)
            java.lang.CharSequence r0 = r11.e
            r10.setTitle(r0)
            boolean r0 = r11.isCheckable()
            r10.setCheckable(r0)
            n.l r0 = r11.f3911n
            boolean r0 = r0.o()
            r3 = 1
            if (r0 == 0) goto L_0x0038
            n.l r0 = r11.f3911n
            boolean r0 = r0.n()
            if (r0 == 0) goto L_0x0032
            char r0 = r11.f3907j
            goto L_0x0034
        L_0x0032:
            char r0 = r11.f3906h
        L_0x0034:
            if (r0 == 0) goto L_0x0038
            r0 = 1
            goto L_0x0039
        L_0x0038:
            r0 = 0
        L_0x0039:
            n.l r4 = r11.f3911n
            r4.n()
            if (r0 == 0) goto L_0x005f
            n.n r0 = r10.f1235f
            n.l r4 = r0.f3911n
            boolean r4 = r4.o()
            if (r4 == 0) goto L_0x005b
            n.l r4 = r0.f3911n
            boolean r4 = r4.n()
            if (r4 == 0) goto L_0x0055
            char r0 = r0.f3907j
            goto L_0x0057
        L_0x0055:
            char r0 = r0.f3906h
        L_0x0057:
            if (r0 == 0) goto L_0x005b
            r0 = 1
            goto L_0x005c
        L_0x005b:
            r0 = 0
        L_0x005c:
            if (r0 == 0) goto L_0x005f
            goto L_0x0061
        L_0x005f:
            r2 = 8
        L_0x0061:
            if (r2 != 0) goto L_0x011f
            android.widget.TextView r0 = r10.f1239k
            n.n r4 = r10.f1235f
            n.l r5 = r4.f3911n
            boolean r5 = r5.n()
            if (r5 == 0) goto L_0x0072
            char r5 = r4.f3907j
            goto L_0x0074
        L_0x0072:
            char r5 = r4.f3906h
        L_0x0074:
            if (r5 != 0) goto L_0x007a
            java.lang.String r1 = ""
            goto L_0x011c
        L_0x007a:
            n.l r6 = r4.f3911n
            android.content.Context r7 = r6.f3872a
            android.content.res.Resources r7 = r7.getResources()
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            android.content.Context r9 = r6.f3872a
            android.view.ViewConfiguration r9 = android.view.ViewConfiguration.get(r9)
            boolean r9 = r9.hasPermanentMenuKey()
            if (r9 == 0) goto L_0x009d
            r9 = 2131755030(0x7f100016, float:1.9140928E38)
            java.lang.String r9 = r7.getString(r9)
            r8.append(r9)
        L_0x009d:
            boolean r6 = r6.n()
            if (r6 == 0) goto L_0x00a6
            int r4 = r4.f3908k
            goto L_0x00a8
        L_0x00a6:
            int r4 = r4.i
        L_0x00a8:
            r6 = 2131755026(0x7f100012, float:1.914092E38)
            java.lang.String r6 = r7.getString(r6)
            r9 = 65536(0x10000, float:9.18355E-41)
            n.C0199n.c(r4, r9, r6, r8)
            r6 = 2131755022(0x7f10000e, float:1.9140912E38)
            java.lang.String r6 = r7.getString(r6)
            r9 = 4096(0x1000, float:5.74E-42)
            n.C0199n.c(r4, r9, r6, r8)
            r6 = 2131755021(0x7f10000d, float:1.914091E38)
            java.lang.String r6 = r7.getString(r6)
            r9 = 2
            n.C0199n.c(r4, r9, r6, r8)
            r6 = 2131755027(0x7f100013, float:1.9140922E38)
            java.lang.String r6 = r7.getString(r6)
            n.C0199n.c(r4, r3, r6, r8)
            r3 = 2131755029(0x7f100015, float:1.9140926E38)
            java.lang.String r3 = r7.getString(r3)
            r6 = 4
            n.C0199n.c(r4, r6, r3, r8)
            r3 = 2131755025(0x7f100011, float:1.9140918E38)
            java.lang.String r3 = r7.getString(r3)
            n.C0199n.c(r4, r1, r3, r8)
            if (r5 == r1) goto L_0x010e
            r1 = 10
            if (r5 == r1) goto L_0x0103
            r1 = 32
            if (r5 == r1) goto L_0x00f8
            r8.append(r5)
            goto L_0x0118
        L_0x00f8:
            r1 = 2131755028(0x7f100014, float:1.9140924E38)
            java.lang.String r1 = r7.getString(r1)
            r8.append(r1)
            goto L_0x0118
        L_0x0103:
            r1 = 2131755024(0x7f100010, float:1.9140916E38)
            java.lang.String r1 = r7.getString(r1)
            r8.append(r1)
            goto L_0x0118
        L_0x010e:
            r1 = 2131755023(0x7f10000f, float:1.9140914E38)
            java.lang.String r1 = r7.getString(r1)
            r8.append(r1)
        L_0x0118:
            java.lang.String r1 = r8.toString()
        L_0x011c:
            r0.setText(r1)
        L_0x011f:
            android.widget.TextView r0 = r10.f1239k
            int r0 = r0.getVisibility()
            if (r0 == r2) goto L_0x012c
            android.widget.TextView r0 = r10.f1239k
            r0.setVisibility(r2)
        L_0x012c:
            android.graphics.drawable.Drawable r0 = r11.getIcon()
            r10.setIcon(r0)
            boolean r0 = r11.isEnabled()
            r10.setEnabled(r0)
            boolean r0 = r11.hasSubMenu()
            r10.setSubMenuArrowVisible(r0)
            java.lang.CharSequence r11 = r11.f3914q
            r10.setContentDescription(r11)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.view.menu.ListMenuItemView.a(n.n):void");
    }

    public final void adjustListItemSelectionBounds(Rect rect) {
        ImageView imageView = this.f1241m;
        if (imageView != null && imageView.getVisibility() == 0) {
            LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) this.f1241m.getLayoutParams();
            rect.top = this.f1241m.getHeight() + layoutParams.topMargin + layoutParams.bottomMargin + rect.top;
        }
    }

    public C0199n getItemData() {
        return this.f1235f;
    }

    public final void onMeasure(int i2, int i3) {
        if (this.f1236g != null && this.f1246r) {
            ViewGroup.LayoutParams layoutParams = getLayoutParams();
            LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) this.f1236g.getLayoutParams();
            int i4 = layoutParams.height;
            if (i4 > 0 && layoutParams2.width <= 0) {
                layoutParams2.width = i4;
            }
        }
        super.onMeasure(i2, i3);
    }

    public void setCheckable(boolean z2) {
        View view;
        CompoundButton compoundButton;
        if (z2 || this.f1237h != null || this.f1238j != null) {
            if ((this.f1235f.f3921x & 4) != 0) {
                if (this.f1237h == null) {
                    RadioButton radioButton = (RadioButton) getInflater().inflate(2131492881, this, false);
                    this.f1237h = radioButton;
                    LinearLayout linearLayout = this.f1242n;
                    if (linearLayout != null) {
                        linearLayout.addView(radioButton, -1);
                    } else {
                        addView(radioButton, -1);
                    }
                }
                compoundButton = this.f1237h;
                view = this.f1238j;
            } else {
                if (this.f1238j == null) {
                    CheckBox checkBox = (CheckBox) getInflater().inflate(2131492878, this, false);
                    this.f1238j = checkBox;
                    LinearLayout linearLayout2 = this.f1242n;
                    if (linearLayout2 != null) {
                        linearLayout2.addView(checkBox, -1);
                    } else {
                        addView(checkBox, -1);
                    }
                }
                compoundButton = this.f1238j;
                view = this.f1237h;
            }
            if (z2) {
                compoundButton.setChecked(this.f1235f.isChecked());
                if (compoundButton.getVisibility() != 0) {
                    compoundButton.setVisibility(0);
                }
                if (view != null && view.getVisibility() != 8) {
                    view.setVisibility(8);
                    return;
                }
                return;
            }
            CheckBox checkBox2 = this.f1238j;
            if (checkBox2 != null) {
                checkBox2.setVisibility(8);
            }
            RadioButton radioButton2 = this.f1237h;
            if (radioButton2 != null) {
                radioButton2.setVisibility(8);
            }
        }
    }

    public void setChecked(boolean z2) {
        CompoundButton compoundButton;
        if ((this.f1235f.f3921x & 4) != 0) {
            if (this.f1237h == null) {
                RadioButton radioButton = (RadioButton) getInflater().inflate(2131492881, this, false);
                this.f1237h = radioButton;
                LinearLayout linearLayout = this.f1242n;
                if (linearLayout != null) {
                    linearLayout.addView(radioButton, -1);
                } else {
                    addView(radioButton, -1);
                }
            }
            compoundButton = this.f1237h;
        } else {
            if (this.f1238j == null) {
                CheckBox checkBox = (CheckBox) getInflater().inflate(2131492878, this, false);
                this.f1238j = checkBox;
                LinearLayout linearLayout2 = this.f1242n;
                if (linearLayout2 != null) {
                    linearLayout2.addView(checkBox, -1);
                } else {
                    addView(checkBox, -1);
                }
            }
            compoundButton = this.f1238j;
        }
        compoundButton.setChecked(z2);
    }

    public void setForceShowIcon(boolean z2) {
        this.f1250v = z2;
        this.f1246r = z2;
    }

    public void setGroupDividerEnabled(boolean z2) {
        int i2;
        ImageView imageView = this.f1241m;
        if (imageView != null) {
            if (this.f1248t || !z2) {
                i2 = 8;
            } else {
                i2 = 0;
            }
            imageView.setVisibility(i2);
        }
    }

    public void setIcon(Drawable drawable) {
        this.f1235f.f3911n.getClass();
        boolean z2 = this.f1250v;
        if (z2 || this.f1246r) {
            ImageView imageView = this.f1236g;
            if (imageView != null || drawable != null || this.f1246r) {
                if (imageView == null) {
                    ImageView imageView2 = (ImageView) getInflater().inflate(2131492879, this, false);
                    this.f1236g = imageView2;
                    LinearLayout linearLayout = this.f1242n;
                    if (linearLayout != null) {
                        linearLayout.addView(imageView2, 0);
                    } else {
                        addView(imageView2, 0);
                    }
                }
                if (drawable != null || this.f1246r) {
                    ImageView imageView3 = this.f1236g;
                    if (!z2) {
                        drawable = null;
                    }
                    imageView3.setImageDrawable(drawable);
                    if (this.f1236g.getVisibility() != 0) {
                        this.f1236g.setVisibility(0);
                        return;
                    }
                    return;
                }
                this.f1236g.setVisibility(8);
            }
        }
    }

    public void setTitle(CharSequence charSequence) {
        if (charSequence != null) {
            this.i.setText(charSequence);
            if (this.i.getVisibility() != 0) {
                this.i.setVisibility(0);
            }
        } else if (this.i.getVisibility() != 8) {
            this.i.setVisibility(8);
        }
    }

    public ListMenuItemView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        t A2 = t.A(getContext(), attributeSet, C0096a.f2534r, 2130969325);
        this.f1243o = A2.o(5);
        TypedArray typedArray = (TypedArray) A2.f1132c;
        this.f1244p = typedArray.getResourceId(1, -1);
        this.f1246r = typedArray.getBoolean(7, false);
        this.f1245q = context;
        this.f1247s = A2.o(8);
        TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes((AttributeSet) null, new int[]{16843049}, 2130969001, 0);
        this.f1248t = obtainStyledAttributes.hasValue(0);
        A2.C();
        obtainStyledAttributes.recycle();
    }

    public final void onFinishInflate() {
        super.onFinishInflate();
        setBackground(this.f1243o);
        TextView textView = (TextView) findViewById(2131296755);
        this.i = textView;
        int i2 = this.f1244p;
        if (i2 != -1) {
            textView.setTextAppearance(this.f1245q, i2);
        }
        this.f1239k = (TextView) findViewById(2131296683);
        ImageView imageView = (ImageView) findViewById(2131296718);
        this.f1240l = imageView;
        if (imageView != null) {
            imageView.setImageDrawable(this.f1247s);
        }
        this.f1241m = (ImageView) findViewById(2131296478);
        this.f1242n = (LinearLayout) findViewById(2131296393);
    }
}
