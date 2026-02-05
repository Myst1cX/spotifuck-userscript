package j0;

/* renamed from: j0.a  reason: case insensitive filesystem */
public final class C0139a {

    /* renamed from: a  reason: collision with root package name */
    public int f3333a;

    /* renamed from: b  reason: collision with root package name */
    public int f3334b;

    /* renamed from: c  reason: collision with root package name */
    public Object f3335c;

    /* renamed from: d  reason: collision with root package name */
    public int f3336d;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C0139a.class != obj.getClass()) {
            return false;
        }
        C0139a aVar = (C0139a) obj;
        int i = this.f3333a;
        if (i != aVar.f3333a) {
            return false;
        }
        if (i == 8 && Math.abs(this.f3336d - this.f3334b) == 1 && this.f3336d == aVar.f3334b && this.f3334b == aVar.f3336d) {
            return true;
        }
        if (this.f3336d != aVar.f3336d || this.f3334b != aVar.f3334b) {
            return false;
        }
        Object obj2 = this.f3335c;
        if (obj2 != null) {
            if (!obj2.equals(aVar.f3335c)) {
                return false;
            }
        } else if (aVar.f3335c != null) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return (((this.f3333a * 31) + this.f3334b) * 31) + this.f3336d;
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder();
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append("[");
        int i = this.f3333a;
        if (i == 1) {
            str = "add";
        } else if (i == 2) {
            str = "rm";
        } else if (i == 4) {
            str = "up";
        } else if (i != 8) {
            str = "??";
        } else {
            str = "mv";
        }
        sb.append(str);
        sb.append(",s:");
        sb.append(this.f3334b);
        sb.append("c:");
        sb.append(this.f3336d);
        sb.append(",p:");
        sb.append(this.f3335c);
        sb.append("]");
        return sb.toString();
    }
}
