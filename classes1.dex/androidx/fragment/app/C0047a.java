package androidx.fragment.app;

import Z.d;
import android.util.Log;
import java.io.PrintWriter;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.Objects;

/* renamed from: androidx.fragment.app.a  reason: case insensitive filesystem */
public final class C0047a implements F {

    /* renamed from: a  reason: collision with root package name */
    public final ArrayList f1653a;

    /* renamed from: b  reason: collision with root package name */
    public int f1654b;

    /* renamed from: c  reason: collision with root package name */
    public int f1655c;

    /* renamed from: d  reason: collision with root package name */
    public int f1656d;
    public int e;

    /* renamed from: f  reason: collision with root package name */
    public int f1657f;

    /* renamed from: g  reason: collision with root package name */
    public boolean f1658g;

    /* renamed from: h  reason: collision with root package name */
    public boolean f1659h;
    public String i;

    /* renamed from: j  reason: collision with root package name */
    public int f1660j;

    /* renamed from: k  reason: collision with root package name */
    public CharSequence f1661k;

    /* renamed from: l  reason: collision with root package name */
    public int f1662l;

    /* renamed from: m  reason: collision with root package name */
    public CharSequence f1663m;

    /* renamed from: n  reason: collision with root package name */
    public ArrayList f1664n;

    /* renamed from: o  reason: collision with root package name */
    public ArrayList f1665o;

    /* renamed from: p  reason: collision with root package name */
    public boolean f1666p;

    /* renamed from: q  reason: collision with root package name */
    public final H f1667q;

    /* renamed from: r  reason: collision with root package name */
    public boolean f1668r;

    /* renamed from: s  reason: collision with root package name */
    public int f1669s;

    public final boolean a(ArrayList arrayList, ArrayList arrayList2) {
        if (Log.isLoggable("FragmentManager", 2)) {
            toString();
        }
        arrayList.add(this);
        arrayList2.add(Boolean.FALSE);
        if (!this.f1658g) {
            return true;
        }
        H h2 = this.f1667q;
        if (h2.f1584d == null) {
            h2.f1584d = new ArrayList();
        }
        h2.f1584d.add(this);
        return true;
    }

    public final void b(N n2) {
        this.f1653a.add(n2);
        n2.f1635d = this.f1654b;
        n2.e = this.f1655c;
        n2.f1636f = this.f1656d;
        n2.f1637g = this.e;
    }

    public final void c(int i2) {
        if (this.f1658g) {
            if (Log.isLoggable("FragmentManager", 2)) {
                toString();
            }
            ArrayList arrayList = this.f1653a;
            int size = arrayList.size();
            for (int i3 = 0; i3 < size; i3++) {
                N n2 = (N) arrayList.get(i3);
                r rVar = n2.f1633b;
                if (rVar != null) {
                    rVar.f1767v += i2;
                    if (Log.isLoggable("FragmentManager", 2)) {
                        Objects.toString(n2.f1633b);
                        int i4 = n2.f1633b.f1767v;
                    }
                }
            }
        }
    }

    public final int d(boolean z2) {
        if (!this.f1668r) {
            if (Log.isLoggable("FragmentManager", 2)) {
                toString();
                PrintWriter printWriter = new PrintWriter(new P());
                f("  ", printWriter, true);
                printWriter.close();
            }
            this.f1668r = true;
            boolean z3 = this.f1658g;
            H h2 = this.f1667q;
            if (z3) {
                this.f1669s = h2.i.getAndIncrement();
            } else {
                this.f1669s = -1;
            }
            h2.v(this, z2);
            return this.f1669s;
        }
        throw new IllegalStateException("commit already called");
    }

    public final void e(int i2, r rVar, String str, int i3) {
        String str2 = rVar.f1744Q;
        if (str2 != null) {
            d.c(rVar, str2);
        }
        Class<?> cls = rVar.getClass();
        int modifiers = cls.getModifiers();
        if (cls.isAnonymousClass() || !Modifier.isPublic(modifiers) || (cls.isMemberClass() && !Modifier.isStatic(modifiers))) {
            throw new IllegalStateException("Fragment " + cls.getCanonicalName() + " must be a public static class to be  properly recreated from instance state.");
        }
        if (str != null) {
            String str3 = rVar.f1731C;
            if (str3 == null || str.equals(str3)) {
                rVar.f1731C = str;
            } else {
                throw new IllegalStateException("Can't change tag of fragment " + rVar + ": was " + rVar.f1731C + " now " + str);
            }
        }
        if (i2 != 0) {
            if (i2 != -1) {
                int i4 = rVar.f1729A;
                if (i4 == 0 || i4 == i2) {
                    rVar.f1729A = i2;
                    rVar.f1730B = i2;
                } else {
                    throw new IllegalStateException("Can't change container ID of fragment " + rVar + ": was " + rVar.f1729A + " now " + i2);
                }
            } else {
                throw new IllegalArgumentException("Can't add fragment " + rVar + " with tag " + str + " to container view with no id");
            }
        }
        b(new N(i3, rVar));
        rVar.f1768w = this.f1667q;
    }

