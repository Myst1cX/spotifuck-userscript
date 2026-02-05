package m;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.util.AttributeSet;
import android.util.Log;
import android.util.Xml;
import android.view.InflateException;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.SubMenu;
import g.C0096a;
import java.io.IOException;
import n.C0197l;
import n.C0200o;
import o.C0297p0;
import org.xmlpull.v1.XmlPullParserException;
import p0.C0320a;

public final class h extends MenuInflater {
    public static final Class[] e;

    /* renamed from: f  reason: collision with root package name */
    public static final Class[] f3656f;

    /* renamed from: a  reason: collision with root package name */
    public final Object[] f3657a;

    /* renamed from: b  reason: collision with root package name */
    public final Object[] f3658b;

    /* renamed from: c  reason: collision with root package name */
    public final Context f3659c;

    /* renamed from: d  reason: collision with root package name */
    public Object f3660d;

    static {
        Class[] clsArr = {Context.class};
        e = clsArr;
        f3656f = clsArr;
    }

    public static Object a(Context context) {
        if (!(context instanceof Activity) && (context instanceof ContextWrapper)) {
            return a(((ContextWrapper) context).getBaseContext());
        }
        return context;
    }

    public final void b(XmlResourceParser xmlResourceParser, AttributeSet attributeSet, Menu menu) {
        boolean z2;
        int i;
        char c2;
        char c3;
        boolean z3;
        ColorStateList colorStateList;
        int resourceId;
        AttributeSet attributeSet2 = attributeSet;
        g gVar = new g(this, menu);
        int eventType = xmlResourceParser.getEventType();
        while (true) {
            z2 = true;
            i = 2;
            if (eventType == 2) {
                String name = xmlResourceParser.getName();
                if (name.equals("menu")) {
                    eventType = xmlResourceParser.next();
                } else {
                    throw new RuntimeException("Expecting menu, got ".concat(name));
                }
            } else {
                eventType = xmlResourceParser.next();
                if (eventType == 1) {
                    break;
                }
                XmlResourceParser xmlResourceParser2 = xmlResourceParser;
            }
        }
        boolean z4 = false;
        boolean z5 = false;
        String str = null;
        while (!z4) {
            if (eventType != z2) {
                if (eventType != i) {
                    if (eventType == 3) {
                        String name2 = xmlResourceParser.getName();
                        if (z5 && name2.equals(str)) {
                            XmlResourceParser xmlResourceParser3 = xmlResourceParser;
                            z5 = false;
                            str = null;
                            eventType = xmlResourceParser.next();
                            z2 = true;
                            i = 2;
                        } else if (name2.equals("group")) {
                            gVar.f3633b = 0;
                            gVar.f3634c = 0;
                            gVar.f3635d = 0;
                            gVar.e = 0;
                            gVar.f3636f = z2;
                            gVar.f3637g = z2;
                        } else if (name2.equals("item")) {
                            if (!gVar.f3638h) {
                                C0200o oVar = gVar.f3655z;
                                if (oVar == null || !oVar.f3925b.hasSubMenu()) {
                                    gVar.f3638h = z2;
                                    gVar.b(gVar.f3632a.add(gVar.f3633b, gVar.i, gVar.f3639j, gVar.f3640k));
                                } else {
                                    gVar.f3638h = z2;
                                    gVar.b(gVar.f3632a.addSubMenu(gVar.f3633b, gVar.i, gVar.f3639j, gVar.f3640k).getItem());
                                }
                            }
                        } else if (name2.equals("menu")) {
                            XmlResourceParser xmlResourceParser4 = xmlResourceParser;
                            z4 = true;
                            eventType = xmlResourceParser.next();
                            z2 = true;
                            i = 2;
                        }
                    }
                } else if (!z5) {
                    String name3 = xmlResourceParser.getName();
                    boolean equals = name3.equals("group");
                    h hVar = gVar.f3631E;
                    if (equals) {
                        TypedArray obtainStyledAttributes = hVar.f3659c.obtainStyledAttributes(attributeSet2, C0096a.f2532p);
                        gVar.f3633b = obtainStyledAttributes.getResourceId(z2 ? 1 : 0, 0);
                        gVar.f3634c = obtainStyledAttributes.getInt(3, 0);
                        gVar.f3635d = obtainStyledAttributes.getInt(4, 0);
                        gVar.e = obtainStyledAttributes.getInt(5, 0);
                        gVar.f3636f = obtainStyledAttributes.getBoolean(2, z2);
                        gVar.f3637g = obtainStyledAttributes.getBoolean(0, z2);
                        obtainStyledAttributes.recycle();
                    } else if (name3.equals("item")) {
                        Context context = hVar.f3659c;
                        TypedArray obtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet2, C0096a.f2533q);
                        gVar.i = obtainStyledAttributes2.getResourceId(2, 0);
                        gVar.f3639j = (obtainStyledAttributes2.getInt(5, gVar.f3634c) & -65536) | (obtainStyledAttributes2.getInt(6, gVar.f3635d) & 65535);
                        gVar.f3640k = obtainStyledAttributes2.getText(7);
                        gVar.f3641l = obtainStyledAttributes2.getText(8);
                        gVar.f3642m = obtainStyledAttributes2.getResourceId(0, 0);
                        String string = obtainStyledAttributes2.getString(9);
                        if (string == null) {
                            c2 = 0;
                        } else {
                            c2 = string.charAt(0);
                        }
                        gVar.f3643n = c2;
                        gVar.f3644o = obtainStyledAttributes2.getInt(16, 4096);
                        String string2 = obtainStyledAttributes2.getString(10);
                        if (string2 == null) {
                            c3 = 0;
                        } else {
                            c3 = string2.charAt(0);
                        }
                        gVar.f3645p = c3;
                        gVar.f3646q = obtainStyledAttributes2.getInt(20, 4096);
                        if (obtainStyledAttributes2.hasValue(11)) {
                            gVar.f3647r = obtainStyledAttributes2.getBoolean(11, false) ? 1 : 0;
                        } else {
                            gVar.f3647r = gVar.e;
                        }
                        gVar.f3648s = obtainStyledAttributes2.getBoolean(3, false);
                        gVar.f3649t = obtainStyledAttributes2.getBoolean(4, gVar.f3636f);
                        gVar.f3650u = obtainStyledAttributes2.getBoolean(1, gVar.f3637g);
                        gVar.f3651v = obtainStyledAttributes2.getInt(21, -1);
                        gVar.f3654y = obtainStyledAttributes2.getString(12);
                        gVar.f3652w = obtainStyledAttributes2.getResourceId(13, 0);
                        gVar.f3653x = obtainStyledAttributes2.getString(15);
                        String string3 = obtainStyledAttributes2.getString(14);
                        if (string3 != null) {
                            z3 = true;
                        } else {
                            z3 = false;
                        }
                        if (z3 && gVar.f3652w == 0 && gVar.f3653x == null) {
                            gVar.f3655z = (C0200o) gVar.a(string3, f3656f, hVar.f3658b);
                        } else {
                            if (z3) {
                                Log.w("SupportMenuInflater", "Ignoring attribute 'actionProviderClass'. Action view already specified.");
                            }
                            gVar.f3655z = null;
                        }
                        gVar.f3627A = obtainStyledAttributes2.getText(17);
                        gVar.f3628B = obtainStyledAttributes2.getText(22);
                        if (obtainStyledAttributes2.hasValue(19)) {
                            gVar.f3630D = C0297p0.c(obtainStyledAttributes2.getInt(19, -1), gVar.f3630D);
                        } else {
                            gVar.f3630D = null;
                        }
                        if (obtainStyledAttributes2.hasValue(18)) {
                            if (!obtainStyledAttributes2.hasValue(18) || (resourceId = obtainStyledAttributes2.getResourceId(18, 0)) == 0 || (colorStateList = C0320a.I(context, resourceId)) == null) {
                                colorStateList = obtainStyledAttributes2.getColorStateList(18);
                            }
                            gVar.f3629C = colorStateList;
                        } else {
                            gVar.f3629C = null;
                        }
                        obtainStyledAttributes2.recycle();
                        gVar.f3638h = false;
                        XmlResourceParser xmlResourceParser5 = xmlResourceParser;
                        eventType = xmlResourceParser.next();
                        z2 = true;
                        i = 2;
                    } else {
                        if (name3.equals("menu")) {
                            gVar.f3638h = true;
                            SubMenu addSubMenu = gVar.f3632a.addSubMenu(gVar.f3633b, gVar.i, gVar.f3639j, gVar.f3640k);
                            gVar.b(addSubMenu.getItem());
                            b(xmlResourceParser, attributeSet2, addSubMenu);
                        } else {
                            XmlResourceParser xmlResourceParser6 = xmlResourceParser;
                            str = name3;
                            z5 = true;
                        }
                        eventType = xmlResourceParser.next();
                        z2 = true;
                        i = 2;
                    }
                }
                XmlResourceParser xmlResourceParser7 = xmlResourceParser;
                eventType = xmlResourceParser.next();
                z2 = true;
                i = 2;
            } else {
                throw new RuntimeException("Unexpected end of document");
            }
        }
    }

    public final void inflate(int i, Menu menu) {
        if (!(menu instanceof C0197l)) {
            super.inflate(i, menu);
            return;
        }
        XmlResourceParser xmlResourceParser = null;
        boolean z2 = false;
        try {
            XmlResourceParser layout = this.f3659c.getResources().getLayout(i);
            AttributeSet asAttributeSet = Xml.asAttributeSet(layout);
            if (menu instanceof C0197l) {
                C0197l lVar = (C0197l) menu;
                if (!lVar.f3885p) {
                    lVar.w();
                    z2 = true;
                }
            }
            b(layout, asAttributeSet, menu);
            if (z2) {
                ((C0197l) menu).v();
            }
            layout.close();
        } catch (XmlPullParserException e2) {
            throw new InflateException("Error inflating menu XML", e2);
        } catch (IOException e3) {
            throw new InflateException("Error inflating menu XML", e3);
        } catch (Throwable th) {
            if (0 != 0) {
                ((C0197l) menu).v();
            }
            if (xmlResourceParser != null) {
                xmlResourceParser.close();
            }
            throw th;
        }
    }

    public h(Context context) {
        super(context);
        this.f3659c = context;
        Object[] objArr = {context};
        this.f3657a = objArr;
        this.f3658b = objArr;
    }
}