    public final void f(String str, PrintWriter printWriter, boolean z2) {
        String str2;
        if (z2) {
            printWriter.print(str);
            printWriter.print("mName=");
            printWriter.print(this.i);
            printWriter.print(" mIndex=");
            printWriter.print(this.f1669s);
            printWriter.print(" mCommitted=");
            printWriter.println(this.f1668r);
            if (this.f1657f != 0) {
                printWriter.print(str);
                printWriter.print("mTransition=#");
                printWriter.print(Integer.toHexString(this.f1657f));
            }
            if (!(this.f1654b == 0 && this.f1655c == 0)) {
                printWriter.print(str);
                printWriter.print("mEnterAnim=#");
                printWriter.print(Integer.toHexString(this.f1654b));
                printWriter.print(" mExitAnim=#");
                printWriter.println(Integer.toHexString(this.f1655c));
            }
            if (!(this.f1656d == 0 && this.e == 0)) {
                printWriter.print(str);
                printWriter.print("mPopEnterAnim=#");
                printWriter.print(Integer.toHexString(this.f1656d));
                printWriter.print(" mPopExitAnim=#");
                printWriter.println(Integer.toHexString(this.e));
            }
            if (!(this.f1660j == 0 && this.f1661k == null)) {
                printWriter.print(str);
                printWriter.print("mBreadCrumbTitleRes=#");
                printWriter.print(Integer.toHexString(this.f1660j));
                printWriter.print(" mBreadCrumbTitleText=");
                printWriter.println(this.f1661k);
            }
            if (!(this.f1662l == 0 && this.f1663m == null)) {
                printWriter.print(str);
                printWriter.print("mBreadCrumbShortTitleRes=#");
                printWriter.print(Integer.toHexString(this.f1662l));
                printWriter.print(" mBreadCrumbShortTitleText=");
                printWriter.println(this.f1663m);
            }
        }
        ArrayList arrayList = this.f1653a;
        if (!arrayList.isEmpty()) {
            printWriter.print(str);
            printWriter.println("Operations:");
            int size = arrayList.size();
            for (int i2 = 0; i2 < size; i2++) {
                N n2 = (N) arrayList.get(i2);
                switch (n2.f1632a) {
                    case 0:
                        str2 = "NULL";
                        break;
                    case 1:
                        str2 = "ADD";
                        break;
                    case 2:
                        str2 = "REPLACE";
                        break;
                    case 3:
                        str2 = "REMOVE";
                        break;
                    case 4:
                        str2 = "HIDE";
                        break;
                    case 5:
                        str2 = "SHOW";
                        break;
                    case 6:
                        str2 = "DETACH";
                        break;
                    case 7:
                        str2 = "ATTACH";
                        break;
                    case 8:
                        str2 = "SET_PRIMARY_NAV";
                        break;
                    case 9:
                        str2 = "UNSET_PRIMARY_NAV";
                        break;
                    case 10:
                        str2 = "OP_SET_MAX_LIFECYCLE";
                        break;
                    default:
                        str2 = "cmd=" + n2.f1632a;
                        break;
                }
                printWriter.print(str);
                printWriter.print("  Op #");
                printWriter.print(i2);
                printWriter.print(": ");
                printWriter.print(str2);
                printWriter.print(" ");
                printWriter.println(n2.f1633b);
                if (z2) {
                    if (!(n2.f1635d == 0 && n2.e == 0)) {
                        printWriter.print(str);
                        printWriter.print("enterAnim=#");
                        printWriter.print(Integer.toHexString(n2.f1635d));
                        printWriter.print(" exitAnim=#");
                        printWriter.println(Integer.toHexString(n2.e));
                    }
                    if (n2.f1636f != 0 || n2.f1637g != 0) {
                        printWriter.print(str);
                        printWriter.print("popEnterAnim=#");
                        printWriter.print(Integer.toHexString(n2.f1636f));
                        printWriter.print(" popExitAnim=#");
                        printWriter.println(Integer.toHexString(n2.f1637g));
                    }
                }
            }
        }
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(128);
        sb.append("BackStackEntry{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        if (this.f1669s >= 0) {
            sb.append(" #");
            sb.append(this.f1669s);
        }
        if (this.i != null) {
            sb.append(" ");
            sb.append(this.i);
        }
        sb.append("}");
        return sb.toString();
    }

    public C0047a(H h2) {
        h2.C();
        C0065t tVar = h2.f1598t;
        if (tVar != null) {
            tVar.f1775g.getClassLoader();
        }
        this.f1653a = new ArrayList();
        this.f1659h = true;
        this.f1666p = false;
        this.f1669s = -1;
        this.f1667q = h2;
    }
}
